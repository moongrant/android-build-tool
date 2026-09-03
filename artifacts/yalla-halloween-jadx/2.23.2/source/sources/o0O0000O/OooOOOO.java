package o0O0000O;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOOOO<TResult, TContinuationResult> implements OnSuccessListener<TContinuationResult>, OnFailureListener, OnCanceledListener, o00oO0o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Executor f40919OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o0O0O00 f40920OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Continuation f40921OooO0o0;

    public OooOOOO(@NonNull Executor executor, @NonNull Continuation continuation, @NonNull o0O0O00 o0o0o00) {
        this.f40919OooO0Oo = executor;
        this.f40921OooO0o0 = continuation;
        this.f40920OooO0o = o0o0o00;
    }

    @Override // o0O0000O.o00oO0o
    public final void OooO00o(@NonNull Task task) {
        this.f40919OooO0Oo.execute(new OooOOO(this, task));
    }

    @Override // com.google.android.gms.tasks.OnCanceledListener
    public final void onCanceled() {
        this.f40920OooO0o.OooO0OO();
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(@NonNull Exception exc) {
        this.f40920OooO0o.OooO00o(exc);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(TContinuationResult tcontinuationresult) {
        this.f40920OooO0o.OooO0O0(tcontinuationresult);
    }

    @Override // o0O0000O.o00oO0o
    public final void zzc() {
        throw new UnsupportedOperationException();
    }
}
