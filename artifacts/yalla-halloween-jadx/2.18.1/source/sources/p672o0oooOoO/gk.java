package p672o0oooOoO;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import p660o0ooo0o0.o00O;
import p660o0ooo0o0.o00OOO00;
import p660o0ooo0o0.o00OOOO0;
import p660o0ooo0o0.o00oOoo;
import p660o0ooo0o0.o0O0ooO;
import p663o0oooO0.o00O0OO0;

/* JADX INFO: loaded from: classes3.dex */
public final class gk implements o00oOoo {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ fk f51994Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o00OOO00 f51995Oooo0oO;

    public gk(fk fkVar, o00OOO00 o00ooo01) {
        this.f51994Oooo0o = fkVar;
        this.f51995Oooo0oO = o00ooo01;
    }

    @Override // p660o0ooo0o0.o00oOoo
    public final void onFailure(@NotNull o0O0ooO call, @NotNull IOException e) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(e, "e");
        this.f51994Oooo0o.OooO0oo(e, null);
    }

    @Override // p660o0ooo0o0.o00oOoo
    public final void onResponse(@NotNull o0O0ooO call, @NotNull o00OOOO0 response) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
        o00O0OO0 o00o0oo1 = response.f51449OoooOoO;
        try {
            this.f51994Oooo0o.OooO0o(response, o00o0oo1);
            Intrinsics.checkNotNull(o00o0oo1);
            fk.OooO0OO OooO0OO2 = o00o0oo1.OooO0OO();
            o00O responseHeaders = response.f51444OoooO0O;
            Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
            int length = responseHeaders.f51230Oooo0o.length / 2;
            int i = 0;
            int i2 = 0;
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            Integer intOrNull = null;
            Integer intOrNull2 = null;
            boolean z4 = false;
            while (i2 < length) {
                if (StringsKt.OooO(responseHeaders.OooO0O0(i2), "Sec-WebSocket-Extensions")) {
                    String strOooO0o0 = responseHeaders.OooO0o0(i2);
                    int i3 = 0;
                    while (i3 < strOooO0o0.length()) {
                        int iOooO0oo = p659o0ooo0o.o00OOO00.OooO0oo(strOooO0o0, ',', i3, i, 4);
                        int iOooO0o = p659o0ooo0o.o00OOO00.OooO0o(strOooO0o0, ';', i3, iOooO0oo);
                        String strOooOoo0 = p659o0ooo0o.o00OOO00.OooOoo0(strOooO0o0, i3, iOooO0o);
                        int i4 = iOooO0o + 1;
                        if (StringsKt.OooO(strOooOoo0, "permessage-deflate")) {
                            i3 = i4;
                            if (z) {
                                z4 = true;
                            }
                            while (i3 < iOooO0oo) {
                                int iOooO0o2 = p659o0ooo0o.o00OOO00.OooO0o(strOooO0o0, ';', i3, iOooO0oo);
                                int iOooO0o3 = p659o0ooo0o.o00OOO00.OooO0o(strOooO0o0, '=', i3, iOooO0o2);
                                String strOooOoo1 = p659o0ooo0o.o00OOO00.OooOoo0(strOooO0o0, i3, iOooO0o3);
                                String strRemoveSurrounding = iOooO0o3 < iOooO0o2 ? StringsKt__StringsKt.removeSurrounding(p659o0ooo0o.o00OOO00.OooOoo0(strOooO0o0, iOooO0o3 + 1, iOooO0o2), (CharSequence) "\"") : null;
                                i3 = iOooO0o2 + 1;
                                if (StringsKt.OooO(strOooOoo1, "client_max_window_bits")) {
                                    if (intOrNull != null) {
                                        z4 = true;
                                    }
                                    intOrNull = strRemoveSurrounding != null ? StringsKt.toIntOrNull(strRemoveSurrounding) : null;
                                    if (intOrNull == null) {
                                        z4 = true;
                                    }
                                } else if (StringsKt.OooO(strOooOoo1, "client_no_context_takeover")) {
                                    if (z2) {
                                        z4 = true;
                                    }
                                    if (strRemoveSurrounding != null) {
                                        z4 = true;
                                    }
                                    z2 = true;
                                } else if (StringsKt.OooO(strOooOoo1, "server_max_window_bits")) {
                                    if (intOrNull2 != null) {
                                        z4 = true;
                                    }
                                    intOrNull2 = strRemoveSurrounding != null ? StringsKt.toIntOrNull(strRemoveSurrounding) : null;
                                    if (intOrNull2 == null) {
                                        z4 = true;
                                    }
                                } else if (StringsKt.OooO(strOooOoo1, "server_no_context_takeover")) {
                                    if (z3) {
                                        z4 = true;
                                    }
                                    if (strRemoveSurrounding != null) {
                                        z4 = true;
                                    }
                                    z3 = true;
                                } else {
                                    z4 = true;
                                }
                            }
                            i = 0;
                            z = true;
                        } else {
                            i3 = i4;
                            i = 0;
                            z4 = true;
                        }
                    }
                }
                i2++;
                i = 0;
            }
            this.f51994Oooo0o.f51980OooOo0O = new hk(z, intOrNull, z2, intOrNull2, z3, z4);
            if (!(!z4 && intOrNull == null && (intOrNull2 == null || (8 <= (iIntValue = intOrNull2.intValue()) && 15 >= iIntValue)))) {
                synchronized (this.f51994Oooo0o) {
                    this.f51994Oooo0o.f51968OooOO0.clear();
                    this.f51994Oooo0o.OooO0oO(1010, "unexpected Sec-WebSocket-Extensions in response header");
                }
            }
            try {
                this.f51994Oooo0o.OooO(p659o0ooo0o.o00OOO00.f51189OooO0oO + " WebSocket " + this.f51995Oooo0oO.f51425OooO0O0.OooOO0O(), OooO0OO2);
                fk fkVar = this.f51994Oooo0o;
                fkVar.f51977OooOOoo.OooO0o(fkVar, response);
                this.f51994Oooo0o.OooOO0();
            } catch (Exception e) {
                this.f51994Oooo0o.OooO0oo(e, null);
            }
        } catch (IOException e2) {
            if (o00o0oo1 != null) {
                o00o0oo1.OooO00o(-1L, true, true, null);
            }
            this.f51994Oooo0o.OooO0oo(e2, response);
            p659o0ooo0o.o00OOO00.OooO0Oo(response);
        }
    }
}
