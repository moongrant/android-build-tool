package p577o0oOoOo;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import com.code.android.util.o0000;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p516o0o0O00o.oo00oO;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nLoadingVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoadingVM.kt\ncom/yalla/yalla/ui/vm/LoadingVM\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,27:1\n81#2:28\n107#2,2:29\n*S KotlinDebug\n*F\n+ 1 LoadingVM.kt\ncom/yalla/yalla/ui/vm/LoadingVM\n*L\n17#1:28\n17#1:29,2\n*E\n"})
public final class o0oOo0O0 extends ViewModel {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final oo00oO f56520OooO00o = new oo00oO(false);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final MutableState f56521OooO0O0 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(o0000.OooO0OO(o000000.loading), null, 2, null);

    public static void OooO0O0(o0oOo0O0 o0ooo0o1) {
        String text = o0000.OooO0OO(o000000.loading);
        o0ooo0o1.getClass();
        Intrinsics.checkNotNullParameter(text, "text");
        o0ooo0o1.f56520OooO00o.f51734OooO00o.setValue(Boolean.TRUE);
        Intrinsics.checkNotNullParameter(text, "<set-?>");
        o0ooo0o1.f56521OooO0O0.setValue(text);
    }
}
