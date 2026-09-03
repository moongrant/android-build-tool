package o0O0OOO;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p285o0O0OOoo.o00000O;
import p285o0O0OOoo.o0000Ooo;
import p285o0O0OOoo.o00O00;
import p291o0O0OoO0.o00000O0;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO implements Callable<Void> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ boolean f42008OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ o0000Ooo f42009OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ o00000O0 f42010OooO0OO;

    public OooO(boolean z, o0000Ooo o0000ooo, o00000O0 o00000o1) {
        this.f42008OooO00o = z;
        this.f42009OooO0O0 = o0000ooo;
        this.f42010OooO0OO = o00000o1;
    }

    @Override // java.util.concurrent.Callable
    public final Void call() throws Exception {
        if (!this.f42008OooO00o) {
            return null;
        }
        o0000Ooo o0000ooo = this.f42009OooO0O0;
        o0000ooo.getClass();
        final o00000O o00000o = new o00000O(o0000ooo, this.f42010OooO0OO);
        ExecutorService executorService = o00O00.f42181OooO00o;
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        final ExecutorService executorService2 = o0000ooo.f42148OooOO0o;
        executorService2.execute(new Runnable() { // from class: o0O0OOoo.o00O000
            @Override // java.lang.Runnable
            public final void run() {
                Callable callable = o00000o;
                Executor executor = executorService2;
                TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                try {
                    ((Task) callable.call()).continueWith(executor, new o00O000o(taskCompletionSource2));
                } catch (Exception e) {
                    taskCompletionSource2.setException(e);
                }
            }
        });
        taskCompletionSource.getTask();
        return null;
    }
}
