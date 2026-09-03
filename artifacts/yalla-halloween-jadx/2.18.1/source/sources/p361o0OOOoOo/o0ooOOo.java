package p361o0OOOoOo;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* JADX INFO: loaded from: classes2.dex */
public final class o0ooOOo implements SuccessContinuation<Void, Boolean> {
    @Override // com.google.android.gms.tasks.SuccessContinuation
    @NonNull
    public final Task<Boolean> then(@Nullable Void r1) throws Exception {
        return Tasks.forResult(Boolean.TRUE);
    }
}
