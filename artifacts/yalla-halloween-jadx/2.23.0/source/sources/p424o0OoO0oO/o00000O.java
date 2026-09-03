package p424o0OoO0oO;

import androidx.compose.runtime.internal.StabilityInferred;
import com.common.support.sailfish_commons.logmodels.CustomLogModel;
import com.facebook.internal.ServerProtocol;
import com.facebook.internal.security.CertificateUtil;
import com.yalla.yalla.statistical.event.WebEventType;
import java.io.IOException;
import java.nio.charset.Charset;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p482o0o000oO.o0Oo0oo;
import p634o0ooO0oO.o00OOO0;
import p634o0ooO0oO.o00OOO00;
import p634o0ooO0oO.o00OOOOo;
import p634o0ooO0oO.o0O0o;
import p634o0ooO0oO.o0oOOo;
import p634o0ooO0oO.oo0O;
import p647o0ooOooo.nc;
import p659o0oooO00.o0000;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o00000O implements o00OOO00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Charset f45571OooO00o = Charset.forName("UTF-8");

    @Override // p634o0ooO0oO.o00OOO00
    @NotNull
    public final o0oOOo intercept(@NotNull o00OOO00.OooO00o chain) throws JSONException, IOException {
        String strO000000;
        o00OOO0 o00ooo0OooO0oO;
        Intrinsics.checkNotNullParameter(chain, "chain");
        nc ncVar = (nc) chain;
        o00OOOOo o00ooooo2 = ncVar.f59720OooO0o0;
        o0oOOo o0ooooOooO0O0 = ncVar.OooO0O0(o00ooooo2);
        if (Intrinsics.areEqual(o00ooooo2.OooO0O0("Custom"), ServerProtocol.DIALOG_RETURN_SCOPES_TRUE)) {
            return o0ooooOooO0O0;
        }
        o0O0o o0o0o = o0ooooOooO0O0.f57347OooOO0;
        String str = (o0o0o == null || (o00ooo0OooO0oO = o0o0o.OooO0oO()) == null) ? null : o00ooo0OooO0oO.f57237OooO0OO;
        if (!(str != null && (StringsKt.OooO0o(str, "json") || StringsKt.OooO0o(str, "xml") || StringsKt.OooO0o(str, "plain") || StringsKt.OooO0o(str, "html")))) {
            return o0ooooOooO0O0;
        }
        String strOooO0O0 = o00ooooo2.OooO0O0("AbortDataCheck");
        if (strOooO0O0 != null && Boolean.parseBoolean(strOooO0O0)) {
            return o0ooooOooO0O0;
        }
        if (o0o0o == null) {
            strO000000 = "";
        } else {
            Intrinsics.checkNotNull(o0o0o);
            o0000 o0000VarOooOOo0 = o0o0o.OooOOo0();
            o0000VarOooOOo0.request(LongCompanionObject.MAX_VALUE);
            p659o0oooO00.o00000O o00000oClone = o0000VarOooOOo0.OooO0O0().clone();
            Charset charset = this.f45571OooO00o;
            Intrinsics.checkNotNullExpressionValue(charset, "charset");
            strO000000 = o00000oClone.o000000(charset);
        }
        JSONObject jSONObject = new JSONObject(strO000000);
        if (jSONObject.has("code")) {
            Object obj = jSONObject.get("code");
            if (Intrinsics.areEqual(obj, "101") || Intrinsics.areEqual(obj, "3000")) {
                StringBuilder sb = new StringBuilder();
                sb.append(o00ooooo2.f57313OooO00o.f57202OooO);
                sb.append("\nHeaders = ");
                oo0O oo0o = o00ooooo2.f57315OooO0OO;
                int length = oo0o.f57369OooO0Oo.length / 2;
                for (int i = 0; i < length; i++) {
                    sb.append(oo0o.OooO0OO(i) + CertificateUtil.DELIMITER + oo0o.OooO0o0(i) + "\n");
                }
                sb.append("\nResponse = ".concat(strO000000));
                Lazy lazy = o0Oo0oo.f47701OooO00o;
                String string = sb.toString();
                CustomLogModel customLogModel = new CustomLogModel();
                customLogModel.setLevel("ERROR");
                customLogModel.setMessage(string != null ? string : "");
                customLogModel.setTag(WebEventType.Http_Business_Error.toString());
                o0Oo0oo.OooO00o(customLogModel);
            }
        }
        return o0ooooOooO0O0;
    }
}
