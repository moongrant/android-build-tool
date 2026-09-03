package p519o0o0O0oO;

import OooOo.OooO0o;
import androidx.compose.animation.OooO;
import androidx.compose.animation.OooO0O0;
import androidx.compose.animation.OooOO0;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.OooOOO0;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
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
import com.facebook.OooOo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import p150o00Oo0oO.o00000O;
import p154o00OoO00.OooOo00;
import p469o0OoooOO.o0oO0O0o;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nOldLoadingDialogCompose.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OldLoadingDialogCompose.kt\ncom/yalla/yalla/ui/dialog/OldLoadingDialogComposeKt$OldLoadingDialogCompose$2\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,55:1\n154#2:56\n154#2:57\n154#2:58\n154#2:101\n154#2:102\n154#2:103\n72#3,6:59\n78#3:93\n82#3:108\n78#4,11:65\n91#4:107\n456#5,8:76\n464#5,3:90\n25#5:94\n467#5,3:104\n4144#6,6:84\n1097#7,6:95\n*S KotlinDebug\n*F\n+ 1 OldLoadingDialogCompose.kt\ncom/yalla/yalla/ui/dialog/OldLoadingDialogComposeKt$OldLoadingDialogCompose$2\n*L\n40#1:56\n41#1:57\n43#1:58\n46#1:101\n47#1:102\n49#1:103\n37#1:59,6\n37#1:93\n37#1:108\n37#1:65,11\n37#1:107\n37#1:76,8\n37#1:90,3\n45#1:94\n37#1:104,3\n37#1:84,6\n45#1:95,6\n*E\n"})
public final class O0OO00 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ String f52157OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f52158OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O0OO00(String str, int i) {
        super(2);
        this.f52157OooO0Oo = str;
        this.f52158OooO0o0 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        Composer composer2;
        Composer composer3 = composer;
        int iIntValue = num.intValue();
        if ((iIntValue & 11) == 2 && composer3.getSkipping()) {
            composer3.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-434339684, iIntValue, -1, "com.yalla.yalla.ui.dialog.OldLoadingDialogCompose.<anonymous> (OldLoadingDialogCompose.kt:35)");
            }
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            Modifier.Companion companion = Modifier.INSTANCE;
            float f = 16;
            Modifier modifierM476padding3ABfNKs = PaddingKt.m476padding3ABfNKs(BackgroundKt.m169backgroundbw27NRU$default(OooOo.OooO0O0(f, SizeKt.m528width3ABfNKs(companion, Dp.m3765constructorimpl(220))), o0oO0O0o.f46968OooOoO, null, 2, null), Dp.m3765constructorimpl(f));
            String str = this.f52157OooO0Oo;
            composer3.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyOooO0O0 = OooOOO0.OooO0O0(Arrangement.INSTANCE, centerHorizontally, composer3, 48, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM476padding3ABfNKs);
            if (!(composer3.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer3.startReusableNode();
            if (composer3.getInserting()) {
                composer3.createNode(constructor);
            } else {
                composer3.useNode();
            }
            Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composer3);
            Function2 function2OooO00o = OooO.OooO00o(companion2, composerM1309constructorimpl, measurePolicyOooO0O0, composerM1309constructorimpl, currentCompositionLocalMap);
            if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer3)), composer3, 2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            composer3.startReplaceableGroup(-492369756);
            Object objRememberedValue = composer3.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = "svga/anim_loading.svga";
                composer3.updateRememberedValue("svga/anim_loading.svga");
            }
            composer3.endReplaceableGroup();
            OooOo00.OooO00o((String) objRememberedValue, true, 0, null, null, SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(40)), composer3, 196662, 28);
            SpacerKt.Spacer(SizeKt.m509height3ABfNKs(companion, Dp.m3765constructorimpl(10)), composer3, 6);
            composer3.startReplaceableGroup(1735519440);
            if (!StringsKt.isBlank(str)) {
                o00000O.OooO00o(12, companion, composer3, 6);
                composer2 = composer3;
                TextKt.m1251Text4IGK_g(str, (Modifier) null, o0oO0O0o.f46958OooOOOO, TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (14 & (this.f52158OooO0o0 >> 3)) | 3072, 0, 131058);
            } else {
                composer2 = composer3;
            }
            if (OooO0o.OooO0O0(composer2)) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
