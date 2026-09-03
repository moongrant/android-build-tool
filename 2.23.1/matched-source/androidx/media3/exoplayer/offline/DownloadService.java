package androidx.media3.exoplayer.offline;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.IBinder;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.scheduler.Requirements;
import androidx.media3.exoplayer.workmanager.WorkManagerScheduler;
import androidx.work.ExistingWorkPolicy;
import androidx.work.NetworkType;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import oo00o.o00000O0;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p073o000O0oo.o0000;
import p073o000O0oo.o00000O;
import p080o000OoO.o0000O0O;
import p080o000OoO.o000OO;
import p080o000OoO.o000OO00;
import p115o00O00oO.Oooo0;
import p115o00O00oO.o0OO00O;
import p119o00O0Oo0.o00O0O;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public abstract class DownloadService extends Service {

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public static final HashMap<Class<? extends DownloadService>, OooO00o> f7785OooOO0o = new HashMap<>();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f7786OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public OooO00o f7790OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f7791OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public boolean f7792OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public boolean f7793OooOO0O;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public final String f7787OooO0Oo = null;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @StringRes
    public final int f7789OooO0o0 = 0;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @StringRes
    public final int f7788OooO0o = 0;

    public static final class OooO00o implements androidx.media3.exoplayer.offline.OooO00o.OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Context f7794OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final androidx.media3.exoplayer.offline.OooO00o f7795OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final boolean f7796OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @Nullable
        public final o0000 f7797OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @Nullable
        public DownloadService f7798OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final Class<? extends DownloadService> f7799OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public Requirements f7800OooO0oO;

        public OooO00o() {
            throw null;
        }

        public OooO00o(Context context, androidx.media3.exoplayer.offline.OooO00o oooO00o, boolean z, o0000 o0000Var, Class cls) throws Throwable {
            this.f7794OooO00o = context;
            this.f7795OooO0O0 = oooO00o;
            this.f7796OooO0OO = z;
            this.f7797OooO0Oo = o0000Var;
            this.f7799OooO0o0 = cls;
            oooO00o.f7808OooO0o0.add(this);
            OooOO0();
        }

        public final void OooO() {
            boolean z = this.f7796OooO0OO;
            Class<? extends DownloadService> cls = this.f7799OooO0o0;
            Context context = this.f7794OooO00o;
            if (!z) {
                try {
                    HashMap<Class<? extends DownloadService>, OooO00o> map = DownloadService.f7785OooOO0o;
                    context.startService(new Intent(context, cls).setAction("androidx.media3.exoplayer.downloadService.action.INIT"));
                    return;
                } catch (IllegalStateException unused) {
                    Log.OooO0o("DownloadService", "Failed to restart (process is idle)");
                    return;
                }
            }
            try {
                HashMap<Class<? extends DownloadService>, OooO00o> map2 = DownloadService.f7785OooOO0o;
                Intent action = new Intent(context, cls).setAction("androidx.media3.exoplayer.downloadService.action.RESTART");
                if (o000OO00.f34965OooO00o >= 26) {
                    context.startForegroundService(action);
                } else {
                    context.startService(action);
                }
            } catch (IllegalStateException unused2) {
                Log.OooO0o("DownloadService", "Failed to restart (foreground launch restriction)");
            }
        }

        @Override // androidx.media3.exoplayer.offline.OooO00o.OooO0OO
        public final void OooO00o(androidx.media3.exoplayer.offline.OooO00o oooO00o, boolean z) {
            if (z || oooO00o.f7802OooO) {
                return;
            }
            DownloadService downloadService = this.f7798OooO0o;
            if (downloadService == null || downloadService.f7793OooOO0O) {
                List<Download> list = oooO00o.f7815OooOOO0;
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).f7771OooO0O0 == 0) {
                        OooO();
                        return;
                    }
                }
            }
        }

        @Override // androidx.media3.exoplayer.offline.OooO00o.OooO0OO
        public final void OooO0O0() {
            DownloadService downloadService = this.f7798OooO0o;
            if (downloadService != null) {
                downloadService.getClass();
            }
        }

        @Override // androidx.media3.exoplayer.offline.OooO00o.OooO0OO
        public final void OooO0OO() throws Throwable {
            OooOO0();
        }

        @Override // androidx.media3.exoplayer.offline.OooO00o.OooO0OO
        public final void OooO0Oo(Download download) {
            DownloadService downloadService = this.f7798OooO0o;
            if (downloadService != null) {
                downloadService.getClass();
            }
            DownloadService downloadService2 = this.f7798OooO0o;
            if (downloadService2 == null || downloadService2.f7793OooOO0O) {
                int i = download.f7771OooO0O0;
                HashMap<Class<? extends DownloadService>, OooO00o> map = DownloadService.f7785OooOO0o;
                if (i == 2 || i == 5 || i == 7) {
                    Log.OooO0o("DownloadService", "DownloadService wasn't running. Restarting.");
                    OooO();
                }
            }
        }

        @Override // androidx.media3.exoplayer.offline.OooO00o.OooO0OO
        public final void OooO0o() {
            DownloadService downloadService = this.f7798OooO0o;
            if (downloadService != null) {
                HashMap<Class<? extends DownloadService>, OooO00o> map = DownloadService.f7785OooOO0o;
                downloadService.OooO0Oo();
            }
        }

        @Override // androidx.media3.exoplayer.offline.OooO00o.OooO0OO
        public final /* synthetic */ void OooO0o0() {
        }

        @Override // androidx.media3.exoplayer.offline.OooO00o.OooO0OO
        public final void OooO0oO(androidx.media3.exoplayer.offline.OooO00o oooO00o) {
            DownloadService downloadService = this.f7798OooO0o;
            if (downloadService != null) {
                DownloadService.OooO00o(downloadService, oooO00o.f7815OooOOO0);
            }
        }

        @RequiresNonNull({"scheduler"})
        public final void OooO0oo() {
            Requirements requirements = new Requirements(0);
            if (!o000OO00.OooO00o(this.f7800OooO0oO, requirements)) {
                o00000O0 o00000o1 = ((WorkManagerScheduler) this.f7797OooO0Oo).f8361OooO00o;
                o00000o1.getClass();
                ((o00O0O) o00000o1.f60188OooO0Oo).OooO00o(new o00O0OOO.OooO0OO(o00000o1, "MyDownloadService", true));
                this.f7800OooO0oO = requirements;
            }
        }

        /* JADX WARN: Code duplicated, block: B:50:0x00ab  */
        public final boolean OooOO0() throws Throwable {
            NetworkType networkType;
            boolean z;
            androidx.media3.exoplayer.offline.OooO00o oooO00o = this.f7795OooO0O0;
            boolean z2 = oooO00o.f7813OooOO0o;
            o0000 o0000Var = this.f7797OooO0Oo;
            if (o0000Var == null) {
                return !z2;
            }
            if (!z2) {
                OooO0oo();
                return true;
            }
            Requirements requirements = oooO00o.f7814OooOOO.f34359OooO0OO;
            WorkManagerScheduler workManagerScheduler = (WorkManagerScheduler) o0000Var;
            int i = WorkManagerScheduler.f8360OooO0O0;
            int i2 = requirements.f7848OooO0Oo;
            int i3 = i & i2;
            if (!(i3 == i2 ? requirements : new Requirements(i3)).equals(requirements)) {
                OooO0oo();
                return false;
            }
            if (!(!o000OO00.OooO00o(this.f7800OooO0oO, requirements))) {
                return true;
            }
            String packageName = this.f7794OooO00o.getPackageName();
            int i4 = requirements.f7848OooO0Oo;
            int i5 = i & i4;
            Requirements requirements2 = i5 == i4 ? requirements : new Requirements(i5);
            if (!requirements2.equals(requirements)) {
                Log.OooO0o("WorkManagerScheduler", "Ignoring unsupported requirements: " + (requirements2.f7848OooO0Oo ^ i4));
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            if ((i4 & 2) != 0) {
                networkType = NetworkType.UNMETERED;
                Intrinsics.checkNotNullParameter(networkType, "networkType");
            } else {
                if ((i4 & 1) != 0) {
                    networkType = NetworkType.CONNECTED;
                    Intrinsics.checkNotNullParameter(networkType, "networkType");
                } else {
                    networkType = NetworkType.NOT_REQUIRED;
                    Intrinsics.checkNotNullParameter(networkType, "networkType");
                }
            }
            NetworkType networkType2 = networkType;
            if (o000OO00.f34965OooO00o < 23) {
                z = false;
            } else {
                if ((i4 & 4) != 0) {
                    z = true;
                } else {
                    z = false;
                }
            }
            Oooo0 constraints = new Oooo0(networkType2, (i4 & 8) != 0, z, false, (i4 & 16) != 0, -1L, -1L, Build.VERSION.SDK_INT >= 24 ? CollectionsKt.toSet(linkedHashSet) : SetsKt.emptySet());
            HashMap map = new HashMap();
            map.put("requirements", Integer.valueOf(i4));
            map.put("service_package", packageName);
            map.put("service_action", "androidx.media3.exoplayer.downloadService.action.RESTART");
            androidx.work.OooO0O0 inputData = new androidx.work.OooO0O0(map);
            androidx.work.OooO0O0.OooO0OO(inputData);
            o0OO00O.OooO00o oooO00o2 = new o0OO00O.OooO00o(WorkManagerScheduler.SchedulerWorker.class);
            Intrinsics.checkNotNullParameter(constraints, "constraints");
            oooO00o2.f36143OooO0O0.f36220OooOO0 = constraints;
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            oooO00o2.f36143OooO0O0.f36217OooO0o0 = inputData;
            o0OO00O o0oo00oOooO00o = oooO00o2.OooO00o();
            ExistingWorkPolicy existingWorkPolicy = ExistingWorkPolicy.REPLACE;
            o00000O0 o00000o1 = workManagerScheduler.f8361OooO00o;
            o00000o1.getClass();
            o00000o1.OooO0O0("MyDownloadService", existingWorkPolicy, Collections.singletonList(o0oo00oOooO00o));
            this.f7800OooO0oO = requirements;
            return true;
        }
    }

    public final class OooO0O0 {
        public final void OooO00o() {
            throw null;
        }
    }

    public DownloadService(@StringRes int i) {
    }

    public static void OooO00o(DownloadService downloadService, List list) {
        downloadService.getClass();
    }

    public abstract androidx.media3.exoplayer.offline.OooO00o OooO0O0();

    @Nullable
    public abstract WorkManagerScheduler OooO0OO();

    public final void OooO0Oo() {
        OooO00o oooO00o = this.f7790OooO0oO;
        oooO00o.getClass();
        if (oooO00o.OooOO0()) {
            if (o000OO00.f34965OooO00o >= 28 || !this.f7792OooOO0) {
                this.f7793OooOO0O |= stopSelfResult(this.f7791OooO0oo);
            } else {
                stopSelf();
                this.f7793OooOO0O = true;
            }
        }
    }

    @Override // android.app.Service
    @Nullable
    public final IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException();
    }

    @Override // android.app.Service
    public final void onCreate() {
        String str = this.f7787OooO0Oo;
        if (str != null && o000OO00.f34965OooO00o >= 26) {
            NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
            notificationManager.getClass();
            o000OO.OooO00o();
            NotificationChannel notificationChannelOooO00o = o0000O0O.OooO00o(str, getString(this.f7789OooO0o0));
            int i = this.f7788OooO0o;
            if (i != 0) {
                notificationChannelOooO00o.setDescription(getString(i));
            }
            notificationManager.createNotificationChannel(notificationChannelOooO00o);
        }
        Class<?> cls = getClass();
        HashMap<Class<? extends DownloadService>, OooO00o> map = f7785OooOO0o;
        OooO00o oooO00o = map.get(cls);
        if (oooO00o == null) {
            int i2 = o000OO00.f34965OooO00o;
            androidx.media3.exoplayer.offline.OooO00o oooO00oOooO0O0 = OooO0O0();
            oooO00oOooO0O0.OooO0OO(false);
            oooO00o = new OooO00o(getApplicationContext(), oooO00oOooO0O0, false, null, cls);
            map.put((Class<? extends DownloadService>) cls, oooO00o);
        }
        this.f7790OooO0oO = oooO00o;
        p080o000OoO.o00O0O.OooO0Oo(oooO00o.f7798OooO0o == null);
        oooO00o.f7798OooO0o = this;
        if (oooO00o.f7795OooO0O0.f7810OooO0oo) {
            o000OO00.OooOOO0(null).postAtFrontOfQueue(new p022Oooo00O.o0OO00O(1, oooO00o, this));
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        OooO00o oooO00o = this.f7790OooO0oO;
        oooO00o.getClass();
        p080o000OoO.o00O0O.OooO0Oo(oooO00o.f7798OooO0o == this);
        oooO00o.f7798OooO0o = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:55:0x00a8  */
    @Override // android.app.Service
    public final int onStartCommand(@Nullable Intent intent, int i, int i2) {
        String action;
        String stringExtra;
        byte b;
        this.f7791OooO0oo = i2;
        boolean z = false;
        this.f7792OooOO0 = false;
        if (intent != null) {
            action = intent.getAction();
            stringExtra = intent.getStringExtra("content_id");
            this.f7786OooO |= intent.getBooleanExtra("foreground", false) || "androidx.media3.exoplayer.downloadService.action.RESTART".equals(action);
        } else {
            action = null;
            stringExtra = null;
        }
        if (action == null) {
            action = "androidx.media3.exoplayer.downloadService.action.INIT";
        }
        OooO00o oooO00o = this.f7790OooO0oO;
        oooO00o.getClass();
        switch (action) {
            case "androidx.media3.exoplayer.downloadService.action.SET_STOP_REASON":
                b = 0;
                break;
            case "androidx.media3.exoplayer.downloadService.action.REMOVE_DOWNLOAD":
                b = 1;
                break;
            case "androidx.media3.exoplayer.downloadService.action.RESTART":
                b = 2;
                break;
            case "androidx.media3.exoplayer.downloadService.action.INIT":
                b = 3;
                break;
            case "androidx.media3.exoplayer.downloadService.action.RESUME_DOWNLOADS":
                b = 4;
                break;
            case "androidx.media3.exoplayer.downloadService.action.REMOVE_ALL_DOWNLOADS":
                b = 5;
                break;
            case "androidx.media3.exoplayer.downloadService.action.ADD_DOWNLOAD":
                b = 6;
                break;
            case "androidx.media3.exoplayer.downloadService.action.SET_REQUIREMENTS":
                b = 7;
                break;
            case "androidx.media3.exoplayer.downloadService.action.PAUSE_DOWNLOADS":
                b = 8;
                break;
            default:
                b = -1;
                break;
        }
        androidx.media3.exoplayer.offline.OooO00o oooO00o2 = oooO00o.f7795OooO0O0;
        switch (b) {
            case 0:
                intent.getClass();
                if (!intent.hasExtra("stop_reason")) {
                    Log.OooO0OO("DownloadService", "Ignored SET_STOP_REASON: Missing stop_reason extra");
                } else {
                    int intExtra = intent.getIntExtra("stop_reason", 0);
                    oooO00o2.f7807OooO0o++;
                    oooO00o2.f7805OooO0OO.obtainMessage(3, intExtra, 0, stringExtra).sendToTarget();
                }
                break;
            case 1:
                if (stringExtra != null) {
                    oooO00o2.f7807OooO0o++;
                    oooO00o2.f7805OooO0OO.obtainMessage(7, stringExtra).sendToTarget();
                } else {
                    Log.OooO0OO("DownloadService", "Ignored REMOVE_DOWNLOAD: Missing content_id extra");
                }
                break;
            case 2:
            case 3:
                break;
            case 4:
                oooO00o2.OooO0OO(false);
                break;
            case 5:
                oooO00o2.f7807OooO0o++;
                oooO00o2.f7805OooO0OO.obtainMessage(8).sendToTarget();
                break;
            case 6:
                intent.getClass();
                DownloadRequest downloadRequest = (DownloadRequest) intent.getParcelableExtra("download_request");
                if (downloadRequest != null) {
                    int intExtra2 = intent.getIntExtra("stop_reason", 0);
                    oooO00o2.f7807OooO0o++;
                    oooO00o2.f7805OooO0OO.obtainMessage(6, intExtra2, 0, downloadRequest).sendToTarget();
                } else {
                    Log.OooO0OO("DownloadService", "Ignored ADD_DOWNLOAD: Missing download_request extra");
                }
                break;
            case 7:
                intent.getClass();
                Requirements requirements = (Requirements) intent.getParcelableExtra("requirements");
                if (requirements == null) {
                    Log.OooO0OO("DownloadService", "Ignored SET_REQUIREMENTS: Missing requirements extra");
                } else if (!requirements.equals(oooO00o2.f7814OooOOO.f34359OooO0OO)) {
                    o00000O o00000o = oooO00o2.f7814OooOOO;
                    o00000O.OooO00o oooO00o3 = o00000o.f34362OooO0o0;
                    oooO00o3.getClass();
                    Context context = o00000o.f34357OooO00o;
                    context.unregisterReceiver(oooO00o3);
                    o00000o.f34362OooO0o0 = null;
                    if (o000OO00.f34965OooO00o >= 24 && o00000o.f34363OooO0oO != null) {
                        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                        connectivityManager.getClass();
                        o00000O.OooO0OO oooO0OO = o00000o.f34363OooO0oO;
                        oooO0OO.getClass();
                        connectivityManager.unregisterNetworkCallback(oooO0OO);
                        o00000o.f34363OooO0oO = null;
                    }
                    o00000O o00000o2 = new o00000O(oooO00o2.f7803OooO00o, oooO00o2.f7806OooO0Oo, requirements);
                    oooO00o2.f7814OooOOO = o00000o2;
                    oooO00o2.OooO0O0(oooO00o2.f7814OooOOO, o00000o2.OooO0O0());
                }
                break;
            case 8:
                oooO00o2.OooO0OO(true);
                break;
            default:
                Log.OooO0OO("DownloadService", "Ignored unrecognized action: ".concat(action));
                break;
        }
        if (o000OO00.f34965OooO00o >= 26) {
            boolean z2 = this.f7786OooO;
        }
        this.f7793OooOO0O = false;
        if (oooO00o2.f7809OooO0oO == 0 && oooO00o2.f7807OooO0o == 0) {
            z = true;
        }
        if (z) {
            OooO0Oo();
        }
        return 1;
    }

    @Override // android.app.Service
    public final void onTaskRemoved(Intent intent) {
        this.f7792OooOO0 = true;
    }
}
