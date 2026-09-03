package p578o0oOoOoo;

import androidx.compose.animation.OooO0O0;
import androidx.compose.animation.OooOO0;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.OooO;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;
import p141o00Oo.o0O0O00;
import p141o00Oo.o0OO00O;
import p141o00Oo.o0OoOo0;
import p426o0OoOO.o000oOoO;
import p469o0OoooOO.o0oO0O0o;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nMusicEditDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MusicEditDialog.kt\ncom/yalla/yalla/module/media/dialog/MusicEditDialogKt$CompressCommonSlider$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 8 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,330:1\n154#2:331\n154#2:413\n73#3,6:332\n79#3:366\n83#3:418\n78#4,11:338\n91#4:417\n456#5,8:349\n464#5,3:363\n25#5:367\n25#5:374\n25#5:381\n25#5:388\n67#5,3:395\n66#5:398\n50#5:405\n49#5:406\n467#5,3:414\n50#5:419\n49#5:420\n4144#6,6:357\n1097#7,6:368\n1097#7,6:375\n1097#7,6:382\n1097#7,6:389\n1097#7,6:399\n1097#7,6:407\n1097#7,6:421\n75#8:427\n108#8,2:428\n81#9:430\n107#9,2:431\n*S KotlinDebug\n*F\n+ 1 MusicEditDialog.kt\ncom/yalla/yalla/module/media/dialog/MusicEditDialogKt$CompressCommonSlider$1\n*L\n200#1:331\n233#1:413\n197#1:332,6\n197#1:366\n197#1:418\n197#1:338,11\n197#1:417\n197#1:349,8\n197#1:363,3\n204#1:367\n206#1:374\n209#1:381\n212#1:388\n217#1:395,3\n217#1:398\n225#1:405\n225#1:406\n197#1:414,3\n303#1:419\n303#1:420\n197#1:357,6\n204#1:368,6\n206#1:375,6\n209#1:382,6\n212#1:389,6\n217#1:399,6\n225#1:407,6\n303#1:421,6\n206#1:427\n206#1:428,2\n209#1:430\n209#1:431,2\n*E\n"})
public final class a extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ Function1<Float, Unit> f56409OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Modifier f56410OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MutableState<Float> f56411OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Function1<Long, Unit> f56412OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ int f56413OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ float f56414OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ Function1<Long, Unit> f56415OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final /* synthetic */ Function1<Integer, Unit> f56416OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final /* synthetic */ MutableState<Integer> f56417OooOO0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a(Modifier modifier, Function1<? super Long, Unit> function1, MutableState<Float> mutableState, int i, float f, Function1<? super Float, Unit> function2, Function1<? super Long, Unit> function3, Function1<? super Integer, Unit> function4, MutableState<Integer> mutableState2) {
        super(2);
        this.f56410OooO0Oo = modifier;
        this.f56412OooO0o0 = function1;
        this.f56411OooO0o = mutableState;
        this.f56413OooO0oO = i;
        this.f56414OooO0oo = f;
        this.f56409OooO = function2;
        this.f56415OooOO0 = function3;
        this.f56416OooOO0O = function4;
        this.f56417OooOO0o = mutableState2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1191576403, iIntValue, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider.<anonymous> (MusicEditDialog.kt:195)");
            }
            Modifier modifierThen = PaddingKt.m478paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m3765constructorimpl(15), 0.0f, 2, null).then(this.f56410OooO0Oo);
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            float f = this.f56414OooO0oo;
            MutableState<Integer> mutableState = this.f56417OooOO0o;
            composer2.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyOooO00o = OooO.OooO00o(Arrangement.INSTANCE, centerVertically, composer2, 48, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierThen);
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
            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
            if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer2)), composer2, 2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            composer2.startReplaceableGroup(-492369756);
            Object objRememberedValue = composer2.rememberedValue();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objRememberedValue == companion2.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composer2.updateRememberedValue(objRememberedValue);
            }
            composer2.endReplaceableGroup();
            MutableState mutableState2 = (MutableState) objRememberedValue;
            composer2.startReplaceableGroup(-492369756);
            Object objRememberedValue2 = composer2.rememberedValue();
            if (objRememberedValue2 == companion2.getEmpty()) {
                objRememberedValue2 = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                composer2.updateRememberedValue(objRememberedValue2);
            }
            composer2.endReplaceableGroup();
            MutableFloatState mutableFloatState = (MutableFloatState) objRememberedValue2;
            composer2.startReplaceableGroup(-492369756);
            Object objRememberedValue3 = composer2.rememberedValue();
            if (objRememberedValue3 == companion2.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composer2.updateRememberedValue(objRememberedValue3);
            }
            composer2.endReplaceableGroup();
            MutableState mutableState3 = (MutableState) objRememberedValue3;
            composer2.startReplaceableGroup(-492369756);
            Object objRememberedValue4 = composer2.rememberedValue();
            if (objRememberedValue4 == companion2.getEmpty()) {
                objRememberedValue4 = new Animatable(Float.valueOf(0.0f), VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE), null, null, 12, null);
                composer2.updateRememberedValue(objRememberedValue4);
            }
            composer2.endReplaceableGroup();
            Animatable animatable = (Animatable) objRememberedValue4;
            MutableState<Float> mutableState4 = this.f56411OooO0o;
            float fFloatValue = mutableState4.getValue().floatValue();
            Float fValueOf = Float.valueOf(f);
            composer2.startReplaceableGroup(1618982084);
            boolean zChanged = composer2.changed(fValueOf) | composer2.changed(mutableState4);
            Function1<Float, Unit> function1 = this.f56409OooO;
            boolean zChanged2 = zChanged | composer2.changed(function1);
            Object objRememberedValue5 = composer2.rememberedValue();
            if (zChanged2 || objRememberedValue5 == companion2.getEmpty()) {
                objRememberedValue5 = new oOOo0O00(f, mutableState4, function1);
                composer2.updateRememberedValue(objRememberedValue5);
            }
            composer2.endReplaceableGroup();
            Function1 function2 = (Function1) objRememberedValue5;
            ClosedFloatingPointRange<Float> closedFloatingPointRangeRangeTo = RangesKt.rangeTo(0.0f, f);
            composer2.startReplaceableGroup(511388516);
            Function1<Long, Unit> function3 = this.f56415OooOO0;
            boolean zChanged3 = composer2.changed(function3) | composer2.changed(mutableState4);
            Object objRememberedValue6 = composer2.rememberedValue();
            if (zChanged3 || objRememberedValue6 == companion2.getEmpty()) {
                objRememberedValue6 = new oOo0o00(function3, mutableState4);
                composer2.updateRememberedValue(objRememberedValue6);
            }
            composer2.endReplaceableGroup();
            o0OoOo0.OooO00o(fFloatValue, function2, null, false, closedFloatingPointRangeRangeTo, 0, (Function0) objRememberedValue6, null, o0O0O00.OooO00o(0L, o0oO0O0o.f47174oOooo0o, o0oO0O0o.f46953OooOO0, composer2, 0, 1011), new o0OO00O(Dp.m3765constructorimpl(((Boolean) mutableState2.getValue()).booleanValue() ? 6 : 4), ComposableLambdaKt.composableLambda(composer2, 687028663, true, new oo000000(this.f56413OooO0oO, mutableState2, this.f56416OooOO0O)), ComposableLambdaKt.composableLambda(composer2, -566386901, true, new O0OO00(f, mutableState, mutableState2, animatable, mutableState3, mutableState4, mutableFloatState)), 59), composer2, 0, 172);
            o000oOoO.OooO00o(composer2);
            Unit unit = Unit.INSTANCE;
            composer2.startReplaceableGroup(511388516);
            Function1<Long, Unit> function4 = this.f56412OooO0o0;
            boolean zChanged4 = composer2.changed(function4) | composer2.changed(mutableState4);
            Object objRememberedValue7 = composer2.rememberedValue();
            if (zChanged4 || objRememberedValue7 == companion2.getEmpty()) {
                objRememberedValue7 = new Oo0000(mutableState4, function4, null);
                composer2.updateRememberedValue(objRememberedValue7);
            }
            composer2.endReplaceableGroup();
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue7, composer2, 70);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
