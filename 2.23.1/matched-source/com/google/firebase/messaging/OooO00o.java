package com.google.firebase.messaging;

import com.google.firebase.encoders.proto.AtProtobuf;
import com.google.firebase.encoders.proto.Protobuf;
import com.google.firebase.messaging.reporting.MessagingClientEvent;
import com.google.firebase.remoteconfig.RemoteConfigConstants$RequestFieldKey;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO00o implements p298o0O0OooO.o0000O0<MessagingClientEvent> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final p298o0O0OooO.o0000oo f19781OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooO00o f19782OooO00o = new OooO00o();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final p298o0O0OooO.o0000oo f19783OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final p298o0O0OooO.o0000oo f19784OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final p298o0O0OooO.o0000oo f19785OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final p298o0O0OooO.o0000oo f19786OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final p298o0O0OooO.o0000oo f19787OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final p298o0O0OooO.o0000oo f19788OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final p298o0O0OooO.o0000oo f19789OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final p298o0O0OooO.o0000oo f19790OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final p298o0O0OooO.o0000oo f19791OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public static final p298o0O0OooO.o0000oo f19792OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public static final p298o0O0OooO.o0000oo f19793OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public static final p298o0O0OooO.o0000oo f19794OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public static final p298o0O0OooO.o0000oo f19795OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public static final p298o0O0OooO.o0000oo f19796OooOOOo;

    static {
        AtProtobuf atProtobuf = new AtProtobuf();
        atProtobuf.f19685OooO00o = 1;
        Protobuf protobufOooO00o = atProtobuf.OooO00o();
        HashMap map = new HashMap();
        map.put(protobufOooO00o.annotationType(), protobufOooO00o);
        f19783OooO0O0 = new p298o0O0OooO.o0000oo("projectNumber", p034OoooOO0.o00O0O.OooO0O0(map));
        AtProtobuf atProtobuf2 = new AtProtobuf();
        atProtobuf2.f19685OooO00o = 2;
        Protobuf protobufOooO00o2 = atProtobuf2.OooO00o();
        HashMap map2 = new HashMap();
        map2.put(protobufOooO00o2.annotationType(), protobufOooO00o2);
        f19784OooO0OO = new p298o0O0OooO.o0000oo("messageId", p034OoooOO0.o00O0O.OooO0O0(map2));
        AtProtobuf atProtobuf3 = new AtProtobuf();
        atProtobuf3.f19685OooO00o = 3;
        Protobuf protobufOooO00o3 = atProtobuf3.OooO00o();
        HashMap map3 = new HashMap();
        map3.put(protobufOooO00o3.annotationType(), protobufOooO00o3);
        f19785OooO0Oo = new p298o0O0OooO.o0000oo("instanceId", p034OoooOO0.o00O0O.OooO0O0(map3));
        AtProtobuf atProtobuf4 = new AtProtobuf();
        atProtobuf4.f19685OooO00o = 4;
        Protobuf protobufOooO00o4 = atProtobuf4.OooO00o();
        HashMap map4 = new HashMap();
        map4.put(protobufOooO00o4.annotationType(), protobufOooO00o4);
        f19787OooO0o0 = new p298o0O0OooO.o0000oo("messageType", p034OoooOO0.o00O0O.OooO0O0(map4));
        AtProtobuf atProtobuf5 = new AtProtobuf();
        atProtobuf5.f19685OooO00o = 5;
        Protobuf protobufOooO00o5 = atProtobuf5.OooO00o();
        HashMap map5 = new HashMap();
        map5.put(protobufOooO00o5.annotationType(), protobufOooO00o5);
        f19786OooO0o = new p298o0O0OooO.o0000oo("sdkPlatform", p034OoooOO0.o00O0O.OooO0O0(map5));
        AtProtobuf atProtobuf6 = new AtProtobuf();
        atProtobuf6.f19685OooO00o = 6;
        Protobuf protobufOooO00o6 = atProtobuf6.OooO00o();
        HashMap map6 = new HashMap();
        map6.put(protobufOooO00o6.annotationType(), protobufOooO00o6);
        f19788OooO0oO = new p298o0O0OooO.o0000oo(RemoteConfigConstants$RequestFieldKey.PACKAGE_NAME, p034OoooOO0.o00O0O.OooO0O0(map6));
        AtProtobuf atProtobuf7 = new AtProtobuf();
        atProtobuf7.f19685OooO00o = 7;
        Protobuf protobufOooO00o7 = atProtobuf7.OooO00o();
        HashMap map7 = new HashMap();
        map7.put(protobufOooO00o7.annotationType(), protobufOooO00o7);
        f19789OooO0oo = new p298o0O0OooO.o0000oo("collapseKey", p034OoooOO0.o00O0O.OooO0O0(map7));
        AtProtobuf atProtobuf8 = new AtProtobuf();
        atProtobuf8.f19685OooO00o = 8;
        Protobuf protobufOooO00o8 = atProtobuf8.OooO00o();
        HashMap map8 = new HashMap();
        map8.put(protobufOooO00o8.annotationType(), protobufOooO00o8);
        f19781OooO = new p298o0O0OooO.o0000oo("priority", p034OoooOO0.o00O0O.OooO0O0(map8));
        AtProtobuf atProtobuf9 = new AtProtobuf();
        atProtobuf9.f19685OooO00o = 9;
        Protobuf protobufOooO00o9 = atProtobuf9.OooO00o();
        HashMap map9 = new HashMap();
        map9.put(protobufOooO00o9.annotationType(), protobufOooO00o9);
        f19790OooOO0 = new p298o0O0OooO.o0000oo("ttl", p034OoooOO0.o00O0O.OooO0O0(map9));
        AtProtobuf atProtobuf10 = new AtProtobuf();
        atProtobuf10.f19685OooO00o = 10;
        Protobuf protobufOooO00o10 = atProtobuf10.OooO00o();
        HashMap map10 = new HashMap();
        map10.put(protobufOooO00o10.annotationType(), protobufOooO00o10);
        f19791OooOO0O = new p298o0O0OooO.o0000oo("topic", p034OoooOO0.o00O0O.OooO0O0(map10));
        AtProtobuf atProtobuf11 = new AtProtobuf();
        atProtobuf11.f19685OooO00o = 11;
        Protobuf protobufOooO00o11 = atProtobuf11.OooO00o();
        HashMap map11 = new HashMap();
        map11.put(protobufOooO00o11.annotationType(), protobufOooO00o11);
        f19792OooOO0o = new p298o0O0OooO.o0000oo("bulkId", p034OoooOO0.o00O0O.OooO0O0(map11));
        AtProtobuf atProtobuf12 = new AtProtobuf();
        atProtobuf12.f19685OooO00o = 12;
        Protobuf protobufOooO00o12 = atProtobuf12.OooO00o();
        HashMap map12 = new HashMap();
        map12.put(protobufOooO00o12.annotationType(), protobufOooO00o12);
        f19794OooOOO0 = new p298o0O0OooO.o0000oo("event", p034OoooOO0.o00O0O.OooO0O0(map12));
        AtProtobuf atProtobuf13 = new AtProtobuf();
        atProtobuf13.f19685OooO00o = 13;
        Protobuf protobufOooO00o13 = atProtobuf13.OooO00o();
        HashMap map13 = new HashMap();
        map13.put(protobufOooO00o13.annotationType(), protobufOooO00o13);
        f19793OooOOO = new p298o0O0OooO.o0000oo("analyticsLabel", p034OoooOO0.o00O0O.OooO0O0(map13));
        AtProtobuf atProtobuf14 = new AtProtobuf();
        atProtobuf14.f19685OooO00o = 14;
        Protobuf protobufOooO00o14 = atProtobuf14.OooO00o();
        HashMap map14 = new HashMap();
        map14.put(protobufOooO00o14.annotationType(), protobufOooO00o14);
        f19795OooOOOO = new p298o0O0OooO.o0000oo("campaignId", p034OoooOO0.o00O0O.OooO0O0(map14));
        AtProtobuf atProtobuf15 = new AtProtobuf();
        atProtobuf15.f19685OooO00o = 15;
        Protobuf protobufOooO00o15 = atProtobuf15.OooO00o();
        HashMap map15 = new HashMap();
        map15.put(protobufOooO00o15.annotationType(), protobufOooO00o15);
        f19796OooOOOo = new p298o0O0OooO.o0000oo("composerLabel", p034OoooOO0.o00O0O.OooO0O0(map15));
    }

    @Override // p298o0O0OooO.o0000O00
    public final void OooO00o(Object obj, p298o0O0OooO.o0000O0O o0000o0o2) throws IOException {
        MessagingClientEvent messagingClientEvent = (MessagingClientEvent) obj;
        p298o0O0OooO.o0000O0O o0000o0o3 = o0000o0o2;
        o0000o0o3.OooO0OO(f19783OooO0O0, messagingClientEvent.f19924OooO00o);
        o0000o0o3.OooO0Oo(f19784OooO0OO, messagingClientEvent.f19925OooO0O0);
        o0000o0o3.OooO0Oo(f19785OooO0Oo, messagingClientEvent.f19926OooO0OO);
        o0000o0o3.OooO0Oo(f19787OooO0o0, messagingClientEvent.f19927OooO0Oo);
        o0000o0o3.OooO0Oo(f19786OooO0o, messagingClientEvent.f19929OooO0o0);
        o0000o0o3.OooO0Oo(f19788OooO0oO, messagingClientEvent.f19928OooO0o);
        o0000o0o3.OooO0Oo(f19789OooO0oo, messagingClientEvent.f19930OooO0oO);
        o0000o0o3.OooO0O0(f19781OooO, messagingClientEvent.f19931OooO0oo);
        o0000o0o3.OooO0O0(f19790OooOO0, messagingClientEvent.f19923OooO);
        o0000o0o3.OooO0Oo(f19791OooOO0O, messagingClientEvent.f19932OooOO0);
        o0000o0o3.OooO0OO(f19792OooOO0o, messagingClientEvent.f19933OooOO0O);
        o0000o0o3.OooO0Oo(f19794OooOOO0, messagingClientEvent.f19934OooOO0o);
        o0000o0o3.OooO0Oo(f19793OooOOO, messagingClientEvent.f19936OooOOO0);
        o0000o0o3.OooO0OO(f19795OooOOOO, messagingClientEvent.f19935OooOOO);
        o0000o0o3.OooO0Oo(f19796OooOOOo, messagingClientEvent.f19937OooOOOO);
    }
}
