package com.yalla.yalla.ui.dialog;

import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.o000OO00;
import com.yalla.yalla.ui.view.RadiusCardView;
import com.yalla.yalla.ui.view.webView.BaseWebView;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p466o0Oooo0o.oo00o;
import p519o0o0O0oO.oO00000;
import p572o0oOoOO0.oO000O0;
import p641o0ooOOOO.j1;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class GiftBlindHistoryDialog extends p157o00OoOO0.Oooo0<GiftBlindHistoryDialog> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public String f27829OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f27830OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final Lazy f27831OooO0oo;

    public static final class OooO00o extends oo00o {
        public OooO00o() {
        }

        @Override // p466o0Oooo0o.oo00o
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            GiftBlindHistoryDialog.this.OooOOO();
        }
    }

    public static final class OooO0O0 implements BaseWebView.OooO0OO {
        public OooO0O0() {
        }

        @Override // com.yalla.yalla.ui.view.webView.BaseWebView.OooO0OO
        public final void OooO00o(int i) {
        }

        @Override // com.yalla.yalla.ui.view.webView.BaseWebView.OooO0OO
        public final void OooO0O0(boolean z) {
            GiftBlindHistoryDialog giftBlindHistoryDialog = GiftBlindHistoryDialog.this;
            if (z) {
                giftBlindHistoryDialog.OooOOO0().f58155OooO0O0.OooO0o();
                SVGAView sVGAView = giftBlindHistoryDialog.OooOOO0().f58155OooO0O0;
                Intrinsics.checkNotNullExpressionValue(sVGAView, "binding.svgaLoading");
                o000OO00.OooO0O0(sVGAView);
                ScrollView scrollView = giftBlindHistoryDialog.OooOOO0().f58156OooO0OO.f57486OooO00o;
                Intrinsics.checkNotNullExpressionValue(scrollView, "binding.vError.root");
                o000OO00.OooO0O0(scrollView);
                BaseWebView baseWebView = giftBlindHistoryDialog.OooOOO0().f58157OooO0Oo;
                Intrinsics.checkNotNullExpressionValue(baseWebView, "binding.webView");
                o000OO00.OooOOOO(baseWebView);
                return;
            }
            SVGAView sVGAView2 = giftBlindHistoryDialog.OooOOO0().f58155OooO0O0;
            Intrinsics.checkNotNullExpressionValue(sVGAView2, "binding.svgaLoading");
            o000OO00.OooO0O0(sVGAView2);
            ScrollView scrollView2 = giftBlindHistoryDialog.OooOOO0().f58156OooO0OO.f57486OooO00o;
            Intrinsics.checkNotNullExpressionValue(scrollView2, "binding.vError.root");
            o000OO00.OooOOOO(scrollView2);
            BaseWebView baseWebView2 = giftBlindHistoryDialog.OooOOO0().f58157OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(baseWebView2, "binding.webView");
            o000OO00.OooO0O0(baseWebView2);
            LinearLayout linearLayout = giftBlindHistoryDialog.OooOOO0().f58156OooO0OO.f57488OooO0OO;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.vError.nodataLayoutVEmpty");
            o000OO00.OooO0O0(linearLayout);
            LinearLayout linearLayout2 = giftBlindHistoryDialog.OooOOO0().f58156OooO0OO.f57490OooO0o0;
            Intrinsics.checkNotNullExpressionValue(linearLayout2, "binding.vError.nodataLayoutVFirst");
            o000OO00.OooO0O0(linearLayout2);
            LinearLayout linearLayout3 = giftBlindHistoryDialog.OooOOO0().f58156OooO0OO.f57489OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(linearLayout3, "binding.vError.nodataLayoutVError");
            o000OO00.OooOOOO(linearLayout3);
        }
    }

    public static final class OooO0OO extends oO000O0 {
        public OooO0OO() {
        }

        @Override // p572o0oOoOO0.oO000O0
        public final void onClosePage() {
            GiftBlindHistoryDialog giftBlindHistoryDialog = GiftBlindHistoryDialog.this;
            com.code.android.util.OooOOO.OooO0OO(LifecycleOwnerKt.getLifecycleScope(giftBlindHistoryDialog.f27830OooO0oO), new oO00000(giftBlindHistoryDialog, null));
            giftBlindHistoryDialog.OooO0OO();
        }
    }

    public static final class OooO0o extends Lambda implements Function0<j1> {
        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final j1 invoke() {
            GiftBlindHistoryDialog giftBlindHistoryDialog = GiftBlindHistoryDialog.this;
            j1 j1VarInflate = j1.inflate(LayoutInflater.from(giftBlindHistoryDialog.f27830OooO0oO), giftBlindHistoryDialog.f10135OooO0OO, false);
            Intrinsics.checkNotNullExpressionValue(j1VarInflate, "inflate(LayoutInflater.f…tivity), rootView, false)");
            return j1VarInflate;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GiftBlindHistoryDialog(@NotNull FragmentActivity activity) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f27830OooO0oO = activity;
        this.f27831OooO0oo = LazyKt.lazy(new OooO0o());
        RadiusCardView radiusCardView = OooOOO0().f58154OooO00o;
        Intrinsics.checkNotNullExpressionValue(radiusCardView, "binding.root");
        OooO0oO(radiusCardView);
        Window windowOooO0Oo = OooO0Oo();
        if (windowOooO0Oo != null) {
            windowOooO0Oo.setGravity(80);
        }
        activity.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.yalla.yalla.ui.dialog.GiftBlindHistoryDialog.1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(@NotNull LifecycleOwner source, @NotNull Lifecycle.Event event) {
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event == Lifecycle.Event.ON_DESTROY) {
                    GiftBlindHistoryDialog.this.OooOOO0().f58157OooO0Oo.OooO0Oo();
                }
            }
        });
        OooOOO0().f58156OooO0OO.f57487OooO0O0.setOnClickListener(new OooO00o());
        OooOOO0().f58157OooO0Oo.setBackgroundColor(0);
        OooOOO0().f58157OooO0Oo.getSettings().setCacheMode(2);
        OooOOO0().f58157OooO0Oo.setLoadStateListener(new OooO0O0());
        OooOOO0().f58157OooO0Oo.addJavascriptInterface(new OooO0OO(), "Yalla");
        this.f27829OooO = "";
    }

    @Override // com.code.android.easydialog.OooO
    public final void OooOO0o() {
        OooOOO0().f58157OooO0Oo.loadUrl(this.f27829OooO);
        OooOOO();
        super.OooOO0o();
    }

    public final void OooOOO() {
        SVGAView sVGAView = OooOOO0().f58155OooO0O0;
        Intrinsics.checkNotNullExpressionValue(sVGAView, "binding.svgaLoading");
        o000OO00.OooOOOO(sVGAView);
        ScrollView scrollView = OooOOO0().f58156OooO0OO.f57486OooO00o;
        Intrinsics.checkNotNullExpressionValue(scrollView, "binding.vError.root");
        o000OO00.OooO0O0(scrollView);
        BaseWebView baseWebView = OooOOO0().f58157OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(baseWebView, "binding.webView");
        o000OO00.OooOOOO(baseWebView);
        OooOOO0().f58155OooO0O0.OooO0Oo();
        OooOOO0().f58157OooO0Oo.reload();
    }

    public final j1 OooOOO0() {
        return (j1) this.f27831OooO0oo.getValue();
    }
}
