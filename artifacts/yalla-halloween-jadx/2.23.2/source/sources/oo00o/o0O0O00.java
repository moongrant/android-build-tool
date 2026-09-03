package oo00o;

import android.content.Context;
import androidx.annotation.RestrictTo;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class o0O0O00 {
    @JvmStatic
    public static final void OooO00o(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        Intrinsics.checkNotNullExpressionValue(databasePath, "context.getDatabasePath(WORK_DATABASE_NAME)");
        if (databasePath.exists()) {
            p115o00O00oO.o0Oo0oo.OooO0Oo().OooO00o(o000OOo.f60259OooO00o, "Migrating WorkDatabase to the no-backup directory");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(context, "context");
            File databasePath2 = context.getDatabasePath("androidx.work.workdb");
            Intrinsics.checkNotNullExpressionValue(databasePath2, "context.getDatabasePath(WORK_DATABASE_NAME)");
            Intrinsics.checkNotNullParameter(context, "context");
            File file = new File(OooO00o.f60199OooO00o.OooO00o(context), "androidx.work.workdb");
            String[] strArr = o000OOo.f60260OooO0O0;
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(strArr.length), 16));
            for (String str : strArr) {
                Pair pair = TuplesKt.to(new File(databasePath2.getPath() + str), new File(file.getPath() + str));
                linkedHashMap.put(pair.getFirst(), pair.getSecond());
            }
            for (Map.Entry entry : MapsKt__MapsKt.plus(linkedHashMap, TuplesKt.to(databasePath2, file)).entrySet()) {
                File file2 = (File) entry.getKey();
                File file3 = (File) entry.getValue();
                if (file2.exists()) {
                    if (file3.exists()) {
                        p115o00O00oO.o0Oo0oo.OooO0Oo().OooO0oO(o000OOo.f60259OooO00o, "Over-writing contents of " + file3);
                    }
                    p115o00O00oO.o0Oo0oo.OooO0Oo().OooO00o(o000OOo.f60259OooO00o, file2.renameTo(file3) ? "Migrated " + file2 + "to " + file3 : "Renaming " + file2 + " to " + file3 + " failed");
                }
            }
        }
    }
}
