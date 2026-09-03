package p591o0oOooOo;

import com.weieyu.yalla.R;
import com.yalla.yalla.common.model.UserInfoModel;
import com.yalla.yalla.common.ui.view.PremiumLevel;
import com.yalla.yalla.common.ui.view.VipLevel;
import com.yalla.yalla.common.ui.view.VipState;
import com.yalla.yalla.ui.screen.event.EventDetailScreen;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
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
import p254o00ooO0O.o000O0O0;
import p510o0o00oo0.o0O000o0;

/* JADX INFO: loaded from: classes3.dex */
public final class r3 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final r3 f47329OooO00o = new r3();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static Function3<o00O00o0, oOO00O, Integer, Unit> f47330OooO0O0 = (o00) o00O0000.OooO0O0(917822524, false, OooO00o.f47333Oooo0o);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static Function3<o000oOoO, oOO00O, Integer, Unit> f47331OooO0OO = (o00) o00O0000.OooO0O0(1237192939, false, OooO0O0.f47334Oooo0o);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public static Function4<o000oOoO, UserInfoModel, oOO00O, Integer, Unit> f47332OooO0Oo = (o00) o00O0000.OooO0O0(-1918666752, false, OooO0OO.f47335Oooo0o);

    public static final class OooO00o extends Lambda implements Function3<o00O00o0, oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO00o f47333Oooo0o = new OooO00o();

        public OooO00o() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(o00O00o0 o00o00o1, oOO00O ooo00o, Integer num) {
            o00O00o0 EasyContentState = o00o00o1;
            oOO00O ooo00o2 = ooo00o;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(EasyContentState, "$this$EasyContentState");
            if ((iIntValue & 81) == 16 && ooo00o2.OooOo0()) {
                ooo00o2.OooOoo0();
            } else {
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
                o0O000o0.OooO00o(o000O0O0.OooO0OO(R.string.event_has_been_deleted), 0L, R.drawable.ic_empty_delete, null, null, 0L, ooo00o2, 0, 58);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function3<o000oOoO, oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO0O0 f47334Oooo0o = new OooO0O0();

        public OooO0O0() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(o000oOoO o000oooo2, oOO00O ooo00o, Integer num) {
            o000oOoO item = o000oooo2;
            oOO00O ooo00o2 = ooo00o;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((iIntValue & 81) == 16 && ooo00o2.OooOo0()) {
                ooo00o2.OooOoo0();
            } else {
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
                EventDetailScreen eventDetailScreen = EventDetailScreen.f24568OooO00o;
                EventDetailScreen.OooOOo(eventDetailScreen, ooo00o2, 6);
                eventDetailScreen.OooOOO0(o00000.OooO0OO.OooO00o(R.string.event_New_member, ooo00o2), ooo00o2, 48, 0);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function4<o000oOoO, UserInfoModel, oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO0OO f47335Oooo0o = new OooO0OO();

        public OooO0OO() {
            super(4);
        }

        @Override // kotlin.jvm.functions.Function4
        public final Unit invoke(o000oOoO o000oooo2, UserInfoModel userInfoModel, oOO00O ooo00o, Integer num) {
            o000oOoO items = o000oooo2;
            UserInfoModel userInfoModel2 = userInfoModel;
            oOO00O ooo00o2 = ooo00o;
            num.intValue();
            Intrinsics.checkNotNullParameter(items, "$this$items");
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            if (userInfoModel2 != null) {
                EventDetailScreen.f24568OooO00o.OooOO0O(userInfoModel2.getUserHeader(), userInfoModel2.getUserName(), userInfoModel2.getSex(), false, userInfoModel2.isPremium(), PremiumLevel.INSTANCE.OooO00o(Integer.valueOf(userInfoModel2.getPremiumLevel())), userInfoModel2.getVipState() == VipState.Vip.getValue(), VipLevel.INSTANCE.OooO0O0(userInfoModel2.getVipLevel()), new s3(userInfoModel2), ooo00o2, 805306368, 8);
            }
            return Unit.INSTANCE;
        }
    }
}
