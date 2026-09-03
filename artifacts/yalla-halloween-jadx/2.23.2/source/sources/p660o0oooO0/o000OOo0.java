package p660o0oooO0;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import p641o0ooOO0o.o00OO;
import p641o0ooOO0o.o00OOO00;
import p641o0ooOO0o.o0O000;
import p641o0ooOO0o.o0O00O0o;
import p641o0ooOO0o.o0O00o00;
import p648o0ooOoo.oO000o00;
import p653o0ooo00O.o0000O00;
import p653o0ooo00O.o0000OO0;

/* JADX INFO: loaded from: classes5.dex */
public final class o000OOo0 implements o00OOO00 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o000OO00 f59703OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o0O00O0o f59704OooO0o0;

    public o000OOo0(o000OO00 o000oo01, o0O00O0o o0o00o0o) {
        this.f59703OooO0Oo = o000oo01;
        this.f59704OooO0o0 = o0o00o0o;
    }

    @Override // p641o0ooOO0o.o00OOO00
    public final void onFailure(@NotNull o00OO call, @NotNull IOException e) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(e, "e");
        this.f59703OooO0Oo.OooO0oo(e, null);
    }

    @Override // p641o0ooOO0o.o00OOO00
    public final void onResponse(@NotNull o00OO call, @NotNull o0O00o00 response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
        o0000O00 o0000o00 = response.f57858OooOOOo;
        try {
            this.f59703OooO0Oo.OooO0oO(response, o0000o00);
            Intrinsics.checkNotNull(o0000o00);
            o0000OO0 o0000oo0OooO0OO = o0000o00.OooO0OO();
            o0O000 responseHeaders = response.f57846OooO;
            Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
            int length = responseHeaders.f57773OooO0Oo.length / 2;
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
                if (StringsKt__StringsJVMKt.equals(responseHeaders.OooO0OO(i2), "Sec-WebSocket-Extensions", true)) {
                    String strOooO0o0 = responseHeaders.OooO0o0(i2);
                    int i4 = i;
                    while (i4 < strOooO0o0.length()) {
                        int iOooO0oO = oO000o00.OooO0oO(strOooO0o0, ',', i4, i, 4);
                        int iOooO0o = oO000o00.OooO0o(strOooO0o0, ';', i4, iOooO0oO);
                        String strOooOoO = oO000o00.OooOoO(i4, iOooO0o, strOooO0o0);
                        int i5 = iOooO0o + 1;
                        if (StringsKt__StringsJVMKt.equals(strOooOoO, "permessage-deflate", true)) {
                            if (z) {
                                z4 = true;
                            }
                            i4 = i5;
                            while (i4 < iOooO0oO) {
                                int iOooO0o2 = oO000o00.OooO0o(strOooO0o0, ';', i4, iOooO0oO);
                                int iOooO0o3 = oO000o00.OooO0o(strOooO0o0, '=', i4, iOooO0o2);
                                String strOooOoO2 = oO000o00.OooOoO(i4, iOooO0o3, strOooO0o0);
                                String strRemoveSurrounding = iOooO0o3 < iOooO0o2 ? StringsKt__StringsKt.removeSurrounding(oO000o00.OooOoO(iOooO0o3 + 1, iOooO0o2, strOooO0o0), (CharSequence) "\"") : null;
                                i4 = iOooO0o2 + 1;
                                if (StringsKt__StringsJVMKt.equals(strOooOoO2, "client_max_window_bits", true)) {
                                    if (num != null) {
                                        z4 = true;
                                    }
                                    Integer intOrNull = strRemoveSurrounding == null ? null : StringsKt.toIntOrNull(strRemoveSurrounding);
                                    num = intOrNull;
                                    if (intOrNull == null) {
                                        z4 = true;
                                    }
                                } else if (StringsKt__StringsJVMKt.equals(strOooOoO2, "client_no_context_takeover", true)) {
                                    if (z2) {
                                        z4 = true;
                                    }
                                    if (strRemoveSurrounding != null) {
                                        z4 = true;
                                    }
                                    z2 = true;
                                } else if (StringsKt__StringsJVMKt.equals(strOooOoO2, "server_max_window_bits", true)) {
                                    if (num2 != null) {
                                        z4 = true;
                                    }
                                    Integer intOrNull2 = strRemoveSurrounding == null ? null : StringsKt.toIntOrNull(strRemoveSurrounding);
                                    num2 = intOrNull2;
                                    if (intOrNull2 == null) {
                                        z4 = true;
                                    }
                                } else if (StringsKt__StringsJVMKt.equals(strOooOoO2, "server_no_context_takeover", true)) {
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
            this.f59703OooO0Oo.f59672OooO0o0 = new o00O0000(z, num, z2, num2, z3, z4);
            if (!(!z4 && num == null && (num2 == null || new IntRange(8, 15).contains(num2.intValue())))) {
                o000OO00 o000oo01 = this.f59703OooO0Oo;
                synchronized (o000oo01) {
                    o000oo01.f59681OooOOOo.clear();
                    o000oo01.close(1010, "unexpected Sec-WebSocket-Extensions in response header");
                }
            }
            try {
                this.f59703OooO0Oo.OooO(oO000o00.f58130OooO0oO + " WebSocket " + this.f59704OooO0o0.f57828OooO00o.OooO(), o0000oo0OooO0OO);
                o000OO00 o000oo02 = this.f59703OooO0Oo;
                o000oo02.f59668OooO0O0.onOpen(o000oo02, response);
                this.f59703OooO0Oo.OooOO0();
            } catch (Exception e) {
                this.f59703OooO0Oo.OooO0oo(e, null);
            }
        } catch (IOException e2) {
            if (o0000o00 != null) {
                o0000o00.OooO00o(-1L, true, true, null);
            }
            this.f59703OooO0Oo.OooO0oo(e2, response);
            oO000o00.OooO0OO(response);
        }
    }
}
