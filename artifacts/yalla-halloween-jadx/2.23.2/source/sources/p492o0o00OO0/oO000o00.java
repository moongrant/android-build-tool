package p492o0o00OO0;

import androidx.appcompat.widget.LinearLayoutCompat;
import com.code.android.util.o0000;
import com.code.android.util.o000O;
import com.yalla.yalla.model.topic.TopicGroupInfoModel;
import com.yalla.yalla.ui.activity.moment.TopicDetailActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class oO000o00 extends Lambda implements Function1<TopicGroupInfoModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TopicDetailActivity f49374OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO000o00(TopicDetailActivity topicDetailActivity) {
        super(1);
        this.f49374OooO0Oo = topicDetailActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(TopicGroupInfoModel topicGroupInfoModel) {
        TopicGroupInfoModel topicGroupInfoModel2 = topicGroupInfoModel;
        int type = topicGroupInfoModel2.getType();
        TopicDetailActivity topicDetailActivity = this.f49374OooO0Oo;
        if (type == 0) {
            int i = TopicDetailActivity.f25854OooOoOO;
            LinearLayoutCompat layoutFans = topicDetailActivity.OooOoOO().f45018OooO0oO.f45284OooO0OO;
            Intrinsics.checkNotNullExpressionValue(layoutFans, "layoutFans");
            o000O.OooO0O0(layoutFans);
        } else if (type == 1) {
            int i2 = TopicDetailActivity.f25854OooOoOO;
            LinearLayoutCompat layoutFans2 = topicDetailActivity.OooOoOO().f45018OooO0oO.f45284OooO0OO;
            Intrinsics.checkNotNullExpressionValue(layoutFans2, "layoutFans");
            o000O.OooOOOO(layoutFans2);
            topicDetailActivity.OooOoOO().f45018OooO0oO.f45289OooO0oo.setText(o0000.OooO0OO(o000000.topic_group_create));
        } else if (type == 2 && !topicGroupInfoModel2.getIsDisbanded()) {
            int i3 = TopicDetailActivity.f25854OooOoOO;
            LinearLayoutCompat layoutFans3 = topicDetailActivity.OooOoOO().f45018OooO0oO.f45284OooO0OO;
            Intrinsics.checkNotNullExpressionValue(layoutFans3, "layoutFans");
            o000O.OooOOOO(layoutFans3);
            topicDetailActivity.OooOoOO().f45018OooO0oO.f45289OooO0oo.setText(o0000.OooO0OO(o000000.topic_group_join));
        }
        return Unit.INSTANCE;
    }
}
