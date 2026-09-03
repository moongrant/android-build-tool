package p499o0o00o0O;

import androidx.lifecycle.Observer;
import com.code.android.util.OooOo00;
import com.code.android.util.o0000;
import com.yalla.yalla.model.WebFrom;
import com.yalla.yalla.ui.activity.main.WebActivity;
import com.yalla.yalla.ui.activity.store.StoreActivity;
import com.yalla.yalla.util.WebPageInfo;
import kotlin.jvm.internal.Intrinsics;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0O00 implements Observer<String> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ StoreActivity f49387OooO0Oo;

    public o00O0O00(StoreActivity storeActivity) {
        this.f49387OooO0Oo = storeActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(String str) {
        String url = str;
        if (OooOo00.OooO00o(url)) {
            return;
        }
        WebPageInfo webPageInfo = new WebPageInfo(WebFrom.CrystalExchangeRecord);
        Intrinsics.checkNotNullParameter(url, "url");
        webPageInfo.f32819OooO0o0 = url;
        webPageInfo.OooO0Oo(o0000.OooO0OO(oO00OOo0.button_myleceived));
        int i = WebActivity.f25584OooOoO0;
        WebActivity.OooO00o.OooO00o(this.f49387OooO0Oo, webPageInfo);
    }
}
