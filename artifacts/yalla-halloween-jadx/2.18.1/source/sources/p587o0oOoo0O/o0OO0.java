package p587o0oOoo0O;

import com.weieyu.yalla.R;
import com.yalla.yalla.model.EventModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o00000.OooO0OO;
import org.jetbrains.annotations.NotNull;
import p027Oooo0o.o000oOoO;
import p028Oooo0o0.o00O00o0;
import p043OooooO0.o00;
import p043OooooO0.o00O0000;
import p100o000oOoO.o00O000;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;
import p510o0o00oo0.o0O000o0;
import p574o0oOoO0.o00O000o;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o0OO0 f46977OooO00o = new o0OO0();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static Function3<o00O00o0, oOO00O, Integer, Unit> f46978OooO0O0 = (o00) o00O0000.OooO0O0(-847110819, false, OooO00o.f46980Oooo0o);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static Function4<o000oOoO, EventModel, oOO00O, Integer, Unit> f46979OooO0OO = (o00) o00O0000.OooO0O0(106264425, false, OooO0O0.f46981Oooo0o);

    public static final class OooO00o extends Lambda implements Function3<o00O00o0, oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO00o f46980Oooo0o = new OooO00o();

        public OooO00o() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(o00O00o0 o00o00o1, oOO00O ooo00o, Integer num) {
            o00O00o0 PagingContentState = o00o00o1;
            oOO00O ooo00o2 = ooo00o;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(PagingContentState, "$this$PagingContentState");
            if ((iIntValue & 81) == 16 && ooo00o2.OooOo0()) {
                ooo00o2.OooOoo0();
            } else {
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
                o0O000o0.OooO00o(OooO0OO.OooO00o(R.string.event_no_data, ooo00o2), 0L, 0, null, null, 0L, ooo00o2, 0, 62);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function4<o000oOoO, EventModel, oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO0O0 f46981Oooo0o = new OooO0O0();

        public OooO0O0() {
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
                o00O000o.f45671OooO00o.OooO0o0(eventModel2, new o0OO0O0(eventModel2), ooo00o2, 392);
            }
            return Unit.INSTANCE;
        }
    }
}
