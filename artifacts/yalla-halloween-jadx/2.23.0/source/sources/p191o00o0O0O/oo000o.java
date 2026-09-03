package p191o00o0O0O;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import p192o00o0OO.o0000OO0;

/* JADX INFO: loaded from: classes3.dex */
public final class oo000o implements o0000OO0<Executor> {

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final oo000o f38947OooO00o = new oo000o();
    }

    @Override // p625o0ooO000.o000
    public final Object get() {
        return new o0ooOOo(Executors.newSingleThreadExecutor());
    }
}
