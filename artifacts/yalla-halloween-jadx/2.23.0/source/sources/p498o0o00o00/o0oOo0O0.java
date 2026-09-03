package p498o0o00o00;

import androidx.compose.animation.OooOO0;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OooOO0O;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.OooOOO;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import com.code.android.util.o0O0O00;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p150o00Oo0oO.o00000OO;
import p408o0Oo0o0O.o00Oo0;
import p411o0Oo0oO0.oo0o0Oo;
import p469o0OoooOO.o0oO0O0o;
import p584o0oOooO0.oO00OOO;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nRoomMenuChangeManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomMenuChangeManager.kt\ncom/yalla/yalla/ui/activity/room/live/tips/RoomMenuChangeManager\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 9 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 10 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,143:1\n76#2:144\n76#2:146\n1#3:145\n72#4,6:147\n78#4:181\n76#4,2:226\n78#4:256\n82#4:261\n82#4:324\n78#5,11:153\n78#5,11:193\n78#5,11:228\n91#5:260\n91#5:265\n78#5,11:282\n91#5:318\n91#5:323\n456#6,8:164\n464#6,3:178\n456#6,8:204\n464#6,3:218\n456#6,8:239\n464#6,3:253\n467#6,3:257\n467#6,3:262\n456#6,8:293\n464#6,3:307\n467#6,3:315\n467#6,3:320\n4144#7,6:172\n4144#7,6:212\n4144#7,6:247\n4144#7,6:301\n154#8:182\n154#8:183\n154#8:184\n154#8:185\n154#8:186\n154#8:222\n154#8:223\n154#8:224\n154#8:225\n154#8:267\n154#8:311\n154#8:312\n154#8:313\n154#8:314\n73#9,6:187\n79#9:221\n83#9:266\n74#9,5:277\n79#9:310\n83#9:319\n75#10:268\n51#10,8:269\n*S KotlinDebug\n*F\n+ 1 RoomMenuChangeManager.kt\ncom/yalla/yalla/ui/activity/room/live/tips/RoomMenuChangeManager\n*L\n46#1:144\n48#1:146\n52#1:147,6\n52#1:181\n83#1:226,2\n83#1:256\n83#1:261\n52#1:324\n52#1:153,11\n66#1:193,11\n83#1:228,11\n83#1:260\n66#1:265\n116#1:282,11\n116#1:318\n52#1:323\n52#1:164,8\n52#1:178,3\n66#1:204,8\n66#1:218,3\n83#1:239,8\n83#1:253,3\n83#1:257,3\n66#1:262,3\n116#1:293,8\n116#1:307,3\n116#1:315,3\n52#1:320,3\n52#1:172,6\n66#1:212,6\n83#1:247,6\n116#1:301,6\n62#1:182\n63#1:183\n68#1:184\n69#1:185\n72#1:186\n81#1:222\n86#1:223\n87#1:224\n88#1:225\n106#1:267\n122#1:311\n123#1:312\n124#1:313\n127#1:314\n66#1:187,6\n66#1:221\n66#1:266\n116#1:277,5\n116#1:310\n116#1:319\n114#1:268\n114#1:269,8\n*E\n"})
public final class o0oOo0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o0oOo0O0 f49337OooO00o = new o0oOo0O0();

    public static final class OooO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ p489o0o00OO0.OooO0o f49339OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Modifier f49340OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f49341OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(Modifier modifier, p489o0o00OO0.OooO0o oooO0o, int i) {
            super(2);
            this.f49340OooO0o0 = modifier;
            this.f49339OooO0o = oooO0o;
            this.f49341OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f49341OooO0oO | 1);
            Modifier modifier = this.f49340OooO0o0;
            p489o0o00OO0.OooO0o oooO0o = this.f49339OooO0o;
            o0oOo0O0.this.OooO00o(modifier, oooO0o, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ p489o0o00OO0.OooO0o f49343OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Modifier f49344OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f49345OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Modifier modifier, p489o0o00OO0.OooO0o oooO0o, int i) {
            super(2);
            this.f49344OooO0o0 = modifier;
            this.f49343OooO0o = oooO0o;
            this.f49345OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f49345OooO0oO | 1);
            Modifier modifier = this.f49344OooO0o0;
            p489o0o00OO0.OooO0o oooO0o = this.f49343OooO0o;
            o0oOo0O0.this.OooO00o(modifier, oooO0o, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ p489o0o00OO0.OooO0o f49347OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Modifier f49348OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f49349OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(Modifier modifier, p489o0o00OO0.OooO0o oooO0o, int i) {
            super(2);
            this.f49348OooO0o0 = modifier;
            this.f49347OooO0o = oooO0o;
            this.f49349OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f49349OooO0oO | 1);
            Modifier modifier = this.f49348OooO0o0;
            p489o0o00OO0.OooO0o oooO0o = this.f49347OooO0o;
            o0oOo0O0.this.OooO00o(modifier, oooO0o, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0OO f49350OooO0Oo = new OooO0OO();

        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            com.yalla.yalla.service.room.OooO00o.f24991OooOo0.f47431OooO00o.setValue(Boolean.FALSE);
            o00Oo0.OooO0o0().OooOOo0();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ p489o0o00OO0.OooO0o f49352OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Modifier f49353OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f49354OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(Modifier modifier, p489o0o00OO0.OooO0o oooO0o, int i) {
            super(2);
            this.f49353OooO0o0 = modifier;
            this.f49352OooO0o = oooO0o;
            this.f49354OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f49354OooO0oO | 1);
            Modifier modifier = this.f49353OooO0o0;
            p489o0o00OO0.OooO0o oooO0o = this.f49352OooO0o;
            o0oOo0O0.this.OooO00o(modifier, oooO0o, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO00o(@NotNull Modifier modifier, @NotNull p489o0o00OO0.OooO0o dataMedium, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(dataMedium, "dataMedium");
        Composer composerStartRestartGroup = composer.startRestartGroup(1991657800);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1991657800, i, -1, "com.yalla.yalla.ui.activity.room.live.tips.RoomMenuChangeManager.Content (RoomMenuChangeManager.kt:32)");
        }
        if (!((Boolean) com.yalla.yalla.service.room.OooO00o.f24991OooOo0.f47431OooO00o.getValue()).booleanValue()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO00o(modifier, dataMedium, i));
            return;
        }
        Pair pair = (Pair) LiveDataAdapterKt.observeAsState(dataMedium.f48482OooO00o, composerStartRestartGroup, 8).getValue();
        if (pair == null) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup2 == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup2.updateScope(new OooO(modifier, dataMedium, i));
            return;
        }
        if (((Number) pair.getFirst()).intValue() <= 0 || ((Number) pair.getSecond()).intValue() <= 0) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup3 = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup3 == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup3.updateScope(new OooO0O0(modifier, dataMedium, i));
            return;
        }
        float fMo321toDpu2uoSUM = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo321toDpu2uoSUM(((Number) pair.getSecond()).intValue());
        float fMo321toDpu2uoSUM2 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo321toDpu2uoSUM(((Number) pair.getFirst()).intValue());
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion.then(modifier), 0.0f, 1, null);
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        Arrangement arrangement = Arrangement.INSTANCE;
        Arrangement.Vertical top = arrangement.getTop();
        Alignment.Companion companion2 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyOooO00o = androidx.compose.material.OooO0o.OooO00o(companion2, top, composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
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
        OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        ImageKt.Image(PainterResources_androidKt.painterResource(oO00OOO.room_menu_change_wan_logo, composerStartRestartGroup, 0), (String) null, SizeKt.m523size3ABfNKs(PaddingKt.m480paddingqDBjuR0$default(companion, Dp.m3765constructorimpl(69), 0.0f, 0.0f, 0.0f, 14, null), Dp.m3765constructorimpl(77)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 440, 120);
        float f = 12;
        Modifier modifierClip = ClipKt.clip(SizeKt.m528width3ABfNKs(companion, Dp.m3765constructorimpl(269)), RoundedCornerShapeKt.m728RoundedCornerShapea9UjIt4(Dp.m3765constructorimpl(f), Dp.m3765constructorimpl(f), Dp.m3765constructorimpl(f), Dp.m3765constructorimpl(f)));
        long j = o0oO0O0o.f46994OoooOoO;
        Modifier modifierM476padding3ABfNKs = PaddingKt.m476padding3ABfNKs(columnScopeInstance.align(BackgroundKt.m169backgroundbw27NRU$default(modifierClip, j, null, 2, null), companion2.getCenterHorizontally()), Dp.m3765constructorimpl(f));
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyOooO00o2 = OooOOO.OooO00o(companion2, arrangement.getStart(), composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM476padding3ABfNKs);
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
        Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl2, measurePolicyOooO00o2, composerM1309constructorimpl2, currentCompositionLocalMap2);
        if (composerM1309constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
        }
        OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        String strStringResource = StringResources_androidKt.stringResource(oO00OOo0.room_menu_change_tips_warn, composerStartRestartGroup, 0);
        Modifier modifierOooO00o = OooOO0O.OooO00o(rowScopeInstance, companion, 1.0f, false, 2, null);
        long sp = TextUnitKt.getSp(12);
        long j2 = o0oO0O0o.f46946OooO0O0;
        TextKt.m1251Text4IGK_g(strStringResource, modifierOooO00o, j2, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3072, 0, 131056);
        com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f), null, composerStartRestartGroup, 6, 2);
        float f2 = 4;
        Modifier modifierAlign = rowScopeInstance.align(PaddingKt.m477paddingVpY3zN4(SizeKt.m511heightInVpY3zN4$default(SizeKt.m530widthInVpY3zN4$default(BackgroundKt.m169backgroundbw27NRU$default(ClipKt.clip(companion, RoundedCornerShapeKt.getCircleShape()), j2, null, 2, null), Dp.m3765constructorimpl(46), 0.0f, 2, null), Dp.m3765constructorimpl(23), 0.0f, 2, null), Dp.m3765constructorimpl(6), Dp.m3765constructorimpl(f2)), companion2.getCenterVertically());
        Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
        Arrangement.HorizontalOrVertical center = arrangement.getCenter();
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, composerStartRestartGroup, 54);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierAlign);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor3);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM1309constructorimpl3 = Updater.m1309constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl3, measurePolicyColumnMeasurePolicy, composerM1309constructorimpl3, currentCompositionLocalMap3);
        if (composerM1309constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash3, composerM1309constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
        }
        OooOO0.OooO00o(0, function3ModifierMaterializerOf3, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        TextKt.m1251Text4IGK_g(StringResources_androidKt.stringResource(oO00OOo0.OK, composerStartRestartGroup, 0), o0O0O00.OooO0O0(companion, false, false, 0L, false, null, null, null, OooO0OO.f49350OooO0Oo, 253), j, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3664boximpl(TextAlign.INSTANCE.m3671getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3072, 0, 130544);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        float fM3765constructorimpl = Dp.m3765constructorimpl(f);
        boolean z = oo0o0Oo.OooO0O0(composerStartRestartGroup) && !p591o0oo000O.OooO.OooO0o0();
        float f3 = 2;
        float fM3765constructorimpl2 = Dp.m3765constructorimpl(Dp.m3765constructorimpl(Dp.m3765constructorimpl(fMo321toDpu2uoSUM / f3) + fMo321toDpu2uoSUM2) - Dp.m3765constructorimpl(fM3765constructorimpl / f3));
        Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
        Arrangement.Horizontal start = z ? arrangement.getStart() : arrangement.getEnd();
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyOooO00o3 = OooOOO.OooO00o(companion2, start, composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor4 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default2);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor4);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM1309constructorimpl4 = Updater.m1309constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o4 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl4, measurePolicyOooO00o3, composerM1309constructorimpl4, currentCompositionLocalMap4);
        if (composerM1309constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash4, composerM1309constructorimpl4, currentCompositeKeyHash4, function2OooO00o4);
        }
        OooOO0.OooO00o(0, function3ModifierMaterializerOf4, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        Painter painterPainterResource = PainterResources_androidKt.painterResource(oO00OOO.room_menu_change_wan_arrow, composerStartRestartGroup, 0);
        float fM3765constructorimpl3 = z ? fM3765constructorimpl2 : Dp.m3765constructorimpl(0);
        float fM3765constructorimpl4 = Dp.m3765constructorimpl(f2);
        if (z) {
            fM3765constructorimpl2 = Dp.m3765constructorimpl(0);
        }
        ImageKt.Image(painterPainterResource, (String) null, SizeKt.m509height3ABfNKs(SizeKt.m528width3ABfNKs(PaddingKt.m480paddingqDBjuR0$default(companion, fM3765constructorimpl3, 0.0f, fM3765constructorimpl2, fM3765constructorimpl4, 2, null), fM3765constructorimpl), Dp.m3765constructorimpl(5)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
        if (o00000OO.OooO00o(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup4 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup4 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup4.updateScope(new OooO0o(modifier, dataMedium, i));
    }
}
