package p496o0o00o;

import android.widget.LinearLayout;
import com.code.android.util.o0000;
import com.yalla.yalla.model.ReportPublishModel;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p157o00OoOO0.o0OO00O;
import p584o0oOooO0.oO00OOo0;
import p641o0ooOOOO.ta;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nUserInfoActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserInfoActivity.kt\ncom/yalla/yalla/ui/activity/user/UserInfoActivity$showMomentPostDialog$2$2$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1768:1\n1#2:1769\n*E\n"})
public final class o0OOO0OO extends Lambda implements Function1<ReportPublishModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UserInfoActivity f49101OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OOO0OO(UserInfoActivity userInfoActivity) {
        super(1);
        this.f49101OooO0Oo = userInfoActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ReportPublishModel reportPublishModel) {
        ReportPublishModel reportPublishModel2 = reportPublishModel;
        if (reportPublishModel2 != null) {
            long circleId = reportPublishModel2.getCircleId();
            UserInfoActivity.OooO00o oooO00o = UserInfoActivity.f27240Oooo0o;
            UserInfoActivity userInfoActivity = this.f49101OooO0Oo;
            userInfoActivity.getClass();
            o0OO00O o0oo00o2 = new o0OO00O(userInfoActivity);
            LinearLayout root = ta.inflate(userInfoActivity.getLayoutInflater()).f58894OooO00o;
            Intrinsics.checkNotNullExpressionValue(root, "root");
            o0oo00o2.OooOOo(root);
            if (circleId > 0) {
                o0oo00o2.OooOOOo(o0000.OooO0OO(oO00OOo0.user_info_first_post_view_now));
                o0oo00o2.OooOo0(new o0OOOO0o(userInfoActivity, circleId));
            }
            o0oo00o2.OooOO0o();
        }
        return Unit.INSTANCE;
    }
}
