package p601o0oo00Oo;

import com.yalla.yalla.common.model.ApiError;
import com.yalla.yalla.model.MomentDetailModel;
import com.yalla.yalla.ui.view.MomentDetailView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class o0oOo0O0 extends Lambda implements Function1<ApiError, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ MomentDetailView f48236Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0oOo0O0(MomentDetailView momentDetailView) {
        super(1);
        this.f48236Oooo0o = momentDetailView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiError apiError) {
        MomentDetailModel momentDetailModel;
        ApiError error = apiError;
        Intrinsics.checkNotNullParameter(error, "error");
        if (error.getCode() == 1034 && (momentDetailModel = this.f48236Oooo0o.f24941Oooo0oo) != null) {
            momentDetailModel.setIsblack(true);
        }
        return Unit.INSTANCE;
    }
}
