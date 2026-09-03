package p485o0o00O0;

import com.yalla.yalla.model.topic.TopicBlackUserModel;
import com.yalla.yalla.ui.activity.moment.TopicBlackListActivity;
import com.yalla.yalla.ui.vm.moment.TopicBlackListVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class ooo0Oo0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TopicBlackListActivity f48237OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ TopicBlackUserModel f48238OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ooo0Oo0(TopicBlackListActivity topicBlackListActivity, TopicBlackUserModel topicBlackUserModel) {
        super(0);
        this.f48237OooO0Oo = topicBlackListActivity;
        this.f48238OooO0o0 = topicBlackUserModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        int i = TopicBlackListActivity.f26275OooOo;
        TopicBlackListActivity topicBlackListActivity = this.f48237OooO0Oo;
        TopicBlackListVM topicBlackListVM = (TopicBlackListVM) topicBlackListActivity.f26278OooOo00.getValue();
        TopicBlackUserModel topicBlackUserModel = this.f48238OooO0o0;
        topicBlackListVM.blackUser(topicBlackUserModel.getUserId(), false).observe(topicBlackListActivity, new oO0Oo(topicBlackListActivity, topicBlackUserModel));
        return Unit.INSTANCE;
    }
}
