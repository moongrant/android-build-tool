package p600o0oo00OO;

import com.weieyu.yalla.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p029Oooo0oO.oo00o;
import p043OooooO0.o00;
import p043OooooO0.o00O0000;
import p100o000oOoO.o00O000;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;
import p254o00ooO0O.o000O0O0;

/* JADX INFO: loaded from: classes3.dex */
public final class o000OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o000OO f48044OooO00o = new o000OO();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static Function3<oo00o, oOO00O, Integer, Unit> f48045OooO0O0 = (o00) o00O0000.OooO0O0(-541834408, false, OooO00o.f48047Oooo0o);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static Function3<oo00o, oOO00O, Integer, Unit> f48046OooO0OO = (o00) o00O0000.OooO0O0(-885622385, false, OooO0O0.f48048Oooo0o);

    public static final class OooO00o extends Lambda implements Function3<oo00o, oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO00o f48047Oooo0o = new OooO00o();

        public OooO00o() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(oo00o oo00oVar, oOO00O ooo00o, Integer num) {
            oo00o item = oo00oVar;
            oOO00O ooo00o2 = ooo00o;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((iIntValue & 81) == 16 && ooo00o2.OooOo0()) {
                ooo00o2.OooOoo0();
            } else {
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
                o0000O.OooO(o0000O.f48009OooO00o, R.drawable.icon_header_frame_item_unlock, o000O0O0.OooO0OO(R.string.header_frame_title_unlocked), 20, ooo00o2, 3456, 0);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function3<oo00o, oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO0O0 f48048Oooo0o = new OooO0O0();

        public OooO0O0() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(oo00o oo00oVar, oOO00O ooo00o, Integer num) {
            oo00o item = oo00oVar;
            oOO00O ooo00o2 = ooo00o;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((iIntValue & 81) == 16 && ooo00o2.OooOo0()) {
                ooo00o2.OooOoo0();
            } else {
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
                o0000O.OooO(o0000O.f48009OooO00o, R.drawable.icon_header_frame_item_not_unlock, o000O0O0.OooO0OO(R.string.header_frame_title_locked), 35, ooo00o2, 3456, 0);
            }
            return Unit.INSTANCE;
        }
    }
}
