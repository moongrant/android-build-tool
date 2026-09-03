package p230o00oOoO0;

import com.google.android.exoplayer2.OooOo;
import java.util.List;
import p022Oooo00O.o00O00OO;
import p229o00oOoO.o00O0O;
import p229o00oOoO.o00Oo0;
import p231o00oOoOO.o00O0;
import p232o00oOoOo.o00O0O0O;
import p238o00oo0.oo000o;
import p240o00oo00O.o000O0;
import p242o00oo0O0.o000;
import p242o00oo0O0.o0000oo;
import p243o00oo0OO.o000O00O;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public interface o000O0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooO00o f40136OooO00o = new OooO00o();

    public class OooO00o implements o000O0o {
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:55:0x009d  */
        public final o000O000 OooO00o(OooOo oooOo) {
            byte b;
            String str = oooOo.f11211OooOOOO;
            if (str != null) {
                switch (str) {
                    case "application/dvbsubs":
                        b = 0;
                        break;
                    case "application/pgs":
                        b = 1;
                        break;
                    case "application/x-mp4-vtt":
                        b = 2;
                        break;
                    case "text/vtt":
                        b = 3;
                        break;
                    case "application/x-quicktime-tx3g":
                        b = 4;
                        break;
                    case "text/x-ssa":
                        b = 5;
                        break;
                    case "application/x-mp4-cea-608":
                        b = 6;
                        break;
                    case "text/x-exoplayer-cues":
                        b = 7;
                        break;
                    case "application/cea-608":
                        b = 8;
                        break;
                    case "application/cea-708":
                        b = 9;
                        break;
                    case "application/x-subrip":
                        b = 10;
                        break;
                    case "application/ttml+xml":
                        b = 11;
                        break;
                    default:
                        b = -1;
                        break;
                }
                int i = oooOo.f11230Oooo00O;
                List<byte[]> list = oooOo.f11214OooOOo0;
                switch (b) {
                    case 0:
                        return new o00O0(list);
                    case 1:
                        return new o00O0O0O();
                    case 2:
                        return new o0000oo();
                    case 3:
                        return new o000();
                    case 4:
                        return new o000O00O(list);
                    case 5:
                        return new com.google.android.exoplayer2.text.ssa.OooO00o(list);
                    case 6:
                    case 8:
                        return new o00O0O(str, i);
                    case 7:
                        return new o000OO();
                    case 9:
                        return new o00Oo0(i, list);
                    case 10:
                        return new o000O0();
                    case 11:
                        return new oo000o();
                }
            }
            throw new IllegalArgumentException(o00O00OO.OooO00o("Attempted to create decoder for unsupported MIME type: ", str));
        }

        public final boolean OooO0O0(OooOo oooOo) {
            String str = oooOo.f11211OooOOOO;
            return "text/vtt".equals(str) || "text/x-ssa".equals(str) || "application/ttml+xml".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-subrip".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/cea-608".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/cea-708".equals(str) || "application/dvbsubs".equals(str) || "application/pgs".equals(str) || "text/x-exoplayer-cues".equals(str);
        }
    }
}
