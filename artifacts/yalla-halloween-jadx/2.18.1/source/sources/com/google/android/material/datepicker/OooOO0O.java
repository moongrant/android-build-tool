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
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import p072o000O0o0.o0000OO0;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class OooOO0O<S> extends o0ooOOo<S> {

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public static final /* synthetic */ int f16948OoooOOo = 0;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @Nullable
    public CalendarConstraints f16949Oooo;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @StyleRes
    public int f16950Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @Nullable
    public DateSelector<S> f16951Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public RecyclerView f16952OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public int f16953OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @Nullable
    public Month f16954OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public com.google.android.material.datepicker.OooO0O0 f16955OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public RecyclerView f16956OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public View f16957OoooOOO;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public View f16958o000oOoO;

    public interface OooO {
    }

    public class OooO00o implements Runnable {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ int f16959Oooo0o;

        public OooO00o(int i) {
            this.f16959Oooo0o = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            OooOO0O.this.f16956OoooOO0.smoothScrollToPosition(this.f16959Oooo0o);
        }
    }

    public class OooO0O0 extends androidx.core.view.OooO00o {
        @Override // androidx.core.view.OooO00o
        public final void OooO0Oo(View view, @NonNull o0000OO0 o0000oo1) {
            this.f7862OooO00o.onInitializeAccessibilityNodeInfo(view, o0000oo1.f28194OooO00o);
            o0000oo1.Oooo00o(null);
        }
    }

    public class OooO0OO extends oo0o0Oo {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ int f16961Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(Context context, int i, int i2) {
            super(context, i);
            this.f16961Oooo0o = i2;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public final void calculateExtraLayoutSpace(@NonNull RecyclerView.o0OOO0o o0ooo0o2, @NonNull int[] iArr) {
            if (this.f16961Oooo0o == 0) {
                iArr[0] = OooOO0O.this.f16956OoooOO0.getWidth();
                iArr[1] = OooOO0O.this.f16956OoooOO0.getWidth();
            } else {
                iArr[0] = OooOO0O.this.f16956OoooOO0.getHeight();
                iArr[1] = OooOO0O.this.f16956OoooOO0.getHeight();
            }
        }
    }

    public class OooO0o implements OooO {
        public OooO0o() {
        }
    }

    @Override // com.google.android.material.datepicker.o0ooOOo
    public final boolean OooO00o(@NonNull o00oO0o<S> o00oo0o2) {
        return this.f17016Oooo0o.add(o00oo0o2);
    }

    @NonNull
    public final LinearLayoutManager OooO0O0() {
        return (LinearLayoutManager) this.f16956OoooOO0.getLayoutManager();
    }

    public final void OooO0OO(int i) {
        this.f16956OoooOO0.post(new OooO00o(i));
    }

    public final void OooO0Oo(Month month) {
        oo000o oo000oVar = (oo000o) this.f16956OoooOO0.getAdapter();
        int iOooO0O0 = oo000oVar.OooO0O0(month);
        int iOooO0O1 = iOooO0O0 - oo000oVar.OooO0O0(this.f16954OoooO00);
        boolean z = Math.abs(iOooO0O1) > 3;
        boolean z2 = iOooO0O1 > 0;
        this.f16954OoooO00 = month;
        if (z && z2) {
            this.f16956OoooOO0.scrollToPosition(iOooO0O0 - 3);
            OooO0OO(iOooO0O0);
        } else if (!z) {
            OooO0OO(iOooO0O0);
        } else {
            this.f16956OoooOO0.scrollToPosition(iOooO0O0 + 3);
            OooO0OO(iOooO0O0);
        }
    }

    public final void OooO0o0(int i) {
        this.f16953OoooO0 = i;
        if (i == 2) {
            this.f16952OoooO.getLayoutManager().scrollToPosition(((o000000O) this.f16952OoooO.getAdapter()).OooO00o(this.f16954OoooO00.f16916Oooo0oo));
            this.f16958o000oOoO.setVisibility(0);
            this.f16957OoooOOO.setVisibility(8);
        } else if (i == 1) {
            this.f16958o000oOoO.setVisibility(8);
            this.f16957OoooOOO.setVisibility(0);
            OooO0Oo(this.f16954OoooO00);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f16950Oooo0oO = bundle.getInt("THEME_RES_ID_KEY");
        this.f16951Oooo0oo = (DateSelector) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.f16949Oooo = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f16954OoooO00 = (Month) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    @NonNull
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        int i;
        int i2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.f16950Oooo0oO);
        this.f16955OoooO0O = new com.google.android.material.datepicker.OooO0O0(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        Month month = this.f16949Oooo.f16868Oooo0o;
        if (MaterialDatePicker.OooO0OO(contextThemeWrapper)) {
            i = p337o0OO0o0.OooOOOO.mtrl_calendar_vertical;
            i2 = 1;
        } else {
            i = p337o0OO0o0.OooOOOO.mtrl_calendar_horizontal;
            i2 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i, viewGroup, false);
        Resources resources = requireContext().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(p337o0OO0o0.OooOO0.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(p337o0OO0o0.OooOO0.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(p337o0OO0o0.OooOO0.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(p337o0OO0o0.OooOO0.mtrl_calendar_days_of_week_height);
        int i3 = o00Oo0.f16995OoooO0;
        viewInflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(p337o0OO0o0.OooOO0.mtrl_calendar_month_vertical_padding) * (i3 - 1)) + (resources.getDimensionPixelSize(p337o0OO0o0.OooOO0.mtrl_calendar_day_height) * i3) + resources.getDimensionPixelOffset(p337o0OO0o0.OooOO0.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) viewInflate.findViewById(p337o0OO0o0.OooOOO0.mtrl_calendar_days_of_week);
        ViewCompat.OooOo0o(gridView, new OooO0O0());
        gridView.setAdapter((ListAdapter) new OooOO0());
        gridView.setNumColumns(month.f16913Oooo);
        gridView.setEnabled(false);
        this.f16956OoooOO0 = (RecyclerView) viewInflate.findViewById(p337o0OO0o0.OooOOO0.mtrl_calendar_months);
        this.f16956OoooOO0.setLayoutManager(new OooO0OO(getContext(), i2, i2));
        this.f16956OoooOO0.setTag("MONTHS_VIEW_GROUP_TAG");
        oo000o oo000oVar = new oo000o(contextThemeWrapper, this.f16951Oooo0oo, this.f16949Oooo, new OooO0o());
        this.f16956OoooOO0.setAdapter(oo000oVar);
        int integer = contextThemeWrapper.getResources().getInteger(p337o0OO0o0.OooOOO.mtrl_calendar_year_selector_span);
        int i4 = p337o0OO0o0.OooOOO0.mtrl_calendar_year_selector_frame;
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(i4);
        this.f16952OoooO = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f16952OoooO.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.f16952OoooO.setAdapter(new o000000O(this));
            this.f16952OoooO.addItemDecoration(new OooOOO0(this));
        }
        int i5 = p337o0OO0o0.OooOOO0.month_navigation_fragment_toggle;
        if (viewInflate.findViewById(i5) != null) {
            MaterialButton materialButton = (MaterialButton) viewInflate.findViewById(i5);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            ViewCompat.OooOo0o(materialButton, new OooOOO(this));
            MaterialButton materialButton2 = (MaterialButton) viewInflate.findViewById(p337o0OO0o0.OooOOO0.month_navigation_previous);
            materialButton2.setTag("NAVIGATION_PREV_TAG");
            MaterialButton materialButton3 = (MaterialButton) viewInflate.findViewById(p337o0OO0o0.OooOOO0.month_navigation_next);
            materialButton3.setTag("NAVIGATION_NEXT_TAG");
            this.f16958o000oOoO = viewInflate.findViewById(i4);
            this.f16957OoooOOO = viewInflate.findViewById(p337o0OO0o0.OooOOO0.mtrl_calendar_day_selector_frame);
            OooO0o0(1);
            materialButton.setText(this.f16954OoooO00.OooO0oO());
            this.f16956OoooOO0.addOnScrollListener(new OooOOOO(this, oo000oVar, materialButton));
            materialButton.setOnClickListener(new OooOo00(this));
            materialButton3.setOnClickListener(new OooOo(this, oo000oVar));
            materialButton2.setOnClickListener(new Oooo000(this, oo000oVar));
        }
        if (!MaterialDatePicker.OooO0OO(contextThemeWrapper)) {
            new androidx.recyclerview.widget.o000OOo().attachToRecyclerView(this.f16956OoooOO0);
        }
        this.f16956OoooOO0.scrollToPosition(oo000oVar.OooO0O0(this.f16954OoooO00));
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f16950Oooo0oO);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.f16951Oooo0oo);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f16949Oooo);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f16954OoooO00);
    }
}
