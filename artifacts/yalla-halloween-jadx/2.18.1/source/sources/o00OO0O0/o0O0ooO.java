package o00OO0O0;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import com.app.base.model.ChatModel;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.weieyu.yalla.R;
import com.yalla.yalla.model.RoomUserInfoModel;
import com.yalla.yalla.util.netimage.NetImageView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class o0O0ooO extends OooOOO0 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final NetImageView f31581OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final TextView f31582OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final ImageView f31583OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final View f31584OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final TextView f31585OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0ooO(@NotNull FragmentActivity activity, @NotNull View view) {
        super(activity, view);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(view, "view");
        View viewFindViewById = view.findViewById(R.id.nivHeader);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "view.findViewById(R.id.nivHeader)");
        this.f31581OooO0OO = (NetImageView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.tvContent);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "view.findViewById(R.id.tvContent)");
        this.f31582OooO0Oo = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.llWelcome);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "view.findViewById(R.id.llWelcome)");
        this.f31584OooO0o0 = viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.ivWelcome);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "view.findViewById(R.id.ivWelcome)");
        this.f31583OooO0o = (ImageView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.tvWelcome);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "view.findViewById(R.id.tvWelcome)");
        this.f31585OooO0oO = (TextView) viewFindViewById5;
    }

    public final void OooO00o(boolean z) {
        if (z) {
            this.f31584OooO0o0.setBackgroundResource(R.drawable.shape_bg_room_become_member_welcomed);
            this.f31583OooO0o.setImageResource(R.drawable.ic_room_become_member_welcomed);
            this.f31585OooO0oO.setTextColor(p254o00ooO0O.o000O0O0.OooO00o(R.color.white_50));
        } else {
            this.f31584OooO0o0.setBackgroundResource(R.drawable.shape_bg_room_become_member_welcome);
            this.f31583OooO0o.setImageResource(R.drawable.ic_room_become_member_welcome);
            this.f31585OooO0oO.setTextColor(p254o00ooO0O.o000O0O0.OooO00o(R.color.color_EE7A36));
        }
    }

    public final void OooO0O0(ChatModel.BecomeMemberModel becomeMemberModel) {
        RoomUserInfoModel roomUserInfoModel = new RoomUserInfoModel();
        roomUserInfoModel.setUserId(becomeMemberModel.userId);
        String str = becomeMemberModel.userName;
        Intrinsics.checkNotNullExpressionValue(str, "becomeMemberModel.userName");
        roomUserInfoModel.setUserName(str);
        String str2 = becomeMemberModel.headphoto;
        Intrinsics.checkNotNullExpressionValue(str2, "becomeMemberModel.headphoto");
        roomUserInfoModel.setUserHeader(str2);
        LiveEventBus.get("QUERY_USER_IN_ROOM_INFORMATION").post(roomUserInfoModel);
    }
}
