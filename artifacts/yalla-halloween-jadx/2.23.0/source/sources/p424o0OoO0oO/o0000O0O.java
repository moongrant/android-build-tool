package p424o0OoO0oO;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.colorspace.OooO0OO;
import com.facebook.internal.ServerProtocol;
import com.yalla.yalla.data.constant.FeedbackType;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p382o0OOoo0o.o00Ooo;
import p464o0Oooo.o000000O;
import p470o0OoooOo.o0O0oo0o;
import p591o0oo000O.OooO;
import p634o0ooO0oO.o00OO;
import p634o0ooO0oO.o00OO0O0;
import p634o0ooO0oO.o00OOO00;
import p634o0ooO0oO.o00OOOOo;
import p634o0ooO0oO.o0oOOo;
import p634o0ooO0oO.oo00oO;
import p647o0ooOooo.nc;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o0000O0O implements o00OOO00 {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p634o0ooO0oO.o00OOO00
    @NotNull
    public final o0oOOo intercept(@NotNull o00OOO00.OooO00o chain) {
        nc ncVar;
        Intrinsics.checkNotNullParameter(chain, "chain");
        nc ncVar2 = (nc) chain;
        o00OOOOo o00ooooo2 = ncVar2.f59720OooO0o0;
        if (Intrinsics.areEqual(o00ooooo2.OooO0O0("Custom"), ServerProtocol.DIALOG_RETURN_SCOPES_TRUE)) {
            return ncVar2.OooO0O0(o00ooooo2);
        }
        o00OOOOo.OooO00o oooO00o = new o00OOOOo.OooO00o(o00ooooo2);
        o00OO o00oo2 = o00ooooo2.f57313OooO00o;
        o00OO.OooO00o oooO00oOooO0o = o00oo2.OooO0o();
        String str = o00ooooo2.f57314OooO0O0;
        boolean z = false;
        if (!StringsKt.OooOO0o(str, "GET")) {
            if (StringsKt.OooOO0o(str, "POST")) {
                o00OO0O0.OooO00o oooO00o2 = new o00OO0O0.OooO00o(0);
                oo00oO oo00oo = o00ooooo2.f57316OooO0Oo;
                if (oo00oo instanceof o00OO0O0) {
                    Intrinsics.checkNotNull(oo00oo, "null cannot be cast to non-null type okhttp3.FormBody");
                    o00OO0O0 o00oo0o1 = (o00OO0O0) oo00oo;
                    int size = o00oo0o1.f57222OooO00o.size();
                    int i = 0;
                    boolean z2 = false;
                    while (i < size) {
                        int i2 = size;
                        nc ncVar3 = ncVar2;
                        String strOooO0Oo = o00OO.OooO0O0.OooO0Oo(o00oo0o1.f57222OooO00o.get(i), 0, 0, true, 3);
                        if (!z2 && Intrinsics.areEqual(strOooO0Oo, "region")) {
                            z2 = true;
                        }
                        oooO00o2.OooO00o(strOooO0Oo, o00oo0o1.OooO00o(i));
                        i++;
                        size = i2;
                        ncVar2 = ncVar3;
                    }
                    ncVar = ncVar2;
                    z = z2;
                } else {
                    ncVar = ncVar2;
                }
                oooO00o2.OooO00o("p", FeedbackType.Suggestions);
                oooO00o2.OooO00o("v", String.valueOf(o00Ooo.OooO0OO()));
                o000000O o000000o2 = o000000O.f46674OooO00o;
                oooO00o2.OooO00o("userid", String.valueOf(((Number) OooO0OO.OooO0O0()).longValue()));
                T value = o000000O.OooOOOO().getValue();
                Intrinsics.checkNotNull(value);
                oooO00o2.OooO00o("token", (String) value);
                if (!z) {
                    Integer num = (Integer) o000000O.OooOOO0().getValue();
                    if (num == null) {
                        num = -1;
                    }
                    int iIntValue = num.intValue();
                    if (iIntValue == -1) {
                        iIntValue = OooO.OooO0OO();
                    }
                    oooO00o2.OooO00o("region", String.valueOf(iIntValue));
                }
                oooO00o2.OooO00o("boxid", o0O0oo0o.f47183OooO00o);
                oooO00o.OooO0oO(new o00OO0O0(oooO00o2.f57225OooO0O0, oooO00o2.f57226OooO0OO));
            }
            return ncVar.OooO0O0(oooO00o.OooO0O0());
        }
        oooO00oOooO0o.OooOO0O("p", FeedbackType.Suggestions);
        oooO00oOooO0o.OooOO0O("v", String.valueOf(o00Ooo.OooO0OO()));
        o000000O o000000o3 = o000000O.f46674OooO00o;
        oooO00oOooO0o.OooOO0O("userid", String.valueOf(((Number) OooO0OO.OooO0O0()).longValue()));
        T value2 = o000000O.OooOOOO().getValue();
        Intrinsics.checkNotNull(value2);
        oooO00oOooO0o.OooOO0O("token", (String) value2);
        String strOooO0oO = o00oo2.OooO0oO("pagesize");
        if (strOooO0oO == null || StringsKt.isBlank(strOooO0oO)) {
            oooO00oOooO0o.OooOO0O("pagesize", "15");
        }
        String strOooO0oO2 = o00oo2.OooO0oO("region");
        if (strOooO0oO2 == null || StringsKt.isBlank(strOooO0oO2)) {
            Integer num2 = (Integer) o000000O.OooOOO0().getValue();
            if (num2 == null) {
                num2 = -1;
            }
            int iIntValue2 = num2.intValue();
            if (iIntValue2 == -1) {
                iIntValue2 = OooO.OooO0OO();
            }
            oooO00oOooO0o.OooOO0O("region", String.valueOf(iIntValue2));
        }
        oooO00oOooO0o.OooOO0O("boxid", o0O0oo0o.f47183OooO00o);
        o00OO url = oooO00oOooO0o.OooO0OO();
        Intrinsics.checkNotNullParameter(url, "url");
        oooO00o.f57319OooO00o = url;
        ncVar = ncVar2;
        return ncVar.OooO0O0(oooO00o.OooO0O0());
    }
}
