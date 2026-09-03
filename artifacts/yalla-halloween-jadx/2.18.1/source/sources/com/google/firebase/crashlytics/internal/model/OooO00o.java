package com.google.firebase.crashlytics.internal.model;

import com.facebook.appevents.integrity.IntegrityManager;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.facebook.internal.ServerProtocol;
import com.facebook.share.internal.ShareInternalUtility;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.umeng.analytics.pro.ak;
import com.umeng.analytics.pro.d;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooO00o f18796OooO00o = new OooO00o();

    public static final class OooO implements p368o0OOo0O.o000oOoO<CrashlyticsReport.OooO0o.OooO00o> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO f18797OooO00o = new OooO();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final p368o0OOo0O.Oooo0 f18798OooO0O0 = p368o0OOo0O.Oooo0.OooO00o("filename");

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final p368o0OOo0O.Oooo0 f18799OooO0OO = p368o0OOo0O.Oooo0.OooO00o("contents");

        @Override // p368o0OOo0O.Oooo000
        public final void OooO00o(Object obj, p368o0OOo0O.o0OoOo0 o0oooo1) throws IOException {
            CrashlyticsReport.OooO0o.OooO00o oooO00o = (CrashlyticsReport.OooO0o.OooO00o) obj;
            p368o0OOo0O.o0OoOo0 o0oooo2 = o0oooo1;
            o0oooo2.OooO0Oo(f18798OooO0O0, oooO00o.OooO0O0());
            o0oooo2.OooO0Oo(f18799OooO0OO, oooO00o.OooO00o());
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.model.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C0150OooO00o implements p368o0OOo0O.o000oOoO<CrashlyticsReport.OooO00o> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final C0150OooO00o f18801OooO00o = new C0150OooO00o();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final p368o0OOo0O.Oooo0 f18802OooO0O0 = p368o0OOo0O.Oooo0.OooO00o("pid");

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final p368o0OOo0O.Oooo0 f18803OooO0OO = p368o0OOo0O.Oooo0.OooO00o("processName");

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final p368o0OOo0O.Oooo0 f18804OooO0Oo = p368o0OOo0O.Oooo0.OooO00o("reasonCode");

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public static final p368o0OOo0O.Oooo0 f18806OooO0o0 = p368o0OOo0O.Oooo0.OooO00o("importance");

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public static final p368o0OOo0O.Oooo0 f18805OooO0o = p368o0OOo0O.Oooo0.OooO00o("pss");

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public static final p368o0OOo0O.Oooo0 f18807OooO0oO = p368o0OOo0O.Oooo0.OooO00o("rss");

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public static final p368o0OOo0O.Oooo0 f18808OooO0oo = p368o0OOo0O.Oooo0.OooO00o("timestamp");

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public static final p368o0OOo0O.Oooo0 f18800OooO = p368o0OOo0O.Oooo0.OooO00o("traceFile");

        @Override // p368o0OOo0O.Oooo000
        public final void OooO00o(Object obj, p368o0OOo0O.o0OoOo0 o0oooo1) throws IOException {
            CrashlyticsReport.OooO00o oooO00o = (CrashlyticsReport.OooO00o) obj;
            p368o0OOo0O.o0OoOo0 o0oooo2 = o0oooo1;
            o0oooo2.OooO0OO(f18802OooO0O0, oooO00o.OooO0O0());
            o0oooo2.OooO0Oo(f18803OooO0OO, oooO00o.OooO0OO());
            o0oooo2.OooO0OO(f18804OooO0Oo, oooO00o.OooO0o0());
            o0oooo2.OooO0OO(f18806OooO0o0, oooO00o.OooO00o());
            o0oooo2.OooO0O0(f18805OooO0o, oooO00o.OooO0Oo());
            o0oooo2.OooO0O0(f18807OooO0oO, oooO00o.OooO0o());
            o0oooo2.OooO0O0(f18808OooO0oo, oooO00o.OooO0oO());
            o0oooo2.OooO0Oo(f18800OooO, oooO00o.OooO0oo());
        }
    }

    public static final class OooO0O0 implements p368o0OOo0O.o000oOoO<CrashlyticsReport.OooO0OO> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO0O0 f18809OooO00o = new OooO0O0();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final p368o0OOo0O.Oooo0 f18810OooO0O0 = p368o0OOo0O.Oooo0.OooO00o("key");

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final p368o0OOo0O.Oooo0 f18811OooO0OO = p368o0OOo0O.Oooo0.OooO00o(AppMeasurementSdk.ConditionalUserProperty.VALUE);

        @Override // p368o0OOo0O.Oooo000
        public final void OooO00o(Object obj, p368o0OOo0O.o0OoOo0 o0oooo1) throws IOException {
            CrashlyticsReport.OooO0OO oooO0OO = (CrashlyticsReport.OooO0OO) obj;
            p368o0OOo0O.o0OoOo0 o0oooo2 = o0oooo1;
            o0oooo2.OooO0Oo(f18810OooO0O0, oooO0OO.OooO00o());
            o0oooo2.OooO0Oo(f18811OooO0OO, oooO0OO.OooO0O0());
        }
    }

    public static final class OooO0OO implements p368o0OOo0O.o000oOoO<CrashlyticsReport> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO0OO f18813OooO00o = new OooO0OO();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final p368o0OOo0O.Oooo0 f18814OooO0O0 = p368o0OOo0O.Oooo0.OooO00o("sdkVersion");

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final p368o0OOo0O.Oooo0 f18815OooO0OO = p368o0OOo0O.Oooo0.OooO00o("gmpAppId");

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final p368o0OOo0O.Oooo0 f18816OooO0Oo = p368o0OOo0O.Oooo0.OooO00o("platform");

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public static final p368o0OOo0O.Oooo0 f18818OooO0o0 = p368o0OOo0O.Oooo0.OooO00o("installationUuid");

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public static final p368o0OOo0O.Oooo0 f18817OooO0o = p368o0OOo0O.Oooo0.OooO00o("buildVersion");

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public static final p368o0OOo0O.Oooo0 f18819OooO0oO = p368o0OOo0O.Oooo0.OooO00o("displayVersion");

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public static final p368o0OOo0O.Oooo0 f18820OooO0oo = p368o0OOo0O.Oooo0.OooO00o(d.aw);

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public static final p368o0OOo0O.Oooo0 f18812OooO = p368o0OOo0O.Oooo0.OooO00o("ndkPayload");

        @Override // p368o0OOo0O.Oooo000
        public final void OooO00o(Object obj, p368o0OOo0O.o0OoOo0 o0oooo1) throws IOException {
            CrashlyticsReport crashlyticsReport = (CrashlyticsReport) obj;
            p368o0OOo0O.o0OoOo0 o0oooo2 = o0oooo1;
            o0oooo2.OooO0Oo(f18814OooO0O0, crashlyticsReport.OooO0oO());
            o0oooo2.OooO0Oo(f18815OooO0OO, crashlyticsReport.OooO0OO());
            o0oooo2.OooO0OO(f18816OooO0Oo, crashlyticsReport.OooO0o());
            o0oooo2.OooO0Oo(f18818OooO0o0, crashlyticsReport.OooO0Oo());
            o0oooo2.OooO0Oo(f18817OooO0o, crashlyticsReport.OooO00o());
            o0oooo2.OooO0Oo(f18819OooO0oO, crashlyticsReport.OooO0O0());
            o0oooo2.OooO0Oo(f18820OooO0oo, crashlyticsReport.OooO0oo());
            o0oooo2.OooO0Oo(f18812OooO, crashlyticsReport.OooO0o0());
        }
    }

    public static final class OooO0o implements p368o0OOo0O.o000oOoO<CrashlyticsReport.OooO0o> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO0o f18821OooO00o = new OooO0o();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final p368o0OOo0O.Oooo0 f18822OooO0O0 = p368o0OOo0O.Oooo0.OooO00o("files");

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final p368o0OOo0O.Oooo0 f18823OooO0OO = p368o0OOo0O.Oooo0.OooO00o("orgId");

        @Override // p368o0OOo0O.Oooo000
        public final void OooO00o(Object obj, p368o0OOo0O.o0OoOo0 o0oooo1) throws IOException {
            CrashlyticsReport.OooO0o oooO0o = (CrashlyticsReport.OooO0o) obj;
            p368o0OOo0O.o0OoOo0 o0oooo2 = o0oooo1;
            o0oooo2.OooO0Oo(f18822OooO0O0, oooO0o.OooO00o());
            o0oooo2.OooO0Oo(f18823OooO0OO, oooO0o.OooO0O0());
        }
    }

    public static final class OooOO0 implements p368o0OOo0O.o000oOoO<CrashlyticsReport.OooO.OooO00o> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooOO0 f18824OooO00o = new OooOO0();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final p368o0OOo0O.Oooo0 f18825OooO0O0 = p368o0OOo0O.Oooo0.OooO00o("identifier");

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final p368o0OOo0O.Oooo0 f18826OooO0OO = p368o0OOo0O.Oooo0.OooO00o(ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION);

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final p368o0OOo0O.Oooo0 f18827OooO0Oo = p368o0OOo0O.Oooo0.OooO00o("displayVersion");

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public static final p368o0OOo0O.Oooo0 f18829OooO0o0 = p368o0OOo0O.Oooo0.OooO00o("organization");

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public static final p368o0OOo0O.Oooo0 f18828OooO0o = p368o0OOo0O.Oooo0.OooO00o("installationUuid");

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public static final p368o0OOo0O.Oooo0 f18830OooO0oO = p368o0OOo0O.Oooo0.OooO00o("developmentPlatform");

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public static final p368o0OOo0O.Oooo0 f18831OooO0oo = p368o0OOo0O.Oooo0.OooO00o("developmentPlatformVersion");

        @Override // p368o0OOo0O.Oooo000
        public final void OooO00o(Object obj, p368o0OOo0O.o0OoOo0 o0oooo1) throws IOException {
            CrashlyticsReport.OooO.OooO00o oooO00o = (CrashlyticsReport.OooO.OooO00o) obj;
            p368o0OOo0O.o0OoOo0 o0oooo2 = o0oooo1;
            o0oooo2.OooO0Oo(f18825OooO0O0, oooO00o.OooO0Oo());
            o0oooo2.OooO0Oo(f18826OooO0OO, oooO00o.OooO0oO());
            o0oooo2.OooO0Oo(f18827OooO0Oo, oooO00o.OooO0OO());
            o0oooo2.OooO0Oo(f18829OooO0o0, oooO00o.OooO0o());
            o0oooo2.OooO0Oo(f18828OooO0o, oooO00o.OooO0o0());
            o0oooo2.OooO0Oo(f18830OooO0oO, oooO00o.OooO00o());
            o0oooo2.OooO0Oo(f18831OooO0oo, oooO00o.OooO0O0());
        }
    }

    public static final class OooOO0O implements p368o0OOo0O.o000oOoO<CrashlyticsReport.OooO.OooO00o.AbstractC0136OooO00o> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooOO0O f18832OooO00o = new OooOO0O();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final p368o0OOo0O.Oooo0 f18833OooO0O0 = p368o0OOo0O.Oooo0.OooO00o("clsId");

        @Override // p368o0OOo0O.Oooo000
        public final void OooO00o(Object obj, p368o0OOo0O.o0OoOo0 o0oooo1) throws IOException {
            p368o0OOo0O.Oooo0 oooo0 = f18833OooO0O0;
            ((CrashlyticsReport.OooO.OooO00o.AbstractC0136OooO00o) obj).OooO00o();
            o0oooo1.OooO0Oo(oooo0, null);
        }
    }

    public static final class OooOOO implements p368o0OOo0O.o000oOoO<CrashlyticsReport.OooO> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooOOO f18835OooO00o = new OooOOO();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final p368o0OOo0O.Oooo0 f18836OooO0O0 = p368o0OOo0O.Oooo0.OooO00o("generator");

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final p368o0OOo0O.Oooo0 f18837OooO0OO = p368o0OOo0O.Oooo0.OooO00o("identifier");

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final p368o0OOo0O.Oooo0 f18838OooO0Oo = p368o0OOo0O.Oooo0.OooO00o("startedAt");

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public static final p368o0OOo0O.Oooo0 f18840OooO0o0 = p368o0OOo0O.Oooo0.OooO00o("endedAt");

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public static final p368o0OOo0O.Oooo0 f18839OooO0o = p368o0OOo0O.Oooo0.OooO00o("crashed");

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public static final p368o0OOo0O.Oooo0 f18841OooO0oO = p368o0OOo0O.Oooo0.OooO00o("app");

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public static final p368o0OOo0O.Oooo0 f18842OooO0oo = p368o0OOo0O.Oooo0.OooO00o("user");

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public static final p368o0OOo0O.Oooo0 f18834OooO = p368o0OOo0O.Oooo0.OooO00o(ak.x);

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public static final p368o0OOo0O.Oooo0 f18843OooOO0 = p368o0OOo0O.Oooo0.OooO00o(DeviceRequestsHelper.DEVICE_INFO_DEVICE);

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public static final p368o0OOo0O.Oooo0 f18844OooOO0O = p368o0OOo0O.Oooo0.OooO00o(d.ar);

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public static final p368o0OOo0O.Oooo0 f18845OooOO0o = p368o0OOo0O.Oooo0.OooO00o("generatorType");

        @Override // p368o0OOo0O.Oooo000
        public final void OooO00o(Object obj, p368o0OOo0O.o0OoOo0 o0oooo1) throws IOException {
            CrashlyticsReport.OooO oooO = (CrashlyticsReport.OooO) obj;
            p368o0OOo0O.o0OoOo0 o0oooo2 = o0oooo1;
            o0oooo2.OooO0Oo(f18836OooO0O0, oooO.OooO0o0());
            o0oooo2.OooO0Oo(f18837OooO0OO, oooO.OooO0oO().getBytes(CrashlyticsReport.f18793OooO00o));
            o0oooo2.OooO0O0(f18838OooO0Oo, oooO.OooO());
            o0oooo2.OooO0Oo(f18840OooO0o0, oooO.OooO0OO());
            o0oooo2.OooO00o(f18839OooO0o, oooO.OooOO0O());
            o0oooo2.OooO0Oo(f18841OooO0oO, oooO.OooO00o());
            o0oooo2.OooO0Oo(f18842OooO0oo, oooO.OooOO0());
            o0oooo2.OooO0Oo(f18834OooO, oooO.OooO0oo());
            o0oooo2.OooO0Oo(f18843OooOO0, oooO.OooO0O0());
            o0oooo2.OooO0Oo(f18844OooOO0O, oooO.OooO0Oo());
            o0oooo2.OooO0OO(f18845OooOO0o, oooO.OooO0o());
        }
    }

    public static final class OooOOO0 implements p368o0OOo0O.o000oOoO<CrashlyticsReport.OooO.OooO0OO> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooOOO0 f18847OooO00o = new OooOOO0();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final p368o0OOo0O.Oooo0 f18848OooO0O0 = p368o0OOo0O.Oooo0.OooO00o("arch");

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final p368o0OOo0O.Oooo0 f18849OooO0OO = p368o0OOo0O.Oooo0.OooO00o(DeviceRequestsHelper.DEVICE_INFO_MODEL);

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final p368o0OOo0O.Oooo0 f18850OooO0Oo = p368o0OOo0O.Oooo0.OooO00o("cores");

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public static final p368o0OOo0O.Oooo0 f18852OooO0o0 = p368o0OOo0O.Oooo0.OooO00o("ram");

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public static final p368o0OOo0O.Oooo0 f18851OooO0o = p368o0OOo0O.Oooo0.OooO00o("diskSpace");

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public static final p368o0OOo0O.Oooo0 f18853OooO0oO = p368o0OOo0O.Oooo0.OooO00o("simulator");

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public static final p368o0OOo0O.Oooo0 f18854OooO0oo = p368o0OOo0O.Oooo0.OooO00o(ServerProtocol.DIALOG_PARAM_STATE);

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public static final p368o0OOo0O.Oooo0 f18846OooO = p368o0OOo0O.Oooo0.OooO00o("manufacturer");

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public static final p368o0OOo0O.Oooo0 f18855OooOO0 = p368o0OOo0O.Oooo0.OooO00o("modelClass");

        @Override // p368o0OOo0O.Oooo000
        public final void OooO00o(Object obj, p368o0OOo0O.o0OoOo0 o0oooo1) throws IOException {
            CrashlyticsReport.OooO.OooO0OO oooO0OO = (CrashlyticsReport.OooO.OooO0OO) obj;
            p368o0OOo0O.o0OoOo0 o0oooo2 = o0oooo1;
            o0oooo2.OooO0OO(f18848OooO0O0, oooO0OO.OooO00o());
            o0oooo2.OooO0Oo(f18849OooO0OO, oooO0OO.OooO0o0());
            o0oooo2.OooO0OO(f18850OooO0Oo, oooO0OO.OooO0O0());
            o0oooo2.OooO0O0(f18852OooO0o0, oooO0OO.OooO0oO());
            o0oooo2.OooO0O0(f18851OooO0o, oooO0OO.OooO0OO());
            o0oooo2.OooO00o(f18853OooO0oO, oooO0OO.OooO());
            o0oooo2.OooO0OO(f18854OooO0oo, oooO0OO.OooO0oo());
            o0oooo2.OooO0Oo(f18846OooO, oooO0OO.OooO0Oo());
            o0oooo2.OooO0Oo(f18855OooOO0, oooO0OO.OooO0o());
        }
    }

    public static final class OooOOOO implements p368o0OOo0O.o000oOoO<CrashlyticsReport.OooO.OooO0o.OooO00o> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooOOOO f18856OooO00o = new OooOOOO();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final p368o0OOo0O.Oooo0 f18857OooO0O0 = p368o0OOo0O.Oooo0.OooO00o("execution");

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final p368o0OOo0O.Oooo0 f18858OooO0OO = p368o0OOo0O.Oooo0.OooO00o("customAttributes");

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final p368o0OOo0O.Oooo0 f18859OooO0Oo = p368o0OOo0O.Oooo0.OooO00o("internalKeys");

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public static final p368o0OOo0O.Oooo0 f18861OooO0o0 = p368o0OOo0O.Oooo0.OooO00o("background");

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public static final p368o0OOo0O.Oooo0 f18860OooO0o = p368o0OOo0O.Oooo0.OooO00o("uiOrientation");

        @Override // p368o0OOo0O.Oooo000
        public final void OooO00o(Object obj, p368o0OOo0O.o0OoOo0 o0oooo1) throws IOException {
            CrashlyticsReport.OooO.OooO0o.OooO00o oooO00o = (CrashlyticsReport.OooO.OooO0o.OooO00o) obj;
            p368o0OOo0O.o0OoOo0 o0oooo2 = o0oooo1;
            o0oooo2.OooO0Oo(f18857OooO0O0, oooO00o.OooO0OO());
            o0oooo2.OooO0Oo(f18858OooO0OO, oooO00o.OooO0O0());
            o0oooo2.OooO0Oo(f18859OooO0Oo, oooO00o.OooO0Oo());
            o0oooo2.OooO0Oo(f18861OooO0o0, oooO00o.OooO00o());
            o0oooo2.OooO0OO(f18860OooO0o, oooO00o.OooO0o0());
        }
    }

    public static final class OooOo implements p368o0OOo0O.o000oOoO<CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooOo f18862OooO00o = new OooOo();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final p368o0OOo0O.Oooo0 f18863OooO0O0 = p368o0OOo0O.Oooo0.OooO00o("threads");

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final p368o0OOo0O.Oooo0 f18864OooO0OO = p368o0OOo0O.Oooo0.OooO00o("exception");

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final p368o0OOo0O.Oooo0 f18865OooO0Oo = p368o0OOo0O.Oooo0.OooO00o("appExitInfo");

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public static final p368o0OOo0O.Oooo0 f18867OooO0o0 = p368o0OOo0O.Oooo0.OooO00o("signal");

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public static final p368o0OOo0O.Oooo0 f18866OooO0o = p368o0OOo0O.Oooo0.OooO00o("binaries");

        @Override // p368o0OOo0O.Oooo000
        public final void OooO00o(Object obj, p368o0OOo0O.o0OoOo0 o0oooo1) throws IOException {
            CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0 oooO0O0 = (CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0) obj;
            p368o0OOo0O.o0OoOo0 o0oooo2 = o0oooo1;
            o0oooo2.OooO0Oo(f18863OooO0O0, oooO0O0.OooO0o0());
            o0oooo2.OooO0Oo(f18864OooO0OO, oooO0O0.OooO0OO());
            o0oooo2.OooO0Oo(f18865OooO0Oo, oooO0O0.OooO00o());
            o0oooo2.OooO0Oo(f18867OooO0o0, oooO0O0.OooO0Oo());
            o0oooo2.OooO0Oo(f18866OooO0o, oooO0O0.OooO0O0());
        }
    }

    public static final class OooOo00 implements p368o0OOo0O.o000oOoO<CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0138OooO00o> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooOo00 f18868OooO00o = new OooOo00();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final p368o0OOo0O.Oooo0 f18869OooO0O0 = p368o0OOo0O.Oooo0.OooO00o("baseAddress");

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final p368o0OOo0O.Oooo0 f18870OooO0OO = p368o0OOo0O.Oooo0.OooO00o("size");

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final p368o0OOo0O.Oooo0 f18871OooO0Oo = p368o0OOo0O.Oooo0.OooO00o("name");

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public static final p368o0OOo0O.Oooo0 f18872OooO0o0 = p368o0OOo0O.Oooo0.OooO00o("uuid");

        @Override // p368o0OOo0O.Oooo000
        public final void OooO00o(Object obj, p368o0OOo0O.o0OoOo0 o0oooo1) throws IOException {
            CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0138OooO00o abstractC0138OooO00o = (CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0138OooO00o) obj;
            p368o0OOo0O.o0OoOo0 o0oooo2 = o0oooo1;
            o0oooo2.OooO0O0(f18869OooO0O0, abstractC0138OooO00o.OooO00o());
            o0oooo2.OooO0O0(f18870OooO0OO, abstractC0138OooO00o.OooO0OO());
            o0oooo2.OooO0Oo(f18871OooO0Oo, abstractC0138OooO00o.OooO0O0());
            p368o0OOo0O.Oooo0 oooo0 = f18872OooO0o0;
            String strOooO0Oo = abstractC0138OooO00o.OooO0Oo();
            o0oooo2.OooO0Oo(oooo0, strOooO0Oo != null ? strOooO0Oo.getBytes(CrashlyticsReport.f18793OooO00o) : null);
        }
    }

    public static final class Oooo0 implements p368o0OOo0O.o000oOoO<CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.OooO0OO> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final Oooo0 f18873OooO00o = new Oooo0();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final p368o0OOo0O.Oooo0 f18874OooO0O0 = p368o0OOo0O.Oooo0.OooO00o("name");

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final p368o0OOo0O.Oooo0 f18875OooO0OO = p368o0OOo0O.Oooo0.OooO00o("code");

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final p368o0OOo0O.Oooo0 f18876OooO0Oo = p368o0OOo0O.Oooo0.OooO00o(IntegrityManager.INTEGRITY_TYPE_ADDRESS);

        @Override // p368o0OOo0O.Oooo000
        public final void OooO00o(Object obj, p368o0OOo0O.o0OoOo0 o0oooo1) throws IOException {
            CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.OooO0OO oooO0OO = (CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.OooO0OO) obj;
            p368o0OOo0O.o0OoOo0 o0oooo2 = o0oooo1;
            o0oooo2.OooO0Oo(f18874OooO0O0, oooO0OO.OooO0OO());
            o0oooo2.OooO0Oo(f18875OooO0OO, oooO0OO.OooO0O0());
            o0oooo2.OooO0O0(f18876OooO0Oo, oooO0OO.OooO00o());
        }
    }

    public static final class Oooo000 implements p368o0OOo0O.o000oOoO<CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0140OooO0O0> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final Oooo000 f18877OooO00o = new Oooo000();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final p368o0OOo0O.Oooo0 f18878OooO0O0 = p368o0OOo0O.Oooo0.OooO00o("type");

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final p368o0OOo0O.Oooo0 f18879OooO0OO = p368o0OOo0O.Oooo0.OooO00o("reason");

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final p368o0OOo0O.Oooo0 f18880OooO0Oo = p368o0OOo0O.Oooo0.OooO00o("frames");

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public static final p368o0OOo0O.Oooo0 f18882OooO0o0 = p368o0OOo0O.Oooo0.OooO00o("causedBy");

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public static final p368o0OOo0O.Oooo0 f18881OooO0o = p368o0OOo0O.Oooo0.OooO00o("overflowCount");

        @Override // p368o0OOo0O.Oooo000
        public final void OooO00o(Object obj, p368o0OOo0O.o0OoOo0 o0oooo1) throws IOException {
            CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0140OooO0O0 abstractC0140OooO0O0 = (CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0140OooO0O0) obj;
            p368o0OOo0O.o0OoOo0 o0oooo2 = o0oooo1;
            o0oooo2.OooO0Oo(f18878OooO0O0, abstractC0140OooO0O0.OooO0o0());
            o0oooo2.OooO0Oo(f18879OooO0OO, abstractC0140OooO0O0.OooO0Oo());
            o0oooo2.OooO0Oo(f18880OooO0Oo, abstractC0140OooO0O0.OooO0O0());
            o0oooo2.OooO0Oo(f18882OooO0o0, abstractC0140OooO0O0.OooO00o());
            o0oooo2.OooO0OO(f18881OooO0o, abstractC0140OooO0O0.OooO0OO());
        }
    }

    public static final class o000oOoO implements p368o0OOo0O.o000oOoO<CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0143OooO0o> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final o000oOoO f18883OooO00o = new o000oOoO();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final p368o0OOo0O.Oooo0 f18884OooO0O0 = p368o0OOo0O.Oooo0.OooO00o("name");

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final p368o0OOo0O.Oooo0 f18885OooO0OO = p368o0OOo0O.Oooo0.OooO00o("importance");

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final p368o0OOo0O.Oooo0 f18886OooO0Oo = p368o0OOo0O.Oooo0.OooO00o("frames");

        @Override // p368o0OOo0O.Oooo000
        public final void OooO00o(Object obj, p368o0OOo0O.o0OoOo0 o0oooo1) throws IOException {
            CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0143OooO0o abstractC0143OooO0o = (CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0143OooO0o) obj;
            p368o0OOo0O.o0OoOo0 o0oooo2 = o0oooo1;
            o0oooo2.OooO0Oo(f18884OooO0O0, abstractC0143OooO0o.OooO0OO());
            o0oooo2.OooO0OO(f18885OooO0OO, abstractC0143OooO0o.OooO0O0());
            o0oooo2.OooO0Oo(f18886OooO0Oo, abstractC0143OooO0o.OooO00o());
        }
    }

    public static final class o00O0O implements p368o0OOo0O.o000oOoO<CrashlyticsReport.OooO.OooO0o.OooO0OO> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final o00O0O f18887OooO00o = new o00O0O();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final p368o0OOo0O.Oooo0 f18888OooO0O0 = p368o0OOo0O.Oooo0.OooO00o("batteryLevel");

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final p368o0OOo0O.Oooo0 f18889OooO0OO = p368o0OOo0O.Oooo0.OooO00o("batteryVelocity");

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final p368o0OOo0O.Oooo0 f18890OooO0Oo = p368o0OOo0O.Oooo0.OooO00o("proximityOn");

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public static final p368o0OOo0O.Oooo0 f18892OooO0o0 = p368o0OOo0O.Oooo0.OooO00o("orientation");

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public static final p368o0OOo0O.Oooo0 f18891OooO0o = p368o0OOo0O.Oooo0.OooO00o("ramUsed");

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public static final p368o0OOo0O.Oooo0 f18893OooO0oO = p368o0OOo0O.Oooo0.OooO00o("diskUsed");

        @Override // p368o0OOo0O.Oooo000
        public final void OooO00o(Object obj, p368o0OOo0O.o0OoOo0 o0oooo1) throws IOException {
            CrashlyticsReport.OooO.OooO0o.OooO0OO oooO0OO = (CrashlyticsReport.OooO.OooO0o.OooO0OO) obj;
            p368o0OOo0O.o0OoOo0 o0oooo2 = o0oooo1;
            o0oooo2.OooO0Oo(f18888OooO0O0, oooO0OO.OooO00o());
            o0oooo2.OooO0OO(f18889OooO0OO, oooO0OO.OooO0O0());
            o0oooo2.OooO00o(f18890OooO0Oo, oooO0OO.OooO0o());
            o0oooo2.OooO0OO(f18892OooO0o0, oooO0OO.OooO0Oo());
            o0oooo2.OooO0O0(f18891OooO0o, oooO0OO.OooO0o0());
            o0oooo2.OooO0O0(f18893OooO0oO, oooO0OO.OooO0OO());
        }
    }

    public static final class o00Oo0 implements p368o0OOo0O.o000oOoO<CrashlyticsReport.OooO.OooO0o> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final o00Oo0 f18894OooO00o = new o00Oo0();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final p368o0OOo0O.Oooo0 f18895OooO0O0 = p368o0OOo0O.Oooo0.OooO00o("timestamp");

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final p368o0OOo0O.Oooo0 f18896OooO0OO = p368o0OOo0O.Oooo0.OooO00o("type");

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final p368o0OOo0O.Oooo0 f18897OooO0Oo = p368o0OOo0O.Oooo0.OooO00o("app");

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public static final p368o0OOo0O.Oooo0 f18899OooO0o0 = p368o0OOo0O.Oooo0.OooO00o(DeviceRequestsHelper.DEVICE_INFO_DEVICE);

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public static final p368o0OOo0O.Oooo0 f18898OooO0o = p368o0OOo0O.Oooo0.OooO00o("log");

        @Override // p368o0OOo0O.Oooo000
        public final void OooO00o(Object obj, p368o0OOo0O.o0OoOo0 o0oooo1) throws IOException {
            CrashlyticsReport.OooO.OooO0o oooO0o = (CrashlyticsReport.OooO.OooO0o) obj;
            p368o0OOo0O.o0OoOo0 o0oooo2 = o0oooo1;
            o0oooo2.OooO0O0(f18895OooO0O0, oooO0o.OooO0Oo());
            o0oooo2.OooO0Oo(f18896OooO0OO, oooO0o.OooO0o0());
            o0oooo2.OooO0Oo(f18897OooO0Oo, oooO0o.OooO00o());
            o0oooo2.OooO0Oo(f18899OooO0o0, oooO0o.OooO0O0());
            o0oooo2.OooO0Oo(f18898OooO0o, oooO0o.OooO0OO());
        }
    }

    public static final class o00Ooo implements p368o0OOo0O.o000oOoO<CrashlyticsReport.OooO.OooO0o.AbstractC0147OooO0o> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final o00Ooo f18900OooO00o = new o00Ooo();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final p368o0OOo0O.Oooo0 f18901OooO0O0 = p368o0OOo0O.Oooo0.OooO00o("content");

        @Override // p368o0OOo0O.Oooo000
        public final void OooO00o(Object obj, p368o0OOo0O.o0OoOo0 o0oooo1) throws IOException {
            o0oooo1.OooO0Oo(f18901OooO0O0, ((CrashlyticsReport.OooO.OooO0o.AbstractC0147OooO0o) obj).OooO00o());
        }
    }

    public static final class o00oO0o implements p368o0OOo0O.o000oOoO<CrashlyticsReport.OooO.OooOO0> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final o00oO0o f18902OooO00o = new o00oO0o();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final p368o0OOo0O.Oooo0 f18903OooO0O0 = p368o0OOo0O.Oooo0.OooO00o("identifier");

        @Override // p368o0OOo0O.Oooo000
        public final void OooO00o(Object obj, p368o0OOo0O.o0OoOo0 o0oooo1) throws IOException {
            o0oooo1.OooO0Oo(f18903OooO0O0, ((CrashlyticsReport.OooO.OooOO0) obj).OooO00o());
        }
    }

    public static final class o0OoOo0 implements p368o0OOo0O.o000oOoO<CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0143OooO0o.AbstractC0145OooO0O0> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final o0OoOo0 f18904OooO00o = new o0OoOo0();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final p368o0OOo0O.Oooo0 f18905OooO0O0 = p368o0OOo0O.Oooo0.OooO00o("pc");

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final p368o0OOo0O.Oooo0 f18906OooO0OO = p368o0OOo0O.Oooo0.OooO00o("symbol");

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final p368o0OOo0O.Oooo0 f18907OooO0Oo = p368o0OOo0O.Oooo0.OooO00o(ShareInternalUtility.STAGING_PARAM);

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public static final p368o0OOo0O.Oooo0 f18909OooO0o0 = p368o0OOo0O.Oooo0.OooO00o("offset");

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public static final p368o0OOo0O.Oooo0 f18908OooO0o = p368o0OOo0O.Oooo0.OooO00o("importance");

        @Override // p368o0OOo0O.Oooo000
        public final void OooO00o(Object obj, p368o0OOo0O.o0OoOo0 o0oooo1) throws IOException {
            CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0143OooO0o.AbstractC0145OooO0O0 abstractC0145OooO0O0 = (CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0143OooO0o.AbstractC0145OooO0O0) obj;
            p368o0OOo0O.o0OoOo0 o0oooo2 = o0oooo1;
            o0oooo2.OooO0O0(f18905OooO0O0, abstractC0145OooO0O0.OooO0Oo());
            o0oooo2.OooO0Oo(f18906OooO0OO, abstractC0145OooO0O0.OooO0o0());
            o0oooo2.OooO0Oo(f18907OooO0Oo, abstractC0145OooO0O0.OooO00o());
            o0oooo2.OooO0O0(f18909OooO0o0, abstractC0145OooO0O0.OooO0OO());
            o0oooo2.OooO0OO(f18908OooO0o, abstractC0145OooO0O0.OooO0O0());
        }
    }

    public static final class oo000o implements p368o0OOo0O.o000oOoO<CrashlyticsReport.OooO.AbstractC0135OooO> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final oo000o f18910OooO00o = new oo000o();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final p368o0OOo0O.Oooo0 f18911OooO0O0 = p368o0OOo0O.Oooo0.OooO00o("platform");

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final p368o0OOo0O.Oooo0 f18912OooO0OO = p368o0OOo0O.Oooo0.OooO00o(ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION);

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final p368o0OOo0O.Oooo0 f18913OooO0Oo = p368o0OOo0O.Oooo0.OooO00o("buildVersion");

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public static final p368o0OOo0O.Oooo0 f18914OooO0o0 = p368o0OOo0O.Oooo0.OooO00o("jailbroken");

        @Override // p368o0OOo0O.Oooo000
        public final void OooO00o(Object obj, p368o0OOo0O.o0OoOo0 o0oooo1) throws IOException {
            CrashlyticsReport.OooO.AbstractC0135OooO abstractC0135OooO = (CrashlyticsReport.OooO.AbstractC0135OooO) obj;
            p368o0OOo0O.o0OoOo0 o0oooo2 = o0oooo1;
            o0oooo2.OooO0OO(f18911OooO0O0, abstractC0135OooO.OooO0O0());
            o0oooo2.OooO0Oo(f18912OooO0OO, abstractC0135OooO.OooO0OO());
            o0oooo2.OooO0Oo(f18913OooO0Oo, abstractC0135OooO.OooO00o());
            o0oooo2.OooO00o(f18914OooO0o0, abstractC0135OooO.OooO0Oo());
        }
    }

    public final void OooO00o(p370o0OOo0OO.Oooo0<?> oooo0) {
        OooO0OO oooO0OO = OooO0OO.f18813OooO00o;
        p371o0OOo0Oo.o00Ooo o00ooo2 = (p371o0OOo0Oo.o00Ooo) oooo0;
        o00ooo2.OooO00o(CrashlyticsReport.class, oooO0OO);
        o00ooo2.OooO00o(com.google.firebase.crashlytics.internal.model.OooO0O0.class, oooO0OO);
        OooOOO oooOOO = OooOOO.f18835OooO00o;
        o00ooo2.OooO00o(CrashlyticsReport.OooO.class, oooOOO);
        o00ooo2.OooO00o(com.google.firebase.crashlytics.internal.model.OooOO0O.class, oooOOO);
        OooOO0 oooOO1 = OooOO0.f18824OooO00o;
        o00ooo2.OooO00o(CrashlyticsReport.OooO.OooO00o.class, oooOO1);
        o00ooo2.OooO00o(com.google.firebase.crashlytics.internal.model.OooOOO0.class, oooOO1);
        OooOO0O oooOO0O = OooOO0O.f18832OooO00o;
        o00ooo2.OooO00o(CrashlyticsReport.OooO.OooO00o.AbstractC0136OooO00o.class, oooOO0O);
        o00ooo2.OooO00o(com.google.firebase.crashlytics.internal.model.OooOOO.class, oooOO0O);
        o00oO0o o00oo0o2 = o00oO0o.f18902OooO00o;
        o00ooo2.OooO00o(CrashlyticsReport.OooO.OooOO0.class, o00oo0o2);
        o00ooo2.OooO00o(o0ooOOo.class, o00oo0o2);
        oo000o oo000oVar = oo000o.f18910OooO00o;
        o00ooo2.OooO00o(CrashlyticsReport.OooO.AbstractC0135OooO.class, oo000oVar);
        o00ooo2.OooO00o(com.google.firebase.crashlytics.internal.model.o00oO0o.class, oo000oVar);
        OooOOO0 oooOOO0 = OooOOO0.f18847OooO00o;
        o00ooo2.OooO00o(CrashlyticsReport.OooO.OooO0OO.class, oooOOO0);
        o00ooo2.OooO00o(com.google.firebase.crashlytics.internal.model.OooOOOO.class, oooOOO0);
        o00Oo0 o00oo1 = o00Oo0.f18894OooO00o;
        o00ooo2.OooO00o(CrashlyticsReport.OooO.OooO0o.class, o00oo1);
        o00ooo2.OooO00o(com.google.firebase.crashlytics.internal.model.OooOo00.class, o00oo1);
        OooOOOO oooOOOO = OooOOOO.f18856OooO00o;
        o00ooo2.OooO00o(CrashlyticsReport.OooO.OooO0o.OooO00o.class, oooOOOO);
        o00ooo2.OooO00o(com.google.firebase.crashlytics.internal.model.OooOo.class, oooOOOO);
        OooOo oooOo = OooOo.f18862OooO00o;
        o00ooo2.OooO00o(CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.class, oooOo);
        o00ooo2.OooO00o(com.google.firebase.crashlytics.internal.model.Oooo000.class, oooOo);
        o000oOoO o000oooo2 = o000oOoO.f18883OooO00o;
        o00ooo2.OooO00o(CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0143OooO0o.class, o000oooo2);
        o00ooo2.OooO00o(com.google.firebase.crashlytics.internal.model.o00O0O.class, o000oooo2);
        o0OoOo0 o0oooo1 = o0OoOo0.f18904OooO00o;
        o00ooo2.OooO00o(CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0143OooO0o.AbstractC0145OooO0O0.class, o0oooo1);
        o00ooo2.OooO00o(com.google.firebase.crashlytics.internal.model.o00Oo0.class, o0oooo1);
        Oooo000 oooo000 = Oooo000.f18877OooO00o;
        o00ooo2.OooO00o(CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0140OooO0O0.class, oooo000);
        o00ooo2.OooO00o(com.google.firebase.crashlytics.internal.model.o000oOoO.class, oooo000);
        C0150OooO00o c0150OooO00o = C0150OooO00o.f18801OooO00o;
        o00ooo2.OooO00o(CrashlyticsReport.OooO00o.class, c0150OooO00o);
        o00ooo2.OooO00o(com.google.firebase.crashlytics.internal.model.OooO0OO.class, c0150OooO00o);
        Oooo0 oooo1 = Oooo0.f18873OooO00o;
        o00ooo2.OooO00o(CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.OooO0OO.class, oooo1);
        o00ooo2.OooO00o(com.google.firebase.crashlytics.internal.model.o0OoOo0.class, oooo1);
        OooOo00 oooOo00 = OooOo00.f18868OooO00o;
        o00ooo2.OooO00o(CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0138OooO00o.class, oooOo00);
        o00ooo2.OooO00o(com.google.firebase.crashlytics.internal.model.Oooo0.class, oooOo00);
        OooO0O0 oooO0O0 = OooO0O0.f18809OooO00o;
        o00ooo2.OooO00o(CrashlyticsReport.OooO0OO.class, oooO0O0);
        o00ooo2.OooO00o(com.google.firebase.crashlytics.internal.model.OooO0o.class, oooO0O0);
        o00O0O o00o0o2 = o00O0O.f18887OooO00o;
        o00ooo2.OooO00o(CrashlyticsReport.OooO.OooO0o.OooO0OO.class, o00o0o2);
        o00ooo2.OooO00o(com.google.firebase.crashlytics.internal.model.o00Ooo.class, o00o0o2);
        o00Ooo o00ooo3 = o00Ooo.f18900OooO00o;
        o00ooo2.OooO00o(CrashlyticsReport.OooO.OooO0o.AbstractC0147OooO0o.class, o00ooo3);
        o00ooo2.OooO00o(com.google.firebase.crashlytics.internal.model.oo000o.class, o00ooo3);
        OooO0o oooO0o = OooO0o.f18821OooO00o;
        o00ooo2.OooO00o(CrashlyticsReport.OooO0o.class, oooO0o);
        o00ooo2.OooO00o(com.google.firebase.crashlytics.internal.model.OooO.class, oooO0o);
        OooO oooO = OooO.f18797OooO00o;
        o00ooo2.OooO00o(CrashlyticsReport.OooO0o.OooO00o.class, oooO);
        o00ooo2.OooO00o(com.google.firebase.crashlytics.internal.model.OooOO0.class, oooO);
    }
}
