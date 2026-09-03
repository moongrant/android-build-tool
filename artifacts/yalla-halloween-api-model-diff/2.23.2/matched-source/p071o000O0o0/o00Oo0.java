package p071o000O0o0;

import androidx.media3.common.OooOO0;
import androidx.media3.common.util.UnstableApi;
import p022Oooo00O.o00O00OO;
import p081o000OoOO.o0000Ooo;
import p082o000OoOo.o0000;
import p084o000Ooo0.OooOO0O;
import p085o000OooO.o0000O00;
import p086o000Oooo.o0000O0;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public interface o00Oo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooO00o f34339OooO00o = new OooO00o();

    public class OooO00o implements o00Oo0 {
        @Override // p071o000O0o0.o00Oo0
        public final o0000Ooo OooO00o(OooOO0 oooOO1) {
            String str = oooOO1.f6412OooOOOO;
            if (str != null) {
                str.hashCode();
                switch (str) {
                    case "application/vnd.dvb.ait":
                        return new o0000();
                    case "application/x-icy":
                        return new o0000O00();
                    case "application/id3":
                        return new o0000O0(null);
                    case "application/x-emsg":
                        return new OooOO0O();
                    case "application/x-scte35":
                        return new p088o000o000.OooOO0O();
                }
            }
            throw new IllegalArgumentException(o00O00OO.OooO00o("Attempted to create decoder for unsupported MIME type: ", str));
        }

        @Override // p071o000O0o0.o00Oo0
        public final boolean OooO0OO(OooOO0 oooOO1) {
            String str = oooOO1.f6412OooOOOO;
            return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
        }
    }

    o0000Ooo OooO00o(OooOO0 oooOO1);

    boolean OooO0OO(OooOO0 oooOO1);
}
