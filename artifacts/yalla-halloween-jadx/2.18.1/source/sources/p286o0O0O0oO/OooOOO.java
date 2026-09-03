package p286o0O0O0oO;

import com.google.firebase.encoders.proto.AtProtobuf;
import com.google.firebase.encoders.proto.Protobuf;
import java.io.IOException;
import java.util.HashMap;
import o00O.OooO00o;
import o0O0OO0O.OooO0O0;
import p368o0OOo0O.Oooo0;
import p368o0OOo0O.o000oOoO;
import p368o0OOo0O.o0OoOo0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO implements o000oOoO<OooO0O0> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooOOO f35439OooO00o = new OooOOO();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Oooo0 f35440OooO0O0;

    static {
        AtProtobuf atProtobuf = new AtProtobuf();
        atProtobuf.f19087OooO00o = 1;
        Protobuf protobufOooO00o = atProtobuf.OooO00o();
        HashMap map = new HashMap();
        map.put(protobufOooO00o.annotationType(), protobufOooO00o);
        f35440OooO0O0 = new Oooo0("storageMetrics", OooO00o.OooO00o(map), null);
    }

    @Override // p368o0OOo0O.Oooo000
    public final void OooO00o(Object obj, o0OoOo0 o0oooo1) throws IOException {
        o0oooo1.OooO0Oo(f35440OooO0O0, ((OooO0O0) obj).f35549OooO00o);
    }
}
