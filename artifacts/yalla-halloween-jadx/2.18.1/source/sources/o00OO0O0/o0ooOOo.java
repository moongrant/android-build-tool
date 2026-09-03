package o00OO0O0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class o0ooOOo extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o0OO00O f31613Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0ooOOo(o0OO00O o0oo00o2) {
        super(0);
        this.f31613Oooo0o = o0oo00o2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f31613Oooo0o.notifyDataSetChanged();
        return Unit.INSTANCE;
    }
}
