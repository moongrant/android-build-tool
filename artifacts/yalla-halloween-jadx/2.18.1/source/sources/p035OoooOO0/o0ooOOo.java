package p035OoooOO0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class o0ooOOo extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o0OOO0o f3661Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0ooOOo(o0OOO0o o0ooo0o2) {
        super(0);
        this.f3661Oooo0o = o0ooo0o2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o0OOO0o o0ooo0o2 = this.f3661Oooo0o;
        o0ooo0o2.f3645OoooO.setValue(Boolean.valueOf(!((Boolean) o0ooo0o2.f3645OoooO.getValue()).booleanValue()));
        return Unit.INSTANCE;
    }
}
