package com.code.android.util;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.facebook.share.internal.ShareInternalUtility;
import java.io.File;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nFileUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileUtil.kt\ncom/code/android/util/FileUtilKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,352:1\n1#2:353\n*E\n"})
public final class Oooo000 {
    @Nullable
    public static final File OooO00o(@Nullable String str) {
        if (str == null || StringsKt.isBlank(str)) {
            return null;
        }
        return new File(str);
    }

    @Nullable
    public static final File OooO0O0(@NotNull Context ac, @NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(ac, "ac");
        Intrinsics.checkNotNullParameter(uri, "uri");
        if (String.valueOf(uri.getScheme()).compareTo("content") == 0) {
            Cursor cursorQuery = ac.getContentResolver().query(uri, null, null, null, null);
            if (cursorQuery != null) {
                cursorQuery.moveToFirst();
                int columnIndex = cursorQuery.getColumnIndex("_data");
                if (columnIndex < 0) {
                    cursorQuery.close();
                    return null;
                }
                String string = cursorQuery.getString(columnIndex);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                cursorQuery.close();
                return new File(string);
            }
        } else if (String.valueOf(uri.getScheme()).compareTo(ShareInternalUtility.STAGING_PARAM) == 0) {
            String string2 = uri.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            return new File(StringsKt__StringsJVMKt.replace$default(string2, "file://", "", false, 4, (Object) null));
        }
        return null;
    }

    @NotNull
    public static final ArrayList OooO0OO(@Nullable String str) {
        File fileOooO00o = OooO00o(str);
        OooOo filter = new OooOo();
        Intrinsics.checkNotNullParameter(filter, "filter");
        return OooO0Oo(fileOooO00o, filter, false);
    }

    public static final ArrayList OooO0Oo(File file, OooOo oooOo, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (!(file != null && file.exists() && file.isDirectory())) {
            return arrayList;
        }
        Intrinsics.checkNotNull(file);
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            if (!(fileArrListFiles.length == 0)) {
                for (File file2 : fileArrListFiles) {
                    Intrinsics.checkNotNull(file2);
                    arrayList.add(file2);
                    if (z && file2.isDirectory()) {
                        arrayList.addAll(OooO0Oo(file2, oooOo, true));
                    }
                }
            }
        }
        return arrayList;
    }
}
