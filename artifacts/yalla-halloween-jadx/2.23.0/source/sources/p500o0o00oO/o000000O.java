package p500o0o00oO;

import android.view.View;
import androidx.compose.runtime.MutableState;
import com.code.android.util.o0OoOo0;
import com.facebook.appevents.AppEventsConstants;
import com.yalla.yalla.data.db.model.RoomHistory;
import com.yalla.yalla.model.room.RoomModel;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import java.util.HashMap;
import p022Oooo00O.o00O00OO;
import p427o0OoOO00.o0OOO0o;
import p466o0Oooo0o.oo00o;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class o000000O extends oo00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ o00000 f49423OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ ViewHolder f49424OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ RoomHistory f49425OooO0oo;

    public o000000O(o00000 o00000Var, ViewHolder viewHolder, RoomHistory roomHistory) {
        this.f49423OooO = o00000Var;
        this.f49424OooO0oO = viewHolder;
        this.f49425OooO0oo = roomHistory;
    }

    @Override // p466o0Oooo0o.oo00o
    public final void OooO00o(View view) {
        HashMap map = new HashMap();
        int layoutPosition = this.f49424OooO0oO.getLayoutPosition();
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
        o0OO000.OooO0O0("201007", map);
        RoomModel roomModel = new RoomModel();
        RoomHistory roomHistory = this.f49425OooO0oo;
        roomModel.setId(Long.parseLong(roomHistory.barid));
        roomModel.setBaridx(roomHistory.baridx);
        roomModel.setName(roomHistory.barname);
        roomModel.setImage(roomHistory.barimage);
        MutableState mutableState = o0OOO0o.f45698OooO00o;
        o0OOO0o.OooO0o(roomModel, this.f49423OooO.f49421OooOoo0);
    }
}
