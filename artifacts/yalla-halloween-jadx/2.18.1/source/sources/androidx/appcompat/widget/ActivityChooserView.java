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
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class ActivityChooserView extends ViewGroup {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final FrameLayout f4895Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final OooOO0 f4896Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final OooOO0O f4897Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final View f4898Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final OooO00o f4899OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final FrameLayout f4900OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final ImageView f4901OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public o000O0O0.OooO00o f4902OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public final OooO0O0 f4903OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public PopupWindow.OnDismissListener f4904OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public int f4905OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public boolean f4906OoooOo0;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public ListPopupWindow f4907o000oOoO;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static class InnerLayout extends LinearLayout {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final int[] f4908Oooo0o = {R.attr.background};

        public InnerLayout(Context context, AttributeSet attributeSet) {
            int resourceId;
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f4908Oooo0o);
            setBackgroundDrawable((!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(0) : p012OooOo0.OooOO0O.OooO0O0(context, resourceId));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public class OooO extends DataSetObserver {
        public OooO() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            super.onChanged();
            Objects.requireNonNull(ActivityChooserView.this.f4896Oooo0o);
            throw null;
        }
    }

    public class OooO00o extends DataSetObserver {
        public OooO00o() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            super.onChanged();
            ActivityChooserView.this.f4896Oooo0o.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            super.onInvalidated();
            ActivityChooserView.this.f4896Oooo0o.notifyDataSetInvalidated();
        }
    }

    public class OooO0O0 implements ViewTreeObserver.OnGlobalLayoutListener {
        public OooO0O0() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            if (ActivityChooserView.this.OooO0O0()) {
                if (!ActivityChooserView.this.isShown()) {
                    ActivityChooserView.this.getListPopupWindow().dismiss();
                    return;
                }
                ActivityChooserView.this.getListPopupWindow().OooO00o();
                o000O0O0.OooO00o oooO00o = ActivityChooserView.this.f4902OoooO0O;
                if (oooO00o != null) {
                    oooO00o.OooO(true);
                }
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

    public class OooO0o extends o0OO00O {
        public OooO0o(View view) {
            super(view);
        }

        @Override // androidx.appcompat.widget.o0OO00O
        public final p015OooOoO.o00Oo0 OooO0O0() {
            return ActivityChooserView.this.getListPopupWindow();
        }

        @Override // androidx.appcompat.widget.o0OO00O
        public final boolean OooO0OO() {
            ActivityChooserView.this.OooO0OO();
            return true;
        }

        @Override // androidx.appcompat.widget.o0OO00O
        public final boolean OooO0Oo() {
            ActivityChooserView.this.OooO00o();
            return true;
        }
    }

    public class OooOO0 extends BaseAdapter {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f4914Oooo0o = 4;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public boolean f4915Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public boolean f4916Oooo0oo;

        public OooOO0() {
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            throw null;
        }

        @Override // android.widget.Adapter
        public final Object getItem(int i) {
            getItemViewType(i);
            if (this.f4915Oooo0oO) {
                throw null;
            }
            throw null;
        }

        @Override // android.widget.Adapter
        public final long getItemId(int i) {
            return i;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public final int getItemViewType(int i) {
            if (this.f4916Oooo0oo) {
                throw null;
            }
            return 0;
        }

        @Override // android.widget.Adapter
        public final View getView(int i, View view, ViewGroup viewGroup) {
            getItemViewType(i);
            if (view == null || view.getId() != OooOo00.OooOO0.list_item) {
                view = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(OooOo00.OooOO0O.abc_activity_chooser_view_list_item, viewGroup, false);
            }
            ActivityChooserView.this.getContext().getPackageManager();
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
            if (view == activityChooserView.f4900OoooO0) {
                activityChooserView.OooO00o();
                Objects.requireNonNull(ActivityChooserView.this.f4896Oooo0o);
                throw null;
            }
            if (view != activityChooserView.f4895Oooo) {
                throw new IllegalArgumentException();
            }
            activityChooserView.OooO0Oo();
            throw null;
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public final void onDismiss() {
            PopupWindow.OnDismissListener onDismissListener = ActivityChooserView.this.f4904OoooOOO;
            if (onDismissListener != null) {
                onDismissListener.onDismiss();
            }
            o000O0O0.OooO00o oooO00o = ActivityChooserView.this.f4902OoooO0O;
            if (oooO00o != null) {
                oooO00o.OooO(false);
            }
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            ((OooOO0) adapterView.getAdapter()).getItemViewType(i);
            ActivityChooserView.this.OooO00o();
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            Objects.requireNonNull(activityChooserView);
            boolean z = activityChooserView.f4896Oooo0o.f4915Oooo0oO;
            throw null;
        }

        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (view != activityChooserView.f4900OoooO0) {
                throw new IllegalArgumentException();
            }
            Objects.requireNonNull(activityChooserView.f4896Oooo0o);
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
                viewTreeObserver.removeGlobalOnLayoutListener(this.f4903OoooOO0);
            }
        }
    }

    public final boolean OooO0O0() {
        return getListPopupWindow().OooO0O0();
    }

    public final void OooO0OO() {
        if (OooO0O0() || !this.f4906OoooOo0) {
            return;
        }
        OooO0Oo();
        throw null;
    }

    public final void OooO0Oo() {
        Objects.requireNonNull(this.f4896Oooo0o);
        throw new IllegalStateException("No data model. Did you call #setDataModel?");
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public androidx.appcompat.widget.OooO0OO getDataModel() {
        Objects.requireNonNull(this.f4896Oooo0o);
        return null;
    }

    public ListPopupWindow getListPopupWindow() {
        if (this.f4907o000oOoO == null) {
            ListPopupWindow listPopupWindow = new ListPopupWindow(getContext(), null, OooOo00.OooO00o.listPopupWindowStyle);
            this.f4907o000oOoO = listPopupWindow;
            listPopupWindow.OooOOOo(this.f4896Oooo0o);
            ListPopupWindow listPopupWindow2 = this.f4907o000oOoO;
            listPopupWindow2.f5033OoooOoo = this;
            listPopupWindow2.OooOo00();
            ListPopupWindow listPopupWindow3 = this.f4907o000oOoO;
            OooOO0O oooOO0O = this.f4897Oooo0oO;
            listPopupWindow3.f5034Ooooo00 = oooOO0O;
            listPopupWindow3.OooOo0(oooOO0O);
        }
        return this.f4907o000oOoO;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Objects.requireNonNull(this.f4896Oooo0o);
        this.f4906OoooOo0 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Objects.requireNonNull(this.f4896Oooo0o);
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f4903OoooOO0);
        }
        if (OooO0O0()) {
            OooO00o();
        }
        this.f4906OoooOo0 = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f4898Oooo0oo.layout(0, 0, i3 - i, i4 - i2);
        if (OooO0O0()) {
            return;
        }
        OooO00o();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        View view = this.f4898Oooo0oo;
        if (this.f4900OoooO0.getVisibility() != 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824);
        }
        measureChild(view, i, i2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void setActivityChooserModel(androidx.appcompat.widget.OooO0OO oooO0OO) {
        OooOO0 oooOO1 = this.f4896Oooo0o;
        Objects.requireNonNull(ActivityChooserView.this.f4896Oooo0o);
        oooOO1.notifyDataSetChanged();
        if (OooO0O0()) {
            OooO00o();
            OooO0OO();
        }
    }

    public void setDefaultActionButtonContentDescription(int i) {
    }

    public void setExpandActivityOverflowButtonContentDescription(int i) {
        this.f4901OoooO00.setContentDescription(getContext().getString(i));
    }

    public void setExpandActivityOverflowButtonDrawable(Drawable drawable) {
        this.f4901OoooO00.setImageDrawable(drawable);
    }

    public void setInitialActivityCount(int i) {
        this.f4905OoooOOo = i;
    }

    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.f4904OoooOOO = onDismissListener;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setProvider(o000O0O0.OooO00o oooO00o) {
        this.f4902OoooO0O = oooO00o;
    }

    public ActivityChooserView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActivityChooserView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4899OoooO = new OooO00o();
        this.f4903OoooOO0 = new OooO0O0();
        this.f4905OoooOOo = 4;
        int[] iArr = OooOo00.OooOOOO.ActivityChooserView;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        ViewCompat.OooOo0O(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i);
        this.f4905OoooOOo = typedArrayObtainStyledAttributes.getInt(OooOo00.OooOOOO.ActivityChooserView_initialActivityCount, 4);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(OooOo00.OooOOOO.ActivityChooserView_expandActivityOverflowButtonDrawable);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater.from(getContext()).inflate(OooOo00.OooOO0O.abc_activity_chooser_view, (ViewGroup) this, true);
        OooOO0O oooOO0O = new OooOO0O();
        this.f4897Oooo0oO = oooOO0O;
        View viewFindViewById = findViewById(OooOo00.OooOO0.activity_chooser_view_content);
        this.f4898Oooo0oo = viewFindViewById;
        viewFindViewById.getBackground();
        FrameLayout frameLayout = (FrameLayout) findViewById(OooOo00.OooOO0.default_activity_button);
        this.f4900OoooO0 = frameLayout;
        frameLayout.setOnClickListener(oooOO0O);
        frameLayout.setOnLongClickListener(oooOO0O);
        int i2 = OooOo00.OooOO0.image;
        FrameLayout frameLayout2 = (FrameLayout) findViewById(OooOo00.OooOO0.expand_activities_button);
        frameLayout2.setOnClickListener(oooOO0O);
        frameLayout2.setAccessibilityDelegate(new OooO0OO());
        frameLayout2.setOnTouchListener(new OooO0o(frameLayout2));
        this.f4895Oooo = frameLayout2;
        ImageView imageView = (ImageView) frameLayout2.findViewById(i2);
        this.f4901OoooO00 = imageView;
        imageView.setImageDrawable(drawable);
        OooOO0 oooOO1 = new OooOO0();
        this.f4896Oooo0o = oooOO1;
        oooOO1.registerDataSetObserver(new OooO());
        Resources resources = context.getResources();
        Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(OooOo00.OooO0o.abc_config_prefDialogWidth));
    }
}
