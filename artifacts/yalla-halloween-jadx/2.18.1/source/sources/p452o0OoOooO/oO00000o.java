package p452o0OoOooO;

import android.content.Context;
import android.util.Log;
import android.util.LongSparseArray;
import com.zego.wrapper.IZegoLiveRoomEngineEventHandler;
import com.zego.wrapper.ZegoLiveRoomEngine;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import com.zego.zegoliveroom.ZegoLiveRoom;
import java.util.Set;
import org.jetbrains.annotations.Nullable;
import p159o00OoOO.o000OOo0;
import p168o00Ooo0.Oooo000;
import p445o0OoOo0o.o0O0o000;
import p447o0OoOoO0.o00O0OO;
import p450o0OoOoo.o00;
import p451o0OoOoo0.o00O0OOO;
import p451o0OoOoo0.oo0oOO0;

/* JADX INFO: loaded from: classes2.dex */
public final class oO00000o implements o0O0o000 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public ZegoLiveRoomEngine f40338OooO0O0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public o00O0OO f40340OooO0Oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public boolean f40337OooO00o = true;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f40339OooO0OO = oO00000o.class.getSimpleName();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public LongSparseArray f40341OooO0o0 = new LongSparseArray();

    public class OooO00o extends IZegoLiveRoomEngineEventHandler {
        public OooO00o() {
        }

        @Override // com.zego.wrapper.IZegoLiveRoomEngineEventHandler
        public final void onApiCallExecuted(int i, String str, String str2) {
            if (i != 3) {
                return;
            }
            o00.OooO0O0(oO00000o.this.f40339OooO0OO, "SDK 还未初始化成功，调用API：" + str);
        }

        @Override // com.zego.wrapper.IZegoLiveRoomEngineEventHandler
        public final void onAudioEffectFinished(int i) {
            o00.OooO00o(oO00000o.this.f40339OooO0OO, "onAudioEffectFinished soundId: " + i);
        }

        @Override // com.zego.wrapper.IZegoLiveRoomEngineEventHandler
        public final void onAudioMixingFinished() {
            o00.OooO00o(oO00000o.this.f40339OooO0OO, "onAudioMixingFinished");
        }

        @Override // com.zego.wrapper.IZegoLiveRoomEngineEventHandler
        public final void onAudioMixingStateChanged(int i, int i2) {
            o00O0OO o00o0oo2 = oO00000o.this.f40340OooO0Oo;
            if (o00o0oo2 != null) {
                ((o000OOo0) o00o0oo2).OooO00o(i, i2);
            }
        }

        @Override // com.zego.wrapper.IZegoLiveRoomEngineEventHandler
        public final void onAudioRecordCallback(byte[] bArr, int i, int i2, int i3) {
            String str = oO00000o.this.f40339OooO0OO;
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("onAudioRecordCallback data.length: ");
            sbOooO0o0.append(bArr.length);
            o00.OooO00o(str, sbOooO0o0.toString());
        }

        @Override // com.zego.wrapper.IZegoLiveRoomEngineEventHandler
        public final void onAudioVolumeIndication(IZegoLiveRoomEngineEventHandler.ZegoLiveRoomAudioVolumeInfo[] zegoLiveRoomAudioVolumeInfoArr) {
            if (zegoLiveRoomAudioVolumeInfoArr == null || oO00000o.this.f40340OooO0Oo == null) {
                return;
            }
            oo0oOO0[] oo0ooo0Arr = new oo0oOO0[zegoLiveRoomAudioVolumeInfoArr.length];
            for (int i = 0; i < zegoLiveRoomAudioVolumeInfoArr.length; i++) {
                IZegoLiveRoomEngineEventHandler.ZegoLiveRoomAudioVolumeInfo zegoLiveRoomAudioVolumeInfo = zegoLiveRoomAudioVolumeInfoArr[i];
                oo0oOO0 oo0ooo0 = new oo0oOO0();
                oo0ooo0.f40334OooO00o = zegoLiveRoomAudioVolumeInfo.uid;
                oo0ooo0.f40336OooO0OO = 0;
                oo0ooo0.f40335OooO0O0 = zegoLiveRoomAudioVolumeInfo.volume;
                oo0ooo0Arr[i] = oo0ooo0;
            }
            ((o000OOo0) oO00000o.this.f40340OooO0Oo).OooO0O0(oo0ooo0Arr);
        }

        @Override // com.zego.wrapper.IZegoLiveRoomEngineEventHandler
        public final void onError(int i) {
            o00.OooO00o(oO00000o.this.f40339OooO0OO, "onError errorCode: " + i);
        }

        @Override // com.zego.wrapper.IZegoLiveRoomEngineEventHandler
        public final void onJoinChannelSuccess(String str, long j, int i) {
            String str2 = oO00000o.this.f40339OooO0OO;
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("onJoinChannelSuccess ");
            sbOooO0o0.append(4294967295L & j);
            o00.OooO00o(str2, sbOooO0o0.toString());
            o00O0OO o00o0oo2 = oO00000o.this.f40340OooO0Oo;
            if (o00o0oo2 != null) {
                ((o000OOo0) o00o0oo2).OooO0OO(str, j);
            }
        }

        @Override // com.zego.wrapper.IZegoLiveRoomEngineEventHandler
        public final void onLocalVideoStats(IZegoLiveRoomEngineEventHandler.ZegoLiveRoomLocalVideoStats zegoLiveRoomLocalVideoStats) {
            o00.OooO00o(oO00000o.this.f40339OooO0OO, "onLocalVideoStats stats: " + zegoLiveRoomLocalVideoStats);
        }

        @Override // com.zego.wrapper.IZegoLiveRoomEngineEventHandler
        public final void onRemoteVideoStats(IZegoLiveRoomEngineEventHandler.ZegoLiveRoomRemoteVideoStats zegoLiveRoomRemoteVideoStats) {
            o00.OooO00o(oO00000o.this.f40339OooO0OO, "onRemoteVideoStats stats: " + zegoLiveRoomRemoteVideoStats);
        }

        @Override // com.zego.wrapper.IZegoLiveRoomEngineEventHandler
        public final void onUserJoined(int i, int i2) {
            String str = oO00000o.this.f40339OooO0OO;
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("onUserJoined ");
            sbOooO0o0.append(((long) i) & 4294967295L);
            o00.OooO00o(str, sbOooO0o0.toString());
            o00O0OO o00o0oo2 = oO00000o.this.f40340OooO0Oo;
            if (o00o0oo2 != null) {
                ((o000OOo0) o00o0oo2).OooO0Oo(i);
            }
        }

        @Override // com.zego.wrapper.IZegoLiveRoomEngineEventHandler
        public final void onUserOffline(int i) {
            String str = oO00000o.this.f40339OooO0OO;
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("onUserOffline ");
            sbOooO0o0.append(((long) i) & 4294967295L);
            o00.OooO00o(str, sbOooO0o0.toString());
            o00O0OO o00o0oo2 = oO00000o.this.f40340OooO0Oo;
            if (o00o0oo2 != null) {
                ((o000OOo0) o00o0oo2).OooO0o0(i);
            }
        }

        @Override // com.zego.wrapper.IZegoLiveRoomEngineEventHandler
        public final void onWarning(int i) {
            o00.OooO00o(oO00000o.this.f40339OooO0OO, "onWarning warningCode: " + i);
        }
    }

    static {
        try {
            System.loadLibrary("zegoliveroom");
        } catch (Error e) {
            Log.e("Java_ZegoLiveRoom", "load ZegoLiveRoom native library failed", e);
        }
    }

    @Override // p445o0OoOo0o.o0O0o000
    public final int OooO() {
        ZegoLiveRoomEngine zegoLiveRoomEngine = this.f40338OooO0O0;
        if (zegoLiveRoomEngine != null) {
            return zegoLiveRoomEngine.getAudioMixingCurrentPosition();
        }
        return -1;
    }

    @Override // p445o0OoOo0o.o0O0o000
    public final void OooO00o() {
    }

    @Override // p445o0OoOo0o.o0O0o000
    public final void OooO0O0(o00O0OOO o00o0ooo2, boolean z) {
        this.f40338OooO0O0.enableAudioVolumeIndication(1000);
        this.f40338OooO0O0.setChannelProfile(1);
        this.f40338OooO0O0.joinChannel(o00o0ooo2.f40329OooO00o, o00o0ooo2.f40331OooO0OO, o00o0ooo2.f40332OooO0Oo);
        this.f40338OooO0O0.muteLocalAudioStream(z);
        this.f40338OooO0O0.enableLocalAudio(!z);
    }

    @Override // p445o0OoOo0o.o0O0o000
    public final void OooO0OO() {
        this.f40338OooO0O0.setClientRole(1);
    }

    @Override // p445o0OoOo0o.o0O0o000
    public final int OooO0Oo(int i) {
        ZegoLiveRoomEngine zegoLiveRoomEngine = this.f40338OooO0O0;
        if (zegoLiveRoomEngine == null) {
            return -1;
        }
        zegoLiveRoomEngine.setLocalVoicePitch(1.0d);
        this.f40338OooO0O0.resetReverbParam();
        if (i == 1) {
            this.f40338OooO0O0.setLocalVoiceReverb(4, 0);
            this.f40338OooO0O0.setLocalVoicePitch(0.75d);
        } else if (i == 2) {
            this.f40338OooO0O0.setLocalVoicePitch(1.25d);
            this.f40338OooO0O0.setReverbParam(0.5f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 0.5f);
        } else if (i == 3) {
            this.f40338OooO0O0.setLocalVoiceReverb(4, 0);
            this.f40338OooO0O0.setLocalVoicePitch(1.75d);
        } else if (i == 5) {
            this.f40338OooO0O0.setReverbParam(0.5f, 0.3f, 0.08f, 0.9f);
        } else if (i != 6) {
            this.f40338OooO0O0.setLocalVoiceReverb(4, 0);
        } else {
            this.f40338OooO0O0.setReverbParam(1.7f, 1.5f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 0.8f);
            this.f40338OooO0O0.setLocalVoicePitch(0.53125d);
        }
        return 0;
    }

    @Override // p445o0OoOo0o.o0O0o000
    public final int OooO0o(String str) {
        ZegoLiveRoomEngine zegoLiveRoomEngine = this.f40338OooO0O0;
        if (zegoLiveRoomEngine != null) {
            return zegoLiveRoomEngine.startAudioMixing(str, false, false, 1);
        }
        return -1;
    }

    @Override // p445o0OoOo0o.o0O0o000
    public final int OooO0o0(int i) {
        ZegoLiveRoomEngine zegoLiveRoomEngine = this.f40338OooO0O0;
        if (zegoLiveRoomEngine != null) {
            return zegoLiveRoomEngine.adjustAudioMixingVolume(i);
        }
        return -1;
    }

    @Override // p445o0OoOo0o.o0O0o000
    public final int OooO0oO() {
        ZegoLiveRoomEngine zegoLiveRoomEngine = this.f40338OooO0O0;
        if (zegoLiveRoomEngine != null) {
            return zegoLiveRoomEngine.getAudioMixingDuration();
        }
        return -1;
    }

    @Override // p445o0OoOo0o.o0O0o000
    public final void OooO0oo(Context context, boolean z) {
        this.f40337OooO00o = z;
        if (this.f40338OooO0O0 == null) {
            ZegoLiveRoomEngine.setLogFilter(z ? 4 : 6);
            ZegoLiveRoom.setAudioDeviceMode(4);
            ZegoLiveRoomEngine zegoLiveRoomEngineCreate = ZegoLiveRoomEngine.create(context, 3206531758L, Oooo000.f32643OooO0OO, this.f40337OooO00o, new OooO00o());
            this.f40338OooO0O0 = zegoLiveRoomEngineCreate;
            zegoLiveRoomEngineCreate.setAudioProfile(1, 1);
        }
    }

    @Override // p445o0OoOo0o.o0O0o000
    public final void OooOO0(boolean z) {
        ZegoLiveRoomEngine zegoLiveRoomEngine = this.f40338OooO0O0;
        if (zegoLiveRoomEngine != null) {
            zegoLiveRoomEngine.muteAllRemoteAudioStreams(z);
        }
    }

    @Override // p445o0OoOo0o.o0O0o000
    public final int OooOO0O(int i) {
        ZegoLiveRoomEngine zegoLiveRoomEngine = this.f40338OooO0O0;
        if (zegoLiveRoomEngine != null) {
            return zegoLiveRoomEngine.setAudioMixingPosition(i);
        }
        return -1;
    }

    @Override // p445o0OoOo0o.o0O0o000
    public final int OooOO0o() {
        ZegoLiveRoomEngine zegoLiveRoomEngine = this.f40338OooO0O0;
        if (zegoLiveRoomEngine != null) {
            return zegoLiveRoomEngine.pauseAudioMixing();
        }
        return -1;
    }

    @Override // p445o0OoOo0o.o0O0o000
    public final synchronized void OooOOO(long j) {
        this.f40341OooO0o0.put(j, Boolean.TRUE);
    }

    @Override // p445o0OoOo0o.o0O0o000
    public final void OooOOO0() {
        this.f40338OooO0O0.setClientRole(2);
    }

    @Override // p445o0OoOo0o.o0O0o000
    public final int OooOOOO(@Nullable Set<Long> set) {
        ZegoLiveRoomEngine zegoLiveRoomEngine = this.f40338OooO0O0;
        if (zegoLiveRoomEngine != null) {
            return zegoLiveRoomEngine.setRemoteLiveUserSet(set);
        }
        return -1;
    }

    @Override // p445o0OoOo0o.o0O0o000
    public final void OooOOOo() {
        ZegoLiveRoomEngine zegoLiveRoomEngine = this.f40338OooO0O0;
        if (zegoLiveRoomEngine != null) {
            zegoLiveRoomEngine.leaveChannel();
        }
    }

    @Override // p445o0OoOo0o.o0O0o000
    public final synchronized boolean OooOOo(long j) {
        if (this.f40341OooO0o0.indexOfKey(j) <= -1) {
            return false;
        }
        return ((Boolean) this.f40341OooO0o0.get(j)).booleanValue();
    }

    @Override // p445o0OoOo0o.o0O0o000
    public final int OooOOo0() {
        ZegoLiveRoomEngine zegoLiveRoomEngine = this.f40338OooO0O0;
        if (zegoLiveRoomEngine != null) {
            return zegoLiveRoomEngine.stopAudioMixing(false);
        }
        return -1;
    }

    @Override // p445o0OoOo0o.o0O0o000
    public final int OooOOoo(String str) {
        return this.f40338OooO0O0.renewToken(str);
    }

    @Override // p445o0OoOo0o.o0O0o000
    public final int OooOo() {
        ZegoLiveRoomEngine zegoLiveRoomEngine = this.f40338OooO0O0;
        if (zegoLiveRoomEngine != null) {
            return zegoLiveRoomEngine.resumeAudioMixing();
        }
        return -1;
    }

    @Override // p445o0OoOo0o.o0O0o000
    public final void OooOo0(boolean z) {
        ZegoLiveRoomEngine zegoLiveRoomEngine = this.f40338OooO0O0;
        if (zegoLiveRoomEngine != null) {
            zegoLiveRoomEngine.muteLocalAudioStream(z);
            this.f40338OooO0O0.enableLocalAudio(!z);
        }
    }

    @Override // p445o0OoOo0o.o0O0o000
    public final void OooOo00(int i, boolean z) {
        ZegoLiveRoomEngine zegoLiveRoomEngine = this.f40338OooO0O0;
        if (zegoLiveRoomEngine != null) {
            zegoLiveRoomEngine.muteRemoteAudioStream(i, z);
        }
    }

    @Override // p445o0OoOo0o.o0O0o000
    public final void OooOo0O(o00O0OO o00o0oo2) {
        this.f40340OooO0Oo = o00o0oo2;
    }

    @Override // p445o0OoOo0o.o0O0o000
    public final void OooOo0o(boolean z) {
        ZegoLiveRoomEngine zegoLiveRoomEngine = this.f40338OooO0O0;
        if (zegoLiveRoomEngine != null) {
            zegoLiveRoomEngine.setEnableSpeakerphone(z);
        }
    }

    @Override // p445o0OoOo0o.o0O0o000
    public final String OooOoO0() {
        return this.f40338OooO0O0 != null ? ZegoLiveRoomEngine.getSdkVersion() : "";
    }
}
