package p485o0o00O0;

import androidx.compose.animation.OooO0O0;
import androidx.compose.animation.OooOO0;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.OooO;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Dp;
import com.code.android.util.o0O0O00;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.ui.activity.moment.MomentDetailActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p203o00o0o0o.o0O000Oo;
import p517o0o0O0o.OooOOOO;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nMomentDetailActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentDetailActivity.kt\ncom/yalla/yalla/ui/activity/moment/MomentDetailActivity$initView$3$3$1\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,769:1\n73#2,6:770\n79#2:804\n83#2:813\n78#3,11:776\n91#3:812\n456#4,8:787\n464#4,3:801\n467#4,3:809\n4144#5,6:795\n154#6:805\n154#6:806\n154#6:807\n154#6:808\n*S KotlinDebug\n*F\n+ 1 MomentDetailActivity.kt\ncom/yalla/yalla/ui/activity/moment/MomentDetailActivity$initView$3$3$1\n*L\n266#1:770,6\n266#1:804\n266#1:813\n266#1:776,11\n266#1:812\n266#1:787,8\n266#1:801,3\n266#1:809,3\n266#1:795,6\n273#1:805\n285#1:806\n286#1:807\n291#1:808\n*E\n"})
public final class o00 extends Lambda implements Function3<RowScope, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailActivity f47793OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00(MomentDetailActivity momentDetailActivity) {
        super(3);
        this.f47793OooO0Oo = momentDetailActivity;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(RowScope rowScope, Composer composer, Integer num) {
        String headUrl;
        RowScope Toolbar = rowScope;
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(Toolbar, "$this$Toolbar");
        if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-307978002, iIntValue, -1, "com.yalla.yalla.ui.activity.moment.MomentDetailActivity.initView.<anonymous>.<anonymous>.<anonymous> (MomentDetailActivity.kt:264)");
            }
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            Modifier.Companion companion = Modifier.INSTANCE;
            MomentDetailActivity momentDetailActivity = this.f47793OooO0Oo;
            Modifier modifierAlpha = AlphaKt.alpha(companion, momentDetailActivity.f26070OooOooo.getValue().floatValue());
            composer2.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyOooO00o = OooO.OooO00o(Arrangement.INSTANCE, centerVertically, composer2, 48, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierAlpha);
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
            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion2, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
            if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer2)), composer2, 2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            OooOOOO oooOOOO = OooOOOO.f51970OooO00o;
            MomentDetailModel momentDetailModel = (MomentDetailModel) o0O000Oo.OooO00o(momentDetailActivity);
            if (momentDetailModel == null || (headUrl = momentDetailModel.getHeadUrl()) == null) {
                headUrl = "";
            }
            oooOOOO.OooOO0(headUrl, o0O0O00.OooO0O0(SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(31)), false, false, 0L, false, null, null, null, new o000OOo0(momentDetailActivity), 253), 0.0f, null, false, composer2, 262144, 28);
            MomentDetailModel momentDetailModel2 = (MomentDetailModel) o0O000Oo.OooO00o(momentDetailActivity);
            Integer numValueOf = null;
            oooOOOO.OooOOOo(momentDetailModel2 != null ? momentDetailModel2.getNickName() : null, 0L, false, 0L, 0, 0, FontWeight.INSTANCE.getMedium(), false, SizeKt.m530widthInVpY3zN4$default(PaddingKt.m480paddingqDBjuR0$default(companion, Dp.m3765constructorimpl(8), 0.0f, 0.0f, 0.0f, 14, null), 0.0f, Dp.m3765constructorimpl(117), 1, null), composer2, 1175977984, FacebookRequestErrorClassification.EC_INVALID_TOKEN);
            MomentDetailModel momentDetailModel3 = (MomentDetailModel) o0O000Oo.OooO00o(momentDetailActivity);
            if (momentDetailModel3 != null) {
                numValueOf = Integer.valueOf(momentDetailModel3.getSex());
            }
            oooOOOO.OooO0oO(numValueOf, PaddingKt.m480paddingqDBjuR0$default(companion, Dp.m3765constructorimpl(5), 0.0f, 0.0f, 0.0f, 14, null), composer2, 560, 0);
            if (androidx.compose.material.OooOO0.OooO0O0(composer2)) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
