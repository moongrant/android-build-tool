package androidx.compose.ui.platform;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class o00OOO0 implements Sequence<o00OOO00> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final List<o00OOO00> f6506OooO00o = new ArrayList();

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<androidx.compose.ui.platform.o00OOO00>] */
    public final void OooO00o(@NotNull String name, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f6506OooO00o.add(new o00OOO00(name, obj));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<androidx.compose.ui.platform.o00OOO00>] */
    @Override // kotlin.sequences.Sequence
    @NotNull
    public final Iterator<o00OOO00> iterator() {
        return this.f6506OooO00o.iterator();
    }
}
