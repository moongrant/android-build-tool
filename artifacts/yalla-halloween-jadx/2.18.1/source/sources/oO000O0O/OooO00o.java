package oO000O0O;

import java.security.SecureRandom;
import org.bouncycastle.crypto.prng.SP800SecureRandom;
import org.bouncycastle.crypto.prng.X931SecureRandom;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO00o implements OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final SecureRandom f52555OooO00o;

    /* JADX INFO: renamed from: oO000O0O.OooO00o$OooO00o, reason: collision with other inner class name */
    public class C0432OooO00o implements OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ int f52556OooO00o;

        public C0432OooO00o(int i) {
            this.f52556OooO00o = i;
        }

        @Override // oO000O0O.OooO0OO
        public final byte[] OooO00o() {
            SecureRandom secureRandom = OooO00o.this.f52555OooO00o;
            if (!(secureRandom instanceof SP800SecureRandom) && !(secureRandom instanceof X931SecureRandom)) {
                return secureRandom.generateSeed((this.f52556OooO00o + 7) / 8);
            }
            byte[] bArr = new byte[(this.f52556OooO00o + 7) / 8];
            secureRandom.nextBytes(bArr);
            return bArr;
        }

        @Override // oO000O0O.OooO0OO
        public final int OooO0O0() {
            return this.f52556OooO00o;
        }
    }

    public OooO00o(SecureRandom secureRandom) {
        this.f52555OooO00o = secureRandom;
    }

    @Override // oO000O0O.OooO0o
    public final OooO0OO get(int i) {
        return new C0432OooO00o(i);
    }
}
