package com.google.protobuf;

import com.umeng.analytics.pro.bz;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOO0O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f19358OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final byte[] f19359OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f19360OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f19361OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f19362OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final InputStream f19363OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f19364OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f19365OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f19366OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f19367OooOO0;

    public OooOO0O(byte[] bArr, int i, int i2, boolean z) {
        this.f19358OooO = Integer.MAX_VALUE;
        this.f19359OooO00o = bArr;
        this.f19361OooO0OO = i2 + i;
        this.f19364OooO0o0 = i;
        this.f19366OooO0oo = -i;
        this.f19363OooO0o = null;
        this.f19360OooO0O0 = z;
    }

    public static OooOO0O OooO0OO(InputStream inputStream) {
        return new OooOO0O(inputStream);
    }

    public static OooOO0O OooO0Oo(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException {
        OooOO0O oooOO0O = new OooOO0O(bArr, i, i2, false);
        try {
            oooOO0O.OooO0o(i2);
            return oooOO0O;
        } catch (InvalidProtocolBufferException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static int OooOOOO(int i, InputStream inputStream) throws IOException {
        if ((i & 128) == 0) {
            return i;
        }
        int i2 = i & 127;
        int i3 = 7;
        while (i3 < 32) {
            int i4 = inputStream.read();
            if (i4 == -1) {
                throw InvalidProtocolBufferException.OooO0Oo();
            }
            i2 |= (i4 & 127) << i3;
            if ((i4 & 128) == 0) {
                return i2;
            }
            i3 += 7;
        }
        while (i3 < 64) {
            int i5 = inputStream.read();
            if (i5 == -1) {
                throw InvalidProtocolBufferException.OooO0Oo();
            }
            if ((i5 & 128) == 0) {
                return i2;
            }
            i3 += 7;
        }
        throw InvalidProtocolBufferException.OooO00o();
    }

    public final int OooO() throws IOException {
        return OooOOO();
    }

    public final void OooO00o(int i) throws InvalidProtocolBufferException {
        if (this.f19365OooO0oO != i) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
    }

    public final int OooO0O0() {
        int i = this.f19358OooO;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - (this.f19366OooO0oo + this.f19364OooO0o0);
    }

    public final int OooO0o(int i) throws InvalidProtocolBufferException {
        if (i < 0) {
            throw InvalidProtocolBufferException.OooO0O0();
        }
        int i2 = this.f19366OooO0oo + this.f19364OooO0o0 + i;
        int i3 = this.f19358OooO;
        if (i2 > i3) {
            throw InvalidProtocolBufferException.OooO0Oo();
        }
        this.f19358OooO = i2;
        OooOo00();
        return i3;
    }

    public final void OooO0o0(int i) {
        this.f19358OooO = i;
        OooOo00();
    }

    public final boolean OooO0oO() throws IOException {
        return OooOOOo() != 0;
    }

    public final ByteString OooO0oo() throws IOException {
        int iOooOOO = OooOOO();
        int i = this.f19361OooO0OO;
        int i2 = this.f19364OooO0o0;
        if (iOooOOO <= i - i2 && iOooOOO > 0) {
            ByteString.OooO0o oooO0o = new ByteString.OooO0o(ByteString.f19323Oooo0oo.OooO00o(this.f19359OooO00o, i2, iOooOOO));
            this.f19364OooO0o0 += iOooOOO;
            return oooO0o;
        }
        if (iOooOOO == 0) {
            return ByteString.f19322Oooo0oO;
        }
        byte[] bArrOooOOO0 = OooOOO0(iOooOOO);
        ByteString.OooO0o oooO0o2 = ByteString.f19322Oooo0oO;
        return new ByteString.OooO0o(bArrOooOOO0);
    }

    public final long OooOO0() throws IOException {
        return OooOOOo();
    }

    public final <T extends oo000o> T OooOO0O(o0OOO0o<T> o0ooo0o2, OooOo00 oooOo00) throws IOException {
        int iOooOOO = OooOOO();
        if (this.f19367OooOO0 >= 100) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iOooO0o = OooO0o(iOooOOO);
        this.f19367OooOO0++;
        T tOooO00o = o0ooo0o2.OooO00o(this, oooOo00);
        OooO00o(0);
        this.f19367OooOO0--;
        OooO0o0(iOooO0o);
        return tOooO00o;
    }

    public final byte OooOO0o() throws IOException {
        if (this.f19364OooO0o0 == this.f19361OooO0OO) {
            OooOo0(1);
        }
        byte[] bArr = this.f19359OooO00o;
        int i = this.f19364OooO0o0;
        this.f19364OooO0o0 = i + 1;
        return bArr[i];
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
    
        if (r2[r3] < 0) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int OooOOO() throws IOException {
        int i;
        int i2 = this.f19364OooO0o0;
        int i3 = this.f19361OooO0OO;
        if (i3 != i2) {
            byte[] bArr = this.f19359OooO00o;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f19364OooO0o0 = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i4 + 1;
                int i6 = b ^ (bArr[i4] << 7);
                if (i6 < 0) {
                    i = i6 ^ (-128);
                } else {
                    int i7 = i5 + 1;
                    int i8 = i6 ^ (bArr[i5] << bz.l);
                    if (i8 >= 0) {
                        i = i8 ^ 16256;
                    } else {
                        i5 = i7 + 1;
                        int i9 = i8 ^ (bArr[i7] << 21);
                        if (i9 < 0) {
                            i = i9 ^ (-2080896);
                        } else {
                            i7 = i5 + 1;
                            byte b2 = bArr[i5];
                            i = (i9 ^ (b2 << 28)) ^ 266354560;
                            if (b2 < 0) {
                                i5 = i7 + 1;
                                if (bArr[i7] < 0) {
                                    i7 = i5 + 1;
                                    if (bArr[i5] < 0) {
                                        i5 = i7 + 1;
                                        if (bArr[i7] < 0) {
                                            i7 = i5 + 1;
                                            if (bArr[i5] < 0) {
                                                i5 = i7 + 1;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    i5 = i7;
                }
                this.f19364OooO0o0 = i5;
                return i;
            }
        }
        return (int) OooOOo0();
    }

    public final byte[] OooOOO0(int i) throws IOException {
        if (i <= 0) {
            if (i == 0) {
                return o000oOoO.f19396OooO0O0;
            }
            throw InvalidProtocolBufferException.OooO0O0();
        }
        int i2 = this.f19366OooO0oo;
        int i3 = this.f19364OooO0o0;
        int i4 = i2 + i3 + i;
        if (i4 > 67108864) {
            throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i5 = this.f19358OooO;
        if (i4 > i5) {
            OooOo0o((i5 - i2) - i3);
            throw InvalidProtocolBufferException.OooO0Oo();
        }
        InputStream inputStream = this.f19363OooO0o;
        if (inputStream == null) {
            throw InvalidProtocolBufferException.OooO0Oo();
        }
        int i6 = this.f19361OooO0OO;
        int length = i6 - i3;
        this.f19366OooO0oo = i2 + i6;
        this.f19364OooO0o0 = 0;
        this.f19361OooO0OO = 0;
        int i7 = i - length;
        if (i7 < 4096 || i7 <= inputStream.available()) {
            byte[] bArr = new byte[i];
            System.arraycopy(this.f19359OooO00o, i3, bArr, 0, length);
            while (length < i) {
                int i8 = this.f19363OooO0o.read(bArr, length, i - length);
                if (i8 == -1) {
                    throw InvalidProtocolBufferException.OooO0Oo();
                }
                this.f19366OooO0oo += i8;
                length += i8;
            }
            return bArr;
        }
        ArrayList<byte[]> arrayList = new ArrayList();
        while (i7 > 0) {
            int iMin = Math.min(i7, 4096);
            byte[] bArr2 = new byte[iMin];
            int i9 = 0;
            while (i9 < iMin) {
                int i10 = this.f19363OooO0o.read(bArr2, i9, iMin - i9);
                if (i10 == -1) {
                    throw InvalidProtocolBufferException.OooO0Oo();
                }
                this.f19366OooO0oo += i10;
                i9 += i10;
            }
            i7 -= iMin;
            arrayList.add(bArr2);
        }
        byte[] bArr3 = new byte[i];
        System.arraycopy(this.f19359OooO00o, i3, bArr3, 0, length);
        for (byte[] bArr4 : arrayList) {
            System.arraycopy(bArr4, 0, bArr3, length, bArr4.length);
            length += bArr4.length;
        }
        return bArr3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b4, code lost:
    
        if (r2[r0] < 0) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long OooOOOo() throws IOException {
        long j;
        long j2;
        long j3;
        int i;
        int i2 = this.f19364OooO0o0;
        int i3 = this.f19361OooO0OO;
        if (i3 != i2) {
            byte[] bArr = this.f19359OooO00o;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f19364OooO0o0 = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i4 + 1;
                int i6 = b ^ (bArr[i4] << 7);
                if (i6 >= 0) {
                    int i7 = i5 + 1;
                    int i8 = i6 ^ (bArr[i5] << bz.l);
                    if (i8 >= 0) {
                        i5 = i7;
                        j = i8 ^ 16256;
                    } else {
                        i5 = i7 + 1;
                        int i9 = i8 ^ (bArr[i7] << 21);
                        if (i9 < 0) {
                            i = i9 ^ (-2080896);
                        } else {
                            long j4 = i9;
                            int i10 = i5 + 1;
                            long j5 = j4 ^ (((long) bArr[i5]) << 28);
                            if (j5 >= 0) {
                                j3 = 266354560;
                            } else {
                                i5 = i10 + 1;
                                long j6 = j5 ^ (((long) bArr[i10]) << 35);
                                if (j6 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    i10 = i5 + 1;
                                    j5 = j6 ^ (((long) bArr[i5]) << 42);
                                    if (j5 >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        i5 = i10 + 1;
                                        j6 = j5 ^ (((long) bArr[i10]) << 49);
                                        if (j6 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            int i11 = i5 + 1;
                                            long j7 = (j6 ^ (((long) bArr[i5]) << 56)) ^ 71499008037633920L;
                                            i5 = j7 < 0 ? i11 + 1 : i11;
                                            j = j7;
                                        }
                                    }
                                }
                                j = j6 ^ j2;
                            }
                            j = j5 ^ j3;
                            i5 = i10;
                        }
                    }
                    this.f19364OooO0o0 = i5;
                    return j;
                }
                i = i6 ^ (-128);
                j = i;
                this.f19364OooO0o0 = i5;
                return j;
            }
        }
        return OooOOo0();
    }

    public final String OooOOo() throws IOException {
        byte[] bArrOooOOO0;
        byte[] bArr;
        int iOooOOO = OooOOO();
        int i = this.f19364OooO0o0;
        int i2 = this.f19361OooO0OO;
        if (iOooOOO <= i2 - i && iOooOOO > 0) {
            bArr = this.f19359OooO00o;
            this.f19364OooO0o0 = i + iOooOOO;
        } else {
            if (iOooOOO == 0) {
                return "";
            }
            if (iOooOOO <= i2) {
                OooOo0(iOooOOO);
                bArrOooOOO0 = this.f19359OooO00o;
                this.f19364OooO0o0 = iOooOOO + 0;
            } else {
                bArrOooOOO0 = OooOOO0(iOooOOO);
            }
            bArr = bArrOooOOO0;
            i = 0;
        }
        if (o000000O.f19389OooO00o.OooO0O0(bArr, i, i + iOooOOO) == 0) {
            return new String(bArr, i, iOooOOO, o000oOoO.f19395OooO00o);
        }
        throw new InvalidProtocolBufferException("Protocol message had invalid UTF-8.");
    }

    public final long OooOOo0() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte bOooOO0o = OooOO0o();
            j |= ((long) (bOooOO0o & ByteCompanionObject.MAX_VALUE)) << i;
            if ((bOooOO0o & ByteCompanionObject.MIN_VALUE) == 0) {
                return j;
            }
        }
        throw InvalidProtocolBufferException.OooO00o();
    }

    public final int OooOOoo() throws IOException {
        if (this.f19364OooO0o0 == this.f19361OooO0OO && !OooOo(1)) {
            this.f19365OooO0oO = 0;
            return 0;
        }
        int iOooOOO = OooOOO();
        this.f19365OooO0oO = iOooOOO;
        if ((iOooOOO >>> 3) != 0) {
            return iOooOOO;
        }
        throw new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
    }

    public final boolean OooOo(int i) throws IOException {
        int i2 = this.f19364OooO0o0;
        int i3 = i2 + i;
        int i4 = this.f19361OooO0OO;
        if (i3 <= i4) {
            throw new IllegalStateException(OooO0O0.OooO00o.OooO00o("refillBuffer() called when ", i, " bytes were already available in buffer"));
        }
        if (this.f19366OooO0oo + i2 + i <= this.f19358OooO && this.f19363OooO0o != null) {
            if (i2 > 0) {
                if (i4 > i2) {
                    byte[] bArr = this.f19359OooO00o;
                    System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                }
                this.f19366OooO0oo += i2;
                this.f19361OooO0OO -= i2;
                this.f19364OooO0o0 = 0;
            }
            InputStream inputStream = this.f19363OooO0o;
            byte[] bArr2 = this.f19359OooO00o;
            int i5 = this.f19361OooO0OO;
            int i6 = inputStream.read(bArr2, i5, bArr2.length - i5);
            if (i6 == 0 || i6 < -1 || i6 > this.f19359OooO00o.length) {
                throw new IllegalStateException(OooO0O0.OooO00o.OooO00o("InputStream#read(byte[]) returned invalid result: ", i6, "\nThe InputStream implementation is buggy."));
            }
            if (i6 > 0) {
                this.f19361OooO0OO += i6;
                if ((this.f19366OooO0oo + i) - 67108864 > 0) {
                    throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
                }
                OooOo00();
                if (this.f19361OooO0OO >= i) {
                    return true;
                }
                return OooOo(i);
            }
        }
        return false;
    }

    public final void OooOo0(int i) throws IOException {
        if (!OooOo(i)) {
            throw InvalidProtocolBufferException.OooO0Oo();
        }
    }

    public final void OooOo00() {
        int i = this.f19361OooO0OO + this.f19362OooO0Oo;
        this.f19361OooO0OO = i;
        int i2 = this.f19366OooO0oo + i;
        int i3 = this.f19358OooO;
        if (i2 <= i3) {
            this.f19362OooO0Oo = 0;
            return;
        }
        int i4 = i2 - i3;
        this.f19362OooO0Oo = i4;
        this.f19361OooO0OO = i - i4;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x005f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0066 A[LOOP:2: B:35:0x005d->B:39:0x0066, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:48:0x0065 A[SYNTHETIC] */
    public final boolean OooOo0O(int i) throws IOException {
        int iOooOOoo;
        int i2 = i & 7;
        if (i2 != 0) {
            if (i2 == 1) {
                OooOo0o(8);
                return true;
            }
            if (i2 == 2) {
                OooOo0o(OooOOO());
                return true;
            }
            if (i2 != 3) {
                if (i2 == 4) {
                    return false;
                }
                if (i2 != 5) {
                    throw new InvalidProtocolBufferException("Protocol message tag had invalid wire type.");
                }
                OooOo0o(4);
                return true;
            }
            do {
                iOooOOoo = OooOOoo();
                if (iOooOOoo == 0) {
                    break;
                }
            } while (OooOo0O(iOooOOoo));
            OooO00o(((i >>> 3) << 3) | 4);
            return true;
        }
        int i3 = this.f19361OooO0OO;
        int i4 = this.f19364OooO0o0;
        if (i3 - i4 < 10) {
            for (int i5 = 0; i5 < 10; i5++) {
                if (OooOO0o() >= 0) {
                }
            }
            throw InvalidProtocolBufferException.OooO00o();
        }
        byte[] bArr = this.f19359OooO00o;
        int i6 = 0;
        while (i6 < 10) {
            int i7 = i4 + 1;
            if (bArr[i4] >= 0) {
                this.f19364OooO0o0 = i7;
            } else {
                i6++;
                i4 = i7;
            }
        }
        while (i5 < 10) {
            if (OooOO0o() >= 0) {
            }
        }
        throw InvalidProtocolBufferException.OooO00o();
        return true;
    }

    public final void OooOo0o(int i) throws IOException {
        int i2 = this.f19361OooO0OO;
        int i3 = this.f19364OooO0o0;
        if (i <= i2 - i3 && i >= 0) {
            this.f19364OooO0o0 = i3 + i;
            return;
        }
        if (i < 0) {
            throw InvalidProtocolBufferException.OooO0O0();
        }
        int i4 = this.f19366OooO0oo;
        int i5 = i4 + i3 + i;
        int i6 = this.f19358OooO;
        if (i5 > i6) {
            OooOo0o((i6 - i4) - i3);
            throw InvalidProtocolBufferException.OooO0Oo();
        }
        int i7 = i2 - i3;
        this.f19364OooO0o0 = i2;
        OooOo0(1);
        while (true) {
            int i8 = i - i7;
            int i9 = this.f19361OooO0OO;
            if (i8 <= i9) {
                this.f19364OooO0o0 = i8;
                return;
            } else {
                i7 += i9;
                this.f19364OooO0o0 = i9;
                OooOo0(1);
            }
        }
    }

    public OooOO0O(InputStream inputStream) {
        this.f19358OooO = Integer.MAX_VALUE;
        this.f19359OooO00o = new byte[4096];
        this.f19364OooO0o0 = 0;
        this.f19366OooO0oo = 0;
        this.f19363OooO0o = inputStream;
        this.f19360OooO0O0 = false;
    }
}
