package oo0oOO0;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o00O0OO.OooOOO;
import o00O0OO.OooOOOO;
import o00O0OO.Oooo0;
import o00O0OO.o00Ooo;
import o00O0OO.o0ooOOo;
import org.jetbrains.annotations.NotNull;
import p004OooO0oO.o0OoOo0;
import p115o00O00oO.o0Oo0oo;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final String f60362OooO00o;

    static {
        String strOooO0o = o0Oo0oo.OooO0o("DiagnosticsWrkr");
        Intrinsics.checkNotNullExpressionValue(strOooO0o, "tagWithPrefix(\"DiagnosticsWrkr\")");
        f60362OooO00o = strOooO0o;
    }

    public static final String OooO00o(Oooo0 oooo0, o00O0OO.o0Oo0oo o0oo0oo2, OooOOOO oooOOOO, List list) {
        StringBuilder sb = new StringBuilder("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            o00Ooo o00ooo2 = (o00Ooo) it.next();
            OooOOO oooOOOOooO0OO = oooOOOO.OooO0OO(o0ooOOo.OooO00o(o00ooo2));
            Integer numValueOf = oooOOOOooO0OO != null ? Integer.valueOf(oooOOOOooO0OO.f36201OooO0OO) : null;
            String str = o00ooo2.f36216OooO00o;
            String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(oooo0.OooO00o(str), ",", null, null, 0, null, null, 62, null);
            String strJoinToString$default2 = CollectionsKt___CollectionsKt.joinToString$default(o0oo0oo2.OooO00o(str), ",", null, null, 0, null, null, 62, null);
            StringBuilder sbOooO0O0 = o0OoOo0.OooO0O0("\n", str, "\t ");
            sbOooO0O0.append(o00ooo2.f36218OooO0OO);
            sbOooO0O0.append("\t ");
            sbOooO0O0.append(numValueOf);
            sbOooO0O0.append("\t ");
            sbOooO0O0.append(o00ooo2.f36217OooO0O0.name());
            sbOooO0O0.append("\t ");
            sbOooO0O0.append(strJoinToString$default);
            sbOooO0O0.append("\t ");
            sbOooO0O0.append(strJoinToString$default2);
            sbOooO0O0.append('\t');
            sb.append(sbOooO0O0.toString());
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
