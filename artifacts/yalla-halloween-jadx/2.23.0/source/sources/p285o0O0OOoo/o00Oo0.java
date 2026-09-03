package p285o0O0OOoo;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class o00Oo0 implements Continuation<Void, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Callable f42188OooO0Oo;

    public o00Oo0(Callable callable) {
        this.f42188OooO0Oo = callable;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(@NonNull Task<Void> task) throws Exception {
        return this.f42188OooO0Oo.call();
    }
}
