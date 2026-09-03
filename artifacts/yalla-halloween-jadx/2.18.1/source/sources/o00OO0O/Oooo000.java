package o00OO0O;

import com.yalla.yalla.model.EventModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p100o000oOoO.oOO00O;

/* JADX INFO: loaded from: classes.dex */
public final class Oooo000 extends Lambda implements Function2<oOO00O, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ EventModel f31367Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ int f31368Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oooo000(EventModel eventModel, int i) {
        super(2);
        this.f31367Oooo0o = eventModel;
        this.f31368Oooo0oO = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(oOO00O ooo00o, Integer num) {
        num.intValue();
        com.yalla.support.common.util.OooOOOO.OooO0O0(this.f31367Oooo0o, ooo00o, this.f31368Oooo0oO | 1);
        return Unit.INSTANCE;
    }
}
