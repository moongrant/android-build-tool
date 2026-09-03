package p579o0oOoOOo;

import com.app.base.mixedroom.MixedRoomActivity;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.code.android.util.ToastUtil;
import com.weieyu.yalla.R;
import com.yalla.yalla.model.RoomUserInfoModel;
import com.yalla.yalla.model.VoteRankModel;
import com.yalla.yalla.ui.dialog.RoomVoteDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p254o00ooO0O.o000O0O0;
import p391o0OOooOo.o0O00000;
import p498o0o00Oo0.OooOOO;
import p520o0o0O0O0.o00O0O;

/* JADX INFO: loaded from: classes3.dex */
public final class i0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ BaseQuickAdapter f45961Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ int f45962Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ RoomVoteDialog f45963Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(BaseQuickAdapter baseQuickAdapter, int i, RoomVoteDialog roomVoteDialog) {
        super(0);
        this.f45961Oooo0o = baseQuickAdapter;
        this.f45962Oooo0oO = i;
        this.f45963Oooo0oo = roomVoteDialog;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Object obj = this.f45961Oooo0o.getData().get(this.f45962Oooo0oO);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.yalla.yalla.model.VoteRankModel");
        VoteRankModel voteRankModel = (VoteRankModel) obj;
        long userId = voteRankModel.getUserId();
        Long value = OooOOO.f41216OooO00o.OooOo().getValue();
        if (value != null && userId == value.longValue()) {
            ToastUtil.f12567OooO00o.OooO0O0(o000O0O0.OooO0OO(R.string.room_vote_game_can_not_vote_self));
        } else if (this.f45963Oooo0oo.f41543Oooo0o instanceof MixedRoomActivity) {
            o0O00000.OooO0OO("InRoom_poll_poll");
            String strOooO0O0 = o00O0O.f42677OooO00o.OooO0O0(voteRankModel.getUserId(), voteRankModel.getNickName());
            RoomUserInfoModel roomUserInfoModel = new RoomUserInfoModel();
            roomUserInfoModel.setUserId(voteRankModel.getUserId());
            roomUserInfoModel.setUserName(strOooO0O0);
            roomUserInfoModel.setUserHeader(voteRankModel.getHeadImg());
            ((MixedRoomActivity) this.f45963Oooo0oo.f41543Oooo0o).Oooo0OO(roomUserInfoModel, 1, voteRankModel.getGiftId(), voteRankModel.getGiftUserType());
        }
        return Unit.INSTANCE;
    }
}
