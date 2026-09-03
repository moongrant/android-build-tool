package p159o00OoOO;

import androidx.lifecycle.MutableLiveData;
import com.app.base.mixedroom.MixedRoomService;
import com.app.base.mixedroom.model.RoomLoginInformation;
import com.app.base.model.RoomModel;
import com.yalla.yalla.common.statistical.event.RoomEventType;
import com.yalla.yalla.common.statistical.net.FLog;
import com.yalla.yalla.data.manager.MusicState;
import com.yalla.yalla.model.RoomUserInfoModel;
import p445o0OoOo0o.o0O0o000;
import p447o0OoOoO0.o00O0OO;
import p451o0OoOoo0.oo0oOO0;
import p498o0o00Oo0.OooOOO;
import p500o0o00Ooo.o0000Ooo;
import p515o0o0O00.o00O00;
import p617o0oo0o.o00;

/* JADX INFO: loaded from: classes.dex */
public final class o000OOo0 implements o00O0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ MixedRoomService f32462OooO00o;

    public o000OOo0(MixedRoomService mixedRoomService) {
        this.f32462OooO00o = mixedRoomService;
    }

    public final void OooO00o(int i, int i2) {
        o00O00.OooO0OO("MixedRoomService", "onAudioMixingStateChanged: state = " + i + "  reason = " + i2);
        if (i == 713 && i2 == 723) {
            MusicState musicState = MusicState.f21402OooO00o;
            MutableLiveData<MusicState.LoopMode> mutableLiveData = MusicState.f21406OooO0o0;
            if (mutableLiveData.getValue() == MusicState.LoopMode.LoopSingle) {
                o00.f48461OooO00o.OooO0Oo(MusicState.f21403OooO0O0.getValue());
            }
            if (mutableLiveData.getValue() == MusicState.LoopMode.LoopAll) {
                o00.f48461OooO00o.OooO0o0();
            }
        }
        if (i == 0) {
            FLog.INSTANCE.roomLog(RoomEventType.Agore_audioMixingFailed, null);
        }
    }

    public final void OooO0O0(oo0oOO0[] oo0ooo0Arr) {
        RoomModel roomModel;
        if (this.f32462OooO00o.f11832OoooO != null) {
            for (oo0oOO0 oo0ooo0 : oo0ooo0Arr) {
                if (oo0ooo0.f40335OooO0O0 != 0) {
                    long jLongValue = OooOOO.f41216OooO00o.OooOo().getValue().longValue();
                    int i = oo0ooo0.f40334OooO00o;
                    if (i == 0) {
                        this.f32462OooO00o.f11832OoooO.obtainMessage(7, oo0ooo0.f40335OooO0O0, 0, String.valueOf(jLongValue)).sendToTarget();
                        RoomModel roomModel2 = this.f32462OooO00o.f11835OoooO0O;
                        if (roomModel2 != null) {
                            o0000Ooo.f41382OooO00o.OooO0OO(roomModel2.getId(), oo0ooo0.f40335OooO0O0);
                        }
                    } else {
                        this.f32462OooO00o.f11832OoooO.obtainMessage(7, oo0ooo0.f40335OooO0O0, 0, String.valueOf(i)).sendToTarget();
                        if (oo0ooo0.f40334OooO00o == jLongValue && (roomModel = this.f32462OooO00o.f11835OoooO0O) != null) {
                            o0000Ooo.f41382OooO00o.OooO0OO(roomModel.getId(), oo0ooo0.f40335OooO0O0);
                        }
                    }
                }
            }
        }
    }

    public final void OooO0OO(String str, long j) {
        o0O0o000 o0o0o000;
        RoomUserInfoModel roomUserInfoModel;
        o00O00.OooO0O0("MixedRoomService[" + j + "] onJoinChannelSuccess  channel:" + str);
        if (j != Long.parseLong(String.valueOf(OooOOO.f41216OooO00o.OooOo().getValue())) || (o0o0o000 = this.f32462OooO00o.f11831Oooo0oo) == null) {
            return;
        }
        o0o0o000.OooOOO(Long.parseLong(str));
        for (int i = 0; i < o000O00O.OooO().f32431OoooO.size(); i++) {
            RoomLoginInformation.MIC mic = o000O00O.OooO().f32431OoooO.get(i);
            if (mic != null && (roomUserInfoModel = mic.user) != null && roomUserInfoModel.getUserId() == OooOOO.f41216OooO00o.OooOo().getValue().longValue()) {
                this.f32462OooO00o.f11831Oooo0oo.OooO0OO();
            }
            if (mic != null && mic.user != null && mic.isMuteSound()) {
                this.f32462OooO00o.f11831Oooo0oo.OooOo00((int) mic.user.getUserId(), mic.isMuteSound());
            }
        }
    }

    public final void OooO0Oo(int i) {
        RoomUserInfoModel roomUserInfoModel;
        o00O00.OooO0O0("MixedRoomService[" + i + "] onUserJoined");
        if (o000O00O.OooO().OooOO0O().containsKey("" + i)) {
            if (o000O00O.OooO().OooOO0O().get("" + i).booleanValue()) {
                for (int i2 = 0; i2 < o000O00O.OooO().f32431OoooO.size(); i2++) {
                    RoomLoginInformation.MIC mic = o000O00O.OooO().f32431OoooO.get(i2);
                    if (mic != null && (roomUserInfoModel = mic.user) != null && ((int) roomUserInfoModel.getUserId()) == i) {
                        o00O00.OooO0O0("MixedRoomService[" + i + "] muteRemoteAudio:true");
                        this.f32462OooO00o.f11831Oooo0oo.OooOo00(i, true);
                        return;
                    }
                }
            }
        }
    }

    public final void OooO0o0(int i) {
        o00O00.OooO0O0("MixedRoomService[ " + i + "] onUserOffline");
    }
}
