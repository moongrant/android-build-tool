package p142o00OOooO;

import android.view.View;
import com.app.base.fragment.MainMomentFollowingFragment;
import com.app.base.view.pullrefresh.XRefreshLayout;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.yalla.yalla.ui.activity.room.MemberListConveneActivity;
import com.yalla.yalla.ui.fragment.MainSearchUserFragment;
import com.yalla.yalla.ui.fragment.UserInfoLeftFragment;
import kotlin.jvm.internal.Intrinsics;
import p186o00o00Oo.o0ooOOo;
import p516o0o0O000.o00000O;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0OO00O implements o0ooOOo, XRefreshLayout.OooO0OO, BaseQuickAdapter.OooOOOO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f31972OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f31973OooO0o0;

    public /* synthetic */ o0OO00O(Object obj, int i) {
        this.f31972OooO0Oo = i;
        this.f31973OooO0o0 = obj;
    }

    @Override // com.app.base.view.pullrefresh.XRefreshLayout.OooO0OO
    public final void OooO0OO() {
        MemberListConveneActivity this$0 = (MemberListConveneActivity) this.f31973OooO0o0;
        int i = MemberListConveneActivity.f22860o0OoOo0;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        o00000O.OooO00o(this$0.OooOooo().f50310OooO0o0.getEditSearch(), this$0);
        this$0.OooOooo().f50310OooO0o0.getEditSearch().clearFocus();
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOOOO
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        switch (this.f31972OooO0Oo) {
            case 2:
                MainSearchUserFragment.m374initView$lambda11((MainSearchUserFragment) this.f31973OooO0o0, baseQuickAdapter, view, i);
                break;
            default:
                ((UserInfoLeftFragment) this.f31973OooO0o0).lambda$initView$5(baseQuickAdapter, view, i);
                break;
        }
    }

    @Override // p186o00o00Oo.o0ooOOo
    public final void OooO0oO() {
        MainMomentFollowingFragment.m24initView$lambda22((MainMomentFollowingFragment) this.f31973OooO0o0);
    }
}
