package p485o0o000Oo;

import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.common.statistical.net.FLog;
import java.io.IOException;
import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p640o0ooO0oO.o000O0O0;
import p660o0ooo0o0.o00OO00O;
import p660o0ooo0o0.o00OO0O0;
import p660o0ooo0o0.o00OOO00;
import p660o0ooo0o0.o00OOOO0;
import p660o0ooo0o0.o00OOOOo;
import p666o0oooO0o.oOo00o0o;
import p674o0oooo0.o0oOO;
import p674o0oooo0.o0oOOo;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class OooOo00 implements o00OO00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Charset f40893OooO00o = Charset.forName(o000O0O0.OooO00o(-9989265792528L));

    @Override // p660o0ooo0o0.o00OO00O
    @NotNull
    public final o00OOOO0 intercept(@NotNull o00OO00O.OooO00o oooO00o) throws JSONException, IOException {
        String strOooooO0;
        o00OO0O0 o00oo0o0OooO0o;
        Intrinsics.checkNotNullParameter(oooO00o, o000O0O0.OooO00o(-10015035596304L));
        oOo00o0o ooo00o0o = (oOo00o0o) oooO00o;
        o00OOO00 o00ooo01 = ooo00o0o.f51883OooO0o;
        o00OOOO0 o00oooo0OooO0O0 = ooo00o0o.OooO0O0(o00ooo01);
        if (Intrinsics.areEqual(o00ooo01.OooO0O0(o000O0O0.OooO00o(-10040805400080L)), o000O0O0.OooO00o(-10070870171152L))) {
            return o00oooo0OooO0O0;
        }
        o00OOOOo o00ooooo2 = o00oooo0OooO0O0.f51441OoooO;
        String str = null;
        if (o00ooooo2 != null && (o00oo0o0OooO0o = o00ooooo2.OooO0o()) != null) {
            str = o00oo0o0OooO0o.f51404OooO0OO;
        }
        if (!(str != null && (StringsKt__StringsKt.contains$default(str, o000O0O0.OooO00o(-10384402783760L), false, 2, (Object) null) || StringsKt__StringsKt.contains$default(str, o000O0O0.OooO00o(-10405877620240L), false, 2, (Object) null) || StringsKt__StringsKt.contains$default(str, o000O0O0.OooO00o(-10423057489424L), false, 2, (Object) null) || StringsKt__StringsKt.contains$default(str, o000O0O0.OooO00o(-10448827293200L), false, 2, (Object) null)))) {
            return o00oooo0OooO0O0;
        }
        String strOooO0O0 = o00ooo01.OooO0O0(o000O0O0.OooO00o(-10092345007632L));
        if (strOooO0O0 != null && Boolean.parseBoolean(strOooO0O0)) {
            return o00oooo0OooO0O0;
        }
        o00OOOOo o00ooooo3 = o00oooo0OooO0O0.f51441OoooO;
        if (o00ooooo3 == null) {
            strOooooO0 = o000O0O0.OooO00o(-10345748078096L);
        } else {
            Intrinsics.checkNotNull(o00ooooo3);
            o0oOOo o0ooooOooO0oo = o00ooooo3.OooO0oo();
            o0ooooOooO0oo.request(Long.MAX_VALUE);
            o0oOO o0oooClone = o0ooooOooO0oo.OooO0o0().clone();
            Charset charset = this.f40893OooO00o;
            Intrinsics.checkNotNullExpressionValue(charset, o000O0O0.OooO00o(-10350043045392L));
            strOooooO0 = o0oooClone.OooooO0(charset);
        }
        JSONObject jSONObject = new JSONObject(strOooooO0);
        if (jSONObject.has(o000O0O0.OooO00o(-10156769517072L))) {
            Object obj = jSONObject.get(o000O0O0.OooO00o(-10178244353552L));
            if (Intrinsics.areEqual(obj, o000O0O0.OooO00o(-10199719190032L)) || Intrinsics.areEqual(obj, o000O0O0.OooO00o(-10216899059216L))) {
                StringBuilder sb = new StringBuilder();
                sb.append(o00ooo01.f51425OooO0O0.f51390OooOO0);
                sb.append(o000O0O0.OooO00o(-10238373895696L));
                int length = o00ooo01.f51427OooO0Oo.f51230Oooo0o.length / 2;
                for (int i = 0; i < length; i++) {
                    sb.append(o00ooo01.f51427OooO0Oo.OooO0O0(i) + ':' + o00ooo01.f51427OooO0Oo.OooO0o0(i) + '\n');
                }
                sb.append(o000O0O0.OooO00o(-10289913503248L) + strOooooO0);
                FLog.INSTANCE.apiBusinessErrorLog(sb.toString());
            }
        }
        return o00oooo0OooO0O0;
    }
}
