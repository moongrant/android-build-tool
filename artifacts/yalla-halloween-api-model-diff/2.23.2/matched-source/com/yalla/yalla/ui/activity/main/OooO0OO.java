package com.yalla.yalla.ui.activity.main;

import android.app.Activity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.code.android.util.o0O0O00;
import com.yalla.yalla.data.cache.SharedMainMessageManager;
import com.yalla.yalla.manager.AppUIThemeConfig;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import kotlin.Function;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p386o0OOooO.oo0o0Oo;
import p423o0OoO0OO.o000OO;
import p433o0OoOOO0.o0000Ooo;
import p433o0OoOOO0.o0000oo;
import p475o0Ooooo0.o0O00oO0;
import p487o0o00O.o000O0;
import p487o0o00O.o000O0O0;
import p516o0o0O00o.o0oOOo;
import p519o0o0O0OO.o0OO0O0;
import p590o0oOooo0.z0;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nMainActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainActivity.kt\ncom/yalla/yalla/ui/activity/main/MainActivityKt\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 8 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 10 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 11 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,691:1\n66#2,6:692\n72#2:726\n76#2:731\n66#2,6:736\n72#2:770\n76#2:775\n66#2,6:788\n72#2:822\n76#2:830\n78#3,11:698\n91#3:730\n78#3,11:742\n91#3:774\n78#3,11:794\n91#3:829\n456#4,8:709\n464#4,3:723\n467#4,3:727\n456#4,8:753\n464#4,3:767\n467#4,3:771\n36#4:779\n456#4,8:805\n464#4,3:819\n467#4,3:826\n4144#5,6:717\n4144#5,6:761\n4144#5,6:813\n154#6:732\n154#6:778\n154#6:786\n154#6:787\n154#6:823\n154#6:824\n154#6:825\n76#7:733\n76#7:776\n76#7:777\n1#8:734\n51#9:735\n1097#10,6:780\n81#11:831\n81#11:832\n*S KotlinDebug\n*F\n+ 1 MainActivity.kt\ncom/yalla/yalla/ui/activity/main/MainActivityKt\n*L\n575#1:692,6\n575#1:726\n575#1:731\n595#1:736,6\n595#1:770\n595#1:775\n638#1:788,6\n638#1:822\n638#1:830\n575#1:698,11\n575#1:730\n595#1:742,11\n595#1:774\n638#1:794,11\n638#1:829\n575#1:709,8\n575#1:723,3\n575#1:727,3\n595#1:753,8\n595#1:767,3\n595#1:771,3\n640#1:779\n638#1:805,8\n638#1:819,3\n638#1:826,3\n575#1:717,6\n595#1:761,6\n638#1:813,6\n593#1:732\n635#1:778\n645#1:786\n646#1:787\n655#1:823\n677#1:824\n679#1:825\n593#1:733\n632#1:776\n634#1:777\n593#1:735\n640#1:780,6\n649#1:831\n675#1:832\n*E\n"})
public final class OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final MutableState<Float> f24985OooO00o = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);

    public static final class OooO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f24986OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(int i) {
            super(2);
            this.f24986OooO0Oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            OooO0OO.OooO0O0(composer, RecomposeScopeImplKt.updateChangedFlags(this.f24986OooO0Oo | 1));
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f24987OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(int i) {
            super(2);
            this.f24987OooO0Oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            OooO0OO.OooO00o(composer, RecomposeScopeImplKt.updateChangedFlags(this.f24987OooO0Oo | 1));
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<LayoutCoordinates, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ float f24988OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(float f) {
            super(1);
            this.f24988OooO0Oo = f;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(LayoutCoordinates layoutCoordinates) {
            LayoutCoordinates it = layoutCoordinates;
            Intrinsics.checkNotNullParameter(it, "it");
            OooO0OO.f24985OooO00o.setValue(Float.valueOf(IntSize.m3934getHeightimpl(it.mo2811getSizeYbymL2g()) - this.f24988OooO0Oo));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.yalla.yalla.ui.activity.main.OooO0OO$OooO0OO, reason: collision with other inner class name */
    public static final class C0321OooO0OO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ AppCompatActivity f24989OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0321OooO0OO(AppCompatActivity appCompatActivity) {
            super(0);
            this.f24989OooO0Oo = appCompatActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            if (!oo0o0Oo.OooO0o0()) {
                int i = p420o0OoO0.OooO0OO.f46612OooO00o;
                AppCompatActivity context = this.f24989OooO0Oo;
                Intrinsics.checkNotNull(context);
                Intrinsics.checkNotNullParameter(context, "context");
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0o f24990OooO0Oo = new OooO0o();

        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o0oo0000.OooO00o.OooO0O0("101047");
            com.yalla.yalla.ui.activity.main.OooO0o onLogin = com.yalla.yalla.ui.activity.main.OooO0o.f24992OooO0Oo;
            Intrinsics.checkNotNullParameter(onLogin, "onLogin");
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            if (Intrinsics.areEqual(o0O00oO0.OooOo0O().getValue(), Boolean.TRUE)) {
                onLogin.invoke();
            } else {
                Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
                if (activityOooO0O0 != null) {
                    int i = LoginActivity.f24727OooOo0O;
                    LoginActivity.OooO00o.OooO00o(activityOooO0O0);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f24991OooO0Oo;

        public OooOO0(o000O0 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f24991OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f24991OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f24991OooO0Oo;
        }

        public final int hashCode() {
            return this.f24991OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f24991OooO0Oo.invoke(obj);
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(@Nullable Composer composer, int i) {
        boolean z;
        int i2;
        int i3;
        Integer numValueOf;
        Composer composerStartRestartGroup = composer.startRestartGroup(1930840217);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1930840217, i, -1, "com.yalla.yalla.ui.activity.main.TopBg (MainActivity.kt:591)");
            }
            float fM3775constructorimpl = Dp.m3775constructorimpl(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo322toDpu2uoSUM(f24985OooO00o.getValue().floatValue()) + Dp.m3775constructorimpl(48));
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM511height3ABfNKs = SizeKt.m511height3ABfNKs(companion, fM3775constructorimpl);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyOooO00o = androidx.compose.animation.Oooo000.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM511height3ABfNKs);
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
            composerStartRestartGroup.startReplaceableGroup(424863404);
            z0 z0Var = z0.f57313OooO00o;
            composerStartRestartGroup.startReplaceableGroup(2126512193);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2126512193, 8, -1, "com.yalla.yalla.util.UIThemeConfigDrawableIdUtils.mainHeadBgRotationByY (UIThemeConfigDrawableIdUtils.kt:72)");
            }
            MutableLiveData<Integer> mutableLiveData = p429o0OoOO.OooOo00.f46776OooO00o;
            AppUIThemeConfig appUIThemeConfigOooO00o = p429o0OoOO.OooOo00.OooO00o((Integer) LiveDataAdapterKt.observeAsState(mutableLiveData, composerStartRestartGroup, 8).getValue());
            int[] iArr = z0.OooO0O0.$EnumSwitchMapping$0;
            int i4 = iArr[appUIThemeConfigOooO00o.ordinal()];
            if (i4 == 1 || i4 == 2) {
                z = false;
            } else {
                if (i4 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                z = true;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierOooO0Oo = z ? o0O0O00.OooO0Oo(companion, composerStartRestartGroup, 6) : companion;
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(438288169);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(438288169, 8, -1, "com.yalla.yalla.util.UIThemeConfigDrawableIdUtils.mainHeadTopDrawableId (UIThemeConfigDrawableIdUtils.kt:39)");
            }
            int i5 = iArr[p429o0OoOO.OooOo00.OooO00o((Integer) LiveDataAdapterKt.observeAsState(mutableLiveData, composerStartRestartGroup, 8).getValue()).ordinal()];
            if (i5 == 1) {
                i2 = p562o0oOo000.o0O0O00.ic_main_header_bg_top;
            } else if (i5 == 2) {
                i2 = p562o0oOo000.o0O0O00.ic_main_header_bg_top_ramadan;
            } else {
                if (i5 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = p562o0oOo000.o0O0O00.ic_main_header_bg_top_seven_year;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceableGroup();
            Painter painterPainterResource = PainterResources_androidKt.painterResource(i2, composerStartRestartGroup, 0);
            ContentScale.Companion companion4 = ContentScale.INSTANCE;
            Modifier modifier = modifierOooO0Oo;
            ImageKt.Image(painterPainterResource, (String) null, SizeKt.m511height3ABfNKs(SizeKt.fillMaxWidth$default(companion.then(modifierOooO0Oo), 0.0f, 1, null), fM3775constructorimpl), (Alignment) null, companion4.getFillBounds(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24632, 104);
            composerStartRestartGroup.startReplaceableGroup(-967116378);
            if (ComposerKt.isTraceInProgress()) {
                i3 = 8;
                ComposerKt.traceEventStart(-967116378, 8, -1, "com.yalla.yalla.util.UIThemeConfigDrawableIdUtils.mainHeadTopContentDrawableId (UIThemeConfigDrawableIdUtils.kt:60)");
            } else {
                i3 = 8;
            }
            int i6 = iArr[p429o0OoOO.OooOo00.OooO00o((Integer) LiveDataAdapterKt.observeAsState(mutableLiveData, composerStartRestartGroup, i3).getValue()).ordinal()];
            if (i6 == 1) {
                numValueOf = null;
            } else if (i6 == 2) {
                numValueOf = Integer.valueOf(p562o0oOo000.o0O0O00.ic_main_header_bg_top_content_ramadan);
            } else {
                if (i6 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                numValueOf = Integer.valueOf(p562o0oOo000.o0O0O00.ic_main_header_bg_top_content_seven_year);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(1042521421);
            if (numValueOf != null) {
                ImageKt.Image(PainterResources_androidKt.painterResource(numValueOf.intValue(), composerStartRestartGroup, 0), (String) null, SizeKt.m511height3ABfNKs(companion, fM3775constructorimpl).then(modifier), companion2.getBottomCenter(), companion4.getFillWidth(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 27704, 96);
            }
            if (androidx.compose.animation.OooOo.OooO00o(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO00o(i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0O0(Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1788250765);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1788250765, i, -1, "com.yalla.yalla.ui.activity.main.UserHeader (MainActivity.kt:630)");
            }
            Object objConsume = composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            AppCompatActivity appCompatActivity = objConsume instanceof AppCompatActivity ? (AppCompatActivity) objConsume : null;
            float f = 48;
            float fMo326toPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo326toPx0680j_4(Dp.m3775constructorimpl(f));
            Modifier.Companion companion = Modifier.INSTANCE;
            Float fValueOf = Float.valueOf(fMo326toPx0680j_4);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(fValueOf);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new OooO0O0(fMo326toPx0680j_4);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            float f2 = 32;
            Modifier modifierM527sizeVpY3zN4 = SizeKt.m527sizeVpY3zN4(PaddingKt.m482paddingqDBjuR0$default(WindowInsetsPadding_androidKt.statusBarsPadding(OnGloballyPositionedModifierKt.onGloballyPositioned(companion, (Function1) objRememberedValue)), Dp.m3775constructorimpl(15), 0.0f, 0.0f, 0.0f, 14, null), Dp.m3775constructorimpl(f2), Dp.m3775constructorimpl(f));
            composerStartRestartGroup.startReplaceableGroup(733328855);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyOooO00o = androidx.compose.animation.Oooo000.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM527sizeVpY3zN4);
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
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            ImageKt.Image(o000OO.OooO0O0((String) LiveDataAdapterKt.observeAsState(o0O00oO0.OooO(), composerStartRestartGroup, 8).getValue(), null, composerStartRestartGroup, 0, 1), (String) null, o0O0O00.OooO0O0(boxScopeInstance.align(ClipKt.clip(SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(f2)), RoundedCornerShapeKt.getCircleShape()), companion2.getCenter()), false, false, 0L, false, null, null, new C0321OooO0OO(appCompatActivity), OooO0o.f24990OooO0Oo, 189), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24624, 104);
            MediatorLiveData<Boolean> userDot = SharedMainMessageManager.INSTANCE.getUserDot();
            Intrinsics.checkNotNull(userDot);
            State stateObserveAsState = LiveDataAdapterKt.observeAsState(userDot, Boolean.FALSE, composerStartRestartGroup, 56);
            o0oOOo o0oooo = o0oOOo.f51721OooO00o;
            Boolean bool = (Boolean) stateObserveAsState.getValue();
            Intrinsics.checkNotNullExpressionValue(bool, "UserHeader$lambda$8$lambda$7(...)");
            o0oooo.OooO00o(bool.booleanValue(), Dp.m3775constructorimpl(7), PaddingKt.m482paddingqDBjuR0$default(boxScopeInstance.align(companion, companion2.getTopEnd()), 0.0f, Dp.m3775constructorimpl(8), 0.0f, 0.0f, 13, null), composerStartRestartGroup, 3120, 0);
            if (androidx.compose.material.OooO0o.OooO00o(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO(i));
    }

    public static final void OooO0OO(o0000Ooo o0000ooo, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-399240462);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-399240462, i, -1, "com.yalla.yalla.ui.activity.main.MainPage (MainActivity.kt:573)");
        }
        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyOooO00o = androidx.compose.animation.Oooo000.OooO00o(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default);
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
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        OooO0O0(composerStartRestartGroup, 0);
        o0000oo.OooO00o(boxScopeInstance, o0000ooo != null ? o0000ooo.f46871OooO0o : null, composerStartRestartGroup, 70);
        o0OO0O0.OooO00o(boxScopeInstance, composerStartRestartGroup, 6);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o000O0O0(o0000ooo, i));
    }
}
