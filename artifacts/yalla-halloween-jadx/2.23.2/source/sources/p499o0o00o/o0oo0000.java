package p499o0o00o;

import android.view.View;
import androidx.compose.runtime.MutableState;
import com.yalla.yalla.mixedroom.model.RoomPKResultModel;
import com.yalla.yalla.model.room.RoomModel;
import com.yalla.yalla.service.room.OooO0O0;
import p429o0OoOO.o0Oo0oo;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o0oo0000 implements View.OnClickListener {
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        OooO0O0.OooO00o oooO00o = OooO0O0.f24533OoooOOO;
        RoomPKResultModel value = oooO00o.OooO00o().f24566Oooo.getValue();
        if (value == null || value.getRoom_b_barid() == 0) {
            return;
        }
        long room_b_barid = value.getRoom_b_barid();
        Long value2 = oooO00o.OooO00o().f24539OooO0Oo.getValue();
        if (value2 != null && room_b_barid == value2.longValue()) {
            return;
        }
        RoomModel roomModel = new RoomModel();
        roomModel.setId(value.getRoom_b_barid());
        roomModel.setName(value.getRoom_b_name());
        MutableState mutableState = o0Oo0oo.f46817OooO00o;
        o0Oo0oo.OooO0o(roomModel, null);
    }
}
