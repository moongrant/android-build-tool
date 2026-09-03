package com.yalla.yalla.ui.screen.moment.media;

import android.app.Activity;
import com.yalla.yalla.model.moment.MomentCommentDetailModel;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO00o extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Activity f28878OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentCommentDetailModel f28879OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO00o(Activity activity, MomentCommentDetailModel momentCommentDetailModel) {
        super(0);
        this.f28878OooO0Oo = activity;
        this.f28879OooO0o0 = momentCommentDetailModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        UserInfoActivity.OooO00o.OooO0OO(UserInfoActivity.f26775Oooo0o, this.f28878OooO0Oo, String.valueOf(this.f28879OooO0o0.getUserid()), false, 12);
        return Unit.INSTANCE;
    }
}
