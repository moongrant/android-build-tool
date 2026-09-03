package p520o0o0O0oo;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o0000;
import com.yalla.yalla.model.gift.GiftPropTypeShow;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nGiftSelectPop.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GiftSelectPop.kt\ncom/yalla/yalla/ui/dialog/giftDialog/GiftSelectPop\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,280:1\n1#2:281\n*E\n"})
public final class d6 {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public static final RoomUserInfoModel f53264OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public static final RoomUserInfoModel f53265OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public static final RoomUserInfoModel f53266OooO0oO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Context f53267OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final h9.OooO00o f53268OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final GiftPropTypeShow f53269OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final ArrayList f53270OooO0Oo;

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GiftPropTypeShow.values().length];
            try {
                iArr[GiftPropTypeShow.InRoom.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GiftPropTypeShow.InChat.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GiftPropTypeShow.InMomentDetail.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[GiftPropTypeShow.InMomentList.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        RoomUserInfoModel roomUserInfoModel = new RoomUserInfoModel();
        roomUserInfoModel.getUserId().setValue(0L);
        roomUserInfoModel.getUserName().setValue("--");
        roomUserInfoModel.getHeadPhotoResId().setValue(0);
        f53265OooO0o0 = roomUserInfoModel;
        RoomUserInfoModel roomUserInfoModel2 = new RoomUserInfoModel();
        roomUserInfoModel2.getUserId().setValue(Long.valueOf(LongCompanionObject.MAX_VALUE));
        roomUserInfoModel2.getUserName().setValue(o0000.OooO0OO(oO00OOo0.Everyone_in_room));
        roomUserInfoModel2.getHeadPhotoResId().setValue(Integer.valueOf(oOo00OO0.room_dialog_all_in_room));
        f53264OooO0o = roomUserInfoModel2;
        RoomUserInfoModel roomUserInfoModel3 = new RoomUserInfoModel();
        roomUserInfoModel3.getUserId().setValue(Long.MIN_VALUE);
        roomUserInfoModel3.getUserName().setValue(o0000.OooO0OO(oO00OOo0.room_dialog_send_gift_all_in_mic));
        roomUserInfoModel3.getHeadPhotoResId().setValue(Integer.valueOf(oOo00OO0.room_dialog_all_in_mic));
        f53266OooO0oO = roomUserInfoModel3;
    }

    public d6(@NotNull Context context, @NotNull h9.OooO00o theme, @NotNull GiftPropTypeShow showIn) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(theme, "theme");
        Intrinsics.checkNotNullParameter(showIn, "showIn");
        this.f53267OooO00o = context;
        this.f53268OooO0O0 = theme;
        this.f53269OooO0OO = showIn;
        this.f53270OooO0Oo = new ArrayList();
    }
}
