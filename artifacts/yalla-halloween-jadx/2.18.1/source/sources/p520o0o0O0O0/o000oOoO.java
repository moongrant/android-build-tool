package p520o0o0O0O0;

import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.common.db.table.SquareEventRoom;
import com.yalla.yalla.model.SquareEventRoomModel;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p490o0o00O0.o0OOO0o;
import p491o0o00O00.OooO0OO;
import p498o0o00Oo0.OooOOO;
import p527o0o0OO0.o0OoOo0;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class o000oOoO {
    public static final void OooO00o(@NotNull List squareEventRoomModelList) {
        Intrinsics.checkNotNullParameter(squareEventRoomModelList, "squareEventRoomModelList");
        Iterator it = squareEventRoomModelList.iterator();
        while (it.hasNext()) {
            SquareEventRoomModel squareEventRoomModel = (SquareEventRoomModel) it.next();
            o0OOO0o o0ooo0oOooOo = OooO0OO.OooO00o().OooOo();
            Intrinsics.checkNotNullExpressionValue(o0ooo0oOooOo, "DB.squareEventRoomDao");
            long userId = squareEventRoomModel.getUserId();
            long roomId = squareEventRoomModel.getRoomId();
            OooOOO oooOOO = OooOOO.f41216OooO00o;
            Long value = oooOOO.OooOo().getValue();
            long jLongValue = 0;
            SquareEventRoom squareEventRoomOooO0O0 = o0ooo0oOooOo.OooO0O0(value == null ? 0L : value.longValue(), userId, roomId);
            if (squareEventRoomOooO0O0 == null) {
                squareEventRoomModel.setNewRoomEvent(true);
                o0OOO0o o0ooo0oOooOo2 = OooO0OO.OooO00o().OooOo();
                SquareEventRoom squareEventRoom = new SquareEventRoom();
                squareEventRoom.setMid(o0OoOo0.f43133OooO00o.OooO00o(Long.valueOf(squareEventRoomModel.getUserId())));
                Long value2 = oooOOO.OooOo().getValue();
                if (value2 != null) {
                    Intrinsics.checkNotNullExpressionValue(value2, "Account.userId.value ?: 0");
                    jLongValue = value2.longValue();
                }
                squareEventRoom.setUserId(jLongValue);
                squareEventRoom.setTargetId(squareEventRoomModel.getUserId());
                squareEventRoom.setRoomId(squareEventRoomModel.getRoomId());
                o0ooo0oOooOo2.OooO00o(squareEventRoom);
            } else {
                long userId2 = squareEventRoomOooO0O0.getUserId();
                Long value3 = oooOOO.OooOo().getValue();
                if (value3 != null && userId2 == value3.longValue() && squareEventRoomOooO0O0.getTargetId() == squareEventRoomModel.getUserId() && squareEventRoomOooO0O0.getRoomId() == squareEventRoomModel.getRoomId() && squareEventRoomOooO0O0.getEventCreateTime() != squareEventRoomModel.getEventCreateTime()) {
                    squareEventRoomModel.setNewRoomEvent(true);
                } else {
                    squareEventRoomModel.setNewRoomEvent(false);
                }
            }
        }
    }
}
