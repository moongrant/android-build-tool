package p677o0oooo0o;

import OooO0o.OooO0OO;
import Oooo000.o00O0O;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
public final class ooOOO0Oo extends oO0OO0O {

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public static final ConcurrentMap<OooO00o, ooOOO0Oo> f52197Oooo0oo = new ConcurrentHashMap();

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final String f52198Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public byte[] f52199Oooo0oO;

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f52200OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final byte[] f52201OooO0O0;

        public OooO00o(byte[] bArr) {
            this.f52200OooO00o = oO000Oo.OooO00o.OooO0oO(bArr);
            this.f52201OooO0O0 = bArr;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof OooO00o) {
                return oO000Oo.OooO00o.OooO00o(this.f52201OooO0O0, ((OooO00o) obj).f52201OooO0O0);
            }
            return false;
        }

        public final int hashCode() {
            return this.f52200OooO00o;
        }
    }

    public ooOOO0Oo(String str) {
        char cCharAt;
        if (str == null) {
            throw new IllegalArgumentException("'identifier' cannot be null");
        }
        boolean zOooOo0o = false;
        if (str.length() >= 3 && str.charAt(1) == '.' && (cCharAt = str.charAt(0)) >= '0' && cCharAt <= '2') {
            zOooOo0o = OooOo0o(str, 2);
        }
        if (!zOooOo0o) {
            throw new IllegalArgumentException(OooO0OO.OooO00o("string ", str, " not an OID"));
        }
        this.f52198Oooo0o = str;
    }

    public ooOOO0Oo(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        boolean z = true;
        long j = 0;
        BigInteger bigIntegerShiftLeft = null;
        for (int i = 0; i != bArr.length; i++) {
            int i2 = bArr[i] & UByte.MAX_VALUE;
            if (j <= 72057594037927808L) {
                long j2 = j + ((long) (i2 & 127));
                if ((i2 & 128) == 0) {
                    if (z) {
                        if (j2 < 40) {
                            stringBuffer.append('0');
                        } else if (j2 < 80) {
                            stringBuffer.append('1');
                            j2 -= 40;
                        } else {
                            stringBuffer.append('2');
                            j2 -= 80;
                        }
                        z = false;
                    }
                    stringBuffer.append('.');
                    stringBuffer.append(j2);
                    j = 0;
                } else {
                    j = j2 << 7;
                }
            } else {
                BigInteger bigIntegerOr = (bigIntegerShiftLeft == null ? BigInteger.valueOf(j) : bigIntegerShiftLeft).or(BigInteger.valueOf(i2 & 127));
                if ((i2 & 128) == 0) {
                    if (z) {
                        stringBuffer.append('2');
                        bigIntegerOr = bigIntegerOr.subtract(BigInteger.valueOf(80L));
                        z = false;
                    }
                    stringBuffer.append('.');
                    stringBuffer.append(bigIntegerOr);
                    j = 0;
                    bigIntegerShiftLeft = null;
                } else {
                    bigIntegerShiftLeft = bigIntegerOr.shiftLeft(7);
                }
            }
        }
        this.f52198Oooo0o = stringBuffer.toString();
        this.f52199Oooo0oO = oO000Oo.OooO00o.OooO0OO(bArr);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.concurrent.ConcurrentHashMap, java.util.concurrent.ConcurrentMap<o0oooo0o.ooOOO0Oo$OooO00o, o0oooo0o.ooOOO0Oo>] */
    public static ooOOO0Oo OooOOoo(byte[] bArr) {
        ooOOO0Oo ooooo0oo = (ooOOO0Oo) f52197Oooo0oo.get(new OooO00o(bArr));
        return ooooo0oo == null ? new ooOOO0Oo(bArr) : ooooo0oo;
    }

    public static ooOOO0Oo OooOo0(Object obj) {
        if (obj == null || (obj instanceof ooOOO0Oo)) {
            return (ooOOO0Oo) obj;
        }
        if (obj instanceof oO0O00o0) {
            oO0O00o0 oo0o00o0 = (oO0O00o0) obj;
            if (oo0o00o0.OooO0O0() instanceof ooOOO0Oo) {
                return (ooOOO0Oo) oo0o00o0.OooO0O0();
            }
        }
        if (!(obj instanceof byte[])) {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("illegal object in getInstance: ");
            sbOooO0o0.append(obj.getClass().getName());
            throw new IllegalArgumentException(sbOooO0o0.toString());
        }
        try {
            return (ooOOO0Oo) oO0OO0O.OooOO0o((byte[]) obj);
        } catch (IOException e) {
            StringBuilder sbOooO0o1 = OooO00o.OooO00o.OooO0o0("failed to construct object identifier from byte[]: ");
            sbOooO0o1.append(e.getMessage());
            throw new IllegalArgumentException(sbOooO0o1.toString());
        }
    }

    public static boolean OooOo0o(String str, int i) {
        boolean z;
        char cCharAt;
        int length = str.length();
        do {
            z = false;
            while (true) {
                length--;
                if (length < i) {
                    return z;
                }
                cCharAt = str.charAt(length);
                if ('0' > cCharAt || cCharAt > '9') {
                    break;
                }
                z = true;
            }
            if (cCharAt != '.') {
                break;
            }
        } while (z);
        return false;
    }

    @Override // p677o0oooo0o.oO0OO0O
    public final boolean OooO(oO0OO0O oo0oo0o) {
        if (oo0oo0o == this) {
            return true;
        }
        if (oo0oo0o instanceof ooOOO0Oo) {
            return this.f52198Oooo0o.equals(((ooOOO0Oo) oo0oo0o).f52198Oooo0o);
        }
        return false;
    }

    @Override // p677o0oooo0o.oO0OO0O
    public final void OooOO0(oO0OO00 oo0oo00) throws IOException {
        byte[] bArrOooOo00 = OooOo00();
        oo0oo00.OooO0OO(6);
        oo0oo00.OooO0oo(bArrOooOo00.length);
        oo0oo00.OooO0Oo(bArrOooOo00);
    }

    @Override // p677o0oooo0o.oO0OO0O
    public final int OooOO0O() throws IOException {
        int length = OooOo00().length;
        return m.OooO00o(length) + 1 + length;
    }

    @Override // p677o0oooo0o.oO0OO0O
    public final boolean OooOOO0() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0042  */
    /* JADX WARN: Code duplicated, block: B:15:0x0054 A[LOOP:0: B:6:0x0038->B:15:0x0054, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:18:0x004c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x003d  */
    /* JADX WARN: Code duplicated, block: B:9:0x003f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x004c -> B:14:0x0050). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:11:0x0042
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final void OooOOo0(java.io.ByteArrayOutputStream r8) {
        /*
            r7 = this;
            o0O0oOo.o0000O0 r0 = new o0O0oOo.o0000O0
            java.lang.String r1 = r7.f52198Oooo0o
            r0.<init>(r1)
            java.lang.String r1 = r0.OooO0OO()
            int r1 = java.lang.Integer.parseInt(r1)
            int r1 = r1 * 40
            java.lang.String r2 = r0.OooO0OO()
            int r3 = r2.length()
            r4 = 18
            if (r3 > r4) goto L26
            long r5 = (long) r1
            long r1 = java.lang.Long.parseLong(r2)
            long r1 = r1 + r5
            r2 = r1
            r1 = r7
            goto L50
        L26:
            java.math.BigInteger r3 = new java.math.BigInteger
            r3.<init>(r2)
            long r1 = (long) r1
            java.math.BigInteger r1 = java.math.BigInteger.valueOf(r1)
            java.math.BigInteger r1 = r3.add(r1)
            r7.OooOoO0(r8, r1)
            r1 = r7
        L38:
            int r2 = r0.f36693OooO00o
            r3 = -1
            if (r2 == r3) goto L3f
            r2 = 1
            goto L40
        L3f:
            r2 = 0
        L40:
            if (r2 == 0) goto L5d
            java.lang.String r2 = r0.OooO0OO()
            int r3 = r2.length()
            if (r3 > r4) goto L54
            long r2 = java.lang.Long.parseLong(r2)
        L50:
            r1.OooOo(r8, r2)
            goto L38
        L54:
            java.math.BigInteger r3 = new java.math.BigInteger
            r3.<init>(r2)
            r1.OooOoO0(r8, r3)
            goto L38
        L5d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p677o0oooo0o.ooOOO0Oo.OooOOo0(java.io.ByteArrayOutputStream):void");
    }

    public final void OooOo(ByteArrayOutputStream byteArrayOutputStream, long j) {
        byte[] bArr = new byte[9];
        int i = 8;
        bArr[8] = (byte) (((int) j) & 127);
        while (j >= 128) {
            j >>= 7;
            i--;
            bArr[i] = (byte) ((((int) j) & 127) | 128);
        }
        byteArrayOutputStream.write(bArr, i, 9 - i);
    }

    public final synchronized byte[] OooOo00() {
        if (this.f52199Oooo0oO == null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            OooOOo0(byteArrayOutputStream);
            this.f52199Oooo0oO = byteArrayOutputStream.toByteArray();
        }
        return this.f52199Oooo0oO;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.concurrent.ConcurrentHashMap, java.util.concurrent.ConcurrentMap<o0oooo0o.ooOOO0Oo$OooO00o, o0oooo0o.ooOOO0Oo>] */
    public final ooOOO0Oo OooOo0O() {
        OooO00o oooO00o = new OooO00o(OooOo00());
        ?? r1 = f52197Oooo0oo;
        ooOOO0Oo ooooo0oo = (ooOOO0Oo) r1.get(oooO00o);
        if (ooooo0oo != null) {
            return ooooo0oo;
        }
        ooOOO0Oo ooooo0oo2 = (ooOOO0Oo) r1.putIfAbsent(oooO00o, this);
        return ooooo0oo2 == null ? this : ooooo0oo2;
    }

    public final void OooOoO0(ByteArrayOutputStream byteArrayOutputStream, BigInteger bigInteger) {
        int iBitLength = (bigInteger.bitLength() + 6) / 7;
        if (iBitLength == 0) {
            byteArrayOutputStream.write(0);
            return;
        }
        byte[] bArr = new byte[iBitLength];
        int i = iBitLength - 1;
        for (int i2 = i; i2 >= 0; i2--) {
            bArr[i2] = (byte) ((bigInteger.intValue() & 127) | 128);
            bigInteger = bigInteger.shiftRight(7);
        }
        bArr[i] = (byte) (bArr[i] & ByteCompanionObject.MAX_VALUE);
        byteArrayOutputStream.write(bArr, 0, iBitLength);
    }

    @Override // p677o0oooo0o.oO0OO0O, p677o0oooo0o.oOo0o0oO
    public final int hashCode() {
        return this.f52198Oooo0o.hashCode();
    }

    public final String toString() {
        return this.f52198Oooo0o;
    }

    public ooOOO0Oo(ooOOO0Oo ooooo0oo, String str) {
        if (OooOo0o(str, 0)) {
            this.f52198Oooo0o = o00O0O.OooO0O0(new StringBuilder(), ooooo0oo.f52198Oooo0o, ".", str);
            return;
        }
        throw new IllegalArgumentException(OooO0OO.OooO00o("string ", str, " not a valid OID branch"));
    }
}
