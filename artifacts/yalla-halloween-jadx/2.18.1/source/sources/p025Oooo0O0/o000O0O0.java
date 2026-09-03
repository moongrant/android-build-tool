package p025Oooo0O0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p100o000oOoO.oO0Oo;

/* JADX INFO: loaded from: classes.dex */
public final class o000O0O0 extends Lambda implements Function1<Float, Float> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ oO0Oo<Function1<Float, Float>> f1537Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o000O0O0(oO0Oo<? extends Function1<? super Float, Float>> oo0oo) {
        super(1);
        this.f1537Oooo0o = oo0oo;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Float invoke(Float f) {
        return this.f1537Oooo0o.getValue().invoke(Float.valueOf(f.floatValue()));
    }
}
