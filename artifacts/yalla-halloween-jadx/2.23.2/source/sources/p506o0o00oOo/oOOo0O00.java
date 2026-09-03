package p506o0o00oOo;

import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.ui.activity.moment.TopicDetailActivity;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import o0oo0000.OooO00o;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nUserInfoActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserInfoActivity.kt\ncom/yalla/yalla/ui/activity/user/UserInfoActivity$showMomentPostSuccess$1$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1768:1\n1#2:1769\n*E\n"})
public final class oOOo0O00 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UserInfoActivity f50545OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ long f50546OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOOo0O00(UserInfoActivity userInfoActivity, long j) {
        super(0);
        this.f50545OooO0Oo = userInfoActivity;
        this.f50546OooO0o0 = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        OooO00o.OooO0O0("102020");
        int i = TopicDetailActivity.f25854OooOoOO;
        TopicInfoModel topicInfoModel = new TopicInfoModel();
        topicInfoModel.setId(this.f50546OooO0o0);
        Unit unit = Unit.INSTANCE;
        TopicDetailActivity.OooO00o.OooO00o(this.f50545OooO0Oo, topicInfoModel);
        return Unit.INSTANCE;
    }
}
