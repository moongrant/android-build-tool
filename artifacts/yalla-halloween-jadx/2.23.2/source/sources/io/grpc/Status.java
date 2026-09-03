package io.grpc;

import com.google.common.base.OooOO0;
import com.google.common.base.Oooo000;
import com.google.common.base.o000000;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;

/* JADX INFO: loaded from: classes5.dex */
@CheckReturnValue
@Immutable
public final class Status {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final Status f32471OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final List<Status> f32472OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final Status f32473OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final Status f32474OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final Status f32475OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final Status f32476OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final Status f32477OooOO0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Code f32478OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f32479OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Throwable f32480OooO0OO;

    public enum Code {
        OK(0),
        CANCELLED(1),
        UNKNOWN(2),
        INVALID_ARGUMENT(3),
        DEADLINE_EXCEEDED(4),
        NOT_FOUND(5),
        ALREADY_EXISTS(6),
        PERMISSION_DENIED(7),
        RESOURCE_EXHAUSTED(8),
        FAILED_PRECONDITION(9),
        ABORTED(10),
        OUT_OF_RANGE(11),
        UNIMPLEMENTED(12),
        INTERNAL(13),
        UNAVAILABLE(14),
        DATA_LOSS(15),
        UNAUTHENTICATED(16);

        private final int value;
        private final byte[] valueAscii;

        Code(int i) {
            this.value = i;
            this.valueAscii = Integer.toString(i).getBytes(OooOO0.f18590OooO00o);
        }

        public final Status OooO00o() {
            return Status.f32472OooO0Oo.get(this.value);
        }

        public final int OooO0O0() {
            return this.value;
        }
    }

    public static final class OooO00o implements OooO0OO.InterfaceC0379OooO0OO<Status> {
    }

    public static final class OooO0O0 implements OooO0OO.InterfaceC0379OooO0OO<String> {
    }

    static {
        Boolean.parseBoolean(System.getProperty("io.grpc.Status.failOnEqualsForTest", "false"));
        TreeMap treeMap = new TreeMap();
        for (Code code : Code.values()) {
            Status status = (Status) treeMap.put(Integer.valueOf(code.OooO0O0()), new Status(code, null, null));
            if (status != null) {
                throw new IllegalStateException("Code value duplication between " + status.f32478OooO00o.name() + " & " + code.name());
            }
        }
        f32472OooO0Oo = Collections.unmodifiableList(new ArrayList(treeMap.values()));
        Code.OK.OooO00o();
        f32474OooO0o0 = Code.CANCELLED.OooO00o();
        f32473OooO0o = Code.UNKNOWN.OooO00o();
        Code.INVALID_ARGUMENT.OooO00o();
        Code.DEADLINE_EXCEEDED.OooO00o();
        Code.NOT_FOUND.OooO00o();
        Code.ALREADY_EXISTS.OooO00o();
        f32475OooO0oO = Code.PERMISSION_DENIED.OooO00o();
        Code.UNAUTHENTICATED.OooO00o();
        f32476OooO0oo = Code.RESOURCE_EXHAUSTED.OooO00o();
        Code.FAILED_PRECONDITION.OooO00o();
        Code.ABORTED.OooO00o();
        Code.OUT_OF_RANGE.OooO00o();
        Code.UNIMPLEMENTED.OooO00o();
        f32471OooO = Code.INTERNAL.OooO00o();
        f32477OooOO0 = Code.UNAVAILABLE.OooO00o();
        Code.DATA_LOSS.OooO00o();
        new OooO0OO.OooO0O0("grpc-status", new OooO00o());
        new OooO0OO.OooO0O0("grpc-message", new OooO0O0());
    }

    public Status(Code code, @Nullable String str, @Nullable Throwable th) {
        if (code == null) {
            throw new NullPointerException("code");
        }
        this.f32478OooO00o = code;
        this.f32479OooO0O0 = str;
        this.f32480OooO0OO = th;
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final String toString() {
        Oooo000.OooO00o oooO00oOooO0O0 = Oooo000.OooO0O0(this);
        oooO00oOooO0O0.OooO00o(this.f32478OooO00o.name(), "code");
        oooO00oOooO0O0.OooO00o(this.f32479OooO0O0, "description");
        Throwable th = this.f32480OooO0OO;
        Object string = th;
        if (th != null) {
            Object obj = o000000.f18607OooO00o;
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            string = stringWriter.toString();
        }
        oooO00oOooO0O0.OooO00o(string, "cause");
        return oooO00oOooO0O0.toString();
    }
}
