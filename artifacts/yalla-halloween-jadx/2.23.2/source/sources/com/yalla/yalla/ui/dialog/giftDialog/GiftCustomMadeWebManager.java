package com.yalla.yalla.ui.dialog.giftDialog;

import android.view.LayoutInflater;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.OooOOO;
import com.code.android.util.o000O;
import com.facebook.FacebookSdk;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.gift.GiftPropModel;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.ui.view.webView.BaseWebView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p184o00o00O0.OooO0OO;
import p187o00o00o0.OooO;
import p405o0Oo0OOO.l0;
import p475o0Ooooo0.o0O00oO0;
import p483o0o000Oo.o0000O0;
import p492o0o00OO0.o0o0000;
import p511o0o0O.Oooo000;
import p541o0o0OoOO.oo00;
import p562o0oOo000.oo000o;
import p576o0oOoOOo.oOO00O0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class GiftCustomMadeWebManager {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public Function3<? super Integer, ? super String, ? super GiftPropModel, Unit> f27523OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f27524OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final FrameLayout f27525OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final l0 f27526OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f27527OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public RoomUserInfoModel f27528OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f27529OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public Function0<Unit> f27530OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f27531OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public boolean f27532OooOO0;

    @DebugMetadata(c = "com.yalla.yalla.ui.dialog.giftDialog.GiftCustomMadeWebManager$easyClosePage$1", f = "GiftCustomMadeWebManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: com.yalla.yalla.ui.dialog.giftDialog.GiftCustomMadeWebManager$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class AnimationAnimationListenerC0331OooO00o implements Animation.AnimationListener {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final /* synthetic */ GiftCustomMadeWebManager f27535OooO00o;

            public AnimationAnimationListenerC0331OooO00o(GiftCustomMadeWebManager giftCustomMadeWebManager) {
                this.f27535OooO00o = giftCustomMadeWebManager;
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationEnd(@Nullable Animation animation) {
                GiftCustomMadeWebManager giftCustomMadeWebManager = this.f27535OooO00o;
                giftCustomMadeWebManager.f27527OooO0Oo = false;
                l0 l0Var = giftCustomMadeWebManager.f27526OooO0OO;
                SVGAView svgaLoading = l0Var.f44108OooO0OO;
                Intrinsics.checkNotNullExpressionValue(svgaLoading, "svgaLoading");
                o000O.OooO0O0(svgaLoading);
                TextView tvSaving = l0Var.f44109OooO0Oo;
                Intrinsics.checkNotNullExpressionValue(tvSaving, "tvSaving");
                o000O.OooO0O0(tvSaving);
                FrameLayout frameLayout = giftCustomMadeWebManager.f27525OooO0O0;
                frameLayout.removeAllViews();
                o000O.OooO0O0(frameLayout);
                Function0<Unit> function0 = giftCustomMadeWebManager.f27530OooO0oO;
                if (function0 != null) {
                    function0.invoke();
                    giftCustomMadeWebManager.f27530OooO0oO = null;
                }
                giftCustomMadeWebManager.f27532OooOO0 = false;
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationRepeat(@Nullable Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationStart(@Nullable Animation animation) {
                this.f27535OooO00o.f27532OooOO0 = true;
            }
        }

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return GiftCustomMadeWebManager.this.new OooO00o(continuation);
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
            Animation animationLoadAnimation = AnimationUtils.loadAnimation(FacebookSdk.getApplicationContext(), oo000o.easy_dialog_anim_exit_bottom_alpha);
            GiftCustomMadeWebManager giftCustomMadeWebManager = GiftCustomMadeWebManager.this;
            animationLoadAnimation.setAnimationListener(new AnimationAnimationListenerC0331OooO00o(giftCustomMadeWebManager));
            giftCustomMadeWebManager.f27525OooO0O0.startAnimation(animationLoadAnimation);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.dialog.giftDialog.GiftCustomMadeWebManager$try2ExitPage$1", f = "GiftCustomMadeWebManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return GiftCustomMadeWebManager.this.new OooO0O0(continuation);
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
            GiftCustomMadeWebManager giftCustomMadeWebManager = GiftCustomMadeWebManager.this;
            ScrollView scrollView = giftCustomMadeWebManager.f27526OooO0OO.f44111OooO0o0.f45166OooO00o;
            Intrinsics.checkNotNullExpressionValue(scrollView, "getRoot(...)");
            if (o000O.OooO0o0(scrollView)) {
                giftCustomMadeWebManager.OooO00o();
            } else {
                l0 l0Var = giftCustomMadeWebManager.f27526OooO0OO;
                SVGAView svgaLoading = l0Var.f44108OooO0OO;
                Intrinsics.checkNotNullExpressionValue(svgaLoading, "svgaLoading");
                o000O.OooOOOO(svgaLoading);
                TextView tvSaving = l0Var.f44109OooO0Oo;
                Intrinsics.checkNotNullExpressionValue(tvSaving, "tvSaving");
                o000O.OooOOOO(tvSaving);
                BaseWebView webView = l0Var.f44110OooO0o;
                Intrinsics.checkNotNullExpressionValue(webView, "webView");
                Intrinsics.checkNotNullParameter(webView, "<this>");
                oOO00O0.OooO00o(webView, "customGiftSavePage()");
            }
            return Unit.INSTANCE;
        }
    }

    public GiftCustomMadeWebManager(@NotNull FragmentActivity context, @NotNull FrameLayout overrideGiftContainer) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(overrideGiftContainer, "overrideGiftContainer");
        this.f27524OooO00o = context;
        this.f27525OooO0O0 = overrideGiftContainer;
        l0 l0VarInflate = l0.inflate(LayoutInflater.from(context));
        Intrinsics.checkNotNullExpressionValue(l0VarInflate, "inflate(...)");
        this.f27526OooO0OO = l0VarInflate;
        context.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.yalla.yalla.ui.dialog.giftDialog.GiftCustomMadeWebManager.1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(@NotNull LifecycleOwner source, @NotNull Lifecycle.Event event) {
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event == Lifecycle.Event.ON_DESTROY) {
                    GiftCustomMadeWebManager giftCustomMadeWebManager = GiftCustomMadeWebManager.this;
                    giftCustomMadeWebManager.getClass();
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        if (giftCustomMadeWebManager.f27529OooO0o0) {
                            giftCustomMadeWebManager.f27526OooO0OO.f44110OooO0o.OooO0Oo();
                        }
                        Result.m4215constructorimpl(Unit.INSTANCE);
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.INSTANCE;
                        Result.m4215constructorimpl(ResultKt.createFailure(th));
                    }
                }
            }
        });
        LiveEventBus.get("SendGiftSuccess").observe(context, new o0o0000(this, 1));
    }

    public final void OooO00o() {
        OooOOO.OooO0OO(LifecycleOwnerKt.getLifecycleScope(this.f27524OooO00o), new OooO00o(null));
    }

    public final void OooO0O0() {
        OooOOO.OooO0OO(LifecycleOwnerKt.getLifecycleScope(this.f27524OooO00o), new OooO0O0(null));
    }

    /* JADX WARN: Code duplicated, block: B:27:0x009a  */
    /* JADX WARN: Code duplicated, block: B:56:0x0124  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void OooO0OO() {
        MutableStateFlow<String> userHeader;
        String value;
        RoomUserInfoModel roomUserInfoModelOooO0o0;
        MutableStateFlow<String> userHeader2;
        String value2;
        String strOooO0o0;
        RoomUserInfoModel roomUserInfoModelOooO0o1;
        MutableStateFlow<String> userHeader3;
        String value3;
        if (this.f27529OooO0o0) {
            HashMap map = new HashMap();
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            String str = (String) o0O00oO0.OooO().getValue();
            String str2 = "";
            if (str == null) {
                str = "";
            }
            map.put("self", str);
            RoomUserInfoModel roomUserInfoModel = this.f27528OooO0o;
            if (Intrinsics.areEqual(roomUserInfoModel, Oooo000.f50937OooO0o0)) {
                map.put("other", "");
            } else {
                RoomUserInfoModel roomUserInfoModelOooO0o2 = null;
                boolean z = false;
                if (Intrinsics.areEqual(roomUserInfoModel, Oooo000.f50938OooO0oO)) {
                    Iterator<T> it = com.yalla.yalla.service.room.OooO00o.f24517OooO0oO.f48585OooOO0O.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            roomUserInfoModelOooO0o1 = null;
                            break;
                        }
                        oo00 oo00Var = (oo00) it.next();
                        if (oo00Var.f55307OooO0OO.getValue().longValue() > 0) {
                            ArrayList arrayList = com.yalla.yalla.service.room.OooO00o.f24511OooO00o;
                            roomUserInfoModelOooO0o1 = com.yalla.yalla.service.room.OooO00o.OooO0o0(oo00Var.f55307OooO0OO.getValue());
                            break;
                        }
                    }
                    if (roomUserInfoModelOooO0o1 != null) {
                        long jLongValue = roomUserInfoModelOooO0o1.getUserId().getValue().longValue();
                        o0O00oO0 o0o00oo2 = o0O00oO0.f47936OooO00o;
                        Long l = (Long) o0O00oO0.OooOOo0().getValue();
                        if (l != null && jLongValue == l.longValue()) {
                            roomUserInfoModelOooO0o1 = null;
                        }
                    } else {
                        roomUserInfoModelOooO0o1 = null;
                    }
                    if (roomUserInfoModelOooO0o1 == null) {
                        for (oo00 oo00Var2 : com.yalla.yalla.service.room.OooO00o.f24517OooO0oO.f48585OooOO0O) {
                            if (oo00Var2.f55307OooO0OO.getValue().longValue() > 0) {
                                if (z) {
                                    ArrayList arrayList2 = com.yalla.yalla.service.room.OooO00o.f24511OooO00o;
                                    roomUserInfoModelOooO0o2 = com.yalla.yalla.service.room.OooO00o.OooO0o0(oo00Var2.f55307OooO0OO.getValue());
                                    break;
                                }
                                z = true;
                            }
                        }
                    } else {
                        roomUserInfoModelOooO0o2 = roomUserInfoModelOooO0o1;
                    }
                    if (roomUserInfoModelOooO0o2 != null && (userHeader3 = roomUserInfoModelOooO0o2.getUserHeader()) != null && (value3 = userHeader3.getValue()) != null) {
                        str2 = value3;
                    }
                    map.put("other", str2);
                } else if (Intrinsics.areEqual(roomUserInfoModel, Oooo000.f50936OooO0o)) {
                    o0000O0 o0000o1 = com.yalla.yalla.service.room.OooO00o.f24519OooOO0;
                    Long l2 = (Long) CollectionsKt.getOrNull(o0000o1.f48495OooO0OO, 0);
                    if (l2 != null) {
                        long jLongValue2 = l2.longValue();
                        Long l3 = (Long) o0O00oO0.OooOOo0().getValue();
                        if (l3 != null && jLongValue2 == l3.longValue()) {
                            roomUserInfoModelOooO0o0 = null;
                        } else {
                            ArrayList arrayList3 = com.yalla.yalla.service.room.OooO00o.f24511OooO00o;
                            roomUserInfoModelOooO0o0 = com.yalla.yalla.service.room.OooO00o.OooO0o0(Long.valueOf(jLongValue2));
                        }
                    } else {
                        roomUserInfoModelOooO0o0 = null;
                    }
                    if (roomUserInfoModelOooO0o0 == null) {
                        Long l4 = (Long) CollectionsKt.getOrNull(o0000o1.f48495OooO0OO, 1);
                        if (l4 != null) {
                            long jLongValue3 = l4.longValue();
                            ArrayList arrayList4 = com.yalla.yalla.service.room.OooO00o.f24511OooO00o;
                            roomUserInfoModelOooO0o2 = com.yalla.yalla.service.room.OooO00o.OooO0o0(Long.valueOf(jLongValue3));
                        }
                    } else {
                        roomUserInfoModelOooO0o2 = roomUserInfoModelOooO0o0;
                    }
                    if (roomUserInfoModelOooO0o2 != null && (userHeader2 = roomUserInfoModelOooO0o2.getUserHeader()) != null && (value2 = userHeader2.getValue()) != null && (strOooO0o0 = OooO0OO.OooO0o0(value2)) != null) {
                        str2 = strOooO0o0;
                    }
                    map.put("other", str2);
                } else {
                    RoomUserInfoModel roomUserInfoModel2 = this.f27528OooO0o;
                    if (roomUserInfoModel2 != null && (userHeader = roomUserInfoModel2.getUserHeader()) != null && (value = userHeader.getValue()) != null) {
                        str2 = value;
                    }
                    map.put("other", str2);
                }
            }
            BaseWebView webView = this.f27526OooO0OO.f44110OooO0o;
            Intrinsics.checkNotNullExpressionValue(webView, "webView");
            String jsonString = OooO.OooO00o(map);
            Intrinsics.checkNotNullParameter(webView, "<this>");
            Intrinsics.checkNotNullParameter(jsonString, "jsonString");
            oOO00O0.OooO00o(webView, "customGiftGetReceiveHead(" + jsonString + ")");
        }
    }
}
