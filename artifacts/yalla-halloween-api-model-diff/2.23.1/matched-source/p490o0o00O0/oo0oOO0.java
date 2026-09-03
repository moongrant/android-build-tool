package p490o0o00O0;

import androidx.lifecycle.Observer;
import com.yalla.yalla.ui.activity.account.PhoneNumberActivity;
import com.yalla.yalla.ui.fragment.BadgeRankDataFragment;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class oo0oOO0 implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f48878OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f48879OooO0o0;

    public /* synthetic */ oo0oOO0(Object obj, int i) {
        this.f48878OooO0Oo = i;
        this.f48879OooO0o0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = this.f48878OooO0Oo;
        Object obj2 = this.f48879OooO0o0;
        switch (i) {
            case 0:
                PhoneNumberActivity this$0 = (PhoneNumberActivity) obj2;
                int i2 = PhoneNumberActivity.f24809OooOoO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.finish();
                break;
            default:
                BadgeRankDataFragment.initData$lambda$5((BadgeRankDataFragment) obj2, (List) obj);
                break;
        }
    }
}
