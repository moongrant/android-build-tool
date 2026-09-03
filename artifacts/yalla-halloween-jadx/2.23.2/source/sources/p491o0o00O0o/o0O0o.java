package p491o0o00O0o;

import androidx.lifecycle.Observer;
import com.yalla.yalla.ui.activity.account.PhoneNumberActivity;
import com.yalla.yalla.ui.fragment.BadgeRankDataFragment;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o0O0o implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f49026OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f49027OooO0o0;

    public /* synthetic */ o0O0o(Object obj, int i) {
        this.f49026OooO0Oo = i;
        this.f49027OooO0o0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = this.f49026OooO0Oo;
        Object obj2 = this.f49027OooO0o0;
        switch (i) {
            case 0:
                PhoneNumberActivity this$0 = (PhoneNumberActivity) obj2;
                int i2 = PhoneNumberActivity.f24807OooOoO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.finish();
                break;
            default:
                BadgeRankDataFragment.initData$lambda$4((BadgeRankDataFragment) obj2, (List) obj);
                break;
        }
    }
}
