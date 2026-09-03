package com.yalla.yalla.ui.screen.moment.media;

import com.yalla.yalla.model.moment.MomentCommentDetailModel;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.ui.vm.moment.MomentReplyVM;
import com.yalla.yalla.ui.vm.moment.MomentVideoVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0OO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentReplyVM f29416OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MomentCommentDetailModel f29417OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentVideoVM f29418OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0OO(MomentReplyVM momentReplyVM, MomentVideoVM momentVideoVM, MomentCommentDetailModel momentCommentDetailModel) {
        super(0);
        this.f29416OooO0Oo = momentReplyVM;
        this.f29418OooO0o0 = momentVideoVM;
        this.f29417OooO0o = momentCommentDetailModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MomentVideoVM momentVideoVM = this.f29418OooO0o0;
        MomentDetailModel currentMomentDetail = momentVideoVM.getCurrentMomentDetail();
        MomentReplyVM momentReplyVM = this.f29416OooO0Oo;
        MomentCommentDetailModel momentCommentDetailModel = this.f29417OooO0o;
        momentReplyVM.showCommentReply(currentMomentDetail, momentCommentDetailModel);
        momentVideoVM.showCommentReply(momentCommentDetailModel);
        return Unit.INSTANCE;
    }
}
