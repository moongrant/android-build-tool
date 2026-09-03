package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import p270o0O0000o.o0000O00;
import p270o0O0000o.o0000Ooo;

/* JADX INFO: loaded from: classes3.dex */
class TimePickerView extends ConstraintLayout {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final /* synthetic */ int f18204OooO0o0 = 0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Chip f18205OooO0Oo;

    public class OooO00o implements View.OnClickListener {
        public OooO00o() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int i = TimePickerView.f18204OooO0o0;
            TimePickerView.this.getClass();
        }
    }

    public TimePickerView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.View
    public final void onVisibilityChanged(@NonNull View view, int i) {
        super.onVisibilityChanged(view, i);
        if (view == this && i == 0) {
            this.f18205OooO0Oo.sendAccessibilityEvent(8);
        }
    }

    public TimePickerView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        OooO00o oooO00o = new OooO00o();
        LayoutInflater.from(context).inflate(o0000O00.material_timepicker, this);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(o0000Ooo.material_clock_period_toggle);
        materialButtonToggleGroup.f16555OooO0o.add(new MaterialButtonToggleGroup.OooO0o() { // from class: com.google.android.material.timepicker.OooO0OO
            @Override // com.google.android.material.button.MaterialButtonToggleGroup.OooO0o
            public final void OooO00o() {
                int i2 = TimePickerView.f18204OooO0o0;
                this.f18195OooO00o.getClass();
            }
        });
        Chip chip = (Chip) findViewById(o0000Ooo.material_minute_tv);
        Chip chip2 = (Chip) findViewById(o0000Ooo.material_hour_tv);
        this.f18205OooO0Oo = chip2;
        OooO oooO = new OooO(new GestureDetector(getContext(), new OooO0o(this)));
        chip.setOnTouchListener(oooO);
        chip2.setOnTouchListener(oooO);
        int i2 = o0000Ooo.selection_type;
        chip.setTag(i2, 12);
        chip2.setTag(i2, 10);
        chip.setOnClickListener(oooO00o);
        chip2.setOnClickListener(oooO00o);
        chip.setAccessibilityClassName(AndroidComposeViewAccessibilityDelegateCompat.ClassName);
        chip2.setAccessibilityClassName(AndroidComposeViewAccessibilityDelegateCompat.ClassName);
    }
}
