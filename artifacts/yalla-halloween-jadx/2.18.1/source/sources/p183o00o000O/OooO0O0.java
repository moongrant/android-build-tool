package p183o00o000O;

import android.content.Context;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;
import com.app.base.view.indicator.YlTableLayout;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.CommonNavigator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p653o0ooOooo.pj;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public OooO00o f32973OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public OooO f32974OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public Map<String, TextView> f32975OooO0OO;

    @StabilityInferred(parameters = 0)
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public int f32976OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public Context f32977OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public final CommonNavigator f32978OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @NotNull
        public List<String> f32979OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public float f32980OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f32981OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public float f32982OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f32983OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public float f32984OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public float f32985OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public float f32986OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        @Nullable
        public ViewPager f32987OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        @Nullable
        public YlTableLayout f32988OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        @Nullable
        public ViewPager2 f32989OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public boolean f32990OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        @Nullable
        public InterfaceC0348OooO0O0 f32991OooOOOo;

        /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
        public float f32992OooOOo;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public int f32993OooOOo0;

        /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
        public int f32994OooOOoo;

        /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
        public int f32995OooOo0;

        /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
        public int f32996OooOo00;

        public OooO00o(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            this.f32977OooO00o = context;
            this.f32978OooO0O0 = new CommonNavigator(this.f32977OooO00o);
            this.f32979OooO0OO = new ArrayList();
            this.f32980OooO0Oo = 16.0f;
            this.f32982OooO0o0 = 16.0f;
            this.f32981OooO0o = -1;
            this.f32983OooO0oO = -1;
            this.f32976OooO = -16777216;
            this.f32985OooOO0 = 10.0f;
            this.f32986OooOO0O = 4.0f;
            this.f32990OooOOOO = true;
        }

        @NotNull
        public final OooO0O0 OooO00o(@NotNull YlTableLayout magicIndicator) {
            Intrinsics.checkNotNullParameter(magicIndicator, "magicIndicator");
            this.f32988OooOOO = magicIndicator;
            return new OooO0O0(this);
        }

        @NotNull
        public final OooO00o OooO0O0(@NotNull List<String> titleList) {
            Intrinsics.checkNotNullParameter(titleList, "titleList");
            this.f32979OooO0OO = titleList;
            return this;
        }

        @NotNull
        public final OooO00o OooO0OO(@NotNull ViewPager viewPager) {
            Intrinsics.checkNotNullParameter(viewPager, "viewPager");
            this.f32987OooOO0o = viewPager;
            return this;
        }

        @NotNull
        public final OooO00o OooO0Oo(@NotNull ViewPager2 viewPager) {
            Intrinsics.checkNotNullParameter(viewPager, "viewPager");
            this.f32989OooOOO0 = viewPager;
            return this;
        }
    }

    /* JADX INFO: renamed from: o00o000O.OooO0O0$OooO0O0, reason: collision with other inner class name */
    public interface InterfaceC0348OooO0O0 {
        void OooO00o(int i);
    }

    public OooO0O0(@NotNull OooO00o builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f32973OooO00o = builder;
        this.f32975OooO0OO = new LinkedHashMap();
        CommonNavigator commonNavigator = this.f32973OooO00o.f32978OooO0O0;
        OooO oooO = new OooO(this);
        this.f32974OooO0O0 = oooO;
        commonNavigator.setAdapter(oooO);
        OooO00o oooO00o = this.f32973OooO00o;
        YlTableLayout ylTableLayout = oooO00o.f32988OooOOO;
        if (ylTableLayout != null) {
            ylTableLayout.setNavigator(oooO00o.f32978OooO0O0);
        }
        OooO00o oooO00o2 = this.f32973OooO00o;
        ViewPager viewPager = oooO00o2.f32987OooOO0o;
        if (viewPager != null) {
            viewPager.OooO0O0(new pj(oooO00o2.f32988OooOOO));
        }
        OooO00o oooO00o3 = this.f32973OooO00o;
        if (oooO00o3.f32989OooOOO0 != null) {
            YlTableLayout ylTableLayout2 = oooO00o3.f32988OooOOO;
            Intrinsics.checkNotNull(ylTableLayout2);
            ViewPager2 viewPager2 = this.f32973OooO00o.f32989OooOOO0;
            Intrinsics.checkNotNull(viewPager2);
            viewPager2.registerOnPageChangeCallback(new OooO0OO(ylTableLayout2));
        }
    }

    public static final Animation OooO00o(OooO0O0 oooO0O0, boolean z) {
        if (z) {
            Objects.requireNonNull(oooO0O0.f32973OooO00o);
            ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 1.06f, 1.0f, 1.06f, 50.0f, 50.0f);
            scaleAnimation.setDuration(200L);
            scaleAnimation.setFillAfter(true);
            return scaleAnimation;
        }
        Objects.requireNonNull(oooO0O0.f32973OooO00o);
        ScaleAnimation scaleAnimation2 = new ScaleAnimation(1.06f, 1.0f, 1.06f, 1.0f, 50.0f, 50.0f);
        scaleAnimation2.setDuration(200L);
        scaleAnimation2.setFillAfter(true);
        return scaleAnimation2;
    }
}
