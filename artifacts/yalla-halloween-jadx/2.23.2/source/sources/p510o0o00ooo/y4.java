package p510o0o00ooo;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.LifecycleOwner;
import com.code.android.util.o000O;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.event.EventModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p193o00o0O0O.o0000oo;
import p562o0oOo000.o0OO00O;
import p569o0oOo0o0.o00000OO;
import p569o0oOo0o0.o0OOO0o;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class y4 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final View f50899OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final ComposeView f50900OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final SnapshotStateList<EventModel> f50901OooO0OO;

    public static final class OooO00o extends Lambda implements Function2<Composer, Integer, Unit> {
        public OooO00o() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1765253930, iIntValue, -1, "com.yalla.yalla.ui.adapter.roomExplore.RoomExploreEventsManager.<anonymous> (RoomExploreEventsManager.kt:35)");
                }
                o0OOO0o o0ooo0o2 = o00000OO.f56399OooO0O0;
                if (o0ooo0o2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("event");
                    o0ooo0o2 = null;
                }
                o0ooo0o2.OooO0O0(y4.this.f50901OooO0OO, composer2, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<EventModel, Boolean> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Object f50903OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(Object obj) {
            super(1);
            this.f50903OooO0Oo = obj;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(EventModel eventModel) {
            EventModel it = eventModel;
            Intrinsics.checkNotNullParameter(it, "it");
            long id = it.getId();
            Object obj = this.f50903OooO0Oo;
            return Boolean.valueOf((obj instanceof Long) && id == ((Number) obj).longValue());
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0OO f50904OooO0Oo = new OooO0OO();

        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o0OOO0o o0ooo0o2 = o00000OO.f56399OooO0O0;
            if (o0ooo0o2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("event");
                o0ooo0o2 = null;
            }
            o0ooo0o2.OooO0OO();
            return Unit.INSTANCE;
        }
    }

    public y4(@NotNull ViewGroup root, @NotNull LifecycleOwner viewLifecycleOwner) {
        Intrinsics.checkNotNullParameter(root, "root");
        Intrinsics.checkNotNullParameter(viewLifecycleOwner, "viewLifecycleOwner");
        View viewFindViewById = root.findViewById(o0OO00O.llEventHeader);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f50899OooO00o = viewFindViewById;
        View viewFindViewById2 = root.findViewById(o0OO00O.eventCompose);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        ComposeView composeView = (ComposeView) viewFindViewById2;
        this.f50900OooO0O0 = composeView;
        this.f50901OooO0OO = SnapshotStateKt.mutableStateListOf();
        o000O.OooO0O0(viewFindViewById);
        o000O.OooO0O0(composeView);
        o0000oo.OooO0Oo(composeView, ComposableLambdaKt.composableLambdaInstance(1765253930, true, new OooO00o()));
        LiveEventBus.get("DISLIKE_EVENT").observe(viewLifecycleOwner, new w4(this, 0));
        root.findViewById(o0OO00O.tvEventMore).setOnClickListener(new x4());
    }
}
