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
import com.code.android.util.o000O;
import com.yalla.yalla.ui.view.RadiusCardView;
import com.yalla.yalla.ui.view.webView.BaseWebView;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p205o00o0o0o.o0000OO0;
import p405o0Oo0OOO.o0oOOo;
import p473o0OoooOo.o0OOOO0o;
import p576o0oOoOOo.oO0o0000;
import p650o0ooo.o0O0OOO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class GiftBlindHistoryDialog extends o0000OO0<GiftBlindHistoryDialog> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public String f27367OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f27368OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final Lazy f27369OooO0oo;

    public static final class OooO00o extends o0OOOO0o {
        public OooO00o() {
        }

        @Override // p473o0OoooOo.o0OOOO0o
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
                giftBlindHistoryDialog.OooOOO0().f44684OooO0O0.OooO0o();
                SVGAView svgaLoading = giftBlindHistoryDialog.OooOOO0().f44684OooO0O0;
                Intrinsics.checkNotNullExpressionValue(svgaLoading, "svgaLoading");
                o000O.OooO0O0(svgaLoading);
                ScrollView scrollView = giftBlindHistoryDialog.OooOOO0().f44685OooO0OO.f45166OooO00o;
                Intrinsics.checkNotNullExpressionValue(scrollView, "getRoot(...)");
                o000O.OooO0O0(scrollView);
                BaseWebView webView = giftBlindHistoryDialog.OooOOO0().f44686OooO0Oo;
                Intrinsics.checkNotNullExpressionValue(webView, "webView");
                o000O.OooOOOO(webView);
                return;
            }
            SVGAView svgaLoading2 = giftBlindHistoryDialog.OooOOO0().f44684OooO0O0;
            Intrinsics.checkNotNullExpressionValue(svgaLoading2, "svgaLoading");
            o000O.OooO0O0(svgaLoading2);
            ScrollView scrollView2 = giftBlindHistoryDialog.OooOOO0().f44685OooO0OO.f45166OooO00o;
            Intrinsics.checkNotNullExpressionValue(scrollView2, "getRoot(...)");
            o000O.OooOOOO(scrollView2);
            BaseWebView webView2 = giftBlindHistoryDialog.OooOOO0().f44686OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(webView2, "webView");
            o000O.OooO0O0(webView2);
            LinearLayout nodataLayoutVEmpty = giftBlindHistoryDialog.OooOOO0().f44685OooO0OO.f45168OooO0OO;
            Intrinsics.checkNotNullExpressionValue(nodataLayoutVEmpty, "nodataLayoutVEmpty");
            o000O.OooO0O0(nodataLayoutVEmpty);
            LinearLayout nodataLayoutVFirst = giftBlindHistoryDialog.OooOOO0().f44685OooO0OO.f45170OooO0o0;
            Intrinsics.checkNotNullExpressionValue(nodataLayoutVFirst, "nodataLayoutVFirst");
            o000O.OooO0O0(nodataLayoutVFirst);
            LinearLayout nodataLayoutVError = giftBlindHistoryDialog.OooOOO0().f44685OooO0OO.f45169OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(nodataLayoutVError, "nodataLayoutVError");
            o000O.OooOOOO(nodataLayoutVError);
        }
    }

    public static final class OooO0OO extends oO0o0000 {
        public OooO0OO() {
        }

        @Override // p576o0oOoOOo.oO0o0000
        public final void onClosePage() {
            GiftBlindHistoryDialog giftBlindHistoryDialog = GiftBlindHistoryDialog.this;
            com.code.android.util.OooOOO.OooO0OO(LifecycleOwnerKt.getLifecycleScope(giftBlindHistoryDialog.f27368OooO0oO), new o0O0OOO0(giftBlindHistoryDialog, null));
            giftBlindHistoryDialog.OooO0OO();
        }
    }

    public static final class OooO0o extends Lambda implements Function0<o0oOOo> {
        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o0oOOo invoke() {
            GiftBlindHistoryDialog giftBlindHistoryDialog = GiftBlindHistoryDialog.this;
            o0oOOo o0ooooInflate = o0oOOo.inflate(LayoutInflater.from(giftBlindHistoryDialog.f27368OooO0oO), giftBlindHistoryDialog.f38489OooO0OO, false);
            Intrinsics.checkNotNullExpressionValue(o0ooooInflate, "inflate(...)");
            return o0ooooInflate;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GiftBlindHistoryDialog(@NotNull FragmentActivity activity) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f27368OooO0oO = activity;
        this.f27369OooO0oo = LazyKt.lazy(new OooO0o());
        RadiusCardView radiusCardView = OooOOO0().f44683OooO00o;
        Intrinsics.checkNotNullExpressionValue(radiusCardView, "getRoot(...)");
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
                    GiftBlindHistoryDialog.this.OooOOO0().f44686OooO0Oo.OooO0Oo();
                }
            }
        });
        OooOOO0().f44685OooO0OO.f45167OooO0O0.setOnClickListener(new OooO00o());
        OooOOO0().f44686OooO0Oo.setBackgroundColor(0);
        OooOOO0().f44686OooO0Oo.getSettings().setCacheMode(2);
        OooOOO0().f44686OooO0Oo.setLoadStateListener(new OooO0O0());
        OooOOO0().f44686OooO0Oo.addJavascriptInterface(new OooO0OO(), "Yalla");
        this.f27367OooO = "";
    }

    @Override // p185o00o00Oo.o0000oo
    public final void OooOO0o() {
        OooOOO0().f44686OooO0Oo.loadUrl(this.f27367OooO);
        OooOOO();
        super.OooOO0o();
    }

    public final void OooOOO() {
        SVGAView svgaLoading = OooOOO0().f44684OooO0O0;
        Intrinsics.checkNotNullExpressionValue(svgaLoading, "svgaLoading");
        o000O.OooOOOO(svgaLoading);
        ScrollView scrollView = OooOOO0().f44685OooO0OO.f45166OooO00o;
        Intrinsics.checkNotNullExpressionValue(scrollView, "getRoot(...)");
        o000O.OooO0O0(scrollView);
        BaseWebView webView = OooOOO0().f44686OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(webView, "webView");
        o000O.OooOOOO(webView);
        OooOOO0().f44684OooO0O0.OooO0Oo();
        OooOOO0().f44686OooO0Oo.reload();
    }

    public final o0oOOo OooOOO0() {
        return (o0oOOo) this.f27369OooO0oo.getValue();
    }
}
