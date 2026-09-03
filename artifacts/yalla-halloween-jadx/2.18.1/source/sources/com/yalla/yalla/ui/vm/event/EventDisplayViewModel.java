package com.yalla.yalla.ui.vm.event;

import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.ui.screen.event.EventPage;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o00OO.OooO00o;
import org.jetbrains.annotations.NotNull;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.o0OOO00;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012R+\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR+\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\f\u0010\u0005\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/yalla/yalla/ui/vm/event/EventDisplayViewModel;", "Lo00OO/OooO00o;", "Lcom/yalla/yalla/ui/screen/event/EventPage;", "<set-?>", "eventPageState$delegate", "Lo000oOoO/o0O00OO;", "getEventPageState", "()Lcom/yalla/yalla/ui/screen/event/EventPage;", "setEventPageState", "(Lcom/yalla/yalla/ui/screen/event/EventPage;)V", "eventPageState", "", "isSquareState$delegate", "isSquareState", "()Z", "setSquareState", "(Z)V", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class EventDisplayViewModel extends OooO00o {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: eventPageState$delegate, reason: from kotlin metadata */
    @NotNull
    private final o0O00OO eventPageState = o0OOO00.OooO0Oo(EventPage.SquareUpcoming);

    /* JADX INFO: renamed from: isSquareState$delegate, reason: from kotlin metadata */
    @NotNull
    private final o0O00OO isSquareState;

    public EventDisplayViewModel() {
        EventPage eventPageState = getEventPageState();
        Objects.requireNonNull(eventPageState);
        int i = EventPage.OooO00o.$EnumSwitchMapping$0[eventPageState.ordinal()];
        boolean z = true;
        if (i != 1 && i != 2) {
            z = false;
        }
        this.isSquareState = o0OOO00.OooO0Oo(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final EventPage getEventPageState() {
        return (EventPage) this.eventPageState.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isSquareState() {
        return ((Boolean) this.isSquareState.getValue()).booleanValue();
    }

    public final void setEventPageState(@NotNull EventPage eventPage) {
        Intrinsics.checkNotNullParameter(eventPage, "<set-?>");
        this.eventPageState.setValue(eventPage);
    }

    public final void setSquareState(boolean z) {
        this.isSquareState.setValue(Boolean.valueOf(z));
    }
}
