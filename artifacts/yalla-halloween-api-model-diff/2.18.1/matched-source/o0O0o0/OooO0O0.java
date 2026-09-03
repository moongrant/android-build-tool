package o0O0o0;

import com.google.android.exoplayer2.Format;
import p304o0O0o0O.o00Ooo;
import p305o0O0o0OO.o000;
import p306o0O0o0Oo.o000O0o;
import p307o0O0o0o.oo000o;

/* JADX INFO: loaded from: classes2.dex */
public interface OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooO00o f36066OooO00o = new OooO00o();

    public class OooO00o implements OooO0O0 {
        @Override // o0O0o0.OooO0O0
        public final o0O0o0.OooO00o OooO00o(Format format) {
            String str = format.f13131OoooOOo;
            if (str != null) {
                switch (str) {
                    case "application/vnd.dvb.ait":
                        return new o00Ooo();
                    case "application/x-icy":
                        return new o000O0o();
                    case "application/id3":
                        return new p308o0O0o0o0.OooO();
                    case "application/x-emsg":
                        return new o000();
                    case "application/x-scte35":
                        return new oo000o();
                }
            }
            String strValueOf = String.valueOf(str);
            throw new IllegalArgumentException(strValueOf.length() != 0 ? "Attempted to create decoder for unsupported MIME type: ".concat(strValueOf) : new String("Attempted to create decoder for unsupported MIME type: "));
        }

        @Override // o0O0o0.OooO0O0
        public final boolean OooO0OO(Format format) {
            String str = format.f13131OoooOOo;
            return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
        }
    }

    o0O0o0.OooO00o OooO00o(Format format);

    boolean OooO0OO(Format format);
}
