package com.yalantis.ucrop;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.MimeTypeMap;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.transition.AutoTransition;
import com.yalantis.ucrop.model.AspectRatio;
import com.yalantis.ucrop.view.GestureCropImageView;
import com.yalantis.ucrop.view.OverlayView;
import com.yalantis.ucrop.view.TransformImageView;
import com.yalantis.ucrop.view.UCropView;
import com.yalantis.ucrop.view.widget.AspectRatioTextView;
import com.yalantis.ucrop.view.widget.HorizontalProgressWheelView;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import p201o00o0OoO.o000OOo0;
import p206o00o0o0o.o000O0O0;
import p400o0Oo0O.OooO;
import p400o0Oo0O.OooOO0;
import p400o0Oo0O.OooOOO;
import p400o0Oo0O.OooOOO0;
import p400o0Oo0O.OooOOOO;
import p416o0Oo0oO0.o00oO0o;
import p454o0Ooo0.OooOo00;
import p457o0Ooo00O.o0OOO0o;
import p457o0Ooo00O.o0Oo0oo;
import p457o0Ooo00O.o0ooOOo;
import p457o0Ooo00O.oo000o;
import p466o0OooO0.o0000O00;
import p552o0oOO0Oo.o000O0o;
import p583o0oOoOoo.m3;

