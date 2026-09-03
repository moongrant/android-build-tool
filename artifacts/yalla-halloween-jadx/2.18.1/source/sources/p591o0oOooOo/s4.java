package p591o0oOooOo;

import android.content.Context;
import com.yalla.yalla.model.EventModel;
import com.yalla.yalla.ui.composable.event.EventKt;
import com.yalla.yalla.ui.vm.event.EventViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class s4 extends Lambda implements Function1<EventModel, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ Context f47339Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ EventViewModel f47340Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s4(Context context, EventViewModel eventViewModel) {
        super(1);
        this.f47339Oooo0o = context;
        this.f47340Oooo0oO = eventViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(EventModel eventModel) {
        EventModel it = eventModel;
        Intrinsics.checkNotNullParameter(it, "it");
        EventKt.OooOO0O(this.f47339Oooo0o, it.getHasSubscribe(), new r4(it, this.f47340Oooo0oO));
        return Unit.INSTANCE;
    }
}
