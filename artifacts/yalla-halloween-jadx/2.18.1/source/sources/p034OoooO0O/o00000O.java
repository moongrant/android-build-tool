package p034OoooO0O;

import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p100o000oOoO.o;
import p100o000oOoO.o00OO0O0;
import p100o000oOoO.o00OOOOo;
import p100o000oOoO.o0O0O0o0;

/* JADX INFO: loaded from: classes.dex */
public final class o00000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o0O0O0o0<o00000O0> f3480OooO00o = (o00OOOOo) o00OO0O0.OooO0O0(o.f29323OooO00o, OooO00o.f3481Oooo0o);

    public static final class OooO00o extends Lambda implements Function0<o00000O0> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO00o f3481Oooo0o = new OooO00o();

        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ o00000O0 invoke() {
            return null;
        }
    }

    public static final boolean OooO00o(@Nullable o00000O0 o00000o1, long j) {
        Map<Long, oo000o> mapOooO0oo;
        if (o00000o1 == null || (mapOooO0oo = o00000o1.OooO0oo()) == null) {
            return false;
        }
        return mapOooO0oo.containsKey(Long.valueOf(j));
    }
}
