package p520o0o0O00o;

import androidx.lifecycle.Observer;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.model.WebFrom;
import com.yalla.yalla.common.util.WebPageInfo;
import com.yalla.yalla.data.manager.SharedMessageVM;
import kotlin.jvm.internal.Intrinsics;
import p255o00ooO0O.o000O0O0;
import p532o0o0OOO.o00OO000;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o000O0o implements Observer {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final /* synthetic */ o000O0o f42212OooO0O0 = new o000O0o(0);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final /* synthetic */ o000O0o f42213OooO0OO = new o000O0o(1);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f42214OooO00o;

    public /* synthetic */ o000O0o(int i) {
        this.f42214OooO00o = i;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.f42214OooO00o) {
            case 0:
                SharedMessageVM.m292_get_drawerTaskDot_$lambda14$lambda13((Boolean) obj);
                break;
            default:
                String url = (String) obj;
                WebPageInfo webPageInfo = new WebPageInfo(WebFrom.FaqRule);
                Intrinsics.checkNotNullExpressionValue(url, "it");
                Intrinsics.checkNotNullParameter(url, "url");
                webPageInfo.f21237OoooO00 = url;
                webPageInfo.OooO0OO(o000O0O0.OooO0OO(R.string.Member_Group_FAQ));
                o00OO000.f43171OooO00o.OooOOO(webPageInfo);
                break;
        }
    }
}
