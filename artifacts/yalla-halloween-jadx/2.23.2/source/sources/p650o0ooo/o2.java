package p650o0ooo;

import android.os.Looper;
import androidx.activity.OooOo00;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.code.android.util.o0000;
import com.code.android.util.o000O00O;
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
import o0oo0000.OooO00o;
import p412o0Oo0o0O.o000O000;
import p475o0Ooooo0.o0O00oO0;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class o2 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ BaseQuickAdapter f58758OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ RoomVoteDialog f58759OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f58760OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(BaseQuickAdapter baseQuickAdapter, int i, RoomVoteDialog roomVoteDialog) {
        super(0);
        this.f58758OooO0Oo = baseQuickAdapter;
        this.f58760OooO0o0 = i;
        this.f58759OooO0o = roomVoteDialog;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Object obj = this.f58758OooO0Oo.f13189OooOOoo.get(this.f58760OooO0o0);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.yalla.yalla.model.VoteRankModel");
        VoteRankModel voteRankModel = (VoteRankModel) obj;
        long userId = voteRankModel.getUserId();
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        Long l = (Long) o0O00oO0.OooOOo0().getValue();
        boolean z = true;
        if (l != null && userId == l.longValue()) {
            String strOooO0OO = o0000.OooO0OO(o000000.room_vote_game_can_not_vote_self);
            if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                z = false;
            }
            if (!z) {
                o000Oo0 o000oo0OooO00o = OooOo00.OooO00o(strOooO0OO, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o.run();
                } else {
                    o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
                }
            }
        } else {
            RoomVoteDialog roomVoteDialog = this.f58759OooO0o;
            if (roomVoteDialog.f58507OooO0Oo instanceof MixedRoomActivity) {
                OooO00o.OooO0O0("102107");
                String strOooO0O0 = o000O000.OooO0O0(voteRankModel.getUserId(), voteRankModel.getNickName());
                RoomUserInfoModel roomUserInfoModel = new RoomUserInfoModel();
                roomUserInfoModel.getUserId().setValue(Long.valueOf(voteRankModel.getUserId()));
                roomUserInfoModel.getUserName().setValue(strOooO0O0);
                roomUserInfoModel.getUserHeader().setValue(voteRankModel.getHeadImg());
                MixedRoomActivity mixedRoomActivity = (MixedRoomActivity) roomVoteDialog.f58507OooO0Oo;
                int giftId = voteRankModel.getGiftId();
                voteRankModel.getGiftUserType();
                mixedRoomActivity.OooOoOO(roomUserInfoModel, 1, giftId, false);
            }
        }
        return Unit.INSTANCE;
    }
}
