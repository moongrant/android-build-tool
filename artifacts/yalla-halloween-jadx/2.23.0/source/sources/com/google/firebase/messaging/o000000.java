package com.google.firebase.messaging;

import com.google.firebase.encoders.annotations.Encodable;
import com.google.firebase.messaging.reporting.MessagingClientEvent;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
@Encodable
public abstract class o000000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final com.google.firebase.encoders.proto.OooOO0 f20291OooO00o;

    static {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        com.google.firebase.encoders.proto.OooO oooO = com.google.firebase.encoders.proto.OooOO0.OooO00o.f20168OooO00o;
        map.put(o000000.class, OooO0OO.f20265OooO00o);
        map2.remove(o000000.class);
        map.put(p563o0oOo0O0.o00000.class, OooO0O0.f20263OooO00o);
        map2.remove(p563o0oOo0O0.o00000.class);
        map.put(MessagingClientEvent.class, OooO00o.f20248OooO00o);
        map2.remove(MessagingClientEvent.class);
        f20291OooO00o = new com.google.firebase.encoders.proto.OooOO0(new HashMap(map), new HashMap(map2), oooO);
    }

    public abstract p563o0oOo0O0.o00000 OooO00o();
}
