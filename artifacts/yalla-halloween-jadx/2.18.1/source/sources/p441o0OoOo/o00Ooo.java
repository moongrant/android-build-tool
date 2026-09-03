package p441o0OoOo;

import OooO0o.OooO0o;
import android.content.Context;
import android.util.Log;
import android.util.LongSparseArray;
import com.app.base.mixedroom.MixedRoomActivity;
import com.yalla.yalla.common.statistical.event.RoomEventType;
import com.yalla.yalla.common.statistical.net.FLog;
import com.zego.zegoavkit2.ZegoConstants;
import io.agora.rtc.Constants;
import io.agora.rtc.IRtcEngineEventHandler;
import io.agora.rtc.RtcEngine;
import java.util.Objects;
import java.util.Set;
import o00OO.OooO0OO;
import org.jetbrains.annotations.Nullable;
import p159o00OoOO.o000OOo0;
import p445o0OoOo0o.o0O0o000;
import p447o0OoOoO0.o00O0OO;
import p450o0OoOoo.o00;
import p451o0OoOoo0.o00O0OOO;
import p451o0OoOoo0.oo0oOO0;
import p515o0o0O00.o00O00;

/* JADX INFO: loaded from: classes2.dex */
public final class o00Ooo implements o0O0o000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public o00O0OO f40202OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public RtcEngine f40203OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public LongSparseArray f40204OooO0OO = new LongSparseArray();

    public class OooO00o extends IRtcEngineEventHandler {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f40205OooO00o = OooO00o.class.getSimpleName();

        public OooO00o() {
        }

        @Override // io.agora.rtc.IRtcEngineEventHandler
        public final void onAudioMixingFinished() {
        }

        @Override // io.agora.rtc.IRtcEngineEventHandler
        public final void onAudioMixingStateChanged(int i, int i2) {
            super.onAudioMixingStateChanged(i, i2);
            o00O0OO o00o0oo2 = o00Ooo.this.f40202OooO00o;
            if (o00o0oo2 != null) {
                ((o000OOo0) o00o0oo2).OooO00o(i, i2);
            }
        }

        @Override // io.agora.rtc.IRtcEngineEventHandler
        public final void onAudioQuality(int i, int i2, short s, short s2) {
        }

        @Override // io.agora.rtc.IRtcEngineEventHandler
        public final void onAudioVolumeIndication(IRtcEngineEventHandler.AudioVolumeInfo[] audioVolumeInfoArr, int i) {
            if (audioVolumeInfoArr == null || o00Ooo.this.f40202OooO00o == null) {
                return;
            }
            oo0oOO0[] oo0ooo0Arr = new oo0oOO0[audioVolumeInfoArr.length];
            for (int i2 = 0; i2 < audioVolumeInfoArr.length; i2++) {
                IRtcEngineEventHandler.AudioVolumeInfo audioVolumeInfo = audioVolumeInfoArr[i2];
                oo0oOO0 oo0ooo0 = new oo0oOO0();
                oo0ooo0.f40334OooO00o = audioVolumeInfo.uid;
                oo0ooo0.f40336OooO0OO = audioVolumeInfo.vad;
                oo0ooo0.f40335OooO0O0 = audioVolumeInfo.volume;
                oo0ooo0Arr[i2] = oo0ooo0;
            }
            ((o000OOo0) o00Ooo.this.f40202OooO00o).OooO0O0(oo0ooo0Arr);
        }

        @Override // io.agora.rtc.IRtcEngineEventHandler
        public final void onConnectionInterrupted() {
            Log.e(this.f40205OooO00o, "onConnectionInterrupted");
        }

        @Override // io.agora.rtc.IRtcEngineEventHandler
        public final void onConnectionLost() {
            Log.e(this.f40205OooO00o, "onConnectionLost");
            o00O0OO o00o0oo2 = o00Ooo.this.f40202OooO00o;
            if (o00o0oo2 != null) {
                Objects.requireNonNull((o000OOo0) o00o0oo2);
                FLog.INSTANCE.roomLog(RoomEventType.Agore_connectionFailed, null);
            }
        }

        @Override // io.agora.rtc.IRtcEngineEventHandler
        public final void onConnectionStateChanged(int i, int i2) {
            OooO0OO<MixedRoomActivity> oooO0OO;
            o00O0OO o00o0oo2 = o00Ooo.this.f40202OooO00o;
            if (o00o0oo2 != null) {
                o000OOo0 o000ooo1 = (o000OOo0) o00o0oo2;
                Objects.requireNonNull(o000ooo1);
                o00O00.OooO0OO("MixedRoomService", "onConnectionStateChanged: audioType=>0,state=>" + i + ",reason=>" + i2);
                if ((i == 8 || i == 9) && (oooO0OO = o000ooo1.f32462OooO00o.f11832OoooO) != null) {
                    oooO0OO.obtainMessage(6).sendToTarget();
                }
            }
        }

        @Override // io.agora.rtc.IRtcEngineEventHandler
        public final void onError(int i) {
            Log.e(this.f40205OooO00o, "onError " + i);
            o00O0OO o00o0oo2 = o00Ooo.this.f40202OooO00o;
            if (o00o0oo2 != null) {
                RtcEngine.getErrorDescription(i);
                Objects.requireNonNull(o00o0oo2);
            }
        }

        @Override // io.agora.rtc.IRtcEngineEventHandler
        public final void onJoinChannelSuccess(String str, int i, int i2) {
            String str2 = this.f40205OooO00o;
            StringBuilder sbOooO0OO = OooO0o.OooO0OO("onJoinChannelSuccess ", str, ZegoConstants.ZegoVideoDataAuxPublishingStream);
            long j = i;
            sbOooO0OO.append(4294967295L & j);
            sbOooO0OO.append(ZegoConstants.ZegoVideoDataAuxPublishingStream);
            sbOooO0OO.append(i2);
            Log.e(str2, sbOooO0OO.toString());
            o00O0OO o00o0oo2 = o00Ooo.this.f40202OooO00o;
            if (o00o0oo2 != null) {
                ((o000OOo0) o00o0oo2).OooO0OO(str, j);
            }
        }

        @Override // io.agora.rtc.IRtcEngineEventHandler
        public final void onLastmileQuality(int i) {
            Log.e(this.f40205OooO00o, "onLastmileQuality " + i);
        }

        @Override // io.agora.rtc.IRtcEngineEventHandler
        public final void onLeaveChannel(IRtcEngineEventHandler.RtcStats rtcStats) {
        }

        @Override // io.agora.rtc.IRtcEngineEventHandler
        public final void onNetworkQuality(int i, int i2, int i3) {
            super.onNetworkQuality(i, i2, i3);
            o00O0OO o00o0oo2 = o00Ooo.this.f40202OooO00o;
            if (o00o0oo2 != null) {
                Objects.requireNonNull(o00o0oo2);
            }
        }

        @Override // io.agora.rtc.IRtcEngineEventHandler
        public final void onNetworkTypeChanged(int i) {
            super.onNetworkTypeChanged(i);
            o00O0OO o00o0oo2 = o00Ooo.this.f40202OooO00o;
            if (o00o0oo2 != null) {
                Objects.requireNonNull((o000OOo0) o00o0oo2);
                FLog.INSTANCE.roomLog(RoomEventType.Agore_networkChanged, i + "");
            }
        }

        @Override // io.agora.rtc.IRtcEngineEventHandler
        public final void onRejoinChannelSuccess(String str, int i, int i2) {
            String str2 = this.f40205OooO00o;
            StringBuilder sbOooO0OO = OooO0o.OooO0OO("onRejoinChannelSuccess ", str, ZegoConstants.ZegoVideoDataAuxPublishingStream);
            long j = i;
            sbOooO0OO.append(4294967295L & j);
            sbOooO0OO.append(ZegoConstants.ZegoVideoDataAuxPublishingStream);
            sbOooO0OO.append(i2);
            Log.e(str2, sbOooO0OO.toString());
            o00O0OO o00o0oo2 = o00Ooo.this.f40202OooO00o;
            if (o00o0oo2 != null) {
                ((o000OOo0) o00o0oo2).OooO0OO(str, j);
            }
        }

        @Override // io.agora.rtc.IRtcEngineEventHandler
        public final void onRemoteAudioStats(IRtcEngineEventHandler.RemoteAudioStats remoteAudioStats) {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("uid:");
            sbOooO0o0.append(remoteAudioStats.uid);
            sbOooO0o0.append("/quality:");
            sbOooO0o0.append(remoteAudioStats.quality);
            sbOooO0o0.append("/audioLossRate:");
            sbOooO0o0.append(remoteAudioStats.audioLossRate);
            sbOooO0o0.append("/networkTransportDelay:");
            sbOooO0o0.append(remoteAudioStats.networkTransportDelay);
            sbOooO0o0.append("/jitterBufferDelay:");
            sbOooO0o0.append(remoteAudioStats.jitterBufferDelay);
            o00.OooO0O0("onRemoteAudioStats", sbOooO0o0.toString());
            o00O0OO o00o0oo2 = o00Ooo.this.f40202OooO00o;
            if (o00o0oo2 != null) {
                Objects.requireNonNull(o00o0oo2);
            }
        }

        @Override // io.agora.rtc.IRtcEngineEventHandler
        public final void onRtcStats(IRtcEngineEventHandler.RtcStats rtcStats) {
        }

        @Override // io.agora.rtc.IRtcEngineEventHandler
        public final void onUserJoined(int i, int i2) {
            String str = this.f40205OooO00o;
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("onUserJoined ");
            sbOooO0o0.append(((long) i) & 4294967295L);
            o00.OooO00o(str, sbOooO0o0.toString());
            o00O0OO o00o0oo2 = o00Ooo.this.f40202OooO00o;
            if (o00o0oo2 != null) {
                ((o000OOo0) o00o0oo2).OooO0Oo(i);
            }
        }

        @Override // io.agora.rtc.IRtcEngineEventHandler
        public final void onUserOffline(int i, int i2) {
            String str = this.f40205OooO00o;
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("onUserOffline ");
            sbOooO0o0.append(((long) i) & 4294967295L);
            sbOooO0o0.append(ZegoConstants.ZegoVideoDataAuxPublishingStream);
            sbOooO0o0.append(i2);
            o00.OooO00o(str, sbOooO0o0.toString());
            o00O0OO o00o0oo2 = o00Ooo.this.f40202OooO00o;
            if (o00o0oo2 != null) {
                ((o000OOo0) o00o0oo2).OooO0o0(i);
            }
        }

        @Override // io.agora.rtc.IRtcEngineEventHandler
        public final void onWarning(int i) {
            Log.e(this.f40205OooO00o, "onWarning " + i);
            o00O0OO o00o0oo2 = o00Ooo.this.f40202OooO00o;
            if (o00o0oo2 != null) {
                Objects.requireNonNull(o00o0oo2);
            }
        }
    }

    @Override // p445o0OoOo0o.o0O0o000
    public final int OooO() {
        RtcEngine rtcEngine = this.f40203OooO0O0;
        if (rtcEngine != null) {
            return rtcEngine.getAudioMixingCurrentPosition();
        }
        return -1;
    }

    @Override // p445o0OoOo0o.o0O0o000
    public final void OooO00o() {
    }

    @Override // p445o0OoOo0o.o0O0o000
    public final void OooO0O0(o00O0OOO o00o0ooo2, boolean z) {
        RtcEngine rtcEngine = this.f40203OooO0O0;
        if (rtcEngine != null) {
            rtcEngine.joinChannel(o00o0ooo2.f40329OooO00o, o00o0ooo2.f40331OooO0OO, String.valueOf(o00o0ooo2.f40333OooO0o0), Integer.parseInt(String.valueOf(o00o0ooo2.f40332OooO0Oo)));
        }
    }

    @Override // p445o0OoOo0o.o0O0o000
    public final void OooO0OO() {
    }

    @Override // p445o0OoOo0o.o0O0o000
    public final int OooO0Oo(int i) {
        RtcEngine rtcEngine = this.f40203OooO0O0;
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

    @Override // p445o0OoOo0o.o0O0o000
    public final int OooO0o(String str) {
        RtcEngine rtcEngine = this.f40203OooO0O0;
        if (rtcEngine != null) {
            return rtcEngine.startAudioMixing(str, false, false, 1);
        }
        return -1;
    }

    @Override // p445o0OoOo0o.o0O0o000
    public final int OooO0o0(int i) {
        RtcEngine rtcEngine = this.f40203OooO0O0;
        if (rtcEngine != null) {
            return rtcEngine.adjustAudioMixingVolume(i);
        }
        return -1;
    }

    @Override // p445o0OoOo0o.o0O0o000
    public final int OooO0oO() {
        RtcEngine rtcEngine = this.f40203OooO0O0;
        if (rtcEngine != null) {
            return rtcEngine.getAudioMixingDuration();
        }
        return -1;
    }

    @Override // p445o0OoOo0o.o0O0o000
    public final void OooO0oo(Context context, boolean z) {
        try {
            RtcEngine rtcEngineCreate = RtcEngine.create(context.getApplicationContext(), "2dd67ae91c91451d93ff65ecfa5eb4ab", new OooO00o());
            this.f40203OooO0O0 = rtcEngineCreate;
            rtcEngineCreate.setDefaultAudioRoutetoSpeakerphone(true);
            this.f40203OooO0O0.setChannelProfile(0);
            this.f40203OooO0O0.setAudioProfile(1, 1);
            this.f40203OooO0O0.enableAudioVolumeIndication(1000, 3, true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // p445o0OoOo0o.o0O0o000
    public final void OooOO0(boolean z) {
        RtcEngine rtcEngine = this.f40203OooO0O0;
        if (rtcEngine != null) {
            rtcEngine.muteAllRemoteAudioStreams(z);
        }
    }

    @Override // p445o0OoOo0o.o0O0o000
    public final int OooOO0O(int i) {
        RtcEngine rtcEngine = this.f40203OooO0O0;
        if (rtcEngine != null) {
            return rtcEngine.setAudioMixingPosition(i);
        }
        return -1;
    }

    @Override // p445o0OoOo0o.o0O0o000
    public final int OooOO0o() {
        RtcEngine rtcEngine = this.f40203OooO0O0;
        if (rtcEngine != null) {
            return rtcEngine.pauseAudioMixing();
        }
        return -1;
    }

    @Override // p445o0OoOo0o.o0O0o000
    public final synchronized void OooOOO(long j) {
        this.f40204OooO0OO.put(j, Boolean.TRUE);
    }

    @Override // p445o0OoOo0o.o0O0o000
    public final void OooOOO0() {
    }

    @Override // p445o0OoOo0o.o0O0o000
    public final int OooOOOO(@Nullable Set<Long> set) {
        return 0;
    }

    @Override // p445o0OoOo0o.o0O0o000
    public final void OooOOOo() {
        this.f40204OooO0OO = new LongSparseArray();
        RtcEngine rtcEngine = this.f40203OooO0O0;
        if (rtcEngine != null) {
            rtcEngine.leaveChannel();
        }
    }

    @Override // p445o0OoOo0o.o0O0o000
    public final synchronized boolean OooOOo(long j) {
        if (this.f40204OooO0OO.indexOfKey(j) <= -1) {
            return false;
        }
        return ((Boolean) this.f40204OooO0OO.get(j)).booleanValue();
    }

    @Override // p445o0OoOo0o.o0O0o000
    public final int OooOOo0() {
        RtcEngine rtcEngine = this.f40203OooO0O0;
        if (rtcEngine != null) {
            return rtcEngine.stopAudioMixing();
        }
        return -1;
    }

    @Override // p445o0OoOo0o.o0O0o000
    public final int OooOOoo(String str) {
        RtcEngine rtcEngine = this.f40203OooO0O0;
        if (rtcEngine != null) {
            return rtcEngine.renewToken(str);
        }
        return -1;
    }

    @Override // p445o0OoOo0o.o0O0o000
    public final int OooOo() {
        RtcEngine rtcEngine = this.f40203OooO0O0;
        if (rtcEngine != null) {
            return rtcEngine.resumeAudioMixing();
        }
        return -1;
    }

    @Override // p445o0OoOo0o.o0O0o000
    public final void OooOo0(boolean z) {
        RtcEngine rtcEngine = this.f40203OooO0O0;
        if (rtcEngine != null) {
            rtcEngine.muteLocalAudioStream(z);
        }
    }

    @Override // p445o0OoOo0o.o0O0o000
    public final void OooOo00(int i, boolean z) {
        RtcEngine rtcEngine = this.f40203OooO0O0;
        if (rtcEngine != null) {
            rtcEngine.muteRemoteAudioStream(i, z);
        }
    }

    @Override // p445o0OoOo0o.o0O0o000
    public final void OooOo0O(o00O0OO o00o0oo2) {
        this.f40202OooO00o = o00o0oo2;
    }

    @Override // p445o0OoOo0o.o0O0o000
    public final void OooOo0o(boolean z) {
        RtcEngine rtcEngine = this.f40203OooO0O0;
        if (rtcEngine != null) {
            rtcEngine.setEnableSpeakerphone(z);
        }
    }

    @Override // p445o0OoOo0o.o0O0o000
    public final String OooOoO0() {
        return this.f40203OooO0O0 != null ? RtcEngine.getSdkVersion() : "";
    }
}
