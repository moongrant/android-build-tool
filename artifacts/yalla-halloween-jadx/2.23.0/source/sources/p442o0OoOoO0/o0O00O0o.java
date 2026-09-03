package p442o0OoOoO0;

import com.yalla.yalla.module.event.vm.EventSquareViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O00O0o extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ EventSquareViewModel f46234OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O00O0o(EventSquareViewModel eventSquareViewModel) {
        super(0);
        this.f46234OooO0Oo = eventSquareViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f46234OooO0Oo.sortEvent();
        return Unit.INSTANCE;
    }
}
