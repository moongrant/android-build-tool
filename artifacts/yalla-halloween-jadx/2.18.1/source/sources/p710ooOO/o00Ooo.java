package p710ooOO;

import androidx.compose.ui.focus.FocusStateImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class o00Ooo extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o00oO0o f53467Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00Ooo(o00oO0o o00oo0o2) {
        super(0);
        this.f53467Oooo0o = o00oo0o2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o00oO0o o00oo0o2 = this.f53467Oooo0o;
        if (o00oo0o2.f53468Oooo.OooO()) {
            o00oo0o2.f53469Oooo0o.invoke(FocusStateImpl.Inactive);
        }
        return Unit.INSTANCE;
    }
}
