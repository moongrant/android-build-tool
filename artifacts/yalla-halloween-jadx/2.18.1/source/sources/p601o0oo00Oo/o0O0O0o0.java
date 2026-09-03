package p601o0oo00Oo;

import android.app.Activity;
import android.view.View;
import com.umeng.analytics.pro.d;
import com.yalla.yalla.model.MomentDetailModel;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.activity.moment.PostDetailActivity;
import com.yalla.yalla.ui.adapter.postList.MomentAdapterTag;
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
public final class o0O0O0o0 extends o00Oo0 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailView f48182Oooo;

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ MomentDetailView f48183Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(MomentDetailView momentDetailView) {
            super(0);
            this.f48183Oooo0o = momentDetailView;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f48183Oooo0o.OooOo0();
            PostDetailActivity.OooO00o oooO00o = PostDetailActivity.f22417o0O0O00;
            Activity activity = this.f48183Oooo0o.getActivity();
            MomentDetailView momentDetailView = this.f48183Oooo0o;
            MomentDetailModel momentDetailModel = momentDetailView.f24941Oooo0oo;
            MomentAdapterTag momentAdapterTag = momentDetailView.f24938Oooo;
            PostDetailActivity.f22417o0O0O00.OooO00o(activity, momentDetailModel, (256 & 4) != 0 ? false : false, (256 & 8) != 0 ? 1 : -1, (256 & 16) != 0 ? null : null, (256 & 32) != 0 ? false : momentAdapterTag == MomentAdapterTag.TopicDetailFragmentPopular || momentAdapterTag == MomentAdapterTag.TopicDetailFragmentLatest, (256 & 64) != 0 ? null : momentAdapterTag, (256 & 128) != 0 ? false : true, (256 & 256) != 0 ? "" : null);
            return null;
        }
    }

    public o0O0O0o0(MomentDetailView momentDetailView) {
        this.f48182Oooo = momentDetailView;
    }

    @Override // p654o0ooo.o00Oo0
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        MomentDetailView momentDetailView = this.f48182Oooo;
        if (momentDetailView.f24952Ooooo00 || momentDetailView.f24938Oooo == MomentAdapterTag.MomentEditRecord) {
            return;
        }
        OooO00o onLogin = new OooO00o(momentDetailView);
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
