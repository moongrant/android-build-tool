package com.google.android.exoplayer2.extractor.flv;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.TrackOutput;
import kotlin.UByte;
import p265o00ooo00.Oooo0;
import p318o0O0oOo.o000;
import p318o0O0oOo.o0000O;
import p320o0O0oOoO.o00O0O0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0O0 extends TagPayloadReader {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o000 f13774OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o000 f13775OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f13776OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f13777OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f13778OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f13779OooO0oO;

    public OooO0O0(TrackOutput trackOutput) {
        super(trackOutput);
        this.f13774OooO0O0 = new o000(o0000O.f36673OooO00o);
        this.f13775OooO0OO = new o000(4);
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    public final boolean OooO0O0(o000 o000Var) throws TagPayloadReader.UnsupportedFormatException {
        int iOooOOo0 = o000Var.OooOOo0();
        int i = (iOooOOo0 >> 4) & 15;
        int i2 = iOooOOo0 & 15;
        if (i2 != 7) {
            throw new TagPayloadReader.UnsupportedFormatException(Oooo0.OooO00o(39, "Video format not supported: ", i2));
        }
        this.f13779OooO0oO = i;
        return i != 5;
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    public final boolean OooO0OO(o000 o000Var, long j) throws ParserException {
        int iOooOOo0 = o000Var.OooOOo0();
        byte[] bArr = o000Var.f36661OooO00o;
        int i = o000Var.f36662OooO0O0;
        int i2 = i + 1;
        o000Var.f36662OooO0O0 = i2;
        int i3 = ((bArr[i] & UByte.MAX_VALUE) << 24) >> 8;
        int i4 = i2 + 1;
        o000Var.f36662OooO0O0 = i4;
        int i5 = i3 | ((bArr[i2] & UByte.MAX_VALUE) << 8);
        int i6 = i4 + 1;
        o000Var.f36662OooO0O0 = i6;
        long j2 = (((long) ((bArr[i4] & UByte.MAX_VALUE) | i5)) * 1000) + j;
        if (iOooOOo0 == 0 && !this.f13778OooO0o0) {
            o000 o000Var2 = new o000(new byte[o000Var.f36663OooO0OO - i6]);
            o000Var.OooO0OO(o000Var2.f36661OooO00o, 0, o000Var.f36663OooO0OO - o000Var.f36662OooO0O0);
            o00O0O0 o00o0o0OooO0O0 = o00O0O0.OooO0O0(o000Var2);
            this.f13776OooO0Oo = o00o0o0OooO0O0.f36790OooO0O0;
            Format.OooO0O0 oooO0O0 = new Format.OooO0O0();
            oooO0O0.f13163OooOO0O = "video/avc";
            oooO0O0.f13168OooOOOo = o00o0o0OooO0O0.f36791OooO0OO;
            oooO0O0.f13170OooOOo0 = o00o0o0OooO0O0.f36792OooO0Oo;
            oooO0O0.f13174OooOo00 = o00o0o0OooO0O0.f36793OooO0o0;
            oooO0O0.f13166OooOOO0 = o00o0o0OooO0O0.f36789OooO00o;
            this.f13780OooO00o.OooO0o0(new Format(oooO0O0));
            this.f13778OooO0o0 = true;
            return false;
        }
        if (iOooOOo0 != 1 || !this.f13778OooO0o0) {
            return false;
        }
        int i7 = this.f13779OooO0oO == 1 ? 1 : 0;
        if (!this.f13777OooO0o && i7 == 0) {
            return false;
        }
        byte[] bArr2 = this.f13775OooO0OO.f36661OooO00o;
        bArr2[0] = 0;
        bArr2[1] = 0;
        bArr2[2] = 0;
        int i8 = 4 - this.f13776OooO0Oo;
        int i9 = 0;
        while (o000Var.f36663OooO0OO - o000Var.f36662OooO0O0 > 0) {
            o000Var.OooO0OO(this.f13775OooO0OO.f36661OooO00o, i8, this.f13776OooO0Oo);
            this.f13775OooO0OO.OooOoOO(0);
            int iOooOo00 = this.f13775OooO0OO.OooOo00();
            this.f13774OooO0O0.OooOoOO(0);
            this.f13780OooO00o.OooO0OO(this.f13774OooO0O0, 4);
            this.f13780OooO00o.OooO0OO(o000Var, iOooOo00);
            i9 = i9 + 4 + iOooOo00;
        }
        this.f13780OooO00o.OooO0Oo(j2, i7, i9, 0, null);
        this.f13777OooO0o = true;
        return true;
    }
}
