package p505o0o00oOO;

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
import o0oo0000.OooO00o;
import p473o0OoooOo.o0OOOO0o;

/* JADX INFO: loaded from: classes4.dex */
public final class oo0oO0 extends o0OOOO0o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ StoreActivity f50381OooO0oO;

    public oo0oO0(StoreActivity storeActivity) {
        this.f50381OooO0oO = storeActivity;
    }

    @Override // p473o0OoooOo.o0OOOO0o
    public final void OooO00o(View view) {
        StoreActivity activity = this.f50381OooO0oO;
        if (activity.f26564OooOo0o != 0) {
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
        OooO00o.OooO0OO("205001", MapsKt.mapOf(new Pair("url", strOooO0OO)));
        intent2.putExtra("FromInfo", strOooO0OO);
        activity.startActivity(intent2);
    }
}
