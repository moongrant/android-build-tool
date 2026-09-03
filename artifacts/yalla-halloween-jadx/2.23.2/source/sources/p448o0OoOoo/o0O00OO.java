package p448o0OoOoo;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.yalla.yalla.model.event.EventModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O00OO extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0oO0Ooo f47464OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f47465OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ EventModel f47466OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ int f47467OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O00OO(o0oO0Ooo o0oo0ooo2, EventModel eventModel, int i, int i2) {
        super(2);
        this.f47464OooO0Oo = o0oo0ooo2;
        this.f47466OooO0o0 = eventModel;
        this.f47465OooO0o = i;
        this.f47467OooO0oO = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f47467OooO0oO | 1);
        EventModel eventModel = this.f47466OooO0o0;
        int i = this.f47465OooO0o;
        o0oO0Ooo.OooO0o0(this.f47464OooO0Oo, eventModel, i, composer, iUpdateChangedFlags);
        return Unit.INSTANCE;
    }
}
