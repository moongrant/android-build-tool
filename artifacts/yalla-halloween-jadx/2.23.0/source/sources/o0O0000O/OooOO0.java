package o0O0000O;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.OnTokenCanceledListener;
import com.google.android.gms.tasks.TaskExecutors;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOO0 extends CancellationToken {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0O0O00 f41602OooO00o = new o0O0O00();

    @Override // com.google.android.gms.tasks.CancellationToken
    public final boolean isCancellationRequested() {
        return this.f41602OooO00o.isComplete();
    }

    @Override // com.google.android.gms.tasks.CancellationToken
    public final CancellationToken onCanceledRequested(@NonNull OnTokenCanceledListener onTokenCanceledListener) {
        OooO00o oooO00o = new OooO00o(onTokenCanceledListener);
        this.f41602OooO00o.addOnSuccessListener(TaskExecutors.MAIN_THREAD, oooO00o);
        return this;
    }
}
