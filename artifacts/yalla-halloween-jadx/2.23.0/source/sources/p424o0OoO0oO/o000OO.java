package p424o0OoO0oO;

import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.internal.ServerProtocol;
import com.facebook.share.internal.ShareConstants;
import com.yalla.yalla.model.http.ApiError;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p140o00OOooo.OooOO0;
import p634o0ooO0oO.o0;
import p634o0ooO0oO.o00OOO0;
import p634o0ooO0oO.o00OOO00;
import p634o0ooO0oO.o00OOOOo;
import p634o0ooO0oO.o0O0o;
import p634o0ooO0oO.o0oOOo;
import p647o0ooOooo.nc;
import p659o0oooO00.o0000;
import p659o0oooO00.o00000O;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o000OO implements o00OOO00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Charset f45576OooO00o = Charset.forName("UTF-8");

    public static final class OooO00o {
        @NotNull
        public static String OooO00o(@NotNull String string, boolean z) throws JSONException {
            Intrinsics.checkNotNullParameter(string, "string");
            JSONObject jSONObject = new JSONObject(string);
            JSONObject jSONObject2 = new JSONObject();
            if (!jSONObject.has("page")) {
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (StringsKt.OooOO0o(next, "pageindex") || StringsKt.OooOO0o(next, "index") || StringsKt.OooOO0o(next, "pagesize") || StringsKt.OooOO0o(next, "datasort")) {
                        jSONObject2.put(next, jSONObject.get(next));
                        itKeys.remove();
                    }
                }
            }
            if (jSONObject2.length() > 0) {
                jSONObject.put("page", jSONObject2);
            }
            if (!Intrinsics.areEqual(jSONObject.get("code"), "1000") && !Intrinsics.areEqual(jSONObject.get("code"), (Object) 1000)) {
                JSONObject jSONObject3 = new JSONObject();
                if (jSONObject.has("data")) {
                    jSONObject3.put("data", jSONObject.get("data"));
                    jSONObject.remove("data");
                }
                if (jSONObject.has(ShareConstants.WEB_DIALOG_PARAM_MESSAGE)) {
                    jSONObject3.put(ShareConstants.WEB_DIALOG_PARAM_MESSAGE, jSONObject.get(ShareConstants.WEB_DIALOG_PARAM_MESSAGE));
                }
                Iterator<String> itKeys2 = jSONObject.keys();
                while (itKeys2.hasNext()) {
                    String next2 = itKeys2.next();
                    if (!Intrinsics.areEqual(next2, "code") && !Intrinsics.areEqual(next2, "page")) {
                        jSONObject3.put(next2, jSONObject.get(next2));
                        itKeys2.remove();
                    }
                }
                if (jSONObject3.length() > 0) {
                    jSONObject.put(ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "\"" + jSONObject3 + "\"");
                }
            } else if (z) {
                JSONObject jSONObject4 = new JSONObject();
                Iterator<String> itKeys3 = jSONObject.keys();
                while (itKeys3.hasNext()) {
                    String next3 = itKeys3.next();
                    if (!Intrinsics.areEqual(next3, "code") && !Intrinsics.areEqual(next3, ShareConstants.WEB_DIALOG_PARAM_MESSAGE) && !Intrinsics.areEqual(next3, "page")) {
                        jSONObject4.put(next3, jSONObject.get(next3));
                        itKeys3.remove();
                    }
                }
                if (jSONObject4.length() > 0) {
                    jSONObject.put("data", jSONObject4);
                }
            }
            String string2 = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "jsonObject.toString()");
            return string2;
        }
    }

    @Override // p634o0ooO0oO.o00OOO00
    @NotNull
    public final o0oOOo intercept(@NotNull o00OOO00.OooO00o chain) throws JSONException, IOException {
        String strOooO00o;
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
            strOooO00o = "";
        } else {
            Intrinsics.checkNotNull(o0o0o);
            o0000 o0000VarOooOOo0 = o0o0o.OooOOo0();
            o0000VarOooOOo0.request(LongCompanionObject.MAX_VALUE);
            try {
                o00000O o00000oClone = o0000VarOooOOo0.OooO0O0().clone();
                Charset charset = this.f45576OooO00o;
                Intrinsics.checkNotNullExpressionValue(charset, "charset");
                strOooO00o = o00000oClone.o000000(charset);
            } catch (IOException unused) {
                strOooO00o = OooOO0.OooO00o(new ApiError(1, "", null, 4, null));
            }
        }
        String strOooO0O1 = o00ooooo2.OooO0O0("Abnormal");
        String strOooO00o2 = OooO00o.OooO00o(strOooO00o, strOooO0O1 != null ? Boolean.parseBoolean(strOooO0O1) : false);
        Pattern pattern = o00OOO0.f57234OooO0o0;
        o0 o0VarOooO00o = o0O0o.OooO0O0.OooO00o(strOooO00o2, o00OOO0.OooO00o.OooO00o("text/plain; charset=utf-8"));
        o0oOOo.OooO00o oooO00o = new o0oOOo.OooO00o(o0ooooOooO0O0);
        oooO00o.f57362OooO0oO = o0VarOooO00o;
        return oooO00o.OooO00o();
    }
}
