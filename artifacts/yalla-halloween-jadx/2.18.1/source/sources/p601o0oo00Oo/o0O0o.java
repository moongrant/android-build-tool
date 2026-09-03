package p601o0oo00Oo;

import com.yalla.yalla.model.CheckUserBlackResultModel;
import com.yalla.yalla.model.MomentDetailModel;
import com.yalla.yalla.ui.view.MomentDetailView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O0o extends Lambda implements Function1<CheckUserBlackResultModel, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ MomentDetailView f48187Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0o(MomentDetailView momentDetailView) {
        super(1);
        this.f48187Oooo0o = momentDetailView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(CheckUserBlackResultModel checkUserBlackResultModel) {
        CheckUserBlackResultModel checkUserBlackResultModel2 = checkUserBlackResultModel;
        MomentDetailModel momentDetailModel = this.f48187Oooo0o.f24941Oooo0oo;
        if (momentDetailModel != null) {
            momentDetailModel.setInHeBlack(checkUserBlackResultModel2 != null ? checkUserBlackResultModel2.getIsblack() : -1);
        }
        return Unit.INSTANCE;
    }
}
