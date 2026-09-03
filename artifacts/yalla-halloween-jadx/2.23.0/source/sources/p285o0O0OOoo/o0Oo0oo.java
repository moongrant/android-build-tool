package p285o0O0OOoo;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* JADX INFO: loaded from: classes3.dex */
public final class o0Oo0oo implements SuccessContinuation<Void, Boolean> {
    @Override // com.google.android.gms.tasks.SuccessContinuation
    @NonNull
    public final Task<Boolean> then(@Nullable Void r1) throws Exception {
        return Tasks.forResult(Boolean.TRUE);
    }
}
