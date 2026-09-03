package p139o00OOOo0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class o0000 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o00000O0 f31734Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Function2<String, o00000O0, Unit> f31735Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o0000(o00000O0 o00000o1, Function2<? super String, ? super o00000O0, Unit> function2) {
        super(0);
        this.f31734Oooo0o = o00000o1;
        this.f31735Oooo0oO = function2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f31734Oooo0o.f31748OooO00o.setValue(Boolean.TRUE);
        this.f31735Oooo0oO.invoke(this.f31734Oooo0o.f31751OooO0Oo.getValue(), this.f31734Oooo0o);
        return Unit.INSTANCE;
    }
}
