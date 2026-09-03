package p598o0oo00O;

import com.yalla.yalla.ui.vm.store.RoomThemeCustomizeVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p028Oooo0o0.o00O0O00;
import p100o000oOoO.oOO00O;

/* JADX INFO: loaded from: classes3.dex */
public final class oO0000O extends Lambda implements Function2<oOO00O, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f47776Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ oO00000o f47777Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o00O0O00 f47778Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ RoomThemeCustomizeVM f47779Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0000O(oO00000o oo00000o, o00O0O00 o00o0o01, RoomThemeCustomizeVM roomThemeCustomizeVM, int i) {
        super(2);
        this.f47777Oooo0o = oo00000o;
        this.f47778Oooo0oO = o00o0o01;
        this.f47779Oooo0oo = roomThemeCustomizeVM;
        this.f47776Oooo = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(oOO00O ooo00o, Integer num) {
        num.intValue();
        oO00000o.OooOOO(this.f47777Oooo0o, this.f47778Oooo0oO, this.f47779Oooo0oo, ooo00o, this.f47776Oooo | 1);
        return Unit.INSTANCE;
    }
}
