package p361o0OOOoOo;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Callable;
import p366o0OOo00O.OooOOOO;

/* JADX INFO: loaded from: classes2.dex */
public final class o000000O implements Callable<Task<Void>> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ OooOOOO f38434OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ o00000 f38435OooO0O0;

    public o000000O(o00000 o00000Var, OooOOOO oooOOOO) {
        this.f38435OooO0O0 = o00000Var;
        this.f38434OooO00o = oooOOOO;
    }

    @Override // java.util.concurrent.Callable
    public final Task<Void> call() throws Exception {
        return o00000.OooO00o(this.f38435OooO0O0, this.f38434OooO00o);
    }
}
