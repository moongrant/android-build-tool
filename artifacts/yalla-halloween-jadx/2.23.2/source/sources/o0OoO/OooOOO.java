package o0OoO;

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
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p641o0ooOO0o.o0O000Oo;
import p641o0ooOO0o.o0O00O0o;
import p641o0ooOO0o.o0O00o00;
import p641o0ooOO0o.o0O00oO0;
import p641o0ooOO0o.o0O0O0O;
import p641o0ooOO0o.o0OoOoOo;
import p654o0ooo00o.o000O;
import p662o0oooO0O.o0O0o0;
import p662o0oooO0O.oo0OOoo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class OooOOO implements o0OoOoOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Charset f46611OooO00o = Charset.forName("UTF-8");

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
                    if (StringsKt__StringsJVMKt.equals(next, "pageindex", true) || StringsKt__StringsJVMKt.equals(next, "index", true) || StringsKt__StringsJVMKt.equals(next, "pagesize", true) || StringsKt__StringsJVMKt.equals(next, "datasort", true)) {
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
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            return string2;
        }
    }

    @Override // p641o0ooOO0o.o0OoOoOo
    @NotNull
    public final o0O00o00 intercept(@NotNull o0OoOoOo.OooO00o chain) throws JSONException, IOException {
        String strOooO00o;
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
            strOooO00o = "";
        } else {
            Intrinsics.checkNotNull(o0o00oo1);
            o0O0o0 o0o0o0OooOOo = o0o00oo1.OooOOo();
            o0o0o0OooOOo.request(LongCompanionObject.MAX_VALUE);
            try {
                oo0OOoo oo0ooooClone = o0o0o0OooOOo.OooO0O0().clone();
                Charset charset = this.f46611OooO00o;
                Intrinsics.checkNotNullExpressionValue(charset, "charset");
                strOooO00o = oo0ooooClone.o000000o(charset);
            } catch (IOException unused) {
                strOooO00o = p187o00o00o0.OooO.OooO00o(new ApiError(1, "", null, 4, null));
            }
        }
        String strOooO0O1 = o0o00o0o.OooO0O0("Abnormal");
        String strOooO00o2 = OooO00o.OooO00o(strOooO00o, strOooO0O1 != null ? Boolean.parseBoolean(strOooO0O1) : false);
        Pattern pattern = o0O000Oo.f57807OooO0o0;
        o0O0O0O o0o0o0oOooO00o = o0O00oO0.OooO0O0.OooO00o(strOooO00o2, o0O000Oo.OooO00o.OooO00o("text/plain; charset=utf-8"));
        o0O00o00.OooO00o oooO00o = new o0O00o00.OooO00o(o0o00o00OooO0OO);
        oooO00o.f57867OooO0oO = o0o0o0oOooO00o;
        return oooO00o.OooO00o();
    }
}
