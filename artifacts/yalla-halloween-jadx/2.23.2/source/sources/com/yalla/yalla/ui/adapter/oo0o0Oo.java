package com.yalla.yalla.ui.adapter;

import com.yalla.yalla.data.db.table.MomentMessage;
import com.yalla.yalla.model.moment.MomentCommentDetailModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oo0o0Oo extends Lambda implements Function1<MomentCommentDetailModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0OOO0o.OooO0O0 f27236OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentMessage f27237OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0o0Oo(o0OOO0o.OooO0O0 oooO0O0, MomentMessage momentMessage) {
        super(1);
        this.f27236OooO0Oo = oooO0O0;
        this.f27237OooO0o0 = momentMessage;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(MomentCommentDetailModel momentCommentDetailModel) {
        MomentCommentDetailModel it = momentCommentDetailModel;
        Intrinsics.checkNotNullParameter(it, "it");
        MomentMessage momentMessage = this.f27237OooO0o0;
        MomentMessage.CommentReportFeedback commentReportFeedback = momentMessage.getCommentReportFeedback();
        Long momentId = commentReportFeedback != null ? commentReportFeedback.getMomentId() : null;
        MomentMessage.CommentReportFeedback commentReportFeedback2 = momentMessage.getCommentReportFeedback();
        this.f27236OooO0Oo.OooO0O0(momentId, commentReportFeedback2 != null ? commentReportFeedback2.getCommentId() : null, it);
        return Unit.INSTANCE;
    }
}
