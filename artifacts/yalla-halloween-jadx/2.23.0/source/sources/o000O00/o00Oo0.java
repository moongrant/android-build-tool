package o000O00;

import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class o00Oo0 extends Lambda implements Function0<List<String>> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00O0O f34405OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00Oo0(o00O0O o00o0o2) {
        super(0);
        this.f34405OooO0Oo = o00o0o2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<String> invoke() {
        List<String> list;
        Pair pair = (Pair) this.f34405OooO0Oo.f34395OooOO0.getValue();
        return (pair == null || (list = (List) pair.getFirst()) == null) ? new ArrayList() : list;
    }
}
