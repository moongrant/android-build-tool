package p568o0oOo00O;

import androidx.lifecycle.Observer;
import com.yalla.yalla.common.model.Response;
import com.yalla.yalla.ui.activity.user.VipActivity;
import com.yalla.yalla.ui.dialog.RoomGameBoxDialog;
import com.yalla.yalla.ui.fragment.MainExploreFragment;
import com.yalla.yalla.ui.fragment.RoomThemeCustomizeFragment;
import com.yalla.yalla.ui.fragment.mainroom.MainRoomMineFollowingFragment;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class oO0000o0 implements Observer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f45368OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f45369OooO0O0;

    public /* synthetic */ oO0000o0(Object obj, int i) {
        this.f45368OooO00o = i;
        this.f45369OooO0O0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.f45368OooO00o) {
            case 0:
                VipActivity this$0 = (VipActivity) this.f45369OooO0O0;
                VipActivity.OooO0O0 oooO0O0 = VipActivity.f23589OoooOoo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (obj instanceof Boolean) {
                    this$0.Oooo000().getPersonalKaVipModel().setShowPremiumFirst(((Boolean) obj).booleanValue());
                }
                break;
            case 1:
                RoomGameBoxDialog this$1 = (RoomGameBoxDialog) this.f45369OooO0O0;
                Boolean bool = (Boolean) obj;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                if (bool != null) {
                    this$1.OooOOOO(bool.booleanValue(), RoomGameBoxDialog.GameType.GameMora);
                }
                break;
            case 2:
                MainExploreFragment.m336initObserver$lambda6((MainExploreFragment) this.f45369OooO0O0, (Pair) obj);
                break;
            case 3:
                RoomThemeCustomizeFragment.m395initView$lambda0((RoomThemeCustomizeFragment) this.f45369OooO0O0, obj);
                break;
            default:
                MainRoomMineFollowingFragment.m457followRoom$lambda5((MainRoomMineFollowingFragment) this.f45369OooO0O0, (Response) obj);
                break;
        }
    }
}
