package p102o000oo0;

import androidx.media3.common.ParserException;
import androidx.media3.common.util.Log;
import java.io.IOException;
import o000OOoO.OooOO0O;
import p080o000OoO.o000O000;

/* JADX INFO: loaded from: classes2.dex */
public final class o0ooOOo {

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f35633OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final long f35634OooO0O0;

        public OooO00o(int i, long j) {
            this.f35633OooO00o = i;
            this.f35634OooO0O0 = j;
        }

        public static OooO00o OooO00o(OooOO0O oooOO0O, o000O000 o000o001) throws IOException {
            oooOO0O.OooO0OO(o000o001.f34962OooO00o, 0, 8, false);
            o000o001.Oooo00O(0);
            return new OooO00o(o000o001.OooO0o(), o000o001.OooOO0o());
        }
    }

    public static boolean OooO00o(OooOO0O oooOO0O) throws IOException {
        o000O000 o000o001 = new o000O000(8);
        int i = OooO00o.OooO00o(oooOO0O, o000o001).f35633OooO00o;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        oooOO0O.OooO0OO(o000o001.f34962OooO00o, 0, 4, false);
        o000o001.Oooo00O(0);
        int iOooO0o = o000o001.OooO0o();
        if (iOooO0o == 1463899717) {
            return true;
        }
        Log.OooO0OO("WavHeaderReader", "Unsupported form type: " + iOooO0o);
        return false;
    }

    public static OooO00o OooO0O0(int i, OooOO0O oooOO0O, o000O000 o000o001) throws IOException {
        OooO00o OooO00o2 = OooO00o.OooO00o(oooOO0O, o000o001);
        while (OooO00o2.f35633OooO00o != i) {
            StringBuilder sb = new StringBuilder("Ignoring unknown WAV chunk: ");
            int i2 = OooO00o2.f35633OooO00o;
            sb.append(i2);
            Log.OooO0o("WavHeaderReader", sb.toString());
            long j = OooO00o2.f35634OooO0O0 + 8;
            if (j > 2147483647L) {
                throw ParserException.OooO0O0("Chunk is too large (~2GB+) to skip; id: " + i2);
            }
            oooOO0O.OooOO0((int) j);
            OooO00o2 = OooO00o.OooO00o(oooOO0O, o000o001);
        }
        return OooO00o2;
    }
}
