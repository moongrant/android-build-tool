package p663o0oooO0;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p660o0ooo0o0.o000O;
import p660o0ooo0o0.o00OO000;
import p660o0ooo0o0.o00Oo00;
import p660o0ooo0o0.o0O0ooO;
import p660o0ooo0o0.oo0o0O0;

/* JADX INFO: loaded from: classes3.dex */
public final class o00OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public List<? extends Proxy> f51766OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f51767OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public List<? extends InetSocketAddress> f51768OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final List<o00Oo00> f51769OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final oo0O f51770OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o000O f51771OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final o0O0ooO f51772OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final oo0o0O0 f51773OooO0oo;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f51774OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public final List<o00Oo00> f51775OooO0O0;

        public OooO00o(@NotNull List<o00Oo00> routes) {
            Intrinsics.checkNotNullParameter(routes, "routes");
            this.f51775OooO0O0 = routes;
        }

        public final boolean OooO00o() {
            return this.f51774OooO00o < this.f51775OooO0O0.size();
        }

        @NotNull
        public final o00Oo00 OooO0O0() {
            if (!OooO00o()) {
                throw new NoSuchElementException();
            }
            List<o00Oo00> list = this.f51775OooO0O0;
            int i = this.f51774OooO00o;
            this.f51774OooO00o = i + 1;
            return list.get(i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o00OO(@NotNull o000O address, @NotNull oo0O routeDatabase, @NotNull o0O0ooO call, @NotNull oo0o0O0 eventListener) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(routeDatabase, "routeDatabase");
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        this.f51771OooO0o0 = address;
        this.f51770OooO0o = routeDatabase;
        this.f51772OooO0oO = call;
        this.f51773OooO0oo = eventListener;
        this.f51766OooO00o = CollectionsKt.emptyList();
        this.f51768OooO0OO = CollectionsKt.emptyList();
        this.f51769OooO0Oo = new ArrayList();
        o00OO000 o00oo001 = address.f51218OooO00o;
        o00OOO00 o00ooo01 = new o00OOO00(this, address.f51226OooOO0, o00oo001);
        eventListener.proxySelectStart(call, o00oo001);
        List<? extends Proxy> listInvoke = o00ooo01.invoke();
        this.f51766OooO00o = listInvoke;
        this.f51767OooO0O0 = 0;
        eventListener.proxySelectEnd(call, o00oo001, listInvoke);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<o0ooo0o0.o00Oo00>] */
    public final boolean OooO00o() {
        return OooO0O0() || (this.f51769OooO0Oo.isEmpty() ^ true);
    }

    public final boolean OooO0O0() {
        return this.f51767OooO0O0 < this.f51766OooO00o.size();
    }
}
