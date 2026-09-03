package p433o0OoOOo;

import androidx.compose.animation.OooO;
import androidx.compose.animation.OooO0O0;
import androidx.compose.animation.OooOO0;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.material.OooO0o;
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
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p018OooOoo0.OooOOO;
import p150o00Oo0oO.o00000OO;
import p490o0o00OOO.Oooo000;
import p490o0o00OOO.oo000o;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nRoomBottomInputUIController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomBottomInputUIController.kt\ncom/yalla/yalla/mixedroom/room_bottom/RoomBottomInputUIController$initBottomLayout$1\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n*L\n1#1,137:1\n71#2,7:138\n78#2:173\n82#2:218\n78#3,11:145\n78#3,11:180\n91#3:212\n91#3:217\n456#4,8:156\n464#4,3:170\n456#4,8:191\n464#4,3:205\n467#4,3:209\n467#4,3:214\n4144#5,6:164\n4144#5,6:199\n66#6,6:174\n72#6:208\n76#6:213\n*S KotlinDebug\n*F\n+ 1 RoomBottomInputUIController.kt\ncom/yalla/yalla/mixedroom/room_bottom/RoomBottomInputUIController$initBottomLayout$1\n*L\n59#1:138,7\n59#1:173\n59#1:218\n59#1:145,11\n60#1:180,11\n60#1:212\n59#1:217\n59#1:156,8\n59#1:170,3\n60#1:191,8\n60#1:205,3\n60#1:209,3\n59#1:214,3\n59#1:164,6\n60#1:199,6\n60#1:174,6\n60#1:208\n60#1:213\n*E\n"})
public final class o00O extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00OO00O f45977OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O(o00OO00O o00oo00o) {
        super(2);
        this.f45977OooO0Oo = o00oo00o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-19076157, iIntValue, -1, "com.yalla.yalla.mixedroom.room_bottom.RoomBottomInputUIController.initBottomLayout.<anonymous> (RoomBottomInputUIController.kt:57)");
            }
            Arrangement.Vertical bottom = Arrangement.INSTANCE.getBottom();
            composer2.startReplaceableGroup(-483455358);
            Modifier.Companion companion = Modifier.INSTANCE;
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyOooO00o = OooO0o.OooO00o(companion2, bottom, composer2, 6, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
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
            Function2 function2OooO00o = OooO.OooO00o(companion3, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
            if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer2)), composer2, 2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            o00OO00O o00oo00o = this.f45977OooO0Oo;
            Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(companion, new oo0oOO0(o00oo00o));
            composer2.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyOooO00o2 = OooOOO.OooO00o(companion2, false, composer2, 0, -1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierOnGloballyPositioned);
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor2);
            } else {
                composer2.useNode();
            }
            Composer composerM1309constructorimpl2 = Updater.m1309constructorimpl(composer2);
            Function2 function2OooO00o2 = OooO.OooO00o(companion3, composerM1309constructorimpl2, measurePolicyOooO00o2, composerM1309constructorimpl2, currentCompositionLocalMap2);
            if (composerM1309constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
            }
            OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer2)), composer2, 2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            if (((Boolean) o00oo00o.f45994OooO0OO.f48505OooOO0.getValue()).booleanValue()) {
                composer2.startReplaceableGroup(1764679299);
                oo000o.OooO0Oo(o00oo00o.f45994OooO0OO, composer2, 8);
                composer2.endReplaceableGroup();
            } else {
                composer2.startReplaceableGroup(1764679166);
                Oooo000.OooO(o00oo00o.f45992OooO00o, composer2, 8);
                composer2.endReplaceableGroup();
            }
            if (o00000OO.OooO00o(composer2)) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
