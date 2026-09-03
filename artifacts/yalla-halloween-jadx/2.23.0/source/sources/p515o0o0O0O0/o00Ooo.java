package p515o0o0O0O0;

import com.code.android.util.o000O00O;
import com.yalla.yalla.model.moment.MomentDetailModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class o00Ooo extends Lambda implements Function1<Object, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailModel f51820OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00Ooo(MomentDetailModel momentDetailModel) {
        super(1);
        this.f51820OooO0Oo = momentDetailModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Object obj) {
        MomentDetailModel momentDetailModel = this.f51820OooO0Oo;
        if (momentDetailModel != null) {
            momentDetailModel.setIsblack(true);
        }
        o000O00O.OooO00o(oO00OOo0.post_operation_success);
        return Unit.INSTANCE;
    }
}
