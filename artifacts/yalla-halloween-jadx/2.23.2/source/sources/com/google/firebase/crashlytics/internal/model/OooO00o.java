package com.google.firebase.crashlytics.internal.model;

import com.facebook.appevents.integrity.IntegrityManager;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.facebook.internal.ServerProtocol;
import com.facebook.share.internal.ShareInternalUtility;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.remoteconfig.RemoteConfigConstants$RequestFieldKey;
import java.io.IOException;
import p297o0O0OooO.o0000O0;
import p297o0O0OooO.o0000O00;
import p297o0O0OooO.o0000oo;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooO00o f19389OooO00o = new OooO00o();

    public static final class OooO implements o0000oo<CrashlyticsReport.OooO0o> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO f19390OooO00o = new OooO();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final o0000O00 f19391OooO0O0 = o0000O00.OooO00o("files");

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final o0000O00 f19392OooO0OO = o0000O00.OooO00o("orgId");

        @Override // p297o0O0OooO.o0000
        public final void OooO00o(Object obj, o0000O0 o0000o1) throws IOException {
            CrashlyticsReport.OooO0o oooO0o = (CrashlyticsReport.OooO0o) obj;
            o0000O0 o0000o2 = o0000o1;
            o0000o2.OooO0Oo(f19391OooO0O0, oooO0o.OooO00o());
            o0000o2.OooO0Oo(f19392OooO0OO, oooO0o.OooO0O0());
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.model.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C0253OooO00o implements o0000oo<CrashlyticsReport.OooO00o.AbstractC0252OooO00o> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final C0253OooO00o f19393OooO00o = new C0253OooO00o();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final o0000O00 f19394OooO0O0 = o0000O00.OooO00o("arch");

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final o0000O00 f19395OooO0OO = o0000O00.OooO00o("libraryName");

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o0000O00 f19396OooO0Oo = o0000O00.OooO00o("buildId");

        @Override // p297o0O0OooO.o0000
        public final void OooO00o(Object obj, o0000O0 o0000o1) throws IOException {
            CrashlyticsReport.OooO00o.AbstractC0252OooO00o abstractC0252OooO00o = (CrashlyticsReport.OooO00o.AbstractC0252OooO00o) obj;
            o0000O0 o0000o2 = o0000o1;
            o0000o2.OooO0Oo(f19394OooO0O0, abstractC0252OooO00o.OooO00o());
            o0000o2.OooO0Oo(f19395OooO0OO, abstractC0252OooO00o.OooO0OO());
            o0000o2.OooO0Oo(f19396OooO0Oo, abstractC0252OooO00o.OooO0O0());
        }
    }

    public static final class OooO0O0 implements o0000oo<CrashlyticsReport.OooO00o> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO0O0 f19398OooO00o = new OooO0O0();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final o0000O00 f19399OooO0O0 = o0000O00.OooO00o("pid");

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final o0000O00 f19400OooO0OO = o0000O00.OooO00o("processName");

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o0000O00 f19401OooO0Oo = o0000O00.OooO00o("reasonCode");

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public static final o0000O00 f19403OooO0o0 = o0000O00.OooO00o("importance");

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public static final o0000O00 f19402OooO0o = o0000O00.OooO00o("pss");

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public static final o0000O00 f19404OooO0oO = o0000O00.OooO00o("rss");

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public static final o0000O00 f19405OooO0oo = o0000O00.OooO00o("timestamp");

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public static final o0000O00 f19397OooO = o0000O00.OooO00o("traceFile");

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public static final o0000O00 f19406OooOO0 = o0000O00.OooO00o("buildIdMappingForArch");

        @Override // p297o0O0OooO.o0000
        public final void OooO00o(Object obj, o0000O0 o0000o1) throws IOException {
            CrashlyticsReport.OooO00o oooO00o = (CrashlyticsReport.OooO00o) obj;
            o0000O0 o0000o2 = o0000o1;
            o0000o2.OooO0O0(f19399OooO0O0, oooO00o.OooO0OO());
            o0000o2.OooO0Oo(f19400OooO0OO, oooO00o.OooO0Oo());
            o0000o2.OooO0O0(f19401OooO0Oo, oooO00o.OooO0o());
            o0000o2.OooO0O0(f19403OooO0o0, oooO00o.OooO0O0());
            o0000o2.OooO0OO(f19402OooO0o, oooO00o.OooO0o0());
            o0000o2.OooO0OO(f19404OooO0oO, oooO00o.OooO0oO());
            o0000o2.OooO0OO(f19405OooO0oo, oooO00o.OooO0oo());
            o0000o2.OooO0Oo(f19397OooO, oooO00o.OooO());
            o0000o2.OooO0Oo(f19406OooOO0, oooO00o.OooO00o());
        }
    }

    public static final class OooO0OO implements o0000oo<CrashlyticsReport.OooO0OO> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO0OO f19407OooO00o = new OooO0OO();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final o0000O00 f19408OooO0O0 = o0000O00.OooO00o("key");

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final o0000O00 f19409OooO0OO = o0000O00.OooO00o(AppMeasurementSdk.ConditionalUserProperty.VALUE);

        @Override // p297o0O0OooO.o0000
        public final void OooO00o(Object obj, o0000O0 o0000o1) throws IOException {
            CrashlyticsReport.OooO0OO oooO0OO = (CrashlyticsReport.OooO0OO) obj;
            o0000O0 o0000o2 = o0000o1;
            o0000o2.OooO0Oo(f19408OooO0O0, oooO0OO.OooO00o());
            o0000o2.OooO0Oo(f19409OooO0OO, oooO0OO.OooO0O0());
        }
    }

    public static final class OooO0o implements o0000oo<CrashlyticsReport> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO0o f19411OooO00o = new OooO0o();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final o0000O00 f19412OooO0O0 = o0000O00.OooO00o(RemoteConfigConstants$RequestFieldKey.SDK_VERSION);

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final o0000O00 f19413OooO0OO = o0000O00.OooO00o("gmpAppId");

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o0000O00 f19414OooO0Oo = o0000O00.OooO00o("platform");

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public static final o0000O00 f19416OooO0o0 = o0000O00.OooO00o("installationUuid");

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public static final o0000O00 f19415OooO0o = o0000O00.OooO00o("buildVersion");

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public static final o0000O00 f19417OooO0oO = o0000O00.OooO00o("displayVersion");

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public static final o0000O00 f19418OooO0oo = o0000O00.OooO00o("session");

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public static final o0000O00 f19410OooO = o0000O00.OooO00o("ndkPayload");

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public static final o0000O00 f19419OooOO0 = o0000O00.OooO00o("appExitInfo");

        @Override // p297o0O0OooO.o0000
        public final void OooO00o(Object obj, o0000O0 o0000o1) throws IOException {
            CrashlyticsReport crashlyticsReport = (CrashlyticsReport) obj;
            o0000O0 o0000o2 = o0000o1;
            o0000o2.OooO0Oo(f19412OooO0O0, crashlyticsReport.OooO0oo());
            o0000o2.OooO0Oo(f19413OooO0OO, crashlyticsReport.OooO0Oo());
            o0000o2.OooO0O0(f19414OooO0Oo, crashlyticsReport.OooO0oO());
            o0000o2.OooO0Oo(f19416OooO0o0, crashlyticsReport.OooO0o0());
            o0000o2.OooO0Oo(f19415OooO0o, crashlyticsReport.OooO0O0());
            o0000o2.OooO0Oo(f19417OooO0oO, crashlyticsReport.OooO0OO());
            o0000o2.OooO0Oo(f19418OooO0oo, crashlyticsReport.OooO());
            o0000o2.OooO0Oo(f19410OooO, crashlyticsReport.OooO0o());
            o0000o2.OooO0Oo(f19419OooOO0, crashlyticsReport.OooO00o());
        }
    }

    public static final class OooOO0 implements o0000oo<CrashlyticsReport.OooO0o.OooO00o> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooOO0 f19420OooO00o = new OooOO0();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final o0000O00 f19421OooO0O0 = o0000O00.OooO00o("filename");

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final o0000O00 f19422OooO0OO = o0000O00.OooO00o("contents");

        @Override // p297o0O0OooO.o0000
        public final void OooO00o(Object obj, o0000O0 o0000o1) throws IOException {
            CrashlyticsReport.OooO0o.OooO00o oooO00o = (CrashlyticsReport.OooO0o.OooO00o) obj;
            o0000O0 o0000o2 = o0000o1;
            o0000o2.OooO0Oo(f19421OooO0O0, oooO00o.OooO0O0());
            o0000o2.OooO0Oo(f19422OooO0OO, oooO00o.OooO00o());
        }
    }

    public static final class OooOO0O implements o0000oo<CrashlyticsReport.OooO.OooO00o> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooOO0O f19423OooO00o = new OooOO0O();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final o0000O00 f19424OooO0O0 = o0000O00.OooO00o("identifier");

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final o0000O00 f19425OooO0OO = o0000O00.OooO00o(ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION);

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o0000O00 f19426OooO0Oo = o0000O00.OooO00o("displayVersion");

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public static final o0000O00 f19428OooO0o0 = o0000O00.OooO00o("organization");

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public static final o0000O00 f19427OooO0o = o0000O00.OooO00o("installationUuid");

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public static final o0000O00 f19429OooO0oO = o0000O00.OooO00o("developmentPlatform");

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public static final o0000O00 f19430OooO0oo = o0000O00.OooO00o("developmentPlatformVersion");

        @Override // p297o0O0OooO.o0000
        public final void OooO00o(Object obj, o0000O0 o0000o1) throws IOException {
            CrashlyticsReport.OooO.OooO00o oooO00o = (CrashlyticsReport.OooO.OooO00o) obj;
            o0000O0 o0000o2 = o0000o1;
            o0000o2.OooO0Oo(f19424OooO0O0, oooO00o.OooO0Oo());
            o0000o2.OooO0Oo(f19425OooO0OO, oooO00o.OooO0oO());
            o0000o2.OooO0Oo(f19426OooO0Oo, oooO00o.OooO0OO());
            o0000o2.OooO0Oo(f19428OooO0o0, oooO00o.OooO0o());
            o0000o2.OooO0Oo(f19427OooO0o, oooO00o.OooO0o0());
            o0000o2.OooO0Oo(f19429OooO0oO, oooO00o.OooO00o());
            o0000o2.OooO0Oo(f19430OooO0oo, oooO00o.OooO0O0());
        }
    }

    public static final class OooOOO implements o0000oo<CrashlyticsReport.OooO.OooO0OO> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooOOO f19432OooO00o = new OooOOO();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final o0000O00 f19433OooO0O0 = o0000O00.OooO00o("arch");

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final o0000O00 f19434OooO0OO = o0000O00.OooO00o(DeviceRequestsHelper.DEVICE_INFO_MODEL);

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o0000O00 f19435OooO0Oo = o0000O00.OooO00o("cores");

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public static final o0000O00 f19437OooO0o0 = o0000O00.OooO00o("ram");

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public static final o0000O00 f19436OooO0o = o0000O00.OooO00o("diskSpace");

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public static final o0000O00 f19438OooO0oO = o0000O00.OooO00o("simulator");

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public static final o0000O00 f19439OooO0oo = o0000O00.OooO00o("state");

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public static final o0000O00 f19431OooO = o0000O00.OooO00o("manufacturer");

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public static final o0000O00 f19440OooOO0 = o0000O00.OooO00o("modelClass");

        @Override // p297o0O0OooO.o0000
        public final void OooO00o(Object obj, o0000O0 o0000o1) throws IOException {
            CrashlyticsReport.OooO.OooO0OO oooO0OO = (CrashlyticsReport.OooO.OooO0OO) obj;
            o0000O0 o0000o2 = o0000o1;
            o0000o2.OooO0O0(f19433OooO0O0, oooO0OO.OooO00o());
            o0000o2.OooO0Oo(f19434OooO0OO, oooO0OO.OooO0o0());
            o0000o2.OooO0O0(f19435OooO0Oo, oooO0OO.OooO0O0());
            o0000o2.OooO0OO(f19437OooO0o0, oooO0OO.OooO0oO());
            o0000o2.OooO0OO(f19436OooO0o, oooO0OO.OooO0OO());
            o0000o2.OooO00o(f19438OooO0oO, oooO0OO.OooO());
            o0000o2.OooO0O0(f19439OooO0oo, oooO0OO.OooO0oo());
            o0000o2.OooO0Oo(f19431OooO, oooO0OO.OooO0Oo());
            o0000o2.OooO0Oo(f19440OooOO0, oooO0OO.OooO0o());
        }
    }

    public static final class OooOOO0 implements o0000oo<CrashlyticsReport.OooO.OooO00o.AbstractC0243OooO00o> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooOOO0 f19441OooO00o = new OooOOO0();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final o0000O00 f19442OooO0O0 = o0000O00.OooO00o("clsId");

        @Override // p297o0O0OooO.o0000
        public final void OooO00o(Object obj, o0000O0 o0000o1) throws IOException {
            ((CrashlyticsReport.OooO.OooO00o.AbstractC0243OooO00o) obj).OooO00o();
            o0000o1.OooO0Oo(f19442OooO0O0, null);
        }
    }

    public static final class OooOOOO implements o0000oo<CrashlyticsReport.OooO> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooOOOO f19444OooO00o = new OooOOOO();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final o0000O00 f19445OooO0O0 = o0000O00.OooO00o("generator");

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final o0000O00 f19446OooO0OO = o0000O00.OooO00o("identifier");

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o0000O00 f19447OooO0Oo = o0000O00.OooO00o("startedAt");

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public static final o0000O00 f19449OooO0o0 = o0000O00.OooO00o("endedAt");

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public static final o0000O00 f19448OooO0o = o0000O00.OooO00o("crashed");

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public static final o0000O00 f19450OooO0oO = o0000O00.OooO00o("app");

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public static final o0000O00 f19451OooO0oo = o0000O00.OooO00o("user");

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public static final o0000O00 f19443OooO = o0000O00.OooO00o("os");

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public static final o0000O00 f19452OooOO0 = o0000O00.OooO00o(DeviceRequestsHelper.DEVICE_INFO_DEVICE);

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public static final o0000O00 f19453OooOO0O = o0000O00.OooO00o("events");

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public static final o0000O00 f19454OooOO0o = o0000O00.OooO00o("generatorType");

        @Override // p297o0O0OooO.o0000
        public final void OooO00o(Object obj, o0000O0 o0000o1) throws IOException {
            CrashlyticsReport.OooO oooO = (CrashlyticsReport.OooO) obj;
            o0000O0 o0000o2 = o0000o1;
            o0000o2.OooO0Oo(f19445OooO0O0, oooO.OooO0o0());
            o0000o2.OooO0Oo(f19446OooO0OO, oooO.OooO0oO().getBytes(CrashlyticsReport.f19386OooO00o));
            o0000o2.OooO0OO(f19447OooO0Oo, oooO.OooO());
            o0000o2.OooO0Oo(f19449OooO0o0, oooO.OooO0OO());
            o0000o2.OooO00o(f19448OooO0o, oooO.OooOO0O());
            o0000o2.OooO0Oo(f19450OooO0oO, oooO.OooO00o());
            o0000o2.OooO0Oo(f19451OooO0oo, oooO.OooOO0());
            o0000o2.OooO0Oo(f19443OooO, oooO.OooO0oo());
            o0000o2.OooO0Oo(f19452OooOO0, oooO.OooO0O0());
            o0000o2.OooO0Oo(f19453OooOO0O, oooO.OooO0Oo());
            o0000o2.OooO0O0(f19454OooOO0o, oooO.OooO0o());
        }
    }

    public static final class OooOo implements o0000oo<CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0245OooO00o> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooOo f19455OooO00o = new OooOo();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final o0000O00 f19456OooO0O0 = o0000O00.OooO00o("baseAddress");

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final o0000O00 f19457OooO0OO = o0000O00.OooO00o("size");

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o0000O00 f19458OooO0Oo = o0000O00.OooO00o("name");

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public static final o0000O00 f19459OooO0o0 = o0000O00.OooO00o("uuid");

        @Override // p297o0O0OooO.o0000
        public final void OooO00o(Object obj, o0000O0 o0000o1) throws IOException {
            CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0245OooO00o abstractC0245OooO00o = (CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0245OooO00o) obj;
            o0000O0 o0000o2 = o0000o1;
            o0000o2.OooO0OO(f19456OooO0O0, abstractC0245OooO00o.OooO00o());
            o0000o2.OooO0OO(f19457OooO0OO, abstractC0245OooO00o.OooO0OO());
            o0000o2.OooO0Oo(f19458OooO0Oo, abstractC0245OooO00o.OooO0O0());
            String strOooO0Oo = abstractC0245OooO00o.OooO0Oo();
            o0000o2.OooO0Oo(f19459OooO0o0, strOooO0Oo != null ? strOooO0Oo.getBytes(CrashlyticsReport.f19386OooO00o) : null);
        }
    }

    public static final class OooOo00 implements o0000oo<CrashlyticsReport.OooO.OooO0o.OooO00o> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooOo00 f19460OooO00o = new OooOo00();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final o0000O00 f19461OooO0O0 = o0000O00.OooO00o("execution");

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final o0000O00 f19462OooO0OO = o0000O00.OooO00o("customAttributes");

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o0000O00 f19463OooO0Oo = o0000O00.OooO00o("internalKeys");

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public static final o0000O00 f19465OooO0o0 = o0000O00.OooO00o("background");

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public static final o0000O00 f19464OooO0o = o0000O00.OooO00o("uiOrientation");

        @Override // p297o0O0OooO.o0000
        public final void OooO00o(Object obj, o0000O0 o0000o1) throws IOException {
            CrashlyticsReport.OooO.OooO0o.OooO00o oooO00o = (CrashlyticsReport.OooO.OooO0o.OooO00o) obj;
            o0000O0 o0000o2 = o0000o1;
            o0000o2.OooO0Oo(f19461OooO0O0, oooO00o.OooO0OO());
            o0000o2.OooO0Oo(f19462OooO0OO, oooO00o.OooO0O0());
            o0000o2.OooO0Oo(f19463OooO0Oo, oooO00o.OooO0Oo());
            o0000o2.OooO0Oo(f19465OooO0o0, oooO00o.OooO00o());
            o0000o2.OooO0O0(f19464OooO0o, oooO00o.OooO0o0());
        }
    }

    public static final class Oooo0 implements o0000oo<CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0247OooO0O0> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final Oooo0 f19466OooO00o = new Oooo0();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final o0000O00 f19467OooO0O0 = o0000O00.OooO00o("type");

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final o0000O00 f19468OooO0OO = o0000O00.OooO00o("reason");

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o0000O00 f19469OooO0Oo = o0000O00.OooO00o("frames");

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public static final o0000O00 f19471OooO0o0 = o0000O00.OooO00o("causedBy");

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public static final o0000O00 f19470OooO0o = o0000O00.OooO00o("overflowCount");

        @Override // p297o0O0OooO.o0000
        public final void OooO00o(Object obj, o0000O0 o0000o1) throws IOException {
            CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0247OooO0O0 abstractC0247OooO0O0 = (CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0247OooO0O0) obj;
            o0000O0 o0000o2 = o0000o1;
            o0000o2.OooO0Oo(f19467OooO0O0, abstractC0247OooO0O0.OooO0o0());
            o0000o2.OooO0Oo(f19468OooO0OO, abstractC0247OooO0O0.OooO0Oo());
            o0000o2.OooO0Oo(f19469OooO0Oo, abstractC0247OooO0O0.OooO0O0());
            o0000o2.OooO0Oo(f19471OooO0o0, abstractC0247OooO0O0.OooO00o());
            o0000o2.OooO0O0(f19470OooO0o, abstractC0247OooO0O0.OooO0OO());
        }
    }

    public static final class Oooo000 implements o0000oo<CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final Oooo000 f19472OooO00o = new Oooo000();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final o0000O00 f19473OooO0O0 = o0000O00.OooO00o("threads");

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final o0000O00 f19474OooO0OO = o0000O00.OooO00o("exception");

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o0000O00 f19475OooO0Oo = o0000O00.OooO00o("appExitInfo");

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public static final o0000O00 f19477OooO0o0 = o0000O00.OooO00o("signal");

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public static final o0000O00 f19476OooO0o = o0000O00.OooO00o("binaries");

        @Override // p297o0O0OooO.o0000
        public final void OooO00o(Object obj, o0000O0 o0000o1) throws IOException {
            CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0 oooO0O0 = (CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0) obj;
            o0000O0 o0000o2 = o0000o1;
            o0000o2.OooO0Oo(f19473OooO0O0, oooO0O0.OooO0o0());
            o0000o2.OooO0Oo(f19474OooO0OO, oooO0O0.OooO0OO());
            o0000o2.OooO0Oo(f19475OooO0Oo, oooO0O0.OooO00o());
            o0000o2.OooO0Oo(f19477OooO0o0, oooO0O0.OooO0Oo());
            o0000o2.OooO0Oo(f19476OooO0o, oooO0O0.OooO0O0());
        }
    }

    public static final class o000oOoO implements o0000oo<CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.OooO0OO> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final o000oOoO f19478OooO00o = new o000oOoO();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final o0000O00 f19479OooO0O0 = o0000O00.OooO00o("name");

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final o0000O00 f19480OooO0OO = o0000O00.OooO00o("code");

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o0000O00 f19481OooO0Oo = o0000O00.OooO00o(IntegrityManager.INTEGRITY_TYPE_ADDRESS);

        @Override // p297o0O0OooO.o0000
        public final void OooO00o(Object obj, o0000O0 o0000o1) throws IOException {
            CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.OooO0OO oooO0OO = (CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.OooO0OO) obj;
            o0000O0 o0000o2 = o0000o1;
            o0000o2.OooO0Oo(f19479OooO0O0, oooO0OO.OooO0OO());
            o0000o2.OooO0Oo(f19480OooO0OO, oooO0OO.OooO0O0());
            o0000o2.OooO0OO(f19481OooO0Oo, oooO0OO.OooO00o());
        }
    }

    public static final class o00O0O implements o0000oo<CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0248OooO0o.AbstractC0249OooO00o> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final o00O0O f19482OooO00o = new o00O0O();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final o0000O00 f19483OooO0O0 = o0000O00.OooO00o("pc");

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final o0000O00 f19484OooO0OO = o0000O00.OooO00o("symbol");

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o0000O00 f19485OooO0Oo = o0000O00.OooO00o(ShareInternalUtility.STAGING_PARAM);

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public static final o0000O00 f19487OooO0o0 = o0000O00.OooO00o("offset");

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public static final o0000O00 f19486OooO0o = o0000O00.OooO00o("importance");

        @Override // p297o0O0OooO.o0000
        public final void OooO00o(Object obj, o0000O0 o0000o1) throws IOException {
            CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0248OooO0o.AbstractC0249OooO00o abstractC0249OooO00o = (CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0248OooO0o.AbstractC0249OooO00o) obj;
            o0000O0 o0000o2 = o0000o1;
            o0000o2.OooO0OO(f19483OooO0O0, abstractC0249OooO00o.OooO0Oo());
            o0000o2.OooO0Oo(f19484OooO0OO, abstractC0249OooO00o.OooO0o0());
            o0000o2.OooO0Oo(f19485OooO0Oo, abstractC0249OooO00o.OooO00o());
            o0000o2.OooO0OO(f19487OooO0o0, abstractC0249OooO00o.OooO0OO());
            o0000o2.OooO0O0(f19486OooO0o, abstractC0249OooO00o.OooO0O0());
        }
    }

    public static final class o00Oo0 implements o0000oo<CrashlyticsReport.OooO.OooO0o.OooO0OO> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final o00Oo0 f19488OooO00o = new o00Oo0();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final o0000O00 f19489OooO0O0 = o0000O00.OooO00o("batteryLevel");

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final o0000O00 f19490OooO0OO = o0000O00.OooO00o("batteryVelocity");

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o0000O00 f19491OooO0Oo = o0000O00.OooO00o("proximityOn");

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public static final o0000O00 f19493OooO0o0 = o0000O00.OooO00o("orientation");

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public static final o0000O00 f19492OooO0o = o0000O00.OooO00o("ramUsed");

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public static final o0000O00 f19494OooO0oO = o0000O00.OooO00o("diskUsed");

        @Override // p297o0O0OooO.o0000
        public final void OooO00o(Object obj, o0000O0 o0000o1) throws IOException {
            CrashlyticsReport.OooO.OooO0o.OooO0OO oooO0OO = (CrashlyticsReport.OooO.OooO0o.OooO0OO) obj;
            o0000O0 o0000o2 = o0000o1;
            o0000o2.OooO0Oo(f19489OooO0O0, oooO0OO.OooO00o());
            o0000o2.OooO0O0(f19490OooO0OO, oooO0OO.OooO0O0());
            o0000o2.OooO00o(f19491OooO0Oo, oooO0OO.OooO0o());
            o0000o2.OooO0O0(f19493OooO0o0, oooO0OO.OooO0Oo());
            o0000o2.OooO0OO(f19492OooO0o, oooO0OO.OooO0o0());
            o0000o2.OooO0OO(f19494OooO0oO, oooO0OO.OooO0OO());
        }
    }

    public static final class o00Ooo implements o0000oo<CrashlyticsReport.OooO.OooO0o> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final o00Ooo f19495OooO00o = new o00Ooo();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final o0000O00 f19496OooO0O0 = o0000O00.OooO00o("timestamp");

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final o0000O00 f19497OooO0OO = o0000O00.OooO00o("type");

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o0000O00 f19498OooO0Oo = o0000O00.OooO00o("app");

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public static final o0000O00 f19500OooO0o0 = o0000O00.OooO00o(DeviceRequestsHelper.DEVICE_INFO_DEVICE);

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public static final o0000O00 f19499OooO0o = o0000O00.OooO00o("log");

        @Override // p297o0O0OooO.o0000
        public final void OooO00o(Object obj, o0000O0 o0000o1) throws IOException {
            CrashlyticsReport.OooO.OooO0o oooO0o = (CrashlyticsReport.OooO.OooO0o) obj;
            o0000O0 o0000o2 = o0000o1;
            o0000o2.OooO0OO(f19496OooO0O0, oooO0o.OooO0Oo());
            o0000o2.OooO0Oo(f19497OooO0OO, oooO0o.OooO0o0());
            o0000o2.OooO0Oo(f19498OooO0Oo, oooO0o.OooO00o());
            o0000o2.OooO0Oo(f19500OooO0o0, oooO0o.OooO0O0());
            o0000o2.OooO0Oo(f19499OooO0o, oooO0o.OooO0OO());
        }
    }

    public static final class o00oO0o implements o0000oo<CrashlyticsReport.OooO.AbstractC0242OooO> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final o00oO0o f19501OooO00o = new o00oO0o();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final o0000O00 f19502OooO0O0 = o0000O00.OooO00o("platform");

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final o0000O00 f19503OooO0OO = o0000O00.OooO00o(ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION);

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o0000O00 f19504OooO0Oo = o0000O00.OooO00o("buildVersion");

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public static final o0000O00 f19505OooO0o0 = o0000O00.OooO00o("jailbroken");

        @Override // p297o0O0OooO.o0000
        public final void OooO00o(Object obj, o0000O0 o0000o1) throws IOException {
            CrashlyticsReport.OooO.AbstractC0242OooO abstractC0242OooO = (CrashlyticsReport.OooO.AbstractC0242OooO) obj;
            o0000O0 o0000o2 = o0000o1;
            o0000o2.OooO0O0(f19502OooO0O0, abstractC0242OooO.OooO0O0());
            o0000o2.OooO0Oo(f19503OooO0OO, abstractC0242OooO.OooO0OO());
            o0000o2.OooO0Oo(f19504OooO0Oo, abstractC0242OooO.OooO00o());
            o0000o2.OooO00o(f19505OooO0o0, abstractC0242OooO.OooO0Oo());
        }
    }

    public static final class o0OoOo0 implements o0000oo<CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0248OooO0o> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final o0OoOo0 f19506OooO00o = new o0OoOo0();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final o0000O00 f19507OooO0O0 = o0000O00.OooO00o("name");

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final o0000O00 f19508OooO0OO = o0000O00.OooO00o("importance");

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o0000O00 f19509OooO0Oo = o0000O00.OooO00o("frames");

        @Override // p297o0O0OooO.o0000
        public final void OooO00o(Object obj, o0000O0 o0000o1) throws IOException {
            CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0248OooO0o abstractC0248OooO0o = (CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0248OooO0o) obj;
            o0000O0 o0000o2 = o0000o1;
            o0000o2.OooO0Oo(f19507OooO0O0, abstractC0248OooO0o.OooO0OO());
            o0000o2.OooO0O0(f19508OooO0OO, abstractC0248OooO0o.OooO0O0());
            o0000o2.OooO0Oo(f19509OooO0Oo, abstractC0248OooO0o.OooO00o());
        }
    }

    public static final class o0ooOOo implements o0000oo<CrashlyticsReport.OooO.OooOO0> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final o0ooOOo f19510OooO00o = new o0ooOOo();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final o0000O00 f19511OooO0O0 = o0000O00.OooO00o("identifier");

        @Override // p297o0O0OooO.o0000
        public final void OooO00o(Object obj, o0000O0 o0000o1) throws IOException {
            o0000o1.OooO0Oo(f19511OooO0O0, ((CrashlyticsReport.OooO.OooOO0) obj).OooO00o());
        }
    }

    public static final class oo000o implements o0000oo<CrashlyticsReport.OooO.OooO0o.AbstractC0251OooO0o> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final oo000o f19512OooO00o = new oo000o();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final o0000O00 f19513OooO0O0 = o0000O00.OooO00o("content");

        @Override // p297o0O0OooO.o0000
        public final void OooO00o(Object obj, o0000O0 o0000o1) throws IOException {
            o0000o1.OooO0Oo(f19513OooO0O0, ((CrashlyticsReport.OooO.OooO0o.AbstractC0251OooO0o) obj).OooO00o());
        }
    }

    public final void OooO00o(o0O0o000.OooO00o<?> oooO00o) {
        OooO0o oooO0o = OooO0o.f19411OooO00o;
        p299o0O0o00.o00oO0o o00oo0o2 = (p299o0O0o00.o00oO0o) oooO00o;
        o00oo0o2.OooO00o(CrashlyticsReport.class, oooO0o);
        o00oo0o2.OooO00o(com.google.firebase.crashlytics.internal.model.OooO0O0.class, oooO0o);
        OooOOOO oooOOOO = OooOOOO.f19444OooO00o;
        o00oo0o2.OooO00o(CrashlyticsReport.OooO.class, oooOOOO);
        o00oo0o2.OooO00o(com.google.firebase.crashlytics.internal.model.OooOOO0.class, oooOOOO);
        OooOO0O oooOO0O = OooOO0O.f19423OooO00o;
        o00oo0o2.OooO00o(CrashlyticsReport.OooO.OooO00o.class, oooOO0O);
        o00oo0o2.OooO00o(com.google.firebase.crashlytics.internal.model.OooOOO.class, oooOO0O);
        OooOOO0 oooOOO0 = OooOOO0.f19441OooO00o;
        o00oo0o2.OooO00o(CrashlyticsReport.OooO.OooO00o.AbstractC0243OooO00o.class, oooOOO0);
        o00oo0o2.OooO00o(com.google.firebase.crashlytics.internal.model.OooOOOO.class, oooOOO0);
        o0ooOOo o0ooooo = o0ooOOo.f19510OooO00o;
        o00oo0o2.OooO00o(CrashlyticsReport.OooO.OooOO0.class, o0ooooo);
        o00oo0o2.OooO00o(o0OOO0o.class, o0ooooo);
        o00oO0o o00oo0o3 = o00oO0o.f19501OooO00o;
        o00oo0o2.OooO00o(CrashlyticsReport.OooO.AbstractC0242OooO.class, o00oo0o3);
        o00oo0o2.OooO00o(com.google.firebase.crashlytics.internal.model.o0ooOOo.class, o00oo0o3);
        OooOOO oooOOO = OooOOO.f19432OooO00o;
        o00oo0o2.OooO00o(CrashlyticsReport.OooO.OooO0OO.class, oooOOO);
        o00oo0o2.OooO00o(com.google.firebase.crashlytics.internal.model.OooOo00.class, oooOOO);
        o00Ooo o00ooo2 = o00Ooo.f19495OooO00o;
        o00oo0o2.OooO00o(CrashlyticsReport.OooO.OooO0o.class, o00ooo2);
        o00oo0o2.OooO00o(com.google.firebase.crashlytics.internal.model.OooOo.class, o00ooo2);
        OooOo00 oooOo00 = OooOo00.f19460OooO00o;
        o00oo0o2.OooO00o(CrashlyticsReport.OooO.OooO0o.OooO00o.class, oooOo00);
        o00oo0o2.OooO00o(com.google.firebase.crashlytics.internal.model.Oooo000.class, oooOo00);
        Oooo000 oooo000 = Oooo000.f19472OooO00o;
        o00oo0o2.OooO00o(CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.class, oooo000);
        o00oo0o2.OooO00o(com.google.firebase.crashlytics.internal.model.Oooo0.class, oooo000);
        o0OoOo0 o0oooo1 = o0OoOo0.f19506OooO00o;
        o00oo0o2.OooO00o(CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0248OooO0o.class, o0oooo1);
        o00oo0o2.OooO00o(com.google.firebase.crashlytics.internal.model.o00Oo0.class, o0oooo1);
        o00O0O o00o0o2 = o00O0O.f19482OooO00o;
        o00oo0o2.OooO00o(CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0248OooO0o.AbstractC0249OooO00o.class, o00o0o2);
        o00oo0o2.OooO00o(com.google.firebase.crashlytics.internal.model.o00Ooo.class, o00o0o2);
        Oooo0 oooo0 = Oooo0.f19466OooO00o;
        o00oo0o2.OooO00o(CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0247OooO0O0.class, oooo0);
        o00oo0o2.OooO00o(com.google.firebase.crashlytics.internal.model.o0OoOo0.class, oooo0);
        OooO0O0 oooO0O0 = OooO0O0.f19398OooO00o;
        o00oo0o2.OooO00o(CrashlyticsReport.OooO00o.class, oooO0O0);
        o00oo0o2.OooO00o(com.google.firebase.crashlytics.internal.model.OooO0OO.class, oooO0O0);
        C0253OooO00o c0253OooO00o = C0253OooO00o.f19393OooO00o;
        o00oo0o2.OooO00o(CrashlyticsReport.OooO00o.AbstractC0252OooO00o.class, c0253OooO00o);
        o00oo0o2.OooO00o(com.google.firebase.crashlytics.internal.model.OooO0o.class, c0253OooO00o);
        o000oOoO o000oooo2 = o000oOoO.f19478OooO00o;
        o00oo0o2.OooO00o(CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.OooO0OO.class, o000oooo2);
        o00oo0o2.OooO00o(com.google.firebase.crashlytics.internal.model.o00O0O.class, o000oooo2);
        OooOo oooOo = OooOo.f19455OooO00o;
        o00oo0o2.OooO00o(CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0245OooO00o.class, oooOo);
        o00oo0o2.OooO00o(com.google.firebase.crashlytics.internal.model.o000oOoO.class, oooOo);
        OooO0OO oooO0OO = OooO0OO.f19407OooO00o;
        o00oo0o2.OooO00o(CrashlyticsReport.OooO0OO.class, oooO0OO);
        o00oo0o2.OooO00o(com.google.firebase.crashlytics.internal.model.OooO.class, oooO0OO);
        o00Oo0 o00oo1 = o00Oo0.f19488OooO00o;
        o00oo0o2.OooO00o(CrashlyticsReport.OooO.OooO0o.OooO0OO.class, o00oo1);
        o00oo0o2.OooO00o(com.google.firebase.crashlytics.internal.model.oo000o.class, o00oo1);
        oo000o oo000oVar = oo000o.f19512OooO00o;
        o00oo0o2.OooO00o(CrashlyticsReport.OooO.OooO0o.AbstractC0251OooO0o.class, oo000oVar);
        o00oo0o2.OooO00o(com.google.firebase.crashlytics.internal.model.o00oO0o.class, oo000oVar);
        OooO oooO = OooO.f19390OooO00o;
        o00oo0o2.OooO00o(CrashlyticsReport.OooO0o.class, oooO);
        o00oo0o2.OooO00o(com.google.firebase.crashlytics.internal.model.OooOO0.class, oooO);
        OooOO0 oooOO1 = OooOO0.f19420OooO00o;
        o00oo0o2.OooO00o(CrashlyticsReport.OooO0o.OooO00o.class, oooOO1);
        o00oo0o2.OooO00o(com.google.firebase.crashlytics.internal.model.OooOO0O.class, oooOO1);
    }
}
