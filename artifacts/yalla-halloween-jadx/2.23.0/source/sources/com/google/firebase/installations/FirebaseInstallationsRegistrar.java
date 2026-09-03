package com.google.firebase.installations;

import androidx.annotation.Keep;
import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.annotations.concurrent.Blocking;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.OooO0O0;
import com.google.firebase.components.OooO0OO;
import com.google.firebase.components.OooOo;
import com.google.firebase.components.Qualified;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import o0O0OOO0.o0OO00O;
import o0O0o0.OooO;
import p281o0O0O0oO.OooOO0;
import p297o0O0o00.o0OOO0o;
import p297o0O0o00.o0Oo0oo;
import p297o0O0o00.o0ooOOo;
import p314o0O0oOo0.o000O0Oo;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static OooO lambda$getComponents$0(OooO0OO oooO0OO) {
        return new OooO00o((OooOO0) oooO0OO.OooO00o(OooOO0.class), oooO0OO.OooO0o0(o0Oo0oo.class), (ExecutorService) oooO0OO.OooO0Oo(new Qualified(Background.class, ExecutorService.class)), new o0OO00O((Executor) oooO0OO.OooO0Oo(new Qualified(Blocking.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<OooO0O0<?>> getComponents() {
        OooO0O0.OooO00o OooO00o2 = OooO0O0.OooO00o(OooO.class);
        OooO00o2.f19801OooO00o = LIBRARY_NAME;
        OooO00o2.OooO00o(OooOo.OooO0O0(OooOO0.class));
        OooO00o2.OooO00o(OooOo.OooO00o(o0Oo0oo.class));
        OooO00o2.OooO00o(new OooOo((Qualified<?>) new Qualified(Background.class, ExecutorService.class), 1, 0));
        OooO00o2.OooO00o(new OooOo((Qualified<?>) new Qualified(Blocking.class, Executor.class), 1, 0));
        OooO00o2.f19805OooO0o = new o0O0o0.OooOO0();
        o0OOO0o o0ooo0o2 = new o0OOO0o();
        OooO0O0.OooO00o OooO00o3 = OooO0O0.OooO00o(o0ooOOo.class);
        OooO00o3.f19806OooO0o0 = 1;
        OooO00o3.f19805OooO0o = new com.google.firebase.components.OooO00o(o0ooo0o2);
        return Arrays.asList(OooO00o2.OooO0O0(), OooO00o3.OooO0O0(), o000O0Oo.OooO00o(LIBRARY_NAME, "17.1.3"));
    }
}
