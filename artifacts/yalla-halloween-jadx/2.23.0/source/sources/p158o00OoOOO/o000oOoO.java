package p158o00OoOOO;

import OooOo.OooO0o;
import androidx.compose.animation.OooO;
import androidx.compose.animation.OooO0O0;
import androidx.compose.animation.OooOO0;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.Indication;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.OooO00o;
import androidx.compose.material.DividerKt;
import androidx.compose.material.TextKt;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import com.code.android.util.o0000O0;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p018OooOoo0.OooOOO;
import p147o00Oo0Oo.o000OOo;
import p158o00OoOOO.OooOo;
import p158o00OoOOO.OooOo00;
import p158o00OoOOO.Oooo0;
import p158o00OoOOO.Oooo000;
import p642o0ooOOo.o0OO;
import p642o0ooOOo.o0OO0O0;
import p642o0ooOOo.oO00000;
import p642o0ooOOo.oO0000Oo;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nBottomListDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomListDialog.kt\ncom/code/android/yldialog/compose/BottomListDialogKt$BaseDialogContent$2$2\n+ 2 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt\n*L\n1#1,302:1\n171#2,12:303\n*S KotlinDebug\n*F\n+ 1 BottomListDialog.kt\ncom/code/android/yldialog/compose/BottomListDialogKt$BaseDialogContent$2$2\n*L\n159#1:303,12\n*E\n"})
public final class o000oOoO extends Lambda implements Function1<LazyListScope, Unit> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ long f38283OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ List<String> f38284OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f38285OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ boolean f38286OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Function1<Integer, Unit> f38287OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ Function1<Integer, Boolean> f38288OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ Function4<RowScope, Integer, Composer, Integer, Unit> f38289OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final /* synthetic */ Function4<RowScope, Integer, Composer, Integer, Unit> f38290OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final /* synthetic */ int f38291OooOO0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o000oOoO(List<String> list, boolean z, MutableState<Boolean> mutableState, Function1<? super Integer, Unit> function1, Function1<? super Integer, Boolean> function2, long j, Function4<? super RowScope, ? super Integer, ? super Composer, ? super Integer, Unit> function4, Function4<? super RowScope, ? super Integer, ? super Composer, ? super Integer, Unit> function5, int i) {
        super(1);
        this.f38284OooO0Oo = list;
        this.f38286OooO0o0 = z;
        this.f38285OooO0o = mutableState;
        this.f38287OooO0oO = function1;
        this.f38288OooO0oo = function2;
        this.f38283OooO = j;
        this.f38289OooOO0 = function4;
        this.f38290OooOO0O = function5;
        this.f38291OooOO0o = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LazyListScope lazyListScope) {
        LazyListScope LazyColumn = lazyListScope;
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        final boolean z = this.f38286OooO0o0;
        final MutableState<Boolean> mutableState = this.f38285OooO0o;
        final Function1<Integer, Unit> function1 = this.f38287OooO0oO;
        final Function1<Integer, Boolean> function2 = this.f38288OooO0oo;
        final long j = this.f38283OooO;
        final Function4<RowScope, Integer, Composer, Integer, Unit> function4 = this.f38289OooOO0;
        final Function4<RowScope, Integer, Composer, Integer, Unit> function5 = this.f38290OooOO0O;
        final int i = this.f38291OooOO0o;
        final List<String> list = this.f38284OooO0Oo;
        LazyColumn.items(list.size(), null, new Function1<Integer, Object>() { // from class: com.code.android.yldialog.compose.BottomListDialogKt$BaseDialogContent$2$2$invoke$$inlined$itemsIndexed$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Integer num) {
                list.get(num.intValue());
                return null;
            }
        }, ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.code.android.yldialog.compose.BottomListDialogKt$BaseDialogContent$2$2$invoke$$inlined$itemsIndexed$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public final Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                final LazyItemScope items = lazyItemScope;
                final int iIntValue = num.intValue();
                Composer composer2 = composer;
                int iIntValue2 = num2.intValue();
                Intrinsics.checkNotNullParameter(items, "$this$items");
                int i2 = (iIntValue2 & 14) == 0 ? (composer2.changed(items) ? 4 : 2) | iIntValue2 : iIntValue2;
                if ((iIntValue2 & 112) == 0) {
                    i2 |= composer2.changed(iIntValue) ? 32 : 16;
                }
                if ((i2 & 731) == 146 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1091073711, i2, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:179)");
                    }
                    final int i3 = (i2 & 14) | (i2 & 112);
                    final String str = (String) list.get(iIntValue);
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                    composer2.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyOooO00o = OooOOO.OooO00o(Alignment.INSTANCE, false, composer2, 0, -1323940314);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
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
                    Function2 function2OooO00o = OooO.OooO00o(companion2, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
                    if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer2)), composer2, 2058660585);
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    Modifier modifierM511heightInVpY3zN4$default = SizeKt.m511heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3765constructorimpl(50), 0.0f, 2, null);
                    composer2.startReplaceableGroup(-492369756);
                    Object objRememberedValue = composer2.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    composer2.endReplaceableGroup();
                    MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
                    Indication indicationM1277rememberRipple9IZ8Weo = RippleKt.m1277rememberRipple9IZ8Weo(false, 0.0f, 0L, composer2, 0, 7);
                    boolean z2 = z;
                    MutableState mutableState2 = mutableState;
                    Function1 function3 = function1;
                    Object[] objArr = {Boolean.valueOf(z2), mutableState2, function3, Integer.valueOf(iIntValue)};
                    composer2.startReplaceableGroup(-568225417);
                    boolean zChanged = false;
                    for (int i4 = 0; i4 < 4; i4++) {
                        zChanged |= composer2.changed(objArr[i4]);
                    }
                    Object objRememberedValue2 = composer2.rememberedValue();
                    if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new OooOo00(z2, mutableState2, function3, iIntValue);
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    composer2.endReplaceableGroup();
                    Modifier modifierM478paddingVpY3zN4$default = PaddingKt.m478paddingVpY3zN4$default(ClickableKt.m200clickableO2vRcR0$default(modifierM511heightInVpY3zN4$default, mutableInteractionSource, indicationM1277rememberRipple9IZ8Weo, false, null, null, (Function0) objRememberedValue2, 28, null), 0.0f, Dp.m3765constructorimpl(15), 1, null);
                    composer2.startReplaceableGroup(-270267587);
                    composer2.startReplaceableGroup(-3687241);
                    Object objRememberedValue3 = composer2.rememberedValue();
                    Composer.Companion companion3 = Composer.INSTANCE;
                    if (objRememberedValue3 == companion3.getEmpty()) {
                        objRememberedValue3 = new oO00000();
                        composer2.updateRememberedValue(objRememberedValue3);
                    }
                    composer2.endReplaceableGroup();
                    final oO00000 oo00000 = (oO00000) objRememberedValue3;
                    composer2.startReplaceableGroup(-3687241);
                    Object objRememberedValue4 = composer2.rememberedValue();
                    if (objRememberedValue4 == companion3.getEmpty()) {
                        objRememberedValue4 = new ConstraintLayoutScope();
                        composer2.updateRememberedValue(objRememberedValue4);
                    }
                    composer2.endReplaceableGroup();
                    final ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) objRememberedValue4;
                    composer2.startReplaceableGroup(-3687241);
                    Object objRememberedValue5 = composer2.rememberedValue();
                    if (objRememberedValue5 == companion3.getEmpty()) {
                        objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composer2.updateRememberedValue(objRememberedValue5);
                    }
                    composer2.endReplaceableGroup();
                    Pair pairOooO0O0 = o0OO.OooO0O0(constraintLayoutScope, (MutableState) objRememberedValue5, oo00000, composer2);
                    MeasurePolicy measurePolicy = (MeasurePolicy) pairOooO0O0.component1();
                    final Function0 function0 = (Function0) pairOooO0O0.component2();
                    Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(modifierM478paddingVpY3zN4$default, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.code.android.yldialog.compose.BottomListDialogKt$BaseDialogContent$2$2$invoke$lambda$8$lambda$7$$inlined$ConstraintLayout$1
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            SemanticsPropertyReceiver semantics = semanticsPropertyReceiver;
                            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                            oO0000Oo.OooO00o(semantics, oo00000);
                            return Unit.INSTANCE;
                        }
                    }, 1, null);
                    final Function1 function6 = function2;
                    final long j2 = j;
                    final Function4 function7 = function4;
                    final Function4 function8 = function5;
                    final int i5 = i;
                    LayoutKt.MultiMeasureLayout(modifierSemantics$default, ComposableLambdaKt.composableLambda(composer2, -819894182, true, new Function2<Composer, Integer, Unit>() { // from class: com.code.android.yldialog.compose.BottomListDialogKt$BaseDialogContent$2$2$invoke$lambda$8$lambda$7$$inlined$ConstraintLayout$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Unit invoke(Composer composer3, Integer num3) {
                            Modifier.Companion companion4;
                            o0OO0O0 o0oo0o1;
                            Composer composer4 = composer3;
                            if (((num3.intValue() & 11) ^ 2) == 0 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                            } else {
                                ConstraintLayoutScope constraintLayoutScope2 = constraintLayoutScope;
                                constraintLayoutScope2.getClass();
                                constraintLayoutScope2.OooO0Oo();
                                ConstraintLayoutScope.OooO00o oooO00oOooO0OO = constraintLayoutScope2.OooO0OO();
                                o0OO0O0 o0oo0o0OooO00o = oooO00oOooO0OO.OooO00o();
                                o0OO0O0 o0oo0o0OooO0O0 = oooO00oOooO0OO.OooO0O0();
                                o0OO0O0 o0oo0o0OooO0OO = oooO00oOooO0OO.OooO0OO();
                                long jOooO0OO = o0000O0.OooO0OO(16, composer4, 6);
                                int iM3671getCentere0LSkKk = TextAlign.INSTANCE.m3671getCentere0LSkKk();
                                composer4.startReplaceableGroup(614611037);
                                int i6 = iIntValue;
                                long j3 = ((Boolean) function6.invoke(Integer.valueOf(i6))).booleanValue() ? j2 : o000OOo.OooO0OO(composer4).f37701OooO;
                                composer4.endReplaceableGroup();
                                Modifier.Companion companion5 = Modifier.INSTANCE;
                                Modifier modifierOooO00o = ConstraintLayoutScope.OooO00o(companion5, o0oo0o0OooO00o, OooOo.f38276OooO0Oo);
                                String str2 = str;
                                TextAlign textAlignM3664boximpl = TextAlign.m3664boximpl(iM3671getCentere0LSkKk);
                                int i7 = i3;
                                TextKt.m1251Text4IGK_g(str2, modifierOooO00o, j3, jOooO0OO, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, textAlignM3664boximpl, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer4, (i7 >> 6) & 14, 0, 130544);
                                composer4.startReplaceableGroup(614611646);
                                int i8 = i5;
                                Function4 function9 = function7;
                                if (function9 != null) {
                                    composer4.startReplaceableGroup(1157296644);
                                    o0oo0o1 = o0oo0o0OooO00o;
                                    boolean zChanged2 = composer4.changed(o0oo0o1);
                                    Object objRememberedValue6 = composer4.rememberedValue();
                                    if (zChanged2 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue6 = new Oooo000(o0oo0o1);
                                        composer4.updateRememberedValue(objRememberedValue6);
                                    }
                                    composer4.endReplaceableGroup();
                                    companion4 = companion5;
                                    Modifier modifierOooO00o2 = ConstraintLayoutScope.OooO00o(companion4, o0oo0o0OooO0O0, (Function1) objRememberedValue6);
                                    composer4.startReplaceableGroup(693286680);
                                    MeasurePolicy measurePolicyOooO00o2 = androidx.compose.material.OooOOO.OooO00o(Alignment.INSTANCE, Arrangement.INSTANCE.getStart(), composer4, 0, -1323940314);
                                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                    CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                                    ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor2 = companion6.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierOooO00o2);
                                    if (!(composer4.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer4.startReusableNode();
                                    if (composer4.getInserting()) {
                                        composer4.createNode(constructor2);
                                    } else {
                                        composer4.useNode();
                                    }
                                    Composer composerM1309constructorimpl2 = Updater.m1309constructorimpl(composer4);
                                    Function2 function2OooO00o2 = OooO.OooO00o(companion6, composerM1309constructorimpl2, measurePolicyOooO00o2, composerM1309constructorimpl2, currentCompositionLocalMap2);
                                    if (composerM1309constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                        OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                                    }
                                    OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer4)), composer4, 2058660585);
                                    function9.invoke(RowScopeInstance.INSTANCE, Integer.valueOf(i6), composer4, Integer.valueOf(6 | (i7 & 112) | ((i8 >> 12) & 896)));
                                    composer4.endReplaceableGroup();
                                    composer4.endNode();
                                    composer4.endReplaceableGroup();
                                    composer4.endReplaceableGroup();
                                } else {
                                    companion4 = companion5;
                                    o0oo0o1 = o0oo0o0OooO00o;
                                }
                                composer4.endReplaceableGroup();
                                composer4.startReplaceableGroup(-1545577851);
                                Function4 function10 = function8;
                                if (function10 != null) {
                                    Modifier modifierOooO0O0 = OooO00o.OooO0O0(items, companion4, 0.0f, 1, null);
                                    composer4.startReplaceableGroup(1157296644);
                                    boolean zChanged3 = composer4.changed(o0oo0o1);
                                    Object objRememberedValue7 = composer4.rememberedValue();
                                    if (zChanged3 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue7 = new Oooo0(o0oo0o1);
                                        composer4.updateRememberedValue(objRememberedValue7);
                                    }
                                    composer4.endReplaceableGroup();
                                    Modifier modifierOooO00o3 = ConstraintLayoutScope.OooO00o(modifierOooO0O0, o0oo0o0OooO0OO, (Function1) objRememberedValue7);
                                    composer4.startReplaceableGroup(693286680);
                                    MeasurePolicy measurePolicyOooO00o3 = androidx.compose.material.OooOOO.OooO00o(Alignment.INSTANCE, Arrangement.INSTANCE.getStart(), composer4, 0, -1323940314);
                                    int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                    CompositionLocalMap currentCompositionLocalMap3 = composer4.getCurrentCompositionLocalMap();
                                    ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor3 = companion7.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierOooO00o3);
                                    if (!(composer4.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer4.startReusableNode();
                                    if (composer4.getInserting()) {
                                        composer4.createNode(constructor3);
                                    } else {
                                        composer4.useNode();
                                    }
                                    Composer composerM1309constructorimpl3 = Updater.m1309constructorimpl(composer4);
                                    Function2 function2OooO00o3 = OooO.OooO00o(companion7, composerM1309constructorimpl3, measurePolicyOooO00o3, composerM1309constructorimpl3, currentCompositionLocalMap3);
                                    if (composerM1309constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                        OooO0O0.OooO00o(currentCompositeKeyHash3, composerM1309constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
                                    }
                                    OooOO0.OooO00o(0, function3ModifierMaterializerOf3, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer4)), composer4, 2058660585);
                                    function10.invoke(RowScopeInstance.INSTANCE, Integer.valueOf(i6), composer4, Integer.valueOf(((i8 >> 15) & 896) | 6 | (i7 & 112)));
                                    composer4.endReplaceableGroup();
                                    composer4.endNode();
                                    composer4.endReplaceableGroup();
                                    composer4.endReplaceableGroup();
                                }
                                composer4.endReplaceableGroup();
                            }
                            return Unit.INSTANCE;
                        }
                    }), measurePolicy, composer2, 48, 0);
                    composer2.endReplaceableGroup();
                    composer2.startReplaceableGroup(837619983);
                    if (iIntValue != list.size() - 1) {
                        DividerKt.m1058DivideroMI9zvI(boxScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getBottomStart()), o000OOo.OooO0OO(composer2).f37706OooO0o, Dp.m3765constructorimpl((float) 0.5d), 0.0f, composer2, 384, 8);
                    }
                    if (OooO0o.OooO0O0(composer2)) {
                        ComposerKt.traceEventEnd();
                    }
                }
                return Unit.INSTANCE;
            }
        }));
        return Unit.INSTANCE;
    }
}
