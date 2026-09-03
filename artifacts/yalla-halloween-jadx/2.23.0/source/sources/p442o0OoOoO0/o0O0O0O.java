package p442o0OoOoO0;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.yalla.yalla.model.event.EventModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0O0O extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0O0oo0o f46248OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f46249OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ EventModel f46250OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ int f46251OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0O0O(o0O0oo0o o0o0oo0o, EventModel eventModel, int i, int i2) {
        super(2);
        this.f46248OooO0Oo = o0o0oo0o;
        this.f46250OooO0o0 = eventModel;
        this.f46249OooO0o = i;
        this.f46251OooO0oO = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f46251OooO0oO | 1);
        EventModel eventModel = this.f46250OooO0o0;
        int i = this.f46249OooO0o;
        o0O0oo0o.OooO0o0(this.f46248OooO0Oo, eventModel, i, composer, iUpdateChangedFlags);
        return Unit.INSTANCE;
    }
}
