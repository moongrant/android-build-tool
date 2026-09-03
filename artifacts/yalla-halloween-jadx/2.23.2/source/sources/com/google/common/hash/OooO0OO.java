package com.google.common.hash;

import com.google.common.base.o000OOo;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public final class OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final o000OOo<com.google.common.hash.OooO0O0> f19244OooO00o;

    public class OooO00o implements o000OOo<com.google.common.hash.OooO0O0> {
        @Override // com.google.common.base.o000OOo
        public final com.google.common.hash.OooO0O0 get() {
            return new OooO0o();
        }
    }

    public class OooO0O0 implements o000OOo<com.google.common.hash.OooO0O0> {
        @Override // com.google.common.base.o000OOo
        public final com.google.common.hash.OooO0O0 get() {
            return new C0235OooO0OO();
        }
    }

    /* JADX INFO: renamed from: com.google.common.hash.OooO0OO$OooO0OO, reason: collision with other inner class name */
    public static final class C0235OooO0OO extends AtomicLong implements com.google.common.hash.OooO0O0 {
        @Override // com.google.common.hash.OooO0O0
        public final void OooO00o(long j) {
            getAndAdd(j);
        }
    }

    static {
        o000OOo<com.google.common.hash.OooO0O0> oooO0O0;
        try {
            new OooO0o();
            oooO0O0 = new OooO00o();
        } catch (Throwable unused) {
            oooO0O0 = new OooO0O0();
        }
        f19244OooO00o = oooO0O0;
    }
}
