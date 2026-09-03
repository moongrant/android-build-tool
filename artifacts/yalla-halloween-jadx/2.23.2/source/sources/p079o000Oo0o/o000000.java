package p079o000Oo0o;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.flv.OooO00o;
import androidx.media3.extractor.flv.OooO0O0;
import java.io.IOException;
import net.sqlcipher.database.SQLiteDatabase;
import o000OOoO.OooOO0O;
import o000OOoO.Oooo0;
import o000OOoO.Oooo000;
import o000OOoO.o000OOo;
import o000OOoO.o0Oo0oo;
import p080o000OoO.o000O000;
import p080o000OoO.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class o000000 implements Extractor {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public long f34890OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public Oooo0 f34895OooO0o;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f34898OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f34899OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f34900OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f34901OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public boolean f34902OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public long f34903OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public OooO00o f34904OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public OooO0O0 f34905OooOOOo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o000O000 f34891OooO00o = new o000O000(4);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o000O000 f34892OooO0O0 = new o000O000(9);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o000O000 f34893OooO0OO = new o000O000(11);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o000O000 f34894OooO0Oo = new o000O000();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o000000O f34896OooO0o0 = new o000000O();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f34897OooO0oO = 1;

    /* JADX WARN: Code duplicated, block: B:25:0x0061  */
    @Override // androidx.media3.extractor.Extractor
    public final int OooO00o(Oooo000 oooo000, o000OOo o000ooo2) throws IOException {
        long j;
        boolean z;
        boolean z2;
        o00Oo0.OooO0o(this.f34895OooO0o);
        while (true) {
            int i = this.f34897OooO0oO;
            boolean z3 = false;
            if (i == 1) {
                o000O000 o000o001 = this.f34892OooO0O0;
                if (((OooOO0O) oooo000).OooO0o(o000o001.f34962OooO00o, 0, 9, true)) {
                    o000o001.Oooo00O(0);
                    o000o001.Oooo00o(4);
                    int iOooOo0O = o000o001.OooOo0O();
                    boolean z4 = (iOooOo0O & 4) != 0;
                    z3 = (iOooOo0O & 1) != 0;
                    if (z4 && this.f34904OooOOOO == null) {
                        this.f34904OooOOOO = new OooO00o(this.f34895OooO0o.OooOOOO(8, 1));
                    }
                    if (z3 && this.f34905OooOOOo == null) {
                        this.f34905OooOOOo = new OooO0O0(this.f34895OooO0o.OooOOOO(9, 2));
                    }
                    this.f34895OooO0o.OooOO0O();
                    this.f34899OooOO0 = (o000o001.OooO0o() - 9) + 4;
                    this.f34897OooO0oO = 2;
                    z3 = true;
                }
                if (!z3) {
                    return -1;
                }
            } else if (i == 2) {
                ((OooOO0O) oooo000).OooOO0(this.f34899OooOO0);
                this.f34899OooOO0 = 0;
                this.f34897OooO0oO = 3;
            } else if (i == 3) {
                o000O000 o000o002 = this.f34893OooO0OO;
                if (((OooOO0O) oooo000).OooO0o(o000o002.f34962OooO00o, 0, 11, true)) {
                    o000o002.Oooo00O(0);
                    this.f34900OooOO0O = o000o002.OooOo0O();
                    this.f34901OooOO0o = o000o002.OooOo();
                    this.f34903OooOOO0 = o000o002.OooOo();
                    this.f34903OooOOO0 = (((long) (o000o002.OooOo0O() << 24)) | this.f34903OooOOO0) * 1000;
                    o000o002.Oooo00o(3);
                    this.f34897OooO0oO = 4;
                    z3 = true;
                }
                if (!z3) {
                    return -1;
                }
            } else {
                if (i != 4) {
                    throw new IllegalStateException();
                }
                boolean z5 = this.f34898OooO0oo;
                o000000O o000000o2 = this.f34896OooO0o0;
                if (z5) {
                    j = this.f34890OooO + this.f34903OooOOO0;
                } else {
                    j = o000000o2.f34906OooO0O0 == -9223372036854775807L ? 0L : this.f34903OooOOO0;
                }
                int i2 = this.f34900OooOO0O;
                if (i2 != 8 || this.f34904OooOOOO == null) {
                    if (i2 == 9 && this.f34905OooOOOo != null) {
                        if (!this.f34902OooOOO) {
                            this.f34895OooO0o.OooO(new o000OOoO.o000000.OooO0O0(-9223372036854775807L));
                            this.f34902OooOOO = true;
                        }
                        OooO0O0 oooO0O0 = this.f34905OooOOOo;
                        o000O000 o000o000OooO0Oo = OooO0Oo((OooOO0O) oooo000);
                        if (oooO0O0.OooO00o(o000o000OooO0Oo) && oooO0O0.OooO0O0(j, o000o000OooO0Oo)) {
                            z = true;
                        }
                        z2 = true;
                    } else if (i2 != 18 || this.f34902OooOOO) {
                        ((OooOO0O) oooo000).OooOO0(this.f34901OooOO0o);
                        z = false;
                        z2 = false;
                    } else {
                        o000O000 o000o000OooO0Oo2 = OooO0Oo((OooOO0O) oooo000);
                        o000000o2.getClass();
                        o000000o2.OooO00o(j, o000o000OooO0Oo2);
                        long j2 = o000000o2.f34906OooO0O0;
                        if (j2 != -9223372036854775807L) {
                            this.f34895OooO0o.OooO(new o0Oo0oo(j2, o000000o2.f34908OooO0Oo, o000000o2.f34907OooO0OO));
                            this.f34902OooOOO = true;
                        }
                    }
                    z = false;
                    z2 = true;
                } else {
                    if (!this.f34902OooOOO) {
                        this.f34895OooO0o.OooO(new o000OOoO.o000000.OooO0O0(-9223372036854775807L));
                        this.f34902OooOOO = true;
                    }
                    OooO00o oooO00o = this.f34904OooOOOO;
                    o000O000 o000o000OooO0Oo3 = OooO0Oo((OooOO0O) oooo000);
                    oooO00o.OooO00o(o000o000OooO0Oo3);
                    if (oooO00o.OooO0O0(j, o000o000OooO0Oo3)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    z2 = true;
                }
                if (!this.f34898OooO0oo && z) {
                    this.f34898OooO0oo = true;
                    this.f34890OooO = o000000o2.f34906OooO0O0 == -9223372036854775807L ? -this.f34903OooOOO0 : 0L;
                }
                this.f34899OooOO0 = 4;
                this.f34897OooO0oO = 2;
                if (z2) {
                    return 0;
                }
            }
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public final void OooO0O0(long j, long j2) {
        if (j == 0) {
            this.f34897OooO0oO = 1;
            this.f34898OooO0oo = false;
        } else {
            this.f34897OooO0oO = 3;
        }
        this.f34899OooOO0 = 0;
    }

    @Override // androidx.media3.extractor.Extractor
    public final void OooO0OO(Oooo0 oooo0) {
        this.f34895OooO0o = oooo0;
    }

    public final o000O000 OooO0Oo(OooOO0O oooOO0O) throws IOException {
        int i = this.f34901OooOO0o;
        o000O000 o000o001 = this.f34894OooO0Oo;
        byte[] bArr = o000o001.f34962OooO00o;
        if (i > bArr.length) {
            o000o001.OooOooo(0, new byte[Math.max(bArr.length * 2, i)]);
        } else {
            o000o001.Oooo00O(0);
        }
        o000o001.Oooo000(this.f34901OooOO0o);
        oooOO0O.OooO0o(o000o001.f34962OooO00o, 0, this.f34901OooOO0o, false);
        return o000o001;
    }

    @Override // androidx.media3.extractor.Extractor
    public final boolean OooO0o(Oooo000 oooo000) throws IOException {
        o000O000 o000o001 = this.f34891OooO00o;
        OooOO0O oooOO0O = (OooOO0O) oooo000;
        oooOO0O.OooO0OO(o000o001.f34962OooO00o, 0, 3, false);
        o000o001.Oooo00O(0);
        if (o000o001.OooOo() != 4607062) {
            return false;
        }
        oooOO0O.OooO0OO(o000o001.f34962OooO00o, 0, 2, false);
        o000o001.Oooo00O(0);
        if ((o000o001.OooOoOO() & SQLiteDatabase.MAX_SQL_CACHE_SIZE) != 0) {
            return false;
        }
        oooOO0O.OooO0OO(o000o001.f34962OooO00o, 0, 4, false);
        o000o001.Oooo00O(0);
        int iOooO0o = o000o001.OooO0o();
        oooOO0O.f34679OooO0o = 0;
        oooOO0O.OooOO0o(iOooO0o, false);
        oooOO0O.OooO0OO(o000o001.f34962OooO00o, 0, 4, false);
        o000o001.Oooo00O(0);
        return o000o001.OooO0o() == 0;
    }

    @Override // androidx.media3.extractor.Extractor
    public final void release() {
    }
}
