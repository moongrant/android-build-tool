package p571o0oOoOO;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import com.code.android.util.o0000;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p507o0o00ooo.x0;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nLoadingVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoadingVM.kt\ncom/yalla/yalla/ui/vm/LoadingVM\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,27:1\n81#2:28\n107#2,2:29\n*S KotlinDebug\n*F\n+ 1 LoadingVM.kt\ncom/yalla/yalla/ui/vm/LoadingVM\n*L\n17#1:28\n17#1:29,2\n*E\n"})
public final class o0O0OOO0 extends ViewModel {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final x0 f56243OooO00o = new x0(false);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final MutableState f56244OooO0O0 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(o0000.OooO0OO(oO00OOo0.loading), null, 2, null);

    public static void OooO0O0(o0O0OOO0 o0o0ooo0) {
        String text = o0000.OooO0OO(oO00OOo0.loading);
        o0o0ooo0.getClass();
        Intrinsics.checkNotNullParameter(text, "text");
        o0o0ooo0.f56243OooO00o.f50363OooO00o.setValue(Boolean.TRUE);
        Intrinsics.checkNotNullParameter(text, "<set-?>");
        o0o0ooo0.f56244OooO0O0.setValue(text);
    }
}
