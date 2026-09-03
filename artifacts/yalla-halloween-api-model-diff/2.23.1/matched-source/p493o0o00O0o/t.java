package p493o0o00O0o;

import androidx.lifecycle.Observer;
import com.code.android.util.o0000O0;
import com.yalla.yalla.model.http.Response;
import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.ui.activity.moment.TopicDetailActivity;
import com.yalla.yalla.ui.view.GiftView;
import kotlin.jvm.internal.Intrinsics;
import oO0OO.o00000OO;
import p184o00o00O0.OooO0OO;
import p370o0OOo0Oo.Oooo000;
import p474o0OoooOO.oo0oO0;
import p565o0oOo000.o0OOO0o;
import p645o0ooOOO0.o0O0O0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class t implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f49463OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f49464OooO0o0;

    public /* synthetic */ t(Object obj, int i) {
        this.f49463OooO0Oo = i;
        this.f49464OooO0o0 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = this.f49463OooO0Oo;
        Object obj2 = this.f49464OooO0o0;
        switch (i) {
            case 0:
                TopicDetailActivity this$0 = (TopicDetailActivity) obj2;
                String str = (String) obj;
                int i2 = TopicDetailActivity.f25856OooOoOO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                long currentTopicUserId = this$0.OooOoo0().getCurrentTopicUserId();
                oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
                Long l = (Long) oo0oO0.OooOOo0().getValue();
                if (l != null && currentTopicUserId == l.longValue()) {
                    Response response = (Response) this$0.OooOoo0().getTopicDetailLiveData().getValue();
                    TopicInfoModel topicInfoModel = response != null ? (TopicInfoModel) response.getData() : null;
                    if (topicInfoModel != null) {
                        Intrinsics.checkNotNull(str);
                        topicInfoModel.setImage(str);
                    }
                    Oooo000.OooO00o oooO00o = new Oooo000.OooO00o(this$0);
                    int iOooO00o = o0000O0.OooO00o(55);
                    oooO00o.f43127OooO0OO = OooO0OO.OooO0o0(OooO0OO.OooO0oo(iOooO00o, iOooO00o, str));
                    oooO00o.f43125OooO00o = 0;
                    oooO00o.OooO00o(o0O0O0Oo.OooO0oO());
                    oooO00o.OooO0o0(12);
                    oooO00o.OooO0Oo(this$0.OooOoOO().f45065OooO0oO.f44573OooO0o0);
                    Oooo000.OooO00o oooO00o2 = new Oooo000.OooO00o(this$0);
                    oooO00o2.f43127OooO0OO = OooO0OO.OooO00o(50, str);
                    oooO00o2.f43125OooO00o = 0;
                    int i3 = o0OOO0o.icon_topic_detail_bg;
                    oooO00o2.f43139OooOOOo = i3;
                    oooO00o2.f43129OooO0o = i3;
                    oooO00o2.OooO0Oo(this$0.OooOoOO().f45065OooO0oO.f44571OooO0Oo);
                }
                break;
            default:
                o00000OO this$1 = (o00000OO) obj2;
                GiftView giftView = (GiftView) obj;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                if (!Intrinsics.areEqual(this$1.f58880OooOOo0, giftView)) {
                    this$1.OooOOOo();
                } else {
                    this$1.OooOo0o(giftView, giftView.getF29934OooO0o0());
                }
                break;
        }
    }
}
