package com.google.android.exoplayer2.extractor.flv;

import com.google.android.exoplayer2.OooOo;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.extractor.TrackOutput;
import java.util.Collections;
import p245o00oo0o.o00OOOOo;
import p245o00oo0o.o00Oo00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class OooO00o extends TagPayloadReader {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final int[] f11830OooO0o0 = {5512, 11025, 22050, 44100};

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f11831OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f11832OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f11833OooO0Oo;

    public final boolean OooO00o(o00Oo00 o00oo00) throws TagPayloadReader.UnsupportedFormatException {
        if (this.f11831OooO0O0) {
            o00oo00.Oooo00o(1);
        } else {
            int iOooOo0O = o00oo00.OooOo0O();
            int i = (iOooOo0O >> 4) & 15;
            this.f11833OooO0Oo = i;
            TrackOutput trackOutput = this.f11840OooO00o;
            if (i == 2) {
                int i2 = f11830OooO0o0[(iOooOo0O >> 2) & 3];
                OooOo.OooO00o oooO00o = new OooOo.OooO00o();
                oooO00o.f11244OooOO0O = "audio/mpeg";
                oooO00o.f11253OooOo = 1;
                oooO00o.f11259OooOoO0 = i2;
                trackOutput.OooO0OO(oooO00o.OooO00o());
                this.f11832OooO0OO = true;
            } else if (i == 7 || i == 8) {
                String str = i == 7 ? "audio/g711-alaw" : "audio/g711-mlaw";
                OooOo.OooO00o oooO00o2 = new OooOo.OooO00o();
                oooO00o2.f11244OooOO0O = str;
                oooO00o2.f11253OooOo = 1;
                oooO00o2.f11259OooOoO0 = 8000;
                trackOutput.OooO0OO(oooO00o2.OooO00o());
                this.f11832OooO0OO = true;
            } else if (i != 10) {
                throw new TagPayloadReader.UnsupportedFormatException("Audio format not supported: " + this.f11833OooO0Oo);
            }
            this.f11831OooO0O0 = true;
        }
        return true;
    }

    public final boolean OooO0O0(long j, o00Oo00 o00oo00) throws ParserException {
        int i = this.f11833OooO0Oo;
        TrackOutput trackOutput = this.f11840OooO00o;
        if (i == 2) {
            int i2 = o00oo00.f40593OooO0OO - o00oo00.f40592OooO0O0;
            trackOutput.OooO0O0(i2, o00oo00);
            this.f11840OooO00o.OooO0o0(j, 1, i2, 0, null);
            return true;
        }
        int iOooOo0O = o00oo00.OooOo0O();
        if (iOooOo0O != 0 || this.f11832OooO0OO) {
            if (this.f11833OooO0Oo == 10 && iOooOo0O != 1) {
                return false;
            }
            int i3 = o00oo00.f40593OooO0OO - o00oo00.f40592OooO0O0;
            trackOutput.OooO0O0(i3, o00oo00);
            this.f11840OooO00o.OooO0o0(j, 1, i3, 0, null);
            return true;
        }
        int i4 = o00oo00.f40593OooO0OO - o00oo00.f40592OooO0O0;
        byte[] bArr = new byte[i4];
        o00oo00.OooO0Oo(0, i4, bArr);
        AacUtil.OooO00o oooO00oOooO0O0 = AacUtil.OooO0O0(new o00OOOOo(bArr, i4), false);
        OooOo.OooO00o oooO00o = new OooOo.OooO00o();
        oooO00o.f11244OooOO0O = "audio/mp4a-latm";
        oooO00o.f11242OooO0oo = oooO00oOooO0O0.f11441OooO0OO;
        oooO00o.f11253OooOo = oooO00oOooO0O0.f11440OooO0O0;
        oooO00o.f11259OooOoO0 = oooO00oOooO0O0.f11439OooO00o;
        oooO00o.f11247OooOOO0 = Collections.singletonList(bArr);
        trackOutput.OooO0OO(new OooOo(oooO00o));
        this.f11832OooO0OO = true;
        return false;
    }
}
