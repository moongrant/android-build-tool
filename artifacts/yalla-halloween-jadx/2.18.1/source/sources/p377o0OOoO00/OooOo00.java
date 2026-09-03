package p377o0OOoO00;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.installations.local.OooO0O0;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOo00 implements o000oOoO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0OoOo0 f38698OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final TaskCompletionSource<Oooo000> f38699OooO0O0;

    public OooOo00(o0OoOo0 o0oooo1, TaskCompletionSource<Oooo000> taskCompletionSource) {
        this.f38698OooO00o = o0oooo1;
        this.f38699OooO0O0 = taskCompletionSource;
    }

    @Override // p377o0OOoO00.o000oOoO
    public final boolean OooO00o(Exception exc) {
        this.f38699OooO0O0.trySetException(exc);
        return true;
    }

    @Override // p377o0OOoO00.o000oOoO
    public final boolean OooO0O0(OooO0O0 oooO0O0) {
        if (!oooO0O0.OooOO0() || this.f38698OooO00o.OooO0Oo(oooO0O0)) {
            return false;
        }
        TaskCompletionSource<Oooo000> taskCompletionSource = this.f38699OooO0O0;
        String strOooO00o = oooO0O0.OooO00o();
        Objects.requireNonNull(strOooO00o, "Null token");
        Long lValueOf = Long.valueOf(oooO0O0.OooO0O0());
        Long lValueOf2 = Long.valueOf(oooO0O0.OooO0oO());
        String strOooO0Oo = lValueOf == null ? " tokenExpirationTimestamp" : "";
        if (lValueOf2 == null) {
            strOooO0Oo = p016OooOoO0.OooOo00.OooO0Oo(strOooO0Oo, " tokenCreationTimestamp");
        }
        if (!strOooO0Oo.isEmpty()) {
            throw new IllegalStateException(p016OooOoO0.OooOo00.OooO0Oo("Missing required properties:", strOooO0Oo));
        }
        taskCompletionSource.setResult(new OooOO0(strOooO00o, lValueOf.longValue(), lValueOf2.longValue()));
        return true;
    }
}
