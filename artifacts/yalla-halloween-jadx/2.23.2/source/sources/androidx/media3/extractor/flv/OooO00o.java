package androidx.media3.extractor.flv;

import androidx.media3.common.OooOO0;
import androidx.media3.common.ParserException;
import androidx.media3.extractor.AacUtil;
import androidx.media3.extractor.TrackOutput;
import java.util.Collections;
import p080o000OoO.o000;
import p080o000OoO.o000O000;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o extends TagPayloadReader {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final int[] f8410OooO0o0 = {5512, 11025, 22050, 44100};

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f8411OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f8412OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f8413OooO0Oo;

    public final boolean OooO00o(o000O000 o000o001) throws TagPayloadReader.UnsupportedFormatException {
        if (this.f8411OooO0O0) {
            o000o001.Oooo00o(1);
        } else {
            int iOooOo0O = o000o001.OooOo0O();
            int i = (iOooOo0O >> 4) & 15;
            this.f8413OooO0Oo = i;
            TrackOutput trackOutput = this.f8420OooO00o;
            if (i == 2) {
                int i2 = f8410OooO0o0[(iOooOo0O >> 2) & 3];
                OooOO0.OooO00o oooO00o = new OooOO0.OooO00o();
                oooO00o.f6445OooOO0O = "audio/mpeg";
                oooO00o.f6454OooOo = 1;
                oooO00o.f6460OooOoO0 = i2;
                trackOutput.OooO0O0(oooO00o.OooO00o());
                this.f8412OooO0OO = true;
            } else if (i == 7 || i == 8) {
                String str = i == 7 ? "audio/g711-alaw" : "audio/g711-mlaw";
                OooOO0.OooO00o oooO00o2 = new OooOO0.OooO00o();
                oooO00o2.f6445OooOO0O = str;
                oooO00o2.f6454OooOo = 1;
                oooO00o2.f6460OooOoO0 = 8000;
                trackOutput.OooO0O0(oooO00o2.OooO00o());
                this.f8412OooO0OO = true;
            } else if (i != 10) {
                throw new TagPayloadReader.UnsupportedFormatException("Audio format not supported: " + this.f8413OooO0Oo);
            }
            this.f8411OooO0O0 = true;
        }
        return true;
    }

    public final boolean OooO0O0(long j, o000O000 o000o001) throws ParserException {
        int i = this.f8413OooO0Oo;
        TrackOutput trackOutput = this.f8420OooO00o;
        if (i == 2) {
            int i2 = o000o001.f34964OooO0OO - o000o001.f34963OooO0O0;
            trackOutput.OooO0OO(i2, o000o001);
            this.f8420OooO00o.OooO0o0(j, 1, i2, 0, null);
            return true;
        }
        int iOooOo0O = o000o001.OooOo0O();
        if (iOooOo0O != 0 || this.f8412OooO0OO) {
            if (this.f8413OooO0Oo == 10 && iOooOo0O != 1) {
                return false;
            }
            int i3 = o000o001.f34964OooO0OO - o000o001.f34963OooO0O0;
            trackOutput.OooO0OO(i3, o000o001);
            this.f8420OooO00o.OooO0o0(j, 1, i3, 0, null);
            return true;
        }
        int i4 = o000o001.f34964OooO0OO - o000o001.f34963OooO0O0;
        byte[] bArr = new byte[i4];
        o000o001.OooO0Oo(0, i4, bArr);
        AacUtil.OooO00o oooO00oOooO0O0 = AacUtil.OooO0O0(new o000(bArr, i4), false);
        OooOO0.OooO00o oooO00o = new OooOO0.OooO00o();
        oooO00o.f6445OooOO0O = "audio/mp4a-latm";
        oooO00o.f6443OooO0oo = oooO00oOooO0O0.f8363OooO0OO;
        oooO00o.f6454OooOo = oooO00oOooO0O0.f8362OooO0O0;
        oooO00o.f6460OooOoO0 = oooO00oOooO0O0.f8361OooO00o;
        oooO00o.f6448OooOOO0 = Collections.singletonList(bArr);
        trackOutput.OooO0O0(new OooOO0(oooO00o));
        this.f8412OooO0OO = true;
        return false;
    }
}
