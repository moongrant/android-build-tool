package p100o000oOoO;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p036OoooOOO.oo0o0Oo;

/* JADX INFO: loaded from: classes.dex */
public final class o0O extends Lambda implements Function1<Object, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ oo0O f29512Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ oo0o0Oo<Object> f29513Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O(oo0O oo0o, oo0o0Oo<Object> oo0o0oo) {
        super(1);
        this.f29512Oooo0o = oo0o;
        this.f29513Oooo0oO = oo0o0oo;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Object value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f29512Oooo0o.OooOO0o(value);
        oo0o0Oo<Object> oo0o0oo = this.f29513Oooo0oO;
        if (oo0o0oo != null) {
            oo0o0oo.add(value);
        }
        return Unit.INSTANCE;
    }
}
