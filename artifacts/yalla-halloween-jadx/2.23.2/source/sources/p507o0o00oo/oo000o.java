package p507o0o00oo;

import android.view.View;
import androidx.compose.runtime.MutableState;
import com.code.android.util.o0OoOo0;
import com.facebook.appevents.AppEventsConstants;
import com.yalla.yalla.data.db.model.RoomHistory;
import com.yalla.yalla.model.room.RoomModel;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import java.util.HashMap;
import o0oo0000.OooO00o;
import p022Oooo00O.o00O00OO;
import p429o0OoOO.o0Oo0oo;
import p473o0OoooOo.o0OOOO0o;

/* JADX INFO: loaded from: classes4.dex */
public final class oo000o extends o0OOOO0o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ o00oO0o f50624OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ ViewHolder f50625OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ RoomHistory f50626OooO0oo;

    public oo000o(o00oO0o o00oo0o2, ViewHolder viewHolder, RoomHistory roomHistory) {
        this.f50624OooO = o00oo0o2;
        this.f50625OooO0oO = viewHolder;
        this.f50626OooO0oo = roomHistory;
    }

    @Override // p473o0OoooOo.o0OOOO0o
    public final void OooO00o(View view) {
        HashMap map = new HashMap();
        int layoutPosition = this.f50625OooO0oO.getLayoutPosition();
        String strOooO00o = "00";
        if (layoutPosition >= 0) {
            if (layoutPosition < 10) {
                int i = layoutPosition + 1;
                strOooO00o = i < 10 ? o00O00OO.OooO00o(AppEventsConstants.EVENT_PARAM_VALUE_NO, o0OoOo0.OooOO0o(Integer.valueOf(i), AppEventsConstants.EVENT_PARAM_VALUE_NO)) : o0OoOo0.OooOO0o(Integer.valueOf(i), "00");
            } else {
                strOooO00o = "11";
            }
        }
        map.put("roompoint", strOooO00o);
        OooO00o.OooO0OO("201007", map);
        RoomModel roomModel = new RoomModel();
        RoomHistory roomHistory = this.f50626OooO0oo;
        roomModel.setId(Long.parseLong(roomHistory.barid));
        roomModel.setBaridx(roomHistory.baridx);
        roomModel.setName(roomHistory.barname);
        roomModel.setImage(roomHistory.barimage);
        MutableState mutableState = o0Oo0oo.f46817OooO00o;
        o0Oo0oo.OooO0o(roomModel, this.f50624OooO.f50617OooOoo0);
    }
}
