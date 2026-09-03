package o0O0o0;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.installations.local.PersistedInstallation;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOOO0 implements OooOo00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final TaskCompletionSource<String> f42383OooO00o;

    public OooOOO0(TaskCompletionSource<String> taskCompletionSource) {
        this.f42383OooO00o = taskCompletionSource;
    }

    @Override // o0O0o0.OooOo00
    public final boolean OooO00o(com.google.firebase.installations.local.OooO00o oooO00o) {
        if (!(oooO00o.OooO0o() == PersistedInstallation.RegistrationStatus.UNREGISTERED)) {
            if (!(oooO00o.OooO0o() == PersistedInstallation.RegistrationStatus.REGISTERED)) {
                if (!(oooO00o.OooO0o() == PersistedInstallation.RegistrationStatus.REGISTER_ERROR)) {
                    return false;
                }
            }
        }
        this.f42383OooO00o.trySetResult(oooO00o.f20193OooO0O0);
        return true;
    }

    @Override // o0O0o0.OooOo00
    public final boolean OooO0O0(Exception exc) {
        return false;
    }
}
