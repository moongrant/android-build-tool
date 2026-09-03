package p521o0o0O0o0;

import com.yalla.yalla.model.CheckUserBlackResultModel;
import com.yalla.yalla.model.moment.MomentDetailModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o000 extends Lambda implements Function1<CheckUserBlackResultModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailModel f52899OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000(MomentDetailModel momentDetailModel) {
        super(1);
        this.f52899OooO0Oo = momentDetailModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(CheckUserBlackResultModel checkUserBlackResultModel) {
        CheckUserBlackResultModel checkUserBlackResultModel2 = checkUserBlackResultModel;
        this.f52899OooO0Oo.setInHeBlack(checkUserBlackResultModel2 != null ? checkUserBlackResultModel2.getIsblack() : -1);
        return Unit.INSTANCE;
    }
}
