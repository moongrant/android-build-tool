package p286o0O0O0oO;

import com.google.firebase.encoders.proto.AtProtobuf;
import com.google.firebase.encoders.proto.Protobuf;
import java.io.IOException;
import java.util.HashMap;
import o00O.OooO00o;
import o0O0OO0O.OooO0OO;
import p368o0OOo0O.Oooo0;
import p368o0OOo0O.o000oOoO;
import p368o0OOo0O.o0OoOo0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOo00 implements o000oOoO<OooO0OO> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooOo00 f35451OooO00o = new OooOo00();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Oooo0 f35452OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final Oooo0 f35453OooO0OO;

    static {
        AtProtobuf atProtobuf = new AtProtobuf();
        atProtobuf.f19087OooO00o = 1;
        Protobuf protobufOooO00o = atProtobuf.OooO00o();
        HashMap map = new HashMap();
        map.put(protobufOooO00o.annotationType(), protobufOooO00o);
        f35452OooO0O0 = new Oooo0("logSource", OooO00o.OooO00o(map), null);
        AtProtobuf atProtobuf2 = new AtProtobuf();
        atProtobuf2.f19087OooO00o = 2;
        Protobuf protobufOooO00o2 = atProtobuf2.OooO00o();
        HashMap map2 = new HashMap();
        map2.put(protobufOooO00o2.annotationType(), protobufOooO00o2);
        f35453OooO0OO = new Oooo0("logEventDropped", OooO00o.OooO00o(map2), null);
    }

    @Override // p368o0OOo0O.Oooo000
    public final void OooO00o(Object obj, o0OoOo0 o0oooo1) throws IOException {
        OooO0OO oooO0OO = (OooO0OO) obj;
        o0OoOo0 o0oooo2 = o0oooo1;
        o0oooo2.OooO0Oo(f35452OooO0O0, oooO0OO.f35551OooO00o);
        o0oooo2.OooO0Oo(f35453OooO0OO, oooO0OO.f35552OooO0O0);
    }
}
