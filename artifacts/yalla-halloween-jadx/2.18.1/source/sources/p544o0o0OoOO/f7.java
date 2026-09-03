package p544o0o0OoOO;

import android.content.Context;
import com.android.billingclient.api.o0Oo0oo;
import com.code.android.util.ToastUtil;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.activity.room.UpgradeRoomActivity;
import java.util.Map;
import p160o00OoOO0.o00OO0O0;
import p168o00Ooo0.o0O0O00;
import p254o00ooO0O.o000O0O0;
import p498o0o00Oo0.OooOOO;

/* JADX INFO: loaded from: classes2.dex */
public final class f7 extends o00OO0O0.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ UpgradeRoomActivity f44236OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f7(UpgradeRoomActivity upgradeRoomActivity, Context context) {
        super(context);
        this.f44236OooO00o = upgradeRoomActivity;
    }

    @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
    public final void onFinish(String str) {
        Map map = (Map) o0Oo0oo.OooO0O0(str, Map.class);
        if (map != null) {
            String str2 = (String) map.get("data");
            if (!"1000".equals((String) map.get("code")) || str2 == null) {
                return;
            }
            OooOOO.f41216OooO00o.OooO0OO().postValue(Long.valueOf(o0O0O00.OooOOO0(str2)));
            UpgradeRoomActivity upgradeRoomActivity = this.f44236OooO00o;
            UpgradeRoomActivity.OooOoO(upgradeRoomActivity, upgradeRoomActivity.f23046o00000);
            UpgradeRoomActivity upgradeRoomActivity2 = this.f44236OooO00o;
            int i = upgradeRoomActivity2.f23046o00000;
            upgradeRoomActivity2.OooOoo0(i != 5 ? i + 1 : 5, true);
            ToastUtil.f12567OooO00o.OooO0O0(o000O0O0.OooO0OO(R.string.Success));
            p034OoooO0O.o0Oo0oo.OooO0o0(32, null);
        }
    }
}
