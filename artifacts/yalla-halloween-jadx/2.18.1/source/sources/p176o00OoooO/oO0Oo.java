package p176o00OoooO;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p100o000oOoO.o0O00OO;

/* JADX INFO: loaded from: classes.dex */
public final class oO0Oo extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ Function1<String, Unit> f32882Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o0O00OO<String> f32883Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public oO0Oo(Function1<? super String, Unit> function1, o0O00OO<String> o0o00oo2) {
        super(0);
        this.f32882Oooo0o = function1;
        this.f32883Oooo0oO = o0o00oo2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f32882Oooo0o.invoke(this.f32883Oooo0oO.getValue());
        return Unit.INSTANCE;
    }
}
