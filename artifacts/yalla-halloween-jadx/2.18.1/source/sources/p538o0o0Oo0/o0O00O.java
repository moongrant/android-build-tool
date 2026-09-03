package p538o0o0Oo0;

import com.yalla.yalla.model.TopicBlackUserModel;
import com.yalla.yalla.ui.activity.moment.TopicBlackListActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p524o0o0O0oO.o0oOOo;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O00O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ TopicBlackListActivity f43997Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ TopicBlackUserModel f43998Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O00O(TopicBlackListActivity topicBlackListActivity, TopicBlackUserModel topicBlackUserModel) {
        super(0);
        this.f43997Oooo0o = topicBlackListActivity;
        this.f43998Oooo0oO = topicBlackUserModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        TopicBlackListActivity topicBlackListActivity = this.f43997Oooo0o;
        TopicBlackUserModel topicBlackUserModel = this.f43998Oooo0oO;
        int i = TopicBlackListActivity.f22539OooooOo;
        topicBlackListActivity.OooOooO().blackUser(topicBlackUserModel.getUserId(), false).observe(topicBlackListActivity, new o0oOOo(topicBlackListActivity, topicBlackUserModel, 1));
        return Unit.INSTANCE;
    }
}
