package p159o00OoOO;

import android.content.Context;
import com.android.billingclient.api.o0Oo0oo;
import com.app.base.model.RoomActivityModel;
import p160o00OoOO0.o00OO0O0;
import p530o0o0OOO.o00O;

/* JADX INFO: loaded from: classes.dex */
public final class o000OO0O extends o00OO0O0.OooO0O0 {
    public o000OO0O(Context context) {
        super(context);
    }

    @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
    public final void onFinish(String str) {
        RoomActivityModel roomActivityModel = (RoomActivityModel) o0Oo0oo.OooO0O0(str, RoomActivityModel.class);
        if (roomActivityModel != null) {
            if (roomActivityModel.dataTop.size() > 0) {
                o00O.OooOO0O oooOO0O = o00O.OooOO0O.f43251OooO00o;
                o00O.OooOO0O.f43252OooO0O0.setValue(roomActivityModel.dataTop);
            }
            if (roomActivityModel.dataRight.size() > 0) {
                o00O.OooOO0O oooOO0O2 = o00O.OooOO0O.f43251OooO00o;
                o00O.OooOO0O.f43253OooO0OO.setValue(roomActivityModel.dataRight.get(0));
            }
        }
    }
}
