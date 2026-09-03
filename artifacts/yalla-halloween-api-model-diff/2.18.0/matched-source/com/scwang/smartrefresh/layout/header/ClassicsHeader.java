package com.scwang.smartrefresh.layout.header;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import com.scwang.smartrefresh.layout.internal.InternalClassics;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import p410o0Oo0OOo.oO000OOo;
import p410o0Oo0OOo.oO000Oo0;
import p412o0Oo0Oo0.o0OoOo0;
import p413o0Oo0OoO.oO000Oo;
import p413o0Oo0OoO.oO0O0OoO;
import p414o0Oo0Ooo.oO00O0o;
import p588o0oOoo00.o00oO0o;
import p588o0oOoo00.o0OOO0o;
import p588o0oOoo00.o0Oo0oo;
import p588o0oOoo00.o0ooOOo;

/* JADX INFO: loaded from: classes2.dex */
public class ClassicsHeader extends InternalClassics<ClassicsHeader> implements oO000OOo {

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public String f19658OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public TextView f19659Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public Date f19660Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public SharedPreferences f19661OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public SimpleDateFormat f19662Ooooooo;

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    public String f19663o00O0O;

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    public String f19664o00Oo0;

    /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
    public String f19665o00Ooo;

    /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
    public String f19666o00o0O;

    /* JADX INFO: renamed from: o00oO0o, reason: collision with root package name */
    public String f19667o00oO0o;

    /* JADX INFO: renamed from: o00ooo, reason: collision with root package name */
    public String f19668o00ooo;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public boolean f19669o0OoOo0;

    /* JADX INFO: renamed from: oo000o, reason: collision with root package name */
    public String f19670oo000o;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public String f19671ooOO;

    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f19672OooO00o;

