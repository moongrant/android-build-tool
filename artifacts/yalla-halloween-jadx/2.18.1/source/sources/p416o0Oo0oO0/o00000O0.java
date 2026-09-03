package p416o0Oo0oO0;

import com.squareup.okhttp.Protocol;
import java.io.IOException;
import java.net.ProtocolException;
import p016OooOoO0.OooOo00;

/* JADX INFO: loaded from: classes2.dex */
public final class o00000O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Protocol f39575OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f39576OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f39577OooO0OO;

    public o00000O0(Protocol protocol, int i, String str) {
        this.f39575OooO00o = protocol;
        this.f39576OooO0O0 = i;
        this.f39577OooO0OO = str;
    }

    public static o00000O0 OooO00o(String str) throws IOException {
        Protocol protocol;
        String strSubstring;
        int i = 9;
        if (str.startsWith("HTTP/1.")) {
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException(OooOo00.OooO0Oo("Unexpected status line: ", str));
            }
            int iCharAt = str.charAt(7) - '0';
            if (iCharAt == 0) {
                protocol = Protocol.HTTP_1_0;
            } else {
                if (iCharAt != 1) {
                    throw new ProtocolException(OooOo00.OooO0Oo("Unexpected status line: ", str));
                }
                protocol = Protocol.HTTP_1_1;
            }
        } else {
            if (!str.startsWith("ICY ")) {
                throw new ProtocolException(OooOo00.OooO0Oo("Unexpected status line: ", str));
            }
            protocol = Protocol.HTTP_1_0;
            i = 4;
        }
        int i2 = i + 3;
        if (str.length() < i2) {
            throw new ProtocolException(OooOo00.OooO0Oo("Unexpected status line: ", str));
        }
        try {
            int i3 = Integer.parseInt(str.substring(i, i2));
            if (str.length() <= i2) {
                strSubstring = "";
            } else {
                if (str.charAt(i2) != ' ') {
                    throw new ProtocolException(OooOo00.OooO0Oo("Unexpected status line: ", str));
                }
                strSubstring = str.substring(i + 4);
            }
            return new o00000O0(protocol, i3, strSubstring);
        } catch (NumberFormatException unused) {
            throw new ProtocolException(OooOo00.OooO0Oo("Unexpected status line: ", str));
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f39575OooO00o == Protocol.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb.append(' ');
        sb.append(this.f39576OooO0O0);
        if (this.f39577OooO0OO != null) {
            sb.append(' ');
            sb.append(this.f39577OooO0OO);
        }
        return sb.toString();
    }
}
