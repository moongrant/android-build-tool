package p286o0O0O0oO;

import com.google.firebase.encoders.proto.AtProtobuf;
import com.google.firebase.encoders.proto.Protobuf;
import java.io.IOException;
import java.util.HashMap;
import o00O.OooO00o;
import o0O0OO0O.OooO;
import p368o0OOo0O.o000oOoO;
import p368o0OOo0O.o0OoOo0;

/* JADX INFO: loaded from: classes2.dex */
public final class Oooo0 implements o000oOoO<OooO> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Oooo0 f35454OooO00o = new Oooo0();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final p368o0OOo0O.Oooo0 f35455OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final p368o0OOo0O.Oooo0 f35456OooO0OO;

    static {
        AtProtobuf atProtobuf = new AtProtobuf();
        atProtobuf.f19087OooO00o = 1;
        Protobuf protobufOooO00o = atProtobuf.OooO00o();
        HashMap map = new HashMap();
        map.put(protobufOooO00o.annotationType(), protobufOooO00o);
        f35455OooO0O0 = new p368o0OOo0O.Oooo0("startMs", OooO00o.OooO00o(map), null);
        AtProtobuf atProtobuf2 = new AtProtobuf();
        atProtobuf2.f19087OooO00o = 2;
        Protobuf protobufOooO00o2 = atProtobuf2.OooO00o();
        HashMap map2 = new HashMap();
        map2.put(protobufOooO00o2.annotationType(), protobufOooO00o2);
        f35456OooO0OO = new p368o0OOo0O.Oooo0("endMs", OooO00o.OooO00o(map2), null);
    }

    @Override // p368o0OOo0O.Oooo000
    public final void OooO00o(Object obj, o0OoOo0 o0oooo1) throws IOException {
        OooO oooO = (OooO) obj;
        o0OoOo0 o0oooo2 = o0oooo1;
        o0oooo2.OooO0O0(f35455OooO0O0, oooO.f35538OooO00o);
        o0oooo2.OooO0O0(f35456OooO0OO, oooO.f35539OooO0O0);
    }
}
