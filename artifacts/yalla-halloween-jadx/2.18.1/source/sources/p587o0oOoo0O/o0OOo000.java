package p587o0oOoo0O;

import com.yalla.yalla.model.EventModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p100o000oOoO.oOO00O;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OOo000 extends Lambda implements Function2<oOO00O, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ ooOOOOoo f47006Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ EventModel f47007Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ int f47008Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OOo000(ooOOOOoo oooooooo, EventModel eventModel, int i) {
        super(2);
        this.f47006Oooo0o = oooooooo;
        this.f47007Oooo0oO = eventModel;
        this.f47008Oooo0oo = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(oOO00O ooo00o, Integer num) {
        num.intValue();
        ooOOOOoo.OooO0OO(this.f47006Oooo0o, this.f47007Oooo0oO, ooo00o, this.f47008Oooo0oo | 1);
        return Unit.INSTANCE;
    }
}
