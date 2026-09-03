package p509o0o0O0;

import androidx.compose.animation.OooO0O0;
import androidx.compose.animation.OooOO0;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.OooOO0O;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.OooO;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import com.code.android.util.o0000O;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;
import p469o0OoooOO.o0oO0O0o;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nMomentVideoPlaybackTimes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentVideoPlaybackTimes.kt\ncom/yalla/yalla/ui/composable/moment/MomentVideoPlaybackTimesKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,52:1\n154#2:53\n154#2:89\n154#2:90\n154#2:91\n73#3,6:54\n79#3:88\n83#3:96\n78#4,11:60\n91#4:95\n456#5,8:71\n464#5,3:85\n467#5,3:92\n4144#6,6:79\n*S KotlinDebug\n*F\n+ 1 MomentVideoPlaybackTimes.kt\ncom/yalla/yalla/ui/composable/moment/MomentVideoPlaybackTimesKt\n*L\n31#1:53\n39#1:89\n40#1:90\n49#1:91\n27#1:54,6\n27#1:88\n27#1:96\n27#1:60,11\n27#1:95\n27#1:71,8\n27#1:85,3\n27#1:92,3\n27#1:79,6\n*E\n"})
public final class o0O00O {
    /* JADX WARN: Code duplicated, block: B:30:0x0056 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    /* JADX WARN: Code duplicated, block: B:32:0x005c  */
    /* JADX WARN: Code duplicated, block: B:35:0x0063  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:41:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:50:0x0197  */
    /* JADX WARN: Code duplicated, block: B:54:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(int i, int i2, int i3, @Nullable Composer composer, @Nullable Modifier modifier) {
        int i4;
        Modifier modifier2;
        Modifier modifier3;
        int currentCompositeKeyHash;
        Function0<ComposeUiNode> constructor;
        Composer composerM1309constructorimpl;
        Function2 function2OooO00o;
        Modifier modifier4;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(935869766);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i5 = i3 & 2;
        if (i5 == 0) {
            if ((i2 & 112) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i4 & 91) == 18 || !composerStartRestartGroup.getSkipping()) {
                if (i5 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(935869766, i2, -1, "com.yalla.yalla.ui.composable.moment.MomentVideoPlaybackTimes (MomentVideoPlaybackTimes.kt:22)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierM509height3ABfNKs = SizeKt.m509height3ABfNKs(SizeKt.fillMaxWidth$default(companion.then(modifier3), 0.0f, 1, null), Dp.m3765constructorimpl(56));
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
                Painter painterPainterResource = PainterResources_androidKt.painterResource(oOo00OO0.icv_video_play_times, composerStartRestartGroup, 0);
                int i6 = o0oO0O0o.f47152o00OOOo;
                long j = o0oO0O0o.f46953OooOO0;
                IconKt.m1103Iconww6aTOc(painterPainterResource, (String) null, SizeKt.m523size3ABfNKs(PaddingKt.m480paddingqDBjuR0$default(companion, Dp.m3765constructorimpl(14), 0.0f, 0.0f, 0.0f, 14, null), Dp.m3765constructorimpl(24)), j, composerStartRestartGroup, 440, 0);
                String strOooO00o = o0000O.OooO00o(StringResources_androidKt.stringResource(oO00OOo0.x_playback_times, composerStartRestartGroup, 0), String.valueOf(i));
                modifier4 = modifier3;
                long sp = TextUnitKt.getSp(14);
                Modifier modifierM478paddingVpY3zN4$default = PaddingKt.m478paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(OooOO0O.OooO00o(rowScopeInstance, companion, 1.0f, false, 2, null), 0.0f, 1, null), Dp.m3765constructorimpl(8), 0.0f, 2, null);
                composer2 = composerStartRestartGroup;
                TextKt.m1251Text4IGK_g(strOooO00o, modifierM478paddingVpY3zN4$default, j, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 131056);
                if (androidx.compose.material.OooOO0.OooO0O0(composer2)) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new o0O00O0o(i, modifier4, i2, i3));
        }
        i4 |= 48;
        modifier2 = modifier;
        if ((i4 & 91) == 18) {
            if (i5 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(935869766, i2, -1, "com.yalla.yalla.ui.composable.moment.MomentVideoPlaybackTimes (MomentVideoPlaybackTimes.kt:22)");
            }
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier modifierM509height3ABfNKs2 = SizeKt.m509height3ABfNKs(SizeKt.fillMaxWidth$default(companion3.then(modifier3), 0.0f, 1, null), Dp.m3765constructorimpl(56));
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
            Painter painterPainterResource2 = PainterResources_androidKt.painterResource(oOo00OO0.icv_video_play_times, composerStartRestartGroup, 0);
            int i7 = o0oO0O0o.f47152o00OOOo;
            long j2 = o0oO0O0o.f46953OooOO0;
            IconKt.m1103Iconww6aTOc(painterPainterResource2, (String) null, SizeKt.m523size3ABfNKs(PaddingKt.m480paddingqDBjuR0$default(companion3, Dp.m3765constructorimpl(14), 0.0f, 0.0f, 0.0f, 14, null), Dp.m3765constructorimpl(24)), j2, composerStartRestartGroup, 440, 0);
            String strOooO00o2 = o0000O.OooO00o(StringResources_androidKt.stringResource(oO00OOo0.x_playback_times, composerStartRestartGroup, 0), String.valueOf(i));
            modifier4 = modifier3;
            long sp2 = TextUnitKt.getSp(14);
            Modifier modifierM478paddingVpY3zN4$default2 = PaddingKt.m478paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(OooOO0O.OooO00o(rowScopeInstance2, companion3, 1.0f, false, 2, null), 0.0f, 1, null), Dp.m3765constructorimpl(8), 0.0f, 2, null);
            composer2 = composerStartRestartGroup;
            TextKt.m1251Text4IGK_g(strOooO00o2, modifierM478paddingVpY3zN4$default2, j2, sp2, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 131056);
            if (androidx.compose.material.OooOO0.OooO0O0(composer2)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            if (i5 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(935869766, i2, -1, "com.yalla.yalla.ui.composable.moment.MomentVideoPlaybackTimes (MomentVideoPlaybackTimes.kt:22)");
            }
            Modifier.Companion companion5 = Modifier.INSTANCE;
            Modifier modifierM509height3ABfNKs3 = SizeKt.m509height3ABfNKs(SizeKt.fillMaxWidth$default(companion5.then(modifier3), 0.0f, 1, null), Dp.m3765constructorimpl(56));
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
            Painter painterPainterResource3 = PainterResources_androidKt.painterResource(oOo00OO0.icv_video_play_times, composerStartRestartGroup, 0);
            int i8 = o0oO0O0o.f47152o00OOOo;
            long j3 = o0oO0O0o.f46953OooOO0;
            IconKt.m1103Iconww6aTOc(painterPainterResource3, (String) null, SizeKt.m523size3ABfNKs(PaddingKt.m480paddingqDBjuR0$default(companion5, Dp.m3765constructorimpl(14), 0.0f, 0.0f, 0.0f, 14, null), Dp.m3765constructorimpl(24)), j3, composerStartRestartGroup, 440, 0);
            String strOooO00o3 = o0000O.OooO00o(StringResources_androidKt.stringResource(oO00OOo0.x_playback_times, composerStartRestartGroup, 0), String.valueOf(i));
            modifier4 = modifier3;
            long sp3 = TextUnitKt.getSp(14);
            Modifier modifierM478paddingVpY3zN4$default3 = PaddingKt.m478paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(OooOO0O.OooO00o(rowScopeInstance3, companion5, 1.0f, false, 2, null), 0.0f, 1, null), Dp.m3765constructorimpl(8), 0.0f, 2, null);
            composer2 = composerStartRestartGroup;
            TextKt.m1251Text4IGK_g(strOooO00o3, modifierM478paddingVpY3zN4$default3, j3, sp3, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 131056);
            if (androidx.compose.material.OooOO0.OooO0O0(composer2)) {
                ComposerKt.traceEventEnd();
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o0O00O0o(i, modifier4, i2, i3));
    }
}
