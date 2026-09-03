package com.yalantis.ucrop.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.Objects;
import p400o0Oo0O.OooO;
import p400o0Oo0O.OooOO0;
import p400o0Oo0O.OooOOO;
import p400o0Oo0O.OooOOO0;
import p400o0Oo0O.OooOo00;
import p460o0Ooo0O0.o0000O0;
import p460o0Ooo0O0.o0000O0O;

/* JADX INFO: loaded from: classes2.dex */
public class UCropView extends FrameLayout {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public GestureCropImageView f20438Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final OverlayView f20439Oooo0oO;

    public UCropView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @NonNull
    public GestureCropImageView getCropImageView() {
        return this.f20438Oooo0o;
    }

    @NonNull
    public OverlayView getOverlayView() {
        return this.f20439Oooo0oO;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public UCropView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(OooOOO.ucrop_view, (ViewGroup) this, true);
        this.f20438Oooo0o = (GestureCropImageView) findViewById(OooOOO0.image_view_crop);
        OverlayView overlayView = (OverlayView) findViewById(OooOOO0.view_overlay);
        this.f20439Oooo0oO = overlayView;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, OooOo00.ucrop_UCropView);
        Objects.requireNonNull(overlayView);
        overlayView.f20402OoooOOo = typedArrayObtainStyledAttributes.getBoolean(OooOo00.ucrop_UCropView_ucrop_circle_dimmed_layer, false);
        overlayView.f20403OoooOo0 = typedArrayObtainStyledAttributes.getColor(OooOo00.ucrop_UCropView_ucrop_dimmed_color, overlayView.getResources().getColor(OooO.ucrop_color_default_dimmed));
        overlayView.f20406Ooooo00.setColor(overlayView.f20404OoooOoO);
        overlayView.f20406Ooooo00.setStyle(Paint.Style.STROKE);
        overlayView.f20406Ooooo00.setStrokeWidth(overlayView.f20416o00O0O);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(OooOo00.ucrop_UCropView_ucrop_frame_stroke_size, overlayView.getResources().getDimensionPixelSize(OooOO0.ucrop_default_crop_frame_stoke_width));
        int color = typedArrayObtainStyledAttributes.getColor(OooOo00.ucrop_UCropView_ucrop_frame_color, overlayView.getResources().getColor(OooO.ucrop_color_default_crop_frame));
        overlayView.f20408OooooO0.setStrokeWidth(dimensionPixelSize);
        overlayView.f20408OooooO0.setColor(color);
        overlayView.f20408OooooO0.setStyle(Paint.Style.STROKE);
        overlayView.f20409OooooOO.setStrokeWidth(dimensionPixelSize * 3);
        overlayView.f20409OooooOO.setColor(color);
        overlayView.f20409OooooOO.setStyle(Paint.Style.STROKE);
        overlayView.f20415o000oOoO = typedArrayObtainStyledAttributes.getBoolean(OooOo00.ucrop_UCropView_ucrop_show_frame, true);
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(OooOo00.ucrop_UCropView_ucrop_grid_stroke_size, overlayView.getResources().getDimensionPixelSize(OooOO0.ucrop_default_crop_grid_stoke_width));
        int color2 = typedArrayObtainStyledAttributes.getColor(OooOo00.ucrop_UCropView_ucrop_grid_color, overlayView.getResources().getColor(OooO.ucrop_color_default_crop_grid));
        overlayView.f20407Ooooo0o.setStrokeWidth(dimensionPixelSize2);
        overlayView.f20407Ooooo0o.setColor(color2);
        overlayView.f20397OoooO0 = typedArrayObtainStyledAttributes.getInt(OooOo00.ucrop_UCropView_ucrop_grid_row_count, 2);
        overlayView.f20399OoooO0O = typedArrayObtainStyledAttributes.getInt(OooOo00.ucrop_UCropView_ucrop_grid_column_count, 2);
        overlayView.f20401OoooOOO = typedArrayObtainStyledAttributes.getBoolean(OooOo00.ucrop_UCropView_ucrop_show_grid, true);
        GestureCropImageView gestureCropImageView = this.f20438Oooo0o;
        Objects.requireNonNull(gestureCropImageView);
        float fAbs = Math.abs(typedArrayObtainStyledAttributes.getFloat(OooOo00.ucrop_UCropView_ucrop_aspect_ratio_x, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE));
        float fAbs2 = Math.abs(typedArrayObtainStyledAttributes.getFloat(OooOo00.ucrop_UCropView_ucrop_aspect_ratio_y, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE));
        if (fAbs == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE || fAbs2 == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            gestureCropImageView.f20353Oooooo = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        } else {
            gestureCropImageView.f20353Oooooo = fAbs / fAbs2;
        }
        typedArrayObtainStyledAttributes.recycle();
        this.f20438Oooo0o.setCropBoundsChangeListener(new o0000O0(this));
        overlayView.setOverlayViewChangeListener(new o0000O0O(this));
    }
}
