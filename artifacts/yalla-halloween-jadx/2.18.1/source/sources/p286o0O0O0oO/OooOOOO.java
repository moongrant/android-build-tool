package p286o0O0O0oO;

import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.firebase.encoders.proto.AtProtobuf;
import com.google.firebase.encoders.proto.Protobuf;
import java.io.IOException;
import java.util.HashMap;
import o00O.OooO00o;
import p368o0OOo0O.Oooo0;
import p368o0OOo0O.o000oOoO;
import p368o0OOo0O.o0OoOo0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOOO implements o000oOoO<LogEventDropped> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooOOOO f35446OooO00o = new OooOOOO();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Oooo0 f35447OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final Oooo0 f35448OooO0OO;

    static {
        AtProtobuf atProtobuf = new AtProtobuf();
        atProtobuf.f19087OooO00o = 1;
        Protobuf protobufOooO00o = atProtobuf.OooO00o();
        HashMap map = new HashMap();
        map.put(protobufOooO00o.annotationType(), protobufOooO00o);
        f35447OooO0O0 = new Oooo0("eventsDroppedCount", OooO00o.OooO00o(map), null);
        AtProtobuf atProtobuf2 = new AtProtobuf();
        atProtobuf2.f19087OooO00o = 3;
        Protobuf protobufOooO00o2 = atProtobuf2.OooO00o();
        HashMap map2 = new HashMap();
        map2.put(protobufOooO00o2.annotationType(), protobufOooO00o2);
        f35448OooO0OO = new Oooo0("reason", OooO00o.OooO00o(map2), null);
    }

    @Override // p368o0OOo0O.Oooo000
    public final void OooO00o(Object obj, o0OoOo0 o0oooo1) throws IOException {
        LogEventDropped logEventDropped = (LogEventDropped) obj;
        o0OoOo0 o0oooo2 = o0oooo1;
        o0oooo2.OooO0O0(f35447OooO0O0, logEventDropped.f13083OooO00o);
        o0oooo2.OooO0Oo(f35448OooO0OO, logEventDropped.f13084OooO0O0);
    }
}
