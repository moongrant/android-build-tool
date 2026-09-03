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
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.umeng.analytics.pro.d;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import io.agora.rtc.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import o000O0O0.o00000O;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p572o0oOo0o0.o000;
import p572o0oOo0o0.o0000OO0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u000f\u0010B'\b\u0007\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0003H\u0002J\b\u0010\u0007\u001a\u00020\u0003H\u0002¨\u0006\u0011"}, d2 = {"Lcom/rbrooks/indefinitepagerindicator/IndefinitePagerIndicator;", "Landroid/view/View;", "Landroidx/viewpager/widget/ViewPager$OooOOO0;", "", "getDotYCoordinate", "getDistanceBetweenTheCenterOfTwoDots", "getCalculatedWidth", "getPagerItemCount", "Landroid/content/Context;", d.R, "Landroid/util/AttributeSet;", "attrs", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "OooO00o", "OooO0O0", "indefinitepagerindicator_release"}, k = 1, mv = {1, 4, 0})
public final class IndefinitePagerIndicator extends View implements ViewPager.OooOOO0 {

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public static final OooO00o f19450OooooO0 = new OooO00o();

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public int f19451Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public RecyclerView f19452Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public OooO0O0 f19453Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final DecelerateInterpolator f19454Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public int f19455OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public int f19456OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public int f19457OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public int f19458OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public boolean f19459OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    @ColorInt
    public int f19460OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    @ColorInt
    public int f19461OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public final Paint f19462OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public final Paint f19463OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public int f19464OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public int f19465Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public float f19466Ooooo0o;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public boolean f19467o000oOoO;

    public static final class OooO00o {
        public static final int OooO00o(float f, @NotNull Resources resources) {
            OooO00o oooO00o = IndefinitePagerIndicator.f19450OooooO0;
            return (int) (f * (resources.getDisplayMetrics().densityDpi / Constants.ERR_ALREADY_IN_RECORDING));
        }
    }

    public final class OooO0O0 extends RecyclerView.o00O0O {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public View f19468OooO00o;

        public OooO0O0() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o00O0O
        public final void onScrolled(@Nullable RecyclerView recyclerView, int i, int i2) {
            RecyclerView.oo0o0Oo oo0o0ooFindContainingViewHolder;
            float f;
            RecyclerView.Oooo000 layoutManager;
            RecyclerView.Oooo000 layoutManager2;
            RecyclerView recyclerView2 = IndefinitePagerIndicator.this.f19452Oooo0o;
            Integer numValueOf = (recyclerView2 == null || (layoutManager2 = recyclerView2.getLayoutManager()) == null) ? null : Integer.valueOf(layoutManager2.getChildCount());
            if (numValueOf == null) {
                Intrinsics.throwNpe();
            }
            float f2 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            View view = null;
            for (int iIntValue = numValueOf.intValue() - 1; iIntValue >= 0; iIntValue--) {
                RecyclerView recyclerView3 = IndefinitePagerIndicator.this.f19452Oooo0o;
                View childAt = (recyclerView3 == null || (layoutManager = recyclerView3.getLayoutManager()) == null) ? null : layoutManager.getChildAt(iIntValue);
                if (childAt != null) {
                    int left = childAt.getLeft();
                    int right = childAt.getRight();
                    int width = childAt.getWidth();
                    if (left < 0) {
                        f = right / width;
                    } else if (right > IndefinitePagerIndicator.this.getWidth()) {
                        right = IndefinitePagerIndicator.this.getWidth() - left;
                        f = right / width;
                    } else {
                        f = 1.0f;
                    }
                    if (f >= f2) {
                        view = childAt;
                        f2 = f;
                    }
                }
            }
            if (view != null) {
                RecyclerView recyclerView4 = IndefinitePagerIndicator.this.f19452Oooo0o;
                Integer numValueOf2 = (recyclerView4 == null || (oo0o0ooFindContainingViewHolder = recyclerView4.findContainingViewHolder(view)) == null) ? null : Integer.valueOf(oo0o0ooFindContainingViewHolder.getAdapterPosition());
                if (numValueOf2 == null) {
                    Intrinsics.throwNpe();
                }
                int iIntValue2 = numValueOf2.intValue();
                IndefinitePagerIndicator indefinitePagerIndicator = IndefinitePagerIndicator.this;
                if (indefinitePagerIndicator.OooO0O0()) {
                    IndefinitePagerIndicator indefinitePagerIndicator2 = IndefinitePagerIndicator.this;
                    if (!indefinitePagerIndicator2.f19467o000oOoO) {
                        iIntValue2 = indefinitePagerIndicator2.OooO00o(iIntValue2);
                    }
                }
                indefinitePagerIndicator.f19465Ooooo00 = iIntValue2;
                IndefinitePagerIndicator.this.f19466Ooooo0o = view.getLeft() / view.getMeasuredWidth();
            }
            RecyclerView.Oooo000 layoutManager3 = recyclerView != null ? recyclerView.getLayoutManager() : null;
            if (layoutManager3 == null) {
                throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.LinearLayoutManager");
            }
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager3;
            if (this.f19468OooO00o != linearLayoutManager.findViewByPosition(i >= 0 ? linearLayoutManager.findLastVisibleItemPosition() : linearLayoutManager.findFirstVisibleItemPosition())) {
                IndefinitePagerIndicator indefinitePagerIndicator3 = IndefinitePagerIndicator.this;
                indefinitePagerIndicator3.f19464OoooOoo = indefinitePagerIndicator3.f19465Ooooo00;
            }
            this.f19468OooO00o = view;
            IndefinitePagerIndicator.this.invalidate();
        }
    }

