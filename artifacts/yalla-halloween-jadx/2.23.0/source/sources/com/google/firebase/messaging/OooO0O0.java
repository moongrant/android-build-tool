package com.google.firebase.messaging;

import com.google.firebase.encoders.proto.AtProtobuf;
import com.google.firebase.encoders.proto.Protobuf;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0O0 implements p294o0O0Ooo0.o0000O0O<p563o0oOo0O0.o00000> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooO0O0 f20263OooO00o = new OooO0O0();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final p294o0O0Ooo0.o0000O0 f20264OooO0O0;

    static {
        AtProtobuf atProtobuf = new AtProtobuf();
        atProtobuf.f20152OooO00o = 1;
        Protobuf protobufOooO00o = atProtobuf.OooO00o();
        HashMap map = new HashMap();
        map.put(protobufOooO00o.annotationType(), protobufOooO00o);
        f20264OooO0O0 = new p294o0O0Ooo0.o0000O0("messagingClientEvent", androidx.compose.material.OooO.OooO0O0(map));
    }

    @Override // p294o0O0Ooo0.o0000oo
    public final void OooO00o(Object obj, p294o0O0Ooo0.o000OO o000oo2) throws IOException {
        o000oo2.OooO00o(f20264OooO0O0, ((p563o0oOo0O0.o00000) obj).f56195OooO00o);
    }
}
