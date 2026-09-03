package com.common.support.netdiagnosis;

import android.os.Looper;
import androidx.annotation.RequiresPermission;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Enumeration;
import java.util.LinkedList;
import java.util.Locale;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u001a\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0007\u001a\u00020\u0003H\u0007\u001a\u0010\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\nH\u0002\u001a\u001a\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002¨\u0006\f"}, d2 = {"devicePublicIpAddress", "", "isIpv4", "", "sslSocketFactory", "Ljavax/net/ssl/SSLSocketFactory;", "iPAddress", "useIPv4", "readResponse", "inputStream", "Ljava/io/InputStream;", "requestIp", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class IPKt {
    @NotNull
    public static final String devicePublicIpAddress(boolean z, @Nullable SSLSocketFactory sSLSocketFactory) {
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            throw new IllegalStateException("This method can not run on main thread");
        }
        try {
            return requestIp(z, sSLSocketFactory);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static /* synthetic */ String devicePublicIpAddress$default(boolean z, SSLSocketFactory sSLSocketFactory, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            sSLSocketFactory = null;
        }
        return devicePublicIpAddress(z, sSLSocketFactory);
    }

    @RequiresPermission("android.permission.INTERNET")
    @Nullable
    public static final String iPAddress(boolean z) {
        String upperCase;
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            Intrinsics.checkNotNullExpressionValue(networkInterfaces, "getNetworkInterfaces()");
            LinkedList<InetAddress> linkedList = new LinkedList();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface networkInterfaceNextElement = networkInterfaces.nextElement();
                Intrinsics.checkNotNullExpressionValue(networkInterfaceNextElement, "nis.nextElement()");
                NetworkInterface networkInterface = networkInterfaceNextElement;
                if (networkInterface.isUp() && !networkInterface.isLoopback()) {
                    Enumeration<InetAddress> inetAddresses = networkInterface.getInetAddresses();
                    Intrinsics.checkNotNullExpressionValue(inetAddresses, "ni.inetAddresses");
                    while (inetAddresses.hasMoreElements()) {
                        linkedList.addFirst(inetAddresses.nextElement());
                    }
                }
            }
            for (InetAddress inetAddress : linkedList) {
                if (!inetAddress.isLoopbackAddress()) {
                    String hostAddress = inetAddress.getHostAddress();
                    Intrinsics.checkNotNullExpressionValue(hostAddress, "hostAddress");
                    boolean z2 = StringsKt__StringsKt.indexOf$default((CharSequence) hostAddress, ':', 0, false, 6, (Object) null) < 0;
                    if (z) {
                        if (z2) {
                            return hostAddress;
                        }
                    } else if (!z2) {
                        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) hostAddress, '%', 0, false, 6, (Object) null);
                        if (iIndexOf$default < 0) {
                            Locale ROOT = Locale.ROOT;
                            Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
                            upperCase = hostAddress.toUpperCase(ROOT);
                        } else {
                            String strSubstring = hostAddress.substring(0, iIndexOf$default);
                            Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                            Locale ROOT2 = Locale.ROOT;
                            Intrinsics.checkNotNullExpressionValue(ROOT2, "ROOT");
                            if (strSubstring == null) {
                                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                            }
                            upperCase = strSubstring.toUpperCase(ROOT2);
                        }
                        Intrinsics.checkNotNullExpressionValue(upperCase, "(this as java.lang.String).toUpperCase(locale)");
                        return upperCase;
                    }
                }
            }
            return "";
        } catch (SocketException e) {
            e.printStackTrace();
            return "";
        }
    }

    private static final String readResponse(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        char[] cArr = new char[LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY];
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i != -1) {
            i = bufferedReader.read(cArr);
            if (i != -1) {
                sb.append(cArr, 0, i);
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    private static final String requestIp(boolean z, SSLSocketFactory sSLSocketFactory) {
        InputStream connInputStream = null;
        try {
            URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL("https://ifconfig.me/ip").openConnection());
            if (!(uRLConnection instanceof HttpsURLConnection)) {
                return "";
            }
            if (sSLSocketFactory != null) {
                ((HttpsURLConnection) uRLConnection).setSSLSocketFactory(sSLSocketFactory);
            }
            boolean z2 = false;
            ((HttpsURLConnection) uRLConnection).setInstanceFollowRedirects(false);
            ((HttpsURLConnection) uRLConnection).setRequestMethod("GET");
            int responseCode = ((HttpsURLConnection) uRLConnection).getResponseCode();
            if (responseCode >= 200 && responseCode < 300) {
                z2 = true;
            }
            connInputStream = z2 ? ((HttpsURLConnection) uRLConnection).getInputStream() : ((HttpsURLConnection) uRLConnection).getErrorStream();
            Intrinsics.checkNotNullExpressionValue(connInputStream, "connInputStream");
            String response = readResponse(connInputStream);
            if (connInputStream != null) {
                try {
                    connInputStream.close();
                } catch (Throwable unused) {
                }
            }
            return response;
        } catch (Throwable th) {
            try {
                return ExceptionsKt.stackTraceToString(th);
            } finally {
                if (connInputStream != null) {
                    try {
                        connInputStream.close();
                    } catch (Throwable unused2) {
                    }
                }
            }
        }
    }
}
