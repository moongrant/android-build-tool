package p666o0oooO0o;

import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Protocol;
import org.jetbrains.annotations.NotNull;
import p016OooOoO0.OooOo00;

/* JADX INFO: loaded from: classes3.dex */
public final class oOo000Oo {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final OooO00o f51874OooO0Oo = new OooO00o();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @JvmField
    @NotNull
    public final Protocol f51875OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @JvmField
    public final int f51876OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @JvmField
    @NotNull
    public final String f51877OooO0OO;

    public static final class OooO00o {
        @NotNull
        public final oOo000Oo OooO00o(@NotNull String statusLine) throws IOException {
            Protocol protocol;
            String strSubstring;
            Intrinsics.checkNotNullParameter(statusLine, "statusLine");
            int i = 9;
            if (StringsKt.OooOoOO(statusLine, "HTTP/1.")) {
                if (statusLine.length() < 9 || statusLine.charAt(8) != ' ') {
                    throw new ProtocolException(OooOo00.OooO0Oo("Unexpected status line: ", statusLine));
                }
                int iCharAt = statusLine.charAt(7) - '0';
                if (iCharAt == 0) {
                    protocol = Protocol.HTTP_1_0;
                } else {
                    if (iCharAt != 1) {
                        throw new ProtocolException(OooOo00.OooO0Oo("Unexpected status line: ", statusLine));
                    }
                    protocol = Protocol.HTTP_1_1;
                }
            } else {
                if (!StringsKt.OooOoOO(statusLine, "ICY ")) {
                    throw new ProtocolException(OooOo00.OooO0Oo("Unexpected status line: ", statusLine));
                }
                protocol = Protocol.HTTP_1_0;
                i = 4;
            }
            int i2 = i + 3;
            if (statusLine.length() < i2) {
                throw new ProtocolException(OooOo00.OooO0Oo("Unexpected status line: ", statusLine));
            }
            try {
                String strSubstring2 = statusLine.substring(i, i2);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                int i3 = Integer.parseInt(strSubstring2);
                if (statusLine.length() <= i2) {
                    strSubstring = "";
                } else {
                    if (statusLine.charAt(i2) != ' ') {
                        throw new ProtocolException(OooOo00.OooO0Oo("Unexpected status line: ", statusLine));
                    }
                    strSubstring = statusLine.substring(i + 4);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.String).substring(startIndex)");
                }
                return new oOo000Oo(protocol, i3, strSubstring);
            } catch (NumberFormatException unused) {
                throw new ProtocolException(OooOo00.OooO0Oo("Unexpected status line: ", statusLine));
            }
        }
    }

    public oOo000Oo(@NotNull Protocol protocol, int i, @NotNull String message) {
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Intrinsics.checkNotNullParameter(message, "message");
        this.f51875OooO00o = protocol;
        this.f51876OooO0O0 = i;
        this.f51877OooO0OO = message;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.f51875OooO00o == Protocol.HTTP_1_0) {
            sb.append("HTTP/1.0");
        } else {
            sb.append("HTTP/1.1");
        }
        sb.append(' ');
        sb.append(this.f51876OooO0O0);
        sb.append(' ');
        sb.append(this.f51877OooO0OO);
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
