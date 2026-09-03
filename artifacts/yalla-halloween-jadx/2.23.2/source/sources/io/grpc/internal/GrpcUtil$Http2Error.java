package io.grpc.internal;

import com.google.common.base.Oooo0;
import io.grpc.Status;
import p031OoooO0.o0OoOo0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes5.dex */
public final class GrpcUtil$Http2Error {
    private static final /* synthetic */ GrpcUtil$Http2Error[] $VALUES;
    public static final GrpcUtil$Http2Error CANCEL;
    public static final GrpcUtil$Http2Error COMPRESSION_ERROR;
    public static final GrpcUtil$Http2Error CONNECT_ERROR;
    public static final GrpcUtil$Http2Error ENHANCE_YOUR_CALM;
    public static final GrpcUtil$Http2Error FLOW_CONTROL_ERROR;
    public static final GrpcUtil$Http2Error FRAME_SIZE_ERROR;
    public static final GrpcUtil$Http2Error HTTP_1_1_REQUIRED;
    public static final GrpcUtil$Http2Error INADEQUATE_SECURITY;
    public static final GrpcUtil$Http2Error INTERNAL_ERROR;
    public static final GrpcUtil$Http2Error NO_ERROR;
    public static final GrpcUtil$Http2Error PROTOCOL_ERROR;
    public static final GrpcUtil$Http2Error REFUSED_STREAM;
    public static final GrpcUtil$Http2Error SETTINGS_TIMEOUT;
    public static final GrpcUtil$Http2Error STREAM_CLOSED;
    private static final GrpcUtil$Http2Error[] codeMap;
    private final int code;
    private final Status status;

