package p359o0OOOoo0;

import android.content.Context;
import android.util.Log;
import android.util.LongSparseArray;
import com.android.billingclient.api.o0000O0O;
import com.yalla.yalla.service.room.RoomLiveService;
import com.zego.wrapper.IZegoLiveRoomEngineEventHandler;
import com.zego.wrapper.ZegoLiveRoomEngine;
import com.zego.zegoliveroom.ZegoLiveRoom;
import java.util.Set;
import org.jetbrains.annotations.Nullable;
import p139o00OOOo0.OooO0OO;
import p356o0OOOoO.OooOo;
import p356o0OOOoO.Oooo000;
import p357o0OOOoO0.OooO0o;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO implements p355o0OOOo0o.OooO {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public ZegoLiveRoomEngine f42945OooO0O0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public OooO0o f42947OooO0Oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public boolean f42944OooO00o = true;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f42946OooO0OO = OooO.class.getSimpleName();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final LongSparseArray f42948OooO0o0 = new LongSparseArray();

    public class OooO00o extends IZegoLiveRoomEngineEventHandler {
        public OooO00o() {
        }

        @Override // com.zego.wrapper.IZegoLiveRoomEngineEventHandler
        public final void onApiCallExecuted(int i, String str, String str2) {
            if (i != 3) {
                return;
            }
            o0000O0O.OooO0Oo(OooO.this.f42946OooO0OO, "SDK 还未初始化成功，调用API：" + str);
        }

        @Override // com.zego.wrapper.IZegoLiveRoomEngineEventHandler
        public final void onAudioEffectFinished(int i) {
            o0000O0O.OooO0OO(OooO.this.f42946OooO0OO, "onAudioEffectFinished soundId: " + i);
        }

        @Override // com.zego.wrapper.IZegoLiveRoomEngineEventHandler
        public final void onAudioMixingFinished() {
            o0000O0O.OooO0OO(OooO.this.f42946OooO0OO, "onAudioMixingFinished");
        }

        @Override // com.zego.wrapper.IZegoLiveRoomEngineEventHandler
        public final void onAudioMixingStateChanged(int i, int i2) {
            OooO0o oooO0o = OooO.this.f42947OooO0Oo;
            if (oooO0o != null) {
                oooO0o.OooO(i, i2);
            }
        }

        @Override // com.zego.wrapper.IZegoLiveRoomEngineEventHandler
        public final void onAudioRecordCallback(byte[] bArr, int i, int i2, int i3) {
            o0000O0O.OooO0OO(OooO.this.f42946OooO0OO, "onAudioRecordCallback data.length: " + bArr.length);
        }

        @Override // com.zego.wrapper.IZegoLiveRoomEngineEventHandler
        public final void onAudioVolumeIndication(IZegoLiveRoomEngineEventHandler.ZegoLiveRoomAudioVolumeInfo[] zegoLiveRoomAudioVolumeInfoArr) {
            if (zegoLiveRoomAudioVolumeInfoArr == null) {
                return;
            }
            OooO oooO = OooO.this;
            if (oooO.f42947OooO0Oo != null) {
                Oooo000[] oooo000Arr = new Oooo000[zegoLiveRoomAudioVolumeInfoArr.length];
                for (int i = 0; i < zegoLiveRoomAudioVolumeInfoArr.length; i++) {
                    IZegoLiveRoomEngineEventHandler.ZegoLiveRoomAudioVolumeInfo zegoLiveRoomAudioVolumeInfo = zegoLiveRoomAudioVolumeInfoArr[i];
                    Oooo000 oooo000 = new Oooo000();
                    oooo000.f42913OooO00o = zegoLiveRoomAudioVolumeInfo.uid;
                    oooo000.f42915OooO0OO = 0;
                    oooo000.f42914OooO0O0 = zegoLiveRoomAudioVolumeInfo.volume;
                    oooo000Arr[i] = oooo000;
                }
                oooO.f42947OooO0Oo.OooO0O0(oooo000Arr);
            }
        }

        @Override // com.zego.wrapper.IZegoLiveRoomEngineEventHandler
        public final void onError(int i) {
            o0000O0O.OooO0OO(OooO.this.f42946OooO0OO, "onError errorCode: " + i);
        }

        @Override // com.zego.wrapper.IZegoLiveRoomEngineEventHandler
        public final void onJoinChannelSuccess(String str, long j, int i) {
            OooO oooO = OooO.this;
            o0000O0O.OooO0OO(oooO.f42946OooO0OO, "onJoinChannelSuccess " + (4294967295L & j));
            OooO0o oooO0o = oooO.f42947OooO0Oo;
            if (oooO0o != null) {
                oooO0o.OooO0o0(str, j, i);
            }
        }

        @Override // com.zego.wrapper.IZegoLiveRoomEngineEventHandler
        public final void onLocalVideoStats(IZegoLiveRoomEngineEventHandler.ZegoLiveRoomLocalVideoStats zegoLiveRoomLocalVideoStats) {
            o0000O0O.OooO0OO(OooO.this.f42946OooO0OO, "onLocalVideoStats stats: " + zegoLiveRoomLocalVideoStats);
        }

        @Override // com.zego.wrapper.IZegoLiveRoomEngineEventHandler
        public final void onRemoteVideoStats(IZegoLiveRoomEngineEventHandler.ZegoLiveRoomRemoteVideoStats zegoLiveRoomRemoteVideoStats) {
            o0000O0O.OooO0OO(OooO.this.f42946OooO0OO, "onRemoteVideoStats stats: " + zegoLiveRoomRemoteVideoStats);
        }

        @Override // com.zego.wrapper.IZegoLiveRoomEngineEventHandler
        public final void onUserJoined(int i, int i2) {
            OooO oooO = OooO.this;
            o0000O0O.OooO0OO(oooO.f42946OooO0OO, "onUserJoined " + (((long) i) & 4294967295L));
            OooO0o oooO0o = oooO.f42947OooO0Oo;
            if (oooO0o != null) {
                oooO0o.OooO0oO(i);
            }
        }

        @Override // com.zego.wrapper.IZegoLiveRoomEngineEventHandler
        public final void onUserOffline(int i) {
            OooO oooO = OooO.this;
            o0000O0O.OooO0OO(oooO.f42946OooO0OO, "onUserOffline " + (((long) i) & 4294967295L));
            OooO0o oooO0o = oooO.f42947OooO0Oo;
            if (oooO0o != null) {
                oooO0o.OooOO0O();
            }
        }

        @Override // com.zego.wrapper.IZegoLiveRoomEngineEventHandler
        public final void onWarning(int i) {
            o0000O0O.OooO0OO(OooO.this.f42946OooO0OO, "onWarning warningCode: " + i);
        }
    }

    static {
        try {
            System.loadLibrary("zegoliveroom");
        } catch (Error e) {
            Log.e("Java_ZegoLiveRoom", "load ZegoLiveRoom native library failed", e);
        }
    }

    @Override // p355o0OOOo0o.OooO
    public final void OooO() {
        this.f42945OooO0O0.setClientRole(1);
    }

    @Override // p355o0OOOo0o.OooO
    public final void OooO00o(Context context, boolean z) {
        this.f42944OooO00o = z;
        if (this.f42945OooO0O0 == null) {
            ZegoLiveRoomEngine.setLogFilter(z ? 4 : 6);
            ZegoLiveRoom.setAudioDeviceMode(4);
            ZegoLiveRoomEngine zegoLiveRoomEngineCreate = ZegoLiveRoomEngine.create(context, 3206531758L, OooO0OO.f37471OooO00o, this.f42944OooO00o, new OooO00o());
            this.f42945OooO0O0 = zegoLiveRoomEngineCreate;
            zegoLiveRoomEngineCreate.setAudioProfile(1, 1);
        }
    }

    @Override // p355o0OOOo0o.OooO
    public final int OooO0O0() {
        ZegoLiveRoomEngine zegoLiveRoomEngine = this.f42945OooO0O0;
        if (zegoLiveRoomEngine != null) {
            return zegoLiveRoomEngine.getAudioMixingCurrentPosition();
        }
        return -1;
    }

    @Override // p355o0OOOo0o.OooO
    public final int OooO0OO() {
        ZegoLiveRoomEngine zegoLiveRoomEngine = this.f42945OooO0O0;
        if (zegoLiveRoomEngine != null) {
            return zegoLiveRoomEngine.pauseAudioMixing();
        }
        return -1;
    }

    @Override // p355o0OOOo0o.OooO
    public final void OooO0Oo() {
        ZegoLiveRoomEngine zegoLiveRoomEngine = this.f42945OooO0O0;
        if (zegoLiveRoomEngine != null) {
            zegoLiveRoomEngine.leaveChannel();
        }
    }

    @Override // p355o0OOOo0o.OooO
    public final void OooO0o(int i, boolean z) {
        ZegoLiveRoomEngine zegoLiveRoomEngine = this.f42945OooO0O0;
        if (zegoLiveRoomEngine != null) {
            zegoLiveRoomEngine.muteRemoteAudioStream(i, z);
        }
    }

    @Override // p355o0OOOo0o.OooO
    public final int OooO0o0(String str) {
        return this.f42945OooO0O0.renewToken(str);
    }

    @Override // p355o0OOOo0o.OooO
    public final void OooO0oO(boolean z) {
        ZegoLiveRoomEngine zegoLiveRoomEngine = this.f42945OooO0O0;
        if (zegoLiveRoomEngine != null) {
            zegoLiveRoomEngine.setEnableSpeakerphone(z);
        }
    }

    @Override // p355o0OOOo0o.OooO
    public final int OooO0oo() {
        ZegoLiveRoomEngine zegoLiveRoomEngine = this.f42945OooO0O0;
        if (zegoLiveRoomEngine != null) {
            return zegoLiveRoomEngine.resumeAudioMixing();
        }
        return -1;
    }

    @Override // p355o0OOOo0o.OooO
    public final int OooOO0(int i) {
        ZegoLiveRoomEngine zegoLiveRoomEngine = this.f42945OooO0O0;
        if (zegoLiveRoomEngine == null) {
            return -1;
        }
        zegoLiveRoomEngine.setLocalVoicePitch(1.0d);
        this.f42945OooO0O0.resetReverbParam();
        if (i == 1) {
            this.f42945OooO0O0.setLocalVoiceReverb(4, 0);
            this.f42945OooO0O0.setLocalVoicePitch(0.75d);
        } else if (i == 2) {
            this.f42945OooO0O0.setLocalVoicePitch(1.25d);
            this.f42945OooO0O0.setReverbParam(0.5f, 0.0f, 0.0f, 0.5f);
        } else if (i == 3) {
            this.f42945OooO0O0.setLocalVoiceReverb(4, 0);
            this.f42945OooO0O0.setLocalVoicePitch(1.75d);
        } else if (i == 5) {
            this.f42945OooO0O0.setReverbParam(0.5f, 0.3f, 0.08f, 0.9f);
        } else if (i != 6) {
            this.f42945OooO0O0.setLocalVoiceReverb(4, 0);
        } else {
            this.f42945OooO0O0.setReverbParam(1.7f, 1.5f, 0.0f, 0.8f);
            this.f42945OooO0O0.setLocalVoicePitch(0.53125d);
        }
        return 0;
    }

    @Override // p355o0OOOo0o.OooO
    public final void OooOO0O(OooOo oooOo, boolean z, boolean z2) {
        this.f42945OooO0O0.enableAudioVolumeIndication(1000);
        this.f42945OooO0O0.setChannelProfile(1);
        this.f42945OooO0O0.joinChannel(oooOo.f42908OooO00o, oooOo.f42910OooO0OO, oooOo.f42911OooO0Oo);
        OooO0oO(z2);
    }

    @Override // p355o0OOOo0o.OooO
    public final int OooOO0o(int i) {
        ZegoLiveRoomEngine zegoLiveRoomEngine = this.f42945OooO0O0;
        if (zegoLiveRoomEngine != null) {
            return zegoLiveRoomEngine.adjustAudioMixingVolume(i);
        }
        return -1;
    }

    @Override // p355o0OOOo0o.OooO
    public final int OooOOO() {
        ZegoLiveRoomEngine zegoLiveRoomEngine = this.f42945OooO0O0;
        if (zegoLiveRoomEngine != null) {
            return zegoLiveRoomEngine.getAudioMixingDuration();
        }
        return -1;
    }

    @Override // p355o0OOOo0o.OooO
    public final int OooOOO0(String str) {
        ZegoLiveRoomEngine zegoLiveRoomEngine = this.f42945OooO0O0;
        if (zegoLiveRoomEngine != null) {
            return zegoLiveRoomEngine.startAudioMixing(str, false, false, 1);
        }
        return -1;
    }

    @Override // p355o0OOOo0o.OooO
    public final void OooOOOO(RoomLiveService.OooO0O0 oooO0O0) {
        this.f42947OooO0Oo = oooO0O0;
    }

    @Override // p355o0OOOo0o.OooO
    public final void OooOOOo(boolean z) {
        ZegoLiveRoomEngine zegoLiveRoomEngine = this.f42945OooO0O0;
        if (zegoLiveRoomEngine != null) {
            zegoLiveRoomEngine.muteAllRemoteAudioStreams(z);
        }
    }

    @Override // p355o0OOOo0o.OooO
    public final void OooOOo() {
        this.f42945OooO0O0.setClientRole(2);
    }

    @Override // p355o0OOOo0o.OooO
    public final int OooOOo0(int i) {
        ZegoLiveRoomEngine zegoLiveRoomEngine = this.f42945OooO0O0;
        if (zegoLiveRoomEngine != null) {
            return zegoLiveRoomEngine.setAudioMixingPosition(i);
        }
        return -1;
    }

    @Override // p355o0OOOo0o.OooO
    public final synchronized void OooOOoo(long j) {
        this.f42948OooO0o0.put(j, Boolean.TRUE);
    }

    @Override // p355o0OOOo0o.OooO
    public final int OooOo0() {
        ZegoLiveRoomEngine zegoLiveRoomEngine = this.f42945OooO0O0;
        if (zegoLiveRoomEngine != null) {
            return zegoLiveRoomEngine.stopAudioMixing(false);
        }
        return -1;
    }

    @Override // p355o0OOOo0o.OooO
    public final int OooOo00(@Nullable Set<Long> set) {
        ZegoLiveRoomEngine zegoLiveRoomEngine = this.f42945OooO0O0;
        if (zegoLiveRoomEngine != null) {
            return zegoLiveRoomEngine.setRemoteLiveUserSet(set);
        }
        return -1;
    }

    @Override // p355o0OOOo0o.OooO
    public final synchronized boolean OooOo0O(long j) {
        if (this.f42948OooO0o0.indexOfKey(j) <= -1) {
            return false;
        }
        return ((Boolean) this.f42948OooO0o0.get(j)).booleanValue();
    }

    @Override // p355o0OOOo0o.OooO
    public final void OooOo0o(boolean z) {
        ZegoLiveRoomEngine zegoLiveRoomEngine = this.f42945OooO0O0;
        if (zegoLiveRoomEngine != null) {
            zegoLiveRoomEngine.muteLocalAudioStream(z);
            this.f42945OooO0O0.enableLocalAudio(!z);
        }
    }

    @Override // p355o0OOOo0o.OooO
    public final String getSdkVersion() {
        return this.f42945OooO0O0 != null ? ZegoLiveRoomEngine.getSdkVersion() : "";
    }

    @Override // p355o0OOOo0o.OooO
    public final void unregister() {
    }
}
