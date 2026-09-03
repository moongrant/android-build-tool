package io.grpc;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;

/* JADX INFO: loaded from: classes3.dex */
@CheckReturnValue
@Immutable
public final class Status {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final Status f26379OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final List<Status> f26380OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final Status f26381OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final Status f26382OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final Status f26383OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final Status f26384OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final Status f26385OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final Status f26386OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public static final OooOo00.OooOO0O<String> f26387OooOO0o;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Code f26388OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f26389OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Throwable f26390OooO0OO;

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
            this.valueAscii = Integer.toString(i).getBytes(o0OOOO0o.OooO0o.f38230OooO00o);
        }

        public final Status OooO00o() {
            return Status.f26380OooO0Oo.get(this.value);
        }

        public final int OooO0O0() {
            return this.value;
        }
    }

    public static final class OooO00o implements OooOo00.OooOO0O<Status> {
    }

    public static final class OooO0O0 implements OooOo00.OooOO0O<String> {
    }

    static {
        Boolean.parseBoolean(System.getProperty("io.grpc.Status.failOnEqualsForTest", "false"));
        TreeMap treeMap = new TreeMap();
        for (Code code2 : Code.values()) {
            Status status = (Status) treeMap.put(Integer.valueOf(code2.OooO0O0()), new Status(code2, null, null));
            if (status != null) {
                StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Code value duplication between ");
                sbOooO0o0.append(status.f26388OooO00o.name());
                sbOooO0o0.append(" & ");
                sbOooO0o0.append(code2.name());
                throw new IllegalStateException(sbOooO0o0.toString());
            }
        }
        f26380OooO0Oo = Collections.unmodifiableList(new ArrayList(treeMap.values()));
        Code.OK.OooO00o();
        f26382OooO0o0 = Code.CANCELLED.OooO00o();
        f26381OooO0o = Code.UNKNOWN.OooO00o();
        Code.INVALID_ARGUMENT.OooO00o();
        Code.DEADLINE_EXCEEDED.OooO00o();
        Code.NOT_FOUND.OooO00o();
        Code.ALREADY_EXISTS.OooO00o();
        f26383OooO0oO = Code.PERMISSION_DENIED.OooO00o();
        Code.UNAUTHENTICATED.OooO00o();
        f26384OooO0oo = Code.RESOURCE_EXHAUSTED.OooO00o();
        Code.FAILED_PRECONDITION.OooO00o();
        Code.ABORTED.OooO00o();
        Code.OUT_OF_RANGE.OooO00o();
        f26379OooO = Code.UNIMPLEMENTED.OooO00o();
        f26385OooOO0 = Code.INTERNAL.OooO00o();
        f26386OooOO0O = Code.UNAVAILABLE.OooO00o();
        Code.DATA_LOSS.OooO00o();
        OooOo00.OooO.OooO0O0("grpc-status", false, new OooO00o());
        OooO0O0 oooO0O0 = new OooO0O0();
        f26387OooOO0o = oooO0O0;
        OooOo00.OooO.OooO0O0("grpc-message", false, oooO0O0);
    }

    public Status(Code code2, @Nullable String str, @Nullable Throwable th) {
        o0OOOO0o.OooOOOO.OooOO0(code2, "code");
        this.f26388OooO00o = code2;
        this.f26389OooO0O0 = str;
        this.f26390OooO0OO = th;
    }

    public final StatusRuntimeException OooO00o() {
        return new StatusRuntimeException(this, null);
    }

    public final Status OooO0O0(Throwable th) {
        return o0OOOO0o.OooOOO.OooO00o(this.f26390OooO0OO, th) ? this : new Status(this.f26388OooO00o, this.f26389OooO0O0, th);
    }

    public final Status OooO0OO(String str) {
        return o0OOOO0o.OooOOO.OooO00o(this.f26389OooO0O0, str) ? this : new Status(this.f26388OooO00o, str, this.f26390OooO0OO);
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final String toString() {
        o0OOOO0o.OooOOO0.OooO00o oooO00oOooO0O0 = o0OOOO0o.OooOOO0.OooO0O0(this);
        oooO00oOooO0O0.OooO0OO("code", this.f26388OooO00o.name());
        oooO00oOooO0O0.OooO0OO("description", this.f26389OooO0O0);
        Throwable th = this.f26390OooO0OO;
        Object string = th;
        if (th != null) {
            Object obj = o0OOOO0o.o00O0O.f38248OooO00o;
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            string = stringWriter.toString();
        }
        oooO00oOooO0O0.OooO0OO("cause", string);
        return oooO00oOooO0O0.toString();
    }
}
