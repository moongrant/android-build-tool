package p646o0ooOoo;

import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.connection.RouteException;
import org.jetbrains.annotations.NotNull;
import p634o0ooO0oO.o00OOO00;
import p634o0ooO0oO.o00OOOO0;
import p634o0ooO0oO.o0oOOo;
import p647o0ooOooo.nc;

/* JADX INFO: loaded from: classes5.dex */
public final class oO000O0O implements o00OOO00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final oO000O0O f59615OooO00o = new oO000O0O();

    @Override // p634o0ooO0oO.o00OOO00
    @NotNull
    public final o0oOOo intercept(@NotNull o00OOO00.OooO00o chain) throws IOException {
        Intrinsics.checkNotNullParameter(chain, "chain");
        nc chain2 = (nc) chain;
        oO0Oo0oo oo0oo0oo = chain2.f59715OooO00o;
        oo0oo0oo.getClass();
        Intrinsics.checkNotNullParameter(chain2, "chain");
        synchronized (oo0oo0oo) {
            if (!oo0oo0oo.f59665OooOOo) {
                throw new IllegalStateException("released".toString());
            }
            if (!(!oo0oo0oo.f59666OooOOo0)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            if (!(!oo0oo0oo.f59664OooOOOo)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            Unit unit = Unit.INSTANCE;
        }
        oO0OoOO0 oo0oooo0 = oo0oo0oo.f59660OooOO0o;
        Intrinsics.checkNotNull(oo0oooo0);
        o00OOOO0 client = oo0oo0oo.f59653OooO0Oo;
        oo0oooo0.getClass();
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(chain2, "chain");
        try {
            oO0o0o oo0o0o = new oO0o0o(oo0oo0oo, oo0oo0oo.f59657OooO0oo, oo0oooo0, oo0oooo0.OooO00o(chain2.f59719OooO0o, chain2.f59721OooO0oO, chain2.f59722OooO0oo, client.f57281OooOooO, client.f57255OooO, !Intrinsics.areEqual(chain2.f59720OooO0o0.f57314OooO0O0, "GET")).OooOO0O(client, chain2));
            oo0oo0oo.f59663OooOOOO = oo0o0o;
            oo0oo0oo.f59669OooOo00 = oo0o0o;
            synchronized (oo0oo0oo) {
                oo0oo0oo.f59664OooOOOo = true;
                oo0oo0oo.f59666OooOOo0 = true;
            }
            if (oo0oo0oo.f59667OooOOoo) {
                throw new IOException("Canceled");
            }
            return nc.OooO0Oo(chain2, 0, oo0o0o, null, 61).OooO0O0(chain2.f59720OooO0o0);
        } catch (IOException e) {
            oo0oooo0.OooO0OO(e);
            throw new RouteException(e);
        } catch (RouteException e2) {
            oo0oooo0.OooO0OO(e2.f60853OooO0o0);
            throw e2;
        }
    }
}
