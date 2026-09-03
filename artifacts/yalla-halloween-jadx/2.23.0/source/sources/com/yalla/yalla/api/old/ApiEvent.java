package com.yalla.yalla.api.old;

import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.facebook.internal.ServerProtocol;
import com.yalla.yalla.data.constant.FeedbackType;
import com.yalla.yalla.http.iteratehttp.OooO0OO;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.LinkedHashMap;
import p377o0OOoOo.o0000O;
import p377o0OOoOo.o000OO;
import p382o0OOoo0o.o00Ooo;
import p382o0OOoo0o.oo000o;
import p579o0oOoo.oO000Oo0;
import p640o0ooOOO0.oO00o000;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class ApiEvent {

    @Retention(RetentionPolicy.SOURCE)
    public @interface EventType {
        public static final int AppLoginFacebook = 2;
        public static final int AppLoginInstagram = 4;
        public static final int AppLoginPhone = 1;
        public static final int AppLoginTwitter = 3;
        public static final int AppLoginWechat = 5;
        public static final int AppLoginYallaChat = 7;
    }

    public class OooO00o extends OooO0OO.OooO0O0 {
        @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
        public final void OooO0O0(String str, String str2) {
            super.OooO0O0(str, str2);
        }

        @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
        public final void OooO0o0(String str) {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Step {
        public static final int AppFirstStart = 1;
        public static final int LoginEntry = 20;
        public static final int LoginToHomePage = 10;
        public static final int PhoneInputPgae = 30;
        public static final int PhoneLoginRegister = 40;
        public static final int SetPassword = 60;
        public static final int SignCode = 50;
        public static final int SignUpSuccess = 70;
    }

    public static void OooO00o(int i) {
        LinkedHashMap linkedHashMapOooO00o = oO00o000.OooO00o();
        linkedHashMapOooO00o.put("eventType", "1");
        linkedHashMapOooO00o.put("step", "" + i);
        OooO0O0(linkedHashMapOooO00o);
    }

    public static void OooO0O0(LinkedHashMap linkedHashMap) {
        linkedHashMap.put(DeviceRequestsHelper.DEVICE_INFO_DEVICE, oo000o.OooO00o());
        linkedHashMap.put(ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION, o00Ooo.OooO0Oo());
        linkedHashMap.put("sources", FeedbackType.Suggestions);
        linkedHashMap.put("phoneversion", oo000o.OooO0Oo());
        linkedHashMap.put("phoneBrand", oO000Oo0.OooO0O0(oo000o.OooO0O0()));
        linkedHashMap.put("phoneType", oO000Oo0.OooO0O0(oo000o.OooO0OO()));
        OooO0OO.OooO0O0(null, o0000O.f44100OooOoo, o0000O.f44144o00000oO, linkedHashMap, new o000OO());
    }

    public static void OooO0OO(int i) {
        LinkedHashMap linkedHashMapOooO00o = oO00o000.OooO00o();
        linkedHashMapOooO00o.put("eventType", "" + i);
        linkedHashMapOooO00o.put("step", "20");
        linkedHashMapOooO00o.put(DeviceRequestsHelper.DEVICE_INFO_DEVICE, oo000o.OooO00o());
        linkedHashMapOooO00o.put(ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION, o00Ooo.OooO0Oo());
        linkedHashMapOooO00o.put("sources", FeedbackType.Suggestions);
        linkedHashMapOooO00o.put("phoneversion", oo000o.OooO0Oo());
        linkedHashMapOooO00o.put("phoneBrand", oO000Oo0.OooO0O0(oo000o.OooO0O0()));
        linkedHashMapOooO00o.put("phoneType", oO000Oo0.OooO0O0(oo000o.OooO0OO()));
        OooO0OO.OooO0O0(null, o0000O.f44100OooOoo, o0000O.f44144o00000oO, linkedHashMapOooO00o, new OooO00o());
    }
}
