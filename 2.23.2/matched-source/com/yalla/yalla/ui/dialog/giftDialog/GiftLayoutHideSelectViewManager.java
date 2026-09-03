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
import com.code.android.util.o000O;
import com.code.android.util.o000O00O;
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
import p039OoooOoo.o0o0Oo;
import p405o0Oo0OOO.m0;
import p405o0Oo0OOO.oOOO0OO0;
import p472o0OoooOO.o0OO;
import p473o0OoooOo.o0OOOO0o;
import p511o0o0O.o00000OO;
import p562o0oOo000.o0OOO0o;
import p562o0oOo000.oo000o;
import p576o0oOoOOo.oO;
import p576o0oOoOOo.oO0o0000;
import p598o0oo00Oo.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class GiftLayoutHideSelectViewManager {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o00000OO f27537OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final FrameLayout f27538OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final m0 f27539OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f27540OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public Function0<Unit> f27541OooO0o0;

    public static final class OooO extends oO0o0000 {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ String f27544OooO0O0;

        public static final class OooO00o extends Lambda implements Function0<Unit> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ GiftLayoutHideSelectViewManager f27545OooO0Oo;

            /* JADX INFO: renamed from: com.yalla.yalla.ui.dialog.giftDialog.GiftLayoutHideSelectViewManager$OooO$OooO00o$OooO00o, reason: collision with other inner class name */
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
                this.f27545OooO0Oo = giftLayoutHideSelectViewManager;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                GiftLayoutHideSelectViewManager giftLayoutHideSelectViewManager = this.f27545OooO0Oo;
                int i = C0332OooO00o.$EnumSwitchMapping$0[giftLayoutHideSelectViewManager.f27537OooO00o.f50958OooO.ordinal()];
                if (i == 1 || i == 2) {
                    GiftLayoutHideSelectViewManager.OooO00o(giftLayoutHideSelectViewManager);
                    giftLayoutHideSelectViewManager.f27537OooO00o.OooO0OO();
                }
                return Unit.INSTANCE;
            }
        }

        @DebugMetadata(c = "com.yalla.yalla.ui.dialog.giftDialog.GiftLayoutHideSelectViewManager$showWebView$4$toBlindboxRecord$1$1", f = "GiftLayoutHideSelectViewManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ FragmentActivity f27546OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public final /* synthetic */ String f27547OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ GiftLayoutHideSelectViewManager f27548OooO0o0;

            public static final class OooO00o extends Lambda implements Function1<String, Unit> {

                /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
                public final /* synthetic */ GiftLayoutHideSelectViewManager f27549OooO0Oo;

                /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
                public final /* synthetic */ String f27550OooO0o0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO00o(GiftLayoutHideSelectViewManager giftLayoutHideSelectViewManager, String str) {
                    super(1);
                    this.f27549OooO0Oo = giftLayoutHideSelectViewManager;
                    this.f27550OooO0o0 = str;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Unit invoke(String str) {
                    GiftBlindHistoryDialog giftBlindHistoryDialog = new GiftBlindHistoryDialog(this.f27549OooO0Oo.f27537OooO00o.f50959OooO0oO);
                    StringBuilder sbOooO00o = o0o0Oo.OooO00o(str);
                    sbOooO00o.append(this.f27550OooO0o0);
                    String url = sbOooO00o.toString();
                    Intrinsics.checkNotNullParameter(url, "url");
                    giftBlindHistoryDialog.f27367OooO = url;
                    giftBlindHistoryDialog.OooOO0o();
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(FragmentActivity fragmentActivity, GiftLayoutHideSelectViewManager giftLayoutHideSelectViewManager, String str, Continuation<? super OooO0O0> continuation) {
                super(2, continuation);
                this.f27546OooO0Oo = fragmentActivity;
                this.f27548OooO0o0 = giftLayoutHideSelectViewManager;
                this.f27547OooO0o = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new OooO0O0(this.f27546OooO0Oo, this.f27548OooO0o0, this.f27547OooO0o, continuation);
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
                p583o0oOoo00.o00000OO.f56678OooOo0.observe(this.f27546OooO0Oo, new OooO00o(new OooO00o(this.f27548OooO0o0, this.f27547OooO0o)));
                return Unit.INSTANCE;
            }
        }

        public OooO(String str) {
            this.f27544OooO0O0 = str;
        }

        @Override // p576o0oOoOOo.oO0o0000
        public final void onClosePage() {
            GiftLayoutHideSelectViewManager giftLayoutHideSelectViewManager = GiftLayoutHideSelectViewManager.this;
            GiftLayoutHideSelectViewManager.OooO00o(giftLayoutHideSelectViewManager);
            Function0<Unit> function0 = giftLayoutHideSelectViewManager.f27541OooO0o0;
            if (function0 != null) {
                function0.invoke();
            }
        }

        @Override // p576o0oOoOOo.oO0o0000
        public final void roomPage(@Nullable String str, int i, int i2) {
            o0000O00.OooO0O0("enterRoom roomId:" + str + " , giftid = " + i + " , giftUserType:" + i2);
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new oO(str, Integer.valueOf(i), new OooO00o(GiftLayoutHideSelectViewManager.this), i2, null), 3, null);
        }

        @Override // p576o0oOoOOo.oO0o0000
        @JavascriptInterface
        public void toBlindboxRecord() {
            Context context = o000O00O.f13421OooO00o;
            Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
            FragmentActivity fragmentActivity = activityOooO0O0 instanceof FragmentActivity ? (FragmentActivity) activityOooO0O0 : null;
            if (fragmentActivity != null) {
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getMain(), null, new OooO0O0(fragmentActivity, GiftLayoutHideSelectViewManager.this, this.f27544OooO0O0, null), 2, null);
            }
        }

        @Override // p576o0oOoOOo.oO0o0000
        @JavascriptInterface
        public void webBgColor(@Nullable String str) {
            super.webBgColor(str);
            if (str != null) {
                GiftLayoutHideSelectViewManager.this.f27539OooO0OO.f44157OooO0Oo.setBackgroundColor(Color.parseColor(str));
            }
        }
    }

    public static final class OooO00o implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f27551OooO0Oo;

        public OooO00o(OooO.OooO0O0.OooO00o function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f27551OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f27551OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f27551OooO0Oo;
        }

        public final int hashCode() {
            return this.f27551OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f27551OooO0Oo.invoke(obj);
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<View, Unit> {
        public OooO0O0() {
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

    public static final class OooO0OO extends o0OOOO0o {
        public OooO0OO() {
        }

        @Override // p473o0OoooOo.o0OOOO0o
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            GiftLayoutHideSelectViewManager giftLayoutHideSelectViewManager = GiftLayoutHideSelectViewManager.this;
            SVGAView svgaLoading = giftLayoutHideSelectViewManager.f27539OooO0OO.f44155OooO0O0;
            Intrinsics.checkNotNullExpressionValue(svgaLoading, "svgaLoading");
            o000O.OooOOOO(svgaLoading);
            m0 m0Var = giftLayoutHideSelectViewManager.f27539OooO0OO;
            m0Var.f44155OooO0O0.OooO0Oo();
            ScrollView scrollView = m0Var.f44156OooO0OO.f45166OooO00o;
            Intrinsics.checkNotNullExpressionValue(scrollView, "getRoot(...)");
            o000O.OooO0O0(scrollView);
            m0Var.f44157OooO0Oo.reload();
        }
    }

    public static final class OooO0o implements BaseWebView.OooO0OO {
        public OooO0o() {
        }

        @Override // com.yalla.yalla.ui.view.webView.BaseWebView.OooO0OO
        public final void OooO00o(int i) {
        }

        @Override // com.yalla.yalla.ui.view.webView.BaseWebView.OooO0OO
        public final void OooO0O0(boolean z) {
            GiftLayoutHideSelectViewManager giftLayoutHideSelectViewManager = GiftLayoutHideSelectViewManager.this;
            if (z) {
                giftLayoutHideSelectViewManager.f27539OooO0OO.f44155OooO0O0.OooO0o();
                SVGAView svgaLoading = giftLayoutHideSelectViewManager.f27539OooO0OO.f44155OooO0O0;
                Intrinsics.checkNotNullExpressionValue(svgaLoading, "svgaLoading");
                o000O.OooO0O0(svgaLoading);
                giftLayoutHideSelectViewManager.f27539OooO0OO.f44154OooO00o.setBackgroundColor(o0000.OooO00o(o0OOO0o.tr_00));
                return;
            }
            m0 m0Var = giftLayoutHideSelectViewManager.f27539OooO0OO;
            SVGAView svgaLoading2 = m0Var.f44155OooO0O0;
            Intrinsics.checkNotNullExpressionValue(svgaLoading2, "svgaLoading");
            o000O.OooO0O0(svgaLoading2);
            oOOO0OO0 oooo0oo0 = m0Var.f44156OooO0OO;
            ScrollView scrollView = oooo0oo0.f45166OooO00o;
            Intrinsics.checkNotNullExpressionValue(scrollView, "getRoot(...)");
            o000O.OooOOOO(scrollView);
            oooo0oo0.f45166OooO00o.setBackgroundColor(o0000.OooO00o(o0OOO0o.white));
            LinearLayout nodataLayoutVEmpty = oooo0oo0.f45168OooO0OO;
            Intrinsics.checkNotNullExpressionValue(nodataLayoutVEmpty, "nodataLayoutVEmpty");
            o000O.OooO0O0(nodataLayoutVEmpty);
            LinearLayout nodataLayoutVFirst = oooo0oo0.f45170OooO0o0;
            Intrinsics.checkNotNullExpressionValue(nodataLayoutVFirst, "nodataLayoutVFirst");
            o000O.OooO0O0(nodataLayoutVFirst);
            LinearLayout nodataLayoutVError = oooo0oo0.f45169OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(nodataLayoutVError, "nodataLayoutVError");
            o000O.OooOOOO(nodataLayoutVError);
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<Unit> {
        public OooOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            Animation animationLoadAnimation = AnimationUtils.loadAnimation(FacebookSdk.getApplicationContext(), oo000o.easy_dialog_anim_enter_bottom_alpha);
            Intrinsics.checkNotNullExpressionValue(animationLoadAnimation, "loadAnimation(...)");
            GiftLayoutHideSelectViewManager.this.f27538OooO0O0.startAnimation(animationLoadAnimation);
            return Unit.INSTANCE;
        }
    }

    public GiftLayoutHideSelectViewManager(@NotNull o00000OO dialog, @NotNull FrameLayout rootParent) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        Intrinsics.checkNotNullParameter(rootParent, "rootParent");
        this.f27537OooO00o = dialog;
        this.f27538OooO0O0 = rootParent;
        FragmentActivity fragmentActivity = dialog.f50959OooO0oO;
        m0 m0VarInflate = m0.inflate(LayoutInflater.from(fragmentActivity));
        Intrinsics.checkNotNullExpressionValue(m0VarInflate, "inflate(...)");
        this.f27539OooO0OO = m0VarInflate;
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
                        if (giftLayoutHideSelectViewManager.f27540OooO0Oo) {
                            giftLayoutHideSelectViewManager.f27539OooO0OO.f44157OooO0Oo.OooO0Oo();
                        }
                        Result.m4215constructorimpl(Unit.INSTANCE);
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.INSTANCE;
                        Result.m4215constructorimpl(ResultKt.createFailure(th));
                    }
                }
            }
        });
        LiveEventBus.get("SendGiftSuccess").observe(fragmentActivity, new o0OO(this, 1));
    }

    public static final void OooO00o(GiftLayoutHideSelectViewManager giftLayoutHideSelectViewManager) {
        OooOOO.OooO0OO(LifecycleOwnerKt.getLifecycleScope(giftLayoutHideSelectViewManager.f27537OooO00o.f50959OooO0oO), new p511o0o0O.OooOOO(giftLayoutHideSelectViewManager, null));
    }

    public final void OooO0O0(@NotNull String url, @NotNull String params) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(params, "params");
        FrameLayout frameLayout = this.f27538OooO0O0;
        o000O.OooOOOO(frameLayout);
        OooOO0 oooOO1 = new OooOO0();
        boolean z = this.f27540OooO0Oo;
        m0 m0Var = this.f27539OooO0OO;
        if (z) {
            frameLayout.removeAllViews();
            o000O.OooOOOO(frameLayout);
            frameLayout.addView(m0Var.f44154OooO00o);
            oooOO1.invoke();
            return;
        }
        this.f27540OooO0Oo = true;
        frameLayout.addView(m0Var.f44154OooO00o);
        oooOO1.invoke();
        ConstraintLayout constraintLayout = m0Var.f44154OooO00o;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        o000O.OooO(constraintLayout, new OooO0O0());
        oOOO0OO0 oooo0oo0 = m0Var.f44156OooO0OO;
        ScrollView scrollView = oooo0oo0.f45166OooO00o;
        Intrinsics.checkNotNullExpressionValue(scrollView, "getRoot(...)");
        o000O.OooO0O0(scrollView);
        oooo0oo0.f45167OooO0O0.setOnClickListener(new OooO0OO());
        BaseWebView baseWebView = m0Var.f44157OooO0Oo;
        baseWebView.getSettings().setCacheMode(2);
        baseWebView.setBackgroundColor(o0000.OooO00o(o0OOO0o.color_1f1e2f_97));
        baseWebView.setLoadStateListener(new OooO0o());
        baseWebView.addJavascriptInterface(new OooO(params), "Yalla");
        baseWebView.loadUrl(url + params);
        o0oo0000.OooO00o.OooO0O0("302004");
    }
}
