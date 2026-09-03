package com.google.firebase.installations;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import java.util.Arrays;
import java.util.List;
import p314o0O0oO0o.o00000O0;
import p357o0OOOo0O.o00000;
import p357o0OOOo0O.o00Ooo;
import p357o0OOOo0O.o00oO0o;
import p357o0OOOo0O.o0OOO0o;
import p357o0OOOo0O.oo000o;
import p372o0OOo0o.o0OO00O;
import p372o0OOo0o.oo0o0Oo;
import p377o0OOoO00.OooOOO;
import p382o0OOoOo.o000000O;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ OooOOO lambda$getComponents$0(o00oO0o o00oo0o2) {
        return new OooO00o((p351o0OOOOo.OooOOO) o00oo0o2.OooO00o(p351o0OOOOo.OooOOO.class), o00oo0o2.OooO0O0(oo0o0Oo.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<oo000o<?>> getComponents() {
        oo000o.OooO0O0 oooO0O0OooO00o = oo000o.OooO00o(OooOOO.class);
        oooO0O0OooO00o.OooO00o(new o00000(p351o0OOOOo.OooOOO.class, 1, 0));
        oooO0O0OooO00o.OooO00o(new o00000(oo0o0Oo.class, 0, 1));
        oooO0O0OooO00o.f38378OooO0o0 = new o0OOO0o() { // from class: o0OOoO00.OooOOOO
            @Override // p357o0OOOo0O.o0OOO0o
            public final Object OooO00o(o00oO0o o00oo0o2) {
                return FirebaseInstallationsRegistrar.lambda$getComponents$0(o00oo0o2);
            }
        };
        o00000O0 o00000o1 = new o00000O0();
        oo000o.OooO0O0 oooO0O0OooO00o2 = oo000o.OooO00o(o0OO00O.class);
        oooO0O0OooO00o2.f38376OooO0Oo = 1;
        oooO0O0OooO00o2.f38378OooO0o0 = new o00Ooo(o00000o1);
        return Arrays.asList(oooO0O0OooO00o.OooO0O0(), oooO0O0OooO00o2.OooO0O0(), o000000O.OooO00o("fire-installations", "17.0.2"));
    }
}
