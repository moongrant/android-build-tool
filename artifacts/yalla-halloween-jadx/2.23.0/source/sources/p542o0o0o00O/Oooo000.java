package p542o0o0o00O;

import java.io.IOException;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p634o0ooO0oO.o00O00o0;
import p634o0ooO0oO.o00OOOO0;
import p634o0ooO0oO.o00OOOOo;
import p634o0ooO0oO.o0oOOo;
import p634o0ooO0oO.oo00o;
import p646o0ooOoo.oO0Oo0oo;

/* JADX INFO: loaded from: classes4.dex */
public final class Oooo000 implements oo00o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00Oo0 f55781OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ HashMap<String, Boolean> f55782OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o00OOOOo.OooO00o f55783OooO0o0;

    public Oooo000(o00Oo0 o00oo1, o00OOOOo.OooO00o oooO00o, HashMap<String, Boolean> map) {
        this.f55781OooO0Oo = o00oo1;
        this.f55783OooO0o0 = oooO00o;
        this.f55782OooO0o = map;
    }

    @Override // p634o0ooO0oO.oo00o
    public final void onFailure(@NotNull o00O00o0 call, @NotNull IOException e) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(e, "e");
        o00Oo0 o00oo1 = this.f55781OooO0Oo;
        if (o00oo1 != null) {
            o00OOOOo.OooO00o oooO00o = this.f55783OooO0o0;
            HashMap<String, Boolean> map = this.f55782OooO0o;
            if (((oO0Oo0oo) call).f59667OooOOoo) {
                return;
            }
            o00OOOO0 o00oooo1 = o000oOoO.f55784OooO00o;
            o000oOoO.OooO00o(oooO00o, map, o00oo1, -1, e.getMessage());
        }
    }

    @Override // p634o0ooO0oO.oo00o
    public final void onResponse(@NotNull o00O00o0 call, @NotNull o0oOOo response) throws IOException {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
        o00Oo0 o00oo1 = this.f55781OooO0Oo;
        if (o00oo1 != null) {
            o00OOOOo.OooO00o oooO00o = this.f55783OooO0o0;
            HashMap<String, Boolean> map = this.f55782OooO0o;
            if (((oO0Oo0oo) call).f59667OooOOoo) {
                return;
            }
            if (response.OooO0oO()) {
                try {
                    o00oo1.OooO0OO(response);
                } catch (Exception unused) {
                    o00oo1.OooO00o();
                }
            } else {
                int i = response.f57345OooO0oO;
                if (i >= 600) {
                    o00oo1.OooO0O0(i, response);
                } else {
                    o00OOOO0 o00oooo1 = o000oOoO.f55784OooO00o;
                    o000oOoO.OooO00o(oooO00o, map, o00oo1, i, response.f57343OooO0o);
                }
            }
        }
    }
}
