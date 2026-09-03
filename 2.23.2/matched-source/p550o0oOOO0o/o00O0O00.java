package p550o0oOOO0o;

import androidx.lifecycle.Observer;
import com.yalla.yalla.module.media.preview.YLMediaPreViewScreen;
import com.yalla.yalla.ui.activity.user.PremiumActivity;
import com.yalla.yalla.ui.fragment.moment.MainMomentTopicFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o00O0O00 implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f55996OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f55997OooO0o0;

    public /* synthetic */ o00O0O00(Object obj, int i) {
        this.f55996OooO0Oo = i;
        this.f55997OooO0o0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = this.f55996OooO0Oo;
        Object obj2 = this.f55997OooO0o0;
        switch (i) {
            case 0:
                YLMediaPreViewScreen.Content$lambda$1((o00O00OO) obj2, ((Boolean) obj).booleanValue());
                break;
            case 1:
                PremiumActivity this$0 = (PremiumActivity) obj2;
                int i2 = PremiumActivity.f26673Oooo0oO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.Oooo0o0(false);
                break;
            default:
                MainMomentTopicFragment.initObserver$lambda$0((MainMomentTopicFragment) obj2, obj);
                break;
        }
    }
}
