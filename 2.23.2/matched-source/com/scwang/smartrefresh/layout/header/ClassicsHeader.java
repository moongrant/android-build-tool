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
import o0OO0o.OooO0O0;
import o0OO0o.OooO0OO;
import o0OO0o.OooO0o;
import o0OO0oO0.OooO;
import o0OO0oO0.OooOO0O;
import o0OO0oO0.OooOOO0;
import p339o0OO0oo0.OooOOOO;
import p392o0OOoooO.o00O0O0O;
import p392o0OOoooO.oo0o0O0;

/* JADX INFO: loaded from: classes3.dex */
public class ClassicsHeader extends InternalClassics<ClassicsHeader> implements OooO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final SimpleDateFormat f20980OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public Date f20981OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final String f20982OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public final TextView f20983OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final SharedPreferences f20984OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final String f20985OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final boolean f20986OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final String f20987OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final String f20988OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final String f20989OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final String f20990OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final String f20991OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final String f20992Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final String f20993Oooo00O;

    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f20994OooO00o;

        static {
            int[] iArr = new int[RefreshState.values().length];
            f20994OooO00o = iArr;
            try {
                iArr[RefreshState.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20994OooO00o[RefreshState.PullDownToRefresh.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20994OooO00o[RefreshState.Refreshing.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20994OooO00o[RefreshState.RefreshReleased.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20994OooO00o[RefreshState.ReleaseToRefresh.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20994OooO00o[RefreshState.ReleaseToTwoLevel.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f20994OooO00o[RefreshState.Loading.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public ClassicsHeader(Context context) {
        this(context, null);
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, p338o0OO0oOo.o000oOoO
    public final void OooO00o(@NonNull OooOOO0 oooOOO0, @NonNull RefreshState refreshState, @NonNull RefreshState refreshState2) {
        ImageView imageView = this.f21013OooO0oo;
        int i = OooO00o.f20994OooO00o[refreshState2.ordinal()];
        boolean z = this.f20986OooOoO0;
        TextView textView = this.f20983OooOo0O;
        switch (i) {
            case 1:
                textView.setVisibility(z ? 0 : 8);
                break;
            case 2:
                break;
            case 3:
            case 4:
                this.f21012OooO0oO.setText(this.f20987OooOoOO);
                imageView.setVisibility(8);
                return;
            case 5:
                this.f21012OooO0oO.setText(this.f20988OooOoo);
                imageView.animate().rotation(180.0f);
                return;
            case 6:
                this.f21012OooO0oO.setText(this.f20993Oooo00O);
                imageView.animate().rotation(0.0f);
                return;
            case 7:
                imageView.setVisibility(8);
                textView.setVisibility(z ? 4 : 8);
                this.f21012OooO0oO.setText(this.f20989OooOoo0);
                return;
            default:
                return;
        }
        this.f21012OooO0oO.setText(this.f20985OooOoO);
        imageView.setVisibility(0);
        imageView.animate().rotation(0.0f);
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalClassics, com.scwang.smartrefresh.layout.internal.InternalAbstract, o0OO0oO0.OooOO0
    public final int OooO0OO(@NonNull SmartRefreshLayout smartRefreshLayout, boolean z) {
        if (z) {
            this.f21012OooO0oO.setText(this.f20990OooOooO);
            if (this.f20981OooOo0 != null) {
                OooOO0O(new Date());
            }
        } else {
            this.f21012OooO0oO.setText(this.f20991OooOooo);
        }
        return super.OooO0OO(smartRefreshLayout, z);
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalClassics
    public final void OooOO0(@ColorInt int i) {
        this.f20983OooOo0O.setTextColor((16777215 & i) | (-872415232));
        super.OooOO0(i);
    }

    public final void OooOO0O(Date date) {
        this.f20981OooOo0 = date;
        this.f20983OooOo0O.setText(this.f20980OooOo.format(date));
        SharedPreferences sharedPreferences = this.f20984OooOo0o;
        if (sharedPreferences == null || isInEditMode()) {
            return;
        }
        sharedPreferences.edit().putLong(this.f20982OooOo00, date.getTime()).apply();
    }

    public ClassicsHeader(Context context, AttributeSet attributeSet) {
        FragmentManager supportFragmentManager;
        List<Fragment> listOooo00O;
        super(context, attributeSet, 0);
        this.f20982OooOo00 = "LAST_UPDATE_TIME";
        this.f20986OooOoO0 = true;
        View.inflate(context, OooO0O0.srl_classics_header, this);
        ImageView imageView = (ImageView) findViewById(o0OO0o.OooO00o.srl_classics_arrow);
        this.f21013OooO0oo = imageView;
        TextView textView = (TextView) findViewById(o0OO0o.OooO00o.srl_classics_update);
        this.f20983OooOo0O = textView;
        ImageView imageView2 = (ImageView) findViewById(o0OO0o.OooO00o.srl_classics_progress);
        this.f21011OooO = imageView2;
        this.f21012OooO0oO = (TextView) findViewById(o0OO0o.OooO00o.srl_classics_title);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, OooO0o.ClassicsHeader);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) imageView.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) imageView2.getLayoutParams();
        new LinearLayout.LayoutParams(-2, -2).topMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(OooO0o.ClassicsHeader_srlTextTimeMarginTop, OooOOOO.OooO0OO(0.0f));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(OooO0o.ClassicsFooter_srlDrawableMarginRight, OooOOOO.OooO0OO(20.0f));
        layoutParams2.rightMargin = dimensionPixelSize;
        layoutParams.rightMargin = dimensionPixelSize;
        int i = OooO0o.ClassicsHeader_srlDrawableArrowSize;
        layoutParams.width = typedArrayObtainStyledAttributes.getLayoutDimension(i, layoutParams.width);
        layoutParams.height = typedArrayObtainStyledAttributes.getLayoutDimension(i, layoutParams.height);
        int i2 = OooO0o.ClassicsHeader_srlDrawableProgressSize;
        layoutParams2.width = typedArrayObtainStyledAttributes.getLayoutDimension(i2, layoutParams2.width);
        layoutParams2.height = typedArrayObtainStyledAttributes.getLayoutDimension(i2, layoutParams2.height);
        int i3 = OooO0o.ClassicsHeader_srlDrawableSize;
        layoutParams.width = typedArrayObtainStyledAttributes.getLayoutDimension(i3, layoutParams.width);
        layoutParams.height = typedArrayObtainStyledAttributes.getLayoutDimension(i3, layoutParams.height);
        layoutParams2.width = typedArrayObtainStyledAttributes.getLayoutDimension(i3, layoutParams2.width);
        layoutParams2.height = typedArrayObtainStyledAttributes.getLayoutDimension(i3, layoutParams2.height);
        this.f21020OooOOOo = typedArrayObtainStyledAttributes.getInt(OooO0o.ClassicsHeader_srlFinishDuration, this.f21020OooOOOo);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(OooO0o.ClassicsHeader_srlEnableLastTime, true);
        this.f20986OooOoO0 = z;
        this.f21010OooO0o0 = o0OO0oO.OooO0O0.f42508OooO0oo[typedArrayObtainStyledAttributes.getInt(OooO0o.ClassicsHeader_srlClassicsSpinnerStyle, this.f21010OooO0o0.f42509OooO00o)];
        int i4 = OooO0o.ClassicsHeader_srlDrawableArrow;
        if (typedArrayObtainStyledAttributes.hasValue(i4)) {
            this.f21013OooO0oo.setImageDrawable(typedArrayObtainStyledAttributes.getDrawable(i4));
        } else if (this.f21013OooO0oo.getDrawable() == null) {
            o00O0O0O o00o0o0o2 = new o00O0O0O();
            this.f21015OooOO0O = o00o0o0o2;
            o00o0o0o2.OooO00o(-10066330);
            this.f21013OooO0oo.setImageDrawable(this.f21015OooOO0O);
        }
        int i5 = OooO0o.ClassicsHeader_srlDrawableProgress;
        if (typedArrayObtainStyledAttributes.hasValue(i5)) {
            this.f21011OooO.setImageDrawable(typedArrayObtainStyledAttributes.getDrawable(i5));
        } else if (this.f21011OooO.getDrawable() == null) {
            oo0o0O0 oo0o0o0 = new oo0o0O0();
            this.f21016OooOO0o = oo0o0o0;
            oo0o0o0.OooO00o(-10066330);
            this.f21011OooO.setImageDrawable(this.f21016OooOO0o);
        }
        int i6 = OooO0o.ClassicsHeader_srlTextSizeTitle;
        if (typedArrayObtainStyledAttributes.hasValue(i6)) {
            this.f21012OooO0oO.setTextSize(0, typedArrayObtainStyledAttributes.getDimensionPixelSize(i6, OooOOOO.OooO0OO(16.0f)));
        }
        int i7 = OooO0o.ClassicsHeader_srlTextSizeTime;
        if (typedArrayObtainStyledAttributes.hasValue(i7)) {
            textView.setTextSize(0, typedArrayObtainStyledAttributes.getDimensionPixelSize(i7, OooOOOO.OooO0OO(12.0f)));
        }
        int i8 = OooO0o.ClassicsHeader_srlPrimaryColor;
        if (typedArrayObtainStyledAttributes.hasValue(i8)) {
            int color = typedArrayObtainStyledAttributes.getColor(i8, 0);
            this.f21017OooOOO = true;
            this.f21019OooOOOO = color;
            OooOO0O oooOO0O = this.f21014OooOO0;
            if (oooOO0O != null) {
                ((SmartRefreshLayout.OooOOO) oooOO0O).OooO0OO(this, color);
            }
        }
        int i9 = OooO0o.ClassicsHeader_srlAccentColor;
        if (typedArrayObtainStyledAttributes.hasValue(i9)) {
            int color2 = typedArrayObtainStyledAttributes.getColor(i9, 0);
            textView.setTextColor((16777215 & color2) | (-872415232));
            super.OooOO0(color2);
        }
        int i10 = OooO0o.ClassicsHeader_srlTextPulling;
        if (typedArrayObtainStyledAttributes.hasValue(i10)) {
            this.f20985OooOoO = typedArrayObtainStyledAttributes.getString(i10);
        } else {
            this.f20985OooOoO = context.getString(OooO0OO.srl_header_pulling);
        }
        int i11 = OooO0o.ClassicsHeader_srlTextLoading;
        if (typedArrayObtainStyledAttributes.hasValue(i11)) {
            this.f20989OooOoo0 = typedArrayObtainStyledAttributes.getString(i11);
        } else {
            this.f20989OooOoo0 = context.getString(OooO0OO.srl_header_loading);
        }
        int i12 = OooO0o.ClassicsHeader_srlTextRelease;
        if (typedArrayObtainStyledAttributes.hasValue(i12)) {
            this.f20988OooOoo = typedArrayObtainStyledAttributes.getString(i12);
        } else {
            this.f20988OooOoo = context.getString(OooO0OO.srl_header_release);
        }
        int i13 = OooO0o.ClassicsHeader_srlTextFinish;
        if (typedArrayObtainStyledAttributes.hasValue(i13)) {
            this.f20990OooOooO = typedArrayObtainStyledAttributes.getString(i13);
        } else {
            this.f20990OooOooO = context.getString(OooO0OO.srl_header_finish);
        }
        int i14 = OooO0o.ClassicsHeader_srlTextFailed;
        if (typedArrayObtainStyledAttributes.hasValue(i14)) {
            this.f20991OooOooo = typedArrayObtainStyledAttributes.getString(i14);
        } else {
            this.f20991OooOooo = context.getString(OooO0OO.srl_header_failed);
        }
        int i15 = OooO0o.ClassicsHeader_srlTextSecondary;
        if (typedArrayObtainStyledAttributes.hasValue(i15)) {
            this.f20993Oooo00O = typedArrayObtainStyledAttributes.getString(i15);
        } else {
            this.f20993Oooo00O = context.getString(OooO0OO.srl_header_secondary);
        }
        int i16 = OooO0o.ClassicsHeader_srlTextRefreshing;
        if (typedArrayObtainStyledAttributes.hasValue(i16)) {
            this.f20987OooOoOO = typedArrayObtainStyledAttributes.getString(i16);
        } else {
            this.f20987OooOoOO = context.getString(OooO0OO.srl_header_refreshing);
        }
        int i17 = OooO0o.ClassicsHeader_srlTextUpdate;
        if (typedArrayObtainStyledAttributes.hasValue(i17)) {
            this.f20992Oooo000 = typedArrayObtainStyledAttributes.getString(i17);
        } else {
            this.f20992Oooo000 = context.getString(OooO0OO.srl_header_update);
        }
        this.f20980OooOo = new SimpleDateFormat(this.f20992Oooo000, Locale.getDefault());
        typedArrayObtainStyledAttributes.recycle();
        imageView2.animate().setInterpolator(null);
        textView.setVisibility(z ? 0 : 8);
        this.f21012OooO0oO.setText(isInEditMode() ? this.f20987OooOoOO : this.f20985OooOoO);
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
        String str = this.f20982OooOo00 + context.getClass().getName();
        this.f20982OooOo00 = str;
        SharedPreferences sharedPreferences = context.getSharedPreferences("ClassicsHeader", 0);
        this.f20984OooOo0o = sharedPreferences;
        OooOO0O(new Date(sharedPreferences.getLong(str, System.currentTimeMillis())));
    }
}
