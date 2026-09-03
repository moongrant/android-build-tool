package p679oooo00o;

import androidx.media3.common.ParserException;
import java.io.EOFException;
import java.io.IOException;
import o000OOoO.OooOO0O;
import p080o000OoO.o000O000;
import p080o000OoO.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class oO0O000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f60402OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public long f60403OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f60404OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f60405OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f60407OooO0o0;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int[] f60406OooO0o = new int[255];

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final o000O000 f60408OooO0oO = new o000O000(255);

    public final boolean OooO00o(OooOO0O oooOO0O, boolean z) throws IOException {
        boolean zOooO0OO;
        boolean zOooO0OO2;
        this.f60402OooO00o = 0;
        this.f60403OooO0O0 = 0L;
        this.f60404OooO0OO = 0;
        this.f60405OooO0Oo = 0;
        this.f60407OooO0o0 = 0;
        o000O000 o000o001 = this.f60408OooO0oO;
        o000o001.OooOooO(27);
        try {
            zOooO0OO = oooOO0O.OooO0OO(o000o001.f34962OooO00o, 0, 27, z);
        } catch (EOFException e) {
            if (!z) {
                throw e;
            }
            zOooO0OO = false;
        }
        if (!zOooO0OO || o000o001.OooOo0o() != 1332176723) {
            return false;
        }
        if (o000o001.OooOo0O() != 0) {
            if (z) {
                return false;
            }
            throw ParserException.OooO0O0("unsupported bit stream revision");
        }
        this.f60402OooO00o = o000o001.OooOo0O();
        this.f60403OooO0O0 = o000o001.OooOO0();
        o000o001.OooOO0o();
        o000o001.OooOO0o();
        o000o001.OooOO0o();
        int iOooOo0O = o000o001.OooOo0O();
        this.f60404OooO0OO = iOooOo0O;
        this.f60405OooO0Oo = iOooOo0O + 27;
        o000o001.OooOooO(iOooOo0O);
        try {
            zOooO0OO2 = oooOO0O.OooO0OO(o000o001.f34962OooO00o, 0, this.f60404OooO0OO, z);
        } catch (EOFException e2) {
            if (!z) {
                throw e2;
            }
            zOooO0OO2 = false;
        }
        if (!zOooO0OO2) {
            return false;
        }
        for (int i = 0; i < this.f60404OooO0OO; i++) {
            int iOooOo0O2 = o000o001.OooOo0O();
            this.f60406OooO0o[i] = iOooOo0O2;
            this.f60407OooO0o0 += iOooOo0O2;
        }
        return true;
    }

    public final boolean OooO0O0(OooOO0O oooOO0O, long j) throws IOException {
        boolean zOooO0OO;
        o00Oo0.OooO00o(oooOO0O.f34678OooO0Oo == oooOO0O.OooO0oo());
        o000O000 o000o001 = this.f60408OooO0oO;
        o000o001.OooOooO(4);
        while (true) {
            if (j != -1 && oooOO0O.f34678OooO0Oo + 4 >= j) {
                break;
            }
            try {
                zOooO0OO = oooOO0O.OooO0OO(o000o001.f34962OooO00o, 0, 4, true);
            } catch (EOFException unused) {
                zOooO0OO = false;
            }
            if (!zOooO0OO) {
                break;
            }
            o000o001.Oooo00O(0);
            if (o000o001.OooOo0o() == 1332176723) {
                oooOO0O.f34679OooO0o = 0;
                return true;
            }
            oooOO0O.OooOO0(1);
        }
        do {
            if (j != -1 && oooOO0O.f34678OooO0Oo >= j) {
                break;
            }
        } while (oooOO0O.OooOOOo(1) != -1);
        return false;
    }
}
