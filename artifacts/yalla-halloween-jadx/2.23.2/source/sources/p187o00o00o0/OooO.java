package p187o00o00o0;

import com.code.android.json.OooO00o;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nJsonUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsonUtil.kt\ncom/code/android/json/JsonUtilKt\n+ 2 JsonUtil.kt\ncom/code/android/json/JsonUtil\n*L\n1#1,155:1\n109#2:156\n*S KotlinDebug\n*F\n+ 1 JsonUtil.kt\ncom/code/android/json/JsonUtilKt\n*L\n41#1:156\n*E\n"})
public final class OooO {
    @NotNull
    public static final String OooO00o(@Nullable Object obj) {
        String strOooO0oo;
        if (obj == null || (strOooO0oo = OooO00o.OooO00o().OooO0oo(obj)) == null) {
            return "";
        }
        Intrinsics.checkNotNullExpressionValue(strOooO0oo, "gson.toJson(model) ?: \"\"");
        return strOooO0oo;
    }

    @Nullable
    public static final Object OooO0O0(@NotNull Class type, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        return OooO00o.OooO0OO(type, str);
    }

    @Nullable
    public static final <T> T OooO0OO(@NotNull String str, @NotNull Type type) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        return (T) OooO00o.OooO0Oo(str, type);
    }
}
