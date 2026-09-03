package p429o0OoOO;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Lifecycle;
import com.common.support.roomgiftplayer.RoomGiftVideoPlayManager;
import com.common.support.roomgiftplayer.VideoModel;
import com.common.support.roomgiftplayer.VideoType;
import com.common.support.roomgiftplayer.entity.GiftPlayReplaceInfo;
import com.common.support.roomgiftplayer.view.RoomGiftPlayContainer;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.zego.zegoavkit2.ZegoConstants;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import p046Oooooo0.o0O00o0;
import p423o0OoO0OO.o000O0O0;
import p598o0oo00Oo.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o0ooOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final MixedRoomActivity f46823OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final RoomGiftVideoPlayManager f46824OooO0O0;

    public static final class OooO00o<T> implements FlowCollector {
        public OooO00o() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, Continuation continuation) {
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            RoomGiftPlayContainer roomGiftPlayContainer = o0ooOOo.this.f46824OooO0O0.getRoomGiftPlayContainer();
            if (roomGiftPlayContainer != null) {
                roomGiftPlayContainer.setMute(zBooleanValue);
            }
            return Unit.INSTANCE;
        }
    }

    public o0ooOOo(@NotNull MixedRoomActivity activity, @NotNull RoomGiftVideoPlayManager roomGiftVideoPlayManager) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(roomGiftVideoPlayManager, "roomGiftVideoPlayManager");
        this.f46823OooO00o = activity;
        this.f46824OooO0O0 = roomGiftVideoPlayManager;
        MutableStateFlow<Boolean> mutableStateFlow = com.yalla.yalla.service.room.OooO00o.f24517OooO0oO.f48578OooO0OO;
        Lifecycle lifecycle = activity.getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
        o000O0O0.OooO00o(mutableStateFlow, lifecycle, new OooO00o());
        LiveEventBus.get("PlayEffectVideoGift").observe(activity, new oo000o(this, 0));
        LiveEventBus.get("RESET_ROOM").observe(activity, new o00oO0o(this, 0));
    }

    public static void OooO00o(o0ooOOo o0ooooo, int i, int i2, int i3, String str, GiftPlayReplaceInfo giftPlayReplaceInfo, boolean z, int i4) {
        if ((i4 & 4) != 0) {
            i3 = 1;
        }
        if ((i4 & 16) != 0) {
            giftPlayReplaceInfo = null;
        }
        if ((i4 & 32) != 0) {
            z = false;
        }
        o0000O00.OooO0OO("RoomEffectGiftPlayer", o0O00o0.OooO00o("addEffectGiftCombineGiftInfo giftId = ", i, "  times = ", i3, ZegoConstants.ZegoVideoDataAuxPublishingStream));
        if (str == null || StringsKt.isBlank(str)) {
            return;
        }
        if (i3 < 1) {
            i3 = 1;
        }
        VideoModel videoModel = new VideoModel(str, i2 == 2 ? VideoType.YYEva : VideoType.AlphaVideo, i3 - 1, giftPlayReplaceInfo);
        RoomGiftVideoPlayManager roomGiftVideoPlayManager = o0ooooo.f46824OooO0O0;
        if (z) {
            roomGiftVideoPlayManager.addItemToFirst(videoModel);
        } else {
            roomGiftVideoPlayManager.addItem(videoModel);
        }
    }
}
