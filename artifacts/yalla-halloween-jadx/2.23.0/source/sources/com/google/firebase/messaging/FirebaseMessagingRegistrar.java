package com.google.firebase.messaging;

import androidx.annotation.Keep;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import java.util.Arrays;
import java.util.List;
import p022Oooo00O.o00;
import p314o0O0oOo0.o000O0Oo;
import p314o0O0oOo0.o000OO0O;

/* JADX INFO: loaded from: classes3.dex */
@Keep
@KeepForSdk
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(com.google.firebase.components.OooO0OO oooO0OO) {
        return new FirebaseMessaging((p281o0O0O0oO.OooOO0) oooO0OO.OooO00o(p281o0O0O0oO.OooOO0.class), (o0O0o00O.OooO00o) oooO0OO.OooO00o(o0O0o00O.OooO00o.class), oooO0OO.OooO0o0(o000OO0O.class), oooO0OO.OooO0o0(HeartBeatInfo.class), (o0O0o0.OooO) oooO0OO.OooO00o(o0O0o0.OooO.class), (p176o00o0.o0OoOo0) oooO0OO.OooO00o(p176o00o0.o0OoOo0.class), (o0O0o000.OooO0o) oooO0OO.OooO00o(o0O0o000.OooO0o.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<com.google.firebase.components.OooO0O0<?>> getComponents() {
        com.google.firebase.components.OooO0O0.OooO00o OooO00o2 = com.google.firebase.components.OooO0O0.OooO00o(FirebaseMessaging.class);
        OooO00o2.f19801OooO00o = LIBRARY_NAME;
        OooO00o2.OooO00o(com.google.firebase.components.OooOo.OooO0O0(p281o0O0O0oO.OooOO0.class));
        OooO00o2.OooO00o(new com.google.firebase.components.OooOo(0, 0, o0O0o00O.OooO00o.class));
        OooO00o2.OooO00o(com.google.firebase.components.OooOo.OooO00o(o000OO0O.class));
        OooO00o2.OooO00o(com.google.firebase.components.OooOo.OooO00o(HeartBeatInfo.class));
        OooO00o2.OooO00o(new com.google.firebase.components.OooOo(0, 0, p176o00o0.o0OoOo0.class));
        OooO00o2.OooO00o(com.google.firebase.components.OooOo.OooO0O0(o0O0o0.OooO.class));
        OooO00o2.OooO00o(com.google.firebase.components.OooOo.OooO0O0(o0O0o000.OooO0o.class));
        OooO00o2.f19805OooO0o = new o00();
        OooO00o2.OooO0OO(1);
        return Arrays.asList(OooO00o2.OooO0O0(), o000O0Oo.OooO00o(LIBRARY_NAME, "23.1.2"));
    }
}
