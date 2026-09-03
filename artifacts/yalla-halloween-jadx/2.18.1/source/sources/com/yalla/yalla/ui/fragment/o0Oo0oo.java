package com.yalla.yalla.ui.fragment;

import com.weieyu.yalla.R;
import com.yalla.yalla.common.model.MomentLogActionType;
import com.yalla.yalla.common.model.MomentLogActionTypeCommentPraise;
import com.yalla.yalla.common.ui.view.PraiseView;
import com.yalla.yalla.model.MomentDetailModel;
import com.yalla.yalla.model.PostCommentDetailModel;
import com.yalla.yalla.model.PraiseCommentResultModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import p498o0o00Oo0.oo0o0O0;

/* JADX INFO: loaded from: classes3.dex */
public final class o0Oo0oo extends Lambda implements Function1<PraiseCommentResultModel, Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ p188o00o00o0.OooO0o f24539Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ PostDetailCommentFragment f24540Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ PostCommentDetailModel f24541Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ PraiseView f24542Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0Oo0oo(PostDetailCommentFragment postDetailCommentFragment, PostCommentDetailModel postCommentDetailModel, PraiseView praiseView, p188o00o00o0.OooO0o oooO0o) {
        super(1);
        this.f24540Oooo0o = postDetailCommentFragment;
        this.f24541Oooo0oO = postCommentDetailModel;
        this.f24542Oooo0oo = praiseView;
        this.f24539Oooo = oooO0o;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(PraiseCommentResultModel praiseCommentResultModel) {
        PraiseCommentResultModel praiseCommentResultModel2 = praiseCommentResultModel;
        MomentDetailModel momentDetailModel = this.f24540Oooo0o.mPostDetailModel;
        if (momentDetailModel != null) {
            PostCommentDetailModel postCommentDetailModel = this.f24541Oooo0oO;
            PraiseView praiseView = this.f24542Oooo0oo;
            p188o00o00o0.OooO0o oooO0o = this.f24539Oooo;
            if (String.valueOf(momentDetailModel.getUserId()).length() > 0) {
                MomentLogActionTypeCommentPraise momentLogActionTypeCommentPraise = new MomentLogActionTypeCommentPraise(null, null, null, 7, null);
                momentLogActionTypeCommentPraise.setObject_userid(String.valueOf(momentDetailModel.getUserId()));
                momentLogActionTypeCommentPraise.setDiscoveryid(com.yalla.support.common.util.OooO.OooO(Long.valueOf(momentDetailModel.getId()), ""));
                momentLogActionTypeCommentPraise.setComment_id(com.yalla.support.common.util.OooO.OooO(Long.valueOf(postCommentDetailModel.getId()), ""));
                MomentLogActionType actionType = MomentLogActionType.comment_praise;
                String actionInfo = momentLogActionTypeCommentPraise.toJson();
                String sessionId = momentDetailModel.getSessionId();
                Intrinsics.checkNotNullParameter(actionType, "actionType");
                Intrinsics.checkNotNullParameter(actionInfo, "actionInfo");
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new oo0o0O0(actionType, actionInfo, sessionId, null), 3, null);
            }
            praiseView.OooO0Oo(!postCommentDetailModel.isPraise());
            postCommentDetailModel.setPraise(!postCommentDetailModel.isPraise());
            postCommentDetailModel.setPraiseNum(praiseCommentResultModel2 != null ? praiseCommentResultModel2.getNum() : 0L);
            oooO0o.OooOO0(R.id.item_post_detail_comment_praiseCount, p168o00Ooo0.o0O0O00.OooO0oO(postCommentDetailModel.getPraiseNum(), false));
            if (postCommentDetailModel.isPraise()) {
                oooO0o.OooOO0O(R.id.item_post_detail_comment_praiseCount, p254o00ooO0O.o000O0O0.OooO00o(R.color.color_FE6C6C));
            } else {
                oooO0o.OooOO0O(R.id.item_post_detail_comment_praiseCount, p254o00ooO0O.o000O0O0.OooO00o(R.color.color_54000000));
            }
        }
        return Unit.INSTANCE;
    }
}
