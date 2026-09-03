package o0O0000O;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class oo000o<TResult, TContinuationResult> implements OnSuccessListener<TContinuationResult>, OnFailureListener, OnCanceledListener, o00oO0o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Executor f41647OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o0O0O00 f41648OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final SuccessContinuation f41649OooO0o0;

    public oo000o(@NonNull Executor executor, @NonNull SuccessContinuation successContinuation, @NonNull o0O0O00 o0o0o00) {
        this.f41647OooO0Oo = executor;
        this.f41649OooO0o0 = successContinuation;
        this.f41648OooO0o = o0o0o00;
    }

    @Override // o0O0000O.o00oO0o
    public final void OooO00o(@NonNull Task task) {
        this.f41647OooO0Oo.execute(new o00Ooo(this, task));
    }

    @Override // com.google.android.gms.tasks.OnCanceledListener
    public final void onCanceled() {
        this.f41648OooO0o.OooO0OO();
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(@NonNull Exception exc) {
        this.f41648OooO0o.OooO00o(exc);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(TContinuationResult tcontinuationresult) {
        this.f41648OooO0o.OooO0O0(tcontinuationresult);
    }

    @Override // o0O0000O.o00oO0o
    public final void zzc() {
        throw new UnsupportedOperationException();
    }
}
