package com.facebook.appevents.ml;

import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.facebook.appevents.internal.FileDownloadTask;
import com.geetest.captcha.GTCaptcha4Client;
import com.twitter.sdk.android.tweetcomposer.internal.util.ObservableScrollView;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.manager.GeetCodeManager;
import com.yalla.yalla.model.RoomUserInfoModel;
import com.yalla.yalla.ui.activity.message.YallaTeamMessageActivity;
import com.yalla.yalla.ui.activity.moment.TopicBlackListActivity;
import com.yalla.yalla.ui.activity.room.VoteGameCreateActivity;
import com.yalla.yalla.ui.fragment.GuessListFragment;
import com.yalla.yalla.ui.fragment.RoomMemberConveneListDialog;
import com.yalla.yalla.ui.fragment.mainroom.MainRoomMineFollowingFragment;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p187o00o00Oo.o0ooOOo;
import p255o00ooO0O.o000O0O0;
import p546o0o0OoOO.j7;
import p565o0oOo0.o00O0O0O;
import p581o0oOoOOo.i;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO implements FileDownloadTask.Callback, ObservableScrollView.OooO00o, GTCaptcha4Client.OnFailureListener, BaseQuickAdapter.OooOOOO, o0ooOOo {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f12772Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f12773OoooO00;

    public /* synthetic */ OooO(Object obj, int i) {
        this.f12772Oooo = i;
        this.f12773OoooO00 = obj;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOOOO
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        switch (this.f12772Oooo) {
            case 3:
                YallaTeamMessageActivity this$0 = (YallaTeamMessageActivity) this.f12773OoooO00;
                YallaTeamMessageActivity.OooO00o oooO00o = YallaTeamMessageActivity.f22270ooOO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                o00O0O0O o00o0o0o2 = this$0.f22276OoooooO;
                if (o00o0o0o2 != null) {
                    o00o0o0o2.f45102OooO00o = i;
                }
                if (o00o0o0o2 != null) {
                    o00o0o0o2.notifyDataSetChanged();
                }
                break;
            case 4:
            default:
                GuessListFragment.m333onLazyInit$lambda0((GuessListFragment) this.f12773OoooO00, baseQuickAdapter, view, i);
                break;
            case 5:
                VoteGameCreateActivity this$1 = (VoteGameCreateActivity) this.f12773OoooO00;
                VoteGameCreateActivity.OooO00o oooO00o2 = VoteGameCreateActivity.f23092OoooooO;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                Object obj = baseQuickAdapter.getData().get(i);
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.yalla.yalla.model.RoomUserInfoModel");
                if (((RoomUserInfoModel) obj).getUserId() == 0) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.addAll(this$1.f23095OooooOo);
                    i iVar = new i(arrayList, new j7(this$1));
                    FragmentManager supportFragmentManager = this$1.getSupportFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
                    iVar.show(supportFragmentManager, o000O0O0.OooO0OO(R.string.Online_Users));
                    break;
                }
                break;
        }
    }

    @Override // p187o00o00Oo.o0ooOOo
    public final void OooO0oO() {
        switch (this.f12772Oooo) {
            case 4:
                TopicBlackListActivity this$0 = (TopicBlackListActivity) this.f12773OoooO00;
                int i = TopicBlackListActivity.f22558OoooooO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooOooo(false);
                break;
            case 7:
                RoomMemberConveneListDialog this$1 = (RoomMemberConveneListDialog) this.f12773OoooO00;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                if (!(!StringsKt.isBlank(this$1.f24184Ooooo0o))) {
                    this$1.OooOOOo(true);
                } else {
                    this$1.OooOOo(this$1.f24184Ooooo0o, true);
                }
                break;
            default:
                MainRoomMineFollowingFragment.m458initView$lambda2((MainRoomMineFollowingFragment) this.f12773OoooO00);
                break;
        }
    }

    @Override // com.facebook.appevents.internal.FileDownloadTask.Callback
    public final void onComplete(File file) {
        ModelManager.TaskHandler.Companion.m153execute$lambda1((List) this.f12773OoooO00, file);
    }

    @Override // com.geetest.captcha.GTCaptcha4Client.OnFailureListener
    public final void onFailure(String str) {
        GeetCodeManager.m254call$lambda1((Function0) this.f12773OoooO00, str);
    }
}
