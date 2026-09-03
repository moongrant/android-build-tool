package p507o0o00ooo;

import OooOo.OooO0o;
import android.text.TextUtils;
import androidx.compose.animation.OooOO0;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OooOO0O;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.OooO;
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
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
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
import com.code.android.util.o0O0O00;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p469o0OoooOO.o0oO0O0o;
import p579o0oOoo.oO0Ooooo;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class a0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final a0 f49745OooO00o = new a0();

    @SourceDebugExtension({"SMAP\nEditComposable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditComposable.kt\ncom/yalla/yalla/ui/composable/common/EditComposable$TextFieldWithClear$1\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,82:1\n72#2,7:83\n79#2:118\n83#2:174\n78#3,11:90\n78#3,11:125\n91#3:157\n91#3:173\n456#4,8:101\n464#4,3:115\n456#4,8:136\n464#4,3:150\n467#4,3:154\n50#4:161\n49#4:162\n467#4,3:170\n4144#5,6:109\n4144#5,6:144\n154#6:119\n154#6:159\n154#6:160\n154#6:169\n67#7,5:120\n72#7:153\n76#7:158\n1097#8,6:163\n*S KotlinDebug\n*F\n+ 1 EditComposable.kt\ncom/yalla/yalla/ui/composable/common/EditComposable$TextFieldWithClear$1\n*L\n44#1:83,7\n44#1:118\n44#1:174\n44#1:90,11\n47#1:125,11\n47#1:157\n44#1:173\n44#1:101,8\n44#1:115,3\n47#1:136,8\n47#1:150,3\n47#1:154,3\n61#1:161\n61#1:162\n44#1:170,3\n44#1:109,6\n47#1:144,6\n50#1:119\n59#1:159\n60#1:160\n65#1:169\n47#1:120,5\n47#1:153\n47#1:158\n61#1:163,6\n*E\n"})
    public static final class OooO00o extends Lambda implements Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<String> f49746OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Function1<String, Unit> f49747OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(int i, MutableState mutableState, Function1 function1) {
            super(3);
            this.f49746OooO0Oo = mutableState;
            this.f49747OooO0o0 = function1;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function2, Composer composer, Integer num) {
            Function2<? super Composer, ? super Integer, ? extends Unit> innerTextField = function2;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
            if ((iIntValue & 14) == 0) {
                iIntValue |= composer2.changedInstance(innerTextField) ? 4 : 2;
            }
            if ((iIntValue & 91) == 18 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1892444319, iIntValue, -1, "com.yalla.yalla.ui.composable.common.EditComposable.TextFieldWithClear.<anonymous> (EditComposable.kt:42)");
                }
                Alignment.Companion companion = Alignment.INSTANCE;
                Alignment.Vertical centerVertically = companion.getCenterVertically();
                composer2.startReplaceableGroup(693286680);
                Modifier.Companion companion2 = Modifier.INSTANCE;
                MeasurePolicy measurePolicyOooO00o = OooO.OooO00o(Arrangement.INSTANCE, centerVertically, composer2, 48, -1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion2);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composer2);
                Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
                if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer2)), composer2, 2058660585);
                float f = 10;
                Modifier modifierM479paddingqDBjuR0 = PaddingKt.m479paddingqDBjuR0(OooOO0O.OooO00o(RowScopeInstance.INSTANCE, companion2, 1.0f, false, 2, null), Dp.m3765constructorimpl(f), Dp.m3765constructorimpl(f), Dp.m3765constructorimpl(0), Dp.m3765constructorimpl(f));
                Alignment centerStart = companion.getCenterStart();
                composer2.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(centerStart, false, composer2, 6);
                composer2.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM479paddingqDBjuR0);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor2);
                } else {
                    composer2.useNode();
                }
                Composer composerM1309constructorimpl2 = Updater.m1309constructorimpl(composer2);
                Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl2, measurePolicyRememberBoxMeasurePolicy, composerM1309constructorimpl2, currentCompositionLocalMap2);
                if (composerM1309constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                }
                OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer2)), composer2, 2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                innerTextField.invoke(composer2, Integer.valueOf(iIntValue & 14));
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                composer2.startReplaceableGroup(1574970847);
                MutableState<String> mutableState = this.f49746OooO0Oo;
                if (!TextUtils.isEmpty(mutableState.getValue())) {
                    Painter painterPainterResource = PainterResources_androidKt.painterResource(oOo00OO0.icon_delete_gray, composer2, 0);
                    Modifier modifierM523size3ABfNKs = SizeKt.m523size3ABfNKs(PaddingKt.m480paddingqDBjuR0$default(companion2, 0.0f, 0.0f, Dp.m3765constructorimpl(4), 0.0f, 11, null), Dp.m3765constructorimpl(25));
                    composer2.startReplaceableGroup(511388516);
                    boolean zChanged = composer2.changed(mutableState);
                    Function1<String, Unit> function1 = this.f49747OooO0o0;
                    boolean zChanged2 = zChanged | composer2.changed(function1);
                    Object objRememberedValue = composer2.rememberedValue();
                    if (zChanged2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new z(mutableState, function1);
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    composer2.endReplaceableGroup();
                    ImageKt.Image(painterPainterResource, (String) null, PaddingKt.m476padding3ABfNKs(o0O0O00.OooO0O0(modifierM523size3ABfNKs, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), Dp.m3765constructorimpl(6)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 56, 120);
                }
                if (OooO0o.OooO0O0(composer2)) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ int f49748OooO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MutableState<String> f49750OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Modifier f49751OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ KeyboardOptions f49752OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ Function1<String, Unit> f49753OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ int f49754OooOO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0O0(Modifier modifier, MutableState<String> mutableState, KeyboardOptions keyboardOptions, Function1<? super String, Unit> function1, int i, int i2) {
            super(2);
            this.f49751OooO0o0 = modifier;
            this.f49750OooO0o = mutableState;
            this.f49752OooO0oO = keyboardOptions;
            this.f49753OooO0oo = function1;
            this.f49748OooO = i;
            this.f49754OooOO0 = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            a0.this.OooO00o(this.f49751OooO0o0, this.f49750OooO0o, this.f49752OooO0oO, this.f49753OooO0oo, composer, RecomposeScopeImplKt.updateChangedFlags(this.f49748OooO | 1), this.f49754OooOO0);
            return Unit.INSTANCE;
        }
    }

    @Stable
    @Composable
    @NotNull
    public static Modifier OooO0O0(int i, int i2, long j, @Nullable Composer composer, @NotNull Modifier customTextFieldOutline) {
        Intrinsics.checkNotNullParameter(customTextFieldOutline, "$this$customTextFieldOutline");
        composer.startReplaceableGroup(171639178);
        if ((i2 & 1) != 0) {
            j = o0oO0O0o.f46984Oooo0oO;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(171639178, i, -1, "com.yalla.yalla.ui.composable.common.EditComposable.customTextFieldOutline (EditComposable.kt:74)");
        }
        Modifier modifierComposed$default = ComposedModifierKt.composed$default(customTextFieldOutline, null, new b0(j), 1, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return modifierComposed$default;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x006f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0072  */
    /* JADX WARN: Code duplicated, block: B:39:0x0076  */
    /* JADX WARN: Code duplicated, block: B:41:0x007c  */
    /* JADX WARN: Code duplicated, block: B:42:0x007f  */
    /* JADX WARN: Code duplicated, block: B:46:0x0086  */
    /* JADX WARN: Code duplicated, block: B:47:0x008b  */
    /* JADX WARN: Code duplicated, block: B:49:0x0093  */
    /* JADX WARN: Code duplicated, block: B:51:0x0099  */
    /* JADX WARN: Code duplicated, block: B:52:0x009c  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:62:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:65:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:71:0x0170  */
    /* JADX WARN: Code duplicated, block: B:76:0x017c  */
    /* JADX WARN: Code duplicated, block: B:78:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO00o(@Nullable Modifier modifier, @NotNull MutableState<String> valueState, @Nullable KeyboardOptions keyboardOptions, @NotNull Function1<? super String, Unit> onValueChange, @Nullable Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        KeyboardOptions keyboardOptions2;
        int i4;
        int i5;
        int i6;
        Modifier modifier3;
        KeyboardOptions keyboardOptions3;
        Modifier modifier4;
        Composer composer2;
        KeyboardOptions keyboardOptions4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(valueState, "valueState");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Composer composerStartRestartGroup = composer.startRestartGroup(1478396587);
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= composerStartRestartGroup.changed(valueState) ? 32 : 16;
        }
        int i8 = i2 & 4;
        if (i8 == 0) {
            if ((i & 896) == 0) {
                keyboardOptions2 = keyboardOptions;
                i3 |= composerStartRestartGroup.changed(keyboardOptions2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
            }
            if ((i2 & 8) != 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                if (composerStartRestartGroup.changedInstance(onValueChange)) {
                    i4 = 2048;
                } else {
                    i4 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                }
                i3 |= i4;
            }
            if ((i2 & 16) != 0) {
                i3 |= 24576;
            } else if ((57344 & i) == 0) {
                if (composerStartRestartGroup.changed(this)) {
                    i5 = 16384;
                } else {
                    i5 = 8192;
                }
                i3 |= i5;
            }
            i6 = i3;
            if ((46811 & i6) == 9362 || !composerStartRestartGroup.getSkipping()) {
                if (i7 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i8 != 0) {
                    keyboardOptions3 = KeyboardOptions.INSTANCE.getDefault();
                } else {
                    keyboardOptions3 = keyboardOptions2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1478396587, i6, -1, "com.yalla.yalla.ui.composable.common.EditComposable.TextFieldWithClear (EditComposable.kt:29)");
                }
                int i9 = i6 >> 6;
                modifier4 = modifier3;
                composer2 = composerStartRestartGroup;
                BasicTextFieldKt.BasicTextField(valueState.getValue(), onValueChange, OooO0O0(i9 & 896, 1, 0L, composerStartRestartGroup, Modifier.INSTANCE.then(modifier3)), false, false, new TextStyle(o0oO0O0o.f46977Oooo000, oO0Ooooo.OooO0O0(13, composerStartRestartGroup), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16777212, (DefaultConstructorMarker) null), keyboardOptions3, (KeyboardActions) null, false, 0, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, (MutableInteractionSource) null, (Brush) null, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1892444319, true, new OooO00o(i6, valueState, onValueChange)), composer2, (i9 & 112) | ((i6 << 12) & 3670016), 196608, 32664);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                keyboardOptions4 = keyboardOptions3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                keyboardOptions4 = keyboardOptions2;
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(modifier4, valueState, keyboardOptions4, onValueChange, i, i2));
        }
        i3 |= 384;
        keyboardOptions2 = keyboardOptions;
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            if (composerStartRestartGroup.changedInstance(onValueChange)) {
                i4 = 2048;
            } else {
                i4 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            }
            i3 |= i4;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((57344 & i) == 0) {
            if (composerStartRestartGroup.changed(this)) {
                i5 = 16384;
            } else {
                i5 = 8192;
            }
            i3 |= i5;
        }
        i6 = i3;
        if ((46811 & i6) == 9362) {
            if (i7 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i8 != 0) {
                keyboardOptions3 = KeyboardOptions.INSTANCE.getDefault();
            } else {
                keyboardOptions3 = keyboardOptions2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1478396587, i6, -1, "com.yalla.yalla.ui.composable.common.EditComposable.TextFieldWithClear (EditComposable.kt:29)");
            }
            int i10 = i6 >> 6;
            modifier4 = modifier3;
            composer2 = composerStartRestartGroup;
            BasicTextFieldKt.BasicTextField(valueState.getValue(), onValueChange, OooO0O0(i10 & 896, 1, 0L, composerStartRestartGroup, Modifier.INSTANCE.then(modifier3)), false, false, new TextStyle(o0oO0O0o.f46977Oooo000, oO0Ooooo.OooO0O0(13, composerStartRestartGroup), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16777212, (DefaultConstructorMarker) null), keyboardOptions3, (KeyboardActions) null, false, 0, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, (MutableInteractionSource) null, (Brush) null, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1892444319, true, new OooO00o(i6, valueState, onValueChange)), composer2, (i10 & 112) | ((i6 << 12) & 3670016), 196608, 32664);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            keyboardOptions4 = keyboardOptions3;
        } else {
            if (i7 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i8 != 0) {
                keyboardOptions3 = KeyboardOptions.INSTANCE.getDefault();
            } else {
                keyboardOptions3 = keyboardOptions2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1478396587, i6, -1, "com.yalla.yalla.ui.composable.common.EditComposable.TextFieldWithClear (EditComposable.kt:29)");
            }
            int i11 = i6 >> 6;
            modifier4 = modifier3;
            composer2 = composerStartRestartGroup;
            BasicTextFieldKt.BasicTextField(valueState.getValue(), onValueChange, OooO0O0(i11 & 896, 1, 0L, composerStartRestartGroup, Modifier.INSTANCE.then(modifier3)), false, false, new TextStyle(o0oO0O0o.f46977Oooo000, oO0Ooooo.OooO0O0(13, composerStartRestartGroup), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16777212, (DefaultConstructorMarker) null), keyboardOptions3, (KeyboardActions) null, false, 0, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, (MutableInteractionSource) null, (Brush) null, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1892444319, true, new OooO00o(i6, valueState, onValueChange)), composer2, (i11 & 112) | ((i6 << 12) & 3670016), 196608, 32664);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            keyboardOptions4 = keyboardOptions3;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(modifier4, valueState, keyboardOptions4, onValueChange, i, i2));
    }
}
