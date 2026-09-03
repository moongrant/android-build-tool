package p118o00O0Oo0;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import o00O0OO.OooO0OO;
import o00O0OO.OooOO0;
import o00O0OOO.OooO0O0;
import p116o00O0OOo.OooOOO0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class OooO0o extends OooOOO0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public TextView f36577OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final Activity f36578OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public ConstraintLayout f36579OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public TextView f36580OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public TextView f36581OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public View f36582OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public TextView f36583OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public TextView f36584OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public View f36585OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final OooOO0 f36586OooOOOo = OooO0OO.f36539OooO0o0;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public OooO0O0<View, Integer> f36587OooOOo0;

    public OooO0o(Activity activity) {
        this.f36578OooO0oO = activity;
        this.f36579OooO0oo = (ConstraintLayout) activity.findViewById(o0OO0.OooO0OO.include_title_layout_title);
        this.f36577OooO = (TextView) activity.findViewById(o0OO0.OooO0OO.include_title_tv_left);
        this.f36580OooOO0 = (TextView) activity.findViewById(o0OO0.OooO0OO.include_title_tv_right);
        this.f36581OooOO0O = (TextView) activity.findViewById(o0OO0.OooO0OO.include_title_tv_name);
        this.f36582OooOO0o = activity.findViewById(o0OO0.OooO0OO.clMiddleTitleWrapper);
        this.f36584OooOOO0 = (TextView) activity.findViewById(o0OO0.OooO0OO.include_title_tv_middle_top);
        this.f36583OooOOO = (TextView) activity.findViewById(o0OO0.OooO0OO.include_title_tv_middle_bottom);
        this.f36585OooOOOO = activity.findViewById(o0OO0.OooO0OO.include_title_view_line_bottom);
        this.f36577OooO.setOnClickListener(this);
        this.f36580OooOO0.setOnClickListener(this);
        OooO0O0();
    }

    @Override // p116o00O0OOo.OooOOO0
    public final void OooO00o(View view) {
        OooO0O0<View, Integer> oooO0O0 = this.f36587OooOOo0;
        if (oooO0O0 == null) {
            return;
        }
        TextView textView = this.f36577OooO;
        if (view == textView) {
            oooO0O0.OooO0O0(textView, 1010);
            return;
        }
        TextView textView2 = this.f36580OooOO0;
        if (view == textView2) {
            oooO0O0.OooO0O0(textView2, 1011);
            return;
        }
        View view2 = this.f36582OooOO0o;
        if (view == view2) {
            oooO0O0.OooO0O0(view2, 1012);
        } else if (view == this.f36581OooOO0O) {
            oooO0O0.OooO0O0(view2, 1013);
        }
    }

    public abstract void OooO0O0();

    public final void OooO0OO() {
        OooOO0 oooOO1 = this.f36586OooOOOo;
        Drawable drawable = oooOO1.f36544OooO0O0;
        int i = oooOO1.f36543OooO00o;
        if (drawable != null) {
            this.f36579OooO0oo.setBackground(drawable);
        } else if (i != -1) {
            this.f36579OooO0oo.setBackgroundColor(i);
        } else {
            this.f36579OooO0oo.setBackgroundColor(-1);
        }
    }

    public final void OooO0Oo(int i, String str) {
        this.f36577OooO.setText("");
        if (!TextUtils.isEmpty(str)) {
            this.f36577OooO.setText(str);
        }
        if (i == -1) {
            this.f36577OooO.setCompoundDrawables(null, null, null, null);
            return;
        }
        Object obj = ContextCompat.f5271OooO00o;
        Drawable drawableOooO0O0 = ContextCompat.OooO0OO.OooO0O0(this.f36578OooO0oO, i);
        if (drawableOooO0O0 != null) {
            drawableOooO0O0.setBounds(0, 0, drawableOooO0O0.getMinimumWidth(), drawableOooO0O0.getMinimumHeight());
        }
        this.f36577OooO.setCompoundDrawablesRelativeWithIntrinsicBounds(drawableOooO0O0, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public final void OooO0o0(int i, String str) {
        this.f36580OooOO0.setText("");
        if (!TextUtils.isEmpty(str)) {
            this.f36580OooOO0.setText(str);
        }
        if (i == -1) {
            this.f36580OooOO0.setCompoundDrawables(null, null, null, null);
            return;
        }
        Object obj = ContextCompat.f5271OooO00o;
        Drawable drawableOooO0O0 = ContextCompat.OooO0OO.OooO0O0(this.f36578OooO0oO, i);
        if (drawableOooO0O0 != null) {
            drawableOooO0O0.setBounds(0, 0, drawableOooO0O0.getMinimumWidth(), drawableOooO0O0.getMinimumHeight());
        }
        this.f36580OooOO0.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, drawableOooO0O0, (Drawable) null);
    }
}
