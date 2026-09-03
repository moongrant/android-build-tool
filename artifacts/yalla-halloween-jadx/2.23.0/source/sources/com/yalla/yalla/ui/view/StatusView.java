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
import p466o0Oooo0o.oo00o;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oO0O0OoO;

/* JADX INFO: loaded from: classes5.dex */
public class StatusView extends FrameLayout {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public TextView f30704OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public View f30705OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public View f30706OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public View f30707OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public ImageView f30708OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public ImageView f30709OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public Button f30710OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public Button f30711OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public ViewStub f30712OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public ViewStub f30713OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public ViewStub f30714OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int f30715OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public int f30716OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public int f30717OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public int f30718OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public boolean f30719OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public boolean f30720OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public oo00o f30721OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public int f30722OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public int f30723OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public View.OnClickListener f30724OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public com.yalla.yalla.util.Function.OooO00o f30725OooOoO0;

    public StatusView(Context context) {
        this(context, null);
    }

    public final void OooO00o(boolean z) {
        if (!z) {
            View view = this.f30705OooO0Oo;
            if (view != null) {
                view.setVisibility(8);
                return;
            }
            return;
        }
        if (this.f30714OooOOO0.getParent() != null) {
            View viewInflate = this.f30714OooOOO0.inflate();
            this.f30705OooO0Oo = viewInflate;
            this.f30708OooO0oO = (ImageView) viewInflate.findViewById(oO00O0oO.view_empty_holder_iv_no_data);
            this.f30704OooO = (TextView) this.f30705OooO0Oo.findViewById(oO00O0oO.view_empty_holder_tv_blank_text);
            this.f30711OooOO0O = (Button) this.f30705OooO0Oo.findViewById(oO00O0oO.view_empty_holder_bt_empty);
            int i = this.f30715OooOOOO;
            if (i != 0) {
                this.f30705OooO0Oo.setBackgroundResource(i);
            }
            int i2 = this.f30716OooOOOo;
            if (i2 != 0) {
                this.f30708OooO0oO.setImageResource(i2);
            }
            int i3 = this.f30718OooOOo0;
            if (i3 != 0) {
                this.f30704OooO.setText(i3);
            }
            int i4 = this.f30717OooOOo;
            if (i4 != 0) {
                this.f30704OooO.setTextColor(o0000.OooO00o(i4));
            }
            int i5 = this.f30722OooOo00;
            if (i5 != 0) {
                this.f30711OooOO0O.setText(i5);
            }
            oo00o oo00oVar = this.f30721OooOo0;
            if (oo00oVar != null) {
                this.f30711OooOO0O.setOnClickListener(oo00oVar);
            }
            this.f30711OooOO0O.setVisibility(this.f30719OooOOoo ? 0 : 8);
        }
        this.f30705OooO0Oo.setVisibility(0);
    }

    public final void OooO0O0(boolean z) {
        if (!z) {
            View view = this.f30706OooO0o;
            if (view != null) {
                view.setVisibility(8);
                return;
            }
            return;
        }
        if (this.f30713OooOOO.getParent() != null) {
            View viewInflate = this.f30713OooOOO.inflate();
            this.f30706OooO0o = viewInflate;
            this.f30709OooO0oo = (ImageView) viewInflate.findViewById(oO00O0oO.view_empty_holder_iv_error);
            this.f30710OooOO0 = (Button) this.f30706OooO0o.findViewById(oO00O0oO.view_empty_holder_bt_error);
            int i = this.f30723OooOo0O;
            if (i != 0) {
                this.f30709OooO0oo.setImageResource(i);
            }
            View.OnClickListener onClickListener = this.f30724OooOo0o;
            if (onClickListener != null) {
                this.f30710OooOO0.setOnClickListener(onClickListener);
            }
        }
        this.f30706OooO0o.setVisibility(0);
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
            View view = this.f30707OooO0o0;
            if (view != null) {
                view.setVisibility(8);
                this.f30725OooOoO0.f32804OooO0oo = true;
                return;
            }
            return;
        }
        if (this.f30712OooOO0o.getParent() != null) {
            View viewInflate = this.f30712OooOO0o.inflate();
            this.f30707OooO0o0 = viewInflate;
            SVGAView sVGAView = (SVGAView) viewInflate.findViewById(oO00O0oO.view_empty_holder_sv_first_loading);
            com.yalla.yalla.util.Function.OooO00o oooO00o = new com.yalla.yalla.util.Function.OooO00o(oO0O0OoO.anim_loading_horse_gray, 33, getContext(), sVGAView, true);
            this.f30725OooOoO0 = oooO00o;
            if (!this.f30720OooOo) {
                oooO00o.f32804OooO0oo = true;
            }
        }
        this.f30707OooO0o0.setVisibility(0);
        this.f30725OooOoO0.OooO0OO();
    }

    public void setEmptyBackground(int i) {
        this.f30715OooOOOO = i;
        setBackgroundResource(i);
    }

    public void setEmptyButtonText(int i) {
        this.f30722OooOo00 = i;
        Button button = this.f30711OooOO0O;
        if (button != null) {
            button.setText(i);
        }
    }

    public void setEmptyImageRes(@DrawableRes int i) {
        this.f30716OooOOOo = i;
        ImageView imageView = this.f30708OooO0oO;
        if (imageView != null) {
            imageView.setImageResource(i);
        }
    }

    public void setEmptyText(@StringRes int i) {
        this.f30718OooOOo0 = i;
        TextView textView = this.f30704OooO;
        if (textView != null) {
            textView.setText(i);
        }
    }

    public void setEmptyTextColor(@ColorRes int i) {
        this.f30717OooOOo = i;
        TextView textView = this.f30704OooO;
        if (textView != null) {
            textView.setTextColor(o0000.OooO00o(i));
        }
    }

    public void setErrorImage(int i) {
        this.f30723OooOo0O = i;
        ImageView imageView = this.f30709OooO0oo;
        if (imageView != null) {
            imageView.setImageResource(i);
        }
    }

    public void setOnEmptyClickListener(oo00o oo00oVar) {
        this.f30721OooOo0 = oo00oVar;
        this.f30719OooOOoo = true;
        Button button = this.f30711OooOO0O;
        if (button != null) {
            button.setVisibility(0);
        }
        Button button2 = this.f30711OooOO0O;
        if (button2 != null) {
            button2.setOnClickListener(oo00oVar);
        }
    }

    public void setOnErrorClickListener(View.OnClickListener onClickListener) {
        this.f30724OooOo0o = onClickListener;
        Button button = this.f30710OooOO0;
        if (button != null) {
            button.setOnClickListener(onClickListener);
        }
    }

    public StatusView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public StatusView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View.inflate(getContext(), oO00OO0O.view_empty_holder, this);
        this.f30712OooOO0o = (ViewStub) findViewById(oO00O0oO.vs_status_loading);
        this.f30714OooOOO0 = (ViewStub) findViewById(oO00O0oO.vs_status_empty);
        this.f30713OooOOO = (ViewStub) findViewById(oO00O0oO.vs_status_error);
    }
}
