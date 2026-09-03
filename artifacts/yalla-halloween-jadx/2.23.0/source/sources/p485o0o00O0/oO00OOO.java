package p485o0o00O0;

import android.widget.TextView;
import com.code.android.util.o0000;
import com.yalla.yalla.model.topic.TopicGroupInfoModel;
import com.yalla.yalla.ui.activity.moment.TopicDetailActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
public final class oO00OOO extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TopicDetailActivity f48049OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO00OOO(TopicDetailActivity topicDetailActivity) {
        super(1);
        this.f48049OooO0Oo = topicDetailActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        boolean zAreEqual = Intrinsics.areEqual(bool, Boolean.TRUE);
        TopicDetailActivity topicDetailActivity = this.f48049OooO0Oo;
        if (zAreEqual) {
            int i = TopicDetailActivity.f26305OooOoOO;
            TextView textView = topicDetailActivity.OooOoOO().f57826OooO0oO.f58783OooO0O0;
            int i2 = oO00OOo0.Following;
            textView.setText(i2);
            topicDetailActivity.OooOoOO().f57826OooO0oO.f58783OooO0O0.setBackgroundResource(oOo00OO0.bg_25ffffff_r360);
            topicDetailActivity.OooOoOO().f57826OooO0oO.f58783OooO0O0.setTextColor(o0000.OooO00o(oO00O0o.color_FFFFFFF_65));
            TextView textView2 = topicDetailActivity.f26312OooOoO;
            if (textView2 != null) {
                textView2.setText(i2);
            }
            TextView textView3 = topicDetailActivity.f26312OooOoO;
            if (textView3 != null) {
                textView3.setBackgroundResource(oOo00OO0.bg_10a5abb7_r360);
            }
            TextView textView4 = topicDetailActivity.f26312OooOoO;
            if (textView4 != null) {
                textView4.setTextColor(o0000.OooO00o(oO00O0o.color_333333_25));
            }
            TopicGroupInfoModel value = topicDetailActivity.OooOoo().getTopicGroupInfoModel().getValue();
            if (value != null) {
                value.setFollowed(true);
            }
        } else {
            int i3 = TopicDetailActivity.f26305OooOoOO;
            TextView textView5 = topicDetailActivity.OooOoOO().f57826OooO0oO.f58783OooO0O0;
            int i4 = oO00OOo0.Follow;
            textView5.setText(i4);
            TextView textView6 = topicDetailActivity.OooOoOO().f57826OooO0oO.f58783OooO0O0;
            int i5 = oOo00OO0.bg_green_r360;
            textView6.setBackgroundResource(i5);
            TextView textView7 = topicDetailActivity.OooOoOO().f57826OooO0oO.f58783OooO0O0;
            int i6 = oO00O0o.color_FFFFFFF;
            textView7.setTextColor(o0000.OooO00o(i6));
            TextView textView8 = topicDetailActivity.f26312OooOoO;
            if (textView8 != null) {
                textView8.setText(i4);
            }
            TextView textView9 = topicDetailActivity.f26312OooOoO;
            if (textView9 != null) {
                textView9.setBackgroundResource(i5);
            }
            TextView textView10 = topicDetailActivity.f26312OooOoO;
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
