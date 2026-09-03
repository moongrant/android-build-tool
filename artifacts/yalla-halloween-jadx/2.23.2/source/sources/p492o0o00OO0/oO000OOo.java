package p492o0o00OO0;

import android.widget.TextView;
import com.code.android.util.o0000;
import com.yalla.yalla.model.topic.TopicGroupInfoModel;
import com.yalla.yalla.ui.activity.moment.TopicDetailActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p562o0oOo000.o000000;
import p562o0oOo000.o0OOO0o;
import p562o0oOo000.o0Oo0oo;

/* JADX INFO: loaded from: classes4.dex */
public final class oO000OOo extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TopicDetailActivity f49370OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO000OOo(TopicDetailActivity topicDetailActivity) {
        super(1);
        this.f49370OooO0Oo = topicDetailActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        boolean zAreEqual = Intrinsics.areEqual(bool, Boolean.TRUE);
        TopicDetailActivity topicDetailActivity = this.f49370OooO0Oo;
        if (zAreEqual) {
            int i = TopicDetailActivity.f25854OooOoOO;
            TextView textView = topicDetailActivity.OooOoOO().f45018OooO0oO.f45283OooO0O0;
            int i2 = o000000.Following;
            textView.setText(i2);
            topicDetailActivity.OooOoOO().f45018OooO0oO.f45283OooO0O0.setBackgroundResource(o0Oo0oo.bg_25ffffff_r360);
            topicDetailActivity.OooOoOO().f45018OooO0oO.f45283OooO0O0.setTextColor(o0000.OooO00o(o0OOO0o.color_FFFFFFF_65));
            TextView textView2 = topicDetailActivity.f25861OooOoO;
            if (textView2 != null) {
                textView2.setText(i2);
            }
            TextView textView3 = topicDetailActivity.f25861OooOoO;
            if (textView3 != null) {
                textView3.setBackgroundResource(o0Oo0oo.bg_10a5abb7_r360);
            }
            TextView textView4 = topicDetailActivity.f25861OooOoO;
            if (textView4 != null) {
                textView4.setTextColor(o0000.OooO00o(o0OOO0o.color_333333_25));
            }
            TopicGroupInfoModel value = topicDetailActivity.OooOoo().getTopicGroupInfoModel().getValue();
            if (value != null) {
                value.setFollowed(true);
            }
        } else {
            int i3 = TopicDetailActivity.f25854OooOoOO;
            TextView textView5 = topicDetailActivity.OooOoOO().f45018OooO0oO.f45283OooO0O0;
            int i4 = o000000.Follow;
            textView5.setText(i4);
            TextView textView6 = topicDetailActivity.OooOoOO().f45018OooO0oO.f45283OooO0O0;
            int i5 = o0Oo0oo.bg_green_r360;
            textView6.setBackgroundResource(i5);
            TextView textView7 = topicDetailActivity.OooOoOO().f45018OooO0oO.f45283OooO0O0;
            int i6 = o0OOO0o.color_FFFFFFF;
            textView7.setTextColor(o0000.OooO00o(i6));
            TextView textView8 = topicDetailActivity.f25861OooOoO;
            if (textView8 != null) {
                textView8.setText(i4);
            }
            TextView textView9 = topicDetailActivity.f25861OooOoO;
            if (textView9 != null) {
                textView9.setBackgroundResource(i5);
            }
            TextView textView10 = topicDetailActivity.f25861OooOoO;
            if (textView10 != null) {
                textView10.setTextColor(o0000.OooO00o(i6));
            }
            TopicGroupInfoModel value2 = topicDetailActivity.OooOoo().getTopicGroupInfoModel().getValue();
            if (value2 != null) {
                value2.setFollowed(false);
            }
        }
        return Unit.INSTANCE;
    }
}
