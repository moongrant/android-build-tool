package p189o00o00oO;

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
import p186o00o00Oo.o0ooOOo;
import p254o00ooO0O.o000Oo0;
import p254o00ooO0O.oOO00O;
import p498o0o00Oo0.OooOOO;
import p579o0oOoOOo.c1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0OO00O implements GiftGuideView.OooO0O0, OooO0OO.OooO0O0, o0ooOOo, BaseQuickAdapter.OooOOOO, BaseQuickAdapter.OooOOO0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f33050OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f33051OooO0o0;

    public /* synthetic */ o0OO00O(Object obj, int i) {
        this.f33050OooO0Oo = i;
        this.f33051OooO0o0 = obj;
    }

    @Override // com.google.android.exoplayer2.OooO0OO.OooO0O0
    public final void OooO0OO(Player.OooO00o oooO00o) {
        oooO00o.OooOO0o(((OooOO0.OooO0O0) this.f33051OooO0o0).f13238Oooo0o.f40561OooO0o0);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOOOO
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        ExploreCountryRoomListActivity this$0 = (ExploreCountryRoomListActivity) this.f33051OooO0o0;
        ExploreCountryRoomListActivity.OooO00o oooO00o = ExploreCountryRoomListActivity.f22797Ooooooo;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Object obj = baseQuickAdapter.getData().get(i);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.app.base.model.CountryModel");
        CountryModel countryModel = (CountryModel) obj;
        if (o000Oo0.OooO0OO(countryModel.getCid(), 0) == this$0.f22805Oooooo0) {
            return;
        }
        this$0.f22805Oooooo0 = o000Oo0.OooO0OO(countryModel.getCid(), 0);
        this$0.OooOoo().f49355OooO0o.setCurrentItem(i);
        p188o00o00o0.OooO0OO<CountryModel> oooO0OO = this$0.f22803OooooOo;
        if (oooO0OO != null) {
            oooO0OO.setNewData(this$0.f22800Ooooo0o);
        }
        LinearLayout linearLayout = this$0.OooOoo().f49353OooO0OO.f50695OooO0OO;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.llCountries.llCountryRoot");
        oOO00O.OooO00o(linearLayout);
    }

    @Override // p186o00o00Oo.o0ooOOo
    public final void OooO0oO() {
        switch (this.f33050OooO0Oo) {
            case 2:
                TaskActivity this$0 = (TaskActivity) this.f33051OooO0o0;
                TaskActivity.OooO00o oooO00o = TaskActivity.f22061o00Oo0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.Oooo00o();
                break;
            default:
                MainMomentsTopicNewFragment.m357initView$lambda3((MainMomentsTopicNewFragment) this.f33051OooO0o0);
                break;
        }
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOOO0
    public final void OooO0oo(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        c1 this$0 = (c1) this.f33051OooO0o0;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        switch (view.getId()) {
            case R.id.clRootView /* 2131296624 */:
            case R.id.ivClose /* 2131297605 */:
                this$0.OooO0O0();
                break;
            case R.id.flSendTheme /* 2131297063 */:
                Object item = baseQuickAdapter.getItem(i);
                Intrinsics.checkNotNull(item, "null cannot be cast to non-null type com.yalla.yalla.model.ThemeModel");
                this$0.f45935OoooO.invoke((ThemeModel) item);
                this$0.OooO0O0();
                break;
            case R.id.llBuyTheme /* 2131298300 */:
                OooOOO oooOOO = OooOOO.f41216OooO00o;
                if (OooOOO.f41251Oooo0OO.getValue() != null) {
                    Object item2 = baseQuickAdapter.getItem(i);
                    Intrinsics.checkNotNull(item2, "null cannot be cast to non-null type com.yalla.yalla.model.ThemeModel");
                    this$0.f45936OoooOO0.invoke((ThemeModel) item2);
                } else {
                    oo0o0Oo.OooO0O0(CommonError.Create_Room_Tips, null, 2, null, CommonErrorHandler.INSTANCE);
                }
                this$0.OooO0O0();
                break;
        }
    }
}
