package p614o0oo0o0O;

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

/* JADX INFO: loaded from: classes5.dex */
public final class o00oOoo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public o000OO00 f57034OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f57038OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f57039OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f57040OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f57041OooO0oO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Lazy f57035OooO00o = LazyKt.lazy(OooO0o.f57045OooO0Oo);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final Lazy f57036OooO0O0 = LazyKt.lazy(OooO0OO.f57044OooO0Oo);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final Lazy f57037OooO0OO = LazyKt.lazy(OooO0O0.f57043OooO0Oo);

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public ScaleType f57042OooO0oo = ScaleType.FIT_XY;

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

    public static final class OooO0O0 extends Lambda implements Function0<o00> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0O0 f57043OooO0Oo = new OooO0O0();

        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o00 invoke() {
            return new o00();
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<o00O0000> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0OO f57044OooO0Oo = new OooO0OO();

        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o00O0000 invoke() {
            return new o00O0000();
        }
    }

    public static final class OooO0o extends Lambda implements Function0<o0O0ooO> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0o f57045OooO0Oo = new OooO0o();

        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o0O0ooO invoke() {
            return new o0O0ooO();
        }
    }

    public final o000OO00 OooO00o() {
        o000OO00 o000oo01 = this.f57034OooO;
        if (o000oo01 != null) {
            Intrinsics.checkNotNullParameter("EvaAnimPlayer.ScaleTypeUtil", ViewHierarchyConstants.TAG_KEY);
            Intrinsics.checkNotNullParameter("custom scaleType", "msg");
            return o000oo01;
        }
        String msg = "scaleType=" + this.f57042OooO0oo;
        Intrinsics.checkNotNullParameter("EvaAnimPlayer.ScaleTypeUtil", ViewHierarchyConstants.TAG_KEY);
        Intrinsics.checkNotNullParameter(msg, "msg");
        int i = OooO00o.$EnumSwitchMapping$0[this.f57042OooO0oo.ordinal()];
        if (i == 1) {
            return (o0O0ooO) this.f57035OooO00o.getValue();
        }
        if (i == 2) {
            return (o00O0000) this.f57036OooO0O0.getValue();
        }
        if (i == 3) {
            return (o00) this.f57037OooO0OO.getValue();
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
        if (this.f57038OooO0Oo > 0 && this.f57040OooO0o0 > 0 && this.f57039OooO0o > 0 && this.f57041OooO0oO > 0) {
            return OooO00o().OooO0O0(this.f57038OooO0Oo, this.f57040OooO0o0, this.f57039OooO0o, this.f57041OooO0oO, layoutParams3);
        }
        String msg = "params error: layoutWidth=" + this.f57038OooO0Oo + ", layoutHeight=" + this.f57040OooO0o0 + ", videoWidth=" + this.f57039OooO0o + ", videoHeight=" + this.f57041OooO0oO;
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
