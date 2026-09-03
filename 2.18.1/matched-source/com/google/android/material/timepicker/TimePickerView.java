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
import p337o0OO0o0.OooOOO0;
import p337o0OO0o0.OooOOOO;

/* JADX INFO: loaded from: classes2.dex */
class TimePickerView extends ConstraintLayout {

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public static final /* synthetic */ int f18081Oooo0oo = 0;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final MaterialButtonToggleGroup f18082Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final OooO00o f18083Oooo0oO;

    public class OooO00o implements View.OnClickListener {
        public OooO00o() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            TimePickerView timePickerView = TimePickerView.this;
            int i = TimePickerView.f18081Oooo0oo;
            Objects.requireNonNull(timePickerView);
        }
    }

    public class OooO0O0 implements MaterialButtonToggleGroup.OooO0o {
        public OooO0O0() {
        }

        @Override // com.google.android.material.button.MaterialButtonToggleGroup.OooO0o
        public final void OooO00o() {
            TimePickerView timePickerView = TimePickerView.this;
            int i = TimePickerView.f18081Oooo0oo;
            Objects.requireNonNull(timePickerView);
        }
    }

    public TimePickerView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void OooO0O0() {
        androidx.constraintlayout.widget.OooO00o.C0043OooO00o c0043OooO00o;
        if (this.f18082Oooo0o.getVisibility() == 0) {
            androidx.constraintlayout.widget.OooO00o oooO00o = new androidx.constraintlayout.widget.OooO00o();
            oooO00o.OooO0o0(this);
            WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
            char c = ViewCompat.OooO.OooO0Oo(this) == 0 ? (char) 2 : (char) 1;
            int i = OooOOO0.material_clock_display;
            if (oooO00o.f7598OooO0o.containsKey(Integer.valueOf(i)) && (c0043OooO00o = oooO00o.f7598OooO0o.get(Integer.valueOf(i))) != null) {
                switch (c) {
                    case 1:
                        androidx.constraintlayout.widget.OooO00o.OooO0O0 oooO0O0 = c0043OooO00o.f7620OooO0o0;
                        oooO0O0.f7645OooOO0 = -1;
                        oooO0O0.f7636OooO = -1;
                        oooO0O0.f7670Oooo00O = -1;
                        oooO0O0.f7676Oooo0oO = Integer.MIN_VALUE;
                        break;
                    case 2:
                        androidx.constraintlayout.widget.OooO00o.OooO0O0 oooO0O1 = c0043OooO00o.f7620OooO0o0;
                        oooO0O1.f7647OooOO0o = -1;
                        oooO0O1.f7646OooOO0O = -1;
                        oooO0O1.f7671Oooo00o = -1;
                        oooO0O1.f7667Oooo = Integer.MIN_VALUE;
                        break;
                    case 3:
                        androidx.constraintlayout.widget.OooO00o.OooO0O0 oooO0O2 = c0043OooO00o.f7620OooO0o0;
                        oooO0O2.f7648OooOOO = -1;
                        oooO0O2.f7649OooOOO0 = -1;
                        oooO0O2.f7668Oooo0 = 0;
                        oooO0O2.f7677Oooo0oo = Integer.MIN_VALUE;
                        break;
                    case 4:
                        androidx.constraintlayout.widget.OooO00o.OooO0O0 oooO0O3 = c0043OooO00o.f7620OooO0o0;
                        oooO0O3.f7650OooOOOO = -1;
                        oooO0O3.f7651OooOOOo = -1;
                        oooO0O3.f7672Oooo0O0 = 0;
                        oooO0O3.f7680OoooO00 = Integer.MIN_VALUE;
                        break;
                    case 5:
                        androidx.constraintlayout.widget.OooO00o.OooO0O0 oooO0O4 = c0043OooO00o.f7620OooO0o0;
                        oooO0O4.f7653OooOOo0 = -1;
                        oooO0O4.f7652OooOOo = -1;
                        oooO0O4.f7654OooOOoo = -1;
                        oooO0O4.f7674Oooo0o = 0;
                        oooO0O4.f7678OoooO = Integer.MIN_VALUE;
                        break;
                    case 6:
                        androidx.constraintlayout.widget.OooO00o.OooO0O0 oooO0O5 = c0043OooO00o.f7620OooO0o0;
                        oooO0O5.f7657OooOo00 = -1;
                        oooO0O5.f7656OooOo0 = -1;
                        oooO0O5.f7675Oooo0o0 = 0;
                        oooO0O5.f7681OoooO0O = Integer.MIN_VALUE;
                        break;
                    case 7:
                        androidx.constraintlayout.widget.OooO00o.OooO0O0 oooO0O6 = c0043OooO00o.f7620OooO0o0;
                        oooO0O6.f7658OooOo0O = -1;
                        oooO0O6.f7659OooOo0o = -1;
                        oooO0O6.f7673Oooo0OO = 0;
                        oooO0O6.f7679OoooO0 = Integer.MIN_VALUE;
                        break;
                    case '\b':
                        androidx.constraintlayout.widget.OooO00o.OooO0O0 oooO0O7 = c0043OooO00o.f7620OooO0o0;
                        oooO0O7.f7663OooOoo = -1.0f;
                        oooO0O7.f7664OooOoo0 = -1;
                        oooO0O7.f7662OooOoOO = -1;
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
        this.f18083Oooo0oO = oooO00o;
        LayoutInflater.from(context).inflate(OooOOOO.material_timepicker, this);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(OooOOO0.material_clock_period_toggle);
        this.f18082Oooo0o = materialButtonToggleGroup;
        materialButtonToggleGroup.f16699Oooo0oo.add(new OooO0O0());
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
