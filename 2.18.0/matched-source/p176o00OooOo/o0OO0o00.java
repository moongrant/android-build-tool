package p176o00OooOo;

import android.view.View;
import com.app.base.view.MomentFollowHeadView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.yalla.yalla.ui.activity.store.ArrearsDetailActivity;
import com.yalla.yalla.ui.fragment.PacketHistoryListFragment;
import kotlin.jvm.internal.Intrinsics;
import p187o00o00Oo.o0ooOOo;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0OO0o00 implements BaseQuickAdapter.OooOOOO, o0ooOOo {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f32762Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f32763OoooO00;

    public /* synthetic */ o0OO0o00(Object obj, int i) {
        this.f32762Oooo = i;
        this.f32763OoooO00 = obj;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOOOO
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        MomentFollowHeadView.OooO0O0((MomentFollowHeadView) this.f32763OoooO00, i);
    }

    @Override // p187o00o00Oo.o0ooOOo
    public final void OooO0oO() {
        switch (this.f32762Oooo) {
            case 2:
                ArrearsDetailActivity this$0 = (ArrearsDetailActivity) this.f32763OoooO00;
                ArrearsDetailActivity.OooO00o oooO00o = ArrearsDetailActivity.f23213Oooooo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooOooo(true);
                break;
            default:
                PacketHistoryListFragment.m386initView$lambda1((PacketHistoryListFragment) this.f32763OoooO00);
                break;
        }
    }
}
