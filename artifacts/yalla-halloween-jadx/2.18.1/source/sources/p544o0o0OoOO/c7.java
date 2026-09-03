package p544o0o0OoOO;

import android.content.Context;
import com.android.billingclient.api.o0Oo0oo;
import com.app.base.model.CategoryModel;
import com.app.base.model.CommonListResult;
import com.yalla.yalla.ui.activity.room.SelectRoomTagActivity;
import p133o00OO00o.o000oOoO;
import p160o00OoOO0.o00OO0O0;
import p388o0OOooO.o00000O0;

/* JADX INFO: loaded from: classes2.dex */
public final class c7 extends o00OO0O0.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ SelectRoomTagActivity f44218OooO00o;

    public class OooO00o extends o00000O0<CommonListResult<CategoryModel>> {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c7(SelectRoomTagActivity selectRoomTagActivity, Context context) {
        super(context);
        this.f44218OooO00o = selectRoomTagActivity;
    }

    @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
    public final void onFinish(String str) {
        try {
            CommonListResult commonListResult = (CommonListResult) o0Oo0oo.OooO0OO(str, new OooO00o().getType());
            if (commonListResult != null) {
                o000oOoO o000oooo2 = this.f44218OooO00o.f23033OoooOoO;
                o000oooo2.f31272OooO00o = commonListResult.data;
                o000oooo2.notifyDataSetChanged();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
