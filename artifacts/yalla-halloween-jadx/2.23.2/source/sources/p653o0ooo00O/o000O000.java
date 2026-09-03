package p653o0ooo00O;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p641o0ooOO0o.o00OO00O;
import p641o0ooOO0o.o0oO0O0o;
import p648o0ooOoo.oO000o00;
import p652o0ooo000.o0000;
import p652o0ooo000.o0000O00;
import p657o0ooo0o0.o000O0o;

/* JADX INFO: loaded from: classes5.dex */
public final class o000O000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f59373OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f59374OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final o0000 f59375OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final o000 f59376OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final ConcurrentLinkedQueue<o0000O0O> f59377OooO0o0;

    public o000O000(@NotNull o0000O00 taskRunner, long j, @NotNull TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        this.f59373OooO00o = 5;
        this.f59374OooO0O0 = timeUnit.toNanos(j);
        this.f59375OooO0OO = taskRunner.OooO0o();
        this.f59376OooO0Oo = new o000(this, Intrinsics.stringPlus(oO000o00.f58130OooO0oO, " ConnectionPool"));
        this.f59377OooO0o0 = new ConcurrentLinkedQueue<>();
        if (!(j > 0)) {
            throw new IllegalArgumentException(Intrinsics.stringPlus("keepAliveDuration <= 0: ", Long.valueOf(j)).toString());
        }
    }

    public final boolean OooO00o(@NotNull o00OO00O address, @NotNull o0000O0 call, @Nullable List<o0oO0O0o> list, boolean z) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(call, "call");
        Iterator<o0000O0O> it = this.f59377OooO0o0.iterator();
        while (true) {
            if (!it.hasNext()) {
                return false;
            }
            o0000O0O connection = it.next();
            Intrinsics.checkNotNullExpressionValue(connection, "connection");
            synchronized (connection) {
                if (z) {
                    if (!(connection.f59350OooO0oO != null)) {
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
    }

    public final int OooO0O0(o0000O0O o0000o0o2, long j) {
        byte[] bArr = oO000o00.f58124OooO00o;
        ArrayList arrayList = o0000o0o2.f59358OooOOOo;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                String str = "A connection to " + o0000o0o2.f59345OooO0O0.f57962OooO00o.f57743OooO + " was leaked. Did you forget to close a response body?";
                o000O0o o000o0o2 = o000O0o.f59618OooO00o;
                o000O0o.f59618OooO00o.OooOO0O(((o0000O0.OooO0O0) reference).f59325OooO00o, str);
                arrayList.remove(i);
                o0000o0o2.f59352OooOO0 = true;
                if (arrayList.isEmpty()) {
                    o0000o0o2.f59359OooOOo0 = j - this.f59374OooO0O0;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
