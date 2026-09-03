package p505o0o00oO;

import androidx.lifecycle.Observer;
import com.yalla.yalla.model.topic.TopicFollowChange;
import com.yalla.yalla.ui.activity.user.PremiumActivity;
import com.yalla.yalla.ui.fragment.moment.MainMomentsTopicAddMoreFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o0Oo0oo implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f50477OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f50478OooO0o0;

    public /* synthetic */ o0Oo0oo(Object obj, int i) {
        this.f50477OooO0Oo = i;
        this.f50478OooO0o0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = this.f50477OooO0Oo;
        Object obj2 = this.f50478OooO0o0;
        switch (i) {
            case 0:
                PremiumActivity this$0 = (PremiumActivity) obj2;
                int i2 = PremiumActivity.f26674Oooo0oO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.Oooo0o0(true);
                break;
            default:
                MainMomentsTopicAddMoreFragment.initObserver$lambda$1((MainMomentsTopicAddMoreFragment) obj2, (TopicFollowChange) obj);
                break;
        }
    }
}
