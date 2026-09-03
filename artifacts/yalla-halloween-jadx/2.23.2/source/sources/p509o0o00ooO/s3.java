package p509o0o00ooO;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o0000;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.model.chat.ChatModel;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import kotlin.jvm.internal.Intrinsics;
import o0oo0000.OooO00o;
import org.jetbrains.annotations.NotNull;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.o0OOO0o;
import p562o0oOo000.o0Oo0oo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class s3 extends q1 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final NetImageView f50800OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final TextView f50801OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final ImageView f50802OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final View f50803OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final TextView f50804OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3(@NotNull View view, @NotNull MixedRoomActivity activity) {
        super(view, activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(view, "view");
        View viewFindViewById = view.findViewById(o0OO00O.nivHeader);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f50800OooO0OO = (NetImageView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(o0OO00O.tvContent);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f50801OooO0Oo = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(o0OO00O.llWelcome);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f50803OooO0o0 = viewFindViewById3;
        View viewFindViewById4 = view.findViewById(o0OO00O.ivWelcome);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.f50802OooO0o = (ImageView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(o0OO00O.tvWelcome);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f50804OooO0oO = (TextView) viewFindViewById5;
    }

    public static void OooO0O0(ChatModel.BecomeMemberModel becomeMemberModel) {
        OooO00o.OooO0O0("102288");
        RoomUserInfoModel roomUserInfoModel = new RoomUserInfoModel();
        roomUserInfoModel.getUserId().setValue(Long.valueOf(becomeMemberModel.getUserId()));
        roomUserInfoModel.getUserName().setValue(becomeMemberModel.getUserName());
        roomUserInfoModel.getUserHeader().setValue(becomeMemberModel.getHeadphoto());
        LiveEventBus.get("QUERY_USER_IN_ROOM_INFORMATION").post(roomUserInfoModel);
    }

    public final void OooO00o(boolean z) {
        TextView textView = this.f50804OooO0oO;
        ImageView imageView = this.f50802OooO0o;
        View view = this.f50803OooO0o0;
        if (z) {
            view.setBackgroundResource(o0Oo0oo.shape_bg_room_become_member_welcomed);
            imageView.setImageResource(o0Oo0oo.ic_room_become_member_welcomed);
            textView.setTextColor(o0000.OooO00o(o0OOO0o.white_50));
        } else {
            view.setBackgroundResource(o0Oo0oo.shape_bg_room_become_member_welcome);
            imageView.setImageResource(o0Oo0oo.ic_room_become_member_welcome);
            textView.setTextColor(o0000.OooO00o(o0OOO0o.color_EE7A36));
        }
    }
}
