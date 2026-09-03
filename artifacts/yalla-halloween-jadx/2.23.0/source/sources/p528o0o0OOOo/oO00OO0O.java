package p528o0o0OOOo;

import com.code.android.util.OooOOO;
import com.code.android.util.o000O00O;
import com.code.android.util.o0OoOo0;
import com.yalla.yalla.model.moment.MomentCommentDetailModel;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.model.moment.MomentStateKt;
import com.yalla.yalla.ui.vm.moment.MomentVideoVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class oO00OO0O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentVideoVM f53869OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f53870OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentCommentDetailModel f53871OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO00OO0O(MomentVideoVM momentVideoVM, MomentCommentDetailModel momentCommentDetailModel, CoroutineScope coroutineScope) {
        super(0);
        this.f53869OooO0Oo = momentVideoVM;
        this.f53871OooO0o0 = momentCommentDetailModel;
        this.f53870OooO0o = coroutineScope;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MomentVideoVM momentVideoVM = this.f53869OooO0Oo;
        MomentDetailModel currentMomentDetail = momentVideoVM.getCurrentMomentDetail();
        if (o0OoOo0.OooO00o(currentMomentDetail != null ? Boolean.valueOf(MomentStateKt.isApprovedState(currentMomentDetail)) : null)) {
            momentVideoVM.toInputCommentOrReply(this.f53871OooO0o0, null, momentVideoVM.getShowDialogReplay());
            OooOOO.OooO0O0(this.f53870OooO0o, new oO00O0oO(momentVideoVM, null));
        } else {
            o000O00O.OooO00o(oO00OOo0.This_content_is_in_review_Please_try_again_later);
        }
        return Unit.INSTANCE;
    }
}
