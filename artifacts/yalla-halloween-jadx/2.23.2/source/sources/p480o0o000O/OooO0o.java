package p480o0o000O;

import java.io.IOException;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p641o0ooOO0o.o00OO;
import p641o0ooOO0o.o00OOO00;
import p641o0ooOO0o.o0O00O0o;
import p641o0ooOO0o.o0O00o00;
import p641o0ooOO0o.o0OoO00O;
import p653o0ooo00O.o0000O0;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0o implements o00OOO00 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooOOO f48389OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ HashMap<String, Boolean> f48390OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o0O00O0o.OooO00o f48391OooO0o0;

    public OooO0o(OooOOO oooOOO, o0O00O0o.OooO00o oooO00o, HashMap<String, Boolean> map) {
        this.f48389OooO0Oo = oooOOO;
        this.f48391OooO0o0 = oooO00o;
        this.f48390OooO0o = map;
    }

    @Override // p641o0ooOO0o.o00OOO00
    public final void onFailure(@NotNull o00OO call, @NotNull IOException e) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(e, "e");
        OooOOO oooOOO = this.f48389OooO0Oo;
        if (oooOOO != null) {
            o0O00O0o.OooO00o oooO00o = this.f48391OooO0o0;
            HashMap<String, Boolean> map = this.f48390OooO0o;
            if (((o0000O0) call).f59319OooOOoo) {
                return;
            }
            o0OoO00O o0ooo00o2 = OooOO0.f48392OooO00o;
            OooOO0.OooO00o(oooO00o, map, oooOOO, -1, e.getMessage());
        }
    }

    @Override // p641o0ooOO0o.o00OOO00
    public final void onResponse(@NotNull o00OO call, @NotNull o0O00o00 response) throws IOException {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
        OooOOO oooOOO = this.f48389OooO0Oo;
        if (oooOOO != null) {
            o0O00O0o.OooO00o oooO00o = this.f48391OooO0o0;
            HashMap<String, Boolean> map = this.f48390OooO0o;
            if (((o0000O0) call).f59319OooOOoo) {
                return;
            }
            if (response.OooO0oO()) {
                try {
                    oooOOO.OooO0OO(response);
                } catch (Exception unused) {
                    oooOOO.OooO00o();
                }
            } else {
                int i = response.f57850OooO0oO;
                if (i >= 600) {
                    oooOOO.OooO0O0(i, response);
                } else {
                    o0OoO00O o0ooo00o2 = OooOO0.f48392OooO00o;
                    OooOO0.OooO00o(oooO00o, map, oooOOO, i, response.f57848OooO0o);
                }
            }
        }
    }
}
