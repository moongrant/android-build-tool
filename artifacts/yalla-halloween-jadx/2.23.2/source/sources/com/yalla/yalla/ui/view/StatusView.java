package com.yalla.yalla.ui.view;

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
import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.o0000;
import p473o0OoooOo.o0OOOO0o;
import p562o0oOo000.o00oO0o;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public class StatusView extends FrameLayout {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public TextView f30159OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public View f30160OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public View f30161OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public View f30162OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public ImageView f30163OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public ImageView f30164OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public Button f30165OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public Button f30166OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public ViewStub f30167OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public ViewStub f30168OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public ViewStub f30169OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int f30170OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public int f30171OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public int f30172OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public int f30173OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public boolean f30174OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public boolean f30175OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public o0OOOO0o f30176OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public int f30177OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public int f30178OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public View.OnClickListener f30179OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public com.yalla.yalla.util.Function.OooO00o f30180OooOoO0;

    public StatusView(Context context) {
        this(context, null);
    }

    public final void OooO00o(boolean z) {
        if (!z) {
            View view = this.f30160OooO0Oo;
            if (view != null) {
                view.setVisibility(8);
                return;
            }
            return;
        }
        if (this.f30169OooOOO0.getParent() != null) {
            View viewInflate = this.f30169OooOOO0.inflate();
            this.f30160OooO0Oo = viewInflate;
            this.f30163OooO0oO = (ImageView) viewInflate.findViewById(o0OO00O.view_empty_holder_iv_no_data);
            this.f30159OooO = (TextView) this.f30160OooO0Oo.findViewById(o0OO00O.view_empty_holder_tv_blank_text);
            this.f30166OooOO0O = (Button) this.f30160OooO0Oo.findViewById(o0OO00O.view_empty_holder_bt_empty);
            int i = this.f30170OooOOOO;
            if (i != 0) {
                this.f30160OooO0Oo.setBackgroundResource(i);
            }
            int i2 = this.f30171OooOOOo;
            if (i2 != 0) {
                this.f30163OooO0oO.setImageResource(i2);
            }
            int i3 = this.f30173OooOOo0;
            if (i3 != 0) {
                this.f30159OooO.setText(i3);
            }
            int i4 = this.f30172OooOOo;
            if (i4 != 0) {
                this.f30159OooO.setTextColor(o0000.OooO00o(i4));
            }
            int i5 = this.f30177OooOo00;
            if (i5 != 0) {
                this.f30166OooOO0O.setText(i5);
            }
            o0OOOO0o o0oooo0o2 = this.f30176OooOo0;
            if (o0oooo0o2 != null) {
                this.f30166OooOO0O.setOnClickListener(o0oooo0o2);
            }
            this.f30166OooOO0O.setVisibility(this.f30174OooOOoo ? 0 : 8);
        }
        this.f30160OooO0Oo.setVisibility(0);
    }

    public final void OooO0O0(boolean z) {
        if (!z) {
            View view = this.f30161OooO0o;
            if (view != null) {
                view.setVisibility(8);
                return;
            }
            return;
        }
        if (this.f30168OooOOO.getParent() != null) {
            View viewInflate = this.f30168OooOOO.inflate();
            this.f30161OooO0o = viewInflate;
            this.f30164OooO0oo = (ImageView) viewInflate.findViewById(o0OO00O.view_empty_holder_iv_error);
            this.f30165OooOO0 = (Button) this.f30161OooO0o.findViewById(o0OO00O.view_empty_holder_bt_error);
            int i = this.f30178OooOo0O;
            if (i != 0) {
                this.f30164OooO0oo.setImageResource(i);
            }
            View.OnClickListener onClickListener = this.f30179OooOo0o;
            if (onClickListener != null) {
                this.f30165OooOO0.setOnClickListener(onClickListener);
            }
        }
        this.f30161OooO0o.setVisibility(0);
    }

    public final void OooO0OO(boolean z) {
        if (!z) {
            OooO0Oo(false);
            return;
        }
        OooO0Oo(true);
        OooO00o(false);
        OooO0O0(false);
    }

    public final void OooO0Oo(boolean z) {
        if (!z) {
            View view = this.f30162OooO0o0;
            if (view != null) {
                view.setVisibility(8);
                this.f30180OooOoO0.f32268OooO0oo = true;
                return;
            }
            return;
        }
        if (this.f30167OooOO0o.getParent() != null) {
            View viewInflate = this.f30167OooOO0o.inflate();
            this.f30162OooO0o0 = viewInflate;
            SVGAView sVGAView = (SVGAView) viewInflate.findViewById(o0OO00O.view_empty_holder_sv_first_loading);
            com.yalla.yalla.util.Function.OooO00o oooO00o = new com.yalla.yalla.util.Function.OooO00o(o00oO0o.anim_loading_horse_gray, 33, getContext(), sVGAView, true);
            this.f30180OooOoO0 = oooO00o;
            if (!this.f30175OooOo) {
                oooO00o.f32268OooO0oo = true;
            }
        }
        this.f30162OooO0o0.setVisibility(0);
        this.f30180OooOoO0.OooO0OO();
    }

    public void setEmptyBackground(int i) {
        this.f30170OooOOOO = i;
        setBackgroundResource(i);
    }

    public void setEmptyButtonText(int i) {
        this.f30177OooOo00 = i;
        Button button = this.f30166OooOO0O;
        if (button != null) {
            button.setText(i);
        }
    }

    public void setEmptyImageRes(@DrawableRes int i) {
        this.f30171OooOOOo = i;
        ImageView imageView = this.f30163OooO0oO;
        if (imageView != null) {
            imageView.setImageResource(i);
        }
    }

    public void setEmptyText(@StringRes int i) {
        this.f30173OooOOo0 = i;
        TextView textView = this.f30159OooO;
        if (textView != null) {
            textView.setText(i);
        }
    }

    public void setEmptyTextColor(@ColorRes int i) {
        this.f30172OooOOo = i;
        TextView textView = this.f30159OooO;
        if (textView != null) {
            textView.setTextColor(o0000.OooO00o(i));
        }
    }

    public void setErrorImage(int i) {
        this.f30178OooOo0O = i;
        ImageView imageView = this.f30164OooO0oo;
        if (imageView != null) {
            imageView.setImageResource(i);
        }
    }

    public void setOnEmptyClickListener(o0OOOO0o o0oooo0o2) {
        this.f30176OooOo0 = o0oooo0o2;
        this.f30174OooOOoo = true;
        Button button = this.f30166OooOO0O;
        if (button != null) {
            button.setVisibility(0);
        }
        Button button2 = this.f30166OooOO0O;
        if (button2 != null) {
            button2.setOnClickListener(o0oooo0o2);
        }
    }

    public void setOnErrorClickListener(View.OnClickListener onClickListener) {
        this.f30179OooOo0o = onClickListener;
        Button button = this.f30165OooOO0;
        if (button != null) {
            button.setOnClickListener(onClickListener);
        }
    }

    public StatusView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public StatusView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View.inflate(getContext(), oo0o0Oo.view_empty_holder, this);
        this.f30167OooOO0o = (ViewStub) findViewById(o0OO00O.vs_status_loading);
        this.f30169OooOOO0 = (ViewStub) findViewById(o0OO00O.vs_status_empty);
        this.f30168OooOOO = (ViewStub) findViewById(o0OO00O.vs_status_error);
    }
}
