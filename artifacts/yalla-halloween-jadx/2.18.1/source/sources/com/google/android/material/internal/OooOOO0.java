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
import androidx.core.widget.TextViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o000000;
import java.util.ArrayList;
import java.util.Objects;
import java.util.WeakHashMap;
import o000O0O0.o00000O;
import p072o000O0o0.o0000OO0;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class OooOOO0 implements androidx.appcompat.view.menu.OooOOO0 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public int f17280Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public NavigationMenuView f17281Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public LinearLayout f17282Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public androidx.appcompat.view.menu.OooO0o f17283Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    @Nullable
    public ColorStateList f17284OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public LayoutInflater f17285OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public OooO0OO f17286OoooO00;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public ColorStateList f17289OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public Drawable f17290OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public RippleDrawable f17291OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public int f17292OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @Px
    public int f17293OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public int f17294Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public int f17295Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    @Px
    public int f17296OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    @Px
    public int f17297OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    @Px
    public int f17298OooooOo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public boolean f17300Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public int f17301OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public int f17302Ooooooo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public ColorStateList f17303o000oOoO;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public int f17305o0OoOo0;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public int f17287OoooO0O = 0;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public int f17288OoooOO0 = 0;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public boolean f17299Oooooo = true;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public int f17306ooOO = -1;

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    public final OooO00o f17304o00O0O = new OooO00o();

    public interface OooO {
    }

    public class OooO00o implements View.OnClickListener {
        public OooO00o() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            boolean z = true;
            OooOOO0.this.OooO0O0(true);
            androidx.appcompat.view.menu.OooOO0 itemData = ((NavigationMenuItemView) view).getItemData();
            OooOOO0 oooOOO0 = OooOOO0.this;
            boolean zOooOo00 = oooOOO0.f17283Oooo0oo.OooOo00(itemData, oooOOO0, 0);
            if (itemData != null && itemData.isCheckable() && zOooOo00) {
                OooOOO0.this.f17286OoooO00.OooO0O0(itemData);
            } else {
                z = false;
            }
            OooOOO0.this.OooO0O0(false);
            if (z) {
                OooOOO0.this.OooO0Oo(false);
            }
        }
    }

    public static class OooO0O0 extends OooOo {
        public OooO0O0(View view) {
            super(view);
        }
    }

    public class OooO0OO extends RecyclerView.Adapter<OooOo> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ArrayList<OooO> f17308OooO00o = new ArrayList<>();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public androidx.appcompat.view.menu.OooOO0 f17309OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public boolean f17310OooO0OO;

        public OooO0OO() {
            OooO00o();
        }

        public final void OooO00o() {
            if (this.f17310OooO0OO) {
                return;
            }
            this.f17310OooO0OO = true;
            this.f17308OooO00o.clear();
            this.f17308OooO00o.add(new OooO0o());
            int i = -1;
            int size = OooOOO0.this.f17283Oooo0oo.OooOOO0().size();
            boolean z = false;
            int i2 = 0;
            boolean z2 = false;
            int size2 = 0;
            while (i2 < size) {
                androidx.appcompat.view.menu.OooOO0 oooOO1 = OooOOO0.this.f17283Oooo0oo.OooOOO0().get(i2);
                if (oooOO1.isChecked()) {
                    OooO0O0(oooOO1);
                }
                if (oooOO1.isCheckable()) {
                    oooOO1.OooOO0O(z);
                }
                if (oooOO1.hasSubMenu()) {
                    androidx.appcompat.view.menu.OooOo00 oooOo00 = oooOO1.f4743OooOOOO;
                    if (oooOo00.hasVisibleItems()) {
                        if (i2 != 0) {
                            this.f17308OooO00o.add(new OooOO0(OooOOO0.this.f17305o0OoOo0, z ? 1 : 0));
                        }
                        this.f17308OooO00o.add(new OooOO0O(oooOO1));
                        int size3 = oooOo00.size();
                        int i3 = 0;
                        boolean z3 = false;
                        while (i3 < size3) {
                            androidx.appcompat.view.menu.OooOO0 oooOO2 = (androidx.appcompat.view.menu.OooOO0) oooOo00.getItem(i3);
                            if (oooOO2.isVisible()) {
                                if (!z3 && oooOO2.getIcon() != null) {
                                    z3 = true;
                                }
                                if (oooOO2.isCheckable()) {
                                    oooOO2.OooOO0O(z);
                                }
                                if (oooOO1.isChecked()) {
                                    OooO0O0(oooOO1);
                                }
                                this.f17308OooO00o.add(new OooOO0O(oooOO2));
                            }
                            i3++;
                            z = false;
                        }
                        if (z3) {
                            int size4 = this.f17308OooO00o.size();
                            for (int size5 = this.f17308OooO00o.size(); size5 < size4; size5++) {
                                ((OooOO0O) this.f17308OooO00o.get(size5)).f17315OooO0O0 = true;
                            }
                        }
                    }
                } else {
                    int i4 = oooOO1.f4731OooO0O0;
                    if (i4 != i) {
                        size2 = this.f17308OooO00o.size();
                        z2 = oooOO1.getIcon() != null;
                        if (i2 != 0) {
                            size2++;
                            ArrayList<OooO> arrayList = this.f17308OooO00o;
                            int i5 = OooOOO0.this.f17305o0OoOo0;
                            arrayList.add(new OooOO0(i5, i5));
                        }
                    } else if (!z2 && oooOO1.getIcon() != null) {
                        int size6 = this.f17308OooO00o.size();
                        for (int i6 = size2; i6 < size6; i6++) {
                            ((OooOO0O) this.f17308OooO00o.get(i6)).f17315OooO0O0 = true;
                        }
                        z2 = true;
                    }
                    OooOO0O oooOO0O = new OooOO0O(oooOO1);
                    oooOO0O.f17315OooO0O0 = z2;
                    this.f17308OooO00o.add(oooOO0O);
                    i = i4;
                }
                i2++;
                z = false;
            }
            this.f17310OooO0OO = false;
        }

        public final void OooO0O0(@NonNull androidx.appcompat.view.menu.OooOO0 oooOO1) {
            if (this.f17309OooO0O0 == oooOO1 || !oooOO1.isCheckable()) {
                return;
            }
            androidx.appcompat.view.menu.OooOO0 oooOO2 = this.f17309OooO0O0;
            if (oooOO2 != null) {
                oooOO2.setChecked(false);
            }
            this.f17309OooO0O0 = oooOO1;
            oooOO1.setChecked(true);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return this.f17308OooO00o.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final long getItemId(int i) {
            return i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemViewType(int i) {
            OooO oooO = this.f17308OooO00o.get(i);
            if (oooO instanceof OooOO0) {
                return 2;
            }
            if (oooO instanceof OooO0o) {
                return 3;
            }
            if (oooO instanceof OooOO0O) {
                return ((OooOO0O) oooO).f17314OooO00o.hasSubMenu() ? 1 : 0;
            }
            throw new RuntimeException("Unknown item type.");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(@NonNull RecyclerView.oo0o0Oo oo0o0oo, int i) {
            OooOo oooOo = (OooOo) oo0o0oo;
            int itemViewType = getItemViewType(i);
            if (itemViewType != 0) {
                if (itemViewType != 1) {
                    if (itemViewType != 2) {
                        return;
                    }
                    OooOO0 oooOO1 = (OooOO0) this.f17308OooO00o.get(i);
                    View view = oooOo.itemView;
                    OooOOO0 oooOOO0 = OooOOO0.this;
                    view.setPadding(oooOOO0.f17296OooooO0, oooOO1.f17312OooO00o, oooOOO0.f17297OooooOO, oooOO1.f17313OooO0O0);
                    return;
                }
                TextView textView = (TextView) oooOo.itemView;
                textView.setText(((OooOO0O) this.f17308OooO00o.get(i)).f17314OooO00o.f4735OooO0o0);
                int i2 = OooOOO0.this.f17287OoooO0O;
                if (i2 != 0) {
                    TextViewCompat.OooO0o(textView, i2);
                }
                int i3 = OooOOO0.this.f17298OooooOo;
                int paddingTop = textView.getPaddingTop();
                Objects.requireNonNull(OooOOO0.this);
                textView.setPadding(i3, paddingTop, 0, textView.getPaddingBottom());
                ColorStateList colorStateList = OooOOO0.this.f17284OoooO;
                if (colorStateList != null) {
                    textView.setTextColor(colorStateList);
                    return;
                }
                return;
            }
            NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) oooOo.itemView;
            navigationMenuItemView.setIconTintList(OooOOO0.this.f17289OoooOOO);
            int i4 = OooOOO0.this.f17288OoooOO0;
            if (i4 != 0) {
                navigationMenuItemView.setTextAppearance(i4);
            }
            ColorStateList colorStateList2 = OooOOO0.this.f17303o000oOoO;
            if (colorStateList2 != null) {
                navigationMenuItemView.setTextColor(colorStateList2);
            }
            Drawable drawable = OooOOO0.this.f17290OoooOOo;
            Drawable drawableNewDrawable = drawable != null ? drawable.getConstantState().newDrawable() : null;
            WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
            ViewCompat.OooO0o.OooOOo0(navigationMenuItemView, drawableNewDrawable);
            RippleDrawable rippleDrawable = OooOOO0.this.f17291OoooOo0;
            if (rippleDrawable != null) {
                navigationMenuItemView.setForeground(rippleDrawable.getConstantState().newDrawable());
            }
            OooOO0O oooOO0O = (OooOO0O) this.f17308OooO00o.get(i);
            navigationMenuItemView.setNeedsEmptyIcon(oooOO0O.f17315OooO0O0);
            OooOOO0 oooOOO1 = OooOOO0.this;
            int i5 = oooOOO1.f17292OoooOoO;
            int i6 = oooOOO1.f17293OoooOoo;
            navigationMenuItemView.setPadding(i5, i6, i5, i6);
            navigationMenuItemView.setIconPadding(OooOOO0.this.f17294Ooooo00);
            OooOOO0 oooOOO2 = OooOOO0.this;
            if (oooOOO2.f17300Oooooo0) {
                navigationMenuItemView.setIconSize(oooOOO2.f17295Ooooo0o);
            }
            navigationMenuItemView.setMaxLines(OooOOO0.this.f17301OoooooO);
            navigationMenuItemView.OooO0Oo(oooOO0O.f17314OooO00o);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @Nullable
        public final RecyclerView.oo0o0Oo onCreateViewHolder(ViewGroup viewGroup, int i) {
            RecyclerView.oo0o0Oo oooOOO;
            if (i == 0) {
                OooOOO0 oooOOO0 = OooOOO0.this;
                oooOOO = new OooOOO(oooOOO0.f17285OoooO0, viewGroup, oooOOO0.f17304o00O0O);
            } else if (i == 1) {
                oooOOO = new OooOo00(OooOOO0.this.f17285OoooO0, viewGroup);
            } else {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return new OooO0O0(OooOOO0.this.f17282Oooo0oO);
                }
                oooOOO = new OooOOOO(OooOOO0.this.f17285OoooO0, viewGroup);
            }
            return oooOOO;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onViewRecycled(RecyclerView.oo0o0Oo oo0o0oo) {
            OooOo oooOo = (OooOo) oo0o0oo;
            if (oooOo instanceof OooOOO) {
                NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) oooOo.itemView;
                FrameLayout frameLayout = navigationMenuItemView.f17199ooOO;
                if (frameLayout != null) {
                    frameLayout.removeAllViews();
                }
                navigationMenuItemView.f17198o0OoOo0.setCompoundDrawables(null, null, null, null);
            }
        }
    }

    public static class OooO0o implements OooO {
    }

    public static class OooOO0 implements OooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f17312OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f17313OooO0O0;

        public OooOO0(int i, int i2) {
            this.f17312OooO00o = i;
            this.f17313OooO0O0 = i2;
        }
    }

    public static class OooOO0O implements OooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final androidx.appcompat.view.menu.OooOO0 f17314OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public boolean f17315OooO0O0;

        public OooOO0O(androidx.appcompat.view.menu.OooOO0 oooOO1) {
            this.f17314OooO00o = oooOO1;
        }
    }

    public static class OooOOO extends OooOo {
        public OooOOO(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, View.OnClickListener onClickListener) {
            super(layoutInflater.inflate(p337o0OO0o0.OooOOOO.design_navigation_item, viewGroup, false));
            this.itemView.setOnClickListener(onClickListener);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.internal.OooOOO0$OooOOO0, reason: collision with other inner class name */
    public class C0109OooOOO0 extends o000000 {
        public C0109OooOOO0(RecyclerView recyclerView) {
            super(recyclerView);
        }

        @Override // androidx.recyclerview.widget.o000000, androidx.core.view.OooO00o
        public final void OooO0Oo(View view, @NonNull o0000OO0 o0000oo1) {
            super.OooO0Oo(view, o0000oo1);
            OooO0OO oooO0OO = OooOOO0.this.f17286OoooO00;
            int i = OooOOO0.this.f17282Oooo0oO.getChildCount() == 0 ? 0 : 1;
            for (int i2 = 0; i2 < OooOOO0.this.f17286OoooO00.getItemCount(); i2++) {
                if (OooOOO0.this.f17286OoooO00.getItemViewType(i2) == 0) {
                    i++;
                }
            }
            o0000oo1.f28194OooO00o.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(i, 0, false));
        }
    }

    public static class OooOOOO extends OooOo {
        public OooOOOO(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(p337o0OO0o0.OooOOOO.design_navigation_item_separator, viewGroup, false));
        }
    }

    public static abstract class OooOo extends RecyclerView.oo0o0Oo {
        public OooOo(View view) {
            super(view);
        }
    }

    public static class OooOo00 extends OooOo {
        public OooOo00(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(p337o0OO0o0.OooOOOO.design_navigation_item_subheader, viewGroup, false));
        }
    }

    @Override // androidx.appcompat.view.menu.OooOOO0
    public final void OooO(Parcelable parcelable) {
        androidx.appcompat.view.menu.OooOO0 oooOO1;
        View actionView;
        ParcelableSparseArray parcelableSparseArray;
        androidx.appcompat.view.menu.OooOO0 oooOO2;
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.f17281Oooo0o.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle("android:menu:adapter");
            if (bundle2 != null) {
                OooO0OO oooO0OO = this.f17286OoooO00;
                Objects.requireNonNull(oooO0OO);
                int i = bundle2.getInt("android:menu:checked", 0);
                if (i != 0) {
                    oooO0OO.f17310OooO0OO = true;
                    int size = oooO0OO.f17308OooO00o.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        OooO oooO = oooO0OO.f17308OooO00o.get(i2);
                        if ((oooO instanceof OooOO0O) && (oooOO2 = ((OooOO0O) oooO).f17314OooO00o) != null && oooOO2.f4730OooO00o == i) {
                            oooO0OO.OooO0O0(oooOO2);
                            break;
                        }
                    }
                    oooO0OO.f17310OooO0OO = false;
                    oooO0OO.OooO00o();
                }
                SparseArray sparseParcelableArray2 = bundle2.getSparseParcelableArray("android:menu:action_views");
                if (sparseParcelableArray2 != null) {
                    int size2 = oooO0OO.f17308OooO00o.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        OooO oooO2 = oooO0OO.f17308OooO00o.get(i3);
                        if ((oooO2 instanceof OooOO0O) && (oooOO1 = ((OooOO0O) oooO2).f17314OooO00o) != null && (actionView = oooOO1.getActionView()) != null && (parcelableSparseArray = (ParcelableSparseArray) sparseParcelableArray2.get(oooOO1.f4730OooO00o)) != null) {
                            actionView.restoreHierarchyState(parcelableSparseArray);
                        }
                    }
                }
            }
            SparseArray<Parcelable> sparseParcelableArray3 = bundle.getSparseParcelableArray("android:menu:header");
            if (sparseParcelableArray3 != null) {
                this.f17282Oooo0oO.restoreHierarchyState(sparseParcelableArray3);
            }
        }
    }

    public final void OooO00o(int i) {
        this.f17294Ooooo00 = i;
        OooO0Oo(false);
    }

    public final void OooO0O0(boolean z) {
        OooO0OO oooO0OO = this.f17286OoooO00;
        if (oooO0OO != null) {
            oooO0OO.f17310OooO0OO = z;
        }
    }

    @Override // androidx.appcompat.view.menu.OooOOO0
    public final void OooO0OO(androidx.appcompat.view.menu.OooO0o oooO0o, boolean z) {
    }

    @Override // androidx.appcompat.view.menu.OooOOO0
    public final void OooO0Oo(boolean z) {
        OooO0OO oooO0OO = this.f17286OoooO00;
        if (oooO0OO != null) {
            oooO0OO.OooO00o();
            oooO0OO.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.OooOOO0
    public final boolean OooO0o0() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.OooOOO0
    public final boolean OooO0oO(androidx.appcompat.view.menu.OooOO0 oooOO1) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.OooOOO0
    public final void OooO0oo(@NonNull Context context, @NonNull androidx.appcompat.view.menu.OooO0o oooO0o) {
        this.f17285OoooO0 = LayoutInflater.from(context);
        this.f17283Oooo0oo = oooO0o;
        this.f17305o0OoOo0 = context.getResources().getDimensionPixelOffset(p337o0OO0o0.OooOO0.design_navigation_separator_vertical_padding);
    }

    public final void OooOO0() {
        int i = (this.f17282Oooo0oO.getChildCount() == 0 && this.f17299Oooooo) ? this.f17302Ooooooo : 0;
        NavigationMenuView navigationMenuView = this.f17281Oooo0o;
        navigationMenuView.setPadding(0, i, 0, navigationMenuView.getPaddingBottom());
    }

    @Override // androidx.appcompat.view.menu.OooOOO0
    public final boolean OooOO0O(androidx.appcompat.view.menu.OooOo00 oooOo00) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.OooOOO0
    @NonNull
    public final Parcelable OooOO0o() {
        Bundle bundle = new Bundle();
        if (this.f17281Oooo0o != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.f17281Oooo0o.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        OooO0OO oooO0OO = this.f17286OoooO00;
        if (oooO0OO != null) {
            Objects.requireNonNull(oooO0OO);
            Bundle bundle2 = new Bundle();
            androidx.appcompat.view.menu.OooOO0 oooOO1 = oooO0OO.f17309OooO0O0;
            if (oooOO1 != null) {
                bundle2.putInt("android:menu:checked", oooOO1.f4730OooO00o);
            }
            SparseArray<? extends Parcelable> sparseArray2 = new SparseArray<>();
            int size = oooO0OO.f17308OooO00o.size();
            for (int i = 0; i < size; i++) {
                OooO oooO = oooO0OO.f17308OooO00o.get(i);
                if (oooO instanceof OooOO0O) {
                    androidx.appcompat.view.menu.OooOO0 oooOO2 = ((OooOO0O) oooO).f17314OooO00o;
                    View actionView = oooOO2 != null ? oooOO2.getActionView() : null;
                    if (actionView != null) {
                        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
                        actionView.saveHierarchyState(parcelableSparseArray);
                        sparseArray2.put(oooOO2.f4730OooO00o, parcelableSparseArray);
                    }
                }
            }
            bundle2.putSparseParcelableArray("android:menu:action_views", sparseArray2);
            bundle.putBundle("android:menu:adapter", bundle2);
        }
        if (this.f17282Oooo0oO != null) {
            SparseArray<Parcelable> sparseArray3 = new SparseArray<>();
            this.f17282Oooo0oO.saveHierarchyState(sparseArray3);
            bundle.putSparseParcelableArray("android:menu:header", sparseArray3);
        }
        return bundle;
    }

    @Override // androidx.appcompat.view.menu.OooOOO0
    public final boolean OooOOO0(androidx.appcompat.view.menu.OooOO0 oooOO1) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.OooOOO0
    public final int getId() {
        return this.f17280Oooo;
    }
}
