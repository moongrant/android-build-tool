package p476o0o0000o;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import com.weieyu.yalla.libaudiochat.event.BluetoothHeadsetBroadcastReceiver;
import com.weieyu.yalla.libaudiochat.event.HeadsetBroadcastReceiver;
import com.yalla.yalla.service.room.OooO00o;
import com.yalla.yalla.service.room.RoomLiveService;
import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p351o0OOOo0O.OooO;
import p351o0OOOo0O.OooOO0;
import p353o0OOOoO.o0OOO0o;
import p354o0OOOoO0.OooOOO0;
import p382o0OOoo0o.o00Ooo;
import p464o0Oooo.o000000O;
import p475o0o000.oo000o;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.service.room.RoomLiveService$joinAudioChatChannel$1", f = "RoomLiveService.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class o000O00 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RoomLiveService f47577OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f47578OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ String f47579OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O00(RoomLiveService roomLiveService, String str, int i, Continuation<? super o000O00> continuation) {
        super(2, continuation);
        this.f47577OooO0Oo = roomLiveService;
        this.f47579OooO0o0 = str;
        this.f47578OooO0o = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o000O00(this.f47577OooO0Oo, this.f47579OooO0o0, this.f47578OooO0o, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o000O00) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x012a A[PHI: r9
      0x012a: PHI (r9v2 int) = (r9v1 int), (r9v1 int), (r9v1 int), (r9v5 int) binds: [B:20:0x0102, B:22:0x0108, B:24:0x010e, B:32:0x0127] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        int i;
        BluetoothAdapter defaultAdapter;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        RoomLiveService roomLiveService = this.f47577OooO0Oo;
        String str = this.f47579OooO0o0;
        roomLiveService.f25069OooOOO0 = str;
        int i2 = this.f47578OooO0o;
        roomLiveService.f25067OooOO0o = Integer.valueOf(i2);
        OooO oooOOooO0O0 = OooO.OooO0O0();
        Context applicationContext = roomLiveService.getApplicationContext();
        boolean z = !o00Ooo.OooO0o();
        oooOOooO0O0.f43703OooO0OO = applicationContext;
        oooOOooO0O0.f43702OooO0O0 = z;
        oooOOooO0O0.f43706OooO0o0 = i2;
        o0OOO0o.f43720OooO00o = z;
        OooO oooOOooO0O1 = OooO.OooO0O0();
        Context applicationContext2 = roomLiveService.getApplicationContext();
        oooOOooO0O1.getClass();
        oooOOooO0O1.f43707OooO0oO = new BluetoothHeadsetBroadcastReceiver(oooOOooO0O1);
        IntentFilter intentFilter = new IntentFilter("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED");
        intentFilter.addAction("android.media.ACTION_SCO_AUDIO_STATE_UPDATED");
        applicationContext2.registerReceiver(oooOOooO0O1.f43707OooO0oO, intentFilter);
        OooO oooOOooO0O2 = OooO.OooO0O0();
        Context applicationContext3 = roomLiveService.getApplicationContext();
        oooOOooO0O2.getClass();
        oooOOooO0O2.f43705OooO0o = new HeadsetBroadcastReceiver(oooOOooO0O2);
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addAction("android.intent.action.HEADSET_PLUG");
        applicationContext3.registerReceiver(oooOOooO0O2.f43705OooO0o, intentFilter2);
        roomLiveService.f25063OooO0oO = OooO.OooO0O0().OooO00o();
        Lazy lazy = roomLiveService.f25064OooO0oo;
        ((AudioManager) lazy.getValue()).requestAudioFocus(roomLiveService, 0, 1);
        OooOO0 oooOO1 = roomLiveService.f25063OooO0oO;
        if (oooOO1 != null) {
            oooOO1.OooOOO(roomLiveService.f25074OooOOoo);
        }
        OooOOO0 oooOOO0 = new OooOOO0();
        oooOOO0.f43724OooO00o = str;
        oo000o oo000oVar = OooO00o.f24978OooO0o0;
        oooOOO0.f43725OooO0O0 = oo000oVar.OooO0o0();
        oooOOO0.f43726OooO0OO = String.valueOf(oo000oVar.OooO0o0());
        oooOOO0.f43728OooO0o0 = "extra info you pass to SDK";
        o000000O o000000o2 = o000000O.f46674OooO00o;
        Long l = (Long) o000000O.OooOOo0().getValue();
        oooOOO0.f43727OooO0Oo = l == null ? 0L : l.longValue();
        OooOO0 oooOO2 = roomLiveService.f25063OooO0oO;
        if (oooOO2 != null) {
            boolean zBooleanValue = OooO00o.f24979OooO0oO.f47372OooO0O0.getValue().booleanValue();
            AudioDeviceInfo[] audioDevices = ((AudioManager) lazy.getValue()).getDevices(2);
            Intrinsics.checkNotNullExpressionValue(audioDevices, "audioDevices");
            int i3 = -1;
            for (AudioDeviceInfo audioDeviceInfo : audioDevices) {
                if (audioDeviceInfo.getType() == 3 || audioDeviceInfo.getType() == 4) {
                    i3 = 1;
                }
            }
            if (i3 == -1 && (defaultAdapter = BluetoothAdapter.getDefaultAdapter()) != null && defaultAdapter.isEnabled()) {
                int profileConnectionState = defaultAdapter.getProfileConnectionState(2);
                int profileConnectionState2 = defaultAdapter.getProfileConnectionState(1);
                int profileConnectionState3 = defaultAdapter.getProfileConnectionState(3);
                if (profileConnectionState == 2) {
                    i3 = profileConnectionState;
                } else if (profileConnectionState2 == 2) {
                    i3 = profileConnectionState2;
                } else if (profileConnectionState3 == 2) {
                    i3 = profileConnectionState3;
                }
                i = i3 == -1 ? i3 : 2;
            }
            oooOO2.OooOo0o(oooOOO0, zBooleanValue, i < 0);
        }
        return Unit.INSTANCE;
    }
}
