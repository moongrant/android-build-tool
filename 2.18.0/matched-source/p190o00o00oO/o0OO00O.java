package p190o00o00oO;

import android.view.View;
import android.widget.LinearLayout;
import com.app.base.model.CountryModel;
import com.app.base.view.tips.GiftGuideView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.google.android.exoplayer2.OooO0OO;
import com.google.android.exoplayer2.OooOO0;
import com.google.android.exoplayer2.Player;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.manager.error.CommonError;
import com.yalla.yalla.common.manager.error.CommonErrorHandler;
import com.yalla.yalla.model.ThemeModel;
import com.yalla.yalla.ui.activity.main.TaskActivity;
import com.yalla.yalla.ui.activity.room.ExploreCountryRoomListActivity;
import com.yalla.yalla.ui.fragment.MainMomentsTopicNewFragment;
import kotlin.jvm.internal.Intrinsics;
import p187o00o00Oo.o0ooOOo;
import p255o00ooO0O.o000Oo0;
import p255o00ooO0O.oOO00O;
import p500o0o00Oo0.OooOOO;
import p581o0oOoOOo.b1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0OO00O implements GiftGuideView.OooO0O0, OooO0OO.OooO0O0, o0ooOOo, BaseQuickAdapter.OooOOOO, BaseQuickAdapter.OooOOO0 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f33073Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f33074OoooO00;

    public /* synthetic */ o0OO00O(Object obj, int i) {
        this.f33073Oooo = i;
        this.f33074OoooO00 = obj;
    }

    @Override // com.google.android.exoplayer2.OooO0OO.OooO0O0
    public final void OooO0OO(Player.OooO00o oooO00o) {
        oooO00o.OooOO0o(((OooOO0.OooO0O0) this.f33074OoooO00).f13254Oooo.f40580OooO0o0);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOOOO
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        ExploreCountryRoomListActivity this$0 = (ExploreCountryRoomListActivity) this.f33074OoooO00;
        ExploreCountryRoomListActivity.OooO00o oooO00o = ExploreCountryRoomListActivity.f22816o00O0O;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Object obj = baseQuickAdapter.getData().get(i);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.app.base.model.CountryModel");
        CountryModel countryModel = (CountryModel) obj;
        if (o000Oo0.OooO0OO(countryModel.getCid(), 0) == this$0.f22823Ooooooo) {
            return;
        }
        this$0.f22823Ooooooo = o000Oo0.OooO0OO(countryModel.getCid(), 0);
        this$0.OooOoo().f49292OooO0o.setCurrentItem(i);
        p189o00o00o0.OooO0OO<CountryModel> oooO0OO = this$0.f22822OoooooO;
        if (oooO0OO != null) {
            oooO0OO.setNewData(this$0.f22819OooooOo);
        }
        LinearLayout linearLayout = this$0.OooOoo().f49290OooO0OO.f50632OooO0OO;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.llCountries.llCountryRoot");
        oOO00O.OooO00o(linearLayout);
    }

    @Override // p187o00o00Oo.o0ooOOo
    public final void OooO0oO() {
        switch (this.f33073Oooo) {
            case 2:
                TaskActivity this$0 = (TaskActivity) this.f33074OoooO00;
                TaskActivity.OooO00o oooO00o = TaskActivity.f22080o00ooo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.Oooo00o();
                break;
            default:
                MainMomentsTopicNewFragment.m357initView$lambda3((MainMomentsTopicNewFragment) this.f33074OoooO00);
                break;
        }
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOOO0
    public final void OooO0oo(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        b1 this$0 = (b1) this.f33074OoooO00;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        switch (view.getId()) {
            case R.id.clRootView /* 2131296624 */:
            case R.id.ivClose /* 2131297605 */:
                this$0.OooO0O0();
                break;
            case R.id.flSendTheme /* 2131297063 */:
                Object item = baseQuickAdapter.getItem(i);
                Intrinsics.checkNotNull(item, "null cannot be cast to non-null type com.yalla.yalla.model.ThemeModel");
                this$0.f45926OoooOOO.invoke((ThemeModel) item);
                this$0.OooO0O0();
                break;
            case R.id.llBuyTheme /* 2131298300 */:
                OooOOO oooOOO = OooOOO.f41235OooO00o;
                if (OooOOO.f41270Oooo0OO.getValue() != null) {
                    Object item2 = baseQuickAdapter.getItem(i);
                    Intrinsics.checkNotNull(item2, "null cannot be cast to non-null type com.yalla.yalla.model.ThemeModel");
                    this$0.f45927OoooOOo.invoke((ThemeModel) item2);
                } else {
                    oo0o0Oo.OooO0O0(CommonError.Create_Room_Tips, null, 2, null, CommonErrorHandler.INSTANCE);
                }
                this$0.OooO0O0();
                break;
        }
    }
}
