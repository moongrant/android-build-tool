package p470o0OoooOo;

import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o000O0;
import com.common.support.crypto.AESKt;
import com.common.support.crypto.Base64ExtensionsKt;
import com.ishumei.smantifraud.SmAntiFraud;
import com.yalla.yalla.data.db.model.NewFriendsOld;
import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p004OooO0oO.o0OoOo0;
import p382o0OOoo0o.oo000o;
import p402o0Oo0OOO.o00O0000;
import p402o0Oo0OOO.o00O000o;
import p408o0Oo0o0O.o00Oo0;
import p409o0Oo0o0o.o000OOo;
import p464o0Oooo.o000000O;
import p579o0oOoo.o0o0000;
import p579o0oOoo.oO000Oo;
import p592o0oo00O.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o0O0oo0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static String f47183OooO00o;

    public static final class OooO00o implements SmAntiFraud.IServerSmidCallback {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ JSONObject f47184OooO00o;

        public OooO00o(JSONObject jSONObject) {
            this.f47184OooO00o = jSONObject;
        }

        @Override // com.ishumei.smantifraud.SmAntiFraud.IServerSmidCallback
        public final void onError(int i) {
            int i2 = o00O000o.f44490OooO00o;
            OooOOO0.OooO0OO("ShuMeiServiceError", "p0 = " + i + ", jsonObject = " + this.f47184OooO00o + ", smHost = " + o00O000o.f44491OooO0O0);
        }

        @Override // com.ishumei.smantifraud.SmAntiFraud.IServerSmidCallback
        public final void onSuccess(@Nullable String str) {
            String str2 = o00O000o.f44491OooO0O0;
            StringBuilder sbOooO00o = o0OoOo0.OooO00o("id = ", str, ", jsonObject = ");
            sbOooO00o.append(this.f47184OooO00o);
            sbOooO00o.append(", smHost = ");
            sbOooO00o.append(str2);
            OooOOO0.OooO0OO("ShuMeiServiceSuccess", sbOooO00o.toString());
            if (str == null || str.length() >= 100) {
                return;
            }
            String str3 = o0O0oo0o.f47183OooO00o;
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            o0O0oo0o.f47183OooO00o = str;
            o000OOo o000oooOooO0o = o00Oo0.OooO0o();
            String value = o0O0oo0o.f47183OooO00o;
            o000oooOooO0o.getClass();
            Intrinsics.checkNotNullParameter(value, "value");
            o000oooOooO0o.OooO(String.valueOf(-519335272), Base64ExtensionsKt.base64EncodeToString(AESKt.aesEncrypt$default(value, oO000Oo.OooO00o(), o0o0000.f56518OooO00o, (String) null, 4, (Object) null)));
            o00O0000.OooO00o();
        }
    }

    static {
        o000OOo o000oooOooO0o = o00Oo0.OooO0o();
        o000oooOooO0o.getClass();
        String strOooO0o0 = o000oooOooO0o.OooO0o0(String.valueOf(-519335272), "");
        f47183OooO00o = StringsKt.isBlank(strOooO0o0) ? "" : new String(AESKt.aesDecrypt$default(strOooO0o0, oO000Oo.OooO00o(), o0o0000.f56518OooO00o, false, null, 12, null), Charsets.UTF_8);
    }

    public static void OooO00o() throws JSONException {
        SmAntiFraud.SmOption smOption = new SmAntiFraud.SmOption();
        smOption.setAppId(NewFriendsOld.State_Default);
        smOption.setUrl(o00O000o.f44491OooO0O0);
        smOption.setConfUrl(o00O000o.f44491OooO0O0 + "/v3/cloudconf");
        o000OOo o000oooOooO0o = o00Oo0.OooO0o();
        o000oooOooO0o.getClass();
        String strOooO0o0 = o000oooOooO0o.OooO0o0(String.valueOf(-1393565468), "CLnvIDFv1ZjXPDbZECh6PCyLN0qs+aR/WKFC5pEv+tY=");
        String strOooO00o = oO000Oo.OooO00o();
        byte[] bArr = o0o0000.f56518OooO00o;
        byte[] bArrAesDecrypt$default = AESKt.aesDecrypt$default(strOooO0o0, strOooO00o, bArr, false, null, 12, null);
        Charset charset = Charsets.UTF_8;
        smOption.setOrganization(new String(bArrAesDecrypt$default, charset));
        o000OOo o000oooOooO0o2 = o00Oo0.OooO0o();
        o000oooOooO0o2.getClass();
        smOption.setPublicKey(new String(AESKt.aesDecrypt$default(o000oooOooO0o2.OooO0o0(String.valueOf(641335589), "eyPc+5wvFgdnk1bOwRe0Z2txsEXOtH1rLfmDQTh8UPsODZ1+a+6gWrL17DKMGrK0Z2jGBHJJxPoNbdGM+uM2y4aiv9ivN2o44o+FrVHA2xU31xGrbZSyqaXzf1/JQWhqaXNqIVopuX+Q6GzB/o1qbLQQpGvNHHxxfFZGxe1+bZ0L3lZV4fK8iX6yydWNoLZC8Akz9QfMkhlnaFQWr+29/Wgq4xMskgYeazQNNTJFXmtKNhG7G/ARl9uQk0D0qjqAfNhVWSUJp6RYSVX3N8jqeaTEjyb2ldZspoN3C6PQgj6tGwwJE4S2InqYEIRNsjX0hend/jvzsqkr2J1rwGAJbEeRm7hoM5YwQdw959hBIhiLTYPI/xCmOf1UjnNDllEsZqHTGGxwoTofHHrpjb+9j8fURt7ykkRvYI/c2xVEuQd9owxilEXo+rirBR/9PAijCVh7gKvDiBC1wj3nvbieRbFAHSroyEOVP6xCWniiU4+iVTW4fvEIBBAg489wPhlq0xixxp6hqQdNQ/vSt/6367XBdU76MHEXBEP8bzlTjpqyUh7DYLlBqI/DcSAEGJQUw7oU0KKLB42UTGiZHM5T/hS/kdh2A4sS7YuyEL9Rbs/ZoFgPfQgC8kkAwNy/dHEqu0qzIAa4cg7TfK4GHiY23nCawchAOZ+dHNnDhtCAm/FTkiVPI91ZX523qZ0kXGmfqL6EhMW/wF8kw94z0M1ocOvCsmRme8q0JlHhe3AwJ4TBCuTYA0TTCToG87m6gj9kt1ixSQChcMi/jOP/oRN+6tlRLHUmzCoIbF1iEBCf/RbRAcGbqxMTl/39DQM9fGUprEx6dvwldBRpl6XfWFF2CGR0OByZrYCimNW9sN4lgczJFdIqEPnXDRjsB55+zj9QdGPNKlOLAZQh8eyNy6M8BXr46lekyiTu229vZ9MRvY3Jprb8MR1hOmLBVVyuFBiPsdHqoH+2KqjSTNeNMK+M5m2MPGlKJhLGouSg1WQwZJeKMqV3svuGPkZRN/JIoWkAhm87o2Lj/zrw2RhXSMlWmtDeYMS/DjNjr50DAzuo2cbs8Fe+H9BE1l0iOwJ5O4Oh42kmEXZF5T314EoXbqsrz0qCwMFjs4rgkP8JOD7y+hhsoxinigVBNqWd6HcCxBRmOJqtE1Wgmw69UVhl18kwU0SS3gxa/fYlGIfxvC0OKMDn3+Vohy4TqFe9jHvPA805c1MfOpnZN5uxSH+IFCu6+DyfNz50N6rEnrmz0ya/1tzSKaMR2usqqyymNboFFXv94L2sN0e1LubK7T1UteGIJIW4ekik/CGToQnJo7lKoIQQkd4+L+BsLR/CLMAFYmNRrUxlQiZeRV3lkecmPqU7wNrHlrxIN1u9ZptSTDfx8TZIaDaV5JFauZWs9XjS65IbosxD9zTF9vo6+q+PXin0QoQZ+TDhkySxJWK0yTGZAx+IHuSSpfgi20TXtBT1Tkzk"), oO000Oo.OooO00o(), bArr, false, null, 12, null), charset));
        smOption.setCheckCrt(false);
        smOption.setCloudConf(false);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("platform", 2);
        o000000O o000000o2 = o000000O.f46674OooO00o;
        jSONObject.put("id", String.valueOf(o000000O.OooOOo0().getValue()));
        jSONObject.put("idx", String.valueOf(o000000O.OooOOo().getValue()));
        jSONObject.put("businessDeviceId", oo000o.OooO00o());
        smOption.setExtraInfo(jSONObject.toString());
        smOption.setServerIdCallback(new OooO00o(jSONObject));
        SmAntiFraud.create(o000O0.OooO00o(), smOption);
    }
}
