package p515o0o0O0O0;

import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.model.moment.MomentDetailModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oo000o extends Lambda implements Function1<ApiError, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailModel f51865OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo000o(MomentDetailModel momentDetailModel) {
        super(1);
        this.f51865OooO0Oo = momentDetailModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiError apiError) {
        MomentDetailModel momentDetailModel;
        ApiError error = apiError;
        Intrinsics.checkNotNullParameter(error, "error");
        if (error.getCode() == 1034 && (momentDetailModel = this.f51865OooO0Oo) != null) {
            momentDetailModel.setIsblack(true);
        }
        return Unit.INSTANCE;
    }
}
