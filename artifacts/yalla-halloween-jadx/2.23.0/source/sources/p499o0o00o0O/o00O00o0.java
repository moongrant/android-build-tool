package p499o0o00o0O;

import android.content.Intent;
import android.view.View;
import com.code.android.util.OooO0O0;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.ui.activity.main.TaskActivity;
import com.yalla.yalla.ui.activity.store.StoreActivity;
import com.yalla.yalla.ui.activity.store.WalletActivity;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import p466o0Oooo0o.oo00o;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O00o0 extends oo00o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ StoreActivity f49386OooO0oO;

    public o00O00o0(StoreActivity storeActivity) {
        this.f49386OooO0oO = storeActivity;
    }

    @Override // p466o0Oooo0o.oo00o
    public final void OooO00o(View view) {
        StoreActivity activity = this.f49386OooO0oO;
        if (activity.f27029OooOo0o != 0) {
            activity.finish();
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intent intent = new Intent(activity, (Class<?>) TaskActivity.class);
            intent.putExtra("IsFromGiftSendDialog_Tag", false);
            activity.startActivity(intent);
            return;
        }
        Intrinsics.checkNotNullParameter(activity, "context");
        Intent intent2 = new Intent(activity, (Class<?>) WalletActivity.class);
        String strOooO0OO = OooO0O0.OooO0OO();
        LiveEventBus.get("RechargeFromUserInfo_OK").post(Boolean.TRUE);
        o0OO000.OooO0O0("205001", MapsKt.mapOf(new Pair("url", strOooO0OO)));
        intent2.putExtra("FromInfo", strOooO0OO);
        activity.startActivity(intent2);
    }
}
