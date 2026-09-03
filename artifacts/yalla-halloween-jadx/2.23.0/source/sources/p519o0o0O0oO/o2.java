package p519o0o0O0oO;

import android.os.Looper;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.code.android.util.o0000;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
import com.code.android.util.o000Oo0;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.model.VoteRankModel;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.ui.dialog.RoomVoteDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p406o0Oo0Ooo.oOO0O0O;
import p464o0Oooo.o000000O;
import p584o0oOooO0.oO00OOo0;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class o2 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ BaseQuickAdapter f52782OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ RoomVoteDialog f52783OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f52784OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(BaseQuickAdapter baseQuickAdapter, int i, RoomVoteDialog roomVoteDialog) {
        super(0);
        this.f52782OooO0Oo = baseQuickAdapter;
        this.f52784OooO0o0 = i;
        this.f52783OooO0o = roomVoteDialog;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Object obj = this.f52782OooO0Oo.f10111OooOOoo.get(this.f52784OooO0o0);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.yalla.yalla.model.VoteRankModel");
        VoteRankModel voteRankModel = (VoteRankModel) obj;
        long userId = voteRankModel.getUserId();
        o000000O o000000o2 = o000000O.f46674OooO00o;
        Long l = (Long) o000000O.OooOOo0().getValue();
        boolean z = true;
        if (l != null && userId == l.longValue()) {
            String strOooO0OO = o0000.OooO0OO(oO00OOo0.room_vote_game_can_not_vote_self);
            if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                z = false;
            }
            if (!z) {
                o000Oo0 o000oo0OooO00o = o000O00.OooO00o(strOooO0OO, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o.run();
                } else {
                    o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                }
            }
        } else {
            RoomVoteDialog roomVoteDialog = this.f52783OooO0o;
            if (roomVoteDialog.f52532OooO0Oo instanceof MixedRoomActivity) {
                o0OO000.OooO00o("102107");
                String strOooO0O0 = oOO0O0O.OooO0O0(voteRankModel.getUserId(), voteRankModel.getNickName());
                RoomUserInfoModel roomUserInfoModel = new RoomUserInfoModel();
                roomUserInfoModel.getUserId().setValue(Long.valueOf(voteRankModel.getUserId()));
                roomUserInfoModel.getUserName().setValue(strOooO0O0);
                roomUserInfoModel.getUserHeader().setValue(voteRankModel.getHeadImg());
                MixedRoomActivity mixedRoomActivity = (MixedRoomActivity) roomVoteDialog.f52532OooO0Oo;
                int giftId = voteRankModel.getGiftId();
                voteRankModel.getGiftUserType();
                mixedRoomActivity.OooOoOO(roomUserInfoModel, 1, giftId, false);
            }
        }
        return Unit.INSTANCE;
    }
}
