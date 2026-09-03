package p238o00oOooo;

import com.google.firebase.encoders.proto.AtProtobuf;
import com.google.firebase.encoders.proto.Protobuf;
import java.io.IOException;
import java.util.HashMap;
import o00OOOO0.OooO00o;
import p245o00oo0OO.o00000;
import p297o0O0OooO.o0000O0;
import p297o0O0OooO.o0000O00;
import p297o0O0OooO.o0000oo;

/* JADX INFO: loaded from: classes3.dex */
public final class o0oO0O0o implements o0000oo<o00000> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final o0oO0O0o f40040OooO00o = new o0oO0O0o();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final o0000O00 f40041OooO0O0;

    static {
        AtProtobuf atProtobuf = new AtProtobuf();
        atProtobuf.f19680OooO00o = 1;
        Protobuf protobufOooO00o = atProtobuf.OooO00o();
        HashMap map = new HashMap();
        map.put(protobufOooO00o.annotationType(), protobufOooO00o);
        f40041OooO0O0 = new o0000O00("storageMetrics", OooO00o.OooO00o(map));
    }

    @Override // p297o0O0OooO.o0000
    public final void OooO00o(Object obj, o0000O0 o0000o1) throws IOException {
        o0000o1.OooO0Oo(f40041OooO0O0, ((o00000) obj).f40098OooO00o);
    }
}
