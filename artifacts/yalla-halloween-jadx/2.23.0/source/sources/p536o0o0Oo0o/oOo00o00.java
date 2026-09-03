package p536o0o0Oo0o;

import com.yalla.yalla.model.user.UserMomentListTypeModel;
import com.yalla.yalla.ui.vm.moment.MomentUserListVM;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class oOo00o00 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentUserListVM f55255OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Function1<UserMomentListTypeModel, Unit> f55256OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public oOo00o00(MomentUserListVM momentUserListVM, Function1<? super UserMomentListTypeModel, Unit> function1) {
        super(0);
        this.f55255OooO0Oo = momentUserListVM;
        this.f55256OooO0o0 = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o0OO000.OooO0O0("103074", MapsKt.mapOf(TuplesKt.to("type", 2)));
        MomentUserListVM momentUserListVM = this.f55255OooO0Oo;
        momentUserListVM.getScreenCurrent().setValue(momentUserListVM.getScreenList().get(2));
        momentUserListVM.setLayoutCoordinates(null);
        Function1<UserMomentListTypeModel, Unit> function1 = this.f55256OooO0o0;
        if (function1 != null) {
            function1.invoke(momentUserListVM.getScreenCurrent().getValue());
        }
        return Unit.INSTANCE;
    }
}
