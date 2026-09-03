package p650o0ooo;

import androidx.compose.animation.OooO;
import androidx.compose.animation.OooO0O0;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.OooO0o;
import androidx.compose.material.OooOO0;
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
import com.yalla.yalla.model.PremiumLevel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import oO0OO.OooO00o;
import p193o00o0O0O.o0000oo;
import p590o0oOooo0.oOO0O00O;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nOpenNobleDialogUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OpenNobleDialogUtil.kt\ncom/yalla/yalla/ui/dialog/OpenNobleDialogUtil$showOpenNobleDialog$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,63:1\n154#2:64\n154#2:100\n154#2:101\n154#2:102\n72#3,6:65\n78#3:99\n82#3:107\n78#4,11:71\n91#4:106\n456#5,8:82\n464#5,3:96\n467#5,3:103\n4144#6,6:90\n*S KotlinDebug\n*F\n+ 1 OpenNobleDialogUtil.kt\ncom/yalla/yalla/ui/dialog/OpenNobleDialogUtil$showOpenNobleDialog$1$1\n*L\n35#1:64\n41#1:100\n44#1:101\n48#1:102\n32#1:65,6\n32#1:99\n32#1:107\n32#1:71,11\n32#1:106\n32#1:82,8\n32#1:96,3\n32#1:103,3\n32#1:90,6\n*E\n"})
public final class k extends Lambda implements Function3<ColumnScope, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f58317OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ String f58318OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ String f58319OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(int i, String str, String str2) {
        super(3);
        this.f58317OooO0Oo = i;
        this.f58319OooO0o0 = str;
        this.f58318OooO0o = str2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
        ColumnScope TextDialog = columnScope;
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(TextDialog, "$this$TextDialog");
        if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1788988716, iIntValue, -1, "com.yalla.yalla.ui.dialog.OpenNobleDialogUtil.showOpenNobleDialog.<anonymous>.<anonymous> (OpenNobleDialogUtil.kt:31)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM480paddingVpY3zN4$default = PaddingKt.m480paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3775constructorimpl(25), 0.0f, 2, null);
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            String str = this.f58319OooO0o0;
            String str2 = this.f58318OooO0o;
            composer2.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyOooO00o = OooOO0.OooO00o(Arrangement.INSTANCE, centerHorizontally, composer2, 48, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM480paddingVpY3zN4$default);
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor);
            } else {
                composer2.useNode();
            }
            Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
            Function2 function2OooO00o = OooO.OooO00o(companion2, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            OooO00o oooO00o = OooO00o.f59939OooO00o;
            OooO00o.OooOOoo(true, PremiumLevel.INSTANCE.of(Integer.valueOf(this.f58317OooO0Oo)), false, 0.0f, SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(120)), composer2, 286726, 12);
            com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(15), null, composer2, 6, 2);
            TextKt.m1261Text4IGK_g(str, (Modifier) null, o0000oo.OooO0OO(composer2).f38616OooO, oOO0O00O.OooO0OO(18, composer2), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 196608, 0, 131026);
            com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(10), null, composer2, 6, 2);
            TextKt.m1261Text4IGK_g(str2, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), o0000oo.OooO0OO(composer2).f38627OooOO0o, oOO0O00O.OooO0OO(15, composer2), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), 0L, 0, false, 3, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 48, 3072, 122352);
            if (OooO0o.OooO00o(composer2)) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
