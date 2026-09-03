package p159o00OoOO;

import com.android.billingclient.api.o0Oo0oo;
import com.app.base.mixedroom.model.RoomGameConfig;
import com.yalla.yalla.data.constant.TurntableGameState;
import p160o00OoOO0.o00OO0O0;
import p530o0o0OOO.o00O;
import p530o0o0OOO.o00OO00O;

/* JADX INFO: loaded from: classes.dex */
public final class o000O0O0 extends o00OO0O0.OooO0O0 {
    @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
    public final void onFinish(String str) {
        super.onFinish(str);
        RoomGameConfig roomGameConfig = (RoomGameConfig) o0Oo0oo.OooO0O0(str, RoomGameConfig.class);
        if (roomGameConfig != null) {
            o00OO00O.OooO00o oooO00o = o00OO00O.f43313OooooOo;
            oooO00o.OooO00o().f43341OooOoOO.postValue(Boolean.valueOf(roomGameConfig.getMoraGameState() == 1));
            oooO00o.OooO00o().f43371o000oOoO.postValue(Boolean.valueOf(roomGameConfig.getFruitGameState() == 1));
            if (oooO00o.OooO00o().f43329OooOOOO.getValue().intValue() == 1) {
                o00O.OooOOO0 oooOOO0 = o00O.OooOOO0.f43257OooO00o;
                o00O.OooOOO0.f43258OooO0O0.postValue(Boolean.valueOf(roomGameConfig.getTurnGameState() == 1));
            }
            int turnGameProgress = roomGameConfig.getTurnGameProgress();
            if (turnGameProgress == 0) {
                o00O.OooOOO0.f43257OooO00o.OooO0Oo(TurntableGameState.Wait);
            } else if (turnGameProgress == 1) {
                o00O.OooOOO0.f43257OooO00o.OooO0Oo(TurntableGameState.Start);
            } else if (turnGameProgress == 2) {
                o00O.OooOOO0.f43257OooO00o.OooO0Oo(TurntableGameState.Close);
            }
            if (roomGameConfig.getVote() != null) {
                oooO00o.OooO00o().f43362OoooOOO.postValue(roomGameConfig.getVote());
            }
            if (roomGameConfig.getBox() != null) {
                oooO00o.OooO00o().f43363OoooOOo.postValue(roomGameConfig.getBox());
            }
            o00O o00o2 = o00O.f43140OooO00o;
            o00O.f43187OoooOOo.setValue(Integer.valueOf(roomGameConfig.getEventCount()));
            oooO00o.OooO00o().f43370OooooOO.postValue(Boolean.valueOf(roomGameConfig.getEventIsStart()));
            oooO00o.OooO00o().f43365OoooOoO.postValue(Boolean.valueOf(roomGameConfig.getIsShowCamel()));
        }
    }
}
