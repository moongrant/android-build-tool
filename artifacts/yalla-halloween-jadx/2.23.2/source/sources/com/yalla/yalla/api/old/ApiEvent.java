package com.yalla.yalla.api.old;

import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.facebook.internal.ServerProtocol;
import com.yalla.yalla.data.constant.FeedbackType;
import com.yalla.yalla.http.iteratehttp.OooO0OO;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.LinkedHashMap;
import p384o0OOoo0O.Oooo0;
import p384o0OOoo0O.Oooo000;
import p386o0OOooO.o000000;
import p386o0OOooO.oo0o0Oo;
import p426o0OoO0o0.OooOOOO;
import p590o0oOooo0.oOO0OOO;

/* JADX INFO: loaded from: classes3.dex */
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
        LinkedHashMap linkedHashMapOooO00o = OooOOOO.OooO00o();
        linkedHashMapOooO00o.put("eventType", "1");
        linkedHashMapOooO00o.put("step", "" + i);
        OooO0O0(linkedHashMapOooO00o);
    }

    public static void OooO0O0(LinkedHashMap linkedHashMap) {
        linkedHashMap.put(DeviceRequestsHelper.DEVICE_INFO_DEVICE, o000000.OooO00o());
        linkedHashMap.put(ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION, oo0o0Oo.OooO0Oo());
        linkedHashMap.put("sources", FeedbackType.Suggestions);
        linkedHashMap.put("phoneversion", o000000.OooO0Oo());
        linkedHashMap.put("phoneBrand", oOO0OOO.OooO0O0(o000000.OooO0O0()));
        linkedHashMap.put("phoneType", oOO0OOO.OooO0O0(o000000.OooO0OO()));
        OooO0OO.OooO0O0(null, Oooo0.f43359OooOoo, Oooo0.f43403o00000oO, linkedHashMap, new Oooo000());
    }

    public static void OooO0OO(int i) {
        LinkedHashMap linkedHashMapOooO00o = OooOOOO.OooO00o();
        linkedHashMapOooO00o.put("eventType", "" + i);
        linkedHashMapOooO00o.put("step", "20");
        linkedHashMapOooO00o.put(DeviceRequestsHelper.DEVICE_INFO_DEVICE, o000000.OooO00o());
        linkedHashMapOooO00o.put(ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION, oo0o0Oo.OooO0Oo());
        linkedHashMapOooO00o.put("sources", FeedbackType.Suggestions);
        linkedHashMapOooO00o.put("phoneversion", o000000.OooO0Oo());
        linkedHashMapOooO00o.put("phoneBrand", oOO0OOO.OooO0O0(o000000.OooO0O0()));
        linkedHashMapOooO00o.put("phoneType", oOO0OOO.OooO0O0(o000000.OooO0OO()));
        OooO0OO.OooO0O0(null, Oooo0.f43359OooOoo, Oooo0.f43403o00000oO, linkedHashMapOooO00o, new OooO00o());
    }
}
