package p558o0oOOoo;

import Oooo000.o000000;
import Oooo000.o00Oo0;
import Oooo000.o00Ooo;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.o0O0O00;
import androidx.lifecycle.MediatorLiveData;
import com.app.base.mixedroom.MixedRoomActivity;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.jeremyliao.liveeventbus.core.Observable;
import com.weieyu.yalla.R;
import com.yalla.yalla.data.manager.SharedMessageVM;
import com.yalla.yalla.ui.fragment.MessageBoxFragment;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
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
import p100o000oOoO.o0O00OO;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.o0OOO00;
import p100o000oOoO.oO0Oo;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;
import p100o000oOoO.oo0ooO;
import p142o00OOooO.o00oO0o;
import p254o00ooO0O.o000O0o;
import p498o0o00Oo0.OooOOO;
import p510o0o00oo0.o0O00o00;
import p522o0o0O0o.o00O000o;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class o00OOO00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o00OOO00 f44724OooO00o = new o00OOO00();

    public static final class OooO00o extends Lambda implements Function1<Object, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o0O00OO<MessageBoxFragment> f44725Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o0O00OO<MessageBoxFragment> o0o00oo2) {
            super(1);
            this.f44725Oooo0o = o0o00oo2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Object obj) {
            MessageBoxFragment messageBoxFragmentOooO0O0;
            MessageBoxFragment messageBoxFragmentOooO0O1 = o00OOO00.OooO0O0(this.f44725Oooo0o);
            if ((messageBoxFragmentOooO0O1 != null && messageBoxFragmentOooO0O1.isVisible()) && (messageBoxFragmentOooO0O0 = o00OOO00.OooO0O0(this.f44725Oooo0o)) != null) {
                messageBoxFragmentOooO0O0.dismiss();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function3<o00Ooo, oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ int f44726Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ MixedRoomActivity f44727Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ o0O00OO<MessageBoxFragment> f44728Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(int i, MixedRoomActivity mixedRoomActivity, o0O00OO<MessageBoxFragment> o0o00oo2) {
            super(3);
            this.f44726Oooo0o = i;
            this.f44727Oooo0oO = mixedRoomActivity;
            this.f44728Oooo0oo = o0o00oo2;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(o00Ooo o00ooo2, oOO00O ooo00o, Integer num) {
            o00Ooo AnimatedVisibility = o00ooo2;
            oOO00O ooo00o2 = ooo00o;
            num.intValue();
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            o0O00o00.OooO00o(o000O0o.OooO0O0(PaddingKt.OooO(o00OOOO0.OooO00o.f4198Oooo0o, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 10, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 13), false, false, null, new o00OOO0(this.f44727Oooo0oO, this.f44728Oooo0oo), 253), Integer.valueOf(R.drawable.icon_room_side_message), null, o00000.OooO0OO.OooO00o(R.string.nav_title_message, ooo00o2), Integer.valueOf(this.f44726Oooo0o), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, false, ooo00o2, 0, 228);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ int f44730Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(int i) {
            super(2);
            this.f44730Oooo0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            o00OOO00.this.OooO00o(ooo00o, this.f44730Oooo0oO | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ int f44732Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(int i) {
            super(2);
            this.f44732Oooo0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            o00OOO00.this.OooO00o(ooo00o, this.f44732Oooo0oO | 1);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final MessageBoxFragment OooO0O0(o0O00OO o0o00oo2) {
        return (MessageBoxFragment) o0o00oo2.getValue();
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO00o(@Nullable oOO00O ooo00o, int i) {
        Integer num;
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(1724974851);
        if ((i & 1) == 0 && ooo00oOooOOo.OooOo0()) {
            ooo00oOooOOo.OooOoo0();
        } else {
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            Object objOooOO0o = ooo00oOooOOo.OooOO0o(o0O0O00.f6593OooO0Oo);
            MixedRoomActivity mixedRoomActivity = objOooOO0o instanceof MixedRoomActivity ? (MixedRoomActivity) objOooOO0o : null;
            if (mixedRoomActivity == null) {
                oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooO0o(i));
                return;
            }
            ooo00oOooOOo.OooO0o0(-492369756);
            Object objOooO0o = ooo00oOooOOo.OooO0o();
            oOO00O.OooO00o.C0323OooO00o c0323OooO00o = oOO00O.OooO00o.f29689OooO0O0;
            if (objOooO0o == c0323OooO00o) {
                objOooO0o = o0OOO00.OooO0Oo(null);
                ooo00oOooOOo.Oooo00o(objOooO0o);
            }
            ooo00oOooOOo.Oooo0o0();
            o0O00OO o0o00oo2 = (o0O00OO) objOooO0o;
            Observable<Object> observable = LiveEventBus.get("RESET_ROOM");
            Intrinsics.checkNotNullExpressionValue(observable, "get(RoomEventKey.RESET_ROOM)");
            ooo00oOooOOo.OooO0o0(1157296644);
            boolean zOooo0oo = ooo00oOooOOo.Oooo0oo(o0o00oo2);
            Object objOooO0o2 = ooo00oOooOOo.OooO0o();
            if (zOooo0oo || objOooO0o2 == c0323OooO00o) {
                objOooO0o2 = new OooO00o(o0o00oo2);
                ooo00oOooOOo.Oooo00o(objOooO0o2);
            }
            ooo00oOooOOo.Oooo0o0();
            o00O000o.OooO00o(observable, new o00oO0o((Function1) objOooO0o2, 4), ooo00oOooOOo, 72);
            Boolean bool = (Boolean) o00O00O.OooO0O0(OooOOO.f41216OooO00o.OooOooO(), ooo00oOooOOo).getValue();
            MediatorLiveData<Integer> unreadMessageCount = SharedMessageVM.INSTANCE.getUnreadMessageCount();
            ooo00oOooOOo.OooO0o0(-625565014);
            oO0Oo oo0ooOooO0O0 = unreadMessageCount == null ? null : o00O00O.OooO0O0(unreadMessageCount, ooo00oOooOOo);
            ooo00oOooOOo.Oooo0o0();
            int iIntValue = (oo0ooOooO0O0 == null || (num = (Integer) oo0ooOooO0O0.getValue()) == null) ? 0 : num.intValue();
            o00Oo0.OooO0Oo(Intrinsics.areEqual(bool, Boolean.TRUE) && iIntValue > 0, null, o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO0OO()), o000000.OooO0o0(null, 3).OooO0O0(o000000.OooO0oo()), null, o00O0000.OooO00o(ooo00oOooOOo, -1371200213, new OooO0O0(iIntValue, mixedRoomActivity, o0o00oo2)), ooo00oOooOOo, 200064, 18);
        }
        oo0ooO oo0oooOooOo2 = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo2 == null) {
            return;
        }
        oo0oooOooOo2.OooO00o(new OooO0OO(i));
    }
}
