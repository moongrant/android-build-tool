package p564o0oOo00;

import androidx.lifecycle.Observer;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooO0OO;
import com.yalla.support.common.util.OooOOO;
import com.yalla.yalla.common.model.WebFrom;
import com.yalla.yalla.common.util.WebPageInfo;
import com.yalla.yalla.ui.activity.main.WebActivity;
import com.yalla.yalla.ui.activity.store.StoreActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class o000000 implements Observer<String> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ StoreActivity f45135OooO00o;

    public o000000(StoreActivity storeActivity) {
        this.f45135OooO00o = storeActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(String str) {
        String url = str;
        if (OooO0OO.OooO00o(url)) {
            return;
        }
        WebPageInfo webPageInfo = new WebPageInfo(WebFrom.CrystalExchangeRecord);
        Intrinsics.checkNotNullParameter(url, "url");
        webPageInfo.f21217Oooo0oO = url;
        webPageInfo.OooO0OO(OooOOO.OooO0OO(R.string.button_myleceived));
        WebActivity.f22108OoooooO.OooO00o(this.f45135OooO00o, webPageInfo);
    }
}
