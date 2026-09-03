package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import androidx.core.view.o000OOo0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o000000O;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p272o0O0000o.o00000O;
import p272o0O0000o.o0000O00;

/* JADX INFO: loaded from: classes3.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class NavigationMenuPresenter implements androidx.appcompat.view.menu.OooOOO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public LayoutInflater f16687OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public NavigationMenuView f16688OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public androidx.appcompat.view.menu.OooO f16689OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public LinearLayout f16690OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f16691OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public OooO0O0 f16692OooO0oo;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public ColorStateList f16694OooOO0O;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public ColorStateList f16696OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public ColorStateList f16697OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public Drawable f16698OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public RippleDrawable f16699OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @Px
    public int f16700OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public int f16701OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public int f16702OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @Px
    public int f16703OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @Px
    public int f16704OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public int f16705OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @Px
    public int f16706OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @Px
    public int f16707OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public boolean f16709OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f16710OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public int f16711OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f16712OooOoo0;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f16693OooOO0 = 0;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f16695OooOO0o = 0;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public boolean f16708OooOoO = true;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public int f16713OooOooO = -1;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final OooO00o f16714OooOooo = new OooO00o();

    public static class HeaderViewHolder extends ViewHolder {
        public HeaderViewHolder(View view) {
            super(view);
        }
    }

    public static class NormalViewHolder extends ViewHolder {
        public NormalViewHolder(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, View.OnClickListener onClickListener) {
            super(layoutInflater.inflate(o0000O00.design_navigation_item, viewGroup, false));
            this.itemView.setOnClickListener(onClickListener);
        }
    }

    public static class OooO implements OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f16715OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f16716OooO0O0;

        public OooO(int i, int i2) {
            this.f16715OooO00o = i;
            this.f16716OooO0O0 = i2;
        }
    }

    public class OooO00o implements View.OnClickListener {
        public OooO00o() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) view;
            NavigationMenuPresenter navigationMenuPresenter = NavigationMenuPresenter.this;
            OooO0O0 oooO0O0 = navigationMenuPresenter.f16692OooO0oo;
            boolean z = true;
            if (oooO0O0 != null) {
                oooO0O0.f16720OooO0OO = true;
            }
            androidx.appcompat.view.menu.OooOO0O itemData = navigationMenuItemView.getItemData();
            boolean zOooOOo0 = navigationMenuPresenter.f16689OooO0o.OooOOo0(itemData, navigationMenuPresenter, 0);
            if (itemData != null && itemData.isCheckable() && zOooOOo0) {
                navigationMenuPresenter.f16692OooO0oo.OooO0O0(itemData);
            } else {
                z = false;
            }
            OooO0O0 oooO0O1 = navigationMenuPresenter.f16692OooO0oo;
            if (oooO0O1 != null) {
                oooO0O1.f16720OooO0OO = false;
            }
            if (z) {
                navigationMenuPresenter.OooO(false);
            }
        }
    }

    public class OooO0O0 extends RecyclerView.Adapter<ViewHolder> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ArrayList<OooO0o> f16718OooO00o = new ArrayList<>();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public androidx.appcompat.view.menu.OooOO0O f16719OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public boolean f16720OooO0OO;

        public OooO0O0() {
            OooO00o();
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final void OooO00o() {
            boolean z;
            if (this.f16720OooO0OO) {
                return;
            }
            this.f16720OooO0OO = true;
            ArrayList<OooO0o> arrayList = this.f16718OooO00o;
            arrayList.clear();
            arrayList.add(new OooO0OO());
            NavigationMenuPresenter navigationMenuPresenter = NavigationMenuPresenter.this;
            int size = navigationMenuPresenter.f16689OooO0o.OooOO0o().size();
            boolean z2 = false;
            int i = -1;
            int i2 = 0;
            boolean z3 = false;
            int size2 = 0;
            while (i2 < size) {
                androidx.appcompat.view.menu.OooOO0O oooOO0O = navigationMenuPresenter.f16689OooO0o.OooOO0o().get(i2);
                if (oooOO0O.isChecked()) {
                    OooO0O0(oooOO0O);
                }
                if (oooOO0O.isCheckable()) {
                    oooOO0O.OooO0o(z2);
                }
                if (oooOO0O.hasSubMenu()) {
                    androidx.appcompat.view.menu.OooOo oooOo = oooOO0O.f2638OooOOOO;
                    if (oooOo.hasVisibleItems()) {
                        if (i2 != 0) {
                            arrayList.add(new OooO(navigationMenuPresenter.f16711OooOoo, z2 ? 1 : 0));
                        }
                        arrayList.add(new OooOO0(oooOO0O));
                        int size3 = oooOo.size();
                        int i3 = z2 ? 1 : 0;
                        int i4 = i3;
                        while (i3 < size3) {
                            androidx.appcompat.view.menu.OooOO0O oooOO0O2 = (androidx.appcompat.view.menu.OooOO0O) oooOo.getItem(i3);
                            if (oooOO0O2.isVisible()) {
                                if (i4 == 0 && oooOO0O2.getIcon() != null) {
                                    i4 = 1;
                                }
                                if (oooOO0O2.isCheckable()) {
                                    oooOO0O2.OooO0o(z2);
                                }
                                if (oooOO0O.isChecked()) {
                                    OooO0O0(oooOO0O);
                                }
                                arrayList.add(new OooOO0(oooOO0O2));
                            }
                            i3++;
                            z2 = false;
                        }
                        if (i4 != 0) {
                            int size4 = arrayList.size();
                            for (int size5 = arrayList.size(); size5 < size4; size5++) {
                                ((OooOO0) arrayList.get(size5)).f16723OooO0O0 = true;
                            }
                        }
                    }
                    z = true;
                } else {
                    int i5 = oooOO0O.f2626OooO0O0;
                    if (i5 != i) {
                        size2 = arrayList.size();
                        z3 = oooOO0O.getIcon() != null;
                        if (i2 != 0) {
                            size2++;
                            int i6 = navigationMenuPresenter.f16711OooOoo;
                            arrayList.add(new OooO(i6, i6));
                        }
                    } else {
                        if (!z3 && oooOO0O.getIcon() != null) {
                            int size6 = arrayList.size();
                            for (int i7 = size2; i7 < size6; i7++) {
                                ((OooOO0) arrayList.get(i7)).f16723OooO0O0 = true;
                            }
                            z = true;
                            z3 = true;
                        }
                        OooOO0 oooOO1 = new OooOO0(oooOO0O);
                        oooOO1.f16723OooO0O0 = z3;
                        arrayList.add(oooOO1);
                        i = i5;
                    }
                    z = true;
                    OooOO0 oooOO2 = new OooOO0(oooOO0O);
                    oooOO2.f16723OooO0O0 = z3;
                    arrayList.add(oooOO2);
                    i = i5;
                }
                i2++;
                z2 = false;
            }
            this.f16720OooO0OO = z2 ? 1 : 0;
        }

        public final void OooO0O0(@NonNull androidx.appcompat.view.menu.OooOO0O oooOO0O) {
            if (this.f16719OooO0O0 == oooOO0O || !oooOO0O.isCheckable()) {
                return;
            }
            androidx.appcompat.view.menu.OooOO0O oooOO0O2 = this.f16719OooO0O0;
            if (oooOO0O2 != null) {
                oooOO0O2.setChecked(false);
            }
            this.f16719OooO0O0 = oooOO0O;
            oooOO0O.setChecked(true);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return this.f16718OooO00o.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final long getItemId(int i) {
            return i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemViewType(int i) {
            OooO0o oooO0o = this.f16718OooO00o.get(i);
            if (oooO0o instanceof OooO) {
                return 2;
            }
            if (oooO0o instanceof OooO0OO) {
                return 3;
            }
            if (oooO0o instanceof OooOO0) {
                return ((OooOO0) oooO0o).f16722OooO00o.hasSubMenu() ? 1 : 0;
            }
            throw new RuntimeException("Unknown item type.");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(@NonNull RecyclerView.o0O0O00 o0o0o00, int i) {
            ViewHolder viewHolder = (ViewHolder) o0o0o00;
            int itemViewType = getItemViewType(i);
            ArrayList<OooO0o> arrayList = this.f16718OooO00o;
            NavigationMenuPresenter navigationMenuPresenter = NavigationMenuPresenter.this;
            if (itemViewType != 0) {
                if (itemViewType != 1) {
                    if (itemViewType == 2) {
                        OooO oooO = (OooO) arrayList.get(i);
                        viewHolder.itemView.setPadding(navigationMenuPresenter.f16704OooOo0, oooO.f16715OooO00o, navigationMenuPresenter.f16706OooOo0O, oooO.f16716OooO0O0);
                        return;
                    } else {
                        if (itemViewType != 3) {
                            return;
                        }
                        ViewCompat.OooOOOO(viewHolder.itemView, new OooOo(this, i, true));
                        return;
                    }
                }
                TextView textView = (TextView) viewHolder.itemView;
                textView.setText(((OooOO0) arrayList.get(i)).f16722OooO00o.f2630OooO0o0);
                int i2 = navigationMenuPresenter.f16693OooOO0;
                if (i2 != 0) {
                    textView.setTextAppearance(i2);
                }
                textView.setPadding(navigationMenuPresenter.f16707OooOo0o, textView.getPaddingTop(), navigationMenuPresenter.f16703OooOo, textView.getPaddingBottom());
                ColorStateList colorStateList = navigationMenuPresenter.f16694OooOO0O;
                if (colorStateList != null) {
                    textView.setTextColor(colorStateList);
                }
                ViewCompat.OooOOOO(textView, new OooOo(this, i, true));
                return;
            }
            NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) viewHolder.itemView;
            navigationMenuItemView.setIconTintList(navigationMenuPresenter.f16696OooOOO);
            int i3 = navigationMenuPresenter.f16695OooOO0o;
            if (i3 != 0) {
                navigationMenuItemView.setTextAppearance(i3);
            }
            ColorStateList colorStateList2 = navigationMenuPresenter.f16697OooOOO0;
            if (colorStateList2 != null) {
                navigationMenuItemView.setTextColor(colorStateList2);
            }
            Drawable drawable = navigationMenuPresenter.f16698OooOOOO;
            Drawable drawableNewDrawable = drawable != null ? drawable.getConstantState().newDrawable() : null;
            WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
            ViewCompat.OooO0o.OooOOo0(navigationMenuItemView, drawableNewDrawable);
            RippleDrawable rippleDrawable = navigationMenuPresenter.f16699OooOOOo;
            if (rippleDrawable != null) {
                navigationMenuItemView.setForeground(rippleDrawable.getConstantState().newDrawable());
            }
            OooOO0 oooOO1 = (OooOO0) arrayList.get(i);
            navigationMenuItemView.setNeedsEmptyIcon(oooOO1.f16723OooO0O0);
            int i4 = navigationMenuPresenter.f16701OooOOo0;
            int i5 = navigationMenuPresenter.f16700OooOOo;
            navigationMenuItemView.setPadding(i4, i5, i4, i5);
            navigationMenuItemView.setIconPadding(navigationMenuPresenter.f16702OooOOoo);
            if (navigationMenuPresenter.f16709OooOoO0) {
                navigationMenuItemView.setIconSize(navigationMenuPresenter.f16705OooOo00);
            }
            navigationMenuItemView.setMaxLines(navigationMenuPresenter.f16710OooOoOO);
            navigationMenuItemView.OooO0OO(oooOO1.f16722OooO00o);
            ViewCompat.OooOOOO(navigationMenuItemView, new OooOo(this, i, false));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @Nullable
        public final RecyclerView.o0O0O00 onCreateViewHolder(ViewGroup viewGroup, int i) {
            RecyclerView.o0O0O00 normalViewHolder;
            NavigationMenuPresenter navigationMenuPresenter = NavigationMenuPresenter.this;
            if (i == 0) {
                normalViewHolder = new NormalViewHolder(navigationMenuPresenter.f16687OooO, viewGroup, navigationMenuPresenter.f16714OooOooo);
            } else if (i == 1) {
                normalViewHolder = new SubheaderViewHolder(navigationMenuPresenter.f16687OooO, viewGroup);
            } else {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return new HeaderViewHolder(navigationMenuPresenter.f16690OooO0o0);
                }
                normalViewHolder = new SeparatorViewHolder(navigationMenuPresenter.f16687OooO, viewGroup);
            }
            return normalViewHolder;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onViewRecycled(RecyclerView.o0O0O00 o0o0o00) {
            ViewHolder viewHolder = (ViewHolder) o0o0o00;
            if (viewHolder instanceof NormalViewHolder) {
                NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) viewHolder.itemView;
                FrameLayout frameLayout = navigationMenuItemView.f16679OooOoo;
                if (frameLayout != null) {
                    frameLayout.removeAllViews();
                }
                navigationMenuItemView.f16680OooOoo0.setCompoundDrawables(null, null, null, null);
            }
        }
    }

    public static class OooO0OO implements OooO0o {
    }

    public interface OooO0o {
    }

    public static class OooOO0 implements OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final androidx.appcompat.view.menu.OooOO0O f16722OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public boolean f16723OooO0O0;

        public OooOO0(androidx.appcompat.view.menu.OooOO0O oooOO0O) {
            this.f16722OooO00o = oooOO0O;
        }
    }

    public class OooOO0O extends o000000O {
        public OooOO0O(NavigationMenuView navigationMenuView) {
            super(navigationMenuView);
        }

        @Override // androidx.recyclerview.widget.o000000O, androidx.core.view.OooO00o
        public final void onInitializeAccessibilityNodeInfo(View view, @NonNull o0000O.o0O0O00 o0o0o00) {
            int i;
            int i2;
            super.onInitializeAccessibilityNodeInfo(view, o0o0o00);
            NavigationMenuPresenter navigationMenuPresenter = NavigationMenuPresenter.this;
            if (navigationMenuPresenter.f16690OooO0o0.getChildCount() == 0) {
                i = 0;
                i2 = 0;
            } else {
                i = 0;
                i2 = 1;
            }
            while (i < navigationMenuPresenter.f16692OooO0oo.getItemCount()) {
                int itemViewType = navigationMenuPresenter.f16692OooO0oo.getItemViewType(i);
                if (itemViewType == 0 || itemViewType == 1) {
                    i2++;
                }
                i++;
            }
            AccessibilityNodeInfo.CollectionInfo collectionInfoObtain = AccessibilityNodeInfo.CollectionInfo.obtain(i2, 1, false);
            o0o0o00.getClass();
            o0o0o00.f33510OooO00o.setCollectionInfo(collectionInfoObtain);
        }
    }

    public static class SeparatorViewHolder extends ViewHolder {
        public SeparatorViewHolder(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(o0000O00.design_navigation_item_separator, viewGroup, false));
        }
    }

    public static class SubheaderViewHolder extends ViewHolder {
        public SubheaderViewHolder(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(o0000O00.design_navigation_item_subheader, viewGroup, false));
        }
    }

    public static abstract class ViewHolder extends RecyclerView.o0O0O00 {
        public ViewHolder(View view) {
            super(view);
        }
    }

    @Override // androidx.appcompat.view.menu.OooOOO
    public final void OooO(boolean z) {
        OooO0O0 oooO0O0 = this.f16692OooO0oo;
        if (oooO0O0 != null) {
            oooO0O0.OooO00o();
            oooO0O0.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.OooOOO
    public final void OooO0O0(androidx.appcompat.view.menu.OooO oooO, boolean z) {
    }

    @Override // androidx.appcompat.view.menu.OooOOO
    public final boolean OooO0Oo(androidx.appcompat.view.menu.OooOO0O oooOO0O) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.OooOOO
    public final boolean OooO0o(androidx.appcompat.view.menu.OooOo oooOo) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.OooOOO
    public final void OooO0o0(Parcelable parcelable) {
        androidx.appcompat.view.menu.OooOO0O oooOO0O;
        View actionView;
        ParcelableSparseArray parcelableSparseArray;
        androidx.appcompat.view.menu.OooOO0O oooOO0O2;
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.f16688OooO0Oo.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle("android:menu:adapter");
            if (bundle2 != null) {
                OooO0O0 oooO0O0 = this.f16692OooO0oo;
                oooO0O0.getClass();
                int i = bundle2.getInt("android:menu:checked", 0);
                ArrayList<OooO0o> arrayList = oooO0O0.f16718OooO00o;
                if (i != 0) {
                    oooO0O0.f16720OooO0OO = true;
                    int size = arrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        OooO0o oooO0o = arrayList.get(i2);
                        if ((oooO0o instanceof OooOO0) && (oooOO0O2 = ((OooOO0) oooO0o).f16722OooO00o) != null && oooOO0O2.f2625OooO00o == i) {
                            oooO0O0.OooO0O0(oooOO0O2);
                            break;
                        }
                    }
                    oooO0O0.f16720OooO0OO = false;
                    oooO0O0.OooO00o();
                }
                SparseArray sparseParcelableArray2 = bundle2.getSparseParcelableArray("android:menu:action_views");
                if (sparseParcelableArray2 != null) {
                    int size2 = arrayList.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        OooO0o oooO0o2 = arrayList.get(i3);
                        if ((oooO0o2 instanceof OooOO0) && (oooOO0O = ((OooOO0) oooO0o2).f16722OooO00o) != null && (actionView = oooOO0O.getActionView()) != null && (parcelableSparseArray = (ParcelableSparseArray) sparseParcelableArray2.get(oooOO0O.f2625OooO00o)) != null) {
                            actionView.restoreHierarchyState(parcelableSparseArray);
                        }
                    }
                }
            }
            SparseArray<Parcelable> sparseParcelableArray3 = bundle.getSparseParcelableArray("android:menu:header");
            if (sparseParcelableArray3 != null) {
                this.f16690OooO0o0.restoreHierarchyState(sparseParcelableArray3);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.OooOOO
    @NonNull
    public final Parcelable OooO0oO() {
        Bundle bundle = new Bundle();
        if (this.f16688OooO0Oo != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.f16688OooO0Oo.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        OooO0O0 oooO0O0 = this.f16692OooO0oo;
        if (oooO0O0 != null) {
            oooO0O0.getClass();
            Bundle bundle2 = new Bundle();
            androidx.appcompat.view.menu.OooOO0O oooOO0O = oooO0O0.f16719OooO0O0;
            if (oooOO0O != null) {
                bundle2.putInt("android:menu:checked", oooOO0O.f2625OooO00o);
            }
            SparseArray<? extends Parcelable> sparseArray2 = new SparseArray<>();
            ArrayList<OooO0o> arrayList = oooO0O0.f16718OooO00o;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                OooO0o oooO0o = arrayList.get(i);
                if (oooO0o instanceof OooOO0) {
                    androidx.appcompat.view.menu.OooOO0O oooOO0O2 = ((OooOO0) oooO0o).f16722OooO00o;
                    View actionView = oooOO0O2 != null ? oooOO0O2.getActionView() : null;
                    if (actionView != null) {
                        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
                        actionView.saveHierarchyState(parcelableSparseArray);
                        sparseArray2.put(oooOO0O2.f2625OooO00o, parcelableSparseArray);
                    }
                }
            }
            bundle2.putSparseParcelableArray("android:menu:action_views", sparseArray2);
            bundle.putBundle("android:menu:adapter", bundle2);
        }
        if (this.f16690OooO0o0 != null) {
            SparseArray<Parcelable> sparseArray3 = new SparseArray<>();
            this.f16690OooO0o0.saveHierarchyState(sparseArray3);
            bundle.putSparseParcelableArray("android:menu:header", sparseArray3);
        }
        return bundle;
    }

    @Override // androidx.appcompat.view.menu.OooOOO
    public final boolean OooO0oo(androidx.appcompat.view.menu.OooOO0O oooOO0O) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.OooOOO
    public final boolean OooOO0() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.OooOOO
    public final void OooOO0O(@NonNull Context context, @NonNull androidx.appcompat.view.menu.OooO oooO) {
        this.f16687OooO = LayoutInflater.from(context);
        this.f16689OooO0o = oooO;
        this.f16711OooOoo = context.getResources().getDimensionPixelOffset(o00000O.design_navigation_separator_vertical_padding);
    }

    @Override // androidx.appcompat.view.menu.OooOOO
    public final int getId() {
        return this.f16691OooO0oO;
    }
}
