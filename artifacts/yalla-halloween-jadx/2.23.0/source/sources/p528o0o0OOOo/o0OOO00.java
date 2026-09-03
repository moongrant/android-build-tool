package p528o0o0OOOo;

import com.code.android.util.o000O00O;
import com.code.android.util.o0OoOo0;
import com.yalla.yalla.model.moment.MomentCommentDetailModel;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.model.moment.MomentStateKt;
import com.yalla.yalla.ui.vm.moment.MomentVideoVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OOO00 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentVideoVM f53793OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MomentCommentDetailModel f53794OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef<MomentCommentDetailModel> f53795OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OOO00(MomentVideoVM momentVideoVM, Ref.ObjectRef<MomentCommentDetailModel> objectRef, MomentCommentDetailModel momentCommentDetailModel) {
        super(0);
        this.f53793OooO0Oo = momentVideoVM;
        this.f53795OooO0o0 = objectRef;
        this.f53794OooO0o = momentCommentDetailModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MomentVideoVM momentVideoVM = this.f53793OooO0Oo;
        MomentDetailModel currentMomentDetail = momentVideoVM.getCurrentMomentDetail();
        if (!o0OoOo0.OooO00o(currentMomentDetail != null ? Boolean.valueOf(MomentStateKt.isApprovedState(currentMomentDetail)) : null)) {
            o000O00O.OooO00o(oO00OOo0.This_content_is_in_review_Please_try_again_later);
        } else if (!this.f53795OooO0o0.element.isHide()) {
            MomentVideoVM.toInputCommentOrReply$default(this.f53793OooO0Oo, this.f53794OooO0o, null, false, 4, null);
            momentVideoVM.getShowFastInputPanel().setValue(Boolean.TRUE);
            momentVideoVM.setNeedShowEmojiFacePanel(false);
        }
        return Unit.INSTANCE;
    }
}
