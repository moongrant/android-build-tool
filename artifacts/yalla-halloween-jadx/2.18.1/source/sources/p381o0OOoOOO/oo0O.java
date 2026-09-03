package p381o0OOoOOO;

import androidx.annotation.GuardedBy;
import com.google.android.gms.tasks.Task;
import java.util.Map;
import java.util.concurrent.Executor;
import p021OooOooo.Oooo0;

/* JADX INFO: loaded from: classes2.dex */
public final class oo0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Executor f38829OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @GuardedBy("this")
    public final Map<String, Task<String>> f38830OooO0O0 = new Oooo0();

    public oo0O(Executor executor) {
        this.f38829OooO00o = executor;
    }
}
