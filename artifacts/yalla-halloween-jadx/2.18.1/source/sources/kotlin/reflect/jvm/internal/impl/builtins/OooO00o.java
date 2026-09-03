package kotlin.reflect.jvm.internal.impl.builtins;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class OooO00o {
    public static String OooO00o(StringBuilder sb, String str, char c, char c2) {
        sb.append(str);
        sb.append(c);
        sb.append(c2);
        return sb.toString();
    }

    public static FqName OooO0O0(String str, FqName fqName, String str2) {
        FqName fqNameChild = fqName.child(Name.identifier(str));
        Intrinsics.checkNotNullExpressionValue(fqNameChild, str2);
        return fqNameChild;
    }
}
