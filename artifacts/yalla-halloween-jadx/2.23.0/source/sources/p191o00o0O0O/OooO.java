package p191o00o0O0O;

import com.google.firebase.encoders.proto.AtProtobuf;
import com.google.firebase.encoders.proto.Protobuf;
import java.io.IOException;
import java.util.HashMap;
import p194o00o0OOO.o000O00;
import p294o0O0Ooo0.o0000O0;
import p294o0O0Ooo0.o0000O0O;
import p294o0O0Ooo0.o000OO;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO implements o0000O0O<o000O00> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooO f38874OooO00o = new OooO();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final o0000O0 f38875OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final o0000O0 f38876OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final o0000O0 f38877OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final o0000O0 f38878OooO0o0;

    static {
        AtProtobuf atProtobuf = new AtProtobuf();
        atProtobuf.f20152OooO00o = 1;
        Protobuf protobufOooO00o = atProtobuf.OooO00o();
        HashMap map = new HashMap();
        map.put(protobufOooO00o.annotationType(), protobufOooO00o);
        f38875OooO0O0 = new o0000O0("window", androidx.compose.material.OooO.OooO0O0(map));
        AtProtobuf atProtobuf2 = new AtProtobuf();
        atProtobuf2.f20152OooO00o = 2;
        Protobuf protobufOooO00o2 = atProtobuf2.OooO00o();
        HashMap map2 = new HashMap();
        map2.put(protobufOooO00o2.annotationType(), protobufOooO00o2);
        f38876OooO0OO = new o0000O0("logSourceMetrics", androidx.compose.material.OooO.OooO0O0(map2));
        AtProtobuf atProtobuf3 = new AtProtobuf();
        atProtobuf3.f20152OooO00o = 3;
        Protobuf protobufOooO00o3 = atProtobuf3.OooO00o();
        HashMap map3 = new HashMap();
        map3.put(protobufOooO00o3.annotationType(), protobufOooO00o3);
        f38877OooO0Oo = new o0000O0("globalMetrics", androidx.compose.material.OooO.OooO0O0(map3));
        AtProtobuf atProtobuf4 = new AtProtobuf();
        atProtobuf4.f20152OooO00o = 4;
        Protobuf protobufOooO00o4 = atProtobuf4.OooO00o();
        HashMap map4 = new HashMap();
        map4.put(protobufOooO00o4.annotationType(), protobufOooO00o4);
        f38878OooO0o0 = new o0000O0("appNamespace", androidx.compose.material.OooO.OooO0O0(map4));
    }

    @Override // p294o0O0Ooo0.o0000oo
    public final void OooO00o(Object obj, o000OO o000oo2) throws IOException {
        o000O00 o000o01 = (o000O00) obj;
        o000OO o000oo3 = o000oo2;
        o000oo3.OooO00o(f38875OooO0O0, o000o01.f38975OooO00o);
        o000oo3.OooO00o(f38876OooO0OO, o000o01.f38976OooO0O0);
        o000oo3.OooO00o(f38877OooO0Oo, o000o01.f38977OooO0OO);
        o000oo3.OooO00o(f38878OooO0o0, o000o01.f38978OooO0Oo);
    }
}
