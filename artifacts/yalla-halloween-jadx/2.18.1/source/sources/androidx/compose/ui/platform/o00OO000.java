package androidx.compose.ui.platform;

import android.graphics.Rect;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class o00OO000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o00000O0.o00O0O f6504OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final Rect f6505OooO0O0;

    public o00OO000(@NotNull o00000O0.o00O0O semanticsNode, @NotNull Rect adjustedBounds) {
        Intrinsics.checkNotNullParameter(semanticsNode, "semanticsNode");
        Intrinsics.checkNotNullParameter(adjustedBounds, "adjustedBounds");
        this.f6504OooO00o = semanticsNode;
        this.f6505OooO0O0 = adjustedBounds;
    }
}
