package p538o0o0Oo0;

import com.yalla.yalla.common.model.ApiError;
import com.yalla.yalla.ui.activity.moment.MomentMessageListActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class o00000OO extends Lambda implements Function1<ApiError, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ MomentMessageListActivity f43913Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00000OO(MomentMessageListActivity momentMessageListActivity) {
        super(1);
        this.f43913Oooo0o = momentMessageListActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiError apiError) {
        ApiError it = apiError;
        Intrinsics.checkNotNullParameter(it, "it");
        MomentMessageListActivity momentMessageListActivity = this.f43913Oooo0o;
        MomentMessageListActivity.OooO00o oooO00o = MomentMessageListActivity.f22334OoooooO;
        momentMessageListActivity.OooOoo().f50370OooO0O0.setClickableOnSend(true);
        return Unit.INSTANCE;
    }
}
