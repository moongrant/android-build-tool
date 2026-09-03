package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import android.os.PowerManager;
import androidx.annotation.MainThread;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.LifecycleService;
import java.util.HashMap;
import java.util.WeakHashMap;
import p102o000oo.o0OoOo0;
import p326o0O0ooO.o00O0;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class SystemAlarmService extends LifecycleService implements OooO0o.OooO0OO {

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public static final String f9817Oooo0oo = o0OoOo0.OooO0o0("SystemAlarmService");

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public OooO0o f9818Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public boolean f9819Oooo0oO;

    @MainThread
    public final void OooO00o() {
        OooO0o oooO0o = new OooO0o(this);
        this.f9818Oooo0o = oooO0o;
        if (oooO0o.f9810o000oOoO != null) {
            o0OoOo0.OooO0OO().OooO0O0(OooO0o.f9800OoooOOO, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
        } else {
            oooO0o.f9810o000oOoO = this;
        }
    }

    @MainThread
    public final void OooO0O0() {
        this.f9819Oooo0oO = true;
        o0OoOo0.OooO0OO().OooO00o(f9817Oooo0oo, "All commands completed in dispatcher", new Throwable[0]);
        String str = o00O0.f36976OooO00o;
        HashMap map = new HashMap();
        WeakHashMap<PowerManager.WakeLock, String> weakHashMap = o00O0.f36977OooO0O0;
        synchronized (weakHashMap) {
            map.putAll(weakHashMap);
        }
        for (PowerManager.WakeLock wakeLock : map.keySet()) {
            if (wakeLock != null && wakeLock.isHeld()) {
                o0OoOo0.OooO0OO().OooO0o(o00O0.f36976OooO00o, String.format("WakeLock held for %s", map.get(wakeLock)), new Throwable[0]);
            }
        }
        stopSelf();
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public final void onCreate() {
        super.onCreate();
        OooO00o();
        this.f9819Oooo0oO = false;
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f9819Oooo0oO = true;
        this.f9818Oooo0o.OooO0OO();
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.f9819Oooo0oO) {
            o0OoOo0.OooO0OO().OooO0Oo(f9817Oooo0oo, "Re-initializing SystemAlarmDispatcher after a request to shut-down.", new Throwable[0]);
            this.f9818Oooo0o.OooO0OO();
            OooO00o();
            this.f9819Oooo0oO = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f9818Oooo0o.OooO00o(intent, i2);
        return 3;
    }
}
