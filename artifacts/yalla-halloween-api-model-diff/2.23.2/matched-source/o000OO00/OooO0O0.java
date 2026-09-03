package o000OO00;

import androidx.media3.common.OooOO0;
import androidx.media3.common.util.UnstableApi;
import java.util.List;
import p022Oooo00O.o00O00OO;
import p091o000o0O.o00Oo0;
import p091o000o0O.o0OoOo0;
import p092o000o0O0.oo0o0Oo;
import p093o000o0OO.o0000O0;
import p094o000o0Oo.o0000O;
import p095o000o0o.o00oO0o;
import p097o000o0oO.o000O000;
import p098o000o0oo.o000O0;
import p100o000oOoo.o000O;
import p100o000oOoo.o000O00;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public interface OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooO00o f34387OooO00o = new OooO00o();

    public class OooO00o implements OooO0O0 {
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:55:0x009d  */
        public final oo0o0Oo OooO00o(OooOO0 oooOO1) {
            byte b;
            String str = oooOO1.f6412OooOOOO;
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
                int i = oooOO1.f6431Oooo00O;
                List<byte[]> list = oooOO1.f6415OooOOo0;
                switch (b) {
                    case 0:
                        return new o0000O0(list);
                    case 1:
                        return new o0000O();
                    case 2:
                        return new o000O00();
                    case 3:
                        return new o000O();
                    case 4:
                        return new o000O0(list);
                    case 5:
                        return new androidx.media3.extractor.text.ssa.OooO00o(list);
                    case 6:
                    case 8:
                        return new o0OoOo0(str, i);
                    case 7:
                        return new o000OO00.OooO00o();
                    case 9:
                        return new o00Oo0(i, list);
                    case 10:
                        return new o00oO0o();
                    case 11:
                        return new o000O000();
                }
            }
            throw new IllegalArgumentException(o00O00OO.OooO00o("Attempted to create decoder for unsupported MIME type: ", str));
        }

        public final boolean OooO0O0(OooOO0 oooOO1) {
            String str = oooOO1.f6412OooOOOO;
            return "text/vtt".equals(str) || "text/x-ssa".equals(str) || "application/ttml+xml".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-subrip".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/cea-608".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/cea-708".equals(str) || "application/dvbsubs".equals(str) || "application/pgs".equals(str) || "text/x-exoplayer-cues".equals(str);
        }
    }
}
