package io.grpc;

import com.google.common.base.OooOo;
import com.google.common.base.o000OOo;
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
    public static final Status f33006OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final List<Status> f33007OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final Status f33008OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final Status f33009OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final Status f33010OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final Status f33011OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final Status f33012OooOO0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Code f33013OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f33014OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Throwable f33015OooO0OO;

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
            this.valueAscii = Integer.toString(i).getBytes(com.google.common.base.OooO.f19057OooO00o);
        }

        public final Status OooO00o() {
            return Status.f33007OooO0Oo.get(this.value);
        }

        public final int OooO0O0() {
            return this.value;
        }
    }

    public static final class OooO00o implements OooO0OO.InterfaceC0380OooO0OO<Status> {
    }

    public static final class OooO0O0 implements OooO0OO.InterfaceC0380OooO0OO<String> {
    }

    static {
        Boolean.parseBoolean(System.getProperty("io.grpc.Status.failOnEqualsForTest", "false"));
        TreeMap treeMap = new TreeMap();
        for (Code code : Code.values()) {
            Status status = (Status) treeMap.put(Integer.valueOf(code.OooO0O0()), new Status(code, null, null));
            if (status != null) {
                throw new IllegalStateException("Code value duplication between " + status.f33013OooO00o.name() + " & " + code.name());
            }
        }
        f33007OooO0Oo = Collections.unmodifiableList(new ArrayList(treeMap.values()));
        Code.OK.OooO00o();
        f33009OooO0o0 = Code.CANCELLED.OooO00o();
        f33008OooO0o = Code.UNKNOWN.OooO00o();
        Code.INVALID_ARGUMENT.OooO00o();
        Code.DEADLINE_EXCEEDED.OooO00o();
        Code.NOT_FOUND.OooO00o();
        Code.ALREADY_EXISTS.OooO00o();
        f33010OooO0oO = Code.PERMISSION_DENIED.OooO00o();
        Code.UNAUTHENTICATED.OooO00o();
        f33011OooO0oo = Code.RESOURCE_EXHAUSTED.OooO00o();
        Code.FAILED_PRECONDITION.OooO00o();
        Code.ABORTED.OooO00o();
        Code.OUT_OF_RANGE.OooO00o();
        Code.UNIMPLEMENTED.OooO00o();
        f33006OooO = Code.INTERNAL.OooO00o();
        f33012OooOO0 = Code.UNAVAILABLE.OooO00o();
        Code.DATA_LOSS.OooO00o();
        new OooO0OO.OooO0O0("grpc-status", new OooO00o());
        new OooO0OO.OooO0O0("grpc-message", new OooO0O0());
    }

    public Status(Code code, @Nullable String str, @Nullable Throwable th) {
        if (code == null) {
            throw new NullPointerException("code");
        }
        this.f33013OooO00o = code;
        this.f33014OooO0O0 = str;
        this.f33015OooO0OO = th;
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final String toString() {
        OooOo.OooO00o oooO00oOooO0O0 = OooOo.OooO0O0(this);
        oooO00oOooO0O0.OooO00o(this.f33013OooO00o.name(), "code");
        oooO00oOooO0O0.OooO00o(this.f33014OooO0O0, "description");
        Throwable th = this.f33015OooO0OO;
        Object string = th;
        if (th != null) {
            Object obj = o000OOo.f19084OooO00o;
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            string = stringWriter.toString();
        }
        oooO00oOooO0O0.OooO00o(string, "cause");
        return oooO00oOooO0O0.toString();
    }
}
