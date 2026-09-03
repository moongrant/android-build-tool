package com.yalla.yalla.ui.screen.event;

import com.yalla.yalla.common.model.UserInfoModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p027Oooo0o.o000oOoO;
import p100o000oOoO.o00O000;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;
import p510o0o00oo0.o0O00O;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0OO extends Lambda implements Function3<o000oOoO, oOO00O, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ androidx.paging.compose.OooO0OO<UserInfoModel> f24665Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0OO(androidx.paging.compose.OooO0OO<UserInfoModel> oooO0OO) {
        super(3);
        this.f24665Oooo0o = oooO0OO;
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
            o0O00O.OooO0O0(this.f24665Oooo0o, null, ooo00o2, 8, 2);
        }
        return Unit.INSTANCE;
    }
}
