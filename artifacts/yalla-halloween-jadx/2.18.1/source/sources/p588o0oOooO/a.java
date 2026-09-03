package p588o0oOooO;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p100o000oOoO.o0O00OO;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f47135Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o0O00OO<Integer> f47136Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(int i, o0O00OO<Integer> o0o00oo2) {
        super(0);
        this.f47135Oooo0o = i;
        this.f47136Oooo0oO = o0o00oo2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f47136Oooo0oO.setValue(Integer.valueOf(this.f47135Oooo0o));
        return Unit.INSTANCE;
    }
}
