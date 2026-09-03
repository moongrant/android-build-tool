package p177o00OoooO;

import android.app.Activity;
import android.view.View;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.OooO00o;
import com.app.base.view.dialog.RoomMoraGameListDialog;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.facebook.login.LoginFragment;
import com.umeng.analytics.pro.d;
import com.yalla.yalla.common.model.ShopVehicleListModel;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.activity.store.VehicleStoreActivity;
import com.yalla.yalla.ui.activity.user.UserInfoTagActivity;
import com.yalla.yalla.ui.view.MomentDetailPollView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o00OO0O0.o0OOO0o;
import p187o00o00Oo.o0ooOOo;
import p189o00o00o0.OooO0OO;
import p255o00ooO0O.o00000O;
import p500o0o00Oo0.OooOOO;
import p566o0oOo00.o000O0o;
import p581o0oOoOOo.r1;
import p603o0oo00Oo.oo0oOO0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class oO00O0o0 implements o0ooOOo, OooO00o, BaseQuickAdapter.OooOOOO {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f32837Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f32838OoooO00;

    public /* synthetic */ oO00O0o0(Object obj, int i) {
        this.f32837Oooo = i;
        this.f32838OoooO00 = obj;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOOOO
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        switch (this.f32837Oooo) {
            case 2:
                VehicleStoreActivity this$0 = (VehicleStoreActivity) this.f32838OoooO00;
                VehicleStoreActivity.OooO00o oooO00o = VehicleStoreActivity.f23278Oooooo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                OooO0OO<ShopVehicleListModel> oooO0OO = this$0.f23281OooooOo;
                if (oooO0OO == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                    oooO0OO = null;
                }
                ShopVehicleListModel item = oooO0OO.getItem(i);
                if (item != null && !this$0.f23282Oooooo0) {
                    this$0.f23282Oooooo0 = true;
                    r1 r1Var = new r1(this$0);
                    r1Var.OooO00o(new o000O0o(this$0));
                    r1Var.OooOO0O(item.getPicDynamic());
                    r1Var.OooOO0();
                    break;
                }
                break;
            case 3:
                final UserInfoTagActivity this$1 = (UserInfoTagActivity) this.f32838OoooO00;
                UserInfoTagActivity.OooO00o oooO00o2 = UserInfoTagActivity.f23557o00oO0O;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                if (this$1.f23572oo000o) {
                    this$1.f23572oo000o = false;
                    view.postDelayed(new Runnable() { // from class: o0oOo00O.o
                        @Override // java.lang.Runnable
                        public final void run() {
                            UserInfoTagActivity this$2 = this$1;
                            UserInfoTagActivity.OooO00o oooO00o3 = UserInfoTagActivity.f23557o00oO0O;
                            Intrinsics.checkNotNullParameter(this$2, "this$0");
                            this$2.f23572oo000o = true;
                        }
                    }, 500L);
                    this$1.Oooo0O0(i);
                    break;
                }
                break;
            default:
                MomentDetailPollView this$2 = (MomentDetailPollView) this.f32838OoooO00;
                int i2 = MomentDetailPollView.f24910OooooOo;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                oo0oOO0 onLogin = new oo0oOO0(this$2, i);
                Intrinsics.checkNotNullParameter(onLogin, "onLogin");
                if (!Intrinsics.areEqual(OooOOO.f41235OooO00o.OooOooO().getValue(), Boolean.TRUE)) {
                    Activity activityOooO0O0 = o00000O.f34276OooO00o.OooO0O0();
                    if (activityOooO0O0 != null) {
                        LoginActivity.OooO00o oooO00o3 = LoginActivity.f21771Oooooo0;
                        o0OOO0o.OooO00o(activityOooO0O0, d.R, activityOooO0O0, LoginActivity.class);
                    }
                } else {
                    onLogin.invoke();
                }
                break;
        }
    }

    @Override // p187o00o00Oo.o0ooOOo
    public final void OooO0oO() {
        RoomMoraGameListDialog this$0 = (RoomMoraGameListDialog) this.f32838OoooO00;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        RoomMoraGameListDialog.OooOOO(this$0);
    }

    @Override // androidx.activity.result.OooO00o
    public final void onActivityResult(Object obj) {
        LoginFragment.m227onCreate$lambda1((Function1) this.f32838OoooO00, (ActivityResult) obj);
    }
}
