package com.google.android.material.search;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.appcompat.graphics.drawable.DrawerArrowDrawable;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.o000000O;
import androidx.core.view.o000OOo0;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.TouchObserverFrameLayout;
import com.google.android.material.internal.o00oO0o;
import com.google.android.material.internal.o0ooOOo;
import com.google.android.material.internal.oo0o0Oo;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import p272o0O0000o.o00000;
import p272o0O0000o.o00000O;
import p272o0O0000o.o00000OO;
import p272o0O0000o.o0000O00;
import p272o0O0000o.o0000O0O;
import p272o0O0000o.o0000Ooo;
import p272o0O0000o.o000OO;

/* JADX INFO: loaded from: classes3.dex */
public class SearchView extends FrameLayout implements CoordinatorLayout.OooO0O0 {

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public static final int f17052OooOooO = o0000O0O.Widget_Material3_SearchView;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final FrameLayout f17053OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final View f17054OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final View f17055OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final ClippableRoundedCornerLayout f17056OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final View f17057OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final FrameLayout f17058OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final MaterialToolbar f17059OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final Toolbar f17060OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final TextView f17061OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final ImageButton f17062OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final EditText f17063OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final View f17064OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final TouchObserverFrameLayout f17065OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final oo000o f17066OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final boolean f17067OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final p422o0OoO00O.o00O0O f17068OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public boolean f17069OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @Nullable
    public SearchBar f17070OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final LinkedHashSet f17071OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public int f17072OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public boolean f17073OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public boolean f17074OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public boolean f17075OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public boolean f17076OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public HashMap f17077OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    @NonNull
    public TransitionState f17078OooOoo0;

    public static class Behavior extends CoordinatorLayout.Behavior<SearchView> {
        public Behavior() {
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean OooO0Oo(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2) {
            SearchView searchView = (SearchView) view;
            if (!(searchView.f17070OooOo0 != null) && (view2 instanceof SearchBar)) {
                searchView.setupWithSearchBar((SearchBar) view2);
            }
            return false;
        }

        public Behavior(@NonNull Context context, @Nullable AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public interface OooO00o {
        void OooO00o();
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new OooO00o();

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public String f17079OooO0o;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f17080OooO0oO;

        public class OooO00o implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }
        }

        public SavedState(Parcel parcel, @Nullable ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f17079OooO0o = parcel.readString();
            this.f17080OooO0oO = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f5545OooO0Oo, i);
            parcel.writeString(this.f17079OooO0o);
            parcel.writeInt(this.f17080OooO0oO);
        }
    }

    public enum TransitionState {
        HIDING,
        HIDDEN,
        SHOWING,
        SHOWN
    }

    public SearchView(@NonNull Context context) {
        this(context, null);
    }

