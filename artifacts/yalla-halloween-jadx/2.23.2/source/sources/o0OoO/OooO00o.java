package o0OoO;

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
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p641o0ooOO0o.o0O000;
import p641o0ooOO0o.o0O000Oo;
import p641o0ooOO0o.o0O00O0o;
import p641o0ooOO0o.o0O00o00;
import p641o0ooOO0o.o0O00oO0;
import p641o0ooOO0o.o0OoOoOo;
import p654o0ooo00o.o000O;
import p662o0oooO0O.o0O0o0;
import p662o0oooO0O.oo0OOoo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class OooO00o implements o0OoOoOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Charset f46606OooO00o = Charset.forName("UTF-8");

    @Override // p641o0ooOO0o.o0OoOoOo
    @NotNull
    public final o0O00o00 intercept(@NotNull o0OoOoOo.OooO00o chain) throws JSONException, IOException {
        String strO000000o;
        o0O000Oo o0o000ooOooO0oO;
        Intrinsics.checkNotNullParameter(chain, "chain");
        o000O o000o = (o000O) chain;
        o0O00O0o o0o00o0o = o000o.f59401OooO0o0;
        o0O00o00 o0o00o00OooO0OO = o000o.OooO0OO(o0o00o0o);
        if (Intrinsics.areEqual(o0o00o0o.OooO0O0("Custom"), ServerProtocol.DIALOG_RETURN_SCOPES_TRUE)) {
            return o0o00o00OooO0OO;
        }
        o0O00oO0 o0o00oo1 = o0o00o00OooO0OO.f57852OooOO0;
        String str = (o0o00oo1 == null || (o0o000ooOooO0oO = o0o00oo1.OooO0oO()) == null) ? null : o0o000ooOooO0oO.f57810OooO0OO;
        if (!(str != null && (StringsKt__StringsKt.contains$default(str, "json", false, 2, (Object) null) || StringsKt__StringsKt.contains$default(str, "xml", false, 2, (Object) null) || StringsKt__StringsKt.contains$default(str, "plain", false, 2, (Object) null) || StringsKt__StringsKt.contains$default(str, "html", false, 2, (Object) null)))) {
            return o0o00o00OooO0OO;
        }
        String strOooO0O0 = o0o00o0o.OooO0O0("AbortDataCheck");
        if (strOooO0O0 != null && Boolean.parseBoolean(strOooO0O0)) {
            return o0o00o00OooO0OO;
        }
        if (o0o00oo1 == null) {
            strO000000o = "";
        } else {
            Intrinsics.checkNotNull(o0o00oo1);
            o0O0o0 o0o0o0OooOOo = o0o00oo1.OooOOo();
            o0o0o0OooOOo.request(LongCompanionObject.MAX_VALUE);
            oo0OOoo oo0ooooClone = o0o0o0OooOOo.OooO0O0().clone();
            Charset charset = this.f46606OooO00o;
            Intrinsics.checkNotNullExpressionValue(charset, "charset");
            strO000000o = oo0ooooClone.o000000o(charset);
        }
        JSONObject jSONObject = new JSONObject(strO000000o);
        if (jSONObject.has("code")) {
            Object obj = jSONObject.get("code");
            if (Intrinsics.areEqual(obj, "101") || Intrinsics.areEqual(obj, "3000")) {
                StringBuilder sb = new StringBuilder();
                sb.append(o0o00o0o.f57828OooO00o.f57788OooO);
                sb.append("\nHeaders = ");
                o0O000 o0o001 = o0o00o0o.f57830OooO0OO;
                int length = o0o001.f57773OooO0Oo.length / 2;
                for (int i = 0; i < length; i++) {
                    sb.append(o0o001.OooO0OO(i) + CertificateUtil.DELIMITER + o0o001.OooO0o0(i) + "\n");
                }
                sb.append("\nResponse = ".concat(strO000000o));
                Lazy lazy = p488o0o00O0.OooOO0.f48912OooO00o;
                String string = sb.toString();
                CustomLogModel customLogModel = new CustomLogModel();
                customLogModel.setLevel("ERROR");
                customLogModel.setMessage(string != null ? string : "");
                customLogModel.setTag(WebEventType.Http_Business_Error.toString());
                p488o0o00O0.OooOO0.OooO00o(customLogModel);
            }
        }
        return o0o00o00OooO0OO;
    }
}
