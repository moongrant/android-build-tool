package p535o0o0OOoO;

import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import com.yalla.support.common.util.o00O0O;
import com.yalla.yalla.common.model.WebFrom;
import com.yalla.yalla.common.ui.view.BaseWebView;
import com.yalla.yalla.common.util.WebPageInfo;
import com.yalla.yalla.ui.activity.main.WebActivity;
import kotlin.jvm.internal.Intrinsics;
import p516o0o0O000.o00Oo0;
import p649o0ooOOoo.e7;

/* JADX INFO: loaded from: classes2.dex */
public final class oOo0o00 implements BaseWebView.OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ WebActivity f43729OooO00o;

    public oOo0o00(WebActivity webActivity) {
        this.f43729OooO00o = webActivity;
    }

    @Override // com.yalla.yalla.common.ui.view.BaseWebView.OooO0o
    public final void OooO00o(int i) {
        e7 e7Var = this.f43729OooO00o.f22115OooooOO;
        e7 e7Var2 = null;
        if (e7Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            e7Var = null;
        }
        e7Var.f49212OooO0Oo.setProgress(i);
        if (i != 100) {
            e7 e7Var3 = this.f43729OooO00o.f22115OooooOO;
            if (e7Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                e7Var2 = e7Var3;
            }
            ProgressBar progressBar = e7Var2.f49212OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(progressBar, "binding.pbWeb");
            o00O0O.OooO(progressBar);
            return;
        }
        e7 e7Var4 = this.f43729OooO00o.f22115OooooOO;
        if (e7Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            e7Var2 = e7Var4;
        }
        ProgressBar progressBar2 = e7Var2.f49212OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(progressBar2, "binding.pbWeb");
        o00O0O.OooO00o(progressBar2);
    }

    @Override // com.yalla.yalla.common.ui.view.BaseWebView.OooO0o
    public final void OooO0O0(boolean z) {
        e7 e7Var = this.f43729OooO00o.f22115OooooOO;
        WebPageInfo webPageInfo = null;
        if (e7Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            e7Var = null;
        }
        ProgressBar progressBar = e7Var.f49212OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(progressBar, "binding.pbWeb");
        o00O0O.OooO00o(progressBar);
        if (z) {
            WebActivity webActivity = this.f43729OooO00o;
            e7 e7Var2 = webActivity.f22115OooooOO;
            if (e7Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                e7Var2 = null;
            }
            ScrollView scrollView = e7Var2.f49210OooO0O0.f49665OooO00o;
            Intrinsics.checkNotNullExpressionValue(scrollView, "binding.emptyView.root");
            o00O0O.OooO00o(scrollView);
            o00Oo0 o00oo1 = webActivity.f22111OoooOoo;
            if (o00oo1 != null) {
                o00oo1.f42082OooO0o = o00oo1.f42081OooO0Oo;
            }
            WebPageInfo webPageInfo2 = webActivity.f22118Oooooo0;
            if (webPageInfo2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
                webPageInfo2 = null;
            }
            WebFrom webFrom = webPageInfo2.f21216Oooo0o;
            WebFrom webFrom2 = WebFrom.RoomMainBanner;
            WebPageInfo webPageInfo3 = webActivity.f22118Oooooo0;
            if (webPageInfo3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
            } else {
                webPageInfo = webPageInfo3;
            }
            WebFrom webFrom3 = webPageInfo.f21216Oooo0o;
            WebFrom webFrom4 = WebFrom.ActivityNotice;
            return;
        }
        WebActivity webActivity2 = this.f43729OooO00o;
        e7 e7Var3 = webActivity2.f22115OooooOO;
        if (e7Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            e7Var3 = null;
        }
        ScrollView scrollView2 = e7Var3.f49210OooO0O0.f49665OooO00o;
        Intrinsics.checkNotNullExpressionValue(scrollView2, "binding.emptyView.root");
        o00O0O.OooO(scrollView2);
        e7 e7Var4 = webActivity2.f22115OooooOO;
        if (e7Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            e7Var4 = null;
        }
        LinearLayout linearLayout = e7Var4.f49210OooO0O0.f49669OooO0o;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.emptyView.nodataLayoutVFirst");
        o00O0O.OooO00o(linearLayout);
        e7 e7Var5 = webActivity2.f22115OooooOO;
        if (e7Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            e7Var5 = null;
        }
        LinearLayout linearLayout2 = e7Var5.f49210OooO0O0.f49668OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(linearLayout2, "binding.emptyView.nodataLayoutVEmpty");
        o00O0O.OooO00o(linearLayout2);
        e7 e7Var6 = webActivity2.f22115OooooOO;
        if (e7Var6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            e7Var6 = null;
        }
        LinearLayout linearLayout3 = e7Var6.f49210OooO0O0.f49670OooO0o0;
        Intrinsics.checkNotNullExpressionValue(linearLayout3, "binding.emptyView.nodataLayoutVError");
        o00O0O.OooO(linearLayout3);
        WebPageInfo webPageInfo4 = webActivity2.f22118Oooooo0;
        if (webPageInfo4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
            webPageInfo4 = null;
        }
        WebFrom webFrom5 = webPageInfo4.f21216Oooo0o;
        WebFrom webFrom6 = WebFrom.RoomMainBanner;
        WebPageInfo webPageInfo5 = webActivity2.f22118Oooooo0;
        if (webPageInfo5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
        } else {
            webPageInfo = webPageInfo5;
        }
        WebFrom webFrom7 = webPageInfo.f21216Oooo0o;
        WebFrom webFrom8 = WebFrom.ActivityNotice;
    }
}
