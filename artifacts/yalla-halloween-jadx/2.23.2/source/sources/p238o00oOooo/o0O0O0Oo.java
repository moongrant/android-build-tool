package p238o00oOooo;

import com.google.firebase.encoders.proto.AtProtobuf;
import com.google.firebase.encoders.proto.Protobuf;
import java.io.IOException;
import java.util.HashMap;
import o00OOOO0.OooO00o;
import p245o00oo0OO.o00000O0;
import p297o0O0OooO.o0000O0;
import p297o0O0OooO.o0000O00;
import p297o0O0OooO.o0000oo;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O0O0Oo implements o0000oo<o00000O0> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final o0O0O0Oo f39982OooO00o = new o0O0O0Oo();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final o0000O00 f39983OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final o0000O00 f39984OooO0OO;

    static {
        AtProtobuf atProtobuf = new AtProtobuf();
        atProtobuf.f19680OooO00o = 1;
        Protobuf protobufOooO00o = atProtobuf.OooO00o();
        HashMap map = new HashMap();
        map.put(protobufOooO00o.annotationType(), protobufOooO00o);
        f39983OooO0O0 = new o0000O00("logSource", OooO00o.OooO00o(map));
        AtProtobuf atProtobuf2 = new AtProtobuf();
        atProtobuf2.f19680OooO00o = 2;
        Protobuf protobufOooO00o2 = atProtobuf2.OooO00o();
        HashMap map2 = new HashMap();
        map2.put(protobufOooO00o2.annotationType(), protobufOooO00o2);
        f39984OooO0OO = new o0000O00("logEventDropped", OooO00o.OooO00o(map2));
    }

    @Override // p297o0O0OooO.o0000
    public final void OooO00o(Object obj, o0000O0 o0000o1) throws IOException {
        o00000O0 o00000o1 = (o00000O0) obj;
        o0000O0 o0000o2 = o0000o1;
        o0000o2.OooO0Oo(f39983OooO0O0, o00000o1.f40111OooO00o);
        o0000o2.OooO0Oo(f39984OooO0OO, o00000o1.f40112OooO0O0);
    }
}
