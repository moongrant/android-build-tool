package o0OO0o00;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.OnTokenCanceledListener;
import com.google.android.gms.tasks.TaskExecutors;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOO0O extends CancellationToken {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0OO00O<Void> f37929OooO00o = new o0OO00O<>();

    @Override // com.google.android.gms.tasks.CancellationToken
    public final boolean isCancellationRequested() {
        return this.f37929OooO00o.isComplete();
    }

    @Override // com.google.android.gms.tasks.CancellationToken
    public final CancellationToken onCanceledRequested(@NonNull OnTokenCanceledListener onTokenCanceledListener) {
        this.f37929OooO00o.addOnSuccessListener(TaskExecutors.MAIN_THREAD, new OooO00o(onTokenCanceledListener));
        return this;
    }
}
