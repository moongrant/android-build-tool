package p563o0oOo00O;

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
import p633o0ooO0Oo.o0O00OO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o0OOO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final OooO00o f56284OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f56285OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final Lazy f56286OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public Function2<? super Boolean, ? super OooO0O0, Unit> f56287OooO0Oo;

    @StabilityInferred(parameters = 0)
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public float f56288OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final CommonNavigator f56289OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public List<String> f56290OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final float f56291OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final float f56292OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final int f56293OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final int f56294OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f56295OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final float f56296OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        @Nullable
        public ViewPager f56297OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        @Nullable
        public YlTableLayout f56298OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final boolean f56299OooOO0o;

        public OooO00o(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            this.f56289OooO00o = new CommonNavigator(context);
            this.f56290OooO0O0 = new ArrayList();
            this.f56291OooO0OO = 16.0f;
            this.f56292OooO0Oo = 16.0f;
            this.f56294OooO0o0 = -1;
            this.f56293OooO0o = -1;
            this.f56295OooO0oO = -16777216;
            this.f56296OooO0oo = 10.0f;
            this.f56288OooO = 4.0f;
            this.f56299OooOO0o = true;
        }
    }

    @StabilityInferred(parameters = 0)
    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final ConstraintLayout f56300OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public final TextView f56301OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @NotNull
        public final TextView f56302OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @NotNull
        public final View f56303OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final int f56304OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @NotNull
        public final View f56305OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final int f56306OooO0oO;

        public OooO0O0(@NotNull ConstraintLayout layout, @NotNull TextView title, @NotNull TextView point, @NotNull View start, @NotNull View end, int i, int i2, @NotNull String content) {
            Intrinsics.checkNotNullParameter(layout, "layout");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(point, "point");
            Intrinsics.checkNotNullParameter(start, "start");
            Intrinsics.checkNotNullParameter(end, "end");
            Intrinsics.checkNotNullParameter(content, "content");
            this.f56300OooO00o = layout;
            this.f56301OooO0O0 = title;
            this.f56302OooO0OO = point;
            this.f56303OooO0Oo = start;
            this.f56305OooO0o0 = end;
            this.f56304OooO0o = i;
            this.f56306OooO0oO = i2;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<oo0o0Oo> {
        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final oo0o0Oo invoke() {
            return new oo0o0Oo(o0OOO0o.this);
        }
    }

    public o0OOO0o(@NotNull OooO00o builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f56284OooO00o = builder;
        this.f56285OooO0O0 = new LinkedHashMap();
        Lazy lazy = LazyKt.lazy(new OooO0OO());
        this.f56286OooO0OO = lazy;
        oo0o0Oo oo0o0oo = (oo0o0Oo) lazy.getValue();
        CommonNavigator commonNavigator = builder.f56289OooO00o;
        commonNavigator.setAdapter(oo0o0oo);
        YlTableLayout ylTableLayout = builder.f56298OooOO0O;
        if (ylTableLayout != null) {
            ylTableLayout.setNavigator(commonNavigator);
        }
        ViewPager viewPager = builder.f56297OooOO0;
        if (viewPager != null) {
            viewPager.OooO0O0(new o0O00OO(builder.f56298OooOO0O));
        }
    }

    public static final ScaleAnimation OooO00o(o0OOO0o o0ooo0o2, boolean z) {
        OooO00o oooO00o = o0ooo0o2.f56284OooO00o;
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
