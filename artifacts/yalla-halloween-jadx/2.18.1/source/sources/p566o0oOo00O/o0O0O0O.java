package p566o0oOo00O;

import android.widget.LinearLayout;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOOO;
import com.yalla.yalla.model.ReportPublishModel;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p255o00ooO0o.oo0oOO0;
import p649o0ooOOoo.di;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O0O0O extends Lambda implements Function1<ReportPublishModel, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ UserInfoActivity f45302Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0O0O(UserInfoActivity userInfoActivity) {
        super(1);
        this.f45302Oooo0o = userInfoActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ReportPublishModel reportPublishModel) {
        ReportPublishModel reportPublishModel2 = reportPublishModel;
        if (reportPublishModel2 != null) {
            UserInfoActivity userInfoActivity = this.f45302Oooo0o;
            long circleId = reportPublishModel2.getCircleId();
            UserInfoActivity.OooO00o oooO00o = UserInfoActivity.f23452o0ooOO0;
            oo0oOO0 oo0ooo0 = new oo0oOO0(userInfoActivity);
            LinearLayout root = di.inflate(userInfoActivity.getLayoutInflater()).f49201OooO00o;
            Intrinsics.checkNotNullExpressionValue(root, "root");
            oo0ooo0.OooOo00(root);
            if (circleId > 0) {
                oo0ooo0.OooOOo0(OooOOO.OooO0OO(R.string.user_info_first_post_view_now));
                oo0ooo0.OooOo0o(new o0O0oo0o(userInfoActivity, circleId));
            }
            oo0ooo0.OooOOO0();
        }
        return Unit.INSTANCE;
    }
}
