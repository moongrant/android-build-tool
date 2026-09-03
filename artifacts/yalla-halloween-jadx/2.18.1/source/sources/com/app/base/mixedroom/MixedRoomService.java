package com.app.base.mixedroom;

import android.app.Notification;
import android.app.PendingIntent;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.Intent;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Binder;
import android.os.Build;
import android.os.IBinder;
import androidx.annotation.Nullable;
import androidx.lifecycle.LifecycleService;
import androidx.lifecycle.Observer;
import com.app.base.application.App;
import com.app.base.mixedroom.model.RoomLoginInformation;
import com.app.base.model.RoomModel;
import com.app.base.model.RoomVoiceModule;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.weieyu.yalla.R;
import com.weieyu.yalla.libaudiochat.event.BluetoothHeadsetBroadcastReceiver;
import com.weieyu.yalla.libaudiochat.event.HeadsetBroadcastReceiver;
import com.yalla.yalla.common.statistical.net.FLog;
import com.yalla.yalla.common.statistical.net.NetStateExceptionTypeE;
import com.yalla.yalla.ui.activity.empty.EmptySimpleActivity;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
import o00OO.OooO0OO;
import p034OoooO0O.o0Oo0oo;
import p143o00OOooo.o00O0OO;
import p159o00OoOO.o00;
import p159o00OoOO.o000O;
import p159o00OoOO.o000O00O;
import p159o00OoOO.o000OO00;
import p159o00OoOO.o000OOo0;
import p159o00OoOO.o00O000;
import p168o00Ooo0.o0O0O00;
import p445o0OoOo0o.o0O0OOOo;
import p445o0OoOo0o.o0O0o000;
import p451o0OoOoo0.o00O0OOO;
import p498o0o00Oo0.OooOOO;
import p500o0o00Ooo.o0000O00;
import p500o0o00Ooo.o0000Ooo;
import p515o0o0O00.o00O00;
import p530o0o0OOO.o00OO00O;

/* JADX INFO: loaded from: classes.dex */
public class MixedRoomService extends LifecycleService {

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public static final /* synthetic */ int f11827OoooOOO = 0;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public o000OOo0 f11828Oooo;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public o00 f11830Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public o0O0o000 f11831Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public OooO0OO<MixedRoomActivity> f11832OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public OooO00o f11833OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public AudioManager f11834OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public RoomModel f11835OoooO0O;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public String f11837o000oOoO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public OooO0O0 f11829Oooo0o = new OooO0O0();

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public Observer<Boolean> f11836OoooOO0 = new o00O0OO(this, 1);

    public class OooO00o implements AudioManager.OnAudioFocusChangeListener {
        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public final void onAudioFocusChange(int i) {
            if (i == -1 || i == 1 || i != -2) {
                return;
            }
            p617o0oo0o.o00.f48461OooO00o.OooO0o();
        }
    }

    public class OooO0O0 extends Binder {
        public OooO0O0() {
        }
    }

