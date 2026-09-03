package p080o000OoO;

import android.support.v4.media.OooO00o;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import com.google.common.base.OooOO0;
import com.google.common.base.o0OoOo0;
import com.google.common.collect.ImmutableSet;
import java.nio.charset.Charset;
import java.util.Arrays;
import kotlin.UByte;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class o000O000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public byte[] f34962OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f34963OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f34964OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final char[] f34959OooO0Oo = {'\r', '\n'};

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final char[] f34961OooO0o0 = {'\n'};

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final ImmutableSet<Charset> f34960OooO0o = ImmutableSet.OooOO0(5, OooOO0.f18590OooO00o, OooOO0.f18592OooO0OO, OooOO0.f18594OooO0o, OooOO0.f18593OooO0Oo, OooOO0.f18595OooO0o0);

    public o000O000() {
        this.f34962OooO00o = o00.f34914OooO0o;
    }

    public final int OooO() {
        byte[] bArr = this.f34962OooO00o;
        int i = this.f34963OooO0O0;
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = (bArr[i] & UByte.MAX_VALUE) | ((bArr[i2] & UByte.MAX_VALUE) << 8);
        int i5 = i3 + 1;
        int i6 = i4 | ((bArr[i3] & UByte.MAX_VALUE) << 16);
        this.f34963OooO0O0 = i5 + 1;
        return ((bArr[i5] & UByte.MAX_VALUE) << 24) | i6;
    }

    public final void OooO00o(int i) {
        byte[] bArr = this.f34962OooO00o;
        if (i > bArr.length) {
            this.f34962OooO00o = Arrays.copyOf(bArr, i);
        }
    }

    public final char OooO0O0(Charset charset) {
        o00Oo0.OooO0O0(f34960OooO0o.contains(charset), "Unsupported charset: " + charset);
        return (char) (OooO0OO(charset) >> 16);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0032  */
    /* JADX WARN: Code duplicated, block: B:17:0x0043  */
    /* JADX WARN: Code duplicated, block: B:19:0x004a  */
    /* JADX WARN: Code duplicated, block: B:21:0x0058  */
    /* JADX WARN: Code duplicated, block: B:23:0x0060  */
    /* JADX WARN: Code duplicated, block: B:25:0x0067  */
    public final int OooO0OO(Charset charset) {
        byte b;
        int i;
        int i2;
        int i3;
        byte b2;
        int i4;
        int i5;
        int i6;
        if (charset.equals(OooOO0.f18592OooO0OO) || charset.equals(OooOO0.f18590OooO00o)) {
            int i7 = this.f34964OooO0OO;
            int i8 = this.f34963OooO0O0;
            if (i7 - i8 >= 1) {
                long j = this.f34962OooO00o[i8] & UByte.MAX_VALUE;
                char c = (char) j;
                o0OoOo0.OooO0O0(j, "Out of range: %s", ((long) c) == j);
                b = (byte) c;
                i = 1;
            } else {
                i = 2;
                if (charset.equals(OooOO0.f18594OooO0o) && !charset.equals(OooOO0.f18593OooO0Oo)) {
                    if (charset.equals(OooOO0.f18595OooO0o0)) {
                        i5 = this.f34964OooO0OO;
                        i6 = this.f34963OooO0O0;
                        if (i5 - i6 >= 2) {
                            byte[] bArr = this.f34962OooO00o;
                            byte b3 = bArr[i6 + 1];
                            b2 = bArr[i6];
                            i4 = b3 << 8;
                        }
                    }
                    return 0;
                }
                i2 = this.f34964OooO0OO;
                i3 = this.f34963OooO0O0;
                if (i2 - i3 < 2) {
                    if (charset.equals(OooOO0.f18595OooO0o0)) {
                        i5 = this.f34964OooO0OO;
                        i6 = this.f34963OooO0O0;
                        if (i5 - i6 >= 2) {
                            byte[] bArr2 = this.f34962OooO00o;
                            byte b4 = bArr2[i6 + 1];
                            b2 = bArr2[i6];
                            i4 = b4 << 8;
                        }
                    }
                    return 0;
                }
                byte[] bArr3 = this.f34962OooO00o;
                byte b5 = bArr3[i3];
                b2 = bArr3[i3 + 1];
                i4 = b5 << 8;
                b = (byte) ((char) ((b2 & UByte.MAX_VALUE) | i4));
            }
        } else {
            i = 2;
            if (charset.equals(OooOO0.f18594OooO0o)) {
                i2 = this.f34964OooO0OO;
                i3 = this.f34963OooO0O0;
                if (i2 - i3 < 2) {
                    if (charset.equals(OooOO0.f18595OooO0o0)) {
                        i5 = this.f34964OooO0OO;
                        i6 = this.f34963OooO0O0;
                        if (i5 - i6 >= 2) {
                            byte[] bArr4 = this.f34962OooO00o;
                            byte b6 = bArr4[i6 + 1];
                            b2 = bArr4[i6];
                            i4 = b6 << 8;
                        }
                    }
                    return 0;
                }
                byte[] bArr5 = this.f34962OooO00o;
                byte b7 = bArr5[i3];
                b2 = bArr5[i3 + 1];
                i4 = b7 << 8;
            } else {
                i2 = this.f34964OooO0OO;
                i3 = this.f34963OooO0O0;
                if (i2 - i3 < 2) {
                    if (charset.equals(OooOO0.f18595OooO0o0)) {
                        i5 = this.f34964OooO0OO;
                        i6 = this.f34963OooO0O0;
                        if (i5 - i6 >= 2) {
                            byte[] bArr6 = this.f34962OooO00o;
                            byte b8 = bArr6[i6 + 1];
                            b2 = bArr6[i6];
                            i4 = b8 << 8;
                        }
                    }
                    return 0;
                }
                byte[] bArr7 = this.f34962OooO00o;
                byte b9 = bArr7[i3];
                b2 = bArr7[i3 + 1];
                i4 = b9 << 8;
            }
            b = (byte) ((char) ((b2 & UByte.MAX_VALUE) | i4));
        }
        long j2 = b;
        char c2 = (char) j2;
        o0OoOo0.OooO0O0(j2, "Out of range: %s", ((long) c2) == j2);
        return (c2 << 16) + i;
    }

    public final void OooO0Oo(int i, int i2, byte[] bArr) {
        System.arraycopy(this.f34962OooO00o, this.f34963OooO0O0, bArr, i, i2);
        this.f34963OooO0O0 += i2;
    }

    public final int OooO0o() {
        byte[] bArr = this.f34962OooO00o;
        int i = this.f34963OooO0O0;
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = ((bArr[i] & UByte.MAX_VALUE) << 24) | ((bArr[i2] & UByte.MAX_VALUE) << 16);
        int i5 = i3 + 1;
        int i6 = i4 | ((bArr[i3] & UByte.MAX_VALUE) << 8);
        this.f34963OooO0O0 = i5 + 1;
        return (bArr[i5] & UByte.MAX_VALUE) | i6;
    }

    public final char OooO0o0(Charset charset, char[] cArr) {
        boolean z;
        int iOooO0OO = OooO0OO(charset);
        if (iOooO0OO != 0) {
            char c = (char) (iOooO0OO >> 16);
            int length = cArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    z = false;
                    break;
                }
                if (cArr[i] == c) {
                    z = true;
                    break;
                }
                i++;
            }
            if (z) {
                this.f34963OooO0O0 += iOooO0OO & 65535;
                return c;
            }
        }
        return (char) 0;
    }

    @Nullable
    public final String OooO0oO() {
        return OooO0oo(OooOO0.f18592OooO0OO);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0099  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:46:0x00af  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:51:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:60:0x00d6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:61:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:75:0x00df A[EDGE_INSN: B:75:0x00df->B:66:0x00df BREAK  A[LOOP:0: B:26:0x006b->B:64:0x00dc], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x00df A[EDGE_INSN: B:76:0x00df->B:66:0x00df BREAK  A[LOOP:0: B:26:0x006b->B:64:0x00dc], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x00dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x00dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00dc A[SYNTHETIC] */
    @Nullable
    public final String OooO0oo(Charset charset) {
        int i;
        byte[] bArr;
        byte b;
        boolean z;
        byte[] bArr2;
        byte b2;
        o00Oo0.OooO0O0(f34960OooO0o.contains(charset), "Unsupported charset: " + charset);
        if (this.f34964OooO0OO - this.f34963OooO0O0 == 0) {
            return null;
        }
        Charset charset2 = OooOO0.f18590OooO00o;
        if (!charset.equals(charset2)) {
            OooOoo();
        }
        if (charset.equals(OooOO0.f18592OooO0OO) || charset.equals(charset2)) {
            i = 1;
        } else {
            if (!charset.equals(OooOO0.f18594OooO0o) && !charset.equals(OooOO0.f18595OooO0o0) && !charset.equals(OooOO0.f18593OooO0Oo)) {
                throw new IllegalArgumentException("Unsupported charset: " + charset);
            }
            i = 2;
        }
        int i2 = this.f34963OooO0O0;
        while (true) {
            int i3 = this.f34964OooO0OO;
            if (i2 >= i3 - (i - 1)) {
                i2 = i3;
                break;
            }
            if (charset.equals(OooOO0.f18592OooO0OO) || charset.equals(OooOO0.f18590OooO00o)) {
                byte b3 = this.f34962OooO00o[i2];
                int i4 = o00.f34910OooO00o;
                if (b3 == 10 || b3 == 13) {
                    break;
                }
                if (!charset.equals(OooOO0.f18594OooO0o) || charset.equals(OooOO0.f18593OooO0Oo)) {
                    bArr = this.f34962OooO00o;
                    if (bArr[i2] == 0) {
                        b = bArr[i2 + 1];
                        int i5 = o00.f34910OooO00o;
                        if (b != 10 || b == 13) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            break;
                        }
                        if (charset.equals(OooOO0.f18595OooO0o0)) {
                            bArr2 = this.f34962OooO00o;
                            if (bArr2[i2 + 1] == 0) {
                                b2 = bArr2[i2];
                                int i6 = o00.f34910OooO00o;
                                if (b2 != 10 || b2 == 13) {
                                    break;
                                }
                            } else {
                                continue;
                            }
                        }
                        i2 += i;
                    } else {
                        if (charset.equals(OooOO0.f18595OooO0o0)) {
                            bArr2 = this.f34962OooO00o;
                            if (bArr2[i2 + 1] == 0) {
                                b2 = bArr2[i2];
                                int i7 = o00.f34910OooO00o;
                                if (b2 != 10 || b2 == 13) {
                                    break;
                                    break;
                                }
                            } else {
                                continue;
                            }
                        }
                        i2 += i;
                    }
                } else {
                    if (charset.equals(OooOO0.f18595OooO0o0)) {
                        bArr2 = this.f34962OooO00o;
                        if (bArr2[i2 + 1] == 0) {
                            b2 = bArr2[i2];
                            int i8 = o00.f34910OooO00o;
                            if (b2 != 10 || b2 == 13) {
                                break;
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                    i2 += i;
                }
            } else if (charset.equals(OooOO0.f18594OooO0o)) {
                bArr = this.f34962OooO00o;
                if (bArr[i2] == 0) {
                    b = bArr[i2 + 1];
                    int i9 = o00.f34910OooO00o;
                    if (b != 10) {
                        z = true;
                    } else {
                        z = true;
                    }
                    if (z) {
                        break;
                        break;
                    }
                    if (charset.equals(OooOO0.f18595OooO0o0)) {
                        bArr2 = this.f34962OooO00o;
                        if (bArr2[i2 + 1] == 0) {
                            b2 = bArr2[i2];
                            int i10 = o00.f34910OooO00o;
                            if (b2 != 10 || b2 == 13) {
                                break;
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                    i2 += i;
                } else {
                    if (charset.equals(OooOO0.f18595OooO0o0)) {
                        bArr2 = this.f34962OooO00o;
                        if (bArr2[i2 + 1] == 0) {
                            b2 = bArr2[i2];
                            int i11 = o00.f34910OooO00o;
                            if (b2 != 10 || b2 == 13) {
                                break;
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                    i2 += i;
                }
            } else {
                bArr = this.f34962OooO00o;
                if (bArr[i2] == 0) {
                    b = bArr[i2 + 1];
                    int i12 = o00.f34910OooO00o;
                    if (b != 10) {
                        z = true;
                    } else {
                        z = true;
                    }
                    if (z) {
                        break;
                        break;
                    }
                    if (charset.equals(OooOO0.f18595OooO0o0)) {
                        bArr2 = this.f34962OooO00o;
                        if (bArr2[i2 + 1] == 0) {
                            b2 = bArr2[i2];
                            int i13 = o00.f34910OooO00o;
                            if (b2 != 10 || b2 == 13) {
                                break;
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                    i2 += i;
                } else {
                    if (charset.equals(OooOO0.f18595OooO0o0)) {
                        bArr2 = this.f34962OooO00o;
                        if (bArr2[i2 + 1] == 0) {
                            b2 = bArr2[i2];
                            int i14 = o00.f34910OooO00o;
                            if (b2 != 10 || b2 == 13) {
                                break;
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                    i2 += i;
                }
            }
        }
        String strOooOo00 = OooOo00(i2 - this.f34963OooO0O0, charset);
        if (this.f34963OooO0O0 != this.f34964OooO0OO && OooO0o0(charset, f34959OooO0Oo) == '\r') {
            OooO0o0(charset, f34961OooO0o0);
        }
        return strOooOo00;
    }

    public final long OooOO0() {
        byte[] bArr = this.f34962OooO00o;
        int i = this.f34963OooO0O0;
        int i2 = i + 1;
        long j = ((long) bArr[i]) & 255;
        int i3 = i2 + 1;
        int i4 = i3 + 1;
        long j2 = j | ((((long) bArr[i2]) & 255) << 8) | ((((long) bArr[i3]) & 255) << 16);
        int i5 = i4 + 1;
        long j3 = j2 | ((((long) bArr[i4]) & 255) << 24);
        int i6 = i5 + 1;
        long j4 = j3 | ((((long) bArr[i5]) & 255) << 32);
        int i7 = i6 + 1;
        long j5 = j4 | ((((long) bArr[i6]) & 255) << 40);
        int i8 = i7 + 1;
        long j6 = j5 | ((((long) bArr[i7]) & 255) << 48);
        this.f34963OooO0O0 = i8 + 1;
        return j6 | ((((long) bArr[i8]) & 255) << 56);
    }

    public final short OooOO0O() {
        byte[] bArr = this.f34962OooO00o;
        int i = this.f34963OooO0O0;
        int i2 = i + 1;
        int i3 = bArr[i] & UByte.MAX_VALUE;
        this.f34963OooO0O0 = i2 + 1;
        return (short) (((bArr[i2] & UByte.MAX_VALUE) << 8) | i3);
    }

    public final long OooOO0o() {
        byte[] bArr = this.f34962OooO00o;
        int i = this.f34963OooO0O0;
        int i2 = i + 1;
        long j = ((long) bArr[i]) & 255;
        int i3 = i2 + 1;
        int i4 = i3 + 1;
        long j2 = j | ((((long) bArr[i2]) & 255) << 8) | ((((long) bArr[i3]) & 255) << 16);
        this.f34963OooO0O0 = i4 + 1;
        return j2 | ((((long) bArr[i4]) & 255) << 24);
    }

    public final int OooOOO() {
        byte[] bArr = this.f34962OooO00o;
        int i = this.f34963OooO0O0;
        int i2 = i + 1;
        int i3 = bArr[i] & UByte.MAX_VALUE;
        this.f34963OooO0O0 = i2 + 1;
        return ((bArr[i2] & UByte.MAX_VALUE) << 8) | i3;
    }

    public final int OooOOO0() {
        int iOooO = OooO();
        if (iOooO >= 0) {
            return iOooO;
        }
        throw new IllegalStateException(OooO00o.OooO00o("Top bit not zero: ", iOooO));
    }

    public final long OooOOOO() {
        byte[] bArr = this.f34962OooO00o;
        int i = this.f34963OooO0O0;
        int i2 = i + 1;
        long j = (((long) bArr[i]) & 255) << 56;
        int i3 = i2 + 1;
        int i4 = i3 + 1;
        long j2 = j | ((((long) bArr[i2]) & 255) << 48) | ((((long) bArr[i3]) & 255) << 40);
        int i5 = i4 + 1;
        long j3 = j2 | ((((long) bArr[i4]) & 255) << 32);
        int i6 = i5 + 1;
        long j4 = j3 | ((((long) bArr[i5]) & 255) << 24);
        int i7 = i6 + 1;
        long j5 = j4 | ((((long) bArr[i6]) & 255) << 16);
        int i8 = i7 + 1;
        long j6 = j5 | ((((long) bArr[i7]) & 255) << 8);
        this.f34963OooO0O0 = i8 + 1;
        return j6 | (((long) bArr[i8]) & 255);
    }

    @Nullable
    public final String OooOOOo() {
        int i = this.f34964OooO0OO;
        int i2 = this.f34963OooO0O0;
        if (i - i2 == 0) {
            return null;
        }
        while (i2 < this.f34964OooO0OO && this.f34962OooO00o[i2] != 0) {
            i2++;
        }
        byte[] bArr = this.f34962OooO00o;
        int i3 = this.f34963OooO0O0;
        int i4 = o00.f34910OooO00o;
        String str = new String(bArr, i3, i2 - i3, OooOO0.f18592OooO0OO);
        this.f34963OooO0O0 = i2;
        if (i2 < this.f34964OooO0OO) {
            this.f34963OooO0O0 = i2 + 1;
        }
        return str;
    }

    public final short OooOOo() {
        byte[] bArr = this.f34962OooO00o;
        int i = this.f34963OooO0O0;
        int i2 = i + 1;
        int i3 = (bArr[i] & UByte.MAX_VALUE) << 8;
        this.f34963OooO0O0 = i2 + 1;
        return (short) ((bArr[i2] & UByte.MAX_VALUE) | i3);
    }

    public final String OooOOo0(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = this.f34963OooO0O0;
        int i3 = (i2 + i) - 1;
        int i4 = (i3 >= this.f34964OooO0OO || this.f34962OooO00o[i3] != 0) ? i : i - 1;
        byte[] bArr = this.f34962OooO00o;
        int i5 = o00.f34910OooO00o;
        String str = new String(bArr, i2, i4, OooOO0.f18592OooO0OO);
        this.f34963OooO0O0 += i;
        return str;
    }

    public final String OooOOoo(int i) {
        return OooOo00(i, OooOO0.f18592OooO0OO);
    }

    public final int OooOo() {
        byte[] bArr = this.f34962OooO00o;
        int i = this.f34963OooO0O0;
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = ((bArr[i] & UByte.MAX_VALUE) << 16) | ((bArr[i2] & UByte.MAX_VALUE) << 8);
        this.f34963OooO0O0 = i3 + 1;
        return (bArr[i3] & UByte.MAX_VALUE) | i4;
    }

    public final int OooOo0() {
        return (OooOo0O() << 21) | (OooOo0O() << 14) | (OooOo0O() << 7) | OooOo0O();
    }

    public final String OooOo00(int i, Charset charset) {
        String str = new String(this.f34962OooO00o, this.f34963OooO0O0, i, charset);
        this.f34963OooO0O0 += i;
        return str;
    }

    public final int OooOo0O() {
        byte[] bArr = this.f34962OooO00o;
        int i = this.f34963OooO0O0;
        this.f34963OooO0O0 = i + 1;
        return bArr[i] & UByte.MAX_VALUE;
    }

    public final long OooOo0o() {
        byte[] bArr = this.f34962OooO00o;
        int i = this.f34963OooO0O0;
        int i2 = i + 1;
        long j = (((long) bArr[i]) & 255) << 24;
        int i3 = i2 + 1;
        int i4 = i3 + 1;
        long j2 = j | ((((long) bArr[i2]) & 255) << 16) | ((((long) bArr[i3]) & 255) << 8);
        this.f34963OooO0O0 = i4 + 1;
        return j2 | (((long) bArr[i4]) & 255);
    }

    public final long OooOoO() {
        long jOooOOOO = OooOOOO();
        if (jOooOOOO >= 0) {
            return jOooOOOO;
        }
        throw new IllegalStateException(androidx.compose.ui.input.key.OooO00o.OooO00o("Top bit not zero: ", jOooOOOO));
    }

    public final int OooOoO0() {
        int iOooO0o = OooO0o();
        if (iOooO0o >= 0) {
            return iOooO0o;
        }
        throw new IllegalStateException(OooO00o.OooO00o("Top bit not zero: ", iOooO0o));
    }

    public final int OooOoOO() {
        byte[] bArr = this.f34962OooO00o;
        int i = this.f34963OooO0O0;
        int i2 = i + 1;
        int i3 = (bArr[i] & UByte.MAX_VALUE) << 8;
        this.f34963OooO0O0 = i2 + 1;
        return (bArr[i2] & UByte.MAX_VALUE) | i3;
    }

    @Nullable
    public final Charset OooOoo() {
        int i = this.f34964OooO0OO;
        int i2 = this.f34963OooO0O0;
        if (i - i2 >= 3) {
            byte[] bArr = this.f34962OooO00o;
            if (bArr[i2] == -17 && bArr[i2 + 1] == -69 && bArr[i2 + 2] == -65) {
                this.f34963OooO0O0 = i2 + 3;
                return OooOO0.f18592OooO0OO;
            }
        }
        if (i - i2 < 2) {
            return null;
        }
        byte[] bArr2 = this.f34962OooO00o;
        byte b = bArr2[i2];
        if (b == -2 && bArr2[i2 + 1] == -1) {
            this.f34963OooO0O0 = i2 + 2;
            return OooOO0.f18593OooO0Oo;
        }
        if (b != -1 || bArr2[i2 + 1] != -2) {
            return null;
        }
        this.f34963OooO0O0 = i2 + 2;
        return OooOO0.f18595OooO0o0;
    }

    public final long OooOoo0() {
        int i;
        int i2;
        long j = this.f34962OooO00o[this.f34963OooO0O0];
        int i3 = 7;
        while (true) {
            if (i3 >= 0) {
                int i4 = 1 << i3;
                if ((((long) i4) & j) == 0) {
                    if (i3 < 6) {
                        j &= (long) (i4 - 1);
                        i2 = 7 - i3;
                        break;
                    }
                    if (i3 == 7) {
                        i2 = 1;
                        break;
                    }
                } else {
                    i3--;
                }
            }
            i2 = 0;
            break;
        }
        if (i2 == 0) {
            throw new NumberFormatException(androidx.compose.ui.input.key.OooO00o.OooO00o("Invalid UTF-8 sequence first byte: ", j));
        }
        for (i = 1; i < i2; i++) {
            byte b = this.f34962OooO00o[this.f34963OooO0O0 + i];
            if ((b & 192) != 128) {
                throw new NumberFormatException(androidx.compose.ui.input.key.OooO00o.OooO00o("Invalid UTF-8 sequence continuation byte: ", j));
            }
            j = (j << 6) | ((long) (b & 63));
        }
        this.f34963OooO0O0 += i2;
        return j;
    }

    public final void OooOooO(int i) {
        byte[] bArr = this.f34962OooO00o;
        if (bArr.length < i) {
            bArr = new byte[i];
        }
        OooOooo(i, bArr);
    }

    public final void OooOooo(int i, byte[] bArr) {
        this.f34962OooO00o = bArr;
        this.f34964OooO0OO = i;
        this.f34963OooO0O0 = 0;
    }

    public final void Oooo000(int i) {
        o00Oo0.OooO00o(i >= 0 && i <= this.f34962OooO00o.length);
        this.f34964OooO0OO = i;
    }

    public final void Oooo00O(int i) {
        o00Oo0.OooO00o(i >= 0 && i <= this.f34964OooO0OO);
        this.f34963OooO0O0 = i;
    }

    public final void Oooo00o(int i) {
        Oooo00O(this.f34963OooO0O0 + i);
    }

    public o000O000(int i) {
        this.f34962OooO00o = new byte[i];
        this.f34964OooO0OO = i;
    }

    public o000O000(byte[] bArr) {
        this.f34962OooO00o = bArr;
        this.f34964OooO0OO = bArr.length;
    }

    public o000O000(byte[] bArr, int i) {
        this.f34962OooO00o = bArr;
        this.f34964OooO0OO = i;
    }
}
