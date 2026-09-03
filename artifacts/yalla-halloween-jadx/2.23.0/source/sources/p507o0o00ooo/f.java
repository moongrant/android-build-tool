package p507o0o00ooo;

import androidx.compose.animation.OooO;
import androidx.compose.animation.OooOO0;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.OooOO0O;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.OooO0o;
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
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.RotateKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import androidx.compose.ui.window.PopupProperties;
import com.code.android.util.o0000O0;
import com.code.android.util.o0O0O00;
import com.yalla.yalla.ui.composable.common.BeatGuideAlignment;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
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
import p150o00Oo0oO.o00000OO;
import p469o0OoooOO.o0oO0O0o;
import p584o0oOooO0.oO00OOo0;
import p592o0oo00O.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nBastGuidePopup.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BastGuidePopup.kt\ncom/yalla/yalla/ui/composable/common/BastGuidePopup\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,178:1\n25#2:179\n456#2,8:205\n464#2,3:219\n456#2,8:240\n464#2,3:254\n467#2,3:258\n36#2:264\n456#2,8:287\n464#2,3:301\n467#2,3:305\n467#2,3:310\n1097#3,6:180\n1097#3,6:265\n154#4:186\n154#4:187\n154#4:263\n73#5,6:188\n79#5:222\n83#5:314\n78#6,11:194\n78#6,11:229\n91#6:261\n78#6,11:276\n91#6:308\n91#6:313\n4144#7,6:213\n4144#7,6:248\n4144#7,6:295\n66#8,6:223\n72#8:257\n76#8:262\n67#8,5:271\n72#8:304\n76#8:309\n81#9:315\n107#9,2:316\n81#9:318\n*S KotlinDebug\n*F\n+ 1 BastGuidePopup.kt\ncom/yalla/yalla/ui/composable/common/BastGuidePopup\n*L\n80#1:179\n149#1:205,8\n149#1:219,3\n155#1:240,8\n155#1:254,3\n155#1:258,3\n164#1:264\n158#1:287,8\n158#1:301,3\n158#1:305,3\n149#1:310,3\n80#1:180,6\n164#1:265,6\n152#1:186\n153#1:187\n161#1:263\n149#1:188,6\n149#1:222\n149#1:314\n149#1:194,11\n155#1:229,11\n155#1:261\n158#1:276,11\n158#1:308\n149#1:313\n149#1:213,6\n155#1:248,6\n158#1:295,6\n155#1:223,6\n155#1:257\n155#1:262\n158#1:271,5\n158#1:304\n158#1:309\n80#1:315\n80#1:316,2\n82#1:318\n*E\n"})
public final class f {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final f f49836OooO00o = new f();

    @SourceDebugExtension({"SMAP\nBastGuidePopup.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BastGuidePopup.kt\ncom/yalla/yalla/ui/composable/common/BastGuidePopup$GuidePopup$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,178:1\n154#2:179\n164#2:222\n154#2:224\n154#2:225\n164#2:226\n154#2:228\n154#2:229\n36#3:180\n456#3,8:204\n464#3,3:218\n467#3,3:230\n1097#4,6:181\n72#5,6:187\n78#5:221\n82#5:234\n78#6,11:193\n91#6:233\n4144#7,6:212\n58#8:223\n58#8:227\n*S KotlinDebug\n*F\n+ 1 BastGuidePopup.kt\ncom/yalla/yalla/ui/composable/common/BastGuidePopup$GuidePopup$1\n*L\n110#1:179\n127#1:222\n127#1:224\n128#1:225\n137#1:226\n137#1:228\n138#1:229\n111#1:180\n108#1:204,8\n108#1:218,3\n108#1:230,3\n111#1:181,6\n108#1:187,6\n108#1:221\n108#1:234\n108#1:193,11\n108#1:233\n108#1:212,6\n127#1:223\n137#1:227\n*E\n"})
    public static final class OooO00o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ String f49837OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<IntSize> f49838OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ long f49839OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ BeatGuideAlignment f49840OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ long f49841OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ boolean f49842OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f49843OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ int f49844OooOO0O;

