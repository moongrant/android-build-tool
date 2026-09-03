package p297o0O0OoOo;

import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.flv.OooO00o;
import com.google.android.exoplayer2.extractor.flv.OooO0O0;
import java.io.IOException;
import net.sqlcipher.database.SQLiteDatabase;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p296o0O0OoO0.Oooo000;
import p296o0O0OoO0.o000oOoO;
import p296o0O0OoO0.o0OO00O;
import p296o0O0OoO0.o0Oo0oo;
import p296o0O0OoO0.o0OoOo0;
import p296o0O0OoO0.oo0o0Oo;
import p318o0O0oOo.o000;
import p318o0O0oOo.o00000O0;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000O implements Extractor {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public long f35945OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public o0OoOo0 f35950OooO0o;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f35953OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f35954OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f35955OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f35956OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public boolean f35957OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public long f35958OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public OooO00o f35959OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public OooO0O0 f35960OooOOOo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o000 f35946OooO00o = new o000(4);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o000 f35947OooO0O0 = new o000(9);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o000 f35948OooO0OO = new o000(11);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o000 f35949OooO0Oo = new o000();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o0000OO0 f35951OooO0o0 = new o0000OO0();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f35952OooO0oO = 1;

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void OooO(o0OoOo0 o0oooo1) {
        this.f35950OooO0o = o0oooo1;
    }

    @RequiresNonNull({"extractorOutput"})
    public final void OooO00o() {
        if (this.f35957OooOOO) {
            return;
        }
        this.f35950OooO0o.OooOO0O(new oo0o0Oo.OooO0O0(-9223372036854775807L));
        this.f35957OooOOO = true;
    }

    public final o000 OooO0O0(o000oOoO o000oooo2) throws IOException {
        int i = this.f35956OooOO0o;
        o000 o000Var = this.f35949OooO0Oo;
        byte[] bArr = o000Var.f36661OooO00o;
        if (i > bArr.length) {
            o000Var.OooOoO0(new byte[Math.max(bArr.length * 2, i)], 0);
        } else {
            o000Var.OooOoOO(0);
        }
        this.f35949OooO0Oo.OooOoO(this.f35956OooOO0o);
        o000oooo2.readFully(this.f35949OooO0Oo.f36661OooO00o, 0, this.f35956OooOO0o);
        return this.f35949OooO0Oo;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void OooO0Oo(long j, long j2) {
        if (j == 0) {
            this.f35952OooO0oO = 1;
            this.f35953OooO0oo = false;
        } else {
            this.f35952OooO0oO = 3;
        }
        this.f35954OooOO0 = 0;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final boolean OooO0o(o000oOoO o000oooo2) throws IOException {
        Oooo000 oooo000 = (Oooo000) o000oooo2;
        oooo000.OooO0OO(this.f35946OooO00o.f36661OooO00o, 0, 3, false);
        this.f35946OooO00o.OooOoOO(0);
        if (this.f35946OooO00o.OooOOoo() != 4607062) {
            return false;
        }
        oooo000.OooO0OO(this.f35946OooO00o.f36661OooO00o, 0, 2, false);
        this.f35946OooO00o.OooOoOO(0);
        if ((this.f35946OooO00o.OooOo0O() & SQLiteDatabase.MAX_SQL_CACHE_SIZE) != 0) {
            return false;
        }
        oooo000.OooO0OO(this.f35946OooO00o.f36661OooO00o, 0, 4, false);
        this.f35946OooO00o.OooOoOO(0);
        int iOooO0Oo = this.f35946OooO00o.OooO0Oo();
        oooo000.f35895OooO0o = 0;
        oooo000.OooOOOO(iOooO0Oo, false);
        oooo000.OooO0OO(this.f35946OooO00o.f36661OooO00o, 0, 4, false);
        this.f35946OooO00o.OooOoOO(0);
        return this.f35946OooO00o.OooO0Oo() == 0;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:40:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:79:0x00b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x0009 A[SYNTHETIC] */
    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final int OooO0o0(o000oOoO o000oooo2, o0OO00O o0oo00o2) throws IOException {
        long j;
        boolean zOooO00o;
        boolean z;
        long j2;
        o00000O0.OooO0o(this.f35950OooO0o);
        while (true) {
            int i = this.f35952OooO0oO;
            boolean z2 = false;
            if (i == 1) {
                if (o000oooo2.OooO0O0(this.f35947OooO0O0.f36661OooO00o, 0, 9, true)) {
                    this.f35947OooO0O0.OooOoOO(0);
                    this.f35947OooO0O0.OooOoo0(4);
                    int iOooOOo0 = this.f35947OooO0O0.OooOOo0();
                    boolean z3 = (iOooOOo0 & 4) != 0;
                    z2 = (iOooOOo0 & 1) != 0;
                    if (z3 && this.f35959OooOOOO == null) {
                        this.f35959OooOOOO = new OooO00o(this.f35950OooO0o.OooO00o(8));
                    }
                    if (z2 && this.f35960OooOOOo == null) {
                        this.f35960OooOOOo = new OooO0O0(this.f35950OooO0o.OooO00o(9));
                    }
                    this.f35950OooO0o.OooOOO0();
                    this.f35954OooOO0 = (this.f35947OooO0O0.OooO0Oo() - 9) + 4;
                    this.f35952OooO0oO = 2;
                    z2 = true;
                }
                if (!z2) {
                    return -1;
                }
            } else if (i == 2) {
                o000oooo2.OooOO0(this.f35954OooOO0);
                this.f35954OooOO0 = 0;
                this.f35952OooO0oO = 3;
            } else if (i == 3) {
                if (o000oooo2.OooO0O0(this.f35948OooO0OO.f36661OooO00o, 0, 11, true)) {
                    this.f35948OooO0OO.OooOoOO(0);
                    this.f35955OooOO0O = this.f35948OooO0OO.OooOOo0();
                    this.f35956OooOO0o = this.f35948OooO0OO.OooOOoo();
                    this.f35958OooOOO0 = this.f35948OooO0OO.OooOOoo();
                    this.f35958OooOOO0 = (((long) (this.f35948OooO0OO.OooOOo0() << 24)) | this.f35958OooOOO0) * 1000;
                    this.f35948OooO0OO.OooOoo0(3);
                    this.f35952OooO0oO = 4;
                    z2 = true;
                }
                if (!z2) {
                    return -1;
                }
            } else {
                if (i != 4) {
                    throw new IllegalStateException();
                }
                if (this.f35953OooO0oo) {
                    j = this.f35945OooO + this.f35958OooOOO0;
                } else {
                    j = this.f35951OooO0o0.f35961OooO0O0 == -9223372036854775807L ? 0L : this.f35958OooOOO0;
                }
                int i2 = this.f35955OooOO0O;
                if (i2 == 8 && this.f35959OooOOOO != null) {
                    OooO00o();
                    zOooO00o = this.f35959OooOOOO.OooO00o(OooO0O0(o000oooo2), j);
                } else if (i2 != 9 || this.f35960OooOOOo == null) {
                    if (i2 != 18 || this.f35957OooOOO) {
                        o000oooo2.OooOO0(this.f35956OooOO0o);
                        zOooO00o = false;
                        z = false;
                    } else {
                        zOooO00o = this.f35951OooO0o0.OooO00o(OooO0O0(o000oooo2), j);
                        o0000OO0 o0000oo1 = this.f35951OooO0o0;
                        long j3 = o0000oo1.f35961OooO0O0;
                        if (j3 != -9223372036854775807L) {
                            this.f35950OooO0o.OooOO0O(new o0Oo0oo(o0000oo1.f35963OooO0Oo, o0000oo1.f35962OooO0OO, j3));
                            this.f35957OooOOO = true;
                        }
                    }
                    if (!this.f35953OooO0oo && zOooO00o) {
                        this.f35953OooO0oo = true;
                        if (this.f35951OooO0o0.f35961OooO0O0 == -9223372036854775807L) {
                            j2 = -this.f35958OooOOO0;
                        } else {
                            j2 = 0;
                        }
                        this.f35945OooO = j2;
                    }
                    this.f35954OooOO0 = 4;
                    this.f35952OooO0oO = 2;
                    if (z) {
                        return 0;
                    }
                } else {
                    OooO00o();
                    zOooO00o = this.f35960OooOOOo.OooO00o(OooO0O0(o000oooo2), j);
                }
                z = true;
                if (!this.f35953OooO0oo) {
                    this.f35953OooO0oo = true;
                    if (this.f35951OooO0o0.f35961OooO0O0 == -9223372036854775807L) {
                        j2 = -this.f35958OooOOO0;
                    } else {
                        j2 = 0;
                    }
                    this.f35945OooO = j2;
                }
                this.f35954OooOO0 = 4;
                this.f35952OooO0oO = 2;
                if (z) {
                    return 0;
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void release() {
    }
}
