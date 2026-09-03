package p105o000oo0o;

import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class o000OO00 extends Lambda implements Function0<String> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o000O0Oo f35745OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OO00(o000O0Oo o000o0oo2) {
        super(0);
        this.f35745OooO0Oo = o000o0oo2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        Pair pair = (Pair) this.f35745OooO0Oo.f35733OooOO0.getValue();
        if (pair != null) {
            return (String) pair.getSecond();
        }
        return null;
    }
}
