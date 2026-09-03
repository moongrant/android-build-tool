package com.yalla.yalla.ui.dialog.giftDialog;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.webkit.JavascriptInterface;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.OooOOO;
import com.code.android.util.o0000;
import com.code.android.util.o000O0;
import com.code.android.util.o000OO00;
import com.facebook.FacebookSdk;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.ui.dialog.GiftBlindHistoryDialog;
import com.yalla.yalla.ui.view.webView.BaseWebView;
import kotlin.Function;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p039OoooOoo.o00OO;
import p402o0Oo0OOO.o00O000o;
import p466o0Oooo0o.oo00o;
import p520o0o0O0oo.a6;
import p520o0o0O0oo.b6;
import p572o0oOoOO0.oO000O0;
import p584o0oOooO0.oO000o00;
import p584o0oOooO0.oO00O0o;
import p587o0oOooo.o0OO000;
import p641o0ooOOOO.a7;
import p641o0ooOOOO.z8;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class GiftLayoutShowSelectViewManager {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f28028OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final FrameLayout f28029OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final z8 f28030OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f28031OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public Function0<Unit> f28032OooO0o0;

    public static final class OooO implements BaseWebView.OooO0OO {
        public OooO() {
        }

        @Override // com.yalla.yalla.ui.view.webView.BaseWebView.OooO0OO
        public final void OooO00o(int i) {
        }

        @Override // com.yalla.yalla.ui.view.webView.BaseWebView.OooO0OO
        public final void OooO0O0(boolean z) {
            GiftLayoutShowSelectViewManager giftLayoutShowSelectViewManager = GiftLayoutShowSelectViewManager.this;
            if (z) {
                giftLayoutShowSelectViewManager.f28030OooO0OO.f59496OooO0OO.OooO0o();
                SVGAView sVGAView = giftLayoutShowSelectViewManager.f28030OooO0OO.f59496OooO0OO;
                Intrinsics.checkNotNullExpressionValue(sVGAView, "binding.svgaLoading");
                o000OO00.OooO0O0(sVGAView);
                giftLayoutShowSelectViewManager.f28030OooO0OO.f59494OooO00o.setBackgroundColor(o0000.OooO00o(oO00O0o.tr_00));
                return;
            }
            z8 z8Var = giftLayoutShowSelectViewManager.f28030OooO0OO;
            SVGAView sVGAView2 = z8Var.f59496OooO0OO;
            Intrinsics.checkNotNullExpressionValue(sVGAView2, "binding.svgaLoading");
            o000OO00.OooO0O0(sVGAView2);
            a7 a7Var = z8Var.f59497OooO0Oo;
            ScrollView scrollView = a7Var.f57486OooO00o;
            Intrinsics.checkNotNullExpressionValue(scrollView, "binding.vError.root");
            o000OO00.OooOOOO(scrollView);
            a7Var.f57486OooO00o.setBackgroundColor(o0000.OooO00o(oO00O0o.white));
            LinearLayout linearLayout = a7Var.f57488OooO0OO;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.vError.nodataLayoutVEmpty");
            o000OO00.OooO0O0(linearLayout);
            LinearLayout linearLayout2 = a7Var.f57490OooO0o0;
            Intrinsics.checkNotNullExpressionValue(linearLayout2, "binding.vError.nodataLayoutVFirst");
            o000OO00.OooO0O0(linearLayout2);
            LinearLayout linearLayout3 = a7Var.f57489OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(linearLayout3, "binding.vError.nodataLayoutVError");
            o000OO00.OooOOOO(linearLayout3);
        }
    }

    public static final class OooO00o implements Observer<Object> {
        public OooO00o() {
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(Object obj) {
            GiftLayoutShowSelectViewManager giftLayoutShowSelectViewManager = GiftLayoutShowSelectViewManager.this;
            OooOOO.OooO0OO(LifecycleOwnerKt.getLifecycleScope(giftLayoutShowSelectViewManager.f28028OooO00o), new a6(giftLayoutShowSelectViewManager, null));
        }
    }

    public static final class OooO0O0 implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f28036OooO0Oo;

        public OooO0O0(OooOO0.OooO00o.C0333OooO00o function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f28036OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f28036OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f28036OooO0Oo;
        }

        public final int hashCode() {
            return this.f28036OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f28036OooO0Oo.invoke(obj);
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<View, Unit> {
        public OooO0OO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            GiftLayoutShowSelectViewManager giftLayoutShowSelectViewManager = GiftLayoutShowSelectViewManager.this;
            OooOOO.OooO0OO(LifecycleOwnerKt.getLifecycleScope(giftLayoutShowSelectViewManager.f28028OooO00o), new b6(giftLayoutShowSelectViewManager, null));
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends oo00o {
        public OooO0o() {
        }

        @Override // p466o0Oooo0o.oo00o
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            GiftLayoutShowSelectViewManager giftLayoutShowSelectViewManager = GiftLayoutShowSelectViewManager.this;
            SVGAView sVGAView = giftLayoutShowSelectViewManager.f28030OooO0OO.f59496OooO0OO;
            Intrinsics.checkNotNullExpressionValue(sVGAView, "binding.svgaLoading");
            o000OO00.OooOOOO(sVGAView);
            z8 z8Var = giftLayoutShowSelectViewManager.f28030OooO0OO;
            z8Var.f59496OooO0OO.OooO0Oo();
            ScrollView scrollView = z8Var.f59497OooO0Oo.f57486OooO00o;
            Intrinsics.checkNotNullExpressionValue(scrollView, "binding.vError.root");
            o000OO00.OooO0O0(scrollView);
            z8Var.f59498OooO0o0.reload();
        }
    }

    public static final class OooOO0 extends oO000O0 {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ String f28040OooO0O0;

        @DebugMetadata(c = "com.yalla.yalla.ui.dialog.giftDialog.GiftLayoutShowSelectViewManager$showWebView$4$toBlindboxRecord$1$1", f = "GiftLayoutShowSelectViewManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ FragmentActivity f28041OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public final /* synthetic */ String f28042OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ GiftLayoutShowSelectViewManager f28043OooO0o0;

            /* JADX INFO: renamed from: com.yalla.yalla.ui.dialog.giftDialog.GiftLayoutShowSelectViewManager$OooOO0$OooO00o$OooO00o, reason: collision with other inner class name */
            public static final class C0333OooO00o extends Lambda implements Function1<String, Unit> {

                /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
                public final /* synthetic */ GiftLayoutShowSelectViewManager f28044OooO0Oo;

                /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
                public final /* synthetic */ String f28045OooO0o0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0333OooO00o(GiftLayoutShowSelectViewManager giftLayoutShowSelectViewManager, String str) {
                    super(1);
                    this.f28044OooO0Oo = giftLayoutShowSelectViewManager;
                    this.f28045OooO0o0 = str;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Unit invoke(String str) {
                    GiftBlindHistoryDialog giftBlindHistoryDialog = new GiftBlindHistoryDialog(this.f28044OooO0Oo.f28028OooO00o);
                    StringBuilder sbOooO00o = o00OO.OooO00o(str);
                    sbOooO00o.append(this.f28045OooO0o0);
                    String url = sbOooO00o.toString();
                    Intrinsics.checkNotNullParameter(url, "url");
                    giftBlindHistoryDialog.f27829OooO = url;
                    giftBlindHistoryDialog.OooOO0o();
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(FragmentActivity fragmentActivity, GiftLayoutShowSelectViewManager giftLayoutShowSelectViewManager, String str, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f28041OooO0Oo = fragmentActivity;
                this.f28043OooO0o0 = giftLayoutShowSelectViewManager;
                this.f28042OooO0o = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new OooO00o(this.f28041OooO0Oo, this.f28043OooO0o0, this.f28042OooO0o, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                o00O000o.f44509OooOo0.observe(this.f28041OooO0Oo, new OooO0O0(new C0333OooO00o(this.f28043OooO0o0, this.f28042OooO0o)));
                return Unit.INSTANCE;
            }
        }

        public OooOO0(String str) {
            this.f28040OooO0O0 = str;
        }

        @Override // p572o0oOoOO0.oO000O0
        @JavascriptInterface
        public void onClosePage() {
            GiftLayoutShowSelectViewManager giftLayoutShowSelectViewManager = GiftLayoutShowSelectViewManager.this;
            OooOOO.OooO0OO(LifecycleOwnerKt.getLifecycleScope(giftLayoutShowSelectViewManager.f28028OooO00o), new b6(giftLayoutShowSelectViewManager, null));
            Function0<Unit> function0 = giftLayoutShowSelectViewManager.f28032OooO0o0;
            if (function0 != null) {
                function0.invoke();
            }
        }

        @Override // p572o0oOoOO0.oO000O0
        @JavascriptInterface
        public void toBlindboxRecord() {
            Context context = o000O0.f10354OooO00o;
            Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
            FragmentActivity fragmentActivity = activityOooO0O0 instanceof FragmentActivity ? (FragmentActivity) activityOooO0O0 : null;
            if (fragmentActivity != null) {
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getMain(), null, new OooO00o(fragmentActivity, GiftLayoutShowSelectViewManager.this, this.f28040OooO0O0, null), 2, null);
            }
        }

        @Override // p572o0oOoOO0.oO000O0
        @JavascriptInterface
        public void webBgColor(@Nullable String str) {
            super.webBgColor(str);
            if (str != null) {
                GiftLayoutShowSelectViewManager.this.f28030OooO0OO.f59498OooO0o0.setBackgroundColor(Color.parseColor(str));
            }
        }
    }

    public static final class OooOO0O extends Lambda implements Function0<Unit> {
        public OooOO0O() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            Animation animationLoadAnimation = AnimationUtils.loadAnimation(FacebookSdk.getApplicationContext(), oO000o00.easy_dialog_anim_enter_bottom_alpha);
            Intrinsics.checkNotNullExpressionValue(animationLoadAnimation, "loadAnimation(getApplica…_anim_enter_bottom_alpha)");
            GiftLayoutShowSelectViewManager.this.f28029OooO0O0.startAnimation(animationLoadAnimation);
            return Unit.INSTANCE;
        }
    }

    public GiftLayoutShowSelectViewManager(@NotNull FragmentActivity context, @NotNull FrameLayout rootParent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(rootParent, "rootParent");
        this.f28028OooO00o = context;
        this.f28029OooO0O0 = rootParent;
        z8 z8VarInflate = z8.inflate(LayoutInflater.from(context));
        Intrinsics.checkNotNullExpressionValue(z8VarInflate, "inflate(LayoutInflater.from(context))");
        this.f28030OooO0OO = z8VarInflate;
        context.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.yalla.yalla.ui.dialog.giftDialog.GiftLayoutShowSelectViewManager.1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(@NotNull LifecycleOwner source, @NotNull Lifecycle.Event event) {
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event == Lifecycle.Event.ON_DESTROY) {
                    GiftLayoutShowSelectViewManager giftLayoutShowSelectViewManager = GiftLayoutShowSelectViewManager.this;
                    giftLayoutShowSelectViewManager.getClass();
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        if (giftLayoutShowSelectViewManager.f28031OooO0Oo) {
                            giftLayoutShowSelectViewManager.f28030OooO0OO.f59498OooO0o0.OooO0Oo();
                        }
                        Result.m4213constructorimpl(Unit.INSTANCE);
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.INSTANCE;
                        Result.m4213constructorimpl(ResultKt.createFailure(th));
                    }
                }
            }
        });
        LiveEventBus.get("SendGiftSuccess").observe(context, new OooO00o());
    }

    public final void OooO00o(@NotNull String url, @NotNull String params) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(params, "params");
        FrameLayout frameLayout = this.f28029OooO0O0;
        o000OO00.OooOOOO(frameLayout);
        OooOO0O oooOO0O = new OooOO0O();
        boolean z = this.f28031OooO0Oo;
        z8 z8Var = this.f28030OooO0OO;
        if (z) {
            frameLayout.removeAllViews();
            o000OO00.OooOOOO(frameLayout);
            frameLayout.addView(z8Var.f59494OooO00o);
            oooOO0O.invoke();
            return;
        }
        this.f28031OooO0Oo = true;
        frameLayout.addView(z8Var.f59494OooO00o);
        oooOO0O.invoke();
        ConstraintLayout constraintLayout = z8Var.f59494OooO00o;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.root");
        o000OO00.OooO(constraintLayout, new OooO0OO());
        a7 a7Var = z8Var.f59497OooO0Oo;
        ScrollView scrollView = a7Var.f57486OooO00o;
        Intrinsics.checkNotNullExpressionValue(scrollView, "binding.vError.root");
        o000OO00.OooO0O0(scrollView);
        a7Var.f57487OooO0O0.setOnClickListener(new OooO0o());
        BaseWebView baseWebView = z8Var.f59498OooO0o0;
        baseWebView.getSettings().setCacheMode(2);
        baseWebView.setBackgroundColor(o0000.OooO00o(oO00O0o.color_1f1e2f_97));
        baseWebView.setLoadStateListener(new OooO());
        baseWebView.addJavascriptInterface(new OooOO0(params), "Yalla");
        baseWebView.loadUrl(url + params);
        o0OO000.OooO00o("302004");
    }
}
