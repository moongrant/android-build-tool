package p650o0ooo;

import androidx.compose.animation.OooO;
import androidx.compose.animation.OooO0O0;
import androidx.compose.animation.OooOO0;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.OooO0o;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.conscrypt.PSKKeyManager;
import p022Oooo00O.o0O00oO0;
import p193o00o0O0O.o0000oo;
import p454o0Ooo000.OooOo00;
import p516o0o0O00o.o00O0O0O;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nEditDialogUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditDialogUtil.kt\ncom/yalla/yalla/ui/dialog/EditDialogUtilKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,97:1\n154#2:98\n154#2:134\n72#3,6:99\n78#3:133\n82#3:147\n78#4,11:105\n91#4:146\n456#5,8:116\n464#5,3:130\n50#5:135\n49#5:136\n467#5,3:143\n25#5:148\n4144#6,6:124\n1097#7,6:137\n1097#7,6:149\n*S KotlinDebug\n*F\n+ 1 EditDialogUtil.kt\ncom/yalla/yalla/ui/dialog/EditDialogUtilKt\n*L\n71#1:98\n76#1:134\n68#1:99,6\n68#1:133\n68#1:147\n68#1:105,11\n68#1:146\n68#1:116,8\n68#1:130,3\n79#1:135\n79#1:136\n68#1:143,3\n90#1:148\n68#1:124,6\n79#1:137,6\n90#1:149,6\n*E\n"})
public final class o00OO0O0 {
    public static final void OooO00o(String str, MutableState mutableState, int i, Composer composer, int i2) {
        int i3;
        Composer composer2;
        MutableState mutableState2;
        int i4;
        Composer composerStartRestartGroup = composer.startRestartGroup(632583027);
        if ((i2 & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= composerStartRestartGroup.changed(mutableState) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i3 |= composerStartRestartGroup.changed(i) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        int i5 = i3;
        if ((i5 & 731) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
            i4 = i;
            mutableState2 = mutableState;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(632583027, i5, -1, "com.yalla.yalla.ui.dialog.EditDialogContent (EditDialogUtil.kt:66)");
            }
            Modifier modifierOooO00o = OooOo00.OooO00o(25, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 2, null, composerStartRestartGroup, -483455358);
            MeasurePolicy measurePolicyOooO0O0 = o0O00oO0.OooO0O0(Alignment.INSTANCE, Arrangement.INSTANCE.getTop(), composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierOooO00o);
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
            Function2 function2OooO00o = OooO.OooO00o(companion, composerM1320constructorimpl, measurePolicyOooO0O0, composerM1320constructorimpl, currentCompositionLocalMap);
            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(-1730538129);
            if (str == null) {
                composer2 = composerStartRestartGroup;
            } else {
                TextKt.m1261Text4IGK_g(str, (Modifier) null, o0000oo.OooO0OO(composerStartRestartGroup).f38627OooOO0o, TextUnitKt.getSp(15), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3072, 0, 131058);
                composer2 = composerStartRestartGroup;
                com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(15), null, composer2, 6, 2);
            }
            composer2.endReplaceableGroup();
            o00O0O0O o00o0o0o2 = o00O0O0O.f51380OooO00o;
            Integer numValueOf = Integer.valueOf(i);
            int i6 = i5 & 112;
            composer2.startReplaceableGroup(511388516);
            mutableState2 = mutableState;
            boolean zChanged = composer2.changed(numValueOf) | composer2.changed(mutableState2);
            Object objRememberedValue = composer2.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                i4 = i;
                objRememberedValue = new o00OO000(mutableState2, i4);
                composer2.updateRememberedValue(objRememberedValue);
            } else {
                i4 = i;
            }
            composer2.endReplaceableGroup();
            o00o0o0o2.OooO00o(null, mutableState, null, (Function1) objRememberedValue, composer2, i6 | 24576, 5);
            if (OooO0o.OooO00o(composer2)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o00OO00O(str, mutableState2, i4, i2));
    }
}
