package o0OO0o00;

import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.tasks.zza;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OOO0o implements Executor {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final zza f37962Oooo0o = new zza(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(@NonNull Runnable runnable) {
        this.f37962Oooo0o.post(runnable);
    }
}
