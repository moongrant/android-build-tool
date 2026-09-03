package androidx.media3.extractor.flv;

import androidx.media3.common.OooOO0;
import androidx.media3.common.ParserException;
import androidx.media3.extractor.TrackOutput;
import kotlin.UByte;
import o000OOoO.OooO0OO;
import p070o000O0o.Oooo0;
import p080o000OoO.o000O000;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0O0 extends TagPayloadReader {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o000O000 f8414OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o000O000 f8415OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f8416OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f8417OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f8418OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f8419OooO0oO;

    public OooO0O0(TrackOutput trackOutput) {
        super(trackOutput);
        this.f8414OooO0O0 = new o000O000(Oooo0.f34301OooO00o);
        this.f8415OooO0OO = new o000O000(4);
    }

    public final boolean OooO00o(o000O000 o000o001) throws TagPayloadReader.UnsupportedFormatException {
        int iOooOo0O = o000o001.OooOo0O();
        int i = (iOooOo0O >> 4) & 15;
        int i2 = iOooOo0O & 15;
        if (i2 != 7) {
            throw new TagPayloadReader.UnsupportedFormatException(android.support.v4.media.OooO00o.OooO00o("Video format not supported: ", i2));
        }
        this.f8419OooO0oO = i;
        return i != 5;
    }

    public final boolean OooO0O0(long j, o000O000 o000o001) throws ParserException {
        int iOooOo0O = o000o001.OooOo0O();
        byte[] bArr = o000o001.f34962OooO00o;
        int i = o000o001.f34963OooO0O0;
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = (((bArr[i] & UByte.MAX_VALUE) << 24) >> 8) | ((bArr[i2] & UByte.MAX_VALUE) << 8);
        o000o001.f34963OooO0O0 = i3 + 1;
        long j2 = (((long) ((bArr[i3] & UByte.MAX_VALUE) | i4)) * 1000) + j;
        TrackOutput trackOutput = this.f8420OooO00o;
        if (iOooOo0O == 0 && !this.f8418OooO0o0) {
            o000O000 o000o002 = new o000O000(new byte[o000o001.f34964OooO0OO - o000o001.f34963OooO0O0]);
            o000o001.OooO0Oo(0, o000o001.f34964OooO0OO - o000o001.f34963OooO0O0, o000o002.f34962OooO00o);
            OooO0OO oooO0OOOooO00o = OooO0OO.OooO00o(o000o002);
            this.f8416OooO0Oo = oooO0OOOooO00o.f34638OooO0O0;
            OooOO0.OooO00o oooO00o = new OooOO0.OooO00o();
            oooO00o.f6445OooOO0O = "video/avc";
            oooO00o.f6443OooO0oo = oooO0OOOooO00o.f34636OooO;
            oooO00o.f6450OooOOOo = oooO0OOOooO00o.f34639OooO0OO;
            oooO00o.f6452OooOOo0 = oooO0OOOooO00o.f34640OooO0Oo;
            oooO00o.f6456OooOo00 = oooO0OOOooO00o.f34644OooO0oo;
            oooO00o.f6448OooOOO0 = oooO0OOOooO00o.f34637OooO00o;
            trackOutput.OooO0O0(new OooOO0(oooO00o));
            this.f8418OooO0o0 = true;
            return false;
        }
        if (iOooOo0O != 1 || !this.f8418OooO0o0) {
            return false;
        }
        int i5 = this.f8419OooO0oO == 1 ? 1 : 0;
        if (!this.f8417OooO0o && i5 == 0) {
            return false;
        }
        o000O000 o000o003 = this.f8415OooO0OO;
        byte[] bArr2 = o000o003.f34962OooO00o;
        bArr2[0] = 0;
        bArr2[1] = 0;
        bArr2[2] = 0;
        int i6 = 4 - this.f8416OooO0Oo;
        int i7 = 0;
        while (o000o001.f34964OooO0OO - o000o001.f34963OooO0O0 > 0) {
            o000o001.OooO0Oo(i6, this.f8416OooO0Oo, o000o003.f34962OooO00o);
            o000o003.Oooo00O(0);
            int iOooOoO0 = o000o003.OooOoO0();
            o000O000 o000o004 = this.f8414OooO0O0;
            o000o004.Oooo00O(0);
            trackOutput.OooO0OO(4, o000o004);
            trackOutput.OooO0OO(iOooOoO0, o000o001);
            i7 = i7 + 4 + iOooOoO0;
        }
        this.f8420OooO00o.OooO0o0(j2, i5, i7, 0, null);
        this.f8417OooO0o = true;
        return true;
    }
}
