package p696oO0OO0oo;

import java.math.BigInteger;
import java.util.Random;
import p711ooOOOOoo.OooOO0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class OooOO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public p711ooOOOOoo.OooO0O0 f52759OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public OooOOO0 f52760OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public OooOOO0 f52761OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public BigInteger f52762OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public BigInteger f52764OooO0o0;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f52763OooO0o = 0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public p704oO0OoOoO.OooOO0O f52765OooO0oO = null;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public OooOOO f52766OooO0oo = null;

    public static abstract class OooO00o extends OooOO0O {
        /* JADX WARN: Illegal instructions before constructor call */
        public OooO00o(int i, int i2, int i3, int i4) {
            OooOO0 oooOO0OooO00o;
            if (i2 == 0) {
                throw new IllegalArgumentException("k1 must be > 0");
            }
            if (i3 == 0) {
                if (i4 != 0) {
                    throw new IllegalArgumentException("k3 must be 0 if k2 == 0");
                }
                oooOO0OooO00o = p711ooOOOOoo.OooO0OO.OooO00o(new int[]{0, i2, i});
            } else {
                if (i3 <= i2) {
                    throw new IllegalArgumentException("k2 must be > k1");
                }
                if (i4 <= i3) {
                    throw new IllegalArgumentException("k3 must be > k2");
                }
                oooOO0OooO00o = p711ooOOOOoo.OooO0OO.OooO00o(new int[]{0, i2, i3, i4, i});
            }
            super(oooOO0OooO00o);
        }

        @Override // p696oO0OO0oo.OooOO0O
        public final OooOo00 OooO0O0(BigInteger bigInteger, BigInteger bigInteger2, boolean z) {
            OooOOO0 oooOOO0OooO0oO = OooO0oO(bigInteger);
            OooOOO0 oooOOO0OooO0oO2 = OooO0oO(bigInteger2);
            int i = this.f52763OooO0o;
            if (i == 5 || i == 6) {
                if (!oooOOO0OooO0oO.OooO()) {
                    oooOOO0OooO0oO2 = oooOOO0OooO0oO2.OooO0Oo(oooOOO0OooO0oO).OooO00o(oooOOO0OooO0oO);
                } else if (!oooOOO0OooO0oO2.OooOOOO().equals(this.f52761OooO0OO)) {
                    throw new IllegalArgumentException();
                }
            }
            return OooO0OO(oooOOO0OooO0oO, oooOOO0OooO0oO2, z);
        }

        @Override // p696oO0OO0oo.OooOO0O
        public final OooOo00 OooO0o0(int i, BigInteger bigInteger) {
            OooOOO0 oooOOO0OooO0oO = OooO0oO(bigInteger);
            OooOOO0 oooOOO0OooO00o = null;
            if (oooOOO0OooO0oO.OooO()) {
                oooOOO0OooO00o = this.f52761OooO0OO.OooOOO();
            } else {
                OooOOO0 oooOOO0OooO00o2 = oooOOO0OooO0oO.OooOOOO().OooO0oO().OooOO0(this.f52761OooO0OO).OooO00o(this.f52760OooO0O0).OooO00o(oooOOO0OooO0oO);
                if (!oooOOO0OooO00o2.OooO()) {
                    OooOOO0 oooOOO0OooO0oO2 = OooO0oO(OooOO0.f52756OooO00o);
                    int iOooO0oo = OooO0oo();
                    Random random = new Random();
                    while (true) {
                        OooOOO0 oooOOO0OooO0oO3 = OooO0oO(new BigInteger(iOooO0oo, random));
                        OooOOO0 oooOOO0OooO00o3 = oooOOO0OooO00o2;
                        OooOOO0 oooOOO0OooO00o4 = oooOOO0OooO0oO2;
                        for (int i2 = 1; i2 < iOooO0oo; i2++) {
                            OooOOO0 oooOOO0OooOOOO = oooOOO0OooO00o3.OooOOOO();
                            oooOOO0OooO00o4 = oooOOO0OooO00o4.OooOOOO().OooO00o(oooOOO0OooOOOO.OooOO0(oooOOO0OooO0oO3));
                            oooOOO0OooO00o3 = oooOOO0OooOOOO.OooO00o(oooOOO0OooO00o2);
                        }
                        if (!oooOOO0OooO00o3.OooO()) {
                            oooOOO0OooO00o2 = null;
                            break;
                        }
                        if (!oooOOO0OooO00o4.OooOOOO().OooO00o(oooOOO0OooO00o4).OooO()) {
                            oooOOO0OooO00o2 = oooOOO0OooO00o4;
                            break;
                        }
                    }
                }
                if (oooOOO0OooO00o2 != null) {
                    if (oooOOO0OooO00o2.OooOOo() != (i == 1)) {
                        oooOOO0OooO00o2 = oooOOO0OooO00o2.OooO0O0();
                    }
                    int i3 = this.f52763OooO0o;
                    oooOOO0OooO00o = (i3 == 5 || i3 == 6) ? oooOOO0OooO00o2.OooO00o(oooOOO0OooO0oO) : oooOOO0OooO00o2.OooOO0(oooOOO0OooO0oO);
                }
            }
            if (oooOOO0OooO00o != null) {
                return OooO0OO(oooOOO0OooO0oO, oooOOO0OooO00o, true);
            }
            throw new IllegalArgumentException("Invalid point compression");
        }
    }

    public static abstract class OooO0O0 extends OooOO0O {
        /* JADX WARN: Code duplicated, block: B:14:0x0021  */
        /* JADX WARN: Illegal instructions before constructor call */
        public OooO0O0(BigInteger bigInteger) {
            p711ooOOOOoo.OooOO0O oooOO0O;
            p711ooOOOOoo.OooOO0O oooOO0O2 = p711ooOOOOoo.OooO0OO.f53509OooO00o;
            int iBitLength = bigInteger.bitLength();
            if (bigInteger.signum() <= 0 || iBitLength < 2) {
                throw new IllegalArgumentException("'characteristic' must be >= 2");
            }
            if (iBitLength >= 3) {
                oooOO0O = new p711ooOOOOoo.OooOO0O(bigInteger);
            } else {
                int iIntValue = bigInteger.intValue();
                if (iIntValue == 2) {
                    oooOO0O = p711ooOOOOoo.OooO0OO.f53509OooO00o;
                } else if (iIntValue != 3) {
                    oooOO0O = new p711ooOOOOoo.OooOO0O(bigInteger);
                } else {
                    oooOO0O = p711ooOOOOoo.OooO0OO.f53510OooO0O0;
                }
            }
            super(oooOO0O);
        }

        @Override // p696oO0OO0oo.OooOO0O
        public final OooOo00 OooO0o0(int i, BigInteger bigInteger) {
            OooOOO0 oooOOO0OooO0oO = OooO0oO(bigInteger);
            OooOOO0 oooOOO0OooOOO = oooOOO0OooO0oO.OooOOOO().OooO00o(this.f52760OooO0O0).OooOO0(oooOOO0OooO0oO).OooO00o(this.f52761OooO0OO).OooOOO();
            if (oooOOO0OooOOO == null) {
                throw new IllegalArgumentException("Invalid point compression");
            }
            if (oooOOO0OooOOO.OooOOo() != (i == 1)) {
                oooOOO0OooOOO = oooOOO0OooOOO.OooOOO0();
            }
            return OooO0OO(oooOOO0OooO0oO, oooOOO0OooOOO, true);
        }
    }

    public OooOO0O(p711ooOOOOoo.OooO0O0 oooO0O0) {
        this.f52759OooO00o = oooO0O0;
    }

    public abstract OooOo00 OooO();

    public abstract OooOO0O OooO00o();

    public OooOo00 OooO0O0(BigInteger bigInteger, BigInteger bigInteger2, boolean z) {
        return OooO0OO(OooO0oO(bigInteger), OooO0oO(bigInteger2), z);
    }

    public abstract OooOo00 OooO0OO(OooOOO0 oooOOO0, OooOOO0 oooOOO1, boolean z);

    public final OooOo00 OooO0Oo(byte[] bArr) {
        OooOo00 oooOo00OooO;
        int iOooO0oo = (OooO0oo() + 7) / 8;
        byte b = bArr[0];
        if (b != 0) {
            if (b == 2 || b == 3) {
                if (bArr.length != iOooO0oo + 1) {
                    throw new IllegalArgumentException("Incorrect length for compressed encoding");
                }
                oooOo00OooO = OooO0o0(b & 1, oO000Oo.OooO0O0.OooO0O0(bArr, 1, iOooO0oo));
                if (!oooOo00OooO.OooOOOo()) {
                    throw new IllegalArgumentException("Invalid point");
                }
            } else if (b != 4) {
                if (b != 6 && b != 7) {
                    StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Invalid point encoding 0x");
                    sbOooO0o0.append(Integer.toString(b, 16));
                    throw new IllegalArgumentException(sbOooO0o0.toString());
                }
                if (bArr.length != (iOooO0oo * 2) + 1) {
                    throw new IllegalArgumentException("Incorrect length for hybrid encoding");
                }
                BigInteger bigIntegerOooO0O0 = oO000Oo.OooO0O0.OooO0O0(bArr, 1, iOooO0oo);
                BigInteger bigIntegerOooO0O1 = oO000Oo.OooO0O0.OooO0O0(bArr, iOooO0oo + 1, iOooO0oo);
                if (bigIntegerOooO0O1.testBit(0) != (b == 7)) {
                    throw new IllegalArgumentException("Inconsistent Y coordinate in hybrid encoding");
                }
                oooOo00OooO = OooOO0o(bigIntegerOooO0O0, bigIntegerOooO0O1);
            } else {
                if (bArr.length != (iOooO0oo * 2) + 1) {
                    throw new IllegalArgumentException("Incorrect length for uncompressed encoding");
                }
                oooOo00OooO = OooOO0o(oO000Oo.OooO0O0.OooO0O0(bArr, 1, iOooO0oo), oO000Oo.OooO0O0.OooO0O0(bArr, iOooO0oo + 1, iOooO0oo));
            }
        } else {
            if (bArr.length != 1) {
                throw new IllegalArgumentException("Incorrect length for infinity encoding");
            }
            oooOo00OooO = OooO();
        }
        if (b == 0 || !oooOo00OooO.OooOO0()) {
            return oooOo00OooO;
        }
        throw new IllegalArgumentException("Invalid infinity encoding");
    }

    public final boolean OooO0o(OooOO0O oooOO0O) {
        return this == oooOO0O || (oooOO0O != null && this.f52759OooO00o.equals(oooOO0O.f52759OooO00o) && this.f52760OooO0O0.OooOOoo().equals(oooOO0O.f52760OooO0O0.OooOOoo()) && this.f52761OooO0OO.OooOOoo().equals(oooOO0O.f52761OooO0OO.OooOOoo()));
    }

    public abstract OooOo00 OooO0o0(int i, BigInteger bigInteger);

    public abstract OooOOO0 OooO0oO(BigInteger bigInteger);

    public abstract int OooO0oo();

    public OooOo00 OooOO0(OooOo00 oooOo00) {
        if (this == oooOo00.f52786OooO00o) {
            return oooOo00;
        }
        if (oooOo00.OooOO0()) {
            return OooO();
        }
        OooOo00 oooOo00OooOOO = oooOo00.OooOOO();
        OooOo00 oooOo00OooO0O0 = OooO0O0(oooOo00OooOOO.f52787OooO0O0.OooOOoo(), oooOo00OooOOO.OooO0oo().OooOOoo(), oooOo00OooOOO.f52790OooO0o0);
        if (oooOo00OooO0O0.OooOO0o()) {
            return oooOo00OooO0O0;
        }
        throw new IllegalArgumentException("Invalid point coordinates");
    }

    public boolean OooOO0O(int i) {
        return i == 0;
    }

    public final OooOo00 OooOO0o(BigInteger bigInteger, BigInteger bigInteger2) {
        OooOo00 oooOo00OooO0O0 = OooO0O0(bigInteger, bigInteger2, false);
        if (oooOo00OooO0O0.OooOO0o()) {
            return oooOo00OooO0O0;
        }
        throw new IllegalArgumentException("Invalid point coordinates");
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof OooOO0O) && OooO0o((OooOO0O) obj));
    }

    public final int hashCode() {
        return (this.f52759OooO00o.hashCode() ^ Integer.rotateLeft(this.f52760OooO0O0.OooOOoo().hashCode(), 8)) ^ Integer.rotateLeft(this.f52761OooO0OO.OooOOoo().hashCode(), 16);
    }

    public static class OooO0OO extends OooO00o {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public int f52767OooO;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public int f52768OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public int f52769OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public int f52770OooOO0o;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public OooOo00.OooO0OO f52771OooOOO0;

        public OooO0OO(int i, int i2, int i3, int i4, BigInteger bigInteger, BigInteger bigInteger2) {
            this(i, i2, i3, i4, bigInteger, bigInteger2, (BigInteger) null, (BigInteger) null);
        }

        public OooO0OO(int i, int i2, int i3, int i4, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
            super(i, i2, i3, i4);
            this.f52767OooO = i;
            this.f52768OooOO0 = i2;
            this.f52769OooOO0O = i3;
            this.f52770OooOO0o = i4;
            this.f52762OooO0Oo = bigInteger3;
            this.f52764OooO0o0 = bigInteger4;
            this.f52771OooOOO0 = new OooOo00.OooO0OO(this, null, null, false);
            this.f52760OooO0O0 = OooO0oO(bigInteger);
            this.f52761OooO0OO = OooO0oO(bigInteger2);
            this.f52763OooO0o = 6;
        }

        public OooO0OO(int i, int i2, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
            this(i, i2, 0, 0, bigInteger, bigInteger2, bigInteger3, bigInteger4);
        }

        @Override // p696oO0OO0oo.OooOO0O
        public final OooOo00 OooO() {
            return this.f52771OooOOO0;
        }

        @Override // p696oO0OO0oo.OooOO0O
        public final OooOO0O OooO00o() {
            return new OooO0OO(this.f52767OooO, this.f52768OooOO0, this.f52769OooOO0O, this.f52770OooOO0o, this.f52760OooO0O0, this.f52761OooO0OO, this.f52762OooO0Oo, this.f52764OooO0o0);
        }

        @Override // p696oO0OO0oo.OooOO0O
        public final OooOo00 OooO0OO(OooOOO0 oooOOO0, OooOOO0 oooOOO1, boolean z) {
            return new OooOo00.OooO0OO(this, oooOOO0, oooOOO1, z);
        }

        @Override // p696oO0OO0oo.OooOO0O
        public final OooOOO0 OooO0oO(BigInteger bigInteger) {
            return new OooOOO0.OooO00o(this.f52767OooO, this.f52768OooOO0, this.f52769OooOO0O, this.f52770OooOO0o, bigInteger);
        }

        @Override // p696oO0OO0oo.OooOO0O
        public final int OooO0oo() {
            return this.f52767OooO;
        }

        @Override // p696oO0OO0oo.OooOO0O
        public final boolean OooOO0O(int i) {
            return i == 0 || i == 1 || i == 6;
        }

        public OooO0OO(int i, int i2, int i3, int i4, OooOOO0 oooOOO0, OooOOO0 oooOOO1, BigInteger bigInteger, BigInteger bigInteger2) {
            super(i, i2, i3, i4);
            this.f52767OooO = i;
            this.f52768OooOO0 = i2;
            this.f52769OooOO0O = i3;
            this.f52770OooOO0o = i4;
            this.f52762OooO0Oo = bigInteger;
            this.f52764OooO0o0 = bigInteger2;
            this.f52771OooOOO0 = new OooOo00.OooO0OO(this, null, null, false);
            this.f52760OooO0O0 = oooOOO0;
            this.f52761OooO0OO = oooOOO1;
            this.f52763OooO0o = 6;
        }
    }

    public static class OooO0o extends OooO0O0 {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public BigInteger f52772OooO;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public BigInteger f52773OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public OooOo00.OooO0o f52774OooOO0O;

        public OooO0o(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
            this(bigInteger, bigInteger2, bigInteger3, null, null);
        }

        public OooO0o(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5) {
            super(bigInteger);
            this.f52772OooO = bigInteger;
            this.f52773OooOO0 = OooOOO0.OooO0O0.OooOo00(bigInteger);
            this.f52774OooOO0O = new OooOo00.OooO0o(this, null, null, false);
            this.f52760OooO0O0 = OooO0oO(bigInteger2);
            this.f52761OooO0OO = OooO0oO(bigInteger3);
            this.f52762OooO0Oo = bigInteger4;
            this.f52764OooO0o0 = bigInteger5;
            this.f52763OooO0o = 4;
        }

        @Override // p696oO0OO0oo.OooOO0O
        public final OooOo00 OooO() {
            return this.f52774OooOO0O;
        }

        @Override // p696oO0OO0oo.OooOO0O
        public final OooOO0O OooO00o() {
            return new OooO0o(this.f52772OooO, this.f52773OooOO0, this.f52760OooO0O0, this.f52761OooO0OO, this.f52762OooO0Oo, this.f52764OooO0o0);
        }

        @Override // p696oO0OO0oo.OooOO0O
        public final OooOo00 OooO0OO(OooOOO0 oooOOO0, OooOOO0 oooOOO1, boolean z) {
            return new OooOo00.OooO0o(this, oooOOO0, oooOOO1, z);
        }

        @Override // p696oO0OO0oo.OooOO0O
        public final OooOOO0 OooO0oO(BigInteger bigInteger) {
            return new OooOOO0.OooO0O0(this.f52772OooO, this.f52773OooOO0, bigInteger);
        }

        @Override // p696oO0OO0oo.OooOO0O
        public final int OooO0oo() {
            return this.f52772OooO.bitLength();
        }

        @Override // p696oO0OO0oo.OooOO0O
        public final OooOo00 OooOO0(OooOo00 oooOo00) {
            int i;
            return (this == oooOo00.f52786OooO00o || this.f52763OooO0o != 2 || oooOo00.OooOO0() || !((i = oooOo00.f52786OooO00o.f52763OooO0o) == 2 || i == 3 || i == 4)) ? super.OooOO0(oooOo00) : new OooOo00.OooO0o(this, OooO0oO(oooOo00.f52787OooO0O0.OooOOoo()), OooO0oO(oooOo00.f52788OooO0OO.OooOOoo()), new OooOOO0[]{OooO0oO(oooOo00.f52789OooO0Oo[0].OooOOoo())}, oooOo00.f52790OooO0o0);
        }

        @Override // p696oO0OO0oo.OooOO0O
        public final boolean OooOO0O(int i) {
            return i == 0 || i == 1 || i == 2 || i == 4;
        }

        public OooO0o(BigInteger bigInteger, BigInteger bigInteger2, OooOOO0 oooOOO0, OooOOO0 oooOOO1, BigInteger bigInteger3, BigInteger bigInteger4) {
            super(bigInteger);
            this.f52772OooO = bigInteger;
            this.f52773OooOO0 = bigInteger2;
            this.f52774OooOO0O = new OooOo00.OooO0o(this, null, null, false);
            this.f52760OooO0O0 = oooOOO0;
            this.f52761OooO0OO = oooOOO1;
            this.f52762OooO0Oo = bigInteger3;
            this.f52764OooO0o0 = bigInteger4;
            this.f52763OooO0o = 4;
        }
    }
}
