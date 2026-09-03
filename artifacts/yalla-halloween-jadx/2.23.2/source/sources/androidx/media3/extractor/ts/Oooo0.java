package androidx.media3.extractor.ts;

import androidx.annotation.Nullable;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.AacUtil;
import androidx.media3.extractor.TrackOutput;
import java.util.Collections;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import p080o000OoO.o000;
import p080o000OoO.o000O000;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class Oooo0 implements OooOOO0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f9071OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final String f9072OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o000O000 f9073OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o000 f9074OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public TrackOutput f9075OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public androidx.media3.common.OooOO0 f9076OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public String f9077OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f9078OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f9079OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f9080OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public long f9081OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public boolean f9082OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public int f9083OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public int f9084OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int f9085OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public boolean f9086OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public int f9087OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public long f9088OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public long f9089OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @Nullable
    public String f9090OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public int f9091OooOo00;

    public Oooo0(@Nullable String str) {
        this.f9072OooO00o = str;
        o000O000 o000o001 = new o000O000(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
        this.f9073OooO0O0 = o000o001;
        byte[] bArr = o000o001.f34962OooO00o;
        this.f9074OooO0OO = new o000(bArr, bArr.length);
        this.f9081OooOO0O = -9223372036854775807L;
    }

    @Override // androidx.media3.extractor.ts.OooOOO0
    public final void OooO0O0() {
        this.f9078OooO0oO = 0;
        this.f9081OooOO0O = -9223372036854775807L;
        this.f9082OooOO0o = false;
    }

    @Override // androidx.media3.extractor.ts.OooOOO0
    public final void OooO0OO(o000O000 o000o001) throws ParserException {
        int iOooO0oO;
        boolean zOooO0o;
        p080o000OoO.o00Oo0.OooO0o(this.f9075OooO0Oo);
        while (true) {
            int i = o000o001.f34964OooO0OO - o000o001.f34963OooO0O0;
            if (i <= 0) {
                return;
            }
            int i2 = this.f9078OooO0oO;
            if (i2 != 0) {
                if (i2 != 1) {
                    o000O000 o000o002 = this.f9073OooO0O0;
                    o000 o000Var = this.f9074OooO0OO;
                    if (i2 == 2) {
                        int iOooOo0O = ((this.f9080OooOO0 & (-225)) << 8) | o000o001.OooOo0O();
                        this.f9071OooO = iOooOo0O;
                        if (iOooOo0O > o000o002.f34962OooO00o.length) {
                            o000o002.OooOooO(iOooOo0O);
                            byte[] bArr = o000o002.f34962OooO00o;
                            o000Var.getClass();
                            o000Var.OooOO0(bArr.length, bArr);
                        }
                        this.f9079OooO0oo = 0;
                        this.f9078OooO0oO = 3;
                    } else {
                        if (i2 != 3) {
                            throw new IllegalStateException();
                        }
                        int iMin = Math.min(i, this.f9071OooO - this.f9079OooO0oo);
                        o000o001.OooO0Oo(this.f9079OooO0oo, iMin, o000Var.f34922OooO00o);
                        int i3 = this.f9079OooO0oo + iMin;
                        this.f9079OooO0oo = i3;
                        if (i3 == this.f9071OooO) {
                            o000Var.OooOO0O(0);
                            if (o000Var.OooO0o()) {
                                if (this.f9082OooOO0o) {
                                }
                                this.f9078OooO0oO = 0;
                            } else {
                                this.f9082OooOO0o = true;
                                int iOooO0oO2 = o000Var.OooO0oO(1);
                                int iOooO0oO3 = iOooO0oO2 == 1 ? o000Var.OooO0oO(1) : 0;
                                this.f9084OooOOO0 = iOooO0oO3;
                                if (iOooO0oO3 != 0) {
                                    throw ParserException.OooO00o(null, null);
                                }
                                if (iOooO0oO2 == 1) {
                                    o000Var.OooO0oO((o000Var.OooO0oO(2) + 1) * 8);
                                }
                                if (!o000Var.OooO0o()) {
                                    throw ParserException.OooO00o(null, null);
                                }
                                this.f9083OooOOO = o000Var.OooO0oO(6);
                                int iOooO0oO4 = o000Var.OooO0oO(4);
                                int iOooO0oO5 = o000Var.OooO0oO(3);
                                if (iOooO0oO4 != 0 || iOooO0oO5 != 0) {
                                    throw ParserException.OooO00o(null, null);
                                }
                                if (iOooO0oO2 == 0) {
                                    int iOooO0o0 = o000Var.OooO0o0();
                                    int iOooO0O0 = o000Var.OooO0O0();
                                    AacUtil.OooO00o oooO00oOooO0O0 = AacUtil.OooO0O0(o000Var, true);
                                    this.f9090OooOo0 = oooO00oOooO0O0.f8363OooO0OO;
                                    this.f9087OooOOo = oooO00oOooO0O0.f8361OooO00o;
                                    this.f9091OooOo00 = oooO00oOooO0O0.f8362OooO0O0;
                                    int iOooO0O1 = iOooO0O0 - o000Var.OooO0O0();
                                    o000Var.OooOO0O(iOooO0o0);
                                    byte[] bArr2 = new byte[(iOooO0O1 + 7) / 8];
                                    o000Var.OooO0oo(iOooO0O1, bArr2);
                                    androidx.media3.common.OooOO0.OooO00o oooO00o = new androidx.media3.common.OooOO0.OooO00o();
                                    oooO00o.f6436OooO00o = this.f9077OooO0o0;
                                    oooO00o.f6445OooOO0O = "audio/mp4a-latm";
                                    oooO00o.f6443OooO0oo = this.f9090OooOo0;
                                    oooO00o.f6454OooOo = this.f9091OooOo00;
                                    oooO00o.f6460OooOoO0 = this.f9087OooOOo;
                                    oooO00o.f6448OooOOO0 = Collections.singletonList(bArr2);
                                    oooO00o.f6438OooO0OO = this.f9072OooO00o;
                                    androidx.media3.common.OooOO0 oooOO1 = new androidx.media3.common.OooOO0(oooO00o);
                                    if (!oooOO1.equals(this.f9076OooO0o)) {
                                        this.f9076OooO0o = oooOO1;
                                        this.f9089OooOOoo = 1024000000 / ((long) oooOO1.f6425OooOoo);
                                        this.f9075OooO0Oo.OooO0O0(oooOO1);
                                    }
                                } else {
                                    int iOooO0oO6 = o000Var.OooO0oO((o000Var.OooO0oO(2) + 1) * 8);
                                    int iOooO0O2 = o000Var.OooO0O0();
                                    AacUtil.OooO00o oooO00oOooO0O1 = AacUtil.OooO0O0(o000Var, true);
                                    this.f9090OooOo0 = oooO00oOooO0O1.f8363OooO0OO;
                                    this.f9087OooOOo = oooO00oOooO0O1.f8361OooO00o;
                                    this.f9091OooOo00 = oooO00oOooO0O1.f8362OooO0O0;
                                    o000Var.OooOOO0(iOooO0oO6 - (iOooO0O2 - o000Var.OooO0O0()));
                                }
                                int iOooO0oO7 = o000Var.OooO0oO(3);
                                this.f9085OooOOOO = iOooO0oO7;
                                if (iOooO0oO7 == 0) {
                                    o000Var.OooOOO0(8);
                                } else if (iOooO0oO7 == 1) {
                                    o000Var.OooOOO0(9);
                                } else if (iOooO0oO7 == 3 || iOooO0oO7 == 4 || iOooO0oO7 == 5) {
                                    o000Var.OooOOO0(6);
                                } else {
                                    if (iOooO0oO7 != 6 && iOooO0oO7 != 7) {
                                        throw new IllegalStateException();
                                    }
                                    o000Var.OooOOO0(1);
                                }
                                boolean zOooO0o2 = o000Var.OooO0o();
                                this.f9086OooOOOo = zOooO0o2;
                                this.f9088OooOOo0 = 0L;
                                if (zOooO0o2) {
                                    if (iOooO0oO2 == 1) {
                                        this.f9088OooOOo0 = o000Var.OooO0oO((o000Var.OooO0oO(2) + 1) * 8);
                                    } else {
                                        do {
                                            zOooO0o = o000Var.OooO0o();
                                            this.f9088OooOOo0 = (this.f9088OooOOo0 << 8) + ((long) o000Var.OooO0oO(8));
                                        } while (zOooO0o);
                                    }
                                }
                                if (o000Var.OooO0o()) {
                                    o000Var.OooOOO0(8);
                                }
                            }
                            if (this.f9084OooOOO0 != 0) {
                                throw ParserException.OooO00o(null, null);
                            }
                            if (this.f9083OooOOO != 0) {
                                throw ParserException.OooO00o(null, null);
                            }
                            if (this.f9085OooOOOO != 0) {
                                throw ParserException.OooO00o(null, null);
                            }
                            int i4 = 0;
                            do {
                                iOooO0oO = o000Var.OooO0oO(8);
                                i4 += iOooO0oO;
                            } while (iOooO0oO == 255);
                            int iOooO0o1 = o000Var.OooO0o0();
                            if ((iOooO0o1 & 7) == 0) {
                                o000o002.Oooo00O(iOooO0o1 >> 3);
                            } else {
                                o000Var.OooO0oo(i4 * 8, o000o002.f34962OooO00o);
                                o000o002.Oooo00O(0);
                            }
                            this.f9075OooO0Oo.OooO0OO(i4, o000o002);
                            long j = this.f9081OooOO0O;
                            if (j != -9223372036854775807L) {
                                this.f9075OooO0Oo.OooO0o0(j, 1, i4, 0, null);
                                this.f9081OooOO0O += this.f9089OooOOoo;
                            }
                            if (this.f9086OooOOOo) {
                                o000Var.OooOOO0((int) this.f9088OooOOo0);
                            }
                            this.f9078OooO0oO = 0;
                        } else {
                            continue;
                        }
                    }
                } else {
                    int iOooOo0O2 = o000o001.OooOo0O();
                    if ((iOooOo0O2 & 224) == 224) {
                        this.f9080OooOO0 = iOooOo0O2;
                        this.f9078OooO0oO = 2;
                    } else if (iOooOo0O2 != 86) {
                        this.f9078OooO0oO = 0;
                    }
                }
            } else if (o000o001.OooOo0O() == 86) {
                this.f9078OooO0oO = 1;
            }
        }
    }

    @Override // androidx.media3.extractor.ts.OooOOO0
    public final void OooO0Oo() {
    }

    @Override // androidx.media3.extractor.ts.OooOOO0
    public final void OooO0o(o000OOoO.Oooo0 oooo0, TsPayloadReader.OooO0o oooO0o) {
        oooO0o.OooO00o();
        oooO0o.OooO0O0();
        this.f9075OooO0Oo = oooo0.OooOOOO(oooO0o.f9129OooO0Oo, 1);
        oooO0o.OooO0O0();
        this.f9077OooO0o0 = oooO0o.f9130OooO0o0;
    }

    @Override // androidx.media3.extractor.ts.OooOOO0
    public final void OooO0o0(int i, long j) {
        if (j != -9223372036854775807L) {
            this.f9081OooOO0O = j;
        }
    }
}
