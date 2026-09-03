package p591o0oOooOo;

import com.yalla.yalla.model.EventModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p100o000oOoO.oOO00O;

/* JADX INFO: loaded from: classes3.dex */
public final class j5 extends Lambda implements Function2<oOO00O, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f47258Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ f5 f47259Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ EventModel f47260Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f47261Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j5(f5 f5Var, EventModel eventModel, Function0<Unit> function0, int i) {
        super(2);
        this.f47259Oooo0o = f5Var;
        this.f47260Oooo0oO = eventModel;
        this.f47261Oooo0oo = function0;
        this.f47258Oooo = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(oOO00O ooo00o, Integer num) {
        num.intValue();
        f5.OooO0oO(this.f47259Oooo0o, this.f47260Oooo0oO, this.f47261Oooo0oo, ooo00o, this.f47258Oooo | 1);
        return Unit.INSTANCE;
    }
}
