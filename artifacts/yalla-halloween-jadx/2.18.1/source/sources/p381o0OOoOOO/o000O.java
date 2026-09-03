package p381o0OOoOOO;

import com.google.firebase.encoders.proto.AtProtobuf;
import com.google.firebase.encoders.proto.Protobuf;
import java.io.IOException;
import java.util.HashMap;
import o00O.OooO00o;
import p368o0OOo0O.Oooo0;
import p368o0OOo0O.o000oOoO;
import p383o0OOoOo0.o0OoOo0;

/* JADX INFO: loaded from: classes2.dex */
public final class o000O implements o000oOoO<o0OoOo0> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final o000O f38719OooO00o = new o000O();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Oooo0 f38720OooO0O0;

    static {
        AtProtobuf atProtobuf = new AtProtobuf();
        atProtobuf.f19087OooO00o = 1;
        Protobuf protobufOooO00o = atProtobuf.OooO00o();
        HashMap map = new HashMap();
        map.put(protobufOooO00o.annotationType(), protobufOooO00o);
        f38720OooO0O0 = new Oooo0("messagingClientEvent", OooO00o.OooO00o(map), null);
    }

    @Override // p368o0OOo0O.Oooo000
    public final void OooO00o(Object obj, p368o0OOo0O.o0OoOo0 o0oooo1) throws IOException {
        o0oooo1.OooO0Oo(f38720OooO0O0, ((o0OoOo0) obj).f38851OooO00o);
    }
}
