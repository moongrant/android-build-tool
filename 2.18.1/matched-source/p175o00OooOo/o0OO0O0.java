package p175o00OooOo;

import android.view.View;
import com.app.base.view.MomentFollowHeadView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.yalla.yalla.ui.activity.store.ArrearsDetailActivity;
import com.yalla.yalla.ui.fragment.PacketHistoryListFragment;
import kotlin.jvm.internal.Intrinsics;
import p186o00o00Oo.o0ooOOo;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0OO0O0 implements BaseQuickAdapter.OooOOOO, o0ooOOo {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f32742OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f32743OooO0o0;

    public /* synthetic */ o0OO0O0(Object obj, int i) {
        this.f32742OooO0Oo = i;
        this.f32743OooO0o0 = obj;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOOOO
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        MomentFollowHeadView.OooO0O0((MomentFollowHeadView) this.f32743OooO0o0, i);
    }

    @Override // p186o00o00Oo.o0ooOOo
    public final void OooO0oO() {
        switch (this.f32742OooO0Oo) {
            case 2:
                ArrearsDetailActivity this$0 = (ArrearsDetailActivity) this.f32743OooO0o0;
                ArrearsDetailActivity.OooO00o oooO00o = ArrearsDetailActivity.f23194OooooOO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooOooo(true);
                break;
            default:
                PacketHistoryListFragment.m386initView$lambda1((PacketHistoryListFragment) this.f32743OooO0o0);
                break;
        }
    }
}
