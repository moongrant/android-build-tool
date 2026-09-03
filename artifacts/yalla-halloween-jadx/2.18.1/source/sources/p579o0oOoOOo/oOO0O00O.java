package p579o0oOoOOo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.webkit.JavascriptInterface;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOOO0;
import com.yalla.yalla.common.manager.data.SharedUrlManager;
import com.yalla.yalla.common.ui.view.BaseWebView;
import com.yalla.yalla.common.ui.view.SVGAView;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p142o00OOooO.o000OOo;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.oOO00O;
import p488o0o000oo.o0OO00O;
import p502o0o00o0.o00000O;
import p649o0ooOOoo.df;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class oOO0O00O extends o00000O {

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    @NotNull
    public final Lazy f46085OoooO;

    public static final class OooO00o extends OooOOO0 {
        public OooO00o() {
            super(0L, 1, null);
        }

        @Override // com.yalla.support.common.util.OooOOO0
        public final void onNoDoubleClick(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            SVGAView sVGAView = oOO0O00O.this.OooOO0O().f49191OooO0O0;
            Intrinsics.checkNotNullExpressionValue(sVGAView, "binding.svgaLoading");
            oOO00O.OooO(sVGAView);
            oOO0O00O.this.OooOO0O().f49191OooO0O0.OooO0OO();
            ScrollView scrollView = oOO0O00O.this.OooOO0O().f49192OooO0OO.f49665OooO00o;
            Intrinsics.checkNotNullExpressionValue(scrollView, "binding.vError.root");
            oOO00O.OooO00o(scrollView);
            oOO0O00O.this.OooOO0O().f49193OooO0Oo.reload();
        }
    }

    public static final class OooO0O0 implements BaseWebView.OooO0o {
        public OooO0O0() {
        }

        @Override // com.yalla.yalla.common.ui.view.BaseWebView.OooO0o
        public final void OooO00o(int i) {
        }

        @Override // com.yalla.yalla.common.ui.view.BaseWebView.OooO0o
        public final void OooO0O0(boolean z) {
            if (z) {
                oOO0O00O.this.OooOO0O().f49191OooO0O0.OooO0Oo();
                SVGAView sVGAView = oOO0O00O.this.OooOO0O().f49191OooO0O0;
                Intrinsics.checkNotNullExpressionValue(sVGAView, "binding.svgaLoading");
                oOO00O.OooO00o(sVGAView);
                oOO0O00O.this.OooOO0O().f49190OooO00o.setBackgroundColor(0);
                return;
            }
            oOO0O00O ooo0o00o = oOO0O00O.this;
            SVGAView sVGAView2 = ooo0o00o.OooOO0O().f49191OooO0O0;
            Intrinsics.checkNotNullExpressionValue(sVGAView2, "binding.svgaLoading");
            oOO00O.OooO00o(sVGAView2);
            ScrollView scrollView = ooo0o00o.OooOO0O().f49192OooO0OO.f49665OooO00o;
            Intrinsics.checkNotNullExpressionValue(scrollView, "binding.vError.root");
            oOO00O.OooO(scrollView);
            ooo0o00o.OooOO0O().f49192OooO0OO.f49665OooO00o.setBackgroundColor(o000O0O0.OooO00o(R.color.white));
            LinearLayout linearLayout = ooo0o00o.OooOO0O().f49192OooO0OO.f49668OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.vError.nodataLayoutVEmpty");
            oOO00O.OooO00o(linearLayout);
            LinearLayout linearLayout2 = ooo0o00o.OooOO0O().f49192OooO0OO.f49669OooO0o;
            Intrinsics.checkNotNullExpressionValue(linearLayout2, "binding.vError.nodataLayoutVFirst");
            oOO00O.OooO00o(linearLayout2);
            LinearLayout linearLayout3 = ooo0o00o.OooOO0O().f49192OooO0OO.f49670OooO0o0;
            Intrinsics.checkNotNullExpressionValue(linearLayout3, "binding.vError.nodataLayoutVError");
            oOO00O.OooO(linearLayout3);
        }
    }

    public static final class OooO0OO extends o0OO00O {
        public OooO0OO() {
        }

        @Override // p488o0o000oo.o0OO00O
        @JavascriptInterface
        public void closePage() {
            oOO0O00O.this.OooO0O0();
        }
    }

    public static final class OooO0o extends Lambda implements Function0<df> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f46089Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ oOO0O00O f46090Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(FragmentActivity fragmentActivity, oOO0O00O ooo0o00o) {
            super(0);
            this.f46089Oooo0o = fragmentActivity;
            this.f46090Oooo0oO = ooo0o00o;
        }

        @Override // kotlin.jvm.functions.Function0
        public final df invoke() {
            df dfVarInflate = df.inflate(LayoutInflater.from(this.f46089Oooo0o), this.f46090Oooo0oO.f41545Oooo0oo, true);
            Intrinsics.checkNotNullExpressionValue(dfVarInflate, "inflate(LayoutInflater.f…xt), getRootView(), true)");
            return dfVarInflate;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOO0O00O(@NotNull FragmentActivity context) {
        super(context, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f46085OoooO = LazyKt.lazy(new OooO0o(context, this));
        ConstraintLayout constraintLayout = OooOO0O().f49190OooO00o;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.root");
        OooO0oO(constraintLayout);
        OooO0oo(80);
        Window window = this.f41542Oooo;
        if (window != null) {
            window.setWindowAnimations(R.style.animation_bottom_in_bottom_out);
        }
        ScrollView scrollView = OooOO0O().f49192OooO0OO.f49665OooO00o;
        Intrinsics.checkNotNullExpressionValue(scrollView, "binding.vError.root");
        oOO00O.OooO00o(scrollView);
        OooOO0O().f49192OooO0OO.f49666OooO0O0.setOnClickListener(new OooO00o());
        OooOO0O().f49193OooO0Oo.setBackgroundColor(0);
        OooOO0O().f49193OooO0Oo.getSettings().setCacheMode(2);
        OooOO0O().f49193OooO0Oo.setLoadStateListener(new OooO0O0());
        OooOO0O().f49193OooO0Oo.addJavascriptInterface(new OooO0OO(), "Yalla");
        SharedUrlManager.INSTANCE.getFruitGameUrl().observe(this.f41544Oooo0oO, new o000OOo(this, 4));
    }

    public final df OooOO0O() {
        return (df) this.f46085OoooO.getValue();
    }
}
