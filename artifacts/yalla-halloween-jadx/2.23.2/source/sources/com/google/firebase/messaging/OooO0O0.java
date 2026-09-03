package com.google.firebase.messaging;

import com.google.firebase.encoders.proto.AtProtobuf;
import com.google.firebase.encoders.proto.Protobuf;
import java.io.IOException;
import java.util.HashMap;
import p307o0O0o0oo.o000O0;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0O0 implements p297o0O0OooO.o0000oo<o000O0> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooO0O0 f19792OooO00o = new OooO0O0();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final p297o0O0OooO.o0000O00 f19793OooO0O0;

    static {
        AtProtobuf atProtobuf = new AtProtobuf();
        atProtobuf.f19680OooO00o = 1;
        Protobuf protobufOooO00o = atProtobuf.OooO00o();
        HashMap map = new HashMap();
        map.put(protobufOooO00o.annotationType(), protobufOooO00o);
        f19793OooO0O0 = new p297o0O0OooO.o0000O00("messagingClientEvent", o00OOOO0.OooO00o.OooO00o(map));
    }

    @Override // p297o0O0OooO.o0000
    public final void OooO00o(Object obj, p297o0O0OooO.o0000O0 o0000o1) throws IOException {
        o0000o1.OooO0Oo(f19793OooO0O0, ((o000O0) obj).f41769OooO00o);
    }
}
