package p492o0o00OO0;

import com.yalla.yalla.data.db.table.UserInfo;
import com.yalla.yalla.ui.activity.moment.TopicInfoActivity;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nTopicInfoActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TopicInfoActivity.kt\ncom/yalla/yalla/ui/activity/moment/TopicInfoActivity$loadTopicManagers$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,233:1\n1#2:234\n*E\n"})
public final class oO0O0Oo0 extends Lambda implements Function1<List<UserInfo>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TopicInfoActivity f49437OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0O0Oo0(TopicInfoActivity topicInfoActivity) {
        super(1);
        this.f49437OooO0Oo = topicInfoActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(List<UserInfo> list) {
        List<UserInfo> list2 = list;
        if (list2 != null) {
            this.f49437OooO0Oo.f25922OooOo0o.addAll(list2);
        }
        return Unit.INSTANCE;
    }
}
