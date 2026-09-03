package p502o0o00oOO;

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
import org.jetbrains.annotations.NotNull;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oOo00OO0;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class oO0O00O extends o0OOO0OO {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final NetImageView f49569OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final TextView f49570OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final ImageView f49571OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final View f49572OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final TextView f49573OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0O00O(@NotNull View view, @NotNull MixedRoomActivity activity) {
        super(view, activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(view, "view");
        View viewFindViewById = view.findViewById(oO00O0oO.nivHeader);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "view.findViewById(R.id.nivHeader)");
        this.f49569OooO0OO = (NetImageView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(oO00O0oO.tvContent);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "view.findViewById(R.id.tvContent)");
        this.f49570OooO0Oo = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(oO00O0oO.llWelcome);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "view.findViewById(R.id.llWelcome)");
        this.f49572OooO0o0 = viewFindViewById3;
        View viewFindViewById4 = view.findViewById(oO00O0oO.ivWelcome);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "view.findViewById(R.id.ivWelcome)");
        this.f49571OooO0o = (ImageView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(oO00O0oO.tvWelcome);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "view.findViewById(R.id.tvWelcome)");
        this.f49573OooO0oO = (TextView) viewFindViewById5;
    }

    public static void OooO0O0(ChatModel.BecomeMemberModel becomeMemberModel) {
        o0OO000.OooO00o("102288");
        RoomUserInfoModel roomUserInfoModel = new RoomUserInfoModel();
        roomUserInfoModel.getUserId().setValue(Long.valueOf(becomeMemberModel.getUserId()));
        roomUserInfoModel.getUserName().setValue(becomeMemberModel.getUserName());
        roomUserInfoModel.getUserHeader().setValue(becomeMemberModel.getHeadphoto());
        LiveEventBus.get("QUERY_USER_IN_ROOM_INFORMATION").post(roomUserInfoModel);
    }

    public final void OooO00o(boolean z) {
        TextView textView = this.f49573OooO0oO;
        ImageView imageView = this.f49571OooO0o;
        View view = this.f49572OooO0o0;
        if (z) {
            view.setBackgroundResource(oOo00OO0.shape_bg_room_become_member_welcomed);
            imageView.setImageResource(oOo00OO0.ic_room_become_member_welcomed);
            textView.setTextColor(o0000.OooO00o(oO00O0o.white_50));
        } else {
            view.setBackgroundResource(oOo00OO0.shape_bg_room_become_member_welcome);
            imageView.setImageResource(oOo00OO0.ic_room_become_member_welcome);
            textView.setTextColor(o0000.OooO00o(oO00O0o.color_EE7A36));
        }
    }
}
