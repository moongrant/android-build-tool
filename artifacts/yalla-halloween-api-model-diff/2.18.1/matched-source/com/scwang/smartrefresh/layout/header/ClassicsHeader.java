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
import p407o0Oo0OOo.oO000Oo;
import p407o0Oo0OOo.ooOOOOoo;
import p409o0Oo0Oo0.o0OoOo0;
import p410o0Oo0OoO.oO000o00;
import p410o0Oo0OoO.oO00O0o0;
import p411o0Oo0Ooo.oOo00OO0;
import p586o0oOoo00.o00oO0o;
import p586o0oOoo00.o0OOO0o;
import p586o0oOoo00.o0Oo0oo;
import p586o0oOoo00.o0ooOOo;

/* JADX INFO: loaded from: classes2.dex */
public class ClassicsHeader extends InternalClassics<ClassicsHeader> implements ooOOOOoo {

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public String f19638Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public Date f19639OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public TextView f19640OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public SharedPreferences f19641OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public boolean f19642Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public SimpleDateFormat f19643Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public String f19644OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public String f19645Ooooooo;

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    public String f19646o00O0O;

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    public String f19647o00Oo0;

    /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
    public String f19648o00Ooo;

    /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
    public String f19649o00o0O;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public String f19650o0OoOo0;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public String f19651ooOO;

    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f19652OooO00o;

