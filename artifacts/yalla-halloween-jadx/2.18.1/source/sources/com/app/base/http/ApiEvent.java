package com.app.base.http;

import com.app.base.application.App;
import com.app.base.interfaceType.FeedbackType;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.facebook.internal.ServerProtocol;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;
import p153o00Oo0oO.o0ooOOo;
import p160o00OoOO0.o00OO0O0;
import p487o0o000oO.o0OOO0o;
import p487o0o000oO.o0Oo0oo;
import p498o0o00Oo0.OooOOO;
import p516o0o0O000.o000oOoO;

/* JADX INFO: loaded from: classes.dex */
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

    public class OooO00o extends o00OO0O0.OooO0O0 {
        @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
        public final void onError(String str, String str2) {
            super.onError(str, str2);
        }

        @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
        public final void onFinish(String str) {
            super.onFinish(str);
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

    public final void OooO00o(int i) {
        Map<String, String> mapOooO0O0 = o00OO0O0.OooO0O0();
        if (i != 1 && i != 10) {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("");
            sbOooO0o0.append(App.f11456Oooo);
            mapOooO0O0.put("eventType", sbOooO0o0.toString());
        }
        if (i == 70) {
            StringBuilder sbOooO0o1 = OooO00o.OooO00o.OooO0o0("");
            OooOOO oooOOO = OooOOO.f41216OooO00o;
            sbOooO0o1.append(OooOOO.f41218OooO0OO ? 1 : 2);
            mapOooO0O0.put(ServerProtocol.DIALOG_PARAM_STATE, sbOooO0o1.toString());
        }
        mapOooO0O0.put("step", "" + i);
        o0Oo0oo o0oo0oo2 = o0Oo0oo.f40947OooO00o;
        mapOooO0O0.put(DeviceRequestsHelper.DEVICE_INFO_DEVICE, o0Oo0oo.OooO00o());
        o0OOO0o o0ooo0o2 = o0OOO0o.f40936OooO00o;
        mapOooO0O0.put(ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION, o0OOO0o.OooO0O0());
        mapOooO0O0.put("sources", FeedbackType.Suggestions);
        mapOooO0O0.put("phoneversion", o0Oo0oo.OooO0Oo());
        mapOooO0O0.put("phoneBrand", o000oOoO.OooO0O0(o0Oo0oo.OooO0O0()));
        mapOooO0O0.put("phoneType", o000oOoO.OooO0O0(o0Oo0oo.OooO0OO()));
        o0ooOOo o0ooooo2 = o0ooOOo.f32218OooO00o;
        o00OO0O0.OooO0OO(null, o0ooOOo.f32244OooOoo, o0ooOOo.f32311o0000oo, mapOooO0O0, new OooO00o());
    }
}
