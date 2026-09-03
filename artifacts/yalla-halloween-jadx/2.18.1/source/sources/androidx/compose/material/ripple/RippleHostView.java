package androidx.compose.material.ripple;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import android.view.animation.AnimationUtils;
import com.umeng.analytics.pro.d;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import o00O0O.OooO;
import o00O0O.OooOo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p026Oooo0OO.o000Oo0;
import p035OoooOO0.o0000OO0;
import p035OoooOO0.o0000Ooo;
import p145o00Oo0.o00000O0;
import p145o00Oo0.o00000OO;
import p145o00Oo0.o000O0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¨\u0006\n"}, d2 = {"Landroidx/compose/material/ripple/RippleHostView;", "Landroid/view/View;", "", "pressed", "", "setRippleState", "Landroid/content/Context;", d.R, "<init>", "(Landroid/content/Context;)V", "material-ripple_release"}, k = 1, mv = {1, 6, 0})
public final class RippleHostView extends View {

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @NotNull
    public static final int[] f5953OoooO0 = {R.attr.state_pressed, R.attr.state_enabled};

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    @NotNull
    public static final int[] f5954OoooO0O = new int[0];

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @Nullable
    public o0000Ooo f5955Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @Nullable
    public o0000OO0 f5956Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @Nullable
    public Boolean f5957Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @Nullable
    public Long f5958Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @Nullable
    public Function0<Unit> f5959OoooO00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RippleHostView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void setRippleState(boolean pressed) {
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.f5955Oooo;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l = this.f5958Oooo0oo;
        long jLongValue = jCurrentAnimationTimeMillis - (l != null ? l.longValue() : 0L);
        if (pressed || jLongValue >= 5) {
            int[] iArr = pressed ? f5953OoooO0 : f5954OoooO0O;
            o0000OO0 o0000oo1 = this.f5956Oooo0o;
            if (o0000oo1 != null) {
                o0000oo1.setState(iArr);
            }
        } else {
            o0000Ooo o0000ooo = new o0000Ooo(this, 0);
            this.f5955Oooo = o0000ooo;
            postDelayed(o0000ooo, 50L);
        }
        this.f5958Oooo0oo = Long.valueOf(jCurrentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: setRippleState$lambda-2, reason: not valid java name */
    public static final void m1setRippleState$lambda2(RippleHostView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        o0000OO0 o0000oo1 = this$0.f5956Oooo0o;
        if (o0000oo1 != null) {
            o0000oo1.setState(f5954OoooO0O);
        }
        this$0.f5955Oooo = null;
    }

    public final void OooO0O0(@NotNull o000Oo0 interaction, boolean z, long j, int i, long j2, float f, @NotNull Function0<Unit> onInvalidateRipple) {
        Intrinsics.checkNotNullParameter(interaction, "interaction");
        Intrinsics.checkNotNullParameter(onInvalidateRipple, "onInvalidateRipple");
        if (this.f5956Oooo0o == null || !Intrinsics.areEqual(Boolean.valueOf(z), this.f5957Oooo0oO)) {
            o0000OO0 o0000oo1 = new o0000OO0(z);
            setBackground(o0000oo1);
            this.f5956Oooo0o = o0000oo1;
            this.f5957Oooo0oO = Boolean.valueOf(z);
        }
        o0000OO0 o0000oo2 = this.f5956Oooo0o;
        Intrinsics.checkNotNull(o0000oo2);
        this.f5959OoooO00 = onInvalidateRipple;
        OooO0o0(j, i, j2, f);
        if (z) {
            o0000oo2.setHotspot(OooO.OooO0OO(interaction.f1733OooO00o), OooO.OooO0Oo(interaction.f1733OooO00o));
        } else {
            o0000oo2.setHotspot(o0000oo2.getBounds().centerX(), o0000oo2.getBounds().centerY());
        }
        setRippleState(true);
    }

    public final void OooO0OO() {
        this.f5959OoooO00 = null;
        o0000Ooo o0000ooo = this.f5955Oooo;
        if (o0000ooo != null) {
            removeCallbacks(o0000ooo);
            o0000Ooo o0000ooo2 = this.f5955Oooo;
            Intrinsics.checkNotNull(o0000ooo2);
            o0000ooo2.run();
        } else {
            o0000OO0 o0000oo1 = this.f5956Oooo0o;
            if (o0000oo1 != null) {
                o0000oo1.setState(f5954OoooO0O);
            }
        }
        o0000OO0 o0000oo2 = this.f5956Oooo0o;
        if (o0000oo2 == null) {
            return;
        }
        o0000oo2.setVisible(false, false);
        unscheduleDrawable(o0000oo2);
    }

    public final void OooO0Oo() {
        setRippleState(false);
    }

    public final void OooO0o0(long j, int i, long j2, float f) {
        o0000OO0 o0000oo1 = this.f5956Oooo0o;
        if (o0000oo1 == null) {
            return;
        }
        Integer num = o0000oo1.f3625Oooo0oo;
        if (num == null || num.intValue() != i) {
            o0000oo1.f3625Oooo0oo = Integer.valueOf(i);
            if (Build.VERSION.SDK_INT < 23) {
                try {
                    if (!o0000OO0.f3620OoooO0) {
                        o0000OO0.f3620OoooO0 = true;
                        o0000OO0.f3621OoooO00 = RippleDrawable.class.getDeclaredMethod("setMaxRadius", Integer.TYPE);
                    }
                    Method method = o0000OO0.f3621OoooO00;
                    if (method != null) {
                        method.invoke(o0000oo1, Integer.valueOf(i));
                    }
                } catch (Exception unused) {
                }
            } else {
                o0000OO0.OooO00o.f3626OooO00o.OooO00o(o0000oo1, i);
            }
        }
        if (Build.VERSION.SDK_INT < 28) {
            f *= 2;
        }
        long jOooO0OO = o00000O0.OooO0OO(j2, RangesKt.coerceAtMost(f, 1.0f));
        o00000O0 o00000o1 = o0000oo1.f3624Oooo0oO;
        if (!(o00000o1 != null ? o00000O0.OooO0Oo(o00000o1.f32070OooO00o, jOooO0OO) : false)) {
            o0000oo1.f3624Oooo0oO = new o00000O0(jOooO0OO);
            o0000oo1.setColor(ColorStateList.valueOf(o00000OO.OooO0oO(jOooO0OO)));
        }
        Rect rectOooO00o = o000O0.OooO00o(OooOo.OooO0OO(j));
        setLeft(rectOooO00o.left);
        setTop(rectOooO00o.top);
        setRight(rectOooO00o.right);
        setBottom(rectOooO00o.bottom);
        o0000oo1.setBounds(rectOooO00o);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(@NotNull Drawable who) {
        Intrinsics.checkNotNullParameter(who, "who");
        Function0<Unit> function0 = this.f5959OoooO00;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
    }
}
