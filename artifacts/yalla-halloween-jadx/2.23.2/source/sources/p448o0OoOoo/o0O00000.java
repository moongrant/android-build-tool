package p448o0OoOoo;

import com.yalla.yalla.module.event.vm.EventSquareViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O00000 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ EventSquareViewModel f47450OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O00000(EventSquareViewModel eventSquareViewModel) {
        super(0);
        this.f47450OooO0Oo = eventSquareViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f47450OooO0Oo.sortEvent();
        return Unit.INSTANCE;
    }
}
