package p558o0oOOoo;

import Oooo000.o000000;
import Oooo000.o00Oo0;
import Oooo000.o00Ooo;
import android.content.DialogInterface;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.o0O0O00;
import com.app.base.mixedroom.MixedRoomActivity;
import com.app.base.view.dialog.RoomMoraGameListDialog;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.jeremyliao.liveeventbus.core.Observable;
import com.weieyu.yalla.R;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o00000.OooO0OO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p043OooooO0.o00O0000;
import p044OooooOO.o00O00O;
import p048OoooooO.o00OOOO0;
import p100o000oOoO.o00O000;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.o0OOO00;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;
import p100o000oOoO.oo0ooO;
import p254o00ooO0O.o000O0o;
import p391o0OOooOo.o0O00000;
import p510o0o00oo0.o0O00o00;
import p522o0o0O0o.o00O000o;
import p530o0o0OOO.o00O;
import p530o0o0OOO.o00OO00O;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class o00Oo00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o00Oo00 f44736OooO00o = new o00Oo00();

    public static final class OooO00o extends Lambda implements Function3<o00Ooo, oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Integer f44737Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ MixedRoomActivity f44738Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Integer num, MixedRoomActivity mixedRoomActivity) {
            super(3);
            this.f44737Oooo0o = num;
            this.f44738Oooo0oO = mixedRoomActivity;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(o00Ooo o00ooo2, oOO00O ooo00o, Integer num) {
            o00Ooo AnimatedVisibility = o00ooo2;
            oOO00O ooo00o2 = ooo00o;
            num.intValue();
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            o0O00o00.OooO00o(PaddingKt.OooO(o000O0o.OooO0O0(o00OOOO0.OooO00o.f4198Oooo0o, false, false, null, new o00OOOOo(this.f44738Oooo0oO), 253), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 10, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 13), Integer.valueOf(R.drawable.icon_room_bottom_game_box_mora), null, OooO0OO.OooO00o(R.string.mora, ooo00o2), this.f44737Oooo0o, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, false, ooo00o2, 0, 228);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ int f44740Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(int i) {
            super(2);
            this.f44740Oooo0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            o00Oo00.this.OooO00o(ooo00o, this.f44740Oooo0oO | 1);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO00o(@Nullable oOO00O ooo00o, int i) {
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(-1088335679);
        if ((i & 1) == 0 && ooo00oOooOOo.OooOo0()) {
            ooo00oOooOOo.OooOoo0();
        } else {
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            ooo00oOooOOo.OooO0o0(-492369756);
            Object objOooO0o = ooo00oOooOOo.OooO0o();
            if (objOooO0o == oOO00O.OooO00o.f29689OooO0O0) {
                objOooO0o = o0OOO00.OooO0Oo(null);
                ooo00oOooOOo.Oooo00o(objOooO0o);
            }
            ooo00oOooOOo.Oooo0o0();
            o0O00OO o0o00oo2 = (o0O00OO) objOooO0o;
            Object objOooOO0o = ooo00oOooOOo.OooOO0o(o0O0O00.f6593OooO0Oo);
            MixedRoomActivity mixedRoomActivity = objOooOO0o instanceof MixedRoomActivity ? (MixedRoomActivity) objOooOO0o : null;
            o00O.OooO oooO = o00O.OooO.f43193OooO00o;
            ParcelableSnapshotMutableState parcelableSnapshotMutableState = o00O.OooO.f43194OooO0O0;
            if (((Boolean) parcelableSnapshotMutableState.getValue()).booleanValue() && mixedRoomActivity != null) {
                o0O00000.OooO0OO("InRoom_game_roshambo_list");
                RoomMoraGameListDialog roomMoraGameListDialog = new RoomMoraGameListDialog(mixedRoomActivity);
                roomMoraGameListDialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: o0oOOoo.o00OOO0O
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        o00O.OooO oooO2 = o00O.OooO.f43193OooO00o;
                        o00O.OooO.f43194OooO0O0.setValue(Boolean.FALSE);
                    }
                });
                roomMoraGameListDialog.show();
                o0o00oo2.setValue(roomMoraGameListDialog);
            }
            Observable<Object> observable = LiveEventBus.get("MORA_GAME_ANIM");
            Intrinsics.checkNotNullExpressionValue(observable, "get(EventKey.MORA_GAME_ANIM)");
            o00O000o.OooO00o(observable, new o0o0Oo(mixedRoomActivity, o0o00oo2, 0), ooo00oOooOOo, 72);
            Integer num = (Integer) o00O00O.OooO0O0(o00OO00O.f43313OooooOo.OooO00o().f43343OooOoo0, ooo00oOooOOo).getValue();
            o00Oo0.OooO0Oo((num != null ? num.intValue() : 0) > 0 && !((Boolean) parcelableSnapshotMutableState.getValue()).booleanValue(), null, o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO0OO()), o000000.OooO0o0(null, 3).OooO0O0(o000000.OooO0oo()), null, o00O0000.OooO00o(ooo00oOooOOo, -1972714775, new OooO00o(num, mixedRoomActivity)), ooo00oOooOOo, 200064, 18);
        }
        oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooO0O0(i));
    }
}
