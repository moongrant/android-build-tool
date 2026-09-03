package com.yalla.yalla.ui.dialog;

import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.webkit.JavascriptInterface;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.yalla.yalla.common.ui.view.BaseWebView;
import com.yalla.yalla.common.ui.view.SVGAView;
import com.yalla.yalla.ui.view.RadiusCardView;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p254o00ooO0O.o0000O0;
import p254o00ooO0O.oOO00O;
import p255o00ooO0o.o00O00OO;
import p488o0o000oo.o0OO00O;
import p579o0oOoOOo.oOO0O0;
import p649o0ooOOoo.v7;
import p654o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class GiftBlindHistoryDialog extends o00O00OO<GiftBlindHistoryDialog> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public String f23731OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f23732OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final Lazy f23733OooO0oo;

    public static final class OooO00o extends o00Oo0 {
        public OooO00o() {
        }

        @Override // p654o0ooo.o00Oo0
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            GiftBlindHistoryDialog.this.OooOOOO();
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
                GiftBlindHistoryDialog giftBlindHistoryDialog = GiftBlindHistoryDialog.this;
                giftBlindHistoryDialog.OooOOO().f50783OooO0O0.OooO0Oo();
                SVGAView sVGAView = giftBlindHistoryDialog.OooOOO().f50783OooO0O0;
                Intrinsics.checkNotNullExpressionValue(sVGAView, "binding.svgaLoading");
                oOO00O.OooO00o(sVGAView);
                ScrollView scrollView = giftBlindHistoryDialog.OooOOO().f50784OooO0OO.f49665OooO00o;
                Intrinsics.checkNotNullExpressionValue(scrollView, "binding.vError.root");
                oOO00O.OooO00o(scrollView);
                BaseWebView baseWebView = giftBlindHistoryDialog.OooOOO().f50785OooO0Oo;
                Intrinsics.checkNotNullExpressionValue(baseWebView, "binding.webView");
                oOO00O.OooO(baseWebView);
                return;
            }
            GiftBlindHistoryDialog giftBlindHistoryDialog2 = GiftBlindHistoryDialog.this;
            SVGAView sVGAView2 = giftBlindHistoryDialog2.OooOOO().f50783OooO0O0;
            Intrinsics.checkNotNullExpressionValue(sVGAView2, "binding.svgaLoading");
            oOO00O.OooO00o(sVGAView2);
            ScrollView scrollView2 = giftBlindHistoryDialog2.OooOOO().f50784OooO0OO.f49665OooO00o;
            Intrinsics.checkNotNullExpressionValue(scrollView2, "binding.vError.root");
            oOO00O.OooO(scrollView2);
            BaseWebView baseWebView2 = giftBlindHistoryDialog2.OooOOO().f50785OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(baseWebView2, "binding.webView");
            oOO00O.OooO00o(baseWebView2);
            LinearLayout linearLayout = giftBlindHistoryDialog2.OooOOO().f50784OooO0OO.f49668OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.vError.nodataLayoutVEmpty");
            oOO00O.OooO00o(linearLayout);
            LinearLayout linearLayout2 = giftBlindHistoryDialog2.OooOOO().f50784OooO0OO.f49669OooO0o;
            Intrinsics.checkNotNullExpressionValue(linearLayout2, "binding.vError.nodataLayoutVFirst");
            oOO00O.OooO00o(linearLayout2);
            LinearLayout linearLayout3 = giftBlindHistoryDialog2.OooOOO().f50784OooO0OO.f49670OooO0o0;
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
            GiftBlindHistoryDialog giftBlindHistoryDialog = GiftBlindHistoryDialog.this;
            o0000O0.OooO0O0(LifecycleOwnerKt.getLifecycleScope(giftBlindHistoryDialog.f23732OooO0oO), new oOO0O0(giftBlindHistoryDialog, null));
            giftBlindHistoryDialog.OooO0Oo();
        }
    }

    public static final class OooO0o extends Lambda implements Function0<v7> {
        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v7 invoke() {
            v7 v7VarInflate = v7.inflate(LayoutInflater.from(GiftBlindHistoryDialog.this.f23732OooO0oO), GiftBlindHistoryDialog.this.f34201OooO0OO, false);
            Intrinsics.checkNotNullExpressionValue(v7VarInflate, "inflate(LayoutInflater.f…tivity), rootView, false)");
            return v7VarInflate;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GiftBlindHistoryDialog(@NotNull FragmentActivity activity) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f23732OooO0oO = activity;
        this.f23733OooO0oo = LazyKt.lazy(new OooO0o());
        RadiusCardView radiusCardView = OooOOO().f50782OooO00o;
        Intrinsics.checkNotNullExpressionValue(radiusCardView, "binding.root");
        OooO0oo(radiusCardView);
        Window windowOooO0o0 = OooO0o0();
        if (windowOooO0o0 != null) {
            windowOooO0o0.setGravity(80);
        }
        activity.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.yalla.yalla.ui.dialog.GiftBlindHistoryDialog.1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(@NotNull LifecycleOwner source, @NotNull Lifecycle.Event event) {
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event == Lifecycle.Event.ON_DESTROY) {
                    GiftBlindHistoryDialog.this.OooOOO().f50785OooO0Oo.OooO0OO();
                }
            }
        });
        OooOOO().f50784OooO0OO.f49666OooO0O0.setOnClickListener(new OooO00o());
        OooOOO().f50785OooO0Oo.setBackgroundColor(0);
        OooOOO().f50785OooO0Oo.getSettings().setCacheMode(2);
        OooOOO().f50785OooO0Oo.setLoadStateListener(new OooO0O0());
        OooOOO().f50785OooO0Oo.addJavascriptInterface(new OooO0OO(), "Yalla");
        this.f23731OooO = "";
    }

    public final v7 OooOOO() {
        return (v7) this.f23733OooO0oo.getValue();
    }

    @Override // p250o00oo0oO.o000O000
    public final void OooOOO0() {
        OooOOO().f50785OooO0Oo.loadUrl(this.f23731OooO);
        OooOOOO();
        super.OooOOO0();
    }

    public final void OooOOOO() {
        SVGAView sVGAView = OooOOO().f50783OooO0O0;
        Intrinsics.checkNotNullExpressionValue(sVGAView, "binding.svgaLoading");
        oOO00O.OooO(sVGAView);
        ScrollView scrollView = OooOOO().f50784OooO0OO.f49665OooO00o;
        Intrinsics.checkNotNullExpressionValue(scrollView, "binding.vError.root");
        oOO00O.OooO00o(scrollView);
        BaseWebView baseWebView = OooOOO().f50785OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(baseWebView, "binding.webView");
        oOO00O.OooO(baseWebView);
        OooOOO().f50783OooO0O0.OooO0OO();
        OooOOO().f50785OooO0Oo.reload();
    }
}
