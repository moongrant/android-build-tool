package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import android.os.PowerManager;
import androidx.annotation.MainThread;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.LifecycleService;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import o00O0OOO.o0OO00O;
import p115o00O00oO.o0Oo0oo;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class SystemAlarmService extends LifecycleService implements OooO0o.OooO0OO {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final String f11546OooO0o = o0Oo0oo.OooO0o("SystemAlarmService");

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public OooO0o f11547OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f11548OooO0o0;

    @MainThread
    public final void OooO00o() {
        this.f11548OooO0o0 = true;
        o0Oo0oo.OooO0Oo().OooO00o(f11546OooO0o, "All commands completed in dispatcher");
        String str = o00O0OOO.o0Oo0oo.f36310OooO00o;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        synchronized (o0OO00O.f36308OooO00o) {
            linkedHashMap.putAll(o0OO00O.f36309OooO0O0);
            Unit unit = Unit.INSTANCE;
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) entry.getKey();
            String str2 = (String) entry.getValue();
            if (wakeLock != null && wakeLock.isHeld()) {
                o0Oo0oo.OooO0Oo().OooO0oO(o00O0OOO.o0Oo0oo.f36310OooO00o, "WakeLock held for " + str2);
            }
        }
        stopSelf();
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public final void onCreate() {
        super.onCreate();
        OooO0o oooO0o = new OooO0o(this);
        this.f11547OooO0Oo = oooO0o;
        if (oooO0o.f11539OooOO0o != null) {
            o0Oo0oo.OooO0Oo().OooO0O0(OooO0o.f11530OooOOO0, "A completion listener for SystemAlarmDispatcher already exists.");
        } else {
            oooO0o.f11539OooOO0o = this;
        }
        this.f11548OooO0o0 = false;
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f11548OooO0o0 = true;
        OooO0o oooO0o = this.f11547OooO0Oo;
        oooO0o.getClass();
        o0Oo0oo.OooO0Oo().OooO00o(OooO0o.f11530OooOOO0, "Destroying SystemAlarmDispatcher");
        oooO0o.f11535OooO0oO.OooO0oO(oooO0o);
        oooO0o.f11539OooOO0o = null;
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.f11548OooO0o0) {
            o0Oo0oo.OooO0Oo().OooO0o0(f11546OooO0o, "Re-initializing SystemAlarmDispatcher after a request to shut-down.");
            OooO0o oooO0o = this.f11547OooO0Oo;
            oooO0o.getClass();
            o0Oo0oo o0oo0ooOooO0Oo = o0Oo0oo.OooO0Oo();
            String str = OooO0o.f11530OooOOO0;
            o0oo0ooOooO0Oo.OooO00o(str, "Destroying SystemAlarmDispatcher");
            oooO0o.f11535OooO0oO.OooO0oO(oooO0o);
            oooO0o.f11539OooOO0o = null;
            OooO0o oooO0o2 = new OooO0o(this);
            this.f11547OooO0Oo = oooO0o2;
            if (oooO0o2.f11539OooOO0o != null) {
                o0Oo0oo.OooO0Oo().OooO0O0(str, "A completion listener for SystemAlarmDispatcher already exists.");
            } else {
                oooO0o2.f11539OooOO0o = this;
            }
            this.f11548OooO0o0 = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f11547OooO0Oo.OooO00o(i2, intent);
        return 3;
    }
}
