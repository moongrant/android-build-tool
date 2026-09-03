package com.yalla.yalla.mixedroom;

import com.yalla.yalla.data.constant.TurntableGameState;
import com.yalla.yalla.mixedroom.model.RoomGameConfig;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p414o0Oo0oO.oOo00OO0;
import p475o0Ooooo0.o0O00oO0;
import p590o0oOooo0.oOOO00;
import p606o0oo0O0o.o0O0OOO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O0o extends com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0 {
    @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
    public final void OooO0o0(String str) {
        RoomGameConfig roomGameConfig = (RoomGameConfig) oOOO00.OooO00o(str, RoomGameConfig.class);
        if (roomGameConfig != null) {
            com.yalla.yalla.service.room.OooO0O0.OooO00o oooO00o = com.yalla.yalla.service.room.OooO0O0.f24533OoooOOO;
            oooO00o.OooO00o().f24555OooOo0.postValue(Boolean.valueOf(roomGameConfig.getMoraGameState() == 1));
            oooO00o.OooO00o().f24573Oooo0o.postValue(Boolean.valueOf(roomGameConfig.getFruitGameState() == 1));
            if (oooO00o.OooO00o().f24546OooOO0o.getValue().intValue() == 1) {
                com.yalla.yalla.service.room.OooO00o.f24520OooOO0O.f48510OooO00o.setValue(Boolean.valueOf(roomGameConfig.getTurnGameState() == 1));
            }
            int turnGameProgress = roomGameConfig.getTurnGameProgress();
            if (turnGameProgress == 0) {
                com.yalla.yalla.service.room.OooO00o.f24520OooOO0O.f48511OooO0O0.setValue(TurntableGameState.Wait);
            } else if (turnGameProgress == 1) {
                com.yalla.yalla.service.room.OooO00o.f24520OooOO0O.f48511OooO0O0.setValue(TurntableGameState.Start);
            } else if (turnGameProgress == 2) {
                com.yalla.yalla.service.room.OooO00o.f24520OooOO0O.f48511OooO0O0.setValue(TurntableGameState.Close);
            }
            if (roomGameConfig.getVote() != null) {
                oooO00o.OooO00o().f24575Oooo0oO.postValue(roomGameConfig.getVote());
            }
            if (roomGameConfig.getNewGift() != null) {
                p483o0o000Oo.o000OOo o000ooo2 = com.yalla.yalla.service.room.OooO00o.f24527OooOOo0;
                List<RoomGameConfig.NewGift> newGift = roomGameConfig.getNewGift();
                o000ooo2.getClass();
                Intrinsics.checkNotNullParameter(newGift, "<set-?>");
                o000ooo2.f48620OooO0O0.setValue(newGift);
                if (!roomGameConfig.getNewGift().isEmpty()) {
                    oOo00OO0 ooo00oo0OooOO0O = p415o0Oo0oO0.o00Ooo.OooOO0O();
                    ooo00oo0OooOO0O.getClass();
                    o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                    if (!o0O0OOO0.OooO00o(ooo00oo0OooOO0O.OooO0Oo("roomGiftIconRedDotForEveryday" + o0O00oO0.OooOOo0().getValue()), System.currentTimeMillis())) {
                        oOo00OO0 ooo00oo0OooOO0O2 = p415o0Oo0oO0.o00Ooo.OooOO0O();
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        ooo00oo0OooOO0O2.getClass();
                        ooo00oo0OooOO0O2.OooO0oo(jCurrentTimeMillis, "roomGiftIconRedDotForEveryday" + o0O00oO0.OooOOo0().getValue());
                        p415o0Oo0oO0.o00Ooo.OooOO0O().OooOOOO(true);
                        p415o0Oo0oO0.o00Ooo.OooOO0O().OooOOO(true);
                        oOo00OO0 ooo00oo0OooOO0O3 = p415o0Oo0oO0.o00Ooo.OooOO0O();
                        ooo00oo0OooOO0O3.getClass();
                        ooo00oo0OooOO0O3.OooO(ooo00oo0OooOO0O3.f46403OooO0O0 + o0O00oO0.OooOOo0().getValue(), "");
                    }
                }
            }
            if (roomGameConfig.getBox() != null) {
                oooO00o.OooO00o().f24576Oooo0oo.postValue(roomGameConfig.getBox());
            }
            com.yalla.yalla.service.room.OooO00o.f24525OooOOOo.f48654OooO00o.setValue(Integer.valueOf(roomGameConfig.getEventCount()));
            oooO00o.OooO00o().f24582o000oOoO.postValue(Boolean.valueOf(roomGameConfig.getEventIsStart()));
            oooO00o.OooO00o().f24579OoooO00.postValue(Boolean.valueOf(roomGameConfig.getIsShowCamel()));
        }
    }
}
