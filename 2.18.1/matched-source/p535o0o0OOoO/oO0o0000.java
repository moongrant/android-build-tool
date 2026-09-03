package p535o0o0OOoO;

import android.app.Activity;
import android.view.View;
import com.app.base.mixedroom.model.RoomGameConfig;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.umeng.analytics.pro.d;
import com.yalla.yalla.data.db.model.ApiErrorCodeDB;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.activity.main.PrivacyActivity;
import com.yalla.yalla.ui.dialog.RoomVoteDialog;
import com.yalla.yalla.ui.fragment.MainMomentsTopicFollowingFragment;
import com.yalla.yalla.ui.fragment.mainroom.MainRoomRecommendFragment;
import kotlin.jvm.internal.Intrinsics;
import o00OO0O0.o0OOO0o;
import p136o00OO0oO.OooO0OO;
import p186o00o00Oo.o0ooOOo;
import p254o00ooO0O.o00000O;
import p255o00ooO0o.oo0oOO0;
import p498o0o00Oo0.OooOOO;
import p530o0o0OOO.o00OO00O;
import p579o0oOoOOo.i0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class oO0o0000 implements OooO0OO.OooO0O0, BaseQuickAdapter.OooOOOO, o0ooOOo {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f43670OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f43671OooO0o0;

    public /* synthetic */ oO0o0000(Object obj, int i) {
        this.f43670OooO0Oo = i;
        this.f43671OooO0o0 = obj;
    }

    @Override // o00OO0oO.OooO0OO.OooO0O0
    public final void OooO00o(ApiErrorCodeDB apiErrorCodeDB) {
        PrivacyActivity this$0 = (PrivacyActivity) this.f43671OooO0o0;
        int i = PrivacyActivity.f22046Oooooo;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.isDestroyed() || this$0.isFinishing()) {
            return;
        }
        oo0oOO0 oo0ooo0 = new oo0oOO0(this$0);
        String messge = apiErrorCodeDB.getMessge();
        Intrinsics.checkNotNullExpressionValue(messge, "apiErrorCodeDB.messge");
        oo0ooo0.OooOo0O(messge);
        oo0ooo0.OooO0oO(false);
        oo0ooo0.OooOO0O(new oOo00o00(this$0));
        oo0ooo0.OooOOO0();
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOOOO
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        switch (this.f43670OooO0Oo) {
            case 1:
                RoomVoteDialog this$0 = (RoomVoteDialog) this.f43671OooO0o0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                RoomGameConfig.Vote value = o00OO00O.f43313OooooOo.OooO00o().f43362OoooOOO.getValue();
                boolean z = false;
                if (value != null && value.getStatus() == RoomVoteDialog.VoteStatus.Ended.getValue()) {
                    z = true;
                }
                if (!z) {
                    i0 onLogin = new i0(baseQuickAdapter, i, this$0);
                    Intrinsics.checkNotNullParameter(onLogin, "onLogin");
                    if (!Intrinsics.areEqual(OooOOO.f41216OooO00o.OooOooO().getValue(), Boolean.TRUE)) {
                        Activity activityOooO0O0 = o00000O.f34254OooO00o.OooO0O0();
                        if (activityOooO0O0 != null) {
                            LoginActivity.OooO00o oooO00o = LoginActivity.f21752OooooO0;
                            o0OOO0o.OooO0O0(activityOooO0O0, d.R, activityOooO0O0, LoginActivity.class);
                        }
                    } else {
                        onLogin.invoke();
                    }
                    break;
                }
                break;
            default:
                MainMomentsTopicFollowingFragment.m353initView$lambda5((MainMomentsTopicFollowingFragment) this.f43671OooO0o0, baseQuickAdapter, view, i);
                break;
        }
    }

    @Override // p186o00o00Oo.o0ooOOo
    public final void OooO0oO() {
        MainRoomRecommendFragment.m480initView$lambda2((MainRoomRecommendFragment) this.f43671OooO0o0);
    }
}
