package p352o0OOOo0o;

import android.content.Context;
import android.util.Log;
import android.util.LongSparseArray;
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
import p348o0OOOo.OooO0o;
import p351o0OOOo0O.OooOO0;
import p353o0OOOoO.o0OOO0o;
import p354o0OOOoO0.OooOOO;
import p354o0OOOoO0.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOO0O implements OooOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public OooO0o f43712OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public RtcEngine f43713OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public LongSparseArray f43714OooO0OO = new LongSparseArray();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f43715OooO0Oo = false;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f43717OooO0o0 = false;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final HashSet<Integer> f43716OooO0o = new HashSet<>();

    public class OooO00o extends IRtcEngineEventHandler {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f43718OooO00o = OooO00o.class.getSimpleName();

        public OooO00o() {
        }

        @Override // io.agora.rtc.IRtcEngineEventHandler
        public final void onAudioMixingFinished() {
        }

        @Override // io.agora.rtc.IRtcEngineEventHandler
        public final void onAudioMixingStateChanged(int i, int i2) {
            super.onAudioMixingStateChanged(i, i2);
            OooO0o oooO0o = OooOO0O.this.f43712OooO00o;
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
            OooOO0O oooOO0O = OooOO0O.this;
            if (oooOO0O.f43712OooO00o != null) {
                OooOOO[] oooOOOArr = new OooOOO[audioVolumeInfoArr.length];
                for (int i2 = 0; i2 < audioVolumeInfoArr.length; i2++) {
                    IRtcEngineEventHandler.AudioVolumeInfo audioVolumeInfo = audioVolumeInfoArr[i2];
                    OooOOO oooOOO = new OooOOO();
                    oooOOO.f43721OooO00o = audioVolumeInfo.uid;
                    oooOOO.f43723OooO0OO = audioVolumeInfo.vad;
                    oooOOO.f43722OooO0O0 = audioVolumeInfo.volume;
                    oooOOOArr[i2] = oooOOO;
                }
                oooOO0O.f43712OooO00o.OooO00o(oooOOOArr);
            }
        }

        @Override // io.agora.rtc.IRtcEngineEventHandler
        public final void onConnectionInterrupted() {
            Log.e(this.f43718OooO00o, "onConnectionInterrupted");
        }

        @Override // io.agora.rtc.IRtcEngineEventHandler
        public final void onConnectionLost() {
            Log.e(this.f43718OooO00o, "onConnectionLost");
            OooO0o oooO0o = OooOO0O.this.f43712OooO00o;
            if (oooO0o != null) {
                oooO0o.OooO0OO();
            }
        }

        @Override // io.agora.rtc.IRtcEngineEventHandler
        public final void onConnectionStateChanged(int i, int i2) {
            OooO0o oooO0o = OooOO0O.this.f43712OooO00o;
            if (oooO0o != null) {
                oooO0o.OooO0Oo(i);
            }
        }

        @Override // io.agora.rtc.IRtcEngineEventHandler
        public final void onError(int i) {
            Log.e(this.f43718OooO00o, android.support.v4.media.OooO00o.OooO00o("onError ", i));
            OooO0o oooO0o = OooOO0O.this.f43712OooO00o;
            if (oooO0o != null) {
                RtcEngine.getErrorDescription(i);
                oooO0o.onError();
            }
        }

        @Override // io.agora.rtc.IRtcEngineEventHandler
        public final void onJoinChannelSuccess(String str, int i, int i2) {
            StringBuilder sbOooO00o = o0OoOo0.OooO00o("onJoinChannelSuccess ", str, ZegoConstants.ZegoVideoDataAuxPublishingStream);
            long j = i;
            sbOooO00o.append(4294967295L & j);
            sbOooO00o.append(ZegoConstants.ZegoVideoDataAuxPublishingStream);
            sbOooO00o.append(i2);
            Log.e(this.f43718OooO00o, sbOooO00o.toString());
            OooO0o oooO0o = OooOO0O.this.f43712OooO00o;
            if (oooO0o != null) {
                oooO0o.OooO0o0(str, j, i2);
            }
        }

        @Override // io.agora.rtc.IRtcEngineEventHandler
        public final void onLastmileQuality(int i) {
            Log.e(this.f43718OooO00o, "onLastmileQuality " + i);
        }

        @Override // io.agora.rtc.IRtcEngineEventHandler
        public final void onLeaveChannel(IRtcEngineEventHandler.RtcStats rtcStats) {
        }

        @Override // io.agora.rtc.IRtcEngineEventHandler
        public final void onNetworkQuality(int i, int i2, int i3) {
            super.onNetworkQuality(i, i2, i3);
            OooO0o oooO0o = OooOO0O.this.f43712OooO00o;
            if (oooO0o != null) {
                oooO0o.OooO0oo();
            }
        }

        @Override // io.agora.rtc.IRtcEngineEventHandler
        public final void onNetworkTypeChanged(int i) {
            super.onNetworkTypeChanged(i);
            OooO0o oooO0o = OooOO0O.this.f43712OooO00o;
            if (oooO0o != null) {
                oooO0o.OooO0o();
            }
        }

        @Override // io.agora.rtc.IRtcEngineEventHandler
        public final void onRejoinChannelSuccess(String str, int i, int i2) {
            StringBuilder sbOooO00o = o0OoOo0.OooO00o("onRejoinChannelSuccess ", str, ZegoConstants.ZegoVideoDataAuxPublishingStream);
            long j = i;
            sbOooO00o.append(4294967295L & j);
            sbOooO00o.append(ZegoConstants.ZegoVideoDataAuxPublishingStream);
            sbOooO00o.append(i2);
            Log.e(this.f43718OooO00o, sbOooO00o.toString());
            OooO0o oooO0o = OooOO0O.this.f43712OooO00o;
            if (oooO0o != null) {
                oooO0o.OooO0o0(str, j, i2);
            }
        }

        @Override // io.agora.rtc.IRtcEngineEventHandler
        public final void onRemoteAudioStats(IRtcEngineEventHandler.RemoteAudioStats remoteAudioStats) {
            o0OOO0o.OooO0O0("onRemoteAudioStats", "uid:" + remoteAudioStats.uid + "/quality:" + remoteAudioStats.quality + "/audioLossRate:" + remoteAudioStats.audioLossRate + "/networkTransportDelay:" + remoteAudioStats.networkTransportDelay + "/jitterBufferDelay:" + remoteAudioStats.jitterBufferDelay);
            OooO0o oooO0o = OooOO0O.this.f43712OooO00o;
            if (oooO0o != null) {
                oooO0o.OooO0O0();
            }
        }

        @Override // io.agora.rtc.IRtcEngineEventHandler
        public final void onRtcStats(IRtcEngineEventHandler.RtcStats rtcStats) {
        }

        @Override // io.agora.rtc.IRtcEngineEventHandler
        public final void onUserJoined(int i, int i2) {
            o0OOO0o.OooO00o(this.f43718OooO00o, "onUserJoined " + (((long) i) & 4294967295L));
            OooO0o oooO0o = OooOO0O.this.f43712OooO00o;
            if (oooO0o != null) {
                oooO0o.OooO0oO(i);
            }
        }

        @Override // io.agora.rtc.IRtcEngineEventHandler
        public final void onUserOffline(int i, int i2) {
            o0OOO0o.OooO00o(this.f43718OooO00o, "onUserOffline " + (((long) i) & 4294967295L) + ZegoConstants.ZegoVideoDataAuxPublishingStream + i2);
            OooO0o oooO0o = OooOO0O.this.f43712OooO00o;
            if (oooO0o != null) {
                oooO0o.OooOO0O();
            }
        }

        @Override // io.agora.rtc.IRtcEngineEventHandler
        public final void onWarning(int i) {
            Log.e(this.f43718OooO00o, android.support.v4.media.OooO00o.OooO00o("onWarning ", i));
            OooO0o oooO0o = OooOO0O.this.f43712OooO00o;
            if (oooO0o != null) {
                oooO0o.OooOO0();
            }
        }
    }

    @Override // p351o0OOOo0O.OooOO0
    public final void OooO() {
        o0OOO0o.OooO00o("AgoraAudioChatService", "onMic");
        this.f43715OooO0Oo = true;
        RtcEngine rtcEngine = this.f43713OooO0O0;
        if (rtcEngine != null) {
            rtcEngine.muteLocalAudioStream(false);
        }
    }

    @Override // p351o0OOOo0O.OooOO0
    public final void OooO00o(Context context, boolean z) {
        this.f43716OooO0o.clear();
        this.f43717OooO0o0 = false;
        try {
            RtcEngine rtcEngineCreate = RtcEngine.create(context.getApplicationContext(), "2dd67ae91c91451d93ff65ecfa5eb4ab", new OooO00o());
            this.f43713OooO0O0 = rtcEngineCreate;
            rtcEngineCreate.setDefaultAudioRoutetoSpeakerphone(true);
            this.f43713OooO0O0.setChannelProfile(0);
            this.f43713OooO0O0.setAudioProfile(1, 1);
            this.f43713OooO0O0.enableAudioVolumeIndication(1000, 3, true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // p351o0OOOo0O.OooOO0
    public final int OooO0O0() {
        RtcEngine rtcEngine = this.f43713OooO0O0;
        if (rtcEngine != null) {
            return rtcEngine.getAudioMixingCurrentPosition();
        }
        return -1;
    }

    @Override // p351o0OOOo0O.OooOO0
    public final int OooO0OO() {
        RtcEngine rtcEngine = this.f43713OooO0O0;
        if (rtcEngine != null) {
            return rtcEngine.pauseAudioMixing();
        }
        return -1;
    }

    @Override // p351o0OOOo0O.OooOO0
    public final void OooO0Oo() {
        o0OOO0o.OooO00o("AgoraAudioChatService", "leaveChannel");
        this.f43714OooO0OO = new LongSparseArray();
        RtcEngine rtcEngine = this.f43713OooO0O0;
        if (rtcEngine != null) {
            rtcEngine.leaveChannel();
        }
    }

    @Override // p351o0OOOo0O.OooOO0
    public final void OooO0o(int i, boolean z) {
        if (this.f43713OooO0O0 != null) {
            HashSet<Integer> hashSet = this.f43716OooO0o;
            if (z) {
                hashSet.add(Integer.valueOf(i));
            } else {
                hashSet.remove(Integer.valueOf(i));
            }
            if (!this.f43717OooO0o0 || z) {
                this.f43713OooO0O0.muteRemoteAudioStream(i, z);
            }
        }
    }

    @Override // p351o0OOOo0O.OooOO0
    public final int OooO0o0(String str) {
        RtcEngine rtcEngine = this.f43713OooO0O0;
        if (rtcEngine != null) {
            return rtcEngine.renewToken(str);
        }
        return -1;
    }

    @Override // p351o0OOOo0O.OooOO0
    public final void OooO0oO(boolean z) {
        RtcEngine rtcEngine = this.f43713OooO0O0;
        if (rtcEngine != null) {
            rtcEngine.setEnableSpeakerphone(z);
        }
    }

    @Override // p351o0OOOo0O.OooOO0
    public final int OooO0oo() {
        RtcEngine rtcEngine = this.f43713OooO0O0;
        if (rtcEngine != null) {
            return rtcEngine.resumeAudioMixing();
        }
        return -1;
    }

    @Override // p351o0OOOo0O.OooOO0
    public final int OooOO0(int i) {
        RtcEngine rtcEngine = this.f43713OooO0O0;
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

    @Override // p351o0OOOo0O.OooOO0
    public final int OooOO0O(int i) {
        RtcEngine rtcEngine = this.f43713OooO0O0;
        if (rtcEngine != null) {
            return rtcEngine.adjustAudioMixingVolume(i);
        }
        return -1;
    }

    @Override // p351o0OOOo0O.OooOO0
    public final int OooOO0o(String str) {
        RtcEngine rtcEngine = this.f43713OooO0O0;
        if (rtcEngine != null) {
            return rtcEngine.startAudioMixing(str, false, false, 1);
        }
        return -1;
    }

    @Override // p351o0OOOo0O.OooOO0
    public final void OooOOO(RoomLiveService.OooO0O0 oooO0O0) {
        this.f43712OooO00o = oooO0O0;
    }

    @Override // p351o0OOOo0O.OooOO0
    public final int OooOOO0() {
        RtcEngine rtcEngine = this.f43713OooO0O0;
        if (rtcEngine != null) {
            return rtcEngine.getAudioMixingDuration();
        }
        return -1;
    }

    @Override // p351o0OOOo0O.OooOO0
    public final void OooOOOO(boolean z) {
        this.f43717OooO0o0 = z;
        RtcEngine rtcEngine = this.f43713OooO0O0;
        if (rtcEngine != null) {
            rtcEngine.muteAllRemoteAudioStreams(z);
            if (z) {
                return;
            }
            Iterator<Integer> it = this.f43716OooO0o.iterator();
            while (it.hasNext()) {
                this.f43713OooO0O0.muteRemoteAudioStream(it.next().intValue(), true);
            }
        }
    }

    @Override // p351o0OOOo0O.OooOO0
    public final int OooOOOo(int i) {
        RtcEngine rtcEngine = this.f43713OooO0O0;
        if (rtcEngine != null) {
            return rtcEngine.setAudioMixingPosition(i);
        }
        return -1;
    }

    @Override // p351o0OOOo0O.OooOO0
    public final synchronized void OooOOo(long j) {
        this.f43714OooO0OO.put(j, Boolean.TRUE);
    }

    @Override // p351o0OOOo0O.OooOO0
    public final void OooOOo0() {
        o0OOO0o.OooO00o("AgoraAudioChatService", "offMic");
        this.f43715OooO0Oo = false;
        RtcEngine rtcEngine = this.f43713OooO0O0;
        if (rtcEngine != null) {
            rtcEngine.muteLocalAudioStream(true);
        }
    }

    @Override // p351o0OOOo0O.OooOO0
    public final int OooOOoo(@Nullable Set<Long> set) {
        return 0;
    }

    @Override // p351o0OOOo0O.OooOO0
    public final synchronized boolean OooOo0(long j) {
        if (this.f43714OooO0OO.indexOfKey(j) <= -1) {
            return false;
        }
        return ((Boolean) this.f43714OooO0OO.get(j)).booleanValue();
    }

    @Override // p351o0OOOo0O.OooOO0
    public final int OooOo00() {
        RtcEngine rtcEngine = this.f43713OooO0O0;
        if (rtcEngine != null) {
            return rtcEngine.stopAudioMixing();
        }
        return -1;
    }

    @Override // p351o0OOOo0O.OooOO0
    public final void OooOo0O(boolean z) {
        o0OOO0o.OooO00o("AgoraAudioChatService", "muteLocalAudio = " + z);
        RtcEngine rtcEngine = this.f43713OooO0O0;
        if (rtcEngine == null || !this.f43715OooO0Oo) {
            return;
        }
        rtcEngine.muteLocalAudioStream(z);
    }

    @Override // p351o0OOOo0O.OooOO0
    public final void OooOo0o(OooOOO0 oooOOO0, boolean z, boolean z2) {
        o0OOO0o.OooO00o("AgoraAudioChatService", "joinChannel isMuteLocalAudio = " + z);
        RtcEngine rtcEngine = this.f43713OooO0O0;
        if (rtcEngine != null) {
            rtcEngine.joinChannel(oooOOO0.f43724OooO00o, oooOOO0.f43726OooO0OO, String.valueOf(oooOOO0.f43728OooO0o0), Integer.parseInt(String.valueOf(oooOOO0.f43727OooO0Oo)));
            OooO0oO(z2);
        }
    }

    @Override // p351o0OOOo0O.OooOO0
    public final String getSdkVersion() {
        return this.f43713OooO0O0 != null ? RtcEngine.getSdkVersion() : "";
    }

    @Override // p351o0OOOo0O.OooOO0
    public final void unregister() {
    }
}
