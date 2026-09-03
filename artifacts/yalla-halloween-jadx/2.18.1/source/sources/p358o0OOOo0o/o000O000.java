package p358o0OOOo0o;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import p361o0OOOoOo.o00000;
import p361o0OOOoOo.o000000O;
import p361o0OOOoOo.o000O0o;
import p361o0OOOoOo.o000Oo0;
import p366o0OOo00O.OooOO0O;

/* JADX INFO: loaded from: classes2.dex */
public final class o000O000 implements Callable<Void> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ boolean f38385OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ o00000 f38386OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ OooOO0O f38387OooO0OO;

    public o000O000(boolean z, o00000 o00000Var, OooOO0O oooOO0O) {
        this.f38385OooO00o = z;
        this.f38386OooO0O0 = o00000Var;
        this.f38387OooO0OO = oooOO0O;
    }

    @Override // java.util.concurrent.Callable
    public final Void call() throws Exception {
        if (!this.f38385OooO00o) {
            return null;
        }
        o00000 o00000Var = this.f38386OooO0O0;
        OooOO0O oooOO0O = this.f38387OooO0OO;
        ExecutorService executorService = o00000Var.f38427OooOO0o;
        o000000O o000000o2 = new o000000O(o00000Var, oooOO0O);
        ExecutorService executorService2 = o000Oo0.f38478OooO00o;
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        executorService.execute(new o000O0o(o000000o2, taskCompletionSource));
        taskCompletionSource.getTask();
        return null;
    }
}
