package com.google.android.exoplayer2.extractor.ts;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.extractor.TrackOutput;
import java.util.Collections;
import java.util.Objects;
import p318o0O0oOo.o000;
import p318o0O0oOo.o00000O0;
import p318o0O0oOo.o0000OO0;

/* JADX INFO: loaded from: classes2.dex */
public final class Oooo0 implements OooOOO0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f14234OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final String f14235OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o000 f14236OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o0000OO0 f14237OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public TrackOutput f14238OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public Format f14239OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public String f14240OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f14241OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f14242OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f14243OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public long f14244OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public boolean f14245OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public int f14246OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public int f14247OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int f14248OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public boolean f14249OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public int f14250OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public long f14251OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public long f14252OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @Nullable
    public String f14253OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public int f14254OooOo00;

    public Oooo0(@Nullable String str) {
        this.f14235OooO00o = str;
        o000 o000Var = new o000(1024);
        this.f14236OooO0O0 = o000Var;
        byte[] bArr = o000Var.f36661OooO00o;
        this.f14237OooO0OO = new o0000OO0(bArr, bArr.length);
    }

    public static long OooO0o(o0000OO0 o0000oo1) {
        return o0000oo1.OooO0oO((o0000oo1.OooO0oO(2) + 1) * 8);
    }

    @Override // com.google.android.exoplayer2.extractor.ts.OooOOO0
    public final void OooO00o(o000 o000Var) throws ParserException {
        int i;
        boolean zOooO0o;
        o00000O0.OooO0o(this.f14238OooO0Oo);
        while (true) {
            int i2 = o000Var.f36663OooO0OO - o000Var.f36662OooO0O0;
            if (i2 <= 0) {
                return;
            }
            int i3 = this.f14241OooO0oO;
            if (i3 != 0) {
                if (i3 == 1) {
                    int iOooOOo0 = o000Var.OooOOo0();
                    if ((iOooOOo0 & 224) == 224) {
                        this.f14243OooOO0 = iOooOOo0;
                        this.f14241OooO0oO = 2;
                    } else if (iOooOOo0 != 86) {
                        this.f14241OooO0oO = 0;
                    }
                } else if (i3 == 2) {
                    int iOooOOo1 = ((this.f14243OooOO0 & (-225)) << 8) | o000Var.OooOOo0();
                    this.f14234OooO = iOooOOo1;
                    o000 o000Var2 = this.f14236OooO0O0;
                    if (iOooOOo1 > o000Var2.f36661OooO00o.length) {
                        o000Var2.OooOo(iOooOOo1);
                        o0000OO0 o0000oo1 = this.f14237OooO0OO;
                        byte[] bArr = this.f14236OooO0O0.f36661OooO00o;
                        Objects.requireNonNull(o0000oo1);
                        o0000oo1.OooOO0(bArr, bArr.length);
                    }
                    this.f14242OooO0oo = 0;
                    this.f14241OooO0oO = 3;
                } else {
                    if (i3 != 3) {
                        throw new IllegalStateException();
                    }
                    int iMin = Math.min(i2, this.f14234OooO - this.f14242OooO0oo);
                    o000Var.OooO0OO(this.f14237OooO0OO.f36700OooO00o, this.f14242OooO0oo, iMin);
                    int i4 = this.f14242OooO0oo + iMin;
                    this.f14242OooO0oo = i4;
                    if (i4 == this.f14234OooO) {
                        this.f14237OooO0OO.OooOO0O(0);
                        o0000OO0 o0000oo2 = this.f14237OooO0OO;
                        if (o0000oo2.OooO0o()) {
                            if (this.f14245OooOO0o) {
                            }
                            this.f14241OooO0oO = 0;
                        } else {
                            this.f14245OooOO0o = true;
                            int iOooO0oO = o0000oo2.OooO0oO(1);
                            int iOooO0oO2 = iOooO0oO == 1 ? o0000oo2.OooO0oO(1) : 0;
                            this.f14247OooOOO0 = iOooO0oO2;
                            if (iOooO0oO2 != 0) {
                                throw new ParserException();
                            }
                            if (iOooO0oO == 1) {
                                OooO0o(o0000oo2);
                            }
                            if (!o0000oo2.OooO0o()) {
                                throw new ParserException();
                            }
                            this.f14246OooOOO = o0000oo2.OooO0oO(6);
                            int iOooO0oO3 = o0000oo2.OooO0oO(4);
                            int iOooO0oO4 = o0000oo2.OooO0oO(3);
                            if (iOooO0oO3 != 0 || iOooO0oO4 != 0) {
                                throw new ParserException();
                            }
                            if (iOooO0oO == 0) {
                                int iOooO0o0 = o0000oo2.OooO0o0();
                                int iOooO0oO5 = OooO0oO(o0000oo2);
                                o0000oo2.OooOO0O(iOooO0o0);
                                byte[] bArr2 = new byte[(iOooO0oO5 + 7) / 8];
                                o0000oo2.OooO0oo(bArr2, iOooO0oO5);
                                Format.OooO0O0 oooO0O0 = new Format.OooO0O0();
                                oooO0O0.f13154OooO00o = this.f14240OooO0o0;
                                oooO0O0.f13163OooOO0O = "audio/mp4a-latm";
                                oooO0O0.f13161OooO0oo = this.f14253OooOo0;
                                oooO0O0.f13172OooOo = this.f14254OooOo00;
                                oooO0O0.f13178OooOoO0 = this.f14250OooOOo;
                                oooO0O0.f13166OooOOO0 = Collections.singletonList(bArr2);
                                oooO0O0.f13156OooO0OO = this.f14235OooO00o;
                                Format format = new Format(oooO0O0);
                                if (!format.equals(this.f14239OooO0o)) {
                                    this.f14239OooO0o = format;
                                    this.f14252OooOOoo = 1024000000 / ((long) format.f13152ooOO);
                                    this.f14238OooO0Oo.OooO0o0(format);
                                }
                            } else {
                                o0000oo2.OooOOO0(((int) OooO0o(o0000oo2)) - OooO0oO(o0000oo2));
                            }
                            int iOooO0oO6 = o0000oo2.OooO0oO(3);
                            this.f14248OooOOOO = iOooO0oO6;
                            if (iOooO0oO6 == 0) {
                                o0000oo2.OooOOO0(8);
                            } else if (iOooO0oO6 == 1) {
                                o0000oo2.OooOOO0(9);
                            } else if (iOooO0oO6 == 3 || iOooO0oO6 == 4 || iOooO0oO6 == 5) {
                                o0000oo2.OooOOO0(6);
                            } else {
                                if (iOooO0oO6 != 6 && iOooO0oO6 != 7) {
                                    throw new IllegalStateException();
                                }
                                o0000oo2.OooOOO0(1);
                            }
                            boolean zOooO0o2 = o0000oo2.OooO0o();
                            this.f14249OooOOOo = zOooO0o2;
                            this.f14251OooOOo0 = 0L;
                            if (zOooO0o2) {
                                if (iOooO0oO == 1) {
                                    this.f14251OooOOo0 = OooO0o(o0000oo2);
                                } else {
                                    do {
                                        zOooO0o = o0000oo2.OooO0o();
                                        this.f14251OooOOo0 = (this.f14251OooOOo0 << 8) + ((long) o0000oo2.OooO0oO(8));
                                    } while (zOooO0o);
                                }
                            }
                            if (o0000oo2.OooO0o()) {
                                o0000oo2.OooOOO0(8);
                            }
                        }
                        if (this.f14247OooOOO0 != 0) {
                            throw new ParserException();
                        }
                        if (this.f14246OooOOO != 0) {
                            throw new ParserException();
                        }
                        if (this.f14248OooOOOO != 0) {
                            throw new ParserException();
                        }
                        int i5 = 0;
                        while (true) {
                            int iOooO0oO7 = o0000oo2.OooO0oO(8);
                            i = i5 + iOooO0oO7;
                            if (iOooO0oO7 != 255) {
                                break;
                            } else {
                                i5 = i;
                            }
                        }
                        int iOooO0o1 = o0000oo2.OooO0o0();
                        if ((iOooO0o1 & 7) == 0) {
                            this.f14236OooO0O0.OooOoOO(iOooO0o1 >> 3);
                        } else {
                            o0000oo2.OooO0oo(this.f14236OooO0O0.f36661OooO00o, i * 8);
                            this.f14236OooO0O0.OooOoOO(0);
                        }
                        this.f14238OooO0Oo.OooO0OO(this.f14236OooO0O0, i);
                        this.f14238OooO0Oo.OooO0Oo(this.f14244OooOO0O, 1, i, 0, null);
                        this.f14244OooOO0O += this.f14252OooOOoo;
                        if (this.f14249OooOOOo) {
                            o0000oo2.OooOOO0((int) this.f14251OooOOo0);
                        }
                        this.f14241OooO0oO = 0;
                    } else {
                        continue;
                    }
                }
            } else if (o000Var.OooOOo0() == 86) {
                this.f14241OooO0oO = 1;
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.OooOOO0
    public final void OooO0O0() {
        this.f14241OooO0oO = 0;
        this.f14245OooOO0o = false;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.OooOOO0
    public final void OooO0OO() {
    }

    @Override // com.google.android.exoplayer2.extractor.ts.OooOOO0
    public final void OooO0Oo(long j, int i) {
        this.f14244OooOO0O = j;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.OooOOO0
    public final void OooO0o0(p296o0O0OoO0.o0OoOo0 o0oooo1, TsPayloadReader.OooO0o oooO0o) {
        oooO0o.OooO00o();
        this.f14238OooO0Oo = o0oooo1.OooO00o(oooO0o.OooO0OO());
        this.f14240OooO0o0 = oooO0o.OooO0O0();
    }

    public final int OooO0oO(o0000OO0 o0000oo1) throws ParserException {
        int iOooO0O0 = o0000oo1.OooO0O0();
        AacUtil.OooO00o oooO00oOooO0OO = AacUtil.OooO0OO(o0000oo1, true);
        this.f14253OooOo0 = oooO00oOooO0OO.f13471OooO0OO;
        this.f14250OooOOo = oooO00oOooO0OO.f13469OooO00o;
        this.f14254OooOo00 = oooO00oOooO0OO.f13470OooO0O0;
        return iOooO0O0 - o0000oo1.OooO0O0();
    }
}
