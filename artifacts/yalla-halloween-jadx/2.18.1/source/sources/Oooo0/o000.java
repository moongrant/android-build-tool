package Oooo0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p100o000oOoO.o0O00OO;

/* JADX INFO: loaded from: classes.dex */
public final class o000 extends Lambda implements Function1<androidx.compose.foundation.lazy.layout.o00Ooo, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o0O00OO<androidx.compose.foundation.lazy.layout.o00Ooo> f536Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000(o0O00OO<androidx.compose.foundation.lazy.layout.o00Ooo> o0o00oo2) {
        super(1);
        this.f536Oooo0o = o0o00oo2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(androidx.compose.foundation.lazy.layout.o00Ooo o00ooo2) {
        this.f536Oooo0o.setValue(o00ooo2);
        return Unit.INSTANCE;
    }
}
