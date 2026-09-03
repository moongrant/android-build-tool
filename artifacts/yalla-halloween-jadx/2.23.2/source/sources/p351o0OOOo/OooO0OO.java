package p351o0OOOo;

import android.content.Context;
import android.util.Log;
import android.util.LongSparseArray;
import com.android.billingclient.api.o0000O0O;
import com.yalla.yalla.service.room.RoomLiveService;
import com.zego.zegoavkit2.ZegoConstants;
import io.agora.rtc.Constants;
import io.agora.rtc.IRtcEngineEventHandler;
import io.agora.rtc.RtcEngine;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.jetbrains.annotations.Nullable;
import p004OooO0oO.o0OoOo0;
import p355o0OOOo0o.OooO;
import p356o0OOOoO.OooOo;
import p356o0OOOoO.Oooo000;
import p357o0OOOoO0.OooO0o;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0OO implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public OooO0o f42858OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public RtcEngine f42859OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public LongSparseArray f42860OooO0OO = new LongSparseArray();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f42861OooO0Oo = false;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f42863OooO0o0 = false;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final HashSet<Integer> f42862OooO0o = new HashSet<>();

    public class OooO00o extends IRtcEngineEventHandler {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f42864OooO00o = OooO00o.class.getSimpleName();

        public OooO00o() {
        }

        @Override // io.agora.rtc.IRtcEngineEventHandler
        public final void onAudioMixingFinished() {
        }

        @Override // io.agora.rtc.IRtcEngineEventHandler
        public final void onAudioMixingStateChanged(int i, int i2) {
            super.onAudioMixingStateChanged(i, i2);
            OooO0o oooO0o = OooO0OO.this.f42858OooO00o;
            if (oooO0o != null) {
                oooO0o.OooO(i, i2);
            }
        }

        @Override // io.agora.rtc.IRtcEngineEventHandler
        public final void onAudioQuality(int i, int i2, short s, short s2) {
        }

        @Override // io.agora.rtc.IRtcEngineEventHandler
        public final void onAudioVolumeIndication(IRtcEngineEventHandler.AudioVolumeInfo[] audioVolumeInfoArr, int i) {
            if (audioVolumeInfoArr == null) {
                return;
            }
            OooO0OO oooO0OO = OooO0OO.this;
            if (oooO0OO.f42858OooO00o != null) {
                Oooo000[] oooo000Arr = new Oooo000[audioVolumeInfoArr.length];
                for (int i2 = 0; i2 < audioVolumeInfoArr.length; i2++) {
                    IRtcEngineEventHandler.AudioVolumeInfo audioVolumeInfo = audioVolumeInfoArr[i2];
                    Oooo000 oooo000 = new Oooo000();
                    oooo000.f42913OooO00o = audioVolumeInfo.uid;
                    oooo000.f42915OooO0OO = audioVolumeInfo.vad;
                    oooo000.f42914OooO0O0 = audioVolumeInfo.volume;
                    oooo000Arr[i2] = oooo000;
                }
                oooO0OO.f42858OooO00o.OooO0O0(oooo000Arr);
            }
        }

        @Override // io.agora.rtc.IRtcEngineEventHandler
        public final void onConnectionInterrupted() {
            Log.e(this.f42864OooO00o, "onConnectionInterrupted");
        }

        @Override // io.agora.rtc.IRtcEngineEventHandler
        public final void onConnectionLost() {
            Log.e(this.f42864OooO00o, "onConnectionLost");
            OooO0o oooO0o = OooO0OO.this.f42858OooO00o;
            if (oooO0o != null) {
                oooO0o.OooO0OO();
            }
        }

        @Override // io.agora.rtc.IRtcEngineEventHandler
        public final void onConnectionStateChanged(int i, int i2) {
            OooO0o oooO0o = OooO0OO.this.f42858OooO00o;
            if (oooO0o != null) {
                oooO0o.OooO0Oo(i);
            }
        }

        @Override // io.agora.rtc.IRtcEngineEventHandler
        public final void onError(int i) {
            Log.e(this.f42864OooO00o, android.support.v4.media.OooO00o.OooO00o("onError ", i));
            OooO0o oooO0o = OooO0OO.this.f42858OooO00o;
            if (oooO0o != null) {
                RtcEngine.getErrorDescription(i);
                oooO0o.onError();
            }
        }

        @Override // io.agora.rtc.IRtcEngineEventHandler
        public final void onJoinChannelSuccess(String str, int i, int i2) {
            StringBuilder sbOooO0O0 = o0OoOo0.OooO0O0("onJoinChannelSuccess ", str, ZegoConstants.ZegoVideoDataAuxPublishingStream);
            long j = i;
            sbOooO0O0.append(4294967295L & j);
            sbOooO0O0.append(ZegoConstants.ZegoVideoDataAuxPublishingStream);
            sbOooO0O0.append(i2);
            Log.e(this.f42864OooO00o, sbOooO0O0.toString());
            OooO0o oooO0o = OooO0OO.this.f42858OooO00o;
            if (oooO0o != null) {
                oooO0o.OooO0o0(str, j, i2);
            }
        }

        @Override // io.agora.rtc.IRtcEngineEventHandler
        public final void onLastmileQuality(int i) {
            Log.e(this.f42864OooO00o, "onLastmileQuality " + i);
        }

        @Override // io.agora.rtc.IRtcEngineEventHandler
        public final void onLeaveChannel(IRtcEngineEventHandler.RtcStats rtcStats) {
        }

        @Override // io.agora.rtc.IRtcEngineEventHandler
        public final void onNetworkQuality(int i, int i2, int i3) {
            super.onNetworkQuality(i, i2, i3);
            OooO0o oooO0o = OooO0OO.this.f42858OooO00o;
            if (oooO0o != null) {
                oooO0o.OooO0oo();
            }
        }

        @Override // io.agora.rtc.IRtcEngineEventHandler
        public final void onNetworkTypeChanged(int i) {
            super.onNetworkTypeChanged(i);
            OooO0o oooO0o = OooO0OO.this.f42858OooO00o;
            if (oooO0o != null) {
                oooO0o.OooO0o();
            }
        }

        @Override // io.agora.rtc.IRtcEngineEventHandler
        public final void onRejoinChannelSuccess(String str, int i, int i2) {
            StringBuilder sbOooO0O0 = o0OoOo0.OooO0O0("onRejoinChannelSuccess ", str, ZegoConstants.ZegoVideoDataAuxPublishingStream);
            long j = i;
            sbOooO0O0.append(4294967295L & j);
            sbOooO0O0.append(ZegoConstants.ZegoVideoDataAuxPublishingStream);
            sbOooO0O0.append(i2);
            Log.e(this.f42864OooO00o, sbOooO0O0.toString());
            OooO0o oooO0o = OooO0OO.this.f42858OooO00o;
            if (oooO0o != null) {
                oooO0o.OooO0o0(str, j, i2);
            }
        }

        @Override // io.agora.rtc.IRtcEngineEventHandler
        public final void onRemoteAudioStats(IRtcEngineEventHandler.RemoteAudioStats remoteAudioStats) {
            o0000O0O.OooO0Oo("onRemoteAudioStats", "uid:" + remoteAudioStats.uid + "/quality:" + remoteAudioStats.quality + "/audioLossRate:" + remoteAudioStats.audioLossRate + "/networkTransportDelay:" + remoteAudioStats.networkTransportDelay + "/jitterBufferDelay:" + remoteAudioStats.jitterBufferDelay);
            OooO0o oooO0o = OooO0OO.this.f42858OooO00o;
            if (oooO0o != null) {
                oooO0o.OooO00o();
            }
        }

        @Override // io.agora.rtc.IRtcEngineEventHandler
        public final void onRtcStats(IRtcEngineEventHandler.RtcStats rtcStats) {
        }

        @Override // io.agora.rtc.IRtcEngineEventHandler
        public final void onUserJoined(int i, int i2) {
            o0000O0O.OooO0OO(this.f42864OooO00o, "onUserJoined " + (((long) i) & 4294967295L));
            OooO0o oooO0o = OooO0OO.this.f42858OooO00o;
            if (oooO0o != null) {
                oooO0o.OooO0oO(i);
            }
        }

        @Override // io.agora.rtc.IRtcEngineEventHandler
        public final void onUserOffline(int i, int i2) {
            o0000O0O.OooO0OO(this.f42864OooO00o, "onUserOffline " + (((long) i) & 4294967295L) + ZegoConstants.ZegoVideoDataAuxPublishingStream + i2);
            OooO0o oooO0o = OooO0OO.this.f42858OooO00o;
            if (oooO0o != null) {
                oooO0o.OooOO0O();
            }
        }

        @Override // io.agora.rtc.IRtcEngineEventHandler
        public final void onWarning(int i) {
            Log.e(this.f42864OooO00o, android.support.v4.media.OooO00o.OooO00o("onWarning ", i));
            OooO0o oooO0o = OooO0OO.this.f42858OooO00o;
            if (oooO0o != null) {
                oooO0o.OooOO0();
            }
        }
    }

    @Override // p355o0OOOo0o.OooO
    public final void OooO() {
        o0000O0O.OooO0OO("AgoraAudioChatService", "onMic");
        this.f42861OooO0Oo = true;
        RtcEngine rtcEngine = this.f42859OooO0O0;
        if (rtcEngine != null) {
            rtcEngine.muteLocalAudioStream(false);
        }
    }

    @Override // p355o0OOOo0o.OooO
    public final void OooO00o(Context context, boolean z) {
        this.f42862OooO0o.clear();
        this.f42863OooO0o0 = false;
        try {
            RtcEngine rtcEngineCreate = RtcEngine.create(context.getApplicationContext(), "2dd67ae91c91451d93ff65ecfa5eb4ab", new OooO00o());
            this.f42859OooO0O0 = rtcEngineCreate;
            rtcEngineCreate.setDefaultAudioRoutetoSpeakerphone(true);
            this.f42859OooO0O0.setChannelProfile(0);
            this.f42859OooO0O0.setAudioProfile(1, 1);
            this.f42859OooO0O0.enableAudioVolumeIndication(1000, 3, true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // p355o0OOOo0o.OooO
    public final int OooO0O0() {
        RtcEngine rtcEngine = this.f42859OooO0O0;
        if (rtcEngine != null) {
            return rtcEngine.getAudioMixingCurrentPosition();
        }
        return -1;
    }

    @Override // p355o0OOOo0o.OooO
    public final int OooO0OO() {
        RtcEngine rtcEngine = this.f42859OooO0O0;
        if (rtcEngine != null) {
            return rtcEngine.pauseAudioMixing();
        }
        return -1;
    }

    @Override // p355o0OOOo0o.OooO
    public final void OooO0Oo() {
        o0000O0O.OooO0OO("AgoraAudioChatService", "leaveChannel");
        this.f42860OooO0OO = new LongSparseArray();
        RtcEngine rtcEngine = this.f42859OooO0O0;
        if (rtcEngine != null) {
            rtcEngine.leaveChannel();
        }
    }

    @Override // p355o0OOOo0o.OooO
    public final void OooO0o(int i, boolean z) {
        if (this.f42859OooO0O0 != null) {
            HashSet<Integer> hashSet = this.f42862OooO0o;
            if (z) {
                hashSet.add(Integer.valueOf(i));
            } else {
                hashSet.remove(Integer.valueOf(i));
            }
            if (!this.f42863OooO0o0 || z) {
                this.f42859OooO0O0.muteRemoteAudioStream(i, z);
            }
        }
    }

    @Override // p355o0OOOo0o.OooO
    public final int OooO0o0(String str) {
        RtcEngine rtcEngine = this.f42859OooO0O0;
        if (rtcEngine != null) {
            return rtcEngine.renewToken(str);
        }
        return -1;
    }

    @Override // p355o0OOOo0o.OooO
    public final void OooO0oO(boolean z) {
        RtcEngine rtcEngine = this.f42859OooO0O0;
        if (rtcEngine != null) {
            rtcEngine.setEnableSpeakerphone(z);
        }
    }

    @Override // p355o0OOOo0o.OooO
    public final int OooO0oo() {
        RtcEngine rtcEngine = this.f42859OooO0O0;
        if (rtcEngine != null) {
            return rtcEngine.resumeAudioMixing();
        }
        return -1;
    }

    @Override // p355o0OOOo0o.OooO
    public final int OooOO0(int i) {
        RtcEngine rtcEngine = this.f42859OooO0O0;
        if (rtcEngine == null) {
            return -1;
        }
        if (i == 0) {
            i = 0;
        } else if (i == 1) {
            i = Constants.VOICE_CHANGER_EFFECT_OLDMAN;
        } else if (i == 2) {
            i = Constants.VOICE_CHANGER_EFFECT_BOY;
        } else if (i == 3) {
            i = Constants.VOICE_CHANGER_EFFECT_GIRL;
        } else if (i == 5) {
            i = Constants.VOICE_CHANGER_EFFECT_PIGKING;
        } else if (i == 6) {
            i = Constants.VOICE_CHANGER_EFFECT_HULK;
        }
        return rtcEngine.setAudioEffectPreset(i);
    }

    @Override // p355o0OOOo0o.OooO
    public final void OooOO0O(OooOo oooOo, boolean z, boolean z2) {
        o0000O0O.OooO0OO("AgoraAudioChatService", "joinChannel isMuteLocalAudio = " + z);
        RtcEngine rtcEngine = this.f42859OooO0O0;
        if (rtcEngine != null) {
            rtcEngine.joinChannel(oooOo.f42908OooO00o, oooOo.f42910OooO0OO, String.valueOf(oooOo.f42912OooO0o0), Integer.parseInt(String.valueOf(oooOo.f42911OooO0Oo)));
            OooO0oO(z2);
        }
    }

    @Override // p355o0OOOo0o.OooO
    public final int OooOO0o(int i) {
        RtcEngine rtcEngine = this.f42859OooO0O0;
        if (rtcEngine != null) {
            return rtcEngine.adjustAudioMixingVolume(i);
        }
        return -1;
    }

    @Override // p355o0OOOo0o.OooO
    public final int OooOOO() {
        RtcEngine rtcEngine = this.f42859OooO0O0;
        if (rtcEngine != null) {
            return rtcEngine.getAudioMixingDuration();
        }
        return -1;
    }

    @Override // p355o0OOOo0o.OooO
    public final int OooOOO0(String str) {
        RtcEngine rtcEngine = this.f42859OooO0O0;
        if (rtcEngine != null) {
            return rtcEngine.startAudioMixing(str, false, false, 1);
        }
        return -1;
    }

    @Override // p355o0OOOo0o.OooO
    public final void OooOOOO(RoomLiveService.OooO0O0 oooO0O0) {
        this.f42858OooO00o = oooO0O0;
    }

    @Override // p355o0OOOo0o.OooO
    public final void OooOOOo(boolean z) {
        this.f42863OooO0o0 = z;
        RtcEngine rtcEngine = this.f42859OooO0O0;
        if (rtcEngine != null) {
            rtcEngine.muteAllRemoteAudioStreams(z);
            if (z) {
                return;
            }
            Iterator<Integer> it = this.f42862OooO0o.iterator();
            while (it.hasNext()) {
                this.f42859OooO0O0.muteRemoteAudioStream(it.next().intValue(), true);
            }
        }
    }

    @Override // p355o0OOOo0o.OooO
    public final void OooOOo() {
        o0000O0O.OooO0OO("AgoraAudioChatService", "offMic");
        this.f42861OooO0Oo = false;
        RtcEngine rtcEngine = this.f42859OooO0O0;
        if (rtcEngine != null) {
            rtcEngine.muteLocalAudioStream(true);
        }
    }

    @Override // p355o0OOOo0o.OooO
    public final int OooOOo0(int i) {
        RtcEngine rtcEngine = this.f42859OooO0O0;
        if (rtcEngine != null) {
            return rtcEngine.setAudioMixingPosition(i);
        }
        return -1;
    }

    @Override // p355o0OOOo0o.OooO
    public final synchronized void OooOOoo(long j) {
        this.f42860OooO0OO.put(j, Boolean.TRUE);
    }

    @Override // p355o0OOOo0o.OooO
    public final int OooOo0() {
        RtcEngine rtcEngine = this.f42859OooO0O0;
        if (rtcEngine != null) {
            return rtcEngine.stopAudioMixing();
        }
        return -1;
    }

    @Override // p355o0OOOo0o.OooO
    public final int OooOo00(@Nullable Set<Long> set) {
        return 0;
    }

    @Override // p355o0OOOo0o.OooO
    public final synchronized boolean OooOo0O(long j) {
        if (this.f42860OooO0OO.indexOfKey(j) <= -1) {
            return false;
        }
        return ((Boolean) this.f42860OooO0OO.get(j)).booleanValue();
    }

    @Override // p355o0OOOo0o.OooO
    public final void OooOo0o(boolean z) {
        o0000O0O.OooO0OO("AgoraAudioChatService", "muteLocalAudio = " + z);
        RtcEngine rtcEngine = this.f42859OooO0O0;
        if (rtcEngine == null || !this.f42861OooO0Oo) {
            return;
        }
        rtcEngine.muteLocalAudioStream(z);
    }

    @Override // p355o0OOOo0o.OooO
    public final String getSdkVersion() {
        return this.f42859OooO0O0 != null ? RtcEngine.getSdkVersion() : "";
    }

    @Override // p355o0OOOo0o.OooO
    public final void unregister() {
    }
}
