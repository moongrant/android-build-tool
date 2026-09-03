package com.google.firebase.messaging;

import com.google.firebase.encoders.annotations.Encodable;
import com.google.firebase.messaging.reporting.MessagingClientEvent;
import java.util.HashMap;
import p307o0O0o0oo.o000O0;

/* JADX INFO: loaded from: classes3.dex */
@Encodable
public abstract class o0OO00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final com.google.firebase.encoders.proto.OooOO0 f19906OooO00o;

    static {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        com.google.firebase.encoders.proto.OooO oooO = com.google.firebase.encoders.proto.OooOO0.OooO00o.f19696OooO00o;
        map.put(o0OO00O.class, OooO0OO.f19794OooO00o);
        map2.remove(o0OO00O.class);
        map.put(o000O0.class, OooO0O0.f19792OooO00o);
        map2.remove(o000O0.class);
        map.put(MessagingClientEvent.class, OooO00o.f19777OooO00o);
        map2.remove(MessagingClientEvent.class);
        f19906OooO00o = new com.google.firebase.encoders.proto.OooOO0(new HashMap(map), new HashMap(map2), oooO);
    }

    public abstract o000O0 OooO00o();
}
