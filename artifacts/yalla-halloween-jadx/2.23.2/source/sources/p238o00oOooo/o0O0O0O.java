package p238o00oOooo;

import com.google.firebase.encoders.proto.AtProtobuf;
import com.google.firebase.encoders.proto.Protobuf;
import java.io.IOException;
import java.util.HashMap;
import o00OOOO0.OooO00o;
import p245o00oo0OO.o000000O;
import p297o0O0OooO.o0000O0;
import p297o0O0OooO.o0000O00;
import p297o0O0OooO.o0000oo;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O0O0O implements o0000oo<o000000O> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final o0O0O0O f39977OooO00o = new o0O0O0O();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final o0000O00 f39978OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final o0000O00 f39979OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final o0000O00 f39980OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final o0000O00 f39981OooO0o0;

    static {
        AtProtobuf atProtobuf = new AtProtobuf();
        atProtobuf.f19680OooO00o = 1;
        Protobuf protobufOooO00o = atProtobuf.OooO00o();
        HashMap map = new HashMap();
        map.put(protobufOooO00o.annotationType(), protobufOooO00o);
        f39978OooO0O0 = new o0000O00("window", OooO00o.OooO00o(map));
        AtProtobuf atProtobuf2 = new AtProtobuf();
        atProtobuf2.f19680OooO00o = 2;
        Protobuf protobufOooO00o2 = atProtobuf2.OooO00o();
        HashMap map2 = new HashMap();
        map2.put(protobufOooO00o2.annotationType(), protobufOooO00o2);
        f39979OooO0OO = new o0000O00("logSourceMetrics", OooO00o.OooO00o(map2));
        AtProtobuf atProtobuf3 = new AtProtobuf();
        atProtobuf3.f19680OooO00o = 3;
        Protobuf protobufOooO00o3 = atProtobuf3.OooO00o();
        HashMap map3 = new HashMap();
        map3.put(protobufOooO00o3.annotationType(), protobufOooO00o3);
        f39980OooO0Oo = new o0000O00("globalMetrics", OooO00o.OooO00o(map3));
        AtProtobuf atProtobuf4 = new AtProtobuf();
        atProtobuf4.f19680OooO00o = 4;
        Protobuf protobufOooO00o4 = atProtobuf4.OooO00o();
        HashMap map4 = new HashMap();
        map4.put(protobufOooO00o4.annotationType(), protobufOooO00o4);
        f39981OooO0o0 = new o0000O00("appNamespace", OooO00o.OooO00o(map4));
    }

    @Override // p297o0O0OooO.o0000
    public final void OooO00o(Object obj, o0000O0 o0000o1) throws IOException {
        o000000O o000000o2 = (o000000O) obj;
        o0000O0 o0000o2 = o0000o1;
        o0000o2.OooO0Oo(f39978OooO0O0, o000000o2.f40100OooO00o);
        o0000o2.OooO0Oo(f39979OooO0OO, o000000o2.f40101OooO0O0);
        o0000o2.OooO0Oo(f39980OooO0Oo, o000000o2.f40102OooO0OO);
        o0000o2.OooO0Oo(f39981OooO0o0, o000000o2.f40103OooO0Oo);
    }
}
