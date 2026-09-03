package com.google.firebase.messaging;

import com.google.firebase.encoders.proto.AtProtobuf;
import com.google.firebase.encoders.proto.Protobuf;
import com.google.firebase.messaging.reporting.MessagingClientEvent;
import com.google.firebase.remoteconfig.RemoteConfigConstants$RequestFieldKey;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO00o implements p294o0O0Ooo0.o0000O0O<MessagingClientEvent> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final p294o0O0Ooo0.o0000O0 f20247OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooO00o f20248OooO00o = new OooO00o();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final p294o0O0Ooo0.o0000O0 f20249OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final p294o0O0Ooo0.o0000O0 f20250OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final p294o0O0Ooo0.o0000O0 f20251OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final p294o0O0Ooo0.o0000O0 f20252OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final p294o0O0Ooo0.o0000O0 f20253OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final p294o0O0Ooo0.o0000O0 f20254OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final p294o0O0Ooo0.o0000O0 f20255OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final p294o0O0Ooo0.o0000O0 f20256OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final p294o0O0Ooo0.o0000O0 f20257OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public static final p294o0O0Ooo0.o0000O0 f20258OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public static final p294o0O0Ooo0.o0000O0 f20259OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public static final p294o0O0Ooo0.o0000O0 f20260OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public static final p294o0O0Ooo0.o0000O0 f20261OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public static final p294o0O0Ooo0.o0000O0 f20262OooOOOo;

    static {
        AtProtobuf atProtobuf = new AtProtobuf();
        atProtobuf.f20152OooO00o = 1;
        Protobuf protobufOooO00o = atProtobuf.OooO00o();
        HashMap map = new HashMap();
        map.put(protobufOooO00o.annotationType(), protobufOooO00o);
        f20249OooO0O0 = new p294o0O0Ooo0.o0000O0("projectNumber", androidx.compose.material.OooO.OooO0O0(map));
        AtProtobuf atProtobuf2 = new AtProtobuf();
        atProtobuf2.f20152OooO00o = 2;
        Protobuf protobufOooO00o2 = atProtobuf2.OooO00o();
        HashMap map2 = new HashMap();
        map2.put(protobufOooO00o2.annotationType(), protobufOooO00o2);
        f20250OooO0OO = new p294o0O0Ooo0.o0000O0("messageId", androidx.compose.material.OooO.OooO0O0(map2));
        AtProtobuf atProtobuf3 = new AtProtobuf();
        atProtobuf3.f20152OooO00o = 3;
        Protobuf protobufOooO00o3 = atProtobuf3.OooO00o();
        HashMap map3 = new HashMap();
        map3.put(protobufOooO00o3.annotationType(), protobufOooO00o3);
        f20251OooO0Oo = new p294o0O0Ooo0.o0000O0("instanceId", androidx.compose.material.OooO.OooO0O0(map3));
        AtProtobuf atProtobuf4 = new AtProtobuf();
        atProtobuf4.f20152OooO00o = 4;
        Protobuf protobufOooO00o4 = atProtobuf4.OooO00o();
        HashMap map4 = new HashMap();
        map4.put(protobufOooO00o4.annotationType(), protobufOooO00o4);
        f20253OooO0o0 = new p294o0O0Ooo0.o0000O0("messageType", androidx.compose.material.OooO.OooO0O0(map4));
        AtProtobuf atProtobuf5 = new AtProtobuf();
        atProtobuf5.f20152OooO00o = 5;
        Protobuf protobufOooO00o5 = atProtobuf5.OooO00o();
        HashMap map5 = new HashMap();
        map5.put(protobufOooO00o5.annotationType(), protobufOooO00o5);
        f20252OooO0o = new p294o0O0Ooo0.o0000O0("sdkPlatform", androidx.compose.material.OooO.OooO0O0(map5));
        AtProtobuf atProtobuf6 = new AtProtobuf();
        atProtobuf6.f20152OooO00o = 6;
        Protobuf protobufOooO00o6 = atProtobuf6.OooO00o();
        HashMap map6 = new HashMap();
        map6.put(protobufOooO00o6.annotationType(), protobufOooO00o6);
        f20254OooO0oO = new p294o0O0Ooo0.o0000O0(RemoteConfigConstants$RequestFieldKey.PACKAGE_NAME, androidx.compose.material.OooO.OooO0O0(map6));
        AtProtobuf atProtobuf7 = new AtProtobuf();
        atProtobuf7.f20152OooO00o = 7;
        Protobuf protobufOooO00o7 = atProtobuf7.OooO00o();
        HashMap map7 = new HashMap();
        map7.put(protobufOooO00o7.annotationType(), protobufOooO00o7);
        f20255OooO0oo = new p294o0O0Ooo0.o0000O0("collapseKey", androidx.compose.material.OooO.OooO0O0(map7));
        AtProtobuf atProtobuf8 = new AtProtobuf();
        atProtobuf8.f20152OooO00o = 8;
        Protobuf protobufOooO00o8 = atProtobuf8.OooO00o();
        HashMap map8 = new HashMap();
        map8.put(protobufOooO00o8.annotationType(), protobufOooO00o8);
        f20247OooO = new p294o0O0Ooo0.o0000O0("priority", androidx.compose.material.OooO.OooO0O0(map8));
        AtProtobuf atProtobuf9 = new AtProtobuf();
        atProtobuf9.f20152OooO00o = 9;
        Protobuf protobufOooO00o9 = atProtobuf9.OooO00o();
        HashMap map9 = new HashMap();
        map9.put(protobufOooO00o9.annotationType(), protobufOooO00o9);
        f20256OooOO0 = new p294o0O0Ooo0.o0000O0("ttl", androidx.compose.material.OooO.OooO0O0(map9));
        AtProtobuf atProtobuf10 = new AtProtobuf();
        atProtobuf10.f20152OooO00o = 10;
        Protobuf protobufOooO00o10 = atProtobuf10.OooO00o();
        HashMap map10 = new HashMap();
        map10.put(protobufOooO00o10.annotationType(), protobufOooO00o10);
        f20257OooOO0O = new p294o0O0Ooo0.o0000O0("topic", androidx.compose.material.OooO.OooO0O0(map10));
        AtProtobuf atProtobuf11 = new AtProtobuf();
        atProtobuf11.f20152OooO00o = 11;
        Protobuf protobufOooO00o11 = atProtobuf11.OooO00o();
        HashMap map11 = new HashMap();
        map11.put(protobufOooO00o11.annotationType(), protobufOooO00o11);
        f20258OooOO0o = new p294o0O0Ooo0.o0000O0("bulkId", androidx.compose.material.OooO.OooO0O0(map11));
        AtProtobuf atProtobuf12 = new AtProtobuf();
        atProtobuf12.f20152OooO00o = 12;
        Protobuf protobufOooO00o12 = atProtobuf12.OooO00o();
        HashMap map12 = new HashMap();
        map12.put(protobufOooO00o12.annotationType(), protobufOooO00o12);
        f20260OooOOO0 = new p294o0O0Ooo0.o0000O0("event", androidx.compose.material.OooO.OooO0O0(map12));
        AtProtobuf atProtobuf13 = new AtProtobuf();
        atProtobuf13.f20152OooO00o = 13;
        Protobuf protobufOooO00o13 = atProtobuf13.OooO00o();
        HashMap map13 = new HashMap();
        map13.put(protobufOooO00o13.annotationType(), protobufOooO00o13);
        f20259OooOOO = new p294o0O0Ooo0.o0000O0("analyticsLabel", androidx.compose.material.OooO.OooO0O0(map13));
        AtProtobuf atProtobuf14 = new AtProtobuf();
        atProtobuf14.f20152OooO00o = 14;
        Protobuf protobufOooO00o14 = atProtobuf14.OooO00o();
        HashMap map14 = new HashMap();
        map14.put(protobufOooO00o14.annotationType(), protobufOooO00o14);
        f20261OooOOOO = new p294o0O0Ooo0.o0000O0("campaignId", androidx.compose.material.OooO.OooO0O0(map14));
        AtProtobuf atProtobuf15 = new AtProtobuf();
        atProtobuf15.f20152OooO00o = 15;
        Protobuf protobufOooO00o15 = atProtobuf15.OooO00o();
        HashMap map15 = new HashMap();
        map15.put(protobufOooO00o15.annotationType(), protobufOooO00o15);
        f20262OooOOOo = new p294o0O0Ooo0.o0000O0("composerLabel", androidx.compose.material.OooO.OooO0O0(map15));
    }

    @Override // p294o0O0Ooo0.o0000oo
    public final void OooO00o(Object obj, p294o0O0Ooo0.o000OO o000oo2) throws IOException {
        MessagingClientEvent messagingClientEvent = (MessagingClientEvent) obj;
        p294o0O0Ooo0.o000OO o000oo3 = o000oo2;
        o000oo3.OooO0o(f20249OooO0O0, messagingClientEvent.f20391OooO00o);
        o000oo3.OooO00o(f20250OooO0OO, messagingClientEvent.f20392OooO0O0);
        o000oo3.OooO00o(f20251OooO0Oo, messagingClientEvent.f20393OooO0OO);
        o000oo3.OooO00o(f20253OooO0o0, messagingClientEvent.f20394OooO0Oo);
        o000oo3.OooO00o(f20252OooO0o, messagingClientEvent.f20396OooO0o0);
        o000oo3.OooO00o(f20254OooO0oO, messagingClientEvent.f20395OooO0o);
        o000oo3.OooO00o(f20255OooO0oo, messagingClientEvent.f20397OooO0oO);
        o000oo3.OooO0o0(f20247OooO, messagingClientEvent.f20398OooO0oo);
        o000oo3.OooO0o0(f20256OooOO0, messagingClientEvent.f20390OooO);
        o000oo3.OooO00o(f20257OooOO0O, messagingClientEvent.f20399OooOO0);
        o000oo3.OooO0o(f20258OooOO0o, messagingClientEvent.f20400OooOO0O);
        o000oo3.OooO00o(f20260OooOOO0, messagingClientEvent.f20401OooOO0o);
        o000oo3.OooO00o(f20259OooOOO, messagingClientEvent.f20403OooOOO0);
        o000oo3.OooO0o(f20261OooOOOO, messagingClientEvent.f20402OooOOO);
        o000oo3.OooO00o(f20262OooOOOo, messagingClientEvent.f20404OooOOOO);
    }
}