        /* JADX INFO: renamed from: o0o00ooo.f$OooO00o$OooO00o, reason: collision with other inner class name */
        public /* synthetic */ class C0490OooO00o {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[BeatGuideAlignment.values().length];
                try {
                    iArr[BeatGuideAlignment.Start.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[BeatGuideAlignment.Center.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[BeatGuideAlignment.End.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(MutableState<IntSize> mutableState, BeatGuideAlignment beatGuideAlignment, long j, long j2, boolean z, String str, Function0<Unit> function0, int i) {
            super(2);
            this.f49838OooO0Oo = mutableState;
            this.f49840OooO0o0 = beatGuideAlignment;
            this.f49839OooO0o = j;
            this.f49841OooO0oO = j2;
            this.f49842OooO0oo = z;
            this.f49837OooO = str;
            this.f49843OooOO0 = function0;
            this.f49844OooOO0O = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            float fOooO0Oo;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-714545303, iIntValue, -1, "com.yalla.yalla.ui.composable.common.BastGuidePopup.GuidePopup.<anonymous> (BastGuidePopup.kt:106)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierM528width3ABfNKs = SizeKt.m528width3ABfNKs(companion, Dp.m3765constructorimpl(280));
                composer2.startReplaceableGroup(1157296644);
                MutableState<IntSize> mutableState = this.f49838OooO0Oo;
                boolean zChanged = composer2.changed(mutableState);
                Object objRememberedValue = composer2.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new e(mutableState);
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceableGroup();
                Modifier modifierOnSizeChanged = OnRemeasuredModifierKt.onSizeChanged(modifierM528width3ABfNKs, (Function1) objRememberedValue);
                composer2.startReplaceableGroup(-483455358);
                MeasurePolicy measurePolicyOooO00o = OooO0o.OooO00o(Alignment.INSTANCE, Arrangement.INSTANCE.getTop(), composer2, 0, -1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierOnSizeChanged);
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
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer2)), composer2, 2058660585);
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                int i = C0490OooO00o.$EnumSwitchMapping$0[this.f49840OooO0o0.ordinal()];
                long j = this.f49839OooO0o;
                long j2 = this.f49841OooO0oO;
                if (i == 1) {
                    composer2.startReplaceableGroup(1432542161);
                    fOooO0Oo = o0000O0.OooO0Oo((Offset.m1436getXimpl(j) + (IntSize.m3925getWidthimpl(j2) / 2)) - o0000O0.OooO00o(16), composer2);
                    composer2.endReplaceableGroup();
                } else if (i == 2) {
                    composer2.startReplaceableGroup(1432542278);
                    fOooO0Oo = o0000O0.OooO0Oo((Offset.m1436getXimpl(j) + (IntSize.m3925getWidthimpl(j2) / 2)) - o0000O0.OooO00o(40), composer2);
                    composer2.endReplaceableGroup();
                } else {
                    if (i != 3) {
                        composer2.startReplaceableGroup(1432537816);
                        composer2.endReplaceableGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composer2.startReplaceableGroup(1432542390);
                    fOooO0Oo = o0000O0.OooO0Oo((Offset.m1436getXimpl(j) + (IntSize.m3925getWidthimpl(j2) / 2)) - o0000O0.OooO00o(64), composer2);
                    composer2.endReplaceableGroup();
                }
                OooOOO0.OooO0OO("QQQQAAAA", "viewLocation.x = " + Offset.m1436getXimpl(j) + ", viewSize.width / 2 = " + (IntSize.m3925getWidthimpl(j2) / 2) + ", triangleOffsetX = " + Dp.m3776toStringimpl(fOooO0Oo));
                composer2.startReplaceableGroup(1432542643);
                u1.OooO00o oooO00o = u1.f50293OooO00o;
                boolean z = this.f49842OooO0oo;
                if (z) {
                    BoxKt.Box(BackgroundKt.m168backgroundbw27NRU(RotateKt.rotate(SizeKt.m525sizeVpY3zN4(OffsetKt.m436offsetVpY3zN4(companion, Dp.m3765constructorimpl(fOooO0Oo - Dp.m3765constructorimpl((float) 7.5d)), Dp.m3765constructorimpl(0)), Dp.m3765constructorimpl(15), Dp.m3765constructorimpl(8)), 180.0f), o0oO0O0o.f47084o000o0oO, oooO00o), composer2, 0);
                }
                composer2.endReplaceableGroup();
                f fVar = f.f49836OooO00o;
                int i2 = this.f49844OooOO0O;
                f.OooO0O0(fVar, this.f49837OooO, this.f49843OooOO0, composer2, ((i2 >> 12) & 112) | (i2 & 14) | 384);
                composer2.startReplaceableGroup(520696138);
                if (!z) {
                    BoxKt.Box(RotateKt.rotate(BackgroundKt.m168backgroundbw27NRU(SizeKt.m525sizeVpY3zN4(OffsetKt.m436offsetVpY3zN4(companion, Dp.m3765constructorimpl(fOooO0Oo - Dp.m3765constructorimpl((float) 7.5d)), Dp.m3765constructorimpl(0)), Dp.m3765constructorimpl(15), Dp.m3765constructorimpl(8)), o0oO0O0o.f47084o000o0oO, oooO00o), 0.0f), composer2, 0);
                }
                if (OooOo.OooO0o.OooO0O0(composer2)) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ BeatGuideAlignment f49845OooO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ long f49847OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ String f49848OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ long f49849OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ boolean f49850OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f49851OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ int f49852OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final /* synthetic */ int f49853OooOO0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(String str, long j, long j2, boolean z, BeatGuideAlignment beatGuideAlignment, Function0<Unit> function0, int i, int i2) {
            super(2);
            this.f49848OooO0o0 = str;
            this.f49847OooO0o = j;
            this.f49849OooO0oO = j2;
            this.f49850OooO0oo = z;
            this.f49845OooO = beatGuideAlignment;
            this.f49851OooOO0 = function0;
            this.f49852OooOO0O = i;
            this.f49853OooOO0o = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            f.this.OooO00o(this.f49848OooO0o0, this.f49847OooO0o, this.f49849OooO0oO, this.f49850OooO0oo, this.f49845OooO, this.f49851OooOO0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f49852OooOO0O | 1), this.f49853OooOO0o);
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ class OooO0OO {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BeatGuideAlignment.values().length];
            try {
                iArr[BeatGuideAlignment.Start.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BeatGuideAlignment.Center.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BeatGuideAlignment.End.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void OooO0O0(f fVar, String str, Function0 function0, Composer composer, int i) {
        int i2;
        Composer composer2;
        Function0 function1 = function0;
        fVar.getClass();
        Composer composerStartRestartGroup = composer.startRestartGroup(261206438);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2;
        if ((i3 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(261206438, i3, -1, "com.yalla.yalla.ui.composable.common.BastGuidePopup.BaseGuideContext (BastGuidePopup.kt:147)");
            }
            Alignment.Companion companion = Alignment.INSTANCE;
            Alignment.Vertical centerVertically = companion.getCenterVertically();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            long j = o0oO0O0o.f47084o000o0oO;
            Modifier modifierM477paddingVpY3zN4 = PaddingKt.m477paddingVpY3zN4(BackgroundKt.m168backgroundbw27NRU(companion2, j, RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(Dp.m3765constructorimpl(8))), Dp.m3765constructorimpl(12), Dp.m3765constructorimpl(16));
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyOooO00o = androidx.compose.material.OooO.OooO00o(Arrangement.INSTANCE, centerVertically, composerStartRestartGroup, 48, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM477paddingVpY3zN4);
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
            Function2 function2OooO00o = OooO.OooO00o(companion3, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
            if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            Modifier modifierOooO00o = OooOO0O.OooO00o(RowScopeInstance.INSTANCE, companion2, 1.0f, false, 2, null);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyOooO00o2 = OooOOO.OooO00o(companion, false, composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierOooO00o);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM1309constructorimpl2 = Updater.m1309constructorimpl(composerStartRestartGroup);
            Function2 function2OooO00o2 = OooO.OooO00o(companion3, composerM1309constructorimpl2, measurePolicyOooO00o2, composerM1309constructorimpl2, currentCompositionLocalMap2);
            if (composerM1309constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
            }
            OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            long j2 = o0oO0O0o.f46946OooO0O0;
            TextKt.m1251Text4IGK_g(str, (Modifier) null, j2, TextUnitKt.getSp(15), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i3 & 14) | 3072, 0, 131058);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            Alignment center = companion.getCenter();
            Modifier modifierClip = ClipKt.clip(BackgroundKt.m168backgroundbw27NRU(SizeKt.m523size3ABfNKs(companion2, Dp.m3765constructorimpl(36)), j2, RoundedCornerShapeKt.getCircleShape()), RoundedCornerShapeKt.getCircleShape());
            composer2 = composerStartRestartGroup;
            composer2.startReplaceableGroup(1157296644);
            function1 = function0;
            boolean zChanged = composer2.changed(function1);
            Object objRememberedValue = composer2.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new c(function1);
                composer2.updateRememberedValue(objRememberedValue);
            }
            composer2.endReplaceableGroup();
            Modifier modifierOooO0O0 = o0O0O00.OooO0O0(modifierClip, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253);
            composer2.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 6);
            composer2.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierOooO0O0);
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor3);
            } else {
                composer2.useNode();
            }
            Composer composerM1309constructorimpl3 = Updater.m1309constructorimpl(composer2);
            Function2 function2OooO00o3 = OooO.OooO00o(companion3, composerM1309constructorimpl3, measurePolicyRememberBoxMeasurePolicy, composerM1309constructorimpl3, currentCompositionLocalMap3);
            if (composerM1309constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash3, composerM1309constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
            }
            OooOO0.OooO00o(0, function3ModifierMaterializerOf3, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer2)), composer2, 2058660585);
            TextKt.m1251Text4IGK_g(StringResources_androidKt.stringResource(oO00OOo0.OK, composer2, 0), (Modifier) null, j, TextUnitKt.getSp(15), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3664boximpl(TextAlign.INSTANCE.m3671getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 130546);
            if (o00000OO.OooO00o(composer2)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new d(fVar, str, function1, i));
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0191  */
    /* JADX WARN: Code duplicated, block: B:101:0x0199  */
    /* JADX WARN: Code duplicated, block: B:103:0x019f  */
    /* JADX WARN: Code duplicated, block: B:106:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:107:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:110:0x021a  */
    /* JADX WARN: Code duplicated, block: B:115:0x0227  */
    /* JADX WARN: Code duplicated, block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x0086  */
    /* JADX WARN: Code duplicated, block: B:47:0x0089  */
    /* JADX WARN: Code duplicated, block: B:49:0x008f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0097  */
    /* JADX WARN: Code duplicated, block: B:52:0x009a  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:59:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:74:0x00da  */
    /* JADX WARN: Code duplicated, block: B:76:0x00de  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:84:0x00fb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:85:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:86:0x0104  */
    /* JADX WARN: Code duplicated, block: B:88:0x010a  */
    /* JADX WARN: Code duplicated, block: B:89:0x0111  */
    /* JADX WARN: Code duplicated, block: B:92:0x012d  */
    /* JADX WARN: Code duplicated, block: B:93:0x013e  */
    /* JADX WARN: Code duplicated, block: B:96:0x018b  */
    /* JADX WARN: Code duplicated, block: B:98:0x018e  */
    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO00o(@NotNull String message, long j, long j2, boolean z, @Nullable BeatGuideAlignment beatGuideAlignment, @NotNull Function0<Unit> onRequestDismiss, @Nullable Composer composer, int i, int i2) {
        int i3;
        boolean z2;
        int i4;
        BeatGuideAlignment beatGuideAlignment2;
        int i5;
        int i6;
        boolean z3;
        int i7;
        Alignment topStart;
        Object objRememberedValue;
        int iOooO00o;
        int i8;
        MutableState mutableState;
        int i9;
        int iM3924getHeightimpl;
        BeatGuideAlignment beatGuideAlignment3;
        boolean z4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(onRequestDismiss, "onRequestDismiss");
        Composer composerStartRestartGroup = composer.startRestartGroup(-188586516);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(message) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= composerStartRestartGroup.changed(j) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= composerStartRestartGroup.changed(j2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        int i10 = i2 & 8;
        if (i10 == 0) {
            if ((i & 7168) == 0) {
                z2 = z;
                i3 |= composerStartRestartGroup.changed(z2) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((57344 & i) == 0) {
                    beatGuideAlignment2 = beatGuideAlignment;
                    if (composerStartRestartGroup.changed(beatGuideAlignment2)) {
                        i5 = 16384;
                    } else {
                        i5 = 8192;
                    }
                    i3 |= i5;
                }
                if ((i2 & 32) != 0) {
                    if ((i & 458752) == 0) {
                        if (composerStartRestartGroup.changedInstance(onRequestDismiss)) {
                            i6 = 131072;
                        } else {
                            i6 = 65536;
                        }
                    }
                    if ((i3 & 374491) == 74898 || !composerStartRestartGroup.getSkipping()) {
                        if (i10 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i4 != 0) {
                            beatGuideAlignment2 = BeatGuideAlignment.Start;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-188586516, i3, -1, "com.yalla.yalla.ui.composable.common.BastGuidePopup.GuidePopup (BastGuidePopup.kt:66)");
                        }
                        int[] iArr = OooO0OO.$EnumSwitchMapping$0;
                        i7 = iArr[beatGuideAlignment2.ordinal()];
                        if (i7 == 1) {
                            topStart = Alignment.INSTANCE.getTopStart();
                        } else if (i7 == 2) {
                            topStart = Alignment.INSTANCE.getTopCenter();
                        } else {
                            if (i7 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            topStart = Alignment.INSTANCE.getTopEnd();
                        }
                        Alignment alignment = topStart;
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        iOooO00o = 0;
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            i8 = 2;
                            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntSize.m3917boximpl(IntSizeKt.IntSize(0, 0)), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            i8 = 2;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue;
                        int i11 = i3;
                        State<Float> stateAnimateFloat = InfiniteTransitionKt.animateFloat(InfiniteTransitionKt.rememberInfiniteTransition(null, composerStartRestartGroup, 0, 1), 0.0f, 8.0f, AnimationSpecKt.m81infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(500, 0, EasingKt.getLinearEasing(), i8, null), RepeatMode.Reverse, 0L, 4, null), null, composerStartRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9), 8);
                        i9 = iArr[beatGuideAlignment2.ordinal()];
                        if (i9 == 1) {
                            iOooO00o = o0000O0.OooO00o(16);
                        } else if (i9 != 2) {
                            if (i9 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            iOooO00o = o0000O0.OooO00o(-16);
                        }
                        int iM1437getYimpl = (int) Offset.m1437getYimpl(j2);
                        if (z3) {
                            iM3924getHeightimpl = IntSize.m3924getHeightimpl(j);
                        } else {
                            iM3924getHeightimpl = -IntSize.m3924getHeightimpl(((IntSize) mutableState.getValue()).getPackedValue());
                        }
                        AndroidPopup_androidKt.m4004PopupK5zGePQ(alignment, IntOffsetKt.IntOffset(iOooO00o, o0000O0.OooO00o(stateAnimateFloat.getValue().floatValue()) + iM1437getYimpl + iM3924getHeightimpl), null, new PopupProperties(false, false, false, null, false, false, 8, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -714545303, true, new OooO00o(mutableState, beatGuideAlignment2, j2, j, z3, message, onRequestDismiss, i11)), composerStartRestartGroup, 27648, 4);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        beatGuideAlignment3 = beatGuideAlignment2;
                        z4 = z3;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        z4 = z2;
                        beatGuideAlignment3 = beatGuideAlignment2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(message, j, j2, z4, beatGuideAlignment3, onRequestDismiss, i, i2));
                }
                i6 = 196608;
                i3 |= i6;
                if ((i3 & 374491) == 74898) {
                    if (i10 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i4 != 0) {
                        beatGuideAlignment2 = BeatGuideAlignment.Start;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-188586516, i3, -1, "com.yalla.yalla.ui.composable.common.BastGuidePopup.GuidePopup (BastGuidePopup.kt:66)");
                    }
                    int[] iArr2 = OooO0OO.$EnumSwitchMapping$0;
                    i7 = iArr2[beatGuideAlignment2.ordinal()];
                    if (i7 == 1) {
                        topStart = Alignment.INSTANCE.getTopStart();
                    } else if (i7 == 2) {
                        topStart = Alignment.INSTANCE.getTopCenter();
                    } else {
                        if (i7 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        topStart = Alignment.INSTANCE.getTopEnd();
                    }
                    Alignment alignment2 = topStart;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    iOooO00o = 0;
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        i8 = 2;
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntSize.m3917boximpl(IntSizeKt.IntSize(0, 0)), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        i8 = 2;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue;
                    int i12 = i3;
                    State<Float> stateAnimateFloat2 = InfiniteTransitionKt.animateFloat(InfiniteTransitionKt.rememberInfiniteTransition(null, composerStartRestartGroup, 0, 1), 0.0f, 8.0f, AnimationSpecKt.m81infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(500, 0, EasingKt.getLinearEasing(), i8, null), RepeatMode.Reverse, 0L, 4, null), null, composerStartRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9), 8);
                    i9 = iArr2[beatGuideAlignment2.ordinal()];
                    if (i9 == 1) {
                        iOooO00o = o0000O0.OooO00o(16);
                    } else if (i9 != 2) {
                        if (i9 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        iOooO00o = o0000O0.OooO00o(-16);
                    }
                    int iM1437getYimpl2 = (int) Offset.m1437getYimpl(j2);
                    if (z3) {
                        iM3924getHeightimpl = IntSize.m3924getHeightimpl(j);
                    } else {
                        iM3924getHeightimpl = -IntSize.m3924getHeightimpl(((IntSize) mutableState.getValue()).getPackedValue());
                    }
                    AndroidPopup_androidKt.m4004PopupK5zGePQ(alignment2, IntOffsetKt.IntOffset(iOooO00o, o0000O0.OooO00o(stateAnimateFloat2.getValue().floatValue()) + iM1437getYimpl2 + iM3924getHeightimpl), null, new PopupProperties(false, false, false, null, false, false, 8, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -714545303, true, new OooO00o(mutableState, beatGuideAlignment2, j2, j, z3, message, onRequestDismiss, i12)), composerStartRestartGroup, 27648, 4);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    beatGuideAlignment3 = beatGuideAlignment2;
                    z4 = z3;
                } else {
                    if (i10 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i4 != 0) {
                        beatGuideAlignment2 = BeatGuideAlignment.Start;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-188586516, i3, -1, "com.yalla.yalla.ui.composable.common.BastGuidePopup.GuidePopup (BastGuidePopup.kt:66)");
                    }
                    int[] iArr3 = OooO0OO.$EnumSwitchMapping$0;
                    i7 = iArr3[beatGuideAlignment2.ordinal()];
                    if (i7 == 1) {
                        topStart = Alignment.INSTANCE.getTopStart();
                    } else if (i7 == 2) {
                        topStart = Alignment.INSTANCE.getTopCenter();
                    } else {
                        if (i7 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        topStart = Alignment.INSTANCE.getTopEnd();
                    }
                    Alignment alignment3 = topStart;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    iOooO00o = 0;
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        i8 = 2;
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntSize.m3917boximpl(IntSizeKt.IntSize(0, 0)), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        i8 = 2;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue;
                    int i13 = i3;
                    State<Float> stateAnimateFloat3 = InfiniteTransitionKt.animateFloat(InfiniteTransitionKt.rememberInfiniteTransition(null, composerStartRestartGroup, 0, 1), 0.0f, 8.0f, AnimationSpecKt.m81infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(500, 0, EasingKt.getLinearEasing(), i8, null), RepeatMode.Reverse, 0L, 4, null), null, composerStartRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9), 8);
                    i9 = iArr3[beatGuideAlignment2.ordinal()];
                    if (i9 == 1) {
                        iOooO00o = o0000O0.OooO00o(16);
                    } else if (i9 != 2) {
                        if (i9 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        iOooO00o = o0000O0.OooO00o(-16);
                    }
                    int iM1437getYimpl3 = (int) Offset.m1437getYimpl(j2);
                    if (z3) {
                        iM3924getHeightimpl = IntSize.m3924getHeightimpl(j);
                    } else {
                        iM3924getHeightimpl = -IntSize.m3924getHeightimpl(((IntSize) mutableState.getValue()).getPackedValue());
                    }
                    AndroidPopup_androidKt.m4004PopupK5zGePQ(alignment3, IntOffsetKt.IntOffset(iOooO00o, o0000O0.OooO00o(stateAnimateFloat3.getValue().floatValue()) + iM1437getYimpl3 + iM3924getHeightimpl), null, new PopupProperties(false, false, false, null, false, false, 8, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -714545303, true, new OooO00o(mutableState, beatGuideAlignment2, j2, j, z3, message, onRequestDismiss, i13)), composerStartRestartGroup, 27648, 4);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    beatGuideAlignment3 = beatGuideAlignment2;
                    z4 = z3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(message, j, j2, z4, beatGuideAlignment3, onRequestDismiss, i, i2));
            }
            i3 |= 24576;
            beatGuideAlignment2 = beatGuideAlignment;
            if ((i2 & 32) != 0) {
                if ((i & 458752) == 0) {
                    if (composerStartRestartGroup.changedInstance(onRequestDismiss)) {
                        i6 = 131072;
                    } else {
                        i6 = 65536;
                    }
                }
                if ((i3 & 374491) == 74898) {
                    if (i10 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i4 != 0) {
                        beatGuideAlignment2 = BeatGuideAlignment.Start;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-188586516, i3, -1, "com.yalla.yalla.ui.composable.common.BastGuidePopup.GuidePopup (BastGuidePopup.kt:66)");
                    }
                    int[] iArr4 = OooO0OO.$EnumSwitchMapping$0;
                    i7 = iArr4[beatGuideAlignment2.ordinal()];
                    if (i7 == 1) {
                        topStart = Alignment.INSTANCE.getTopStart();
                    } else if (i7 == 2) {
                        topStart = Alignment.INSTANCE.getTopCenter();
                    } else {
                        if (i7 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        topStart = Alignment.INSTANCE.getTopEnd();
                    }
                    Alignment alignment4 = topStart;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    iOooO00o = 0;
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        i8 = 2;
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntSize.m3917boximpl(IntSizeKt.IntSize(0, 0)), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        i8 = 2;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue;
                    int i14 = i3;
                    State<Float> stateAnimateFloat4 = InfiniteTransitionKt.animateFloat(InfiniteTransitionKt.rememberInfiniteTransition(null, composerStartRestartGroup, 0, 1), 0.0f, 8.0f, AnimationSpecKt.m81infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(500, 0, EasingKt.getLinearEasing(), i8, null), RepeatMode.Reverse, 0L, 4, null), null, composerStartRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9), 8);
                    i9 = iArr4[beatGuideAlignment2.ordinal()];
                    if (i9 == 1) {
                        iOooO00o = o0000O0.OooO00o(16);
                    } else if (i9 != 2) {
                        if (i9 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        iOooO00o = o0000O0.OooO00o(-16);
                    }
                    int iM1437getYimpl4 = (int) Offset.m1437getYimpl(j2);
                    if (z3) {
                        iM3924getHeightimpl = IntSize.m3924getHeightimpl(j);
                    } else {
                        iM3924getHeightimpl = -IntSize.m3924getHeightimpl(((IntSize) mutableState.getValue()).getPackedValue());
                    }
                    AndroidPopup_androidKt.m4004PopupK5zGePQ(alignment4, IntOffsetKt.IntOffset(iOooO00o, o0000O0.OooO00o(stateAnimateFloat4.getValue().floatValue()) + iM1437getYimpl4 + iM3924getHeightimpl), null, new PopupProperties(false, false, false, null, false, false, 8, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -714545303, true, new OooO00o(mutableState, beatGuideAlignment2, j2, j, z3, message, onRequestDismiss, i14)), composerStartRestartGroup, 27648, 4);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    beatGuideAlignment3 = beatGuideAlignment2;
                    z4 = z3;
                } else {
                    if (i10 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i4 != 0) {
                        beatGuideAlignment2 = BeatGuideAlignment.Start;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-188586516, i3, -1, "com.yalla.yalla.ui.composable.common.BastGuidePopup.GuidePopup (BastGuidePopup.kt:66)");
                    }
                    int[] iArr5 = OooO0OO.$EnumSwitchMapping$0;
                    i7 = iArr5[beatGuideAlignment2.ordinal()];
                    if (i7 == 1) {
                        topStart = Alignment.INSTANCE.getTopStart();
                    } else if (i7 == 2) {
                        topStart = Alignment.INSTANCE.getTopCenter();
                    } else {
                        if (i7 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        topStart = Alignment.INSTANCE.getTopEnd();
                    }
                    Alignment alignment5 = topStart;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    iOooO00o = 0;
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        i8 = 2;
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntSize.m3917boximpl(IntSizeKt.IntSize(0, 0)), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        i8 = 2;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue;
                    int i15 = i3;
                    State<Float> stateAnimateFloat5 = InfiniteTransitionKt.animateFloat(InfiniteTransitionKt.rememberInfiniteTransition(null, composerStartRestartGroup, 0, 1), 0.0f, 8.0f, AnimationSpecKt.m81infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(500, 0, EasingKt.getLinearEasing(), i8, null), RepeatMode.Reverse, 0L, 4, null), null, composerStartRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9), 8);
                    i9 = iArr5[beatGuideAlignment2.ordinal()];
                    if (i9 == 1) {
                        iOooO00o = o0000O0.OooO00o(16);
                    } else if (i9 != 2) {
                        if (i9 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        iOooO00o = o0000O0.OooO00o(-16);
                    }
                    int iM1437getYimpl5 = (int) Offset.m1437getYimpl(j2);
                    if (z3) {
                        iM3924getHeightimpl = IntSize.m3924getHeightimpl(j);
                    } else {
                        iM3924getHeightimpl = -IntSize.m3924getHeightimpl(((IntSize) mutableState.getValue()).getPackedValue());
                    }
                    AndroidPopup_androidKt.m4004PopupK5zGePQ(alignment5, IntOffsetKt.IntOffset(iOooO00o, o0000O0.OooO00o(stateAnimateFloat5.getValue().floatValue()) + iM1437getYimpl5 + iM3924getHeightimpl), null, new PopupProperties(false, false, false, null, false, false, 8, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -714545303, true, new OooO00o(mutableState, beatGuideAlignment2, j2, j, z3, message, onRequestDismiss, i15)), composerStartRestartGroup, 27648, 4);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    beatGuideAlignment3 = beatGuideAlignment2;
                    z4 = z3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(message, j, j2, z4, beatGuideAlignment3, onRequestDismiss, i, i2));
            }
            i6 = 196608;
            i3 |= i6;
            if ((i3 & 374491) == 74898) {
                if (i10 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (i4 != 0) {
                    beatGuideAlignment2 = BeatGuideAlignment.Start;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-188586516, i3, -1, "com.yalla.yalla.ui.composable.common.BastGuidePopup.GuidePopup (BastGuidePopup.kt:66)");
                }
                int[] iArr6 = OooO0OO.$EnumSwitchMapping$0;
                i7 = iArr6[beatGuideAlignment2.ordinal()];
                if (i7 == 1) {
                    topStart = Alignment.INSTANCE.getTopStart();
                } else if (i7 == 2) {
                    topStart = Alignment.INSTANCE.getTopCenter();
                } else {
                    if (i7 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    topStart = Alignment.INSTANCE.getTopEnd();
                }
                Alignment alignment6 = topStart;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                iOooO00o = 0;
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    i8 = 2;
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntSize.m3917boximpl(IntSizeKt.IntSize(0, 0)), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    i8 = 2;
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue;
                int i16 = i3;
                State<Float> stateAnimateFloat6 = InfiniteTransitionKt.animateFloat(InfiniteTransitionKt.rememberInfiniteTransition(null, composerStartRestartGroup, 0, 1), 0.0f, 8.0f, AnimationSpecKt.m81infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(500, 0, EasingKt.getLinearEasing(), i8, null), RepeatMode.Reverse, 0L, 4, null), null, composerStartRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9), 8);
                i9 = iArr6[beatGuideAlignment2.ordinal()];
                if (i9 == 1) {
                    iOooO00o = o0000O0.OooO00o(16);
                } else if (i9 != 2) {
                    if (i9 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    iOooO00o = o0000O0.OooO00o(-16);
                }
                int iM1437getYimpl6 = (int) Offset.m1437getYimpl(j2);
                if (z3) {
                    iM3924getHeightimpl = IntSize.m3924getHeightimpl(j);
                } else {
                    iM3924getHeightimpl = -IntSize.m3924getHeightimpl(((IntSize) mutableState.getValue()).getPackedValue());
                }
                AndroidPopup_androidKt.m4004PopupK5zGePQ(alignment6, IntOffsetKt.IntOffset(iOooO00o, o0000O0.OooO00o(stateAnimateFloat6.getValue().floatValue()) + iM1437getYimpl6 + iM3924getHeightimpl), null, new PopupProperties(false, false, false, null, false, false, 8, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -714545303, true, new OooO00o(mutableState, beatGuideAlignment2, j2, j, z3, message, onRequestDismiss, i16)), composerStartRestartGroup, 27648, 4);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                beatGuideAlignment3 = beatGuideAlignment2;
                z4 = z3;
            } else {
                if (i10 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (i4 != 0) {
                    beatGuideAlignment2 = BeatGuideAlignment.Start;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-188586516, i3, -1, "com.yalla.yalla.ui.composable.common.BastGuidePopup.GuidePopup (BastGuidePopup.kt:66)");
                }
                int[] iArr7 = OooO0OO.$EnumSwitchMapping$0;
                i7 = iArr7[beatGuideAlignment2.ordinal()];
                if (i7 == 1) {
                    topStart = Alignment.INSTANCE.getTopStart();
                } else if (i7 == 2) {
                    topStart = Alignment.INSTANCE.getTopCenter();
                } else {
                    if (i7 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    topStart = Alignment.INSTANCE.getTopEnd();
                }
                Alignment alignment7 = topStart;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                iOooO00o = 0;
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    i8 = 2;
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntSize.m3917boximpl(IntSizeKt.IntSize(0, 0)), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    i8 = 2;
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue;
                int i17 = i3;
                State<Float> stateAnimateFloat7 = InfiniteTransitionKt.animateFloat(InfiniteTransitionKt.rememberInfiniteTransition(null, composerStartRestartGroup, 0, 1), 0.0f, 8.0f, AnimationSpecKt.m81infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(500, 0, EasingKt.getLinearEasing(), i8, null), RepeatMode.Reverse, 0L, 4, null), null, composerStartRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9), 8);
                i9 = iArr7[beatGuideAlignment2.ordinal()];
                if (i9 == 1) {
                    iOooO00o = o0000O0.OooO00o(16);
                } else if (i9 != 2) {
                    if (i9 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    iOooO00o = o0000O0.OooO00o(-16);
                }
                int iM1437getYimpl7 = (int) Offset.m1437getYimpl(j2);
                if (z3) {
                    iM3924getHeightimpl = IntSize.m3924getHeightimpl(j);
                } else {
                    iM3924getHeightimpl = -IntSize.m3924getHeightimpl(((IntSize) mutableState.getValue()).getPackedValue());
                }
                AndroidPopup_androidKt.m4004PopupK5zGePQ(alignment7, IntOffsetKt.IntOffset(iOooO00o, o0000O0.OooO00o(stateAnimateFloat7.getValue().floatValue()) + iM1437getYimpl7 + iM3924getHeightimpl), null, new PopupProperties(false, false, false, null, false, false, 8, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -714545303, true, new OooO00o(mutableState, beatGuideAlignment2, j2, j, z3, message, onRequestDismiss, i17)), composerStartRestartGroup, 27648, 4);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                beatGuideAlignment3 = beatGuideAlignment2;
                z4 = z3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(message, j, j2, z4, beatGuideAlignment3, onRequestDismiss, i, i2));
        }
        i3 |= 3072;
        z2 = z;
        i4 = i2 & 16;
        if (i4 != 0) {
            if ((57344 & i) == 0) {
                beatGuideAlignment2 = beatGuideAlignment;
                if (composerStartRestartGroup.changed(beatGuideAlignment2)) {
                    i5 = 16384;
                } else {
                    i5 = 8192;
                }
                i3 |= i5;
            }
            if ((i2 & 32) != 0) {
                if ((i & 458752) == 0) {
                    if (composerStartRestartGroup.changedInstance(onRequestDismiss)) {
                        i6 = 131072;
                    } else {
                        i6 = 65536;
                    }
                }
                if ((i3 & 374491) == 74898) {
                    if (i10 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i4 != 0) {
                        beatGuideAlignment2 = BeatGuideAlignment.Start;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-188586516, i3, -1, "com.yalla.yalla.ui.composable.common.BastGuidePopup.GuidePopup (BastGuidePopup.kt:66)");
                    }
                    int[] iArr8 = OooO0OO.$EnumSwitchMapping$0;
                    i7 = iArr8[beatGuideAlignment2.ordinal()];
                    if (i7 == 1) {
                        topStart = Alignment.INSTANCE.getTopStart();
                    } else if (i7 == 2) {
                        topStart = Alignment.INSTANCE.getTopCenter();
                    } else {
                        if (i7 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        topStart = Alignment.INSTANCE.getTopEnd();
                    }
                    Alignment alignment8 = topStart;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    iOooO00o = 0;
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        i8 = 2;
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntSize.m3917boximpl(IntSizeKt.IntSize(0, 0)), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        i8 = 2;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue;
                    int i18 = i3;
                    State<Float> stateAnimateFloat8 = InfiniteTransitionKt.animateFloat(InfiniteTransitionKt.rememberInfiniteTransition(null, composerStartRestartGroup, 0, 1), 0.0f, 8.0f, AnimationSpecKt.m81infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(500, 0, EasingKt.getLinearEasing(), i8, null), RepeatMode.Reverse, 0L, 4, null), null, composerStartRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9), 8);
                    i9 = iArr8[beatGuideAlignment2.ordinal()];
                    if (i9 == 1) {
                        iOooO00o = o0000O0.OooO00o(16);
                    } else if (i9 != 2) {
                        if (i9 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        iOooO00o = o0000O0.OooO00o(-16);
                    }
                    int iM1437getYimpl8 = (int) Offset.m1437getYimpl(j2);
                    if (z3) {
                        iM3924getHeightimpl = IntSize.m3924getHeightimpl(j);
                    } else {
                        iM3924getHeightimpl = -IntSize.m3924getHeightimpl(((IntSize) mutableState.getValue()).getPackedValue());
                    }
                    AndroidPopup_androidKt.m4004PopupK5zGePQ(alignment8, IntOffsetKt.IntOffset(iOooO00o, o0000O0.OooO00o(stateAnimateFloat8.getValue().floatValue()) + iM1437getYimpl8 + iM3924getHeightimpl), null, new PopupProperties(false, false, false, null, false, false, 8, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -714545303, true, new OooO00o(mutableState, beatGuideAlignment2, j2, j, z3, message, onRequestDismiss, i18)), composerStartRestartGroup, 27648, 4);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    beatGuideAlignment3 = beatGuideAlignment2;
                    z4 = z3;
                } else {
                    if (i10 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i4 != 0) {
                        beatGuideAlignment2 = BeatGuideAlignment.Start;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-188586516, i3, -1, "com.yalla.yalla.ui.composable.common.BastGuidePopup.GuidePopup (BastGuidePopup.kt:66)");
                    }
                    int[] iArr9 = OooO0OO.$EnumSwitchMapping$0;
                    i7 = iArr9[beatGuideAlignment2.ordinal()];
                    if (i7 == 1) {
                        topStart = Alignment.INSTANCE.getTopStart();
                    } else if (i7 == 2) {
                        topStart = Alignment.INSTANCE.getTopCenter();
                    } else {
                        if (i7 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        topStart = Alignment.INSTANCE.getTopEnd();
                    }
                    Alignment alignment9 = topStart;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    iOooO00o = 0;
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        i8 = 2;
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntSize.m3917boximpl(IntSizeKt.IntSize(0, 0)), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        i8 = 2;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue;
                    int i19 = i3;
                    State<Float> stateAnimateFloat9 = InfiniteTransitionKt.animateFloat(InfiniteTransitionKt.rememberInfiniteTransition(null, composerStartRestartGroup, 0, 1), 0.0f, 8.0f, AnimationSpecKt.m81infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(500, 0, EasingKt.getLinearEasing(), i8, null), RepeatMode.Reverse, 0L, 4, null), null, composerStartRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9), 8);
                    i9 = iArr9[beatGuideAlignment2.ordinal()];
                    if (i9 == 1) {
                        iOooO00o = o0000O0.OooO00o(16);
                    } else if (i9 != 2) {
                        if (i9 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        iOooO00o = o0000O0.OooO00o(-16);
                    }
                    int iM1437getYimpl9 = (int) Offset.m1437getYimpl(j2);
                    if (z3) {
                        iM3924getHeightimpl = IntSize.m3924getHeightimpl(j);
                    } else {
                        iM3924getHeightimpl = -IntSize.m3924getHeightimpl(((IntSize) mutableState.getValue()).getPackedValue());
                    }
                    AndroidPopup_androidKt.m4004PopupK5zGePQ(alignment9, IntOffsetKt.IntOffset(iOooO00o, o0000O0.OooO00o(stateAnimateFloat9.getValue().floatValue()) + iM1437getYimpl9 + iM3924getHeightimpl), null, new PopupProperties(false, false, false, null, false, false, 8, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -714545303, true, new OooO00o(mutableState, beatGuideAlignment2, j2, j, z3, message, onRequestDismiss, i19)), composerStartRestartGroup, 27648, 4);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    beatGuideAlignment3 = beatGuideAlignment2;
                    z4 = z3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(message, j, j2, z4, beatGuideAlignment3, onRequestDismiss, i, i2));
            }
            i6 = 196608;
            i3 |= i6;
            if ((i3 & 374491) == 74898) {
                if (i10 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (i4 != 0) {
                    beatGuideAlignment2 = BeatGuideAlignment.Start;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-188586516, i3, -1, "com.yalla.yalla.ui.composable.common.BastGuidePopup.GuidePopup (BastGuidePopup.kt:66)");
                }
                int[] iArr10 = OooO0OO.$EnumSwitchMapping$0;
                i7 = iArr10[beatGuideAlignment2.ordinal()];
                if (i7 == 1) {
                    topStart = Alignment.INSTANCE.getTopStart();
                } else if (i7 == 2) {
                    topStart = Alignment.INSTANCE.getTopCenter();
                } else {
                    if (i7 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    topStart = Alignment.INSTANCE.getTopEnd();
                }
                Alignment alignment10 = topStart;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                iOooO00o = 0;
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    i8 = 2;
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntSize.m3917boximpl(IntSizeKt.IntSize(0, 0)), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    i8 = 2;
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue;
                int i110 = i3;
                State<Float> stateAnimateFloat10 = InfiniteTransitionKt.animateFloat(InfiniteTransitionKt.rememberInfiniteTransition(null, composerStartRestartGroup, 0, 1), 0.0f, 8.0f, AnimationSpecKt.m81infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(500, 0, EasingKt.getLinearEasing(), i8, null), RepeatMode.Reverse, 0L, 4, null), null, composerStartRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9), 8);
                i9 = iArr10[beatGuideAlignment2.ordinal()];
                if (i9 == 1) {
                    iOooO00o = o0000O0.OooO00o(16);
                } else if (i9 != 2) {
                    if (i9 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    iOooO00o = o0000O0.OooO00o(-16);
                }
                int iM1437getYimpl10 = (int) Offset.m1437getYimpl(j2);
                if (z3) {
                    iM3924getHeightimpl = IntSize.m3924getHeightimpl(j);
                } else {
                    iM3924getHeightimpl = -IntSize.m3924getHeightimpl(((IntSize) mutableState.getValue()).getPackedValue());
                }
                AndroidPopup_androidKt.m4004PopupK5zGePQ(alignment10, IntOffsetKt.IntOffset(iOooO00o, o0000O0.OooO00o(stateAnimateFloat10.getValue().floatValue()) + iM1437getYimpl10 + iM3924getHeightimpl), null, new PopupProperties(false, false, false, null, false, false, 8, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -714545303, true, new OooO00o(mutableState, beatGuideAlignment2, j2, j, z3, message, onRequestDismiss, i110)), composerStartRestartGroup, 27648, 4);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                beatGuideAlignment3 = beatGuideAlignment2;
                z4 = z3;
            } else {
                if (i10 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (i4 != 0) {
                    beatGuideAlignment2 = BeatGuideAlignment.Start;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-188586516, i3, -1, "com.yalla.yalla.ui.composable.common.BastGuidePopup.GuidePopup (BastGuidePopup.kt:66)");
                }
                int[] iArr11 = OooO0OO.$EnumSwitchMapping$0;
                i7 = iArr11[beatGuideAlignment2.ordinal()];
                if (i7 == 1) {
                    topStart = Alignment.INSTANCE.getTopStart();
                } else if (i7 == 2) {
                    topStart = Alignment.INSTANCE.getTopCenter();
                } else {
                    if (i7 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    topStart = Alignment.INSTANCE.getTopEnd();
                }
                Alignment alignment11 = topStart;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                iOooO00o = 0;
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    i8 = 2;
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntSize.m3917boximpl(IntSizeKt.IntSize(0, 0)), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    i8 = 2;
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue;
                int i111 = i3;
                State<Float> stateAnimateFloat11 = InfiniteTransitionKt.animateFloat(InfiniteTransitionKt.rememberInfiniteTransition(null, composerStartRestartGroup, 0, 1), 0.0f, 8.0f, AnimationSpecKt.m81infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(500, 0, EasingKt.getLinearEasing(), i8, null), RepeatMode.Reverse, 0L, 4, null), null, composerStartRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9), 8);
                i9 = iArr11[beatGuideAlignment2.ordinal()];
                if (i9 == 1) {
                    iOooO00o = o0000O0.OooO00o(16);
                } else if (i9 != 2) {
                    if (i9 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    iOooO00o = o0000O0.OooO00o(-16);
                }
                int iM1437getYimpl11 = (int) Offset.m1437getYimpl(j2);
                if (z3) {
                    iM3924getHeightimpl = IntSize.m3924getHeightimpl(j);
                } else {
                    iM3924getHeightimpl = -IntSize.m3924getHeightimpl(((IntSize) mutableState.getValue()).getPackedValue());
                }
                AndroidPopup_androidKt.m4004PopupK5zGePQ(alignment11, IntOffsetKt.IntOffset(iOooO00o, o0000O0.OooO00o(stateAnimateFloat11.getValue().floatValue()) + iM1437getYimpl11 + iM3924getHeightimpl), null, new PopupProperties(false, false, false, null, false, false, 8, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -714545303, true, new OooO00o(mutableState, beatGuideAlignment2, j2, j, z3, message, onRequestDismiss, i111)), composerStartRestartGroup, 27648, 4);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                beatGuideAlignment3 = beatGuideAlignment2;
                z4 = z3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(message, j, j2, z4, beatGuideAlignment3, onRequestDismiss, i, i2));
        }
        i3 |= 24576;
        beatGuideAlignment2 = beatGuideAlignment;
        if ((i2 & 32) != 0) {
            if ((i & 458752) == 0) {
                if (composerStartRestartGroup.changedInstance(onRequestDismiss)) {
                    i6 = 131072;
                } else {
                    i6 = 65536;
                }
            }
            if ((i3 & 374491) == 74898) {
                if (i10 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (i4 != 0) {
                    beatGuideAlignment2 = BeatGuideAlignment.Start;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-188586516, i3, -1, "com.yalla.yalla.ui.composable.common.BastGuidePopup.GuidePopup (BastGuidePopup.kt:66)");
                }
                int[] iArr12 = OooO0OO.$EnumSwitchMapping$0;
                i7 = iArr12[beatGuideAlignment2.ordinal()];
                if (i7 == 1) {
                    topStart = Alignment.INSTANCE.getTopStart();
                } else if (i7 == 2) {
                    topStart = Alignment.INSTANCE.getTopCenter();
                } else {
                    if (i7 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    topStart = Alignment.INSTANCE.getTopEnd();
                }
                Alignment alignment12 = topStart;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                iOooO00o = 0;
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    i8 = 2;
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntSize.m3917boximpl(IntSizeKt.IntSize(0, 0)), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    i8 = 2;
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue;
                int i112 = i3;
                State<Float> stateAnimateFloat12 = InfiniteTransitionKt.animateFloat(InfiniteTransitionKt.rememberInfiniteTransition(null, composerStartRestartGroup, 0, 1), 0.0f, 8.0f, AnimationSpecKt.m81infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(500, 0, EasingKt.getLinearEasing(), i8, null), RepeatMode.Reverse, 0L, 4, null), null, composerStartRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9), 8);
                i9 = iArr12[beatGuideAlignment2.ordinal()];
                if (i9 == 1) {
                    iOooO00o = o0000O0.OooO00o(16);
                } else if (i9 != 2) {
                    if (i9 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    iOooO00o = o0000O0.OooO00o(-16);
                }
                int iM1437getYimpl12 = (int) Offset.m1437getYimpl(j2);
                if (z3) {
                    iM3924getHeightimpl = IntSize.m3924getHeightimpl(j);
                } else {
                    iM3924getHeightimpl = -IntSize.m3924getHeightimpl(((IntSize) mutableState.getValue()).getPackedValue());
                }
                AndroidPopup_androidKt.m4004PopupK5zGePQ(alignment12, IntOffsetKt.IntOffset(iOooO00o, o0000O0.OooO00o(stateAnimateFloat12.getValue().floatValue()) + iM1437getYimpl12 + iM3924getHeightimpl), null, new PopupProperties(false, false, false, null, false, false, 8, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -714545303, true, new OooO00o(mutableState, beatGuideAlignment2, j2, j, z3, message, onRequestDismiss, i112)), composerStartRestartGroup, 27648, 4);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                beatGuideAlignment3 = beatGuideAlignment2;
                z4 = z3;
            } else {
                if (i10 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (i4 != 0) {
                    beatGuideAlignment2 = BeatGuideAlignment.Start;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-188586516, i3, -1, "com.yalla.yalla.ui.composable.common.BastGuidePopup.GuidePopup (BastGuidePopup.kt:66)");
                }
                int[] iArr13 = OooO0OO.$EnumSwitchMapping$0;
                i7 = iArr13[beatGuideAlignment2.ordinal()];
                if (i7 == 1) {
                    topStart = Alignment.INSTANCE.getTopStart();
                } else if (i7 == 2) {
                    topStart = Alignment.INSTANCE.getTopCenter();
                } else {
                    if (i7 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    topStart = Alignment.INSTANCE.getTopEnd();
                }
                Alignment alignment13 = topStart;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                iOooO00o = 0;
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    i8 = 2;
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntSize.m3917boximpl(IntSizeKt.IntSize(0, 0)), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    i8 = 2;
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue;
                int i113 = i3;
                State<Float> stateAnimateFloat13 = InfiniteTransitionKt.animateFloat(InfiniteTransitionKt.rememberInfiniteTransition(null, composerStartRestartGroup, 0, 1), 0.0f, 8.0f, AnimationSpecKt.m81infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(500, 0, EasingKt.getLinearEasing(), i8, null), RepeatMode.Reverse, 0L, 4, null), null, composerStartRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9), 8);
                i9 = iArr13[beatGuideAlignment2.ordinal()];
                if (i9 == 1) {
                    iOooO00o = o0000O0.OooO00o(16);
                } else if (i9 != 2) {
                    if (i9 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    iOooO00o = o0000O0.OooO00o(-16);
                }
                int iM1437getYimpl13 = (int) Offset.m1437getYimpl(j2);
                if (z3) {
                    iM3924getHeightimpl = IntSize.m3924getHeightimpl(j);
                } else {
                    iM3924getHeightimpl = -IntSize.m3924getHeightimpl(((IntSize) mutableState.getValue()).getPackedValue());
                }
                AndroidPopup_androidKt.m4004PopupK5zGePQ(alignment13, IntOffsetKt.IntOffset(iOooO00o, o0000O0.OooO00o(stateAnimateFloat13.getValue().floatValue()) + iM1437getYimpl13 + iM3924getHeightimpl), null, new PopupProperties(false, false, false, null, false, false, 8, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -714545303, true, new OooO00o(mutableState, beatGuideAlignment2, j2, j, z3, message, onRequestDismiss, i113)), composerStartRestartGroup, 27648, 4);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                beatGuideAlignment3 = beatGuideAlignment2;
                z4 = z3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(message, j, j2, z4, beatGuideAlignment3, onRequestDismiss, i, i2));
        }
        i6 = 196608;
        i3 |= i6;
        if ((i3 & 374491) == 74898) {
            if (i10 != 0) {
                z3 = true;
            } else {
                z3 = z2;
            }
            if (i4 != 0) {
                beatGuideAlignment2 = BeatGuideAlignment.Start;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-188586516, i3, -1, "com.yalla.yalla.ui.composable.common.BastGuidePopup.GuidePopup (BastGuidePopup.kt:66)");
            }
            int[] iArr14 = OooO0OO.$EnumSwitchMapping$0;
            i7 = iArr14[beatGuideAlignment2.ordinal()];
            if (i7 == 1) {
                topStart = Alignment.INSTANCE.getTopStart();
            } else if (i7 == 2) {
                topStart = Alignment.INSTANCE.getTopCenter();
            } else {
                if (i7 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                topStart = Alignment.INSTANCE.getTopEnd();
            }
            Alignment alignment14 = topStart;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            iOooO00o = 0;
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                i8 = 2;
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntSize.m3917boximpl(IntSizeKt.IntSize(0, 0)), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                i8 = 2;
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableState = (MutableState) objRememberedValue;
            int i114 = i3;
            State<Float> stateAnimateFloat14 = InfiniteTransitionKt.animateFloat(InfiniteTransitionKt.rememberInfiniteTransition(null, composerStartRestartGroup, 0, 1), 0.0f, 8.0f, AnimationSpecKt.m81infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(500, 0, EasingKt.getLinearEasing(), i8, null), RepeatMode.Reverse, 0L, 4, null), null, composerStartRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9), 8);
            i9 = iArr14[beatGuideAlignment2.ordinal()];
            if (i9 == 1) {
                iOooO00o = o0000O0.OooO00o(16);
            } else if (i9 != 2) {
                if (i9 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                iOooO00o = o0000O0.OooO00o(-16);
            }
            int iM1437getYimpl14 = (int) Offset.m1437getYimpl(j2);
            if (z3) {
                iM3924getHeightimpl = IntSize.m3924getHeightimpl(j);
            } else {
                iM3924getHeightimpl = -IntSize.m3924getHeightimpl(((IntSize) mutableState.getValue()).getPackedValue());
            }
            AndroidPopup_androidKt.m4004PopupK5zGePQ(alignment14, IntOffsetKt.IntOffset(iOooO00o, o0000O0.OooO00o(stateAnimateFloat14.getValue().floatValue()) + iM1437getYimpl14 + iM3924getHeightimpl), null, new PopupProperties(false, false, false, null, false, false, 8, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -714545303, true, new OooO00o(mutableState, beatGuideAlignment2, j2, j, z3, message, onRequestDismiss, i114)), composerStartRestartGroup, 27648, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            beatGuideAlignment3 = beatGuideAlignment2;
            z4 = z3;
        } else {
            if (i10 != 0) {
                z3 = true;
            } else {
                z3 = z2;
            }
            if (i4 != 0) {
                beatGuideAlignment2 = BeatGuideAlignment.Start;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-188586516, i3, -1, "com.yalla.yalla.ui.composable.common.BastGuidePopup.GuidePopup (BastGuidePopup.kt:66)");
            }
            int[] iArr15 = OooO0OO.$EnumSwitchMapping$0;
            i7 = iArr15[beatGuideAlignment2.ordinal()];
            if (i7 == 1) {
                topStart = Alignment.INSTANCE.getTopStart();
            } else if (i7 == 2) {
                topStart = Alignment.INSTANCE.getTopCenter();
            } else {
                if (i7 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                topStart = Alignment.INSTANCE.getTopEnd();
            }
            Alignment alignment15 = topStart;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            iOooO00o = 0;
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                i8 = 2;
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntSize.m3917boximpl(IntSizeKt.IntSize(0, 0)), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                i8 = 2;
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableState = (MutableState) objRememberedValue;
            int i115 = i3;
            State<Float> stateAnimateFloat15 = InfiniteTransitionKt.animateFloat(InfiniteTransitionKt.rememberInfiniteTransition(null, composerStartRestartGroup, 0, 1), 0.0f, 8.0f, AnimationSpecKt.m81infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(500, 0, EasingKt.getLinearEasing(), i8, null), RepeatMode.Reverse, 0L, 4, null), null, composerStartRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9), 8);
            i9 = iArr15[beatGuideAlignment2.ordinal()];
            if (i9 == 1) {
                iOooO00o = o0000O0.OooO00o(16);
            } else if (i9 != 2) {
                if (i9 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                iOooO00o = o0000O0.OooO00o(-16);
            }
            int iM1437getYimpl15 = (int) Offset.m1437getYimpl(j2);
            if (z3) {
                iM3924getHeightimpl = IntSize.m3924getHeightimpl(j);
            } else {
                iM3924getHeightimpl = -IntSize.m3924getHeightimpl(((IntSize) mutableState.getValue()).getPackedValue());
            }
            AndroidPopup_androidKt.m4004PopupK5zGePQ(alignment15, IntOffsetKt.IntOffset(iOooO00o, o0000O0.OooO00o(stateAnimateFloat15.getValue().floatValue()) + iM1437getYimpl15 + iM3924getHeightimpl), null, new PopupProperties(false, false, false, null, false, false, 8, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -714545303, true, new OooO00o(mutableState, beatGuideAlignment2, j2, j, z3, message, onRequestDismiss, i115)), composerStartRestartGroup, 27648, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            beatGuideAlignment3 = beatGuideAlignment2;
            z4 = z3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(message, j, j2, z4, beatGuideAlignment3, onRequestDismiss, i, i2));
    }
}
