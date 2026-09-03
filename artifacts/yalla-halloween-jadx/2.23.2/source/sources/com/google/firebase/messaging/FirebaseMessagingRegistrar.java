package com.google.firebase.messaging;

import androidx.annotation.Keep;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import java.util.Arrays;
import java.util.List;
import p233o00oOoOO.o0OoO00O;

/* JADX INFO: loaded from: classes3.dex */
@Keep
@KeepForSdk
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(com.google.firebase.components.OooO0OO oooO0OO) {
        return new FirebaseMessaging((p626o0ooO.o0OOO0o) oooO0OO.OooO00o(p626o0ooO.o0OOO0o.class), (o0O0o0.OooO00o) oooO0OO.OooO00o(o0O0o0.OooO00o.class), oooO0OO.OooO0o0(p315o0O0oOo.o0000O.class), oooO0OO.OooO0o0(HeartBeatInfo.class), (p302o0O0o0OO.o0000O0O) oooO0OO.OooO00o(p302o0O0o0OO.o0000O0O.class), (o0OoO00O) oooO0OO.OooO00o(o0OoO00O.class), (o0O0o00O.OooO0o) oooO0OO.OooO00o(o0O0o00O.OooO0o.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<com.google.firebase.components.OooO0O0<?>> getComponents() {
        com.google.firebase.components.OooO0O0.OooO00o OooO00o2 = com.google.firebase.components.OooO0O0.OooO00o(FirebaseMessaging.class);
        OooO00o2.f19327OooO00o = LIBRARY_NAME;
        OooO00o2.OooO00o(com.google.firebase.components.Oooo000.OooO0O0(p626o0ooO.o0OOO0o.class));
        OooO00o2.OooO00o(new com.google.firebase.components.Oooo000(0, 0, o0O0o0.OooO00o.class));
        OooO00o2.OooO00o(com.google.firebase.components.Oooo000.OooO00o(p315o0O0oOo.o0000O.class));
        OooO00o2.OooO00o(com.google.firebase.components.Oooo000.OooO00o(HeartBeatInfo.class));
        OooO00o2.OooO00o(new com.google.firebase.components.Oooo000(0, 0, o0OoO00O.class));
        OooO00o2.OooO00o(com.google.firebase.components.Oooo000.OooO0O0(p302o0O0o0OO.o0000O0O.class));
        OooO00o2.OooO00o(com.google.firebase.components.Oooo000.OooO0O0(o0O0o00O.OooO0o.class));
        OooO00o2.f19331OooO0o = new o00Oo0();
        OooO00o2.OooO0OO(1);
        return Arrays.asList(OooO00o2.OooO0O0(), p315o0O0oOo.o000OO.OooO00o(LIBRARY_NAME, "23.1.2"));
    }
}
