package p302o0O0o0OO;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.installations.local.OooO00o;
import com.google.firebase.installations.local.PersistedInstallation;

/* JADX INFO: loaded from: classes3.dex */
public final class o0000OO0 implements o000O0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final TaskCompletionSource<String> f41747OooO00o;

    public o0000OO0(TaskCompletionSource<String> taskCompletionSource) {
        this.f41747OooO00o = taskCompletionSource;
    }

    @Override // p302o0O0o0OO.o000O0o
    public final boolean OooO00o(OooO00o oooO00o) {
        if (!(oooO00o.OooO0o() == PersistedInstallation.RegistrationStatus.UNREGISTERED)) {
            if (!(oooO00o.OooO0o() == PersistedInstallation.RegistrationStatus.REGISTERED)) {
                if (!(oooO00o.OooO0o() == PersistedInstallation.RegistrationStatus.REGISTER_ERROR)) {
                    return false;
                }
            }
        }
        this.f41747OooO00o.trySetResult(oooO00o.f19721OooO0O0);
        return true;
    }

    @Override // p302o0O0o0OO.o000O0o
    public final boolean OooO0O0(Exception exc) {
        return false;
    }
}
