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
import com.yalla.yalla.model.gift.GiftPropTypeShow;
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
import p520o0o0O0oo.x6;
import p520o0o0O0oo.y5;
import p520o0o0O0oo.z5;
import p572o0oOoOO0.oO000O0;
import p572o0oOoOO0.oO0o0o;
import p584o0oOooO0.oO000o00;
import p584o0oOooO0.oO00O0o;
import p587o0oOooo.o0OO000;
import p592o0oo00O.OooOOO0;
import p641o0ooOOOO.a7;
import p641o0ooOOOO.y8;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class GiftLayoutHideSelectViewManager {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final x6 f28008OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final FrameLayout f28009OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final y8 f28010OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f28011OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public Function0<Unit> f28012OooO0o0;

    public static final class OooO implements BaseWebView.OooO0OO {
        public OooO() {
        }

        @Override // com.yalla.yalla.ui.view.webView.BaseWebView.OooO0OO
        public final void OooO00o(int i) {
        }

        @Override // com.yalla.yalla.ui.view.webView.BaseWebView.OooO0OO
        public final void OooO0O0(boolean z) {
            GiftLayoutHideSelectViewManager giftLayoutHideSelectViewManager = GiftLayoutHideSelectViewManager.this;
            if (z) {
                giftLayoutHideSelectViewManager.f28010OooO0OO.f59402OooO0O0.OooO0o();
                SVGAView sVGAView = giftLayoutHideSelectViewManager.f28010OooO0OO.f59402OooO0O0;
                Intrinsics.checkNotNullExpressionValue(sVGAView, "binding.svgaLoading");
                o000OO00.OooO0O0(sVGAView);
                giftLayoutHideSelectViewManager.f28010OooO0OO.f59401OooO00o.setBackgroundColor(o0000.OooO00o(oO00O0o.tr_00));
                return;
            }
            y8 y8Var = giftLayoutHideSelectViewManager.f28010OooO0OO;
            SVGAView sVGAView2 = y8Var.f59402OooO0O0;
            Intrinsics.checkNotNullExpressionValue(sVGAView2, "binding.svgaLoading");
            o000OO00.OooO0O0(sVGAView2);
            a7 a7Var = y8Var.f59403OooO0OO;
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
            GiftLayoutHideSelectViewManager giftLayoutHideSelectViewManager = GiftLayoutHideSelectViewManager.this;
            OooOOO.OooO0OO(LifecycleOwnerKt.getLifecycleScope(giftLayoutHideSelectViewManager.f28008OooO00o.f53375OooO0oO), new y5(giftLayoutHideSelectViewManager, null));
        }
    }

    public static final class OooO0O0 implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f28016OooO0Oo;

        public OooO0O0(OooOO0.OooO0O0.OooO00o function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f28016OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f28016OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f28016OooO0Oo;
        }

        public final int hashCode() {
            return this.f28016OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f28016OooO0Oo.invoke(obj);
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
            GiftLayoutHideSelectViewManager.OooO00o(GiftLayoutHideSelectViewManager.this);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends oo00o {
        public OooO0o() {
        }

        @Override // p466o0Oooo0o.oo00o
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            GiftLayoutHideSelectViewManager giftLayoutHideSelectViewManager = GiftLayoutHideSelectViewManager.this;
            SVGAView sVGAView = giftLayoutHideSelectViewManager.f28010OooO0OO.f59402OooO0O0;
            Intrinsics.checkNotNullExpressionValue(sVGAView, "binding.svgaLoading");
            o000OO00.OooOOOO(sVGAView);
            y8 y8Var = giftLayoutHideSelectViewManager.f28010OooO0OO;
            y8Var.f59402OooO0O0.OooO0Oo();
            ScrollView scrollView = y8Var.f59403OooO0OO.f57486OooO00o;
            Intrinsics.checkNotNullExpressionValue(scrollView, "binding.vError.root");
            o000OO00.OooO0O0(scrollView);
            y8Var.f59404OooO0Oo.reload();
        }
    }

    public static final class OooOO0 extends oO000O0 {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ String f28020OooO0O0;

        public static final class OooO00o extends Lambda implements Function0<Unit> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ GiftLayoutHideSelectViewManager f28021OooO0Oo;

            /* JADX INFO: renamed from: com.yalla.yalla.ui.dialog.giftDialog.GiftLayoutHideSelectViewManager$OooOO0$OooO00o$OooO00o, reason: collision with other inner class name */
            public /* synthetic */ class C0332OooO00o {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[GiftPropTypeShow.values().length];
                    try {
                        iArr[GiftPropTypeShow.InMomentList.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[GiftPropTypeShow.InMomentDetail.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(GiftLayoutHideSelectViewManager giftLayoutHideSelectViewManager) {
                super(0);
                this.f28021OooO0Oo = giftLayoutHideSelectViewManager;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                GiftLayoutHideSelectViewManager giftLayoutHideSelectViewManager = this.f28021OooO0Oo;
                int i = C0332OooO00o.$EnumSwitchMapping$0[giftLayoutHideSelectViewManager.f28008OooO00o.f53374OooO.ordinal()];
                if (i == 1 || i == 2) {
                    GiftLayoutHideSelectViewManager.OooO00o(giftLayoutHideSelectViewManager);
                    giftLayoutHideSelectViewManager.f28008OooO00o.OooO0OO();
                }
                return Unit.INSTANCE;
            }
        }

        @DebugMetadata(c = "com.yalla.yalla.ui.dialog.giftDialog.GiftLayoutHideSelectViewManager$showWebView$4$toBlindboxRecord$1$1", f = "GiftLayoutHideSelectViewManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ FragmentActivity f28022OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public final /* synthetic */ String f28023OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ GiftLayoutHideSelectViewManager f28024OooO0o0;

            public static final class OooO00o extends Lambda implements Function1<String, Unit> {

                /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
                public final /* synthetic */ GiftLayoutHideSelectViewManager f28025OooO0Oo;

                /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
                public final /* synthetic */ String f28026OooO0o0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO00o(GiftLayoutHideSelectViewManager giftLayoutHideSelectViewManager, String str) {
                    super(1);
                    this.f28025OooO0Oo = giftLayoutHideSelectViewManager;
                    this.f28026OooO0o0 = str;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Unit invoke(String str) {
                    GiftBlindHistoryDialog giftBlindHistoryDialog = new GiftBlindHistoryDialog(this.f28025OooO0Oo.f28008OooO00o.f53375OooO0oO);
                    StringBuilder sbOooO00o = o00OO.OooO00o(str);
                    sbOooO00o.append(this.f28026OooO0o0);
                    String url = sbOooO00o.toString();
                    Intrinsics.checkNotNullParameter(url, "url");
                    giftBlindHistoryDialog.f27829OooO = url;
                    giftBlindHistoryDialog.OooOO0o();
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(FragmentActivity fragmentActivity, GiftLayoutHideSelectViewManager giftLayoutHideSelectViewManager, String str, Continuation<? super OooO0O0> continuation) {
                super(2, continuation);
                this.f28022OooO0Oo = fragmentActivity;
                this.f28024OooO0o0 = giftLayoutHideSelectViewManager;
                this.f28023OooO0o = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new OooO0O0(this.f28022OooO0Oo, this.f28024OooO0o0, this.f28023OooO0o, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                o00O000o.f44509OooOo0.observe(this.f28022OooO0Oo, new OooO0O0(new OooO00o(this.f28024OooO0o0, this.f28023OooO0o)));
                return Unit.INSTANCE;
            }
        }

        public OooOO0(String str) {
            this.f28020OooO0O0 = str;
        }

        @Override // p572o0oOoOO0.oO000O0
        public final void onClosePage() {
            GiftLayoutHideSelectViewManager giftLayoutHideSelectViewManager = GiftLayoutHideSelectViewManager.this;
            GiftLayoutHideSelectViewManager.OooO00o(giftLayoutHideSelectViewManager);
            Function0<Unit> function0 = giftLayoutHideSelectViewManager.f28012OooO0o0;
            if (function0 != null) {
                function0.invoke();
            }
        }

        @Override // p572o0oOoOO0.oO000O0
        public final void roomPage(@Nullable String str, int i, int i2) {
            OooOOO0.OooO0O0("enterRoom roomId:" + str + " , giftid = " + i + " , giftUserType:" + i2);
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new oO0o0o(str, Integer.valueOf(i), new OooO00o(GiftLayoutHideSelectViewManager.this), i2, null), 3, null);
        }

        @Override // p572o0oOoOO0.oO000O0
        @JavascriptInterface
        public void toBlindboxRecord() {
            Context context = o000O0.f10354OooO00o;
            Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
            FragmentActivity fragmentActivity = activityOooO0O0 instanceof FragmentActivity ? (FragmentActivity) activityOooO0O0 : null;
            if (fragmentActivity != null) {
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getMain(), null, new OooO0O0(fragmentActivity, GiftLayoutHideSelectViewManager.this, this.f28020OooO0O0, null), 2, null);
            }
        }

        @Override // p572o0oOoOO0.oO000O0
        @JavascriptInterface
        public void webBgColor(@Nullable String str) {
            super.webBgColor(str);
            if (str != null) {
                GiftLayoutHideSelectViewManager.this.f28010OooO0OO.f59404OooO0Oo.setBackgroundColor(Color.parseColor(str));
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
            GiftLayoutHideSelectViewManager.this.f28009OooO0O0.startAnimation(animationLoadAnimation);
            return Unit.INSTANCE;
        }
    }

    public GiftLayoutHideSelectViewManager(@NotNull x6 dialog, @NotNull FrameLayout rootParent) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        Intrinsics.checkNotNullParameter(rootParent, "rootParent");
        this.f28008OooO00o = dialog;
        this.f28009OooO0O0 = rootParent;
        FragmentActivity fragmentActivity = dialog.f53375OooO0oO;
        y8 y8VarInflate = y8.inflate(LayoutInflater.from(fragmentActivity));
        Intrinsics.checkNotNullExpressionValue(y8VarInflate, "inflate(LayoutInflater.f…(dialog.currentActivity))");
        this.f28010OooO0OO = y8VarInflate;
        fragmentActivity.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.yalla.yalla.ui.dialog.giftDialog.GiftLayoutHideSelectViewManager.1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(@NotNull LifecycleOwner source, @NotNull Lifecycle.Event event) {
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event == Lifecycle.Event.ON_DESTROY) {
                    GiftLayoutHideSelectViewManager giftLayoutHideSelectViewManager = GiftLayoutHideSelectViewManager.this;
                    giftLayoutHideSelectViewManager.getClass();
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        if (giftLayoutHideSelectViewManager.f28011OooO0Oo) {
                            giftLayoutHideSelectViewManager.f28010OooO0OO.f59404OooO0Oo.OooO0Oo();
                        }
                        Result.m4213constructorimpl(Unit.INSTANCE);
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.INSTANCE;
                        Result.m4213constructorimpl(ResultKt.createFailure(th));
                    }
                }
            }
        });
        LiveEventBus.get("SendGiftSuccess").observe(fragmentActivity, new OooO00o());
    }

    public static final void OooO00o(GiftLayoutHideSelectViewManager giftLayoutHideSelectViewManager) {
        OooOOO.OooO0OO(LifecycleOwnerKt.getLifecycleScope(giftLayoutHideSelectViewManager.f28008OooO00o.f53375OooO0oO), new z5(giftLayoutHideSelectViewManager, null));
    }

    public final void OooO0O0(@NotNull String url, @NotNull String params) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(params, "params");
        FrameLayout frameLayout = this.f28009OooO0O0;
        o000OO00.OooOOOO(frameLayout);
        OooOO0O oooOO0O = new OooOO0O();
        boolean z = this.f28011OooO0Oo;
        y8 y8Var = this.f28010OooO0OO;
        if (z) {
            frameLayout.removeAllViews();
            o000OO00.OooOOOO(frameLayout);
            frameLayout.addView(y8Var.f59401OooO00o);
            oooOO0O.invoke();
            return;
        }
        this.f28011OooO0Oo = true;
        frameLayout.addView(y8Var.f59401OooO00o);
        oooOO0O.invoke();
        ConstraintLayout constraintLayout = y8Var.f59401OooO00o;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.root");
        o000OO00.OooO(constraintLayout, new OooO0OO());
        a7 a7Var = y8Var.f59403OooO0OO;
        ScrollView scrollView = a7Var.f57486OooO00o;
        Intrinsics.checkNotNullExpressionValue(scrollView, "binding.vError.root");
        o000OO00.OooO0O0(scrollView);
        a7Var.f57487OooO0O0.setOnClickListener(new OooO0o());
        BaseWebView baseWebView = y8Var.f59404OooO0Oo;
        baseWebView.getSettings().setCacheMode(2);
        baseWebView.setBackgroundColor(o0000.OooO00o(oO00O0o.color_1f1e2f_97));
        baseWebView.setLoadStateListener(new OooO());
        baseWebView.addJavascriptInterface(new OooOO0(params), "Yalla");
        baseWebView.loadUrl(url + params);
        o0OO000.OooO00o("302004");
    }
}
