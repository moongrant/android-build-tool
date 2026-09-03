package p497o0o00OoO;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p372o0OOo0oo.o0Oo0oo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o0000oo implements o0Oo0oo {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Context f49752OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final MutableState<Integer> f49753OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final MutableState<Boolean> f49754OooO0o0;

    public o0000oo() {
        throw null;
    }

    public o0000oo(Context context) {
        MutableState<Boolean> isVisible = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        MutableState<Integer> containerHeight = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(isVisible, "isVisible");
        Intrinsics.checkNotNullParameter(containerHeight, "containerHeight");
        this.f49752OooO0Oo = context;
        this.f49754OooO0o0 = isVisible;
        this.f49753OooO0o = containerHeight;
    }

    @Override // p372o0OOo0oo.o0Oo0oo
    public final void OooO00o(int i) {
        this.f49753OooO0o.setValue(Integer.valueOf(i));
        OooO0O0(i);
    }

    @Override // p372o0OOo0oo.o0Oo0oo
    public final void OooO0O0(int i) {
        this.f49753OooO0o.setValue(Integer.valueOf(i));
        this.f49754OooO0o0.setValue(Boolean.TRUE);
    }

    @Override // p372o0OOo0oo.o0Oo0oo
    public final void OooO0OO() {
        this.f49754OooO0o0.setValue(Boolean.FALSE);
    }

    @Override // p372o0OOo0oo.o0Oo0oo
    @NotNull
    public final Context getContext() {
        return this.f49752OooO0Oo;
    }
}
