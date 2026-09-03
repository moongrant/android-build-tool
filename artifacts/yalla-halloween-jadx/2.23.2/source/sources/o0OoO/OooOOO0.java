package o0OoO;

import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.internal.ServerProtocol;
import com.yalla.yalla.data.constant.FeedbackType;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import p386o0OOooO.oo0o0Oo;
import p475o0Ooooo0.o0O00oO0;
import p595o0oo00O.OooOo00;
import p641o0ooOO0o.o0O00000;
import p641o0ooOO0o.o0O000O;
import p641o0ooOO0o.o0O00O0o;
import p641o0ooOO0o.o0O00o00;
import p641o0ooOO0o.o0OoOoOo;
import p641o0ooOO0o.o0oO0Ooo;
import p654o0ooo00o.o000O;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class OooOOO0 implements o0OoOoOo {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p641o0ooOO0o.o0OoOoOo
    @NotNull
    public final o0O00o00 intercept(@NotNull o0OoOoOo.OooO00o chain) {
        o000O o000o;
        Intrinsics.checkNotNullParameter(chain, "chain");
        o000O o000o2 = (o000O) chain;
        o0O00O0o o0o00o0o = o000o2.f59401OooO0o0;
        if (Intrinsics.areEqual(o0o00o0o.OooO0O0("Custom"), ServerProtocol.DIALOG_RETURN_SCOPES_TRUE)) {
            return o000o2.OooO0OO(o0o00o0o);
        }
        o0O00O0o.OooO00o oooO00o = new o0O00O0o.OooO00o(o0o00o0o);
        o0O000O o0o000o = o0o00o0o.f57828OooO00o;
        o0O000O.OooO00o oooO00oOooO0o = o0o000o.OooO0o();
        String str = o0o00o0o.f57829OooO0O0;
        boolean z = false;
        if (!StringsKt__StringsJVMKt.equals(str, "GET", true)) {
            if (StringsKt__StringsJVMKt.equals(str, "POST", true)) {
                o0O00000.OooO00o oooO00o2 = new o0O00000.OooO00o(0);
                o0oO0Ooo o0oo0ooo2 = o0o00o0o.f57831OooO0Oo;
                if (o0oo0ooo2 instanceof o0O00000) {
                    Intrinsics.checkNotNull(o0oo0ooo2, "null cannot be cast to non-null type okhttp3.FormBody");
                    o0O00000 o0o00000 = (o0O00000) o0oo0ooo2;
                    int size = o0o00000.f57776OooO00o.size();
                    int i = 0;
                    boolean z2 = false;
                    while (i < size) {
                        int i2 = size;
                        o000O o000o3 = o000o2;
                        String strOooO0Oo = o0O000O.OooO0O0.OooO0Oo(o0o00000.f57776OooO00o.get(i), 0, 0, true, 3);
                        if (!z2 && Intrinsics.areEqual(strOooO0Oo, "region")) {
                            z2 = true;
                        }
                        oooO00o2.OooO00o(strOooO0Oo, o0o00000.OooO00o(i));
                        i++;
                        size = i2;
                        o000o2 = o000o3;
                    }
                    o000o = o000o2;
                    z = z2;
                } else {
                    o000o = o000o2;
                }
                oooO00o2.OooO00o("p", FeedbackType.Suggestions);
                oooO00o2.OooO00o("v", String.valueOf(oo0o0Oo.OooO0OO()));
                o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                oooO00o2.OooO00o("userid", String.valueOf(((Number) com.yalla.yalla.common.manager.OooO00o.OooO00o()).longValue()));
                T value = o0O00oO0.OooOOOO().getValue();
                Intrinsics.checkNotNull(value);
                oooO00o2.OooO00o("token", (String) value);
                if (!z) {
                    Integer num = (Integer) o0O00oO0.OooOOO0().getValue();
                    if (num == null) {
                        num = -1;
                    }
                    int iIntValue = num.intValue();
                    if (iIntValue == -1) {
                        iIntValue = OooOo00.OooO0OO();
                    }
                    oooO00o2.OooO00o("region", String.valueOf(iIntValue));
                }
                oooO00o2.OooO00o("boxid", o0o0000.OooO00o.f48382OooO00o);
                oooO00o.OooO0oO(new o0O00000(oooO00o2.f57779OooO0O0, oooO00o2.f57780OooO0OO));
            }
            return o000o.OooO0OO(oooO00o.OooO0O0());
        }
        oooO00oOooO0o.OooOO0O("p", FeedbackType.Suggestions);
        oooO00oOooO0o.OooOO0O("v", String.valueOf(oo0o0Oo.OooO0OO()));
        o0O00oO0 o0o00oo2 = o0O00oO0.f47936OooO00o;
        oooO00oOooO0o.OooOO0O("userid", String.valueOf(((Number) com.yalla.yalla.common.manager.OooO00o.OooO00o()).longValue()));
        T value2 = o0O00oO0.OooOOOO().getValue();
        Intrinsics.checkNotNull(value2);
        oooO00oOooO0o.OooOO0O("token", (String) value2);
        String strOooO0oO = o0o000o.OooO0oO("pagesize");
        if (strOooO0oO == null || StringsKt.isBlank(strOooO0oO)) {
            oooO00oOooO0o.OooOO0O("pagesize", "15");
        }
        String strOooO0oO2 = o0o000o.OooO0oO("region");
        if (strOooO0oO2 == null || StringsKt.isBlank(strOooO0oO2)) {
            Integer num2 = (Integer) o0O00oO0.OooOOO0().getValue();
            if (num2 == null) {
                num2 = -1;
            }
            int iIntValue2 = num2.intValue();
            if (iIntValue2 == -1) {
                iIntValue2 = OooOo00.OooO0OO();
            }
            oooO00oOooO0o.OooOO0O("region", String.valueOf(iIntValue2));
        }
        oooO00oOooO0o.OooOO0O("boxid", o0o0000.OooO00o.f48382OooO00o);
        o0O000O url = oooO00oOooO0o.OooO0OO();
        Intrinsics.checkNotNullParameter(url, "url");
        oooO00o.f57834OooO00o = url;
        o000o = o000o2;
        return o000o.OooO0OO(oooO00o.OooO0O0());
    }
}
