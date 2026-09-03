package p105o000oo0o;

import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class o000OO0O extends Lambda implements Function0<List<String>> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o000O0Oo f35746OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OO0O(o000O0Oo o000o0oo2) {
        super(0);
        this.f35746OooO0Oo = o000o0oo2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<String> invoke() {
        List<String> list;
        Pair pair = (Pair) this.f35746OooO0Oo.f35733OooOO0.getValue();
        return (pair == null || (list = (List) pair.getFirst()) == null) ? new ArrayList() : list;
    }
}
