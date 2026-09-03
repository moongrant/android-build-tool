package p289o0O0Oo0;

import android.view.View;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CountDownLatch;
import o0oo0000.OooO00o;
import p525o0o0OO0.o0o0Oo;
import p545o0oO0O00.OooOo00;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o000O0 implements Continuation, BaseQuickAdapter.OooO0o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f41517OooO0Oo;

    public /* synthetic */ o000O0(Object obj) {
        this.f41517OooO0Oo = obj;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        o0o0Oo o0o0oo = (o0o0Oo) this.f41517OooO0Oo;
        if (i < o0o0oo.f53252OooOOOO.f13189OooOOoo.size()) {
            OooO00o.OooO0O0("102284");
            OooOo00.OooO0O0(174, o0o0oo.f53252OooOOOO.OooOOO(i));
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        ((CountDownLatch) this.f41517OooO0Oo).countDown();
        return null;
    }
}
