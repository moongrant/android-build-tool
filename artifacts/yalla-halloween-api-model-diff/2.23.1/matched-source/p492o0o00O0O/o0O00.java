package p492o0o00O0O;

import androidx.lifecycle.Observer;
import com.yalla.yalla.ui.activity.main.WebActivity;
import com.yalla.yalla.ui.screen.user.vip.VipScreen;
import com.yalla.yalla.ui.view.webView.BaseWebView2;
import com.yalla.yalla.ui.vm.room.VipVm;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o0O00 implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f48977OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f48978OooO0o0;

    public /* synthetic */ o0O00(Object obj, int i) {
        this.f48977OooO0Oo = i;
        this.f48978OooO0o0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        BaseWebView2 baseWebView2;
        int i = this.f48977OooO0Oo;
        Object obj2 = this.f48978OooO0o0;
        switch (i) {
            case 0:
                WebActivity this$0 = (WebActivity) obj2;
                int i2 = WebActivity.f25131OooOoO0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (this$0.f25133OooOOo0 && (baseWebView2 = this$0.f25139OooOo0o) != null) {
                    baseWebView2.reload();
                    break;
                }
                break;
            default:
                VipScreen.Content$lambda$5((VipVm) obj2, ((Boolean) obj).booleanValue());
                break;
        }
    }
}
