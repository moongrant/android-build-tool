package o0O0o0;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.installations.local.PersistedInstallation;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOO0O implements OooOo00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooOo f42381OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final TaskCompletionSource<OooOOO> f42382OooO0O0;

    public OooOO0O(OooOo oooOo, TaskCompletionSource<OooOOO> taskCompletionSource) {
        this.f42381OooO00o = oooOo;
        this.f42382OooO0O0 = taskCompletionSource;
    }

    @Override // o0O0o0.OooOo00
    public final boolean OooO00o(com.google.firebase.installations.local.OooO00o oooO00o) {
        if (!(oooO00o.OooO0o() == PersistedInstallation.RegistrationStatus.REGISTERED) || this.f42381OooO00o.OooO00o(oooO00o)) {
            return false;
        }
        String str = oooO00o.f20195OooO0Oo;
        if (str == null) {
            throw new NullPointerException("Null token");
        }
        Long lValueOf = Long.valueOf(oooO00o.f20196OooO0o);
        Long lValueOf2 = Long.valueOf(oooO00o.f20198OooO0oO);
        String strConcat = lValueOf == null ? "".concat(" tokenExpirationTimestamp") : "";
        if (lValueOf2 == null) {
            strConcat = androidx.camera.core.impl.OooOOOO.OooO00o(strConcat, " tokenCreationTimestamp");
        }
        if (!strConcat.isEmpty()) {
            throw new IllegalStateException("Missing required properties:".concat(strConcat));
        }
        this.f42382OooO0O0.setResult(new OooO00o(str, lValueOf.longValue(), lValueOf2.longValue()));
        return true;
    }

    @Override // o0O0o0.OooOo00
    public final boolean OooO0O0(Exception exc) {
        this.f42382OooO0O0.trySetException(exc);
        return true;
    }
}
