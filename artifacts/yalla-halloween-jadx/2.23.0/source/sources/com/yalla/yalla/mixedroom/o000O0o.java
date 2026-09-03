package com.yalla.yalla.mixedroom;

import com.yalla.yalla.data.constant.TurntableGameState;
import com.yalla.yalla.mixedroom.model.RoomGameConfig;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p579o0oOoo.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O0o extends com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0 {
    @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
    public final void OooO0o0(String str) {
        RoomGameConfig roomGameConfig = (RoomGameConfig) oOo00OO0.OooO00o(str, RoomGameConfig.class);
        if (roomGameConfig != null) {
            com.yalla.yalla.service.room.OooO0O0.OooO00o oooO00o = com.yalla.yalla.service.room.OooO0O0.f24995OoooOOO;
            oooO00o.OooO00o().f25017OooOo0.postValue(Boolean.valueOf(roomGameConfig.getMoraGameState() == 1));
            oooO00o.OooO00o().f25035Oooo0o.postValue(Boolean.valueOf(roomGameConfig.getFruitGameState() == 1));
            if (oooO00o.OooO00o().f25008OooOO0o.getValue().intValue() == 1) {
                com.yalla.yalla.service.room.OooO00o.f24982OooOO0O.f47423OooO00o.setValue(Boolean.valueOf(roomGameConfig.getTurnGameState() == 1));
            }
            int turnGameProgress = roomGameConfig.getTurnGameProgress();
            if (turnGameProgress == 0) {
                com.yalla.yalla.service.room.OooO00o.f24982OooOO0O.f47424OooO0O0.setValue(TurntableGameState.Wait);
            } else if (turnGameProgress == 1) {
                com.yalla.yalla.service.room.OooO00o.f24982OooOO0O.f47424OooO0O0.setValue(TurntableGameState.Start);
            } else if (turnGameProgress == 2) {
                com.yalla.yalla.service.room.OooO00o.f24982OooOO0O.f47424OooO0O0.setValue(TurntableGameState.Close);
            }
            if (roomGameConfig.getVote() != null) {
                oooO00o.OooO00o().f25037Oooo0oO.postValue(roomGameConfig.getVote());
            }
            if (roomGameConfig.getNewGift() != null) {
                p475o0o000.o00Ooo o00ooo2 = com.yalla.yalla.service.room.OooO00o.f24989OooOOo0;
                List<RoomGameConfig.NewGift> newGift = roomGameConfig.getNewGift();
                o00ooo2.getClass();
                Intrinsics.checkNotNullParameter(newGift, "<set-?>");
                o00ooo2.f47449OooO0O0.setValue(newGift);
                if (!roomGameConfig.getNewGift().isEmpty()) {
                    p409o0Oo0o0o.o00000OO o00000ooOooOO0O = p408o0Oo0o0O.o00Oo0.OooOO0O();
                    o00000ooOooOO0O.getClass();
                    p464o0Oooo.o000000O o000000o2 = p464o0Oooo.o000000O.f46674OooO00o;
                    if (!p601o0oo0O0.o0000O0O.OooO00o(o00000ooOooOO0O.OooO0Oo("roomGiftIconRedDotForEveryday" + p464o0Oooo.o000000O.OooOOo0().getValue()), System.currentTimeMillis())) {
                        p409o0Oo0o0o.o00000OO o00000ooOooOO0O2 = p408o0Oo0o0O.o00Oo0.OooOO0O();
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        o00000ooOooOO0O2.getClass();
                        o00000ooOooOO0O2.OooO0oo(jCurrentTimeMillis, "roomGiftIconRedDotForEveryday" + p464o0Oooo.o000000O.OooOOo0().getValue());
                        p408o0Oo0o0O.o00Oo0.OooOO0O().OooOOOO(true);
                        p408o0Oo0o0O.o00Oo0.OooOO0O().OooOOO(true);
                        p409o0Oo0o0o.o00000OO o00000ooOooOO0O3 = p408o0Oo0o0O.o00Oo0.OooOO0O();
                        o00000ooOooOO0O3.getClass();
                        o00000ooOooOO0O3.OooO(o00000ooOooOO0O3.f45212OooO0O0 + p464o0Oooo.o000000O.OooOOo0().getValue(), "");
                    }
                }
            }
            if (roomGameConfig.getBox() != null) {
                oooO00o.OooO00o().f25038Oooo0oo.postValue(roomGameConfig.getBox());
            }
            com.yalla.yalla.service.room.OooO00o.f24987OooOOOo.f47442OooO00o.setValue(Integer.valueOf(roomGameConfig.getEventCount()));
            oooO00o.OooO00o().f25044o000oOoO.postValue(Boolean.valueOf(roomGameConfig.getEventIsStart()));
            oooO00o.OooO00o().f25041OoooO00.postValue(Boolean.valueOf(roomGameConfig.getIsShowCamel()));
        }
    }
}
