package p424o0OoO0oO;

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
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p382o0OOoo0o.o00Ooo;
import p382o0OOoo0o.o0OoOo0;
import p382o0OOoo0o.oo000o;
import p431o0OoOOOO.oo0O;
import p579o0oOoo.o0o0000;
import p579o0oOoo.oO000Oo;
import p592o0oo00O.OooOOO0;
import p634o0ooO0oO.o00OO;
import p634o0ooO0oO.o00OO0O0;
import p634o0ooO0oO.o00OOO00;
import p634o0ooO0oO.o00OOOOo;
import p634o0ooO0oO.o0oOOo;
import p634o0ooO0oO.oo00oO;
import p647o0ooOooo.nc;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nApiHeaderInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ApiHeaderInterceptor.kt\ncom/yalla/yalla/http/interceptor/ApiHeaderInterceptor\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,110:1\n215#2,2:111\n1855#3,2:113\n*S KotlinDebug\n*F\n+ 1 ApiHeaderInterceptor.kt\ncom/yalla/yalla/http/interceptor/ApiHeaderInterceptor\n*L\n60#1:111,2\n70#1:113,2\n*E\n"})
public final class o0000oo implements o00OOO00 {
    @Override // p634o0ooO0oO.o00OOO00
    @NotNull
    public final o0oOOo intercept(@NotNull o00OOO00.OooO00o chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        nc ncVar = (nc) chain;
        o00OOOOo o00ooooo2 = ncVar.f59720OooO0o0;
        if (Intrinsics.areEqual(o00ooooo2.OooO0O0("Custom"), ServerProtocol.DIALOG_RETURN_SCOPES_TRUE)) {
            return ncVar.OooO0O0(o00ooooo2);
        }
        o00OOOOo.OooO00o oooO00o = new o00OOOOo.OooO00o(o00ooooo2);
        HashMap map = new HashMap();
        String str = o00ooooo2.f57314OooO0O0;
        boolean zOooOO0o = StringsKt.OooOO0o(str, "GET");
        String string = "";
        o00OO o00oo2 = o00ooooo2.f57313OooO00o;
        if (zOooOO0o) {
            for (String str2 : o00oo2.OooO0oo()) {
                String strOooO0oO = o00oo2.OooO0oO(str2);
                if (strOooO0oO == null) {
                    strOooO0oO = "";
                }
                map.put(str2, strOooO0oO);
            }
        } else if (StringsKt.OooOO0o(str, "POST")) {
            oo00oO oo00oo = o00ooooo2.f57316OooO0Oo;
            Intrinsics.checkNotNull(oo00oo, "null cannot be cast to non-null type okhttp3.FormBody");
            o00OO0O0 o00oo0o1 = (o00OO0O0) oo00oo;
            int size = o00oo0o1.f57222OooO00o.size();
            for (int i = 0; i < size; i++) {
                map.put(o00OO.OooO0O0.OooO0Oo(o00oo0o1.f57222OooO00o.get(i), 0, 0, true, 3), o00oo0o1.OooO00o(i));
            }
        }
        String strOooO0OO = oO000Oo.OooO0OO();
        String strOooOoO = StringsKt.OooOoO(RSAKt.rsaEncrypt(strOooO0OO, oO000Oo.OooO0O0("K1")), "\n", "");
        String strOooO0OO2 = oO000Oo.OooO0OO();
        long jCurrentTimeMillis = o0OoOo0.f44300OooO00o + (System.currentTimeMillis() / ((long) 1000));
        if (!OooOo00.OooO00o(map)) {
            ArrayList arrayList = new ArrayList(map.entrySet());
            final o0000O00 o0000o00 = o0000O00.f45575OooO0Oo;
            Collections.sort(arrayList, new Comparator() { // from class: o0OoO0oO.o0000
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    Function2 tmp0 = o0000o00;
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
            Intrinsics.checkNotNullExpressionValue(string, "sb.toString()");
        }
        if (o00Ooo.OooO0o0() && string.length() > 200) {
            OooOOO0.OooO0OO("ApiHeaderInterceptor", "sortParam url = " + o00oo2 + ", sortParam = " + string);
        }
        String str5 = oo0O.OooO0O0(string) + "|" + oo000o.OooO00o() + "|" + jCurrentTimeMillis + "|" + strOooO0OO2 + "|" + o00Ooo.OooO0OO();
        String strBase64EncodeToString = Base64ExtensionsKt.base64EncodeToString(AESKt.aesEncrypt$default(str5, strOooO0OO, o0o0000.f56518OooO00o, (String) null, 4, (Object) null));
        o0ooO0oO.oo0O.OooO00o oooO00oOooO0Oo = o00ooooo2.f57315OooO0OO.OooO0Oo();
        oooO00oOooO0Oo.OooO00o("Connection", "close");
        oooO00oOooO0Oo.OooO00o("bf", strOooOoO);
        oooO00oOooO0Oo.OooO00o("timestamp", String.valueOf(jCurrentTimeMillis));
        oooO00oOooO0Oo.OooO00o("nonce", strOooO0OO2);
        oooO00oOooO0Oo.OooO00o(DeviceRequestsHelper.DEVICE_INFO_DEVICE, oo000o.OooO00o());
        oooO00oOooO0Oo.OooO00o("sign", strBase64EncodeToString);
        oooO00oOooO0Oo.OooO00o("appver", o00Ooo.OooO0Oo());
        for (Map.Entry<String, String> entry2 : o00Ooo.OooO00o(str5).headers().entrySet()) {
            oooO00oOooO0Oo.OooO00o(entry2.getKey(), entry2.getValue());
        }
        oooO00o.OooO0o0(oooO00oOooO0Oo.OooO0OO());
        return ncVar.OooO0O0(oooO00o.OooO0O0());
    }
}
