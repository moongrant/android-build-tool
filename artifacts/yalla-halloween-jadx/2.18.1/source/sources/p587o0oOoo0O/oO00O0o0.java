package p587o0oOoo0O;

import com.yalla.yalla.model.EventModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p100o000oOoO.oOO00O;

/* JADX INFO: loaded from: classes3.dex */
public final class oO00O0o0 extends Lambda implements Function2<oOO00O, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f47047Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ oOo00OO0 f47048Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ EventModel f47049Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ int f47050Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO00O0o0(oOo00OO0 ooo00oo0, EventModel eventModel, int i, int i2) {
        super(2);
        this.f47048Oooo0o = ooo00oo0;
        this.f47049Oooo0oO = eventModel;
        this.f47050Oooo0oo = i;
        this.f47047Oooo = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(oOO00O ooo00o, Integer num) {
        num.intValue();
        oOo00OO0.OooO0o0(this.f47048Oooo0o, this.f47049Oooo0oO, this.f47050Oooo0oo, ooo00o, this.f47047Oooo | 1);
        return Unit.INSTANCE;
    }
}
