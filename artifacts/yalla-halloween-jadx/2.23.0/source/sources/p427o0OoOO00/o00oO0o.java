package p427o0OoOO00;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Observer;
import com.code.android.util.OooOo00;
import com.common.support.roomgiftplayer.RoomGiftVideoPlayManager;
import com.common.support.roomgiftplayer.VideoModel;
import com.common.support.roomgiftplayer.VideoType;
import com.common.support.roomgiftplayer.entity.GiftPlayReplaceInfo;
import com.common.support.roomgiftplayer.view.RoomGiftPlayContainer;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.model.RoomGiftCombineGiftInfo;
import com.yalla.yalla.model.RoomGiftCustomModel;
import com.yalla.yalla.model.RoomGiftModel;
import com.zego.zegoavkit2.ZegoConstants;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p041Ooooo0o.o00000;
import p046Oooooo0.o0O00o0;
import p140o00OOooo.OooOO0;
import p417o0OoO0.o000000;
import p592o0oo00O.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o00oO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final MixedRoomActivity f45693OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final RoomGiftVideoPlayManager f45694OooO0O0;

    public static final class OooO00o implements FlowCollector<Boolean> {
        public OooO00o() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Boolean bool, Continuation continuation) {
            boolean zBooleanValue = bool.booleanValue();
            RoomGiftPlayContainer roomGiftPlayContainer = o00oO0o.this.f45694OooO0O0.getRoomGiftPlayContainer();
            if (roomGiftPlayContainer != null) {
                roomGiftPlayContainer.setMute(zBooleanValue);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 implements Observer<Object> {
        public OooO0O0() {
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(@Nullable Object obj) {
            if (obj instanceof RoomGiftModel) {
                OooOOO0.OooO0O0("RoomEffectGiftPlayer giftModel = ".concat(OooOO0.OooO00o(obj)));
                RoomGiftModel roomGiftModel = (RoomGiftModel) obj;
                o00oO0o o00oo0o2 = o00oO0o.this;
                if (o00oo0o2.f45693OooO00o.f22753OooO0oO) {
                    if (!OooOo00.OooO0O0(roomGiftModel.getCustomGiftInfo())) {
                        int giftid = roomGiftModel.getGiftid();
                        int effectFrameType = roomGiftModel.getEffectFrameType();
                        int number = roomGiftModel.getNumber();
                        String effectUrl = roomGiftModel.getEffectUrl();
                        RoomGiftCombineGiftInfo combineGiftInfo = roomGiftModel.getCombineGiftInfo();
                        o00oO0o.OooO00o(o00oo0o2, giftid, effectFrameType, number, effectUrl, combineGiftInfo != null ? combineGiftInfo.transformToGiftPlayReplaceInfo() : null, false, 32);
                        return;
                    }
                    int giftid2 = roomGiftModel.getGiftid();
                    int number2 = roomGiftModel.getNumber();
                    RoomGiftCustomModel customGiftInfo = roomGiftModel.getCustomGiftInfo();
                    StringBuilder sbOooO00o = o00000.OooO00o("addEffectGiftCustomMade giftId = ", giftid2, "  times = ", number2, "  customGiftInfo = ");
                    sbOooO00o.append(customGiftInfo);
                    OooOOO0.OooO0OO("RoomEffectGiftPlayer", sbOooO00o.toString());
                    if (customGiftInfo == null) {
                        return;
                    }
                    if (number2 < 1) {
                        number2 = 1;
                    }
                    String customSkinUrl = customGiftInfo.getCustomSkinUrl();
                    if (customSkinUrl == null) {
                        customSkinUrl = "";
                    }
                    o00oo0o2.f45694OooO0O0.addItem(new VideoModel(customSkinUrl, VideoType.Svga, number2 - 1, customGiftInfo.transformToGiftPlayReplaceInfo()));
                }
            }
        }
    }

    public static final class OooO0OO implements Observer<Object> {
        public OooO0OO() {
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(Object obj) {
            o00oO0o.this.f45694OooO0O0.reset();
        }
    }

    public o00oO0o(@NotNull MixedRoomActivity activity, @NotNull RoomGiftVideoPlayManager roomGiftVideoPlayManager) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(roomGiftVideoPlayManager, "roomGiftVideoPlayManager");
        this.f45693OooO00o = activity;
        this.f45694OooO0O0 = roomGiftVideoPlayManager;
        MutableStateFlow<Boolean> mutableStateFlow = com.yalla.yalla.service.room.OooO00o.f24979OooO0oO.f47373OooO0OO;
        Lifecycle lifecycle = activity.getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "activity.lifecycle");
        o000000.OooO00o(mutableStateFlow, lifecycle, new OooO00o());
        LiveEventBus.get("PlayEffectVideoGift").observe(activity, new OooO0O0());
        LiveEventBus.get("RESET_ROOM").observe(activity, new OooO0OO());
    }

    public static void OooO00o(o00oO0o o00oo0o2, int i, int i2, int i3, String str, GiftPlayReplaceInfo giftPlayReplaceInfo, boolean z, int i4) {
        if ((i4 & 4) != 0) {
            i3 = 1;
        }
        if ((i4 & 16) != 0) {
            giftPlayReplaceInfo = null;
        }
        if ((i4 & 32) != 0) {
            z = false;
        }
        OooOOO0.OooO0OO("RoomEffectGiftPlayer", o0O00o0.OooO00o("addEffectGiftCombineGiftInfo giftId = ", i, "  times = ", i3, ZegoConstants.ZegoVideoDataAuxPublishingStream));
        if (str == null || StringsKt.isBlank(str)) {
            return;
        }
        if (i3 < 1) {
            i3 = 1;
        }
        VideoModel videoModel = new VideoModel(str, i2 == 2 ? VideoType.YYEva : VideoType.AlphaVideo, i3 - 1, giftPlayReplaceInfo);
        RoomGiftVideoPlayManager roomGiftVideoPlayManager = o00oo0o2.f45694OooO0O0;
        if (z) {
            roomGiftVideoPlayManager.addItemToFirst(videoModel);
        } else {
            roomGiftVideoPlayManager.addItem(videoModel);
        }
    }
}
