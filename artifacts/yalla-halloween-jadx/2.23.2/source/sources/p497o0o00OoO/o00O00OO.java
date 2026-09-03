package p497o0o00OoO;

import androidx.compose.animation.OooO;
import androidx.compose.animation.OooO0O0;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.OooO0o;
import androidx.compose.material.OooOO0;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import com.code.android.util.o0O0O00;
import com.yalla.yalla.mixedroom.model.RoomGameConfig;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p121o00O0Ooo.o0000;
import p423o0OoO0OO.o000OO;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nRoomGiftIconManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomGiftIconManager.kt\ncom/yalla/yalla/ui/activity/room/live/bottom/RoomGiftIconManagerKt$UpdateNewGiftList$2$1$pagerStateAndPageMapper$2\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,270:1\n50#2:271\n49#2:272\n456#2,8:296\n464#2,3:310\n50#2:314\n49#2:315\n467#2,3:322\n1097#3,6:273\n1097#3,6:316\n72#4,6:279\n78#4:313\n82#4:326\n78#5,11:285\n91#5:325\n4144#6,6:304\n*S KotlinDebug\n*F\n+ 1 RoomGiftIconManager.kt\ncom/yalla/yalla/ui/activity/room/live/bottom/RoomGiftIconManagerKt$UpdateNewGiftList$2$1$pagerStateAndPageMapper$2\n*L\n206#1:271\n206#1:272\n202#1:296,8\n202#1:310,3\n215#1:314\n215#1:315\n202#1:322,3\n206#1:273,6\n215#1:316,6\n202#1:279,6\n202#1:313\n202#1:326\n202#1:285,11\n202#1:325\n202#1:304,6\n*E\n"})
public final class o00O00OO extends Lambda implements Function3<Integer, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ List<RoomGameConfig.NewGift> f49832OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Function1<Integer, Unit> f49833OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O00OO(List list, int i, Function1 function1) {
        super(3);
        this.f49832OooO0Oo = list;
        this.f49833OooO0o0 = function1;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(Integer num, Composer composer, Integer num2) {
        int iIntValue = num.intValue();
        Composer composer2 = composer;
        int iIntValue2 = num2.intValue();
        if ((iIntValue2 & 14) == 0) {
            iIntValue2 |= composer2.changed(iIntValue) ? 4 : 2;
        }
        if ((iIntValue2 & 91) == 18 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1470893053, iIntValue2, -1, "com.yalla.yalla.ui.activity.room.live.bottom.UpdateNewGiftList.<anonymous>.<anonymous>.<anonymous> (RoomGiftIconManager.kt:200)");
            }
            RoomGameConfig.NewGift newGift = this.f49832OooO0Oo.get(iIntValue);
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            Integer numValueOf = Integer.valueOf(iIntValue);
            composer2.startReplaceableGroup(511388516);
            Function1<Integer, Unit> function1 = this.f49833OooO0o0;
            boolean zChanged = composer2.changed(numValueOf) | composer2.changed(function1);
            Object objRememberedValue = composer2.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new o00O00O(function1, iIntValue);
                composer2.updateRememberedValue(objRememberedValue);
            }
            composer2.endReplaceableGroup();
            Modifier modifierOooO0O0 = o0O0O00.OooO0O0(modifierFillMaxWidth$default, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253);
            composer2.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyOooO00o = OooOO0.OooO00o(Arrangement.INSTANCE, centerHorizontally, composer2, 48, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierOooO0O0);
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
            o0000 o0000VarOooO0Oo = o000OO.OooO0Oo(newGift.getImageUrl(), null, composer2, 0, 1);
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            Integer numValueOf2 = Integer.valueOf(iIntValue);
            composer2.startReplaceableGroup(511388516);
            boolean zChanged2 = composer2.changed(numValueOf2) | composer2.changed(function1);
            Object objRememberedValue2 = composer2.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new oOO00O(function1, iIntValue);
                composer2.updateRememberedValue(objRememberedValue2);
            }
            composer2.endReplaceableGroup();
            ImageKt.Image(o0000VarOooO0Oo, (String) null, o0O0O00.OooO0O0(modifierFillMaxWidth$default2, false, false, 0L, false, null, null, null, (Function0) objRememberedValue2, 253), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, composer2, 24624, 104);
            if (OooO0o.OooO00o(composer2)) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
