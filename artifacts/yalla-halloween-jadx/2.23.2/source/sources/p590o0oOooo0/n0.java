package p590o0oOooo0;

import android.app.Activity;
import android.content.Context;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o000O00O;
import com.code.android.util.o0OoOo0;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.data.constant.MainPage;
import com.yalla.yalla.data.db.model.RoomHistory;
import com.yalla.yalla.manager.RoomState;
import com.yalla.yalla.model.gift.GiftPropRoomShowModel;
import com.yalla.yalla.model.gift.GiftPropTypeUser;
import com.yalla.yalla.service.room.OooO0O0;
import com.yalla.yalla.ui.activity.main.MainActivity;
import p407o0Oo0Oo.o0O00OOO;
import p408o0Oo0Oo0.o00Oo0;
import p429o0OoOO.o0Oo0oo;
import p475o0Ooooo0.o0O00oO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class n0 {
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
            MutableState mutableState = o0Oo0oo.f46817OooO00o;
            RoomState roomStateOooO0oO = o0Oo0oo.OooO0oO();
            RoomState roomState = RoomState.InRoom;
            OooO0O0.OooO00o oooO00o = OooO0O0.f24533OoooOOO;
            if (roomStateOooO0oO == roomState || o0Oo0oo.OooO0oO() == RoomState.Hook) {
                jOooO = o0OoOo0.OooOO0(oooO00o.OooO00o().f24539OooO0Oo.getValue());
            } else if (o0Oo0oo.OooO0oO() == RoomState.Close) {
                o0O00OOO o0o00oooOooOoo0 = o00Oo0.OooO00o().OooOoo0();
                o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                RoomHistory roomHistoryOooO0O0 = o0o00oooOooOoo0.OooO0O0(String.valueOf(o0O00oO0.OooOOo0().getValue()));
                jOooO = o0OoOo0.OooO(0L, roomHistoryOooO0O0 != null ? roomHistoryOooO0O0.barid : null);
            } else {
                jOooO = 0;
            }
        }
        if (jOooO == 0) {
            Context context = o000O00O.f13421OooO00o;
            Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
            if (activityOooO0O0 != null) {
                int i2 = MainActivity.f24940OooOoo;
                MainActivity.OooO00o.OooO00o(activityOooO0O0, 0, 4);
                LiveEventBus.get("OPEN_MAIN_ACTIVITY_PAGE").post(Integer.valueOf(MainPage.RoomMine.getValue()));
                return;
            }
            return;
        }
        MutableState mutableState2 = o0Oo0oo.f46817OooO00o;
        o0Oo0oo.OooO0o0(jOooO, null);
        if (o0Oo0oo.OooO0oO() == RoomState.InRoom) {
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
