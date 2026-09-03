package p191o00o0O0O;

import androidx.compose.material.OooO;
import com.google.firebase.encoders.proto.AtProtobuf;
import com.google.firebase.encoders.proto.Protobuf;
import java.io.IOException;
import java.util.HashMap;
import p194o00o0OOO.o000O0Oo;
import p294o0O0Ooo0.o0000O0;
import p294o0O0Ooo0.o0000O0O;
import p294o0O0Ooo0.o000OO;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOOOO implements o0000O0O<o000O0Oo> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooOOOO f38889OooO00o = new OooOOOO();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final o0000O0 f38890OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final o0000O0 f38891OooO0OO;

    static {
        AtProtobuf atProtobuf = new AtProtobuf();
        atProtobuf.f20152OooO00o = 1;
        Protobuf protobufOooO00o = atProtobuf.OooO00o();
        HashMap map = new HashMap();
        map.put(protobufOooO00o.annotationType(), protobufOooO00o);
        f38890OooO0O0 = new o0000O0("currentCacheSizeBytes", OooO.OooO0O0(map));
        AtProtobuf atProtobuf2 = new AtProtobuf();
        atProtobuf2.f20152OooO00o = 2;
        Protobuf protobufOooO00o2 = atProtobuf2.OooO00o();
        HashMap map2 = new HashMap();
        map2.put(protobufOooO00o2.annotationType(), protobufOooO00o2);
        f38891OooO0OO = new o0000O0("maxCacheSizeBytes", OooO.OooO0O0(map2));
    }

    @Override // p294o0O0Ooo0.o0000oo
    public final void OooO00o(Object obj, o000OO o000oo2) throws IOException {
        o000O0Oo o000o0oo2 = (o000O0Oo) obj;
        o000OO o000oo3 = o000oo2;
        o000oo3.OooO0o(f38890OooO0O0, o000o0oo2.f38984OooO00o);
        o000oo3.OooO0o(f38891OooO0OO, o000o0oo2.f38985OooO0O0);
    }
}
