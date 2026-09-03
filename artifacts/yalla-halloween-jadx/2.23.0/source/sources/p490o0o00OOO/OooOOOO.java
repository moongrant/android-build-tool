package p490o0o00OOO;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.ui.view.editTextSpan.MessageEditText;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p433o0OoOOo.o0o0Oo;
import p539o0o0OoOO.y0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nRoomBottomMessageInputComp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomBottomMessageInputComp.kt\ncom/yalla/yalla/ui/activity/room/live/bottom/MessageInputState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,584:1\n81#2:585\n107#2,2:586\n81#2:588\n107#2,2:589\n81#2:591\n107#2,2:592\n81#2:594\n107#2,2:595\n81#2:597\n107#2,2:598\n81#2:600\n107#2,2:601\n81#2:603\n107#2,2:604\n81#2:606\n107#2,2:607\n*S KotlinDebug\n*F\n+ 1 RoomBottomMessageInputComp.kt\ncom/yalla/yalla/ui/activity/room/live/bottom/MessageInputState\n*L\n548#1:585\n548#1:586,2\n551#1:588\n551#1:589,2\n554#1:591\n554#1:592,2\n557#1:594\n557#1:595,2\n562#1:597\n562#1:598,2\n564#1:600\n564#1:601,2\n566#1:603\n566#1:604,2\n569#1:606\n569#1:607,2\n*E\n"})
public final class OooOOOO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final MutableState f48496OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Context f48497OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final MutableState<Boolean> f48498OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final y0 f48499OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final OooOo f48500OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final MutableState f48501OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final Lazy f48502OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final MutableState f48503OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final MutableState f48504OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final MutableState f48505OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final MutableState f48506OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public final MutableState f48507OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NotNull
    public final MutableState f48508OooOOO0;

    public OooOOOO(Context context) {
        Boolean bool = Boolean.FALSE;
        MutableState<Boolean> isRoomAtSelected = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        y0 facePanelState = new y0(false, 511);
        OooOo panelLayoutState = new OooOo(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(isRoomAtSelected, "isRoomAtSelected");
        Intrinsics.checkNotNullParameter(facePanelState, "facePanelState");
        Intrinsics.checkNotNullParameter(panelLayoutState, "panelLayoutState");
        this.f48497OooO00o = context;
        this.f48498OooO0O0 = isRoomAtSelected;
        this.f48499OooO0OO = facePanelState;
        this.f48500OooO0Oo = panelLayoutState;
        this.f48502OooO0o0 = LazyKt.lazy(new OooOOO(this));
        this.f48501OooO0o = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.f48503OooO0oO = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.f48504OooO0oo = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.f48496OooO = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.f48505OooOO0 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.f48506OooOO0O = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new o0o0Oo(null), null, 2, null);
        this.f48507OooOO0o = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.f48508OooOOO0 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
    }

    @NotNull
    public final MessageEditText OooO00o() {
        return (MessageEditText) this.f48502OooO0o0.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final p367o0OOo0o0.OooOOOO OooO0O0() {
        return (p367o0OOo0o0.OooOOOO) this.f48507OooOO0o.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final o0o0Oo OooO0OO() {
        return (o0o0Oo) this.f48506OooOO0O.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean OooO0Oo() {
        return ((Boolean) this.f48503OooO0oO.getValue()).booleanValue();
    }
}