    @JvmOverloads
    public IndefinitePagerIndicator(@NotNull Context context) {
        this(context, null, 0);
    }

    private final int getCalculatedWidth() {
        return (this.f19458OoooO0O * 2) + ((((this.f19457OoooO00 * 2) + this.f19451Oooo) - 1) * getDistanceBetweenTheCenterOfTwoDots());
    }

    private final int getDistanceBetweenTheCenterOfTwoDots() {
        return (this.f19458OoooO0O * 2) + this.f19455OoooO;
    }

    /* JADX INFO: renamed from: getDotYCoordinate, reason: from getter */
    private final int getF19456OoooO0() {
        return this.f19456OoooO0;
    }

    private final int getPagerItemCount() {
        RecyclerView.Adapter adapter;
        RecyclerView recyclerView = this.f19452Oooo0o;
        if (recyclerView == null) {
            return 0;
        }
        Integer numValueOf = (recyclerView == null || (adapter = recyclerView.getAdapter()) == null) ? null : Integer.valueOf(adapter.getItemCount());
        if (numValueOf == null) {
            Intrinsics.throwNpe();
        }
        return numValueOf.intValue();
    }

    public final int OooO00o(int i) {
        return (getPagerItemCount() - i) - 1;
    }

    public final boolean OooO0O0() {
        WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        return ViewCompat.OooO.OooO0Oo(this) == 1;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:24:0x00c4  */
    @Override // android.view.View
    public final void onDraw(@NotNull Canvas canvas) {
        float width;
        float f19456OoooO0;
        float interpolation;
        int i;
        Paint paint;
        super.onDraw(canvas);
        IntRange intRangeUntil = RangesKt.until(0, getPagerItemCount());
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intRangeUntil, 10));
        Iterator<Integer> it = intRangeUntil.iterator();
        while (it.hasNext()) {
            arrayList.add(Float.valueOf((getDistanceBetweenTheCenterOfTwoDots() * this.f19466Ooooo0o) + ((((IntIterator) it).nextInt() - this.f19465Ooooo00) * getDistanceBetweenTheCenterOfTwoDots())));
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            float fFloatValue = ((Number) it2.next()).floatValue();
            if (this.f19467o000oOoO) {
                width = getF19456OoooO0();
                f19456OoooO0 = (getHeight() / 2) + fFloatValue;
            } else {
                width = (getWidth() / 2) + fFloatValue;
                f19456OoooO0 = getF19456OoooO0();
            }
            float fAbs = Math.abs(fFloatValue);
            float distanceBetweenTheCenterOfTwoDots = (this.f19451Oooo / 2) * getDistanceBetweenTheCenterOfTwoDots();
            if (fAbs < getDistanceBetweenTheCenterOfTwoDots() / 2) {
                i = this.f19456OoooO0;
            } else {
                if (fAbs <= distanceBetweenTheCenterOfTwoDots) {
                    i = this.f19458OoooO0O;
                } else {
                    interpolation = this.f19454Oooo0oo.getInterpolation(1 - ((fAbs - distanceBetweenTheCenterOfTwoDots) / ((getCalculatedWidth() / 2.01f) - distanceBetweenTheCenterOfTwoDots))) * this.f19458OoooO0O;
                }
                if (Math.abs(fFloatValue) < getDistanceBetweenTheCenterOfTwoDots() / 2) {
                    paint = this.f19462OoooOo0;
                } else {
                    paint = this.f19463OoooOoO;
                }
                canvas.drawCircle(width, f19456OoooO0, interpolation, paint);
            }
            interpolation = i;
            if (Math.abs(fFloatValue) < getDistanceBetweenTheCenterOfTwoDots() / 2) {
                paint = this.f19462OoooOo0;
            } else {
                paint = this.f19463OoooOoO;
            }
            canvas.drawCircle(width, f19456OoooO0, interpolation, paint);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = this.f19456OoooO0 * 2;
        if (this.f19467o000oOoO) {
            setMeasuredDimension(i3, getCalculatedWidth());
        } else {
            setMeasuredDimension(getCalculatedWidth(), i3);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OooOOO0
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OooOOO0
    public final void onPageScrolled(int i, float f, int i2) {
        if (this.f19459OoooOO0 && OooO0O0()) {
            this.f19465Ooooo00 = OooO00o(i);
            this.f19466Ooooo0o = f * 1;
        } else {
            this.f19465Ooooo00 = i;
            this.f19466Ooooo0o = f * (-1);
        }
        invalidate();
    }

    @Override // androidx.viewpager.widget.ViewPager.OooOOO0
    public final void onPageSelected(int i) {
        this.f19465Ooooo00 = this.f19464OoooOoo;
        if (this.f19459OoooOO0 && OooO0O0()) {
            i = OooO00o(i);
        }
        this.f19464OoooOoo = i;
        invalidate();
    }

    @JvmOverloads
    public IndefinitePagerIndicator(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @JvmOverloads
    public IndefinitePagerIndicator(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f19454Oooo0oo = new DecelerateInterpolator();
        this.f19451Oooo = 5;
        this.f19457OoooO00 = 1;
        Resources resources = getResources();
        Intrinsics.checkExpressionValueIsNotNull(resources, "resources");
        this.f19456OoooO0 = OooO00o.OooO00o(5.5f, resources);
        Resources resources2 = getResources();
        Intrinsics.checkExpressionValueIsNotNull(resources2, "resources");
        this.f19458OoooO0O = OooO00o.OooO00o(4, resources2);
        Resources resources3 = getResources();
        Intrinsics.checkExpressionValueIsNotNull(resources3, "resources");
        this.f19455OoooO = OooO00o.OooO00o(10, resources3);
        this.f19460OoooOOO = o000O000.OooO00o.OooO0O0(getContext(), o0000OO0.default_dot_color);
        this.f19461OoooOOo = o000O000.OooO00o.OooO0O0(getContext(), o0000OO0.default_selected_dot_color);
        Paint paint = new Paint();
        this.f19462OoooOo0 = paint;
        Paint paint2 = new Paint();
        this.f19463OoooOoO = paint2;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, o000.IndefinitePagerIndicator, 0, 0);
            this.f19451Oooo = typedArrayObtainStyledAttributes.getInteger(o000.IndefinitePagerIndicator_dotCount, 5);
            this.f19457OoooO00 = typedArrayObtainStyledAttributes.getInt(o000.IndefinitePagerIndicator_fadingDotCount, 1);
            this.f19458OoooO0O = typedArrayObtainStyledAttributes.getDimensionPixelSize(o000.IndefinitePagerIndicator_dotRadius, this.f19458OoooO0O);
            this.f19456OoooO0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(o000.IndefinitePagerIndicator_selectedDotRadius, this.f19456OoooO0);
            this.f19460OoooOOO = typedArrayObtainStyledAttributes.getColor(o000.IndefinitePagerIndicator_dotColor, this.f19460OoooOOO);
            this.f19461OoooOOo = typedArrayObtainStyledAttributes.getColor(o000.IndefinitePagerIndicator_selectedDotColor, this.f19461OoooOOo);
            this.f19455OoooO = typedArrayObtainStyledAttributes.getDimensionPixelSize(o000.IndefinitePagerIndicator_dotSeparation, this.f19455OoooO);
            this.f19459OoooOO0 = typedArrayObtainStyledAttributes.getBoolean(o000.IndefinitePagerIndicator_supportRTL, false);
            this.f19467o000oOoO = typedArrayObtainStyledAttributes.getBoolean(o000.IndefinitePagerIndicator_verticalSupport, false);
        }
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(this.f19461OoooOOo);
        paint.setAntiAlias(true);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(this.f19460OoooOOO);
        paint2.setAntiAlias(true);
    }
}
