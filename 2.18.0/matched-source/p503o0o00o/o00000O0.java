package p503o0o00o;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.weieyu.yalla.R;
import com.yalla.yalla.model.GiftPropTypeShow;
import com.yalla.yalla.model.RoomUserInfoModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p255o00ooO0O.o000O0O0;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class o00000O0 {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public static final RoomUserInfoModel f41430OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public static final OooO00o f41431OooO0o0 = new OooO00o();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public static final RoomUserInfoModel f41432OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public static final RoomUserInfoModel f41433OooO0oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Context f41434OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o00OO0O0.OooO00o f41435OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final GiftPropTypeShow f41436OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final List<RoomUserInfoModel> f41437OooO0Oo;

    public static final class OooO00o {
    }

    public /* synthetic */ class OooO0O0 {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GiftPropTypeShow.values().length];
            iArr[GiftPropTypeShow.InRoom.ordinal()] = 1;
            iArr[GiftPropTypeShow.InChat.ordinal()] = 2;
            iArr[GiftPropTypeShow.InMomentDetail.ordinal()] = 3;
            iArr[GiftPropTypeShow.InMomentList.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        RoomUserInfoModel roomUserInfoModel = new RoomUserInfoModel();
        roomUserInfoModel.setUserId(0L);
        roomUserInfoModel.setUserName("--");
        roomUserInfoModel.setHeadPhotoResId(0);
        f41430OooO0o = roomUserInfoModel;
        RoomUserInfoModel roomUserInfoModel2 = new RoomUserInfoModel();
        roomUserInfoModel2.setUserId(Long.MAX_VALUE);
        roomUserInfoModel2.setUserName(o000O0O0.OooO0OO(R.string.Everyone_in_room));
        roomUserInfoModel2.setHeadPhotoResId(R.drawable.room_dialog_all_in_room);
        f41432OooO0oO = roomUserInfoModel2;
        RoomUserInfoModel roomUserInfoModel3 = new RoomUserInfoModel();
        roomUserInfoModel3.setUserId(Long.MIN_VALUE);
        roomUserInfoModel3.setUserName(o000O0O0.OooO0OO(R.string.room_dialog_send_gift_all_in_mic));
        roomUserInfoModel3.setHeadPhotoResId(R.drawable.room_dialog_all_in_mic);
        f41433OooO0oo = roomUserInfoModel3;
    }

    public o00000O0(@NotNull Context context, @NotNull o00OO0O0.OooO00o theme, @NotNull GiftPropTypeShow showIn) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(theme, "theme");
        Intrinsics.checkNotNullParameter(showIn, "showIn");
        this.f41434OooO00o = context;
        this.f41435OooO0O0 = theme;
        this.f41436OooO0OO = showIn;
        this.f41437OooO0Oo = new ArrayList();
    }
}
