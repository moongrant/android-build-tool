package p556o0oOOooo;

import android.app.Activity;
import android.content.Context;
import com.yalla.yalla.model.moment.MomentReplyModel;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import com.yalla.yalla.ui.view.moment.MomentReplyItemView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class oO00OOO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentReplyItemView f56106OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentReplyModel f56107OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO00OOO(MomentReplyItemView momentReplyItemView, MomentReplyModel momentReplyModel) {
        super(0);
        this.f56106OooO0Oo = momentReplyItemView;
        this.f56107OooO0o0 = momentReplyModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        UserInfoActivity.OooO00o oooO00o = UserInfoActivity.f27240Oooo0o;
        Context context = this.f56106OooO0Oo.getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.app.Activity");
        UserInfoActivity.OooO00o.OooO0OO(oooO00o, (Activity) context, this.f56107OooO0o0.getParentUserId(), false, 12);
        return null;
    }
}
