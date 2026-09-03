package p141o00OOoo;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import p139o00OOOo0.OooOO0;
import p139o00OOOo0.OooOOO;
import p140o00OOOoO.OooO0OO;

/* JADX INFO: loaded from: classes2.dex */
public abstract class OooOOOO extends OooO0OO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public TextView f37514OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final Activity f37515OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public ConstraintLayout f37516OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public TextView f37517OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public TextView f37518OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public View f37519OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public TextView f37520OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public TextView f37521OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public View f37522OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final OooOOO f37523OooOOOo = OooOO0.f37476OooO0o0;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public p138o00OOOo.OooO0OO<View, Integer> f37524OooOOo0;

    public OooOOOO(Activity activity) {
        this.f37515OooO0oO = activity;
        this.f37516OooO0oo = (ConstraintLayout) activity.findViewById(o0OO0O0.OooO0OO.include_title_layout_title);
        this.f37514OooO = (TextView) activity.findViewById(o0OO0O0.OooO0OO.include_title_tv_left);
        this.f37517OooOO0 = (TextView) activity.findViewById(o0OO0O0.OooO0OO.include_title_tv_right);
        this.f37518OooOO0O = (TextView) activity.findViewById(o0OO0O0.OooO0OO.include_title_tv_name);
        this.f37519OooOO0o = activity.findViewById(o0OO0O0.OooO0OO.clMiddleTitleWrapper);
        this.f37521OooOOO0 = (TextView) activity.findViewById(o0OO0O0.OooO0OO.include_title_tv_middle_top);
        this.f37520OooOOO = (TextView) activity.findViewById(o0OO0O0.OooO0OO.include_title_tv_middle_bottom);
        this.f37522OooOOOO = activity.findViewById(o0OO0O0.OooO0OO.include_title_view_line_bottom);
        this.f37514OooO.setOnClickListener(this);
        this.f37517OooOO0.setOnClickListener(this);
        OooO0O0();
    }

    @Override // p140o00OOOoO.OooO0OO
    public final void OooO00o(View view) {
        p138o00OOOo.OooO0OO<View, Integer> oooO0OO = this.f37524OooOOo0;
        if (oooO0OO == null) {
            return;
        }
        TextView textView = this.f37514OooO;
        if (view == textView) {
            oooO0OO.OooO00o(textView, 1010);
            return;
        }
        TextView textView2 = this.f37517OooOO0;
        if (view == textView2) {
            oooO0OO.OooO00o(textView2, 1011);
            return;
        }
        View view2 = this.f37519OooOO0o;
        if (view == view2) {
            oooO0OO.OooO00o(view2, 1012);
        } else if (view == this.f37518OooOO0O) {
            oooO0OO.OooO00o(view2, 1013);
        }
    }

    public abstract void OooO0O0();

    public final void OooO0OO() {
        OooOOO oooOOO = this.f37523OooOOOo;
        Drawable drawable = oooOOO.f37481OooO0O0;
        int i = oooOOO.f37480OooO00o;
        if (drawable != null) {
            this.f37516OooO0oo.setBackground(drawable);
        } else if (i != -1) {
            this.f37516OooO0oo.setBackgroundColor(i);
        } else {
            this.f37516OooO0oo.setBackgroundColor(-1);
        }
    }

    public final void OooO0Oo(int i, String str) {
        this.f37514OooO.setText("");
        if (!TextUtils.isEmpty(str)) {
            this.f37514OooO.setText(str);
        }
        if (i == -1) {
            this.f37514OooO.setCompoundDrawables(null, null, null, null);
            return;
        }
        Object obj = ContextCompat.f5281OooO00o;
        Drawable drawableOooO0O0 = ContextCompat.OooO0OO.OooO0O0(this.f37515OooO0oO, i);
        if (drawableOooO0O0 != null) {
            drawableOooO0O0.setBounds(0, 0, drawableOooO0O0.getMinimumWidth(), drawableOooO0O0.getMinimumHeight());
        }
        this.f37514OooO.setCompoundDrawablesRelativeWithIntrinsicBounds(drawableOooO0O0, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public final void OooO0o0(int i, String str) {
        this.f37517OooOO0.setText("");
        if (!TextUtils.isEmpty(str)) {
            this.f37517OooOO0.setText(str);
        }
        if (i == -1) {
            this.f37517OooOO0.setCompoundDrawables(null, null, null, null);
            return;
        }
        Object obj = ContextCompat.f5281OooO00o;
        Drawable drawableOooO0O0 = ContextCompat.OooO0OO.OooO0O0(this.f37515OooO0oO, i);
        if (drawableOooO0O0 != null) {
            drawableOooO0O0.setBounds(0, 0, drawableOooO0O0.getMinimumWidth(), drawableOooO0O0.getMinimumHeight());
        }
        this.f37517OooOO0.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, drawableOooO0O0, (Drawable) null);
    }
}
