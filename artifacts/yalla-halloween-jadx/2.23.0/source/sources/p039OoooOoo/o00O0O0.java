package p039OoooOoo;

import androidx.camera.core.SurfaceRequest;
import androidx.camera.video.OooOO0O;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.yalla.yalla.ui.fragment.CoinDetailFragment;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import p285o0O0OOoo.o00O00;
import p562o0oOo0O.o000oOoO;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o00O0O0 implements SurfaceRequest.OooO0o, Continuation, o000oOoO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f1686OooO0Oo;

    public /* synthetic */ o00O0O0(Object obj) {
        this.f1686OooO0Oo = obj;
    }

    @Override // androidx.camera.core.SurfaceRequest.OooO0o
    public final void OooO00o(SurfaceRequest.OooO0OO oooO0OO) {
        ((OooOO0O) this.f1686OooO0Oo).f3935OooOOo0 = oooO0OO;
    }

    @Override // p562o0oOo0O.o000oOoO
    public final void OooO0O0() {
        ((CoinDetailFragment) this.f1686OooO0Oo).lambda$initView$0();
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        CountDownLatch countDownLatch = (CountDownLatch) this.f1686OooO0Oo;
        ExecutorService executorService = o00O00.f42181OooO00o;
        countDownLatch.countDown();
        return null;
    }
}
