package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import android.os.PowerManager;
import androidx.annotation.MainThread;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.LifecycleService;
import java.util.HashMap;
import java.util.WeakHashMap;
import p084o000Ooo0.o000oOoO;
import p093o000o0OO.o000000;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class SystemAlarmService extends LifecycleService implements OooO0o.OooO0OO {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final String f8461OooO0o = o000oOoO.OooO0o0("SystemAlarmService");

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public OooO0o f8462OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f8463OooO0o0;

    @MainThread
    public final void OooO00o() {
        OooO0o oooO0o = new OooO0o(this);
        this.f8462OooO0Oo = oooO0o;
        if (oooO0o.f8454OooOOO0 == null) {
            oooO0o.f8454OooOOO0 = this;
        } else {
            o000oOoO.OooO0OO().OooO0O0(OooO0o.f8444OooOOO, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
        }
    }

    @MainThread
    public final void OooO0O0() {
        this.f8463OooO0o0 = true;
        o000oOoO.OooO0OO().OooO00o(f8461OooO0o, "All commands completed in dispatcher", new Throwable[0]);
        String str = o000000.f35309OooO00o;
        HashMap map = new HashMap();
        WeakHashMap<PowerManager.WakeLock, String> weakHashMap = o000000.f35310OooO0O0;
        synchronized (weakHashMap) {
            map.putAll(weakHashMap);
        }
        for (PowerManager.WakeLock wakeLock : map.keySet()) {
            if (wakeLock != null && wakeLock.isHeld()) {
                o000oOoO.OooO0OO().OooO0o(o000000.f35309OooO00o, String.format("WakeLock held for %s", map.get(wakeLock)), new Throwable[0]);
            }
        }
        stopSelf();
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public final void onCreate() {
        super.onCreate();
        OooO00o();
        this.f8463OooO0o0 = false;
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f8463OooO0o0 = true;
        this.f8462OooO0Oo.OooO0Oo();
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.f8463OooO0o0) {
            o000oOoO.OooO0OO().OooO0Oo(f8461OooO0o, "Re-initializing SystemAlarmDispatcher after a request to shut-down.", new Throwable[0]);
            this.f8462OooO0Oo.OooO0Oo();
            OooO00o();
            this.f8463OooO0o0 = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f8462OooO0Oo.OooO00o(i2, intent);
        return 3;
    }
}
