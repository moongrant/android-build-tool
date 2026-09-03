package o000O00;

import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class o00oO0o extends Lambda implements Function0<String> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00O0O f34407OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00oO0o(o00O0O o00o0o2) {
        super(0);
        this.f34407OooO0Oo = o00o0o2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        Pair pair = (Pair) this.f34407OooO0Oo.f34395OooOO0.getValue();
        if (pair != null) {
            return (String) pair.getSecond();
        }
        return null;
    }
}
