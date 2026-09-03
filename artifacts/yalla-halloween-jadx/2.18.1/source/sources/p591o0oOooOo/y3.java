package p591o0oOooOo;

import com.yalla.yalla.common.model.EventTagModel;
import com.yalla.yalla.ui.vm.event.EventCreateViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class y3 extends Lambda implements Function1<EventTagModel, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ EventCreateViewModel f47412Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3(EventCreateViewModel eventCreateViewModel) {
        super(1);
        this.f47412Oooo0o = eventCreateViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(EventTagModel eventTagModel) {
        EventTagModel it = eventTagModel;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f47412Oooo0o.setSelectTag(it);
        return Unit.INSTANCE;
    }
}
