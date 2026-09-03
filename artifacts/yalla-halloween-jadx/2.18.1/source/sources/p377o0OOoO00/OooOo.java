package p377o0OOoO00;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.installations.local.OooO0O0;
import com.google.firebase.installations.local.PersistedInstallation;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOo implements o000oOoO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final TaskCompletionSource<String> f38697OooO00o;

    public OooOo(TaskCompletionSource<String> taskCompletionSource) {
        this.f38697OooO00o = taskCompletionSource;
    }

    @Override // p377o0OOoO00.o000oOoO
    public final boolean OooO00o(Exception exc) {
        return false;
    }

    @Override // p377o0OOoO00.o000oOoO
    public final boolean OooO0O0(OooO0O0 oooO0O0) {
        if (!(oooO0O0.OooO0o() == PersistedInstallation.RegistrationStatus.UNREGISTERED) && !oooO0O0.OooOO0() && !oooO0O0.OooO0oo()) {
            return false;
        }
        this.f38697OooO00o.trySetResult(oooO0O0.OooO0OO());
        return true;
    }
}
