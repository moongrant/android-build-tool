package p289o0O0Oo0;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOOOO implements Continuation<Void, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Callable f41476OooO0Oo;

    public OooOOOO(Callable callable) {
        this.f41476OooO0Oo = callable;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(@NonNull Task<Void> task) throws Exception {
        return this.f41476OooO0Oo.call();
    }
}
