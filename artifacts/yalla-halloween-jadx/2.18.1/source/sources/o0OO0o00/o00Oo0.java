package o0OO0o00;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class o00Oo0<TResult, TContinuationResult> implements OnSuccessListener<TContinuationResult>, OnFailureListener, OnCanceledListener, o00Ooo {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Executor f37952OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o0OO00O<TContinuationResult> f37953OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final SuccessContinuation<TResult, TContinuationResult> f37954OooO0o0;

    public o00Oo0(@NonNull Executor executor, @NonNull SuccessContinuation<TResult, TContinuationResult> successContinuation, @NonNull o0OO00O<TContinuationResult> o0oo00o2) {
        this.f37952OooO0Oo = executor;
        this.f37954OooO0o0 = successContinuation;
        this.f37953OooO0o = o0oo00o2;
    }

    @Override // o0OO0o00.o00Ooo
    public final void OooO00o(@NonNull Task<TResult> task) {
        this.f37952OooO0Oo.execute(new o00O0O(this, task));
    }

    @Override // com.google.android.gms.tasks.OnCanceledListener
    public final void onCanceled() {
        this.f37953OooO0o.OooO0OO();
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(@NonNull Exception exc) {
        this.f37953OooO0o.OooO00o(exc);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(TContinuationResult tcontinuationresult) {
        this.f37953OooO0o.OooO0O0(tcontinuationresult);
    }

    @Override // o0OO0o00.o00Ooo
    public final void zzc() {
        throw new UnsupportedOperationException();
    }
}
