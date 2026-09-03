package p528o0o0OOOo;

import androidx.compose.animation.OooO;
import androidx.compose.animation.OooOO0;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
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
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p018OooOoo0.OooOOO;
import p154o00OoO00.OooOo00;
import p579o0oOoo.oOOOOo0O;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nMomentPraise.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentPraise.kt\ncom/yalla/yalla/ui/screen/moment/media/MomentPraise\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,168:1\n154#2:169\n154#2:170\n66#3,6:171\n72#3:205\n76#3:217\n78#4,11:177\n91#4:216\n456#5,8:188\n464#5,3:202\n36#5:206\n467#5,3:213\n4144#6,6:196\n1097#7,6:207\n*S KotlinDebug\n*F\n+ 1 MomentPraise.kt\ncom/yalla/yalla/ui/screen/moment/media/MomentPraise\n*L\n41#1:169\n42#1:170\n45#1:171,6\n45#1:205\n45#1:217\n45#1:177,11\n45#1:216\n45#1:188,8\n45#1:202,3\n52#1:206\n45#1:213,3\n45#1:196,6\n52#1:207,6\n*E\n"})
public final class oO00o00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final oO00o00O f53897OooO00o = new oO00o00O();

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f53898OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(MutableState<Boolean> mutableState) {
            super(0);
            this.f53898OooO0Oo = mutableState;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f53898OooO0Oo.setValue(Boolean.FALSE);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ int f53899OooO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f53901OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ boolean f53902OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ float f53903OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ float f53904OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ int f53905OooOO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(boolean z, MutableState<Boolean> mutableState, float f, float f2, int i, int i2) {
            super(2);
            this.f53902OooO0o0 = z;
            this.f53901OooO0o = mutableState;
            this.f53903OooO0oO = f;
            this.f53904OooO0oo = f2;
            this.f53899OooO = i;
            this.f53905OooOO0 = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            oO00o00O.this.OooO00o(this.f53902OooO0o0, this.f53901OooO0o, this.f53903OooO0oO, this.f53904OooO0oo, composer, RecomposeScopeImplKt.updateChangedFlags(this.f53899OooO | 1), this.f53905OooOO0);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:39:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x0071  */
    /* JADX WARN: Code duplicated, block: B:42:0x0074  */
    /* JADX WARN: Code duplicated, block: B:47:0x0080  */
    /* JADX WARN: Code duplicated, block: B:51:0x008e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x0090  */
    /* JADX WARN: Code duplicated, block: B:53:0x0098  */
    /* JADX WARN: Code duplicated, block: B:55:0x009b  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:66:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:69:0x0102  */
    /* JADX WARN: Code duplicated, block: B:71:0x0110  */
    /* JADX WARN: Code duplicated, block: B:74:0x0125  */
    /* JADX WARN: Code duplicated, block: B:82:0x0178  */
    /* JADX WARN: Code duplicated, block: B:84:0x0187  */
    /* JADX WARN: Code duplicated, block: B:85:0x018e  */
    /* JADX WARN: Code duplicated, block: B:89:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:94:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:96:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO00o(boolean z, @NotNull MutableState<Boolean> showPraiseAnim, float f, float f2, @Nullable Composer composer, int i, int i2) {
        int i3;
        float f3;
        int i4;
        float f4;
        int i5;
        float fM3765constructorimpl;
        float fM3765constructorimpl2;
        Modifier.Companion companion;
        int currentCompositeKeyHash;
        Function0<ComposeUiNode> constructor;
        Composer composerM1309constructorimpl;
        Function2 function2OooO00o;
        int iOooO0o0;
        float f5;
        float f6;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(showPraiseAnim, "showPraiseAnim");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1768777235);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= composerStartRestartGroup.changed(showPraiseAnim) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 == 0) {
            if ((i & 896) == 0) {
                f3 = f;
                i3 |= composerStartRestartGroup.changed(f3) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 7168) == 0) {
                    f4 = f2;
                    if (composerStartRestartGroup.changed(f4)) {
                        i5 = 2048;
                    } else {
                        i5 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                    }
                    i3 |= i5;
                }
                if ((i3 & 5851) == 1170 || !composerStartRestartGroup.getSkipping()) {
                    if (i6 != 0) {
                        fM3765constructorimpl = Dp.m3765constructorimpl(21);
                    } else {
                        fM3765constructorimpl = f3;
                    }
                    if (i4 != 0) {
                        fM3765constructorimpl2 = Dp.m3765constructorimpl(48);
                    } else {
                        fM3765constructorimpl2 = f4;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1768777235, i3, -1, "com.yalla.yalla.ui.screen.moment.media.MomentPraise.PraiseImage (MomentPraise.kt:37)");
                    }
                    companion = Modifier.INSTANCE;
                    Modifier modifierM523size3ABfNKs = SizeKt.m523size3ABfNKs(companion, fM3765constructorimpl);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyOooO00o = OooOOO.OooO00o(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    constructor = companion2.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM523size3ABfNKs);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                    function2OooO00o = OooO.OooO00o(companion2, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
                    if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    if (z || !showPraiseAnim.getValue().booleanValue()) {
                        composerStartRestartGroup.startReplaceableGroup(-471037530);
                        composerStartRestartGroup.startReplaceableGroup(-471037429);
                        if (z) {
                            oOOOOo0O oooooo0o = oOOOOo0O.f56683OooO00o;
                            iOooO0o0 = oOOOOo0O.OooO0o0(composerStartRestartGroup);
                        } else {
                            iOooO0o0 = oOo00OO0.ic_moment_comment_praise_gray;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        ImageKt.Image(PainterResources_androidKt.painterResource(iOooO0o0, composerStartRestartGroup, 0), (String) null, SizeKt.m523size3ABfNKs(companion, fM3765constructorimpl), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 2097208, 56);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-471037898);
                        oOOOOo0O oooooo0o2 = oOOOOo0O.f56683OooO00o;
                        String strOooO0o = oOOOOo0O.OooO0o();
                        Modifier modifierM515requiredSize3ABfNKs = SizeKt.m515requiredSize3ABfNKs(companion, fM3765constructorimpl2);
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        boolean zChanged = composerStartRestartGroup.changed(showPraiseAnim);
                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new OooO00o(showPraiseAnim);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        OooOo00.OooO00o(strOooO0o, true, 1, null, (Function0) objRememberedValue, modifierM515requiredSize3ABfNKs, composerStartRestartGroup, 432, 8);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    if (androidx.compose.material.OooOO0.OooO0O0(composerStartRestartGroup)) {
                        ComposerKt.traceEventEnd();
                    }
                    float f7 = fM3765constructorimpl;
                    f5 = fM3765constructorimpl2;
                    f6 = f7;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    f6 = f3;
                    f5 = f4;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(z, showPraiseAnim, f6, f5, i, i2));
            }
            i3 |= 3072;
            f4 = f2;
            if ((i3 & 5851) == 1170) {
                if (i6 != 0) {
                    fM3765constructorimpl = Dp.m3765constructorimpl(21);
                } else {
                    fM3765constructorimpl = f3;
                }
                if (i4 != 0) {
                    fM3765constructorimpl2 = Dp.m3765constructorimpl(48);
                } else {
                    fM3765constructorimpl2 = f4;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1768777235, i3, -1, "com.yalla.yalla.ui.screen.moment.media.MomentPraise.PraiseImage (MomentPraise.kt:37)");
                }
                companion = Modifier.INSTANCE;
                Modifier modifierM523size3ABfNKs2 = SizeKt.m523size3ABfNKs(companion, fM3765constructorimpl);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyOooO00o2 = OooOOO.OooO00o(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                constructor = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM523size3ABfNKs2);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                function2OooO00o = OooO.OooO00o(companion3, composerM1309constructorimpl, measurePolicyOooO00o2, composerM1309constructorimpl, currentCompositionLocalMap2);
                if (composerM1309constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                if (z) {
                    composerStartRestartGroup.startReplaceableGroup(-471037530);
                    composerStartRestartGroup.startReplaceableGroup(-471037429);
                    if (z) {
                        oOOOOo0O oooooo0o3 = oOOOOo0O.f56683OooO00o;
                        iOooO0o0 = oOOOOo0O.OooO0o0(composerStartRestartGroup);
                    } else {
                        iOooO0o0 = oOo00OO0.ic_moment_comment_praise_gray;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    ImageKt.Image(PainterResources_androidKt.painterResource(iOooO0o0, composerStartRestartGroup, 0), (String) null, SizeKt.m523size3ABfNKs(companion, fM3765constructorimpl), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 2097208, 56);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-471037530);
                    composerStartRestartGroup.startReplaceableGroup(-471037429);
                    if (z) {
                        oOOOOo0O oooooo0o4 = oOOOOo0O.f56683OooO00o;
                        iOooO0o0 = oOOOOo0O.OooO0o0(composerStartRestartGroup);
                    } else {
                        iOooO0o0 = oOo00OO0.ic_moment_comment_praise_gray;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    ImageKt.Image(PainterResources_androidKt.painterResource(iOooO0o0, composerStartRestartGroup, 0), (String) null, SizeKt.m523size3ABfNKs(companion, fM3765constructorimpl), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 2097208, 56);
                    composerStartRestartGroup.endReplaceableGroup();
                }
                if (androidx.compose.material.OooOO0.OooO0O0(composerStartRestartGroup)) {
                    ComposerKt.traceEventEnd();
                }
                float f8 = fM3765constructorimpl;
                f5 = fM3765constructorimpl2;
                f6 = f8;
            } else {
                if (i6 != 0) {
                    fM3765constructorimpl = Dp.m3765constructorimpl(21);
                } else {
                    fM3765constructorimpl = f3;
                }
                if (i4 != 0) {
                    fM3765constructorimpl2 = Dp.m3765constructorimpl(48);
                } else {
                    fM3765constructorimpl2 = f4;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1768777235, i3, -1, "com.yalla.yalla.ui.screen.moment.media.MomentPraise.PraiseImage (MomentPraise.kt:37)");
                }
                companion = Modifier.INSTANCE;
                Modifier modifierM523size3ABfNKs3 = SizeKt.m523size3ABfNKs(companion, fM3765constructorimpl);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyOooO00o3 = OooOOO.OooO00o(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                constructor = companion4.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierM523size3ABfNKs3);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                function2OooO00o = OooO.OooO00o(companion4, composerM1309constructorimpl, measurePolicyOooO00o3, composerM1309constructorimpl, currentCompositionLocalMap3);
                if (composerM1309constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                OooOO0.OooO00o(0, function3ModifierMaterializerOf3, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                if (z) {
                    composerStartRestartGroup.startReplaceableGroup(-471037530);
                    composerStartRestartGroup.startReplaceableGroup(-471037429);
                    if (z) {
                        oOOOOo0O oooooo0o5 = oOOOOo0O.f56683OooO00o;
                        iOooO0o0 = oOOOOo0O.OooO0o0(composerStartRestartGroup);
                    } else {
                        iOooO0o0 = oOo00OO0.ic_moment_comment_praise_gray;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    ImageKt.Image(PainterResources_androidKt.painterResource(iOooO0o0, composerStartRestartGroup, 0), (String) null, SizeKt.m523size3ABfNKs(companion, fM3765constructorimpl), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 2097208, 56);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-471037530);
                    composerStartRestartGroup.startReplaceableGroup(-471037429);
                    if (z) {
                        oOOOOo0O oooooo0o6 = oOOOOo0O.f56683OooO00o;
                        iOooO0o0 = oOOOOo0O.OooO0o0(composerStartRestartGroup);
                    } else {
                        iOooO0o0 = oOo00OO0.ic_moment_comment_praise_gray;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    ImageKt.Image(PainterResources_androidKt.painterResource(iOooO0o0, composerStartRestartGroup, 0), (String) null, SizeKt.m523size3ABfNKs(companion, fM3765constructorimpl), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 2097208, 56);
                    composerStartRestartGroup.endReplaceableGroup();
                }
                if (androidx.compose.material.OooOO0.OooO0O0(composerStartRestartGroup)) {
                    ComposerKt.traceEventEnd();
                }
                float f9 = fM3765constructorimpl;
                f5 = fM3765constructorimpl2;
                f6 = f9;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(z, showPraiseAnim, f6, f5, i, i2));
        }
        i3 |= 384;
        f3 = f;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 7168) == 0) {
                f4 = f2;
                if (composerStartRestartGroup.changed(f4)) {
                    i5 = 2048;
                } else {
                    i5 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                }
                i3 |= i5;
            }
            if ((i3 & 5851) == 1170) {
                if (i6 != 0) {
                    fM3765constructorimpl = Dp.m3765constructorimpl(21);
                } else {
                    fM3765constructorimpl = f3;
                }
                if (i4 != 0) {
                    fM3765constructorimpl2 = Dp.m3765constructorimpl(48);
                } else {
                    fM3765constructorimpl2 = f4;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1768777235, i3, -1, "com.yalla.yalla.ui.screen.moment.media.MomentPraise.PraiseImage (MomentPraise.kt:37)");
                }
                companion = Modifier.INSTANCE;
                Modifier modifierM523size3ABfNKs4 = SizeKt.m523size3ABfNKs(companion, fM3765constructorimpl);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyOooO00o4 = OooOOO.OooO00o(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                constructor = companion5.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierM523size3ABfNKs4);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                function2OooO00o = OooO.OooO00o(companion5, composerM1309constructorimpl, measurePolicyOooO00o4, composerM1309constructorimpl, currentCompositionLocalMap4);
                if (composerM1309constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                OooOO0.OooO00o(0, function3ModifierMaterializerOf4, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                if (z) {
                    composerStartRestartGroup.startReplaceableGroup(-471037530);
                    composerStartRestartGroup.startReplaceableGroup(-471037429);
                    if (z) {
                        oOOOOo0O oooooo0o7 = oOOOOo0O.f56683OooO00o;
                        iOooO0o0 = oOOOOo0O.OooO0o0(composerStartRestartGroup);
                    } else {
                        iOooO0o0 = oOo00OO0.ic_moment_comment_praise_gray;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    ImageKt.Image(PainterResources_androidKt.painterResource(iOooO0o0, composerStartRestartGroup, 0), (String) null, SizeKt.m523size3ABfNKs(companion, fM3765constructorimpl), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 2097208, 56);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-471037530);
                    composerStartRestartGroup.startReplaceableGroup(-471037429);
                    if (z) {
                        oOOOOo0O oooooo0o8 = oOOOOo0O.f56683OooO00o;
                        iOooO0o0 = oOOOOo0O.OooO0o0(composerStartRestartGroup);
                    } else {
                        iOooO0o0 = oOo00OO0.ic_moment_comment_praise_gray;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    ImageKt.Image(PainterResources_androidKt.painterResource(iOooO0o0, composerStartRestartGroup, 0), (String) null, SizeKt.m523size3ABfNKs(companion, fM3765constructorimpl), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 2097208, 56);
                    composerStartRestartGroup.endReplaceableGroup();
                }
                if (androidx.compose.material.OooOO0.OooO0O0(composerStartRestartGroup)) {
                    ComposerKt.traceEventEnd();
                }
                float f10 = fM3765constructorimpl;
                f5 = fM3765constructorimpl2;
                f6 = f10;
            } else {
                if (i6 != 0) {
                    fM3765constructorimpl = Dp.m3765constructorimpl(21);
                } else {
                    fM3765constructorimpl = f3;
                }
                if (i4 != 0) {
                    fM3765constructorimpl2 = Dp.m3765constructorimpl(48);
                } else {
                    fM3765constructorimpl2 = f4;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1768777235, i3, -1, "com.yalla.yalla.ui.screen.moment.media.MomentPraise.PraiseImage (MomentPraise.kt:37)");
                }
                companion = Modifier.INSTANCE;
                Modifier modifierM523size3ABfNKs5 = SizeKt.m523size3ABfNKs(companion, fM3765constructorimpl);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyOooO00o5 = OooOOO.OooO00o(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                constructor = companion6.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierM523size3ABfNKs5);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                function2OooO00o = OooO.OooO00o(companion6, composerM1309constructorimpl, measurePolicyOooO00o5, composerM1309constructorimpl, currentCompositionLocalMap5);
                if (composerM1309constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                OooOO0.OooO00o(0, function3ModifierMaterializerOf5, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance5 = BoxScopeInstance.INSTANCE;
                if (z) {
                    composerStartRestartGroup.startReplaceableGroup(-471037530);
                    composerStartRestartGroup.startReplaceableGroup(-471037429);
                    if (z) {
                        oOOOOo0O oooooo0o9 = oOOOOo0O.f56683OooO00o;
                        iOooO0o0 = oOOOOo0O.OooO0o0(composerStartRestartGroup);
                    } else {
                        iOooO0o0 = oOo00OO0.ic_moment_comment_praise_gray;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    ImageKt.Image(PainterResources_androidKt.painterResource(iOooO0o0, composerStartRestartGroup, 0), (String) null, SizeKt.m523size3ABfNKs(companion, fM3765constructorimpl), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 2097208, 56);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-471037530);
                    composerStartRestartGroup.startReplaceableGroup(-471037429);
                    if (z) {
                        oOOOOo0O oooooo0o10 = oOOOOo0O.f56683OooO00o;
                        iOooO0o0 = oOOOOo0O.OooO0o0(composerStartRestartGroup);
                    } else {
                        iOooO0o0 = oOo00OO0.ic_moment_comment_praise_gray;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    ImageKt.Image(PainterResources_androidKt.painterResource(iOooO0o0, composerStartRestartGroup, 0), (String) null, SizeKt.m523size3ABfNKs(companion, fM3765constructorimpl), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 2097208, 56);
                    composerStartRestartGroup.endReplaceableGroup();
                }
                if (androidx.compose.material.OooOO0.OooO0O0(composerStartRestartGroup)) {
                    ComposerKt.traceEventEnd();
                }
                float f11 = fM3765constructorimpl;
                f5 = fM3765constructorimpl2;
                f6 = f11;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(z, showPraiseAnim, f6, f5, i, i2));
        }
        i3 |= 3072;
        f4 = f2;
        if ((i3 & 5851) == 1170) {
            if (i6 != 0) {
                fM3765constructorimpl = Dp.m3765constructorimpl(21);
            } else {
                fM3765constructorimpl = f3;
            }
            if (i4 != 0) {
                fM3765constructorimpl2 = Dp.m3765constructorimpl(48);
            } else {
                fM3765constructorimpl2 = f4;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1768777235, i3, -1, "com.yalla.yalla.ui.screen.moment.media.MomentPraise.PraiseImage (MomentPraise.kt:37)");
            }
            companion = Modifier.INSTANCE;
            Modifier modifierM523size3ABfNKs6 = SizeKt.m523size3ABfNKs(companion, fM3765constructorimpl);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyOooO00o6 = OooOOO.OooO00o(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
            constructor = companion7.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(modifierM523size3ABfNKs6);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
            function2OooO00o = OooO.OooO00o(companion7, composerM1309constructorimpl, measurePolicyOooO00o6, composerM1309constructorimpl, currentCompositionLocalMap6);
            if (composerM1309constructorimpl.getInserting()) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            } else {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            OooOO0.OooO00o(0, function3ModifierMaterializerOf6, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance6 = BoxScopeInstance.INSTANCE;
            if (z) {
                composerStartRestartGroup.startReplaceableGroup(-471037530);
                composerStartRestartGroup.startReplaceableGroup(-471037429);
                if (z) {
                    oOOOOo0O oooooo0o11 = oOOOOo0O.f56683OooO00o;
                    iOooO0o0 = oOOOOo0O.OooO0o0(composerStartRestartGroup);
                } else {
                    iOooO0o0 = oOo00OO0.ic_moment_comment_praise_gray;
                }
                composerStartRestartGroup.endReplaceableGroup();
                ImageKt.Image(PainterResources_androidKt.painterResource(iOooO0o0, composerStartRestartGroup, 0), (String) null, SizeKt.m523size3ABfNKs(companion, fM3765constructorimpl), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 2097208, 56);
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(-471037530);
                composerStartRestartGroup.startReplaceableGroup(-471037429);
                if (z) {
                    oOOOOo0O oooooo0o12 = oOOOOo0O.f56683OooO00o;
                    iOooO0o0 = oOOOOo0O.OooO0o0(composerStartRestartGroup);
                } else {
                    iOooO0o0 = oOo00OO0.ic_moment_comment_praise_gray;
                }
                composerStartRestartGroup.endReplaceableGroup();
                ImageKt.Image(PainterResources_androidKt.painterResource(iOooO0o0, composerStartRestartGroup, 0), (String) null, SizeKt.m523size3ABfNKs(companion, fM3765constructorimpl), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 2097208, 56);
                composerStartRestartGroup.endReplaceableGroup();
            }
            if (androidx.compose.material.OooOO0.OooO0O0(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
            float f12 = fM3765constructorimpl;
            f5 = fM3765constructorimpl2;
            f6 = f12;
        } else {
            if (i6 != 0) {
                fM3765constructorimpl = Dp.m3765constructorimpl(21);
            } else {
                fM3765constructorimpl = f3;
            }
            if (i4 != 0) {
                fM3765constructorimpl2 = Dp.m3765constructorimpl(48);
            } else {
                fM3765constructorimpl2 = f4;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1768777235, i3, -1, "com.yalla.yalla.ui.screen.moment.media.MomentPraise.PraiseImage (MomentPraise.kt:37)");
            }
            companion = Modifier.INSTANCE;
            Modifier modifierM523size3ABfNKs7 = SizeKt.m523size3ABfNKs(companion, fM3765constructorimpl);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyOooO00o7 = OooOOO.OooO00o(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap7 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
            constructor = companion8.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf7 = LayoutKt.modifierMaterializerOf(modifierM523size3ABfNKs7);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
            function2OooO00o = OooO.OooO00o(companion8, composerM1309constructorimpl, measurePolicyOooO00o7, composerM1309constructorimpl, currentCompositionLocalMap7);
            if (composerM1309constructorimpl.getInserting()) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            } else {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            OooOO0.OooO00o(0, function3ModifierMaterializerOf7, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance7 = BoxScopeInstance.INSTANCE;
            if (z) {
                composerStartRestartGroup.startReplaceableGroup(-471037530);
                composerStartRestartGroup.startReplaceableGroup(-471037429);
                if (z) {
                    oOOOOo0O oooooo0o13 = oOOOOo0O.f56683OooO00o;
                    iOooO0o0 = oOOOOo0O.OooO0o0(composerStartRestartGroup);
                } else {
                    iOooO0o0 = oOo00OO0.ic_moment_comment_praise_gray;
                }
                composerStartRestartGroup.endReplaceableGroup();
                ImageKt.Image(PainterResources_androidKt.painterResource(iOooO0o0, composerStartRestartGroup, 0), (String) null, SizeKt.m523size3ABfNKs(companion, fM3765constructorimpl), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 2097208, 56);
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(-471037530);
                composerStartRestartGroup.startReplaceableGroup(-471037429);
                if (z) {
                    oOOOOo0O oooooo0o14 = oOOOOo0O.f56683OooO00o;
                    iOooO0o0 = oOOOOo0O.OooO0o0(composerStartRestartGroup);
                } else {
                    iOooO0o0 = oOo00OO0.ic_moment_comment_praise_gray;
                }
                composerStartRestartGroup.endReplaceableGroup();
                ImageKt.Image(PainterResources_androidKt.painterResource(iOooO0o0, composerStartRestartGroup, 0), (String) null, SizeKt.m523size3ABfNKs(companion, fM3765constructorimpl), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 2097208, 56);
                composerStartRestartGroup.endReplaceableGroup();
            }
            if (androidx.compose.material.OooOO0.OooO0O0(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
            float f13 = fM3765constructorimpl;
            f5 = fM3765constructorimpl2;
            f6 = f13;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(z, showPraiseAnim, f6, f5, i, i2));
    }
}
