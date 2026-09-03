package o0O0000O;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0o<T> implements OnSuccessListener, OnFailureListener, OnCanceledListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final CountDownLatch f41601OooO0Oo = new CountDownLatch(1);

    @Override // com.google.android.gms.tasks.OnCanceledListener
    public final void onCanceled() {
        this.f41601OooO0Oo.countDown();
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(@NonNull Exception exc) {
        this.f41601OooO0Oo.countDown();
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(T t) {
        this.f41601OooO0Oo.countDown();
    }
}
