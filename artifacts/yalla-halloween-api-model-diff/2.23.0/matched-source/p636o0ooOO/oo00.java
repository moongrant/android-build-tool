package p636o0ooOO;

import com.google.android.exoplayer2.OooOo;
import p022Oooo00O.o00O00OO;
import p218o00oOO.Oooo000;
import p219o00oOOO0.o00000OO;
import p220o00oOOOO.o00O00;
import p221o00oOOOo.oOO00O;
import p223o00oOOo0.o0000;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public interface oo00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooO00o f57396OooO00o = new OooO00o();

    public class OooO00o implements oo00 {
        @Override // p636o0ooOO.oo00
        public final O0OO00 OooO00o(OooOo oooOo) {
            String str = oooOo.f11211OooOOOO;
            if (str != null) {
                str.hashCode();
                switch (str) {
                    case "application/vnd.dvb.ait":
                        return new Oooo000();
                    case "application/x-icy":
                        return new o00O00();
                    case "application/id3":
                        return new oOO00O(null);
                    case "application/x-emsg":
                        return new o00000OO();
                    case "application/x-scte35":
                        return new o0000();
                }
            }
            throw new IllegalArgumentException(o00O00OO.OooO00o("Attempted to create decoder for unsupported MIME type: ", str));
        }

        @Override // p636o0ooOO.oo00
        public final boolean OooO0OO(OooOo oooOo) {
            String str = oooOo.f11211OooOOOO;
            return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
        }
    }

    O0OO00 OooO00o(OooOo oooOo);

    boolean OooO0OO(OooOo oooOo);
}
