package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import org.jctools.util.Pow2;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class ActivityChooserView extends ViewGroup {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final FrameLayout f2790OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooOO0 f2791OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final View f2792OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooOO0O f2793OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final FrameLayout f2794OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final ImageView f2795OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public androidx.core.view.OooO0O0 f2796OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final OooO0O0 f2797OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public ListPopupWindow f2798OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public boolean f2799OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public PopupWindow.OnDismissListener f2800OooOOO0;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static class InnerLayout extends LinearLayout {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final int[] f2801OooO0Oo = {R.attr.background};

        public InnerLayout(Context context, AttributeSet attributeSet) {
            int resourceId;
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f2801OooO0Oo);
            setBackgroundDrawable((!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(0) : p013OooOo0o.o00Oo0.OooO00o(context, resourceId));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public class OooO extends DataSetObserver {
        public OooO() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            super.onChanged();
            ActivityChooserView.this.f2791OooO0Oo.getClass();
            throw null;
        }
    }

    public class OooO00o extends DataSetObserver {
        public OooO00o() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            super.onChanged();
            ActivityChooserView.this.f2791OooO0Oo.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            super.onInvalidated();
            ActivityChooserView.this.f2791OooO0Oo.notifyDataSetInvalidated();
        }
    }

    public class OooO0O0 implements ViewTreeObserver.OnGlobalLayoutListener {
        public OooO0O0() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            androidx.core.view.OooO0O0.OooO00o oooO00o;
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (activityChooserView.OooO0O0()) {
                if (!activityChooserView.isShown()) {
                    activityChooserView.getListPopupWindow().dismiss();
                    return;
                }
                activityChooserView.getListPopupWindow().show();
                androidx.core.view.OooO0O0 oooO0O0 = activityChooserView.f2796OooOO0;
                if (oooO0O0 == null || (oooO00o = oooO0O0.f5336OooO00o) == null) {
                    return;
                }
                ((ActionMenuPresenter) oooO00o).OooOOO(true);
            }
        }
    }

    public class OooO0OO extends View.AccessibilityDelegate {
        @Override // android.view.View.AccessibilityDelegate
        public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            accessibilityNodeInfo.setCanOpenPopup(true);
        }
    }

    public class OooO0o extends o00000O0 {
        public OooO0o(FrameLayout frameLayout) {
            super(frameLayout);
        }

        @Override // androidx.appcompat.widget.o00000O0
        public final p018OooOoo0.Oooo000 OooO0O0() {
            return ActivityChooserView.this.getListPopupWindow();
        }

        @Override // androidx.appcompat.widget.o00000O0
        public final boolean OooO0OO() {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (activityChooserView.OooO0O0() || !activityChooserView.f2799OooOOO) {
                return true;
            }
            activityChooserView.f2791OooO0Oo.getClass();
            throw new IllegalStateException("No data model. Did you call #setDataModel?");
        }

        @Override // androidx.appcompat.widget.o00000O0
        public final boolean OooO0Oo() {
            ActivityChooserView.this.OooO00o();
            return true;
        }
    }

    public class OooOO0 extends BaseAdapter {
        public OooOO0() {
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            throw null;
        }

        @Override // android.widget.Adapter
        public final Object getItem(int i) {
            throw null;
        }

        @Override // android.widget.Adapter
        public final long getItemId(int i) {
            return i;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public final int getItemViewType(int i) {
            return 0;
        }

        @Override // android.widget.Adapter
        public final View getView(int i, View view, ViewGroup viewGroup) {
            getItemViewType(i);
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (view == null || view.getId() != p012OooOo0O.Oooo000.list_item) {
                view = LayoutInflater.from(activityChooserView.getContext()).inflate(p012OooOo0O.Oooo0.abc_activity_chooser_view_list_item, viewGroup, false);
            }
            activityChooserView.getContext().getPackageManager();
            getItem(i);
            throw null;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public final int getViewTypeCount() {
            return 3;
        }
    }

    public class OooOO0O implements AdapterView.OnItemClickListener, View.OnClickListener, View.OnLongClickListener, PopupWindow.OnDismissListener {
        public OooOO0O() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            FrameLayout frameLayout = activityChooserView.f2790OooO;
            OooOO0 oooOO1 = activityChooserView.f2791OooO0Oo;
            if (view == frameLayout) {
                activityChooserView.OooO00o();
                oooOO1.getClass();
                throw null;
            }
            if (view != activityChooserView.f2794OooO0oO) {
                throw new IllegalArgumentException();
            }
            oooOO1.getClass();
            throw new IllegalStateException("No data model. Did you call #setDataModel?");
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public final void onDismiss() {
            androidx.core.view.OooO0O0.OooO00o oooO00o;
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            PopupWindow.OnDismissListener onDismissListener = activityChooserView.f2800OooOOO0;
            if (onDismissListener != null) {
                onDismissListener.onDismiss();
            }
            androidx.core.view.OooO0O0 oooO0O0 = activityChooserView.f2796OooOO0;
            if (oooO0O0 == null || (oooO00o = oooO0O0.f5336OooO00o) == null) {
                return;
            }
            ((ActionMenuPresenter) oooO00o).OooOOO(false);
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            ((OooOO0) adapterView.getAdapter()).getClass();
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            activityChooserView.OooO00o();
            activityChooserView.f2791OooO0Oo.getClass();
            throw null;
        }

        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (view != activityChooserView.f2790OooO) {
                throw new IllegalArgumentException();
            }
            activityChooserView.f2791OooO0Oo.getClass();
            throw null;
        }
    }

    public ActivityChooserView(@NonNull Context context) {
        this(context, null);
    }

    public final void OooO00o() {
        if (OooO0O0()) {
            getListPopupWindow().dismiss();
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeGlobalOnLayoutListener(this.f2797OooOO0O);
            }
        }
    }

    public final boolean OooO0O0() {
        return getListPopupWindow().OooO00o();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public androidx.appcompat.widget.OooO0o getDataModel() {
        this.f2791OooO0Oo.getClass();
        return null;
    }

    public ListPopupWindow getListPopupWindow() {
        if (this.f2798OooOO0o == null) {
            ListPopupWindow listPopupWindow = new ListPopupWindow(getContext());
            this.f2798OooOO0o = listPopupWindow;
            listPopupWindow.OooOO0o(this.f2791OooO0Oo);
            ListPopupWindow listPopupWindow2 = this.f2798OooOO0o;
            listPopupWindow2.f2923OooOOo = this;
            listPopupWindow2.f2935OooOoo0 = true;
            listPopupWindow2.f2934OooOoo.setFocusable(true);
            ListPopupWindow listPopupWindow3 = this.f2798OooOO0o;
            OooOO0O oooOO0O = this.f2793OooO0o0;
            listPopupWindow3.f2925OooOOoo = oooOO0O;
            listPopupWindow3.f2934OooOoo.setOnDismissListener(oooOO0O);
        }
        return this.f2798OooOO0o;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f2791OooO0Oo.getClass();
        this.f2799OooOOO = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f2791OooO0Oo.getClass();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f2797OooOO0O);
        }
        if (OooO0O0()) {
            OooO00o();
        }
        this.f2799OooOOO = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f2792OooO0o.layout(0, 0, i3 - i, i4 - i2);
        if (OooO0O0()) {
            return;
        }
        OooO00o();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.f2790OooO.getVisibility() != 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), Pow2.MAX_POW2);
        }
        View view = this.f2792OooO0o;
        measureChild(view, i, i2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void setActivityChooserModel(androidx.appcompat.widget.OooO0o oooO0o) {
        OooOO0 oooOO1 = this.f2791OooO0Oo;
        ActivityChooserView.this.f2791OooO0Oo.getClass();
        oooOO1.notifyDataSetChanged();
        if (OooO0O0()) {
            OooO00o();
            if (OooO0O0() || !this.f2799OooOOO) {
                return;
            }
            oooOO1.getClass();
            throw new IllegalStateException("No data model. Did you call #setDataModel?");
        }
    }

    public void setDefaultActionButtonContentDescription(int i) {
    }

    public void setExpandActivityOverflowButtonContentDescription(int i) {
        this.f2795OooO0oo.setContentDescription(getContext().getString(i));
    }

    public void setExpandActivityOverflowButtonDrawable(Drawable drawable) {
        this.f2795OooO0oo.setImageDrawable(drawable);
    }

    public void setInitialActivityCount(int i) {
    }

    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.f2800OooOOO0 = onDismissListener;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setProvider(androidx.core.view.OooO0O0 oooO0O0) {
        this.f2796OooOO0 = oooO0O0;
    }

    public ActivityChooserView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActivityChooserView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        new OooO00o();
        this.f2797OooOO0O = new OooO0O0();
        int[] iArr = p012OooOo0O.o00O0O.ActivityChooserView;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        ViewCompat.OooOOO(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i, 0);
        typedArrayObtainStyledAttributes.getInt(p012OooOo0O.o00O0O.ActivityChooserView_initialActivityCount, 4);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(p012OooOo0O.o00O0O.ActivityChooserView_expandActivityOverflowButtonDrawable);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater.from(getContext()).inflate(p012OooOo0O.Oooo0.abc_activity_chooser_view, (ViewGroup) this, true);
        OooOO0O oooOO0O = new OooOO0O();
        this.f2793OooO0o0 = oooOO0O;
        View viewFindViewById = findViewById(p012OooOo0O.Oooo000.activity_chooser_view_content);
        this.f2792OooO0o = viewFindViewById;
        viewFindViewById.getBackground();
        FrameLayout frameLayout = (FrameLayout) findViewById(p012OooOo0O.Oooo000.default_activity_button);
        this.f2790OooO = frameLayout;
        frameLayout.setOnClickListener(oooOO0O);
        frameLayout.setOnLongClickListener(oooOO0O);
        int i2 = p012OooOo0O.Oooo000.image;
        FrameLayout frameLayout2 = (FrameLayout) findViewById(p012OooOo0O.Oooo000.expand_activities_button);
        frameLayout2.setOnClickListener(oooOO0O);
        frameLayout2.setAccessibilityDelegate(new OooO0OO());
        frameLayout2.setOnTouchListener(new OooO0o(frameLayout2));
        this.f2794OooO0oO = frameLayout2;
        ImageView imageView = (ImageView) frameLayout2.findViewById(i2);
        this.f2795OooO0oo = imageView;
        imageView.setImageDrawable(drawable);
        OooOO0 oooOO1 = new OooOO0();
        this.f2791OooO0Oo = oooOO1;
        oooOO1.registerDataSetObserver(new OooO());
        Resources resources = context.getResources();
        Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(p012OooOo0O.OooOo00.abc_config_prefDialogWidth));
    }
}
