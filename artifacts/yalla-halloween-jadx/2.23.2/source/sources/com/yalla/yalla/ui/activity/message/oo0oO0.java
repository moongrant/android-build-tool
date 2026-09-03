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
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
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
import p476o0OooooO.o0OOo000;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nYallaTeamMessageBottomComp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 YallaTeamMessageBottomComp.kt\ncom/yalla/yalla/ui/activity/message/YallaTeamMessageBottomCompKt\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,105:1\n73#2,6:106\n79#2:140\n83#2:157\n78#3,11:112\n91#3:156\n456#4,8:123\n464#4,3:137\n36#4:146\n467#4,3:153\n25#4:161\n4144#5,6:131\n154#6:141\n154#6:142\n154#6:143\n154#6:144\n154#6:145\n154#6:158\n154#6:159\n154#6:160\n1097#7,6:147\n1097#7,6:162\n*S KotlinDebug\n*F\n+ 1 YallaTeamMessageBottomComp.kt\ncom/yalla/yalla/ui/activity/message/YallaTeamMessageBottomCompKt\n*L\n41#1:106,6\n41#1:140\n41#1:157\n41#1:112,11\n41#1:156\n41#1:123,8\n41#1:137,3\n44#1:146\n41#1:153,3\n103#1:161\n41#1:131,6\n54#1:141\n55#1:142\n56#1:143\n57#1:144\n59#1:145\n90#1:158\n91#1:159\n92#1:160\n44#1:147,6\n103#1:162,6\n*E\n"})
public final class oo0oO0 {

    public static final class OooO extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO f25551OooO0Oo = new OooO();

