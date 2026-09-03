package p257o00ooOO0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p100o000oOoO.o0O00OO;

/* JADX INFO: loaded from: classes.dex */
public final class o0O00O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f34409Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ boolean f34410Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o0O00OO<Boolean> f34411Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ Function1<Integer, Unit> f34412Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o0O00O(boolean z, o0O00OO<Boolean> o0o00oo2, Function1<? super Integer, Unit> function1, int i) {
        super(0);
        this.f34410Oooo0o = z;
        this.f34411Oooo0oO = o0o00oo2;
        this.f34412Oooo0oo = function1;
        this.f34409Oooo = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (this.f34410Oooo0o) {
            this.f34411Oooo0oO.setValue(Boolean.FALSE);
        }
        this.f34412Oooo0oo.invoke(Integer.valueOf(this.f34409Oooo));
        return Unit.INSTANCE;
    }
}
