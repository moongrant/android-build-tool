package p100o000oOoO;

import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.OooO00o;

/* JADX INFO: loaded from: classes.dex */
public final class o00O0O0 extends Lambda implements Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ Object[] f29480Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0O0(Object[] objArr) {
        super(3);
        this.f29480Oooo0o = objArr;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(o00O000<?> o00o001, o0OO0o00 o0oo0o01, o0OO000o o0oo000o) {
        o00O000<?> o00o002 = o00o001;
        OooO00o.OooO0O0(o00o002, "applier", o0oo0o01, "<anonymous parameter 1>", o0oo000o, "<anonymous parameter 2>");
        int length = this.f29480Oooo0o.length;
        for (int i = 0; i < length; i++) {
            o00o002.OooO0OO(this.f29480Oooo0o[i]);
        }
        return Unit.INSTANCE;
    }
}
