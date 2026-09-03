package com.google.firebase.perf;

import androidx.annotation.Keep;
import com.code.android.util.o000O00;
import com.google.firebase.annotations.concurrent.UiThread;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.OooO0O0;
import com.google.firebase.components.OooO0OO;
import com.google.firebase.components.OooOo;
import com.google.firebase.components.Qualified;
import com.google.firebase.components.oo000o;
import com.google.firebase.perf.FirebasePerfRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import o0O0o0.OooO;
import p176o00o0.o0OoOo0;
import p265o00oooOo.o0O00o00;
import p281o0O0O0oO.OooOO0;
import p281o0O0O0oO.OooOOO;
import p304o0O0o0oO.Oooo0;
import p314o0O0oOo0.o000O0Oo;
import p617o0oo0oO0.o00O0000;
import p625o0ooO000.o000;
import p671oo0oOOo.o00O0O;
import p673oooOO0.o00000;
import p673oooOO0.o000000;
import p673oooOO0.o000000O;
import p673oooOO0.o00000O0;
import p673oooOO0.o000OOo;
import p673oooOO0.o0O0O00;
import p673oooOO0.oo0o0Oo;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public class FirebasePerfRegistrar implements ComponentRegistrar {
    private static final String EARLY_LIBRARY_NAME = "fire-perf-early";
    private static final String LIBRARY_NAME = "fire-perf";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Oooo0 lambda$getComponents$0(Qualified qualified, OooO0OO oooO0OO) {
        return new Oooo0((OooOO0) oooO0OO.OooO00o(OooOO0.class), (OooOOO) oooO0OO.OooO0o0(OooOOO.class).get(), (Executor) oooO0OO.OooO0Oo(qualified));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static FirebasePerformance providesFirebasePerformance(OooO0OO oooO0OO) {
        oooO0OO.OooO00o(Oooo0.class);
        oo0o0Oo oo0o0oo = new oo0o0Oo((OooOO0) oooO0OO.OooO00o(OooOO0.class), (OooO) oooO0OO.OooO00o(OooO.class), oooO0OO.OooO0o0(o00O0O.class), oooO0OO.OooO0o0(o0OoOo0.class));
        p304o0O0o0oO.o00O0O o00o0o2 = new p304o0O0o0oO.o00O0O(new o0O00o00(oo0o0oo), new o000000(oo0o0oo), new o000OOo(oo0o0oo), new o00000O0(oo0o0oo), new o000000O(oo0o0oo), new o0O0O00(oo0o0oo), new o00000(oo0o0oo));
        Object obj = o00O0000.f57110OooO0OO;
        boolean z = o00o0o2 instanceof o00O0000;
        o000 o00o0001 = o00o0o2;
        if (!z) {
            o00o0001 = new o00O0000(o00o0o2);
        }
        return (FirebasePerformance) o00o0001.get();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<OooO0O0<?>> getComponents() {
        final Qualified qualified = new Qualified(UiThread.class, Executor.class);
        OooO0O0.OooO00o OooO00o2 = OooO0O0.OooO00o(FirebasePerformance.class);
        OooO00o2.f19801OooO00o = LIBRARY_NAME;
        OooO00o2.OooO00o(OooOo.OooO0O0(OooOO0.class));
        OooO00o2.OooO00o(new OooOo(1, 1, o00O0O.class));
        OooO00o2.OooO00o(OooOo.OooO0O0(OooO.class));
        OooO00o2.OooO00o(new OooOo(1, 1, o0OoOo0.class));
        OooO00o2.OooO00o(OooOo.OooO0O0(Oooo0.class));
        OooO00o2.f19805OooO0o = new o000O00();
        OooO0O0.OooO00o OooO00o3 = OooO0O0.OooO00o(Oooo0.class);
        OooO00o3.f19801OooO00o = EARLY_LIBRARY_NAME;
        OooO00o3.OooO00o(OooOo.OooO0O0(OooOO0.class));
        OooO00o3.OooO00o(OooOo.OooO00o(OooOOO.class));
        OooO00o3.OooO00o(new OooOo((Qualified<?>) qualified, 1, 0));
        OooO00o3.OooO0OO(2);
        OooO00o3.f19805OooO0o = new com.google.firebase.components.OooO() { // from class: o0O0o0oO.o000oOoO
            @Override // com.google.firebase.components.OooO
            public final Object OooO0OO(oo000o oo000oVar) {
                return FirebasePerfRegistrar.lambda$getComponents$0(qualified, oo000oVar);
            }
        };
        return Arrays.asList(OooO00o2.OooO0O0(), OooO00o3.OooO0O0(), o000O0Oo.OooO00o(LIBRARY_NAME, "20.3.3"));
    }
}
