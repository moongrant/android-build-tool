package p492o0o00OO0;

import android.content.Intent;
import android.view.View;
import com.code.android.util.OooO0O0;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.moment.PurchaseLockRoomActivity;
import com.yalla.yalla.ui.activity.store.CoinCrystalDetailActivity;
import com.yalla.yalla.ui.activity.store.WalletActivity;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import o0oo0000.OooO00o;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o0O0OOO0 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f49297OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ BaseActivityK f49298OooO0o0;

    public /* synthetic */ o0O0OOO0(BaseActivityK baseActivityK, int i) {
        this.f49297OooO0Oo = i;
        this.f49298OooO0o0 = baseActivityK;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f49297OooO0Oo;
        BaseActivityK baseActivityK = this.f49298OooO0o0;
        switch (i) {
            case 0:
                PurchaseLockRoomActivity context = (PurchaseLockRoomActivity) baseActivityK;
                int i2 = PurchaseLockRoomActivity.f25791OooOo0o;
                Intrinsics.checkNotNullParameter(context, "this$0");
                context.getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                Intent intent = new Intent(context, (Class<?>) WalletActivity.class);
                String strOooO0OO = OooO0O0.OooO0OO();
                LiveEventBus.get("RechargeFromUserInfo_OK").post(Boolean.TRUE);
                OooO00o.OooO0OO("205001", MapsKt.mapOf(new Pair("url", strOooO0OO)));
                intent.putExtra("FromInfo", strOooO0OO);
                context.startActivity(intent);
                break;
            default:
                WalletActivity this$0 = (WalletActivity) baseActivityK;
                int i3 = WalletActivity.f26588OooOoOO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (!(this$0.f26594OooOo0o == 0.0d)) {
                    int i4 = CoinCrystalDetailActivity.f26517OooOOo;
                    Intent intent2 = new Intent(this$0, (Class<?>) CoinCrystalDetailActivity.class);
                    intent2.putExtra("type", 2);
                    this$0.startActivity(intent2);
                } else {
                    int i5 = CoinCrystalDetailActivity.f26517OooOOo;
                    Intent intent3 = new Intent(this$0, (Class<?>) CoinCrystalDetailActivity.class);
                    intent3.putExtra("type", 1);
                    this$0.startActivity(intent3);
                }
                break;
        }
    }
}
