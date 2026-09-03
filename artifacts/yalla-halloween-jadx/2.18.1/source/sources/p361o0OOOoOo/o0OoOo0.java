package p361o0OOOoOo;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OoOo0 implements Continuation<Void, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Callable f38515OooO0Oo;

    public o0OoOo0(Callable callable) {
        this.f38515OooO0Oo = callable;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(@NonNull Task<Void> task) throws Exception {
        return this.f38515OooO0Oo.call();
    }
}
