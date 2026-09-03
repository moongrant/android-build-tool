package p142o00OOooO;

import com.app.base.fragment.MainMomentFollowingFragment;
import com.app.base.view.ViewPagerFixed;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.yalla.yalla.ui.activity.moment.PostDetailActivity;
import kotlin.jvm.internal.Intrinsics;
import o00Oo00.OooO0OO;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0Oo0oo implements BaseQuickAdapter.OooOo, OooO0OO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f31976OooO0Oo;

    public /* synthetic */ o0Oo0oo(Object obj) {
        this.f31976OooO0Oo = obj;
    }

    @Override // o00Oo00.OooO0OO
    public final void OooO00o(Object obj) {
        PostDetailActivity this$0 = (PostDetailActivity) this.f31976OooO0Oo;
        Integer position = (Integer) obj;
        PostDetailActivity.OooO00o oooO00o = PostDetailActivity.f22417o0O0O00;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int i = this$0.f22436o0OOO0o;
        if (position == null || i != position.intValue()) {
            ViewPagerFixed viewPagerFixed = this$0.OooOooO().f50594OooOo00;
            Intrinsics.checkNotNullExpressionValue(position, "position");
            viewPagerFixed.setCurrentItem(position.intValue());
            this$0.f22436o0OOO0o = position.intValue();
            return;
        }
        int iIntValue = position.intValue();
        if (iIntValue == 0) {
            this$0.Oooo000().tabRefreshData(true);
        } else if (iIntValue == 1) {
            this$0.Oooo00o().tabRefreshData(true);
        } else if (iIntValue == 2) {
            this$0.Oooo00O().tabRefreshData(true);
        }
        this$0.OooOoo(false);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOo
    public final void OooO0Oo() {
        MainMomentFollowingFragment.m25initView$lambda23((MainMomentFollowingFragment) this.f31976OooO0Oo);
    }
}
