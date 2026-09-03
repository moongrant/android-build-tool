package com.google.firebase.installations;

import androidx.annotation.Keep;
import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.annotations.concurrent.Blocking;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.OooO0O0;
import com.google.firebase.components.OooO0OO;
import com.google.firebase.components.Oooo000;
import com.google.firebase.components.Qualified;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import o0O0OOOo.o00Oo0;
import p300o0O0o00o.OooOOOO;
import p300o0O0o00o.OooOo;
import p300o0O0o00o.OooOo00;
import p302o0O0o0OO.o0000O0O;
import p302o0O0o0OO.o000OO;
import p626o0ooO.o0OOO0o;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static o0000O0O lambda$getComponents$0(OooO0OO oooO0OO) {
        return new OooO00o((o0OOO0o) oooO0OO.OooO00o(o0OOO0o.class), oooO0OO.OooO0o0(OooOo.class), (ExecutorService) oooO0OO.OooO0Oo(new Qualified(Background.class, ExecutorService.class)), new o00Oo0((Executor) oooO0OO.OooO0Oo(new Qualified(Blocking.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<OooO0O0<?>> getComponents() {
        OooO0O0.OooO00o OooO00o2 = OooO0O0.OooO00o(o0000O0O.class);
        OooO00o2.f19327OooO00o = LIBRARY_NAME;
        OooO00o2.OooO00o(Oooo000.OooO0O0(o0OOO0o.class));
        OooO00o2.OooO00o(Oooo000.OooO00o(OooOo.class));
        OooO00o2.OooO00o(new Oooo000((Qualified<?>) new Qualified(Background.class, ExecutorService.class), 1, 0));
        OooO00o2.OooO00o(new Oooo000((Qualified<?>) new Qualified(Blocking.class, Executor.class), 1, 0));
        OooO00o2.f19331OooO0o = new o000OO();
        OooOo00 oooOo00 = new OooOo00();
        OooO0O0.OooO00o OooO00o3 = OooO0O0.OooO00o(OooOOOO.class);
        OooO00o3.f19332OooO0o0 = 1;
        OooO00o3.f19331OooO0o = new com.google.firebase.components.OooO00o(oooOo00);
        return Arrays.asList(OooO00o2.OooO0O0(), OooO00o3.OooO0O0(), p315o0O0oOo.o000OO.OooO00o(LIBRARY_NAME, "17.1.3"));
    }
}
