package p497o0o00OoO;

import androidx.lifecycle.Observer;
import com.code.android.util.OooOo00;
import com.code.android.util.o0000;
import com.yalla.yalla.model.WebFrom;
import com.yalla.yalla.ui.activity.main.WebActivity;
import com.yalla.yalla.ui.fragment.WalletCoinFragment;
import com.yalla.yalla.util.WebPageInfo;
import kotlin.jvm.internal.Intrinsics;
import o0oo0000.OooO00o;
import p475o0Ooooo0.o0O00oO0;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o00O0O0O implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f49843OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f49844OooO0o0;

    public /* synthetic */ o00O0O0O(Object obj, int i) {
        this.f49843OooO0Oo = i;
        this.f49844OooO0o0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = this.f49843OooO0Oo;
        Object obj2 = this.f49844OooO0o0;
        switch (i) {
            case 0:
                oo0O this$0 = (oo0O) obj2;
                String url = (String) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                OooO00o.OooO0O0("102201");
                if (!OooOo00.OooO00o(url)) {
                    WebPageInfo webPageInfo = new WebPageInfo(WebFrom.StoreCoin);
                    Intrinsics.checkNotNull(url);
                    Intrinsics.checkNotNullParameter(url, "url");
                    webPageInfo.f32283OooO0o0 = url;
                    o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                    webPageInfo.OooO00o("region", String.valueOf(o0O00oO0.OooOOO0().getValue()));
                    webPageInfo.OooO0Oo(o0000.OooO0OO(o000000.user_unique_id));
                    webPageInfo.f32280OooO = true;
                    int i2 = WebActivity.f25130OooOoO0;
                    WebActivity.OooO00o.OooO00o(this$0.f49626OooO00o, webPageInfo);
                    break;
                }
                break;
            default:
                WalletCoinFragment.iniView$lambda$14((WalletCoinFragment) obj2, obj);
                break;
        }
    }
}
