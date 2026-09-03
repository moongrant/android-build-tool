package o0O0o000;

import com.google.android.exoplayer2.ParserException;
import java.io.EOFException;
import java.io.IOException;
import kotlin.KotlinVersion;
import p296o0O0OoO0.o000oOoO;
import p318o0O0oOo.o000;
import p318o0O0oOo.o00000O0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f36098OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public long f36099OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f36100OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f36101OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f36103OooO0o0;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int[] f36102OooO0o = new int[KotlinVersion.MAX_COMPONENT_VALUE];

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final o000 f36104OooO0oO = new o000(KotlinVersion.MAX_COMPONENT_VALUE);

    public final boolean OooO00o(o000oOoO o000oooo2, boolean z) throws IOException {
        boolean zOooO0OO;
        OooO0O0();
        this.f36104OooO0oO.OooOo(27);
        try {
            zOooO0OO = o000oooo2.OooO0OO(this.f36104OooO0oO.f36661OooO00o, 0, 27, z);
        } catch (EOFException e) {
            if (!z) {
                throw e;
            }
            zOooO0OO = false;
        }
        if (!zOooO0OO || this.f36104OooO0oO.OooOOo() != 1332176723) {
            return false;
        }
        if (this.f36104OooO0oO.OooOOo0() != 0) {
            if (z) {
                return false;
            }
            throw new ParserException("unsupported bit stream revision");
        }
        this.f36098OooO00o = this.f36104OooO0oO.OooOOo0();
        o000 o000Var = this.f36104OooO0oO;
        byte[] bArr = o000Var.f36661OooO00o;
        int i = o000Var.f36662OooO0O0;
        int i2 = i + 1;
        o000Var.f36662OooO0O0 = i2;
        long j = ((long) bArr[i]) & 255;
        int i3 = i2 + 1;
        o000Var.f36662OooO0O0 = i3;
        long j2 = j | ((((long) bArr[i2]) & 255) << 8);
        int i4 = i3 + 1;
        o000Var.f36662OooO0O0 = i4;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 16);
        int i5 = i4 + 1;
        o000Var.f36662OooO0O0 = i5;
        long j4 = j3 | ((((long) bArr[i4]) & 255) << 24);
        int i6 = i5 + 1;
        o000Var.f36662OooO0O0 = i6;
        long j5 = j4 | ((((long) bArr[i5]) & 255) << 32);
        int i7 = i6 + 1;
        o000Var.f36662OooO0O0 = i7;
        long j6 = j5 | ((((long) bArr[i6]) & 255) << 40);
        int i8 = i7 + 1;
        o000Var.f36662OooO0O0 = i8;
        long j7 = j6 | ((((long) bArr[i7]) & 255) << 48);
        o000Var.f36662OooO0O0 = i8 + 1;
        this.f36099OooO0O0 = ((((long) bArr[i8]) & 255) << 56) | j7;
        o000Var.OooO0oo();
        this.f36104OooO0oO.OooO0oo();
        this.f36104OooO0oO.OooO0oo();
        int iOooOOo0 = this.f36104OooO0oO.OooOOo0();
        this.f36100OooO0OO = iOooOOo0;
        this.f36101OooO0Oo = iOooOOo0 + 27;
        this.f36104OooO0oO.OooOo(iOooOOo0);
        o000oooo2.OooOOO0(this.f36104OooO0oO.f36661OooO00o, 0, this.f36100OooO0OO);
        for (int i9 = 0; i9 < this.f36100OooO0OO; i9++) {
            this.f36102OooO0o[i9] = this.f36104OooO0oO.OooOOo0();
            this.f36103OooO0o0 += this.f36102OooO0o[i9];
        }
        return true;
    }

    public final void OooO0O0() {
        this.f36098OooO00o = 0;
        this.f36099OooO0O0 = 0L;
        this.f36100OooO0OO = 0;
        this.f36101OooO0Oo = 0;
        this.f36103OooO0o0 = 0;
    }

    public final boolean OooO0OO(o000oOoO o000oooo2, long j) throws IOException {
        boolean zOooO0OO;
        o00000O0.OooO00o(o000oooo2.getPosition() == o000oooo2.OooO0Oo());
        while (true) {
            if (j != -1 && o000oooo2.getPosition() + 4 >= j) {
                break;
            }
            try {
                zOooO0OO = o000oooo2.OooO0OO(this.f36104OooO0oO.f36661OooO00o, 0, 4, true);
            } catch (EOFException unused) {
                zOooO0OO = false;
            }
            if (!zOooO0OO) {
                break;
            }
            this.f36104OooO0oO.OooOo(4);
            if (this.f36104OooO0oO.OooOOo() == 1332176723) {
                o000oooo2.OooO();
                return true;
            }
            o000oooo2.OooOO0(1);
        }
        do {
            if (j != -1 && o000oooo2.getPosition() >= j) {
                break;
            }
        } while (o000oooo2.OooOOO() != -1);
        return false;
    }
}
