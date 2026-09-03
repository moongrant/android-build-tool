package p531o0o0OOO0;

import java.io.IOException;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p612o0oo0OOO.oOo0000O;
import p660o0ooo0o0.o00OOO00;
import p660o0ooo0o0.o00OOOO0;
import p660o0ooo0o0.o0O0ooO;
import p663o0oooO0.o00O0OO;

/* JADX INFO: loaded from: classes2.dex */
public final class o00oOoo implements p660o0ooo0o0.o00oOoo {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ oOo0000O f43412Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o00OOO00.OooO00o f43413Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ HashMap<String, Boolean> f43414Oooo0oo;

    public o00oOoo(oOo0000O ooo0000o, o00OOO00.OooO00o oooO00o, HashMap<String, Boolean> map) {
        this.f43412Oooo0o = ooo0000o;
        this.f43413Oooo0oO = oooO00o;
        this.f43414Oooo0oo = map;
    }

    @Override // p660o0ooo0o0.o00oOoo
    public final void onFailure(@NotNull o0O0ooO call, @NotNull IOException e) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(e, "e");
        oOo0000O ooo0000o = this.f43412Oooo0o;
        if (ooo0000o != null) {
            o00OOO00.OooO00o oooO00o = this.f43413Oooo0oO;
            HashMap<String, Boolean> map = this.f43414Oooo0oo;
            if (((o00O0OO) call).f51737OoooOo0) {
                ooo0000o.onCancel();
            } else {
                o00O000 o00o001 = o00O000.f43398OooO00o;
                o00O000.OooO00o(oooO00o, map, ooo0000o, -1, e.getMessage());
            }
            ooo0000o.OooO00o();
        }
    }

    @Override // p660o0ooo0o0.o00oOoo
    public final void onResponse(@NotNull o0O0ooO call, @NotNull o00OOOO0 response) throws IOException {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
        oOo0000O ooo0000o = this.f43412Oooo0o;
        if (ooo0000o != null) {
            o00OOO00.OooO00o oooO00o = this.f43413Oooo0oO;
            HashMap<String, Boolean> map = this.f43414Oooo0oo;
            if (((o00O0OO) call).f51737OoooOo0) {
                ooo0000o.onCancel();
            } else if (response.OooO0Oo()) {
                try {
                    ooo0000o.OooO0O0(response);
                } catch (Exception e) {
                    e.getMessage();
                    ooo0000o.onError(-2);
                }
            } else {
                int i = response.f51443OoooO00;
                if (i < 600) {
                    o00O000 o00o001 = o00O000.f43398OooO00o;
                    o00O000.OooO00o(oooO00o, map, ooo0000o, i, response.f51437Oooo);
                } else {
                    ooo0000o.onError(i);
                }
            }
            ooo0000o.OooO00o();
        }
    }
}
