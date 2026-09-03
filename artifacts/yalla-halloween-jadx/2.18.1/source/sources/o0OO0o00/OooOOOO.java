package o0OO0o00;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;
import o0OO0OoO.o00O00o0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOOO<TResult, TContinuationResult> implements OnSuccessListener<TContinuationResult>, OnFailureListener, OnCanceledListener, o00Ooo {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Executor f37935OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o0OO00O<TContinuationResult> f37936OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Continuation<TResult, Task<TContinuationResult>> f37937OooO0o0;

    public OooOOOO(@NonNull Executor executor, @NonNull Continuation<TResult, Task<TContinuationResult>> continuation, @NonNull o0OO00O<TContinuationResult> o0oo00o2) {
        this.f37935OooO0Oo = executor;
        this.f37937OooO0o0 = continuation;
        this.f37936OooO0o = o0oo00o2;
    }

    @Override // o0OO0o00.o00Ooo
    public final void OooO00o(@NonNull Task<TResult> task) {
        this.f37935OooO0Oo.execute(new o00O00o0(this, task, 1));
    }

    @Override // com.google.android.gms.tasks.OnCanceledListener
    public final void onCanceled() {
        this.f37936OooO0o.OooO0OO();
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(@NonNull Exception exc) {
        this.f37936OooO0o.OooO00o(exc);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(TContinuationResult tcontinuationresult) {
        this.f37936OooO0o.OooO0O0(tcontinuationresult);
    }

    @Override // o0OO0o00.o00Ooo
    public final void zzc() {
        throw new UnsupportedOperationException();
    }
}
