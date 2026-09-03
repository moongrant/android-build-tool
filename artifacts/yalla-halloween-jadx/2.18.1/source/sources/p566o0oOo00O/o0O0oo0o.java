package p566o0oOo00O;

import com.yalla.yalla.model.TopicInfoModel;
import com.yalla.yalla.ui.activity.moment.TopicDetailActivity;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p391o0OOooOo.o0O00000;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O0oo0o extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ UserInfoActivity f45316Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ long f45317Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0oo0o(UserInfoActivity userInfoActivity, long j) {
        super(0);
        this.f45316Oooo0o = userInfoActivity;
        this.f45317Oooo0oO = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o0O00000.OooO0OO("Moments_post_registeredView");
        TopicDetailActivity.OooO00o oooO00o = TopicDetailActivity.f22567o0OoOo0;
        UserInfoActivity userInfoActivity = this.f45316Oooo0o;
        TopicInfoModel topicInfoModel = new TopicInfoModel();
        topicInfoModel.setId(this.f45317Oooo0oO);
        Unit unit = Unit.INSTANCE;
        oooO00o.OooO00o(userInfoActivity, topicInfoModel);
        return unit;
    }
}
