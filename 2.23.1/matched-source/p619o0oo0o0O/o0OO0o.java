package p619o0oo0o0O;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.yy.yyeva.util.ScaleType;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OO0o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public o0OO00o0 f57124OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f57128OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f57129OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f57130OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f57131OooO0oO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Lazy f57125OooO00o = LazyKt.lazy(OooO0o.f57135OooO0Oo);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final Lazy f57126OooO0O0 = LazyKt.lazy(OooO0OO.f57134OooO0Oo);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final Lazy f57127OooO0OO = LazyKt.lazy(OooO0O0.f57133OooO0Oo);

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public ScaleType f57132OooO0oo = ScaleType.FIT_XY;

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ScaleType.values().length];
            try {
                iArr[ScaleType.FIT_XY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ScaleType.FIT_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ScaleType.CENTER_CROP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<o0OO0O0> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0O0 f57133OooO0Oo = new OooO0O0();

        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o0OO0O0 invoke() {
            return new o0OO0O0();
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<o0OOooO0> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0OO f57134OooO0Oo = new OooO0OO();

        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o0OOooO0 invoke() {
            return new o0OOooO0();
        }
    }

    public static final class OooO0o extends Lambda implements Function0<o0OO0o00> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0o f57135OooO0Oo = new OooO0o();

        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o0OO0o00 invoke() {
            return new o0OO0o00();
        }
    }

    public final o0OO00o0 OooO00o() {
        o0OO00o0 o0oo00o1 = this.f57124OooO;
        if (o0oo00o1 != null) {
            Intrinsics.checkNotNullParameter("EvaAnimPlayer.ScaleTypeUtil", ViewHierarchyConstants.TAG_KEY);
            Intrinsics.checkNotNullParameter("custom scaleType", "msg");
            return o0oo00o1;
        }
        String msg = "scaleType=" + this.f57132OooO0oo;
        Intrinsics.checkNotNullParameter("EvaAnimPlayer.ScaleTypeUtil", ViewHierarchyConstants.TAG_KEY);
        Intrinsics.checkNotNullParameter(msg, "msg");
        int i = OooO00o.$EnumSwitchMapping$0[this.f57132OooO0oo.ordinal()];
        if (i == 1) {
            return (o0OO0o00) this.f57125OooO00o.getValue();
        }
        if (i == 2) {
            return (o0OOooO0) this.f57126OooO0O0.getValue();
        }
        if (i == 3) {
            return (o0OO0O0) this.f57127OooO0OO.getValue();
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public final FrameLayout.LayoutParams OooO0O0(@Nullable View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 == null) {
            layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        }
        FrameLayout.LayoutParams layoutParams3 = layoutParams2;
        if (this.f57128OooO0Oo > 0 && this.f57130OooO0o0 > 0 && this.f57129OooO0o > 0 && this.f57131OooO0oO > 0) {
            return OooO00o().OooO0O0(this.f57128OooO0Oo, this.f57130OooO0o0, this.f57129OooO0o, this.f57131OooO0oO, layoutParams3);
        }
        String msg = "params error: layoutWidth=" + this.f57128OooO0Oo + ", layoutHeight=" + this.f57130OooO0o0 + ", videoWidth=" + this.f57129OooO0o + ", videoHeight=" + this.f57131OooO0oO;
        Intrinsics.checkNotNullParameter("EvaAnimPlayer.ScaleTypeUtil", ViewHierarchyConstants.TAG_KEY);
        Intrinsics.checkNotNullParameter(msg, "msg");
        return layoutParams3;
    }

    @NotNull
    public final Pair<Integer, Integer> OooO0OO() {
        Pair<Integer, Integer> pairOooO00o = OooO00o().OooO00o();
        String msg = "get real size (" + pairOooO00o.getFirst().intValue() + ", " + pairOooO00o.getSecond().intValue() + ')';
        Intrinsics.checkNotNullParameter("EvaAnimPlayer.ScaleTypeUtil", ViewHierarchyConstants.TAG_KEY);
        Intrinsics.checkNotNullParameter(msg, "msg");
        return pairOooO00o;
    }
}
