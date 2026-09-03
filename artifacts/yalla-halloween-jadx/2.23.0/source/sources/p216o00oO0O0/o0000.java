package p216o00oO0O0;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.util.Log;
import java.io.IOException;
import p209o00o0oo0.o00O00o0;
import p245o00oo0o.o00Oo00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o0000 {

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f39702OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final long f39703OooO0O0;

        public OooO00o(int i, long j) {
            this.f39702OooO00o = i;
            this.f39703OooO0O0 = j;
        }

        public static OooO00o OooO00o(o00O00o0 o00o00o1, o00Oo00 o00oo00) throws IOException {
            o00o00o1.OooO0Oo(o00oo00.f40591OooO00o, 0, 8, false);
            o00oo00.Oooo00O(0);
            return new OooO00o(o00oo00.OooO0o(), o00oo00.OooOO0o());
        }
    }

    public static boolean OooO00o(o00O00o0 o00o00o1) throws IOException {
        o00Oo00 o00oo00 = new o00Oo00(8);
        int i = OooO00o.OooO00o(o00o00o1, o00oo00).f39702OooO00o;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        o00o00o1.OooO0Oo(o00oo00.f40591OooO00o, 0, 4, false);
        o00oo00.Oooo00O(0);
        int iOooO0o = o00oo00.OooO0o();
        if (iOooO0o == 1463899717) {
            return true;
        }
        Log.OooO0OO("WavHeaderReader", "Unsupported form type: " + iOooO0o);
        return false;
    }

    public static OooO00o OooO0O0(int i, o00O00o0 o00o00o1, o00Oo00 o00oo00) throws IOException {
        OooO00o OooO00o2 = OooO00o.OooO00o(o00o00o1, o00oo00);
        while (OooO00o2.f39702OooO00o != i) {
            StringBuilder sb = new StringBuilder("Ignoring unknown WAV chunk: ");
            int i2 = OooO00o2.f39702OooO00o;
            sb.append(i2);
            Log.OooO0o("WavHeaderReader", sb.toString());
            long j = OooO00o2.f39703OooO0O0 + 8;
            if (j > 2147483647L) {
                throw ParserException.OooO0OO("Chunk is too large (~2GB+) to skip; id: " + i2);
            }
            o00o00o1.OooOO0((int) j);
            OooO00o2 = OooO00o.OooO00o(o00o00o1, o00oo00);
        }
        return OooO00o2;
    }
}
