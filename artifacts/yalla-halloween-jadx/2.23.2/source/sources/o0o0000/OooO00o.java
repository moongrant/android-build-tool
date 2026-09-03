package o0o0000;

import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o000O00O;
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
import p386o0OOooO.o000000;
import p414o0Oo0oO.oO000Oo0;
import p415o0Oo0oO0.o00Ooo;
import p475o0Ooooo0.o0O00oO0;
import p583o0oOoo00.o000000O;
import p583o0oOoo00.o00000OO;
import p590o0oOooo0.oO0oO000;
import p590o0oOooo0.oOO0Oo00;
import p598o0oo00Oo.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static String f48382OooO00o;

    /* JADX INFO: renamed from: o0o0000.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C0459OooO00o implements SmAntiFraud.IServerSmidCallback {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ JSONObject f48383OooO00o;

        public C0459OooO00o(JSONObject jSONObject) {
            this.f48383OooO00o = jSONObject;
        }

        @Override // com.ishumei.smantifraud.SmAntiFraud.IServerSmidCallback
        public final void onError(int i) {
            int i2 = o00000OO.f56659OooO00o;
            o0000O00.OooO0OO("ShuMeiServiceError", "p0 = " + i + ", jsonObject = " + this.f48383OooO00o + ", smHost = " + o00000OO.f56660OooO0O0);
        }

        @Override // com.ishumei.smantifraud.SmAntiFraud.IServerSmidCallback
        public final void onSuccess(@Nullable String str) {
            String str2 = o00000OO.f56660OooO0O0;
            StringBuilder sbOooO0O0 = o0OoOo0.OooO0O0("id = ", str, ", jsonObject = ");
            sbOooO0O0.append(this.f48383OooO00o);
            sbOooO0O0.append(", smHost = ");
            sbOooO0O0.append(str2);
            o0000O00.OooO0OO("ShuMeiServiceSuccess", sbOooO0O0.toString());
            if (str == null || str.length() >= 100) {
                return;
            }
            String str3 = OooO00o.f48382OooO00o;
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            OooO00o.f48382OooO00o = str;
            oO000Oo0 oo000oo0OooO0o = o00Ooo.OooO0o();
            String value = OooO00o.f48382OooO00o;
            oo000oo0OooO0o.getClass();
            Intrinsics.checkNotNullParameter(value, "value");
            oo000oo0OooO0o.OooO(String.valueOf(-519335272), Base64ExtensionsKt.base64EncodeToString(AESKt.aesEncrypt$default(value, oOO0Oo00.OooO00o(), oO0oO000.f57154OooO00o, (String) null, 4, (Object) null)));
            o000000O.OooO00o();
        }
    }

    static {
        oO000Oo0 oo000oo0OooO0o = o00Ooo.OooO0o();
        oo000oo0OooO0o.getClass();
        String strOooO0o0 = oo000oo0OooO0o.OooO0o0(String.valueOf(-519335272), "");
        f48382OooO00o = StringsKt.isBlank(strOooO0o0) ? "" : new String(AESKt.aesDecrypt$default(strOooO0o0, oOO0Oo00.OooO00o(), oO0oO000.f57154OooO00o, false, null, 12, null), Charsets.UTF_8);
    }

    public static void OooO00o() throws JSONException {
        SmAntiFraud.SmOption smOption = new SmAntiFraud.SmOption();
        smOption.setAppId(NewFriendsOld.State_Default);
        smOption.setUrl(o00000OO.f56660OooO0O0);
        smOption.setConfUrl(o00000OO.f56660OooO0O0 + "/v3/cloudconf");
        oO000Oo0 oo000oo0OooO0o = o00Ooo.OooO0o();
        oo000oo0OooO0o.getClass();
        String strOooO0o0 = oo000oo0OooO0o.OooO0o0(String.valueOf(-1393565468), "CLnvIDFv1ZjXPDbZECh6PCyLN0qs+aR/WKFC5pEv+tY=");
        String strOooO00o = oOO0Oo00.OooO00o();
        byte[] bArr = oO0oO000.f57154OooO00o;
        byte[] bArrAesDecrypt$default = AESKt.aesDecrypt$default(strOooO0o0, strOooO00o, bArr, false, null, 12, null);
        Charset charset = Charsets.UTF_8;
        smOption.setOrganization(new String(bArrAesDecrypt$default, charset));
        oO000Oo0 oo000oo0OooO0o2 = o00Ooo.OooO0o();
        oo000oo0OooO0o2.getClass();
        smOption.setPublicKey(new String(AESKt.aesDecrypt$default(oo000oo0OooO0o2.OooO0o0(String.valueOf(641335589), "eyPc+5wvFgdnk1bOwRe0Z2txsEXOtH1rLfmDQTh8UPsODZ1+a+6gWrL17DKMGrK0Z2jGBHJJxPoNbdGM+uM2y4aiv9ivN2o44o+FrVHA2xU31xGrbZSyqaXzf1/JQWhqaXNqIVopuX+Q6GzB/o1qbLQQpGvNHHxxfFZGxe1+bZ0L3lZV4fK8iX6yydWNoLZC8Akz9QfMkhlnaFQWr+29/Wgq4xMskgYeazQNNTJFXmtKNhG7G/ARl9uQk0D0qjqAfNhVWSUJp6RYSVX3N8jqeaTEjyb2ldZspoN3C6PQgj6tGwwJE4S2InqYEIRNsjX0hend/jvzsqkr2J1rwGAJbEeRm7hoM5YwQdw959hBIhiLTYPI/xCmOf1UjnNDllEsZqHTGGxwoTofHHrpjb+9j8fURt7ykkRvYI/c2xVEuQd9owxilEXo+rirBR/9PAijCVh7gKvDiBC1wj3nvbieRbFAHSroyEOVP6xCWniiU4+iVTW4fvEIBBAg489wPhlq0xixxp6hqQdNQ/vSt/6367XBdU76MHEXBEP8bzlTjpqyUh7DYLlBqI/DcSAEGJQUw7oU0KKLB42UTGiZHM5T/hS/kdh2A4sS7YuyEL9Rbs/ZoFgPfQgC8kkAwNy/dHEqu0qzIAa4cg7TfK4GHiY23nCawchAOZ+dHNnDhtCAm/FTkiVPI91ZX523qZ0kXGmfqL6EhMW/wF8kw94z0M1ocOvCsmRme8q0JlHhe3AwJ4TBCuTYA0TTCToG87m6gj9kt1ixSQChcMi/jOP/oRN+6tlRLHUmzCoIbF1iEBCf/RbRAcGbqxMTl/39DQM9fGUprEx6dvwldBRpl6XfWFF2CGR0OByZrYCimNW9sN4lgczJFdIqEPnXDRjsB55+zj9QdGPNKlOLAZQh8eyNy6M8BXr46lekyiTu229vZ9MRvY3Jprb8MR1hOmLBVVyuFBiPsdHqoH+2KqjSTNeNMK+M5m2MPGlKJhLGouSg1WQwZJeKMqV3svuGPkZRN/JIoWkAhm87o2Lj/zrw2RhXSMlWmtDeYMS/DjNjr50DAzuo2cbs8Fe+H9BE1l0iOwJ5O4Oh42kmEXZF5T314EoXbqsrz0qCwMFjs4rgkP8JOD7y+hhsoxinigVBNqWd6HcCxBRmOJqtE1Wgmw69UVhl18kwU0SS3gxa/fYlGIfxvC0OKMDn3+Vohy4TqFe9jHvPA805c1MfOpnZN5uxSH+IFCu6+DyfNz50N6rEnrmz0ya/1tzSKaMR2usqqyymNboFFXv94L2sN0e1LubK7T1UteGIJIW4ekik/CGToQnJo7lKoIQQkd4+L+BsLR/CLMAFYmNRrUxlQiZeRV3lkecmPqU7wNrHlrxIN1u9ZptSTDfx8TZIaDaV5JFauZWs9XjS65IbosxD9zTF9vo6+q+PXin0QoQZ+TDhkySxJWK0yTGZAx+IHuSSpfgi20TXtBT1Tkzk"), oOO0Oo00.OooO00o(), bArr, false, null, 12, null), charset));
        smOption.setCheckCrt(false);
        smOption.setCloudConf(false);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("platform", 2);
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        jSONObject.put("id", String.valueOf(o0O00oO0.OooOOo0().getValue()));
        jSONObject.put("idx", String.valueOf(o0O00oO0.OooOOo().getValue()));
        jSONObject.put("businessDeviceId", o000000.OooO00o());
        smOption.setExtraInfo(jSONObject.toString());
        smOption.setServerIdCallback(new C0459OooO00o(jSONObject));
        SmAntiFraud.create(o000O00O.OooO00o(), smOption);
    }
}
