package o00OO0O;

import android.app.Activity;
import android.view.View;
import com.app.base.adapter.roomExplore.RoomExploreEventsManager;
import com.app.base.fragment.room.RoomInfoMemberListFragment;
import com.facebook.login.DeviceAuthDialog;
import com.umeng.analytics.pro.d;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.activity.moment.ShowImageActivity;
import com.yalla.yalla.ui.view.MomentDetailGiftGiverView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o00OO0O0.o0OOO0o;
import p254o00ooO0O.o00000O;
import p391o0OOooOo.o0O00000;
import p579o0oOoOOo.j;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class OooO0o implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f31355Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Object f31356Oooo0oO;

    public /* synthetic */ OooO0o(Object obj, int i) {
        this.f31355Oooo0o = i;
        this.f31356Oooo0oO = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f31355Oooo0o) {
            case 0:
                RoomExploreEventsManager this$0 = (RoomExploreEventsManager) this.f31356Oooo0oO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                o0O00000.OooO0OO("Room_explore_Everts_More");
                p606o0oo0O.OooOo.OooO0O0("101008");
                OooO onLogin = new OooO(this$0);
                Intrinsics.checkNotNullParameter(onLogin, "onLogin");
                if (!Intrinsics.areEqual(p498o0o00Oo0.OooOOO.f41216OooO00o.OooOooO().getValue(), Boolean.TRUE)) {
                    Activity activityOooO0O0 = o00000O.f34254OooO00o.OooO0O0();
                    if (activityOooO0O0 != null) {
                        LoginActivity.OooO00o oooO00o = LoginActivity.f21752OooooO0;
                        o0OOO0o.OooO0O0(activityOooO0O0, d.R, activityOooO0O0, LoginActivity.class);
                    }
                } else {
                    onLogin.invoke();
                }
                break;
            case 1:
                RoomInfoMemberListFragment.m60initView$lambda6((RoomInfoMemberListFragment) this.f31356Oooo0oO, view);
                break;
            case 2:
                DeviceAuthDialog.m219initializeContentView$lambda2((DeviceAuthDialog) this.f31356Oooo0oO, view);
                break;
            case 3:
                ShowImageActivity this$1 = (ShowImageActivity) this.f31356Oooo0oO;
                ShowImageActivity.OooO00o oooO00o2 = ShowImageActivity.f22515o00o0O;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                String str = this$1.f22516OoooOo0.get(this$1.OooOoo().f50708OooO0o0.getCurrentItem());
                Intrinsics.checkNotNullExpressionValue(str, "mImageUrlList[bind.viewPager.currentItem]");
                this$1.OooOooO(str, false);
                break;
            case 4:
                j this$2 = (j) this.f31356Oooo0oO;
                int i = j.f45965OooooO0;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                this$2.f45967OoooOO0.invoke(this$2.f45966OoooO);
                this$2.dismiss();
                break;
            default:
                MomentDetailGiftGiverView this$3 = (MomentDetailGiftGiverView) this.f31356Oooo0oO;
                int i2 = MomentDetailGiftGiverView.f24884OoooO0O;
                Intrinsics.checkNotNullParameter(this$3, "this$0");
                Function1<? super Integer, Unit> function1 = this$3.toMomentGiftListListener;
                if (function1 != null) {
                    function1.invoke(0);
                }
                break;
        }
    }
}
