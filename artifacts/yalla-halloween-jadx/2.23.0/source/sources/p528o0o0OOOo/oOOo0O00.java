package p528o0o0OOOo;

import com.yalla.yalla.model.moment.MomentDetailModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class oOOo0O00 extends Lambda implements Function1<MomentDetailModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Function1<MomentDetailModel, Unit> f54360OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentDetailModel f54361OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public oOOo0O00(Function1<? super MomentDetailModel, Unit> function1, MomentDetailModel momentDetailModel) {
        super(1);
        this.f54360OooO0Oo = function1;
        this.f54361OooO0o0 = momentDetailModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(MomentDetailModel momentDetailModel) {
        Function1<MomentDetailModel, Unit> function1 = this.f54360OooO0Oo;
        if (function1 != null) {
            function1.invoke(this.f54361OooO0o0);
        }
        o0OO000.OooO00o("103119");
        return Unit.INSTANCE;
    }
}
