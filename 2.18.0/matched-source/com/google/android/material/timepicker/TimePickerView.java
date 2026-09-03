package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewCompat;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import java.util.Objects;
import java.util.WeakHashMap;
import o000O0O0.o00000O;
import p338o0OO0o0.OooOOO0;
import p338o0OO0o0.OooOOOO;

/* JADX INFO: loaded from: classes2.dex */
class TimePickerView extends ConstraintLayout {

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public static final /* synthetic */ int f18100OoooO0 = 0;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final MaterialButtonToggleGroup f18101Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final OooO00o f18102OoooO00;

    public class OooO00o implements View.OnClickListener {
        public OooO00o() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            TimePickerView timePickerView = TimePickerView.this;
            int i = TimePickerView.f18100OoooO0;
            Objects.requireNonNull(timePickerView);
        }
    }

    public class OooO0O0 implements MaterialButtonToggleGroup.OooO0o {
        public OooO0O0() {
        }

        @Override // com.google.android.material.button.MaterialButtonToggleGroup.OooO0o
        public final void OooO00o() {
            TimePickerView timePickerView = TimePickerView.this;
            int i = TimePickerView.f18100OoooO0;
            Objects.requireNonNull(timePickerView);
        }
    }

    public TimePickerView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void OooO0O0() {
        androidx.constraintlayout.widget.OooO00o.C0043OooO00o c0043OooO00o;
        if (this.f18101Oooo.getVisibility() == 0) {
            androidx.constraintlayout.widget.OooO00o oooO00o = new androidx.constraintlayout.widget.OooO00o();
            oooO00o.OooO0o0(this);
            WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7885OooO00o;
            char c = ViewCompat.OooO.OooO0Oo(this) == 0 ? (char) 2 : (char) 1;
            int i = OooOOO0.material_clock_display;
            if (oooO00o.f7613OooO0o.containsKey(Integer.valueOf(i)) && (c0043OooO00o = oooO00o.f7613OooO0o.get(Integer.valueOf(i))) != null) {
                switch (c) {
                    case 1:
                        androidx.constraintlayout.widget.OooO00o.OooO0O0 oooO0O0 = c0043OooO00o.f7635OooO0o0;
                        oooO0O0.f7660OooOO0 = -1;
                        oooO0O0.f7651OooO = -1;
                        oooO0O0.f7685Oooo00O = -1;
                        oooO0O0.f7691Oooo0oO = Integer.MIN_VALUE;
                        break;
                    case 2:
                        androidx.constraintlayout.widget.OooO00o.OooO0O0 oooO0O1 = c0043OooO00o.f7635OooO0o0;
                        oooO0O1.f7662OooOO0o = -1;
                        oooO0O1.f7661OooOO0O = -1;
                        oooO0O1.f7686Oooo00o = -1;
                        oooO0O1.f7682Oooo = Integer.MIN_VALUE;
                        break;
                    case 3:
                        androidx.constraintlayout.widget.OooO00o.OooO0O0 oooO0O2 = c0043OooO00o.f7635OooO0o0;
                        oooO0O2.f7663OooOOO = -1;
                        oooO0O2.f7664OooOOO0 = -1;
                        oooO0O2.f7683Oooo0 = 0;
                        oooO0O2.f7692Oooo0oo = Integer.MIN_VALUE;
                        break;
                    case 4:
                        androidx.constraintlayout.widget.OooO00o.OooO0O0 oooO0O3 = c0043OooO00o.f7635OooO0o0;
                        oooO0O3.f7665OooOOOO = -1;
                        oooO0O3.f7666OooOOOo = -1;
                        oooO0O3.f7687Oooo0O0 = 0;
                        oooO0O3.f7695OoooO00 = Integer.MIN_VALUE;
                        break;
                    case 5:
                        androidx.constraintlayout.widget.OooO00o.OooO0O0 oooO0O4 = c0043OooO00o.f7635OooO0o0;
                        oooO0O4.f7668OooOOo0 = -1;
                        oooO0O4.f7667OooOOo = -1;
                        oooO0O4.f7669OooOOoo = -1;
                        oooO0O4.f7689Oooo0o = 0;
                        oooO0O4.f7693OoooO = Integer.MIN_VALUE;
                        break;
                    case 6:
                        androidx.constraintlayout.widget.OooO00o.OooO0O0 oooO0O5 = c0043OooO00o.f7635OooO0o0;
                        oooO0O5.f7672OooOo00 = -1;
                        oooO0O5.f7671OooOo0 = -1;
                        oooO0O5.f7690Oooo0o0 = 0;
                        oooO0O5.f7696OoooO0O = Integer.MIN_VALUE;
                        break;
                    case 7:
                        androidx.constraintlayout.widget.OooO00o.OooO0O0 oooO0O6 = c0043OooO00o.f7635OooO0o0;
                        oooO0O6.f7673OooOo0O = -1;
                        oooO0O6.f7674OooOo0o = -1;
                        oooO0O6.f7688Oooo0OO = 0;
                        oooO0O6.f7694OoooO0 = Integer.MIN_VALUE;
                        break;
                    case '\b':
                        androidx.constraintlayout.widget.OooO00o.OooO0O0 oooO0O7 = c0043OooO00o.f7635OooO0o0;
                        oooO0O7.f7678OooOoo = -1.0f;
                        oooO0O7.f7679OooOoo0 = -1;
                        oooO0O7.f7677OooOoOO = -1;
                        break;
                    default:
                        throw new IllegalArgumentException("unknown constraint");
                }
            }
            oooO00o.OooO0O0(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        OooO0O0();
    }

    @Override // android.view.View
    public final void onVisibilityChanged(@NonNull View view, int i) {
        super.onVisibilityChanged(view, i);
        if (view == this && i == 0) {
            OooO0O0();
        }
    }

    public TimePickerView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        OooO00o oooO00o = new OooO00o();
        this.f18102OoooO00 = oooO00o;
        LayoutInflater.from(context).inflate(OooOOOO.material_timepicker, this);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(OooOOO0.material_clock_period_toggle);
        this.f18101Oooo = materialButtonToggleGroup;
        materialButtonToggleGroup.f16716OoooO0.add(new OooO0O0());
        Chip chip = (Chip) findViewById(OooOOO0.material_minute_tv);
        Chip chip2 = (Chip) findViewById(OooOOO0.material_hour_tv);
        com.google.android.material.timepicker.OooO0O0 oooO0O0 = new com.google.android.material.timepicker.OooO0O0(new GestureDetector(getContext(), new com.google.android.material.timepicker.OooO00o(this)));
        chip.setOnTouchListener(oooO0O0);
        chip2.setOnTouchListener(oooO0O0);
        int i2 = OooOOO0.selection_type;
        chip.setTag(i2, 12);
        chip2.setTag(i2, 10);
        chip.setOnClickListener(oooO00o);
        chip2.setOnClickListener(oooO00o);
        chip.setAccessibilityClassName("android.view.View");
        chip2.setAccessibilityClassName("android.view.View");
    }
}
