package p485o0o000Oo;

import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.common.model.ApiError;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p516o0o0O000.o0OOO0o;
import p640o0ooO0oO.o000O0O0;
import p660o0ooo0o0.o00OO00O;
import p660o0ooo0o0.o00OO0O0;
import p660o0ooo0o0.o00OOO00;
import p660o0ooo0o0.o00OOOO0;
import p660o0ooo0o0.o00OOOOo;
import p666o0oooO0o.oOo00o0o;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class Oooo000 implements o00OO00O {
    @Override // p660o0ooo0o0.o00OO00O
    @NotNull
    public final o00OOOO0 intercept(@NotNull o00OO00O.OooO00o oooO00o) throws IOException {
        Intrinsics.checkNotNullParameter(oooO00o, o000O0O0.OooO00o(-10994288139792L));
        oOo00o0o ooo00o0o = (oOo00o0o) oooO00o;
        o00OOO00 o00ooo01 = ooo00o0o.f51883OooO0o;
        o00OOOO0 o00oooo0OooO0O0 = ooo00o0o.OooO0O0(o00ooo01);
        if (o00oooo0OooO0O0.OooO0Oo() || Intrinsics.areEqual(o00ooo01.OooO0O0(o000O0O0.OooO00o(-11020057943568L)), o000O0O0.OooO00o(-11050122714640L))) {
            return o00oooo0OooO0O0;
        }
        ApiError apiError = new ApiError(o00oooo0OooO0O0.f51443OoooO00, o00oooo0OooO0O0.f51437Oooo);
        o0OOO0o o0ooo0o2 = o0OOO0o.f42120OooO00o;
        String strOooO0oo = o0OOO0o.OooO00o().OooO0oo(apiError);
        if (strOooO0oo == null) {
            strOooO0oo = o000O0O0.OooO00o(-11071597551120L);
        } else {
            Intrinsics.checkNotNullExpressionValue(strOooO0oo, o000O0O0.OooO00o(-11075892518416L));
        }
        o00OOOOo o00oooooOooO00o = o00OOOOo.f51464Oooo0oO.OooO00o(strOooO0oo, o00OO0O0.f51401OooO0oO.OooO00o(o000O0O0.OooO00o(-11183266700816L)));
        o00OOOO0.OooO00o oooO00o2 = new o00OOOO0.OooO00o(o00oooo0OooO0O0);
        oooO00o2.f51454OooO0OO = 200;
        oooO00o2.f51458OooO0oO = o00oooooOooO00o;
        return oooO00o2.OooO00o();
    }
}
