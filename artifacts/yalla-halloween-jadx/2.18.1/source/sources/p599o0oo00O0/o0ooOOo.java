package p599o0oo00O0;

import com.yalla.yalla.common.vm.LiveRoomVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p100o000oOoO.oOO00O;
import p604o0oo00oO.oO0Oo0oo;

/* JADX INFO: loaded from: classes3.dex */
public final class o0ooOOo extends Lambda implements Function2<oOO00O, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ LiveRoomVM f47992Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ oO0Oo0oo f47993Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ int f47994Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0ooOOo(LiveRoomVM liveRoomVM, oO0Oo0oo oo0oo0oo, int i) {
        super(2);
        this.f47992Oooo0o = liveRoomVM;
        this.f47993Oooo0oO = oo0oo0oo;
        this.f47994Oooo0oo = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(oOO00O ooo00o, Integer num) {
        num.intValue();
        o0OOO0o.OooO0o0(this.f47992Oooo0o, this.f47993Oooo0oO, ooo00o, this.f47994Oooo0oo | 1);
        return Unit.INSTANCE;
    }
}
