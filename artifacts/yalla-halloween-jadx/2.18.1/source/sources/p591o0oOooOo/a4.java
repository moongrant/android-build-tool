package p591o0oOooOo;

import com.yalla.yalla.ui.vm.event.EventCreateViewModel;
import java.util.Calendar;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class a4 extends Lambda implements Function1<Long, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ EventCreateViewModel f47192Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(EventCreateViewModel eventCreateViewModel) {
        super(1);
        this.f47192Oooo0o = eventCreateViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Long l) {
        long jLongValue = l.longValue();
        EventCreateViewModel eventCreateViewModel = this.f47192Oooo0o;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(jLongValue);
        Intrinsics.checkNotNullExpressionValue(calendar, "getInstance()\n          …                        }");
        eventCreateViewModel.setDateModelEnd(calendar);
        return Unit.INSTANCE;
    }
}