        static {
            int[] iArr = new int[RefreshState.values().length];
            f19652OooO00o = iArr;
            try {
                iArr[RefreshState.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19652OooO00o[RefreshState.PullDownToRefresh.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19652OooO00o[RefreshState.Refreshing.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19652OooO00o[RefreshState.RefreshReleased.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19652OooO00o[RefreshState.ReleaseToRefresh.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19652OooO00o[RefreshState.ReleaseToTwoLevel.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19652OooO00o[RefreshState.Loading.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public ClassicsHeader(Context context) {
        this(context, null);
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalClassics, com.scwang.smartrefresh.layout.internal.InternalAbstract, p407o0Oo0OOo.oO0OOo0o
    public final int OooO0O0(@NonNull oO000Oo oo000oo, boolean z) {
        if (z) {
            this.f19669Oooo.setText(this.f19646o00O0O);
            if (this.f19639OooooO0 != null) {
                OooOO0o(new Date());
            }
        } else {
            this.f19669Oooo.setText(this.f19647o00Oo0);
        }
        return super.OooO0O0(oo000oo, z);
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, p417o0Oo0oOo.oO00OOOo
    public final void OooO0oo(@NonNull oO000Oo oo000oo, @NonNull RefreshState refreshState, @NonNull RefreshState refreshState2) {
        ImageView imageView = this.f19672OoooO00;
        TextView textView = this.f19640OooooOO;
        switch (OooO00o.f19652OooO00o[refreshState2.ordinal()]) {
            case 1:
                textView.setVisibility(this.f19642Oooooo ? 0 : 8);
                break;
            case 2:
                break;
            case 3:
            case 4:
                this.f19669Oooo.setText(this.f19645Ooooooo);
                imageView.setVisibility(8);
                return;
            case 5:
                this.f19669Oooo.setText(this.f19651ooOO);
                imageView.animate().rotation(180.0f);
                return;
            case 6:
                this.f19669Oooo.setText(this.f19649o00o0O);
                imageView.animate().rotation(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                return;
            case 7:
                imageView.setVisibility(8);
                textView.setVisibility(this.f19642Oooooo ? 4 : 8);
                this.f19669Oooo.setText(this.f19650o0OoOo0);
                return;
            default:
                return;
        }
        this.f19669Oooo.setText(this.f19644OoooooO);
        imageView.setVisibility(0);
        imageView.animate().rotation(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalClassics
    public final InternalClassics OooOO0(@ColorInt int i) {
        this.f19640OooooOO.setTextColor((16777215 & i) | (-872415232));
        super.OooOO0(i);
        return this;
    }

    public final ClassicsHeader OooOO0o(Date date) {
        this.f19639OooooO0 = date;
        this.f19640OooooOO.setText(this.f19643Oooooo0.format(date));
        if (this.f19641OooooOo != null && !isInEditMode()) {
            this.f19641OooooOo.edit().putLong(this.f19638Ooooo0o, date.getTime()).apply();
        }
        return this;
    }

    public ClassicsHeader(Context context, AttributeSet attributeSet) {
        FragmentManager supportFragmentManager;
        List<Fragment> listOooo0OO;
        super(context, attributeSet, 0);
        this.f19638Ooooo0o = "LAST_UPDATE_TIME";
        this.f19642Oooooo = true;
        View.inflate(context, o0ooOOo.srl_classics_header, this);
        ImageView imageView = (ImageView) findViewById(o00oO0o.srl_classics_arrow);
        this.f19672OoooO00 = imageView;
        TextView textView = (TextView) findViewById(o00oO0o.srl_classics_update);
        this.f19640OooooOO = textView;
        ImageView imageView2 = (ImageView) findViewById(o00oO0o.srl_classics_progress);
        this.f19671OoooO0 = imageView2;
        this.f19669Oooo = (TextView) findViewById(o00oO0o.srl_classics_title);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o0Oo0oo.ClassicsHeader);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) imageView.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) imageView2.getLayoutParams();
        new LinearLayout.LayoutParams(-2, -2).topMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(o0Oo0oo.ClassicsHeader_srlTextTimeMarginTop, oOo00OO0.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(o0Oo0oo.ClassicsFooter_srlDrawableMarginRight, oOo00OO0.OooO0OO(20.0f));
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
        this.f19677OoooOo0 = typedArrayObtainStyledAttributes.getInt(o0Oo0oo.ClassicsHeader_srlFinishDuration, this.f19677OoooOo0);
        this.f19642Oooooo = typedArrayObtainStyledAttributes.getBoolean(o0Oo0oo.ClassicsHeader_srlEnableLastTime, this.f19642Oooooo);
        this.f19667Oooo0oO = o0OoOo0.f39156OooO0oo[typedArrayObtainStyledAttributes.getInt(o0Oo0oo.ClassicsHeader_srlClassicsSpinnerStyle, this.f19667Oooo0oO.f39157OooO00o)];
        int i4 = o0Oo0oo.ClassicsHeader_srlDrawableArrow;
        if (typedArrayObtainStyledAttributes.hasValue(i4)) {
            this.f19672OoooO00.setImageDrawable(typedArrayObtainStyledAttributes.getDrawable(i4));
        } else if (this.f19672OoooO00.getDrawable() == null) {
            oO000o00 oo000o00 = new oO000o00();
            this.f19670OoooO = oo000o00;
            oo000o00.OooO00o(-10066330);
            this.f19672OoooO00.setImageDrawable(this.f19670OoooO);
        }
        int i5 = o0Oo0oo.ClassicsHeader_srlDrawableProgress;
        if (typedArrayObtainStyledAttributes.hasValue(i5)) {
            this.f19671OoooO0.setImageDrawable(typedArrayObtainStyledAttributes.getDrawable(i5));
        } else if (this.f19671OoooO0.getDrawable() == null) {
            oO00O0o0 oo00o0o0 = new oO00O0o0();
            this.f19674OoooOO0 = oo00o0o0;
            oo00o0o0.OooO00o(-10066330);
            this.f19671OoooO0.setImageDrawable(this.f19674OoooOO0);
        }
        int i6 = o0Oo0oo.ClassicsHeader_srlTextSizeTitle;
        if (typedArrayObtainStyledAttributes.hasValue(i6)) {
            this.f19669Oooo.setTextSize(0, typedArrayObtainStyledAttributes.getDimensionPixelSize(i6, oOo00OO0.OooO0OO(16.0f)));
        }
        int i7 = o0Oo0oo.ClassicsHeader_srlTextSizeTime;
        if (typedArrayObtainStyledAttributes.hasValue(i7)) {
            this.f19640OooooOO.setTextSize(0, typedArrayObtainStyledAttributes.getDimensionPixelSize(i7, oOo00OO0.OooO0OO(12.0f)));
        }
        int i8 = o0Oo0oo.ClassicsHeader_srlPrimaryColor;
        if (typedArrayObtainStyledAttributes.hasValue(i8)) {
            OooOO0O(typedArrayObtainStyledAttributes.getColor(i8, 0));
        }
        int i9 = o0Oo0oo.ClassicsHeader_srlAccentColor;
        if (typedArrayObtainStyledAttributes.hasValue(i9)) {
            int color = typedArrayObtainStyledAttributes.getColor(i9, 0);
            this.f19640OooooOO.setTextColor((16777215 & color) | (-872415232));
            super.OooOO0(color);
        }
        int i10 = o0Oo0oo.ClassicsHeader_srlTextPulling;
        if (typedArrayObtainStyledAttributes.hasValue(i10)) {
            this.f19644OoooooO = typedArrayObtainStyledAttributes.getString(i10);
        } else {
            this.f19644OoooooO = context.getString(o0OOO0o.srl_header_pulling);
        }
        int i11 = o0Oo0oo.ClassicsHeader_srlTextLoading;
        if (typedArrayObtainStyledAttributes.hasValue(i11)) {
            this.f19650o0OoOo0 = typedArrayObtainStyledAttributes.getString(i11);
        } else {
            this.f19650o0OoOo0 = context.getString(o0OOO0o.srl_header_loading);
        }
        int i12 = o0Oo0oo.ClassicsHeader_srlTextRelease;
        if (typedArrayObtainStyledAttributes.hasValue(i12)) {
            this.f19651ooOO = typedArrayObtainStyledAttributes.getString(i12);
        } else {
            this.f19651ooOO = context.getString(o0OOO0o.srl_header_release);
        }
        int i13 = o0Oo0oo.ClassicsHeader_srlTextFinish;
        if (typedArrayObtainStyledAttributes.hasValue(i13)) {
            this.f19646o00O0O = typedArrayObtainStyledAttributes.getString(i13);
        } else {
            this.f19646o00O0O = context.getString(o0OOO0o.srl_header_finish);
        }
        int i14 = o0Oo0oo.ClassicsHeader_srlTextFailed;
        if (typedArrayObtainStyledAttributes.hasValue(i14)) {
            this.f19647o00Oo0 = typedArrayObtainStyledAttributes.getString(i14);
        } else {
            this.f19647o00Oo0 = context.getString(o0OOO0o.srl_header_failed);
        }
        int i15 = o0Oo0oo.ClassicsHeader_srlTextSecondary;
        if (typedArrayObtainStyledAttributes.hasValue(i15)) {
            this.f19649o00o0O = typedArrayObtainStyledAttributes.getString(i15);
        } else {
            this.f19649o00o0O = context.getString(o0OOO0o.srl_header_secondary);
        }
        int i16 = o0Oo0oo.ClassicsHeader_srlTextRefreshing;
        if (typedArrayObtainStyledAttributes.hasValue(i16)) {
            this.f19645Ooooooo = typedArrayObtainStyledAttributes.getString(i16);
        } else {
            this.f19645Ooooooo = context.getString(o0OOO0o.srl_header_refreshing);
        }
        int i17 = o0Oo0oo.ClassicsHeader_srlTextUpdate;
        if (typedArrayObtainStyledAttributes.hasValue(i17)) {
            this.f19648o00Ooo = typedArrayObtainStyledAttributes.getString(i17);
        } else {
            this.f19648o00Ooo = context.getString(o0OOO0o.srl_header_update);
        }
        this.f19643Oooooo0 = new SimpleDateFormat(this.f19648o00Ooo, Locale.getDefault());
        typedArrayObtainStyledAttributes.recycle();
        imageView2.animate().setInterpolator(null);
        textView.setVisibility(this.f19642Oooooo ? 0 : 8);
        this.f19669Oooo.setText(isInEditMode() ? this.f19645Ooooooo : this.f19644OoooooO);
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
        this.f19638Ooooo0o += context.getClass().getName();
        this.f19641OooooOo = context.getSharedPreferences("ClassicsHeader", 0);
        OooOO0o(new Date(this.f19641OooooOo.getLong(this.f19638Ooooo0o, System.currentTimeMillis())));
    }
}
