package p490o0o00OOO;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p366o0OOo0o.OooOOO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class OooOo implements OooOOO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Context f48509OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final MutableState<Integer> f48510OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final MutableState<Boolean> f48511OooO0o0;

    public OooOo() {
        throw null;
    }

    public OooOo(Context context) {
        MutableState<Boolean> isVisible = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        MutableState<Integer> containerHeight = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(isVisible, "isVisible");
        Intrinsics.checkNotNullParameter(containerHeight, "containerHeight");
        this.f48509OooO0Oo = context;
        this.f48511OooO0o0 = isVisible;
        this.f48510OooO0o = containerHeight;
    }

    @Override // p366o0OOo0o.OooOOO
    public final void OooO00o(int i) {
        this.f48510OooO0o.setValue(Integer.valueOf(i));
        OooO0O0(i);
    }

    @Override // p366o0OOo0o.OooOOO
    public final void OooO0O0(int i) {
        this.f48510OooO0o.setValue(Integer.valueOf(i));
        this.f48511OooO0o0.setValue(Boolean.TRUE);
    }

    @Override // p366o0OOo0o.OooOOO
    public final void OooO0OO() {
        this.f48511OooO0o0.setValue(Boolean.FALSE);
    }

    @Override // p366o0OOo0o.OooOOO
    @NotNull
    public final Context getContext() {
        return this.f48509OooO0Oo;
    }
}
