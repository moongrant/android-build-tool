package o0OO0o00;

import androidx.annotation.NonNull;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0o implements OooO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final CountDownLatch f37920OooO0Oo = new CountDownLatch(1);

    @Override // com.google.android.gms.tasks.OnCanceledListener
    public final void onCanceled() {
        this.f37920OooO0Oo.countDown();
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(@NonNull Exception exc) {
        this.f37920OooO0Oo.countDown();
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        this.f37920OooO0Oo.countDown();
    }
}
