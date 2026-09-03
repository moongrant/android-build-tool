package p289o0O0Oo0;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Callable;
import p292o0O0OoO.o00Ooo;
import p292o0O0OoO.o0ooOOo;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OO00O implements Callable<Task<Void>> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o0ooOOo f41580OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ o0O0O00 f41581OooO0O0;

    public o0OO00O(o0O0O00 o0o0o00, o00Ooo o00ooo2) {
        this.f41581OooO0O0 = o0o0o00;
        this.f41580OooO00o = o00ooo2;
    }

    @Override // java.util.concurrent.Callable
    public final Task<Void> call() throws Exception {
        return o0O0O00.OooO00o(this.f41581OooO0O0, this.f41580OooO00o);
    }
}
