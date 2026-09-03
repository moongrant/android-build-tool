package p534o0o0OOo0;

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
import p133o00OO00o.OooOOO;
import p186o00o00Oo.o0ooOOo;
import p188o00o00o0.OooO0OO;
import p520o0o0O0O0.o00O0O;
import p579o0oOoOOo.O0000000;
import p616o0oo0Ooo.oO0O00;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0OO000 implements BaseQuickAdapter.OooOOO0, OooOOO.OooO0O0, o0ooOOo, BaseQuickAdapter.OooOOOO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f43569OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f43570OooO0o0;

    public /* synthetic */ o0OO000(Object obj, int i) {
        this.f43569OooO0Oo = i;
        this.f43570OooO0o0 = obj;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOOOO
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        O0000000 this$0 = (O0000000) this.f43570OooO0o0;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        OooO0OO<RoomLoginInformation.MIC> oooO0OO = this$0.f45890o00Oo0;
        if (oooO0OO == null) {
            Intrinsics.throwUninitializedPropertyAccessException("popupAdapter");
            oooO0OO = null;
        }
        RoomUserInfoModel roomUserInfoModel = oooO0OO.getData().get(i).user;
        this$0.f45892ooOO = roomUserInfoModel.getUserId();
        if (i == 0) {
            this$0.OooOO0O().f49782OooOOOO.setImageResource(R.drawable.icon_default_head_circle);
        } else {
            oO0O00.OooO00o oooO00o = new oO0O00.OooO00o(this$0.f41543Oooo0o);
            oooO00o.OooO00o(OooO00o.OooO0o0());
            oooO00o.f48429OooO0OO = roomUserInfoModel.getUserHeader();
            oooO00o.f48427OooO00o = 0;
            oooO00o.OooO0o(this$0.OooOO0O().f49782OooOOOO);
        }
        this$0.OooOO0O().f49794OooOoOO.setText(o00O0O.f42677OooO00o.OooO0O0(this$0.f45892ooOO, roomUserInfoModel.getUserName()));
        PopupWindow popupWindow = this$0.f45889o00O0O;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    @Override // p186o00o00Oo.o0ooOOo
    public final void OooO0oO() {
        switch (this.f43569OooO0Oo) {
            case 2:
                PostDetailCommentSonListActivity this$0 = (PostDetailCommentSonListActivity) this.f43570OooO0o0;
                PostDetailCommentSonListActivity.OooO00o oooO00o = PostDetailCommentSonListActivity.f22473o0ooOOo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.Oooo00O(false);
                break;
            default:
                PacketHistoryListFragment.m385initView$lambda0((PacketHistoryListFragment) this.f43570OooO0o0);
                break;
        }
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOOO0
    public final void OooO0oo(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        PhoneCountryCodeSelectActivity this$0 = (PhoneCountryCodeSelectActivity) this.f43570OooO0o0;
        int i2 = PhoneCountryCodeSelectActivity.f21808Oooooo;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent();
        OooO0OO<CountryCodeItemModel> oooO0OO = this$0.f21815Oooooo0;
        if (oooO0OO == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oooO0OO = null;
        }
        intent.putExtra("DATA", oooO0OO.getData().get(i));
        this$0.setResult(-1, intent);
        this$0.finish();
    }
}
