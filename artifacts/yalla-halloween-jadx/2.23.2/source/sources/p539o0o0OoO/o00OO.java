package p539o0o0OoO;

import androidx.compose.animation.OooO;
import androidx.compose.animation.OooO0O0;
import androidx.compose.animation.OooOO0;
import androidx.compose.animation.Oooo000;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.OooO0o;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
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
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p193o00o0O0O.o0000oo;
import p230o00oOo0o.o000000;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nRoomUserActionRecordScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomUserActionRecordScreen.kt\ncom/yalla/yalla/ui/screen/room/RoomUserActionRecordScreenKt$RoomUserActionRecordScreenContent$1$4$1$2\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,318:1\n154#2:319\n154#2:362\n36#3:320\n456#3,8:344\n464#3,3:358\n467#3,3:363\n1097#4,6:321\n66#5,6:327\n72#5:361\n76#5:367\n78#6,11:333\n91#6:366\n4144#7,6:352\n*S KotlinDebug\n*F\n+ 1 RoomUserActionRecordScreen.kt\ncom/yalla/yalla/ui/screen/room/RoomUserActionRecordScreenKt$RoomUserActionRecordScreenContent$1$4$1$2\n*L\n128#1:319\n146#1:362\n129#1:320\n125#1:344,8\n125#1:358,3\n125#1:363,3\n129#1:321,6\n125#1:327,6\n125#1:361\n125#1:367\n125#1:333,11\n125#1:366\n125#1:352,6\n*E\n"})
public final class o00OO extends Lambda implements Function3<ColumnScope, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<Dp> f54564OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ o000000 f54565OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f54566OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OO(MutableState<Dp> mutableState, int i, o000000 o000000Var) {
        super(3);
        this.f54564OooO0Oo = mutableState;
        this.f54566OooO0o0 = i;
        this.f54565OooO0o = o000000Var;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
        String strStringResource;
        long j;
        ColumnScope Tab = columnScope;
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(Tab, "$this$Tab");
        if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-336783148, iIntValue, -1, "com.yalla.yalla.ui.screen.room.RoomUserActionRecordScreenContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (RoomUserActionRecordScreen.kt:124)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM513heightInVpY3zN4$default = SizeKt.m513heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3775constructorimpl(50), 0.0f, 2, null);
            composer2.startReplaceableGroup(1157296644);
            MutableState<Dp> mutableState = this.f54564OooO0Oo;
            boolean zChanged = composer2.changed(mutableState);
            Object objRememberedValue = composer2.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new oo0O(mutableState);
                composer2.updateRememberedValue(objRememberedValue);
            }
            composer2.endReplaceableGroup();
            Modifier modifierOnSizeChanged = OnRemeasuredModifierKt.onSizeChanged(modifierM513heightInVpY3zN4$default, (Function1) objRememberedValue);
            composer2.startReplaceableGroup(733328855);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyOooO00o = Oooo000.OooO00o(companion2, false, composer2, 0, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
            Function2 function2OooO00o = OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            int i = this.f54566OooO0o0;
            if (i == 0) {
                composer2.startReplaceableGroup(411607603);
                strStringResource = StringResources_androidKt.stringResource(p562o0oOo000.o000000.Remove__Room, composer2, 0);
                composer2.endReplaceableGroup();
            } else if (i == 1) {
                composer2.startReplaceableGroup(411607678);
                strStringResource = StringResources_androidKt.stringResource(p562o0oOo000.o000000.Ban_or_Unban, composer2, 0);
                composer2.endReplaceableGroup();
            } else if (i != 2) {
                composer2.startReplaceableGroup(-125059158);
                composer2.endReplaceableGroup();
                strStringResource = "";
            } else {
                composer2.startReplaceableGroup(411607753);
                strStringResource = StringResources_androidKt.stringResource(p562o0oOo000.o000000.Remove__Mic, composer2, 0);
                composer2.endReplaceableGroup();
            }
            String str = strStringResource;
            if (this.f54565OooO0o.OooO0oO() == i) {
                composer2.startReplaceableGroup(411607941);
                j = o0000oo.OooO0OO(composer2).f38616OooO;
            } else {
                composer2.startReplaceableGroup(411607956);
                j = o0000oo.OooO0OO(composer2).f38627OooOO0o;
            }
            composer2.endReplaceableGroup();
            TextKt.m1261Text4IGK_g(str, PaddingKt.m480paddingVpY3zN4$default(boxScopeInstance.align(companion, companion2.getCenter()), 0.0f, Dp.m3775constructorimpl(12), 1, null), j, TextUnitKt.getSp(15), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 130544);
            if (OooO0o.OooO00o(composer2)) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
