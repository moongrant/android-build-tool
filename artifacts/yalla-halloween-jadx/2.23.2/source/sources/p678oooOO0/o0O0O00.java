package p678oooOO0;

import androidx.annotation.NonNull;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.perf.v1.ApplicationProcessState;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o0O0O00 implements oo0o0Oo.OooO0O0 {
    private final WeakReference<oo0o0Oo.OooO0O0> appStateCallback;
    private final oo0o0Oo appStateMonitor;
    private ApplicationProcessState currentAppState;
    private boolean isRegisteredForAppState;

    public o0O0O00() {
        this(oo0o0Oo.OooO00o());
    }

    public ApplicationProcessState getAppState() {
        return this.currentAppState;
    }

    @VisibleForTesting
    public WeakReference<oo0o0Oo.OooO0O0> getAppStateCallback() {
        return this.appStateCallback;
    }

    public void incrementTsnsCount(int i) {
        this.appStateMonitor.f60384OooOO0O.addAndGet(i);
    }

    @Override // oooOO0.oo0o0Oo.OooO0O0
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
        oo0o0Oo oo0o0oo = this.appStateMonitor;
        this.currentAppState = oo0o0oo.f60390OooOOo;
        oo0o0oo.OooO0Oo(this.appStateCallback);
        this.isRegisteredForAppState = true;
    }

    public void unregisterForAppState() {
        if (this.isRegisteredForAppState) {
            oo0o0Oo oo0o0oo = this.appStateMonitor;
            WeakReference<oo0o0Oo.OooO0O0> weakReference = this.appStateCallback;
            synchronized (oo0o0oo.f60377OooO) {
                oo0o0oo.f60377OooO.remove(weakReference);
            }
            this.isRegisteredForAppState = false;
        }
    }

    public o0O0O00(@NonNull oo0o0Oo oo0o0oo) {
        this.isRegisteredForAppState = false;
        this.currentAppState = ApplicationProcessState.APPLICATION_PROCESS_STATE_UNKNOWN;
        this.appStateMonitor = oo0o0oo;
        this.appStateCallback = new WeakReference<>(this);
    }
}
