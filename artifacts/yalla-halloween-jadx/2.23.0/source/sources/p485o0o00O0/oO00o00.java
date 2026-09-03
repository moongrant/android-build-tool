package p485o0o00O0;

import androidx.appcompat.widget.LinearLayoutCompat;
import com.code.android.util.o0000;
import com.code.android.util.o000OO00;
import com.yalla.yalla.model.topic.TopicGroupInfoModel;
import com.yalla.yalla.ui.activity.moment.TopicDetailActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class oO00o00 extends Lambda implements Function1<TopicGroupInfoModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TopicDetailActivity f48056OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO00o00(TopicDetailActivity topicDetailActivity) {
        super(1);
        this.f48056OooO0Oo = topicDetailActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(TopicGroupInfoModel topicGroupInfoModel) {
        TopicGroupInfoModel topicGroupInfoModel2 = topicGroupInfoModel;
        int type = topicGroupInfoModel2.getType();
        TopicDetailActivity topicDetailActivity = this.f48056OooO0Oo;
        if (type == 0) {
            int i = TopicDetailActivity.f26305OooOoOO;
            LinearLayoutCompat linearLayoutCompat = topicDetailActivity.OooOoOO().f57826OooO0oO.f58784OooO0OO;
            Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "binding.head.layoutFans");
            o000OO00.OooO0O0(linearLayoutCompat);
        } else if (type == 1) {
            int i2 = TopicDetailActivity.f26305OooOoOO;
            LinearLayoutCompat linearLayoutCompat2 = topicDetailActivity.OooOoOO().f57826OooO0oO.f58784OooO0OO;
            Intrinsics.checkNotNullExpressionValue(linearLayoutCompat2, "binding.head.layoutFans");
            o000OO00.OooOOOO(linearLayoutCompat2);
            topicDetailActivity.OooOoOO().f57826OooO0oO.f58789OooO0oo.setText(o0000.OooO0OO(oO00OOo0.topic_group_create));
        } else if (type == 2 && !topicGroupInfoModel2.getIsDisbanded()) {
            int i3 = TopicDetailActivity.f26305OooOoOO;
            LinearLayoutCompat linearLayoutCompat3 = topicDetailActivity.OooOoOO().f57826OooO0oO.f58784OooO0OO;
            Intrinsics.checkNotNullExpressionValue(linearLayoutCompat3, "binding.head.layoutFans");
            o000OO00.OooOOOO(linearLayoutCompat3);
            topicDetailActivity.OooOoOO().f57826OooO0oO.f58789OooO0oo.setText(o0000.OooO0OO(oO00OOo0.topic_group_join));
        }
        return Unit.INSTANCE;
    }
}
