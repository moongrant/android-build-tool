package p535o0o0Oo0;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.code.android.util.o0OoOo0;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.ui.screen.moment.media.MomentComment;
import com.yalla.yalla.ui.vm.moment.MomentCommentsVM;
import com.yalla.yalla.ui.vm.moment.MomentVideoVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0oo0o extends Lambda implements Function3<LazyItemScope, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentVideoVM f53732OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentCommentsVM f53733OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0oo0o(MomentCommentsVM momentCommentsVM, MomentVideoVM momentVideoVM) {
        super(3);
        this.f53732OooO0Oo = momentVideoVM;
        this.f53733OooO0o0 = momentCommentsVM;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
        LazyItemScope item = lazyItemScope;
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(item, "$this$item");
        if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-990234593, iIntValue, -1, "com.yalla.yalla.ui.screen.moment.media.MomentCommentDialogComments.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MomentCommentDialogComments.kt:80)");
            }
            MomentComment momentComment = MomentComment.f28751OooO00o;
            MomentDetailModel currentMomentDetail = this.f53732OooO0Oo.getCurrentMomentDetail();
            Long lValueOf = Long.valueOf(o0OoOo0.OooOO0(currentMomentDetail != null ? Long.valueOf(currentMomentDetail.getCommentNum()) : null));
            MomentCommentsVM momentCommentsVM = this.f53733OooO0o0;
            momentComment.OooO0O0(lValueOf, momentCommentsVM.getCommentsSortType(), new o0oO0O0o(momentCommentsVM), composer2, 3072);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
