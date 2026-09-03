package com.google.android.exoplayer2.offline;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.scheduler.Requirements;
import com.google.android.exoplayer2.util.Log;
import java.util.HashMap;
import p224o00oOOoO.o00O00OO;
import p245o00oo0o.o00O000o;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public abstract class DownloadService extends Service {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final HashMap<Class<? extends DownloadService>, OooO00o> f12876OooO0o = new HashMap<>();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public OooO00o f12877OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f12878OooO0o0;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Nullable
        public DownloadService f12879OooO00o;

        public OooO00o() {
            throw null;
        }
    }

    public abstract o00O00OO OooO00o();

    @Override // android.app.Service
    @Nullable
    public final IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException();
    }

    @Override // android.app.Service
    public final void onCreate() {
        OooO00o oooO00o = f12876OooO0o.get(getClass());
        if (oooO00o == null) {
            int i = o0O00.f40595OooO00o;
            OooO00o();
            throw null;
        }
        this.f12877OooO0Oo = oooO00o;
        o00O000o.OooO0Oo(oooO00o.f12879OooO00o == null);
        oooO00o.f12879OooO00o = this;
        throw null;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        OooO00o oooO00o = this.f12877OooO0Oo;
        oooO00o.getClass();
        o00O000o.OooO0Oo(oooO00o.f12879OooO00o == this);
        oooO00o.f12879OooO00o = null;
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
            this.f12878OooO0o0 |= intent.getBooleanExtra("foreground", false) || "com.google.android.exoplayer.downloadService.action.RESTART".equals(action);
        } else {
            action = null;
            stringExtra = null;
        }
        if (action == null) {
            action = "com.google.android.exoplayer.downloadService.action.INIT";
        }
        this.f12877OooO0Oo.getClass();
        switch (action) {
            case "com.google.android.exoplayer.downloadService.action.ADD_DOWNLOAD":
                intent.getClass();
                if (((DownloadRequest) intent.getParcelableExtra("download_request")) != null) {
                    intent.getIntExtra("stop_reason", 0);
                    throw null;
                }
                Log.OooO0OO("DownloadService", "Ignored ADD_DOWNLOAD: Missing download_request extra");
                break;
                break;
            case "com.google.android.exoplayer.downloadService.action.RESUME_DOWNLOADS":
                throw null;
            case "com.google.android.exoplayer.downloadService.action.RESTART":
            case "com.google.android.exoplayer.downloadService.action.INIT":
                break;
            case "com.google.android.exoplayer.downloadService.action.REMOVE_ALL_DOWNLOADS":
                throw null;
            case "com.google.android.exoplayer.downloadService.action.SET_REQUIREMENTS":
                intent.getClass();
                if (((Requirements) intent.getParcelableExtra("requirements")) != null) {
                    throw null;
                }
                Log.OooO0OO("DownloadService", "Ignored SET_REQUIREMENTS: Missing requirements extra");
                break;
                break;
            case "com.google.android.exoplayer.downloadService.action.PAUSE_DOWNLOADS":
                throw null;
            case "com.google.android.exoplayer.downloadService.action.SET_STOP_REASON":
                intent.getClass();
                if (!intent.hasExtra("stop_reason")) {
                    Log.OooO0OO("DownloadService", "Ignored SET_STOP_REASON: Missing stop_reason extra");
                    break;
                } else {
                    intent.getIntExtra("stop_reason", 0);
                    throw null;
                }
                break;
            case "com.google.android.exoplayer.downloadService.action.REMOVE_DOWNLOAD":
                if (stringExtra != null) {
                    throw null;
                }
                Log.OooO0OO("DownloadService", "Ignored REMOVE_DOWNLOAD: Missing content_id extra");
                break;
                break;
            default:
                Log.OooO0OO("DownloadService", "Ignored unrecognized action: ".concat(action));
                break;
        }
        int i3 = o0O00.f40595OooO00o;
        throw null;
    }

    @Override // android.app.Service
    public final void onTaskRemoved(Intent intent) {
    }
}
