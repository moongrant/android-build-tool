package com.rbrooks.indefinitepagerindicator;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.ColorInt;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.o000O0Oo;
import androidx.viewpager.widget.ViewPager;
import io.agora.rtc.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p332o0OO0o0O.OooO;
import p332o0OO0o0O.OooO0o;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u000fB'\b\u0007\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0003H\u0002J\b\u0010\u0007\u001a\u00020\u0003H\u0002¨\u0006\u0010"}, d2 = {"Lcom/rbrooks/indefinitepagerindicator/IndefinitePagerIndicator;", "Landroid/view/View;", "Landroidx/viewpager/widget/ViewPager$OooOOO0;", "", "getDotYCoordinate", "getDistanceBetweenTheCenterOfTwoDots", "getCalculatedWidth", "getPagerItemCount", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "OooO00o", "indefinitepagerindicator_release"}, k = 1, mv = {1, 4, 0})
public final class IndefinitePagerIndicator extends View implements ViewPager.OooOOO0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final int f21287OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final DecelerateInterpolator f21288OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f21289OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f21290OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f21291OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final int f21292OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final boolean f21293OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final boolean f21294OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @ColorInt
    public final int f21295OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final Paint f21296OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @ColorInt
    public final int f21297OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final Paint f21298OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public int f21299OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public float f21300OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public int f21301OooOOo0;

    public static final class OooO00o {
    }

    static {
        new OooO00o();
    }

    @JvmOverloads
    public IndefinitePagerIndicator(@NotNull Context context) {
        this(context, null, 6, 0);
    }

    private final int getCalculatedWidth() {
        return (this.f21292OooO0oo * 2) + ((((this.f21289OooO0o * 2) + this.f21290OooO0o0) - 1) * getDistanceBetweenTheCenterOfTwoDots());
    }

    private final int getDistanceBetweenTheCenterOfTwoDots() {
        return (this.f21292OooO0oo * 2) + this.f21287OooO;
    }

    /* JADX INFO: renamed from: getDotYCoordinate, reason: from getter */
    private final int getF21291OooO0oO() {
        return this.f21291OooO0oO;
    }

    private final int getPagerItemCount() {
        return 0;
    }

    @Override // android.view.View
    public final void onDraw(@NotNull Canvas canvas) {
        float width;
        float f21291OooO0oO;
        float interpolation;
        super.onDraw(canvas);
        IntRange intRangeUntil = RangesKt.until(0, getPagerItemCount());
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intRangeUntil, 10));
        Iterator<Integer> it = intRangeUntil.iterator();
        while (it.hasNext()) {
            arrayList.add(Float.valueOf((getDistanceBetweenTheCenterOfTwoDots() * this.f21300OooOOo) + ((((IntIterator) it).nextInt() - this.f21301OooOOo0) * getDistanceBetweenTheCenterOfTwoDots())));
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            float fFloatValue = ((Number) it2.next()).floatValue();
            if (this.f21294OooOO0O) {
                width = getF21291OooO0oO();
                f21291OooO0oO = (getHeight() / 2) + fFloatValue;
            } else {
                width = (getWidth() / 2) + fFloatValue;
                f21291OooO0oO = getF21291OooO0oO();
            }
            float fAbs = Math.abs(fFloatValue);
            float distanceBetweenTheCenterOfTwoDots = (this.f21290OooO0o0 / 2) * getDistanceBetweenTheCenterOfTwoDots();
            if (fAbs < getDistanceBetweenTheCenterOfTwoDots() / 2) {
                interpolation = this.f21291OooO0oO;
            } else {
                int i = this.f21292OooO0oo;
                if (fAbs <= distanceBetweenTheCenterOfTwoDots) {
                    interpolation = i;
                } else {
                    interpolation = this.f21288OooO0Oo.getInterpolation(1 - ((fAbs - distanceBetweenTheCenterOfTwoDots) / ((getCalculatedWidth() / 2.01f) - distanceBetweenTheCenterOfTwoDots))) * i;
                }
            }
            canvas.drawCircle(width, f21291OooO0oO, interpolation, Math.abs(fFloatValue) < ((float) (getDistanceBetweenTheCenterOfTwoDots() / 2)) ? this.f21296OooOOO : this.f21298OooOOOO);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = this.f21291OooO0oO * 2;
        if (this.f21294OooOO0O) {
            setMeasuredDimension(i3, getCalculatedWidth());
        } else {
            setMeasuredDimension(getCalculatedWidth(), i3);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OooOOO0
    public final void onPageScrollStateChanged(int i) {
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    @Override // androidx.viewpager.widget.ViewPager.OooOOO0
    public final void onPageScrolled(int i, float f, int i2) {
        if (this.f21293OooOO0) {
            WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
            if (ViewCompat.OooO.OooO0Oo(this) == 1) {
                this.f21301OooOOo0 = (getPagerItemCount() - i) - 1;
                this.f21300OooOOo = f * 1;
            } else {
                this.f21301OooOOo0 = i;
                this.f21300OooOOo = f * (-1);
            }
        } else {
            this.f21301OooOOo0 = i;
            this.f21300OooOOo = f * (-1);
        }
        invalidate();
    }

    @Override // androidx.viewpager.widget.ViewPager.OooOOO0
    public final void onPageSelected(int i) {
        this.f21301OooOOo0 = this.f21299OooOOOo;
        if (this.f21293OooOO0) {
            WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
            if (ViewCompat.OooO.OooO0Oo(this) == 1) {
                i = (getPagerItemCount() - i) - 1;
            }
        }
        this.f21299OooOOOo = i;
        invalidate();
    }

    @JvmOverloads
    public IndefinitePagerIndicator(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    @JvmOverloads
    public /* synthetic */ IndefinitePagerIndicator(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    @JvmOverloads
    public IndefinitePagerIndicator(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f21288OooO0Oo = new DecelerateInterpolator();
        this.f21290OooO0o0 = 5;
        this.f21289OooO0o = 1;
        Resources resources = getResources();
        Intrinsics.checkExpressionValueIsNotNull(resources, "resources");
        int i2 = (int) (5.5f * (resources.getDisplayMetrics().densityDpi / Constants.ERR_ALREADY_IN_RECORDING));
        this.f21291OooO0oO = i2;
        Resources resources2 = getResources();
        Intrinsics.checkExpressionValueIsNotNull(resources2, "resources");
        int i3 = (int) (4 * (resources2.getDisplayMetrics().densityDpi / Constants.ERR_ALREADY_IN_RECORDING));
        this.f21292OooO0oo = i3;
        Resources resources3 = getResources();
        Intrinsics.checkExpressionValueIsNotNull(resources3, "resources");
        int i4 = (int) (10 * (resources3.getDisplayMetrics().densityDpi / Constants.ERR_ALREADY_IN_RECORDING));
        this.f21287OooO = i4;
        Context context2 = getContext();
        int i5 = OooO0o.default_dot_color;
        Object obj = ContextCompat.f5271OooO00o;
        int iOooO00o = ContextCompat.OooO0o.OooO00o(context2, i5);
        this.f21295OooOO0o = iOooO00o;
        int iOooO00o2 = ContextCompat.OooO0o.OooO00o(getContext(), OooO0o.default_selected_dot_color);
        this.f21297OooOOO0 = iOooO00o2;
        Paint paint = new Paint();
        this.f21296OooOOO = paint;
        Paint paint2 = new Paint();
        this.f21298OooOOOO = paint2;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, OooO.IndefinitePagerIndicator, 0, 0);
            this.f21290OooO0o0 = typedArrayObtainStyledAttributes.getInteger(OooO.IndefinitePagerIndicator_dotCount, 5);
            this.f21289OooO0o = typedArrayObtainStyledAttributes.getInt(OooO.IndefinitePagerIndicator_fadingDotCount, 1);
            this.f21292OooO0oo = typedArrayObtainStyledAttributes.getDimensionPixelSize(OooO.IndefinitePagerIndicator_dotRadius, i3);
            this.f21291OooO0oO = typedArrayObtainStyledAttributes.getDimensionPixelSize(OooO.IndefinitePagerIndicator_selectedDotRadius, i2);
            this.f21295OooOO0o = typedArrayObtainStyledAttributes.getColor(OooO.IndefinitePagerIndicator_dotColor, iOooO00o);
            this.f21297OooOOO0 = typedArrayObtainStyledAttributes.getColor(OooO.IndefinitePagerIndicator_selectedDotColor, iOooO00o2);
            this.f21287OooO = typedArrayObtainStyledAttributes.getDimensionPixelSize(OooO.IndefinitePagerIndicator_dotSeparation, i4);
            this.f21293OooOO0 = typedArrayObtainStyledAttributes.getBoolean(OooO.IndefinitePagerIndicator_supportRTL, false);
            this.f21294OooOO0O = typedArrayObtainStyledAttributes.getBoolean(OooO.IndefinitePagerIndicator_verticalSupport, false);
        }
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(this.f21297OooOOO0);
        paint.setAntiAlias(true);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(this.f21295OooOO0o);
        paint2.setAntiAlias(true);
    }
}
