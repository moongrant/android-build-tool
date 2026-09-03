package p029Oooo0oO;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class o00oOoo extends Lambda implements Function1<Integer, Integer> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o00O000 f2413Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ List<oo0O> f2414Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00oOoo(o00O000 o00o001, List<oo0O> list) {
        super(1);
        this.f2413Oooo0o = o00o001;
        this.f2414Oooo0oO = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Integer invoke(Integer num) {
        int iIntValue = num.intValue();
        return Integer.valueOf(this.f2413Oooo0o.f2278OooO0O0 ? this.f2414Oooo0oO.get(iIntValue).f2486OooO0o0 : this.f2414Oooo0oO.get(iIntValue).f2485OooO0o);
    }
}
