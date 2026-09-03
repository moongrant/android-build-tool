package p587o0oOoo0O;

import com.yalla.yalla.ui.vm.event.EventSquareViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class oO0Oo0oo extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ EventSquareViewModel f47067Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0Oo0oo(EventSquareViewModel eventSquareViewModel) {
        super(0);
        this.f47067Oooo0o = eventSquareViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f47067Oooo0o.sortEvent();
        return Unit.INSTANCE;
    }
}
