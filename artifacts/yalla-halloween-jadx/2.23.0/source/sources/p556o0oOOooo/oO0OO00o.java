package p556o0oOOooo;

import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.model.moment.MomentReplyModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class oO0OO00o extends Lambda implements Function1<ApiError, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentReplyModel f56133OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0OO00o(MomentReplyModel momentReplyModel) {
        super(1);
        this.f56133OooO0Oo = momentReplyModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiError apiError) {
        ApiError it = apiError;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f56133OooO0Oo.setSendProp(false);
        return Unit.INSTANCE;
    }
}
