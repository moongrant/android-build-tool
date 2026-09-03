package p496o0o00o;

import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.ui.activity.moment.TopicDetailActivity;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nUserInfoActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserInfoActivity.kt\ncom/yalla/yalla/ui/activity/user/UserInfoActivity$showMomentPostSuccess$1$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1768:1\n1#2:1769\n*E\n"})
public final class o0OOOO0o extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UserInfoActivity f49103OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ long f49104OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OOOO0o(UserInfoActivity userInfoActivity, long j) {
        super(0);
        this.f49103OooO0Oo = userInfoActivity;
        this.f49104OooO0o0 = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o0OO000.OooO00o("102020");
        int i = TopicDetailActivity.f26305OooOoOO;
        TopicInfoModel topicInfoModel = new TopicInfoModel();
        topicInfoModel.setId(this.f49104OooO0o0);
        Unit unit = Unit.INSTANCE;
        TopicDetailActivity.OooO00o.OooO00o(this.f49103OooO0Oo, topicInfoModel);
        return Unit.INSTANCE;
    }
}
