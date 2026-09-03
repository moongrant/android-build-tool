package com.google.android.exoplayer2.extractor.ts;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.extractor.TrackOutput;
import java.util.Collections;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import p209o00o0oo0.o00O0O0;
import p245o00oo0o.o00O000o;
import p245o00oo0o.o00OOOOo;
import p245o00oo0o.o00Oo00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class Oooo0 implements OooOOO0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f12304OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final String f12305OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o00Oo00 f12306OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o00OOOOo f12307OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public TrackOutput f12308OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public com.google.android.exoplayer2.OooOo f12309OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public String f12310OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f12311OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f12312OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f12313OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public long f12314OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public boolean f12315OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public int f12316OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public int f12317OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int f12318OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public boolean f12319OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public int f12320OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public long f12321OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public long f12322OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @Nullable
    public String f12323OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public int f12324OooOo00;

    public Oooo0(@Nullable String str) {
        this.f12305OooO00o = str;
        o00Oo00 o00oo00 = new o00Oo00(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
        this.f12306OooO0O0 = o00oo00;
        byte[] bArr = o00oo00.f40591OooO00o;
        this.f12307OooO0OO = new o00OOOOo(bArr, bArr.length);
        this.f12314OooOO0O = -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.OooOOO0
    public final void OooO0O0(o00Oo00 o00oo00) throws ParserException {
        int iOooO0oO;
        boolean zOooO0o;
        o00O000o.OooO0o0(this.f12308OooO0Oo);
        while (true) {
            int i = o00oo00.f40593OooO0OO - o00oo00.f40592OooO0O0;
            if (i <= 0) {
                return;
            }
            int i2 = this.f12311OooO0oO;
            if (i2 != 0) {
                if (i2 != 1) {
                    o00Oo00 o00oo01 = this.f12306OooO0O0;
                    o00OOOOo o00ooooo2 = this.f12307OooO0OO;
                    if (i2 == 2) {
                        int iOooOo0O = ((this.f12313OooOO0 & (-225)) << 8) | o00oo00.OooOo0O();
                        this.f12304OooO = iOooOo0O;
                        if (iOooOo0O > o00oo01.f40591OooO00o.length) {
                            o00oo01.OooOooO(iOooOo0O);
                            byte[] bArr = o00oo01.f40591OooO00o;
                            o00ooooo2.getClass();
                            o00ooooo2.OooOO0(bArr.length, bArr);
                        }
                        this.f12312OooO0oo = 0;
                        this.f12311OooO0oO = 3;
                    } else {
                        if (i2 != 3) {
                            throw new IllegalStateException();
                        }
                        int iMin = Math.min(i, this.f12304OooO - this.f12312OooO0oo);
                        o00oo00.OooO0Oo(this.f12312OooO0oo, iMin, o00ooooo2.f40584OooO00o);
                        int i3 = this.f12312OooO0oo + iMin;
                        this.f12312OooO0oo = i3;
                        if (i3 == this.f12304OooO) {
                            o00ooooo2.OooOO0O(0);
                            if (o00ooooo2.OooO0o()) {
                                if (this.f12315OooOO0o) {
                                }
                                this.f12311OooO0oO = 0;
                            } else {
                                this.f12315OooOO0o = true;
                                int iOooO0oO2 = o00ooooo2.OooO0oO(1);
                                int iOooO0oO3 = iOooO0oO2 == 1 ? o00ooooo2.OooO0oO(1) : 0;
                                this.f12317OooOOO0 = iOooO0oO3;
                                if (iOooO0oO3 != 0) {
                                    throw ParserException.OooO00o(null, null);
                                }
                                if (iOooO0oO2 == 1) {
                                    o00ooooo2.OooO0oO((o00ooooo2.OooO0oO(2) + 1) * 8);
                                }
                                if (!o00ooooo2.OooO0o()) {
                                    throw ParserException.OooO00o(null, null);
                                }
                                this.f12316OooOOO = o00ooooo2.OooO0oO(6);
                                int iOooO0oO4 = o00ooooo2.OooO0oO(4);
                                int iOooO0oO5 = o00ooooo2.OooO0oO(3);
                                if (iOooO0oO4 != 0 || iOooO0oO5 != 0) {
                                    throw ParserException.OooO00o(null, null);
                                }
                                if (iOooO0oO2 == 0) {
                                    int iOooO0o0 = o00ooooo2.OooO0o0();
                                    int iOooO0O0 = o00ooooo2.OooO0O0();
                                    AacUtil.OooO00o oooO00oOooO0O0 = AacUtil.OooO0O0(o00ooooo2, true);
                                    this.f12323OooOo0 = oooO00oOooO0O0.f11441OooO0OO;
                                    this.f12320OooOOo = oooO00oOooO0O0.f11439OooO00o;
                                    this.f12324OooOo00 = oooO00oOooO0O0.f11440OooO0O0;
                                    int iOooO0O1 = iOooO0O0 - o00ooooo2.OooO0O0();
                                    o00ooooo2.OooOO0O(iOooO0o0);
                                    byte[] bArr2 = new byte[(iOooO0O1 + 7) / 8];
                                    o00ooooo2.OooO0oo(iOooO0O1, bArr2);
                                    com.google.android.exoplayer2.OooOo.OooO00o oooO00o = new com.google.android.exoplayer2.OooOo.OooO00o();
                                    oooO00o.f11235OooO00o = this.f12310OooO0o0;
                                    oooO00o.f11244OooOO0O = "audio/mp4a-latm";
                                    oooO00o.f11242OooO0oo = this.f12323OooOo0;
                                    oooO00o.f11253OooOo = this.f12324OooOo00;
                                    oooO00o.f11259OooOoO0 = this.f12320OooOOo;
                                    oooO00o.f11247OooOOO0 = Collections.singletonList(bArr2);
                                    oooO00o.f11237OooO0OO = this.f12305OooO00o;
                                    com.google.android.exoplayer2.OooOo oooOo = new com.google.android.exoplayer2.OooOo(oooO00o);
                                    if (!oooOo.equals(this.f12309OooO0o)) {
                                        this.f12309OooO0o = oooOo;
                                        this.f12322OooOOoo = 1024000000 / ((long) oooOo.f11224OooOoo);
                                        this.f12308OooO0Oo.OooO0OO(oooOo);
                                    }
                                } else {
                                    int iOooO0oO6 = o00ooooo2.OooO0oO((o00ooooo2.OooO0oO(2) + 1) * 8);
                                    int iOooO0O2 = o00ooooo2.OooO0O0();
                                    AacUtil.OooO00o oooO00oOooO0O1 = AacUtil.OooO0O0(o00ooooo2, true);
                                    this.f12323OooOo0 = oooO00oOooO0O1.f11441OooO0OO;
                                    this.f12320OooOOo = oooO00oOooO0O1.f11439OooO00o;
                                    this.f12324OooOo00 = oooO00oOooO0O1.f11440OooO0O0;
                                    o00ooooo2.OooOOO0(iOooO0oO6 - (iOooO0O2 - o00ooooo2.OooO0O0()));
                                }
                                int iOooO0oO7 = o00ooooo2.OooO0oO(3);
                                this.f12318OooOOOO = iOooO0oO7;
                                if (iOooO0oO7 == 0) {
                                    o00ooooo2.OooOOO0(8);
                                } else if (iOooO0oO7 == 1) {
                                    o00ooooo2.OooOOO0(9);
                                } else if (iOooO0oO7 == 3 || iOooO0oO7 == 4 || iOooO0oO7 == 5) {
                                    o00ooooo2.OooOOO0(6);
                                } else {
                                    if (iOooO0oO7 != 6 && iOooO0oO7 != 7) {
                                        throw new IllegalStateException();
                                    }
                                    o00ooooo2.OooOOO0(1);
                                }
                                boolean zOooO0o2 = o00ooooo2.OooO0o();
                                this.f12319OooOOOo = zOooO0o2;
                                this.f12321OooOOo0 = 0L;
                                if (zOooO0o2) {
                                    if (iOooO0oO2 == 1) {
                                        this.f12321OooOOo0 = o00ooooo2.OooO0oO((o00ooooo2.OooO0oO(2) + 1) * 8);
                                    } else {
                                        do {
                                            zOooO0o = o00ooooo2.OooO0o();
                                            this.f12321OooOOo0 = (this.f12321OooOOo0 << 8) + ((long) o00ooooo2.OooO0oO(8));
                                        } while (zOooO0o);
                                    }
                                }
                                if (o00ooooo2.OooO0o()) {
                                    o00ooooo2.OooOOO0(8);
                                }
                            }
                            if (this.f12317OooOOO0 != 0) {
                                throw ParserException.OooO00o(null, null);
                            }
                            if (this.f12316OooOOO != 0) {
                                throw ParserException.OooO00o(null, null);
                            }
                            if (this.f12318OooOOOO != 0) {
                                throw ParserException.OooO00o(null, null);
                            }
                            int i4 = 0;
                            do {
                                iOooO0oO = o00ooooo2.OooO0oO(8);
                                i4 += iOooO0oO;
                            } while (iOooO0oO == 255);
                            int iOooO0o1 = o00ooooo2.OooO0o0();
                            if ((iOooO0o1 & 7) == 0) {
                                o00oo01.Oooo00O(iOooO0o1 >> 3);
                            } else {
                                o00ooooo2.OooO0oo(i4 * 8, o00oo01.f40591OooO00o);
                                o00oo01.Oooo00O(0);
                            }
                            this.f12308OooO0Oo.OooO0O0(i4, o00oo01);
                            long j = this.f12314OooOO0O;
                            if (j != -9223372036854775807L) {
                                this.f12308OooO0Oo.OooO0o0(j, 1, i4, 0, null);
                                this.f12314OooOO0O += this.f12322OooOOoo;
                            }
                            if (this.f12319OooOOOo) {
                                o00ooooo2.OooOOO0((int) this.f12321OooOOo0);
                            }
                            this.f12311OooO0oO = 0;
                        } else {
                            continue;
                        }
                    }
                } else {
                    int iOooOo0O2 = o00oo00.OooOo0O();
                    if ((iOooOo0O2 & 224) == 224) {
                        this.f12313OooOO0 = iOooOo0O2;
                        this.f12311OooO0oO = 2;
                    } else if (iOooOo0O2 != 86) {
                        this.f12311OooO0oO = 0;
                    }
                }
            } else if (o00oo00.OooOo0O() == 86) {
                this.f12311OooO0oO = 1;
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.OooOOO0
    public final void OooO0OO() {
        this.f12311OooO0oO = 0;
        this.f12314OooOO0O = -9223372036854775807L;
        this.f12315OooOO0o = false;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.OooOOO0
    public final void OooO0Oo(o00O0O0 o00o0o0, TsPayloadReader.OooO0o oooO0o) {
        oooO0o.OooO00o();
        oooO0o.OooO0O0();
        this.f12308OooO0Oo = o00o0o0.OooOOO(oooO0o.f12362OooO0Oo, 1);
        oooO0o.OooO0O0();
        this.f12310OooO0o0 = oooO0o.f12363OooO0o0;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.OooOOO0
    public final void OooO0o(int i, long j) {
        if (j != -9223372036854775807L) {
            this.f12314OooOO0O = j;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.OooOOO0
    public final void OooO0o0() {
    }
}
