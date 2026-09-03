package p604o0oo00oO;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import com.weieyu.yalla.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p100o000oOoO.o0OOO00;
import p254o00ooO0O.o000O0O0;
import p571o0oOo0o.o00O0O00;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class oO0Oo0oo extends ViewModel {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o00O0O00 f48285OooO00o = new o00O0O00();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f48286OooO0O0 = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(o000O0O0.OooO0OO(R.string.loading));

    public final void OooO0O0(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f48285OooO00o.f45559OooO00o.setValue(Boolean.TRUE);
        Intrinsics.checkNotNullParameter(text, "<set-?>");
        this.f48286OooO0O0.setValue(text);
    }
}
