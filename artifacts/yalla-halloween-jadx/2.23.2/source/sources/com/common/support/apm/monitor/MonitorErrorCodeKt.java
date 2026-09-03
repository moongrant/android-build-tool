package com.common.support.apm.monitor;

import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import java.net.ConnectException;
import java.net.NoRouteToHostException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import javax.net.ssl.SSLHandshakeException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u001a\u0010\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u0017H\u0002\u001a\u0010\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u0019H\u0002\u001a\n\u0010\u001a\u001a\u00020\u0001*\u00020\u001b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0014\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"MONITOR_ERROR_CONNECT", "", "MONITOR_ERROR_COROUTINE_CANCEL_EXCEPTION", "MONITOR_ERROR_FILE_NOT_FOUND", "MONITOR_ERROR_IO_EXCEPTION", "MONITOR_ERROR_LOOP_QUIT_ABNORMALLY", "MONITOR_ERROR_NO_ROUTE_TO_HOST", "MONITOR_ERROR_PARSE_JSON", "MONITOR_ERROR_PERMISSION_DENIED", "MONITOR_ERROR_SERVER_NETWORK_403", "MONITOR_ERROR_SOCKET", "MONITOR_ERROR_SOCKET_CLOSED", "MONITOR_ERROR_SOCKET_SOFTWARE_ABORT", "MONITOR_ERROR_SOCKET_TIME_OUT", "MONITOR_ERROR_SOCKET_TIME_OUT_IO", "MONITOR_ERROR_SSL_HANDSHAKE", "MONITOR_ERROR_UNKNOWN_ERROR", "MONITOR_ERROR_UNKNOWN_HOST", "MONITOR_ERROR_XLOG_FLUSH_FAILED", "MONITOR_ERROR_XLOG_LINE_EXCEED_MAX_SIZE", "SERVER_BIZ_CODE_RANGE", "getSocketExceptionCode", "exception", "Ljava/net/SocketException;", "getSocketTimeoutExceptionCode", "Ljava/net/SocketTimeoutException;", "errorCode", "", "sailfish_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class MonitorErrorCodeKt {
    public static final int MONITOR_ERROR_CONNECT = -230;
    public static final int MONITOR_ERROR_COROUTINE_CANCEL_EXCEPTION = -440;
    public static final int MONITOR_ERROR_FILE_NOT_FOUND = -420;
    public static final int MONITOR_ERROR_IO_EXCEPTION = -400;
    public static final int MONITOR_ERROR_LOOP_QUIT_ABNORMALLY = -450;
    public static final int MONITOR_ERROR_NO_ROUTE_TO_HOST = -240;
    public static final int MONITOR_ERROR_PARSE_JSON = -410;
    public static final int MONITOR_ERROR_PERMISSION_DENIED = -430;
    public static final int MONITOR_ERROR_SERVER_NETWORK_403 = 403;
    public static final int MONITOR_ERROR_SOCKET = -250;
    public static final int MONITOR_ERROR_SOCKET_CLOSED = -251;
    public static final int MONITOR_ERROR_SOCKET_SOFTWARE_ABORT = -252;
    public static final int MONITOR_ERROR_SOCKET_TIME_OUT = -200;
    public static final int MONITOR_ERROR_SOCKET_TIME_OUT_IO = -201;
    public static final int MONITOR_ERROR_SSL_HANDSHAKE = -220;
    public static final int MONITOR_ERROR_UNKNOWN_ERROR = -100;
    public static final int MONITOR_ERROR_UNKNOWN_HOST = -210;
    public static final int MONITOR_ERROR_XLOG_FLUSH_FAILED = -460;
    public static final int MONITOR_ERROR_XLOG_LINE_EXCEED_MAX_SIZE = -470;
    public static final int SERVER_BIZ_CODE_RANGE = 1000;

    public static final int errorCode(@NotNull Throwable th) {
        Intrinsics.checkNotNullParameter(th, "<this>");
        if (th instanceof SocketTimeoutException) {
            return getSocketTimeoutExceptionCode((SocketTimeoutException) th);
        }
        if (th instanceof UnknownHostException) {
            return MONITOR_ERROR_UNKNOWN_HOST;
        }
        if (th instanceof SSLHandshakeException) {
            return MONITOR_ERROR_SSL_HANDSHAKE;
        }
        if (th instanceof ConnectException) {
            return MONITOR_ERROR_CONNECT;
        }
        if (th instanceof NoRouteToHostException) {
            return MONITOR_ERROR_NO_ROUTE_TO_HOST;
        }
        if (th instanceof SocketException) {
            return getSocketExceptionCode((SocketException) th);
        }
        if (th instanceof IOException) {
            return MONITOR_ERROR_IO_EXCEPTION;
        }
        if (th instanceof JsonIOException ? true : th instanceof JsonSyntaxException) {
            return MONITOR_ERROR_PARSE_JSON;
        }
        return -100;
    }

    private static final int getSocketExceptionCode(SocketException socketException) {
        String message = socketException.getMessage();
        if (message == null) {
            return MONITOR_ERROR_SOCKET;
        }
        if (StringsKt__StringsJVMKt.startsWith$default(StringsKt.trim((CharSequence) message).toString(), "Socket closed", false, 2, null)) {
            return MONITOR_ERROR_SOCKET_CLOSED;
        }
        return StringsKt__StringsJVMKt.startsWith$default(StringsKt.trim((CharSequence) message).toString(), "Software caused connection abort", false, 2, null) ? MONITOR_ERROR_SOCKET_SOFTWARE_ABORT : MONITOR_ERROR_SOCKET;
    }

    private static final int getSocketTimeoutExceptionCode(SocketTimeoutException socketTimeoutException) {
        String message = socketTimeoutException.getMessage();
        if (message != null && StringsKt__StringsJVMKt.startsWith$default(StringsKt.trim((CharSequence) message).toString(), "timeout", false, 2, null)) {
            return MONITOR_ERROR_SOCKET_TIME_OUT_IO;
        }
        return -200;
    }
}
