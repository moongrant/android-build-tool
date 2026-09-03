package p591o0oOooOo;

import com.yalla.yalla.ui.vm.event.EventCreateViewModel;
import java.util.Calendar;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class z3 extends Lambda implements Function1<Long, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ EventCreateViewModel f47415Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3(EventCreateViewModel eventCreateViewModel) {
        super(1);
        this.f47415Oooo0o = eventCreateViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Long l) {
        long jLongValue = l.longValue();
        this.f47415Oooo0o.getDateModelStart().setTimeInMillis(jLongValue);
        EventCreateViewModel eventCreateViewModel = this.f47415Oooo0o;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis((((long) 2) * 3600000) + jLongValue);
        Intrinsics.checkNotNullExpressionValue(calendar, "getInstance()\n          …                        }");
        eventCreateViewModel.setDateModelEnd(calendar);
        return Unit.INSTANCE;
    }
}
