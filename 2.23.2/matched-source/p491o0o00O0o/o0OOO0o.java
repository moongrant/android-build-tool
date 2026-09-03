package p491o0o00O0o;

import androidx.lifecycle.Observer;
import com.yalla.yalla.model.http.Response;
import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.ui.activity.account.AccountProtectionActivity;
import com.yalla.yalla.ui.activity.moment.TopicDetailActivity;
import com.yalla.yalla.ui.view.GiftView;
import com.yalla.yalla.ui.vm.account.AccountProtectionVM;
import kotlin.jvm.internal.Intrinsics;
import p475o0Ooooo0.o0O00oO0;
import p511o0o0O.o00000OO;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o0OOO0o implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f49051OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f49052OooO0o0;

    public /* synthetic */ o0OOO0o(Object obj, int i) {
        this.f49051OooO0Oo = i;
        this.f49052OooO0o0 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        Long l;
        int i = this.f49051OooO0Oo;
        Object obj2 = this.f49052OooO0o0;
        switch (i) {
            case 0:
                AccountProtectionActivity this$0 = (AccountProtectionActivity) obj2;
                int i2 = AccountProtectionActivity.f24684OooOo0O;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ((AccountProtectionVM) this$0.f24687OooOo00.getValue()).syncAccountProtection();
                this$0.OooOoO0();
                break;
            case 1:
                TopicDetailActivity this$1 = (TopicDetailActivity) obj2;
                String str = (String) obj;
                int i3 = TopicDetailActivity.f25854OooOoOO;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                long currentTopicUserId = this$1.OooOoo0().getCurrentTopicUserId();
                o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                Long l2 = (Long) o0O00oO0.OooOOo0().getValue();
                if (l2 != null && currentTopicUserId == l2.longValue() && (l = (Long) o0O00oO0.OooOOo0().getValue()) != null && currentTopicUserId == l.longValue()) {
                    Response response = (Response) this$1.OooOoo0().getTopicDetailLiveData().getValue();
                    TopicInfoModel topicInfoModel = response != null ? (TopicInfoModel) response.getData() : null;
                    if (topicInfoModel != null) {
                        Intrinsics.checkNotNull(str);
                        topicInfoModel.setDescribe(str);
                    }
                    this$1.OooOoOO().f45018OooO0oO.f45288OooO0oO.setText(str);
                }
                break;
            default:
                o00000OO this$2 = (o00000OO) obj2;
                GiftView giftView = (GiftView) obj;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                if (!Intrinsics.areEqual(this$2.f50969OooOOo0, giftView)) {
                    this$2.OooOOOo();
                } else {
                    this$2.OooOo0o(giftView, giftView.getF29924OooO0o0());
                }
                break;
        }
    }
}
