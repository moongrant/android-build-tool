package p100o000oOoO;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.OooO00o;

/* JADX INFO: loaded from: classes.dex */
public final class o00O0OO0 extends Lambda implements Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o0OO0O0 f29485Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o00oOoo f29486Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ List<Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit>> f29487Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0OO0(o0OO0O0 o0oo0o1, o00oOoo o00oooo2, List<Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit>> list) {
        super(3);
        this.f29485Oooo0o = o0oo0o1;
        this.f29486Oooo0oO = o00oooo2;
        this.f29487Oooo0oo = list;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(o00O000<?> o00o001, o0OO0o00 o0oo0o01, o0OO000o o0oo000o) {
        o00O000<?> o00o002 = o00o001;
        o0OO0o00 o0oo0o02 = o0oo0o01;
        o0OO000o o0oo000o2 = o0oo000o;
        OooO00o.OooO0O0(o00o002, "applier", o0oo0o02, "slots", o0oo000o2, "rememberManager");
        o0OO0O0 o0oo0o1 = this.f29485Oooo0o;
        List<Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit>> list = this.f29487Oooo0oo;
        o0OO0o00 o0oo0o00OooO0o0 = o0oo0o1.OooO0o0();
        try {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                list.get(i).invoke(o00o002, o0oo0o00OooO0o0, o0oo000o2);
            }
            Unit unit = Unit.INSTANCE;
            o0oo0o00OooO0o0.OooO0o();
            o0oo0o02.OooO0o0();
            o0OO0O0 o0oo0o2 = this.f29485Oooo0o;
            o0oo0o02.OooOo0o(o0oo0o2, this.f29486Oooo0oO.OooO0O0(o0oo0o2));
            o0oo0o02.OooOO0O();
            return unit;
        } catch (Throwable th) {
            o0oo0o00OooO0o0.OooO0o();
            throw th;
        }
    }
}
