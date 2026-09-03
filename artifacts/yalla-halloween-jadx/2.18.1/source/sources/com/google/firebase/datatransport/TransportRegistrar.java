package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.datatransport.TransportRegistrar;
import java.util.Arrays;
import java.util.List;
import o0O0O0Oo.OooOO0;
import o0O0O0o0.OooO00o;
import p286o0O0O0oO.o000000;
import p357o0OOOo0O.o00000;
import p357o0OOOo0O.o00oO0o;
import p357o0OOOo0O.o0OOO0o;
import p357o0OOOo0O.oo000o;
import p382o0OOoOo.o000000O;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public class TransportRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ OooOO0 lambda$getComponents$0(o00oO0o o00oo0o2) {
        o000000.OooO0O0((Context) o00oo0o2.OooO00o(Context.class));
        return o000000.OooO00o().OooO0OO(OooO00o.f35420OooO0o0);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<oo000o<?>> getComponents() {
        oo000o.OooO0O0 oooO0O0OooO00o = oo000o.OooO00o(OooOO0.class);
        oooO0O0OooO00o.OooO00o(new o00000(Context.class, 1, 0));
        oooO0O0OooO00o.f38378OooO0o0 = new o0OOO0o() { // from class: o0OOo0O0.o00000O0
            @Override // p357o0OOOo0O.o0OOO0o
            public final Object OooO00o(o00oO0o o00oo0o2) {
                return TransportRegistrar.lambda$getComponents$0(o00oo0o2);
            }
        };
        return Arrays.asList(oooO0O0OooO00o.OooO0O0(), o000000O.OooO00o("fire-transport", "18.1.6"));
    }
}
