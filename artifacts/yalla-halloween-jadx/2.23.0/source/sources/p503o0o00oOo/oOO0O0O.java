package p503o0o00oOo;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.platform.ComposeView;
import com.code.android.util.o000OO00;
import com.yalla.yalla.model.event.EventModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p147o00Oo0Oo.o000OOo;
import p560o0oOo000.o00000O0;
import p560o0oOo000.o0000OO0;
import p584o0oOooO0.oO00O0oO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class oOO0O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final View f49713OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final ComposeView f49714OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final SnapshotStateList<EventModel> f49715OooO0OO;

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
                    ComposerKt.traceEventStart(1765253930, iIntValue, -1, "com.yalla.yalla.ui.adapter.roomExplore.RoomExploreEventsManager.<anonymous> (RoomExploreEventsManager.kt:29)");
                }
                o00000O0 o00000o1 = o0000OO0.f56183OooO0O0;
                if (o00000o1 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("event");
                    o00000o1 = null;
                }
                o00000o1.OooO0O0(oOO0O0O.this.f49715OooO0OO, composer2, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0O0 f49717OooO0Oo = new OooO0O0();

        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o00000O0 o00000o1 = o0000OO0.f56183OooO0O0;
            if (o00000o1 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("event");
                o00000o1 = null;
            }
            o00000o1.OooO0OO();
            return Unit.INSTANCE;
        }
    }

    public oOO0O0O(@NotNull ViewGroup root) {
        Intrinsics.checkNotNullParameter(root, "root");
        View viewFindViewById = root.findViewById(oO00O0oO.llEventHeader);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "root.findViewById(R.id.llEventHeader)");
        this.f49713OooO00o = viewFindViewById;
        View viewFindViewById2 = root.findViewById(oO00O0oO.eventCompose);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "root.findViewById(R.id.eventCompose)");
        ComposeView composeView = (ComposeView) viewFindViewById2;
        this.f49714OooO0O0 = composeView;
        this.f49715OooO0OO = SnapshotStateKt.mutableStateListOf();
        o000OO00.OooO0O0(viewFindViewById);
        o000OO00.OooO0O0(composeView);
        o000OOo.OooO0Oo(composeView, ComposableLambdaKt.composableLambdaInstance(1765253930, true, new OooO00o()));
        root.findViewById(oO00O0oO.tvEventMore).setOnClickListener(new oOO0O0O0());
    }
}
