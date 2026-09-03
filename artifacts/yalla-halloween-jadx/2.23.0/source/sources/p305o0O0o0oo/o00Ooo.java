package p305o0O0o0oo;

import androidx.annotation.NonNull;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.perf.v1.ApplicationProcessState;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o00Ooo implements o00Oo0.OooO0O0 {
    private final WeakReference<o00Oo0.OooO0O0> appStateCallback;
    private final o00Oo0 appStateMonitor;
    private ApplicationProcessState currentAppState;
    private boolean isRegisteredForAppState;

    public o00Ooo() {
        this(o00Oo0.OooO00o());
    }

    public ApplicationProcessState getAppState() {
        return this.currentAppState;
    }

    @VisibleForTesting
    public WeakReference<o00Oo0.OooO0O0> getAppStateCallback() {
        return this.appStateCallback;
    }

    public void incrementTsnsCount(int i) {
        this.appStateMonitor.f42427OooOO0O.addAndGet(i);
    }

    @Override // o0O0o0oo.o00Oo0.OooO0O0
    public void onUpdateAppState(ApplicationProcessState applicationProcessState) {
        ApplicationProcessState applicationProcessState2 = this.currentAppState;
        ApplicationProcessState applicationProcessState3 = ApplicationProcessState.APPLICATION_PROCESS_STATE_UNKNOWN;
        if (applicationProcessState2 == applicationProcessState3) {
            this.currentAppState = applicationProcessState;
        } else {
            if (applicationProcessState2 == applicationProcessState || applicationProcessState == applicationProcessState3) {
                return;
            }
            this.currentAppState = ApplicationProcessState.FOREGROUND_BACKGROUND;
        }
    }

    public void registerForAppState() {
        if (this.isRegisteredForAppState) {
            return;
        }
        o00Oo0 o00oo1 = this.appStateMonitor;
        this.currentAppState = o00oo1.f42433OooOOo;
        o00oo1.OooO0Oo(this.appStateCallback);
        this.isRegisteredForAppState = true;
    }

    public void unregisterForAppState() {
        if (this.isRegisteredForAppState) {
            o00Oo0 o00oo1 = this.appStateMonitor;
            WeakReference<o00Oo0.OooO0O0> weakReference = this.appStateCallback;
            synchronized (o00oo1.f42420OooO) {
                o00oo1.f42420OooO.remove(weakReference);
            }
            this.isRegisteredForAppState = false;
        }
    }

    public o00Ooo(@NonNull o00Oo0 o00oo1) {
        this.isRegisteredForAppState = false;
        this.currentAppState = ApplicationProcessState.APPLICATION_PROCESS_STATE_UNKNOWN;
        this.appStateMonitor = o00oo1;
        this.appStateCallback = new WeakReference<>(this);
    }
}
