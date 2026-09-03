package p490o0o00O0;

import androidx.lifecycle.Observer;
import com.yalla.yalla.model.http.Response;
import com.yalla.yalla.ui.activity.account.PhoneNumberActivity;
import com.yalla.yalla.ui.activity.moment.TopicSearchActivity;
import com.yalla.yalla.ui.fragment.BadgeRankDataFragment;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o00O implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f48777OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f48778OooO0o0;

    public /* synthetic */ o00O(Object obj, int i) {
        this.f48777OooO0Oo = i;
        this.f48778OooO0o0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = this.f48777OooO0Oo;
        Object obj2 = this.f48778OooO0o0;
        switch (i) {
            case 0:
                PhoneNumberActivity this$0 = (PhoneNumberActivity) obj2;
                int i2 = PhoneNumberActivity.f24809OooOoO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.finish();
                break;
            case 1:
                TopicSearchActivity this$1 = (TopicSearchActivity) obj2;
                Response response = (Response) obj;
                int i3 = TopicSearchActivity.f25949OooOoo0;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                if (!this$1.f25955OooOo0o) {
                    if (response.getIsSuccess()) {
                        this$1.OooOoO().OooOoO0((List) response.getData());
                        if (this$1.OooOoo0().f44596OooO00o.getParent() != null) {
                            this$1.OooOoO().OooOOoo();
                        }
                    }
                    this$1.OooOoO().Oooo0O0(response.getIsSuccess());
                    break;
                }
                break;
            default:
                BadgeRankDataFragment.initData$lambda$6((BadgeRankDataFragment) obj2, (List) obj);
                break;
        }
    }
}
