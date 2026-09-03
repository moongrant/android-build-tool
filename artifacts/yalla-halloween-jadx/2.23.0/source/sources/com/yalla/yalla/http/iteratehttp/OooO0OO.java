package com.yalla.yalla.http.iteratehttp;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import androidx.camera.core.impl.OooOOOO;
import com.code.android.util.OooOo00;
import com.common.support.crypto.AESKt;
import com.common.support.crypto.Base64ExtensionsKt;
import com.common.support.crypto.RSAKt;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.yalla.yalla.model.http.ApiError;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import p037OoooOo0.o000Oo0;
import p382o0OOoo0o.o00Ooo;
import p382o0OOoo0o.o0OoOo0;
import p382o0OOoo0o.oo000o;
import p421o0OoO0Oo.o00000;
import p421o0OoO0Oo.o000000O;
import p421o0OoO0Oo.o00000O0;
import p431o0OoOOOO.oo0O;
import p519o0o0O0oO.O0000000;
import p519o0o0O0oO.o0O00O0o;
import p579o0oOoo.oO000Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0OO {

    @Deprecated
    public interface OooO00o {
        void OooO00o();

        void OooO0O0(String str, String str2);

        void OooO0OO();

        void OooO0Oo();

        O0000000 OooO0o();

        void OooO0o0(String str);

        boolean OooO0oO();
    }

    public static void OooO00o(o00000 o00000Var, Map<String, String> map) {
        String strOooO0OO = oO000Oo.OooO0OO();
        String string = "";
        String strReplace = RSAKt.rsaEncrypt(strOooO0OO, oO000Oo.OooO0O0("K1")).replace("\n", "");
        String strOooO0OO2 = oO000Oo.OooO0OO();
        long jCurrentTimeMillis = (System.currentTimeMillis() / 1000) + o0OoOo0.f44300OooO00o;
        if (!OooOo00.OooO00o(map)) {
            ArrayList arrayList = new ArrayList(map.entrySet());
            Collections.sort(arrayList, new com.yalla.yalla.http.iteratehttp.OooO0O0());
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < arrayList.size(); i++) {
                Map.Entry entry = (Map.Entry) arrayList.get(i);
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                sb.append(str);
                sb.append("=");
                sb.append(str2);
                if (i != arrayList.size() - 1) {
                    sb.append("&");
                }
            }
            string = sb.toString();
        }
        StringBuilder sbOooO0O0 = o000Oo0.OooO0O0(oo0O.OooO0O0(string), "|");
        sbOooO0O0.append(oo000o.OooO00o());
        sbOooO0O0.append("|");
        sbOooO0O0.append(jCurrentTimeMillis);
        sbOooO0O0.append("|");
        sbOooO0O0.append(strOooO0OO2);
        sbOooO0O0.append("|");
        sbOooO0O0.append(o00Ooo.OooO0OO());
        String string2 = sbOooO0O0.toString();
        String strBase64EncodeToString = Base64ExtensionsKt.base64EncodeToString(AESKt.aesEncrypt(string2, strOooO0OO, oO000Oo.OooO0O0("IV").getBytes(StandardCharsets.UTF_8), "AES/CBC/PKCS7Padding"));
        o00000Var.OooO00o("bf", strReplace);
        o00000Var.OooO00o("timestamp", String.valueOf(jCurrentTimeMillis));
        o00000Var.OooO00o("nonce", strOooO0OO2);
        o00000Var.OooO00o(DeviceRequestsHelper.DEVICE_INFO_DEVICE, oo000o.OooO00o());
        o00000Var.OooO00o("sign", strBase64EncodeToString);
        for (Map.Entry<String, String> entry2 : o00Ooo.OooO00o(string2).headers().entrySet()) {
            o00000Var.OooO00o(entry2.getKey(), entry2.getValue());
        }
    }

    public static void OooO0O0(String str, List list, String str2, LinkedHashMap linkedHashMap, OooO00o oooO00o) {
        if (oooO00o != null) {
            oooO00o.OooO00o();
        }
        if (list.size() < 1) {
            return;
        }
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            map.put((String) it.next(), Boolean.FALSE);
        }
        String str3 = (String) list.get(0);
        map.put(str3, Boolean.TRUE);
        o000000O o000000o2 = new o000000O();
        o000000o2.f45565OooO0O0 = str;
        o000000o2.f45564OooO00o = OooOOOO.OooO00o(str3, str2);
        o000000o2.f45567OooO0Oo = linkedHashMap;
        OooO00o(o000000o2, linkedHashMap);
        o000000o2.OooO0O0().OooO00o(new com.yalla.yalla.http.iteratehttp.OooO00o(o000000o2, map, str2, oooO00o));
    }

    public static void OooO0OO(List list, String str, LinkedHashMap linkedHashMap, OooO00o oooO00o) {
        if (oooO00o != null) {
            oooO00o.OooO00o();
        }
        if (list.size() < 1) {
            return;
        }
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            map.put((String) it.next(), Boolean.FALSE);
        }
        String str2 = (String) list.get(0);
        map.put(str2, Boolean.TRUE);
        o00000O0 o00000o1 = new o00000O0();
        o00000o1.f45565OooO0O0 = null;
        o00000o1.f45564OooO00o = OooOOOO.OooO00o(str2, str);
        o00000o1.f45567OooO0Oo = linkedHashMap;
        OooO00o(o00000o1, linkedHashMap);
        o00000o1.OooO0O0().OooO00o(new com.yalla.yalla.http.iteratehttp.OooO00o(o00000o1, map, str, oooO00o));
    }

    public static class OooO0O0 implements OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Deprecated
        public final Context f23394OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public boolean f23395OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public String f23396OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @Deprecated
        public final O0000000 f23397OooO0Oo;

        public OooO0O0(Context context) {
            this.f23395OooO0O0 = false;
            this.f23396OooO0OO = "";
            this.f23394OooO00o = context;
            if (this.f23397OooO0Oo == null) {
                o0O00O0o.OooO00o().getClass();
                this.f23397OooO0Oo = new O0000000();
            }
        }

        @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
        public final void OooO00o() {
            Context context;
            if (!this.f23395OooO0O0 || (context = this.f23394OooO00o) == null || !(context instanceof Activity) || ((Activity) context).isFinishing()) {
                return;
            }
            this.f23397OooO0Oo.OooO0OO(context, this.f23396OooO0OO);
        }

        @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
        public void OooO0O0(String str, String str2) {
            if (TextUtils.isEmpty(str)) {
                str = AppEventsConstants.EVENT_PARAM_VALUE_NO;
            }
            int i = Integer.parseInt(str);
            if (str2 == null) {
                str2 = "";
            }
            ApiError error = new ApiError(i, str2, "");
            Intrinsics.checkNotNullParameter(error, "error");
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new p375o0OOoOO.o00000O0(error, null), 3, null);
        }

        @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
        public final void OooO0OO() {
        }

        @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
        public final void OooO0Oo() {
            Context context;
            if (!this.f23395OooO0O0 || (context = this.f23394OooO00o) == null || !(context instanceof Activity) || ((Activity) context).isFinishing()) {
                return;
            }
            this.f23397OooO0Oo.OooO00o();
        }

        @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
        public final O0000000 OooO0o() {
            return this.f23397OooO0Oo;
        }

        @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
        public void OooO0o0(String str) {
        }

        @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
        public final boolean OooO0oO() {
            return this.f23395OooO0O0;
        }

        public OooO0O0() {
            this.f23395OooO0O0 = false;
            this.f23396OooO0OO = "";
            this.f23394OooO00o = com.code.android.util.OooO0O0.OooO0O0();
            if (this.f23397OooO0Oo == null) {
                o0O00O0o.OooO00o().getClass();
                this.f23397OooO0Oo = new O0000000();
            }
        }
    }
}
