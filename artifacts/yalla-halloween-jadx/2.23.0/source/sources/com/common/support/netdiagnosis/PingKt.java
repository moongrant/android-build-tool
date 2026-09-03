package com.common.support.netdiagnosis;

import com.qiniu.android.collect.ReportItem;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u001a\u0018\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u001a\u0018\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¨\u0006\b"}, d2 = {"ping", "", ReportItem.RequestKeyHost, "count", "", "pingIpv4", "ip", "pingIpv6", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class PingKt {
    /* JADX WARN: Code duplicated, block: B:14:0x0025  */
    /* JADX WARN: Code duplicated, block: B:25:0x0046  */
    @NotNull
    public static final String ping(@NotNull String host, int i) {
        InetAddress inetAddress;
        InetAddress inetAddress2;
        String strPingIpv4;
        String strPingIpv6;
        Intrinsics.checkNotNullParameter(host, "host");
        try {
            InetAddress[] addresses = InetAddress.getAllByName(host);
            Intrinsics.checkNotNullExpressionValue(addresses, "addresses");
            int length = addresses.length;
            int i2 = 0;
            while (true) {
                inetAddress = null;
                if (i2 >= length) {
                    inetAddress2 = null;
                    break;
                }
                inetAddress2 = addresses[i2];
                if (inetAddress2 instanceof Inet4Address) {
                    break;
                }
                i2++;
            }
            if (inetAddress2 == null) {
                strPingIpv4 = "";
            } else {
                String hostAddress = inetAddress2.getHostAddress();
                Intrinsics.checkNotNullExpressionValue(hostAddress, "this.hostAddress");
                strPingIpv4 = pingIpv4(hostAddress, i);
                if (strPingIpv4 == null) {
                    strPingIpv4 = "";
                }
            }
            for (InetAddress inetAddress3 : addresses) {
                if (inetAddress3 instanceof Inet6Address) {
                    inetAddress = inetAddress3;
                    break;
                }
            }
            if (inetAddress == null) {
                strPingIpv6 = "";
            } else {
                String hostAddress2 = inetAddress.getHostAddress();
                Intrinsics.checkNotNullExpressionValue(hostAddress2, "this.hostAddress");
                strPingIpv6 = pingIpv6(hostAddress2, i);
                if (strPingIpv6 == null) {
                    strPingIpv6 = "";
                }
            }
            String strStringPlus = strPingIpv4.length() > 0 ? Intrinsics.stringPlus(strPingIpv4, "\n") : "";
            return strPingIpv6.length() > 0 ? Intrinsics.stringPlus(strStringPlus, strPingIpv6) : strStringPlus;
        } catch (UnknownHostException e) {
            e.printStackTrace();
            return "Ping Unknown host: " + host + '\n';
        }
    }

    public static /* synthetic */ String ping$default(String str, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 5;
        }
        return ping(str, i);
    }

    @NotNull
    public static final String pingIpv4(@NotNull String ip, int i) {
        Intrinsics.checkNotNullParameter(ip, "ip");
        boolean z = true;
        if (ip.length() == 0) {
            throw new IllegalArgumentException("Ipv6 address can not be empty");
        }
        Shell.CommandResult commandResultExecCmd = Shell.INSTANCE.execCmd("ping -c " + i + ' ' + ip, false);
        String successMsg = commandResultExecCmd.getSuccessMsg();
        if (successMsg != null && successMsg.length() != 0) {
            z = false;
        }
        String errorMsg = z ? commandResultExecCmd.getErrorMsg() : commandResultExecCmd.getSuccessMsg();
        return errorMsg == null ? "" : errorMsg;
    }

    public static /* synthetic */ String pingIpv4$default(String str, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 5;
        }
        return pingIpv4(str, i);
    }

    @NotNull
    public static final String pingIpv6(@NotNull String ip, int i) {
        Intrinsics.checkNotNullParameter(ip, "ip");
        boolean z = true;
        if (ip.length() == 0) {
            throw new IllegalArgumentException("Ipv6 address can not be empty");
        }
        Shell.CommandResult commandResultExecCmd = Shell.INSTANCE.execCmd("ping6 -c " + i + ' ' + ip, false);
        String successMsg = commandResultExecCmd.getSuccessMsg();
        if (successMsg != null && successMsg.length() != 0) {
            z = false;
        }
        String errorMsg = z ? commandResultExecCmd.getErrorMsg() : commandResultExecCmd.getSuccessMsg();
        return errorMsg == null ? "" : errorMsg;
    }

    public static /* synthetic */ String pingIpv6$default(String str, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 5;
        }
        return pingIpv6(str, i);
    }
}
