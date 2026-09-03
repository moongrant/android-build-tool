package p187o00o00oo;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Stable
@SourceDebugExtension({"SMAP\nWebView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebView.kt\ncom/google/accompanist/web/WebViewState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,551:1\n76#2:552\n102#2,2:553\n76#2:555\n102#2,2:556\n76#2:558\n102#2,2:559\n76#2:561\n102#2,2:562\n76#2:564\n102#2,2:565\n*S KotlinDebug\n*F\n+ 1 WebView.kt\ncom/google/accompanist/web/WebViewState\n*L\n312#1:552\n312#1:553,2\n318#1:555\n318#1:556,2\n324#1:558\n324#1:559,2\n336#1:561\n336#1:562,2\n342#1:564\n342#1:565,2\n*E\n"})
public final class o00OO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final MutableState f38750OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final MutableState f38751OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final MutableState f38752OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final MutableState f38753OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final SnapshotStateList<oo0o0O0> f38754OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final MutableState f38755OooO0o0;

    public o00OO0O0(@NotNull o00O0OO0.OooO0O0 webContent) {
        Intrinsics.checkNotNullParameter(webContent, "webContent");
        this.f38750OooO00o = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.f38751OooO0O0 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(webContent, null, 2, null);
        this.f38752OooO0OO = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(o00O0O0O.OooO0O0.f38711OooO00o, null, 2, null);
        this.f38753OooO0Oo = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.f38755OooO0o0 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.f38754OooO0o = SnapshotStateKt.mutableStateListOf();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final o00O0O0O OooO00o() {
        return (o00O0O0O) this.f38752OooO0OO.getValue();
    }
}
