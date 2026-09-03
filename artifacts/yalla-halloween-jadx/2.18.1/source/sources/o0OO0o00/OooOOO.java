package o0OO0o00;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO<TResult, TContinuationResult> implements o00Ooo<TResult> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Executor f37930OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o0OO00O<TContinuationResult> f37931OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Continuation<TResult, TContinuationResult> f37932OooO0o0;

    public OooOOO(@NonNull Executor executor, @NonNull Continuation<TResult, TContinuationResult> continuation, @NonNull o0OO00O<TContinuationResult> o0oo00o2) {
        this.f37930OooO0Oo = executor;
        this.f37932OooO0o0 = continuation;
        this.f37931OooO0o = o0oo00o2;
    }

    @Override // o0OO0o00.o00Ooo
    public final void OooO00o(@NonNull Task<TResult> task) {
        this.f37930OooO0Oo.execute(new OooOOO0(this, task));
    }

    @Override // o0OO0o00.o00Ooo
    public final void zzc() {
        throw new UnsupportedOperationException();
    }
}
