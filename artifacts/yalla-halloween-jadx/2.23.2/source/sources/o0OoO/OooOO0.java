package o0OoO;

import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.OooOo00;
import com.common.support.crypto.AESKt;
import com.common.support.crypto.Base64ExtensionsKt;
import com.common.support.crypto.RSAKt;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.facebook.internal.ServerProtocol;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import p386o0OOooO.o000000;
import p386o0OOooO.o0OOO0o;
import p386o0OOooO.oo0o0Oo;
import p590o0oOooo0.oO0oO000;
import p590o0oOooo0.oOO0Oo00;
import p598o0oo00Oo.o0000O00;
import p641o0ooOO0o.o0O000;
import p641o0ooOO0o.o0O00000;
import p641o0ooOO0o.o0O000O;
import p641o0ooOO0o.o0O00O0o;
import p641o0ooOO0o.o0O00o00;
import p641o0ooOO0o.o0OoOoOo;
import p641o0ooOO0o.o0oO0Ooo;
import p654o0ooo00o.o000O;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nApiHeaderInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ApiHeaderInterceptor.kt\ncom/yalla/yalla/http/interceptor/ApiHeaderInterceptor\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,110:1\n215#2,2:111\n1855#3,2:113\n*S KotlinDebug\n*F\n+ 1 ApiHeaderInterceptor.kt\ncom/yalla/yalla/http/interceptor/ApiHeaderInterceptor\n*L\n60#1:111,2\n70#1:113,2\n*E\n"})
public final class OooOO0 implements o0OoOoOo {
    @Override // p641o0ooOO0o.o0OoOoOo
    @NotNull
    public final o0O00o00 intercept(@NotNull o0OoOoOo.OooO00o chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        o000O o000o = (o000O) chain;
        o0O00O0o o0o00o0o = o000o.f59401OooO0o0;
        if (Intrinsics.areEqual(o0o00o0o.OooO0O0("Custom"), ServerProtocol.DIALOG_RETURN_SCOPES_TRUE)) {
            return o000o.OooO0OO(o0o00o0o);
        }
        o0O00O0o.OooO00o oooO00o = new o0O00O0o.OooO00o(o0o00o0o);
        HashMap map = new HashMap();
        String str = o0o00o0o.f57829OooO0O0;
        boolean zEquals = StringsKt__StringsJVMKt.equals(str, "GET", true);
        String string = "";
        o0O000O o0o000o = o0o00o0o.f57828OooO00o;
        if (zEquals) {
            for (String str2 : o0o000o.OooO0oo()) {
                String strOooO0oO = o0o000o.OooO0oO(str2);
                if (strOooO0oO == null) {
                    strOooO0oO = "";
                }
                map.put(str2, strOooO0oO);
            }
        } else if (StringsKt__StringsJVMKt.equals(str, "POST", true)) {
            o0oO0Ooo o0oo0ooo2 = o0o00o0o.f57831OooO0Oo;
            Intrinsics.checkNotNull(o0oo0ooo2, "null cannot be cast to non-null type okhttp3.FormBody");
            o0O00000 o0o00000 = (o0O00000) o0oo0ooo2;
            int size = o0o00000.f57776OooO00o.size();
            for (int i = 0; i < size; i++) {
                map.put(o0O000O.OooO0O0.OooO0Oo(o0o00000.f57776OooO00o.get(i), 0, 0, true, 3), o0o00000.OooO00o(i));
            }
        }
        String strOooO0OO = oOO0Oo00.OooO0OO();
        String strReplace$default = StringsKt__StringsJVMKt.replace$default(RSAKt.rsaEncrypt(strOooO0OO, oOO0Oo00.OooO0O0("K1")), "\n", "", false, 4, (Object) null);
        String strOooO0OO2 = oOO0Oo00.OooO0OO();
        long jCurrentTimeMillis = o0OOO0o.f43499OooO00o + (System.currentTimeMillis() / ((long) 1000));
        if (!OooOo00.OooO00o(map)) {
            ArrayList arrayList = new ArrayList(map.entrySet());
            final OooO oooO = OooO.f46605OooO0Oo;
            Collections.sort(arrayList, new Comparator() { // from class: o0OoO.OooO0o
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    Function2 tmp0 = oooO;
                    Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                    return ((Number) tmp0.invoke(obj, obj2)).intValue();
                }
            });
            StringBuilder sb = new StringBuilder();
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                Map.Entry entry = (Map.Entry) arrayList.get(i2);
                String str3 = (String) entry.getKey();
                String str4 = (String) entry.getValue();
                sb.append(str3);
                sb.append("=");
                sb.append(str4);
                if (i2 != arrayList.size() - 1) {
                    sb.append("&");
                }
            }
            string = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        }
        if (oo0o0Oo.OooO0o0() && string.length() > 200) {
            o0000O00.OooO0OO("ApiHeaderInterceptor", "sortParam url = " + o0o000o + ", sortParam = " + string);
        }
        String str5 = p437o0OoOOo0.o000O.OooO0O0(string) + "|" + o000000.OooO00o() + "|" + jCurrentTimeMillis + "|" + strOooO0OO2 + "|" + oo0o0Oo.OooO0OO();
        String strBase64EncodeToString = Base64ExtensionsKt.base64EncodeToString(AESKt.aesEncrypt$default(str5, strOooO0OO, oO0oO000.f57154OooO00o, (String) null, 4, (Object) null));
        o0O000.OooO00o oooO00oOooO0Oo = o0o00o0o.f57830OooO0OO.OooO0Oo();
        oooO00oOooO0Oo.OooO00o("Connection", "close");
        oooO00oOooO0Oo.OooO00o("bf", strReplace$default);
        oooO00oOooO0Oo.OooO00o("timestamp", String.valueOf(jCurrentTimeMillis));
        oooO00oOooO0Oo.OooO00o("nonce", strOooO0OO2);
        oooO00oOooO0Oo.OooO00o(DeviceRequestsHelper.DEVICE_INFO_DEVICE, o000000.OooO00o());
        oooO00oOooO0Oo.OooO00o("sign", strBase64EncodeToString);
        oooO00oOooO0Oo.OooO00o("appver", oo0o0Oo.OooO0Oo());
        for (Map.Entry<String, String> entry2 : oo0o0Oo.OooO00o(str5).headers().entrySet()) {
            oooO00oOooO0Oo.OooO00o(entry2.getKey(), entry2.getValue());
        }
        oooO00o.OooO0o0(oooO00oOooO0Oo.OooO0OO());
        return o000o.OooO0OO(oooO00o.OooO0O0());
    }
}
