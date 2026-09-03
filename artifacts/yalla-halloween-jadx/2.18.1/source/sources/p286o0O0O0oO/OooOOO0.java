package p286o0O0O0oO;

import com.google.firebase.encoders.proto.AtProtobuf;
import com.google.firebase.encoders.proto.Protobuf;
import java.io.IOException;
import java.util.HashMap;
import o0O0OO0O.OooO00o;
import p368o0OOo0O.Oooo0;
import p368o0OOo0O.o000oOoO;
import p368o0OOo0O.o0OoOo0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO0 implements o000oOoO<OooO00o> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooOOO0 f35441OooO00o = new OooOOO0();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Oooo0 f35442OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final Oooo0 f35443OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final Oooo0 f35444OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final Oooo0 f35445OooO0o0;

    static {
        AtProtobuf atProtobuf = new AtProtobuf();
        atProtobuf.f19087OooO00o = 1;
        Protobuf protobufOooO00o = atProtobuf.OooO00o();
        HashMap map = new HashMap();
        map.put(protobufOooO00o.annotationType(), protobufOooO00o);
        f35442OooO0O0 = new Oooo0("window", o00O.OooO00o.OooO00o(map), null);
        AtProtobuf atProtobuf2 = new AtProtobuf();
        atProtobuf2.f19087OooO00o = 2;
        Protobuf protobufOooO00o2 = atProtobuf2.OooO00o();
        HashMap map2 = new HashMap();
        map2.put(protobufOooO00o2.annotationType(), protobufOooO00o2);
        f35443OooO0OO = new Oooo0("logSourceMetrics", o00O.OooO00o.OooO00o(map2), null);
        AtProtobuf atProtobuf3 = new AtProtobuf();
        atProtobuf3.f19087OooO00o = 3;
        Protobuf protobufOooO00o3 = atProtobuf3.OooO00o();
        HashMap map3 = new HashMap();
        map3.put(protobufOooO00o3.annotationType(), protobufOooO00o3);
        f35444OooO0Oo = new Oooo0("globalMetrics", o00O.OooO00o.OooO00o(map3), null);
        AtProtobuf atProtobuf4 = new AtProtobuf();
        atProtobuf4.f19087OooO00o = 4;
        Protobuf protobufOooO00o4 = atProtobuf4.OooO00o();
        HashMap map4 = new HashMap();
        map4.put(protobufOooO00o4.annotationType(), protobufOooO00o4);
        f35445OooO0o0 = new Oooo0("appNamespace", o00O.OooO00o.OooO00o(map4), null);
    }

    @Override // p368o0OOo0O.Oooo000
    public final void OooO00o(Object obj, o0OoOo0 o0oooo1) throws IOException {
        OooO00o oooO00o = (OooO00o) obj;
        o0OoOo0 o0oooo2 = o0oooo1;
        o0oooo2.OooO0Oo(f35442OooO0O0, oooO00o.f35541OooO00o);
        o0oooo2.OooO0Oo(f35443OooO0OO, oooO00o.f35542OooO0O0);
        o0oooo2.OooO0Oo(f35444OooO0Oo, oooO00o.f35543OooO0OO);
        o0oooo2.OooO0Oo(f35445OooO0o0, oooO00o.f35544OooO0Oo);
    }
}
