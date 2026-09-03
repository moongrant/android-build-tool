package p538o0o0Oo0;

import androidx.lifecycle.Observer;
import com.code.android.util.ToastUtil;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOo;
import com.yalla.yalla.common.model.Response;
import com.yalla.yalla.model.TopicFollowChange;
import com.yalla.yalla.model.TopicInfoModel;
import com.yalla.yalla.ui.activity.moment.TopicDetailActivity;
import kotlin.jvm.internal.Intrinsics;
import p254o00ooO0O.o000O0O0;
import p391o0OOooOo.o0O00000;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0O0O0Oo implements Observer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ boolean f44009OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ TopicDetailActivity f44010OooO0O0;

    public /* synthetic */ o0O0O0Oo(boolean z, TopicDetailActivity topicDetailActivity) {
        this.f44009OooO00o = z;
        this.f44010OooO0O0 = topicDetailActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        String string;
        boolean z = this.f44009OooO00o;
        TopicDetailActivity this$0 = this.f44010OooO0O0;
        Response response = (Response) obj;
        TopicDetailActivity.OooO00o oooO00o = TopicDetailActivity.f22567o0OoOo0;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (response.getIsSuccess()) {
            if (z) {
                Integer num = (Integer) response.getData();
                if (num != null && (string = num.toString()) != null) {
                    ToastUtil.f12567OooO00o.OooO0O0(OooOo.OooO00o(o000O0O0.OooO0OO(R.string.follow_topic_success_tip), string));
                }
            } else {
                o0O00000.OooO0OO("Moments_topics_unfollow");
                ToastUtil.f12567OooO00o.OooO00o(R.string.topic_Unfollowed);
            }
            TopicInfoModel value = this$0.Oooo000().getTopicDetailLocal().getValue();
            if (value != null) {
                LiveEventBus.get("TOPIC_FOLLOW_CHANGE").post(new TopicFollowChange(value.getId(), z));
            }
        }
    }
}
