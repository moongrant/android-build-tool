package p587o0oOoo0O;

import com.yalla.yalla.ui.vm.event.EventViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class oO000 extends Lambda implements Function1<Long, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ EventViewModel f47019Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO000(EventViewModel eventViewModel) {
        super(1);
        this.f47019Oooo0o = eventViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Long l) {
        Long it = l;
        EventViewModel eventViewModel = this.f47019Oooo0o;
        Intrinsics.checkNotNullExpressionValue(it, "it");
        eventViewModel.updateReadState(it.longValue());
        return Unit.INSTANCE;
    }
}
