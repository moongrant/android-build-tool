package p645o0ooOOoo;

import androidx.lifecycle.Observer;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.ui.activity.main.MainActivity;
import com.yalla.yalla.ui.fragment.FriendListFragment;
import com.yalla.yalla.ui.screen.moment.media.VideoFeedScreen;
import com.yalla.yalla.ui.vm.moment.BaseMomentVM;
import com.yalla.yalla.ui.vm.moment.MomentVideoVM;
import kotlin.jvm.internal.Intrinsics;
import p525o0o0OO0.o00OO;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class m3 implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f58111OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f58112OooO0o0;

    public /* synthetic */ m3(Object obj, int i) {
        this.f58111OooO0Oo = i;
        this.f58112OooO0o0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = this.f58111OooO0Oo;
        Object obj2 = this.f58112OooO0o0;
        switch (i) {
            case 0:
                n3 this$0 = (n3) obj2;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                o00OO o00oo2 = this$0.f58114OooO0O0;
                if (o00oo2 != null) {
                    o00oo2.dismiss();
                }
                break;
            case 1:
                MainActivity this$1 = (MainActivity) obj2;
                int i2 = MainActivity.f24940OooOoo;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                if (!(obj instanceof MainActivity)) {
                    this$1.OooOo().f44752OooO0oO.OooO00o();
                }
                break;
            case 2:
                BaseMomentVM newMomentVM = (BaseMomentVM) obj2;
                MomentDetailModel result = (MomentDetailModel) obj;
                Intrinsics.checkNotNullParameter(newMomentVM, "$newMomentVM");
                Intrinsics.checkNotNullParameter(result, "result");
                newMomentVM.updatePoll(result);
                break;
            case 3:
                FriendListFragment.initData$lambda$0((FriendListFragment) obj2, obj);
                break;
            default:
                VideoFeedScreen.InitObservers$lambda$55((MomentVideoVM) obj2, ((Long) obj).longValue());
                break;
        }
    }
}
