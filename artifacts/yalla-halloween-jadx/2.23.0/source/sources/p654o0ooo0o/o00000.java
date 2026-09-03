package p654o0ooo0o;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import p634o0ooO0oO.o00O00o0;
import p634o0ooO0oO.o00OOOOo;
import p634o0ooO0oO.o0oOOo;
import p634o0ooO0oO.oo00o;
import p634o0ooO0oO.oo0O;
import p635o0ooO0oo.o0O000o0;
import p646o0ooOoo.oO000Oo0;
import p646o0ooOoo.oO0o0o;

/* JADX INFO: loaded from: classes5.dex */
public final class o00000 implements oo00o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o000000O f60056OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o00OOOOo f60057OooO0o0;

    public o00000(o000000O o000000o2, o00OOOOo o00ooooo2) {
        this.f60056OooO0Oo = o000000o2;
        this.f60057OooO0o0 = o00ooooo2;
    }

    @Override // p634o0ooO0oO.oo00o
    public final void onFailure(@NotNull o00O00o0 call, @NotNull IOException e) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(e, "e");
        this.f60056OooO0Oo.OooO0oo(e, null);
    }

    @Override // p634o0ooO0oO.oo00o
    public final void onResponse(@NotNull o00O00o0 call, @NotNull o0oOOo response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
        oO0o0o oo0o0o = response.f57353OooOOOo;
        try {
            this.f60056OooO0Oo.OooO0oO(response, oo0o0o);
            Intrinsics.checkNotNull(oo0o0o);
            oO000Oo0 oo000oo0OooO0OO = oo0o0o.OooO0OO();
            oo0O responseHeaders = response.f57341OooO;
            Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
            int length = responseHeaders.f57369OooO0Oo.length / 2;
            int i = 0;
            int i2 = 0;
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            Integer num = null;
            Integer num2 = null;
            while (i2 < length) {
                int i3 = i2 + 1;
                if (StringsKt.OooOO0o(responseHeaders.OooO0OO(i2), "Sec-WebSocket-Extensions")) {
                    String strOooO0o0 = responseHeaders.OooO0o0(i2);
                    int i4 = i;
                    while (i4 < strOooO0o0.length()) {
                        int iOooO0oO = o0O000o0.OooO0oO(strOooO0o0, ',', i4, i, 4);
                        int iOooO0o = o0O000o0.OooO0o(strOooO0o0, ';', i4, iOooO0oO);
                        String strOooOoO = o0O000o0.OooOoO(i4, iOooO0o, strOooO0o0);
                        int i5 = iOooO0o + 1;
                        if (StringsKt.OooOO0o(strOooOoO, "permessage-deflate")) {
                            if (z) {
                                z4 = true;
                            }
                            i4 = i5;
                            while (i4 < iOooO0oO) {
                                int iOooO0o2 = o0O000o0.OooO0o(strOooO0o0, ';', i4, iOooO0oO);
                                int iOooO0o3 = o0O000o0.OooO0o(strOooO0o0, '=', i4, iOooO0o2);
                                String strOooOoO2 = o0O000o0.OooOoO(i4, iOooO0o3, strOooO0o0);
                                String strRemoveSurrounding = iOooO0o3 < iOooO0o2 ? StringsKt__StringsKt.removeSurrounding(o0O000o0.OooOoO(iOooO0o3 + 1, iOooO0o2, strOooO0o0), (CharSequence) "\"") : null;
                                i4 = iOooO0o2 + 1;
                                if (StringsKt.OooOO0o(strOooOoO2, "client_max_window_bits")) {
                                    if (num != null) {
                                        z4 = true;
                                    }
                                    Integer intOrNull = strRemoveSurrounding == null ? null : StringsKt.toIntOrNull(strRemoveSurrounding);
                                    num = intOrNull;
                                    if (intOrNull == null) {
                                        z4 = true;
                                    }
                                } else if (StringsKt.OooOO0o(strOooOoO2, "client_no_context_takeover")) {
                                    if (z2) {
                                        z4 = true;
                                    }
                                    if (strRemoveSurrounding != null) {
                                        z4 = true;
                                    }
                                    z2 = true;
                                } else if (StringsKt.OooOO0o(strOooOoO2, "server_max_window_bits")) {
                                    if (num2 != null) {
                                        z4 = true;
                                    }
                                    Integer intOrNull2 = strRemoveSurrounding == null ? null : StringsKt.toIntOrNull(strRemoveSurrounding);
                                    num2 = intOrNull2;
                                    if (intOrNull2 == null) {
                                        z4 = true;
                                    }
                                } else if (StringsKt.OooOO0o(strOooOoO2, "server_no_context_takeover")) {
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
                            z = true;
                        } else {
                            i4 = i5;
                            z4 = true;
                        }
                        i = 0;
                    }
                }
                i2 = i3;
                i = 0;
            }
            this.f60056OooO0Oo.f60069OooO0o0 = new o00000O(z, num, z2, num2, z3, z4);
            if (!(!z4 && num == null && (num2 == null || new IntRange(8, 15).contains(num2.intValue())))) {
                o000000O o000000o2 = this.f60056OooO0Oo;
                synchronized (o000000o2) {
                    o000000o2.f60078OooOOOo.clear();
                    o000000o2.close(1010, "unexpected Sec-WebSocket-Extensions in response header");
                }
            }
            try {
                this.f60056OooO0Oo.OooO(o0O000o0.f57392OooO0oO + " WebSocket " + this.f60057OooO0o0.f57313OooO00o.OooO(), oo000oo0OooO0OO);
                o000000O o000000o3 = this.f60056OooO0Oo;
                o000000o3.f60065OooO0O0.onOpen(o000000o3, response);
                this.f60056OooO0Oo.OooOO0();
            } catch (Exception e) {
                this.f60056OooO0Oo.OooO0oo(e, null);
            }
        } catch (IOException e2) {
            if (oo0o0o != null) {
                oo0o0o.OooO00o(-1L, true, true, null);
            }
            this.f60056OooO0Oo.OooO0oo(e2, response);
            o0O000o0.OooO0OO(response);
        }
    }
}
