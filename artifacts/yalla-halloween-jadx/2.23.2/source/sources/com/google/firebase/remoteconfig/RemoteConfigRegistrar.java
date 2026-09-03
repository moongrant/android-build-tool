package com.google.firebase.remoteconfig;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.abt.FirebaseABTesting;
import com.google.firebase.annotations.concurrent.Blocking;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.OooO;
import com.google.firebase.components.OooO0O0;
import com.google.firebase.components.OooO0OO;
import com.google.firebase.components.Oooo000;
import com.google.firebase.components.Qualified;
import com.google.firebase.components.o00oO0o;
import com.google.firebase.remoteconfig.RemoteConfigRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import o0O0OO0O.OooO00o;
import p302o0O0o0OO.o0000O0O;
import p315o0O0oOo.o000OO;
import p317o0O0oOoO.o00O00;
import p626o0ooO.o0OOO0o;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public class RemoteConfigRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-rc";

    /* JADX INFO: Access modifiers changed from: private */
    public static o00O00 lambda$getComponents$0(Qualified qualified, OooO0OO oooO0OO) {
        FirebaseABTesting firebaseABTesting;
        Context context = (Context) oooO0OO.OooO00o(Context.class);
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) oooO0OO.OooO0Oo(qualified);
        o0OOO0o o0ooo0o2 = (o0OOO0o) oooO0OO.OooO00o(o0OOO0o.class);
        o0000O0O o0000o0o2 = (o0000O0O) oooO0OO.OooO00o(o0000O0O.class);
        OooO00o oooO00o = (OooO00o) oooO0OO.OooO00o(OooO00o.class);
        synchronized (oooO00o) {
            if (!oooO00o.f41341OooO00o.containsKey(FirebaseABTesting.OriginService.REMOTE_CONFIG)) {
                oooO00o.f41341OooO00o.put(FirebaseABTesting.OriginService.REMOTE_CONFIG, new FirebaseABTesting(oooO00o.f41342OooO0O0));
            }
            firebaseABTesting = (FirebaseABTesting) oooO00o.f41341OooO00o.get(FirebaseABTesting.OriginService.REMOTE_CONFIG);
        }
        return new o00O00(context, scheduledExecutorService, o0ooo0o2, o0000o0o2, firebaseABTesting, oooO0OO.OooO0o0(o0O0OOO0.OooO00o.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<OooO0O0<?>> getComponents() {
        final Qualified qualified = new Qualified(Blocking.class, ScheduledExecutorService.class);
        OooO0O0.OooO00o OooO00o2 = OooO0O0.OooO00o(o00O00.class);
        OooO00o2.f19327OooO00o = LIBRARY_NAME;
        OooO00o2.OooO00o(Oooo000.OooO0O0(Context.class));
        OooO00o2.OooO00o(new Oooo000((Qualified<?>) qualified, 1, 0));
        OooO00o2.OooO00o(Oooo000.OooO0O0(o0OOO0o.class));
        OooO00o2.OooO00o(Oooo000.OooO0O0(o0000O0O.class));
        OooO00o2.OooO00o(Oooo000.OooO0O0(OooO00o.class));
        OooO00o2.OooO00o(Oooo000.OooO00o(o0O0OOO0.OooO00o.class));
        OooO00o2.f19331OooO0o = new OooO() { // from class: o0O0oOoO.o00O00O
            @Override // com.google.firebase.components.OooO
            public final Object OooO00o(o00oO0o o00oo0o2) {
                return RemoteConfigRegistrar.lambda$getComponents$0(qualified, o00oo0o2);
            }
        };
        OooO00o2.OooO0OO(2);
        return Arrays.asList(OooO00o2.OooO0O0(), o000OO.OooO00o(LIBRARY_NAME, "21.4.0"));
    }
}
