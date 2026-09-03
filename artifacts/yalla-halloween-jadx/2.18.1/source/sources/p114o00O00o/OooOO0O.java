package p114o00O00o;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.KotlinVersion;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import o00O0O.OooOo;
import o00O0O.OooOo00;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p100o000oOoO.o0OOO00;
import p100o000oOoO.oo0oO0;
import p145o00Oo0.OooOOO;
import p145o00Oo0.OooOOOO;
import p145o00Oo0.o00000O;
import p145o00Oo0.o0O0O00;
import p191o00o0O.o0Oo0oo;
import p263o00ooo.o000OO0O;

/* JADX INFO: loaded from: classes.dex */
@Stable
public final class OooOO0O extends o000OO0O implements oo0oO0 {

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    @NotNull
    public final OooO0O0 f30268OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @NotNull
    public final Drawable f30269OoooO0;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f30270OoooO0O;

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            iArr[LayoutDirection.Ltr.ordinal()] = 1;
            iArr[LayoutDirection.Rtl.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class OooO0O0 implements Drawable.Callback {
        public OooO0O0() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.graphics.drawable.Drawable.Callback
        public final void invalidateDrawable(@NotNull Drawable who) {
            Intrinsics.checkNotNullParameter(who, "who");
            OooOO0O oooOO0O = OooOO0O.this;
            oooOO0O.f30270OoooO0O.setValue(Integer.valueOf(((Number) oooOO0O.f30270OoooO0O.getValue()).intValue() + 1));
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void scheduleDrawable(@NotNull Drawable who, @NotNull Runnable what, long j) {
            Intrinsics.checkNotNullParameter(who, "who");
            Intrinsics.checkNotNullParameter(what, "what");
            ((Handler) OooOOO0.f30273OooO00o.getValue()).postAtTime(what, j);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void unscheduleDrawable(@NotNull Drawable who, @NotNull Runnable what) {
            Intrinsics.checkNotNullParameter(who, "who");
            Intrinsics.checkNotNullParameter(what, "what");
            ((Handler) OooOOO0.f30273OooO00o.getValue()).removeCallbacks(what);
        }
    }

    public OooOO0O(@NotNull Drawable drawable) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        this.f30269OoooO0 = drawable;
        this.f30270OoooO0O = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(0);
        this.f30268OoooO = new OooO0O0();
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    @Override // p100o000oOoO.oo0oO0
    public final void OooO00o() {
        OooO0O0();
    }

    @Override // p100o000oOoO.oo0oO0
    public final void OooO0O0() {
        Object obj = this.f30269OoooO0;
        if (obj instanceof Animatable) {
            ((Animatable) obj).stop();
        }
        this.f30269OoooO0.setVisible(false, false);
        this.f30269OoooO0.setCallback(null);
    }

    @Override // p263o00ooo.o000OO0O
    public final boolean OooO0OO(float f) {
        this.f30269OoooO0.setAlpha(RangesKt.coerceIn(MathKt.roundToInt(f * KotlinVersion.MAX_COMPONENT_VALUE), 0, KotlinVersion.MAX_COMPONENT_VALUE));
        return true;
    }

    @Override // p100o000oOoO.oo0oO0
    public final void OooO0Oo() {
        this.f30269OoooO0.setCallback(this.f30268OoooO);
        this.f30269OoooO0.setVisible(true, true);
        Object obj = this.f30269OoooO0;
        if (obj instanceof Animatable) {
            ((Animatable) obj).start();
        }
    }

    @Override // p263o00ooo.o000OO0O
    public final boolean OooO0o(@NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        int i = 0;
        if (Build.VERSION.SDK_INT < 23) {
            return false;
        }
        Drawable drawable = this.f30269OoooO0;
        int i2 = OooO00o.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = 1;
        }
        return drawable.setLayoutDirection(i);
    }

    @Override // p263o00ooo.o000OO0O
    public final boolean OooO0o0(@Nullable o00000O o00000o) {
        ColorFilter colorFilter;
        Drawable drawable = this.f30269OoooO0;
        if (o00000o == null) {
            colorFilter = null;
        } else {
            Intrinsics.checkNotNullParameter(o00000o, "<this>");
            colorFilter = o00000o.f32061OooO00o;
        }
        drawable.setColorFilter(colorFilter);
        return true;
    }

    @Override // p263o00ooo.o000OO0O
    public final long OooO0oo() {
        return OooOo.OooO00o(this.f30269OoooO0.getIntrinsicWidth(), this.f30269OoooO0.getIntrinsicHeight());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p263o00ooo.o000OO0O
    public final void OooOO0(@NotNull o0Oo0oo o0oo0oo2) {
        Intrinsics.checkNotNullParameter(o0oo0oo2, "<this>");
        o0O0O00 o0o0o00OooO0o = o0oo0oo2.Ooooo0o().OooO0o();
        ((Number) this.f30270OoooO0O.getValue()).intValue();
        this.f30269OoooO0.setBounds(0, 0, MathKt.roundToInt(OooOo00.OooO0Oo(o0oo0oo2.OooO0OO())), MathKt.roundToInt(OooOo00.OooO0O0(o0oo0oo2.OooO0OO())));
        try {
            o0o0o00OooO0o.OooO0oo();
            Drawable drawable = this.f30269OoooO0;
            Canvas canvas = OooOOOO.f32049OooO00o;
            Intrinsics.checkNotNullParameter(o0o0o00OooO0o, "<this>");
            drawable.draw(((OooOOO) o0o0o00OooO0o).f32046OooO00o);
        } finally {
            o0o0o00OooO0o.OooOOo0();
        }
    }
}
