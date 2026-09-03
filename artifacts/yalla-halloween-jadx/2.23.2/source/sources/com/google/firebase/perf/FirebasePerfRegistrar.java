package com.google.firebase.perf;

import androidx.annotation.Keep;
import com.google.firebase.annotations.concurrent.UiThread;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.OooO;
import com.google.firebase.components.OooO0O0;
import com.google.firebase.components.OooO0OO;
import com.google.firebase.components.Oooo000;
import com.google.firebase.components.Qualified;
import com.google.firebase.perf.FirebasePerfRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import p233o00oOoOO.o0OoO00O;
import p302o0O0o0OO.o0000O0O;
import p310o0O0oO0O.o00Ooo;
import p310o0O0oO0O.o00oO0o;
import p310o0O0oO0O.o0OO00O;
import p310o0O0oO0O.o0Oo0oo;
import p310o0O0oO0O.o0ooOOo;
import p310o0O0oO0O.oo000o;
import p310o0O0oO0O.oo0o0Oo;
import p315o0O0oOo.o000OO;
import p317o0O0oOoO.o00O00;
import p321o0O0oo0O.o000000O;
import p321o0O0oo0O.o00000O;
import p621o0oo0oOo.y5;
import p626o0ooO.o0O0O00;
import p626o0ooO.o0OOO0o;
import p629o0ooO00O.o00000O0;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public class FirebasePerfRegistrar implements ComponentRegistrar {
    private static final String EARLY_LIBRARY_NAME = "fire-perf-early";
    private static final String LIBRARY_NAME = "fire-perf";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ o000000O lambda$getComponents$0(Qualified qualified, OooO0OO oooO0OO) {
        return new o000000O((o0OOO0o) oooO0OO.OooO00o(o0OOO0o.class), (o0O0O00) oooO0OO.OooO0o0(o0O0O00.class).get(), (Executor) oooO0OO.OooO0Oo(qualified));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static FirebasePerformance providesFirebasePerformance(OooO0OO oooO0OO) {
        oooO0OO.OooO00o(o000000O.class);
        o00Ooo o00ooo2 = new o00Ooo((o0OOO0o) oooO0OO.OooO00o(o0OOO0o.class), (o0000O0O) oooO0OO.OooO00o(o0000O0O.class), oooO0OO.OooO0o0(o00O00.class), oooO0OO.OooO0o0(o0OoO00O.class));
        o00000O o00000o = new o00000O(new o00oO0o(o00ooo2), new p310o0O0oO0O.o0OOO0o(o00ooo2), new o0ooOOo(o00ooo2), new oo0o0Oo(o00ooo2), new o0Oo0oo(o00ooo2), new oo000o(o00ooo2), new o0OO00O(o00ooo2));
        Object obj = y5.f57604OooO0OO;
        boolean z = o00000o instanceof y5;
        o00000O0 y5Var = o00000o;
        if (!z) {
            y5Var = new y5(o00000o);
        }
        return (FirebasePerformance) y5Var.get();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<OooO0O0<?>> getComponents() {
        final Qualified qualified = new Qualified(UiThread.class, Executor.class);
        OooO0O0.OooO00o OooO00o2 = OooO0O0.OooO00o(FirebasePerformance.class);
        OooO00o2.f19327OooO00o = LIBRARY_NAME;
        OooO00o2.OooO00o(Oooo000.OooO0O0(o0OOO0o.class));
        OooO00o2.OooO00o(new Oooo000(1, 1, o00O00.class));
        OooO00o2.OooO00o(Oooo000.OooO0O0(o0000O0O.class));
        OooO00o2.OooO00o(new Oooo000(1, 1, o0OoO00O.class));
        OooO00o2.OooO00o(Oooo000.OooO0O0(o000000O.class));
        OooO00o2.f19331OooO0o = new androidx.compose.material.OooO0OO();
        OooO0O0.OooO00o OooO00o3 = OooO0O0.OooO00o(o000000O.class);
        OooO00o3.f19327OooO00o = EARLY_LIBRARY_NAME;
        OooO00o3.OooO00o(Oooo000.OooO0O0(o0OOO0o.class));
        OooO00o3.OooO00o(Oooo000.OooO00o(o0O0O00.class));
        OooO00o3.OooO00o(new Oooo000((Qualified<?>) qualified, 1, 0));
        OooO00o3.OooO0OO(2);
        OooO00o3.f19331OooO0o = new OooO() { // from class: o0O0oo0O.o00000
            @Override // com.google.firebase.components.OooO
            public final Object OooO00o(com.google.firebase.components.o00oO0o o00oo0o2) {
                return FirebasePerfRegistrar.lambda$getComponents$0(qualified, o00oo0o2);
            }
        };
        return Arrays.asList(OooO00o2.OooO0O0(), OooO00o3.OooO0O0(), o000OO.OooO00o(LIBRARY_NAME, "20.3.3"));
    }
}
