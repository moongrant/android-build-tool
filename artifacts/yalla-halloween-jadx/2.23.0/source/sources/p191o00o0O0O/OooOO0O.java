package p191o00o0O0O;

import androidx.compose.material.OooO;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.firebase.encoders.proto.AtProtobuf;
import com.google.firebase.encoders.proto.Protobuf;
import java.io.IOException;
import java.util.HashMap;
import p294o0O0Ooo0.o0000O0;
import p294o0O0Ooo0.o0000O0O;
import p294o0O0Ooo0.o000OO;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOO0O implements o0000O0O<LogEventDropped> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooOO0O f38881OooO00o = new OooOO0O();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final o0000O0 f38882OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final o0000O0 f38883OooO0OO;

    static {
        AtProtobuf atProtobuf = new AtProtobuf();
        atProtobuf.f20152OooO00o = 1;
        Protobuf protobufOooO00o = atProtobuf.OooO00o();
        HashMap map = new HashMap();
        map.put(protobufOooO00o.annotationType(), protobufOooO00o);
        f38882OooO0O0 = new o0000O0("eventsDroppedCount", OooO.OooO0O0(map));
        AtProtobuf atProtobuf2 = new AtProtobuf();
        atProtobuf2.f20152OooO00o = 3;
        Protobuf protobufOooO00o2 = atProtobuf2.OooO00o();
        HashMap map2 = new HashMap();
        map2.put(protobufOooO00o2.annotationType(), protobufOooO00o2);
        f38883OooO0OO = new o0000O0("reason", OooO.OooO0O0(map2));
    }

    @Override // p294o0O0Ooo0.o0000oo
    public final void OooO00o(Object obj, o000OO o000oo2) throws IOException {
        LogEventDropped logEventDropped = (LogEventDropped) obj;
        o000OO o000oo3 = o000oo2;
        o000oo3.OooO0o(f38882OooO0O0, logEventDropped.f10874OooO00o);
        o000oo3.OooO00o(f38883OooO0OO, logEventDropped.f10875OooO0O0);
    }
}
