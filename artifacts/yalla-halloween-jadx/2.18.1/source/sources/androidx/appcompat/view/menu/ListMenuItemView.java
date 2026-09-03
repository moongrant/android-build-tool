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
import androidx.appcompat.widget.o0000O0;
import androidx.core.view.ViewCompat;
import java.util.Objects;
import java.util.WeakHashMap;
import o000O0O0.o00000O;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class ListMenuItemView extends LinearLayout implements OooOOO.OooO00o, AbsListView.SelectionBoundsAdjuster {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public TextView f4660Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public OooOO0 f4661Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public ImageView f4662Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public RadioButton f4663Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public ImageView f4664OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public TextView f4665OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public CheckBox f4666OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public ImageView f4667OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public LinearLayout f4668OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public int f4669OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public Context f4670OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public boolean f4671OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public Drawable f4672OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public boolean f4673OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public LayoutInflater f4674Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public boolean f4675Ooooo0o;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public Drawable f4676o000oOoO;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, OooOo00.OooO00o.listMenuViewStyle);
    }

    private LayoutInflater getInflater() {
        if (this.f4674Ooooo00 == null) {
            this.f4674Ooooo00 = LayoutInflater.from(getContext());
        }
        return this.f4674Ooooo00;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.f4667OoooO0O;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    public final void OooO00o() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(OooOo00.OooOO0O.abc_list_menu_item_checkbox, (ViewGroup) this, false);
        this.f4666OoooO00 = checkBox;
        LinearLayout linearLayout = this.f4668OoooOO0;
        if (linearLayout != null) {
            linearLayout.addView(checkBox, -1);
        } else {
            addView(checkBox, -1);
        }
    }

    public final void OooO0O0() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(OooOo00.OooOO0O.abc_list_menu_item_radio, (ViewGroup) this, false);
        this.f4663Oooo0oo = radioButton;
        LinearLayout linearLayout = this.f4668OoooOO0;
        if (linearLayout != null) {
            linearLayout.addView(radioButton, -1);
        } else {
            addView(radioButton, -1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004b  */
    @Override // androidx.appcompat.view.menu.OooOOO.OooO00o
    public final void OooO0Oo(OooOO0 oooOO1) {
        int i;
        String string;
        this.f4661Oooo0o = oooOO1;
        setVisibility(oooOO1.isVisible() ? 0 : 8);
        setTitle(oooOO1.f4735OooO0o0);
        setCheckable(oooOO1.isCheckable());
        boolean z = oooOO1.f4741OooOOO.OooOOOo() && oooOO1.OooO0o0() != 0;
        oooOO1.OooO0o0();
        if (z) {
            OooOO0 oooOO2 = this.f4661Oooo0o;
            i = oooOO2.f4741OooOOO.OooOOOo() && oooOO2.OooO0o0() != 0 ? 0 : 8;
        }
        if (i == 0) {
            TextView textView = this.f4665OoooO0;
            OooOO0 oooOO3 = this.f4661Oooo0o;
            char cOooO0o0 = oooOO3.OooO0o0();
            if (cOooO0o0 == 0) {
                string = "";
            } else {
                Resources resources = oooOO3.f4741OooOOO.f4706OooO00o.getResources();
                StringBuilder sb = new StringBuilder();
                if (ViewConfiguration.get(oooOO3.f4741OooOOO.f4706OooO00o).hasPermanentMenuKey()) {
                    sb.append(resources.getString(OooOo00.OooOOO0.abc_prepend_shortcut_label));
                }
                int i2 = oooOO3.f4741OooOOO.OooOOOO() ? oooOO3.f4739OooOO0O : oooOO3.f4729OooO;
                OooOO0.OooO0OO(sb, i2, 65536, resources.getString(OooOo00.OooOOO0.abc_menu_meta_shortcut_label));
                OooOO0.OooO0OO(sb, i2, 4096, resources.getString(OooOo00.OooOOO0.abc_menu_ctrl_shortcut_label));
                OooOO0.OooO0OO(sb, i2, 2, resources.getString(OooOo00.OooOOO0.abc_menu_alt_shortcut_label));
                OooOO0.OooO0OO(sb, i2, 1, resources.getString(OooOo00.OooOOO0.abc_menu_shift_shortcut_label));
                OooOO0.OooO0OO(sb, i2, 4, resources.getString(OooOo00.OooOOO0.abc_menu_sym_shortcut_label));
                OooOO0.OooO0OO(sb, i2, 8, resources.getString(OooOo00.OooOOO0.abc_menu_function_shortcut_label));
                if (cOooO0o0 == '\b') {
                    sb.append(resources.getString(OooOo00.OooOOO0.abc_menu_delete_shortcut_label));
                } else if (cOooO0o0 == '\n') {
                    sb.append(resources.getString(OooOo00.OooOOO0.abc_menu_enter_shortcut_label));
                } else if (cOooO0o0 != ' ') {
                    sb.append(cOooO0o0);
                } else {
                    sb.append(resources.getString(OooOo00.OooOOO0.abc_menu_space_shortcut_label));
                }
                string = sb.toString();
            }
            textView.setText(string);
        }
        if (this.f4665OoooO0.getVisibility() != i) {
            this.f4665OoooO0.setVisibility(i);
        }
        setIcon(oooOO1.getIcon());
        setEnabled(oooOO1.isEnabled());
        setSubMenuArrowVisible(oooOO1.hasSubMenu());
        setContentDescription(oooOO1.f4746OooOOo0);
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f4664OoooO;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f4664OoooO.getLayoutParams();
        rect.top = this.f4664OoooO.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    @Override // androidx.appcompat.view.menu.OooOOO.OooO00o
    public OooOO0 getItemData() {
        return this.f4661Oooo0o;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        Drawable drawable = this.f4676o000oOoO;
        WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        ViewCompat.OooO0o.OooOOo0(this, drawable);
        TextView textView = (TextView) findViewById(OooOo00.OooOO0.title);
        this.f4660Oooo = textView;
        int i = this.f4669OoooOOO;
        if (i != -1) {
            textView.setTextAppearance(this.f4670OoooOOo, i);
        }
        this.f4665OoooO0 = (TextView) findViewById(OooOo00.OooOO0.shortcut);
        ImageView imageView = (ImageView) findViewById(OooOo00.OooOO0.submenuarrow);
        this.f4667OoooO0O = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f4672OoooOoO);
        }
        this.f4664OoooO = (ImageView) findViewById(OooOo00.OooOO0.group_divider);
        this.f4668OoooOO0 = (LinearLayout) findViewById(OooOo00.OooOO0.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.f4662Oooo0oO != null && this.f4671OoooOo0) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f4662Oooo0oO.getLayoutParams();
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
        if (!z && this.f4663Oooo0oo == null && this.f4666OoooO00 == null) {
            return;
        }
        if (this.f4661Oooo0o.OooO0oo()) {
            if (this.f4663Oooo0oo == null) {
                OooO0O0();
            }
            compoundButton = this.f4663Oooo0oo;
            view = this.f4666OoooO00;
        } else {
            if (this.f4666OoooO00 == null) {
                OooO00o();
            }
            compoundButton = this.f4666OoooO00;
            view = this.f4663Oooo0oo;
        }
        if (z) {
            compoundButton.setChecked(this.f4661Oooo0o.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox = this.f4666OoooO00;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.f4663Oooo0oo;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.f4661Oooo0o.OooO0oo()) {
            if (this.f4663Oooo0oo == null) {
                OooO0O0();
            }
            compoundButton = this.f4663Oooo0oo;
        } else {
            if (this.f4666OoooO00 == null) {
                OooO00o();
            }
            compoundButton = this.f4666OoooO00;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.f4675Ooooo0o = z;
        this.f4671OoooOo0 = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.f4664OoooO;
        if (imageView != null) {
            imageView.setVisibility((this.f4673OoooOoo || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        Objects.requireNonNull(this.f4661Oooo0o.f4741OooOOO);
        boolean z = this.f4675Ooooo0o;
        if (z || this.f4671OoooOo0) {
            ImageView imageView = this.f4662Oooo0oO;
            if (imageView == null && drawable == null && !this.f4671OoooOo0) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(OooOo00.OooOO0O.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f4662Oooo0oO = imageView2;
                LinearLayout linearLayout = this.f4668OoooOO0;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f4671OoooOo0) {
                this.f4662Oooo0oO.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f4662Oooo0oO;
            if (!z) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f4662Oooo0oO.getVisibility() != 0) {
                this.f4662Oooo0oO.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f4660Oooo.getVisibility() != 8) {
                this.f4660Oooo.setVisibility(8);
            }
        } else {
            this.f4660Oooo.setText(charSequence);
            if (this.f4660Oooo.getVisibility() != 0) {
                this.f4660Oooo.setVisibility(0);
            }
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        o0000O0 o0000o0OooOOo = o0000O0.OooOOo(getContext(), attributeSet, OooOo00.OooOOOO.MenuView, i);
        this.f4676o000oOoO = o0000o0OooOOo.OooO0oO(OooOo00.OooOOOO.MenuView_android_itemBackground);
        this.f4669OoooOOO = o0000o0OooOOo.OooOOO0(OooOo00.OooOOOO.MenuView_android_itemTextAppearance, -1);
        this.f4671OoooOo0 = o0000o0OooOOo.OooO00o(OooOo00.OooOOOO.MenuView_preserveIconSpacing, false);
        this.f4670OoooOOo = context;
        this.f4672OoooOoO = o0000o0OooOOo.OooO0oO(OooOo00.OooOOOO.MenuView_subMenuArrow);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, OooOo00.OooO00o.dropDownListViewStyle, 0);
        this.f4673OoooOoo = typedArrayObtainStyledAttributes.hasValue(0);
        o0000o0OooOOo.OooOOoo();
        typedArrayObtainStyledAttributes.recycle();
    }
}
