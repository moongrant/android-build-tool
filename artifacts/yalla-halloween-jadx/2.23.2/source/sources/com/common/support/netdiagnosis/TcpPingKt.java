package com.common.support.netdiagnosis;

import android.util.Log;
import androidx.compose.foundation.layout.oo000o;
import com.facebook.appevents.integrity.IntegrityManager;
import com.qiniu.android.collect.ReportItem;
import java.io.IOException;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.DurationKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002\u001a \u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0001H\u0002\u001a\u0018\u0010\t\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u0001H\u0007\u001a\u0016\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u0001\u001a\u0016\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"LOG_TAG", "", "NotReach", "", "TimeOut", "connect", "", "socketAddress", "Ljava/net/InetSocketAddress;", "tcpPing", "Lcom/common/support/netdiagnosis/TcpPingResult;", ReportItem.RequestKeyHost, IntegrityManager.INTEGRITY_TYPE_ADDRESS, "Ljava/net/InetAddress;", ReportItem.RequestKeyPort, "tcpPingAverageSpendTime", "tcpPingNew", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class TcpPingKt {

    @NotNull
    private static final String LOG_TAG = "TcpPing";
    private static final int NotReach = -2;
    private static final int TimeOut = -3;

    private static final void connect(InetSocketAddress inetSocketAddress) throws Throwable {
        Socket socket = null;
        try {
            try {
                Socket socket2 = new Socket();
                try {
                    socket2.connect(inetSocketAddress, 20000);
                    try {
                        socket2.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } catch (IOException e2) {
                    e = e2;
                    e.printStackTrace();
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    socket = socket2;
                    if (socket != null) {
                        try {
                            socket.close();
                        } catch (IOException e3) {
                            e3.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e4) {
            e = e4;
        }
    }

    @Deprecated(message = "Use 'tcpPingNew(host, port): TcpPingResult' instead!", replaceWith = @ReplaceWith(expression = "tcpPingNew(host, port)", imports = {"com.common.support.lib.tcpPingNew"}))
    @NotNull
    public static final String tcpPing(@NotNull String host, @NotNull String port) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(port, "port");
        return tcpPingNew(host, port).getResultMsg();
    }

    public static final int tcpPingAverageSpendTime(@NotNull String host, @NotNull String port) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(port, "port");
        return tcpPingNew(host, port).getAverageSpendTime();
    }

    @NotNull
    public static final TcpPingResult tcpPingNew(@NotNull String host, @NotNull String port) {
        InetAddress inetAddress;
        InetAddress inetAddress2;
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(port, "port");
        try {
            InetAddress[] addresses = InetAddress.getAllByName(host);
            Intrinsics.checkNotNullExpressionValue(addresses, "addresses");
            int length = addresses.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    inetAddress = null;
                    break;
                }
                inetAddress = addresses[i];
                if (inetAddress instanceof Inet4Address) {
                    break;
                }
                i++;
            }
            TcpPingResult tcpPingResultTcpPing = inetAddress == null ? null : tcpPing(host, inetAddress, port);
            if (tcpPingResultTcpPing == null) {
                tcpPingResultTcpPing = new TcpPingResult("", -1);
            }
            int length2 = addresses.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length2) {
                    inetAddress2 = null;
                    break;
                }
                inetAddress2 = addresses[i2];
                if (inetAddress2 instanceof Inet6Address) {
                    break;
                }
                i2++;
            }
            TcpPingResult tcpPingResultTcpPing2 = inetAddress2 != null ? tcpPing(host, inetAddress2, port) : null;
            if (tcpPingResultTcpPing2 == null) {
                tcpPingResultTcpPing2 = new TcpPingResult("", -1);
            }
            String strStringPlus = tcpPingResultTcpPing.getResultMsg().length() > 0 ? Intrinsics.stringPlus(tcpPingResultTcpPing.getResultMsg(), "\n") : "";
            if (tcpPingResultTcpPing2.getResultMsg().length() > 0) {
                strStringPlus = Intrinsics.stringPlus(strStringPlus, tcpPingResultTcpPing2.getResultMsg());
            }
            return new TcpPingResult(strStringPlus, tcpPingResultTcpPing2.getAverageSpendTime() != -1 ? tcpPingResultTcpPing2.getAverageSpendTime() : tcpPingResultTcpPing.getAverageSpendTime());
        } catch (UnknownHostException e) {
            e.printStackTrace();
            return new TcpPingResult("TcpPing Unknown host: " + host + '\n', -1);
        }
    }

    private static final TcpPingResult tcpPing(String str, InetAddress inetAddress, String str2) throws Throwable {
        String str3;
        InetSocketAddress inetSocketAddress;
        int i;
        int i2;
        String str4 = "Probing ";
        InetSocketAddress inetSocketAddress2 = new InetSocketAddress(inetAddress, Integer.parseInt(str2));
        Log.d(LOG_TAG, "connect to " + inetAddress + ':' + str2);
        int[] iArr = new int[4];
        String strOooO0O0 = "";
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = i4 + 1;
            long jCurrentTimeMillis = System.currentTimeMillis();
            try {
                connect(inetSocketAddress2);
            } catch (IOException e) {
                e.printStackTrace();
                Log.e(LOG_TAG, "", e);
                byte b = e instanceof SocketTimeoutException ? (byte) -3 : (byte) -2;
                if (i4 == 0) {
                    StringBuilder sb = new StringBuilder("TCPPING ");
                    sb.append(b == -3 ? "TimeOut" : "NotReach");
                    sb.append(" host: ");
                    sb.append(str);
                    sb.append(':');
                    return new TcpPingResult(oo000o.OooO0O0(sb, str2, '\n'), -1);
                }
                i3++;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(strOooO0O0);
                sb2.append(str4);
                sb2.append(inetAddress);
                sb2.append(':');
                sb2.append(str2);
                sb2.append("/tcp - ");
                strOooO0O0 = oo000o.OooO0O0(sb2, b == -3 ? "TimeOut" : "NotReach", '\n');
            }
            int iCurrentTimeMillis = (int) (System.currentTimeMillis() - jCurrentTimeMillis);
            String str5 = strOooO0O0 + str4 + inetAddress + ':' + str2 + "/tcp - time=" + iCurrentTimeMillis + "ms\n";
            iArr[i4] = iCurrentTimeMillis;
            if (1 <= iCurrentTimeMillis && iCurrentTimeMillis <= 99) {
                str3 = str4;
                inetSocketAddress = inetSocketAddress2;
                try {
                    Thread.sleep(((long) 100) - ((long) iCurrentTimeMillis));
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            } else {
                str3 = str4;
                inetSocketAddress = inetSocketAddress2;
            }
            if (i5 > 3) {
                int i6 = DurationKt.NANOS_IN_MILLIS;
                if (i4 >= 0) {
                    int i7 = 0;
                    i = 0;
                    i2 = 0;
                    while (true) {
                        int i8 = i7 + 1;
                        int i9 = iArr[i7];
                        if (i9 > i) {
                            i = i9;
                        }
                        if (i9 < i6) {
                            i6 = i9;
                        }
                        i2 += i9;
                        if (i7 == i4) {
                            break;
                        }
                        i7 = i8;
                    }
                } else {
                    i = 0;
                    i2 = 0;
                }
                int i10 = 4 - i3;
                int i11 = i2 / i10;
                return new TcpPingResult(str5 + "Ping statistics for " + inetAddress + ':' + str2 + "\n     4 probes sent.\n     " + i10 + " successful, " + i3 + " failed.\nApproximate trip times in milli-seconds:\n     Minimum = " + i6 + "ms, Maximum = " + i + "ms, Average = " + i11 + "ms\n", i11);
            }
            i4 = i5;
            strOooO0O0 = str5;
            str4 = str3;
            inetSocketAddress2 = inetSocketAddress;
        }
    }
}
