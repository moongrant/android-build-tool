package com.yalla.yalla.ui.fragment;

import com.yalla.yalla.model.PostCommentDetailModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class o0ooOOo extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ PostDetailCommentFragment f24545Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ PostCommentDetailModel f24546Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0ooOOo(PostDetailCommentFragment postDetailCommentFragment, PostCommentDetailModel postCommentDetailModel) {
        super(0);
        this.f24545Oooo0o = postDetailCommentFragment;
        this.f24546Oooo0oO = postCommentDetailModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f24545Oooo0o.replyComment(this.f24546Oooo0oO);
        return null;
    }
}
