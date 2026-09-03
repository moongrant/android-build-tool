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
import p037OoooOo0.o000O0o;
import p381o0OOoOo0.Oooo000;
import p386o0OOooO.o000000;
import p386o0OOooO.o0OOO0o;
import p386o0OOooO.oo0o0Oo;
import p427o0OoO0oO.o00OOO0;
import p427o0OoO0oO.o00OOO0O;
import p427o0OoO0oO.o0o0Oo;
import p437o0OoOOo0.o000O;
import p590o0oOooo0.oOO0Oo00;
import p650o0ooo.a;
import p650o0ooo.o00O0OO0;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0OO {

    @Deprecated
    public interface OooO00o {
        void OooO00o();

        void OooO0O0(String str, String str2);

        void OooO0OO();

        void OooO0Oo();

        a OooO0o();

        void OooO0o0(String str);

        boolean OooO0oO();
    }

    public static void OooO00o(o00OOO0O o00ooo0o2, Map<String, String> map) {
        String strOooO0OO = oOO0Oo00.OooO0OO();
        String string = "";
        String strReplace = RSAKt.rsaEncrypt(strOooO0OO, oOO0Oo00.OooO0O0("K1")).replace("\n", "");
        String strOooO0OO2 = oOO0Oo00.OooO0OO();
        long jCurrentTimeMillis = (System.currentTimeMillis() / 1000) + o0OOO0o.f43499OooO00o;
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
        StringBuilder sbOooO0O0 = o000O0o.OooO0O0(o000O.OooO0O0(string), "|");
        sbOooO0O0.append(o000000.OooO00o());
        sbOooO0O0.append("|");
        sbOooO0O0.append(jCurrentTimeMillis);
        sbOooO0O0.append("|");
        sbOooO0O0.append(strOooO0OO2);
        sbOooO0O0.append("|");
        sbOooO0O0.append(oo0o0Oo.OooO0OO());
        String string2 = sbOooO0O0.toString();
        String strBase64EncodeToString = Base64ExtensionsKt.base64EncodeToString(AESKt.aesEncrypt(string2, strOooO0OO, oOO0Oo00.OooO0O0("IV").getBytes(StandardCharsets.UTF_8), "AES/CBC/PKCS7Padding"));
        o00ooo0o2.OooO00o("bf", strReplace);
        o00ooo0o2.OooO00o("timestamp", String.valueOf(jCurrentTimeMillis));
        o00ooo0o2.OooO00o("nonce", strOooO0OO2);
        o00ooo0o2.OooO00o(DeviceRequestsHelper.DEVICE_INFO_DEVICE, o000000.OooO00o());
        o00ooo0o2.OooO00o("sign", strBase64EncodeToString);
        for (Map.Entry<String, String> entry2 : oo0o0Oo.OooO00o(string2).headers().entrySet()) {
            o00ooo0o2.OooO00o(entry2.getKey(), entry2.getValue());
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
        o00OOO0 o00ooo1 = new o00OOO0();
        o00ooo1.f46765OooO0O0 = str;
        o00ooo1.f46764OooO00o = OooOOOO.OooO00o(str3, str2);
        o00ooo1.f46767OooO0Oo = linkedHashMap;
        OooO00o(o00ooo1, linkedHashMap);
        o00ooo1.OooO0O0().OooO00o(new com.yalla.yalla.http.iteratehttp.OooO00o(o00ooo1, map, str2, oooO00o));
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
        o0o0Oo o0o0oo = new o0o0Oo();
        o0o0oo.f46765OooO0O0 = null;
        o0o0oo.f46764OooO00o = OooOOOO.OooO00o(str2, str);
        o0o0oo.f46767OooO0Oo = linkedHashMap;
        OooO00o(o0o0oo, linkedHashMap);
        o0o0oo.OooO0O0().OooO00o(new com.yalla.yalla.http.iteratehttp.OooO00o(o0o0oo, map, str, oooO00o));
    }

    public static class OooO0O0 implements OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Deprecated
        public final Context f22925OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public boolean f22926OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public String f22927OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @Deprecated
        public final a f22928OooO0Oo;

        public OooO0O0(Context context) {
            this.f22926OooO0O0 = false;
            this.f22927OooO0OO = "";
            this.f22925OooO00o = context;
            if (this.f22928OooO0Oo == null) {
                o00O0OO0.OooO00o().getClass();
                this.f22928OooO0Oo = new a();
            }
        }

        @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
        public final void OooO00o() {
            Context context;
            if (!this.f22926OooO0O0 || (context = this.f22925OooO00o) == null || !(context instanceof Activity) || ((Activity) context).isFinishing()) {
                return;
            }
            this.f22928OooO0Oo.OooO0OO(context, this.f22927OooO0OO);
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
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new Oooo000(error, null), 3, null);
        }

        @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
        public final void OooO0OO() {
        }

        @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
        public final void OooO0Oo() {
            Context context;
            if (!this.f22926OooO0O0 || (context = this.f22925OooO00o) == null || !(context instanceof Activity) || ((Activity) context).isFinishing()) {
                return;
            }
            this.f22928OooO0Oo.OooO00o();
        }

        @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
        public final a OooO0o() {
            return this.f22928OooO0Oo;
        }

        @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
        public void OooO0o0(String str) {
        }

        @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
        public final boolean OooO0oO() {
            return this.f22926OooO0O0;
        }

        public OooO0O0() {
            this.f22926OooO0O0 = false;
            this.f22927OooO0OO = "";
            this.f22925OooO00o = com.code.android.util.OooO0O0.OooO0O0();
            if (this.f22928OooO0Oo == null) {
                o00O0OO0.OooO00o().getClass();
                this.f22928OooO0Oo = new a();
            }
        }
    }
}
