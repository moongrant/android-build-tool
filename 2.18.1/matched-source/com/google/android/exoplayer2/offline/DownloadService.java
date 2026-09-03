package com.google.android.exoplayer2.offline;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.scheduler.Requirements;
import java.util.HashMap;
import java.util.Objects;
import o00O00O.OooO0OO;
import p309o0O0o0oO.o000O00;
import p318o0O0oOo.o00000O0;
import p318o0O0oOo.o000OOo0;
import p568o0oOo0O0.o0000O;

/* JADX INFO: loaded from: classes2.dex */
public abstract class DownloadService extends Service {

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public static final HashMap<Class<? extends DownloadService>, OooO00o> f14588OoooO0 = new HashMap<>();

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public boolean f14589Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public o0000O f14590Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int f14591Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public boolean f14592Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public boolean f14593OoooO00;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o0000O f14594OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @Nullable
        public final o000O00 f14595OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @Nullable
        public DownloadService f14596OooO0OO;
    }

    public abstract o0000O OooO00o();

    @Nullable
    public abstract o000O00 OooO0O0();

    @Override // android.app.Service
    @Nullable
    public final IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException();
    }

    @Override // android.app.Service
    public final void onCreate() {
        OooO00o oooO00o = f14588OoooO0.get(getClass());
        if (oooO00o != null) {
            this.f14590Oooo0o = oooO00o.f14594OooO00o;
            o00000O0.OooO0Oo(oooO00o.f14596OooO0OO == null);
            oooO00o.f14596OooO0OO = this;
            Objects.requireNonNull(oooO00o.f14594OooO00o);
            return;
        }
        o0000O o0000oOooO00o = OooO00o();
        this.f14590Oooo0o = o0000oOooO00o;
        if (o0000oOooO00o.f45461OooO0O0) {
            o0000oOooO00o.f45461OooO0O0 = false;
            o0000oOooO00o.f45460OooO00o++;
            throw null;
        }
        getApplicationContext();
        Objects.requireNonNull(this.f14590Oooo0o);
        throw null;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        OooO00o oooO00o = f14588OoooO0.get(getClass());
        Objects.requireNonNull(oooO00o);
        o00000O0.OooO0Oo(oooO00o.f14596OooO0OO == this);
        oooO00o.f14596OooO0OO = null;
        if (oooO00o.f14595OooO0O0 != null) {
            Objects.requireNonNull(oooO00o.f14594OooO00o);
            oooO00o.f14595OooO0O0.cancel();
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(@Nullable Intent intent, int i, int i2) {
        String action;
        String stringExtra;
        this.f14591Oooo0oO = i2;
        this.f14589Oooo = false;
        if (intent != null) {
            action = intent.getAction();
            stringExtra = intent.getStringExtra("content_id");
            this.f14592Oooo0oo |= intent.getBooleanExtra("foreground", false) || "com.google.android.exoplayer.downloadService.action.RESTART".equals(action);
        } else {
            action = null;
            stringExtra = null;
        }
        if (action == null) {
            action = "com.google.android.exoplayer.downloadService.action.INIT";
        }
        o0000O o0000o2 = this.f14590Oooo0o;
        Objects.requireNonNull(o0000o2);
        switch (action) {
            case "com.google.android.exoplayer.downloadService.action.ADD_DOWNLOAD":
                Objects.requireNonNull(intent);
                if (((DownloadRequest) intent.getParcelableExtra("download_request")) != null) {
                    intent.getIntExtra("stop_reason", 0);
                    o0000o2.f45460OooO00o++;
                    throw null;
                }
                Log.e("DownloadService", "Ignored ADD_DOWNLOAD: Missing download_request extra");
                break;
                break;
            case "com.google.android.exoplayer.downloadService.action.RESUME_DOWNLOADS":
                if (o0000o2.f45461OooO0O0) {
                    o0000o2.f45461OooO0O0 = false;
                    o0000o2.f45460OooO00o++;
                    throw null;
                }
                break;
            case "com.google.android.exoplayer.downloadService.action.RESTART":
            case "com.google.android.exoplayer.downloadService.action.INIT":
                break;
            case "com.google.android.exoplayer.downloadService.action.REMOVE_ALL_DOWNLOADS":
                o0000o2.f45460OooO00o++;
                throw null;
            case "com.google.android.exoplayer.downloadService.action.SET_REQUIREMENTS":
                Objects.requireNonNull(intent);
                Requirements requirements = (Requirements) intent.getParcelableExtra("requirements");
                if (requirements != null) {
                    o000O00 o000o00OooO0O0 = OooO0O0();
                    if (o000o00OooO0O0 == null) {
                        throw null;
                    }
                    Requirements requirementsOooO00o = o000o00OooO0O0.OooO00o();
                    if (requirementsOooO00o.equals(requirements)) {
                        throw null;
                    }
                    OooO0OO.OooO0O0(65, "Ignoring requirements not supported by the Scheduler: ", requirements.f14600Oooo0o ^ requirementsOooO00o.f14600Oooo0o, "DownloadService");
                    throw null;
                }
                Log.e("DownloadService", "Ignored SET_REQUIREMENTS: Missing requirements extra");
                break;
                break;
            case "com.google.android.exoplayer.downloadService.action.PAUSE_DOWNLOADS":
                if (!o0000o2.f45461OooO0O0) {
                    o0000o2.f45461OooO0O0 = true;
                    o0000o2.f45460OooO00o++;
                    throw null;
                }
                break;
            case "com.google.android.exoplayer.downloadService.action.SET_STOP_REASON":
                Objects.requireNonNull(intent);
                if (!intent.hasExtra("stop_reason")) {
                    Log.e("DownloadService", "Ignored SET_STOP_REASON: Missing stop_reason extra");
                    break;
                } else {
                    intent.getIntExtra("stop_reason", 0);
                    o0000o2.f45460OooO00o++;
                    throw null;
                }
                break;
            case "com.google.android.exoplayer.downloadService.action.REMOVE_DOWNLOAD":
                if (stringExtra != null) {
                    o0000o2.f45460OooO00o++;
                    throw null;
                }
                Log.e("DownloadService", "Ignored REMOVE_DOWNLOAD: Missing content_id extra");
                break;
                break;
            default:
                Log.e("DownloadService", action.length() != 0 ? "Ignored unrecognized action: ".concat(action) : new String("Ignored unrecognized action: "));
                break;
        }
        int i3 = o000OOo0.f36740OooO00o;
        this.f14593OoooO00 = false;
        if (o0000o2.f45460OooO00o == 0) {
            if (i3 >= 28 || !this.f14589Oooo) {
                this.f14593OoooO00 = stopSelfResult(this.f14591Oooo0oO) | false;
            } else {
                stopSelf();
                this.f14593OoooO00 = true;
            }
        }
        return 1;
    }

    @Override // android.app.Service
    public final void onTaskRemoved(Intent intent) {
        this.f14589Oooo = true;
    }
}
