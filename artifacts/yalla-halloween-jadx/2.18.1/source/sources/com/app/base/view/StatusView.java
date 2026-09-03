package com.app.base.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOOO;
import com.yalla.yalla.common.ui.view.SVGAView;
import p654o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes.dex */
public class StatusView extends FrameLayout {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public ImageView f12113Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public View f12114Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public View f12115Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public View f12116Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public Button f12117OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public TextView f12118OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public ImageView f12119OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public Button f12120OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public ViewStub f12121OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public ViewStub f12122OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public int f12123OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public int f12124OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public int f12125OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public int f12126OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public boolean f12127Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public int f12128Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public o00Oo0 f12129OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public int f12130OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public View.OnClickListener f12131OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public com.app.base.Function.OooO0O0 f12132Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public boolean f12133Oooooo0;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public ViewStub f12134o000oOoO;

    public StatusView(Context context) {
        this(context, null);
    }

    public final void OooO00o(boolean z) {
        if (!z) {
            View view = this.f12114Oooo0o;
            if (view != null) {
                view.setVisibility(8);
                return;
            }
            return;
        }
        if (this.f12134o000oOoO.getParent() != null) {
            View viewInflate = this.f12134o000oOoO.inflate();
            this.f12114Oooo0o = viewInflate;
            this.f12113Oooo = (ImageView) viewInflate.findViewById(R.id.view_empty_holder_iv_no_data);
            this.f12118OoooO0 = (TextView) this.f12114Oooo0o.findViewById(R.id.view_empty_holder_tv_blank_text);
            this.f12117OoooO = (Button) this.f12114Oooo0o.findViewById(R.id.view_empty_holder_bt_empty);
            int i = this.f12123OoooOOo;
            if (i != 0) {
                this.f12114Oooo0o.setBackgroundResource(i);
            }
            int i2 = this.f12124OoooOo0;
            if (i2 != 0) {
                this.f12113Oooo.setImageResource(i2);
            }
            int i3 = this.f12125OoooOoO;
            if (i3 != 0) {
                this.f12118OoooO0.setText(i3);
            }
            int i4 = this.f12126OoooOoo;
            if (i4 != 0) {
                this.f12118OoooO0.setTextColor(OooOOO.OooO00o(i4));
            }
            int i5 = this.f12128Ooooo0o;
            if (i5 != 0) {
                this.f12117OoooO.setText(i5);
            }
            o00Oo0 o00oo1 = this.f12129OooooO0;
            if (o00oo1 != null) {
                this.f12117OoooO.setOnClickListener(o00oo1);
            }
            this.f12117OoooO.setVisibility(this.f12127Ooooo00 ? 0 : 8);
        }
        this.f12114Oooo0o.setVisibility(0);
    }

    public final void OooO0O0() {
        OooO0OO(true);
        OooO0o0(false);
        OooO00o(false);
    }

    public final void OooO0OO(boolean z) {
        if (!z) {
            View view = this.f12116Oooo0oo;
            if (view != null) {
                view.setVisibility(8);
                return;
            }
            return;
        }
        if (this.f12122OoooOOO.getParent() != null) {
            View viewInflate = this.f12122OoooOOO.inflate();
            this.f12116Oooo0oo = viewInflate;
            this.f12119OoooO00 = (ImageView) viewInflate.findViewById(R.id.view_empty_holder_iv_error);
            this.f12120OoooO0O = (Button) this.f12116Oooo0oo.findViewById(R.id.view_empty_holder_bt_error);
            int i = this.f12130OooooOO;
            if (i != 0) {
                this.f12119OoooO00.setImageResource(i);
            }
            View.OnClickListener onClickListener = this.f12131OooooOo;
            if (onClickListener != null) {
                this.f12120OoooO0O.setOnClickListener(onClickListener);
            }
        }
        this.f12116Oooo0oo.setVisibility(0);
    }

    public final void OooO0Oo(boolean z) {
        if (!z) {
            OooO0o0(false);
            return;
        }
        OooO0o0(true);
        OooO00o(false);
        OooO0OO(false);
    }

    public final void OooO0o0(boolean z) {
        if (!z) {
            View view = this.f12115Oooo0oO;
            if (view != null) {
                view.setVisibility(8);
                this.f12132Oooooo.f11348OooO0oo = true;
                return;
            }
            return;
        }
        if (this.f12121OoooOO0.getParent() != null) {
            View viewInflate = this.f12121OoooOO0.inflate();
            this.f12115Oooo0oO = viewInflate;
            com.app.base.Function.OooO0O0 oooO0O0 = new com.app.base.Function.OooO0O0((SVGAView) viewInflate.findViewById(R.id.view_empty_holder_sv_first_loading), getContext(), R.array.horse_gray, 33, true);
            this.f12132Oooooo = oooO0O0;
            if (!this.f12133Oooooo0) {
                oooO0O0.f11348OooO0oo = true;
            }
        }
        this.f12115Oooo0oO.setVisibility(0);
        this.f12132Oooooo.OooO0O0();
    }

    public void setEmptyBackground(int i) {
        this.f12123OoooOOo = i;
        setBackgroundResource(i);
    }

    public void setEmptyButtonText(int i) {
        this.f12128Ooooo0o = i;
        Button button = this.f12117OoooO;
        if (button != null) {
            button.setText(i);
        }
    }

    public void setEmptyImageRes(@DrawableRes int i) {
        this.f12124OoooOo0 = i;
        ImageView imageView = this.f12113Oooo;
        if (imageView != null) {
            imageView.setImageResource(i);
        }
    }

    public void setEmptyText(@StringRes int i) {
        this.f12125OoooOoO = i;
        TextView textView = this.f12118OoooO0;
        if (textView != null) {
            textView.setText(i);
        }
    }

    public void setEmptyTextColor(@ColorRes int i) {
        this.f12126OoooOoo = i;
        TextView textView = this.f12118OoooO0;
        if (textView != null) {
            textView.setTextColor(OooOOO.OooO00o(i));
        }
    }

    public void setErrorImage(int i) {
        this.f12130OooooOO = i;
        ImageView imageView = this.f12119OoooO00;
        if (imageView != null) {
            imageView.setImageResource(i);
        }
    }

    public void setOnEmptyClickListener(o00Oo0 o00oo1) {
        this.f12129OooooO0 = o00oo1;
        this.f12127Ooooo00 = true;
        Button button = this.f12117OoooO;
        if (button != null) {
            button.setVisibility(0);
        }
        Button button2 = this.f12117OoooO;
        if (button2 != null) {
            button2.setOnClickListener(o00oo1);
        }
    }

    public void setOnErrorClickListener(View.OnClickListener onClickListener) {
        this.f12131OooooOo = onClickListener;
        Button button = this.f12120OoooO0O;
        if (button != null) {
            button.setOnClickListener(onClickListener);
        }
    }

    public StatusView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public StatusView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View.inflate(getContext(), R.layout.view_empty_holder, this);
        this.f12121OoooOO0 = (ViewStub) findViewById(R.id.vs_status_loading);
        this.f12134o000oOoO = (ViewStub) findViewById(R.id.vs_status_empty);
        this.f12122OoooOOO = (ViewStub) findViewById(R.id.vs_status_error);
    }
}
