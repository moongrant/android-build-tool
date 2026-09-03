package p535o0o0Oo0;

import com.yalla.yalla.model.moment.MomentDetailModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import o0oo0000.OooO00o;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO00 extends Lambda implements Function1<MomentDetailModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Function1<MomentDetailModel, Unit> f54199OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentDetailModel f54200OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public oOO00(Function1<? super MomentDetailModel, Unit> function1, MomentDetailModel momentDetailModel) {
        super(1);
        this.f54199OooO0Oo = function1;
        this.f54200OooO0o0 = momentDetailModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(MomentDetailModel momentDetailModel) {
        Function1<MomentDetailModel, Unit> function1 = this.f54199OooO0Oo;
        if (function1 != null) {
            function1.invoke(this.f54200OooO0o0);
        }
        OooO00o.OooO0O0("103119");
        return Unit.INSTANCE;
    }
}
