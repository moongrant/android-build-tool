package io.grpc.internal;

import Oooo000.o00O0O;
import com.google.common.annotations.VisibleForTesting;
import io.grpc.OooOOO0;
import io.grpc.OooOo00;
import io.grpc.Status;
import java.nio.charset.Charset;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import o0OOOO0o.OooO0OO;
import p634o0ooO0O.o00OO000;

/* JADX INFO: loaded from: classes3.dex */
public final class GrpcUtil {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final boolean f26394OooO00o;

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'NO_ERROR' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class Http2Error {
        private static final /* synthetic */ Http2Error[] $VALUES;
        public static final Http2Error CANCEL;
        public static final Http2Error COMPRESSION_ERROR;
        public static final Http2Error CONNECT_ERROR;
        public static final Http2Error ENHANCE_YOUR_CALM;
        public static final Http2Error FLOW_CONTROL_ERROR;
        public static final Http2Error FRAME_SIZE_ERROR;
        public static final Http2Error HTTP_1_1_REQUIRED;
        public static final Http2Error INADEQUATE_SECURITY;
        public static final Http2Error INTERNAL_ERROR;
        public static final Http2Error NO_ERROR;
        public static final Http2Error PROTOCOL_ERROR;
        public static final Http2Error REFUSED_STREAM;
        public static final Http2Error SETTINGS_TIMEOUT;
        public static final Http2Error STREAM_CLOSED;
        private static final Http2Error[] codeMap;

        /* JADX INFO: renamed from: code, reason: collision with root package name */
        private final int f26395code;
        private final Status status;

        static {
            Status status = Status.f26386OooOO0O;
            Http2Error http2Error = new Http2Error("NO_ERROR", 0, 0, status);
            NO_ERROR = http2Error;
            Status status2 = Status.f26385OooOO0;
            Http2Error http2Error2 = new Http2Error("PROTOCOL_ERROR", 1, 1, status2);
            PROTOCOL_ERROR = http2Error2;
            Http2Error http2Error3 = new Http2Error("INTERNAL_ERROR", 2, 2, status2);
            INTERNAL_ERROR = http2Error3;
            Http2Error http2Error4 = new Http2Error("FLOW_CONTROL_ERROR", 3, 3, status2);
            FLOW_CONTROL_ERROR = http2Error4;
            Http2Error http2Error5 = new Http2Error("SETTINGS_TIMEOUT", 4, 4, status2);
            SETTINGS_TIMEOUT = http2Error5;
            Http2Error http2Error6 = new Http2Error("STREAM_CLOSED", 5, 5, status2);
            STREAM_CLOSED = http2Error6;
            Http2Error http2Error7 = new Http2Error("FRAME_SIZE_ERROR", 6, 6, status2);
            FRAME_SIZE_ERROR = http2Error7;
            Http2Error http2Error8 = new Http2Error("REFUSED_STREAM", 7, 7, status);
            REFUSED_STREAM = http2Error8;
            Http2Error http2Error9 = new Http2Error("CANCEL", 8, 8, Status.f26382OooO0o0);
            CANCEL = http2Error9;
            Http2Error http2Error10 = new Http2Error("COMPRESSION_ERROR", 9, 9, status2);
            COMPRESSION_ERROR = http2Error10;
            Http2Error http2Error11 = new Http2Error("CONNECT_ERROR", 10, 10, status2);
            CONNECT_ERROR = http2Error11;
            Http2Error http2Error12 = new Http2Error("ENHANCE_YOUR_CALM", 11, 11, Status.f26384OooO0oo.OooO0OO("Bandwidth exhausted"));
            ENHANCE_YOUR_CALM = http2Error12;
            Http2Error http2Error13 = new Http2Error("INADEQUATE_SECURITY", 12, 12, Status.f26383OooO0oO.OooO0OO("Permission denied as protocol is not secure enough to call"));
            INADEQUATE_SECURITY = http2Error13;
            Http2Error http2Error14 = new Http2Error("HTTP_1_1_REQUIRED", 13, 13, Status.f26381OooO0o);
            HTTP_1_1_REQUIRED = http2Error14;
            $VALUES = new Http2Error[]{http2Error, http2Error2, http2Error3, http2Error4, http2Error5, http2Error6, http2Error7, http2Error8, http2Error9, http2Error10, http2Error11, http2Error12, http2Error13, http2Error14};
            Http2Error[] http2ErrorArrValues = values();
            Http2Error[] http2ErrorArr = new Http2Error[http2ErrorArrValues[http2ErrorArrValues.length - 1].f26395code + 1];
            for (Http2Error http2Error15 : http2ErrorArrValues) {
                http2ErrorArr[http2Error15.f26395code] = http2Error15;
            }
            codeMap = http2ErrorArr;
        }

        public Http2Error(String str, int i, int i2, Status status) {
            super(str, i);
            this.f26395code = i2;
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("HTTP/2 error code: ");
            sbOooO0o0.append(name());
            String string = sbOooO0o0.toString();
            Objects.requireNonNull(status);
            if (string != null) {
                status = status.f26389OooO0O0 == null ? new Status(status.f26388OooO00o, string, status.f26390OooO0OO) : new Status(status.f26388OooO00o, o00O0O.OooO0O0(new StringBuilder(), status.f26389OooO0O0, "\n", string), status.f26390OooO0OO);
            }
            this.status = status;
        }

        public static Http2Error valueOf(String str) {
            return (Http2Error) Enum.valueOf(Http2Error.class, str);
        }

        public static Http2Error[] values() {
            return (Http2Error[]) $VALUES.clone();
        }
    }

    public static final class OooO00o implements OooOOO0.OooO00o<byte[]> {
    }

    @VisibleForTesting
    public static class OooO0O0 implements OooOo00.OooO0o<Long> {
    }

    static {
        Logger.getLogger(GrpcUtil.class.getName());
        Charset.forName("US-ASCII");
        f26394OooO00o = System.getProperty("com.google.appengine.runtime.environment") != null && "1.7".equals(System.getProperty("java.specification.version"));
        OooOo00.OooO.OooO00o("grpc-timeout", new OooO0O0());
        OooOo00.OooO0o<String> oooO0o = OooOo00.f26373OooO00o;
        OooOo00.OooO.OooO00o("grpc-encoding", oooO0o);
        OooOOO0.OooO00o("grpc-accept-encoding", new OooO00o());
        OooOo00.OooO.OooO00o("content-encoding", oooO0o);
        OooOOO0.OooO00o("accept-encoding", new OooO00o());
        OooOo00.OooO.OooO00o("content-type", oooO0o);
        OooOo00.OooO.OooO00o("te", oooO0o);
        OooOo00.OooO.OooO00o("user-agent", oooO0o);
        OooO0OO.OooO oooO = OooO0OO.OooO.f38223Oooo0oO;
        Objects.requireNonNull(OooO0OO.OooOO0.f38229Oooo0oo);
        TimeUnit.MINUTES.toNanos(1L);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        timeUnit.toNanos(20L);
        TimeUnit.HOURS.toNanos(2L);
        timeUnit.toNanos(20L);
        new o00OO000();
    }
}
