package p528o0o0OOOo;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.yalla.yalla.model.moment.MomentCommentDetailModel;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.ui.screen.moment.media.MomentComment;
import com.yalla.yalla.ui.vm.moment.MomentCommentsVM;
import com.yalla.yalla.ui.vm.moment.MomentVideoVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import o000O0.OooO0O0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OOO0OO extends Lambda implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooO0O0<MomentCommentDetailModel> f53796OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MomentCommentsVM f53797OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentVideoVM f53798OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OOO0OO(OooO0O0<MomentCommentDetailModel> oooO0O0, MomentVideoVM momentVideoVM, MomentCommentsVM momentCommentsVM) {
        super(4);
        this.f53796OooO0Oo = oooO0O0;
        this.f53798OooO0o0 = momentVideoVM;
        this.f53797OooO0o = momentCommentsVM;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v7, types: [T, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function4
    public final Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
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
                ComposerKt.traceEventStart(315586166, iIntValue2, -1, "com.yalla.yalla.ui.screen.moment.media.MomentCommentDialogComments.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MomentCommentDialogComments.kt:87)");
            }
            OooO0O0<MomentCommentDetailModel> oooO0O0 = this.f53796OooO0Oo;
            if (iIntValue < oooO0O0.OooO0O0()) {
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                try {
                    ?? OooO00o2 = oooO0O0.OooO00o(iIntValue);
                    objectRef.element = OooO00o2;
                    if (((MomentCommentDetailModel) OooO00o2) != null) {
                        MomentVideoVM momentVideoVM = this.f53798OooO0o0;
                        MomentDetailModel currentMomentDetail = momentVideoVM.getCurrentMomentDetail();
                        if (currentMomentDetail != null) {
                            MomentComment.f29285OooO00o.OooO0OO(iIntValue, (MomentCommentDetailModel) objectRef.element, currentMomentDetail, this.f53797OooO0o.getCommentsSortType(), new o0OOO0(momentVideoVM, objectRef), composer2, ((iIntValue2 >> 3) & 14) | 197184, 0);
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
