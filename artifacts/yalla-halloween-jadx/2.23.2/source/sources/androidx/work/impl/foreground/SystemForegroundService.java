package androidx.work.impl.foreground;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.DoNotInline;
import androidx.annotation.MainThread;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.LifecycleService;
import java.util.UUID;
import oo00o.o00000O0;
import oo0o0O0.OooO0OO;
import p115o00O00oO.o0Oo0oo;
import p119o00O0Oo0.o00O0O;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class SystemForegroundService extends LifecycleService implements androidx.work.impl.foreground.OooO00o.InterfaceC0188OooO00o {

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final String f11569OooO0oo = o0Oo0oo.OooO0o("SystemFgService");

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public Handler f11570OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public androidx.work.impl.foreground.OooO00o f11571OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f11572OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public NotificationManager f11573OooO0oO;

    @RequiresApi(29)
    public static class OooO00o {
        @DoNotInline
        public static void OooO00o(Service service, int i, Notification notification, int i2) {
            service.startForeground(i, notification, i2);
        }
    }

    @RequiresApi(31)
    public static class OooO0O0 {
        @DoNotInline
        public static void OooO00o(Service service, int i, Notification notification, int i2) {
            try {
                service.startForeground(i, notification, i2);
            } catch (ForegroundServiceStartNotAllowedException e) {
                o0Oo0oo o0oo0ooOooO0Oo = o0Oo0oo.OooO0Oo();
                String str = SystemForegroundService.f11569OooO0oo;
                if (((o0Oo0oo.OooO00o) o0oo0ooOooO0Oo).f36159OooO0OO <= 5) {
                    Log.w(str, "Unable to start foreground service", e);
                }
            }
        }
    }

    @MainThread
    public final void OooO00o() {
        this.f11570OooO0Oo = new Handler(Looper.getMainLooper());
        this.f11573OooO0oO = (NotificationManager) getApplicationContext().getSystemService("notification");
        androidx.work.impl.foreground.OooO00o oooO00o = new androidx.work.impl.foreground.OooO00o(getApplicationContext());
        this.f11571OooO0o = oooO00o;
        if (oooO00o.f11564OooOO0o != null) {
            o0Oo0oo.OooO0Oo().OooO0O0(androidx.work.impl.foreground.OooO00o.f11555OooOOO0, "A callback already exists.");
        } else {
            oooO00o.f11564OooOO0o = this;
        }
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public final void onCreate() {
        super.onCreate();
        OooO00o();
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        androidx.work.impl.foreground.OooO00o oooO00o = this.f11571OooO0o;
        oooO00o.f11564OooOO0o = null;
        synchronized (oooO00o.f11558OooO0o) {
            oooO00o.f11563OooOO0O.OooO0o0();
        }
        oooO00o.f11557OooO0Oo.f60223OooO0o.OooO0oO(oooO00o);
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public final int onStartCommand(@Nullable Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        boolean z = this.f11572OooO0o0;
        String str = f11569OooO0oo;
        if (z) {
            o0Oo0oo.OooO0Oo().OooO0o0(str, "Re-initializing SystemForegroundService after a request to shut-down.");
            androidx.work.impl.foreground.OooO00o oooO00o = this.f11571OooO0o;
            oooO00o.f11564OooOO0o = null;
            synchronized (oooO00o.f11558OooO0o) {
                oooO00o.f11563OooOO0O.OooO0o0();
            }
            oooO00o.f11557OooO0Oo.f60223OooO0o.OooO0oO(oooO00o);
            OooO00o();
            this.f11572OooO0o0 = false;
        }
        if (intent == null) {
            return 3;
        }
        androidx.work.impl.foreground.OooO00o oooO00o2 = this.f11571OooO0o;
        oooO00o2.getClass();
        String action = intent.getAction();
        boolean zEquals = "ACTION_START_FOREGROUND".equals(action);
        String str2 = androidx.work.impl.foreground.OooO00o.f11555OooOOO0;
        if (zEquals) {
            o0Oo0oo.OooO0Oo().OooO0o0(str2, "Started foreground service " + intent);
            ((o00O0O) oooO00o2.f11559OooO0o0).OooO00o(new OooO0OO(oooO00o2, intent.getStringExtra("KEY_WORKSPEC_ID")));
            oooO00o2.OooO0o0(intent);
            return 3;
        }
        if ("ACTION_NOTIFY".equals(action)) {
            oooO00o2.OooO0o0(intent);
            return 3;
        }
        if (!"ACTION_CANCEL_WORK".equals(action)) {
            if (!"ACTION_STOP_FOREGROUND".equals(action)) {
                return 3;
            }
            o0Oo0oo.OooO0Oo().OooO0o0(str2, "Stopping foreground service");
            androidx.work.impl.foreground.OooO00o.InterfaceC0188OooO00o interfaceC0188OooO00o = oooO00o2.f11564OooOO0o;
            if (interfaceC0188OooO00o == null) {
                return 3;
            }
            SystemForegroundService systemForegroundService = (SystemForegroundService) interfaceC0188OooO00o;
            systemForegroundService.f11572OooO0o0 = true;
            o0Oo0oo.OooO0Oo().OooO00o(str, "All commands completed.");
            if (Build.VERSION.SDK_INT >= 26) {
                systemForegroundService.stopForeground(true);
            }
            systemForegroundService.stopSelf();
            return 3;
        }
        o0Oo0oo.OooO0Oo().OooO0o0(str2, "Stopping foreground work for " + intent);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
            return 3;
        }
        UUID uuidFromString = UUID.fromString(stringExtra);
        o00000O0 o00000o1 = oooO00o2.f11557OooO0Oo;
        o00000o1.getClass();
        ((o00O0O) o00000o1.f60222OooO0Oo).OooO00o(new o00O0OOO.OooO0O0(o00000o1, uuidFromString));
        return 3;
    }
}
