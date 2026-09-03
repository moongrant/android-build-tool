package com.yalla.yalla.ui.fragment.moment;

import android.app.Activity;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.yalla.yalla.model.moment.MomentGift;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p029Oooo0oo.oo0ooO;
import p466o0Oooo0o.oo00o;

/* JADX INFO: loaded from: classes4.dex */
public final class o00000OO extends oo00o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ MomentDetailGiftFragment f28832OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ MomentGift f28833OooO0oo;

    @SourceDebugExtension({"SMAP\nMomentDetailGiftFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentDetailGiftFragment.kt\ncom/yalla/yalla/ui/fragment/moment/MomentDetailGiftFragment$baseAdapter$2$1$convert$1$onNoDoubleClick$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,339:1\n1#2:340\n*E\n"})
    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentDetailGiftFragment f28834OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentGift f28835OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(MomentDetailGiftFragment momentDetailGiftFragment, MomentGift momentGift) {
            super(0);
            this.f28834OooO0Oo = momentDetailGiftFragment;
            this.f28835OooO0o0 = momentGift;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            FragmentActivity activity = this.f28834OooO0Oo.getActivity();
            if (activity != null) {
                UserInfoActivity.OooO00o.OooO0OO(UserInfoActivity.f27240Oooo0o, activity, oo0ooO.OooO00o(this.f28835OooO0o0.getUserId()), false, 12);
            }
            return Unit.INSTANCE;
        }
    }

    public o00000OO(MomentDetailGiftFragment momentDetailGiftFragment, MomentGift momentGift) {
        this.f28832OooO0oO = momentDetailGiftFragment;
        this.f28833OooO0oo = momentGift;
    }

    @Override // p466o0Oooo0o.oo00o
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        OooO00o onLogin = new OooO00o(this.f28832OooO0oO, this.f28833OooO0oo);
        Intrinsics.checkNotNullParameter(onLogin, "onLogin");
        p464o0Oooo.o000000O o000000o2 = p464o0Oooo.o000000O.f46674OooO00o;
        if (Intrinsics.areEqual(p464o0Oooo.o000000O.OooOo0O().getValue(), Boolean.TRUE)) {
            onLogin.invoke();
            return;
        }
        Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
        if (activityOooO0O0 != null) {
            int i = LoginActivity.f25186OooOo0O;
            LoginActivity.OooO00o.OooO00o(activityOooO0O0);
        }
    }
}
