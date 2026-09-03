package p537o0o0OoO;

import com.yalla.yalla.model.ItemVipModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0oo0o extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Function1<ItemVipModel, Unit> f55383OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ ItemVipModel f55384OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o0O0oo0o(Function1<? super ItemVipModel, Unit> function1, ItemVipModel itemVipModel) {
        super(0);
        this.f55383OooO0Oo = function1;
        this.f55384OooO0o0 = itemVipModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f55383OooO0Oo.invoke(this.f55384OooO0o0);
        return Unit.INSTANCE;
    }
}
