package p663o0oooO0;

import androidx.viewpager2.adapter.OooO00o;
import java.lang.ref.Reference;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p058o0000OoO.OooO;
import p659o0ooo0o.o00OOO00;
import p660o0ooo0o0.o000O;
import p660o0ooo0o0.o00Oo00;
import p664o0oooO00.o000000;
import p664o0oooO00.o000000O;
import p667o0oooOO.s;

/* JADX INFO: loaded from: classes3.dex */
public final class o00OO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f51796OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o000000 f51797OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o00OO0O0 f51798OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final ConcurrentLinkedQueue<o00OO00O> f51799OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f51800OooO0o0;

    public o00OO0OO(@NotNull o000000O taskRunner, long j) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        this.f51800OooO0o0 = 5;
        this.f51796OooO00o = timeUnit.toNanos(j);
        this.f51797OooO0O0 = taskRunner.OooO0o();
        this.f51798OooO0OO = new o00OO0O0(this, OooO.OooO00o(new StringBuilder(), o00OOO00.f51189OooO0oO, " ConnectionPool"));
        this.f51799OooO0Oo = new ConcurrentLinkedQueue<>();
        if (!(j > 0)) {
            throw new IllegalArgumentException(OooO00o.OooO00o("keepAliveDuration <= 0: ", j).toString());
        }
    }

    public final boolean OooO00o(@NotNull o000O address, @NotNull o00O0OO call, @Nullable List<o00Oo00> list, boolean z) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(call, "call");
        for (o00OO00O connection : this.f51799OooO0Oo) {
            Intrinsics.checkNotNullExpressionValue(connection, "connection");
            synchronized (connection) {
                if (z) {
                    if (!connection.OooOO0O()) {
                    }
                    Unit unit = Unit.INSTANCE;
                }
                if (connection.OooO(address, list)) {
                    call.OooO0Oo(connection);
                    return true;
                }
                Unit unit2 = Unit.INSTANCE;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List, java.util.List<java.lang.ref.Reference<o0oooO0.o00O0OO>>] */
    public final int OooO0O0(o00OO00O o00oo00o, long j) {
        byte[] bArr = o00OOO00.f51183OooO00o;
        ?? r0 = o00oo00o.f51792OooOOOO;
        int i = 0;
        while (i < r0.size()) {
            Reference reference = (Reference) r0.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("A connection to ");
                sbOooO0o0.append(o00oo00o.f51794OooOOo0.f51473OooO00o.f51218OooO00o);
                sbOooO0o0.append(" was leaked. ");
                sbOooO0o0.append("Did you forget to close a response body?");
                String string = sbOooO0o0.toString();
                s.OooO00o oooO00o = s.f51921OooO0OO;
                s.f51919OooO00o.OooOO0O(string, ((o00O0OO.OooO0O0) reference).f51747OooO00o);
                r0.remove(i);
                o00oo00o.f51779OooO = true;
                if (r0.isEmpty()) {
                    o00oo00o.f51793OooOOOo = j - this.f51796OooO00o;
                    return 0;
                }
            }
        }
        return r0.size();
    }
}
