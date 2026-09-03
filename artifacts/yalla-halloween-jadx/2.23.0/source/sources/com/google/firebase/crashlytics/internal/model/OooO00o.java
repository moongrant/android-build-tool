package com.google.firebase.crashlytics.internal.model;

import com.facebook.appevents.integrity.IntegrityManager;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.facebook.internal.ServerProtocol;
import com.facebook.share.internal.ShareInternalUtility;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.remoteconfig.RemoteConfigConstants$RequestFieldKey;
import java.io.IOException;
import p294o0O0Ooo0.o0000O0;
import p294o0O0Ooo0.o0000O0O;
import p294o0O0Ooo0.o000OO;
import p295o0O0OooO.o00O0;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooO00o f19861OooO00o = new OooO00o();

    public static final class OooO implements o0000O0O<CrashlyticsReport.OooO0o> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO f19862OooO00o = new OooO();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final o0000O0 f19863OooO0O0 = o0000O0.OooO00o("files");

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final o0000O0 f19864OooO0OO = o0000O0.OooO00o("orgId");

        @Override // p294o0O0Ooo0.o0000oo
        public final void OooO00o(Object obj, o000OO o000oo2) throws IOException {
            CrashlyticsReport.OooO0o oooO0o = (CrashlyticsReport.OooO0o) obj;
            o000OO o000oo3 = o000oo2;
            o000oo3.OooO00o(f19863OooO0O0, oooO0o.OooO00o());
            o000oo3.OooO00o(f19864OooO0OO, oooO0o.OooO0O0());
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.model.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C0254OooO00o implements o0000O0O<CrashlyticsReport.OooO00o.AbstractC0253OooO00o> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final C0254OooO00o f19865OooO00o = new C0254OooO00o();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final o0000O0 f19866OooO0O0 = o0000O0.OooO00o("arch");

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final o0000O0 f19867OooO0OO = o0000O0.OooO00o("libraryName");

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o0000O0 f19868OooO0Oo = o0000O0.OooO00o("buildId");

        @Override // p294o0O0Ooo0.o0000oo
        public final void OooO00o(Object obj, o000OO o000oo2) throws IOException {
            CrashlyticsReport.OooO00o.AbstractC0253OooO00o abstractC0253OooO00o = (CrashlyticsReport.OooO00o.AbstractC0253OooO00o) obj;
            o000OO o000oo3 = o000oo2;
            o000oo3.OooO00o(f19866OooO0O0, abstractC0253OooO00o.OooO00o());
            o000oo3.OooO00o(f19867OooO0OO, abstractC0253OooO00o.OooO0OO());
            o000oo3.OooO00o(f19868OooO0Oo, abstractC0253OooO00o.OooO0O0());
        }
    }

    public static final class OooO0O0 implements o0000O0O<CrashlyticsReport.OooO00o> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO0O0 f19870OooO00o = new OooO0O0();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final o0000O0 f19871OooO0O0 = o0000O0.OooO00o("pid");

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final o0000O0 f19872OooO0OO = o0000O0.OooO00o("processName");

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o0000O0 f19873OooO0Oo = o0000O0.OooO00o("reasonCode");

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public static final o0000O0 f19875OooO0o0 = o0000O0.OooO00o("importance");

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public static final o0000O0 f19874OooO0o = o0000O0.OooO00o("pss");

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public static final o0000O0 f19876OooO0oO = o0000O0.OooO00o("rss");

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public static final o0000O0 f19877OooO0oo = o0000O0.OooO00o("timestamp");

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public static final o0000O0 f19869OooO = o0000O0.OooO00o("traceFile");

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public static final o0000O0 f19878OooOO0 = o0000O0.OooO00o("buildIdMappingForArch");

        @Override // p294o0O0Ooo0.o0000oo
        public final void OooO00o(Object obj, o000OO o000oo2) throws IOException {
            CrashlyticsReport.OooO00o oooO00o = (CrashlyticsReport.OooO00o) obj;
            o000OO o000oo3 = o000oo2;
            o000oo3.OooO0o0(f19871OooO0O0, oooO00o.OooO0OO());
            o000oo3.OooO00o(f19872OooO0OO, oooO00o.OooO0Oo());
            o000oo3.OooO0o0(f19873OooO0Oo, oooO00o.OooO0o());
            o000oo3.OooO0o0(f19875OooO0o0, oooO00o.OooO0O0());
            o000oo3.OooO0o(f19874OooO0o, oooO00o.OooO0o0());
            o000oo3.OooO0o(f19876OooO0oO, oooO00o.OooO0oO());
            o000oo3.OooO0o(f19877OooO0oo, oooO00o.OooO0oo());
            o000oo3.OooO00o(f19869OooO, oooO00o.OooO());
            o000oo3.OooO00o(f19878OooOO0, oooO00o.OooO00o());
        }
    }

    public static final class OooO0OO implements o0000O0O<CrashlyticsReport.OooO0OO> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO0OO f19879OooO00o = new OooO0OO();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final o0000O0 f19880OooO0O0 = o0000O0.OooO00o("key");

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final o0000O0 f19881OooO0OO = o0000O0.OooO00o(AppMeasurementSdk.ConditionalUserProperty.VALUE);

        @Override // p294o0O0Ooo0.o0000oo
        public final void OooO00o(Object obj, o000OO o000oo2) throws IOException {
            CrashlyticsReport.OooO0OO oooO0OO = (CrashlyticsReport.OooO0OO) obj;
            o000OO o000oo3 = o000oo2;
            o000oo3.OooO00o(f19880OooO0O0, oooO0OO.OooO00o());
            o000oo3.OooO00o(f19881OooO0OO, oooO0OO.OooO0O0());
        }
    }

    public static final class OooO0o implements o0000O0O<CrashlyticsReport> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO0o f19883OooO00o = new OooO0o();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final o0000O0 f19884OooO0O0 = o0000O0.OooO00o(RemoteConfigConstants$RequestFieldKey.SDK_VERSION);

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final o0000O0 f19885OooO0OO = o0000O0.OooO00o("gmpAppId");

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o0000O0 f19886OooO0Oo = o0000O0.OooO00o("platform");

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public static final o0000O0 f19888OooO0o0 = o0000O0.OooO00o("installationUuid");

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public static final o0000O0 f19887OooO0o = o0000O0.OooO00o("buildVersion");

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public static final o0000O0 f19889OooO0oO = o0000O0.OooO00o("displayVersion");

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public static final o0000O0 f19890OooO0oo = o0000O0.OooO00o("session");

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public static final o0000O0 f19882OooO = o0000O0.OooO00o("ndkPayload");

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public static final o0000O0 f19891OooOO0 = o0000O0.OooO00o("appExitInfo");

        @Override // p294o0O0Ooo0.o0000oo
        public final void OooO00o(Object obj, o000OO o000oo2) throws IOException {
            CrashlyticsReport crashlyticsReport = (CrashlyticsReport) obj;
            o000OO o000oo3 = o000oo2;
            o000oo3.OooO00o(f19884OooO0O0, crashlyticsReport.OooO0oo());
            o000oo3.OooO00o(f19885OooO0OO, crashlyticsReport.OooO0Oo());
            o000oo3.OooO0o0(f19886OooO0Oo, crashlyticsReport.OooO0oO());
            o000oo3.OooO00o(f19888OooO0o0, crashlyticsReport.OooO0o0());
            o000oo3.OooO00o(f19887OooO0o, crashlyticsReport.OooO0O0());
            o000oo3.OooO00o(f19889OooO0oO, crashlyticsReport.OooO0OO());
            o000oo3.OooO00o(f19890OooO0oo, crashlyticsReport.OooO());
            o000oo3.OooO00o(f19882OooO, crashlyticsReport.OooO0o());
            o000oo3.OooO00o(f19891OooOO0, crashlyticsReport.OooO00o());
        }
    }

    public static final class OooOO0 implements o0000O0O<CrashlyticsReport.OooO0o.OooO00o> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooOO0 f19892OooO00o = new OooOO0();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final o0000O0 f19893OooO0O0 = o0000O0.OooO00o("filename");

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final o0000O0 f19894OooO0OO = o0000O0.OooO00o("contents");

        @Override // p294o0O0Ooo0.o0000oo
        public final void OooO00o(Object obj, o000OO o000oo2) throws IOException {
            CrashlyticsReport.OooO0o.OooO00o oooO00o = (CrashlyticsReport.OooO0o.OooO00o) obj;
            o000OO o000oo3 = o000oo2;
            o000oo3.OooO00o(f19893OooO0O0, oooO00o.OooO0O0());
            o000oo3.OooO00o(f19894OooO0OO, oooO00o.OooO00o());
        }
    }

    public static final class OooOO0O implements o0000O0O<CrashlyticsReport.OooO.OooO00o> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooOO0O f19895OooO00o = new OooOO0O();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final o0000O0 f19896OooO0O0 = o0000O0.OooO00o("identifier");

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final o0000O0 f19897OooO0OO = o0000O0.OooO00o(ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION);

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o0000O0 f19898OooO0Oo = o0000O0.OooO00o("displayVersion");

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public static final o0000O0 f19900OooO0o0 = o0000O0.OooO00o("organization");

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public static final o0000O0 f19899OooO0o = o0000O0.OooO00o("installationUuid");

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public static final o0000O0 f19901OooO0oO = o0000O0.OooO00o("developmentPlatform");

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public static final o0000O0 f19902OooO0oo = o0000O0.OooO00o("developmentPlatformVersion");

        @Override // p294o0O0Ooo0.o0000oo
        public final void OooO00o(Object obj, o000OO o000oo2) throws IOException {
            CrashlyticsReport.OooO.OooO00o oooO00o = (CrashlyticsReport.OooO.OooO00o) obj;
            o000OO o000oo3 = o000oo2;
            o000oo3.OooO00o(f19896OooO0O0, oooO00o.OooO0Oo());
            o000oo3.OooO00o(f19897OooO0OO, oooO00o.OooO0oO());
            o000oo3.OooO00o(f19898OooO0Oo, oooO00o.OooO0OO());
            o000oo3.OooO00o(f19900OooO0o0, oooO00o.OooO0o());
            o000oo3.OooO00o(f19899OooO0o, oooO00o.OooO0o0());
            o000oo3.OooO00o(f19901OooO0oO, oooO00o.OooO00o());
            o000oo3.OooO00o(f19902OooO0oo, oooO00o.OooO0O0());
        }
    }

    public static final class OooOOO implements o0000O0O<CrashlyticsReport.OooO.OooO0OO> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooOOO f19904OooO00o = new OooOOO();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final o0000O0 f19905OooO0O0 = o0000O0.OooO00o("arch");

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final o0000O0 f19906OooO0OO = o0000O0.OooO00o(DeviceRequestsHelper.DEVICE_INFO_MODEL);

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o0000O0 f19907OooO0Oo = o0000O0.OooO00o("cores");

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public static final o0000O0 f19909OooO0o0 = o0000O0.OooO00o("ram");

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public static final o0000O0 f19908OooO0o = o0000O0.OooO00o("diskSpace");

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public static final o0000O0 f19910OooO0oO = o0000O0.OooO00o("simulator");

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public static final o0000O0 f19911OooO0oo = o0000O0.OooO00o("state");

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public static final o0000O0 f19903OooO = o0000O0.OooO00o("manufacturer");

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public static final o0000O0 f19912OooOO0 = o0000O0.OooO00o("modelClass");

        @Override // p294o0O0Ooo0.o0000oo
        public final void OooO00o(Object obj, o000OO o000oo2) throws IOException {
            CrashlyticsReport.OooO.OooO0OO oooO0OO = (CrashlyticsReport.OooO.OooO0OO) obj;
            o000OO o000oo3 = o000oo2;
            o000oo3.OooO0o0(f19905OooO0O0, oooO0OO.OooO00o());
            o000oo3.OooO00o(f19906OooO0OO, oooO0OO.OooO0o0());
            o000oo3.OooO0o0(f19907OooO0Oo, oooO0OO.OooO0O0());
            o000oo3.OooO0o(f19909OooO0o0, oooO0OO.OooO0oO());
            o000oo3.OooO0o(f19908OooO0o, oooO0OO.OooO0OO());
            o000oo3.OooO0OO(f19910OooO0oO, oooO0OO.OooO());
            o000oo3.OooO0o0(f19911OooO0oo, oooO0OO.OooO0oo());
            o000oo3.OooO00o(f19903OooO, oooO0OO.OooO0Oo());
            o000oo3.OooO00o(f19912OooOO0, oooO0OO.OooO0o());
        }
    }

    public static final class OooOOO0 implements o0000O0O<CrashlyticsReport.OooO.OooO00o.AbstractC0244OooO00o> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooOOO0 f19913OooO00o = new OooOOO0();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final o0000O0 f19914OooO0O0 = o0000O0.OooO00o("clsId");

        @Override // p294o0O0Ooo0.o0000oo
        public final void OooO00o(Object obj, o000OO o000oo2) throws IOException {
            ((CrashlyticsReport.OooO.OooO00o.AbstractC0244OooO00o) obj).OooO00o();
            o000oo2.OooO00o(f19914OooO0O0, null);
        }
    }

    public static final class OooOOOO implements o0000O0O<CrashlyticsReport.OooO> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooOOOO f19916OooO00o = new OooOOOO();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final o0000O0 f19917OooO0O0 = o0000O0.OooO00o("generator");

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final o0000O0 f19918OooO0OO = o0000O0.OooO00o("identifier");

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o0000O0 f19919OooO0Oo = o0000O0.OooO00o("startedAt");

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public static final o0000O0 f19921OooO0o0 = o0000O0.OooO00o("endedAt");

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public static final o0000O0 f19920OooO0o = o0000O0.OooO00o("crashed");

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public static final o0000O0 f19922OooO0oO = o0000O0.OooO00o("app");

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public static final o0000O0 f19923OooO0oo = o0000O0.OooO00o("user");

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public static final o0000O0 f19915OooO = o0000O0.OooO00o("os");

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public static final o0000O0 f19924OooOO0 = o0000O0.OooO00o(DeviceRequestsHelper.DEVICE_INFO_DEVICE);

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public static final o0000O0 f19925OooOO0O = o0000O0.OooO00o("events");

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public static final o0000O0 f19926OooOO0o = o0000O0.OooO00o("generatorType");

        @Override // p294o0O0Ooo0.o0000oo
        public final void OooO00o(Object obj, o000OO o000oo2) throws IOException {
            CrashlyticsReport.OooO oooO = (CrashlyticsReport.OooO) obj;
            o000OO o000oo3 = o000oo2;
            o000oo3.OooO00o(f19917OooO0O0, oooO.OooO0o0());
            o000oo3.OooO00o(f19918OooO0OO, oooO.OooO0oO().getBytes(CrashlyticsReport.f19858OooO00o));
            o000oo3.OooO0o(f19919OooO0Oo, oooO.OooO());
            o000oo3.OooO00o(f19921OooO0o0, oooO.OooO0OO());
            o000oo3.OooO0OO(f19920OooO0o, oooO.OooOO0O());
            o000oo3.OooO00o(f19922OooO0oO, oooO.OooO00o());
            o000oo3.OooO00o(f19923OooO0oo, oooO.OooOO0());
            o000oo3.OooO00o(f19915OooO, oooO.OooO0oo());
            o000oo3.OooO00o(f19924OooOO0, oooO.OooO0O0());
            o000oo3.OooO00o(f19925OooOO0O, oooO.OooO0Oo());
            o000oo3.OooO0o0(f19926OooOO0o, oooO.OooO0o());
        }
    }

    public static final class OooOo implements o0000O0O<CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0246OooO00o> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooOo f19927OooO00o = new OooOo();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final o0000O0 f19928OooO0O0 = o0000O0.OooO00o("baseAddress");

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final o0000O0 f19929OooO0OO = o0000O0.OooO00o("size");

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o0000O0 f19930OooO0Oo = o0000O0.OooO00o("name");

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public static final o0000O0 f19931OooO0o0 = o0000O0.OooO00o("uuid");

        @Override // p294o0O0Ooo0.o0000oo
        public final void OooO00o(Object obj, o000OO o000oo2) throws IOException {
            CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0246OooO00o abstractC0246OooO00o = (CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0246OooO00o) obj;
            o000OO o000oo3 = o000oo2;
            o000oo3.OooO0o(f19928OooO0O0, abstractC0246OooO00o.OooO00o());
            o000oo3.OooO0o(f19929OooO0OO, abstractC0246OooO00o.OooO0OO());
            o000oo3.OooO00o(f19930OooO0Oo, abstractC0246OooO00o.OooO0O0());
            String strOooO0Oo = abstractC0246OooO00o.OooO0Oo();
            o000oo3.OooO00o(f19931OooO0o0, strOooO0Oo != null ? strOooO0Oo.getBytes(CrashlyticsReport.f19858OooO00o) : null);
        }
    }

    public static final class OooOo00 implements o0000O0O<CrashlyticsReport.OooO.OooO0o.OooO00o> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooOo00 f19932OooO00o = new OooOo00();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final o0000O0 f19933OooO0O0 = o0000O0.OooO00o("execution");

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final o0000O0 f19934OooO0OO = o0000O0.OooO00o("customAttributes");

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o0000O0 f19935OooO0Oo = o0000O0.OooO00o("internalKeys");

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public static final o0000O0 f19937OooO0o0 = o0000O0.OooO00o("background");

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public static final o0000O0 f19936OooO0o = o0000O0.OooO00o("uiOrientation");

        @Override // p294o0O0Ooo0.o0000oo
        public final void OooO00o(Object obj, o000OO o000oo2) throws IOException {
            CrashlyticsReport.OooO.OooO0o.OooO00o oooO00o = (CrashlyticsReport.OooO.OooO0o.OooO00o) obj;
            o000OO o000oo3 = o000oo2;
            o000oo3.OooO00o(f19933OooO0O0, oooO00o.OooO0OO());
            o000oo3.OooO00o(f19934OooO0OO, oooO00o.OooO0O0());
            o000oo3.OooO00o(f19935OooO0Oo, oooO00o.OooO0Oo());
            o000oo3.OooO00o(f19937OooO0o0, oooO00o.OooO00o());
            o000oo3.OooO0o0(f19936OooO0o, oooO00o.OooO0o0());
        }
    }

    public static final class Oooo0 implements o0000O0O<CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0248OooO0O0> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final Oooo0 f19938OooO00o = new Oooo0();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final o0000O0 f19939OooO0O0 = o0000O0.OooO00o("type");

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final o0000O0 f19940OooO0OO = o0000O0.OooO00o("reason");

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o0000O0 f19941OooO0Oo = o0000O0.OooO00o("frames");

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public static final o0000O0 f19943OooO0o0 = o0000O0.OooO00o("causedBy");

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public static final o0000O0 f19942OooO0o = o0000O0.OooO00o("overflowCount");

        @Override // p294o0O0Ooo0.o0000oo
        public final void OooO00o(Object obj, o000OO o000oo2) throws IOException {
            CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0248OooO0O0 abstractC0248OooO0O0 = (CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0248OooO0O0) obj;
            o000OO o000oo3 = o000oo2;
            o000oo3.OooO00o(f19939OooO0O0, abstractC0248OooO0O0.OooO0o0());
            o000oo3.OooO00o(f19940OooO0OO, abstractC0248OooO0O0.OooO0Oo());
            o000oo3.OooO00o(f19941OooO0Oo, abstractC0248OooO0O0.OooO0O0());
            o000oo3.OooO00o(f19943OooO0o0, abstractC0248OooO0O0.OooO00o());
            o000oo3.OooO0o0(f19942OooO0o, abstractC0248OooO0O0.OooO0OO());
        }
    }

    public static final class Oooo000 implements o0000O0O<CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final Oooo000 f19944OooO00o = new Oooo000();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final o0000O0 f19945OooO0O0 = o0000O0.OooO00o("threads");

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final o0000O0 f19946OooO0OO = o0000O0.OooO00o("exception");

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o0000O0 f19947OooO0Oo = o0000O0.OooO00o("appExitInfo");

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public static final o0000O0 f19949OooO0o0 = o0000O0.OooO00o("signal");

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public static final o0000O0 f19948OooO0o = o0000O0.OooO00o("binaries");

        @Override // p294o0O0Ooo0.o0000oo
        public final void OooO00o(Object obj, o000OO o000oo2) throws IOException {
            CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0 oooO0O0 = (CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0) obj;
            o000OO o000oo3 = o000oo2;
            o000oo3.OooO00o(f19945OooO0O0, oooO0O0.OooO0o0());
            o000oo3.OooO00o(f19946OooO0OO, oooO0O0.OooO0OO());
            o000oo3.OooO00o(f19947OooO0Oo, oooO0O0.OooO00o());
            o000oo3.OooO00o(f19949OooO0o0, oooO0O0.OooO0Oo());
            o000oo3.OooO00o(f19948OooO0o, oooO0O0.OooO0O0());
        }
    }

    public static final class o000oOoO implements o0000O0O<CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.OooO0OO> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final o000oOoO f19950OooO00o = new o000oOoO();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final o0000O0 f19951OooO0O0 = o0000O0.OooO00o("name");

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final o0000O0 f19952OooO0OO = o0000O0.OooO00o("code");

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o0000O0 f19953OooO0Oo = o0000O0.OooO00o(IntegrityManager.INTEGRITY_TYPE_ADDRESS);

        @Override // p294o0O0Ooo0.o0000oo
        public final void OooO00o(Object obj, o000OO o000oo2) throws IOException {
            CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.OooO0OO oooO0OO = (CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.OooO0OO) obj;
            o000OO o000oo3 = o000oo2;
            o000oo3.OooO00o(f19951OooO0O0, oooO0OO.OooO0OO());
            o000oo3.OooO00o(f19952OooO0OO, oooO0OO.OooO0O0());
            o000oo3.OooO0o(f19953OooO0Oo, oooO0OO.OooO00o());
        }
    }

    public static final class o00O0O implements o0000O0O<CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0249OooO0o.AbstractC0250OooO00o> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final o00O0O f19954OooO00o = new o00O0O();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final o0000O0 f19955OooO0O0 = o0000O0.OooO00o("pc");

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final o0000O0 f19956OooO0OO = o0000O0.OooO00o("symbol");

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o0000O0 f19957OooO0Oo = o0000O0.OooO00o(ShareInternalUtility.STAGING_PARAM);

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public static final o0000O0 f19959OooO0o0 = o0000O0.OooO00o("offset");

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public static final o0000O0 f19958OooO0o = o0000O0.OooO00o("importance");

        @Override // p294o0O0Ooo0.o0000oo
        public final void OooO00o(Object obj, o000OO o000oo2) throws IOException {
            CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0249OooO0o.AbstractC0250OooO00o abstractC0250OooO00o = (CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0249OooO0o.AbstractC0250OooO00o) obj;
            o000OO o000oo3 = o000oo2;
            o000oo3.OooO0o(f19955OooO0O0, abstractC0250OooO00o.OooO0Oo());
            o000oo3.OooO00o(f19956OooO0OO, abstractC0250OooO00o.OooO0o0());
            o000oo3.OooO00o(f19957OooO0Oo, abstractC0250OooO00o.OooO00o());
            o000oo3.OooO0o(f19959OooO0o0, abstractC0250OooO00o.OooO0OO());
            o000oo3.OooO0o0(f19958OooO0o, abstractC0250OooO00o.OooO0O0());
        }
    }

    public static final class o00Oo0 implements o0000O0O<CrashlyticsReport.OooO.OooO0o.OooO0OO> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final o00Oo0 f19960OooO00o = new o00Oo0();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final o0000O0 f19961OooO0O0 = o0000O0.OooO00o("batteryLevel");

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final o0000O0 f19962OooO0OO = o0000O0.OooO00o("batteryVelocity");

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o0000O0 f19963OooO0Oo = o0000O0.OooO00o("proximityOn");

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public static final o0000O0 f19965OooO0o0 = o0000O0.OooO00o("orientation");

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public static final o0000O0 f19964OooO0o = o0000O0.OooO00o("ramUsed");

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public static final o0000O0 f19966OooO0oO = o0000O0.OooO00o("diskUsed");

        @Override // p294o0O0Ooo0.o0000oo
        public final void OooO00o(Object obj, o000OO o000oo2) throws IOException {
            CrashlyticsReport.OooO.OooO0o.OooO0OO oooO0OO = (CrashlyticsReport.OooO.OooO0o.OooO0OO) obj;
            o000OO o000oo3 = o000oo2;
            o000oo3.OooO00o(f19961OooO0O0, oooO0OO.OooO00o());
            o000oo3.OooO0o0(f19962OooO0OO, oooO0OO.OooO0O0());
            o000oo3.OooO0OO(f19963OooO0Oo, oooO0OO.OooO0o());
            o000oo3.OooO0o0(f19965OooO0o0, oooO0OO.OooO0Oo());
            o000oo3.OooO0o(f19964OooO0o, oooO0OO.OooO0o0());
            o000oo3.OooO0o(f19966OooO0oO, oooO0OO.OooO0OO());
        }
    }

    public static final class o00Ooo implements o0000O0O<CrashlyticsReport.OooO.OooO0o> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final o00Ooo f19967OooO00o = new o00Ooo();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final o0000O0 f19968OooO0O0 = o0000O0.OooO00o("timestamp");

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final o0000O0 f19969OooO0OO = o0000O0.OooO00o("type");

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o0000O0 f19970OooO0Oo = o0000O0.OooO00o("app");

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public static final o0000O0 f19972OooO0o0 = o0000O0.OooO00o(DeviceRequestsHelper.DEVICE_INFO_DEVICE);

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public static final o0000O0 f19971OooO0o = o0000O0.OooO00o("log");

        @Override // p294o0O0Ooo0.o0000oo
        public final void OooO00o(Object obj, o000OO o000oo2) throws IOException {
            CrashlyticsReport.OooO.OooO0o oooO0o = (CrashlyticsReport.OooO.OooO0o) obj;
            o000OO o000oo3 = o000oo2;
            o000oo3.OooO0o(f19968OooO0O0, oooO0o.OooO0Oo());
            o000oo3.OooO00o(f19969OooO0OO, oooO0o.OooO0o0());
            o000oo3.OooO00o(f19970OooO0Oo, oooO0o.OooO00o());
            o000oo3.OooO00o(f19972OooO0o0, oooO0o.OooO0O0());
            o000oo3.OooO00o(f19971OooO0o, oooO0o.OooO0OO());
        }
    }

    public static final class o00oO0o implements o0000O0O<CrashlyticsReport.OooO.AbstractC0243OooO> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final o00oO0o f19973OooO00o = new o00oO0o();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final o0000O0 f19974OooO0O0 = o0000O0.OooO00o("platform");

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final o0000O0 f19975OooO0OO = o0000O0.OooO00o(ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION);

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o0000O0 f19976OooO0Oo = o0000O0.OooO00o("buildVersion");

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public static final o0000O0 f19977OooO0o0 = o0000O0.OooO00o("jailbroken");

        @Override // p294o0O0Ooo0.o0000oo
        public final void OooO00o(Object obj, o000OO o000oo2) throws IOException {
            CrashlyticsReport.OooO.AbstractC0243OooO abstractC0243OooO = (CrashlyticsReport.OooO.AbstractC0243OooO) obj;
            o000OO o000oo3 = o000oo2;
            o000oo3.OooO0o0(f19974OooO0O0, abstractC0243OooO.OooO0O0());
            o000oo3.OooO00o(f19975OooO0OO, abstractC0243OooO.OooO0OO());
            o000oo3.OooO00o(f19976OooO0Oo, abstractC0243OooO.OooO00o());
            o000oo3.OooO0OO(f19977OooO0o0, abstractC0243OooO.OooO0Oo());
        }
    }

    public static final class o0OoOo0 implements o0000O0O<CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0249OooO0o> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final o0OoOo0 f19978OooO00o = new o0OoOo0();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final o0000O0 f19979OooO0O0 = o0000O0.OooO00o("name");

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final o0000O0 f19980OooO0OO = o0000O0.OooO00o("importance");

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o0000O0 f19981OooO0Oo = o0000O0.OooO00o("frames");

        @Override // p294o0O0Ooo0.o0000oo
        public final void OooO00o(Object obj, o000OO o000oo2) throws IOException {
            CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0249OooO0o abstractC0249OooO0o = (CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0249OooO0o) obj;
            o000OO o000oo3 = o000oo2;
            o000oo3.OooO00o(f19979OooO0O0, abstractC0249OooO0o.OooO0OO());
            o000oo3.OooO0o0(f19980OooO0OO, abstractC0249OooO0o.OooO0O0());
            o000oo3.OooO00o(f19981OooO0Oo, abstractC0249OooO0o.OooO00o());
        }
    }

    public static final class o0ooOOo implements o0000O0O<CrashlyticsReport.OooO.OooOO0> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final o0ooOOo f19982OooO00o = new o0ooOOo();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final o0000O0 f19983OooO0O0 = o0000O0.OooO00o("identifier");

        @Override // p294o0O0Ooo0.o0000oo
        public final void OooO00o(Object obj, o000OO o000oo2) throws IOException {
            o000oo2.OooO00o(f19983OooO0O0, ((CrashlyticsReport.OooO.OooOO0) obj).OooO00o());
        }
    }

    public static final class oo000o implements o0000O0O<CrashlyticsReport.OooO.OooO0o.AbstractC0252OooO0o> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final oo000o f19984OooO00o = new oo000o();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final o0000O0 f19985OooO0O0 = o0000O0.OooO00o("content");

        @Override // p294o0O0Ooo0.o0000oo
        public final void OooO00o(Object obj, o000OO o000oo2) throws IOException {
            o000oo2.OooO00o(f19985OooO0O0, ((CrashlyticsReport.OooO.OooO0o.AbstractC0252OooO0o) obj).OooO00o());
        }
    }

    public final void OooO00o(p293o0O0Ooo.Oooo0<?> oooo0) {
        OooO0o oooO0o = OooO0o.f19883OooO00o;
        o00O0 o00o1 = (o00O0) oooo0;
        o00o1.OooO00o(CrashlyticsReport.class, oooO0o);
        o00o1.OooO00o(com.google.firebase.crashlytics.internal.model.OooO0O0.class, oooO0o);
        OooOOOO oooOOOO = OooOOOO.f19916OooO00o;
        o00o1.OooO00o(CrashlyticsReport.OooO.class, oooOOOO);
        o00o1.OooO00o(com.google.firebase.crashlytics.internal.model.OooOOO0.class, oooOOOO);
        OooOO0O oooOO0O = OooOO0O.f19895OooO00o;
        o00o1.OooO00o(CrashlyticsReport.OooO.OooO00o.class, oooOO0O);
        o00o1.OooO00o(com.google.firebase.crashlytics.internal.model.OooOOO.class, oooOO0O);
        OooOOO0 oooOOO0 = OooOOO0.f19913OooO00o;
        o00o1.OooO00o(CrashlyticsReport.OooO.OooO00o.AbstractC0244OooO00o.class, oooOOO0);
        o00o1.OooO00o(com.google.firebase.crashlytics.internal.model.OooOOOO.class, oooOOO0);
        o0ooOOo o0ooooo = o0ooOOo.f19982OooO00o;
        o00o1.OooO00o(CrashlyticsReport.OooO.OooOO0.class, o0ooooo);
        o00o1.OooO00o(o0OOO0o.class, o0ooooo);
        o00oO0o o00oo0o2 = o00oO0o.f19973OooO00o;
        o00o1.OooO00o(CrashlyticsReport.OooO.AbstractC0243OooO.class, o00oo0o2);
        o00o1.OooO00o(com.google.firebase.crashlytics.internal.model.o0ooOOo.class, o00oo0o2);
        OooOOO oooOOO = OooOOO.f19904OooO00o;
        o00o1.OooO00o(CrashlyticsReport.OooO.OooO0OO.class, oooOOO);
        o00o1.OooO00o(com.google.firebase.crashlytics.internal.model.OooOo00.class, oooOOO);
        o00Ooo o00ooo2 = o00Ooo.f19967OooO00o;
        o00o1.OooO00o(CrashlyticsReport.OooO.OooO0o.class, o00ooo2);
        o00o1.OooO00o(com.google.firebase.crashlytics.internal.model.OooOo.class, o00ooo2);
        OooOo00 oooOo00 = OooOo00.f19932OooO00o;
        o00o1.OooO00o(CrashlyticsReport.OooO.OooO0o.OooO00o.class, oooOo00);
        o00o1.OooO00o(com.google.firebase.crashlytics.internal.model.Oooo000.class, oooOo00);
        Oooo000 oooo000 = Oooo000.f19944OooO00o;
        o00o1.OooO00o(CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.class, oooo000);
        o00o1.OooO00o(com.google.firebase.crashlytics.internal.model.Oooo0.class, oooo000);
        o0OoOo0 o0oooo0 = o0OoOo0.f19978OooO00o;
        o00o1.OooO00o(CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0249OooO0o.class, o0oooo0);
        o00o1.OooO00o(com.google.firebase.crashlytics.internal.model.o00Oo0.class, o0oooo0);
        o00O0O o00o0o2 = o00O0O.f19954OooO00o;
        o00o1.OooO00o(CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0249OooO0o.AbstractC0250OooO00o.class, o00o0o2);
        o00o1.OooO00o(com.google.firebase.crashlytics.internal.model.o00Ooo.class, o00o0o2);
        Oooo0 oooo1 = Oooo0.f19938OooO00o;
        o00o1.OooO00o(CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0248OooO0O0.class, oooo1);
        o00o1.OooO00o(com.google.firebase.crashlytics.internal.model.o0OoOo0.class, oooo1);
        OooO0O0 oooO0O0 = OooO0O0.f19870OooO00o;
        o00o1.OooO00o(CrashlyticsReport.OooO00o.class, oooO0O0);
        o00o1.OooO00o(com.google.firebase.crashlytics.internal.model.OooO0OO.class, oooO0O0);
        C0254OooO00o c0254OooO00o = C0254OooO00o.f19865OooO00o;
        o00o1.OooO00o(CrashlyticsReport.OooO00o.AbstractC0253OooO00o.class, c0254OooO00o);
        o00o1.OooO00o(com.google.firebase.crashlytics.internal.model.OooO0o.class, c0254OooO00o);
        o000oOoO o000oooo2 = o000oOoO.f19950OooO00o;
        o00o1.OooO00o(CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.OooO0OO.class, o000oooo2);
        o00o1.OooO00o(com.google.firebase.crashlytics.internal.model.o00O0O.class, o000oooo2);
        OooOo oooOo = OooOo.f19927OooO00o;
        o00o1.OooO00o(CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0246OooO00o.class, oooOo);
        o00o1.OooO00o(com.google.firebase.crashlytics.internal.model.o000oOoO.class, oooOo);
        OooO0OO oooO0OO = OooO0OO.f19879OooO00o;
        o00o1.OooO00o(CrashlyticsReport.OooO0OO.class, oooO0OO);
        o00o1.OooO00o(com.google.firebase.crashlytics.internal.model.OooO.class, oooO0OO);
        o00Oo0 o00oo1 = o00Oo0.f19960OooO00o;
        o00o1.OooO00o(CrashlyticsReport.OooO.OooO0o.OooO0OO.class, o00oo1);
        o00o1.OooO00o(com.google.firebase.crashlytics.internal.model.oo000o.class, o00oo1);
        oo000o oo000oVar = oo000o.f19984OooO00o;
        o00o1.OooO00o(CrashlyticsReport.OooO.OooO0o.AbstractC0252OooO0o.class, oo000oVar);
        o00o1.OooO00o(com.google.firebase.crashlytics.internal.model.o00oO0o.class, oo000oVar);
        OooO oooO = OooO.f19862OooO00o;
        o00o1.OooO00o(CrashlyticsReport.OooO0o.class, oooO);
        o00o1.OooO00o(com.google.firebase.crashlytics.internal.model.OooOO0.class, oooO);
        OooOO0 oooOO1 = OooOO0.f19892OooO00o;
        o00o1.OooO00o(CrashlyticsReport.OooO0o.OooO00o.class, oooOO1);
        o00o1.OooO00o(com.google.firebase.crashlytics.internal.model.OooOO0O.class, oooOO1);
    }
}
