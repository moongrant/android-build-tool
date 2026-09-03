package androidx.work.impl.foreground;

import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.MainThread;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.LifecycleService;
import java.util.UUID;
import p084o000Ooo0.o000oOoO;
import p085o000OooO.o0OOO0o;
import p092o000o0O0.o00000OO;
import p093o000o0OO.o00O0O;
import p096o000o0o0.o0000O0O;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class SystemForegroundService extends LifecycleService implements OooO00o.InterfaceC0169OooO00o {

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final String f8478OooO0oo = o000oOoO.OooO0o0("SystemFgService");

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public Handler f8479OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public OooO00o f8480OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f8481OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public NotificationManager f8482OooO0oO;

    @MainThread
    public final void OooO00o() {
        this.f8479OooO0Oo = new Handler(Looper.getMainLooper());
        this.f8482OooO0oO = (NotificationManager) getApplicationContext().getSystemService("notification");
        OooO00o oooO00o = new OooO00o(getApplicationContext());
        this.f8480OooO0o = oooO00o;
        if (oooO00o.f8477OooOO0o == null) {
            oooO00o.f8477OooOO0o = this;
        } else {
            o000oOoO.OooO0OO().OooO0O0(OooO00o.f8468OooOOO0, "A callback already exists.", new Throwable[0]);
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
        OooO00o oooO00o = this.f8480OooO0o;
        oooO00o.f8477OooOO0o = null;
        synchronized (oooO00o.f8471OooO0o) {
            oooO00o.f8476OooOO0O.OooO0Oo();
        }
        oooO00o.f8470OooO0Oo.f35162OooO0o.OooO0o(oooO00o);
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public final int onStartCommand(@Nullable Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        boolean z = this.f8481OooO0o0;
        String str = f8478OooO0oo;
        if (z) {
            o000oOoO.OooO0OO().OooO0Oo(str, "Re-initializing SystemForegroundService after a request to shut-down.", new Throwable[0]);
            OooO00o oooO00o = this.f8480OooO0o;
            oooO00o.f8477OooOO0o = null;
            synchronized (oooO00o.f8471OooO0o) {
                oooO00o.f8476OooOO0O.OooO0Oo();
            }
            oooO00o.f8470OooO0Oo.f35162OooO0o.OooO0o(oooO00o);
            OooO00o();
            this.f8481OooO0o0 = false;
        }
        if (intent == null) {
            return 3;
        }
        OooO00o oooO00o2 = this.f8480OooO0o;
        oooO00o2.getClass();
        String action = intent.getAction();
        boolean zEquals = "ACTION_START_FOREGROUND".equals(action);
        String str2 = OooO00o.f8468OooOOO0;
        o0OOO0o o0ooo0o2 = oooO00o2.f8470OooO0Oo;
        if (zEquals) {
            o000oOoO.OooO0OO().OooO0Oo(str2, String.format("Started foreground service %s", intent), new Throwable[0]);
            ((o0000O0O) oooO00o2.f8472OooO0o0).OooO00o(new o00000OO(oooO00o2, o0ooo0o2.f35160OooO0OO, intent.getStringExtra("KEY_WORKSPEC_ID")));
            oooO00o2.OooO0Oo(intent);
            return 3;
        }
        if ("ACTION_NOTIFY".equals(action)) {
            oooO00o2.OooO0Oo(intent);
            return 3;
        }
        if ("ACTION_CANCEL_WORK".equals(action)) {
            o000oOoO.OooO0OO().OooO0Oo(str2, String.format("Stopping foreground work for %s", intent), new Throwable[0]);
            String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
            if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
                return 3;
            }
            UUID uuidFromString = UUID.fromString(stringExtra);
            o0ooo0o2.getClass();
            ((o0000O0O) o0ooo0o2.f35161OooO0Oo).OooO00o(new o00O0O(o0ooo0o2, uuidFromString));
            return 3;
        }
        if (!"ACTION_STOP_FOREGROUND".equals(action)) {
            return 3;
        }
        o000oOoO.OooO0OO().OooO0Oo(str2, "Stopping foreground service", new Throwable[0]);
        OooO00o.InterfaceC0169OooO00o interfaceC0169OooO00o = oooO00o2.f8477OooOO0o;
        if (interfaceC0169OooO00o == null) {
            return 3;
        }
        SystemForegroundService systemForegroundService = (SystemForegroundService) interfaceC0169OooO00o;
        systemForegroundService.f8481OooO0o0 = true;
        o000oOoO.OooO0OO().OooO00o(str, "All commands completed.", new Throwable[0]);
        if (Build.VERSION.SDK_INT >= 26) {
            systemForegroundService.stopForeground(true);
        }
        systemForegroundService.stopSelf();
        return 3;
    }
}
