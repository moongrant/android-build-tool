package com.yalla.yalla.ui.activity.main;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Window;
import android.webkit.ValueCallback;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.AndroidMenu_androidKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import androidx.compose.ui.window.PopupProperties;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.media3.session.o00O0O0;
import com.code.android.util.o000000;
import com.code.android.util.o0O0O00;
import com.facebook.share.internal.ShareConstants;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.qiniu.android.common.Constants;
import com.yalla.yalla.base.activity.BaseFragmentActivity;
import com.yalla.yalla.model.WebFrom;
import com.yalla.yalla.ui.view.webView.BaseWebView2;
import com.yalla.yalla.ui.vm.main.WebVM;
import com.yalla.yalla.util.WebPageInfo;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p022Oooo00O.o0O00oO0;
import p193o00o0O0O.o0000oo;
import p195o00o0OO0.o00000OO;
import p379o0OOoOOO.oOO00O;
import p476o0OooooO.o0OOo000;
import p487o0o00O.o0000O;
import p487o0o00O.o0O00;
import p487o0o00O.o0O000Oo;
import p487o0o00O.o0O000o0;
import p487o0o00O.o0O00O;
import p487o0o00O.o0O00O0o;
import p487o0o00O.o0O00OO;
import p487o0o00O.o0OoO00O;
import p516o0o0O00o.o00000O0;
import p516o0o0O00o.o0O0oo0o;
import p562o0oOo000.o0Oo0oo;
import p577o0oOoOo.o0OO000;
import p650o0ooo.m3;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/yalla/yalla/ui/activity/main/WebActivity;", "Lcom/yalla/yalla/base/activity/BaseFragmentActivity;", "<init>", "()V", "OooO00o", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SuppressLint({"SetJavaScriptEnabled"})
@SourceDebugExtension({"SMAP\nWebActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebActivity.kt\ncom/yalla/yalla/ui/activity/main/WebActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 3 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 10 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 11 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,702:1\n75#2,13:703\n81#3,11:716\n81#3,11:769\n81#3,11:790\n36#4:727\n456#4,8:751\n464#4,3:765\n467#4,3:783\n1097#5,6:728\n66#6,6:734\n72#6:768\n76#6:787\n78#7,11:740\n91#7:786\n4144#8,6:759\n154#9:780\n154#9:781\n154#9:782\n154#9:789\n154#9:803\n76#10:788\n76#10:801\n1#11:802\n*S KotlinDebug\n*F\n+ 1 WebActivity.kt\ncom/yalla/yalla/ui/activity/main/WebActivity\n*L\n139#1:703,13\n131#1:716,11\n186#1:769,11\n267#1:790,11\n146#1:727\n180#1:751,8\n180#1:765,3\n180#1:783,3\n146#1:728,6\n180#1:734,6\n180#1:768\n180#1:787\n180#1:740,11\n180#1:786\n180#1:759,6\n207#1:780\n221#1:781\n222#1:782\n264#1:789\n270#1:803\n263#1:788\n270#1:801\n*E\n"})
public final class WebActivity extends BaseFragmentActivity {

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final /* synthetic */ int f25130OooOoO0 = 0;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @Nullable
    public ValueCallback<Uri[]> f25131OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public boolean f25132OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public boolean f25133OooOOoo;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public WebPageInfo f25137OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @Nullable
    public BaseWebView2 f25138OooOo0o;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public String f25136OooOo00 = "";

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public boolean f25135OooOo0 = true;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f25134OooOo = new ViewModelLazy(Reflection.getOrCreateKotlinClass(WebVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.main.WebActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.activity.main.WebActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.activity.main.WebActivity$special$$inlined$viewModels$default$3

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0 f25150OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f25150OooO0Oo;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    public static final class OooO extends Lambda implements Function3<RowScope, Composer, Integer, Unit> {
        public OooO() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            long j;
            RowScope Toolbar = rowScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(Toolbar, "$this$Toolbar");
            if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1394700094, iIntValue, -1, "com.yalla.yalla.ui.activity.main.WebActivity.WebToolbar.<anonymous> (WebActivity.kt:241)");
                }
                int i = WebActivity.f25130OooOoO0;
                WebActivity webActivity = WebActivity.this;
                if (webActivity.OooOoO0().getShowMenuRefresh() || webActivity.OooOoO0().getShowMenuShare() || webActivity.OooOoO0().getShowMenuOpenInBrowser()) {
                    Painter painterPainterResource = PainterResources_androidKt.painterResource(o0Oo0oo.icon_web_more, composer2, 0);
                    if (webActivity.OooOoO0().getToolbarGreenStyle()) {
                        composer2.startReplaceableGroup(-80032978);
                        j = o0000oo.OooO0OO(composer2).f38630OooOOOO;
                    } else {
                        composer2.startReplaceableGroup(-80032946);
                        j = o0000oo.OooO0OO(composer2).f38628OooOOO;
                    }
                    composer2.endReplaceableGroup();
                    o0O0oo0o.OooO0O0(painterPainterResource, j, false, new o00O0O(webActivity), composer2, 8, 4);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o {
        public static void OooO00o(@NotNull Context context, @Nullable WebPageInfo webPageInfo) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intent intent = new Intent(context, (Class<?>) WebActivity.class);
            intent.putExtra("pageinfo", webPageInfo);
            context.startActivity(intent);
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Unit> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            int i = WebActivity.f25130OooOoO0;
            WebActivity.this.OooOoO0().setShowDropdownMenu(false);
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nWebActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebActivity.kt\ncom/yalla/yalla/ui/activity/main/WebActivity$ToolbarMenuPopup$3\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,702:1\n154#2:703\n154#2:704\n154#2:705\n154#2:706\n72#3,6:707\n78#3:741\n82#3:746\n78#4,11:713\n91#4:745\n456#5,8:724\n464#5,3:738\n467#5,3:742\n4144#6,6:732\n*S KotlinDebug\n*F\n+ 1 WebActivity.kt\ncom/yalla/yalla/ui/activity/main/WebActivity$ToolbarMenuPopup$3\n*L\n276#1:703\n277#1:704\n278#1:705\n279#1:706\n274#1:707,6\n274#1:741\n274#1:746\n274#1:713,11\n274#1:745\n274#1:724,8\n274#1:738,3\n274#1:742,3\n274#1:732,6\n*E\n"})
    public static final class OooO0OO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o0OO000 f25142OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(o0OO000 o0oo000) {
            super(2);
            this.f25142OooO0o0 = o0oo000;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1795074764, iIntValue, -1, "com.yalla.yalla.ui.activity.main.WebActivity.ToolbarMenuPopup.<anonymous> (WebActivity.kt:273)");
                }
                float f = 8;
                Modifier modifierM171backgroundbw27NRU$default = BackgroundKt.m171backgroundbw27NRU$default(o00O0O0.OooO00o(f, SizeKt.m530width3ABfNKs(ShadowKt.m1359shadows4CzXII$default(PaddingKt.m478padding3ABfNKs(Modifier.INSTANCE, Dp.m3775constructorimpl(f)), Dp.m3775constructorimpl(f), RoundedCornerShapeKt.m729RoundedCornerShape0680j_4(Dp.m3775constructorimpl(f)), false, 0L, 0L, 28, null), Dp.m3775constructorimpl(200))), o0000oo.OooO0OO(composer2).f38618OooO0O0, null, 2, null);
                composer2.startReplaceableGroup(-483455358);
                MeasurePolicy measurePolicyOooO0O0 = o0O00oO0.OooO0O0(Alignment.INSTANCE, Arrangement.INSTANCE.getTop(), composer2, 0, -1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM171backgroundbw27NRU$default);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
                Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion, composerM1320constructorimpl, measurePolicyOooO0O0, composerM1320constructorimpl, currentCompositionLocalMap);
                if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                composer2.startReplaceableGroup(101643051);
                int i = WebActivity.f25130OooOoO0;
                WebActivity webActivity = WebActivity.this;
                if (webActivity.OooOoO0().getShowMenuRefresh()) {
                    AndroidMenu_androidKt.DropdownMenuItem(new Oooo0(webActivity), null, false, null, null, o0000O.f48755OooO00o, composer2, 196608, 30);
                }
                composer2.endReplaceableGroup();
                composer2.startReplaceableGroup(101643762);
                if (webActivity.OooOoO0().getShowMenuShare()) {
                    AndroidMenu_androidKt.DropdownMenuItem(new o000oOoO(webActivity, this.f25142OooO0o0), null, false, null, null, o0000O.f48756OooO0O0, composer2, 196608, 30);
                }
                composer2.endReplaceableGroup();
                composer2.startReplaceableGroup(573493018);
                if (webActivity.OooOoO0().getShowMenuOpenInBrowser()) {
                    AndroidMenu_androidKt.DropdownMenuItem(new o0OoOo0(webActivity), null, false, null, null, o0000O.f48757OooO0OO, composer2, 196608, 30);
                }
                if (androidx.compose.animation.OooOo.OooO00o(composer2)) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f25144OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(int i) {
            super(2);
            this.f25144OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f25144OooO0o0 | 1);
            int i = WebActivity.f25130OooOoO0;
            WebActivity.this.OooOo0(composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f25146OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(int i) {
            super(2);
            this.f25146OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f25146OooO0o0 | 1);
            int i = WebActivity.f25130OooOoO0;
            WebActivity.this.OooOo0O(composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function2<Composer, Integer, Unit> {
        public OooOO0O() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1016459477, iIntValue, -1, "com.yalla.yalla.ui.activity.main.WebActivity.onCreate.<anonymous> (WebActivity.kt:118)");
                }
                o0000oo.OooO00o(true, ComposableLambdaKt.composableLambda(composer2, 991379352, true, new o00Oo0(WebActivity.this)), composer2, 54);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final void OooOo(WebActivity webActivity, Composer composer, int i) {
        webActivity.getClass();
        Composer composerStartRestartGroup = composer.startRestartGroup(-682466839);
        if ((i & 1) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-682466839, i, -1, "com.yalla.yalla.ui.activity.main.WebActivity.WebDialog (WebActivity.kt:129)");
            }
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel = ViewModelKt.viewModel(o0OO000.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            m3.OooO00o((o0OO000) viewModel, null, composerStartRestartGroup, 8, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o0O00OO(webActivity, i));
    }

    public static final void OooOo0o(WebActivity webActivity, Composer composer, int i) {
        webActivity.getClass();
        Composer composerStartRestartGroup = composer.startRestartGroup(1074639780);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1074639780, i, -1, "com.yalla.yalla.ui.activity.main.WebActivity.WebContent (WebActivity.kt:142)");
        }
        Intent intent = webActivity.getIntent();
        composerStartRestartGroup.startReplaceableGroup(1157296644);
        boolean zChanged = composerStartRestartGroup.changed(intent);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            Serializable serializableExtra = webActivity.getIntent().getSerializableExtra("pageinfo");
            Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.yalla.yalla.util.WebPageInfo");
            objRememberedValue = (WebPageInfo) serializableExtra;
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        webActivity.f25137OooOo0O = (WebPageInfo) objRememberedValue;
        o00000OO.OooO0O0(!webActivity.OooOoO0().getStatusBarBlackIcon(), composerStartRestartGroup, 0, 0);
        WebPageInfo webPageInfo = webActivity.f25137OooOo0O;
        if (webPageInfo == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
            webPageInfo = null;
        }
        EffectsKt.LaunchedEffect(webPageInfo, new o0O000o0(webActivity, null), composerStartRestartGroup, 72);
        float bottom = WindowInsetsKt.asPaddingValues(WindowInsets_androidKt.getImeAnimationTarget(WindowInsets.INSTANCE, composerStartRestartGroup, 8), composerStartRestartGroup, 0).getBottom();
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
        WebPageInfo webPageInfo2 = webActivity.f25137OooOo0O;
        if (webPageInfo2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
            webPageInfo2 = null;
        }
        Modifier modifierM482paddingqDBjuR0$default = PaddingKt.m482paddingqDBjuR0$default(BackgroundKt.m171backgroundbw27NRU$default(modifierFillMaxSize$default, webPageInfo2.f32291OooOOOO, null, 2, null), 0.0f, 0.0f, 0.0f, bottom, 7, null);
        composerStartRestartGroup.startReplaceableGroup(733328855);
        Alignment.Companion companion2 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyOooO00o = androidx.compose.animation.Oooo000.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM482paddingqDBjuR0$default);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        composerStartRestartGroup.startReplaceableGroup(1729797275);
        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
        if (current == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        ViewModel viewModel = ViewModelKt.viewModel(o0OO000.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
        composerStartRestartGroup.endReplaceableGroup();
        o00000O0.OooO0O0(new o0O00(webActivity, (o0OO000) viewModel), companion.then(webActivity.OooOoO0().getShowToolbar() ? SizeKt.fillMaxSize$default(PaddingKt.m482paddingqDBjuR0$default(WindowInsetsPadding_androidKt.statusBarsPadding(companion), 0.0f, Dp.m3775constructorimpl(50), 0.0f, 0.0f, 13, null), 0.0f, 1, null) : SizeKt.fillMaxSize$default(companion, 0.0f, 1, null)), new o0OoO00O(webActivity), composerStartRestartGroup, 0, 0);
        webActivity.OooOo0O(composerStartRestartGroup, 8);
        composerStartRestartGroup.startReplaceableGroup(-1285672441);
        if (webActivity.OooOoO0().getShowCloseAdIcon()) {
            ImageKt.Image(PainterResources_androidKt.painterResource(o0Oo0oo.icon_ad_web_close, composerStartRestartGroup, 0), (String) null, o0O0O00.OooO0O0(SizeKt.m525size3ABfNKs(PaddingKt.m478padding3ABfNKs(WindowInsetsPadding_androidKt.statusBarsPadding(boxScopeInstance.align(companion, companion2.getTopEnd())), Dp.m3775constructorimpl(16)), Dp.m3775constructorimpl(17)), false, false, 0L, false, null, null, null, o0O00O0o.f48849OooO0Oo, 253), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
        }
        if (androidx.compose.animation.OooOo.OooO00o(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o0O00O(webActivity, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooOo0(Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(665114359);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(665114359, i, -1, "com.yalla.yalla.ui.activity.main.WebActivity.ToolbarMenuPopup (WebActivity.kt:261)");
        }
        composerStartRestartGroup.startReplaceableGroup(193852281);
        Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        int iOooO0Oo = o000000.OooO0Oo(Float.valueOf(density.mo326toPx0680j_4(Dp.m3775constructorimpl(50)))) + WindowInsets_androidKt.getStatusBars(WindowInsets.INSTANCE, composerStartRestartGroup, 8).getTop(density);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(1729797275);
        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
        if (current == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        ViewModel viewModel = ViewModelKt.viewModel(o0OO000.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
        composerStartRestartGroup.endReplaceableGroup();
        AndroidPopup_androidKt.m4014PopupK5zGePQ(Alignment.INSTANCE.getTopEnd(), IntOffsetKt.IntOffset(-o000000.OooO0Oo(Float.valueOf(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo326toPx0680j_4(Dp.m3775constructorimpl(8)))), iOooO0Oo), new OooO0O0(), new PopupProperties(true, false, false, null, false, false, 62, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1795074764, true, new OooO0OO((o0OO000) viewModel)), composerStartRestartGroup, 27654, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooOo0O(Composer composer, int i) {
        long j;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1750265630);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1750265630, i, -1, "com.yalla.yalla.ui.activity.main.WebActivity.WebToolbar (WebActivity.kt:231)");
        }
        if (OooOoO0().getShowToolbar() || OooOoO0().isLoadError()) {
            String toolbarTitle = OooOoO0().getToolbarTitle();
            int i2 = OooOoO0().getBackIconIsClose() ? o0Oo0oo.btn_header_close : o0Oo0oo.icv_arrow_back;
            if (!OooOoO0().getShowToolbar() || OooOoO0().getToolbarGreenStyle()) {
                composerStartRestartGroup.startReplaceableGroup(-1701527811);
                j = o0000oo.OooO0OO(composerStartRestartGroup).f38630OooOOOO;
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(-1701527756);
                j = o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO;
                composerStartRestartGroup.endReplaceableGroup();
            }
            long j2 = j;
            Modifier.Companion companion = Modifier.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(-1701527152);
            long j3 = OooOoO0().getToolbarGreenStyle() ? o0000oo.OooO0OO(composerStartRestartGroup).f38631OooOOOo : o0OOo000.f48134OooO00o;
            composerStartRestartGroup.endReplaceableGroup();
            composer2 = composerStartRestartGroup;
            o0O0oo0o.OooO00o(toolbarTitle, 0.0f, j2, Integer.valueOf(i2), null, null, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1394700094, true, new OooO()), WindowInsetsPadding_androidKt.statusBarsPadding(BackgroundKt.m171backgroundbw27NRU$default(companion, j3, null, 2, null)), composerStartRestartGroup, 12582912, 114);
            if (OooOoO0().getShowDropdownMenu()) {
                OooOo0(composer2, 8);
            }
        } else {
            composer2 = composerStartRestartGroup;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOO0(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final WebVM OooOoO0() {
        return (WebVM) this.f25134OooOo.getValue();
    }

    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity, android.app.Activity
    public final void finish() {
        if (this.f25133OooOOoo) {
            Intent intent = new Intent();
            intent.putExtra("INSTAGRAG_LOGIN_URI", this.f25136OooOo00);
            setResult(101, intent);
        }
        super.finish();
    }

    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, @Nullable Intent intent) {
        ValueCallback<Uri[]> valueCallback;
        Uri data;
        super.onActivityResult(i, i2, intent);
        if (i != 1 || (valueCallback = this.f25131OooOOo) == null) {
            return;
        }
        if (i2 != -1) {
            if (valueCallback != null) {
                valueCallback.onReceiveValue(null);
            }
            this.f25131OooOOo = null;
        } else {
            if (intent == null || (data = intent.getData()) == null) {
                return;
            }
            ValueCallback<Uri[]> valueCallback2 = this.f25131OooOOo;
            if (valueCallback2 != null) {
                valueCallback2.onReceiveValue(new Uri[]{data});
            }
            this.f25131OooOOo = null;
        }
    }

    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (this.f25135OooOo0) {
            BaseWebView2 baseWebView2 = this.f25138OooOo0o;
            boolean z = false;
            if (baseWebView2 != null && baseWebView2.canGoBack()) {
                z = true;
            }
            if (!z) {
                super.onBackPressed();
                return;
            }
            BaseWebView2 baseWebView3 = this.f25138OooOo0o;
            if (baseWebView3 != null) {
                baseWebView3.goBack();
            }
        }
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        int i = 0;
        if (window != null) {
            oOO00O.OooO0OO(window, 0);
        }
        p010OooOOoo.Oooo0.OooO00o(this, ComposableLambdaKt.composableLambdaInstance(1016459477, true, new OooOO0O()));
        LiveEventBus.get("refreshUniqueIDPage").observe(this, new o0O000Oo(this, i));
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        BaseWebView2 baseWebView2 = this.f25138OooOo0o;
        if (baseWebView2 != null) {
            baseWebView2.setWebChromeClient(null);
            baseWebView2.removeJavascriptInterface("Yalla");
            baseWebView2.loadDataWithBaseURL(null, "", "text/html", Constants.UTF_8, null);
            baseWebView2.clearHistory();
            baseWebView2.destroy();
        }
        super.onDestroy();
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
        WebPageInfo webPageInfo = this.f25137OooOo0O;
        if (webPageInfo == null) {
            return;
        }
        WebPageInfo webPageInfo2 = null;
        if (webPageInfo.f32281OooO0Oo == WebFrom.RoomMainBanner) {
            HashMap map = new HashMap();
            BaseWebView2 baseWebView2 = this.f25138OooOo0o;
            String title = baseWebView2 != null ? baseWebView2.getTitle() : null;
            if ((title == null || StringsKt.isBlank(title)) || StringsKt__StringsJVMKt.startsWith$default(title, "http", false, 2, null)) {
                WebPageInfo webPageInfo3 = this.f25137OooOo0O;
                if (webPageInfo3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
                    webPageInfo3 = null;
                }
                title = webPageInfo3.f32284OooO0oO;
            }
            map.put(ShareConstants.WEB_DIALOG_PARAM_TITLE, title);
            o0oo0000.OooO00o.OooO0OO("401005", MapsKt.mapOf(new Pair("staytime", Integer.valueOf((int) this.f22287OooOOOO))));
        }
        WebPageInfo webPageInfo4 = this.f25137OooOo0O;
        if (webPageInfo4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
        } else {
            webPageInfo2 = webPageInfo4;
        }
        if (webPageInfo2.f32281OooO0Oo == WebFrom.ActivityNotice) {
            o0oo0000.OooO00o.OooO0OO("402004", MapsKt.mapOf(new Pair("staytime", Integer.valueOf((int) this.f22287OooOOOO))));
        }
    }
}
