package p601o0oo00Oo;

import com.code.android.util.ToastUtil;
import com.weieyu.yalla.R;
import com.yalla.yalla.model.TopicGroupInfoModel;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import o000O00O.OooO0OO;
import p254o00ooO0O.o000O0O0;
import p584o0oOoo.o000O;
import p594o0oOoooO.s5;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O0o00O extends Lambda implements Function1<TopicGroupInfoModel, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ long f48190Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ String f48191Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0o00O(long j, String str) {
        super(1);
        this.f48190Oooo0o = j;
        this.f48191Oooo0oO = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(TopicGroupInfoModel topicGroupInfoModel) {
        TopicGroupInfoModel topicGroupInfoModel2 = topicGroupInfoModel;
        if (topicGroupInfoModel2 != null) {
            long j = this.f48190Oooo0o;
            String str = this.f48191Oooo0oO;
            if (topicGroupInfoModel2.getIsDisbanded() || topicGroupInfoModel2.getCircleUserIsCancel()) {
                ToastUtil.f12567OooO00o.OooO0O0(o000O0O0.OooO0OO(R.string.topic_group_join_dissolved));
            } else {
                topicGroupInfoModel2.setLocalTopicId(j);
                topicGroupInfoModel2.setLocalTopicName(str);
                o000O.OooO00o(s5.f47537OooO00o, OooO0OO.OooO0O0(TuplesKt.to("DATA", topicGroupInfoModel2)));
            }
        }
        return Unit.INSTANCE;
    }
}
