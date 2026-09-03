package com.yalla.yalla.ui.fragment;

import com.yalla.yalla.ui.screen.event.EventPage;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p100o000oOoO.o00O000;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;
import p587o0oOoo0O.o0OOO00;
import p587o0oOoo0O.o0OOOO00;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0O0 extends Lambda implements Function2<oOO00O, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ EventDisplayChildFragment f24056Oooo0o;

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EventPage.values().length];
            iArr[EventPage.MineSubscribe.ordinal()] = 1;
            iArr[EventPage.MineCreator.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0O0(EventDisplayChildFragment eventDisplayChildFragment) {
        super(2);
        this.f24056Oooo0o = eventDisplayChildFragment;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(oOO00O ooo00o, Integer num) {
        oOO00O ooo00o2 = ooo00o;
        if ((num.intValue() & 11) == 2 && ooo00o2.OooOo0()) {
            ooo00o2.OooOoo0();
        } else {
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            EventPage eventPage = this.f24056Oooo0o.eventPage;
            if (eventPage == null) {
                Intrinsics.throwUninitializedPropertyAccessException("eventPage");
                eventPage = null;
            }
            int i = OooO00o.$EnumSwitchMapping$0[eventPage.ordinal()];
            if (i == 1) {
                ooo00o2.OooO0o0(-870192168);
                o0OOOO00.OooO00o(this.f24056Oooo0o.getEventVM(), ooo00o2, 0);
                ooo00o2.Oooo0o0();
            } else if (i != 2) {
                ooo00o2.OooO0o0(-870192033);
                ooo00o2.Oooo0o0();
            } else {
                ooo00o2.OooO0o0(-870192091);
                o0OOO00.OooO00o(this.f24056Oooo0o.getEventVM(), ooo00o2, 0);
                ooo00o2.Oooo0o0();
            }
        }
        return Unit.INSTANCE;
    }
}
