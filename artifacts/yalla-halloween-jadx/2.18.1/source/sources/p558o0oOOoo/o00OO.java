package p558o0oOOoo;

import Oooo000.o000000;
import Oooo000.o00Oo0;
import Oooo000.o00Ooo;
import android.content.DialogInterface;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.o0O0O00;
import com.app.base.mixedroom.MixedRoomActivity;
import com.app.base.protobuf.room.Room;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.jeremyliao.liveeventbus.core.Observable;
import com.weieyu.yalla.R;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p043OooooO0.o00O0000;
import p044OooooOO.o00O00O;
import p048OoooooO.o00OOOO0;
import p100o000oOoO.o00O000;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;
import p100o000oOoO.oo0ooO;
import p142o00OOooO.o0OOO0o;
import p254o00ooO0O.o000O0o;
import p497o0o00Oo.OooOOO0;
import p510o0o00oo0.o0O00o00;
import p522o0o0O0o.o00O000o;
import p530o0o0OOO.o00OO00O;
import p579o0oOoOOo.oOOO000o;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class o00OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o00OO f44710OooO00o = new o00OO();

    public static final class OooO00o extends Lambda implements Function3<o00Ooo, oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ List<Room.EnvelopInfo> f44711Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ MixedRoomActivity f44712Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(List<Room.EnvelopInfo> list, MixedRoomActivity mixedRoomActivity) {
            super(3);
            this.f44711Oooo0o = list;
            this.f44712Oooo0oO = mixedRoomActivity;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(o00Ooo o00ooo2, oOO00O ooo00o, Integer num) {
            o00Ooo AnimatedVisibility = o00ooo2;
            oOO00O ooo00o2 = ooo00o;
            num.intValue();
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            o00OOOO0 o00oooo0OooO = PaddingKt.OooO(o000O0o.OooO0O0(o00OOOO0.OooO00o.f4198Oooo0o, false, false, null, new oo0O(this.f44712Oooo0oO), 253), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 10, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 13);
            String strOooO00o = o00000.OooO0OO.OooO00o(R.string.Lucky_Bag, ooo00o2);
            List<Room.EnvelopInfo> list = this.f44711Oooo0o;
            o0O00o00.OooO00o(o00oooo0OooO, null, "svga/room_lucky_packet_side.svga", strOooO00o, list != null ? Integer.valueOf(list.size()) : null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, false, ooo00o2, 384, 226);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ int f44714Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(int i) {
            super(2);
            this.f44714Oooo0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            o00OO.this.OooO00o(ooo00o, this.f44714Oooo0oO | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<DialogInterface, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO0OO f44715Oooo0o = new OooO0OO();

        public OooO0OO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(DialogInterface dialogInterface) {
            DialogInterface it = dialogInterface;
            Intrinsics.checkNotNullParameter(it, "it");
            o00OO00O.f43313OooooOo.OooO00o().f43361OoooOO0.setValue(Boolean.FALSE);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0078  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO00o(@Nullable oOO00O ooo00o, int i) {
        boolean z;
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(1409165047);
        if ((i & 1) == 0 && ooo00oOooOOo.OooOo0()) {
            ooo00oOooOOo.OooOoo0();
        } else {
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            Object objOooOO0o = ooo00oOooOOo.OooOO0o(o0O0O00.f6593OooO0Oo);
            MixedRoomActivity mixedRoomActivity = objOooOO0o instanceof MixedRoomActivity ? (MixedRoomActivity) objOooOO0o : null;
            Observable<Object> observable = LiveEventBus.get("LuckyPacket_AddNew");
            Intrinsics.checkNotNullExpressionValue(observable, "get(EventKey.LuckyPacket_AddNew)");
            o00O000o.OooO00o(observable, new o0OOO0o(mixedRoomActivity, 7), ooo00oOooOOo, 72);
            o00OO00O.OooO00o oooO00o = o00OO00O.f43313OooooOo;
            List list = (List) o00O00O.OooO0O0(oooO00o.OooO00o().f43357OoooO, ooo00oOooOOo).getValue();
            if (Intrinsics.areEqual(o00O00O.OooO0O0(oooO00o.OooO00o().f43361OoooOO0, ooo00oOooOOo).getValue(), Boolean.FALSE)) {
                if (list == null || list.isEmpty()) {
                    z = false;
                } else {
                    z = true;
                }
            } else {
                z = false;
            }
            o00Oo0.OooO0Oo(z, null, o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO0OO()), o000000.OooO0o0(null, 3).OooO0O0(o000000.OooO0oo()), null, o00O0000.OooO00o(ooo00oOooOOo, -1897702625, new OooO00o(list, mixedRoomActivity)), ooo00oOooOOo, 200064, 18);
        }
        oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooO0O0(i));
    }

    public final void OooO0O0(boolean z, MixedRoomActivity mixedRoomActivity) {
        Room.EnvelopInfo envelopInfo;
        if (mixedRoomActivity == null) {
            return;
        }
        if (z) {
            OooOOO0 oooOOO0 = OooOOO0.f41180OooO00o;
            if (OooOOO0.OooO0oO().OooOO0O() == 1) {
                return;
            }
        }
        o00OO00O.OooO00o oooO00o = o00OO00O.f43313OooooOo;
        List<Room.EnvelopInfo> value = oooO00o.OooO00o().f43357OoooO.getValue();
        if (value == null || value.size() <= 0 || (envelopInfo = value.get(0)) == null) {
            return;
        }
        if (z && (envelopInfo = value.get(value.size() - 1)) == null) {
            return;
        }
        Boolean value2 = oooO00o.OooO00o().f43361OoooOO0.getValue();
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.areEqual(value2, bool)) {
            return;
        }
        oooO00o.OooO00o().f43361OoooOO0.setValue(bool);
        oOOO000o oooo000o = new oOOO000o(mixedRoomActivity);
        OooO0OO oooO0OO = OooO0OO.f44715Oooo0o;
        oooo000o.f46112Ooooo0o = false;
        int bonusid = envelopInfo.getBonusid();
        int bonustype = envelopInfo.getBonustype();
        String userheadphoto = envelopInfo.getUserheadphoto();
        Intrinsics.checkNotNullExpressionValue(userheadphoto, "this.userheadphoto");
        String giftimg = envelopInfo.getGiftimg();
        Intrinsics.checkNotNullExpressionValue(giftimg, "this.giftimg");
        String username = envelopInfo.getUsername();
        Intrinsics.checkNotNullExpressionValue(username, "this.username");
        envelopInfo.getBonuscount();
        String bonusinfo = envelopInfo.getBonusinfo();
        Intrinsics.checkNotNullExpressionValue(bonusinfo, "this.bonusinfo");
        oooo000o.OooOO0o(bonusid, bonustype, userheadphoto, giftimg, username, bonusinfo, oooO0OO);
        oooo000o.OooOO0();
    }
}
