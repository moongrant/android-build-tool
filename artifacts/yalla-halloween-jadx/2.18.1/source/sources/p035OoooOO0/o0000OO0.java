package p035OoooOO0;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p145o00Oo0.o00000O0;

/* JADX INFO: loaded from: classes.dex */
public final class o0000OO0 extends RippleDrawable {

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public static boolean f3620OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @Nullable
    public static Method f3621OoooO00;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public boolean f3622Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final boolean f3623Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @Nullable
    public o00000O0 f3624Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @Nullable
    public Integer f3625Oooo0oo;

    @RequiresApi(23)
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public static final OooO00o f3626OooO00o = new OooO00o();

        @DoNotInline
        public final void OooO00o(@NotNull RippleDrawable ripple, int i) {
            Intrinsics.checkNotNullParameter(ripple, "ripple");
            ripple.setRadius(i);
        }
    }

    public o0000OO0(boolean z) {
        super(ColorStateList.valueOf(-16777216), null, z ? new ColorDrawable(-1) : null);
        this.f3623Oooo0o = z;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    @NotNull
    public final Rect getDirtyBounds() {
        if (!this.f3623Oooo0o) {
            this.f3622Oooo = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        Intrinsics.checkNotNullExpressionValue(dirtyBounds, "super.getDirtyBounds()");
        this.f3622Oooo = false;
        return dirtyBounds;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final boolean isProjected() {
        return this.f3622Oooo;
    }
}
