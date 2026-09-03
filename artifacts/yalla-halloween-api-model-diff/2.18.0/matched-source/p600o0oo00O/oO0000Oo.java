package p600o0oo00O;

import com.yalla.yalla.ui.vm.store.RoomThemeCustomizeVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p028Oooo0o0.o00O0O00;
import p100o000oOoO.oOO00O;

/* JADX INFO: loaded from: classes3.dex */
public final class oO0000Oo extends Lambda implements Function2<oOO00O, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ oO0000O f47795Oooo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ RoomThemeCustomizeVM f47796OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ o00O0O00 f47797OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final /* synthetic */ int f47798OoooO0O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0000Oo(oO0000O oo0000o, o00O0O00 o00o0o01, RoomThemeCustomizeVM roomThemeCustomizeVM, int i) {
        super(2);
        this.f47795Oooo = oo0000o;
        this.f47797OoooO00 = o00o0o01;
        this.f47796OoooO0 = roomThemeCustomizeVM;
        this.f47798OoooO0O = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(oOO00O ooo00o, Integer num) {
        num.intValue();
        oO0000O.OooOOO(this.f47795Oooo, this.f47797OoooO00, this.f47796OoooO0, ooo00o, this.f47798OoooO0O | 1);
        return Unit.INSTANCE;
    }
}
