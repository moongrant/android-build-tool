package o0O0000O;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOOO0 implements o00oO0o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Executor f41607OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o0O0O00 f41608OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Continuation f41609OooO0o0;

    public OooOOO0(@NonNull Executor executor, @NonNull Continuation continuation, @NonNull o0O0O00 o0o0o00) {
        this.f41607OooO0Oo = executor;
        this.f41609OooO0o0 = continuation;
        this.f41608OooO0o = o0o0o00;
    }

    @Override // o0O0000O.o00oO0o
    public final void OooO00o(@NonNull Task task) {
        this.f41607OooO0Oo.execute(new OooOO0O(this, task));
    }

    @Override // o0O0000O.o00oO0o
    public final void zzc() {
        throw new UnsupportedOperationException();
    }
}
