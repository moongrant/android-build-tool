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
import androidx.core.view.o000O0Oo;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o000000;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p270o0O0000o.o00000O;
import p270o0O0000o.o0000O00;

/* JADX INFO: loaded from: classes3.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class NavigationMenuPresenter implements androidx.appcompat.view.menu.OooOOO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public LayoutInflater f17160OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public NavigationMenuView f17161OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public androidx.appcompat.view.menu.OooO f17162OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public LinearLayout f17163OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f17164OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public OooO0O0 f17165OooO0oo;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public ColorStateList f17167OooOO0O;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public ColorStateList f17169OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public ColorStateList f17170OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public Drawable f17171OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public RippleDrawable f17172OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @Px
    public int f17173OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public int f17174OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public int f17175OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @Px
    public int f17176OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @Px
    public int f17177OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public int f17178OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @Px
    public int f17179OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @Px
    public int f17180OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public boolean f17182OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f17183OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public int f17184OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f17185OooOoo0;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f17166OooOO0 = 0;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f17168OooOO0o = 0;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public boolean f17181OooOoO = true;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public int f17186OooOooO = -1;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final OooO00o f17187OooOooo = new OooO00o();

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
        public final int f17188OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f17189OooO0O0;

        public OooO(int i, int i2) {
            this.f17188OooO00o = i;
            this.f17189OooO0O0 = i2;
        }
    }

    public class OooO00o implements View.OnClickListener {
        public OooO00o() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) view;
            NavigationMenuPresenter navigationMenuPresenter = NavigationMenuPresenter.this;
            OooO0O0 oooO0O0 = navigationMenuPresenter.f17165OooO0oo;
            boolean z = true;
            if (oooO0O0 != null) {
                oooO0O0.f17193OooO0OO = true;
            }
            androidx.appcompat.view.menu.OooOO0O itemData = navigationMenuItemView.getItemData();
            boolean zOooOOo0 = navigationMenuPresenter.f17162OooO0o.OooOOo0(itemData, navigationMenuPresenter, 0);
            if (itemData != null && itemData.isCheckable() && zOooOOo0) {
                navigationMenuPresenter.f17165OooO0oo.OooO0O0(itemData);
            } else {
                z = false;
            }
            OooO0O0 oooO0O1 = navigationMenuPresenter.f17165OooO0oo;
            if (oooO0O1 != null) {
                oooO0O1.f17193OooO0OO = false;
            }
            if (z) {
                navigationMenuPresenter.OooO(false);
            }
        }
    }

    public class OooO0O0 extends RecyclerView.Adapter<ViewHolder> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ArrayList<OooO0o> f17191OooO00o = new ArrayList<>();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public androidx.appcompat.view.menu.OooOO0O f17192OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public boolean f17193OooO0OO;

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
            if (this.f17193OooO0OO) {
                return;
            }
            this.f17193OooO0OO = true;
            ArrayList<OooO0o> arrayList = this.f17191OooO00o;
            arrayList.clear();
            arrayList.add(new OooO0OO());
            NavigationMenuPresenter navigationMenuPresenter = NavigationMenuPresenter.this;
            int size = navigationMenuPresenter.f17162OooO0o.OooOO0o().size();
            boolean z2 = false;
            int i = -1;
            int i2 = 0;
            boolean z3 = false;
            int size2 = 0;
            while (i2 < size) {
                androidx.appcompat.view.menu.OooOO0O oooOO0O = navigationMenuPresenter.f17162OooO0o.OooOO0o().get(i2);
                if (oooOO0O.isChecked()) {
                    OooO0O0(oooOO0O);
                }
                if (oooOO0O.isCheckable()) {
                    oooOO0O.OooO0o(z2);
                }
                if (oooOO0O.hasSubMenu()) {
                    androidx.appcompat.view.menu.OooOo oooOo = oooOO0O.f2640OooOOOO;
                    if (oooOo.hasVisibleItems()) {
                        if (i2 != 0) {
                            arrayList.add(new OooO(navigationMenuPresenter.f17184OooOoo, z2 ? 1 : 0));
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
                                ((OooOO0) arrayList.get(size5)).f17196OooO0O0 = true;
                            }
                        }
                    }
                    z = true;
                } else {
                    int i5 = oooOO0O.f2628OooO0O0;
                    if (i5 != i) {
                        size2 = arrayList.size();
                        z3 = oooOO0O.getIcon() != null;
                        if (i2 != 0) {
                            size2++;
                            int i6 = navigationMenuPresenter.f17184OooOoo;
                            arrayList.add(new OooO(i6, i6));
                        }
                    } else {
                        if (!z3 && oooOO0O.getIcon() != null) {
                            int size6 = arrayList.size();
                            for (int i7 = size2; i7 < size6; i7++) {
                                ((OooOO0) arrayList.get(i7)).f17196OooO0O0 = true;
                            }
                            z = true;
                            z3 = true;
                        }
                        OooOO0 oooOO1 = new OooOO0(oooOO0O);
                        oooOO1.f17196OooO0O0 = z3;
                        arrayList.add(oooOO1);
                        i = i5;
                    }
                    z = true;
                    OooOO0 oooOO2 = new OooOO0(oooOO0O);
                    oooOO2.f17196OooO0O0 = z3;
                    arrayList.add(oooOO2);
                    i = i5;
                }
                i2++;
                z2 = false;
            }
            this.f17193OooO0OO = z2 ? 1 : 0;
        }

        public final void OooO0O0(@NonNull androidx.appcompat.view.menu.OooOO0O oooOO0O) {
            if (this.f17192OooO0O0 == oooOO0O || !oooOO0O.isCheckable()) {
                return;
            }
            androidx.appcompat.view.menu.OooOO0O oooOO0O2 = this.f17192OooO0O0;
            if (oooOO0O2 != null) {
                oooOO0O2.setChecked(false);
            }
            this.f17192OooO0O0 = oooOO0O;
            oooOO0O.setChecked(true);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return this.f17191OooO00o.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final long getItemId(int i) {
            return i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemViewType(int i) {
            OooO0o oooO0o = this.f17191OooO00o.get(i);
            if (oooO0o instanceof OooO) {
                return 2;
            }
            if (oooO0o instanceof OooO0OO) {
                return 3;
            }
            if (oooO0o instanceof OooOO0) {
                return ((OooOO0) oooO0o).f17195OooO00o.hasSubMenu() ? 1 : 0;
            }
            throw new RuntimeException("Unknown item type.");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(@NonNull RecyclerView.o0O0O00 o0o0o00, int i) {
            ViewHolder viewHolder = (ViewHolder) o0o0o00;
            int itemViewType = getItemViewType(i);
            ArrayList<OooO0o> arrayList = this.f17191OooO00o;
            NavigationMenuPresenter navigationMenuPresenter = NavigationMenuPresenter.this;
            if (itemViewType != 0) {
                if (itemViewType != 1) {
                    if (itemViewType == 2) {
                        OooO oooO = (OooO) arrayList.get(i);
                        viewHolder.itemView.setPadding(navigationMenuPresenter.f17177OooOo0, oooO.f17188OooO00o, navigationMenuPresenter.f17179OooOo0O, oooO.f17189OooO0O0);
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
                textView.setText(((OooOO0) arrayList.get(i)).f17195OooO00o.f2632OooO0o0);
                int i2 = navigationMenuPresenter.f17166OooOO0;
                if (i2 != 0) {
                    textView.setTextAppearance(i2);
                }
                textView.setPadding(navigationMenuPresenter.f17180OooOo0o, textView.getPaddingTop(), navigationMenuPresenter.f17176OooOo, textView.getPaddingBottom());
                ColorStateList colorStateList = navigationMenuPresenter.f17167OooOO0O;
                if (colorStateList != null) {
                    textView.setTextColor(colorStateList);
                }
                ViewCompat.OooOOOO(textView, new OooOo(this, i, true));
                return;
            }
            NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) viewHolder.itemView;
            navigationMenuItemView.setIconTintList(navigationMenuPresenter.f17169OooOOO);
            int i3 = navigationMenuPresenter.f17168OooOO0o;
            if (i3 != 0) {
                navigationMenuItemView.setTextAppearance(i3);
            }
            ColorStateList colorStateList2 = navigationMenuPresenter.f17170OooOOO0;
            if (colorStateList2 != null) {
                navigationMenuItemView.setTextColor(colorStateList2);
            }
            Drawable drawable = navigationMenuPresenter.f17171OooOOOO;
            Drawable drawableNewDrawable = drawable != null ? drawable.getConstantState().newDrawable() : null;
            WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
            ViewCompat.OooO0o.OooOOo0(navigationMenuItemView, drawableNewDrawable);
            RippleDrawable rippleDrawable = navigationMenuPresenter.f17172OooOOOo;
            if (rippleDrawable != null) {
                navigationMenuItemView.setForeground(rippleDrawable.getConstantState().newDrawable());
            }
            OooOO0 oooOO1 = (OooOO0) arrayList.get(i);
            navigationMenuItemView.setNeedsEmptyIcon(oooOO1.f17196OooO0O0);
            int i4 = navigationMenuPresenter.f17174OooOOo0;
            int i5 = navigationMenuPresenter.f17173OooOOo;
            navigationMenuItemView.setPadding(i4, i5, i4, i5);
            navigationMenuItemView.setIconPadding(navigationMenuPresenter.f17175OooOOoo);
            if (navigationMenuPresenter.f17182OooOoO0) {
                navigationMenuItemView.setIconSize(navigationMenuPresenter.f17178OooOo00);
            }
            navigationMenuItemView.setMaxLines(navigationMenuPresenter.f17183OooOoOO);
            navigationMenuItemView.OooO0OO(oooOO1.f17195OooO00o);
            ViewCompat.OooOOOO(navigationMenuItemView, new OooOo(this, i, false));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @Nullable
        public final RecyclerView.o0O0O00 onCreateViewHolder(ViewGroup viewGroup, int i) {
            RecyclerView.o0O0O00 normalViewHolder;
            NavigationMenuPresenter navigationMenuPresenter = NavigationMenuPresenter.this;
            if (i == 0) {
                normalViewHolder = new NormalViewHolder(navigationMenuPresenter.f17160OooO, viewGroup, navigationMenuPresenter.f17187OooOooo);
            } else if (i == 1) {
                normalViewHolder = new SubheaderViewHolder(navigationMenuPresenter.f17160OooO, viewGroup);
            } else {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return new HeaderViewHolder(navigationMenuPresenter.f17163OooO0o0);
                }
                normalViewHolder = new SeparatorViewHolder(navigationMenuPresenter.f17160OooO, viewGroup);
            }
            return normalViewHolder;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onViewRecycled(RecyclerView.o0O0O00 o0o0o00) {
            ViewHolder viewHolder = (ViewHolder) o0o0o00;
            if (viewHolder instanceof NormalViewHolder) {
                NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) viewHolder.itemView;
                FrameLayout frameLayout = navigationMenuItemView.f17152OooOoo;
                if (frameLayout != null) {
                    frameLayout.removeAllViews();
                }
                navigationMenuItemView.f17153OooOoo0.setCompoundDrawables(null, null, null, null);
            }
        }
    }

    public static class OooO0OO implements OooO0o {
    }

    public interface OooO0o {
    }

    public static class OooOO0 implements OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final androidx.appcompat.view.menu.OooOO0O f17195OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public boolean f17196OooO0O0;

        public OooOO0(androidx.appcompat.view.menu.OooOO0O oooOO0O) {
            this.f17195OooO00o = oooOO0O;
        }
    }

    public class OooOO0O extends o000000 {
        public OooOO0O(NavigationMenuView navigationMenuView) {
            super(navigationMenuView);
        }

        @Override // androidx.recyclerview.widget.o000000, androidx.core.view.OooO00o
        public final void onInitializeAccessibilityNodeInfo(View view, @NonNull o0000O.o0Oo0oo o0oo0oo2) {
            int i;
            int i2;
            super.onInitializeAccessibilityNodeInfo(view, o0oo0oo2);
            NavigationMenuPresenter navigationMenuPresenter = NavigationMenuPresenter.this;
            if (navigationMenuPresenter.f17163OooO0o0.getChildCount() == 0) {
                i = 0;
                i2 = 0;
            } else {
                i = 0;
                i2 = 1;
            }
            while (i < navigationMenuPresenter.f17165OooO0oo.getItemCount()) {
                int itemViewType = navigationMenuPresenter.f17165OooO0oo.getItemViewType(i);
                if (itemViewType == 0 || itemViewType == 1) {
                    i2++;
                }
                i++;
            }
            AccessibilityNodeInfo.CollectionInfo collectionInfoObtain = AccessibilityNodeInfo.CollectionInfo.obtain(i2, 1, false);
            o0oo0oo2.getClass();
            o0oo0oo2.f34022OooO00o.setCollectionInfo(collectionInfoObtain);
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
        OooO0O0 oooO0O0 = this.f17165OooO0oo;
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
                this.f17161OooO0Oo.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle("android:menu:adapter");
            if (bundle2 != null) {
                OooO0O0 oooO0O0 = this.f17165OooO0oo;
                oooO0O0.getClass();
                int i = bundle2.getInt("android:menu:checked", 0);
                ArrayList<OooO0o> arrayList = oooO0O0.f17191OooO00o;
                if (i != 0) {
                    oooO0O0.f17193OooO0OO = true;
                    int size = arrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        OooO0o oooO0o = arrayList.get(i2);
                        if ((oooO0o instanceof OooOO0) && (oooOO0O2 = ((OooOO0) oooO0o).f17195OooO00o) != null && oooOO0O2.f2627OooO00o == i) {
                            oooO0O0.OooO0O0(oooOO0O2);
                            break;
                        }
                    }
                    oooO0O0.f17193OooO0OO = false;
                    oooO0O0.OooO00o();
                }
                SparseArray sparseParcelableArray2 = bundle2.getSparseParcelableArray("android:menu:action_views");
                if (sparseParcelableArray2 != null) {
                    int size2 = arrayList.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        OooO0o oooO0o2 = arrayList.get(i3);
                        if ((oooO0o2 instanceof OooOO0) && (oooOO0O = ((OooOO0) oooO0o2).f17195OooO00o) != null && (actionView = oooOO0O.getActionView()) != null && (parcelableSparseArray = (ParcelableSparseArray) sparseParcelableArray2.get(oooOO0O.f2627OooO00o)) != null) {
                            actionView.restoreHierarchyState(parcelableSparseArray);
                        }
                    }
                }
            }
            SparseArray<Parcelable> sparseParcelableArray3 = bundle.getSparseParcelableArray("android:menu:header");
            if (sparseParcelableArray3 != null) {
                this.f17163OooO0o0.restoreHierarchyState(sparseParcelableArray3);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.OooOOO
    @NonNull
    public final Parcelable OooO0oO() {
        Bundle bundle = new Bundle();
        if (this.f17161OooO0Oo != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.f17161OooO0Oo.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        OooO0O0 oooO0O0 = this.f17165OooO0oo;
        if (oooO0O0 != null) {
            oooO0O0.getClass();
            Bundle bundle2 = new Bundle();
            androidx.appcompat.view.menu.OooOO0O oooOO0O = oooO0O0.f17192OooO0O0;
            if (oooOO0O != null) {
                bundle2.putInt("android:menu:checked", oooOO0O.f2627OooO00o);
            }
            SparseArray<? extends Parcelable> sparseArray2 = new SparseArray<>();
            ArrayList<OooO0o> arrayList = oooO0O0.f17191OooO00o;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                OooO0o oooO0o = arrayList.get(i);
                if (oooO0o instanceof OooOO0) {
                    androidx.appcompat.view.menu.OooOO0O oooOO0O2 = ((OooOO0) oooO0o).f17195OooO00o;
                    View actionView = oooOO0O2 != null ? oooOO0O2.getActionView() : null;
                    if (actionView != null) {
                        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
                        actionView.saveHierarchyState(parcelableSparseArray);
                        sparseArray2.put(oooOO0O2.f2627OooO00o, parcelableSparseArray);
                    }
                }
            }
            bundle2.putSparseParcelableArray("android:menu:action_views", sparseArray2);
            bundle.putBundle("android:menu:adapter", bundle2);
        }
        if (this.f17163OooO0o0 != null) {
            SparseArray<Parcelable> sparseArray3 = new SparseArray<>();
            this.f17163OooO0o0.saveHierarchyState(sparseArray3);
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
        this.f17160OooO = LayoutInflater.from(context);
        this.f17162OooO0o = oooO;
        this.f17184OooOoo = context.getResources().getDimensionPixelOffset(o00000O.design_navigation_separator_vertical_padding);
    }

    @Override // androidx.appcompat.view.menu.OooOOO
    public final int getId() {
        return this.f17164OooO0oO;
    }
}
