package p579o0oOoo;

import android.app.Activity;
import android.content.Context;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o000O0;
import com.code.android.util.o0OoOo0;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.data.constant.MainPage;
import com.yalla.yalla.data.db.model.RoomHistory;
import com.yalla.yalla.manager.RoomState;
import com.yalla.yalla.model.gift.GiftPropRoomShowModel;
import com.yalla.yalla.model.gift.GiftPropTypeUser;
import com.yalla.yalla.service.room.OooO0O0;
import com.yalla.yalla.ui.activity.main.MainActivity;
import p403o0Oo0OOo.oO0O0OoO;
import p427o0OoOO00.o0OOO0o;
import p464o0Oooo.o000000O;
import p581o0oOoo00.o000OOo;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
public final class oOO0OoO0 {
    public static void OooO00o(Integer num, GiftPropTypeUser giftPropTypeUser, Long l, int i) {
        long jOooO;
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            giftPropTypeUser = null;
        }
        if ((i & 4) != 0) {
            l = null;
        }
        if (l != null) {
            jOooO = l.longValue();
        } else {
            MutableState mutableState = o0OOO0o.f45698OooO00o;
            RoomState roomStateOooO0oO = o0OOO0o.OooO0oO();
            RoomState roomState = RoomState.InRoom;
            OooO0O0.OooO00o oooO00o = OooO0O0.f24995OoooOOO;
            if (roomStateOooO0oO == roomState || o0OOO0o.OooO0oO() == RoomState.Hook) {
                jOooO = o0OoOo0.OooOO0(oooO00o.OooO00o().f25001OooO0Oo.getValue());
            } else if (o0OOO0o.OooO0oO() == RoomState.Close) {
                oO0O0OoO oo0o0oooOooOoOO = o000OOo.OooO00o().OooOoOO();
                o000000O o000000o2 = o000000O.f46674OooO00o;
                RoomHistory roomHistoryOooO0O0 = oo0o0oooOooOoOO.OooO0O0(String.valueOf(o000000O.OooOOo0().getValue()));
                jOooO = o0OoOo0.OooO(0L, roomHistoryOooO0O0 != null ? roomHistoryOooO0O0.barid : null);
            } else {
                jOooO = 0;
            }
        }
        if (jOooO == 0) {
            Context context = o000O0.f10354OooO00o;
            Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
            if (activityOooO0O0 != null) {
                int i2 = MainActivity.f25394OooOoo;
                MainActivity.OooO00o.OooO00o(activityOooO0O0, 0, 4);
                LiveEventBus.get("OPEN_MAIN_ACTIVITY_PAGE").post(Integer.valueOf(MainPage.RoomMine.getValue()));
                return;
            }
            return;
        }
        MutableState mutableState2 = o0OOO0o.f45698OooO00o;
        o0OOO0o.OooO0o0(jOooO, null);
        if (o0OOO0o.OooO0oO() == RoomState.InRoom) {
            LiveEventBus.get("RoomMessageBox_Dismiss").postDelay(Boolean.TRUE, 300L);
        }
        if (num == null || num.intValue() <= 0) {
            return;
        }
        int iIntValue = num.intValue();
        if (giftPropTypeUser == null) {
            giftPropTypeUser = GiftPropTypeUser.Hot;
        }
        LiveEventBus.get("Room_Show_Gift_Dialog").postDelay(new GiftPropRoomShowModel(iIntValue, giftPropTypeUser.getValue()), 400L);
    }
}
