package p537o0o0OOoO;

import android.view.View;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.weieyu.yalla.R;
import com.yalla.yalla.model.TopicBlackUserModel;
import com.yalla.yalla.ui.activity.main.ChangeRegionActivity;
import com.yalla.yalla.ui.activity.moment.TopicBlackListActivity;
import com.yalla.yalla.ui.activity.user.UserRoomsActivity;
import com.yalla.yalla.ui.fragment.mainroom.MainRoomMineFollowingFragment;
import com.yalla.yalla.ui.view.MomentDetailText;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p175o00OooOO.o0O00OOO;
import p189o00o00o0.OooO0OO;
import p256o00ooO0o.oo0oOO0;
import p520o0o0O00o.o000;
import p540o0o0Oo0.o0O00O;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class oOo00ooO implements BaseQuickAdapter.OooOOOO, BaseQuickAdapter.OooOOO0, BaseQuickAdapter.OooOo, o0O00OOO.OooO00o {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f43742Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f43743OoooO00;

    public /* synthetic */ oOo00ooO(Object obj, int i) {
        this.f43742Oooo = i;
        this.f43743OoooO00 = obj;
    }

    @Override // o00OooOO.o0O00OOO.OooO00o
    public final void OooO00o() {
        MomentDetailText this$0 = (MomentDetailText) this.f43743OoooO00;
        int i = MomentDetailText.f24931OoooO;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Function0<Unit> function0 = this$0.f24933OoooO0;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOo
    public final void OooO0Oo() {
        UserRoomsActivity this$0 = (UserRoomsActivity) this.f43743OoooO00;
        UserRoomsActivity.OooO00o oooO00o = UserRoomsActivity.f23580Ooooooo;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.OooOooO(false);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOOOO
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        ChangeRegionActivity this$0 = (ChangeRegionActivity) this.f43743OoooO00;
        ChangeRegionActivity.OooO00o oooO00o = ChangeRegionActivity.f21951OoooooO;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        OooO0OO<ChangeRegionActivity.OooO0O0> oooO0OO = this$0.f21956OooooOo;
        if (oooO0OO == null) {
            Intrinsics.throwUninitializedPropertyAccessException("baseAdapter");
            oooO0OO = null;
        }
        ChangeRegionActivity.OooO0O0 oooO0O0 = oooO0OO.getData().get(i);
        Intrinsics.checkNotNull(oooO0O0);
        this$0.f21955OooooOO = oooO0O0.f21960OooO0O0;
        this$0.OooOoO();
        OooO0OO<ChangeRegionActivity.OooO0O0> oooO0OO2 = this$0.f21956OooooOo;
        if (oooO0OO2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("baseAdapter");
            oooO0OO2 = null;
        }
        oooO0OO2.notifyDataSetChanged();
        o000 o000Var = o000.f42192OooO00o;
        o000.f42193OooO0O0.postValue(null);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOOO0
    public final void OooO0oo(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        switch (this.f43742Oooo) {
            case 1:
                TopicBlackListActivity this$0 = (TopicBlackListActivity) this.f43743OoooO00;
                int i2 = TopicBlackListActivity.f22558OoooooO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (view.getId() == R.id.ivDelete) {
                    OooO0OO<TopicBlackUserModel> oooO0OO = this$0.f22561OooooOo;
                    if (oooO0OO == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("baseAdapter");
                        oooO0OO = null;
                    }
                    TopicBlackUserModel topicBlackUserModel = oooO0OO.getData().get(i);
                    if (topicBlackUserModel != null) {
                        oo0oOO0 oo0ooo0 = new oo0oOO0(this$0);
                        oo0ooo0.OooOo0(R.string.Unblock_this_user);
                        oo0ooo0.OooOo0o(new o0O00O(this$0, topicBlackUserModel));
                        oo0ooo0.OooOOO0();
                    }
                }
                break;
            default:
                MainRoomMineFollowingFragment.m460initView$lambda4((MainRoomMineFollowingFragment) this.f43743OoooO00, baseQuickAdapter, view, i);
                break;
        }
    }
}
