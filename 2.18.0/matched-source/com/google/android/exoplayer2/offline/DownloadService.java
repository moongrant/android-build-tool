package com.google.android.exoplayer2.offline;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.scheduler.Requirements;
import java.util.HashMap;
import java.util.Objects;
import p310o0O0o0oO.o000O00;
import p319o0O0oOo.o00;
import p319o0O0oOo.o00000O0;
import p468o0OooO0.o0O0O00;
import p570o0oOo0O0.o0000O;

/* JADX INFO: loaded from: classes2.dex */
public abstract class DownloadService extends Service {

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public static final HashMap<Class<? extends DownloadService>, OooO00o> f14606OoooOO0 = new HashMap<>();

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public o0000O f14607Oooo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public boolean f14608OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public boolean f14609OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public int f14610OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public boolean f14611OoooO0O;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o0000O f14612OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @Nullable
        public final o000O00 f14613OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @Nullable
        public DownloadService f14614OooO0OO;
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
        OooO00o oooO00o = f14606OoooOO0.get(getClass());
        if (oooO00o != null) {
            this.f14607Oooo = oooO00o.f14612OooO00o;
            o00000O0.OooO0Oo(oooO00o.f14614OooO0OO == null);
            oooO00o.f14614OooO0OO = this;
            Objects.requireNonNull(oooO00o.f14612OooO00o);
            return;
        }
        o0000O o0000oOooO00o = OooO00o();
        this.f14607Oooo = o0000oOooO00o;
        if (o0000oOooO00o.f45477OooO0O0) {
            o0000oOooO00o.f45477OooO0O0 = false;
            o0000oOooO00o.f45476OooO00o++;
            throw null;
        }
        getApplicationContext();
        Objects.requireNonNull(this.f14607Oooo);
        throw null;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        OooO00o oooO00o = f14606OoooOO0.get(getClass());
        Objects.requireNonNull(oooO00o);
        o00000O0.OooO0Oo(oooO00o.f14614OooO0OO == this);
        oooO00o.f14614OooO0OO = null;
        if (oooO00o.f14613OooO0O0 != null) {
            Objects.requireNonNull(oooO00o.f14612OooO00o);
            oooO00o.f14613OooO0O0.cancel();
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(@Nullable Intent intent, int i, int i2) {
        String action;
        String stringExtra;
        this.f14610OoooO00 = i2;
        this.f14611OoooO0O = false;
        if (intent != null) {
            action = intent.getAction();
            stringExtra = intent.getStringExtra("content_id");
            this.f14609OoooO0 |= intent.getBooleanExtra("foreground", false) || "com.google.android.exoplayer.downloadService.action.RESTART".equals(action);
        } else {
            action = null;
            stringExtra = null;
        }
        if (action == null) {
            action = "com.google.android.exoplayer.downloadService.action.INIT";
        }
        o0000O o0000o2 = this.f14607Oooo;
        Objects.requireNonNull(o0000o2);
        switch (action) {
            case "com.google.android.exoplayer.downloadService.action.ADD_DOWNLOAD":
                Objects.requireNonNull(intent);
                if (((DownloadRequest) intent.getParcelableExtra("download_request")) != null) {
                    intent.getIntExtra("stop_reason", 0);
                    o0000o2.f45476OooO00o++;
                    throw null;
                }
                Log.e("DownloadService", "Ignored ADD_DOWNLOAD: Missing download_request extra");
                break;
                break;
            case "com.google.android.exoplayer.downloadService.action.RESUME_DOWNLOADS":
                if (o0000o2.f45477OooO0O0) {
                    o0000o2.f45477OooO0O0 = false;
                    o0000o2.f45476OooO00o++;
                    throw null;
                }
                break;
            case "com.google.android.exoplayer.downloadService.action.RESTART":
            case "com.google.android.exoplayer.downloadService.action.INIT":
                break;
            case "com.google.android.exoplayer.downloadService.action.REMOVE_ALL_DOWNLOADS":
                o0000o2.f45476OooO00o++;
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
                    o0O0O00.OooO00o(65, "Ignoring requirements not supported by the Scheduler: ", requirements.f14618Oooo ^ requirementsOooO00o.f14618Oooo, "DownloadService");
                    throw null;
                }
                Log.e("DownloadService", "Ignored SET_REQUIREMENTS: Missing requirements extra");
                break;
                break;
            case "com.google.android.exoplayer.downloadService.action.PAUSE_DOWNLOADS":
                if (!o0000o2.f45477OooO0O0) {
                    o0000o2.f45477OooO0O0 = true;
                    o0000o2.f45476OooO00o++;
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
                    o0000o2.f45476OooO00o++;
                    throw null;
                }
                break;
            case "com.google.android.exoplayer.downloadService.action.REMOVE_DOWNLOAD":
                if (stringExtra != null) {
                    o0000o2.f45476OooO00o++;
                    throw null;
                }
                Log.e("DownloadService", "Ignored REMOVE_DOWNLOAD: Missing content_id extra");
                break;
                break;
            default:
                Log.e("DownloadService", action.length() != 0 ? "Ignored unrecognized action: ".concat(action) : new String("Ignored unrecognized action: "));
                break;
        }
        int i3 = o00.f36680OooO00o;
        this.f14608OoooO = false;
        if (o0000o2.f45476OooO00o == 0) {
            if (i3 >= 28 || !this.f14611OoooO0O) {
                this.f14608OoooO = stopSelfResult(this.f14610OoooO00) | false;
            } else {
                stopSelf();
                this.f14608OoooO = true;
            }
        }
        return 1;
    }

    @Override // android.app.Service
    public final void onTaskRemoved(Intent intent) {
        this.f14611OoooO0O = true;
    }
}
