package p535o0o0Oo0;

import androidx.compose.animation.OooO;
import androidx.compose.animation.OooO0O0;
import androidx.compose.animation.OooOO0;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.material.OooO0OO;
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
import o000O.o0ooOOo;
import p107o000ooO0.OooOOOO;
import p476o0OooooO.o0OOo000;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nMomentReplyDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentReplyDialog.kt\ncom/yalla/yalla/ui/screen/moment/media/MomentReplyDialog$Content$1$2$1$2\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,287:1\n154#2:288\n154#2:289\n154#2:290\n154#2:291\n154#2:327\n154#2:333\n73#3,6:292\n79#3:326\n83#3:332\n78#4,11:298\n91#4:331\n456#5,8:309\n464#5,3:323\n467#5,3:328\n4144#6,6:317\n*S KotlinDebug\n*F\n+ 1 MomentReplyDialog.kt\ncom/yalla/yalla/ui/screen/moment/media/MomentReplyDialog$Content$1$2$1$2\n*L\n242#1:288\n243#1:289\n244#1:290\n245#1:291\n251#1:327\n276#1:333\n237#1:292,6\n237#1:326\n237#1:332\n237#1:298,11\n237#1:331\n237#1:309,8\n237#1:323,3\n237#1:328,3\n237#1:317,6\n*E\n"})
public final class oO00O0oO extends Lambda implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooOOOO<MomentReplyModel> f53913OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentVideoVM f53914OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO00O0oO(OooOOOO<MomentReplyModel> oooOOOO, MomentVideoVM momentVideoVM) {
        super(4);
        this.f53913OooO0Oo = oooOOOO;
        this.f53914OooO0o0 = momentVideoVM;
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
                ComposerKt.traceEventStart(225209705, iIntValue2, -1, "com.yalla.yalla.ui.screen.moment.media.MomentReplyDialog.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MomentReplyDialog.kt:226)");
            }
            OooOOOO<MomentReplyModel> oooOOOO = this.f53913OooO0Oo;
            if (iIntValue < oooOOOO.OooO0O0()) {
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                try {
                    ?? OooO00o2 = oooOOOO.OooO00o(iIntValue);
                    objectRef.element = OooO00o2;
                    if (((MomentReplyModel) OooO00o2) != null) {
                        MomentVideoVM momentVideoVM = this.f53914OooO0o0;
                        MomentDetailModel currentMomentDetail = momentVideoVM.getCurrentMomentDetail();
                        if (currentMomentDetail != null && (currentComment = momentVideoVM.getCurrentComment()) != null) {
                            Alignment.Vertical top = Alignment.INSTANCE.getTop();
                            Modifier.Companion companion = Modifier.INSTANCE;
                            float f = 12;
                            Modifier modifierM481paddingqDBjuR0 = PaddingKt.m481paddingqDBjuR0(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3775constructorimpl(20), Dp.m3775constructorimpl(f), Dp.m3775constructorimpl(16), Dp.m3775constructorimpl(f));
                            composer2.startReplaceableGroup(693286680);
                            MeasurePolicy measurePolicyOooO0O0 = OooO0OO.OooO0O0(Arrangement.INSTANCE, top, composer2, 48, -1323940314);
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion2.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM481paddingqDBjuR0);
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
                            Function2 function2OooO00o = OooO.OooO00o(companion2, composerM1320constructorimpl, measurePolicyOooO0O0, composerM1320constructorimpl, currentCompositionLocalMap);
                            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                            }
                            OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                            oO0o0o.f54122OooO00o.OooO0OO(true, iIntValue, Dp.m3775constructorimpl(28), false, (MomentReplyModel) objectRef.element, currentComment, currentMomentDetail, new oO00O0o0(momentVideoVM, objectRef), new oOo00OO0(momentVideoVM, objectRef), composer2, 807701894 | (iIntValue2 & 112), 0);
                            o0ooOOo.OooO00o(composer2);
                            com.code.android.util.OooOO0.OooO0OO(PaddingKt.m482paddingqDBjuR0$default(companion, Dp.m3775constructorimpl(56), 0.0f, 0.0f, 0.0f, 14, null), 0.0f, o0OOo000.f48202o00000O0, composer2, 384, 1);
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
