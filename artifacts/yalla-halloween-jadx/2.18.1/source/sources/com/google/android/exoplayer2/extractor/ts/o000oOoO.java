package com.google.android.exoplayer2.extractor.ts;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.TrackOutput;
import kotlin.UByte;
import p318o0O0oOo.o000;
import p318o0O0oOo.o00000O0;

/* JADX INFO: loaded from: classes2.dex */
public final class o000oOoO implements OooOOO0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f14297OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o000 f14298OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0O0Oo0O.o0ooOOo.OooO00o f14299OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public final String f14300OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public TrackOutput f14301OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f14302OooO0o = 0;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public String f14303OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f14304OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f14305OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public long f14306OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f14307OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public long f14308OooOO0o;

    public o000oOoO(@Nullable String str) {
        o000 o000Var = new o000(4);
        this.f14298OooO00o = o000Var;
        o000Var.f36661OooO00o[0] = -1;
        this.f14299OooO0O0 = new o0O0Oo0O.o0ooOOo.OooO00o();
        this.f14300OooO0OO = str;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.OooOOO0
    public final void OooO00o(o000 o000Var) {
        o00000O0.OooO0o(this.f14301OooO0Oo);
        while (true) {
            int i = o000Var.f36663OooO0OO;
            int i2 = o000Var.f36662OooO0O0;
            int i3 = i - i2;
            if (i3 <= 0) {
                return;
            }
            int i4 = this.f14302OooO0o;
            if (i4 == 0) {
                byte[] bArr = o000Var.f36661OooO00o;
                while (true) {
                    if (i2 >= i) {
                        o000Var.OooOoOO(i);
                        break;
                    }
                    boolean z = (bArr[i2] & UByte.MAX_VALUE) == 255;
                    boolean z2 = this.f14297OooO && (bArr[i2] & 224) == 224;
                    this.f14297OooO = z;
                    if (z2) {
                        o000Var.OooOoOO(i2 + 1);
                        this.f14297OooO = false;
                        this.f14298OooO00o.f36661OooO00o[1] = bArr[i2];
                        this.f14304OooO0oO = 2;
                        this.f14302OooO0o = 1;
                        break;
                    }
                    i2++;
                }
            } else if (i4 == 1) {
                int iMin = Math.min(i3, 4 - this.f14304OooO0oO);
                o000Var.OooO0OO(this.f14298OooO00o.f36661OooO00o, this.f14304OooO0oO, iMin);
                int i5 = this.f14304OooO0oO + iMin;
                this.f14304OooO0oO = i5;
                if (i5 >= 4) {
                    this.f14298OooO00o.OooOoOO(0);
                    if (this.f14299OooO0O0.OooO00o(this.f14298OooO00o.OooO0Oo())) {
                        o0O0Oo0O.o0ooOOo.OooO00o oooO00o = this.f14299OooO0O0;
                        this.f14307OooOO0O = oooO00o.f35816OooO0OO;
                        if (!this.f14305OooO0oo) {
                            long j = ((long) oooO00o.f35820OooO0oO) * 1000000;
                            int i6 = oooO00o.f35817OooO0Oo;
                            this.f14306OooOO0 = j / ((long) i6);
                            Format.OooO0O0 oooO0O0 = new Format.OooO0O0();
                            oooO0O0.f13154OooO00o = this.f14303OooO0o0;
                            oooO0O0.f13163OooOO0O = oooO00o.f35815OooO0O0;
                            oooO0O0.f13164OooOO0o = 4096;
                            oooO0O0.f13172OooOo = oooO00o.f35819OooO0o0;
                            oooO0O0.f13178OooOoO0 = i6;
                            oooO0O0.f13156OooO0OO = this.f14300OooO0OO;
                            this.f14301OooO0Oo.OooO0o0(new Format(oooO0O0));
                            this.f14305OooO0oo = true;
                        }
                        this.f14298OooO00o.OooOoOO(0);
                        this.f14301OooO0Oo.OooO0OO(this.f14298OooO00o, 4);
                        this.f14302OooO0o = 2;
                    } else {
                        this.f14304OooO0oO = 0;
                        this.f14302OooO0o = 1;
                    }
                }
            } else {
                if (i4 != 2) {
                    throw new IllegalStateException();
                }
                int iMin2 = Math.min(i3, this.f14307OooOO0O - this.f14304OooO0oO);
                this.f14301OooO0Oo.OooO0OO(o000Var, iMin2);
                int i7 = this.f14304OooO0oO + iMin2;
                this.f14304OooO0oO = i7;
                int i8 = this.f14307OooOO0O;
                if (i7 >= i8) {
                    this.f14301OooO0Oo.OooO0Oo(this.f14308OooOO0o, 1, i8, 0, null);
                    this.f14308OooOO0o += this.f14306OooOO0;
                    this.f14304OooO0oO = 0;
                    this.f14302OooO0o = 0;
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.OooOOO0
    public final void OooO0O0() {
        this.f14302OooO0o = 0;
        this.f14304OooO0oO = 0;
        this.f14297OooO = false;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.OooOOO0
    public final void OooO0OO() {
    }

    @Override // com.google.android.exoplayer2.extractor.ts.OooOOO0
    public final void OooO0Oo(long j, int i) {
        this.f14308OooOO0o = j;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.OooOOO0
    public final void OooO0o0(p296o0O0OoO0.o0OoOo0 o0oooo1, TsPayloadReader.OooO0o oooO0o) {
        oooO0o.OooO00o();
        this.f14303OooO0o0 = oooO0o.OooO0O0();
        this.f14301OooO0Oo = o0oooo1.OooO00o(oooO0o.OooO0OO());
    }
}
