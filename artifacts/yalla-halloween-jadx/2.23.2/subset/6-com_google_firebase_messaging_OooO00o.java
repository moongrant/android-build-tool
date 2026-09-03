package com.google.firebase.messaging;

import com.google.firebase.encoders.proto.AtProtobuf;
import com.google.firebase.encoders.proto.Protobuf;
import com.google.firebase.messaging.reporting.MessagingClientEvent;
import com.google.firebase.remoteconfig.RemoteConfigConstants$RequestFieldKey;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO00o implements p297o0O0OooO.o0000oo<MessagingClientEvent> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final p297o0O0OooO.o0000O00 f19776OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooO00o f19777OooO00o = new OooO00o();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final p297o0O0OooO.o0000O00 f19778OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final p297o0O0OooO.o0000O00 f19779OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final p297o0O0OooO.o0000O00 f19780OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final p297o0O0OooO.o0000O00 f19781OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final p297o0O0OooO.o0000O00 f19782OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final p297o0O0OooO.o0000O00 f19783OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final p297o0O0OooO.o0000O00 f19784OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final p297o0O0OooO.o0000O00 f19785OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final p297o0O0OooO.o0000O00 f19786OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public static final p297o0O0OooO.o0000O00 f19787OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public static final p297o0O0OooO.o0000O00 f19788OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public static final p297o0O0OooO.o0000O00 f19789OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public static final p297o0O0OooO.o0000O00 f19790OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public static final p297o0O0OooO.o0000O00 f19791OooOOOo;

    static {
        AtProtobuf atProtobuf = new AtProtobuf();
        atProtobuf.f19680OooO00o = 1;
        Protobuf protobufOooO00o = atProtobuf.OooO00o();
        HashMap map = new HashMap();
        map.put(protobufOooO00o.annotationType(), protobufOooO00o);
        f19778OooO0O0 = new p297o0O0OooO.o0000O00("projectNumber", o00OOOO0.OooO00o.OooO00o(map));
        AtProtobuf atProtobuf2 = new AtProtobuf();
        atProtobuf2.f19680OooO00o = 2;
        Protobuf protobufOooO00o2 = atProtobuf2.OooO00o();
        HashMap map2 = new HashMap();
        map2.put(protobufOooO00o2.annotationType(), protobufOooO00o2);
        f19779OooO0OO = new p297o0O0OooO.o0000O00("messageId", o00OOOO0.OooO00o.OooO00o(map2));
        AtProtobuf atProtobuf3 = new AtProtobuf();
        atProtobuf3.f19680OooO00o = 3;
        Protobuf protobufOooO00o3 = atProtobuf3.OooO00o();
        HashMap map3 = new HashMap();
        map3.put(protobufOooO00o3.annotationType(), protobufOooO00o3);
        f19780OooO0Oo = new p297o0O0OooO.o0000O00("instanceId", o00OOOO0.OooO00o.OooO00o(map3));
        AtProtobuf atProtobuf4 = new AtProtobuf();
        atProtobuf4.f19680OooO00o = 4;
        Protobuf protobufOooO00o4 = atProtobuf4.OooO00o();
        HashMap map4 = new HashMap();
        map4.put(protobufOooO00o4.annotationType(), protobufOooO00o4);
        f19782OooO0o0 = new p297o0O0OooO.o0000O00("messageType", o00OOOO0.OooO00o.OooO00o(map4));
        AtProtobuf atProtobuf5 = new AtProtobuf();
        atProtobuf5.f19680OooO00o = 5;
        Protobuf protobufOooO00o5 = atProtobuf5.OooO00o();
        HashMap map5 = new HashMap();
        map5.put(protobufOooO00o5.annotationType(), protobufOooO00o5);
        f19781OooO0o = new p297o0O0OooO.o0000O00("sdkPlatform", o00OOOO0.OooO00o.OooO00o(map5));
        AtProtobuf atProtobuf6 = new AtProtobuf();
        atProtobuf6.f19680OooO00o = 6;
        Protobuf protobufOooO00o6 = atProtobuf6.OooO00o();
        HashMap map6 = new HashMap();
        map6.put(protobufOooO00o6.annotationType(), protobufOooO00o6);
        f19783OooO0oO = new p297o0O0OooO.o0000O00(RemoteConfigConstants$RequestFieldKey.PACKAGE_NAME, o00OOOO0.OooO00o.OooO00o(map6));
        AtProtobuf atProtobuf7 = new AtProtobuf();
        atProtobuf7.f19680OooO00o = 7;
        Protobuf protobufOooO00o7 = atProtobuf7.OooO00o();
        HashMap map7 = new HashMap();
        map7.put(protobufOooO00o7.annotationType(), protobufOooO00o7);
        f19784OooO0oo = new p297o0O0OooO.o0000O00("collapseKey", o00OOOO0.OooO00o.OooO00o(map7));
        AtProtobuf atProtobuf8 = new AtProtobuf();
        atProtobuf8.f19680OooO00o = 8;
        Protobuf protobufOooO00o8 = atProtobuf8.OooO00o();
        HashMap map8 = new HashMap();
        map8.put(protobufOooO00o8.annotationType(), protobufOooO00o8);
        f19776OooO = new p297o0O0OooO.o0000O00("priority", o00OOOO0.OooO00o.OooO00o(map8));
        AtProtobuf atProtobuf9 = new AtProtobuf();
        atProtobuf9.f19680OooO00o = 9;
        Protobuf protobufOooO00o9 = atProtobuf9.OooO00o();
        HashMap map9 = new HashMap();
        map9.put(protobufOooO00o9.annotationType(), protobufOooO00o9);
        f19785OooOO0 = new p297o0O0OooO.o0000O00("ttl", o00OOOO0.OooO00o.OooO00o(map9));
        AtProtobuf atProtobuf10 = new AtProtobuf();
        atProtobuf10.f19680OooO00o = 10;
        Protobuf protobufOooO00o10 = atProtobuf10.OooO00o();
        HashMap map10 = new HashMap();
        map10.put(protobufOooO00o10.annotationType(), protobufOooO00o10);
        f19786OooOO0O = new p297o0O0OooO.o0000O00("topic", o00OOOO0.OooO00o.OooO00o(map10));
        AtProtobuf atProtobuf11 = new AtProtobuf();
        atProtobuf11.f19680OooO00o = 11;
        Protobuf protobufOooO00o11 = atProtobuf11.OooO00o();
        HashMap map11 = new HashMap();
        map11.put(protobufOooO00o11.annotationType(), protobufOooO00o11);
        f19787OooOO0o = new p297o0O0OooO.o0000O00("bulkId", o00OOOO0.OooO00o.OooO00o(map11));
        AtProtobuf atProtobuf12 = new AtProtobuf();
        atProtobuf12.f19680OooO00o = 12;
        Protobuf protobufOooO00o12 = atProtobuf12.OooO00o();
        HashMap map12 = new HashMap();
        map12.put(protobufOooO00o12.annotationType(), protobufOooO00o12);
        f19789OooOOO0 = new p297o0O0OooO.o0000O00("event", o00OOOO0.OooO00o.OooO00o(map12));
        AtProtobuf atProtobuf13 = new AtProtobuf();
        atProtobuf13.f19680OooO00o = 13;
        Protobuf protobufOooO00o13 = atProtobuf13.OooO00o();
        HashMap map13 = new HashMap();
        map13.put(protobufOooO00o13.annotationType(), protobufOooO00o13);
        f19788OooOOO = new p297o0O0OooO.o0000O00("analyticsLabel", o00OOOO0.OooO00o.OooO00o(map13));
        AtProtobuf atProtobuf14 = new AtProtobuf();
        atProtobuf14.f19680OooO00o = 14;
        Protobuf protobufOooO00o14 = atProtobuf14.OooO00o();
        HashMap map14 = new HashMap();
        map14.put(protobufOooO00o14.annotationType(), protobufOooO00o14);
        f19790OooOOOO = new p297o0O0OooO.o0000O00("campaignId", o00OOOO0.OooO00o.OooO00o(map14));
        AtProtobuf atProtobuf15 = new AtProtobuf();
        atProtobuf15.f19680OooO00o = 15;
        Protobuf protobufOooO00o15 = atProtobuf15.OooO00o();
        HashMap map15 = new HashMap();
        map15.put(protobufOooO00o15.annotationType(), protobufOooO00o15);
        f19791OooOOOo = new p297o0O0OooO.o0000O00("composerLabel", o00OOOO0.OooO00o.OooO00o(map15));
    }

    @Override // p297o0O0OooO.o0000
    public final void OooO00o(Object obj, p297o0O0OooO.o0000O0 o0000o1) throws IOException {
        MessagingClientEvent messagingClientEvent = (MessagingClientEvent) obj;
        p297o0O0OooO.o0000O0 o0000o2 = o0000o1;
        o0000o2.OooO0OO(f19778OooO0O0, messagingClientEvent.f19919OooO00o);
        o0000o2.OooO0Oo(f19779OooO0OO, messagingClientEvent.f19920OooO0O0);
        o0000o2.OooO0Oo(f19780OooO0Oo, messagingClientEvent.f19921OooO0OO);
        o0000o2.OooO0Oo(f19782OooO0o0, messagingClientEvent.f19922OooO0Oo);
        o0000o2.OooO0Oo(f19781OooO0o, messagingClientEvent.f19924OooO0o0);
        o0000o2.OooO0Oo(f19783OooO0oO, messagingClientEvent.f19923OooO0o);
        o0000o2.OooO0Oo(f19784OooO0oo, messagingClientEvent.f19925OooO0oO);
        o0000o2.OooO0O0(f19776OooO, messagingClientEvent.f19926OooO0oo);
        o0000o2.OooO0O0(f19785OooOO0, messagingClientEvent.f19918OooO);
        o0000o2.OooO0Oo(f19786OooOO0O, messagingClientEvent.f19927OooOO0);
        o0000o2.OooO0OO(f19787OooOO0o, messagingClientEvent.f19928OooOO0O);
        o0000o2.OooO0Oo(f19789OooOOO0, messagingClientEvent.f19929OooOO0o);
        o0000o2.OooO0Oo(f19788OooOOO, messagingClientEvent.f19931OooOOO0);
        o0000o2.OooO0OO(f19790OooOOOO, messagingClientEvent.f19930OooOOO);
        o0000o2.OooO0Oo(f19791OooOOOo, messagingClientEvent.f19932OooOOOO);
    }
}
