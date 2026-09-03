package Oooo0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p100o000oOoO.o0O00OO;

/* JADX INFO: loaded from: classes.dex */
public final class o0OOO0o extends Lambda implements Function0<Boolean> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o0O00OO<Boolean> f724Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Function0<Boolean> f725Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OOO0o(o0O00OO<Boolean> o0o00oo2, Function0<Boolean> function0) {
        super(0);
        this.f724Oooo0o = o0o00oo2;
        this.f725Oooo0oO = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(this.f724Oooo0o.getValue().booleanValue() || this.f725Oooo0oO.invoke().booleanValue());
    }
}
