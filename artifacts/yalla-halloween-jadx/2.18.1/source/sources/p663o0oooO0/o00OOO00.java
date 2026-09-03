package p663o0oooO0;

import java.net.Proxy;
import java.net.URI;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p660o0ooo0o0.o00OO000;

/* JADX INFO: loaded from: classes3.dex */
public final class o00OOO00 extends Lambda implements Function0<List<? extends Proxy>> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o00OO f51801Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Proxy f51802Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ o00OO000 f51803Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OOO00(o00OO o00oo2, Proxy proxy, o00OO000 o00oo001) {
        super(0);
        this.f51801Oooo0o = o00oo2;
        this.f51802Oooo0oO = proxy;
        this.f51803Oooo0oo = o00oo001;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final List<? extends Proxy> invoke() {
        Proxy proxy = this.f51802Oooo0oO;
        if (proxy != null) {
            return CollectionsKt.listOf(proxy);
        }
        URI uriOooOO0o = this.f51803Oooo0oo.OooOO0o();
        if (uriOooOO0o.getHost() == null) {
            return p659o0ooo0o.o00OOO00.OooOOO0(Proxy.NO_PROXY);
        }
        List<Proxy> listSelect = this.f51801Oooo0o.f51771OooO0o0.f51227OooOO0O.select(uriOooOO0o);
        return listSelect == null || listSelect.isEmpty() ? p659o0ooo0o.o00OOO00.OooOOO0(Proxy.NO_PROXY) : p659o0ooo0o.o00OOO00.OooOoO(listSelect);
    }
}
