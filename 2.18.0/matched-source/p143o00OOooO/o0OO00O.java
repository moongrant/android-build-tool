package p143o00OOooO;

import android.view.View;
import com.app.base.fragment.MainMomentFollowingFragment;
import com.app.base.view.pullrefresh.XRefreshLayout;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.yalla.yalla.ui.activity.room.MemberListConveneActivity;
import com.yalla.yalla.ui.fragment.MainSearchUserFragment;
import com.yalla.yalla.ui.fragment.UserInfoLeftFragment;
import kotlin.jvm.internal.Intrinsics;
import p187o00o00Oo.o0ooOOo;
import p518o0o0O000.o00000O;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0OO00O implements o0ooOOo, XRefreshLayout.OooO0OO, BaseQuickAdapter.OooOOOO {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f31993Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f31994OoooO00;

    public /* synthetic */ o0OO00O(Object obj, int i) {
        this.f31993Oooo = i;
        this.f31994OoooO00 = obj;
    }

    @Override // com.app.base.view.pullrefresh.XRefreshLayout.OooO0OO
    public final void OooO0OO() {
        MemberListConveneActivity this$0 = (MemberListConveneActivity) this.f31994OoooO00;
        int i = MemberListConveneActivity.f22879o00Oo0;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        o00000O.OooO00o(this$0.OooOooo().f50247OooO0o0.getEditSearch(), this$0);
        this$0.OooOooo().f50247OooO0o0.getEditSearch().clearFocus();
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOOOO
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        switch (this.f31993Oooo) {
            case 2:
                MainSearchUserFragment.m374initView$lambda11((MainSearchUserFragment) this.f31994OoooO00, baseQuickAdapter, view, i);
                break;
            default:
                ((UserInfoLeftFragment) this.f31994OoooO00).lambda$initView$5(baseQuickAdapter, view, i);
                break;
        }
    }

    @Override // p187o00o00Oo.o0ooOOo
    public final void OooO0oO() {
        MainMomentFollowingFragment.m24initView$lambda22((MainMomentFollowingFragment) this.f31994OoooO00);
    }
}
