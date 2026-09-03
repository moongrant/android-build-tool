package p505o0o00oOO;

import androidx.lifecycle.Observer;
import com.code.android.util.OooOo00;
import com.code.android.util.o0000;
import com.yalla.yalla.model.WebFrom;
import com.yalla.yalla.ui.activity.main.WebActivity;
import com.yalla.yalla.ui.activity.store.StoreActivity;
import com.yalla.yalla.util.WebPageInfo;
import kotlin.jvm.internal.Intrinsics;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OO00o0 implements Observer<String> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ StoreActivity f50352OooO0Oo;

    public o0OO00o0(StoreActivity storeActivity) {
        this.f50352OooO0Oo = storeActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(String str) {
        String url = str;
        if (OooOo00.OooO00o(url)) {
            return;
        }
        WebPageInfo webPageInfo = new WebPageInfo(WebFrom.CrystalExchangeRecord);
        Intrinsics.checkNotNullParameter(url, "url");
        webPageInfo.f32283OooO0o0 = url;
        webPageInfo.OooO0Oo(o0000.OooO0OO(o000000.button_myleceived));
        int i = WebActivity.f25130OooOoO0;
        WebActivity.OooO00o.OooO00o(this.f50352OooO0Oo, webPageInfo);
    }
}