    public static /* synthetic */ void OooO00o(SearchView searchView, WindowInsetsCompat windowInsetsCompat) {
        searchView.getClass();
        int iOooO0o = windowInsetsCompat.OooO0o();
        searchView.setUpStatusBarSpacer(iOooO0o);
        if (searchView.f17076OooOoOO) {
            return;
        }
        searchView.setStatusBarSpacerEnabledInternal(iOooO0o > 0);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001b  */
    /* JADX WARN: Code duplicated, block: B:16:? A[RETURN, SYNTHETIC] */
    @Nullable
    private Window getActivityWindow() {
        Activity activity;
        for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                activity = (Activity) context;
                if (activity == null) {
                    return null;
                }
                return activity.getWindow();
            }
        }
        activity = null;
        if (activity == null) {
            return null;
        }
        return activity.getWindow();
    }

    private float getOverlayElevation() {
        SearchBar searchBar = this.f17070OooOo0;
        return searchBar != null ? searchBar.getCompatElevation() : getResources().getDimension(o00000O.m3_searchview_elevation);
    }

    @Px
    private int getStatusBarHeight() {
        int identifier = getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    private void setStatusBarSpacerEnabledInternal(boolean z) {
        this.f17057OooO0oO.setVisibility(z ? 0 : 8);
    }

    private void setUpBackgroundViewElevationOverlay(float f) {
        View view;
        p422o0OoO00O.o00O0O o00o0o2 = this.f17068OooOOoo;
        if (o00o0o2 == null || (view = this.f17055OooO0o) == null) {
            return;
        }
        view.setBackgroundColor(o00o0o2.OooO00o(f, o00o0o2.f46617OooO0Oo));
    }

    private void setUpHeaderLayout(int i) {
        if (i != -1) {
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
            FrameLayout frameLayout = this.f17058OooO0oo;
            frameLayout.addView(layoutInflaterFrom.inflate(i, (ViewGroup) frameLayout, false));
            frameLayout.setVisibility(0);
        }
    }

    private void setUpStatusBarSpacer(@Px int i) {
        View view = this.f17057OooO0oO;
        if (view.getLayoutParams().height != i) {
            view.getLayoutParams().height = i;
            view.requestLayout();
        }
    }

    public final void OooO0O0() {
        this.f17063OooOOO0.post(new androidx.lifecycle.OooOOOO(this, 1));
    }

    public final boolean OooO0OO() {
        return this.f17072OooOo0O == 48;
    }

    public final void OooO0Oo() {
        if (this.f17075OooOoO0) {
            this.f17063OooOOO0.postDelayed(new androidx.media3.ui.OooO0O0(1, this), 100L);
        }
    }

    public final void OooO0o() {
        ImageButton imageButtonOooO0O0 = o0ooOOo.OooO0O0(this.f17059OooOO0);
        if (imageButtonOooO0O0 == null) {
            return;
        }
        int i = this.f17056OooO0o0.getVisibility() == 0 ? 1 : 0;
        Drawable drawableOooO0Oo = p053o00000oo.o00Ooo.OooO0Oo(imageButtonOooO0O0.getDrawable());
        if (drawableOooO0Oo instanceof DrawerArrowDrawable) {
            DrawerArrowDrawable drawerArrowDrawable = (DrawerArrowDrawable) drawableOooO0Oo;
            float f = i;
            if (drawerArrowDrawable.f2493OooO != f) {
                drawerArrowDrawable.f2493OooO = f;
                drawerArrowDrawable.invalidateSelf();
            }
        }
        if (drawableOooO0Oo instanceof com.google.android.material.internal.OooO) {
            ((com.google.android.material.internal.OooO) drawableOooO0Oo).OooO00o(i);
        }
    }

    @SuppressLint({"InlinedApi"})
    public final void OooO0o0(ViewGroup viewGroup, boolean z) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt != this) {
                if (childAt.findViewById(this.f17056OooO0o0.getId()) != null) {
                    OooO0o0((ViewGroup) childAt, z);
                } else if (z) {
                    this.f17077OooOoo.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
                    ViewCompat.OooO0o.OooOOoo(childAt, 4);
                } else {
                    HashMap map = this.f17077OooOoo;
                    if (map != null && map.containsKey(childAt)) {
                        int iIntValue = ((Integer) this.f17077OooOoo.get(childAt)).intValue();
                        WeakHashMap<View, o000OOo0> weakHashMap2 = ViewCompat.f5341OooO00o;
                        ViewCompat.OooO0o.OooOOoo(childAt, iIntValue);
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.f17067OooOOo0) {
            this.f17065OooOOOo.addView(view, i, layoutParams);
        } else {
            super.addView(view, i, layoutParams);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.OooO0O0
    @NonNull
    public CoordinatorLayout.Behavior<SearchView> getBehavior() {
        return new Behavior();
    }

    @NonNull
    public TransitionState getCurrentTransitionState() {
        return this.f17078OooOoo0;
    }

    @NonNull
    public EditText getEditText() {
        return this.f17063OooOOO0;
    }

    @Nullable
    public CharSequence getHint() {
        return this.f17063OooOOO0.getHint();
    }

    @NonNull
    public TextView getSearchPrefix() {
        return this.f17061OooOO0o;
    }

    @Nullable
    public CharSequence getSearchPrefixText() {
        return this.f17061OooOO0o.getText();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public int getSoftInputMode() {
        return this.f17072OooOo0O;
    }

    @Nullable
    @SuppressLint({"KotlinPropertyAccess"})
    public Editable getText() {
        return this.f17063OooOOO0.getText();
    }

    @NonNull
    public Toolbar getToolbar() {
        return this.f17059OooOO0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        p280o0O00o0O.OooOo00.OooO0OO(this);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        Window activityWindow = getActivityWindow();
        if (activityWindow != null) {
            this.f17072OooOo0O = activityWindow.getAttributes().softInputMode;
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f5545OooO0Oo);
        setText(savedState.f17079OooO0o);
        setVisible(savedState.f17080OooO0oO == 0);
    }

    @Override // android.view.View
    @NonNull
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Editable text = getText();
        savedState.f17079OooO0o = text == null ? null : text.toString();
        savedState.f17080OooO0oO = this.f17056OooO0o0.getVisibility();
        return savedState;
    }

    public void setAnimatedNavigationIcon(boolean z) {
        this.f17073OooOo0o = z;
    }

    public void setAutoShowKeyboard(boolean z) {
        this.f17075OooOoO0 = z;
    }

    @Override // android.view.View
    @RequiresApi(21)
    public void setElevation(float f) {
        super.setElevation(f);
        setUpBackgroundViewElevationOverlay(f);
    }

    public void setHint(@Nullable CharSequence charSequence) {
        this.f17063OooOOO0.setHint(charSequence);
    }

    public void setMenuItemsAnimated(boolean z) {
        this.f17069OooOo = z;
    }

    public void setModalForAccessibility(boolean z) {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        if (z) {
            this.f17077OooOoo = new HashMap(viewGroup.getChildCount());
        }
        OooO0o0(viewGroup, z);
        if (z) {
            return;
        }
        this.f17077OooOoo = null;
    }

    public void setOnMenuItemClickListener(@Nullable Toolbar.OooOO0O oooOO0O) {
        this.f17059OooOO0.setOnMenuItemClickListener(oooOO0O);
    }

    public void setSearchPrefixText(@Nullable CharSequence charSequence) {
        TextView textView = this.f17061OooOO0o;
        textView.setText(charSequence);
        textView.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setStatusBarSpacerEnabled(boolean z) {
        this.f17076OooOoOO = true;
        setStatusBarSpacerEnabledInternal(z);
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public void setText(@Nullable CharSequence charSequence) {
        this.f17063OooOOO0.setText(charSequence);
    }

    public void setToolbarTouchscreenBlocksFocus(boolean z) {
        this.f17059OooOO0.setTouchscreenBlocksFocus(z);
    }

    public void setTransitionState(@NonNull TransitionState transitionState) {
        if (this.f17078OooOoo0.equals(transitionState)) {
            return;
        }
        this.f17078OooOoo0 = transitionState;
        Iterator it = new LinkedHashSet(this.f17071OooOo00).iterator();
        while (it.hasNext()) {
            ((OooO00o) it.next()).OooO00o();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setUseWindowInsetsController(boolean z) {
        this.f17074OooOoO = z;
    }

    public void setVisible(boolean z) {
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = this.f17056OooO0o0;
        boolean z2 = clippableRoundedCornerLayout.getVisibility() == 0;
        clippableRoundedCornerLayout.setVisibility(z ? 0 : 8);
        OooO0o();
        if (z2 != z) {
            setModalForAccessibility(z);
        }
        setTransitionState(z ? TransitionState.SHOWN : TransitionState.HIDDEN);
    }

    public void setupWithSearchBar(@Nullable SearchBar searchBar) {
        this.f17070OooOo0 = searchBar;
        this.f17066OooOOo.f17100OooOOO0 = searchBar;
        if (searchBar != null) {
            searchBar.setOnClickListener(new OooOOO(this, 0));
        }
        MaterialToolbar materialToolbar = this.f17059OooOO0;
        if (materialToolbar != null && !(p053o00000oo.o00Ooo.OooO0Oo(materialToolbar.getNavigationIcon()) instanceof DrawerArrowDrawable)) {
            int i = o00000OO.ic_arrow_back_black_24;
            if (this.f17070OooOo0 == null) {
                materialToolbar.setNavigationIcon(i);
            } else {
                Drawable drawableMutate = p013OooOo0o.o00Oo0.OooO00o(getContext(), i).mutate();
                if (materialToolbar.getNavigationIconTint() != null) {
                    o00000oo.o00Ooo.OooO0O0.OooO0oO(drawableMutate, materialToolbar.getNavigationIconTint().intValue());
                }
                materialToolbar.setNavigationIcon(new com.google.android.material.internal.OooO(this.f17070OooOo0.getNavigationIcon(), drawableMutate));
                OooO0o();
            }
        }
        setUpBackgroundViewElevationOverlay(getOverlayElevation());
    }

    public SearchView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, o00000.materialSearchViewStyle);
    }

    public void setHint(@StringRes int i) {
        this.f17063OooOOO0.setHint(i);
    }

    public void setText(@StringRes int i) {
        this.f17063OooOOO0.setText(i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SearchView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        int i2 = f17052OooOooO;
        super(o0O0O0O.OooO00o.OooO00o(context, attributeSet, i, i2), attributeSet, i);
        this.f17071OooOo00 = new LinkedHashSet();
        this.f17072OooOo0O = 16;
        this.f17078OooOoo0 = TransitionState.HIDDEN;
        Context context2 = getContext();
        TypedArray typedArrayOooO0Oo = o00oO0o.OooO0Oo(context2, attributeSet, o000OO.SearchView, i, i2, new int[0]);
        int resourceId = typedArrayOooO0Oo.getResourceId(o000OO.SearchView_headerLayout, -1);
        int resourceId2 = typedArrayOooO0Oo.getResourceId(o000OO.SearchView_android_textAppearance, -1);
        String string = typedArrayOooO0Oo.getString(o000OO.SearchView_android_text);
        String string2 = typedArrayOooO0Oo.getString(o000OO.SearchView_android_hint);
        String string3 = typedArrayOooO0Oo.getString(o000OO.SearchView_searchPrefixText);
        boolean z = typedArrayOooO0Oo.getBoolean(o000OO.SearchView_useDrawerArrowDrawable, false);
        this.f17073OooOo0o = typedArrayOooO0Oo.getBoolean(o000OO.SearchView_animateNavigationIcon, true);
        this.f17069OooOo = typedArrayOooO0Oo.getBoolean(o000OO.SearchView_animateMenuItems, true);
        boolean z2 = typedArrayOooO0Oo.getBoolean(o000OO.SearchView_hideNavigationIcon, false);
        this.f17075OooOoO0 = typedArrayOooO0Oo.getBoolean(o000OO.SearchView_autoShowKeyboard, true);
        typedArrayOooO0Oo.recycle();
        LayoutInflater.from(context2).inflate(o0000O00.mtrl_search_view, this);
        this.f17067OooOOo0 = true;
        this.f17054OooO0Oo = findViewById(o0000Ooo.search_view_scrim);
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = (ClippableRoundedCornerLayout) findViewById(o0000Ooo.search_view_root);
        this.f17056OooO0o0 = clippableRoundedCornerLayout;
        this.f17055OooO0o = findViewById(o0000Ooo.search_view_background);
        View viewFindViewById = findViewById(o0000Ooo.search_view_status_bar_spacer);
        this.f17057OooO0oO = viewFindViewById;
        this.f17058OooO0oo = (FrameLayout) findViewById(o0000Ooo.search_view_header_container);
        this.f17053OooO = (FrameLayout) findViewById(o0000Ooo.search_view_toolbar_container);
        MaterialToolbar materialToolbar = (MaterialToolbar) findViewById(o0000Ooo.search_view_toolbar);
        this.f17059OooOO0 = materialToolbar;
        this.f17060OooOO0O = (Toolbar) findViewById(o0000Ooo.search_view_dummy_toolbar);
        this.f17061OooOO0o = (TextView) findViewById(o0000Ooo.search_view_search_prefix);
        EditText editText = (EditText) findViewById(o0000Ooo.search_view_edit_text);
        this.f17063OooOOO0 = editText;
        ImageButton imageButton = (ImageButton) findViewById(o0000Ooo.search_view_clear_button);
        this.f17062OooOOO = imageButton;
        View viewFindViewById2 = findViewById(o0000Ooo.search_view_divider);
        this.f17064OooOOOO = viewFindViewById2;
        TouchObserverFrameLayout touchObserverFrameLayout = (TouchObserverFrameLayout) findViewById(o0000Ooo.search_view_content_container);
        this.f17065OooOOOo = touchObserverFrameLayout;
        this.f17066OooOOo = new oo000o(this);
        this.f17068OooOOoo = new p422o0OoO00O.o00O0O(context2);
        clippableRoundedCornerLayout.setOnTouchListener(new com.facebook.internal.o00Ooo(1));
        setUpBackgroundViewElevationOverlay(getOverlayElevation());
        setUpHeaderLayout(resourceId);
        setSearchPrefixText(string3);
        if (resourceId2 != -1) {
            editText.setTextAppearance(resourceId2);
        }
        editText.setText(string);
        editText.setHint(string2);
        if (z2) {
            materialToolbar.setNavigationIcon((Drawable) null);
        } else {
            materialToolbar.setNavigationOnClickListener(new OooOO0(this, 0));
            if (z) {
                DrawerArrowDrawable drawerArrowDrawable = new DrawerArrowDrawable(getContext());
                int iOooO0OO = p274o0O000oo.OooOOO0.OooO0OO(o00000.colorOnSurface, this);
                Paint paint = drawerArrowDrawable.f2494OooO00o;
                if (iOooO0OO != paint.getColor()) {
                    paint.setColor(iOooO0OO);
                    drawerArrowDrawable.invalidateSelf();
                }
                materialToolbar.setNavigationIcon(drawerArrowDrawable);
            }
        }
        imageButton.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.search.OooOOOO
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchView searchView = this.f17029OooO0Oo;
                searchView.f17063OooOOO0.setText("");
                searchView.OooO0Oo();
            }
        });
        editText.addTextChangedListener(new OooOo(this));
        touchObserverFrameLayout.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.material.search.OooO
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                int i3 = SearchView.f17052OooOooO;
                SearchView searchView = this.f17018OooO0Oo;
                if (!searchView.OooO0OO()) {
                    return false;
                }
                searchView.OooO0O0();
                return false;
            }
        });
        oo0o0Oo.OooO00o(materialToolbar, new oo0o0Oo.OooO0O0() { // from class: com.google.android.material.search.OooOo00
            @Override // com.google.android.material.internal.oo0o0Oo.OooO0O0
            public final WindowInsetsCompat OooO00o(View view, WindowInsetsCompat windowInsetsCompat, oo0o0Oo.OooO0OO oooO0OO) {
                MaterialToolbar materialToolbar2 = this.f17031OooO00o.f17059OooOO0;
                boolean zOooO0o = oo0o0Oo.OooO0o(materialToolbar2);
                materialToolbar2.setPadding(windowInsetsCompat.OooO0Oo() + (zOooO0o ? oooO0OO.f16865OooO0OO : oooO0OO.f16863OooO00o), oooO0OO.f16864OooO0O0, windowInsetsCompat.OooO0o0() + (zOooO0o ? oooO0OO.f16863OooO00o : oooO0OO.f16865OooO0OO), oooO0OO.f16866OooO0Oo);
                return windowInsetsCompat;
            }
        });
        final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewFindViewById2.getLayoutParams();
        final int i3 = marginLayoutParams.leftMargin;
        final int i4 = marginLayoutParams.rightMargin;
        o000000O o000000o2 = new o000000O() { // from class: com.google.android.material.search.OooOO0O
            @Override // androidx.core.view.o000000O
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                int i5 = SearchView.f17052OooOooO;
                int iOooO0Oo = windowInsetsCompat.OooO0Oo() + i3;
                ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
                marginLayoutParams2.leftMargin = iOooO0Oo;
                marginLayoutParams2.rightMargin = windowInsetsCompat.OooO0o0() + i4;
                return windowInsetsCompat;
            }
        };
        WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
        ViewCompat.OooOOO.OooOo0(viewFindViewById2, o000000o2);
        setUpStatusBarSpacer(getStatusBarHeight());
        ViewCompat.OooOOO.OooOo0(viewFindViewById, new o000000O() { // from class: com.google.android.material.search.OooOOO0
            @Override // androidx.core.view.o000000O
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                SearchView.OooO00o(this.f17028OooO0Oo, windowInsetsCompat);
                return windowInsetsCompat;
            }
        });
    }
}
