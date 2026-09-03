package OooO0o;

import androidx.fragment.app.Fragment;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;
import p516o0o0O000.o0OOO0o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO0o {
    public static Object OooO00o(Type type, String str, String str2, Type type2) {
        Intrinsics.checkNotNullExpressionValue(type, str);
        Object objOooO0OO = o0OOO0o.OooO0OO(str2, type2);
        Intrinsics.checkNotNull(objOooO0OO);
        return objOooO0OO;
    }

    public static String OooO0O0(String str, Fragment fragment, String str2) {
        return str + fragment + str2;
    }

    public static StringBuilder OooO0OO(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }
}