    static {
        Status status = Status.f32477OooOO0;
        GrpcUtil$Http2Error grpcUtil$Http2Error = new GrpcUtil$Http2Error("NO_ERROR", 0, 0, status);
        NO_ERROR = grpcUtil$Http2Error;
        Status status2 = Status.f32471OooO;
        GrpcUtil$Http2Error grpcUtil$Http2Error2 = new GrpcUtil$Http2Error("PROTOCOL_ERROR", 1, 1, status2);
        PROTOCOL_ERROR = grpcUtil$Http2Error2;
        GrpcUtil$Http2Error grpcUtil$Http2Error3 = new GrpcUtil$Http2Error("INTERNAL_ERROR", 2, 2, status2);
        INTERNAL_ERROR = grpcUtil$Http2Error3;
        GrpcUtil$Http2Error grpcUtil$Http2Error4 = new GrpcUtil$Http2Error("FLOW_CONTROL_ERROR", 3, 3, status2);
        FLOW_CONTROL_ERROR = grpcUtil$Http2Error4;
        GrpcUtil$Http2Error grpcUtil$Http2Error5 = new GrpcUtil$Http2Error("SETTINGS_TIMEOUT", 4, 4, status2);
        SETTINGS_TIMEOUT = grpcUtil$Http2Error5;
        GrpcUtil$Http2Error grpcUtil$Http2Error6 = new GrpcUtil$Http2Error("STREAM_CLOSED", 5, 5, status2);
        STREAM_CLOSED = grpcUtil$Http2Error6;
        GrpcUtil$Http2Error grpcUtil$Http2Error7 = new GrpcUtil$Http2Error("FRAME_SIZE_ERROR", 6, 6, status2);
        FRAME_SIZE_ERROR = grpcUtil$Http2Error7;
        GrpcUtil$Http2Error grpcUtil$Http2Error8 = new GrpcUtil$Http2Error("REFUSED_STREAM", 7, 7, status);
        REFUSED_STREAM = grpcUtil$Http2Error8;
        GrpcUtil$Http2Error grpcUtil$Http2Error9 = new GrpcUtil$Http2Error("CANCEL", 8, 8, Status.f32474OooO0o0);
        CANCEL = grpcUtil$Http2Error9;
        GrpcUtil$Http2Error grpcUtil$Http2Error10 = new GrpcUtil$Http2Error("COMPRESSION_ERROR", 9, 9, status2);
        COMPRESSION_ERROR = grpcUtil$Http2Error10;
        GrpcUtil$Http2Error grpcUtil$Http2Error11 = new GrpcUtil$Http2Error("CONNECT_ERROR", 10, 10, status2);
        CONNECT_ERROR = grpcUtil$Http2Error11;
        Status status3 = Status.f32476OooO0oo;
        GrpcUtil$Http2Error grpcUtil$Http2Error12 = new GrpcUtil$Http2Error("ENHANCE_YOUR_CALM", 11, 11, Oooo0.OooO00o(status3.f32479OooO0O0, "Bandwidth exhausted") ? status3 : new Status(status3.f32478OooO00o, "Bandwidth exhausted", status3.f32480OooO0OO));
        ENHANCE_YOUR_CALM = grpcUtil$Http2Error12;
        Status status4 = Status.f32475OooO0oO;
        if (!Oooo0.OooO00o(status4.f32479OooO0O0, "Permission denied as protocol is not secure enough to call")) {
            status4 = new Status(status4.f32478OooO00o, "Permission denied as protocol is not secure enough to call", status4.f32480OooO0OO);
        }
        GrpcUtil$Http2Error grpcUtil$Http2Error13 = new GrpcUtil$Http2Error("INADEQUATE_SECURITY", 12, 12, status4);
        INADEQUATE_SECURITY = grpcUtil$Http2Error13;
        GrpcUtil$Http2Error grpcUtil$Http2Error14 = new GrpcUtil$Http2Error("HTTP_1_1_REQUIRED", 13, 13, Status.f32473OooO0o);
        HTTP_1_1_REQUIRED = grpcUtil$Http2Error14;
        $VALUES = new GrpcUtil$Http2Error[]{grpcUtil$Http2Error, grpcUtil$Http2Error2, grpcUtil$Http2Error3, grpcUtil$Http2Error4, grpcUtil$Http2Error5, grpcUtil$Http2Error6, grpcUtil$Http2Error7, grpcUtil$Http2Error8, grpcUtil$Http2Error9, grpcUtil$Http2Error10, grpcUtil$Http2Error11, grpcUtil$Http2Error12, grpcUtil$Http2Error13, grpcUtil$Http2Error14};
        GrpcUtil$Http2Error[] grpcUtil$Http2ErrorArrValues = values();
        GrpcUtil$Http2Error[] grpcUtil$Http2ErrorArr = new GrpcUtil$Http2Error[grpcUtil$Http2ErrorArrValues[grpcUtil$Http2ErrorArrValues.length - 1].code + 1];
        for (GrpcUtil$Http2Error grpcUtil$Http2Error15 : grpcUtil$Http2ErrorArrValues) {
            grpcUtil$Http2ErrorArr[grpcUtil$Http2Error15.code] = grpcUtil$Http2Error15;
        }
        codeMap = grpcUtil$Http2ErrorArr;
    }

    public GrpcUtil$Http2Error(String str, int i, int i2, Status status) {
        super(str, i);
        this.code = i2;
        String str2 = "HTTP/2 error code: " + name();
        if (str2 == null) {
            status.getClass();
        } else {
            Throwable th = status.f32480OooO0OO;
            Status.Code code = status.f32478OooO00o;
            String str3 = status.f32479OooO0O0;
            status = str3 == null ? new Status(code, str2, th) : new Status(code, o0OoOo0.OooO0O0(str3, "\n", str2), th);
        }
        this.status = status;
    }

    public static GrpcUtil$Http2Error valueOf(String str) {
        return (GrpcUtil$Http2Error) Enum.valueOf(GrpcUtil$Http2Error.class, str);
    }

    public static GrpcUtil$Http2Error[] values() {
        return (GrpcUtil$Http2Error[]) $VALUES.clone();
    }
}
