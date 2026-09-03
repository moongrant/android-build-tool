package p646o0ooOoo;

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
import p634o0ooO0oO.o00O00;
import p634o0ooO0oO.o0O00000;
import p635o0ooO0oo.o0O000o0;
import p639o0ooOO0o.o00OO00O;
import p639o0ooOO0o.o00OO0O0;
import p652o0ooo00o.o000O0O0;

/* JADX INFO: loaded from: classes5.dex */
public final class oO000o00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f59635OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f59636OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final o00OO00O f59637OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final oO000Oo f59638OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final ConcurrentLinkedQueue<oO000OOo> f59639OooO0o0;

    public oO000o00(@NotNull o00OO0O0 taskRunner, long j, @NotNull TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        this.f59635OooO00o = 5;
        this.f59636OooO0O0 = timeUnit.toNanos(j);
        this.f59637OooO0OO = taskRunner.OooO0o();
        this.f59638OooO0Oo = new oO000Oo(this, Intrinsics.stringPlus(o0O000o0.f57392OooO0oO, " ConnectionPool"));
        this.f59639OooO0o0 = new ConcurrentLinkedQueue<>();
        if (!(j > 0)) {
            throw new IllegalArgumentException(Intrinsics.stringPlus("keepAliveDuration <= 0: ", Long.valueOf(j)).toString());
        }
    }

    public final boolean OooO00o(@NotNull o00O00 address, @NotNull oO0Oo0oo call, @Nullable List<o0O00000> list, boolean z) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(call, "call");
        Iterator<oO000OOo> it = this.f59639OooO0o0.iterator();
        while (true) {
            if (!it.hasNext()) {
                return false;
            }
            oO000OOo connection = it.next();
            Intrinsics.checkNotNullExpressionValue(connection, "connection");
            synchronized (connection) {
                if (z) {
                    if (!(connection.f59622OooO0oO != null)) {
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

    public final int OooO0O0(oO000OOo oo000ooo, long j) {
        byte[] bArr = o0O000o0.f57386OooO00o;
        ArrayList arrayList = oo000ooo.f59630OooOOOo;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                String str = "A connection to " + oo000ooo.f59617OooO0O0.f57326OooO00o.f57144OooO + " was leaked. Did you forget to close a response body?";
                o000O0O0 o000o0o1 = o000O0O0.f60031OooO00o;
                o000O0O0.f60031OooO00o.OooOO0O(((oO0Oo0oo.OooO0O0) reference).f59673OooO00o, str);
                arrayList.remove(i);
                oo000ooo.f59624OooOO0 = true;
                if (arrayList.isEmpty()) {
                    oo000ooo.f59631OooOOo0 = j - this.f59636OooO0O0;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