/* JADX INFO: loaded from: classes2.dex */
public class UCropActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: o0ooOoO, reason: collision with root package name */
    public static final Bitmap.CompressFormat f20297o0ooOoO = Bitmap.CompressFormat.JPEG;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public int f20298Oooo;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int f20299Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public int f20300Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public RelativeLayout f20301OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public int f20302OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @ColorInt
    public int f20303OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public boolean f20304OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public ProgressBar f20305OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public UCropView f20306OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public GestureCropImageView f20307OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public OverlayView f20308OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public ViewGroup f20309OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public ViewGroup f20310OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public ViewGroup f20311Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public ViewGroup f20312Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public ViewGroup f20313OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public ViewGroup f20314OooooOO;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public TextView f20316Oooooo;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public TextView f20318OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public View f20319Ooooooo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public TextView f20320o000oOoO;

    /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
    public boolean f20323o00Ooo;

    /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
    public boolean f20324o00o0O;

    /* JADX INFO: renamed from: o00oO0O, reason: collision with root package name */
    public OooO00o f20325o00oO0O;

    /* JADX INFO: renamed from: o00oO0o, reason: collision with root package name */
    public Bitmap f20326o00oO0o;

    /* JADX INFO: renamed from: o00ooo, reason: collision with root package name */
    public boolean f20327o00ooo;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public AutoTransition f20328o0OoOo0;

    /* JADX INFO: renamed from: oo000o, reason: collision with root package name */
    public o000OOo0 f20331oo000o;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public List<ViewGroup> f20315OooooOo = new ArrayList();

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public List<AspectRatioTextView> f20317Oooooo0 = new ArrayList();

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public Bitmap.CompressFormat f20332ooOO = f20297o0ooOoO;

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    public int f20321o00O0O = 90;

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    public int[] f20322o00Oo0 = {1, 2, 3};

    /* JADX INFO: renamed from: o0ooOO0, reason: collision with root package name */
    public OooO0O0 f20329o0ooOO0 = new OooO0O0();

    /* JADX INFO: renamed from: o0ooOOo, reason: collision with root package name */
    public final OooO0OO f20330o0ooOOo = new OooO0OO();

    @Retention(RetentionPolicy.SOURCE)
    public @interface GestureTypes {
    }

    public class OooO00o implements o000O0o {
        public OooO00o() {
        }

        @Override // p552o0oOO0Oo.o000O0o
        public final void OooO00o(@NonNull Bitmap bitmap, @NonNull m3 m3Var, @NonNull Uri uri, @Nullable Uri uri2) {
            UCropActivity uCropActivity = UCropActivity.this;
            uCropActivity.f20326o00oO0o = bitmap;
            uCropActivity.f20331oo000o.f33225OoooO0O.setVisibility(0);
            UCropActivity.this.f20305OoooOO0.setVisibility(8);
            UCropActivity.this.f20320o000oOoO.setVisibility(8);
            GestureCropImageView gestureCropImageView = UCropActivity.this.f20307OoooOOo;
            gestureCropImageView.f20433Ooooo00 = uri;
            gestureCropImageView.f20434Ooooo0o = uri2;
            gestureCropImageView.f20435OooooO0 = m3Var;
            gestureCropImageView.f20430OoooOo0 = true;
            gestureCropImageView.setImageBitmap(bitmap);
        }

        @Override // p552o0oOO0Oo.o000O0o
        public final void onFailure(@NonNull Exception exc) {
            UCropActivity.this.f20331oo000o.f33225OoooO0O.setVisibility(8);
            UCropActivity.this.f20305OoooOO0.setVisibility(8);
            UCropActivity.this.f20320o000oOoO.setVisibility(0);
            GestureCropImageView gestureCropImageView = UCropActivity.this.f20307OoooOOo;
            if (gestureCropImageView != null) {
                gestureCropImageView.setFailure(exc);
            }
        }
    }

    public class OooO0O0 implements TransformImageView.OooO00o {
        public OooO0O0() {
        }

        public final void OooO00o(float f) {
            TextView textView = UCropActivity.this.f20316Oooooo;
            if (textView != null) {
                textView.setText(String.format(Locale.getDefault(), "%.1f°", Float.valueOf(f)));
            }
        }

        public final void OooO0O0(float f) {
            TextView textView = UCropActivity.this.f20318OoooooO;
            if (textView != null) {
                textView.setText(String.format(Locale.getDefault(), "%d%%", Integer.valueOf((int) (f * 100.0f))));
            }
        }
    }

    public class OooO0OO implements View.OnClickListener {
        public OooO0OO() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (view.isSelected()) {
                return;
            }
            UCropActivity uCropActivity = UCropActivity.this;
            int id = view.getId();
            Bitmap.CompressFormat compressFormat = UCropActivity.f20297o0ooOoO;
            uCropActivity.OooOo0o(id);
        }
    }

    public final void OooOOOO() {
        if (this.f20319Ooooooo == null) {
            this.f20319Ooooooo = new View(this);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(3, OooOOO0.include_title_layout_title);
            this.f20319Ooooooo.setLayoutParams(layoutParams);
            this.f20319Ooooooo.setClickable(true);
        }
        ((RelativeLayout) findViewById(OooOOO0.ucrop_photobox)).addView(this.f20319Ooooooo);
    }

    public final boolean OooOOOo() {
        Uri uri = (Uri) getIntent().getParcelableExtra("UCrop.InputUri");
        if (uri == null) {
            return true;
        }
        return OooOOo0(uri);
    }

    public final void OooOOo(int i) {
        if (OooOOOo()) {
            GestureCropImageView gestureCropImageView = this.f20307OoooOOo;
            int[] iArr = this.f20322o00Oo0;
            gestureCropImageView.setScaleEnabled(iArr[i] == 3 || iArr[i] == 1);
            GestureCropImageView gestureCropImageView2 = this.f20307OoooOOo;
            int[] iArr2 = this.f20322o00Oo0;
            gestureCropImageView2.setRotateEnabled(iArr2[i] == 3 || iArr2[i] == 2);
        }
    }

    public final boolean OooOOo0(Uri uri) {
        String mimeTypeFromExtension;
        if (o00oO0o.OooO0Oo(uri.toString())) {
            String strOooO0O0 = o00oO0o.OooO0O0(uri.toString());
            return !(strOooO0O0.startsWith(".gif") || strOooO0O0.startsWith(".GIF"));
        }
        if (uri.getScheme() == null || !"content".equals(uri.getScheme())) {
            mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(uri.toString()).toLowerCase());
        } else {
            mimeTypeFromExtension = getContentResolver().getType(uri);
        }
        if (TextUtils.isEmpty(mimeTypeFromExtension)) {
            mimeTypeFromExtension = "image/jpeg";
        }
        return !o00oO0o.OooO0OO(mimeTypeFromExtension);
    }

    public final void OooOOoo(@NonNull Intent intent) {
        Uri uri = (Uri) intent.getParcelableExtra("UCrop.InputUri");
        Uri uri2 = (Uri) intent.getParcelableExtra("UCrop.OutputUri");
        String stringExtra = intent.getStringExtra("UCrop.CompressionFormatName");
        Bitmap.CompressFormat compressFormatValueOf = !TextUtils.isEmpty(stringExtra) ? Bitmap.CompressFormat.valueOf(stringExtra) : null;
        if (compressFormatValueOf == null) {
            compressFormatValueOf = f20297o0ooOoO;
        }
        this.f20332ooOO = compressFormatValueOf;
        this.f20321o00O0O = intent.getIntExtra("UCrop.CompressionQuality", 90);
        OverlayView overlayView = this.f20308OoooOo0;
        Resources resources = getResources();
        int i = OooO.ucrop_color_default_crop_frame;
        overlayView.setDimmedBorderColor(intent.getIntExtra("UCrop.DimmedLayerBorderColor", resources.getColor(i)));
        boolean z = true;
        this.f20323o00Ooo = intent.getBooleanExtra("UCrop.DragCropFrame", true);
        this.f20308OoooOo0.setDimmedStrokeWidth(intent.getIntExtra("UCrop.CircleStrokeWidth", 1));
        this.f20324o00o0O = intent.getBooleanExtra("UCrop.scale", true);
        this.f20327o00ooo = intent.getBooleanExtra("UCrop.rotate", true);
        int[] intArrayExtra = intent.getIntArrayExtra("UCrop.AllowedGestures");
        if (intArrayExtra != null && intArrayExtra.length == 3) {
            this.f20322o00Oo0 = intArrayExtra;
        }
        this.f20307OoooOOo.setMaxBitmapSize(intent.getIntExtra("UCrop.MaxBitmapSize", 0));
        this.f20307OoooOOo.setMaxScaleMultiplier(intent.getFloatExtra("UCrop.MaxScaleMultiplier", 10.0f));
        this.f20307OoooOOo.setImageToWrapCropBoundsAnimDuration(intent.getIntExtra("UCrop.ImageToCropBoundsAnimDuration", 500));
        this.f20308OoooOo0.setFreestyleCropEnabled(intent.getBooleanExtra("UCrop.FreeStyleCrop", false));
        this.f20308OoooOo0.setDragFrame(this.f20323o00Ooo);
        this.f20308OoooOo0.setDimmedColor(intent.getIntExtra("UCrop.DimmedLayerColor", getResources().getColor(OooO.ucrop_color_default_dimmed)));
        this.f20308OoooOo0.setCircleDimmedLayer(intent.getBooleanExtra("UCrop.CircleDimmedLayer", false));
        this.f20308OoooOo0.setShowCropFrame(intent.getBooleanExtra("UCrop.ShowCropFrame", true));
        this.f20308OoooOo0.setCropFrameColor(intent.getIntExtra("UCrop.CropFrameColor", getResources().getColor(i)));
        this.f20308OoooOo0.setCropFrameStrokeWidth(intent.getIntExtra("UCrop.CropFrameStrokeWidth", getResources().getDimensionPixelSize(OooOO0.ucrop_default_crop_frame_stoke_width)));
        this.f20308OoooOo0.setShowCropGrid(intent.getBooleanExtra("UCrop.ShowCropGrid", true));
        this.f20308OoooOo0.setCropGridRowCount(intent.getIntExtra("UCrop.CropGridRowCount", 2));
        this.f20308OoooOo0.setCropGridColumnCount(intent.getIntExtra("UCrop.CropGridColumnCount", 2));
        this.f20308OoooOo0.setCropGridColor(intent.getIntExtra("UCrop.CropGridColor", getResources().getColor(OooO.ucrop_color_default_crop_grid)));
        this.f20308OoooOo0.setCropGridStrokeWidth(intent.getIntExtra("UCrop.CropGridStrokeWidth", getResources().getDimensionPixelSize(OooOO0.ucrop_default_crop_grid_stoke_width)));
        float floatExtra = intent.getFloatExtra("UCrop.AspectRatioX", ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        float floatExtra2 = intent.getFloatExtra("UCrop.AspectRatioY", ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        int intExtra = intent.getIntExtra("UCrop.AspectRatioSelectedByDefault", 0);
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("UCrop.AspectRatioOptions");
        if (floatExtra > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE && floatExtra2 > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            ViewGroup viewGroup = this.f20309OoooOoO;
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
            }
            this.f20307OoooOOo.setTargetAspectRatio(floatExtra / floatExtra2);
        } else if (parcelableArrayListExtra == null || intExtra >= parcelableArrayListExtra.size()) {
            this.f20307OoooOOo.setTargetAspectRatio(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        } else {
            this.f20307OoooOOo.setTargetAspectRatio(((AspectRatio) parcelableArrayListExtra.get(intExtra)).f20337Oooo0oO / ((AspectRatio) parcelableArrayListExtra.get(intExtra)).f20338Oooo0oo);
        }
        int intExtra2 = intent.getIntExtra("UCrop.MaxSizeX", 0);
        int intExtra3 = intent.getIntExtra("UCrop.MaxSizeY", 0);
        if (intExtra2 > 0 && intExtra3 > 0) {
            this.f20307OoooOOo.setMaxResultImageSizeX(intExtra2);
            this.f20307OoooOOo.setMaxResultImageSizeY(intExtra3);
        }
        this.f20325o00oO0O = new OooO00o();
        if (uri == null || uri2 == null) {
            OooOo0(new NullPointerException(getString(OooOOOO.ucrop_error_input_data_is_absent)));
            onBackPressed();
            return;
        }
        try {
            boolean zOooOOo0 = OooOOo0(uri);
            this.f20305OoooOO0.setVisibility(0);
            this.f20307OoooOOo.setBitmapLoadCallback(this.f20325o00oO0O);
            this.f20307OoooOOo.setRotateEnabled(zOooOOo0 && this.f20327o00ooo);
            GestureCropImageView gestureCropImageView = this.f20307OoooOOo;
            if (!zOooOOo0 || !this.f20324o00o0O) {
                z = false;
            }
            gestureCropImageView.setScaleEnabled(z);
            GestureCropImageView gestureCropImageView2 = this.f20307OoooOOo;
            int maxBitmapSize = gestureCropImageView2.getMaxBitmapSize();
            p454o0Ooo0.OooO.OooO0O0(gestureCropImageView2.getContext(), uri, uri2, maxBitmapSize, maxBitmapSize, gestureCropImageView2.f20436OooooOO);
        } catch (Exception e) {
            OooOo0(e);
            onBackPressed();
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void OooOo(@NonNull Intent intent) {
        this.f20300Oooo0oo = intent.getIntExtra("UCrop.UcropColorWidgetActive", o000O000.OooO00o.OooO0O0(this, OooO.ucrop_color_widget_background));
        this.f20298Oooo = intent.getIntExtra("UCrop.UcropColorControlsWidgetActive", o000O000.OooO00o.OooO0O0(this, OooO.ucrop_color_active_controls_color));
        this.f20302OoooO0 = intent.getIntExtra("UCrop.UcropLogoColor", o000O000.OooO00o.OooO0O0(this, OooO.ucrop_color_default_logo));
        this.f20304OoooO0O = !intent.getBooleanExtra("UCrop.HideBottomControls", false);
        this.f20303OoooO00 = intent.getIntExtra("UCrop.UcropRootViewBackgroundColor", o000O000.OooO00o.OooO0O0(this, OooO.ucrop_color_crop_background));
        o000OOo0 o000ooo1 = new o000OOo0(this);
        this.f20331oo000o = o000ooo1;
        o000ooo1.f33225OoooO0O.setVisibility(8);
        this.f20331oo000o.f33230OoooOoO = new o0000O00(this);
        int i = OooOOO0.ucrop_photobox;
        this.f20301OoooO = (RelativeLayout) findViewById(i);
        this.f20305OoooOO0 = (ProgressBar) findViewById(OooOOO0.progressBar);
        this.f20320o000oOoO = (TextView) findViewById(OooOOO0.errorText);
        UCropView uCropView = (UCropView) findViewById(OooOOO0.ucrop);
        this.f20306OoooOOO = uCropView;
        this.f20307OoooOOo = uCropView.getCropImageView();
        this.f20308OoooOo0 = this.f20306OoooOOO.getOverlayView();
        this.f20305OoooOO0.setVisibility(0);
        this.f20307OoooOOo.setTransformImageListener(this.f20329o0ooOO0);
        ((ImageView) findViewById(OooOOO0.image_view_logo)).setColorFilter(this.f20302OoooO0, PorterDuff.Mode.SRC_ATOP);
        findViewById(OooOOO0.ucrop_frame).setBackgroundColor(this.f20303OoooO00);
        if (this.f20304OoooO0O) {
            ViewGroup viewGroup = (ViewGroup) ((ViewGroup) findViewById(i)).findViewById(OooOOO0.controls_wrapper);
            viewGroup.setVisibility(0);
            viewGroup.setBackgroundColor(this.f20303OoooO00);
            LayoutInflater.from(this).inflate(OooOOO.ucrop_controls, viewGroup, true);
            AutoTransition autoTransition = new AutoTransition();
            this.f20328o0OoOo0 = autoTransition;
            autoTransition.Oooo0oO(50L);
            ViewGroup viewGroup2 = (ViewGroup) findViewById(OooOOO0.state_aspect_ratio);
            this.f20309OoooOoO = viewGroup2;
            viewGroup2.setOnClickListener(this.f20330o0ooOOo);
            ViewGroup viewGroup3 = (ViewGroup) findViewById(OooOOO0.state_rotate);
            this.f20310OoooOoo = viewGroup3;
            viewGroup3.setOnClickListener(this.f20330o0ooOOo);
            ViewGroup viewGroup4 = (ViewGroup) findViewById(OooOOO0.state_scale);
            this.f20311Ooooo00 = viewGroup4;
            viewGroup4.setOnClickListener(this.f20330o0ooOOo);
            int i2 = OooOOO0.layout_aspect_ratio;
            this.f20312Ooooo0o = (ViewGroup) findViewById(i2);
            this.f20313OooooO0 = (ViewGroup) findViewById(OooOOO0.layout_rotate_wheel);
            this.f20314OooooOO = (ViewGroup) findViewById(OooOOO0.layout_scale_wheel);
            int intExtra = intent.getIntExtra("UCrop.AspectRatioSelectedByDefault", 0);
            ArrayList<AspectRatio> parcelableArrayListExtra = intent.getParcelableArrayListExtra("UCrop.AspectRatioOptions");
            if (parcelableArrayListExtra == null || parcelableArrayListExtra.isEmpty()) {
                intExtra = 2;
                parcelableArrayListExtra = new ArrayList();
                parcelableArrayListExtra.add(new AspectRatio(null, 1.0f, 1.0f));
                parcelableArrayListExtra.add(new AspectRatio(null, 3.0f, 4.0f));
                parcelableArrayListExtra.add(new AspectRatio(getString(OooOOOO.ucrop_label_original).toUpperCase(), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE));
                parcelableArrayListExtra.add(new AspectRatio(null, 3.0f, 2.0f));
                parcelableArrayListExtra.add(new AspectRatio(null, 16.0f, 9.0f));
            }
            LinearLayout linearLayout = (LinearLayout) findViewById(i2);
            int i3 = -1;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1);
            layoutParams.weight = 1.0f;
            if (this instanceof PictureMultiCuttingActivity) {
                this.f20317Oooooo0 = new ArrayList();
                this.f20315OooooOo = new ArrayList();
            }
            for (AspectRatio aspectRatio : parcelableArrayListExtra) {
                FrameLayout frameLayout = (FrameLayout) getLayoutInflater().inflate(OooOOO.ucrop_aspect_ratio, (ViewGroup) null);
                frameLayout.setLayoutParams(layoutParams);
                AspectRatioTextView aspectRatioTextView = (AspectRatioTextView) frameLayout.getChildAt(0);
                aspectRatioTextView.setActiveColor(this.f20298Oooo);
                aspectRatioTextView.setAspectRatio(aspectRatio);
                this.f20317Oooooo0.add(aspectRatioTextView);
                linearLayout.addView(frameLayout);
                this.f20315OooooOo.add(frameLayout);
            }
            this.f20315OooooOo.get(intExtra).setSelected(true);
            for (ViewGroup viewGroup5 : this.f20315OooooOo) {
                i3++;
                viewGroup5.setTag(Integer.valueOf(i3));
                viewGroup5.setOnClickListener(new oo000o(this));
            }
            this.f20316Oooooo = (TextView) findViewById(OooOOO0.text_view_rotate);
            int i4 = OooOOO0.rotate_scroll_wheel;
            ((HorizontalProgressWheelView) findViewById(i4)).setScrollingListener(new p457o0Ooo00O.o00oO0o(this));
            ((HorizontalProgressWheelView) findViewById(i4)).setMiddleLineColor(this.f20300Oooo0oo);
            findViewById(OooOOO0.wrapper_reset_rotate).setOnClickListener(new o0ooOOo(this));
            findViewById(OooOOO0.wrapper_rotate_by_angle).setOnClickListener(new o0OOO0o(this));
            this.f20318OoooooO = (TextView) findViewById(OooOOO0.text_view_scale);
            int i5 = OooOOO0.scale_scroll_wheel;
            ((HorizontalProgressWheelView) findViewById(i5)).setScrollingListener(new o0Oo0oo(this));
            ((HorizontalProgressWheelView) findViewById(i5)).setMiddleLineColor(this.f20300Oooo0oo);
            ImageView imageView = (ImageView) findViewById(OooOOO0.image_view_state_scale);
            ImageView imageView2 = (ImageView) findViewById(OooOOO0.image_view_state_rotate);
            ImageView imageView3 = (ImageView) findViewById(OooOOO0.image_view_state_aspect_ratio);
            imageView.setImageDrawable(new OooOo00(imageView.getDrawable(), this.f20298Oooo));
            imageView2.setImageDrawable(new OooOo00(imageView2.getDrawable(), this.f20298Oooo));
            imageView3.setImageDrawable(new OooOo00(imageView3.getDrawable(), this.f20298Oooo));
        }
    }

    public final void OooOo0(Throwable th) {
        setResult(96, new Intent().putExtra("UCrop.Error", th));
    }

    public final void OooOo00() {
        if (!this.f20304OoooO0O) {
            OooOOo(0);
        } else if (this.f20309OoooOoO.getVisibility() == 0) {
            OooOo0o(OooOOO0.state_aspect_ratio);
        } else {
            OooOo0o(OooOOO0.state_scale);
        }
    }

    public void OooOo0O(Uri uri, float f, int i, int i2, int i3, int i4) {
        setResult(-1, new Intent().putExtra("UCrop.OutputUri", uri).putExtra("UCrop.CropAspectRatio", f).putExtra("UCrop.ImageWidth", i3).putExtra("UCrop.ImageHeight", i4).putExtra("UCrop.OffsetX", i).putExtra("UCrop.OffsetY", i2));
    }

    public final void OooOo0o(@IdRes int i) {
        if (this.f20304OoooO0O) {
            ViewGroup viewGroup = this.f20309OoooOoO;
            int i2 = OooOOO0.state_aspect_ratio;
            viewGroup.setSelected(i == i2);
            ViewGroup viewGroup2 = this.f20310OoooOoo;
            int i3 = OooOOO0.state_rotate;
            viewGroup2.setSelected(i == i3);
            ViewGroup viewGroup3 = this.f20311Ooooo00;
            int i4 = OooOOO0.state_scale;
            viewGroup3.setSelected(i == i4);
            this.f20312Ooooo0o.setVisibility(i == i2 ? 0 : 8);
            this.f20313OooooO0.setVisibility(i == i3 ? 0 : 8);
            this.f20314OooooOO.setVisibility(i == i4 ? 0 : 8);
            androidx.transition.OooOO0.OooO00o((ViewGroup) findViewById(OooOOO0.ucrop_photobox), this.f20328o0OoOo0);
            this.f20311Ooooo00.findViewById(OooOOO0.text_view_scale).setVisibility(i == i4 ? 0 : 8);
            this.f20309OoooOoO.findViewById(OooOOO0.text_view_crop).setVisibility(i == i2 ? 0 : 8);
            this.f20310OoooOoo.findViewById(OooOOO0.text_view_rotate).setVisibility(i == i3 ? 0 : 8);
            if (i == i4) {
                OooOOo(0);
            } else if (i == i3) {
                OooOOo(1);
            } else {
                OooOOo(2);
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        Bitmap bitmap = this.f20326o00oO0o;
        if (bitmap != null) {
            bitmap.recycle();
        }
        GestureCropImageView gestureCropImageView = this.f20307OoooOOo;
        if (gestureCropImageView != null) {
            gestureCropImageView.setBitmapLoadCallback(null);
        }
        this.f20326o00oO0o = null;
        this.f20325o00oO0O = null;
        this.f20307OoooOOo = null;
        finish();
        int intExtra = getIntent().getIntExtra("UCrop.WindowAnimation", 0);
        int i = p400o0Oo0O.OooO0o.ucrop_anim_fade_in;
        if (intExtra == 0) {
            intExtra = p400o0Oo0O.OooO0o.ucrop_close;
        }
        overridePendingTransition(i, intExtra);
        System.gc();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        setContentView(OooOOO.ucrop_activity_photobox);
        this.f20299Oooo0oO = o000O0O0.OooO0O0(this);
        OooOo(intent);
        int intExtra = getIntent().getIntExtra("UCrop.navBarColor", 0);
        if (intExtra != 0) {
            getWindow().setNavigationBarColor(intExtra);
        }
        OooOOoo(intent);
        OooOo00();
        OooOOOO();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        super.onStop();
        GestureCropImageView gestureCropImageView = this.f20307OoooOOo;
        if (gestureCropImageView != null) {
            gestureCropImageView.OooOO0O();
        }
    }
}
