package p285o0O0OOo;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import p289o0O0Oo0.o000OO00;
import p289o0O0Oo0.o000OO0O;
import p289o0O0Oo0.o0O0O00;
import p289o0O0Oo0.o0OO00O;
import p292o0O0OoO.o00Ooo;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOo00 implements Callable<Void> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ boolean f41430OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ o0O0O00 f41431OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ o00Ooo f41432OooO0OO;

    public OooOo00(boolean z, o0O0O00 o0o0o00, o00Ooo o00ooo2) {
        this.f41430OooO00o = z;
        this.f41431OooO0O0 = o0o0o00;
        this.f41432OooO0OO = o00ooo2;
    }

    @Override // java.util.concurrent.Callable
    public final Void call() throws Exception {
        if (!this.f41430OooO00o) {
            return null;
        }
        o0O0O00 o0o0o00 = this.f41431OooO0O0;
        o0o0o00.getClass();
        o0OO00O o0oo00o2 = new o0OO00O(o0o0o00, this.f41432OooO0OO);
        ExecutorService executorService = o000OO00.f41525OooO00o;
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        ExecutorService executorService2 = o0o0o00.f41576OooOO0o;
        executorService2.execute(new o000OO0O(0, o0oo00o2, executorService2, taskCompletionSource));
        taskCompletionSource.getTask();
        return null;
    }
}
