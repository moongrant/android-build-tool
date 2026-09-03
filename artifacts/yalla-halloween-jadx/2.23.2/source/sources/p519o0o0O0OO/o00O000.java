package p519o0o0O0OO;

import androidx.lifecycle.Observer;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.ui.screen.moment.media.VideoFeedScreen;
import com.yalla.yalla.ui.vm.moment.BaseMomentVM;
import com.yalla.yalla.ui.vm.moment.MomentVideoVM;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o00O000 implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f52015OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ BaseMomentVM f52016OooO0o0;

    public /* synthetic */ o00O000(BaseMomentVM baseMomentVM, int i) {
        this.f52015OooO0Oo = i;
        this.f52016OooO0o0 = baseMomentVM;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = this.f52015OooO0Oo;
        BaseMomentVM newMomentVM = this.f52016OooO0o0;
        switch (i) {
            case 0:
                MomentDetailModel it = (MomentDetailModel) obj;
                Intrinsics.checkNotNullParameter(newMomentVM, "$newMomentVM");
                Intrinsics.checkNotNullParameter(it, "it");
                newMomentVM.refreshData(it);
                break;
            default:
                VideoFeedScreen.InitObservers$lambda$57((MomentVideoVM) newMomentVM, ((Long) obj).longValue());
                break;
        }
    }
}
