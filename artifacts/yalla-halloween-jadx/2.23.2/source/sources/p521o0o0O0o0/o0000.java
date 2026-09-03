package p521o0o0O0o0;

import com.code.android.util.o000O00;
import com.yalla.yalla.model.moment.MomentDetailModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000 extends Lambda implements Function1<Object, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailModel f52900OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000(MomentDetailModel momentDetailModel) {
        super(1);
        this.f52900OooO0Oo = momentDetailModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Object obj) {
        MomentDetailModel momentDetailModel = this.f52900OooO0Oo;
        if (momentDetailModel != null) {
            momentDetailModel.setIsblack(true);
        }
        o000O00.OooO00o(o000000.post_operation_success);
        return Unit.INSTANCE;
    }
}
