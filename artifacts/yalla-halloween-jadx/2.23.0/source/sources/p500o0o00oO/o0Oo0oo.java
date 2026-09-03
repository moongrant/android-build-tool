package p500o0o00oO;

import androidx.compose.animation.OooO;
import androidx.compose.animation.OooO0O0;
import androidx.compose.animation.OooOO0;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
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
import androidx.compose.ui.node.ComposeUiNode;
import com.yalla.yalla.model.RankModel2;
import com.yalla.yalla.model.TopRankHeaderModel;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p018OooOoo0.OooOOO;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nRecommendTopRankAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecommendTopRankAdapter.kt\ncom/yalla/yalla/ui/adapter/room/RecommendTopRankAdapter$convert$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,102:1\n66#2,6:103\n72#2:137\n76#2:142\n78#3,11:109\n91#3:141\n456#4,8:120\n464#4,3:134\n467#4,3:138\n4144#5,6:128\n*S KotlinDebug\n*F\n+ 1 RecommendTopRankAdapter.kt\ncom/yalla/yalla/ui/adapter/room/RecommendTopRankAdapter$convert$1\n*L\n35#1:103,6\n35#1:137\n35#1:142\n35#1:109,11\n35#1:141\n35#1:120,8\n35#1:134,3\n35#1:138,3\n35#1:128,6\n*E\n"})
public final class o0Oo0oo extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0OO00O f49432OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f49433OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0Oo0oo(o0OO00O o0oo00o2, int i) {
        super(2);
        this.f49432OooO0Oo = o0oo00o2;
        this.f49433OooO0o0 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        List<RankModel2> position;
        RankModel2 rankModel2;
        List<RankModel2> position2;
        RankModel2 rankModel3;
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(129165415, iIntValue, -1, "com.yalla.yalla.ui.adapter.room.RecommendTopRankAdapter.convert.<anonymous> (RecommendTopRankAdapter.kt:33)");
            }
            String str = null;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            composer2.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyOooO00o = OooOOO.OooO00o(Alignment.INSTANCE, false, composer2, 0, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default);
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
            Function2 function2OooO00o = OooO.OooO00o(companion, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
            if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer2)), composer2, 2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            o0OO00O o0oo00o2 = this.f49432OooO0Oo;
            TopRankHeaderModel value = o0oo00o2.f49430OooO0o.getValue();
            int i = this.f49433OooO0o0;
            o000OOo.OooO00o(boxScopeInstance, value, i, composer2, 70);
            MutableState<TopRankHeaderModel> mutableState = o0oo00o2.f49430OooO0o;
            TopRankHeaderModel value2 = mutableState.getValue();
            o000OOo.OooO0O0(boxScopeInstance, true, (value2 == null || (position2 = value2.getPosition(i)) == null || (rankModel3 = (RankModel2) CollectionsKt.getOrNull(position2, 1)) == null) ? null : rankModel3.imageurl, composer2, 54);
            TopRankHeaderModel value3 = mutableState.getValue();
            if (value3 != null && (position = value3.getPosition(i)) != null && (rankModel2 = (RankModel2) CollectionsKt.getOrNull(position, 2)) != null) {
                str = rankModel2.imageurl;
            }
            o000OOo.OooO0O0(boxScopeInstance, false, str, composer2, 54);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
