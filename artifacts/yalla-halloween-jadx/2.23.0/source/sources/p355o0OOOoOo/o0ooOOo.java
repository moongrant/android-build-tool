package p355o0OOOoOo;

import android.content.Context;
import android.util.Log;
import android.util.LongSparseArray;
import com.yalla.yalla.service.room.RoomLiveService;
import com.zego.wrapper.IZegoLiveRoomEngineEventHandler;
import com.zego.wrapper.ZegoLiveRoomEngine;
import com.zego.zegoliveroom.ZegoLiveRoom;
import java.util.Set;
import org.jetbrains.annotations.Nullable;
import p348o0OOOo.OooO0o;
import p351o0OOOo0O.OooO0OO;
import p351o0OOOo0O.OooOO0;
import p353o0OOOoO.o0OOO0o;
import p354o0OOOoO0.OooOOO;
import p354o0OOOoO0.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0ooOOo implements OooOO0 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public ZegoLiveRoomEngine f43730OooO0O0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public OooO0o f43732OooO0Oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public boolean f43729OooO00o = true;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f43731OooO0OO = o0ooOOo.class.getSimpleName();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final LongSparseArray f43733OooO0o0 = new LongSparseArray();

    public class OooO00o extends IZegoLiveRoomEngineEventHandler {
        public OooO00o() {
        }

        @Override // com.zego.wrapper.IZegoLiveRoomEngineEventHandler
        public final void onApiCallExecuted(int i, String str, String str2) {
            if (i != 3) {
                return;
            }
            o0OOO0o.OooO0O0(o0ooOOo.this.f43731OooO0OO, "SDK 还未初始化成功，调用API：" + str);
        }

        @Override // com.zego.wrapper.IZegoLiveRoomEngineEventHandler
        public final void onAudioEffectFinished(int i) {
            o0OOO0o.OooO00o(o0ooOOo.this.f43731OooO0OO, "onAudioEffectFinished soundId: " + i);
        }

        @Override // com.zego.wrapper.IZegoLiveRoomEngineEventHandler
        public final void onAudioMixingFinished() {
            o0OOO0o.OooO00o(o0ooOOo.this.f43731OooO0OO, "onAudioMixingFinished");
        }

        @Override // com.zego.wrapper.IZegoLiveRoomEngineEventHandler
        public final void onAudioMixingStateChanged(int i, int i2) {
            OooO0o oooO0o = o0ooOOo.this.f43732OooO0Oo;
            if (oooO0o != null) {
                oooO0o.OooO(i, i2);
            }
        }

        @Override // com.zego.wrapper.IZegoLiveRoomEngineEventHandler
        public final void onAudioRecordCallback(byte[] bArr, int i, int i2, int i3) {
            o0OOO0o.OooO00o(o0ooOOo.this.f43731OooO0OO, "onAudioRecordCallback data.length: " + bArr.length);
        }

        @Override // com.zego.wrapper.IZegoLiveRoomEngineEventHandler
        public final void onAudioVolumeIndication(IZegoLiveRoomEngineEventHandler.ZegoLiveRoomAudioVolumeInfo[] zegoLiveRoomAudioVolumeInfoArr) {
            if (zegoLiveRoomAudioVolumeInfoArr == null) {
                return;
            }
            o0ooOOo o0ooooo = o0ooOOo.this;
            if (o0ooooo.f43732OooO0Oo != null) {
                OooOOO[] oooOOOArr = new OooOOO[zegoLiveRoomAudioVolumeInfoArr.length];
                for (int i = 0; i < zegoLiveRoomAudioVolumeInfoArr.length; i++) {
                    IZegoLiveRoomEngineEventHandler.ZegoLiveRoomAudioVolumeInfo zegoLiveRoomAudioVolumeInfo = zegoLiveRoomAudioVolumeInfoArr[i];
                    OooOOO oooOOO = new OooOOO();
                    oooOOO.f43721OooO00o = zegoLiveRoomAudioVolumeInfo.uid;
                    oooOOO.f43723OooO0OO = 0;
                    oooOOO.f43722OooO0O0 = zegoLiveRoomAudioVolumeInfo.volume;
                    oooOOOArr[i] = oooOOO;
                }
                o0ooooo.f43732OooO0Oo.OooO00o(oooOOOArr);
            }
        }

        @Override // com.zego.wrapper.IZegoLiveRoomEngineEventHandler
        public final void onError(int i) {
            o0OOO0o.OooO00o(o0ooOOo.this.f43731OooO0OO, "onError errorCode: " + i);
        }

        @Override // com.zego.wrapper.IZegoLiveRoomEngineEventHandler
        public final void onJoinChannelSuccess(String str, long j, int i) {
            o0ooOOo o0ooooo = o0ooOOo.this;
            o0OOO0o.OooO00o(o0ooooo.f43731OooO0OO, "onJoinChannelSuccess " + (4294967295L & j));
            OooO0o oooO0o = o0ooooo.f43732OooO0Oo;
            if (oooO0o != null) {
                oooO0o.OooO0o0(str, j, i);
            }
        }

        @Override // com.zego.wrapper.IZegoLiveRoomEngineEventHandler
        public final void onLocalVideoStats(IZegoLiveRoomEngineEventHandler.ZegoLiveRoomLocalVideoStats zegoLiveRoomLocalVideoStats) {
            o0OOO0o.OooO00o(o0ooOOo.this.f43731OooO0OO, "onLocalVideoStats stats: " + zegoLiveRoomLocalVideoStats);
        }

        @Override // com.zego.wrapper.IZegoLiveRoomEngineEventHandler
        public final void onRemoteVideoStats(IZegoLiveRoomEngineEventHandler.ZegoLiveRoomRemoteVideoStats zegoLiveRoomRemoteVideoStats) {
            o0OOO0o.OooO00o(o0ooOOo.this.f43731OooO0OO, "onRemoteVideoStats stats: " + zegoLiveRoomRemoteVideoStats);
        }

        @Override // com.zego.wrapper.IZegoLiveRoomEngineEventHandler
        public final void onUserJoined(int i, int i2) {
            o0ooOOo o0ooooo = o0ooOOo.this;
            o0OOO0o.OooO00o(o0ooooo.f43731OooO0OO, "onUserJoined " + (((long) i) & 4294967295L));
            OooO0o oooO0o = o0ooooo.f43732OooO0Oo;
            if (oooO0o != null) {
                oooO0o.OooO0oO(i);
            }
        }

        @Override // com.zego.wrapper.IZegoLiveRoomEngineEventHandler
        public final void onUserOffline(int i) {
            o0ooOOo o0ooooo = o0ooOOo.this;
            o0OOO0o.OooO00o(o0ooooo.f43731OooO0OO, "onUserOffline " + (((long) i) & 4294967295L));
            OooO0o oooO0o = o0ooooo.f43732OooO0Oo;
            if (oooO0o != null) {
                oooO0o.OooOO0O();
            }
        }

        @Override // com.zego.wrapper.IZegoLiveRoomEngineEventHandler
        public final void onWarning(int i) {
            o0OOO0o.OooO00o(o0ooOOo.this.f43731OooO0OO, "onWarning warningCode: " + i);
        }
    }

    static {
        try {
            System.loadLibrary("zegoliveroom");
        } catch (Error e) {
            Log.e("Java_ZegoLiveRoom", "load ZegoLiveRoom native library failed", e);
        }
    }

    @Override // p351o0OOOo0O.OooOO0
    public final void OooO() {
        this.f43730OooO0O0.setClientRole(1);
    }

    @Override // p351o0OOOo0O.OooOO0
    public final void OooO00o(Context context, boolean z) {
        this.f43729OooO00o = z;
        if (this.f43730OooO0O0 == null) {
            ZegoLiveRoomEngine.setLogFilter(z ? 4 : 6);
            ZegoLiveRoom.setAudioDeviceMode(4);
            ZegoLiveRoomEngine zegoLiveRoomEngineCreate = ZegoLiveRoomEngine.create(context, 3206531758L, OooO0OO.f43709OooO00o, this.f43729OooO00o, new OooO00o());
            this.f43730OooO0O0 = zegoLiveRoomEngineCreate;
            zegoLiveRoomEngineCreate.setAudioProfile(1, 1);
        }
    }

    @Override // p351o0OOOo0O.OooOO0
    public final int OooO0O0() {
        ZegoLiveRoomEngine zegoLiveRoomEngine = this.f43730OooO0O0;
        if (zegoLiveRoomEngine != null) {
            return zegoLiveRoomEngine.getAudioMixingCurrentPosition();
        }
        return -1;
    }

    @Override // p351o0OOOo0O.OooOO0
    public final int OooO0OO() {
        ZegoLiveRoomEngine zegoLiveRoomEngine = this.f43730OooO0O0;
        if (zegoLiveRoomEngine != null) {
            return zegoLiveRoomEngine.pauseAudioMixing();
        }
        return -1;
    }

    @Override // p351o0OOOo0O.OooOO0
    public final void OooO0Oo() {
        ZegoLiveRoomEngine zegoLiveRoomEngine = this.f43730OooO0O0;
        if (zegoLiveRoomEngine != null) {
            zegoLiveRoomEngine.leaveChannel();
        }
    }

    @Override // p351o0OOOo0O.OooOO0
    public final void OooO0o(int i, boolean z) {
        ZegoLiveRoomEngine zegoLiveRoomEngine = this.f43730OooO0O0;
        if (zegoLiveRoomEngine != null) {
            zegoLiveRoomEngine.muteRemoteAudioStream(i, z);
        }
    }

    @Override // p351o0OOOo0O.OooOO0
    public final int OooO0o0(String str) {
        return this.f43730OooO0O0.renewToken(str);
    }

    @Override // p351o0OOOo0O.OooOO0
    public final void OooO0oO(boolean z) {
        ZegoLiveRoomEngine zegoLiveRoomEngine = this.f43730OooO0O0;
        if (zegoLiveRoomEngine != null) {
            zegoLiveRoomEngine.setEnableSpeakerphone(z);
        }
    }

    @Override // p351o0OOOo0O.OooOO0
    public final int OooO0oo() {
        ZegoLiveRoomEngine zegoLiveRoomEngine = this.f43730OooO0O0;
        if (zegoLiveRoomEngine != null) {
            return zegoLiveRoomEngine.resumeAudioMixing();
        }
        return -1;
    }

    @Override // p351o0OOOo0O.OooOO0
    public final int OooOO0(int i) {
        ZegoLiveRoomEngine zegoLiveRoomEngine = this.f43730OooO0O0;
        if (zegoLiveRoomEngine == null) {
            return -1;
        }
        zegoLiveRoomEngine.setLocalVoicePitch(1.0d);
        this.f43730OooO0O0.resetReverbParam();
        if (i == 1) {
            this.f43730OooO0O0.setLocalVoiceReverb(4, 0);
            this.f43730OooO0O0.setLocalVoicePitch(0.75d);
        } else if (i == 2) {
            this.f43730OooO0O0.setLocalVoicePitch(1.25d);
            this.f43730OooO0O0.setReverbParam(0.5f, 0.0f, 0.0f, 0.5f);
        } else if (i == 3) {
            this.f43730OooO0O0.setLocalVoiceReverb(4, 0);
            this.f43730OooO0O0.setLocalVoicePitch(1.75d);
        } else if (i == 5) {
            this.f43730OooO0O0.setReverbParam(0.5f, 0.3f, 0.08f, 0.9f);
        } else if (i != 6) {
            this.f43730OooO0O0.setLocalVoiceReverb(4, 0);
        } else {
            this.f43730OooO0O0.setReverbParam(1.7f, 1.5f, 0.0f, 0.8f);
            this.f43730OooO0O0.setLocalVoicePitch(0.53125d);
        }
        return 0;
    }

    @Override // p351o0OOOo0O.OooOO0
    public final int OooOO0O(int i) {
        ZegoLiveRoomEngine zegoLiveRoomEngine = this.f43730OooO0O0;
        if (zegoLiveRoomEngine != null) {
            return zegoLiveRoomEngine.adjustAudioMixingVolume(i);
        }
        return -1;
    }

    @Override // p351o0OOOo0O.OooOO0
    public final int OooOO0o(String str) {
        ZegoLiveRoomEngine zegoLiveRoomEngine = this.f43730OooO0O0;
        if (zegoLiveRoomEngine != null) {
            return zegoLiveRoomEngine.startAudioMixing(str, false, false, 1);
        }
        return -1;
    }

    @Override // p351o0OOOo0O.OooOO0
    public final void OooOOO(RoomLiveService.OooO0O0 oooO0O0) {
        this.f43732OooO0Oo = oooO0O0;
    }

    @Override // p351o0OOOo0O.OooOO0
    public final int OooOOO0() {
        ZegoLiveRoomEngine zegoLiveRoomEngine = this.f43730OooO0O0;
        if (zegoLiveRoomEngine != null) {
            return zegoLiveRoomEngine.getAudioMixingDuration();
        }
        return -1;
    }

    @Override // p351o0OOOo0O.OooOO0
    public final void OooOOOO(boolean z) {
        ZegoLiveRoomEngine zegoLiveRoomEngine = this.f43730OooO0O0;
        if (zegoLiveRoomEngine != null) {
            zegoLiveRoomEngine.muteAllRemoteAudioStreams(z);
        }
    }

    @Override // p351o0OOOo0O.OooOO0
    public final int OooOOOo(int i) {
        ZegoLiveRoomEngine zegoLiveRoomEngine = this.f43730OooO0O0;
        if (zegoLiveRoomEngine != null) {
            return zegoLiveRoomEngine.setAudioMixingPosition(i);
        }
        return -1;
    }

    @Override // p351o0OOOo0O.OooOO0
    public final synchronized void OooOOo(long j) {
        this.f43733OooO0o0.put(j, Boolean.TRUE);
    }

    @Override // p351o0OOOo0O.OooOO0
    public final void OooOOo0() {
        this.f43730OooO0O0.setClientRole(2);
    }

    @Override // p351o0OOOo0O.OooOO0
    public final int OooOOoo(@Nullable Set<Long> set) {
        ZegoLiveRoomEngine zegoLiveRoomEngine = this.f43730OooO0O0;
        if (zegoLiveRoomEngine != null) {
            return zegoLiveRoomEngine.setRemoteLiveUserSet(set);
        }
        return -1;
    }

    @Override // p351o0OOOo0O.OooOO0
    public final synchronized boolean OooOo0(long j) {
        if (this.f43733OooO0o0.indexOfKey(j) <= -1) {
            return false;
        }
        return ((Boolean) this.f43733OooO0o0.get(j)).booleanValue();
    }

    @Override // p351o0OOOo0O.OooOO0
    public final int OooOo00() {
        ZegoLiveRoomEngine zegoLiveRoomEngine = this.f43730OooO0O0;
        if (zegoLiveRoomEngine != null) {
            return zegoLiveRoomEngine.stopAudioMixing(false);
        }
        return -1;
    }

    @Override // p351o0OOOo0O.OooOO0
    public final void OooOo0O(boolean z) {
        ZegoLiveRoomEngine zegoLiveRoomEngine = this.f43730OooO0O0;
        if (zegoLiveRoomEngine != null) {
            zegoLiveRoomEngine.muteLocalAudioStream(z);
            this.f43730OooO0O0.enableLocalAudio(!z);
        }
    }

    @Override // p351o0OOOo0O.OooOO0
    public final void OooOo0o(OooOOO0 oooOOO0, boolean z, boolean z2) {
        this.f43730OooO0O0.enableAudioVolumeIndication(1000);
        this.f43730OooO0O0.setChannelProfile(1);
        this.f43730OooO0O0.joinChannel(oooOOO0.f43724OooO00o, oooOOO0.f43726OooO0OO, oooOOO0.f43727OooO0Oo);
        OooO0oO(z2);
    }

    @Override // p351o0OOOo0O.OooOO0
    public final String getSdkVersion() {
        return this.f43730OooO0O0 != null ? ZegoLiveRoomEngine.getSdkVersion() : "";
    }

    @Override // p351o0OOOo0O.OooOO0
    public final void unregister() {
    }
}
