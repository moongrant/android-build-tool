package com.google.firebase.messaging;

import androidx.annotation.Keep;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import java.util.Arrays;
import java.util.List;
import o0O0O0Oo.OooOO0;
import p351o0OOOOo.OooOOO;
import p357o0OOOo0O.o00oO0o;
import p357o0OOOo0O.o0OOO0o;
import p357o0OOOo0O.oo000o;
import p373o0OOo0o0.o0000;
import p382o0OOoOo.o00000;
import p382o0OOoOo.o000000O;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@KeepForSdk
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(o00oO0o o00oo0o2) {
        return new FirebaseMessaging((OooOOO) o00oo0o2.OooO00o(OooOOO.class), (p374o0OOo0oO.o00oO0o) o00oo0o2.OooO00o(p374o0OOo0oO.o00oO0o.class), o00oo0o2.OooO0O0(o00000.class), o00oo0o2.OooO0O0(HeartBeatInfo.class), (p377o0OOoO00.OooOOO) o00oo0o2.OooO00o(p377o0OOoO00.OooOOO.class), (OooOO0) o00oo0o2.OooO00o(OooOO0.class), (o0000) o00oo0o2.OooO00o(o0000.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<oo000o<?>> getComponents() {
        oo000o[] oo000oVarArr = new oo000o[2];
        oo000o.OooO0O0 oooO0O0OooO00o = oo000o.OooO00o(FirebaseMessaging.class);
        oooO0O0OooO00o.OooO00o(new p357o0OOOo0O.o00000(OooOOO.class, 1, 0));
        oooO0O0OooO00o.OooO00o(new p357o0OOOo0O.o00000(p374o0OOo0oO.o00oO0o.class, 0, 0));
        oooO0O0OooO00o.OooO00o(new p357o0OOOo0O.o00000(o00000.class, 0, 1));
        oooO0O0OooO00o.OooO00o(new p357o0OOOo0O.o00000(HeartBeatInfo.class, 0, 1));
        oooO0O0OooO00o.OooO00o(new p357o0OOOo0O.o00000(OooOO0.class, 0, 0));
        oooO0O0OooO00o.OooO00o(new p357o0OOOo0O.o00000(p377o0OOoO00.OooOOO.class, 1, 0));
        oooO0O0OooO00o.OooO00o(new p357o0OOOo0O.o00000(o0000.class, 1, 0));
        oooO0O0OooO00o.f38378OooO0o0 = new o0OOO0o() { // from class: o0OOoOOO.o00O0OO0
            @Override // p357o0OOOo0O.o0OOO0o
            public final Object OooO00o(o00oO0o o00oo0o2) {
                return FirebaseMessagingRegistrar.lambda$getComponents$0(o00oo0o2);
            }
        };
        if (!(oooO0O0OooO00o.f38375OooO0OO == 0)) {
            throw new IllegalStateException("Instantiation type has already been set.");
        }
        oooO0O0OooO00o.f38375OooO0OO = 1;
        oo000oVarArr[0] = oooO0O0OooO00o.OooO0O0();
        oo000oVarArr[1] = o000000O.OooO00o("fire-fcm", "23.0.8");
        return Arrays.asList(oo000oVarArr);
    }
}
