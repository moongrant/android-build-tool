package p493o0o00O0o;

import android.content.Intent;
import android.view.View;
import com.code.android.util.OooO0O0;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.ui.activity.moment.PurchaseLockRoomActivity;
import com.yalla.yalla.ui.activity.store.CoinCrystalDetailActivity;
import com.yalla.yalla.ui.activity.store.WalletActivity;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import p593o0oOoooO.h0;
import p675oO0Oo.o0oO0Ooo;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ooooO0O0 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f49433OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ View.OnClickListener f49434OooO0o0;

    public /* synthetic */ ooooO0O0(int i, View.OnClickListener onClickListener) {
        this.f49433OooO0Oo = i;
        this.f49434OooO0o0 = onClickListener;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f49433OooO0Oo;
        View.OnClickListener onClickListener = this.f49434OooO0o0;
        switch (i) {
            case 0:
                PurchaseLockRoomActivity context = (PurchaseLockRoomActivity) onClickListener;
                int i2 = PurchaseLockRoomActivity.f25793OooOo0o;
                Intrinsics.checkNotNullParameter(context, "this$0");
                context.getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                Intent intent = new Intent(context, (Class<?>) WalletActivity.class);
                String strOooO0OO = OooO0O0.OooO0OO();
                LiveEventBus.get("RechargeFromUserInfo_OK").post(Boolean.TRUE);
                h0.OooO0OO("205001", MapsKt.mapOf(new Pair("url", strOooO0OO)));
                intent.putExtra("FromInfo", strOooO0OO);
                context.startActivity(intent);
                break;
            case 1:
                WalletActivity this$0 = (WalletActivity) onClickListener;
                int i3 = WalletActivity.f26589OooOoOO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (!(this$0.f26595OooOo0o == 0.0d)) {
                    int i4 = CoinCrystalDetailActivity.f26518OooOOo;
                    Intent intent2 = new Intent(this$0, (Class<?>) CoinCrystalDetailActivity.class);
                    intent2.putExtra("type", 2);
                    this$0.startActivity(intent2);
                } else {
                    int i5 = CoinCrystalDetailActivity.f26518OooOOo;
                    Intent intent3 = new Intent(this$0, (Class<?>) CoinCrystalDetailActivity.class);
                    intent3.putExtra("type", 1);
                    this$0.startActivity(intent3);
                }
                break;
            default:
                o0oO0Ooo this_apply = (o0oO0Ooo) onClickListener;
                Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                this_apply.OooO0O0();
                break;
        }
    }
}
