package io.grpc;

import java.util.concurrent.atomic.AtomicReferenceArray;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;

/* JADX INFO: loaded from: classes3.dex */
@Immutable
public final class MethodDescriptor<ReqT, RespT> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final boolean f26340OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final MethodType f26341OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f26342OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public final String f26343OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO0O0<ReqT> f26344OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public final Object f26345OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooO0O0<RespT> f26346OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f26347OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final boolean f26348OooO0oo;

    public enum MethodType {
        UNARY,
        CLIENT_STREAMING,
        SERVER_STREAMING,
        BIDI_STREAMING,
        UNKNOWN
    }

    public static final class OooO00o<ReqT, RespT> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public OooO0O0<ReqT> f26349OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public OooO0O0<RespT> f26350OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public MethodType f26351OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public String f26352OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public boolean f26353OooO0o0;

        @CheckReturnValue
        public final MethodDescriptor<ReqT, RespT> OooO00o() {
            return new MethodDescriptor<>(this.f26351OooO0OO, this.f26352OooO0Oo, this.f26349OooO00o, this.f26350OooO0O0, this.f26353OooO0o0);
        }
    }

    public interface OooO0O0<T> {
    }

    public MethodDescriptor(MethodType methodType, String str, OooO0O0 oooO0O0, OooO0O0 oooO0O1, boolean z) {
        new AtomicReferenceArray(1);
        o0OOOO0o.OooOOOO.OooOO0(methodType, "type");
        this.f26341OooO00o = methodType;
        o0OOOO0o.OooOOOO.OooOO0(str, "fullMethodName");
        this.f26342OooO0O0 = str;
        int iLastIndexOf = str.lastIndexOf(47);
        this.f26343OooO0OO = iLastIndexOf == -1 ? null : str.substring(0, iLastIndexOf);
        o0OOOO0o.OooOOOO.OooOO0(oooO0O0, "requestMarshaller");
        this.f26344OooO0Oo = oooO0O0;
        o0OOOO0o.OooOOOO.OooOO0(oooO0O1, "responseMarshaller");
        this.f26346OooO0o0 = oooO0O1;
        this.f26345OooO0o = null;
        this.f26347OooO0oO = false;
        this.f26348OooO0oo = false;
        this.f26340OooO = z;
    }

    public static String OooO00o(String str, String str2) {
        return OooO0o.OooO0OO.OooO00o(str, "/", str2);
    }

    @CheckReturnValue
    public static <ReqT, RespT> OooO00o<ReqT, RespT> OooO0O0() {
        OooO00o<ReqT, RespT> oooO00o = new OooO00o<>();
        oooO00o.f26349OooO00o = null;
        oooO00o.f26350OooO0O0 = null;
        return oooO00o;
    }

    public final String toString() {
        o0OOOO0o.OooOOO0.OooO00o oooO00oOooO0O0 = o0OOOO0o.OooOOO0.OooO0O0(this);
        oooO00oOooO0O0.OooO0OO("fullMethodName", this.f26342OooO0O0);
        oooO00oOooO0O0.OooO0OO("type", this.f26341OooO00o);
        oooO00oOooO0O0.OooO0O0("idempotent", this.f26347OooO0oO);
        oooO00oOooO0O0.OooO0O0("safe", this.f26348OooO0oo);
        oooO00oOooO0O0.OooO0O0("sampledToLocalTracing", this.f26340OooO);
        oooO00oOooO0O0.OooO0OO("requestMarshaller", this.f26344OooO0Oo);
        oooO00oOooO0O0.OooO0OO("responseMarshaller", this.f26346OooO0o0);
        oooO00oOooO0O0.OooO0OO("schemaDescriptor", this.f26345OooO0o);
        oooO00oOooO0O0.f38241OooO0Oo = true;
        return oooO00oOooO0O0.toString();
    }
}
