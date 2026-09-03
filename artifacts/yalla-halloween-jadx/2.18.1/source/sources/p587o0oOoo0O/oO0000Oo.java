package p587o0oOoo0O;

import com.yalla.yalla.ui.vm.event.EventViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p100o000oOoO.oOO00O;

/* JADX INFO: loaded from: classes3.dex */
public final class oO0000Oo extends Lambda implements Function2<oOO00O, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ ooOOOOoo f47029Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ EventViewModel f47030Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ int f47031Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0000Oo(ooOOOOoo oooooooo, EventViewModel eventViewModel, int i) {
        super(2);
        this.f47029Oooo0o = oooooooo;
        this.f47030Oooo0oO = eventViewModel;
        this.f47031Oooo0oo = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(oOO00O ooo00o, Integer num) {
        num.intValue();
        ooOOOOoo.OooO0Oo(this.f47029Oooo0o, this.f47030Oooo0oO, ooo00o, this.f47031Oooo0oo | 1);
        return Unit.INSTANCE;
    }
}
