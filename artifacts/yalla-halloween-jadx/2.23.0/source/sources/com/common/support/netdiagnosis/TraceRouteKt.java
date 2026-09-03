package com.common.support.netdiagnosis;

import androidx.compose.foundation.layout.oo000o;
import com.qiniu.android.collect.ReportItem;
import java.io.IOException;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import p004OooO0oO.o000oOoO;
import p004OooO0oO.o0OoOo0;
import p028Oooo0oO.o0O00o0;
import p039OoooOoo.o00OO;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\u001a\u0010\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\u0002\u001a\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0001H\u0002\u001a$\u0010\t\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00012\n\u0010\u000b\u001a\u00060\fj\u0002`\rH\u0002\u001a$\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00102\n\u0010\u000b\u001a\u00060\fj\u0002`\rH\u0002\u001a\u0010\u0010\u0011\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0001H\u0002\u001a\u0010\u0010\u0012\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0001H\u0002\u001a*\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u0019\u001a\u001e\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0016\u001a\u001e\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016\u001a\u001e\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u001f\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"MATCH_PING_IP", "", "MATCH_PING_TIME", "MATCH_TRACE_IP", "getIpFromTraceMatcher", "m", "Ljava/util/regex/Matcher;", "ipMatcher", "str", "printEnd", "out", "lineBuffer", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "printNormal", "time", "", "timeMatcher", "traceMatcher", "traceRoute", ReportItem.RequestKeyHost, "maxHop", "", "pingWaitTimeInSecond", "isIpv6", "", "ip", "cmd", "traceRouteIpv4", "ipv4", "traceRouteIpv6", "ipv6", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class TraceRouteKt {

    @NotNull
    private static final String MATCH_PING_IP = "(?<=from ).*(?=: icmp_seq=1 ttl=)";

    @NotNull
    private static final String MATCH_PING_TIME = "(?<=time=).*?ms";

    @NotNull
    private static final String MATCH_TRACE_IP = "(?<=From )(?:[0-9]{1,3}\\.){3}[0-9]{1,3}";

    private static final String getIpFromTraceMatcher(Matcher matcher) {
        String pingIp = matcher.group();
        Intrinsics.checkNotNullExpressionValue(pingIp, "pingIp");
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) pingIp, '(', 0, false, 6, (Object) null);
        if (iIndexOf$default >= 0) {
            Intrinsics.checkNotNullExpressionValue(pingIp, "pingIp");
            pingIp = pingIp.substring(iIndexOf$default + 1);
            Intrinsics.checkNotNullExpressionValue(pingIp, "(this as java.lang.String).substring(startIndex)");
        }
        Intrinsics.checkNotNullExpressionValue(pingIp, "pingIp");
        return pingIp;
    }

    private static final Matcher ipMatcher(String str) {
        Matcher matcher = Pattern.compile(MATCH_PING_IP).matcher(str);
        Intrinsics.checkNotNullExpressionValue(matcher, "patternIp.matcher(str)");
        return matcher;
    }

    private static final String printEnd(Matcher matcher, String str, StringBuilder sb) {
        String strGroup = matcher.group();
        Matcher matcherTimeMatcher = timeMatcher(str);
        if (matcherTimeMatcher.find()) {
            String strGroup2 = matcherTimeMatcher.group();
            sb.append("\t");
            sb.append(strGroup);
            sb.append("\t\t");
            sb.append(strGroup2);
            sb.append("\t");
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "lineBuffer.toString()");
        return string;
    }

    private static final String printNormal(Matcher matcher, long j, StringBuilder sb) {
        String ipFromTraceMatcher = getIpFromTraceMatcher(matcher);
        sb.append("\t");
        sb.append(ipFromTraceMatcher);
        sb.append("\t\t");
        sb.append(j);
        sb.append("ms\t");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "lineBuffer.toString()");
        return string;
    }

    private static final Matcher timeMatcher(String str) {
        Matcher matcher = Pattern.compile(MATCH_PING_TIME).matcher(str);
        Intrinsics.checkNotNullExpressionValue(matcher, "patternTime.matcher(str)");
        return matcher;
    }

    private static final Matcher traceMatcher(String str) {
        Matcher matcher = Pattern.compile(MATCH_TRACE_IP).matcher(str);
        Intrinsics.checkNotNullExpressionValue(matcher, "patternTrace.matcher(str)");
        return matcher;
    }

    @NotNull
    public static final String traceRoute(@NotNull String host, int i, int i2, boolean z) {
        InetAddress inetAddress;
        Intrinsics.checkNotNullParameter(host, "host");
        try {
            InetAddress[] allByName = InetAddress.getAllByName(host);
            Intrinsics.checkNotNullExpressionValue(allByName, "{\n    InetAddress.getAllByName(host)\n  }");
            int i3 = 0;
            if (allByName.length == 0) {
                return o000oOoO.OooO00o("Unable to resolve host ", host, ": No address associated with hostname");
            }
            int length = allByName.length;
            while (true) {
                if (i3 >= length) {
                    inetAddress = null;
                    break;
                }
                inetAddress = allByName[i3];
                if (z ? inetAddress instanceof Inet6Address : inetAddress instanceof Inet4Address) {
                    break;
                }
                i3++;
            }
            if (inetAddress == null) {
                return o0O00o0.OooO0O0(o0OoOo0.OooO00o("Unable to resolve host ", host, ":No "), z ? "ipv6" : "ipv4", " address associated with hostname");
            }
            if (z) {
                String hostAddress = inetAddress.getHostAddress();
                Intrinsics.checkNotNullExpressionValue(hostAddress, "address.hostAddress");
                return traceRouteIpv6(hostAddress, i, i2);
            }
            String hostAddress2 = inetAddress.getHostAddress();
            Intrinsics.checkNotNullExpressionValue(hostAddress2, "address.hostAddress");
            return traceRouteIpv4(hostAddress2, i, i2);
        } catch (UnknownHostException e) {
            e.printStackTrace();
            return String.valueOf(e.getMessage());
        }
    }

    public static /* synthetic */ String traceRoute$default(String str, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i2 = 5;
        }
        if ((i3 & 8) != 0) {
            z = false;
        }
        return traceRoute(str, i, i2, z);
    }

    @NotNull
    public static final String traceRouteIpv4(@NotNull String ipv4, int i, int i2) {
        Intrinsics.checkNotNullParameter(ipv4, "ipv4");
        return traceRoute(ipv4, "ping -n -c 1 -W " + i2 + " -t", i);
    }

    @NotNull
    public static final String traceRouteIpv6(@NotNull String ipv6, int i, int i2) {
        Intrinsics.checkNotNullParameter(ipv6, "ipv6");
        return traceRoute(ipv6, "ping6 -n -c 1 -W " + i2 + " -t", i);
    }

    @NotNull
    public static final String traceRoute(@NotNull String ip, @NotNull String cmd, int i) {
        Intrinsics.checkNotNullParameter(ip, "ip");
        Intrinsics.checkNotNullParameter(cmd, "cmd");
        String strOooO00o = "";
        for (int i2 = 1; i2 < i; i2++) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            try {
                Shell.CommandResult commandResultExecCmd$default = Shell.execCmd$default(Shell.INSTANCE, cmd + ' ' + i2 + ' ' + ip, false, 2, (Object) null);
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                String successMsg = commandResultExecCmd$default.getSuccessMsg();
                String successMsg2 = !(successMsg == null || StringsKt.isBlank(successMsg)) ? commandResultExecCmd$default.getSuccessMsg() : commandResultExecCmd$default.getErrorMsg();
                if (successMsg2 == null) {
                    successMsg2 = "";
                }
                if (successMsg2.length() == 0) {
                    return strOooO00o;
                }
                Matcher matcherTraceMatcher = traceMatcher(successMsg2);
                StringBuilder sb = new StringBuilder(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
                sb.append(i2);
                sb.append(".");
                if (matcherTraceMatcher.find()) {
                    strOooO00o = oo000o.OooO00o(o00OO.OooO00o(strOooO00o), printNormal(matcherTraceMatcher, (jCurrentTimeMillis2 - jCurrentTimeMillis) / ((long) 2), sb), '\n');
                } else {
                    Matcher matcherIpMatcher = ipMatcher(successMsg2);
                    if (matcherIpMatcher.find()) {
                        return oo000o.OooO00o(o00OO.OooO00o(strOooO00o), printEnd(matcherIpMatcher, successMsg2, sb), '\n');
                    }
                    sb.append("\t\t * \t");
                    strOooO00o = strOooO00o + sb.toString() + '\n';
                }
            } catch (IOException e) {
                e.printStackTrace();
                return strOooO00o;
            }
        }
        return strOooO00o;
    }
}
