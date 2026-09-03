package com.google.android.gms.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zaaa;
import com.google.android.gms.common.internal.zaz;
import com.google.android.gms.dynamic.RemoteCreator;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes2.dex */
public final class SignInButton extends FrameLayout implements View.OnClickListener {
    public static final int COLOR_AUTO = 2;
    public static final int COLOR_DARK = 0;
    public static final int COLOR_LIGHT = 1;
    public static final int SIZE_ICON_ONLY = 2;
    public static final int SIZE_STANDARD = 0;
    public static final int SIZE_WIDE = 1;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @Nullable
    public View.OnClickListener f15136Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f15137Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int f15138Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public View f15139Oooo0oo;

    @Retention(RetentionPolicy.SOURCE)
    public @interface ButtonSize {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ColorScheme {
    }

    public SignInButton(@NonNull Context context) {
        this(context, null);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@NonNull View view) {
        View.OnClickListener onClickListener = this.f15136Oooo;
        if (onClickListener == null || view != this.f15139Oooo0oo) {
            return;
        }
        onClickListener.onClick(this);
    }

    public void setColorScheme(int i) {
        setStyle(this.f15137Oooo0o, i);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f15139Oooo0oo.setEnabled(z);
    }

    @Override // android.view.View
    public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        this.f15136Oooo = onClickListener;
        View view = this.f15139Oooo0oo;
        if (view != null) {
            view.setOnClickListener(this);
        }
    }

    @Deprecated
    public void setScopes(@NonNull Scope[] scopeArr) {
        setStyle(this.f15137Oooo0o, this.f15138Oooo0oO);
    }

    public void setSize(int i) {
        setStyle(i, this.f15138Oooo0oO);
    }

    public void setStyle(int i, int i2) {
        this.f15137Oooo0o = i;
        this.f15138Oooo0oO = i2;
        Context context = getContext();
        View view = this.f15139Oooo0oo;
        if (view != null) {
            removeView(view);
        }
        try {
            this.f15139Oooo0oo = zaz.zaa(context, this.f15137Oooo0o, this.f15138Oooo0oO);
        } catch (RemoteCreator.RemoteCreatorException unused) {
            Log.w("SignInButton", "Sign in button not found, using placeholder instead");
            int i3 = this.f15137Oooo0o;
            int i4 = this.f15138Oooo0oO;
            zaaa zaaaVar = new zaaa(context, null);
            zaaaVar.zaa(context.getResources(), i3, i4);
            this.f15139Oooo0oo = zaaaVar;
        }
        addView(this.f15139Oooo0oo);
        this.f15139Oooo0oo.setEnabled(isEnabled());
        this.f15139Oooo0oo.setOnClickListener(this);
    }

    public SignInButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SignInButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f15136Oooo = null;
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, com.google.android.gms.base.R.styleable.SignInButton, 0, 0);
        try {
            this.f15137Oooo0o = typedArrayObtainStyledAttributes.getInt(com.google.android.gms.base.R.styleable.SignInButton_buttonSize, 0);
            this.f15138Oooo0oO = typedArrayObtainStyledAttributes.getInt(com.google.android.gms.base.R.styleable.SignInButton_colorScheme, 2);
            typedArrayObtainStyledAttributes.recycle();
            setStyle(this.f15137Oooo0o, this.f15138Oooo0oO);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Deprecated
    public void setStyle(int i, int i2, @NonNull Scope[] scopeArr) {
        setStyle(i, i2);
    }
}
