package p482o0o000OO;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import com.android.billingclient.api.o0000O0O;
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
import p355o0OOOo0o.OooO;
import p355o0OOOo0o.OooO0o;
import p386o0OOooO.oo0o0Oo;
import p475o0Ooooo0.o0O00oO0;
import p483o0o000Oo.o000000;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.service.room.RoomLiveService$joinAudioChatChannel$1", f = "RoomLiveService.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class OooOo extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RoomLiveService f48425OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f48426OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ String f48427OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOo(RoomLiveService roomLiveService, String str, int i, Continuation<? super OooOo> continuation) {
        super(2, continuation);
        this.f48425OooO0Oo = roomLiveService;
        this.f48427OooO0o0 = str;
        this.f48426OooO0o = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new OooOo(this.f48425OooO0Oo, this.f48427OooO0o0, this.f48426OooO0o, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OooOo) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0128 A[PHI: r9
      0x0128: PHI (r9v2 int) = (r9v1 int), (r9v1 int), (r9v1 int), (r9v5 int) binds: [B:20:0x0100, B:22:0x0106, B:24:0x010c, B:32:0x0125] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        int i;
        BluetoothAdapter defaultAdapter;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        RoomLiveService roomLiveService = this.f48425OooO0Oo;
        String str = this.f48427OooO0o0;
        roomLiveService.f24607OooOOO0 = str;
        int i2 = this.f48426OooO0o;
        roomLiveService.f24605OooOO0o = Integer.valueOf(i2);
        OooO0o oooO0oOooO0O0 = OooO0o.OooO0O0();
        Context applicationContext = roomLiveService.getApplicationContext();
        boolean z = !oo0o0Oo.OooO0o();
        oooO0oOooO0O0.f42902OooO0OO = applicationContext;
        oooO0oOooO0O0.f42901OooO0O0 = z;
        oooO0oOooO0O0.f42905OooO0o0 = i2;
        o0000O0O.f12818OooO00o = z;
        OooO0o oooO0oOooO0O1 = OooO0o.OooO0O0();
        Context applicationContext2 = roomLiveService.getApplicationContext();
        oooO0oOooO0O1.getClass();
        oooO0oOooO0O1.f42906OooO0oO = new BluetoothHeadsetBroadcastReceiver(oooO0oOooO0O1);
        IntentFilter intentFilter = new IntentFilter("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED");
        intentFilter.addAction("android.media.ACTION_SCO_AUDIO_STATE_UPDATED");
        applicationContext2.registerReceiver(oooO0oOooO0O1.f42906OooO0oO, intentFilter);
        OooO0o oooO0oOooO0O2 = OooO0o.OooO0O0();
        Context applicationContext3 = roomLiveService.getApplicationContext();
        oooO0oOooO0O2.getClass();
        oooO0oOooO0O2.f42904OooO0o = new HeadsetBroadcastReceiver(oooO0oOooO0O2);
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addAction("android.intent.action.HEADSET_PLUG");
        applicationContext3.registerReceiver(oooO0oOooO0O2.f42904OooO0o, intentFilter2);
        roomLiveService.f24601OooO0oO = OooO0o.OooO0O0().OooO00o();
        Lazy lazy = roomLiveService.f24602OooO0oo;
        ((AudioManager) lazy.getValue()).requestAudioFocus(roomLiveService, 0, 1);
        OooO oooO = roomLiveService.f24601OooO0oO;
        if (oooO != null) {
            oooO.OooOOOO(roomLiveService.f24612OooOOoo);
        }
        p356o0OOOoO.OooOo oooOo = new p356o0OOOoO.OooOo();
        oooOo.f42908OooO00o = str;
        o000000 o000000Var = OooO00o.f24516OooO0o0;
        oooOo.f42909OooO0O0 = o000000Var.OooO0o0();
        oooOo.f42910OooO0OO = String.valueOf(o000000Var.OooO0o0());
        oooOo.f42912OooO0o0 = "extra info you pass to SDK";
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        Long l = (Long) o0O00oO0.OooOOo0().getValue();
        oooOo.f42911OooO0Oo = l == null ? 0L : l.longValue();
        OooO oooO2 = roomLiveService.f24601OooO0oO;
        if (oooO2 != null) {
            boolean zBooleanValue = OooO00o.f24517OooO0oO.f48577OooO0O0.getValue().booleanValue();
            AudioDeviceInfo[] devices = ((AudioManager) lazy.getValue()).getDevices(2);
            Intrinsics.checkNotNull(devices);
            int i3 = -1;
            for (AudioDeviceInfo audioDeviceInfo : devices) {
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
            oooO2.OooOO0O(oooOo, zBooleanValue, i < 0);
        }
        return Unit.INSTANCE;
    }
}
