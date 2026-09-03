package com.yalla.yalla.ui.fragment;

import androidx.fragment.app.FragmentActivity;
import com.yalla.yalla.model.PostCommentSonModel;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OOO0o extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ PostDetailCommentFragment f24537Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ PostCommentSonModel f24538Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OOO0o(PostDetailCommentFragment postDetailCommentFragment, PostCommentSonModel postCommentSonModel) {
        super(0);
        this.f24537Oooo0o = postDetailCommentFragment;
        this.f24538Oooo0oO = postCommentSonModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        UserInfoActivity.OooO00o oooO00o = UserInfoActivity.f23452o0ooOO0;
        FragmentActivity fragmentActivityRequireActivity = this.f24537Oooo0o.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
        UserInfoActivity.OooO00o.OooO0Oo(oooO00o, fragmentActivityRequireActivity, this.f24538Oooo0oO.getUserid() + "", false, 12);
        return null;
    }
}
