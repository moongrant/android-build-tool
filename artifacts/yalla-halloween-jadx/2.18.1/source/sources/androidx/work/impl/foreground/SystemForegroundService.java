package androidx.work.impl.foreground;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.LifecycleService;
import java.util.Objects;
import java.util.UUID;
import o00O000.OooO0O0;
import p102o000oo.o0OoOo0;
import p107o000ooO0.o00oO0o;
import p326o0O0ooO.o00O0000;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class SystemForegroundService extends LifecycleService implements androidx.work.impl.foreground.OooO00o.InterfaceC0071OooO00o {

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public static final String f9835OoooO00 = o0OoOo0.OooO0o0("SystemFgService");

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public NotificationManager f9836Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public Handler f9837Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public boolean f9838Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public androidx.work.impl.foreground.OooO00o f9839Oooo0oo;

    public class OooO00o implements Runnable {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ int f9841Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ Notification f9842Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ int f9843Oooo0oo;

        public OooO00o(int i, Notification notification, int i2) {
            this.f9841Oooo0o = i;
            this.f9842Oooo0oO = notification;
            this.f9843Oooo0oo = i2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (Build.VERSION.SDK_INT >= 29) {
                SystemForegroundService.this.startForeground(this.f9841Oooo0o, this.f9842Oooo0oO, this.f9843Oooo0oo);
            } else {
                SystemForegroundService.this.startForeground(this.f9841Oooo0o, this.f9842Oooo0oO);
            }
        }
    }

    @MainThread
    public final void OooO00o() {
        this.f9837Oooo0o = new Handler(Looper.getMainLooper());
        this.f9836Oooo = (NotificationManager) getApplicationContext().getSystemService("notification");
        androidx.work.impl.foreground.OooO00o oooO00o = new androidx.work.impl.foreground.OooO00o(getApplicationContext());
        this.f9839Oooo0oo = oooO00o;
        if (oooO00o.f9834o000oOoO != null) {
            o0OoOo0.OooO0OO().OooO0O0(androidx.work.impl.foreground.OooO00o.f9824OoooOOO, "A callback already exists.", new Throwable[0]);
        } else {
            oooO00o.f9834o000oOoO = this;
        }
    }

    public final void OooO0O0(int i, int i2, @NonNull Notification notification) {
        this.f9837Oooo0o.post(new OooO00o(i, notification, i2));
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public final void onCreate() {
        super.onCreate();
        OooO00o();
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f9839Oooo0oo.OooO0oO();
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public final int onStartCommand(@Nullable Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.f9838Oooo0oO) {
            o0OoOo0.OooO0OO().OooO0Oo(f9835OoooO00, "Re-initializing SystemForegroundService after a request to shut-down.", new Throwable[0]);
            this.f9839Oooo0oo.OooO0oO();
            OooO00o();
            this.f9838Oooo0oO = false;
        }
        if (intent == null) {
            return 3;
        }
        androidx.work.impl.foreground.OooO00o oooO00o = this.f9839Oooo0oo;
        Objects.requireNonNull(oooO00o);
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            o0OoOo0.OooO0OO().OooO0Oo(androidx.work.impl.foreground.OooO00o.f9824OoooOOO, String.format("Started foreground service %s", intent), new Throwable[0]);
            String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
            ((OooO0O0) oooO00o.f9828Oooo0oo).OooO00o(new o00.OooO0O0(oooO00o, oooO00o.f9827Oooo0oO.f29976OooO0OO, stringExtra));
            oooO00o.OooO0o0(intent);
            return 3;
        }
        if ("ACTION_NOTIFY".equals(action)) {
            oooO00o.OooO0o0(intent);
            return 3;
        }
        if ("ACTION_CANCEL_WORK".equals(action)) {
            o0OoOo0.OooO0OO().OooO0Oo(androidx.work.impl.foreground.OooO00o.f9824OoooOOO, String.format("Stopping foreground work for %s", intent), new Throwable[0]);
            String stringExtra2 = intent.getStringExtra("KEY_WORKSPEC_ID");
            if (stringExtra2 == null || TextUtils.isEmpty(stringExtra2)) {
                return 3;
            }
            o00oO0o o00oo0o2 = oooO00o.f9827Oooo0oO;
            UUID uuidFromString = UUID.fromString(stringExtra2);
            Objects.requireNonNull(o00oo0o2);
            ((OooO0O0) o00oo0o2.f29977OooO0Oo).OooO00o(new o00O0000(o00oo0o2, uuidFromString));
            return 3;
        }
        if (!"ACTION_STOP_FOREGROUND".equals(action)) {
            return 3;
        }
        o0OoOo0.OooO0OO().OooO0Oo(androidx.work.impl.foreground.OooO00o.f9824OoooOOO, "Stopping foreground service", new Throwable[0]);
        androidx.work.impl.foreground.OooO00o.InterfaceC0071OooO00o interfaceC0071OooO00o = oooO00o.f9834o000oOoO;
        if (interfaceC0071OooO00o == null) {
            return 3;
        }
        SystemForegroundService systemForegroundService = (SystemForegroundService) interfaceC0071OooO00o;
        systemForegroundService.f9838Oooo0oO = true;
        o0OoOo0.OooO0OO().OooO00o(f9835OoooO00, "All commands completed.", new Throwable[0]);
        if (Build.VERSION.SDK_INT >= 26) {
            systemForegroundService.stopForeground(true);
        }
        systemForegroundService.stopSelf();
        return 3;
    }
}
