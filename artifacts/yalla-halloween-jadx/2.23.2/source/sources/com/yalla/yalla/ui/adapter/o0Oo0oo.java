package com.yalla.yalla.ui.adapter;

import com.yalla.yalla.model.ReportCommentDetailModel;
import com.yalla.yalla.model.moment.MomentCommentDetailModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0Oo0oo extends Lambda implements Function1<ReportCommentDetailModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Function1<MomentCommentDetailModel, Unit> f27214OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0Oo0oo(oo0o0Oo oo0o0oo) {
        super(1);
        this.f27214OooO0Oo = oo0o0oo;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ReportCommentDetailModel reportCommentDetailModel) {
        ReportCommentDetailModel reportCommentDetailModel2 = reportCommentDetailModel;
        if (reportCommentDetailModel2 != null) {
            MomentCommentDetailModel momentCommentDetailModel = new MomentCommentDetailModel();
            momentCommentDetailModel.setLoadMomentCommentDetailModel(reportCommentDetailModel2.getId(), String.valueOf(reportCommentDetailModel2.getUserid()), reportCommentDetailModel2.getNickname(), reportCommentDetailModel2.getHeadurl(), reportCommentDetailModel2.getContent(), reportCommentDetailModel2.getCreateTime(), true);
            this.f27214OooO0Oo.invoke(momentCommentDetailModel);
        }
        return Unit.INSTANCE;
    }
}
