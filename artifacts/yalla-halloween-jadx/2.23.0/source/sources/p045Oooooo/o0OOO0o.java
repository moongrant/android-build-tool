package p045Oooooo;

import android.view.View;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.yalla.yalla.ui.fragment.message.MessageListFragment;
import java.util.concurrent.atomic.AtomicReference;
import p637o0ooOO0.o00O000;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0OOO0o implements o00O000.OooO0OO, BaseQuickAdapter.OooO0o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f1989OooO0Oo;

    public /* synthetic */ o0OOO0o(Object obj) {
        this.f1989OooO0Oo = obj;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        MessageListFragment.initView$lambda$1((MessageListFragment) this.f1989OooO0Oo, baseQuickAdapter, view, i);
    }

    @Override // o0ooOO0.o00O000.OooO0OO
    public final Object OooO0o0(o00O000.OooO00o oooO00o) {
        ((AtomicReference) this.f1989OooO0Oo).set(oooO00o);
        return "acquireInputBuffer";
    }
}
