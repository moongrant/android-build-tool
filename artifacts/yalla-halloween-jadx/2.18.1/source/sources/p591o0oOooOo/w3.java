package p591o0oOooOo;

import com.yalla.yalla.model.EventModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p027Oooo0o.o000oOoO;
import p043OooooO0.o00;
import p043OooooO0.o00O0000;
import p100o000oOoO.o00O000;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;

/* JADX INFO: loaded from: classes3.dex */
public final class w3 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final w3 f47356OooO00o = new w3();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static Function4<o000oOoO, EventModel, oOO00O, Integer, Unit> f47357OooO0O0 = (o00) o00O0000.OooO0O0(-2032324161, false, OooO00o.f47358Oooo0o);

    public static final class OooO00o extends Lambda implements Function4<o000oOoO, EventModel, oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO00o f47358Oooo0o = new OooO00o();

        public OooO00o() {
            super(4);
        }

        @Override // kotlin.jvm.functions.Function4
        public final Unit invoke(o000oOoO o000oooo2, EventModel eventModel, oOO00O ooo00o, Integer num) {
            o000oOoO items = o000oooo2;
            EventModel eventModel2 = eventModel;
            oOO00O ooo00o2 = ooo00o;
            num.intValue();
            Intrinsics.checkNotNullParameter(items, "$this$items");
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            if (eventModel2 != null) {
                f5.OooO0oO(f5.f47232OooO00o, eventModel2, new v3(eventModel2), ooo00o2, 392);
            }
            return Unit.INSTANCE;
        }
    }
}
