package p225o00oOo;

import com.google.android.exoplayer2.ParserException;
import java.io.EOFException;
import java.io.IOException;
import p209o00o0oo0.o00O00o0;
import p245o00oo0o.o00O000o;
import p245o00oo0o.o00Oo00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o00Oo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f39782OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public long f39783OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f39784OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f39785OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f39787OooO0o0;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int[] f39786OooO0o = new int[255];

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final o00Oo00 f39788OooO0oO = new o00Oo00(255);

    public final boolean OooO00o(o00O00o0 o00o00o1, boolean z) throws IOException {
        boolean zOooO0Oo;
        boolean zOooO0Oo2;
        this.f39782OooO00o = 0;
        this.f39783OooO0O0 = 0L;
        this.f39784OooO0OO = 0;
        this.f39785OooO0Oo = 0;
        this.f39787OooO0o0 = 0;
        o00Oo00 o00oo00 = this.f39788OooO0oO;
        o00oo00.OooOooO(27);
        try {
            zOooO0Oo = o00o00o1.OooO0Oo(o00oo00.f40591OooO00o, 0, 27, z);
        } catch (EOFException e) {
            if (!z) {
                throw e;
            }
            zOooO0Oo = false;
        }
        if (!zOooO0Oo || o00oo00.OooOo0o() != 1332176723) {
            return false;
        }
        if (o00oo00.OooOo0O() != 0) {
            if (z) {
                return false;
            }
            throw ParserException.OooO0OO("unsupported bit stream revision");
        }
        this.f39782OooO00o = o00oo00.OooOo0O();
        this.f39783OooO0O0 = o00oo00.OooOO0();
        o00oo00.OooOO0o();
        o00oo00.OooOO0o();
        o00oo00.OooOO0o();
        int iOooOo0O = o00oo00.OooOo0O();
        this.f39784OooO0OO = iOooOo0O;
        this.f39785OooO0Oo = iOooOo0O + 27;
        o00oo00.OooOooO(iOooOo0O);
        try {
            zOooO0Oo2 = o00o00o1.OooO0Oo(o00oo00.f40591OooO00o, 0, this.f39784OooO0OO, z);
        } catch (EOFException e2) {
            if (!z) {
                throw e2;
            }
            zOooO0Oo2 = false;
        }
        if (!zOooO0Oo2) {
            return false;
        }
        for (int i = 0; i < this.f39784OooO0OO; i++) {
            int iOooOo0O2 = o00oo00.OooOo0O();
            this.f39786OooO0o[i] = iOooOo0O2;
            this.f39787OooO0o0 += iOooOo0O2;
        }
        return true;
    }

    public final boolean OooO0O0(o00O00o0 o00o00o1, long j) throws IOException {
        boolean zOooO0Oo;
        o00O000o.OooO00o(o00o00o1.f39532OooO0Oo == o00o00o1.OooO0oo());
        o00Oo00 o00oo00 = this.f39788OooO0oO;
        o00oo00.OooOooO(4);
        while (true) {
            if (j != -1 && o00o00o1.f39532OooO0Oo + 4 >= j) {
                break;
            }
            try {
                zOooO0Oo = o00o00o1.OooO0Oo(o00oo00.f40591OooO00o, 0, 4, true);
            } catch (EOFException unused) {
                zOooO0Oo = false;
            }
            if (!zOooO0Oo) {
                break;
            }
            o00oo00.Oooo00O(0);
            if (o00oo00.OooOo0o() == 1332176723) {
                o00o00o1.f39533OooO0o = 0;
                return true;
            }
            o00o00o1.OooOO0(1);
        }
        do {
            if (j != -1 && o00o00o1.f39532OooO0Oo >= j) {
                break;
            }
        } while (o00o00o1.OooOOOo(1) != -1);
        return false;
    }
}
