package com.yalla.yalla.ui.activity.message;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.TextKt;
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
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p584o0oOooO0.oO00OOO;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nYallaTeamMessageBottomComp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 YallaTeamMessageBottomComp.kt\ncom/yalla/yalla/ui/activity/message/YallaTeamMessageBottomCompKt\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,104:1\n73#2,6:105\n79#2:139\n83#2:156\n78#3,11:111\n91#3:155\n456#4,8:122\n464#4,3:136\n36#4:145\n467#4,3:152\n25#4:160\n4144#5,6:130\n154#6:140\n154#6:141\n154#6:142\n154#6:143\n154#6:144\n154#6:157\n154#6:158\n154#6:159\n1097#7,6:146\n1097#7,6:161\n*S KotlinDebug\n*F\n+ 1 YallaTeamMessageBottomComp.kt\ncom/yalla/yalla/ui/activity/message/YallaTeamMessageBottomCompKt\n*L\n40#1:105,6\n40#1:139\n40#1:156\n40#1:111,11\n40#1:155\n40#1:122,8\n40#1:136,3\n43#1:145\n40#1:152,3\n102#1:160\n40#1:130,6\n53#1:140\n54#1:141\n55#1:142\n56#1:143\n58#1:144\n89#1:157\n90#1:158\n91#1:159\n43#1:146,6\n102#1:161,6\n*E\n"})
public final class oo0oO0 {

