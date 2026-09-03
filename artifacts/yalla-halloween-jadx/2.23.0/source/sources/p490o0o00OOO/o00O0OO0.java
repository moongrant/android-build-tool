package p490o0o00OOO;

import androidx.lifecycle.Observer;
import com.code.android.util.OooOo00;
import com.code.android.util.o0000;
import com.yalla.yalla.model.WebFrom;
import com.yalla.yalla.ui.activity.main.WebActivity;
import com.yalla.yalla.util.WebPageInfo;
import kotlin.jvm.internal.Intrinsics;
import p464o0Oooo.o000000O;
import p584o0oOooO0.oO00OOo0;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0OO0 implements Observer<String> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o000O f48654OooO0Oo;

    public o00O0OO0(o000O o000o) {
        this.f48654OooO0Oo = o000o;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(String str) {
        String url = str;
        o0OO000.OooO00o("102201");
        if (OooOo00.OooO00o(url)) {
            return;
        }
        WebPageInfo webPageInfo = new WebPageInfo(WebFrom.StoreCoin);
        Intrinsics.checkNotNull(url);
        Intrinsics.checkNotNullParameter(url, "url");
        webPageInfo.f32819OooO0o0 = url;
        o000000O o000000o2 = o000000O.f46674OooO00o;
        webPageInfo.OooO00o("region", String.valueOf(o000000O.OooOOO0().getValue()));
        webPageInfo.OooO0Oo(o0000.OooO0OO(oO00OOo0.user_unique_id));
        webPageInfo.f32816OooO = true;
        int i = WebActivity.f25584OooOoO0;
        WebActivity.OooO00o.OooO00o(this.f48654OooO0Oo.f48470OooO00o, webPageInfo);
    }
}
