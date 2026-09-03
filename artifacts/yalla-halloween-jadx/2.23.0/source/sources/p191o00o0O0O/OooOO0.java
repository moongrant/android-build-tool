package p191o00o0O0O;

import androidx.compose.material.OooO;
import com.google.firebase.encoders.proto.AtProtobuf;
import com.google.firebase.encoders.proto.Protobuf;
import java.io.IOException;
import java.util.HashMap;
import p194o00o0OOO.o000O00O;
import p294o0O0Ooo0.o0000O0;
import p294o0O0Ooo0.o0000O0O;
import p294o0O0Ooo0.o000OO;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOO0 implements o0000O0O<o000O00O> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooOO0 f38879OooO00o = new OooOO0();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final o0000O0 f38880OooO0O0;

    static {
        AtProtobuf atProtobuf = new AtProtobuf();
        atProtobuf.f20152OooO00o = 1;
        Protobuf protobufOooO00o = atProtobuf.OooO00o();
        HashMap map = new HashMap();
        map.put(protobufOooO00o.annotationType(), protobufOooO00o);
        f38880OooO0O0 = new o0000O0("storageMetrics", OooO.OooO0O0(map));
    }

    @Override // p294o0O0Ooo0.o0000oo
    public final void OooO00o(Object obj, o000OO o000oo2) throws IOException {
        o000oo2.OooO00o(f38880OooO0O0, ((o000O00O) obj).f38983OooO00o);
    }
}
