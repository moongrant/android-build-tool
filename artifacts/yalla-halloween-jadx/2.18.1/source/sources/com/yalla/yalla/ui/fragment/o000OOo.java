package com.yalla.yalla.ui.fragment;

import android.widget.TextView;
import com.yalla.yalla.common.ui.view.SVGAView;
import com.yalla.yalla.model.PostCommentDetailModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class o000OOo extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ TextView f24510Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ PostDetailCommentFragment f24511Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ PostCommentDetailModel f24512Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ SVGAView f24513Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OOo(PostDetailCommentFragment postDetailCommentFragment, PostCommentDetailModel postCommentDetailModel, SVGAView sVGAView, TextView textView) {
        super(0);
        this.f24511Oooo0o = postDetailCommentFragment;
        this.f24512Oooo0oO = postCommentDetailModel;
        this.f24513Oooo0oo = sVGAView;
        this.f24510Oooo = textView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        PostDetailCommentFragment postDetailCommentFragment = this.f24511Oooo0o;
        PostCommentDetailModel postCommentDetailModel = this.f24512Oooo0oO;
        SVGAView rewardSvga = this.f24513Oooo0oo;
        Intrinsics.checkNotNullExpressionValue(rewardSvga, "rewardSvga");
        TextView tvRewardCount = this.f24510Oooo;
        Intrinsics.checkNotNullExpressionValue(tvRewardCount, "tvRewardCount");
        postDetailCommentFragment.sendReward(postCommentDetailModel, rewardSvga, tvRewardCount);
        return Unit.INSTANCE;
    }
}
