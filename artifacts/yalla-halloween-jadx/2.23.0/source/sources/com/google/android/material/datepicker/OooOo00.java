package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* JADX INFO: loaded from: classes3.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class OooOo00<S> extends o0OO00O<S> {

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public static final /* synthetic */ int f16900OooOOo = 0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public Month f16901OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public DateSelector<S> f16902OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @StyleRes
    public int f16903OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public CalendarConstraints f16904OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public DayViewDecorator f16905OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public OooO0o f16906OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public com.google.android.material.datepicker.OooO0O0 f16907OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public RecyclerView f16908OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public View f16909OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public RecyclerView f16910OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public View f16911OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public View f16912OooOOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public View f16913OooOOo0;

    public interface OooO {
    }

    public class OooO00o extends androidx.core.view.OooO00o {
        @Override // androidx.core.view.OooO00o
        public final void onInitializeAccessibilityNodeInfo(View view, @NonNull o0000O.o0Oo0oo o0oo0oo2) {
            super.onInitializeAccessibilityNodeInfo(view, o0oo0oo2);
            o0oo0oo2.OooOO0O(null);
        }
    }

    public class OooO0O0 extends o000000 {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f16914OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(Context context, int i, int i2) {
            super(context, i);
            this.f16914OooO0Oo = i2;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public final void calculateExtraLayoutSpace(@NonNull RecyclerView.o0OOO0o o0ooo0o2, @NonNull int[] iArr) {
            int i = this.f16914OooO0Oo;
            OooOo00 oooOo00 = OooOo00.this;
            if (i == 0) {
                iArr[0] = oooOo00.f16910OooOOO0.getWidth();
                iArr[1] = oooOo00.f16910OooOOO0.getWidth();
            } else {
                iArr[0] = oooOo00.f16910OooOOO0.getHeight();
                iArr[1] = oooOo00.f16910OooOOO0.getHeight();
            }
        }
    }

    public class OooO0OO implements OooO {
        public OooO0OO() {
        }
    }

    public enum OooO0o {
        DAY,
        YEAR
    }

    @Override // com.google.android.material.datepicker.o0OO00O
    public final boolean OooO0O0(@NonNull MaterialDatePicker.OooO0o oooO0o) {
        return super.OooO0O0(oooO0o);
    }

    public final void OooO0OO(Month month) {
        Month month2 = ((MonthsPagerAdapter) this.f16910OooOOO0.getAdapter()).f16864OooO00o.f16805OooO0Oo;
        Calendar calendar = month2.f16858OooO0Oo;
        if (!(calendar instanceof GregorianCalendar)) {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        int i = month.f16859OooO0o;
        int i2 = month2.f16859OooO0o;
        int i3 = month.f16860OooO0o0;
        int i4 = month2.f16860OooO0o0;
        int i5 = (i3 - i4) + ((i - i2) * 12);
        Month month3 = this.f16901OooO;
        if (!(calendar instanceof GregorianCalendar)) {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        int i6 = i5 - ((month3.f16860OooO0o0 - i4) + ((month3.f16859OooO0o - i2) * 12));
        boolean z = Math.abs(i6) > 3;
        boolean z2 = i6 > 0;
        this.f16901OooO = month;
        if (z && z2) {
            this.f16910OooOOO0.scrollToPosition(i5 - 3);
            this.f16910OooOOO0.post(new OooOOOO(this, i5));
        } else if (!z) {
            this.f16910OooOOO0.post(new OooOOOO(this, i5));
        } else {
            this.f16910OooOOO0.scrollToPosition(i5 + 3);
            this.f16910OooOOO0.post(new OooOOOO(this, i5));
        }
    }

    public final void OooO0Oo(OooO0o oooO0o) {
        this.f16906OooOO0 = oooO0o;
        if (oooO0o == OooO0o.YEAR) {
            this.f16908OooOO0o.getLayoutManager().scrollToPosition(this.f16901OooO.f16859OooO0o - ((YearGridAdapter) this.f16908OooOO0o.getAdapter()).f16929OooO00o.f16904OooO0oO.f16805OooO0Oo.f16859OooO0o);
            this.f16912OooOOOo.setVisibility(0);
            this.f16913OooOOo0.setVisibility(8);
            this.f16909OooOOO.setVisibility(8);
            this.f16911OooOOOO.setVisibility(8);
            return;
        }
        if (oooO0o == OooO0o.DAY) {
            this.f16912OooOOOo.setVisibility(8);
            this.f16913OooOOo0.setVisibility(0);
            this.f16909OooOOO.setVisibility(0);
            this.f16911OooOOOO.setVisibility(0);
            OooO0OO(this.f16901OooO);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f16903OooO0o0 = bundle.getInt("THEME_RES_ID_KEY");
        this.f16902OooO0o = (DateSelector) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.f16904OooO0oO = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f16905OooO0oo = (DayViewDecorator) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.f16901OooO = (Month) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    @NonNull
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        int i;
        int i2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.f16903OooO0o0);
        this.f16907OooOO0O = new com.google.android.material.datepicker.OooO0O0(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        Month month = this.f16904OooO0oO.f16805OooO0Oo;
        if (MaterialDatePicker.OooO0Oo(contextThemeWrapper)) {
            i = p270o0O0000o.o0000O00.mtrl_calendar_vertical;
            i2 = 1;
        } else {
            i = p270o0O0000o.o0000O00.mtrl_calendar_horizontal;
            i2 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i, viewGroup, false);
        Resources resources = requireContext().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(p270o0O0000o.o00000O.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(p270o0O0000o.o00000O.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(p270o0O0000o.o00000O.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(p270o0O0000o.o00000O.mtrl_calendar_days_of_week_height);
        int i3 = o0ooOOo.f16960OooOO0;
        viewInflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(p270o0O0000o.o00000O.mtrl_calendar_month_vertical_padding) * (i3 - 1)) + (resources.getDimensionPixelSize(p270o0O0000o.o00000O.mtrl_calendar_day_height) * i3) + resources.getDimensionPixelOffset(p270o0O0000o.o00000O.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) viewInflate.findViewById(p270o0O0000o.o0000Ooo.mtrl_calendar_days_of_week);
        ViewCompat.OooOOOO(gridView, new OooO00o());
        int i4 = this.f16904OooO0oO.f16809OooO0oo;
        gridView.setAdapter((ListAdapter) (i4 > 0 ? new OooOOO0(i4) : new OooOOO0()));
        gridView.setNumColumns(month.f16861OooO0oO);
        gridView.setEnabled(false);
        this.f16910OooOOO0 = (RecyclerView) viewInflate.findViewById(p270o0O0000o.o0000Ooo.mtrl_calendar_months);
        this.f16910OooOOO0.setLayoutManager(new OooO0O0(getContext(), i2, i2));
        this.f16910OooOOO0.setTag("MONTHS_VIEW_GROUP_TAG");
        MonthsPagerAdapter monthsPagerAdapter = new MonthsPagerAdapter(contextThemeWrapper, this.f16902OooO0o, this.f16904OooO0oO, this.f16905OooO0oo, new OooO0OO());
        this.f16910OooOOO0.setAdapter(monthsPagerAdapter);
        int integer = contextThemeWrapper.getResources().getInteger(p270o0O0000o.o0000.mtrl_calendar_year_selector_span);
        int i5 = p270o0O0000o.o0000Ooo.mtrl_calendar_year_selector_frame;
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(i5);
        this.f16908OooOO0o = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f16908OooOO0o.setLayoutManager(new GridLayoutManager(integer, contextThemeWrapper));
            this.f16908OooOO0o.setAdapter(new YearGridAdapter(this));
            this.f16908OooOO0o.addItemDecoration(new Oooo000(this));
        }
        int i6 = p270o0O0000o.o0000Ooo.month_navigation_fragment_toggle;
        if (viewInflate.findViewById(i6) != null) {
            MaterialButton materialButton = (MaterialButton) viewInflate.findViewById(i6);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            ViewCompat.OooOOOO(materialButton, new Oooo0(this));
            View viewFindViewById = viewInflate.findViewById(p270o0O0000o.o0000Ooo.month_navigation_previous);
            this.f16909OooOOO = viewFindViewById;
            viewFindViewById.setTag("NAVIGATION_PREV_TAG");
            View viewFindViewById2 = viewInflate.findViewById(p270o0O0000o.o0000Ooo.month_navigation_next);
            this.f16911OooOOOO = viewFindViewById2;
            viewFindViewById2.setTag("NAVIGATION_NEXT_TAG");
            this.f16912OooOOOo = viewInflate.findViewById(i5);
            this.f16913OooOOo0 = viewInflate.findViewById(p270o0O0000o.o0000Ooo.mtrl_calendar_day_selector_frame);
            OooO0Oo(OooO0o.DAY);
            materialButton.setText(this.f16901OooO.OooO0OO());
            this.f16910OooOOO0.addOnScrollListener(new o000oOoO(this, monthsPagerAdapter, materialButton));
            materialButton.setOnClickListener(new o0OoOo0(this));
            this.f16911OooOOOO.setOnClickListener(new o00O0O(this, monthsPagerAdapter));
            this.f16909OooOOO.setOnClickListener(new OooOOO(this, monthsPagerAdapter));
        }
        if (!MaterialDatePicker.OooO0Oo(contextThemeWrapper)) {
            new androidx.recyclerview.widget.o000OOo().attachToRecyclerView(this.f16910OooOOO0);
        }
        RecyclerView recyclerView2 = this.f16910OooOOO0;
        Month month2 = this.f16901OooO;
        Month month3 = monthsPagerAdapter.f16864OooO00o.f16805OooO0Oo;
        if (!(month3.f16858OooO0Oo instanceof GregorianCalendar)) {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        recyclerView2.scrollToPosition((month2.f16860OooO0o0 - month3.f16860OooO0o0) + ((month2.f16859OooO0o - month3.f16859OooO0o) * 12));
        ViewCompat.OooOOOO(this.f16910OooOOO0, new OooOo());
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f16903OooO0o0);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.f16902OooO0o);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f16904OooO0oO);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.f16905OooO0oo);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f16901OooO);
    }
}
