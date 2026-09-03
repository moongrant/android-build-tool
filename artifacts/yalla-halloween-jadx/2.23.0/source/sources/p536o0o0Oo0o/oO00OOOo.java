package p536o0o0Oo0o;

import androidx.fragment.app.FragmentActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p402o0Oo0OOO.o00O000o;

/* JADX INFO: loaded from: classes4.dex */
public final class oO00OOOo extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ FragmentActivity f55130OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO00OOOo(FragmentActivity fragmentActivity) {
        super(0);
        this.f55130OooO0Oo = fragmentActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o00O000o.OooOO0 oooOO1 = o00O000o.f44495OooO0o0;
        FragmentActivity fragmentActivity = this.f55130OooO0Oo;
        oooOO1.observe(fragmentActivity, new oO000O0.OooOOO(new oO00OOO(fragmentActivity)));
        return Unit.INSTANCE;
    }
}
