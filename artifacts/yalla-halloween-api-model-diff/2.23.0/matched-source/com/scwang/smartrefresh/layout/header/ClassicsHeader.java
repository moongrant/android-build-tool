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
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import com.scwang.smartrefresh.layout.internal.InternalClassics;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import o0OO0o.OooO;
import o0OO0o.OooOOO0;
import o0OO0oO0.OooO0O0;
import p333o0OO0o0o.OooOO0;
import p333o0OO0o0o.OooOO0O;
import p333o0OO0o0o.OooOOO;
import p335o0OO0oOo.OooOo00;

/* JADX INFO: loaded from: classes4.dex */
public class ClassicsHeader extends InternalClassics<ClassicsHeader> implements OooO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final SimpleDateFormat f21453OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public Date f21454OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final String f21455OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public final TextView f21456OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final SharedPreferences f21457OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final String f21458OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final boolean f21459OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final String f21460OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final String f21461OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final String f21462OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final String f21463OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final String f21464OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final String f21465Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final String f21466Oooo00O;

    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f21467OooO00o;

        static {
            int[] iArr = new int[RefreshState.values().length];
            f21467OooO00o = iArr;
            try {
                iArr[RefreshState.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21467OooO00o[RefreshState.PullDownToRefresh.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21467OooO00o[RefreshState.Refreshing.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21467OooO00o[RefreshState.RefreshReleased.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21467OooO00o[RefreshState.ReleaseToRefresh.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21467OooO00o[RefreshState.ReleaseToTwoLevel.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21467OooO00o[RefreshState.Loading.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public ClassicsHeader(Context context) {
        this(context, null);
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, p389o0OOoooO.o00O0OOO
    public final void OooO0OO(@NonNull OooOOO0 oooOOO0, @NonNull RefreshState refreshState, @NonNull RefreshState refreshState2) {
        ImageView imageView = this.f21486OooO0oo;
        int i = OooO00o.f21467OooO00o[refreshState2.ordinal()];
        boolean z = this.f21459OooOoO0;
        TextView textView = this.f21456OooOo0O;
        switch (i) {
            case 1:
                textView.setVisibility(z ? 0 : 8);
                break;
            case 2:
                break;
            case 3:
            case 4:
                this.f21485OooO0oO.setText(this.f21460OooOoOO);
                imageView.setVisibility(8);
                return;
            case 5:
                this.f21485OooO0oO.setText(this.f21461OooOoo);
                imageView.animate().rotation(180.0f);
                return;
            case 6:
                this.f21485OooO0oO.setText(this.f21466Oooo00O);
                imageView.animate().rotation(0.0f);
                return;
            case 7:
                imageView.setVisibility(8);
                textView.setVisibility(z ? 4 : 8);
                this.f21485OooO0oO.setText(this.f21462OooOoo0);
                return;
            default:
                return;
        }
        this.f21485OooO0oO.setText(this.f21458OooOoO);
        imageView.setVisibility(0);
        imageView.animate().rotation(0.0f);
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalClassics, com.scwang.smartrefresh.layout.internal.InternalAbstract, o0OO0o.OooOO0
    public final int OooO0Oo(@NonNull SmartRefreshLayout smartRefreshLayout, boolean z) {
        if (z) {
            this.f21485OooO0oO.setText(this.f21463OooOooO);
            if (this.f21454OooOo0 != null) {
                OooOO0O(new Date());
            }
        } else {
            this.f21485OooO0oO.setText(this.f21464OooOooo);
        }
        return super.OooO0Oo(smartRefreshLayout, z);
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalClassics
    public final void OooOO0(@ColorInt int i) {
        this.f21456OooOo0O.setTextColor((16777215 & i) | (-872415232));
        super.OooOO0(i);
    }

    public final void OooOO0O(Date date) {
        this.f21454OooOo0 = date;
        this.f21456OooOo0O.setText(this.f21453OooOo.format(date));
        SharedPreferences sharedPreferences = this.f21457OooOo0o;
        if (sharedPreferences == null || isInEditMode()) {
            return;
        }
        sharedPreferences.edit().putLong(this.f21455OooOo00, date.getTime()).apply();
    }

    public ClassicsHeader(Context context, AttributeSet attributeSet) {
        FragmentManager supportFragmentManager;
        List<Fragment> listOooo00O;
        super(context, attributeSet, 0);
        this.f21455OooOo00 = "LAST_UPDATE_TIME";
        this.f21459OooOoO0 = true;
        View.inflate(context, OooOO0O.srl_classics_header, this);
        ImageView imageView = (ImageView) findViewById(OooOO0.srl_classics_arrow);
        this.f21486OooO0oo = imageView;
        TextView textView = (TextView) findViewById(OooOO0.srl_classics_update);
        this.f21456OooOo0O = textView;
        ImageView imageView2 = (ImageView) findViewById(OooOO0.srl_classics_progress);
        this.f21484OooO = imageView2;
        this.f21485OooO0oO = (TextView) findViewById(OooOO0.srl_classics_title);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, OooOOO.ClassicsHeader);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) imageView.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) imageView2.getLayoutParams();
        new LinearLayout.LayoutParams(-2, -2).topMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(OooOOO.ClassicsHeader_srlTextTimeMarginTop, OooOo00.OooO0OO(0.0f));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(OooOOO.ClassicsFooter_srlDrawableMarginRight, OooOo00.OooO0OO(20.0f));
        layoutParams2.rightMargin = dimensionPixelSize;
        layoutParams.rightMargin = dimensionPixelSize;
        int i = OooOOO.ClassicsHeader_srlDrawableArrowSize;
        layoutParams.width = typedArrayObtainStyledAttributes.getLayoutDimension(i, layoutParams.width);
        layoutParams.height = typedArrayObtainStyledAttributes.getLayoutDimension(i, layoutParams.height);
        int i2 = OooOOO.ClassicsHeader_srlDrawableProgressSize;
        layoutParams2.width = typedArrayObtainStyledAttributes.getLayoutDimension(i2, layoutParams2.width);
        layoutParams2.height = typedArrayObtainStyledAttributes.getLayoutDimension(i2, layoutParams2.height);
        int i3 = OooOOO.ClassicsHeader_srlDrawableSize;
        layoutParams.width = typedArrayObtainStyledAttributes.getLayoutDimension(i3, layoutParams.width);
        layoutParams.height = typedArrayObtainStyledAttributes.getLayoutDimension(i3, layoutParams.height);
        layoutParams2.width = typedArrayObtainStyledAttributes.getLayoutDimension(i3, layoutParams2.width);
        layoutParams2.height = typedArrayObtainStyledAttributes.getLayoutDimension(i3, layoutParams2.height);
        this.f21493OooOOOo = typedArrayObtainStyledAttributes.getInt(OooOOO.ClassicsHeader_srlFinishDuration, this.f21493OooOOOo);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(OooOOO.ClassicsHeader_srlEnableLastTime, true);
        this.f21459OooOoO0 = z;
        this.f21483OooO0o0 = OooO0O0.f43241OooO0oo[typedArrayObtainStyledAttributes.getInt(OooOOO.ClassicsHeader_srlClassicsSpinnerStyle, this.f21483OooO0o0.f43242OooO00o)];
        int i4 = OooOOO.ClassicsHeader_srlDrawableArrow;
        if (typedArrayObtainStyledAttributes.hasValue(i4)) {
            this.f21486OooO0oo.setImageDrawable(typedArrayObtainStyledAttributes.getDrawable(i4));
        } else if (this.f21486OooO0oo.getDrawable() == null) {
            p334o0OO0oOO.OooOO0O oooOO0O = new p334o0OO0oOO.OooOO0O();
            this.f21488OooOO0O = oooOO0O;
            oooOO0O.OooO00o(-10066330);
            this.f21486OooO0oo.setImageDrawable(this.f21488OooOO0O);
        }
        int i5 = OooOOO.ClassicsHeader_srlDrawableProgress;
        if (typedArrayObtainStyledAttributes.hasValue(i5)) {
            this.f21484OooO.setImageDrawable(typedArrayObtainStyledAttributes.getDrawable(i5));
        } else if (this.f21484OooO.getDrawable() == null) {
            p334o0OO0oOO.OooOOO oooOOO = new p334o0OO0oOO.OooOOO();
            this.f21489OooOO0o = oooOOO;
            oooOOO.OooO00o(-10066330);
            this.f21484OooO.setImageDrawable(this.f21489OooOO0o);
        }
        int i6 = OooOOO.ClassicsHeader_srlTextSizeTitle;
        if (typedArrayObtainStyledAttributes.hasValue(i6)) {
            this.f21485OooO0oO.setTextSize(0, typedArrayObtainStyledAttributes.getDimensionPixelSize(i6, OooOo00.OooO0OO(16.0f)));
        }
        int i7 = OooOOO.ClassicsHeader_srlTextSizeTime;
        if (typedArrayObtainStyledAttributes.hasValue(i7)) {
            textView.setTextSize(0, typedArrayObtainStyledAttributes.getDimensionPixelSize(i7, OooOo00.OooO0OO(12.0f)));
        }
        int i8 = OooOOO.ClassicsHeader_srlPrimaryColor;
        if (typedArrayObtainStyledAttributes.hasValue(i8)) {
            int color = typedArrayObtainStyledAttributes.getColor(i8, 0);
            this.f21490OooOOO = true;
            this.f21492OooOOOO = color;
            o0OO0o.OooOO0O oooOO0O2 = this.f21487OooOO0;
            if (oooOO0O2 != null) {
                ((SmartRefreshLayout.OooOOO) oooOO0O2).OooO0OO(this, color);
            }
        }
        int i9 = OooOOO.ClassicsHeader_srlAccentColor;
        if (typedArrayObtainStyledAttributes.hasValue(i9)) {
            int color2 = typedArrayObtainStyledAttributes.getColor(i9, 0);
            textView.setTextColor((16777215 & color2) | (-872415232));
            super.OooOO0(color2);
        }
        int i10 = OooOOO.ClassicsHeader_srlTextPulling;
        if (typedArrayObtainStyledAttributes.hasValue(i10)) {
            this.f21458OooOoO = typedArrayObtainStyledAttributes.getString(i10);
        } else {
            this.f21458OooOoO = context.getString(p333o0OO0o0o.OooOOO0.srl_header_pulling);
        }
        int i11 = OooOOO.ClassicsHeader_srlTextLoading;
        if (typedArrayObtainStyledAttributes.hasValue(i11)) {
            this.f21462OooOoo0 = typedArrayObtainStyledAttributes.getString(i11);
        } else {
            this.f21462OooOoo0 = context.getString(p333o0OO0o0o.OooOOO0.srl_header_loading);
        }
        int i12 = OooOOO.ClassicsHeader_srlTextRelease;
        if (typedArrayObtainStyledAttributes.hasValue(i12)) {
            this.f21461OooOoo = typedArrayObtainStyledAttributes.getString(i12);
        } else {
            this.f21461OooOoo = context.getString(p333o0OO0o0o.OooOOO0.srl_header_release);
        }
        int i13 = OooOOO.ClassicsHeader_srlTextFinish;
        if (typedArrayObtainStyledAttributes.hasValue(i13)) {
            this.f21463OooOooO = typedArrayObtainStyledAttributes.getString(i13);
        } else {
            this.f21463OooOooO = context.getString(p333o0OO0o0o.OooOOO0.srl_header_finish);
        }
        int i14 = OooOOO.ClassicsHeader_srlTextFailed;
        if (typedArrayObtainStyledAttributes.hasValue(i14)) {
            this.f21464OooOooo = typedArrayObtainStyledAttributes.getString(i14);
        } else {
            this.f21464OooOooo = context.getString(p333o0OO0o0o.OooOOO0.srl_header_failed);
        }
        int i15 = OooOOO.ClassicsHeader_srlTextSecondary;
        if (typedArrayObtainStyledAttributes.hasValue(i15)) {
            this.f21466Oooo00O = typedArrayObtainStyledAttributes.getString(i15);
        } else {
            this.f21466Oooo00O = context.getString(p333o0OO0o0o.OooOOO0.srl_header_secondary);
        }
        int i16 = OooOOO.ClassicsHeader_srlTextRefreshing;
        if (typedArrayObtainStyledAttributes.hasValue(i16)) {
            this.f21460OooOoOO = typedArrayObtainStyledAttributes.getString(i16);
        } else {
            this.f21460OooOoOO = context.getString(p333o0OO0o0o.OooOOO0.srl_header_refreshing);
        }
        int i17 = OooOOO.ClassicsHeader_srlTextUpdate;
        if (typedArrayObtainStyledAttributes.hasValue(i17)) {
            this.f21465Oooo000 = typedArrayObtainStyledAttributes.getString(i17);
        } else {
            this.f21465Oooo000 = context.getString(p333o0OO0o0o.OooOOO0.srl_header_update);
        }
        this.f21453OooOo = new SimpleDateFormat(this.f21465Oooo000, Locale.getDefault());
        typedArrayObtainStyledAttributes.recycle();
        imageView2.animate().setInterpolator(null);
        textView.setVisibility(z ? 0 : 8);
        this.f21485OooO0oO.setText(isInEditMode() ? this.f21460OooOoOO : this.f21458OooOoO);
        if (isInEditMode()) {
            imageView.setVisibility(8);
        } else {
            imageView2.setVisibility(8);
        }
        try {
            if ((context instanceof FragmentActivity) && (supportFragmentManager = ((FragmentActivity) context).getSupportFragmentManager()) != null && (listOooo00O = supportFragmentManager.Oooo00O()) != null && listOooo00O.size() > 0) {
                OooOO0O(new Date());
                return;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        String str = this.f21455OooOo00 + context.getClass().getName();
        this.f21455OooOo00 = str;
        SharedPreferences sharedPreferences = context.getSharedPreferences("ClassicsHeader", 0);
        this.f21457OooOo0o = sharedPreferences;
        OooOO0O(new Date(sharedPreferences.getLong(str, System.currentTimeMillis())));
    }
}
