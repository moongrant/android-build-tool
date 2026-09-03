package com.google.android.datatransport.cct.internal;

import com.facebook.appevents.UserDataStore;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.google.firebase.remoteconfig.RemoteConfigConstants$RequestFieldKey;
import java.io.IOException;
import p236o00oOoo0.o000O;
import p236o00oOoo0.o000O0;
import p236o00oOoo0.o000O00;
import p236o00oOoo0.o000O00O;
import p236o00oOoo0.o000O0Oo;
import p236o00oOoo0.o000OO00;
import p236o00oOoo0.o000OO0O;
import p236o00oOoo0.o000OOo0;
import p297o0O0OooO.o0000O0;
import p297o0O0OooO.o0000O00;
import p297o0O0OooO.o0000oo;
import p299o0O0o00.o00oO0o;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooO00o f13878OooO00o = new OooO00o();

    public static final class OooO implements o0000oo<o000OOo0> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO f13879OooO00o = new OooO();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final o0000O00 f13880OooO0O0 = o0000O00.OooO00o("requestTimeMs");

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final o0000O00 f13881OooO0OO = o0000O00.OooO00o("requestUptimeMs");

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o0000O00 f13882OooO0Oo = o0000O00.OooO00o("clientInfo");

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public static final o0000O00 f13884OooO0o0 = o0000O00.OooO00o("logSource");

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public static final o0000O00 f13883OooO0o = o0000O00.OooO00o("logSourceName");

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public static final o0000O00 f13885OooO0oO = o0000O00.OooO00o("logEvent");

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public static final o0000O00 f13886OooO0oo = o0000O00.OooO00o("qosTier");

        @Override // p297o0O0OooO.o0000
        public final void OooO00o(Object obj, o0000O0 o0000o1) throws IOException {
            o000OOo0 o000ooo1 = (o000OOo0) obj;
            o0000O0 o0000o2 = o0000o1;
            o0000o2.OooO0OO(f13880OooO0O0, o000ooo1.OooO0o());
            o0000o2.OooO0OO(f13881OooO0OO, o000ooo1.OooO0oO());
            o0000o2.OooO0Oo(f13882OooO0Oo, o000ooo1.OooO00o());
            o0000o2.OooO0Oo(f13884OooO0o0, o000ooo1.OooO0OO());
            o0000o2.OooO0Oo(f13883OooO0o, o000ooo1.OooO0Oo());
            o0000o2.OooO0Oo(f13885OooO0oO, o000ooo1.OooO0O0());
            o0000o2.OooO0Oo(f13886OooO0oo, o000ooo1.OooO0o0());
        }
    }

    /* JADX INFO: renamed from: com.google.android.datatransport.cct.internal.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C0213OooO00o implements o0000oo<o000O00> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final C0213OooO00o f13888OooO00o = new C0213OooO00o();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final o0000O00 f13889OooO0O0 = o0000O00.OooO00o(RemoteConfigConstants$RequestFieldKey.SDK_VERSION);

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final o0000O00 f13890OooO0OO = o0000O00.OooO00o(DeviceRequestsHelper.DEVICE_INFO_MODEL);

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o0000O00 f13891OooO0Oo = o0000O00.OooO00o("hardware");

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public static final o0000O00 f13893OooO0o0 = o0000O00.OooO00o(DeviceRequestsHelper.DEVICE_INFO_DEVICE);

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public static final o0000O00 f13892OooO0o = o0000O00.OooO00o("product");

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public static final o0000O00 f13894OooO0oO = o0000O00.OooO00o("osBuild");

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public static final o0000O00 f13895OooO0oo = o0000O00.OooO00o("manufacturer");

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public static final o0000O00 f13887OooO = o0000O00.OooO00o("fingerprint");

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public static final o0000O00 f13896OooOO0 = o0000O00.OooO00o("locale");

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public static final o0000O00 f13897OooOO0O = o0000O00.OooO00o(UserDataStore.COUNTRY);

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public static final o0000O00 f13898OooOO0o = o0000O00.OooO00o("mccMnc");

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public static final o0000O00 f13899OooOOO0 = o0000O00.OooO00o("applicationBuild");

        @Override // p297o0O0OooO.o0000
        public final void OooO00o(Object obj, o0000O0 o0000o1) throws IOException {
            o000O00 o000o01 = (o000O00) obj;
            o0000O0 o0000o2 = o0000o1;
            o0000o2.OooO0Oo(f13889OooO0O0, o000o01.OooOO0o());
            o0000o2.OooO0Oo(f13890OooO0OO, o000o01.OooO());
            o0000o2.OooO0Oo(f13891OooO0Oo, o000o01.OooO0o0());
            o0000o2.OooO0Oo(f13893OooO0o0, o000o01.OooO0OO());
            o0000o2.OooO0Oo(f13892OooO0o, o000o01.OooOO0O());
            o0000o2.OooO0Oo(f13894OooO0oO, o000o01.OooOO0());
            o0000o2.OooO0Oo(f13895OooO0oo, o000o01.OooO0oO());
            o0000o2.OooO0Oo(f13887OooO, o000o01.OooO0Oo());
            o0000o2.OooO0Oo(f13896OooOO0, o000o01.OooO0o());
            o0000o2.OooO0Oo(f13897OooOO0O, o000o01.OooO0O0());
            o0000o2.OooO0Oo(f13898OooOO0o, o000o01.OooO0oo());
            o0000o2.OooO0Oo(f13899OooOOO0, o000o01.OooO00o());
        }
    }

    public static final class OooO0O0 implements o0000oo<o000O> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO0O0 f13900OooO00o = new OooO0O0();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final o0000O00 f13901OooO0O0 = o0000O00.OooO00o("logRequest");

        @Override // p297o0O0OooO.o0000
        public final void OooO00o(Object obj, o0000O0 o0000o1) throws IOException {
            o0000o1.OooO0Oo(f13901OooO0O0, ((o000O) obj).OooO00o());
        }
    }

    public static final class OooO0OO implements o0000oo<ClientInfo> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO0OO f13902OooO00o = new OooO0OO();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final o0000O00 f13903OooO0O0 = o0000O00.OooO00o("clientType");

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final o0000O00 f13904OooO0OO = o0000O00.OooO00o("androidClientInfo");

        @Override // p297o0O0OooO.o0000
        public final void OooO00o(Object obj, o0000O0 o0000o1) throws IOException {
            ClientInfo clientInfo = (ClientInfo) obj;
            o0000O0 o0000o2 = o0000o1;
            o0000o2.OooO0Oo(f13903OooO0O0, clientInfo.OooO0O0());
            o0000o2.OooO0Oo(f13904OooO0OO, clientInfo.OooO00o());
        }
    }

    public static final class OooO0o implements o0000oo<o000OO00> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO0o f13905OooO00o = new OooO0o();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final o0000O00 f13906OooO0O0 = o0000O00.OooO00o("eventTimeMs");

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final o0000O00 f13907OooO0OO = o0000O00.OooO00o("eventCode");

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o0000O00 f13908OooO0Oo = o0000O00.OooO00o("eventUptimeMs");

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public static final o0000O00 f13910OooO0o0 = o0000O00.OooO00o("sourceExtension");

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public static final o0000O00 f13909OooO0o = o0000O00.OooO00o("sourceExtensionJsonProto3");

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public static final o0000O00 f13911OooO0oO = o0000O00.OooO00o("timezoneOffsetSeconds");

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public static final o0000O00 f13912OooO0oo = o0000O00.OooO00o("networkConnectionInfo");

        @Override // p297o0O0OooO.o0000
        public final void OooO00o(Object obj, o0000O0 o0000o1) throws IOException {
            o000OO00 o000oo01 = (o000OO00) obj;
            o0000O0 o0000o2 = o0000o1;
            o0000o2.OooO0OO(f13906OooO0O0, o000oo01.OooO0O0());
            o0000o2.OooO0Oo(f13907OooO0OO, o000oo01.OooO00o());
            o0000o2.OooO0OO(f13908OooO0Oo, o000oo01.OooO0OO());
            o0000o2.OooO0Oo(f13910OooO0o0, o000oo01.OooO0o0());
            o0000o2.OooO0Oo(f13909OooO0o, o000oo01.OooO0o());
            o0000o2.OooO0OO(f13911OooO0oO, o000oo01.OooO0oO());
            o0000o2.OooO0Oo(f13912OooO0oo, o000oo01.OooO0Oo());
        }
    }

    public static final class OooOO0 implements o0000oo<NetworkConnectionInfo> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooOO0 f13913OooO00o = new OooOO0();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final o0000O00 f13914OooO0O0 = o0000O00.OooO00o("networkType");

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final o0000O00 f13915OooO0OO = o0000O00.OooO00o("mobileSubtype");

        @Override // p297o0O0OooO.o0000
        public final void OooO00o(Object obj, o0000O0 o0000o1) throws IOException {
            NetworkConnectionInfo networkConnectionInfo = (NetworkConnectionInfo) obj;
            o0000O0 o0000o2 = o0000o1;
            o0000o2.OooO0Oo(f13914OooO0O0, networkConnectionInfo.OooO0O0());
            o0000o2.OooO0Oo(f13915OooO0OO, networkConnectionInfo.OooO00o());
        }
    }

    public final void OooO00o(o0O0o000.OooO00o<?> oooO00o) {
        OooO0O0 oooO0O0 = OooO0O0.f13900OooO00o;
        o00oO0o o00oo0o2 = (o00oO0o) oooO00o;
        o00oo0o2.OooO00o(o000O.class, oooO0O0);
        o00oo0o2.OooO00o(o000O0.class, oooO0O0);
        OooO oooO = OooO.f13879OooO00o;
        o00oo0o2.OooO00o(o000OOo0.class, oooO);
        o00oo0o2.OooO00o(o000OO0O.class, oooO);
        OooO0OO oooO0OO = OooO0OO.f13902OooO00o;
        o00oo0o2.OooO00o(ClientInfo.class, oooO0OO);
        o00oo0o2.OooO00o(com.google.android.datatransport.cct.internal.OooO0O0.class, oooO0OO);
        C0213OooO00o c0213OooO00o = C0213OooO00o.f13888OooO00o;
        o00oo0o2.OooO00o(o000O00.class, c0213OooO00o);
        o00oo0o2.OooO00o(o000O00O.class, c0213OooO00o);
        OooO0o oooO0o = OooO0o.f13905OooO00o;
        o00oo0o2.OooO00o(o000OO00.class, oooO0o);
        o00oo0o2.OooO00o(o000O0Oo.class, oooO0o);
        OooOO0 oooOO1 = OooOO0.f13913OooO00o;
        o00oo0o2.OooO00o(NetworkConnectionInfo.class, oooOO1);
        o00oo0o2.OooO00o(com.google.android.datatransport.cct.internal.OooO0OO.class, oooOO1);
    }
}