    public final void OooO00o() {
        o00O00.OooO0oo("MixedRoomService", "destroyAudioChat");
        o0O0OOOo o0o0ooooOooO0O0 = o0O0OOOo.OooO0O0();
        Context applicationContext = getApplicationContext();
        Objects.requireNonNull(o0o0ooooOooO0O0);
        try {
            BluetoothHeadsetBroadcastReceiver bluetoothHeadsetBroadcastReceiver = o0o0ooooOooO0O0.f40254OooO0oO;
            if (bluetoothHeadsetBroadcastReceiver != null) {
                applicationContext.unregisterReceiver(bluetoothHeadsetBroadcastReceiver);
                o0o0ooooOooO0O0.f40254OooO0oO = null;
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        o0O0OOOo o0o0ooooOooO0O1 = o0O0OOOo.OooO0O0();
        Context applicationContext2 = getApplicationContext();
        Objects.requireNonNull(o0o0ooooOooO0O1);
        try {
            HeadsetBroadcastReceiver headsetBroadcastReceiver = o0o0ooooOooO0O1.f40252OooO0o;
            if (headsetBroadcastReceiver != null && applicationContext2 != null) {
                applicationContext2.unregisterReceiver(headsetBroadcastReceiver);
                o0o0ooooOooO0O1.f40252OooO0o = null;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        o0O0o000 o0o0o000 = this.f11831Oooo0oo;
        if (o0o0o000 != null) {
            o0o0o000.OooOOO0();
            this.f11831Oooo0oo.OooOO0(true);
            this.f11831Oooo0oo.OooOOOo();
            o00OO00O.f43313OooooOo.OooO00o().f43336OooOo00.removeObserver(this.f11836OoooOO0);
        }
        AudioManager audioManager = this.f11834OoooO00;
        if (audioManager != null) {
            audioManager.abandonAudioFocus(this.f11833OoooO0);
        }
    }

    public final void OooO0O0() {
        o00O00.OooO0OO("MixedRoomService", "destroySocketManager");
        o00 o00Var = this.f11830Oooo0oO;
        if (o00Var != null) {
            o00Var.f32384OooO0o0 = null;
            o00Var.f32393OooOOOo = false;
            o00Var.f32383OooO0o = false;
            o00Var.OooO0OO();
            o00 o00Var2 = this.f11830Oooo0oO;
            Objects.requireNonNull(o00Var2);
            o00O000.f32468OooO00o = null;
            o00Var2.f32383OooO0o = false;
            o00Var2.f32387OooOO0 = 3000L;
            o00Var2.OooO0OO();
            o00Var2.f32392OooOOOO = null;
            o00Var2.f32384OooO0o0 = null;
            this.f11830Oooo0oO = null;
        }
    }

    public final void OooO0OO(RoomModel roomModel) {
        o00O00.OooO0oo("MixedRoomService", "MixedRoomService enterRoom");
        this.f11835OoooO0O = roomModel;
        OooO0Oo();
        o000O00O o000o00oOooO = o000O00O.OooO();
        o000o00oOooO.f32433OoooO00 = this.f11832OoooO;
        o000o00oOooO.f32432OoooO0 = null;
        this.f11830Oooo0oO.f32392OooOOOO = o000O00O.OooO().f32428Oooo0o;
        o000O00O o000o00oOooO2 = o000O00O.OooO();
        o000o00oOooO2.f32433OoooO00 = this.f11832OoooO;
        o000o00oOooO2.f32432OoooO0 = null;
        o00 o00Var = this.f11830Oooo0oO;
        RoomModel roomModel2 = this.f11835OoooO0O;
        Objects.requireNonNull(o00Var);
        if (com.yalla.support.common.util.OooO0OO.OooO0O0(roomModel2.getPassword())) {
            o00Var.OooO0o0(roomModel2.getPassword());
            return;
        }
        o00Var.f32384OooO0o0 = roomModel2;
        o000O00O.OooO().Oooo0OO(o00Var.f32384OooO0o0);
        o00Var.OooO0oo(0L);
    }

    public final void OooO0Oo() {
        if (this.f11830Oooo0oO == null) {
            this.f11830Oooo0oO = new o00();
        }
    }

    public final void OooO0o() {
        o00O00.OooO0oo("MixedRoomService", "MixedRoomService pauseAgora");
        o0O0o000 o0o0o000 = this.f11831Oooo0oo;
        if (o0o0o000 != null) {
            o0o0o000.OooOOO0();
            this.f11831Oooo0oo.OooOO0(true);
            this.f11831Oooo0oo.OooOOOo();
            p617o0oo0o.o00.f48461OooO00o.OooO0o();
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x015e A[PHI: r0
      0x015e: PHI (r0v7 int) = (r0v6 int), (r0v6 int), (r0v6 int), (r0v10 int) binds: [B:23:0x0136, B:25:0x013c, B:27:0x0142, B:35:0x015b] A[DONT_GENERATE, DONT_INLINE]] */
    public final void OooO0o0(String str) {
        int i;
        int i2;
        BluetoothAdapter defaultAdapter;
        o00O00.OooO0oo("MixedRoomService", "joinChannel");
        this.f11837o000oOoO = str;
        this.f11834OoooO00.requestAudioFocus(this.f11833OoooO0, 0, 1);
        o0O0o000 o0o0o000 = this.f11831Oooo0oo;
        if (o0o0o000 != null) {
            o000OOo0 o000ooo1 = new o000OOo0(this);
            this.f11828Oooo = o000ooo1;
            o0o0o000.OooOo0O(o000ooo1);
        }
        FLog.INSTANCE.writeI(NetStateExceptionTypeE.CONNECT_ROOM, "start connect agora server");
        if (o000O00O.OooO().f32430Oooo0oo == null || o000O00O.OooO().f32430Oooo0oo.getRoom() == null) {
            return;
        }
        RoomLoginInformation.RoomBean room = o000O00O.OooO().f32430Oooo0oo.getRoom();
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("joinChannel:");
        sbOooO0o0.append(room.getId());
        sbOooO0o0.append("   key =");
        sbOooO0o0.append(str);
        o00O00.OooO0O0(sbOooO0o0.toString());
        o00O0OOO o00o0ooo2 = new o00O0OOO();
        o00o0ooo2.f40329OooO00o = str;
        o00o0ooo2.f40330OooO0O0 = room.getId();
        StringBuilder sbOooO0o1 = OooO00o.OooO00o.OooO0o0("");
        sbOooO0o1.append(room.getId());
        o00o0ooo2.f40331OooO0OO = sbOooO0o1.toString();
        o00o0ooo2.f40333OooO0o0 = "extra info you pass to SDK";
        o00o0ooo2.f40332OooO0Oo = o0O0O00.OooOOO0(String.valueOf(OooOOO.f41216OooO00o.OooOo().getValue()));
        o0O0o000 o0o0o001 = this.f11831Oooo0oo;
        o00OO00O.OooO00o oooO00o = o00OO00O.f43313OooooOo;
        o0o0o001.OooOO0(oooO00o.OooO00o().f43333OooOOoo.getValue().booleanValue());
        o00O00.OooO0OO("MixedRoomService", "joinChannel isMuteSound = " + oooO00o.OooO00o().f43333OooOOoo.getValue());
        this.f11831Oooo0oo.OooOo0(oooO00o.OooO00o().f43336OooOo00.getValue().booleanValue());
        this.f11831Oooo0oo.OooO0O0(o00o0ooo2, oooO00o.OooO00o().f43336OooOo00.getValue().booleanValue());
        o0O0o000 o0o0o002 = this.f11831Oooo0oo;
        o00O00.OooO0OO("MixedRoomService", "getHeadsetStatus");
        AudioManager audioManager = (AudioManager) getSystemService("audio");
        if (Build.VERSION.SDK_INT >= 23) {
            AudioDeviceInfo[] devices = audioManager.getDevices(2);
            int length = devices.length;
            int i3 = 0;
            while (true) {
                if (i3 < length) {
                    AudioDeviceInfo audioDeviceInfo = devices[i3];
                    if (audioDeviceInfo.getType() != 3 && audioDeviceInfo.getType() != 4) {
                        i3++;
                    }
                }
            }
        } else {
            i = audioManager.isWiredHeadsetOn() ? 1 : -1;
        }
        if (i == -1 && (defaultAdapter = BluetoothAdapter.getDefaultAdapter()) != null && defaultAdapter.isEnabled()) {
            int profileConnectionState = defaultAdapter.getProfileConnectionState(2);
            int profileConnectionState2 = defaultAdapter.getProfileConnectionState(1);
            int profileConnectionState3 = defaultAdapter.getProfileConnectionState(3);
            if (profileConnectionState == 2) {
                i = profileConnectionState;
            } else if (profileConnectionState2 == 2) {
                i = profileConnectionState2;
            } else if (profileConnectionState3 == 2) {
                i = profileConnectionState3;
            }
            i2 = i == -1 ? i : 2;
        }
        o0o0o002.OooOo0o(i2 < 0);
    }

    public final void OooO0oO(OooO0OO<MixedRoomActivity> oooO0OO) {
        o00O00.OooO0oo("MixedRoomService", "MixedRoomService setUiHandler");
        this.f11832OoooO = oooO0OO;
        o000O00O o000o00oOooO = o000O00O.OooO();
        o000o00oOooO.f32433OoooO00 = this.f11832OoooO;
        o000o00oOooO.f32432OoooO0 = null;
    }

    public final void OooO0oo() {
        int i = Build.VERSION.SDK_INT;
        Notification.Builder builder = i >= 26 ? new Notification.Builder(App.f11458Oooo0oO, "yalla_room") : new Notification.Builder(App.f11458Oooo0oO);
        if (i >= 24) {
            builder.setGroupSummary(false).setGroup("Yalla");
        }
        builder.setSmallIcon(R.drawable.icon_notification_small).setContentText(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.chatroom_run)).setContentIntent(PendingIntent.getActivity(App.f11458Oooo0oO, 1807201968, new Intent(App.f11458Oooo0oO, (Class<?>) EmptySimpleActivity.class), i >= 31 ? 33554432 : 134217728));
        if (i >= 26) {
            builder.setChannelId("yalla_room");
        }
        startForeground(1906, builder.build());
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    @Nullable
    public final IBinder onBind(Intent intent) {
        super.onBind(intent);
        o00O00.OooO0OO("MixedRoomService", "onBind");
        return this.f11829Oooo0o;
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public final void onCreate() {
        super.onCreate();
        o00O00.OooO0oo("MixedRoomService", "MixedRoomService onCreate");
        OooO0oo();
        OooO0Oo();
        LiveEventBus.get("Disconnect_Room", Boolean.class).observe(this, new o000O(this, 0));
        LiveEventBus.get("EVENT_UPDATE_SUBSCRIBE_NUMBER").observe(this, o000OO00.f32458OooO0O0);
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        o00O00.OooO0OO("MixedRoomService", "onDestroy");
        p617o0oo0o.o00.f48461OooO00o.OooO0o();
        OooO0O0();
        OooO00o();
        this.f11835OoooO0O = null;
        o000O00O.OooO().OooOoo();
        o00OO00O.f43313OooooOo.OooO00o().OooO00o();
        o00OO00O.f43314Oooooo0 = null;
        Job job = o0000Ooo.f41383OooO0O0;
        boolean z = true;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        o0000Ooo.f41383OooO0O0 = null;
        RoomVoiceModule roomVoiceModule = o0000Ooo.f41384OooO0OO;
        if (roomVoiceModule != null) {
            List<RoomVoiceModule.TimeVoice> timeVoice = roomVoiceModule != null ? roomVoiceModule.getTimeVoice() : null;
            if (timeVoice != null && !timeVoice.isEmpty()) {
                z = false;
            }
            if (!z) {
                BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new o0000O00(null), 3, null);
            }
        }
        o0Oo0oo.OooO0o0(10, null);
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        OooO0oo();
        return super.onStartCommand(intent, i, i2);
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        o00O00.OooO0OO("MixedRoomService", "onUnbind");
        return super.onUnbind(intent);
    }
}
