package com.yalla.yalla.ui.fragment;

import android.view.View;
import com.yalla.yalla.model.PostCommentDetailModel;
import com.yalla.yalla.ui.activity.moment.PostDetailCommentSonListActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OoOo0 extends p654o0ooo.o00Oo0 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ PostDetailCommentFragment f24543Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ PostCommentDetailModel f24544OoooO00;

    public o0OoOo0(PostDetailCommentFragment postDetailCommentFragment, PostCommentDetailModel postCommentDetailModel) {
        this.f24543Oooo = postDetailCommentFragment;
        this.f24544OoooO00 = postCommentDetailModel;
    }

    @Override // p654o0ooo.o00Oo0
    public final void OooO00o(@NotNull View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        PostDetailCommentSonListActivity.f22473o0ooOOo.OooO00o(this.f24543Oooo.getActivity(), true, this.f24543Oooo.mPostDetailModel, this.f24544OoooO00, null);
    }
}
