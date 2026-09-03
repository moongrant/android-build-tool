package com.google.firebase.remoteconfig;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.abt.FirebaseABTesting;
import com.google.firebase.annotations.concurrent.Blocking;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.OooO0O0;
import com.google.firebase.components.OooO0OO;
import com.google.firebase.components.OooOo;
import com.google.firebase.components.Qualified;
import com.google.firebase.components.oo000o;
import com.google.firebase.remoteconfig.RemoteConfigRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import o0O0OO0O.OooO00o;
import o0O0o0.OooO;
import p281o0O0O0oO.OooOO0;
import p314o0O0oOo0.o000O0Oo;
import p623o0ooO.Oooo0;
import p671oo0oOOo.o00O0O;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public class RemoteConfigRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-rc";

    /* JADX INFO: Access modifiers changed from: private */
    public static o00O0O lambda$getComponents$0(Qualified qualified, OooO0OO oooO0OO) {
        FirebaseABTesting firebaseABTesting;
        Context context = (Context) oooO0OO.OooO00o(Context.class);
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) oooO0OO.OooO0Oo(qualified);
        OooOO0 oooOO1 = (OooOO0) oooO0OO.OooO00o(OooOO0.class);
        OooO oooO = (OooO) oooO0OO.OooO00o(OooO.class);
        Oooo0 oooo0 = (Oooo0) oooO0OO.OooO00o(Oooo0.class);
        synchronized (oooo0) {
            if (!oooo0.f57113OooO00o.containsKey(FirebaseABTesting.OriginService.REMOTE_CONFIG)) {
                oooo0.f57113OooO00o.put(FirebaseABTesting.OriginService.REMOTE_CONFIG, new FirebaseABTesting(oooo0.f57114OooO0O0));
            }
            firebaseABTesting = (FirebaseABTesting) oooo0.f57113OooO00o.get(FirebaseABTesting.OriginService.REMOTE_CONFIG);
        }
        return new o00O0O(context, scheduledExecutorService, oooOO1, oooO, firebaseABTesting, oooO0OO.OooO0o0(OooO00o.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<OooO0O0<?>> getComponents() {
        final Qualified qualified = new Qualified(Blocking.class, ScheduledExecutorService.class);
        OooO0O0.OooO00o OooO00o2 = OooO0O0.OooO00o(o00O0O.class);
        OooO00o2.f19801OooO00o = LIBRARY_NAME;
        OooO00o2.OooO00o(OooOo.OooO0O0(Context.class));
        OooO00o2.OooO00o(new OooOo((Qualified<?>) qualified, 1, 0));
        OooO00o2.OooO00o(OooOo.OooO0O0(OooOO0.class));
        OooO00o2.OooO00o(OooOo.OooO0O0(OooO.class));
        OooO00o2.OooO00o(OooOo.OooO0O0(Oooo0.class));
        OooO00o2.OooO00o(OooOo.OooO00o(OooO00o.class));
        OooO00o2.f19805OooO0o = new com.google.firebase.components.OooO() { // from class: oo0oOOo.o00Oo0
            @Override // com.google.firebase.components.OooO
            public final Object OooO0OO(oo000o oo000oVar) {
                return RemoteConfigRegistrar.lambda$getComponents$0(qualified, oo000oVar);
            }
        };
        OooO00o2.OooO0OO(2);
        return Arrays.asList(OooO00o2.OooO0O0(), o000O0Oo.OooO00o(LIBRARY_NAME, "21.4.0"));
    }
}
