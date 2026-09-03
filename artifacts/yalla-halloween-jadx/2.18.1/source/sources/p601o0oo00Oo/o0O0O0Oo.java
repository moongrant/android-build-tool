package p601o0oo00Oo;

import android.app.Activity;
import android.view.View;
import com.umeng.analytics.pro.d;
import com.yalla.yalla.model.MomentCommentModel;
import com.yalla.yalla.model.MomentDetailModel;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import com.yalla.yalla.ui.view.MomentDetailView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o00OO0O0.o0OOO0o;
import org.jetbrains.annotations.NotNull;
import p254o00ooO0O.o00000O;
import p498o0o00Oo0.OooOOO;
import p654o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O0O0Oo extends o00Oo0 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailView f48180Oooo;

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ MomentDetailView f48181Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(MomentDetailView momentDetailView) {
            super(0);
            this.f48181Oooo0o = momentDetailView;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            MomentCommentModel comment;
            UserInfoActivity.OooO00o oooO00o = UserInfoActivity.f23452o0ooOO0;
            Activity activity = this.f48181Oooo0o.getActivity();
            StringBuilder sb = new StringBuilder();
            MomentDetailModel momentDetailModel = this.f48181Oooo0o.f24941Oooo0oo;
            sb.append((momentDetailModel == null || (comment = momentDetailModel.getComment()) == null) ? null : Long.valueOf(comment.getComUserid()));
            sb.append("");
            UserInfoActivity.OooO00o.OooO0Oo(oooO00o, activity, sb.toString(), false, 12);
            return null;
        }
    }

    public o0O0O0Oo(MomentDetailView momentDetailView) {
        this.f48180Oooo = momentDetailView;
    }

    @Override // p654o0ooo.o00Oo0
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        OooO00o onLogin = new OooO00o(this.f48180Oooo);
        Intrinsics.checkNotNullParameter(onLogin, "onLogin");
        if (Intrinsics.areEqual(OooOOO.f41216OooO00o.OooOooO().getValue(), Boolean.TRUE)) {
            onLogin.invoke();
            return;
        }
        Activity activityOooO0O0 = o00000O.f34254OooO00o.OooO0O0();
        if (activityOooO0O0 != null) {
            LoginActivity.OooO00o oooO00o = LoginActivity.f21752OooooO0;
            o0OOO0o.OooO0O0(activityOooO0O0, d.R, activityOooO0O0, LoginActivity.class);
        }
    }
}
