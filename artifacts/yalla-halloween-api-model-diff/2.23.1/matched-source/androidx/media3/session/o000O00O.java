package androidx.media3.session;

import android.app.Activity;
import android.util.Log;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.activity.moment.TopicBlackListActivity;
import com.yalla.yalla.ui.activity.user.FollowerActivity;
import com.yalla.yalla.ui.view.moment.MomentDetailCommentItemView;
import kotlin.jvm.internal.Intrinsics;
import p474o0OoooOO.oo0oO0;
import p569o0oOo0Oo.o0O0OO0;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o000O00O implements o000OoO.o00000.OooO00o, o0O0o0O.OooO0OO.OooO00o, o0O0OO0, o0oo00oO.o0000O0O.OooO00o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f9315OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f9316OooO0o0;

    public /* synthetic */ o000O00O(Object obj, int i) {
        this.f9315OooO0Oo = i;
        this.f9316OooO0o0 = obj;
    }

    @Override // o0O0o0O.OooO0OO.OooO00o
    public final void OooO00o(p302o0O0o0O.OooO0o oooO0o) {
        p287o0O0OOoO.o0ooOOo o0ooooo = (p287o0O0OOoO.o0ooOOo) this.f9316OooO0o0;
        o0ooooo.getClass();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics native component now available.", null);
        }
        o0ooooo.f41438OooO0O0.set((p287o0O0OOoO.oo000o) oooO0o.get());
    }

    @Override // o0oo00oO.o0000O0O.OooO00o
    public final void OooO0O0() {
        MomentDetailCommentItemView this$0 = (MomentDetailCommentItemView) this.f9316OooO0o0;
        int i = MomentDetailCommentItemView.f30545OooOOO;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.getItem().isHide()) {
            return;
        }
        p566o0oOo00O.o0000O0 onLogin = new p566o0oOo00O.o0000O0(this$0);
        Intrinsics.checkNotNullParameter(onLogin, "onLogin");
        oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
        if (Intrinsics.areEqual(oo0oO0.OooOo0O().getValue(), Boolean.TRUE)) {
            onLogin.invoke();
            return;
        }
        Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
        if (activityOooO0O0 != null) {
            int i2 = LoginActivity.f24734OooOo0O;
            LoginActivity.OooO00o.OooO00o(activityOooO0O0);
        }
    }

    @Override // p569o0oOo0Oo.o0O0OO0
    public final void OooO0Oo() {
        int i = this.f9315OooO0Oo;
        Object obj = this.f9316OooO0o0;
        switch (i) {
            case 2:
                TopicBlackListActivity this$0 = (TopicBlackListActivity) obj;
                int i2 = TopicBlackListActivity.f25828OooOo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooOoO0(false);
                break;
            default:
                FollowerActivity this$1 = (FollowerActivity) obj;
                int i3 = FollowerActivity.f26639OooOo0o;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.OooOo0O();
                break;
        }
    }

    @Override // o000OoO.o00000.OooO00o
    public final void invoke(Object obj) {
        ((o000O0Oo.OooO0OO) this.f9316OooO0o0).getClass();
        throw null;
    }
}
