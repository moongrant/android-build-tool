package p587o0oOoo0O;

import com.yalla.yalla.ui.vm.room.RoomEventInfoViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p100o000oOoO.oOO00O;

/* JADX INFO: loaded from: classes3.dex */
public final class oO00OO0O extends Lambda implements Function2<oOO00O, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ oOo00OO0 f47054Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ RoomEventInfoViewModel f47055Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ int f47056Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO00OO0O(oOo00OO0 ooo00oo0, RoomEventInfoViewModel roomEventInfoViewModel, int i) {
        super(2);
        this.f47054Oooo0o = ooo00oo0;
        this.f47055Oooo0oO = roomEventInfoViewModel;
        this.f47056Oooo0oo = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(oOO00O ooo00o, Integer num) {
        num.intValue();
        oOo00OO0.OooO0o(this.f47054Oooo0o, this.f47055Oooo0oO, ooo00o, this.f47056Oooo0oo | 1);
        return Unit.INSTANCE;
    }
}
