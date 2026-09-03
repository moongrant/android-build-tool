package com.google.android.exoplayer2.extractor.flv;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.extractor.TrackOutput;
import java.util.Collections;
import p265o00ooo00.Oooo0;
import p318o0O0oOo.o000;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o extends TagPayloadReader {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final int[] f13770OooO0o0 = {5512, 11025, 22050, 44100};

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f13771OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f13772OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f13773OooO0Oo;

    public OooO00o(TrackOutput trackOutput) {
        super(trackOutput);
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    public final boolean OooO0O0(o000 o000Var) throws TagPayloadReader.UnsupportedFormatException {
        if (this.f13771OooO0O0) {
            o000Var.OooOoo0(1);
        } else {
            int iOooOOo0 = o000Var.OooOOo0();
            int i = (iOooOOo0 >> 4) & 15;
            this.f13773OooO0Oo = i;
            if (i == 2) {
                int i2 = f13770OooO0o0[(iOooOOo0 >> 2) & 3];
                Format.OooO0O0 oooO0O0 = new Format.OooO0O0();
                oooO0O0.f13163OooOO0O = "audio/mpeg";
                oooO0O0.f13172OooOo = 1;
                oooO0O0.f13178OooOoO0 = i2;
                this.f13780OooO00o.OooO0o0(oooO0O0.OooO00o());
                this.f13772OooO0OO = true;
            } else if (i == 7 || i == 8) {
                String str = i == 7 ? "audio/g711-alaw" : "audio/g711-mlaw";
                Format.OooO0O0 oooO0O1 = new Format.OooO0O0();
                oooO0O1.f13163OooOO0O = str;
                oooO0O1.f13172OooOo = 1;
                oooO0O1.f13178OooOoO0 = 8000;
                this.f13780OooO00o.OooO0o0(oooO0O1.OooO00o());
                this.f13772OooO0OO = true;
            } else if (i != 10) {
                throw new TagPayloadReader.UnsupportedFormatException(Oooo0.OooO00o(39, "Audio format not supported: ", this.f13773OooO0Oo));
            }
            this.f13771OooO0O0 = true;
        }
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    public final boolean OooO0OO(o000 o000Var, long j) throws ParserException {
        if (this.f13773OooO0Oo == 2) {
            int i = o000Var.f36663OooO0OO - o000Var.f36662OooO0O0;
            this.f13780OooO00o.OooO0OO(o000Var, i);
            this.f13780OooO00o.OooO0Oo(j, 1, i, 0, null);
            return true;
        }
        int iOooOOo0 = o000Var.OooOOo0();
        if (iOooOOo0 != 0 || this.f13772OooO0OO) {
            if (this.f13773OooO0Oo == 10 && iOooOOo0 != 1) {
                return false;
            }
            int i2 = o000Var.f36663OooO0OO - o000Var.f36662OooO0O0;
            this.f13780OooO00o.OooO0OO(o000Var, i2);
            this.f13780OooO00o.OooO0Oo(j, 1, i2, 0, null);
            return true;
        }
        int i3 = o000Var.f36663OooO0OO - o000Var.f36662OooO0O0;
        byte[] bArr = new byte[i3];
        o000Var.OooO0OO(bArr, 0, i3);
        AacUtil.OooO00o oooO00oOooO0Oo = AacUtil.OooO0Oo(bArr);
        Format.OooO0O0 oooO0O0 = new Format.OooO0O0();
        oooO0O0.f13163OooOO0O = "audio/mp4a-latm";
        oooO0O0.f13161OooO0oo = oooO00oOooO0Oo.f13471OooO0OO;
        oooO0O0.f13172OooOo = oooO00oOooO0Oo.f13470OooO0O0;
        oooO0O0.f13178OooOoO0 = oooO00oOooO0Oo.f13469OooO00o;
        oooO0O0.f13166OooOOO0 = Collections.singletonList(bArr);
        this.f13780OooO00o.OooO0o0(new Format(oooO0O0));
        this.f13772OooO0OO = true;
        return false;
    }
}
