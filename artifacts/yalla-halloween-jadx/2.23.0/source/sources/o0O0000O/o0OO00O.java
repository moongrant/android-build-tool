package o0O0000O;

import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.tasks.zza;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OO00O implements Executor {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final zza f41639OooO0Oo = new zza(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(@NonNull Runnable runnable) {
        this.f41639OooO0Oo.post(runnable);
    }
}
