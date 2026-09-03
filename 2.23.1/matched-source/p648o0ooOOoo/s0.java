package p648o0ooOOoo;

import androidx.lifecycle.Observer;
import com.code.android.util.o0OoOo0;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.ui.activity.main.MainActivity;
import com.yalla.yalla.ui.fragment.FriendListFragment;
import com.yalla.yalla.ui.screen.moment.media.VideoFeedScreen;
import com.yalla.yalla.ui.vm.moment.BaseMomentVM;
import com.yalla.yalla.ui.vm.moment.MomentVideoVM;
import kotlin.jvm.internal.Intrinsics;
import p574o0oOoO0o.o00O0O0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class s0 implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f57689OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f57690OooO0o0;

    public /* synthetic */ s0(Object obj, int i) {
        this.f57689OooO0Oo = i;
        this.f57690OooO0o0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = this.f57689OooO0Oo;
        Object obj2 = this.f57690OooO0o0;
        switch (i) {
            case 0:
                u0 this$0 = (u0) obj2;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooO00o(0);
                break;
            case 1:
                MainActivity this$1 = (MainActivity) obj2;
                o00O0O0 o00o0o0 = (o00O0O0) obj;
                int i2 = MainActivity.f24941OooOoo;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                long jCurrentTimeMillis = System.currentTimeMillis();
                o00O0O0 o00o0o1 = this$1.f24948OooOoO;
                if (jCurrentTimeMillis - o0OoOo0.OooOO0(o00o0o1 != null ? Long.valueOf(o00o0o1.f56341OooO0o) : null) > 3600000) {
                    this$1.f24948OooOoO = o00o0o0;
                    this$1.OooOoOO();
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
