package p518o0o0O0o0;

import android.content.Context;
import androidx.compose.animation.OooO0O0;
import androidx.compose.animation.OooOO0;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.OooOO0O;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.OooO;
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
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import com.code.android.util.o0000;
import com.code.android.util.o0000O0;
import com.code.android.util.o0O0O00;
import java.text.DecimalFormat;
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
import p469o0OoooOO.o0oO0O0o;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nStoreComp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StoreComp.kt\ncom/yalla/yalla/ui/composable/store/StoreComp\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 8 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,69:1\n154#2:70\n154#2:106\n154#2:107\n154#2:108\n154#2:110\n154#2:111\n73#3,6:71\n79#3:105\n83#3:116\n78#4,11:77\n91#4:115\n456#5,8:88\n464#5,3:102\n467#5,3:112\n25#5:117\n36#5:124\n4144#6,6:96\n76#7:109\n1097#8,6:118\n1097#8,6:125\n*S KotlinDebug\n*F\n+ 1 StoreComp.kt\ncom/yalla/yalla/ui/composable/store/StoreComp\n*L\n33#1:70\n35#1:106\n39#1:107\n41#1:108\n51#1:110\n53#1:111\n29#1:71,6\n29#1:105\n29#1:116\n29#1:77,11\n29#1:115\n29#1:88,8\n29#1:102,3\n29#1:112,3\n59#1:117\n60#1:124\n29#1:96,6\n44#1:109\n59#1:118,6\n60#1:125,6\n*E\n"})
public final class o00000O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o00000O0 f52147OooO00o = new o00000O0();

    public static final class OooO00o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f52149OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ long f52150OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f52151OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f52152OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(long j, int i, int i2, int i3) {
            super(2);
            this.f52150OooO0o0 = j;
            this.f52149OooO0o = i;
            this.f52151OooO0oO = i2;
            this.f52152OooO0oo = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            o00000O0.this.OooO0O0(this.f52150OooO0o0, this.f52149OooO0o, composer, RecomposeScopeImplKt.updateChangedFlags(this.f52151OooO0oO | 1), this.f52152OooO0oo);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0058 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x005a  */
    /* JADX WARN: Code duplicated, block: B:32:0x005e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0065  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:50:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:55:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:57:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO00o(int i, int i2, long j, @Nullable Composer composer, @Nullable Modifier modifier) {
        int i3;
        Modifier modifier2;
        int i4;
        Modifier modifier3;
        int currentCompositeKeyHash;
        Function0<ComposeUiNode> constructor;
        Composer composerM1309constructorimpl;
        Function2 function2OooO00o;
        Composer composer2;
        Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-70014505);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = i | (composerStartRestartGroup.changed(j) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 112) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i3;
            if ((i4 & 91) == 18 || !composerStartRestartGroup.getSkipping()) {
                if (i5 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-70014505, i4, -1, "com.yalla.yalla.ui.composable.store.StoreComp.CoinAndRecharge (StoreComp.kt:27)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierM509height3ABfNKs = SizeKt.m509height3ABfNKs(SizeKt.fillMaxWidth$default(companion.then(modifier3), 0.0f, 1, null), Dp.m3765constructorimpl(50));
                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                composerStartRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyOooO00o = OooO.OooO00o(Arrangement.INSTANCE, centerVertically, composerStartRestartGroup, 48, -1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                constructor = companion2.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM509height3ABfNKs);
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
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion2, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
                if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(15), null, composerStartRestartGroup, 6, 2);
                Modifier modifier5 = modifier3;
                ImageKt.Image(PainterResources_androidKt.painterResource(oOo00OO0.coin, composerStartRestartGroup, 0), (String) null, SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(21)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 440, 120);
                com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(5), null, composerStartRestartGroup, 6, 2);
                f52147OooO00o.OooO0O0(j, 0, composerStartRestartGroup, (i4 & 14) | 384, 2);
                SpacerKt.Spacer(OooOO0O.OooO00o(rowScopeInstance, companion, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                String strOooO0OO = o0000.OooO0OO(oO00OOo0.Recharge_);
                long jOooO0OO = o0000O0.OooO0OO(14, composerStartRestartGroup, 6);
                long j2 = o0oO0O0o.f47022o0000O0O;
                Modifier modifierM478paddingVpY3zN4$default = PaddingKt.m478paddingVpY3zN4$default(o0O0O00.OooO0O0(companion, false, false, 0L, false, null, null, null, new o000000O(context), 253), 0.0f, Dp.m3765constructorimpl(10), 1, null);
                composer2 = composerStartRestartGroup;
                TextKt.m1251Text4IGK_g(strOooO0OO, modifierM478paddingVpY3zN4$default, j2, jOooO0OO, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131056);
                com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(20), null, composer2, 6, 2);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new o00000(this, j, modifier4, i, i2));
        }
        i3 |= 48;
        modifier2 = modifier;
        i4 = i3;
        if ((i4 & 91) == 18) {
            if (i5 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-70014505, i4, -1, "com.yalla.yalla.ui.composable.store.StoreComp.CoinAndRecharge (StoreComp.kt:27)");
            }
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier modifierM509height3ABfNKs2 = SizeKt.m509height3ABfNKs(SizeKt.fillMaxWidth$default(companion3.then(modifier3), 0.0f, 1, null), Dp.m3765constructorimpl(50));
            Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyOooO00o2 = OooO.OooO00o(Arrangement.INSTANCE, centerVertically2, composerStartRestartGroup, 48, -1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            constructor = companion4.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM509height3ABfNKs2);
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
            function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion4, composerM1309constructorimpl, measurePolicyOooO00o2, composerM1309constructorimpl, currentCompositionLocalMap2);
            if (composerM1309constructorimpl.getInserting()) {
                OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            } else {
                OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(15), null, composerStartRestartGroup, 6, 2);
            Modifier modifier6 = modifier3;
            ImageKt.Image(PainterResources_androidKt.painterResource(oOo00OO0.coin, composerStartRestartGroup, 0), (String) null, SizeKt.m523size3ABfNKs(companion3, Dp.m3765constructorimpl(21)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 440, 120);
            com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(5), null, composerStartRestartGroup, 6, 2);
            f52147OooO00o.OooO0O0(j, 0, composerStartRestartGroup, (i4 & 14) | 384, 2);
            SpacerKt.Spacer(OooOO0O.OooO00o(rowScopeInstance2, companion3, 1.0f, false, 2, null), composerStartRestartGroup, 0);
            Context context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            String strOooO0OO2 = o0000.OooO0OO(oO00OOo0.Recharge_);
            long jOooO0OO2 = o0000O0.OooO0OO(14, composerStartRestartGroup, 6);
            long j3 = o0oO0O0o.f47022o0000O0O;
            Modifier modifierM478paddingVpY3zN4$default2 = PaddingKt.m478paddingVpY3zN4$default(o0O0O00.OooO0O0(companion3, false, false, 0L, false, null, null, null, new o000000O(context2), 253), 0.0f, Dp.m3765constructorimpl(10), 1, null);
            composer2 = composerStartRestartGroup;
            TextKt.m1251Text4IGK_g(strOooO0OO2, modifierM478paddingVpY3zN4$default2, j3, jOooO0OO2, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131056);
            com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(20), null, composer2, 6, 2);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier6;
        } else {
            if (i5 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-70014505, i4, -1, "com.yalla.yalla.ui.composable.store.StoreComp.CoinAndRecharge (StoreComp.kt:27)");
            }
            Modifier.Companion companion5 = Modifier.INSTANCE;
            Modifier modifierM509height3ABfNKs3 = SizeKt.m509height3ABfNKs(SizeKt.fillMaxWidth$default(companion5.then(modifier3), 0.0f, 1, null), Dp.m3765constructorimpl(50));
            Alignment.Vertical centerVertically3 = Alignment.INSTANCE.getCenterVertically();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyOooO00o3 = OooO.OooO00o(Arrangement.INSTANCE, centerVertically3, composerStartRestartGroup, 48, -1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
            constructor = companion6.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierM509height3ABfNKs3);
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
            function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion6, composerM1309constructorimpl, measurePolicyOooO00o3, composerM1309constructorimpl, currentCompositionLocalMap3);
            if (composerM1309constructorimpl.getInserting()) {
                OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            } else {
                OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            OooOO0.OooO00o(0, function3ModifierMaterializerOf3, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
            com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(15), null, composerStartRestartGroup, 6, 2);
            Modifier modifier7 = modifier3;
            ImageKt.Image(PainterResources_androidKt.painterResource(oOo00OO0.coin, composerStartRestartGroup, 0), (String) null, SizeKt.m523size3ABfNKs(companion5, Dp.m3765constructorimpl(21)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 440, 120);
            com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(5), null, composerStartRestartGroup, 6, 2);
            f52147OooO00o.OooO0O0(j, 0, composerStartRestartGroup, (i4 & 14) | 384, 2);
            SpacerKt.Spacer(OooOO0O.OooO00o(rowScopeInstance3, companion5, 1.0f, false, 2, null), composerStartRestartGroup, 0);
            Context context3 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            String strOooO0OO3 = o0000.OooO0OO(oO00OOo0.Recharge_);
            long jOooO0OO3 = o0000O0.OooO0OO(14, composerStartRestartGroup, 6);
            long j4 = o0oO0O0o.f47022o0000O0O;
            Modifier modifierM478paddingVpY3zN4$default3 = PaddingKt.m478paddingVpY3zN4$default(o0O0O00.OooO0O0(companion5, false, false, 0L, false, null, null, null, new o000000O(context3), 253), 0.0f, Dp.m3765constructorimpl(10), 1, null);
            composer2 = composerStartRestartGroup;
            TextKt.m1251Text4IGK_g(strOooO0OO3, modifierM478paddingVpY3zN4$default3, j4, jOooO0OO3, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131056);
            com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(20), null, composer2, 6, 2);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier7;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o00000(this, j, modifier4, i, i2));
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0053 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0056  */
    /* JADX WARN: Code duplicated, block: B:35:0x005d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0075  */
    /* JADX WARN: Code duplicated, block: B:41:0x0098  */
    /* JADX WARN: Code duplicated, block: B:43:0x009e  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:53:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO0O0(long j, int i, @Nullable Composer composer, int i2, int i3) {
        int i4;
        int i5;
        Object objRememberedValue;
        Composer.Companion companion;
        DecimalFormat decimalFormat;
        boolean zChanged;
        Object objRememberedValue2;
        int i6;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(674208346);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = i2 | (composerStartRestartGroup.changed(j) ? 4 : 2);
        } else {
            i4 = i2;
        }
        int i7 = i3 & 2;
        if (i7 == 0) {
            if ((i2 & 112) == 0) {
                i5 = i;
                i4 |= composerStartRestartGroup.changed(i5) ? 32 : 16;
            }
            if ((i4 & 91) == 18 || !composerStartRestartGroup.getSkipping()) {
                int i8 = i7 == 0 ? i5 : 18;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(674208346, i4, -1, "com.yalla.yalla.ui.composable.store.StoreComp.CoinText (StoreComp.kt:57)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = new DecimalFormat(",###");
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                decimalFormat = (DecimalFormat) objRememberedValue;
                Long lValueOf = Long.valueOf(j);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(lValueOf);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = decimalFormat.format(j);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                String format = (String) objRememberedValue2;
                long jOooO0OO = o0000O0.OooO0OO(i8, composerStartRestartGroup, (i4 >> 3) & 14);
                int i9 = o0oO0O0o.f47152o00OOOo;
                long j2 = o0oO0O0o.f47022o0000O0O;
                Intrinsics.checkNotNullExpressionValue(format, "format");
                int i10 = i8;
                TextKt.m1251Text4IGK_g(format, (Modifier) null, j2, jOooO0OO, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 0, 0, 131058);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                i6 = i10;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                i6 = i5;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO00o(j, i6, i2, i3));
        }
        i4 |= 48;
        i5 = i;
        if ((i4 & 91) == 18) {
            if (i7 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(674208346, i4, -1, "com.yalla.yalla.ui.composable.store.StoreComp.CoinText (StoreComp.kt:57)");
            }
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new DecimalFormat(",###");
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            decimalFormat = (DecimalFormat) objRememberedValue;
            Long lValueOf2 = Long.valueOf(j);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            zChanged = composerStartRestartGroup.changed(lValueOf2);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue2 = decimalFormat.format(j);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                objRememberedValue2 = decimalFormat.format(j);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            String format2 = (String) objRememberedValue2;
            long jOooO0OO2 = o0000O0.OooO0OO(i8, composerStartRestartGroup, (i4 >> 3) & 14);
            int i11 = o0oO0O0o.f47152o00OOOo;
            long j3 = o0oO0O0o.f47022o0000O0O;
            Intrinsics.checkNotNullExpressionValue(format2, "format");
            int i12 = i8;
            TextKt.m1251Text4IGK_g(format2, (Modifier) null, j3, jOooO0OO2, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 0, 0, 131058);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            i6 = i12;
        } else {
            if (i7 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(674208346, i4, -1, "com.yalla.yalla.ui.composable.store.StoreComp.CoinText (StoreComp.kt:57)");
            }
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new DecimalFormat(",###");
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            decimalFormat = (DecimalFormat) objRememberedValue;
            Long lValueOf3 = Long.valueOf(j);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            zChanged = composerStartRestartGroup.changed(lValueOf3);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue2 = decimalFormat.format(j);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                objRememberedValue2 = decimalFormat.format(j);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            String format3 = (String) objRememberedValue2;
            long jOooO0OO3 = o0000O0.OooO0OO(i8, composerStartRestartGroup, (i4 >> 3) & 14);
            int i13 = o0oO0O0o.f47152o00OOOo;
            long j4 = o0oO0O0o.f47022o0000O0O;
            Intrinsics.checkNotNullExpressionValue(format3, "format");
            int i14 = i8;
            TextKt.m1251Text4IGK_g(format3, (Modifier) null, j4, jOooO0OO3, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 0, 0, 131058);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            i6 = i14;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO00o(j, i6, i2, i3));
    }
}