        public OooO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            SemanticsPropertyReceiver semantics = semanticsPropertyReceiver;
            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function1<String, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<String> f25552OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(MutableState<String> mutableState) {
            super(1);
            this.f25552OooO0Oo = mutableState;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            String it = str;
            Intrinsics.checkNotNullParameter(it, "it");
            boolean z = StringsKt.trim((CharSequence) it).toString().length() == 0;
            MutableState<String> mutableState = this.f25552OooO0Oo;
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
        public final /* synthetic */ MutableState<String> f25553OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(MutableState<String> mutableState) {
            super(3);
            this.f25553OooO0Oo = mutableState;
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
                    ComposerKt.traceEventStart(-250037476, i, -1, "com.yalla.yalla.ui.activity.message.YallaTeamMessageBottomComp.<anonymous>.<anonymous> (YallaTeamMessageBottomComp.kt:62)");
                }
                composer3.startReplaceableGroup(1105955514);
                if (this.f25553OooO0Oo.getValue().length() == 0) {
                    composer2 = composer3;
                    TextKt.m1261Text4IGK_g(StringResources_androidKt.stringResource(p562o0oOo000.o000000.message_yalla_team_hint, composer3, 0), (Modifier) null, p193o00o0O0O.o0000oo.OooO0OO(composer3).f38629OooOOO0, TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 131058);
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

    public static final class OooO0OO extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0OO f25554OooO0Oo = new OooO0OO();

        public OooO0OO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            SemanticsPropertyReceiver semantics = semanticsPropertyReceiver;
            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ YallaTeamMessageActivity f25555OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f25556OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<String> f25557OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(YallaTeamMessageActivity yallaTeamMessageActivity, MutableState<String> mutableState, int i) {
            super(3);
            this.f25555OooO0Oo = yallaTeamMessageActivity;
            this.f25557OooO0o0 = mutableState;
            this.f25556OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
            AnimatedVisibilityScope AnimatedVisibility = animatedVisibilityScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-359624178, iIntValue, -1, "com.yalla.yalla.ui.activity.message.YallaTeamMessageBottomComp.<anonymous>.<anonymous> (YallaTeamMessageBottomComp.kt:72)");
            }
            oo0oO0.OooO0O0(this.f25555OooO0Oo, this.f25557OooO0o0, composer2, (this.f25556OooO0o & 112) | 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ YallaTeamMessageActivity f25558OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f25559OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<String> f25560OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(YallaTeamMessageActivity yallaTeamMessageActivity, MutableState<String> mutableState, int i) {
            super(2);
            this.f25558OooO0Oo = yallaTeamMessageActivity;
            this.f25560OooO0o0 = mutableState;
            this.f25559OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f25559OooO0o | 1);
            oo0oO0.OooO00o(this.f25558OooO0Oo, this.f25560OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(@Nullable YallaTeamMessageActivity yallaTeamMessageActivity, @NotNull MutableState<String> textValue, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(textValue, "textValue");
        Composer composerStartRestartGroup = composer.startRestartGroup(1609691850);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1609691850, i, -1, "com.yalla.yalla.ui.activity.message.YallaTeamMessageBottomComp (YallaTeamMessageBottomComp.kt:39)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierM171backgroundbw27NRU$default = BackgroundKt.m171backgroundbw27NRU$default(companion, o0OOo000.f48135OooO0O0, null, 2, null);
        Alignment.Companion companion2 = Alignment.INSTANCE;
        Alignment.Vertical bottom = companion2.getBottom();
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyOooO0O0 = androidx.compose.material.OooO0OO.OooO0O0(Arrangement.INSTANCE, bottom, composerStartRestartGroup, 48, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM171backgroundbw27NRU$default);
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
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO0O0, composerM1320constructorimpl, currentCompositionLocalMap);
        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        String value = textValue.getValue();
        SolidColor solidColor = new SolidColor(o0OOo000.f48185Ooooo00, null);
        Modifier modifierM479paddingVpY3zN4 = PaddingKt.m479paddingVpY3zN4(BackgroundKt.m171backgroundbw27NRU$default(SizeKt.m512heightInVpY3zN4(androidx.media3.session.o00O0O0.OooO00o(21, PaddingKt.m480paddingVpY3zN4$default(PaddingKt.m482paddingqDBjuR0$default(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance, companion, 1.0f, false, 2, null), Dp.m3775constructorimpl(15), 0.0f, 0.0f, 0.0f, 14, null), 0.0f, Dp.m3775constructorimpl(8), 1, null)), Dp.m3775constructorimpl(38), Dp.m3775constructorimpl(95)), o0OOo000.f48272o000o0o0, null, 2, null), Dp.m3775constructorimpl(12), Dp.m3775constructorimpl(6));
        Intrinsics.checkNotNullParameter(modifierM479paddingVpY3zN4, "<this>");
        Modifier modifierWrapContentHeight$default = SizeKt.wrapContentHeight$default(modifierM479paddingVpY3zN4, companion2.getCenterVertically(), false, 2, null);
        TextStyle textStyle = new TextStyle(p193o00o0O0O.o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO, TextUnitKt.getSp(14), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16777212, (DefaultConstructorMarker) null);
        composerStartRestartGroup.startReplaceableGroup(1157296644);
        boolean zChanged = composerStartRestartGroup.changed(textValue);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new OooO00o(textValue);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        BasicTextFieldKt.BasicTextField(value, (Function1<? super String, Unit>) objRememberedValue, modifierWrapContentHeight$default, false, false, textStyle, (KeyboardOptions) null, (KeyboardActions) null, false, 0, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, (MutableInteractionSource) null, (Brush) solidColor, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(composerStartRestartGroup, -250037476, true, new OooO0O0(textValue)), composerStartRestartGroup, 0, 196608, 16344);
        AnimatedVisibilityKt.AnimatedVisibility(rowScopeInstance, textValue.getValue().length() > 0, SemanticsModifierKt.semantics$default(companion, false, OooO0OO.f25554OooO0Oo, 1, null), (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -359624178, true, new OooO0o(yallaTeamMessageActivity, textValue, i)), composerStartRestartGroup, 1572870, 28);
        AnimatedVisibilityKt.AnimatedVisibility(rowScopeInstance, textValue.getValue().length() == 0, SemanticsModifierKt.semantics$default(companion, false, OooO.f25551OooO0Oo, 1, null), (EnterTransition) null, (ExitTransition) null, (String) null, Oooo0.f25221OooO00o, composerStartRestartGroup, 1572870, 28);
        if (androidx.compose.material.OooO0o.OooO00o(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOO0(yallaTeamMessageActivity, textValue, i));
    }

    public static final void OooO0O0(YallaTeamMessageActivity yallaTeamMessageActivity, MutableState mutableState, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-385611946);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-385611946, i, -1, "com.yalla.yalla.ui.activity.message.SendImage (YallaTeamMessageBottomComp.kt:85)");
        }
        ImageKt.Image(PainterResources_androidKt.painterResource(p562o0oOo000.o0O0O00.ic_moment_chat_send, composerStartRestartGroup, 0), (String) null, com.code.android.util.o0O0O00.OooO0O0(SizeKt.m525size3ABfNKs(PaddingKt.m480paddingVpY3zN4$default(PaddingKt.m482paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, Dp.m3775constructorimpl(13), 7, null), Dp.m3775constructorimpl(12), 0.0f, 2, null), Dp.m3775constructorimpl(27)), false, false, 0L, false, null, null, null, new o0OO000(yallaTeamMessageActivity, mutableState), 253), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
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
