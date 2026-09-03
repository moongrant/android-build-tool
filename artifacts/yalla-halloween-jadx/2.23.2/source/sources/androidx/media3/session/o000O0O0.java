package androidx.media3.session;

import android.os.Looper;
import androidx.recyclerview.widget.GridLayoutManager;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.yalla.yalla.ui.fragment.moment.MainMomentsTopicNewFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o000O0O0 implements o000OOo0.OooO00o, BaseQuickAdapter.OooOO0O, p559o0oOo.o00O0O {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f9309OooO0Oo;

    public /* synthetic */ o000O0O0(Object obj) {
        this.f9309OooO0Oo = obj;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOO0O
    public final int OooO00o(GridLayoutManager gridLayoutManager, int i) {
        com.yalla.yalla.ui.adapter.oOO00O this_apply = (com.yalla.yalla.ui.adapter.oOO00O) this.f9309OooO0Oo;
        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
        return ((com.yalla.yalla.ui.adapter.o00O00OO) this_apply.f13189OooOOoo.get(i)).f27131OooO0Oo;
    }

    @Override // androidx.media3.session.o000OOo0.OooO00o
    public final void OooO0O0(o0000OO0 o0000oo1) {
        if (o0000oo1.OooO0o()) {
            o000oOoO o000ooooOooO0o0 = o0000oo1.OooO0o0();
            o000ooooOooO0o0.getClass();
            p080o000OoO.o00Oo0.OooO0Oo(Looper.myLooper() == o000ooooOooO0o0.OooOo0O());
            o0000oo1.OooO0o0();
            o000ooooOooO0o0.getClass();
            throw null;
        }
    }

    @Override // p559o0oOo.o00O0O
    public final void OooO0OO() {
        MainMomentsTopicNewFragment.initView$lambda$3((MainMomentsTopicNewFragment) this.f9309OooO0Oo);
    }
}
