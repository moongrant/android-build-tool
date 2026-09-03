package com.google.android.exoplayer2.extractor.flv;

import com.google.android.exoplayer2.OooOo;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.TrackOutput;
import kotlin.UByte;
import p245o00oo0o.o00Oo00;
import p245o00oo0o.oo0O;
import p247o00oo0oO.oo0o0O0;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class OooO0O0 extends TagPayloadReader {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o00Oo00 f11834OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o00Oo00 f11835OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f11836OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f11837OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f11838OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f11839OooO0oO;

    public OooO0O0(TrackOutput trackOutput) {
        super(trackOutput);
        this.f11834OooO0O0 = new o00Oo00(oo0O.f40640OooO00o);
        this.f11835OooO0OO = new o00Oo00(4);
    }

    public final boolean OooO00o(o00Oo00 o00oo00) throws TagPayloadReader.UnsupportedFormatException {
        int iOooOo0O = o00oo00.OooOo0O();
        int i = (iOooOo0O >> 4) & 15;
        int i2 = iOooOo0O & 15;
        if (i2 != 7) {
            throw new TagPayloadReader.UnsupportedFormatException(android.support.v4.media.OooO00o.OooO00o("Video format not supported: ", i2));
        }
        this.f11839OooO0oO = i;
        return i != 5;
    }

    public final boolean OooO0O0(long j, o00Oo00 o00oo00) throws ParserException {
        int iOooOo0O = o00oo00.OooOo0O();
        byte[] bArr = o00oo00.f40591OooO00o;
        int i = o00oo00.f40592OooO0O0;
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = (((bArr[i] & UByte.MAX_VALUE) << 24) >> 8) | ((bArr[i2] & UByte.MAX_VALUE) << 8);
        o00oo00.f40592OooO0O0 = i3 + 1;
        long j2 = (((long) ((bArr[i3] & UByte.MAX_VALUE) | i4)) * 1000) + j;
        TrackOutput trackOutput = this.f11840OooO00o;
        if (iOooOo0O == 0 && !this.f11838OooO0o0) {
            o00Oo00 o00oo01 = new o00Oo00(new byte[o00oo00.f40593OooO0OO - o00oo00.f40592OooO0O0]);
            o00oo00.OooO0Oo(0, o00oo00.f40593OooO0OO - o00oo00.f40592OooO0O0, o00oo01.f40591OooO00o);
            oo0o0O0 oo0o0o0OooO00o = oo0o0O0.OooO00o(o00oo01);
            this.f11836OooO0Oo = oo0o0o0OooO00o.f40872OooO0O0;
            OooOo.OooO00o oooO00o = new OooOo.OooO00o();
            oooO00o.f11244OooOO0O = "video/avc";
            oooO00o.f11242OooO0oo = oo0o0o0OooO00o.f40870OooO;
            oooO00o.f11249OooOOOo = oo0o0o0OooO00o.f40873OooO0OO;
            oooO00o.f11251OooOOo0 = oo0o0o0OooO00o.f40874OooO0Oo;
            oooO00o.f11255OooOo00 = oo0o0o0OooO00o.f40878OooO0oo;
            oooO00o.f11247OooOOO0 = oo0o0o0OooO00o.f40871OooO00o;
            trackOutput.OooO0OO(new OooOo(oooO00o));
            this.f11838OooO0o0 = true;
            return false;
        }
        if (iOooOo0O != 1 || !this.f11838OooO0o0) {
            return false;
        }
        int i5 = this.f11839OooO0oO == 1 ? 1 : 0;
        if (!this.f11837OooO0o && i5 == 0) {
            return false;
        }
        o00Oo00 o00oo02 = this.f11835OooO0OO;
        byte[] bArr2 = o00oo02.f40591OooO00o;
        bArr2[0] = 0;
        bArr2[1] = 0;
        bArr2[2] = 0;
        int i6 = 4 - this.f11836OooO0Oo;
        int i7 = 0;
        while (o00oo00.f40593OooO0OO - o00oo00.f40592OooO0O0 > 0) {
            o00oo00.OooO0Oo(i6, this.f11836OooO0Oo, o00oo02.f40591OooO00o);
            o00oo02.Oooo00O(0);
            int iOooOoO0 = o00oo02.OooOoO0();
            o00Oo00 o00oo03 = this.f11834OooO0O0;
            o00oo03.Oooo00O(0);
            trackOutput.OooO0O0(4, o00oo03);
            trackOutput.OooO0O0(iOooOoO0, o00oo00);
            i7 = i7 + 4 + iOooOoO0;
        }
        this.f11840OooO00o.OooO0o0(j2, i5, i7, 0, null);
        this.f11837OooO0o = true;
        return true;
    }
}
