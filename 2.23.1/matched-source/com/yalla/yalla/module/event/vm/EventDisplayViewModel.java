package com.yalla.yalla.module.event.vm;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.module.event.ui.screen.EventPage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p396o0Oo0.OooOO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012R+\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR+\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\f\u0010\u0005\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/yalla/yalla/module/event/vm/EventDisplayViewModel;", "Lo0Oo0/OooOO0;", "Lcom/yalla/yalla/module/event/ui/screen/EventPage;", "<set-?>", "eventPageState$delegate", "Landroidx/compose/runtime/MutableState;", "getEventPageState", "()Lcom/yalla/yalla/module/event/ui/screen/EventPage;", "setEventPageState", "(Lcom/yalla/yalla/module/event/ui/screen/EventPage;)V", "eventPageState", "", "isSquareState$delegate", "isSquareState", "()Z", "setSquareState", "(Z)V", "<init>", "()V", "Event_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nEventDisplayViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventDisplayViewModel.kt\ncom/yalla/yalla/module/event/vm/EventDisplayViewModel\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,12:1\n81#2:13\n107#2,2:14\n81#2:16\n107#2,2:17\n*S KotlinDebug\n*F\n+ 1 EventDisplayViewModel.kt\ncom/yalla/yalla/module/event/vm/EventDisplayViewModel\n*L\n10#1:13\n10#1:14,2\n11#1:16\n11#1:17,2\n*E\n"})
public final class EventDisplayViewModel extends OooOO0 {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: eventPageState$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState eventPageState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(EventPage.SquareUpcoming, null, 2, null);

    /* JADX INFO: renamed from: isSquareState$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState isSquareState;

    public EventDisplayViewModel() {
        EventPage eventPageState = getEventPageState();
        eventPageState.getClass();
        int i = EventPage.OooO00o.$EnumSwitchMapping$0[eventPageState.ordinal()];
        boolean z = true;
        if (i != 1 && i != 2) {
            z = false;
        }
        this.isSquareState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z), null, 2, null);
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
