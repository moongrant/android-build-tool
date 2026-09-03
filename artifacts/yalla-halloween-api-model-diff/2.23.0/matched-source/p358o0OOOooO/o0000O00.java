package p358o0OOOooO;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.yalla.album.AlbumActivity;
import com.yalla.album.BigImageSelectActivity;
import com.yalla.yalla.ui.activity.store.CoinCrystalDetailActivity;
import com.yalla.yalla.ui.activity.store.WalletActivity;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o0000O00 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f43781OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ AppCompatActivity f43782OooO0o0;

    public /* synthetic */ o0000O00(AppCompatActivity appCompatActivity, int i) {
        this.f43781OooO0Oo = i;
        this.f43782OooO0o0 = appCompatActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f43781OooO0Oo;
        AppCompatActivity appCompatActivity = this.f43782OooO0o0;
        switch (i) {
            case 0:
                BigImageSelectActivity this$0 = (BigImageSelectActivity) appCompatActivity;
                WeakReference<AlbumActivity> weakReference = BigImageSelectActivity.f22515OooOOOO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.finish();
                break;
            default:
                WalletActivity this$1 = (WalletActivity) appCompatActivity;
                int i2 = WalletActivity.f27054OooOoOO;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                if (!(this$1.f27060OooOo0o == 0.0d)) {
                    int i3 = CoinCrystalDetailActivity.f26982OooOOo;
                    Intent intent = new Intent(this$1, (Class<?>) CoinCrystalDetailActivity.class);
                    intent.putExtra("type", 2);
                    this$1.startActivity(intent);
                } else {
                    int i4 = CoinCrystalDetailActivity.f26982OooOOo;
                    Intent intent2 = new Intent(this$1, (Class<?>) CoinCrystalDetailActivity.class);
                    intent2.putExtra("type", 1);
                    this$1.startActivity(intent2);
                }
                break;
        }
    }
}
