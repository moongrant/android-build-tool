package p538o0o0Oo0;

import android.content.Intent;
import com.code.android.util.ToastUtil;
import com.weieyu.yalla.R;
import com.yalla.yalla.model.TopicInfoModel;
import com.yalla.yalla.model.TopicVerifyState;
import com.yalla.yalla.ui.activity.moment.AddTopicListActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p254o00ooO0O.o000O0O0;

/* JADX INFO: loaded from: classes2.dex */
public final class oo0o0Oo extends Lambda implements Function1<TopicVerifyState, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ AddTopicListActivity f44107Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ TopicInfoModel f44108Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0o0Oo(AddTopicListActivity addTopicListActivity, TopicInfoModel topicInfoModel) {
        super(1);
        this.f44107Oooo0o = addTopicListActivity;
        this.f44108Oooo0oO = topicInfoModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(TopicVerifyState topicVerifyState) {
        TopicVerifyState topicVerifyState2 = topicVerifyState;
        Integer numValueOf = topicVerifyState2 != null ? Integer.valueOf(topicVerifyState2.getState()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            this.f44107Oooo0o.setResult(-1, new Intent().putExtra("Data", this.f44108Oooo0oO));
            this.f44107Oooo0o.finish();
        } else if (numValueOf != null && numValueOf.intValue() == 1) {
            ToastUtil.f12567OooO00o.OooO0O0(o000O0O0.OooO0OO(R.string.You_can_not_add_this_topic_to_your_posts_Please_contact_the_topic_host));
        } else if (numValueOf != null && numValueOf.intValue() == 2) {
            ToastUtil.f12567OooO00o.OooO0O0(o000O0O0.OooO0OO(R.string.Topic_Disband));
        }
        return Unit.INSTANCE;
    }
}
