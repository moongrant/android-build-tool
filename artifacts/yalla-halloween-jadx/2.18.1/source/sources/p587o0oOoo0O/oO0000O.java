package p587o0oOoo0O;

import android.content.Context;
import androidx.compose.foundation.layout.SizeKt;
import androidx.paging.compose.OooO0OO;
import com.yalla.yalla.model.EventModel;
import com.yalla.yalla.ui.vm.event.EventViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p027Oooo0o.Oooo000;
import p027Oooo0o.o000O00O;
import p028Oooo0o0.o00O00o0;
import p048OoooooO.o00OOOO0;
import p100o000oOoO.o00O000;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;

/* JADX INFO: loaded from: classes3.dex */
public final class oO0000O extends Lambda implements Function3<o00O00o0, oOO00O, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ EventViewModel f47025Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o000O00O f47026Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ OooO0OO<EventModel> f47027Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ Context f47028Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0000O(o000O00O o000o00o2, OooO0OO<EventModel> oooO0OO, Context context, EventViewModel eventViewModel) {
        super(3);
        this.f47026Oooo0o = o000o00o2;
        this.f47027Oooo0oO = oooO0OO;
        this.f47028Oooo0oo = context;
        this.f47025Oooo = eventViewModel;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(o00O00o0 o00o00o1, oOO00O ooo00o, Integer num) {
        o00O00o0 RefreshContentStatus = o00o00o1;
        oOO00O ooo00o2 = ooo00o;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(RefreshContentStatus, "$this$RefreshContentStatus");
        if ((iIntValue & 81) == 16 && ooo00o2.OooOo0()) {
            ooo00o2.OooOoo0();
        } else {
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            Oooo000.OooO00o(SizeKt.OooO0o0(o00OOOO0.OooO00o.f4198Oooo0o), this.f47026Oooo0o, null, false, null, null, null, false, new oO00000o(this.f47027Oooo0oO, this.f47028Oooo0oo, this.f47025Oooo), ooo00o2, 6, 252);
        }
        return Unit.INSTANCE;
    }
}
