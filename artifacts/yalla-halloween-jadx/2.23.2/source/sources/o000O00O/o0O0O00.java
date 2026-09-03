package o000O00O;

import android.app.Activity;
import android.view.View;
import androidx.media3.common.Player;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.yalla.yalla.mixedroom.model.RoomGameConfig;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.dialog.RoomVoteDialog;
import kotlin.jvm.internal.Intrinsics;
import p475o0Ooooo0.o0O00oO0;
import p650o0ooo.o2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0O0O00 implements o000OoO.o00000O0.OooO00o, BaseQuickAdapter.OooO0o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f34140OooO0Oo;

    public /* synthetic */ o0O0O00(Object obj) {
        this.f34140OooO0Oo = obj;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        RoomVoteDialog this$0 = (RoomVoteDialog) this.f34140OooO0Oo;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        RoomGameConfig.Vote value = com.yalla.yalla.service.room.OooO0O0.f24533OoooOOO.OooO00o().f24575Oooo0oO.getValue();
        if (value != null && value.getStatus() == RoomVoteDialog.VoteStatus.Ended.getValue()) {
            return;
        }
        o2 onLogin = new o2(baseQuickAdapter, i, this$0);
        Intrinsics.checkNotNullParameter(onLogin, "onLogin");
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        if (Intrinsics.areEqual(o0O00oO0.OooOo0O().getValue(), Boolean.TRUE)) {
            onLogin.invoke();
            return;
        }
        Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
        if (activityOooO0O0 != null) {
            int i2 = LoginActivity.f24727OooOo0O;
            LoginActivity.OooO00o.OooO00o(activityOooO0O0);
        }
    }

    @Override // o000OoO.o00000O0.OooO00o
    public final void invoke(Object obj) {
        ((Player.OooO0OO) obj).onPlaybackStateChanged(((o00O0OO) this.f34140OooO0Oo).f34110OooO0o0);
    }
}
