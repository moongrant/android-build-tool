package p302o0O0o0OO;

import androidx.camera.core.impl.OooOOOO;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.installations.local.OooO00o;
import com.google.firebase.installations.local.PersistedInstallation;

/* JADX INFO: loaded from: classes3.dex */
public final class o0000O implements o000O0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o000Oo0 f41742OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final TaskCompletionSource<o000> f41743OooO0O0;

    public o0000O(o000Oo0 o000oo1, TaskCompletionSource<o000> taskCompletionSource) {
        this.f41742OooO00o = o000oo1;
        this.f41743OooO0O0 = taskCompletionSource;
    }

    @Override // p302o0O0o0OO.o000O0o
    public final boolean OooO00o(OooO00o oooO00o) {
        if (!(oooO00o.OooO0o() == PersistedInstallation.RegistrationStatus.REGISTERED) || this.f41742OooO00o.OooO00o(oooO00o)) {
            return false;
        }
        String str = oooO00o.f19723OooO0Oo;
        if (str == null) {
            throw new NullPointerException("Null token");
        }
        Long lValueOf = Long.valueOf(oooO00o.f19724OooO0o);
        Long lValueOf2 = Long.valueOf(oooO00o.f19726OooO0oO);
        String strConcat = lValueOf == null ? "".concat(" tokenExpirationTimestamp") : "";
        if (lValueOf2 == null) {
            strConcat = OooOOOO.OooO00o(strConcat, " tokenCreationTimestamp");
        }
        if (!strConcat.isEmpty()) {
            throw new IllegalStateException("Missing required properties:".concat(strConcat));
        }
        this.f41743OooO0O0.setResult(new o0000Ooo(str, lValueOf.longValue(), lValueOf2.longValue()));
        return true;
    }

    @Override // p302o0O0o0OO.o000O0o
    public final boolean OooO0O0(Exception exc) {
        this.f41743OooO0O0.trySetException(exc);
        return true;
    }
}
