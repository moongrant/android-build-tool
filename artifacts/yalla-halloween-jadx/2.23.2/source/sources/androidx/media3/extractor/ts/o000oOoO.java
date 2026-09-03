package androidx.media3.extractor.ts;

import androidx.annotation.Nullable;
import androidx.compose.animation.core.AnimationKt;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.TrackOutput;
import kotlin.UByte;
import o000OOoO.oo0o0Oo;
import p080o000OoO.o000O000;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class o000oOoO implements OooOOO0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f9131OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o000O000 f9132OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final oo0o0Oo.OooO00o f9133OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public final String f9134OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public TrackOutput f9135OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f9136OooO0o = 0;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public String f9137OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f9138OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f9139OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public long f9140OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f9141OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public long f9142OooOO0o;

    public o000oOoO(@Nullable String str) {
        o000O000 o000o001 = new o000O000(4);
        this.f9132OooO00o = o000o001;
        o000o001.f34962OooO00o[0] = -1;
        this.f9133OooO0O0 = new oo0o0Oo.OooO00o();
        this.f9142OooOO0o = -9223372036854775807L;
        this.f9134OooO0OO = str;
    }

    @Override // androidx.media3.extractor.ts.OooOOO0
    public final void OooO0O0() {
        this.f9136OooO0o = 0;
        this.f9138OooO0oO = 0;
        this.f9131OooO = false;
        this.f9142OooOO0o = -9223372036854775807L;
    }

    @Override // androidx.media3.extractor.ts.OooOOO0
    public final void OooO0OO(o000O000 o000o001) {
        p080o000OoO.o00Oo0.OooO0o(this.f9135OooO0Oo);
        while (true) {
            int i = o000o001.f34964OooO0OO;
            int i2 = o000o001.f34963OooO0O0;
            int i3 = i - i2;
            if (i3 <= 0) {
                return;
            }
            int i4 = this.f9136OooO0o;
            o000O000 o000o002 = this.f9132OooO00o;
            if (i4 == 0) {
                byte[] bArr = o000o001.f34962OooO00o;
                while (true) {
                    if (i2 >= i) {
                        o000o001.Oooo00O(i);
                        break;
                    }
                    byte b = bArr[i2];
                    boolean z = (b & UByte.MAX_VALUE) == 255;
                    boolean z2 = this.f9131OooO && (b & 224) == 224;
                    this.f9131OooO = z;
                    if (z2) {
                        o000o001.Oooo00O(i2 + 1);
                        this.f9131OooO = false;
                        o000o002.f34962OooO00o[1] = bArr[i2];
                        this.f9138OooO0oO = 2;
                        this.f9136OooO0o = 1;
                        break;
                    }
                    i2++;
                }
            } else if (i4 == 1) {
                int iMin = Math.min(i3, 4 - this.f9138OooO0oO);
                o000o001.OooO0Oo(this.f9138OooO0oO, iMin, o000o002.f34962OooO00o);
                int i5 = this.f9138OooO0oO + iMin;
                this.f9138OooO0oO = i5;
                if (i5 >= 4) {
                    o000o002.Oooo00O(0);
                    int iOooO0o = o000o002.OooO0o();
                    oo0o0Oo.OooO00o oooO00o = this.f9133OooO0O0;
                    if (oooO00o.OooO00o(iOooO0o)) {
                        this.f9141OooOO0O = oooO00o.f34755OooO0OO;
                        if (!this.f9139OooO0oo) {
                            long j = ((long) oooO00o.f34759OooO0oO) * AnimationKt.MillisToNanos;
                            int i6 = oooO00o.f34756OooO0Oo;
                            this.f9140OooOO0 = j / ((long) i6);
                            androidx.media3.common.OooOO0.OooO00o oooO00o2 = new androidx.media3.common.OooOO0.OooO00o();
                            oooO00o2.f6436OooO00o = this.f9137OooO0o0;
                            oooO00o2.f6445OooOO0O = oooO00o.f34754OooO0O0;
                            oooO00o2.f6446OooOO0o = 4096;
                            oooO00o2.f6454OooOo = oooO00o.f34758OooO0o0;
                            oooO00o2.f6460OooOoO0 = i6;
                            oooO00o2.f6438OooO0OO = this.f9134OooO0OO;
                            this.f9135OooO0Oo.OooO0O0(new androidx.media3.common.OooOO0(oooO00o2));
                            this.f9139OooO0oo = true;
                        }
                        o000o002.Oooo00O(0);
                        this.f9135OooO0Oo.OooO0OO(4, o000o002);
                        this.f9136OooO0o = 2;
                    } else {
                        this.f9138OooO0oO = 0;
                        this.f9136OooO0o = 1;
                    }
                }
            } else {
                if (i4 != 2) {
                    throw new IllegalStateException();
                }
                int iMin2 = Math.min(i3, this.f9141OooOO0O - this.f9138OooO0oO);
                this.f9135OooO0Oo.OooO0OO(iMin2, o000o001);
                int i7 = this.f9138OooO0oO + iMin2;
                this.f9138OooO0oO = i7;
                int i8 = this.f9141OooOO0O;
                if (i7 >= i8) {
                    long j2 = this.f9142OooOO0o;
                    if (j2 != -9223372036854775807L) {
                        this.f9135OooO0Oo.OooO0o0(j2, 1, i8, 0, null);
                        this.f9142OooOO0o += this.f9140OooOO0;
                    }
                    this.f9138OooO0oO = 0;
                    this.f9136OooO0o = 0;
                }
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
        this.f9137OooO0o0 = oooO0o.f9130OooO0o0;
        oooO0o.OooO0O0();
        this.f9135OooO0Oo = oooo0.OooOOOO(oooO0o.f9129OooO0Oo, 1);
    }

    @Override // androidx.media3.extractor.ts.OooOOO0
    public final void OooO0o0(int i, long j) {
        if (j != -9223372036854775807L) {
            this.f9142OooOO0o = j;
        }
    }
}
