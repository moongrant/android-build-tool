package p485o0o00O0;

import androidx.compose.animation.OooO;
import androidx.compose.animation.OooO0O0;
import androidx.compose.animation.OooOO0;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.OooO0o;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import com.yalla.yalla.data.constant.EnterRoomParentPage;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.ui.activity.moment.MomentDetailActivity;
import com.yalla.yalla.ui.vm.moment.TopicInfoVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p147o00Oo0Oo.o000OOo;
import p203o00o0o0o.o0O000Oo;
import p469o0OoooOO.o0oO0O0o;
import p509o0o0O0.o0000oo;
import p509o0o0O0.o000OO;
import p515o0o0O0O0.o0Oo0oo;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nMomentDetailActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentDetailActivity.kt\ncom/yalla/yalla/ui/activity/moment/MomentDetailActivity$initView$2\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,769:1\n25#2:770\n456#2,8:795\n464#2,3:809\n467#2,3:814\n1097#3,6:771\n71#4,7:777\n78#4:812\n82#4:818\n78#5,11:784\n91#5:817\n4144#6,6:803\n154#7:813\n81#8:819\n*S KotlinDebug\n*F\n+ 1 MomentDetailActivity.kt\ncom/yalla/yalla/ui/activity/moment/MomentDetailActivity$initView$2\n*L\n188#1:770\n191#1:795,8\n191#1:809,3\n191#1:814,3\n188#1:771,6\n191#1:777,7\n191#1:812\n191#1:818\n191#1:784,11\n191#1:817\n191#1:803,6\n239#1:813\n188#1:819\n*E\n"})
public final class o000O0O0 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailActivity f47817OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O0O0(MomentDetailActivity momentDetailActivity) {
        super(2);
        this.f47817OooO0Oo = momentDetailActivity;
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
                ComposerKt.traceEventStart(-760281825, iIntValue, -1, "com.yalla.yalla.ui.activity.moment.MomentDetailActivity.initView.<anonymous> (MomentDetailActivity.kt:186)");
            }
            composer2.startReplaceableGroup(-492369756);
            Object objRememberedValue = composer2.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new o0Oo0oo(null), null, 2, null);
                composer2.updateRememberedValue(objRememberedValue);
            }
            composer2.endReplaceableGroup();
            MutableState mutableState = (MutableState) objRememberedValue;
            int i = MomentDetailActivity.f26057Oooo0;
            MomentDetailActivity momentDetailActivity = this.f47817OooO0Oo;
            if (o0O000Oo.OooO00o(momentDetailActivity) != null) {
                ((o0Oo0oo) mutableState.getValue()).OooO0O0(1, null, composer2, 518, 2);
                composer2.startReplaceableGroup(-483455358);
                Modifier.Companion companion = Modifier.INSTANCE;
                MeasurePolicy measurePolicyOooO00o = OooO0o.OooO00o(Alignment.INSTANCE, Arrangement.INSTANCE.getTop(), composer2, 0, -1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                Function2 function2OooO00o = OooO.OooO00o(companion2, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
                if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer2)), composer2, 2058660585);
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                MomentDetailModel value = momentDetailActivity.OooOooo().getMPostDetailModel().getValue();
                Intrinsics.checkNotNull(value);
                o0000oo.OooO00o(value, 0, (o0Oo0oo) mutableState.getValue(), momentDetailActivity.OooOooo().getMomentAdapterTag().getValue(), momentDetailActivity, EnterRoomParentPage.Moments_details_SharedRoom, new o000O0(momentDetailActivity), true, momentDetailActivity.OooOooo().getMIsFromTopicDetail(), new o000OO0O(momentDetailActivity), true, o0oO0O0o.f46945OooO00o, null, null, null, null, composer2, 12812856, 6, 61440);
                o000OO.OooO00o(columnScopeInstance, (TopicInfoVM) momentDetailActivity.f26061OooOo00.getValue(), composer2, 6);
                SpacerKt.Spacer(BackgroundKt.m169backgroundbw27NRU$default(SizeKt.m509height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3765constructorimpl(6)), o000OOo.OooO0OO(composer2).f37704OooO0OO, null, 2, null), composer2, 0);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
