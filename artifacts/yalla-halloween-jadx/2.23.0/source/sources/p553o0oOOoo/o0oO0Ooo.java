package p553o0oOOoo;

import android.content.Context;
import android.view.View;
import android.view.animation.ScaleAnimation;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.ViewPager;
import com.yalla.yalla.ui.view.indicator.YlTableLayout;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.CommonNavigator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p628o0ooO0O.o0Oo0oo;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
public final class o0oO0Ooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final OooO00o f56041OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f56042OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final Lazy f56043OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public Function2<? super Boolean, ? super OooO0O0, Unit> f56044OooO0Oo;

    @StabilityInferred(parameters = 0)
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public float f56045OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final CommonNavigator f56046OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public List<String> f56047OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final float f56048OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final float f56049OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final int f56050OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final int f56051OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f56052OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final float f56053OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        @Nullable
        public ViewPager f56054OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        @Nullable
        public YlTableLayout f56055OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final boolean f56056OooOO0o;

        public OooO00o(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            this.f56046OooO00o = new CommonNavigator(context);
            this.f56047OooO0O0 = new ArrayList();
            this.f56048OooO0OO = 16.0f;
            this.f56049OooO0Oo = 16.0f;
            this.f56051OooO0o0 = -1;
            this.f56050OooO0o = -1;
            this.f56052OooO0oO = -16777216;
            this.f56053OooO0oo = 10.0f;
            this.f56045OooO = 4.0f;
            this.f56056OooOO0o = true;
        }
    }

    @StabilityInferred(parameters = 0)
    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final ConstraintLayout f56057OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public final TextView f56058OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @NotNull
        public final TextView f56059OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @NotNull
        public final View f56060OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final int f56061OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @NotNull
        public final View f56062OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final int f56063OooO0oO;

        public OooO0O0(@NotNull ConstraintLayout layout, @NotNull TextView title, @NotNull TextView point, @NotNull View start, @NotNull View end, int i, int i2, @NotNull String content) {
            Intrinsics.checkNotNullParameter(layout, "layout");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(point, "point");
            Intrinsics.checkNotNullParameter(start, "start");
            Intrinsics.checkNotNullParameter(end, "end");
            Intrinsics.checkNotNullParameter(content, "content");
            this.f56057OooO00o = layout;
            this.f56058OooO0O0 = title;
            this.f56059OooO0OO = point;
            this.f56060OooO0Oo = start;
            this.f56062OooO0o0 = end;
            this.f56061OooO0o = i;
            this.f56063OooO0oO = i2;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<o0O0O0O> {
        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o0O0O0O invoke() {
            return new o0O0O0O(o0oO0Ooo.this);
        }
    }

    public o0oO0Ooo(@NotNull OooO00o builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f56041OooO00o = builder;
        this.f56042OooO0O0 = new LinkedHashMap();
        Lazy lazy = LazyKt.lazy(new OooO0OO());
        this.f56043OooO0OO = lazy;
        o0O0O0O o0o0o0o = (o0O0O0O) lazy.getValue();
        CommonNavigator commonNavigator = builder.f56046OooO00o;
        commonNavigator.setAdapter(o0o0o0o);
        YlTableLayout ylTableLayout = builder.f56055OooOO0O;
        if (ylTableLayout != null) {
            ylTableLayout.setNavigator(commonNavigator);
        }
        ViewPager viewPager = builder.f56054OooOO0;
        if (viewPager != null) {
            viewPager.OooO0O0(new o0Oo0oo(builder.f56055OooOO0O));
        }
    }

    public static final ScaleAnimation OooO00o(o0oO0Ooo o0oo0ooo2, boolean z) {
        OooO00o oooO00o = o0oo0ooo2.f56041OooO00o;
        if (z) {
            oooO00o.getClass();
            ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 1.06f, 1.0f, 1.06f, 50.0f, 50.0f);
            scaleAnimation.setDuration(200L);
            scaleAnimation.setFillAfter(true);
            return scaleAnimation;
        }
        oooO00o.getClass();
        ScaleAnimation scaleAnimation2 = new ScaleAnimation(1.06f, 1.0f, 1.06f, 1.0f, 50.0f, 50.0f);
        scaleAnimation2.setDuration(200L);
        scaleAnimation2.setFillAfter(true);
        return scaleAnimation2;
    }
}
