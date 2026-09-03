package p544o0o0OoOO;

import android.view.View;
import android.widget.ImageView;
import com.chad.library.adapter.base.OooO00o;
import com.weieyu.yalla.R;
import com.yalla.yalla.model.RoomUserInfoModel;
import com.yalla.yalla.ui.activity.room.VoteGameCreateActivity;
import kotlin.jvm.internal.Intrinsics;
import p188o00o00o0.OooO0OO;
import p188o00o00o0.OooO0o;
import p616o0oo0Ooo.oO0O00;

/* JADX INFO: loaded from: classes2.dex */
public final class j7 extends OooO0OO<RoomUserInfoModel> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ VoteGameCreateActivity f44259OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j7(VoteGameCreateActivity voteGameCreateActivity) {
        super(voteGameCreateActivity, R.layout.room_item_vote_game);
        this.f44259OooO00o = voteGameCreateActivity;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(OooO00o oooO00o, Object obj) {
        OooO0o oooO0o = (OooO0o) oooO00o;
        final RoomUserInfoModel roomUserInfoModel = (RoomUserInfoModel) obj;
        if (oooO0o == null || roomUserInfoModel == null) {
            return;
        }
        if (roomUserInfoModel.getUserId() == 0) {
            ((ImageView) oooO0o.OooO0Oo(R.id.ivVoteUserAvatar)).setImageResource(R.drawable.room_vote_game_default_add);
        } else {
            oO0O00.OooO00o oooO00o2 = new oO0O00.OooO00o(getContext());
            oooO00o2.OooO00o(o00OOO.OooO00o.OooO0o0());
            oooO00o2.f48429OooO0OO = roomUserInfoModel.getUserHeader();
            oooO00o2.f48427OooO00o = 0;
            oooO00o2.OooO0o((ImageView) oooO0o.OooO0Oo(R.id.ivVoteUserAvatar));
        }
        oooO0o.OooO0oO(R.id.ivVoteDeleteSelect, roomUserInfoModel.getUserId() != 0);
        ImageView imageView = (ImageView) oooO0o.OooO0Oo(R.id.ivVoteDeleteSelect);
        final VoteGameCreateActivity voteGameCreateActivity = this.f44259OooO00o;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: o0o0OoOO.i7
            /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<com.yalla.yalla.model.RoomUserInfoModel>] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.util.ArrayList, java.util.List<com.yalla.yalla.model.RoomUserInfoModel>] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.util.ArrayList, java.util.List<com.yalla.yalla.model.RoomUserInfoModel>] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VoteGameCreateActivity this$0 = voteGameCreateActivity;
                RoomUserInfoModel roomUserInfoModel2 = roomUserInfoModel;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                int size = this$0.f23076Ooooo0o.size();
                for (int i = 0; i < size; i++) {
                    if (((RoomUserInfoModel) this$0.f23076Ooooo0o.get(i)).getUserId() == roomUserInfoModel2.getUserId()) {
                        this$0.f23076Ooooo0o.remove(i);
                        this$0.OooOooO();
                        return;
                    }
                }
            }
        });
    }
}
