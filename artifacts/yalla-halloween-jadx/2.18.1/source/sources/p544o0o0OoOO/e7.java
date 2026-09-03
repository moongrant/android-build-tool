package p544o0o0OoOO;

import android.content.Context;
import com.android.billingclient.api.o0Oo0oo;
import com.app.base.model.CommonListResult;
import com.app.base.model.CreateBarModel;
import com.yalla.yalla.ui.activity.room.UpgradeRoomActivity;
import java.util.List;
import p160o00OoOO0.o00OO0O0;
import p388o0OOooO.o00000O0;

/* JADX INFO: loaded from: classes2.dex */
public final class e7 extends o00OO0O0.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ UpgradeRoomActivity f44231OooO00o;

    public class OooO00o extends o00000O0<CommonListResult<CreateBarModel.CreatBarMemoy>> {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e7(UpgradeRoomActivity upgradeRoomActivity, Context context) {
        super(context);
        this.f44231OooO00o = upgradeRoomActivity;
    }

    @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
    public final void onFinish(String str) {
        List<T> list;
        CommonListResult commonListResult = (CommonListResult) o0Oo0oo.OooO0OO(str, new OooO00o().getType());
        if (commonListResult == null || (list = commonListResult.data) == 0 || list.size() <= 0) {
            return;
        }
        UpgradeRoomActivity upgradeRoomActivity = this.f44231OooO00o;
        upgradeRoomActivity.f23048o000000O = commonListResult.data;
        UpgradeRoomActivity.OooOoO(upgradeRoomActivity, commonListResult.bartype);
        UpgradeRoomActivity upgradeRoomActivity2 = this.f44231OooO00o;
        int i = commonListResult.bartype;
        upgradeRoomActivity2.OooOoo0(i != 5 ? i + 1 : 5, true);
    }
}
