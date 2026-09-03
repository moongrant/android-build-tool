package p506o0o00oOo;

import android.widget.LinearLayout;
import com.code.android.util.o0000;
import com.yalla.yalla.model.ReportPublishModel;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p205o00o0o0o.o000O;
import p405o0Oo0OOO.i2;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nUserInfoActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserInfoActivity.kt\ncom/yalla/yalla/ui/activity/user/UserInfoActivity$showMomentPostDialog$2$2$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1768:1\n1#2:1769\n*E\n"})
public final class oOOOOo0O extends Lambda implements Function1<ReportPublishModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UserInfoActivity f50542OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOOOOo0O(UserInfoActivity userInfoActivity) {
        super(1);
        this.f50542OooO0Oo = userInfoActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ReportPublishModel reportPublishModel) {
        ReportPublishModel reportPublishModel2 = reportPublishModel;
        if (reportPublishModel2 != null) {
            long circleId = reportPublishModel2.getCircleId();
            UserInfoActivity.OooO00o oooO00o = UserInfoActivity.f26775Oooo0o;
            UserInfoActivity userInfoActivity = this.f50542OooO0Oo;
            userInfoActivity.getClass();
            o000O o000o = new o000O(userInfoActivity);
            LinearLayout linearLayout = i2.inflate(userInfoActivity.getLayoutInflater()).f43957OooO00o;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "getRoot(...)");
            o000o.OooOOo(linearLayout);
            if (circleId > 0) {
                o000o.OooOOOo(o0000.OooO0OO(o000000.user_info_first_post_view_now));
                o000o.OooOo0(new oOOo0O00(userInfoActivity, circleId));
            }
            o000o.OooOO0o();
        }
        return Unit.INSTANCE;
    }
}
