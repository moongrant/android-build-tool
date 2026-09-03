package p176o00OoooO;

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
import p186o00o00Oo.o0ooOOo;
import p188o00o00o0.OooO0OO;
import p254o00ooO0O.o00000O;
import p498o0o00Oo0.OooOOO;
import p564o0oOo00.o000O000;
import p579o0oOoOOo.s1;
import p601o0oo00Oo.oo0oOO0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class oO000Oo implements o0ooOOo, OooO00o, BaseQuickAdapter.OooOOOO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f32839OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f32840OooO0o0;

    public /* synthetic */ oO000Oo(Object obj, int i) {
        this.f32839OooO0Oo = i;
        this.f32840OooO0o0 = obj;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOOOO
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        switch (this.f32839OooO0Oo) {
            case 2:
                VehicleStoreActivity this$0 = (VehicleStoreActivity) this.f32840OooO0o0;
                VehicleStoreActivity.OooO00o oooO00o = VehicleStoreActivity.f23259OooooOO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                OooO0OO<ShopVehicleListModel> oooO0OO = this$0.f23262Ooooo0o;
                if (oooO0OO == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                    oooO0OO = null;
                }
                ShopVehicleListModel item = oooO0OO.getItem(i);
                if (item != null && !this$0.f23263OooooO0) {
                    this$0.f23263OooooO0 = true;
                    s1 s1Var = new s1(this$0);
                    s1Var.OooO00o(new o000O000(this$0));
                    s1Var.OooOO0O(item.getPicDynamic());
                    s1Var.OooOO0();
                    break;
                }
                break;
            case 3:
                final UserInfoTagActivity this$1 = (UserInfoTagActivity) this.f32840OooO0o0;
                UserInfoTagActivity.OooO00o oooO00o2 = UserInfoTagActivity.f23538o00ooo;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                if (this$1.f23551o00Ooo) {
                    this$1.f23551o00Ooo = false;
                    view.postDelayed(new Runnable() { // from class: o0oOo00O.oO00000
                        @Override // java.lang.Runnable
                        public final void run() {
                            UserInfoTagActivity this$2 = this$1;
                            UserInfoTagActivity.OooO00o oooO00o3 = UserInfoTagActivity.f23538o00ooo;
                            Intrinsics.checkNotNullParameter(this$2, "this$0");
                            this$2.f23551o00Ooo = true;
                        }
                    }, 500L);
                    this$1.Oooo0O0(i);
                    break;
                }
                break;
            default:
                MomentDetailPollView this$2 = (MomentDetailPollView) this.f32840OooO0o0;
                int i2 = MomentDetailPollView.f24891Ooooo0o;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                oo0oOO0 onLogin = new oo0oOO0(this$2, i);
                Intrinsics.checkNotNullParameter(onLogin, "onLogin");
                if (!Intrinsics.areEqual(OooOOO.f41216OooO00o.OooOooO().getValue(), Boolean.TRUE)) {
                    Activity activityOooO0O0 = o00000O.f34254OooO00o.OooO0O0();
                    if (activityOooO0O0 != null) {
                        LoginActivity.OooO00o oooO00o3 = LoginActivity.f21752OooooO0;
                        o0OOO0o.OooO0O0(activityOooO0O0, d.R, activityOooO0O0, LoginActivity.class);
                    }
                } else {
                    onLogin.invoke();
                }
                break;
        }
    }

    @Override // p186o00o00Oo.o0ooOOo
    public final void OooO0oO() {
        RoomMoraGameListDialog this$0 = (RoomMoraGameListDialog) this.f32840OooO0o0;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        RoomMoraGameListDialog.OooOOO(this$0);
    }

    @Override // androidx.activity.result.OooO00o
    public final void onActivityResult(Object obj) {
        LoginFragment.m227onCreate$lambda1((Function1) this.f32840OooO0o0, (ActivityResult) obj);
    }
}
