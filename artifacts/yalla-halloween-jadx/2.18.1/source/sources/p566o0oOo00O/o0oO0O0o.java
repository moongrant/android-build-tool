package p566o0oOo00O;

import androidx.lifecycle.LiveData;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.model.ReportPublishModel;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import o0o0000.OooOo;
import p391o0OOooOo.o0O00000;

/* JADX INFO: loaded from: classes3.dex */
public final class o0oO0O0o extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ UserInfoActivity f45342Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0oO0O0o(UserInfoActivity userInfoActivity) {
        super(0);
        this.f45342Oooo0o = userInfoActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o0O00000.OooO0OO("Moments_post_registered");
        UserInfoActivity userInfoActivity = this.f45342Oooo0o;
        UserInfoActivity.OooO00o oooO00o = UserInfoActivity.f23452o0ooOO0;
        LiveData<ApiResult<ReportPublishModel>> liveDataReportPublish = userInfoActivity.Oooo0().reportPublish();
        UserInfoActivity userInfoActivity2 = this.f45342Oooo0o;
        liveDataReportPublish.observe(userInfoActivity2, new OooOo(new o0O0O0O(userInfoActivity2), null, null, false, 14));
        return Unit.INSTANCE;
    }
}
