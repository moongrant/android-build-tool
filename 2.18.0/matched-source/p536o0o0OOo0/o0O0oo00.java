package p536o0o0OOo0;

import android.content.Intent;
import android.view.View;
import android.widget.PopupWindow;
import com.app.base.mixedroom.model.RoomLoginInformation;
import com.app.base.model.CountryCodeItemModel;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.weieyu.yalla.R;
import com.yalla.yalla.model.RoomUserInfoModel;
import com.yalla.yalla.ui.activity.account.PhoneCountryCodeSelectActivity;
import com.yalla.yalla.ui.activity.moment.PostDetailCommentSonListActivity;
import com.yalla.yalla.ui.fragment.PacketHistoryListFragment;
import kotlin.jvm.internal.Intrinsics;
import o00OOO.OooO00o;
import p134o00OO00o.OooOOO;
import p187o00o00Oo.o0ooOOo;
import p189o00o00o0.OooO0OO;
import p522o0o0O0O0.o00Ooo;
import p581o0oOoOOo.oo00;
import p618o0oo0Ooo.oO0O000o;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0O0oo00 implements BaseQuickAdapter.OooOOO0, OooOOO.OooO0O0, o0ooOOo, BaseQuickAdapter.OooOOOO {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f43584Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f43585OoooO00;

    public /* synthetic */ o0O0oo00(Object obj, int i) {
        this.f43584Oooo = i;
        this.f43585OoooO00 = obj;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOOOO
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        oo00 this$0 = (oo00) this.f43585OoooO00;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        OooO0OO<RoomLoginInformation.MIC> oooO0OO = this$0.f46250o00ooo;
        if (oooO0OO == null) {
            Intrinsics.throwUninitializedPropertyAccessException("popupAdapter");
            oooO0OO = null;
        }
        RoomUserInfoModel roomUserInfoModel = oooO0OO.getData().get(i).user;
        this$0.f46248o00Ooo = roomUserInfoModel.getUserId();
        if (i == 0) {
            this$0.OooOO0O().f49719OooOOOO.setImageResource(R.drawable.icon_default_head_circle);
        } else {
            oO0O000o.OooO00o oooO00o = new oO0O000o.OooO00o(this$0.f41561Oooo);
            oooO00o.OooO00o(OooO00o.OooO0o0());
            oooO00o.f48447OooO0OO = roomUserInfoModel.getUserHeader();
            oooO00o.f48445OooO00o = 0;
            oooO00o.OooO0o(this$0.OooOO0O().f49719OooOOOO);
        }
        this$0.OooOO0O().f49731OooOoOO.setText(o00Ooo.f42780OooO00o.OooO0O0(this$0.f46248o00Ooo, roomUserInfoModel.getUserName()));
        PopupWindow popupWindow = this$0.f46249o00o0O;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    @Override // p187o00o00Oo.o0ooOOo
    public final void OooO0oO() {
        switch (this.f43584Oooo) {
            case 2:
                PostDetailCommentSonListActivity this$0 = (PostDetailCommentSonListActivity) this.f43585OoooO00;
                PostDetailCommentSonListActivity.OooO00o oooO00o = PostDetailCommentSonListActivity.f22492o0Oo0oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.Oooo00O(false);
                break;
            default:
                PacketHistoryListFragment.m385initView$lambda0((PacketHistoryListFragment) this.f43585OoooO00);
                break;
        }
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOOO0
    public final void OooO0oo(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        PhoneCountryCodeSelectActivity this$0 = (PhoneCountryCodeSelectActivity) this.f43585OoooO00;
        int i2 = PhoneCountryCodeSelectActivity.f21827o0OoOo0;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent();
        OooO0OO<CountryCodeItemModel> oooO0OO = this$0.f21834Ooooooo;
        if (oooO0OO == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oooO0OO = null;
        }
        intent.putExtra("DATA", oooO0OO.getData().get(i));
        this$0.setResult(-1, intent);
        this$0.finish();
    }
}
