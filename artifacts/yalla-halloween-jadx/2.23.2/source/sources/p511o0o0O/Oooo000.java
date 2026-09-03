package p511o0o0O;

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
import p562o0oOo000.o000000;
import p562o0oOo000.o0Oo0oo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nGiftSelectPop.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GiftSelectPop.kt\ncom/yalla/yalla/ui/dialog/giftDialog/GiftSelectPop\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,280:1\n1#2:281\n*E\n"})
public final class Oooo000 {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public static final RoomUserInfoModel f50936OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public static final RoomUserInfoModel f50937OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public static final RoomUserInfoModel f50938OooO0oO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Context f50939OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o00OO.OooO00o f50940OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final GiftPropTypeShow f50941OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final ArrayList f50942OooO0Oo;

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
        f50937OooO0o0 = roomUserInfoModel;
        RoomUserInfoModel roomUserInfoModel2 = new RoomUserInfoModel();
        roomUserInfoModel2.getUserId().setValue(Long.valueOf(LongCompanionObject.MAX_VALUE));
        roomUserInfoModel2.getUserName().setValue(o0000.OooO0OO(o000000.Everyone_in_room));
        roomUserInfoModel2.getHeadPhotoResId().setValue(Integer.valueOf(o0Oo0oo.room_dialog_all_in_room));
        f50936OooO0o = roomUserInfoModel2;
        RoomUserInfoModel roomUserInfoModel3 = new RoomUserInfoModel();
        roomUserInfoModel3.getUserId().setValue(Long.MIN_VALUE);
        roomUserInfoModel3.getUserName().setValue(o0000.OooO0OO(o000000.room_dialog_send_gift_all_in_mic));
        roomUserInfoModel3.getHeadPhotoResId().setValue(Integer.valueOf(o0Oo0oo.room_dialog_all_in_mic));
        f50938OooO0oO = roomUserInfoModel3;
    }

    public Oooo000(@NotNull Context context, @NotNull o00OO.OooO00o theme, @NotNull GiftPropTypeShow showIn) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(theme, "theme");
        Intrinsics.checkNotNullParameter(showIn, "showIn");
        this.f50939OooO00o = context;
        this.f50940OooO0O0 = theme;
        this.f50941OooO0OO = showIn;
        this.f50942OooO0Oo = new ArrayList();
    }
}
