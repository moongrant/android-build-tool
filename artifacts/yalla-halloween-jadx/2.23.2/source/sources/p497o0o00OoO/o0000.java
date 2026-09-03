package p497o0o00OoO;

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
import p371o0OOo0oO.oo000o;
import p442o0OoOo0O.o000;
import p587o0oOooOO.t;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nRoomBottomMessageInputComp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomBottomMessageInputComp.kt\ncom/yalla/yalla/ui/activity/room/live/bottom/MessageInputState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,585:1\n81#2:586\n107#2,2:587\n81#2:589\n107#2,2:590\n81#2:592\n107#2,2:593\n81#2:595\n107#2,2:596\n81#2:598\n107#2,2:599\n81#2:601\n107#2,2:602\n81#2:604\n107#2,2:605\n81#2:607\n107#2,2:608\n*S KotlinDebug\n*F\n+ 1 RoomBottomMessageInputComp.kt\ncom/yalla/yalla/ui/activity/room/live/bottom/MessageInputState\n*L\n549#1:586\n549#1:587,2\n552#1:589\n552#1:590,2\n555#1:592\n555#1:593,2\n558#1:595\n558#1:596,2\n563#1:598\n563#1:599,2\n565#1:601\n565#1:602,2\n567#1:604\n567#1:605,2\n570#1:607\n570#1:608,2\n*E\n"})
public final class o0000 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final MutableState f49681OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Context f49682OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final MutableState<Boolean> f49683OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final t f49684OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final o0000oo f49685OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final MutableState f49686OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final Lazy f49687OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final MutableState f49688OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final MutableState f49689OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final MutableState f49690OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final MutableState f49691OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public final MutableState f49692OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NotNull
    public final MutableState f49693OooOOO0;

    public o0000(Context context) {
        Boolean bool = Boolean.FALSE;
        MutableState<Boolean> isRoomAtSelected = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        t facePanelState = new t(false, 511);
        o0000oo panelLayoutState = new o0000oo(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(isRoomAtSelected, "isRoomAtSelected");
        Intrinsics.checkNotNullParameter(facePanelState, "facePanelState");
        Intrinsics.checkNotNullParameter(panelLayoutState, "panelLayoutState");
        this.f49682OooO00o = context;
        this.f49683OooO0O0 = isRoomAtSelected;
        this.f49684OooO0OO = facePanelState;
        this.f49685OooO0Oo = panelLayoutState;
        this.f49687OooO0o0 = LazyKt.lazy(new o0000Ooo(this));
        this.f49686OooO0o = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.f49688OooO0oO = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.f49689OooO0oo = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.f49681OooO = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.f49690OooOO0 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.f49691OooOO0O = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new o000(null), null, 2, null);
        this.f49692OooOO0o = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.f49693OooOOO0 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
    }

    @NotNull
    public final MessageEditText OooO00o() {
        return (MessageEditText) this.f49687OooO0o0.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final oo000o OooO0O0() {
        return (oo000o) this.f49692OooOO0o.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final o000 OooO0OO() {
        return (o000) this.f49691OooOO0O.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean OooO0Oo() {
        return ((Boolean) this.f49688OooO0oO.getValue()).booleanValue();
    }
}