        static {
            int[] iArr = new int[RefreshState.values().length];
            f19672OooO00o = iArr;
            try {
                iArr[RefreshState.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19672OooO00o[RefreshState.PullDownToRefresh.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19672OooO00o[RefreshState.Refreshing.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19672OooO00o[RefreshState.RefreshReleased.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19672OooO00o[RefreshState.ReleaseToRefresh.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19672OooO00o[RefreshState.ReleaseToTwoLevel.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19672OooO00o[RefreshState.Loading.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public ClassicsHeader(Context context) {
        this(context, null);
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalClassics, com.scwang.smartrefresh.layout.internal.InternalAbstract, p410o0Oo0OOo.ooOOOOoo
    public final int OooO0O0(@NonNull oO000Oo0 oo000oo0, boolean z) {
        if (z) {
            this.f19690OoooO0O.setText(this.f19666o00o0O);
            if (this.f19660Oooooo0 != null) {
                OooOO0o(new Date());
            }
        } else {
            this.f19690OoooO0O.setText(this.f19668o00ooo);
        }
        return super.OooO0O0(oo000oo0, z);
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, p420o0Oo0oOo.oO00OOO
    public final void OooO0oo(@NonNull oO000Oo0 oo000oo0, @NonNull RefreshState refreshState, @NonNull RefreshState refreshState2) {
        ImageView imageView = this.f19689OoooO;
        TextView textView = this.f19659Oooooo;
        switch (OooO00o.f19672OooO00o[refreshState2.ordinal()]) {
            case 1:
                textView.setVisibility(this.f19669o0OoOo0 ? 0 : 8);
                break;
            case 2:
                break;
            case 3:
            case 4:
                this.f19690OoooO0O.setText(this.f19663o00O0O);
                imageView.setVisibility(8);
                return;
            case 5:
                this.f19690OoooO0O.setText(this.f19665o00Ooo);
                imageView.animate().rotation(180.0f);
                return;
            case 6:
                this.f19690OoooO0O.setText(this.f19667o00oO0o);
                imageView.animate().rotation(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                return;
            case 7:
                imageView.setVisibility(8);
                textView.setVisibility(this.f19669o0OoOo0 ? 4 : 8);
                this.f19690OoooO0O.setText(this.f19664o00Oo0);
                return;
            default:
                return;
        }
        this.f19690OoooO0O.setText(this.f19671ooOO);
        imageView.setVisibility(0);
        imageView.animate().rotation(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalClassics
    public final InternalClassics OooOO0(@ColorInt int i) {
        this.f19659Oooooo.setTextColor((16777215 & i) | (-872415232));
        super.OooOO0(i);
        return this;
    }

    public final ClassicsHeader OooOO0o(Date date) {
        this.f19660Oooooo0 = date;
        this.f19659Oooooo.setText(this.f19662Ooooooo.format(date));
        if (this.f19661OoooooO != null && !isInEditMode()) {
            this.f19661OoooooO.edit().putLong(this.f19658OooooOo, date.getTime()).apply();
        }
        return this;
    }

    public ClassicsHeader(Context context, AttributeSet attributeSet) {
        FragmentManager supportFragmentManager;
        List<Fragment> listOooo0OO;
        super(context, attributeSet, 0);
        this.f19658OooooOo = "LAST_UPDATE_TIME";
        this.f19669o0OoOo0 = true;
        View.inflate(context, o0ooOOo.srl_classics_header, this);
        ImageView imageView = (ImageView) findViewById(o00oO0o.srl_classics_arrow);
        this.f19689OoooO = imageView;
        TextView textView = (TextView) findViewById(o00oO0o.srl_classics_update);
        this.f19659Oooooo = textView;
        ImageView imageView2 = (ImageView) findViewById(o00oO0o.srl_classics_progress);
        this.f19691OoooOO0 = imageView2;
        this.f19690OoooO0O = (TextView) findViewById(o00oO0o.srl_classics_title);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o0Oo0oo.ClassicsHeader);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) imageView.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) imageView2.getLayoutParams();
        new LinearLayout.LayoutParams(-2, -2).topMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(o0Oo0oo.ClassicsHeader_srlTextTimeMarginTop, oO00O0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(o0Oo0oo.ClassicsFooter_srlDrawableMarginRight, oO00O0o.OooO0OO(20.0f));
        layoutParams2.rightMargin = dimensionPixelSize;
        layoutParams.rightMargin = dimensionPixelSize;
        int i = o0Oo0oo.ClassicsHeader_srlDrawableArrowSize;
        layoutParams.width = typedArrayObtainStyledAttributes.getLayoutDimension(i, layoutParams.width);
        layoutParams.height = typedArrayObtainStyledAttributes.getLayoutDimension(i, layoutParams.height);
        int i2 = o0Oo0oo.ClassicsHeader_srlDrawableProgressSize;
        layoutParams2.width = typedArrayObtainStyledAttributes.getLayoutDimension(i2, layoutParams2.width);
        layoutParams2.height = typedArrayObtainStyledAttributes.getLayoutDimension(i2, layoutParams2.height);
        int i3 = o0Oo0oo.ClassicsHeader_srlDrawableSize;
        layoutParams.width = typedArrayObtainStyledAttributes.getLayoutDimension(i3, layoutParams.width);
        layoutParams.height = typedArrayObtainStyledAttributes.getLayoutDimension(i3, layoutParams.height);
        layoutParams2.width = typedArrayObtainStyledAttributes.getLayoutDimension(i3, layoutParams2.width);
        layoutParams2.height = typedArrayObtainStyledAttributes.getLayoutDimension(i3, layoutParams2.height);
        this.f19697Ooooo00 = typedArrayObtainStyledAttributes.getInt(o0Oo0oo.ClassicsHeader_srlFinishDuration, this.f19697Ooooo00);
        this.f19669o0OoOo0 = typedArrayObtainStyledAttributes.getBoolean(o0Oo0oo.ClassicsHeader_srlEnableLastTime, this.f19669o0OoOo0);
        this.f19688OoooO00 = o0OoOo0.f39176OooO0oo[typedArrayObtainStyledAttributes.getInt(o0Oo0oo.ClassicsHeader_srlClassicsSpinnerStyle, this.f19688OoooO00.f39177OooO00o)];
        int i4 = o0Oo0oo.ClassicsHeader_srlDrawableArrow;
        if (typedArrayObtainStyledAttributes.hasValue(i4)) {
            this.f19689OoooO.setImageDrawable(typedArrayObtainStyledAttributes.getDrawable(i4));
        } else if (this.f19689OoooO.getDrawable() == null) {
            oO000Oo oo000oo = new oO000Oo();
            this.f19692OoooOOO = oo000oo;
            oo000oo.OooO00o(-10066330);
            this.f19689OoooO.setImageDrawable(this.f19692OoooOOO);
        }
        int i5 = o0Oo0oo.ClassicsHeader_srlDrawableProgress;
        if (typedArrayObtainStyledAttributes.hasValue(i5)) {
            this.f19691OoooOO0.setImageDrawable(typedArrayObtainStyledAttributes.getDrawable(i5));
        } else if (this.f19691OoooOO0.getDrawable() == null) {
            oO0O0OoO oo0o0ooo = new oO0O0OoO();
            this.f19693OoooOOo = oo0o0ooo;
            oo0o0ooo.OooO00o(-10066330);
            this.f19691OoooOO0.setImageDrawable(this.f19693OoooOOo);
        }
        int i6 = o0Oo0oo.ClassicsHeader_srlTextSizeTitle;
        if (typedArrayObtainStyledAttributes.hasValue(i6)) {
            this.f19690OoooO0O.setTextSize(0, typedArrayObtainStyledAttributes.getDimensionPixelSize(i6, oO00O0o.OooO0OO(16.0f)));
        }
        int i7 = o0Oo0oo.ClassicsHeader_srlTextSizeTime;
        if (typedArrayObtainStyledAttributes.hasValue(i7)) {
            this.f19659Oooooo.setTextSize(0, typedArrayObtainStyledAttributes.getDimensionPixelSize(i7, oO00O0o.OooO0OO(12.0f)));
        }
        int i8 = o0Oo0oo.ClassicsHeader_srlPrimaryColor;
        if (typedArrayObtainStyledAttributes.hasValue(i8)) {
            OooOO0O(typedArrayObtainStyledAttributes.getColor(i8, 0));
        }
        int i9 = o0Oo0oo.ClassicsHeader_srlAccentColor;
        if (typedArrayObtainStyledAttributes.hasValue(i9)) {
            int color = typedArrayObtainStyledAttributes.getColor(i9, 0);
            this.f19659Oooooo.setTextColor((16777215 & color) | (-872415232));
            super.OooOO0(color);
        }
        int i10 = o0Oo0oo.ClassicsHeader_srlTextPulling;
        if (typedArrayObtainStyledAttributes.hasValue(i10)) {
            this.f19671ooOO = typedArrayObtainStyledAttributes.getString(i10);
        } else {
            this.f19671ooOO = context.getString(o0OOO0o.srl_header_pulling);
        }
        int i11 = o0Oo0oo.ClassicsHeader_srlTextLoading;
        if (typedArrayObtainStyledAttributes.hasValue(i11)) {
            this.f19664o00Oo0 = typedArrayObtainStyledAttributes.getString(i11);
        } else {
            this.f19664o00Oo0 = context.getString(o0OOO0o.srl_header_loading);
        }
        int i12 = o0Oo0oo.ClassicsHeader_srlTextRelease;
        if (typedArrayObtainStyledAttributes.hasValue(i12)) {
            this.f19665o00Ooo = typedArrayObtainStyledAttributes.getString(i12);
        } else {
            this.f19665o00Ooo = context.getString(o0OOO0o.srl_header_release);
        }
        int i13 = o0Oo0oo.ClassicsHeader_srlTextFinish;
        if (typedArrayObtainStyledAttributes.hasValue(i13)) {
            this.f19666o00o0O = typedArrayObtainStyledAttributes.getString(i13);
        } else {
            this.f19666o00o0O = context.getString(o0OOO0o.srl_header_finish);
        }
        int i14 = o0Oo0oo.ClassicsHeader_srlTextFailed;
        if (typedArrayObtainStyledAttributes.hasValue(i14)) {
            this.f19668o00ooo = typedArrayObtainStyledAttributes.getString(i14);
        } else {
            this.f19668o00ooo = context.getString(o0OOO0o.srl_header_failed);
        }
        int i15 = o0Oo0oo.ClassicsHeader_srlTextSecondary;
        if (typedArrayObtainStyledAttributes.hasValue(i15)) {
            this.f19667o00oO0o = typedArrayObtainStyledAttributes.getString(i15);
        } else {
            this.f19667o00oO0o = context.getString(o0OOO0o.srl_header_secondary);
        }
        int i16 = o0Oo0oo.ClassicsHeader_srlTextRefreshing;
        if (typedArrayObtainStyledAttributes.hasValue(i16)) {
            this.f19663o00O0O = typedArrayObtainStyledAttributes.getString(i16);
        } else {
            this.f19663o00O0O = context.getString(o0OOO0o.srl_header_refreshing);
        }
        int i17 = o0Oo0oo.ClassicsHeader_srlTextUpdate;
        if (typedArrayObtainStyledAttributes.hasValue(i17)) {
            this.f19670oo000o = typedArrayObtainStyledAttributes.getString(i17);
        } else {
            this.f19670oo000o = context.getString(o0OOO0o.srl_header_update);
        }
        this.f19662Ooooooo = new SimpleDateFormat(this.f19670oo000o, Locale.getDefault());
        typedArrayObtainStyledAttributes.recycle();
        imageView2.animate().setInterpolator(null);
        textView.setVisibility(this.f19669o0OoOo0 ? 0 : 8);
        this.f19690OoooO0O.setText(isInEditMode() ? this.f19663o00O0O : this.f19671ooOO);
        if (isInEditMode()) {
            imageView.setVisibility(8);
        } else {
            imageView2.setVisibility(8);
        }
        try {
            if ((context instanceof FragmentActivity) && (supportFragmentManager = ((FragmentActivity) context).getSupportFragmentManager()) != null && (listOooo0OO = supportFragmentManager.Oooo0OO()) != null && listOooo0OO.size() > 0) {
                OooOO0o(new Date());
                return;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        this.f19658OooooOo += context.getClass().getName();
        this.f19661OoooooO = context.getSharedPreferences("ClassicsHeader", 0);
        OooOO0o(new Date(this.f19661OoooooO.getLong(this.f19658OooooOo, System.currentTimeMillis())));
    }
}
