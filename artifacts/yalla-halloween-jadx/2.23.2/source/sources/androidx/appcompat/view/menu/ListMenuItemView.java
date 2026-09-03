package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.o000Oo0;
import androidx.core.view.ViewCompat;
import androidx.core.view.o000OOo0;
import java.util.WeakHashMap;
import p012OooOo0O.Oooo0;
import p012OooOo0O.Oooo000;
import p012OooOo0O.o000oOoO;
import p012OooOo0O.o00O0O;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class ListMenuItemView extends LinearLayout implements OooOOOO.OooO00o, AbsListView.SelectionBoundsAdjuster {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public TextView f2551OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public OooOO0O f2552OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public RadioButton f2553OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public ImageView f2554OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public TextView f2555OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public CheckBox f2556OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public ImageView f2557OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public ImageView f2558OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public LinearLayout f2559OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final int f2560OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final Drawable f2561OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final Context f2562OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public boolean f2563OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final boolean f2564OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final Drawable f2565OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public LayoutInflater f2566OooOOoo;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public boolean f2567OooOo00;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, p012OooOo0O.OooOOO0.listMenuViewStyle);
    }

    private LayoutInflater getInflater() {
        if (this.f2566OooOOoo == null) {
            this.f2566OooOOoo = LayoutInflater.from(getContext());
        }
        return this.f2566OooOOoo;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.f2557OooOO0;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0035  */
    /* JADX WARN: Code duplicated, block: B:25:0x0054  */
    /* JADX WARN: Code duplicated, block: B:28:0x0058  */
    @Override // androidx.appcompat.view.menu.OooOOOO.OooO00o
    public final void OooO0OO(OooOO0O oooOO0O) {
        boolean z;
        int i;
        String string;
        boolean z2;
        this.f2552OooO0Oo = oooOO0O;
        setVisibility(oooOO0O.isVisible() ? 0 : 8);
        setTitle(oooOO0O.f2630OooO0o0);
        setCheckable(oooOO0O.isCheckable());
        OooO oooO = oooOO0O.f2636OooOOO;
        if (oooO.OooOOOO()) {
            if ((oooO.OooOOO() ? oooOO0O.f2633OooOO0 : oooOO0O.f2632OooO0oo) != 0) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        oooO.OooOOO();
        if (z) {
            OooOO0O oooOO0O2 = this.f2552OooO0Oo;
            OooO oooO2 = oooOO0O2.f2636OooOOO;
            if (oooO2.OooOOOO()) {
                if ((oooO2.OooOOO() ? oooOO0O2.f2633OooOO0 : oooOO0O2.f2632OooO0oo) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            } else {
                z2 = false;
            }
            i = z2 ? 0 : 8;
        }
        if (i == 0) {
            TextView textView = this.f2551OooO;
            OooOO0O oooOO0O3 = this.f2552OooO0Oo;
            char c = oooOO0O3.f2636OooOOO.OooOOO() ? oooOO0O3.f2633OooOO0 : oooOO0O3.f2632OooO0oo;
            if (c == 0) {
                string = "";
            } else {
                OooO oooO3 = oooOO0O3.f2636OooOOO;
                Resources resources = oooO3.f2570OooO00o.getResources();
                StringBuilder sb = new StringBuilder();
                if (ViewConfiguration.get(oooO3.f2570OooO00o).hasPermanentMenuKey()) {
                    sb.append(resources.getString(o000oOoO.abc_prepend_shortcut_label));
                }
                int i2 = oooO3.OooOOO() ? oooOO0O3.f2634OooOO0O : oooOO0O3.f2624OooO;
                OooOO0O.OooO0OO(sb, i2, 65536, resources.getString(o000oOoO.abc_menu_meta_shortcut_label));
                OooOO0O.OooO0OO(sb, i2, 4096, resources.getString(o000oOoO.abc_menu_ctrl_shortcut_label));
                OooOO0O.OooO0OO(sb, i2, 2, resources.getString(o000oOoO.abc_menu_alt_shortcut_label));
                OooOO0O.OooO0OO(sb, i2, 1, resources.getString(o000oOoO.abc_menu_shift_shortcut_label));
                OooOO0O.OooO0OO(sb, i2, 4, resources.getString(o000oOoO.abc_menu_sym_shortcut_label));
                OooOO0O.OooO0OO(sb, i2, 8, resources.getString(o000oOoO.abc_menu_function_shortcut_label));
                if (c == '\b') {
                    sb.append(resources.getString(o000oOoO.abc_menu_delete_shortcut_label));
                } else if (c == '\n') {
                    sb.append(resources.getString(o000oOoO.abc_menu_enter_shortcut_label));
                } else if (c != ' ') {
                    sb.append(c);
                } else {
                    sb.append(resources.getString(o000oOoO.abc_menu_space_shortcut_label));
                }
                string = sb.toString();
            }
            textView.setText(string);
        }
        if (this.f2551OooO.getVisibility() != i) {
            this.f2551OooO.setVisibility(i);
        }
        setIcon(oooOO0O.getIcon());
        setEnabled(oooOO0O.isEnabled());
        setSubMenuArrowVisible(oooOO0O.hasSubMenu());
        setContentDescription(oooOO0O.f2641OooOOo0);
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f2558OooOO0O;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f2558OooOO0O.getLayoutParams();
        rect.top = this.f2558OooOO0O.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    @Override // androidx.appcompat.view.menu.OooOOOO.OooO00o
    public OooOO0O getItemData() {
        return this.f2552OooO0Oo;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
        ViewCompat.OooO0o.OooOOo0(this, this.f2561OooOOO0);
        TextView textView = (TextView) findViewById(Oooo000.title);
        this.f2555OooO0oO = textView;
        int i = this.f2560OooOOO;
        if (i != -1) {
            textView.setTextAppearance(this.f2562OooOOOO, i);
        }
        this.f2551OooO = (TextView) findViewById(Oooo000.shortcut);
        ImageView imageView = (ImageView) findViewById(Oooo000.submenuarrow);
        this.f2557OooOO0 = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f2565OooOOo0);
        }
        this.f2558OooOO0O = (ImageView) findViewById(Oooo000.group_divider);
        this.f2559OooOO0o = (LinearLayout) findViewById(Oooo000.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.f2554OooO0o0 != null && this.f2563OooOOOo) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f2554OooO0o0.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        View view;
        if (!z && this.f2553OooO0o == null && this.f2556OooO0oo == null) {
            return;
        }
        if ((this.f2552OooO0Oo.f2643OooOo & 4) != 0) {
            if (this.f2553OooO0o == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(Oooo0.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f2553OooO0o = radioButton;
                LinearLayout linearLayout = this.f2559OooOO0o;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f2553OooO0o;
            view = this.f2556OooO0oo;
        } else {
            if (this.f2556OooO0oo == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(Oooo0.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f2556OooO0oo = checkBox;
                LinearLayout linearLayout2 = this.f2559OooOO0o;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f2556OooO0oo;
            view = this.f2553OooO0o;
        }
        if (z) {
            compoundButton.setChecked(this.f2552OooO0Oo.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f2556OooO0oo;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f2553OooO0o;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if ((this.f2552OooO0Oo.f2643OooOo & 4) != 0) {
            if (this.f2553OooO0o == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(Oooo0.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f2553OooO0o = radioButton;
                LinearLayout linearLayout = this.f2559OooOO0o;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f2553OooO0o;
        } else {
            if (this.f2556OooO0oo == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(Oooo0.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f2556OooO0oo = checkBox;
                LinearLayout linearLayout2 = this.f2559OooOO0o;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f2556OooO0oo;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.f2567OooOo00 = z;
        this.f2563OooOOOo = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.f2558OooOO0O;
        if (imageView != null) {
            imageView.setVisibility((this.f2564OooOOo || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        this.f2552OooO0Oo.f2636OooOOO.getClass();
        boolean z = this.f2567OooOo00;
        if (z || this.f2563OooOOOo) {
            ImageView imageView = this.f2554OooO0o0;
            if (imageView == null && drawable == null && !this.f2563OooOOOo) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(Oooo0.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f2554OooO0o0 = imageView2;
                LinearLayout linearLayout = this.f2559OooOO0o;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f2563OooOOOo) {
                this.f2554OooO0o0.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f2554OooO0o0;
            if (!z) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f2554OooO0o0.getVisibility() != 0) {
                this.f2554OooO0o0.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f2555OooO0oO.getVisibility() != 8) {
                this.f2555OooO0oO.setVisibility(8);
            }
        } else {
            this.f2555OooO0oO.setText(charSequence);
            if (this.f2555OooO0oO.getVisibility() != 0) {
                this.f2555OooO0oO.setVisibility(0);
            }
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        o000Oo0 o000oo0OooOOO0 = o000Oo0.OooOOO0(getContext(), attributeSet, o00O0O.MenuView, i);
        this.f2561OooOOO0 = o000oo0OooOOO0.OooO0o0(o00O0O.MenuView_android_itemBackground);
        this.f2560OooOOO = o000oo0OooOOO0.OooO(o00O0O.MenuView_android_itemTextAppearance, -1);
        this.f2563OooOOOo = o000oo0OooOOO0.OooO00o(o00O0O.MenuView_preserveIconSpacing, false);
        this.f2562OooOOOO = context;
        this.f2565OooOOo0 = o000oo0OooOOO0.OooO0o0(o00O0O.MenuView_subMenuArrow);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, p012OooOo0O.OooOOO0.dropDownListViewStyle, 0);
        this.f2564OooOOo = typedArrayObtainStyledAttributes.hasValue(0);
        o000oo0OooOOO0.OooOOO();
        typedArrayObtainStyledAttributes.recycle();
    }
}
