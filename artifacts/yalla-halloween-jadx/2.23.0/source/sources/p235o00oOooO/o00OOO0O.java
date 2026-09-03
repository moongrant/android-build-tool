package p235o00oOooO;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public interface o00OOO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooO00o f40296OooO00o = new OooO00o();

    public class OooO00o implements o00OOO0O {
        @Override // p235o00oOooO.o00OOO0O
        public final long OooO00o() {
            throw new NoSuchElementException();
        }

        @Override // p235o00oOooO.o00OOO0O
        public final long OooO0O0() {
            throw new NoSuchElementException();
        }

        @Override // p235o00oOooO.o00OOO0O
        public final boolean next() {
            return false;
        }
    }

    long OooO00o();

    long OooO0O0();

    boolean next();
}
