package androidx.media3.exoplayer.offline;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.scheduler.Requirements;
import java.util.HashMap;
import o000O000.OooO0o;
import p070o000O0o.OooOOO0;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public abstract class DownloadService extends Service {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final HashMap<Class<? extends DownloadService>, OooO00o> f6282OooO0o = new HashMap<>();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public OooO00o f6283OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f6284OooO0o0;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Nullable
        public DownloadService f6285OooO00o;

        public OooO00o() {
            throw null;
        }
    }

    public abstract OooOOO0 OooO00o();

    @Override // android.app.Service
    @Nullable
    public final IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException();
    }

    @Override // android.app.Service
    public final void onCreate() {
        OooO00o oooO00o = f6282OooO0o.get(getClass());
        if (oooO00o == null) {
            int i = OooO0o.f34423OooO00o;
            OooO00o();
            throw null;
        }
        this.f6283OooO0Oo = oooO00o;
        o000O000.OooO00o.OooO0O0(oooO00o.f6285OooO00o == null);
        oooO00o.f6285OooO00o = this;
        throw null;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        OooO00o oooO00o = this.f6283OooO0Oo;
        oooO00o.getClass();
        o000O000.OooO00o.OooO0O0(oooO00o.f6285OooO00o == this);
        oooO00o.f6285OooO00o = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:54:0x009d  */
    @Override // android.app.Service
    public final int onStartCommand(@Nullable Intent intent, int i, int i2) {
        String action;
        String stringExtra;
        if (intent != null) {
            action = intent.getAction();
            stringExtra = intent.getStringExtra("content_id");
            this.f6284OooO0o0 |= intent.getBooleanExtra("foreground", false) || "androidx.media3.exoplayer.downloadService.action.RESTART".equals(action);
        } else {
            action = null;
            stringExtra = null;
        }
        if (action == null) {
            action = "androidx.media3.exoplayer.downloadService.action.INIT";
        }
        this.f6283OooO0Oo.getClass();
        switch (action) {
            case "androidx.media3.exoplayer.downloadService.action.SET_STOP_REASON":
                intent.getClass();
                if (!intent.hasExtra("stop_reason")) {
                    Log.OooO0O0("DownloadService", "Ignored SET_STOP_REASON: Missing stop_reason extra");
                    break;
                } else {
                    intent.getIntExtra("stop_reason", 0);
                    throw null;
                }
                break;
            case "androidx.media3.exoplayer.downloadService.action.REMOVE_DOWNLOAD":
                if (stringExtra != null) {
                    throw null;
                }
                Log.OooO0O0("DownloadService", "Ignored REMOVE_DOWNLOAD: Missing content_id extra");
                break;
                break;
            case "androidx.media3.exoplayer.downloadService.action.RESTART":
            case "androidx.media3.exoplayer.downloadService.action.INIT":
                break;
            case "androidx.media3.exoplayer.downloadService.action.RESUME_DOWNLOADS":
                throw null;
            case "androidx.media3.exoplayer.downloadService.action.REMOVE_ALL_DOWNLOADS":
                throw null;
            case "androidx.media3.exoplayer.downloadService.action.ADD_DOWNLOAD":
                intent.getClass();
                if (((DownloadRequest) intent.getParcelableExtra("download_request")) != null) {
                    intent.getIntExtra("stop_reason", 0);
                    throw null;
                }
                Log.OooO0O0("DownloadService", "Ignored ADD_DOWNLOAD: Missing download_request extra");
                break;
                break;
            case "androidx.media3.exoplayer.downloadService.action.SET_REQUIREMENTS":
                intent.getClass();
                if (((Requirements) intent.getParcelableExtra("requirements")) != null) {
                    throw null;
                }
                Log.OooO0O0("DownloadService", "Ignored SET_REQUIREMENTS: Missing requirements extra");
                break;
                break;
            case "androidx.media3.exoplayer.downloadService.action.PAUSE_DOWNLOADS":
                throw null;
            default:
                Log.OooO0O0("DownloadService", "Ignored unrecognized action: ".concat(action));
                break;
        }
        int i3 = OooO0o.f34423OooO00o;
        throw null;
    }

    @Override // android.app.Service
    public final void onTaskRemoved(Intent intent) {
    }
}
