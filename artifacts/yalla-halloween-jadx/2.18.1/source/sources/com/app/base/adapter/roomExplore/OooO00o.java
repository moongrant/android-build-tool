package com.app.base.adapter.roomExplore;

import com.yalla.support.common.util.OooOOOO;
import com.yalla.yalla.model.EventModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p027Oooo0o.o000;
import p027Oooo0o.o000oOoO;
import p043OooooO0.o00O0000;
import p047Oooooo0.o00OO0OO;
import p100o000oOoO.oOO00O;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o extends Lambda implements Function1<o000, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ RoomExploreEventsManager f11388Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO00o(RoomExploreEventsManager roomExploreEventsManager) {
        super(1);
        this.f11388Oooo0o = roomExploreEventsManager;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(o000 o000Var) {
        o000 LazyRow = o000Var;
        Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
        final o00OO0OO<EventModel> o00oo0oo = this.f11388Oooo0o.f11395OooO0o0;
        LazyRow.OooO0OO(o00oo0oo.size(), null, new Function1<Integer, Object>() { // from class: com.app.base.adapter.roomExplore.RoomExploreEventsManager$1$1$invoke$$inlined$itemsIndexed$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Integer num) {
                o00oo0oo.get(num.intValue());
                return null;
            }
        }, o00O0000.OooO0O0(-1091073711, true, new Function4<o000oOoO, Integer, oOO00O, Integer, Unit>() { // from class: com.app.base.adapter.roomExplore.RoomExploreEventsManager$1$1$invoke$$inlined$itemsIndexed$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public final Unit invoke(o000oOoO o000oooo2, Integer num, oOO00O ooo00o, Integer num2) {
                int i;
                o000oOoO items = o000oooo2;
                int iIntValue = num.intValue();
                oOO00O ooo00o2 = ooo00o;
                int iIntValue2 = num2.intValue();
                Intrinsics.checkNotNullParameter(items, "$this$items");
                if ((iIntValue2 & 14) == 0) {
                    i = (ooo00o2.Oooo0oo(items) ? 4 : 2) | iIntValue2;
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 112) == 0) {
                    i |= ooo00o2.OooO(iIntValue) ? 32 : 16;
                }
                if ((i & 731) == 146 && ooo00o2.OooOo0()) {
                    ooo00o2.OooOoo0();
                } else {
                    OooOOOO.OooO0O0((EventModel) o00oo0oo.get(iIntValue), ooo00o2, 8);
                }
                return Unit.INSTANCE;
            }
        }));
        if (this.f11388Oooo0o.f11395OooO0o0.size() >= 5) {
            o00OO0O.OooO00o oooO00o = o00OO0O.OooO00o.f31351OooO00o;
            LazyRow.OooO0O0(null, null, o00OO0O.OooO00o.f31352OooO0O0);
        }
        return Unit.INSTANCE;
    }
}
