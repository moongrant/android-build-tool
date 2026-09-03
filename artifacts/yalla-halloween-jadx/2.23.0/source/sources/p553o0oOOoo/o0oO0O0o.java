package p553o0oOOoo;

import android.content.Context;
import android.graphics.Typeface;
import android.view.ViewGroup;
import android.view.animation.ScaleAnimation;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;
import com.booking.rtlviewpager.RtlViewPager;
import com.yalla.yalla.ui.view.indicator.YlTableLayout;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.CommonNavigator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p120o00O0Ooo.o0OO00O;
import p628o0ooO0O.o0Oo0oo;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
public final class o0oO0O0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final OooO00o f56014OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f56015OooO0O0;

    @StabilityInferred(parameters = 0)
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public float f56016OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final CommonNavigator f56017OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public List<String> f56018OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public float f56019OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public float f56020OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @Nullable
        public Typeface f56021OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f56022OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        @Nullable
        public Typeface f56023OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public int f56024OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public int f56025OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public float f56026OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public float f56027OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        @Nullable
        public ViewPager2 f56028OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        @Nullable
        public ViewPager f56029OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        @Nullable
        public YlTableLayout f56030OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public final boolean f56031OooOOOo;

        /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
        public int f56032OooOOo;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        @Nullable
        public OooO0O0 f56033OooOOo0;

        /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
        public float f56034OooOOoo;

        /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
        public int f56035OooOo0;

        /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
        public int f56036OooOo00;

        /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
        public int f56037OooOo0O;

        public OooO00o(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            this.f56017OooO00o = new CommonNavigator(context);
            this.f56018OooO0O0 = new ArrayList();
            this.f56019OooO0OO = 16.0f;
            this.f56020OooO0Oo = 16.0f;
            this.f56022OooO0o0 = -1;
            this.f56024OooO0oo = -1;
            this.f56025OooOO0 = -16777216;
            this.f56026OooOO0O = 10.0f;
            this.f56027OooOO0o = 4.0f;
            this.f56031OooOOOo = true;
        }

        @NotNull
        public final o0oO0O0o OooO00o(@NotNull YlTableLayout magicIndicator) {
            Intrinsics.checkNotNullParameter(magicIndicator, "magicIndicator");
            this.f56030OooOOOO = magicIndicator;
            return new o0oO0O0o(this);
        }

        @NotNull
        public final void OooO0O0(@NotNull List titleList) {
            Intrinsics.checkNotNullParameter(titleList, "titleList");
            this.f56018OooO0O0 = titleList;
        }

        @NotNull
        public final void OooO0OO(@NotNull ViewPager2 viewPager) {
            Intrinsics.checkNotNullParameter(viewPager, "viewPager");
            this.f56028OooOOO = viewPager;
        }

        @NotNull
        public final void OooO0Oo(@NotNull RtlViewPager viewPager) {
            Intrinsics.checkNotNullParameter(viewPager, "viewPager");
            this.f56029OooOOO0 = viewPager;
        }
    }

    public interface OooO0O0 {
        void OooO00o(int i);
    }

    @StabilityInferred(parameters = 0)
    public static final class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final ConstraintLayout f56038OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public final TextView f56039OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @NotNull
        public final TextView f56040OooO0OO;

        public OooO0OO(@NotNull ConstraintLayout layout, @NotNull TextView title, @NotNull TextView redPoint) {
            Intrinsics.checkNotNullParameter(layout, "layout");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(redPoint, "redPoint");
            this.f56038OooO00o = layout;
            this.f56039OooO0O0 = title;
            this.f56040OooO0OO = redPoint;
        }
    }

    public o0oO0O0o(@NotNull OooO00o builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f56014OooO00o = builder;
        this.f56015OooO0O0 = new LinkedHashMap();
        builder.f56017OooO00o.setAdapter(new o0O0OO0(this));
        YlTableLayout ylTableLayout = builder.f56030OooOOOO;
        if (ylTableLayout != null) {
            ylTableLayout.setNavigator(builder.f56017OooO00o);
        }
        ViewPager viewPager = builder.f56029OooOOO0;
        if (viewPager != null) {
            viewPager.OooO0O0(new o0Oo0oo(builder.f56030OooOOOO));
        }
        if (builder.f56028OooOOO != null) {
            YlTableLayout ylTableLayout2 = builder.f56030OooOOOO;
            Intrinsics.checkNotNull(ylTableLayout2);
            ViewPager2 viewPager2 = builder.f56028OooOOO;
            Intrinsics.checkNotNull(viewPager2);
            viewPager2.registerOnPageChangeCallback(new o0O0oo0o(ylTableLayout2));
        }
    }

    public static final ScaleAnimation OooO00o(o0oO0O0o o0oo0o0o2, boolean z) {
        OooO00o oooO00o = o0oo0o0o2.f56014OooO00o;
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

    public final void OooO0O0(@NotNull String pointName, boolean z) {
        Intrinsics.checkNotNullParameter(pointName, "pointName");
        LinkedHashMap linkedHashMap = this.f56015OooO0O0;
        if (linkedHashMap.isEmpty()) {
            return;
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (Intrinsics.areEqual(entry.getKey(), pointName)) {
                if (z) {
                    ((TextView) entry.getValue()).setVisibility(0);
                } else {
                    ((TextView) entry.getValue()).setVisibility(4);
                }
                ViewGroup.LayoutParams layoutParams = ((TextView) entry.getValue()).getLayoutParams();
                Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                ((ViewGroup.MarginLayoutParams) layoutParams2).height = o0OO00O.OooO00o(8.0f);
                ((ViewGroup.MarginLayoutParams) layoutParams2).width = o0OO00O.OooO00o(8.0f);
                ((TextView) entry.getValue()).setLayoutParams(layoutParams2);
            }
        }
    }
}
