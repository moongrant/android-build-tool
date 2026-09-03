package p528o0o0OOOo;

import androidx.compose.animation.OooOO0;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
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
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import com.yalla.yalla.model.moment.MomentCommentDetailModel;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.model.moment.MomentReplyModel;
import com.yalla.yalla.ui.vm.moment.MomentVideoVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import o000O0.OooO0O0;
import p426o0OoOO.o000oOoO;
import p469o0OoooOO.o0oO0O0o;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nMomentReplyDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentReplyDialog.kt\ncom/yalla/yalla/ui/screen/moment/media/MomentReplyDialog$Content$1$2$1$2\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,284:1\n154#2:285\n154#2:286\n154#2:287\n154#2:288\n154#2:324\n154#2:330\n73#3,6:289\n79#3:323\n83#3:329\n78#4,11:295\n91#4:328\n456#5,8:306\n464#5,3:320\n467#5,3:325\n4144#6,6:314\n*S KotlinDebug\n*F\n+ 1 MomentReplyDialog.kt\ncom/yalla/yalla/ui/screen/moment/media/MomentReplyDialog$Content$1$2$1$2\n*L\n239#1:285\n240#1:286\n241#1:287\n242#1:288\n248#1:324\n273#1:330\n234#1:289,6\n234#1:323\n234#1:329\n234#1:295,11\n234#1:328\n234#1:306,8\n234#1:320,3\n234#1:325,3\n234#1:314,6\n*E\n"})
public final class oO0O0O0o extends Lambda implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooO0O0<MomentReplyModel> f53941OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentVideoVM f53942OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0O0O0o(OooO0O0<MomentReplyModel> oooO0O0, MomentVideoVM momentVideoVM) {
        super(4);
        this.f53941OooO0Oo = oooO0O0;
        this.f53942OooO0o0 = momentVideoVM;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [T, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function4
    public final Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
        MomentCommentDetailModel currentComment;
        LazyItemScope items = lazyItemScope;
        int iIntValue = num.intValue();
        Composer composer2 = composer;
        int iIntValue2 = num2.intValue();
        Intrinsics.checkNotNullParameter(items, "$this$items");
        if ((iIntValue2 & 112) == 0) {
            iIntValue2 |= composer2.changed(iIntValue) ? 32 : 16;
        }
        if ((iIntValue2 & 721) == 144 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(225209705, iIntValue2, -1, "com.yalla.yalla.ui.screen.moment.media.MomentReplyDialog.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MomentReplyDialog.kt:222)");
            }
            OooO0O0<MomentReplyModel> oooO0O0 = this.f53941OooO0Oo;
            if (iIntValue < oooO0O0.OooO0O0()) {
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                try {
                    ?? OooO00o2 = oooO0O0.OooO00o(iIntValue);
                    objectRef.element = OooO00o2;
                    if (((MomentReplyModel) OooO00o2) != null) {
                        MomentVideoVM momentVideoVM = this.f53942OooO0o0;
                        MomentDetailModel currentMomentDetail = momentVideoVM.getCurrentMomentDetail();
                        if (currentMomentDetail != null && (currentComment = momentVideoVM.getCurrentComment()) != null) {
                            Alignment.Vertical top = Alignment.INSTANCE.getTop();
                            Modifier.Companion companion = Modifier.INSTANCE;
                            float f = 12;
                            Modifier modifierM479paddingqDBjuR0 = PaddingKt.m479paddingqDBjuR0(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3765constructorimpl(20), Dp.m3765constructorimpl(f), Dp.m3765constructorimpl(16), Dp.m3765constructorimpl(f));
                            composer2.startReplaceableGroup(693286680);
                            MeasurePolicy measurePolicyOooO00o = OooO.OooO00o(Arrangement.INSTANCE, top, composer2, 48, -1323940314);
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion2.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM479paddingqDBjuR0);
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
                                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                            }
                            OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer2)), composer2, 2058660585);
                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                            oO0OO00o.f53953OooO00o.OooO0OO(true, iIntValue, Dp.m3765constructorimpl(28), false, (MomentReplyModel) objectRef.element, currentComment, currentMomentDetail, new oO0O00oO(momentVideoVM, objectRef), new oO0O0O00(momentVideoVM, objectRef), composer2, 807701894 | (iIntValue2 & 112), 0);
                            o000oOoO.OooO00o(composer2);
                            com.code.android.util.OooOO0.OooO0OO(PaddingKt.m480paddingqDBjuR0$default(companion, Dp.m3765constructorimpl(56), 0.0f, 0.0f, 0.0f, 14, null), 0.0f, o0oO0O0o.f47010o000000O, composer2, 384, 1);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } catch (Exception unused) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            } else if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
