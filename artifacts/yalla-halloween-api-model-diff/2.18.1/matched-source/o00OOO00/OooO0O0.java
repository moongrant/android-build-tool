package o00OOO00;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import com.app.base.mixedroom.MixedRoomActivity;
import com.app.base.mixedroom.model.RoomGameConfig;
import com.app.base.model.RoomIndexModel;
import com.app.base.model.RoomModel;
import com.app.base.view.pullrefresh.XRefreshLayout;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.umeng.analytics.pro.d;
import com.yalla.yalla.common.event.webEvent.EnterRoomParentPage;
import com.yalla.yalla.common.manager.RoomStateManager;
import com.yalla.yalla.common.ui.fragment.GiftSendFragment;
import com.yalla.yalla.model.GiftPropModel;
import com.yalla.yalla.model.GiftPropTypeShow;
import com.yalla.yalla.model.PostCommentDetailModel;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.activity.room.VoteGameCreateActivity;
import com.yalla.yalla.ui.activity.user.UserRoomsActivity;
import com.yalla.yalla.ui.dialog.RoomGameBoxDialog;
import com.yalla.yalla.ui.dialog.RoomVoteDialog;
import com.yalla.yalla.ui.fragment.RoomMemberConveneListDialog;
import com.yalla.yalla.ui.view.MomentDetailText;
import java.util.Calendar;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o00OO0O0.o0OOO0o;
import p034OoooO0O.o0Oo0oo;
import p159o00OoOO.o000O00O;
import p168o00Ooo0.o0O0O00;
import p174o00OooOO.o0O00OOO;
import p254o00ooO0O.o00000O;
import p391o0OOooOo.o0O00000;
import p498o0o00Oo0.OooOOO;
import p515o0o0O00.o00O00;
import p530o0o0OOO.o00OO00O;
import p558o0oOOoo.o00O0O0;
import p558o0oOOoo.o00O0OO0;
import p579o0oOoOOo.O0000000;
import p579o0oOoOOo.oOOO00Oo;
import p606o0oo0O.OooOo;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class OooO0O0 implements BaseQuickAdapter.OooOo00, o0O00OOO.OooO00o, BaseQuickAdapter.OooOOOO, XRefreshLayout.OooO0OO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f31669OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f31670OooO0o0;

    public /* synthetic */ OooO0O0(Object obj, int i) {
        this.f31669OooO0Oo = i;
        this.f31670OooO0o0 = obj;
    }

    @Override // o00OooOO.o0O00OOO.OooO00o
    public final void OooO00o() {
        switch (this.f31669OooO0Oo) {
            case 2:
                o00O00.OooO("onTextClicked setViewData 动态详情 postCommentDetailModel = " + ((PostCommentDetailModel) this.f31670OooO0o0));
                break;
            default:
                MomentDetailText this$0 = (MomentDetailText) this.f31670OooO0o0;
                int i = MomentDetailText.f24912OoooO00;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Function0<Unit> function0 = this$0.f24916Oooo0oo;
                if (function0 != null) {
                    function0.invoke();
                }
                break;
        }
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOo00
    public final boolean OooO0O0(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        GiftSendFragment this$0 = (GiftSendFragment) this.f31670OooO0o0;
        int i2 = com.yalla.yalla.common.ui.fragment.OooO0OO.f20913OooO0O0;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Object obj = baseQuickAdapter.getData().get(i);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.yalla.yalla.model.GiftPropModel");
        GiftPropModel giftPropModel = (GiftPropModel) obj;
        if (this$0.showIn != GiftPropTypeShow.InRoom && (giftPropModel.isAllSiteGift() || giftPropModel.getIsSoundEffect())) {
            return false;
        }
        LiveEventBus.get("OnLongClickShowIntroducingTagGiftWindow").post(view);
        return true;
    }

    @Override // com.app.base.view.pullrefresh.XRefreshLayout.OooO0OO
    public final void OooO0OO() {
        RoomMemberConveneListDialog this$0 = (RoomMemberConveneListDialog) this.f31670OooO0o0;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.OooOOO().f49175OooO0oO.OooO0OO();
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOOOO
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        switch (this.f31669OooO0Oo) {
            case 3:
                UserRoomsActivity this$0 = (UserRoomsActivity) this.f31670OooO0o0;
                UserRoomsActivity.OooO00o oooO00o = UserRoomsActivity.f23561Oooooo0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                o00OO0.OooOO0O<RoomIndexModel> oooOO0O = this$0.f23565OooooO0;
                Intrinsics.checkNotNull(oooOO0O);
                RoomIndexModel roomIndexModel = oooOO0O.getData().get(i);
                if (roomIndexModel != null) {
                    RoomModel roomModel = new RoomModel();
                    roomModel.setId(o0O0O00.OooOOO0(roomIndexModel.barid));
                    roomModel.setName(roomIndexModel.barname);
                    roomModel.setBaridx(roomIndexModel.baridx);
                    roomModel.setImage(roomIndexModel.barimage);
                    roomModel.setRoomIp(roomIndexModel.roomserverip);
                    roomModel.setHeatDay(roomIndexModel.heatday);
                    roomModel.setLevel(roomIndexModel.barlevel);
                    roomModel.setKinds(o0O0O00.OooOO0o(roomIndexModel.variety));
                    roomModel.setIsencrypt(roomIndexModel.isencrypt);
                    if (roomModel.getKinds() == 0 || roomModel.getKinds() == 1) {
                        RoomStateManager.INSTANCE.enterRoom(roomModel, EnterRoomParentPage.Me_profile_room);
                    }
                    break;
                }
                break;
            default:
                RoomGameBoxDialog this$1 = (RoomGameBoxDialog) this.f31670OooO0o0;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                Object obj = baseQuickAdapter.getData().get(i);
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.yalla.yalla.ui.dialog.RoomGameBoxDialog.GameType");
                switch (RoomGameBoxDialog.OooO00o.$EnumSwitchMapping$0[((RoomGameBoxDialog.GameType) obj).ordinal()]) {
                    case 1:
                        o0O00000.OooO0OO("InRoom_game_roshambo");
                        OooOo.OooO0O0("102026");
                        new O0000000(this$1.f23746OooO0oO, true).OooOO0();
                        this$1.OooO0Oo();
                        break;
                    case 2:
                        long timeInMillis = Calendar.getInstance().getTimeInMillis();
                        if (timeInMillis - this$1.f23753OooOOOO > 1000) {
                            this$1.f23753OooOOOO = timeInMillis;
                            if (o000O00O.OooO().f32427Oooo != null) {
                                o0O00000.OooO0OO("InRoom_luckyBag");
                                OooOo.OooO0O0("102027");
                                new oOOO00Oo(this$1.f23746OooO0oO).OooOO0();
                            }
                        }
                        this$1.OooO0Oo();
                        break;
                    case 3:
                        o0O00000.OooO0OO("InRoom_game_wheel");
                        OooOo.OooO0O0("102028");
                        LiveEventBus.get("OPEN_TURNTABKE_GAME").post(Boolean.TRUE);
                        this$1.OooO0Oo();
                        break;
                    case 4:
                        o0O00000.OooO0OO("InRoom_game_poll");
                        OooOo.OooO0O0("102029");
                        RoomGameConfig.Vote value = o00OO00O.f43313OooooOo.OooO00o().f43362OoooOOO.getValue();
                        if (value != null && value.getStatus() == RoomVoteDialog.VoteStatus.Running.getValue()) {
                            LiveEventBus.get("PARTICIPATE_IN_THE_GAME").post(null);
                        } else {
                            VoteGameCreateActivity.OooO00o oooO00o2 = VoteGameCreateActivity.f23073OooooOo;
                            MixedRoomActivity context = this$1.f23746OooO0oO;
                            Intrinsics.checkNotNullParameter(context, "context");
                            context.startActivity(new Intent(context, (Class<?>) VoteGameCreateActivity.class));
                        }
                        this$1.OooO0Oo();
                        break;
                    case 5:
                        Long value2 = o00OO00O.f43313OooooOo.OooO00o().OooO0oo().getValue();
                        OooOo.OooO0OO("102030", MapsKt.hashMapOf(new Pair("lucknum", Integer.valueOf((value2 != null && value2.longValue() == -1) ? 0 : 1))));
                        if (this$1.f23747OooO0oo != null) {
                            o0O00000.OooO0OO("InRoom_game_luckynumber");
                            o0Oo0oo.OooO0o0(113, null);
                        }
                        this$1.OooO0Oo();
                        break;
                    case 6:
                        OooOo.OooO0O0("102032");
                        o00O0OO0 o00o0oo1 = this$1.f23746OooO0oO.f11784o0000Ooo.f44359OooO0Oo;
                        if (o00o0oo1 != null) {
                            o0O00000.OooO0OO("InRoom_Sidebar_camel");
                            o00O0O0 onLogin = new o00O0O0(o00o0oo1);
                            Intrinsics.checkNotNullParameter(onLogin, "onLogin");
                            if (Intrinsics.areEqual(OooOOO.f41216OooO00o.OooOooO().getValue(), Boolean.TRUE)) {
                                onLogin.invoke();
                            } else {
                                Activity activityOooO0O0 = o00000O.f34254OooO00o.OooO0O0();
                                if (activityOooO0O0 != null) {
                                    LoginActivity.OooO00o oooO00o3 = LoginActivity.f21752OooooO0;
                                    o0OOO0o.OooO0O0(activityOooO0O0, d.R, activityOooO0O0, LoginActivity.class);
                                }
                            }
                        }
                        this$1.OooO0Oo();
                        break;
                }
                break;
        }
    }
}
