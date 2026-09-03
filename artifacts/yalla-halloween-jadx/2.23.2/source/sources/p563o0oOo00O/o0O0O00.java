package p563o0oOo00O;

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
import p146o00Oo000.OooOOO0;
import p633o0ooO0Oo.o0O00OO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o0O0O00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final OooO00o f56254OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f56255OooO0O0;

    @StabilityInferred(parameters = 0)
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public float f56256OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final CommonNavigator f56257OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public List<String> f56258OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public float f56259OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public float f56260OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @Nullable
        public Typeface f56261OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f56262OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        @Nullable
        public Typeface f56263OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public int f56264OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public int f56265OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public float f56266OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public float f56267OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        @Nullable
        public ViewPager2 f56268OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        @Nullable
        public ViewPager f56269OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        @Nullable
        public YlTableLayout f56270OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public final boolean f56271OooOOOo;

        /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
        public int f56272OooOOo;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        @Nullable
        public OooO0O0 f56273OooOOo0;

        /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
        public float f56274OooOOoo;

        /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
        public int f56275OooOo0;

        /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
        public int f56276OooOo00;

        /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
        public int f56277OooOo0O;

        public OooO00o(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            this.f56257OooO00o = new CommonNavigator(context);
            this.f56258OooO0O0 = new ArrayList();
            this.f56259OooO0OO = 16.0f;
            this.f56260OooO0Oo = 16.0f;
            this.f56262OooO0o0 = -1;
            this.f56264OooO0oo = -1;
            this.f56265OooOO0 = -16777216;
            this.f56266OooOO0O = 10.0f;
            this.f56267OooOO0o = 4.0f;
            this.f56271OooOOOo = true;
        }

        @NotNull
        public final o0O0O00 OooO00o(@NotNull YlTableLayout magicIndicator) {
            Intrinsics.checkNotNullParameter(magicIndicator, "magicIndicator");
            this.f56270OooOOOO = magicIndicator;
            return new o0O0O00(this);
        }

        @NotNull
        public final void OooO0O0(@NotNull List titleList) {
            Intrinsics.checkNotNullParameter(titleList, "titleList");
            this.f56258OooO0O0 = titleList;
        }

        @NotNull
        public final void OooO0OO(@NotNull ViewPager2 viewPager) {
            Intrinsics.checkNotNullParameter(viewPager, "viewPager");
            this.f56268OooOOO = viewPager;
        }

        @NotNull
        public final void OooO0Oo(@NotNull RtlViewPager viewPager) {
            Intrinsics.checkNotNullParameter(viewPager, "viewPager");
            this.f56269OooOOO0 = viewPager;
        }
    }

    public interface OooO0O0 {
        void OooO00o(int i);
    }

    @StabilityInferred(parameters = 0)
    public static final class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final ConstraintLayout f56278OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public final TextView f56279OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @NotNull
        public final TextView f56280OooO0OO;

        public OooO0OO(@NotNull ConstraintLayout layout, @NotNull TextView title, @NotNull TextView redPoint) {
            Intrinsics.checkNotNullParameter(layout, "layout");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(redPoint, "redPoint");
            this.f56278OooO00o = layout;
            this.f56279OooO0O0 = title;
            this.f56280OooO0OO = redPoint;
        }
    }

    public o0O0O00(@NotNull OooO00o builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f56254OooO00o = builder;
        this.f56255OooO0O0 = new LinkedHashMap();
        builder.f56257OooO00o.setAdapter(new o00000(this));
        YlTableLayout ylTableLayout = builder.f56270OooOOOO;
        if (ylTableLayout != null) {
            ylTableLayout.setNavigator(builder.f56257OooO00o);
        }
        ViewPager viewPager = builder.f56269OooOOO0;
        if (viewPager != null) {
            viewPager.OooO0O0(new o0O00OO(builder.f56270OooOOOO));
        }
        if (builder.f56268OooOOO != null) {
            YlTableLayout ylTableLayout2 = builder.f56270OooOOOO;
            Intrinsics.checkNotNull(ylTableLayout2);
            ViewPager2 viewPager2 = builder.f56268OooOOO;
            Intrinsics.checkNotNull(viewPager2);
            viewPager2.registerOnPageChangeCallback(new o000OOo(ylTableLayout2));
        }
    }

    public static final ScaleAnimation OooO00o(o0O0O00 o0o0o00, boolean z) {
        OooO00o oooO00o = o0o0o00.f56254OooO00o;
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
        LinkedHashMap linkedHashMap = this.f56255OooO0O0;
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
                ((ViewGroup.MarginLayoutParams) layoutParams2).height = OooOOO0.OooO00o(8.0f);
                ((ViewGroup.MarginLayoutParams) layoutParams2).width = OooOOO0.OooO00o(8.0f);
                ((TextView) entry.getValue()).setLayoutParams(layoutParams2);
            }
        }
    }
}