    public static final class OooO00o extends Lambda implements Function1<String, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<String> f26000OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(MutableState<String> mutableState) {
            super(1);
            this.f26000OooO0Oo = mutableState;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            String it = str;
            Intrinsics.checkNotNullParameter(it, "it");
            boolean z = StringsKt.trim((CharSequence) it).toString().length() == 0;
            MutableState<String> mutableState = this.f26000OooO0Oo;
            if (z) {
                mutableState.setValue("");
            } else if (it.length() <= 300) {
                mutableState.setValue(it);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<String> f26001OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(MutableState<String> mutableState) {
            super(3);
            this.f26001OooO0Oo = mutableState;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function2, Composer composer, Integer num) {
            Composer composer2;
            Function2<? super Composer, ? super Integer, ? extends Unit> innerTextField = function2;
            Composer composer3 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
            if ((iIntValue & 14) == 0) {
                iIntValue |= composer3.changedInstance(innerTextField) ? 4 : 2;
            }
            int i = iIntValue;
            if ((i & 91) == 18 && composer3.getSkipping()) {
                composer3.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-250037476, i, -1, "com.yalla.yalla.ui.activity.message.YallaTeamMessageBottomComp.<anonymous>.<anonymous> (YallaTeamMessageBottomComp.kt:60)");
                }
                composer3.startReplaceableGroup(1105955467);
                if (this.f26001OooO0Oo.getValue().length() == 0) {
                    composer2 = composer3;
                    TextKt.m1251Text4IGK_g(StringResources_androidKt.stringResource(oO00OOo0.message_yalla_team_hint, composer3, 0), (Modifier) null, p147o00Oo0Oo.o000OOo.OooO0OO(composer3).f37714OooOOO0, TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 131058);
                } else {
                    composer2 = composer3;
                }
                composer2.endReplaceableGroup();
                if (androidx.compose.animation.OooOO0O.OooO00o(i & 14, innerTextField, composer2)) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ YallaTeamMessageActivity f26002OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f26003OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<String> f26004OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(YallaTeamMessageActivity yallaTeamMessageActivity, MutableState<String> mutableState, int i) {
            super(3);
            this.f26002OooO0Oo = yallaTeamMessageActivity;
            this.f26004OooO0o0 = mutableState;
            this.f26003OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
            AnimatedVisibilityScope AnimatedVisibility = animatedVisibilityScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-359624178, iIntValue, -1, "com.yalla.yalla.ui.activity.message.YallaTeamMessageBottomComp.<anonymous>.<anonymous> (YallaTeamMessageBottomComp.kt:70)");
            }
            oo0oO0.OooO0O0(this.f26002OooO0Oo, this.f26004OooO0o0, composer2, (this.f26003OooO0o & 112) | 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ YallaTeamMessageActivity f26005OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f26006OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<String> f26007OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(YallaTeamMessageActivity yallaTeamMessageActivity, MutableState<String> mutableState, int i) {
            super(2);
            this.f26005OooO0Oo = yallaTeamMessageActivity;
            this.f26007OooO0o0 = mutableState;
            this.f26006OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f26006OooO0o | 1);
            oo0oO0.OooO00o(this.f26005OooO0Oo, this.f26007OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(@Nullable YallaTeamMessageActivity yallaTeamMessageActivity, @NotNull MutableState<String> textValue, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(textValue, "textValue");
        Composer composerStartRestartGroup = composer.startRestartGroup(1609691850);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1609691850, i, -1, "com.yalla.yalla.ui.activity.message.YallaTeamMessageBottomComp (YallaTeamMessageBottomComp.kt:38)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierM169backgroundbw27NRU$default = BackgroundKt.m169backgroundbw27NRU$default(companion, p469o0OoooOO.o0oO0O0o.f46946OooO0O0, null, 2, null);
        Alignment.Companion companion2 = Alignment.INSTANCE;
        Alignment.Vertical bottom = companion2.getBottom();
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyOooO00o = androidx.compose.material.OooO.OooO00o(Arrangement.INSTANCE, bottom, composerStartRestartGroup, 48, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM169backgroundbw27NRU$default);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
        if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        String value = textValue.getValue();
        SolidColor solidColor = new SolidColor(p469o0OoooOO.o0oO0O0o.f46993OoooOo0, null);
        Modifier modifierM477paddingVpY3zN4 = PaddingKt.m477paddingVpY3zN4(BackgroundKt.m169backgroundbw27NRU$default(SizeKt.m510heightInVpY3zN4(com.facebook.OooOo.OooO0O0(21, PaddingKt.m478paddingVpY3zN4$default(PaddingKt.m480paddingqDBjuR0$default(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance, companion, 1.0f, false, 2, null), Dp.m3765constructorimpl(15), 0.0f, 0.0f, 0.0f, 14, null), 0.0f, Dp.m3765constructorimpl(8), 1, null)), Dp.m3765constructorimpl(38), Dp.m3765constructorimpl(95)), p469o0OoooOO.o0oO0O0o.f47078o000o0O, null, 2, null), Dp.m3765constructorimpl(12), Dp.m3765constructorimpl(6));
        Intrinsics.checkNotNullParameter(modifierM477paddingVpY3zN4, "<this>");
        Modifier modifierWrapContentHeight$default = SizeKt.wrapContentHeight$default(modifierM477paddingVpY3zN4, companion2.getCenterVertically(), false, 2, null);
        TextStyle textStyle = new TextStyle(p147o00Oo0Oo.o000OOo.OooO0OO(composerStartRestartGroup).f37701OooO, TextUnitKt.getSp(14), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16777212, (DefaultConstructorMarker) null);
        composerStartRestartGroup.startReplaceableGroup(1157296644);
        boolean zChanged = composerStartRestartGroup.changed(textValue);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new OooO00o(textValue);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        BasicTextFieldKt.BasicTextField(value, (Function1<? super String, Unit>) objRememberedValue, modifierWrapContentHeight$default, false, false, textStyle, (KeyboardOptions) null, (KeyboardActions) null, false, 0, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, (MutableInteractionSource) null, (Brush) solidColor, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(composerStartRestartGroup, -250037476, true, new OooO0O0(textValue)), composerStartRestartGroup, 0, 196608, 16344);
        AnimatedVisibilityKt.AnimatedVisibility(rowScopeInstance, textValue.getValue().length() > 0, (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -359624178, true, new OooO0OO(yallaTeamMessageActivity, textValue, i)), composerStartRestartGroup, 1572870, 30);
        AnimatedVisibilityKt.AnimatedVisibility(rowScopeInstance, textValue.getValue().length() == 0, (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, Oooo0.f25676OooO00o, composerStartRestartGroup, 1572870, 30);
        if (androidx.compose.material.OooOO0.OooO0O0(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(yallaTeamMessageActivity, textValue, i));
    }

    public static final void OooO0O0(YallaTeamMessageActivity yallaTeamMessageActivity, MutableState mutableState, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-385611946);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-385611946, i, -1, "com.yalla.yalla.ui.activity.message.SendImage (YallaTeamMessageBottomComp.kt:84)");
        }
        ImageKt.Image(PainterResources_androidKt.painterResource(oO00OOO.ic_moment_chat_send, composerStartRestartGroup, 0), (String) null, com.code.android.util.o0O0O00.OooO0O0(SizeKt.m523size3ABfNKs(PaddingKt.m478paddingVpY3zN4$default(PaddingKt.m480paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, Dp.m3765constructorimpl(13), 7, null), Dp.m3765constructorimpl(12), 0.0f, 2, null), Dp.m3765constructorimpl(27)), false, false, 0L, false, null, null, null, new o0OO000(yallaTeamMessageActivity, mutableState), 253), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o0OO000o(yallaTeamMessageActivity, mutableState, i));
    }
}
