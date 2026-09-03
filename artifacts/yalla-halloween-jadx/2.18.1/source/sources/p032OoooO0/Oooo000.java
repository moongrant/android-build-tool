package p032OoooO0;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p034OoooO0O.o00000O;
import p034OoooO0O.o00000O0;
import p045OooooOo.o00OO00O;

/* JADX INFO: loaded from: classes.dex */
public final class Oooo000 extends Lambda implements Function2<o00OO00O, Long, Long> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o00000O0 f2991Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oooo000(o00000O0 o00000o1) {
        super(2);
        this.f2991Oooo0o = o00000o1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Long invoke(o00OO00O o00oo00o, Long l) {
        o00OO00O Saver = o00oo00o;
        long jLongValue = l.longValue();
        Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
        if (o00000O.OooO00o(this.f2991Oooo0o, jLongValue)) {
            return Long.valueOf(jLongValue);
        }
        return null;
    }
}
