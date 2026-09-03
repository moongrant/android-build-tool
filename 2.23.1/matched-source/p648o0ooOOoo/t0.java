package p648o0ooOOoo;

import androidx.lifecycle.Observer;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.ui.activity.main.MainActivity;
import com.yalla.yalla.ui.screen.moment.media.VideoFeedScreen;
import com.yalla.yalla.ui.vm.moment.BaseMomentVM;
import com.yalla.yalla.ui.vm.moment.MomentVideoVM;
import kotlin.jvm.internal.Intrinsics;
import p513o0o0O.OooO;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class t0 implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f57691OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f57692OooO0o0;

    public /* synthetic */ t0(Object obj, int i) {
        this.f57691OooO0Oo = i;
        this.f57692OooO0o0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = this.f57691OooO0Oo;
        Object obj2 = this.f57692OooO0o0;
        switch (i) {
            case 0:
                u0 this$0 = (u0) obj2;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                OooO oooO = this$0.f57694OooO0O0;
                if (oooO != null) {
                    oooO.dismiss();
                }
                break;
            case 1:
                MainActivity this$1 = (MainActivity) obj2;
                int i2 = MainActivity.f24941OooOoo;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                if (!(obj instanceof MainActivity)) {
                    this$1.OooOo().f44758OooO0oO.OooO00o();
                }
                break;
            case 2:
                BaseMomentVM newMomentVM = (BaseMomentVM) obj2;
                MomentDetailModel it = (MomentDetailModel) obj;
                Intrinsics.checkNotNullParameter(newMomentVM, "$newMomentVM");
                Intrinsics.checkNotNullParameter(it, "it");
                newMomentVM.refreshData(it);
                break;
            default:
                VideoFeedScreen.InitObservers$lambda$57((MomentVideoVM) obj2, ((Long) obj).longValue());
                break;
        }
    }
}
