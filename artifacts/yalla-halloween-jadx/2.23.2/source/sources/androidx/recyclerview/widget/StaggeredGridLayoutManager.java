package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class StaggeredGridLayoutManager extends RecyclerView.Oooo000 implements RecyclerView.o0ooOOo.OooO0O0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f10754OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f10755OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public o000OOo f10756OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public OooO0OO[] f10757OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public o000OOo f10758OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f10759OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final oo000o f10760OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public boolean f10761OooOO0O;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public BitSet f10764OooOOO0;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final LazySpanLookup f10766OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public boolean f10767OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final int f10768OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public boolean f10769OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public boolean f10770OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public int f10771OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public SavedState f10772OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public final Rect f10773OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final OooO0O0 f10774OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int[] f10775OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final boolean f10776OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final OooO00o f10777OooOoOO;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public boolean f10762OooOO0o = false;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public int f10763OooOOO = -1;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int f10765OooOOOO = Integer.MIN_VALUE;

    public static class LayoutParams extends RecyclerView.LayoutParams {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public boolean f10778OooO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public OooO0OO f10779OooO0oo;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public class OooO00o implements Runnable {
        public OooO00o() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            StaggeredGridLayoutManager.this.OooOO0o();
        }
    }

    public class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f10787OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f10788OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public boolean f10789OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public boolean f10790OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int[] f10791OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public boolean f10792OooO0o0;

        public OooO0O0() {
            OooO00o();
        }

        public final void OooO00o() {
            this.f10787OooO00o = -1;
            this.f10788OooO0O0 = Integer.MIN_VALUE;
            this.f10789OooO0OO = false;
            this.f10790OooO0Oo = false;
            this.f10792OooO0o0 = false;
            int[] iArr = this.f10791OooO0o;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }
    }

    public class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ArrayList<View> f10794OooO00o = new ArrayList<>();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f10795OooO0O0 = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f10796OooO0OO = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f10797OooO0Oo = 0;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final int f10799OooO0o0;

        public OooO0OO(int i) {
            this.f10799OooO0o0 = i;
        }

        public static LayoutParams OooOO0(View view) {
            return (LayoutParams) view.getLayoutParams();
        }

        public final View OooO(int i, int i2) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
            ArrayList<View> arrayList = this.f10794OooO00o;
            View view = null;
            if (i2 != -1) {
                int size = arrayList.size() - 1;
                while (size >= 0) {
                    View view2 = arrayList.get(size);
                    if ((staggeredGridLayoutManager.f10761OooOO0O && staggeredGridLayoutManager.getPosition(view2) >= i) || ((!staggeredGridLayoutManager.f10761OooOO0O && staggeredGridLayoutManager.getPosition(view2) <= i) || !view2.hasFocusable())) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = arrayList.size();
                int i3 = 0;
                while (i3 < size2) {
                    View view3 = arrayList.get(i3);
                    if ((staggeredGridLayoutManager.f10761OooOO0O && staggeredGridLayoutManager.getPosition(view3) <= i) || ((!staggeredGridLayoutManager.f10761OooOO0O && staggeredGridLayoutManager.getPosition(view3) >= i) || !view3.hasFocusable())) {
                        break;
                    }
                    i3++;
                    view = view3;
                }
            }
            return view;
        }

        public final void OooO00o(View view) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            layoutParams.f10779OooO0oo = this;
            ArrayList<View> arrayList = this.f10794OooO00o;
            arrayList.add(view);
            this.f10796OooO0OO = Integer.MIN_VALUE;
            if (arrayList.size() == 1) {
                this.f10795OooO0O0 = Integer.MIN_VALUE;
            }
            if (layoutParams.OooO0OO() || layoutParams.OooO0O0()) {
                this.f10797OooO0Oo = StaggeredGridLayoutManager.this.f10756OooO0o.OooO0OO(view) + this.f10797OooO0Oo;
            }
        }

        public final void OooO0O0() {
            LazySpanLookup.FullSpanItem fullSpanItemOooO0o;
            View view = (View) p018OooOoo0.OooOOO.OooO00o(this.f10794OooO00o, 1);
            LayoutParams layoutParamsOooOO0 = OooOO0(view);
            StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
            this.f10796OooO0OO = staggeredGridLayoutManager.f10756OooO0o.OooO0O0(view);
            if (layoutParamsOooOO0.f10778OooO && (fullSpanItemOooO0o = staggeredGridLayoutManager.f10766OooOOOo.OooO0o(layoutParamsOooOO0.OooO00o())) != null && fullSpanItemOooO0o.f10784OooO0o0 == 1) {
                int i = this.f10796OooO0OO;
                int[] iArr = fullSpanItemOooO0o.f10783OooO0o;
                this.f10796OooO0OO = i + (iArr == null ? 0 : iArr[this.f10799OooO0o0]);
            }
        }

        public final void OooO0OO() {
            LazySpanLookup.FullSpanItem fullSpanItemOooO0o;
            View view = this.f10794OooO00o.get(0);
            LayoutParams layoutParamsOooOO0 = OooOO0(view);
            StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
            this.f10795OooO0O0 = staggeredGridLayoutManager.f10756OooO0o.OooO0o0(view);
            if (layoutParamsOooOO0.f10778OooO && (fullSpanItemOooO0o = staggeredGridLayoutManager.f10766OooOOOo.OooO0o(layoutParamsOooOO0.OooO00o())) != null && fullSpanItemOooO0o.f10784OooO0o0 == -1) {
                int i = this.f10795OooO0O0;
                int[] iArr = fullSpanItemOooO0o.f10783OooO0o;
                this.f10795OooO0O0 = i - (iArr != null ? iArr[this.f10799OooO0o0] : 0);
            }
        }

        public final void OooO0Oo() {
            this.f10794OooO00o.clear();
            this.f10795OooO0O0 = Integer.MIN_VALUE;
            this.f10796OooO0OO = Integer.MIN_VALUE;
            this.f10797OooO0Oo = 0;
        }

        public final int OooO0o() {
            boolean z = StaggeredGridLayoutManager.this.f10761OooOO0O;
            ArrayList<View> arrayList = this.f10794OooO00o;
            return z ? OooO0oO(0, arrayList.size()) : OooO0oO(arrayList.size() - 1, -1);
        }

        public final int OooO0o0() {
            boolean z = StaggeredGridLayoutManager.this.f10761OooOO0O;
            ArrayList<View> arrayList = this.f10794OooO00o;
            return z ? OooO0oO(arrayList.size() - 1, -1) : OooO0oO(0, arrayList.size());
        }

        public final int OooO0oO(int i, int i2) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
            int iOooOO0O = staggeredGridLayoutManager.f10756OooO0o.OooOO0O();
            int iOooO0oO = staggeredGridLayoutManager.f10756OooO0o.OooO0oO();
            int i3 = i2 > i ? 1 : -1;
            while (i != i2) {
                View view = this.f10794OooO00o.get(i);
                int iOooO0o0 = staggeredGridLayoutManager.f10756OooO0o.OooO0o0(view);
                int iOooO0O0 = staggeredGridLayoutManager.f10756OooO0o.OooO0O0(view);
                boolean z = iOooO0o0 <= iOooO0oO;
                boolean z2 = iOooO0O0 >= iOooOO0O;
                if (z && z2 && (iOooO0o0 < iOooOO0O || iOooO0O0 > iOooO0oO)) {
                    return staggeredGridLayoutManager.getPosition(view);
                }
                i += i3;
            }
            return -1;
        }

        public final int OooO0oo(int i) {
            int i2 = this.f10796OooO0OO;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f10794OooO00o.size() == 0) {
                return i;
            }
            OooO0O0();
            return this.f10796OooO0OO;
        }

        public final int OooOO0O(int i) {
            int i2 = this.f10795OooO0O0;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f10794OooO00o.size() == 0) {
                return i;
            }
            OooO0OO();
            return this.f10795OooO0O0;
        }

        public final void OooOO0o() {
            ArrayList<View> arrayList = this.f10794OooO00o;
            int size = arrayList.size();
            View viewRemove = arrayList.remove(size - 1);
            LayoutParams layoutParamsOooOO0 = OooOO0(viewRemove);
            layoutParamsOooOO0.f10779OooO0oo = null;
            if (layoutParamsOooOO0.OooO0OO() || layoutParamsOooOO0.OooO0O0()) {
                this.f10797OooO0Oo -= StaggeredGridLayoutManager.this.f10756OooO0o.OooO0OO(viewRemove);
            }
            if (size == 1) {
                this.f10795OooO0O0 = Integer.MIN_VALUE;
            }
            this.f10796OooO0OO = Integer.MIN_VALUE;
        }

        public final void OooOOO(View view) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            layoutParams.f10779OooO0oo = this;
            ArrayList<View> arrayList = this.f10794OooO00o;
            arrayList.add(0, view);
            this.f10795OooO0O0 = Integer.MIN_VALUE;
            if (arrayList.size() == 1) {
                this.f10796OooO0OO = Integer.MIN_VALUE;
            }
            if (layoutParams.OooO0OO() || layoutParams.OooO0O0()) {
                this.f10797OooO0Oo = StaggeredGridLayoutManager.this.f10756OooO0o.OooO0OO(view) + this.f10797OooO0Oo;
            }
        }

        public final void OooOOO0() {
            ArrayList<View> arrayList = this.f10794OooO00o;
            View viewRemove = arrayList.remove(0);
            LayoutParams layoutParamsOooOO0 = OooOO0(viewRemove);
            layoutParamsOooOO0.f10779OooO0oo = null;
            if (arrayList.size() == 0) {
                this.f10796OooO0OO = Integer.MIN_VALUE;
            }
            if (layoutParamsOooOO0.OooO0OO() || layoutParamsOooOO0.OooO0O0()) {
                this.f10797OooO0Oo -= StaggeredGridLayoutManager.this.f10756OooO0o.OooO0OO(viewRemove);
            }
            this.f10795OooO0O0 = Integer.MIN_VALUE;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new OooO00o();

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public int[] f10800OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f10801OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f10802OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f10803OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int[] f10804OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public int f10805OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public List<LazySpanLookup.FullSpanItem> f10806OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public boolean f10807OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public boolean f10808OooOO0o;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public boolean f10809OooOOO0;

        public class OooO00o implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f10801OooO0Oo);
            parcel.writeInt(this.f10803OooO0o0);
            parcel.writeInt(this.f10802OooO0o);
            if (this.f10802OooO0o > 0) {
                parcel.writeIntArray(this.f10804OooO0oO);
            }
            parcel.writeInt(this.f10805OooO0oo);
            if (this.f10805OooO0oo > 0) {
                parcel.writeIntArray(this.f10800OooO);
            }
            parcel.writeInt(this.f10807OooOO0O ? 1 : 0);
            parcel.writeInt(this.f10808OooOO0o ? 1 : 0);
            parcel.writeInt(this.f10809OooOOO0 ? 1 : 0);
            parcel.writeList(this.f10806OooOO0);
        }

        public SavedState(Parcel parcel) {
            this.f10801OooO0Oo = parcel.readInt();
            this.f10803OooO0o0 = parcel.readInt();
            int i = parcel.readInt();
            this.f10802OooO0o = i;
            if (i > 0) {
                int[] iArr = new int[i];
                this.f10804OooO0oO = iArr;
                parcel.readIntArray(iArr);
            }
            int i2 = parcel.readInt();
            this.f10805OooO0oo = i2;
            if (i2 > 0) {
                int[] iArr2 = new int[i2];
                this.f10800OooO = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.f10807OooOO0O = parcel.readInt() == 1;
            this.f10808OooOO0o = parcel.readInt() == 1;
            this.f10809OooOOO0 = parcel.readInt() == 1;
            this.f10806OooOO0 = parcel.readArrayList(LazySpanLookup.FullSpanItem.class.getClassLoader());
        }

        public SavedState(SavedState savedState) {
            this.f10802OooO0o = savedState.f10802OooO0o;
            this.f10801OooO0Oo = savedState.f10801OooO0Oo;
            this.f10803OooO0o0 = savedState.f10803OooO0o0;
            this.f10804OooO0oO = savedState.f10804OooO0oO;
            this.f10805OooO0oo = savedState.f10805OooO0oo;
            this.f10800OooO = savedState.f10800OooO;
            this.f10807OooOO0O = savedState.f10807OooOO0O;
            this.f10808OooOO0o = savedState.f10808OooOO0o;
            this.f10809OooOOO0 = savedState.f10809OooOOO0;
            this.f10806OooOO0 = savedState.f10806OooOO0;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f10755OooO0Oo = -1;
        this.f10761OooOO0O = false;
        LazySpanLookup lazySpanLookup = new LazySpanLookup();
        this.f10766OooOOOo = lazySpanLookup;
        this.f10768OooOOo0 = 2;
        this.f10773OooOo0O = new Rect();
        this.f10774OooOo0o = new OooO0O0();
        this.f10770OooOo = false;
        this.f10776OooOoO0 = true;
        this.f10777OooOoOO = new OooO00o();
        RecyclerView.Oooo000.OooO0o properties = RecyclerView.Oooo000.getProperties(context, attributeSet, i, i2);
        int i3 = properties.f10705OooO00o;
        if (i3 != 0 && i3 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        assertNotInLayoutOrScroll(null);
        if (i3 != this.f10759OooO0oo) {
            this.f10759OooO0oo = i3;
            o000OOo o000ooo2 = this.f10756OooO0o;
            this.f10756OooO0o = this.f10758OooO0oO;
            this.f10758OooO0oO = o000ooo2;
            requestLayout();
        }
        int i4 = properties.f10706OooO0O0;
        assertNotInLayoutOrScroll(null);
        if (i4 != this.f10755OooO0Oo) {
            lazySpanLookup.OooO0O0();
            requestLayout();
            this.f10755OooO0Oo = i4;
            this.f10764OooOOO0 = new BitSet(this.f10755OooO0Oo);
            this.f10757OooO0o0 = new OooO0OO[this.f10755OooO0Oo];
            for (int i5 = 0; i5 < this.f10755OooO0Oo; i5++) {
                this.f10757OooO0o0[i5] = new OooO0OO(i5);
            }
            requestLayout();
        }
        boolean z = properties.f10707OooO0OO;
        assertNotInLayoutOrScroll(null);
        SavedState savedState = this.f10772OooOo00;
        if (savedState != null && savedState.f10807OooOO0O != z) {
            savedState.f10807OooOO0O = z;
        }
        this.f10761OooOO0O = z;
        requestLayout();
        this.f10760OooOO0 = new oo000o();
        this.f10756OooO0o = o000OOo.OooO00o(this, this.f10759OooO0oo);
        this.f10758OooO0oO = o000OOo.OooO00o(this, 1 - this.f10759OooO0oo);
    }

    public static int Oooo0(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    public final int OooOO0O(int i) {
        if (getChildCount() == 0) {
            return this.f10762OooOO0o ? 1 : -1;
        }
        return (i < OooOOo()) != this.f10762OooOO0o ? -1 : 1;
    }

    public final boolean OooOO0o() {
        int iOooOOo;
        int iOooOOoo;
        if (getChildCount() == 0 || this.f10768OooOOo0 == 0 || !isAttachedToWindow()) {
            return false;
        }
        if (this.f10762OooOO0o) {
            iOooOOo = OooOOoo();
            iOooOOoo = OooOOo();
        } else {
            iOooOOo = OooOOo();
            iOooOOoo = OooOOoo();
        }
        LazySpanLookup lazySpanLookup = this.f10766OooOOOo;
        if (iOooOOo == 0 && OooOo0o() != null) {
            lazySpanLookup.OooO0O0();
            requestSimpleAnimationsInNextLayout();
            requestLayout();
            return true;
        }
        if (!this.f10770OooOo) {
            return false;
        }
        int i = this.f10762OooOO0o ? -1 : 1;
        int i2 = iOooOOoo + 1;
        LazySpanLookup.FullSpanItem fullSpanItemOooO0o0 = lazySpanLookup.OooO0o0(iOooOOo, i2, i);
        if (fullSpanItemOooO0o0 == null) {
            this.f10770OooOo = false;
            lazySpanLookup.OooO0Oo(i2);
            return false;
        }
        LazySpanLookup.FullSpanItem fullSpanItemOooO0o1 = lazySpanLookup.OooO0o0(iOooOOo, fullSpanItemOooO0o0.f10782OooO0Oo, i * (-1));
        if (fullSpanItemOooO0o1 == null) {
            lazySpanLookup.OooO0Oo(fullSpanItemOooO0o0.f10782OooO0Oo);
        } else {
            lazySpanLookup.OooO0Oo(fullSpanItemOooO0o1.f10782OooO0Oo + 1);
        }
        requestSimpleAnimationsInNextLayout();
        requestLayout();
        return true;
    }

    public final View OooOOO(boolean z) {
        int iOooOO0O = this.f10756OooO0o.OooOO0O();
        int iOooO0oO = this.f10756OooO0o.OooO0oO();
        View view = null;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            int iOooO0o0 = this.f10756OooO0o.OooO0o0(childAt);
            int iOooO0O0 = this.f10756OooO0o.OooO0O0(childAt);
            if (iOooO0O0 > iOooOO0O && iOooO0o0 < iOooO0oO) {
                if (iOooO0O0 <= iOooO0oO || !z) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    /* JADX WARN: Code duplicated, block: B:143:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:145:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:148:0x02b7 A[LOOP:2: B:146:0x02b3->B:148:0x02b7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:149:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:150:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:152:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:155:0x02cf A[LOOP:3: B:153:0x02cb->B:155:0x02cf, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:156:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:166:0x030d  */
    /* JADX WARN: Code duplicated, block: B:168:0x0311  */
    /* JADX WARN: Code duplicated, block: B:169:0x0318  */
    /* JADX WARN: Code duplicated, block: B:173:0x0332  */
    /* JADX WARN: Code duplicated, block: B:174:0x033f  */
    /* JADX WARN: Code duplicated, block: B:177:0x0351  */
    /* JADX WARN: Code duplicated, block: B:178:0x035b  */
    /* JADX WARN: Code duplicated, block: B:187:0x0386  */
    /* JADX WARN: Code duplicated, block: B:205:0x02dc A[EDGE_INSN: B:205:0x02dc->B:157:0x02dc BREAK  A[LOOP:2: B:146:0x02b3->B:148:0x02b7], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:206:0x02dc A[EDGE_INSN: B:206:0x02dc->B:157:0x02dc BREAK  A[LOOP:3: B:153:0x02cb->B:155:0x02cf], SYNTHETIC] */
    public final int OooOOO0(RecyclerView.o00Ooo o00ooo2, oo000o oo000oVar, RecyclerView.o0OOO0o o0ooo0o2) {
        OooO0OO oooO0OO;
        int iOooO0OO;
        int i;
        boolean z;
        int i2;
        int iOooOO0O;
        int iOooO0OO2;
        int iOooO0OO3;
        View view;
        int i3;
        oo000o oo000oVar2;
        int i4;
        int i5;
        boolean z2;
        int i6;
        int i7;
        int i8;
        RecyclerView.o00Ooo o00ooo3 = o00ooo2;
        int i9 = 0;
        int i10 = 1;
        this.f10764OooOOO0.set(0, this.f10755OooO0Oo, true);
        oo000o oo000oVar3 = this.f10760OooOO0;
        int i11 = oo000oVar3.f10959OooO ? oo000oVar.f10965OooO0o0 == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : oo000oVar.f10965OooO0o0 == 1 ? oo000oVar.f10966OooO0oO + oo000oVar.f10961OooO0O0 : oo000oVar.f10964OooO0o - oo000oVar.f10961OooO0O0;
        Oooo000(oo000oVar.f10965OooO0o0, i11);
        int iOooO0oO = this.f10762OooOO0o ? this.f10756OooO0o.OooO0oO() : this.f10756OooO0o.OooOO0O();
        boolean z3 = false;
        while (true) {
            int i12 = oo000oVar.f10962OooO0OO;
            if (((i12 < 0 || i12 >= o0ooo0o2.OooO0O0()) ? i9 : i10) == 0 || (!oo000oVar3.f10959OooO && this.f10764OooOOO0.isEmpty())) {
                break;
            }
            View viewOooO0Oo = o00ooo3.OooO0Oo(oo000oVar.f10962OooO0OO);
            oo000oVar.f10962OooO0OO += oo000oVar.f10963OooO0Oo;
            LayoutParams layoutParams = (LayoutParams) viewOooO0Oo.getLayoutParams();
            int iOooO00o = layoutParams.OooO00o();
            LazySpanLookup lazySpanLookup = this.f10766OooOOOo;
            int[] iArr = lazySpanLookup.f10780OooO00o;
            int i13 = (iArr == null || iOooO00o >= iArr.length) ? -1 : iArr[iOooO00o];
            int i14 = i13 == -1 ? i10 : i9;
            if (i14 != 0) {
                if (layoutParams.f10778OooO) {
                    oooO0OO = this.f10757OooO0o0[i9];
                } else {
                    if (OooOoO(oo000oVar.f10965OooO0o0)) {
                        i7 = this.f10755OooO0Oo - i10;
                        i6 = -1;
                        i8 = -1;
                    } else {
                        i6 = this.f10755OooO0Oo;
                        i7 = i9;
                        i8 = i10;
                    }
                    OooO0OO oooO0OO2 = null;
                    if (oo000oVar.f10965OooO0o0 == i10) {
                        int iOooOO0O2 = this.f10756OooO0o.OooOO0O();
                        int i15 = Integer.MAX_VALUE;
                        while (i7 != i6) {
                            OooO0OO oooO0OO3 = this.f10757OooO0o0[i7];
                            int iOooO0oo = oooO0OO3.OooO0oo(iOooOO0O2);
                            if (iOooO0oo < i15) {
                                i15 = iOooO0oo;
                                oooO0OO2 = oooO0OO3;
                            }
                            i7 += i8;
                        }
                    } else {
                        int iOooO0oO2 = this.f10756OooO0o.OooO0oO();
                        int i16 = Integer.MIN_VALUE;
                        while (i7 != i6) {
                            OooO0OO oooO0OO4 = this.f10757OooO0o0[i7];
                            int iOooOO0O3 = oooO0OO4.OooOO0O(iOooO0oO2);
                            if (iOooOO0O3 > i16) {
                                oooO0OO2 = oooO0OO4;
                                i16 = iOooOO0O3;
                            }
                            i7 += i8;
                        }
                    }
                    oooO0OO = oooO0OO2;
                }
                lazySpanLookup.OooO0OO(iOooO00o);
                lazySpanLookup.f10780OooO00o[iOooO00o] = oooO0OO.f10799OooO0o0;
            } else {
                oooO0OO = this.f10757OooO0o0[i13];
            }
            OooO0OO oooO0OO5 = oooO0OO;
            layoutParams.f10779OooO0oo = oooO0OO5;
            if (oo000oVar.f10965OooO0o0 == 1) {
                addView(viewOooO0Oo);
            } else {
                addView(viewOooO0Oo, 0);
            }
            if (!layoutParams.f10778OooO) {
                i11 = i11;
                if (this.f10759OooO0oo == 1) {
                    OooOo(viewOooO0Oo, RecyclerView.Oooo000.getChildMeasureSpec(this.f10754OooO, getWidthMode(), 0, ((ViewGroup.MarginLayoutParams) layoutParams).width, false), RecyclerView.Oooo000.getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingBottom() + getPaddingTop(), ((ViewGroup.MarginLayoutParams) layoutParams).height, true), false);
                } else {
                    OooOo(viewOooO0Oo, RecyclerView.Oooo000.getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingRight() + getPaddingLeft(), ((ViewGroup.MarginLayoutParams) layoutParams).width, true), RecyclerView.Oooo000.getChildMeasureSpec(this.f10754OooO, getHeightMode(), 0, ((ViewGroup.MarginLayoutParams) layoutParams).height, false), false);
                }
            } else if (this.f10759OooO0oo == 1) {
                OooOo(viewOooO0Oo, this.f10771OooOo0, RecyclerView.Oooo000.getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingBottom() + getPaddingTop(), ((ViewGroup.MarginLayoutParams) layoutParams).height, true), false);
            } else {
                OooOo(viewOooO0Oo, RecyclerView.Oooo000.getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingRight() + getPaddingLeft(), ((ViewGroup.MarginLayoutParams) layoutParams).width, true), this.f10771OooOo0, false);
            }
            if (oo000oVar.f10965OooO0o0 == 1) {
                int iOooOo00 = layoutParams.f10778OooO ? OooOo00(iOooO0oO) : oooO0OO5.OooO0oo(iOooO0oO);
                int iOooO0OO4 = this.f10756OooO0o.OooO0OO(viewOooO0Oo) + iOooOo00;
                if (i14 != 0 && layoutParams.f10778OooO) {
                    LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
                    fullSpanItem.f10783OooO0o = new int[this.f10755OooO0Oo];
                    for (int i17 = 0; i17 < this.f10755OooO0Oo; i17++) {
                        fullSpanItem.f10783OooO0o[i17] = iOooOo00 - this.f10757OooO0o0[i17].OooO0oo(iOooOo00);
                    }
                    fullSpanItem.f10784OooO0o0 = -1;
                    fullSpanItem.f10782OooO0Oo = iOooO00o;
                    lazySpanLookup.OooO00o(fullSpanItem);
                }
                i = iOooO0OO4;
                iOooO0OO = iOooOo00;
            } else {
                int iOooOo0 = layoutParams.f10778OooO ? OooOo0(iOooO0oO) : oooO0OO5.OooOO0O(iOooO0oO);
                iOooO0OO = iOooOo0 - this.f10756OooO0o.OooO0OO(viewOooO0Oo);
                if (i14 != 0 && layoutParams.f10778OooO) {
                    LazySpanLookup.FullSpanItem fullSpanItem2 = new LazySpanLookup.FullSpanItem();
                    fullSpanItem2.f10783OooO0o = new int[this.f10755OooO0Oo];
                    for (int i18 = 0; i18 < this.f10755OooO0Oo; i18++) {
                        fullSpanItem2.f10783OooO0o[i18] = this.f10757OooO0o0[i18].OooOO0O(iOooOo0) - iOooOo0;
                    }
                    fullSpanItem2.f10784OooO0o0 = 1;
                    fullSpanItem2.f10782OooO0Oo = iOooO00o;
                    lazySpanLookup.OooO00o(fullSpanItem2);
                }
                i = iOooOo0;
            }
            if (layoutParams.f10778OooO && oo000oVar.f10963OooO0Oo == -1) {
                if (i14 != 0) {
                    z = true;
                    this.f10770OooOo = true;
                } else {
                    if (oo000oVar.f10965OooO0o0 == 1) {
                        int iOooO0oo2 = this.f10757OooO0o0[0].OooO0oo(Integer.MIN_VALUE);
                        int i19 = 1;
                        while (true) {
                            if (i19 >= this.f10755OooO0Oo) {
                                z = true;
                                z2 = true;
                            } else if (this.f10757OooO0o0[i19].OooO0oo(Integer.MIN_VALUE) != iOooO0oo2) {
                                z = true;
                                z2 = false;
                            } else {
                                i19++;
                            }
                        }
                    } else {
                        int iOooOO0O4 = this.f10757OooO0o0[0].OooOO0O(Integer.MIN_VALUE);
                        int i20 = 1;
                        while (true) {
                            if (i20 >= this.f10755OooO0Oo) {
                                z = true;
                                z2 = true;
                            } else if (this.f10757OooO0o0[i20].OooOO0O(Integer.MIN_VALUE) != iOooOO0O4) {
                                z = true;
                                z2 = false;
                            } else {
                                i20++;
                            }
                        }
                    }
                    if (!z2) {
                        LazySpanLookup.FullSpanItem fullSpanItemOooO0o = lazySpanLookup.OooO0o(iOooO00o);
                        if (fullSpanItemOooO0o != null) {
                            fullSpanItemOooO0o.f10785OooO0oO = z;
                        }
                        this.f10770OooOo = z;
                    }
                }
                if (oo000oVar.f10965OooO0o0 == z) {
                    if (layoutParams.f10778OooO) {
                        i5 = this.f10755OooO0Oo;
                        while (true) {
                            i5--;
                            if (i5 >= 0) {
                                break;
                            }
                            this.f10757OooO0o0[i5].OooO00o(viewOooO0Oo);
                        }
                    } else {
                        layoutParams.f10779OooO0oo.OooO00o(viewOooO0Oo);
                    }
                } else if (layoutParams.f10778OooO) {
                    i2 = this.f10755OooO0Oo;
                    while (true) {
                        i2--;
                        if (i2 >= 0) {
                            break;
                        }
                        this.f10757OooO0o0[i2].OooOOO(viewOooO0Oo);
                    }
                } else {
                    layoutParams.f10779OooO0oo.OooOOO(viewOooO0Oo);
                }
                if (isLayoutRTL() || this.f10759OooO0oo != 1) {
                    if (layoutParams.f10778OooO) {
                        iOooOO0O = this.f10758OooO0oO.OooOO0O();
                    } else {
                        iOooOO0O = (oooO0OO5.f10799OooO0o0 * this.f10754OooO) + this.f10758OooO0oO.OooOO0O();
                    }
                    iOooO0OO2 = iOooOO0O;
                    iOooO0OO3 = this.f10758OooO0oO.OooO0OO(viewOooO0Oo) + iOooOO0O;
                } else {
                    int iOooO0oO3 = layoutParams.f10778OooO ? this.f10758OooO0oO.OooO0oO() : this.f10758OooO0oO.OooO0oO() - (((this.f10755OooO0Oo - 1) - oooO0OO5.f10799OooO0o0) * this.f10754OooO);
                    iOooO0OO3 = iOooO0oO3;
                    iOooO0OO2 = iOooO0oO3 - this.f10758OooO0oO.OooO0OO(viewOooO0Oo);
                }
                if (this.f10759OooO0oo == 1) {
                    view = viewOooO0Oo;
                    layoutDecoratedWithMargins(viewOooO0Oo, iOooO0OO2, iOooO0OO, iOooO0OO3, i);
                } else {
                    view = viewOooO0Oo;
                    layoutDecoratedWithMargins(view, iOooO0OO, iOooO0OO2, i, iOooO0OO3);
                }
                if (layoutParams.f10778OooO) {
                    oo000oVar2 = oo000oVar3;
                    i3 = i11;
                    Oooo000(oo000oVar2.f10965OooO0o0, i3);
                } else {
                    i3 = i11;
                    oo000oVar2 = oo000oVar3;
                    Oooo00o(oooO0OO5, oo000oVar2.f10965OooO0o0, i3);
                }
                OooOoo0(o00ooo2, oo000oVar2);
                if (oo000oVar2.f10967OooO0oo || !view.hasFocusable()) {
                    i4 = 0;
                } else if (layoutParams.f10778OooO) {
                    this.f10764OooOOO0.clear();
                    i4 = 0;
                } else {
                    i4 = 0;
                    this.f10764OooOOO0.set(oooO0OO5.f10799OooO0o0, false);
                }
                oo000oVar3 = oo000oVar2;
                o00ooo3 = o00ooo2;
                i9 = i4;
                i11 = i3;
                z3 = true;
                i10 = 1;
            } else {
                z = true;
            }
            if (oo000oVar.f10965OooO0o0 == z) {
                if (layoutParams.f10778OooO) {
                    i5 = this.f10755OooO0Oo;
                    while (true) {
                        i5--;
                        if (i5 >= 0) {
                            break;
                            break;
                        }
                        this.f10757OooO0o0[i5].OooO00o(viewOooO0Oo);
                    }
                } else {
                    layoutParams.f10779OooO0oo.OooO00o(viewOooO0Oo);
                }
            } else if (layoutParams.f10778OooO) {
                i2 = this.f10755OooO0Oo;
                while (true) {
                    i2--;
                    if (i2 >= 0) {
                        break;
                        break;
                    }
                    this.f10757OooO0o0[i2].OooOOO(viewOooO0Oo);
                }
            } else {
                layoutParams.f10779OooO0oo.OooOOO(viewOooO0Oo);
            }
            if (isLayoutRTL()) {
                if (layoutParams.f10778OooO) {
                    iOooOO0O = this.f10758OooO0oO.OooOO0O();
                } else {
                    iOooOO0O = (oooO0OO5.f10799OooO0o0 * this.f10754OooO) + this.f10758OooO0oO.OooOO0O();
                }
                iOooO0OO2 = iOooOO0O;
                iOooO0OO3 = this.f10758OooO0oO.OooO0OO(viewOooO0Oo) + iOooOO0O;
            } else {
                if (layoutParams.f10778OooO) {
                    iOooOO0O = this.f10758OooO0oO.OooOO0O();
                } else {
                    iOooOO0O = (oooO0OO5.f10799OooO0o0 * this.f10754OooO) + this.f10758OooO0oO.OooOO0O();
                }
                iOooO0OO2 = iOooOO0O;
                iOooO0OO3 = this.f10758OooO0oO.OooO0OO(viewOooO0Oo) + iOooOO0O;
            }
            if (this.f10759OooO0oo == 1) {
                view = viewOooO0Oo;
                layoutDecoratedWithMargins(viewOooO0Oo, iOooO0OO2, iOooO0OO, iOooO0OO3, i);
            } else {
                view = viewOooO0Oo;
                layoutDecoratedWithMargins(view, iOooO0OO, iOooO0OO2, i, iOooO0OO3);
            }
            if (layoutParams.f10778OooO) {
                oo000oVar2 = oo000oVar3;
                i3 = i11;
                Oooo000(oo000oVar2.f10965OooO0o0, i3);
            } else {
                i3 = i11;
                oo000oVar2 = oo000oVar3;
                Oooo00o(oooO0OO5, oo000oVar2.f10965OooO0o0, i3);
            }
            OooOoo0(o00ooo2, oo000oVar2);
            if (oo000oVar2.f10967OooO0oo) {
                i4 = 0;
            } else {
                i4 = 0;
            }
            oo000oVar3 = oo000oVar2;
            o00ooo3 = o00ooo2;
            i9 = i4;
            i11 = i3;
            z3 = true;
            i10 = 1;
        }
        RecyclerView.o00Ooo o00ooo4 = o00ooo3;
        int i21 = i9;
        oo000o oo000oVar4 = oo000oVar3;
        if (!z3) {
            OooOoo0(o00ooo4, oo000oVar4);
        }
        int iOooOO0O5 = oo000oVar4.f10965OooO0o0 == -1 ? this.f10756OooO0o.OooOO0O() - OooOo0(this.f10756OooO0o.OooOO0O()) : OooOo00(this.f10756OooO0o.OooO0oO()) - this.f10756OooO0o.OooO0oO();
        return iOooOO0O5 > 0 ? Math.min(oo000oVar.f10961OooO0O0, iOooOO0O5) : i21;
    }

    public final View OooOOOO(boolean z) {
        int iOooOO0O = this.f10756OooO0o.OooOO0O();
        int iOooO0oO = this.f10756OooO0o.OooO0oO();
        int childCount = getChildCount();
        View view = null;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int iOooO0o0 = this.f10756OooO0o.OooO0o0(childAt);
            if (this.f10756OooO0o.OooO0O0(childAt) > iOooOO0O && iOooO0o0 < iOooO0oO) {
                if (iOooO0o0 >= iOooOO0O || !z) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    public final void OooOOOo(RecyclerView.o00Ooo o00ooo2, RecyclerView.o0OOO0o o0ooo0o2, boolean z) {
        int iOooO0oO;
        int iOooOo00 = OooOo00(Integer.MIN_VALUE);
        if (iOooOo00 != Integer.MIN_VALUE && (iOooO0oO = this.f10756OooO0o.OooO0oO() - iOooOo00) > 0) {
            int i = iOooO0oO - (-scrollBy(-iOooO0oO, o00ooo2, o0ooo0o2));
            if (!z || i <= 0) {
                return;
            }
            this.f10756OooO0o.OooOOOo(i);
        }
    }

    public final int OooOOo() {
        if (getChildCount() == 0) {
            return 0;
        }
        return getPosition(getChildAt(0));
    }

    public final void OooOOo0(RecyclerView.o00Ooo o00ooo2, RecyclerView.o0OOO0o o0ooo0o2, boolean z) {
        int iOooOO0O;
        int iOooOo0 = OooOo0(Integer.MAX_VALUE);
        if (iOooOo0 != Integer.MAX_VALUE && (iOooOO0O = iOooOo0 - this.f10756OooO0o.OooOO0O()) > 0) {
            int iScrollBy = iOooOO0O - scrollBy(iOooOO0O, o00ooo2, o0ooo0o2);
            if (!z || iScrollBy <= 0) {
                return;
            }
            this.f10756OooO0o.OooOOOo(-iScrollBy);
        }
    }

    public final int OooOOoo() {
        int childCount = getChildCount();
        if (childCount == 0) {
            return 0;
        }
        return getPosition(getChildAt(childCount - 1));
    }

    public final void OooOo(View view, int i, int i2, boolean z) {
        Rect rect = this.f10773OooOo0O;
        calculateItemDecorationsForChild(view, rect);
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int iOooo0 = Oooo0(i, ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + rect.right);
        int iOooo1 = Oooo0(i2, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + rect.bottom);
        if (shouldMeasureChild(view, iOooo0, iOooo1, layoutParams)) {
            view.measure(iOooo0, iOooo1);
        }
    }

    public final int OooOo0(int i) {
        int iOooOO0O = this.f10757OooO0o0[0].OooOO0O(i);
        for (int i2 = 1; i2 < this.f10755OooO0Oo; i2++) {
            int iOooOO0O2 = this.f10757OooO0o0[i2].OooOO0O(i);
            if (iOooOO0O2 < iOooOO0O) {
                iOooOO0O = iOooOO0O2;
            }
        }
        return iOooOO0O;
    }

    public final int OooOo00(int i) {
        int iOooO0oo = this.f10757OooO0o0[0].OooO0oo(i);
        for (int i2 = 1; i2 < this.f10755OooO0Oo; i2++) {
            int iOooO0oo2 = this.f10757OooO0o0[i2].OooO0oo(i);
            if (iOooO0oo2 > iOooO0oo) {
                iOooO0oo = iOooO0oo2;
            }
        }
        return iOooO0oo;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0025  */
    /* JADX WARN: Code duplicated, block: B:17:0x0028 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x002b  */
    /* JADX WARN: Code duplicated, block: B:20:0x0032  */
    /* JADX WARN: Code duplicated, block: B:21:0x0036  */
    /* JADX WARN: Code duplicated, block: B:23:0x003b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x003c  */
    /* JADX WARN: Code duplicated, block: B:26:0x0040  */
    /* JADX WARN: Code duplicated, block: B:27:0x0045  */
    /* JADX WARN: Code duplicated, block: B:29:0x004b  */
    /* JADX WARN: Code duplicated, block: B:31:? A[RETURN, SYNTHETIC] */
    public final void OooOo0O(int i, int i2, int i3) {
        int i4;
        int i5;
        LazySpanLookup lazySpanLookup;
        int iOooOOoo;
        int iOooOOoo2 = this.f10762OooOO0o ? OooOOoo() : OooOOo();
        if (i3 == 8) {
            if (i < i2) {
                i4 = i2 + 1;
            } else {
                i4 = i + 1;
                i5 = i2;
            }
            lazySpanLookup = this.f10766OooOOOo;
            lazySpanLookup.OooO0oO(i5);
            if (i3 != 1) {
                lazySpanLookup.OooO0oo(i, i2);
            } else if (i3 != 2) {
                lazySpanLookup.OooO(i, i2);
            } else if (i3 == 8) {
                lazySpanLookup.OooO(i, 1);
                lazySpanLookup.OooO0oo(i2, 1);
            }
            if (i4 <= iOooOOoo2) {
                return;
            }
            if (this.f10762OooOO0o) {
                iOooOOoo = OooOOo();
            } else {
                iOooOOoo = OooOOoo();
            }
            if (i5 <= iOooOOoo) {
                requestLayout();
            }
        }
        i4 = i + i2;
        i5 = i;
        lazySpanLookup = this.f10766OooOOOo;
        lazySpanLookup.OooO0oO(i5);
        if (i3 != 1) {
            lazySpanLookup.OooO0oo(i, i2);
        } else if (i3 != 2) {
            lazySpanLookup.OooO(i, i2);
        } else if (i3 == 8) {
            lazySpanLookup.OooO(i, 1);
            lazySpanLookup.OooO0oo(i2, 1);
        }
        if (i4 <= iOooOOoo2) {
            return;
        }
        if (this.f10762OooOO0o) {
            iOooOOoo = OooOOo();
        } else {
            iOooOOoo = OooOOoo();
        }
        if (i5 <= iOooOOoo) {
            requestLayout();
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0096  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d7  */
    public final View OooOo0o() {
        int i;
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        int childCount = getChildCount() - 1;
        BitSet bitSet = new BitSet(this.f10755OooO0Oo);
        bitSet.set(0, this.f10755OooO0Oo, true);
        byte b = (this.f10759OooO0oo == 1 && isLayoutRTL()) ? (byte) 1 : (byte) -1;
        if (this.f10762OooOO0o) {
            i = -1;
        } else {
            i = childCount + 1;
            childCount = 0;
        }
        int i3 = childCount < i ? 1 : -1;
        while (childCount != i) {
            View childAt = getChildAt(childCount);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (bitSet.get(layoutParams.f10779OooO0oo.f10799OooO0o0)) {
                OooO0OO oooO0OO = layoutParams.f10779OooO0oo;
                if (this.f10762OooOO0o) {
                    int i4 = oooO0OO.f10796OooO0OO;
                    if (i4 == Integer.MIN_VALUE) {
                        oooO0OO.OooO0O0();
                        i4 = oooO0OO.f10796OooO0OO;
                    }
                    if (i4 < this.f10756OooO0o.OooO0oO()) {
                        ArrayList<View> arrayList = oooO0OO.f10794OooO00o;
                        z2 = OooO0OO.OooOO0(arrayList.get(arrayList.size() - 1)).f10778OooO;
                        z3 = !z2;
                    } else {
                        z3 = false;
                    }
                } else {
                    int i5 = oooO0OO.f10795OooO0O0;
                    if (i5 == Integer.MIN_VALUE) {
                        oooO0OO.OooO0OO();
                        i5 = oooO0OO.f10795OooO0O0;
                    }
                    if (i5 > this.f10756OooO0o.OooOO0O()) {
                        z2 = OooO0OO.OooOO0(oooO0OO.f10794OooO00o.get(0)).f10778OooO;
                        z3 = !z2;
                    } else {
                        z3 = false;
                    }
                }
                if (z3) {
                    return childAt;
                }
                bitSet.clear(layoutParams.f10779OooO0oo.f10799OooO0o0);
            }
            if (!layoutParams.f10778OooO && (i2 = childCount + i3) != i) {
                View childAt2 = getChildAt(i2);
                if (this.f10762OooOO0o) {
                    int iOooO0O0 = this.f10756OooO0o.OooO0O0(childAt);
                    int iOooO0O1 = this.f10756OooO0o.OooO0O0(childAt2);
                    if (iOooO0O0 < iOooO0O1) {
                        return childAt;
                    }
                    if (iOooO0O0 == iOooO0O1) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    int iOooO0o0 = this.f10756OooO0o.OooO0o0(childAt);
                    int iOooO0o1 = this.f10756OooO0o.OooO0o0(childAt2);
                    if (iOooO0o0 > iOooO0o1) {
                        return childAt;
                    }
                    if (iOooO0o0 == iOooO0o1) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                if (z) {
                    if ((layoutParams.f10779OooO0oo.f10799OooO0o0 - ((LayoutParams) childAt2.getLayoutParams()).f10779OooO0oo.f10799OooO0o0 < 0) != (b < 0)) {
                        return childAt;
                    }
                } else {
                    continue;
                }
            }
            childCount += i3;
        }
        return null;
    }

    public final boolean OooOoO(int i) {
        if (this.f10759OooO0oo == 0) {
            return (i == -1) != this.f10762OooOO0o;
        }
        return ((i == -1) == this.f10762OooOO0o) == isLayoutRTL();
    }

    /* JADX WARN: Code duplicated, block: B:258:0x041d  */
    public final void OooOoO0(RecyclerView.o00Ooo o00ooo2, RecyclerView.o0OOO0o o0ooo0o2, boolean z) {
        boolean z2;
        SavedState savedState;
        boolean z3;
        int position;
        int i;
        SavedState savedState2 = this.f10772OooOo00;
        OooO0O0 oooO0O0 = this.f10774OooOo0o;
        if (!(savedState2 == null && this.f10763OooOOO == -1) && o0ooo0o2.OooO0O0() == 0) {
            removeAndRecycleAllViews(o00ooo2);
            oooO0O0.OooO00o();
            return;
        }
        boolean z4 = (oooO0O0.f10792OooO0o0 && this.f10763OooOOO == -1 && this.f10772OooOo00 == null) ? false : true;
        StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
        LazySpanLookup lazySpanLookup = this.f10766OooOOOo;
        if (z4) {
            oooO0O0.OooO00o();
            SavedState savedState3 = this.f10772OooOo00;
            if (savedState3 != null) {
                int i2 = savedState3.f10802OooO0o;
                if (i2 > 0) {
                    if (i2 == this.f10755OooO0Oo) {
                        for (int i3 = 0; i3 < this.f10755OooO0Oo; i3++) {
                            this.f10757OooO0o0[i3].OooO0Oo();
                            SavedState savedState4 = this.f10772OooOo00;
                            int iOooO0oO = savedState4.f10804OooO0oO[i3];
                            if (iOooO0oO != Integer.MIN_VALUE) {
                                iOooO0oO += savedState4.f10808OooOO0o ? this.f10756OooO0o.OooO0oO() : this.f10756OooO0o.OooOO0O();
                            }
                            OooO0OO oooO0OO = this.f10757OooO0o0[i3];
                            oooO0OO.f10795OooO0O0 = iOooO0oO;
                            oooO0OO.f10796OooO0OO = iOooO0oO;
                        }
                    } else {
                        savedState3.f10804OooO0oO = null;
                        savedState3.f10802OooO0o = 0;
                        savedState3.f10805OooO0oo = 0;
                        savedState3.f10800OooO = null;
                        savedState3.f10806OooOO0 = null;
                        savedState3.f10801OooO0Oo = savedState3.f10803OooO0o0;
                    }
                }
                SavedState savedState5 = this.f10772OooOo00;
                this.f10769OooOOoo = savedState5.f10809OooOOO0;
                boolean z5 = savedState5.f10807OooOO0O;
                assertNotInLayoutOrScroll(null);
                SavedState savedState6 = this.f10772OooOo00;
                if (savedState6 != null && savedState6.f10807OooOO0O != z5) {
                    savedState6.f10807OooOO0O = z5;
                }
                this.f10761OooOO0O = z5;
                requestLayout();
                resolveShouldLayoutReverse();
                SavedState savedState7 = this.f10772OooOo00;
                int i4 = savedState7.f10801OooO0Oo;
                if (i4 != -1) {
                    this.f10763OooOOO = i4;
                    oooO0O0.f10789OooO0OO = savedState7.f10808OooOO0o;
                } else {
                    oooO0O0.f10789OooO0OO = this.f10762OooOO0o;
                }
                if (savedState7.f10805OooO0oo > 1) {
                    lazySpanLookup.f10780OooO00o = savedState7.f10800OooO;
                    lazySpanLookup.f10781OooO0O0 = savedState7.f10806OooOO0;
                }
            } else {
                resolveShouldLayoutReverse();
                oooO0O0.f10789OooO0OO = this.f10762OooOO0o;
            }
            if (o0ooo0o2.f10733OooO0oO || (i = this.f10763OooOOO) == -1) {
                z3 = false;
            } else if (i < 0 || i >= o0ooo0o2.OooO0O0()) {
                this.f10763OooOOO = -1;
                this.f10765OooOOOO = Integer.MIN_VALUE;
                z3 = false;
            } else {
                SavedState savedState8 = this.f10772OooOo00;
                if (savedState8 == null || savedState8.f10801OooO0Oo == -1 || savedState8.f10802OooO0o < 1) {
                    View viewFindViewByPosition = findViewByPosition(this.f10763OooOOO);
                    if (viewFindViewByPosition != null) {
                        oooO0O0.f10787OooO00o = this.f10762OooOO0o ? OooOOoo() : OooOOo();
                        if (this.f10765OooOOOO != Integer.MIN_VALUE) {
                            if (oooO0O0.f10789OooO0OO) {
                                oooO0O0.f10788OooO0O0 = (this.f10756OooO0o.OooO0oO() - this.f10765OooOOOO) - this.f10756OooO0o.OooO0O0(viewFindViewByPosition);
                            } else {
                                oooO0O0.f10788OooO0O0 = (this.f10756OooO0o.OooOO0O() + this.f10765OooOOOO) - this.f10756OooO0o.OooO0o0(viewFindViewByPosition);
                            }
                        } else if (this.f10756OooO0o.OooO0OO(viewFindViewByPosition) > this.f10756OooO0o.OooOO0o()) {
                            oooO0O0.f10788OooO0O0 = oooO0O0.f10789OooO0OO ? this.f10756OooO0o.OooO0oO() : this.f10756OooO0o.OooOO0O();
                        } else {
                            int iOooO0o0 = this.f10756OooO0o.OooO0o0(viewFindViewByPosition) - this.f10756OooO0o.OooOO0O();
                            if (iOooO0o0 < 0) {
                                oooO0O0.f10788OooO0O0 = -iOooO0o0;
                            } else {
                                int iOooO0oO2 = this.f10756OooO0o.OooO0oO() - this.f10756OooO0o.OooO0O0(viewFindViewByPosition);
                                if (iOooO0oO2 < 0) {
                                    oooO0O0.f10788OooO0O0 = iOooO0oO2;
                                } else {
                                    oooO0O0.f10788OooO0O0 = Integer.MIN_VALUE;
                                }
                            }
                        }
                    } else {
                        int i5 = this.f10763OooOOO;
                        oooO0O0.f10787OooO00o = i5;
                        int i6 = this.f10765OooOOOO;
                        if (i6 == Integer.MIN_VALUE) {
                            boolean z6 = OooOO0O(i5) == 1;
                            oooO0O0.f10789OooO0OO = z6;
                            oooO0O0.f10788OooO0O0 = z6 ? staggeredGridLayoutManager.f10756OooO0o.OooO0oO() : staggeredGridLayoutManager.f10756OooO0o.OooOO0O();
                        } else if (oooO0O0.f10789OooO0OO) {
                            oooO0O0.f10788OooO0O0 = staggeredGridLayoutManager.f10756OooO0o.OooO0oO() - i6;
                        } else {
                            oooO0O0.f10788OooO0O0 = staggeredGridLayoutManager.f10756OooO0o.OooOO0O() + i6;
                        }
                        oooO0O0.f10790OooO0Oo = true;
                    }
                } else {
                    oooO0O0.f10788OooO0O0 = Integer.MIN_VALUE;
                    oooO0O0.f10787OooO00o = this.f10763OooOOO;
                }
                z3 = true;
            }
            if (!z3) {
                if (this.f10767OooOOo) {
                    int iOooO0O0 = o0ooo0o2.OooO0O0();
                    int childCount = getChildCount();
                    while (true) {
                        childCount--;
                        if (childCount < 0) {
                            position = 0;
                            break;
                        }
                        position = getPosition(getChildAt(childCount));
                        if (position >= 0 && position < iOooO0O0) {
                            break;
                        }
                    }
                } else {
                    int iOooO0O1 = o0ooo0o2.OooO0O0();
                    int childCount2 = getChildCount();
                    int i7 = 0;
                    while (true) {
                        if (i7 >= childCount2) {
                            position = 0;
                            break;
                        }
                        int position2 = getPosition(getChildAt(i7));
                        if (position2 >= 0 && position2 < iOooO0O1) {
                            position = position2;
                            break;
                        }
                        i7++;
                    }
                }
                oooO0O0.f10787OooO00o = position;
                oooO0O0.f10788OooO0O0 = Integer.MIN_VALUE;
            }
            oooO0O0.f10792OooO0o0 = true;
        }
        if (this.f10772OooOo00 == null && this.f10763OooOOO == -1 && (oooO0O0.f10789OooO0OO != this.f10767OooOOo || isLayoutRTL() != this.f10769OooOOoo)) {
            lazySpanLookup.OooO0O0();
            oooO0O0.f10790OooO0Oo = true;
        }
        if (getChildCount() > 0 && ((savedState = this.f10772OooOo00) == null || savedState.f10802OooO0o < 1)) {
            if (oooO0O0.f10790OooO0Oo) {
                for (int i8 = 0; i8 < this.f10755OooO0Oo; i8++) {
                    this.f10757OooO0o0[i8].OooO0Oo();
                    int i9 = oooO0O0.f10788OooO0O0;
                    if (i9 != Integer.MIN_VALUE) {
                        OooO0OO oooO0OO2 = this.f10757OooO0o0[i8];
                        oooO0OO2.f10795OooO0O0 = i9;
                        oooO0OO2.f10796OooO0OO = i9;
                    }
                }
            } else if (z4 || oooO0O0.f10791OooO0o == null) {
                for (int i10 = 0; i10 < this.f10755OooO0Oo; i10++) {
                    OooO0OO oooO0OO3 = this.f10757OooO0o0[i10];
                    boolean z7 = this.f10762OooOO0o;
                    int i11 = oooO0O0.f10788OooO0O0;
                    int iOooO0oo = z7 ? oooO0OO3.OooO0oo(Integer.MIN_VALUE) : oooO0OO3.OooOO0O(Integer.MIN_VALUE);
                    oooO0OO3.OooO0Oo();
                    if (iOooO0oo != Integer.MIN_VALUE) {
                        StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                        if ((!z7 || iOooO0oo >= staggeredGridLayoutManager2.f10756OooO0o.OooO0oO()) && (z7 || iOooO0oo <= staggeredGridLayoutManager2.f10756OooO0o.OooOO0O())) {
                            if (i11 != Integer.MIN_VALUE) {
                                iOooO0oo += i11;
                            }
                            oooO0OO3.f10796OooO0OO = iOooO0oo;
                            oooO0OO3.f10795OooO0O0 = iOooO0oo;
                        }
                    }
                }
                OooO0OO[] oooO0OOArr = this.f10757OooO0o0;
                int length = oooO0OOArr.length;
                int[] iArr = oooO0O0.f10791OooO0o;
                if (iArr == null || iArr.length < length) {
                    oooO0O0.f10791OooO0o = new int[staggeredGridLayoutManager.f10757OooO0o0.length];
                }
                for (int i12 = 0; i12 < length; i12++) {
                    oooO0O0.f10791OooO0o[i12] = oooO0OOArr[i12].OooOO0O(Integer.MIN_VALUE);
                }
            } else {
                for (int i13 = 0; i13 < this.f10755OooO0Oo; i13++) {
                    OooO0OO oooO0OO4 = this.f10757OooO0o0[i13];
                    oooO0OO4.OooO0Oo();
                    int i14 = oooO0O0.f10791OooO0o[i13];
                    oooO0OO4.f10795OooO0O0 = i14;
                    oooO0OO4.f10796OooO0OO = i14;
                }
            }
        }
        detachAndScrapAttachedViews(o00ooo2);
        oo000o oo000oVar = this.f10760OooOO0;
        oo000oVar.f10960OooO00o = false;
        this.f10770OooOo = false;
        int iOooOO0o = this.f10758OooO0oO.OooOO0o();
        this.f10754OooO = iOooOO0o / this.f10755OooO0Oo;
        this.f10771OooOo0 = View.MeasureSpec.makeMeasureSpec(iOooOO0o, this.f10758OooO0oO.OooO());
        Oooo00O(oooO0O0.f10787OooO00o, o0ooo0o2);
        if (oooO0O0.f10789OooO0OO) {
            OooOooo(-1);
            OooOOO0(o00ooo2, oo000oVar, o0ooo0o2);
            OooOooo(1);
            oo000oVar.f10962OooO0OO = oooO0O0.f10787OooO00o + oo000oVar.f10963OooO0Oo;
            OooOOO0(o00ooo2, oo000oVar, o0ooo0o2);
        } else {
            OooOooo(1);
            OooOOO0(o00ooo2, oo000oVar, o0ooo0o2);
            OooOooo(-1);
            oo000oVar.f10962OooO0OO = oooO0O0.f10787OooO00o + oo000oVar.f10963OooO0Oo;
            OooOOO0(o00ooo2, oo000oVar, o0ooo0o2);
        }
        if (this.f10758OooO0oO.OooO() != 1073741824) {
            int childCount3 = getChildCount();
            float fMax = 0.0f;
            for (int i15 = 0; i15 < childCount3; i15++) {
                View childAt = getChildAt(i15);
                float fOooO0OO = this.f10758OooO0oO.OooO0OO(childAt);
                if (fOooO0OO >= fMax) {
                    if (((LayoutParams) childAt.getLayoutParams()).f10778OooO) {
                        fOooO0OO = (fOooO0OO * 1.0f) / this.f10755OooO0Oo;
                    }
                    fMax = Math.max(fMax, fOooO0OO);
                }
            }
            int i16 = this.f10754OooO;
            int iRound = Math.round(fMax * this.f10755OooO0Oo);
            if (this.f10758OooO0oO.OooO() == Integer.MIN_VALUE) {
                iRound = Math.min(iRound, this.f10758OooO0oO.OooOO0o());
            }
            this.f10754OooO = iRound / this.f10755OooO0Oo;
            this.f10771OooOo0 = View.MeasureSpec.makeMeasureSpec(iRound, this.f10758OooO0oO.OooO());
            if (this.f10754OooO != i16) {
                for (int i17 = 0; i17 < childCount3; i17++) {
                    View childAt2 = getChildAt(i17);
                    LayoutParams layoutParams = (LayoutParams) childAt2.getLayoutParams();
                    if (!layoutParams.f10778OooO) {
                        if (isLayoutRTL() && this.f10759OooO0oo == 1) {
                            int i18 = this.f10755OooO0Oo;
                            int i19 = layoutParams.f10779OooO0oo.f10799OooO0o0;
                            childAt2.offsetLeftAndRight(((-((i18 - 1) - i19)) * this.f10754OooO) - ((-((i18 - 1) - i19)) * i16));
                        } else {
                            int i20 = layoutParams.f10779OooO0oo.f10799OooO0o0;
                            int i21 = this.f10754OooO * i20;
                            int i22 = i20 * i16;
                            if (this.f10759OooO0oo == 1) {
                                childAt2.offsetLeftAndRight(i21 - i22);
                            } else {
                                childAt2.offsetTopAndBottom(i21 - i22);
                            }
                        }
                    }
                }
            }
        }
        if (getChildCount() > 0) {
            if (this.f10762OooOO0o) {
                OooOOOo(o00ooo2, o0ooo0o2, true);
                OooOOo0(o00ooo2, o0ooo0o2, false);
            } else {
                OooOOo0(o00ooo2, o0ooo0o2, true);
                OooOOOo(o00ooo2, o0ooo0o2, false);
            }
        }
        if (z && !o0ooo0o2.f10733OooO0oO) {
            if (this.f10768OooOOo0 != 0 && getChildCount() > 0 && (this.f10770OooOo || OooOo0o() != null)) {
                removeCallbacks(this.f10777OooOoOO);
                z2 = OooOO0o();
            }
        }
        if (o0ooo0o2.f10733OooO0oO) {
            oooO0O0.OooO00o();
        }
        this.f10767OooOOo = oooO0O0.f10789OooO0OO;
        this.f10769OooOOoo = isLayoutRTL();
        if (z2) {
            oooO0O0.OooO00o();
            OooOoO0(o00ooo2, o0ooo0o2, false);
        }
    }

    public final void OooOoOO(int i, RecyclerView.o0OOO0o o0ooo0o2) {
        int iOooOOo;
        int i2;
        if (i > 0) {
            iOooOOo = OooOOoo();
            i2 = 1;
        } else {
            iOooOOo = OooOOo();
            i2 = -1;
        }
        oo000o oo000oVar = this.f10760OooOO0;
        oo000oVar.f10960OooO00o = true;
        Oooo00O(iOooOOo, o0ooo0o2);
        OooOooo(i2);
        oo000oVar.f10962OooO0OO = iOooOOo + oo000oVar.f10963OooO0Oo;
        oo000oVar.f10961OooO0O0 = Math.abs(i);
    }

    public final void OooOoo(int i, RecyclerView.o00Ooo o00ooo2) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (this.f10756OooO0o.OooO0o0(childAt) < i || this.f10756OooO0o.OooOOOO(childAt) < i) {
                return;
            }
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (layoutParams.f10778OooO) {
                for (int i2 = 0; i2 < this.f10755OooO0Oo; i2++) {
                    if (this.f10757OooO0o0[i2].f10794OooO00o.size() == 1) {
                        return;
                    }
                }
                for (int i3 = 0; i3 < this.f10755OooO0Oo; i3++) {
                    this.f10757OooO0o0[i3].OooOO0o();
                }
            } else if (layoutParams.f10779OooO0oo.f10794OooO00o.size() == 1) {
                return;
            } else {
                layoutParams.f10779OooO0oo.OooOO0o();
            }
            removeAndRecycleView(childAt, o00ooo2);
        }
    }

    public final void OooOoo0(RecyclerView.o00Ooo o00ooo2, oo000o oo000oVar) {
        int iMin;
        if (!oo000oVar.f10960OooO00o || oo000oVar.f10959OooO) {
            return;
        }
        if (oo000oVar.f10961OooO0O0 == 0) {
            if (oo000oVar.f10965OooO0o0 == -1) {
                OooOoo(oo000oVar.f10966OooO0oO, o00ooo2);
                return;
            } else {
                OooOooO(oo000oVar.f10964OooO0o, o00ooo2);
                return;
            }
        }
        int i = 1;
        if (oo000oVar.f10965OooO0o0 == -1) {
            int i2 = oo000oVar.f10964OooO0o;
            int iOooOO0O = this.f10757OooO0o0[0].OooOO0O(i2);
            while (i < this.f10755OooO0Oo) {
                int iOooOO0O2 = this.f10757OooO0o0[i].OooOO0O(i2);
                if (iOooOO0O2 > iOooOO0O) {
                    iOooOO0O = iOooOO0O2;
                }
                i++;
            }
            int i3 = i2 - iOooOO0O;
            OooOoo(i3 < 0 ? oo000oVar.f10966OooO0oO : oo000oVar.f10966OooO0oO - Math.min(i3, oo000oVar.f10961OooO0O0), o00ooo2);
            return;
        }
        int i4 = oo000oVar.f10966OooO0oO;
        int iOooO0oo = this.f10757OooO0o0[0].OooO0oo(i4);
        while (i < this.f10755OooO0Oo) {
            int iOooO0oo2 = this.f10757OooO0o0[i].OooO0oo(i4);
            if (iOooO0oo2 < iOooO0oo) {
                iOooO0oo = iOooO0oo2;
            }
            i++;
        }
        int i5 = iOooO0oo - oo000oVar.f10966OooO0oO;
        if (i5 < 0) {
            iMin = oo000oVar.f10964OooO0o;
        } else {
            iMin = Math.min(i5, oo000oVar.f10961OooO0O0) + oo000oVar.f10964OooO0o;
        }
        OooOooO(iMin, o00ooo2);
    }

    public final void OooOooO(int i, RecyclerView.o00Ooo o00ooo2) {
        while (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (this.f10756OooO0o.OooO0O0(childAt) > i || this.f10756OooO0o.OooOOO(childAt) > i) {
                return;
            }
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (layoutParams.f10778OooO) {
                for (int i2 = 0; i2 < this.f10755OooO0Oo; i2++) {
                    if (this.f10757OooO0o0[i2].f10794OooO00o.size() == 1) {
                        return;
                    }
                }
                for (int i3 = 0; i3 < this.f10755OooO0Oo; i3++) {
                    this.f10757OooO0o0[i3].OooOOO0();
                }
            } else if (layoutParams.f10779OooO0oo.f10794OooO00o.size() == 1) {
                return;
            } else {
                layoutParams.f10779OooO0oo.OooOOO0();
            }
            removeAndRecycleView(childAt, o00ooo2);
        }
    }

    public final void OooOooo(int i) {
        oo000o oo000oVar = this.f10760OooOO0;
        oo000oVar.f10965OooO0o0 = i;
        oo000oVar.f10963OooO0Oo = this.f10762OooOO0o != (i == -1) ? -1 : 1;
    }

    public final void Oooo000(int i, int i2) {
        for (int i3 = 0; i3 < this.f10755OooO0Oo; i3++) {
            if (!this.f10757OooO0o0[i3].f10794OooO00o.isEmpty()) {
                Oooo00o(this.f10757OooO0o0[i3], i, i2);
            }
        }
    }

    public final void Oooo00O(int i, RecyclerView.o0OOO0o o0ooo0o2) {
        int iOooOO0o;
        int iOooOO0o2;
        int i2;
        oo000o oo000oVar = this.f10760OooOO0;
        boolean z = false;
        oo000oVar.f10961OooO0O0 = 0;
        oo000oVar.f10962OooO0OO = i;
        if (!isSmoothScrolling() || (i2 = o0ooo0o2.f10727OooO00o) == -1) {
            iOooOO0o = 0;
            iOooOO0o2 = 0;
        } else {
            if (this.f10762OooOO0o == (i2 < i)) {
                iOooOO0o = this.f10756OooO0o.OooOO0o();
                iOooOO0o2 = 0;
            } else {
                iOooOO0o2 = this.f10756OooO0o.OooOO0o();
                iOooOO0o = 0;
            }
        }
        if (getClipToPadding()) {
            oo000oVar.f10964OooO0o = this.f10756OooO0o.OooOO0O() - iOooOO0o2;
            oo000oVar.f10966OooO0oO = this.f10756OooO0o.OooO0oO() + iOooOO0o;
        } else {
            oo000oVar.f10966OooO0oO = this.f10756OooO0o.OooO0o() + iOooOO0o;
            oo000oVar.f10964OooO0o = -iOooOO0o2;
        }
        oo000oVar.f10967OooO0oo = false;
        oo000oVar.f10960OooO00o = true;
        if (this.f10756OooO0o.OooO() == 0 && this.f10756OooO0o.OooO0o() == 0) {
            z = true;
        }
        oo000oVar.f10959OooO = z;
    }

    public final void Oooo00o(OooO0OO oooO0OO, int i, int i2) {
        int i3 = oooO0OO.f10797OooO0Oo;
        int i4 = oooO0OO.f10799OooO0o0;
        if (i == -1) {
            int i5 = oooO0OO.f10795OooO0O0;
            if (i5 == Integer.MIN_VALUE) {
                oooO0OO.OooO0OO();
                i5 = oooO0OO.f10795OooO0O0;
            }
            if (i5 + i3 <= i2) {
                this.f10764OooOOO0.set(i4, false);
                return;
            }
            return;
        }
        int i6 = oooO0OO.f10796OooO0OO;
        if (i6 == Integer.MIN_VALUE) {
            oooO0OO.OooO0O0();
            i6 = oooO0OO.f10796OooO0OO;
        }
        if (i6 - i3 >= i2) {
            this.f10764OooOOO0.set(i4, false);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final void assertNotInLayoutOrScroll(String str) {
        if (this.f10772OooOo00 == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final boolean canScrollHorizontally() {
        return this.f10759OooO0oo == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final boolean canScrollVertically() {
        return this.f10759OooO0oo == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final boolean checkLayoutParams(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final void collectAdjacentPrefetchPositions(int i, int i2, RecyclerView.o0OOO0o o0ooo0o2, RecyclerView.Oooo000.OooO0OO oooO0OO) {
        oo000o oo000oVar;
        int iOooO0oo;
        int iOooOO0O;
        if (this.f10759OooO0oo != 0) {
            i = i2;
        }
        if (getChildCount() == 0 || i == 0) {
            return;
        }
        OooOoOO(i, o0ooo0o2);
        int[] iArr = this.f10775OooOoO;
        if (iArr == null || iArr.length < this.f10755OooO0Oo) {
            this.f10775OooOoO = new int[this.f10755OooO0Oo];
        }
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = this.f10755OooO0Oo;
            oo000oVar = this.f10760OooOO0;
            if (i3 >= i5) {
                break;
            }
            if (oo000oVar.f10963OooO0Oo == -1) {
                iOooO0oo = oo000oVar.f10964OooO0o;
                iOooOO0O = this.f10757OooO0o0[i3].OooOO0O(iOooO0oo);
            } else {
                iOooO0oo = this.f10757OooO0o0[i3].OooO0oo(oo000oVar.f10966OooO0oO);
                iOooOO0O = oo000oVar.f10966OooO0oO;
            }
            int i6 = iOooO0oo - iOooOO0O;
            if (i6 >= 0) {
                this.f10775OooOoO[i4] = i6;
                i4++;
            }
            i3++;
        }
        Arrays.sort(this.f10775OooOoO, 0, i4);
        for (int i7 = 0; i7 < i4; i7++) {
            int i8 = oo000oVar.f10962OooO0OO;
            if (!(i8 >= 0 && i8 < o0ooo0o2.OooO0O0())) {
                return;
            }
            ((o0OoOo0.OooO0O0) oooO0OO).OooO00o(oo000oVar.f10962OooO0OO, this.f10775OooOoO[i7]);
            oo000oVar.f10962OooO0OO += oo000oVar.f10963OooO0Oo;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final int computeHorizontalScrollExtent(RecyclerView.o0OOO0o o0ooo0o2) {
        return computeScrollExtent(o0ooo0o2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final int computeHorizontalScrollOffset(RecyclerView.o0OOO0o o0ooo0o2) {
        return computeScrollOffset(o0ooo0o2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final int computeHorizontalScrollRange(RecyclerView.o0OOO0o o0ooo0o2) {
        return computeScrollRange(o0ooo0o2);
    }

    public final int computeScrollExtent(RecyclerView.o0OOO0o o0ooo0o2) {
        if (getChildCount() == 0) {
            return 0;
        }
        o000OOo o000ooo2 = this.f10756OooO0o;
        boolean z = this.f10776OooOoO0;
        return o00000.OooO00o(o0ooo0o2, o000ooo2, OooOOOO(!z), OooOOO(!z), this, this.f10776OooOoO0);
    }

    public final int computeScrollOffset(RecyclerView.o0OOO0o o0ooo0o2) {
        if (getChildCount() == 0) {
            return 0;
        }
        o000OOo o000ooo2 = this.f10756OooO0o;
        boolean z = this.f10776OooOoO0;
        return o00000.OooO0O0(o0ooo0o2, o000ooo2, OooOOOO(!z), OooOOO(!z), this, this.f10776OooOoO0, this.f10762OooOO0o);
    }

    public final int computeScrollRange(RecyclerView.o0OOO0o o0ooo0o2) {
        if (getChildCount() == 0) {
            return 0;
        }
        o000OOo o000ooo2 = this.f10756OooO0o;
        boolean z = this.f10776OooOoO0;
        return o00000.OooO0OO(o0ooo0o2, o000ooo2, OooOOOO(!z), OooOOO(!z), this, this.f10776OooOoO0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o0ooOOo.OooO0O0
    public final PointF computeScrollVectorForPosition(int i) {
        int iOooOO0O = OooOO0O(i);
        PointF pointF = new PointF();
        if (iOooOO0O == 0) {
            return null;
        }
        if (this.f10759OooO0oo == 0) {
            pointF.x = iOooOO0O;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = iOooOO0O;
        }
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final int computeVerticalScrollExtent(RecyclerView.o0OOO0o o0ooo0o2) {
        return computeScrollExtent(o0ooo0o2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final int computeVerticalScrollOffset(RecyclerView.o0OOO0o o0ooo0o2) {
        return computeScrollOffset(o0ooo0o2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final int computeVerticalScrollRange(RecyclerView.o0OOO0o o0ooo0o2) {
        return computeScrollRange(o0ooo0o2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return this.f10759OooO0oo == 0 ? new LayoutParams(-2, -1) : new LayoutParams(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final RecyclerView.LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final boolean isAutoMeasureEnabled() {
        return this.f10768OooOOo0 != 0;
    }

    public final boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final void offsetChildrenHorizontal(int i) {
        super.offsetChildrenHorizontal(i);
        for (int i2 = 0; i2 < this.f10755OooO0Oo; i2++) {
            OooO0OO oooO0OO = this.f10757OooO0o0[i2];
            int i3 = oooO0OO.f10795OooO0O0;
            if (i3 != Integer.MIN_VALUE) {
                oooO0OO.f10795OooO0O0 = i3 + i;
            }
            int i4 = oooO0OO.f10796OooO0OO;
            if (i4 != Integer.MIN_VALUE) {
                oooO0OO.f10796OooO0OO = i4 + i;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final void offsetChildrenVertical(int i) {
        super.offsetChildrenVertical(i);
        for (int i2 = 0; i2 < this.f10755OooO0Oo; i2++) {
            OooO0OO oooO0OO = this.f10757OooO0o0[i2];
            int i3 = oooO0OO.f10795OooO0O0;
            if (i3 != Integer.MIN_VALUE) {
                oooO0OO.f10795OooO0O0 = i3 + i;
            }
            int i4 = oooO0OO.f10796OooO0OO;
            if (i4 != Integer.MIN_VALUE) {
                oooO0OO.f10796OooO0OO = i4 + i;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final void onAdapterChanged(@Nullable RecyclerView.Adapter adapter, @Nullable RecyclerView.Adapter adapter2) {
        this.f10766OooOOOo.OooO0O0();
        for (int i = 0; i < this.f10755OooO0Oo; i++) {
            this.f10757OooO0o0[i].OooO0Oo();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.o00Ooo o00ooo2) {
        super.onDetachedFromWindow(recyclerView, o00ooo2);
        removeCallbacks(this.f10777OooOoOO);
        for (int i = 0; i < this.f10755OooO0Oo; i++) {
            this.f10757OooO0o0[i].OooO0Oo();
        }
        recyclerView.requestLayout();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0030  */
    /* JADX WARN: Code duplicated, block: B:30:0x003d  */
    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    @Nullable
    public final View onFocusSearchFailed(View view, int i, RecyclerView.o00Ooo o00ooo2, RecyclerView.o0OOO0o o0ooo0o2) {
        View viewFindContainingItemView;
        int i2;
        View viewOooO;
        if (getChildCount() == 0 || (viewFindContainingItemView = findContainingItemView(view)) == null) {
            return null;
        }
        resolveShouldLayoutReverse();
        if (i != 1) {
            if (i != 2) {
                if (i != 17) {
                    if (i != 33) {
                        if (i == 66 ? this.f10759OooO0oo == 0 : !(i != 130 || this.f10759OooO0oo != 1)) {
                            i2 = 1;
                        }
                    } else if (this.f10759OooO0oo == 1) {
                        i2 = -1;
                    }
                    i2 = Integer.MIN_VALUE;
                } else if (this.f10759OooO0oo == 0) {
                    i2 = -1;
                } else {
                    i2 = Integer.MIN_VALUE;
                }
            } else if (this.f10759OooO0oo != 1 && isLayoutRTL()) {
                i2 = -1;
            } else {
                i2 = 1;
            }
        } else if (this.f10759OooO0oo != 1 && isLayoutRTL()) {
            i2 = 1;
        } else {
            i2 = -1;
        }
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        LayoutParams layoutParams = (LayoutParams) viewFindContainingItemView.getLayoutParams();
        boolean z = layoutParams.f10778OooO;
        OooO0OO oooO0OO = layoutParams.f10779OooO0oo;
        int iOooOOoo = i2 == 1 ? OooOOoo() : OooOOo();
        Oooo00O(iOooOOoo, o0ooo0o2);
        OooOooo(i2);
        oo000o oo000oVar = this.f10760OooOO0;
        oo000oVar.f10962OooO0OO = oo000oVar.f10963OooO0Oo + iOooOOoo;
        oo000oVar.f10961OooO0O0 = (int) (this.f10756OooO0o.OooOO0o() * 0.33333334f);
        oo000oVar.f10967OooO0oo = true;
        oo000oVar.f10960OooO00o = false;
        OooOOO0(o00ooo2, oo000oVar, o0ooo0o2);
        this.f10767OooOOo = this.f10762OooOO0o;
        if (!z && (viewOooO = oooO0OO.OooO(iOooOOoo, i2)) != null && viewOooO != viewFindContainingItemView) {
            return viewOooO;
        }
        if (OooOoO(i2)) {
            for (int i3 = this.f10755OooO0Oo - 1; i3 >= 0; i3--) {
                View viewOooO2 = this.f10757OooO0o0[i3].OooO(iOooOOoo, i2);
                if (viewOooO2 != null && viewOooO2 != viewFindContainingItemView) {
                    return viewOooO2;
                }
            }
        } else {
            for (int i4 = 0; i4 < this.f10755OooO0Oo; i4++) {
                View viewOooO3 = this.f10757OooO0o0[i4].OooO(iOooOOoo, i2);
                if (viewOooO3 != null && viewOooO3 != viewFindContainingItemView) {
                    return viewOooO3;
                }
            }
        }
        boolean z2 = (this.f10761OooOO0O ^ true) == (i2 == -1);
        if (!z) {
            View viewFindViewByPosition = findViewByPosition(z2 ? oooO0OO.OooO0o0() : oooO0OO.OooO0o());
            if (viewFindViewByPosition != null && viewFindViewByPosition != viewFindContainingItemView) {
                return viewFindViewByPosition;
            }
        }
        if (OooOoO(i2)) {
            for (int i5 = this.f10755OooO0Oo - 1; i5 >= 0; i5--) {
                if (i5 != oooO0OO.f10799OooO0o0) {
                    View viewFindViewByPosition2 = findViewByPosition(z2 ? this.f10757OooO0o0[i5].OooO0o0() : this.f10757OooO0o0[i5].OooO0o());
                    if (viewFindViewByPosition2 != null && viewFindViewByPosition2 != viewFindContainingItemView) {
                        return viewFindViewByPosition2;
                    }
                }
            }
        } else {
            for (int i6 = 0; i6 < this.f10755OooO0Oo; i6++) {
                View viewFindViewByPosition3 = findViewByPosition(z2 ? this.f10757OooO0o0[i6].OooO0o0() : this.f10757OooO0o0[i6].OooO0o());
                if (viewFindViewByPosition3 != null && viewFindViewByPosition3 != viewFindContainingItemView) {
                    return viewFindViewByPosition3;
                }
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            View viewOooOOOO = OooOOOO(false);
            View viewOooOOO = OooOOO(false);
            if (viewOooOOOO == null || viewOooOOO == null) {
                return;
            }
            int position = getPosition(viewOooOOOO);
            int position2 = getPosition(viewOooOOO);
            if (position < position2) {
                accessibilityEvent.setFromIndex(position);
                accessibilityEvent.setToIndex(position2);
            } else {
                accessibilityEvent.setFromIndex(position2);
                accessibilityEvent.setToIndex(position);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
        OooOo0O(i, i2, 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final void onItemsChanged(RecyclerView recyclerView) {
        this.f10766OooOOOo.OooO0O0();
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final void onItemsMoved(RecyclerView recyclerView, int i, int i2, int i3) {
        OooOo0O(i, i2, 8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        OooOo0O(i, i2, 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final void onItemsUpdated(RecyclerView recyclerView, int i, int i2, Object obj) {
        OooOo0O(i, i2, 4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final void onLayoutChildren(RecyclerView.o00Ooo o00ooo2, RecyclerView.o0OOO0o o0ooo0o2) {
        OooOoO0(o00ooo2, o0ooo0o2, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final void onLayoutCompleted(RecyclerView.o0OOO0o o0ooo0o2) {
        super.onLayoutCompleted(o0ooo0o2);
        this.f10763OooOOO = -1;
        this.f10765OooOOOO = Integer.MIN_VALUE;
        this.f10772OooOo00 = null;
        this.f10774OooOo0o.OooO00o();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.f10772OooOo00 = savedState;
            if (this.f10763OooOOO != -1) {
                savedState.f10804OooO0oO = null;
                savedState.f10802OooO0o = 0;
                savedState.f10801OooO0Oo = -1;
                savedState.f10803OooO0o0 = -1;
                savedState.f10804OooO0oO = null;
                savedState.f10802OooO0o = 0;
                savedState.f10805OooO0oo = 0;
                savedState.f10800OooO = null;
                savedState.f10806OooOO0 = null;
            }
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final Parcelable onSaveInstanceState() {
        int iOooOO0O;
        int iOooOO0O2;
        int[] iArr;
        SavedState savedState = this.f10772OooOo00;
        if (savedState != null) {
            return new SavedState(savedState);
        }
        SavedState savedState2 = new SavedState();
        savedState2.f10807OooOO0O = this.f10761OooOO0O;
        savedState2.f10808OooOO0o = this.f10767OooOOo;
        savedState2.f10809OooOOO0 = this.f10769OooOOoo;
        LazySpanLookup lazySpanLookup = this.f10766OooOOOo;
        if (lazySpanLookup == null || (iArr = lazySpanLookup.f10780OooO00o) == null) {
            savedState2.f10805OooO0oo = 0;
        } else {
            savedState2.f10800OooO = iArr;
            savedState2.f10805OooO0oo = iArr.length;
            savedState2.f10806OooOO0 = lazySpanLookup.f10781OooO0O0;
        }
        if (getChildCount() > 0) {
            savedState2.f10801OooO0Oo = this.f10767OooOOo ? OooOOoo() : OooOOo();
            View viewOooOOO = this.f10762OooOO0o ? OooOOO(true) : OooOOOO(true);
            savedState2.f10803OooO0o0 = viewOooOOO != null ? getPosition(viewOooOOO) : -1;
            int i = this.f10755OooO0Oo;
            savedState2.f10802OooO0o = i;
            savedState2.f10804OooO0oO = new int[i];
            for (int i2 = 0; i2 < this.f10755OooO0Oo; i2++) {
                if (this.f10767OooOOo) {
                    iOooOO0O = this.f10757OooO0o0[i2].OooO0oo(Integer.MIN_VALUE);
                    if (iOooOO0O != Integer.MIN_VALUE) {
                        iOooOO0O2 = this.f10756OooO0o.OooO0oO();
                        iOooOO0O -= iOooOO0O2;
                    }
                } else {
                    iOooOO0O = this.f10757OooO0o0[i2].OooOO0O(Integer.MIN_VALUE);
                    if (iOooOO0O != Integer.MIN_VALUE) {
                        iOooOO0O2 = this.f10756OooO0o.OooOO0O();
                        iOooOO0O -= iOooOO0O2;
                    }
                }
                savedState2.f10804OooO0oO[i2] = iOooOO0O;
            }
        } else {
            savedState2.f10801OooO0Oo = -1;
            savedState2.f10803OooO0o0 = -1;
            savedState2.f10802OooO0o = 0;
        }
        return savedState2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final void onScrollStateChanged(int i) {
        if (i == 0) {
            OooOO0o();
        }
    }

    public final void resolveShouldLayoutReverse() {
        if (this.f10759OooO0oo == 1 || !isLayoutRTL()) {
            this.f10762OooOO0o = this.f10761OooOO0O;
        } else {
            this.f10762OooOO0o = !this.f10761OooOO0O;
        }
    }

    public final int scrollBy(int i, RecyclerView.o00Ooo o00ooo2, RecyclerView.o0OOO0o o0ooo0o2) {
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        OooOoOO(i, o0ooo0o2);
        oo000o oo000oVar = this.f10760OooOO0;
        int iOooOOO0 = OooOOO0(o00ooo2, oo000oVar, o0ooo0o2);
        if (oo000oVar.f10961OooO0O0 >= iOooOOO0) {
            i = i < 0 ? -iOooOOO0 : iOooOOO0;
        }
        this.f10756OooO0o.OooOOOo(-i);
        this.f10767OooOOo = this.f10762OooOO0o;
        oo000oVar.f10961OooO0O0 = 0;
        OooOoo0(o00ooo2, oo000oVar);
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final int scrollHorizontallyBy(int i, RecyclerView.o00Ooo o00ooo2, RecyclerView.o0OOO0o o0ooo0o2) {
        return scrollBy(i, o00ooo2, o0ooo0o2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final void scrollToPosition(int i) {
        SavedState savedState = this.f10772OooOo00;
        if (savedState != null && savedState.f10801OooO0Oo != i) {
            savedState.f10804OooO0oO = null;
            savedState.f10802OooO0o = 0;
            savedState.f10801OooO0Oo = -1;
            savedState.f10803OooO0o0 = -1;
        }
        this.f10763OooOOO = i;
        this.f10765OooOOOO = Integer.MIN_VALUE;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final int scrollVerticallyBy(int i, RecyclerView.o00Ooo o00ooo2, RecyclerView.o0OOO0o o0ooo0o2) {
        return scrollBy(i, o00ooo2, o0ooo0o2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final void setMeasuredDimension(Rect rect, int i, int i2) {
        int iChooseSize;
        int iChooseSize2;
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.f10759OooO0oo == 1) {
            iChooseSize2 = RecyclerView.Oooo000.chooseSize(i2, rect.height() + paddingBottom, getMinimumHeight());
            iChooseSize = RecyclerView.Oooo000.chooseSize(i, (this.f10754OooO * this.f10755OooO0Oo) + paddingRight, getMinimumWidth());
        } else {
            iChooseSize = RecyclerView.Oooo000.chooseSize(i, rect.width() + paddingRight, getMinimumWidth());
            iChooseSize2 = RecyclerView.Oooo000.chooseSize(i2, (this.f10754OooO * this.f10755OooO0Oo) + paddingBottom, getMinimumHeight());
        }
        setMeasuredDimension(iChooseSize, iChooseSize2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.o0OOO0o o0ooo0o2, int i) {
        o00oO0o o00oo0o2 = new o00oO0o(recyclerView.getContext());
        o00oo0o2.setTargetPosition(i);
        startSmoothScroll(o00oo0o2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final boolean supportsPredictiveItemAnimations() {
        return this.f10772OooOo00 == null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final RecyclerView.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public static class LazySpanLookup {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int[] f10780OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public List<FullSpanItem> f10781OooO0O0;

        public final void OooO(int i, int i2) {
            int[] iArr = this.f10780OooO00o;
            if (iArr == null || i >= iArr.length) {
                return;
            }
            int i3 = i + i2;
            OooO0OO(i3);
            int[] iArr2 = this.f10780OooO00o;
            System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
            int[] iArr3 = this.f10780OooO00o;
            Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
            List<FullSpanItem> list = this.f10781OooO0O0;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.f10781OooO0O0.get(size);
                int i4 = fullSpanItem.f10782OooO0Oo;
                if (i4 >= i) {
                    if (i4 < i3) {
                        this.f10781OooO0O0.remove(size);
                    } else {
                        fullSpanItem.f10782OooO0Oo = i4 - i2;
                    }
                }
            }
        }

        public final void OooO00o(FullSpanItem fullSpanItem) {
            if (this.f10781OooO0O0 == null) {
                this.f10781OooO0O0 = new ArrayList();
            }
            int size = this.f10781OooO0O0.size();
            for (int i = 0; i < size; i++) {
                FullSpanItem fullSpanItem2 = this.f10781OooO0O0.get(i);
                if (fullSpanItem2.f10782OooO0Oo == fullSpanItem.f10782OooO0Oo) {
                    this.f10781OooO0O0.remove(i);
                }
                if (fullSpanItem2.f10782OooO0Oo >= fullSpanItem.f10782OooO0Oo) {
                    this.f10781OooO0O0.add(i, fullSpanItem);
                    return;
                }
            }
            this.f10781OooO0O0.add(fullSpanItem);
        }

        public final void OooO0O0() {
            int[] iArr = this.f10780OooO00o;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f10781OooO0O0 = null;
        }

        public final void OooO0OO(int i) {
            int[] iArr = this.f10780OooO00o;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i, 10) + 1];
                this.f10780OooO00o = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i >= iArr.length) {
                int length = iArr.length;
                while (length <= i) {
                    length *= 2;
                }
                int[] iArr3 = new int[length];
                this.f10780OooO00o = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f10780OooO00o;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        public final void OooO0Oo(int i) {
            List<FullSpanItem> list = this.f10781OooO0O0;
            if (list != null) {
                int size = list.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    } else if (this.f10781OooO0O0.get(size).f10782OooO0Oo >= i) {
                        this.f10781OooO0O0.remove(size);
                    }
                }
            }
            OooO0oO(i);
        }

        public final FullSpanItem OooO0o(int i) {
            List<FullSpanItem> list = this.f10781OooO0O0;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.f10781OooO0O0.get(size);
                if (fullSpanItem.f10782OooO0Oo == i) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        public final FullSpanItem OooO0o0(int i, int i2, int i3) {
            List<FullSpanItem> list = this.f10781OooO0O0;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                FullSpanItem fullSpanItem = this.f10781OooO0O0.get(i4);
                int i5 = fullSpanItem.f10782OooO0Oo;
                if (i5 >= i2) {
                    return null;
                }
                if (i5 >= i && (i3 == 0 || fullSpanItem.f10784OooO0o0 == i3 || fullSpanItem.f10785OooO0oO)) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x000e  */
        public final int OooO0oO(int i) {
            int i2;
            int[] iArr = this.f10780OooO00o;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            if (this.f10781OooO0O0 != null) {
                FullSpanItem fullSpanItemOooO0o = OooO0o(i);
                if (fullSpanItemOooO0o != null) {
                    this.f10781OooO0O0.remove(fullSpanItemOooO0o);
                }
                int size = this.f10781OooO0O0.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        i3 = -1;
                        break;
                    }
                    if (this.f10781OooO0O0.get(i3).f10782OooO0Oo >= i) {
                        break;
                    }
                    i3++;
                }
                if (i3 != -1) {
                    FullSpanItem fullSpanItem = this.f10781OooO0O0.get(i3);
                    this.f10781OooO0O0.remove(i3);
                    i2 = fullSpanItem.f10782OooO0Oo;
                } else {
                    i2 = -1;
                }
            } else {
                i2 = -1;
            }
            if (i2 == -1) {
                int[] iArr2 = this.f10780OooO00o;
                Arrays.fill(iArr2, i, iArr2.length, -1);
                return this.f10780OooO00o.length;
            }
            int iMin = Math.min(i2 + 1, this.f10780OooO00o.length);
            Arrays.fill(this.f10780OooO00o, i, iMin, -1);
            return iMin;
        }

        public final void OooO0oo(int i, int i2) {
            int[] iArr = this.f10780OooO00o;
            if (iArr == null || i >= iArr.length) {
                return;
            }
            int i3 = i + i2;
            OooO0OO(i3);
            int[] iArr2 = this.f10780OooO00o;
            System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
            Arrays.fill(this.f10780OooO00o, i, i3, -1);
            List<FullSpanItem> list = this.f10781OooO0O0;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.f10781OooO0O0.get(size);
                int i4 = fullSpanItem.f10782OooO0Oo;
                if (i4 >= i) {
                    fullSpanItem.f10782OooO0Oo = i4 + i2;
                }
            }
        }

        @SuppressLint({"BanParcelableUsage"})
        public static class FullSpanItem implements Parcelable {
            public static final Parcelable.Creator<FullSpanItem> CREATOR = new OooO00o();

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public int f10782OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public int[] f10783OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public int f10784OooO0o0;

            /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
            public boolean f10785OooO0oO;

            public class OooO00o implements Parcelable.Creator<FullSpanItem> {
                @Override // android.os.Parcelable.Creator
                public final FullSpanItem createFromParcel(Parcel parcel) {
                    return new FullSpanItem(parcel);
                }

                @Override // android.os.Parcelable.Creator
                public final FullSpanItem[] newArray(int i) {
                    return new FullSpanItem[i];
                }
            }

            public FullSpanItem(Parcel parcel) {
                this.f10782OooO0Oo = parcel.readInt();
                this.f10784OooO0o0 = parcel.readInt();
                this.f10785OooO0oO = parcel.readInt() == 1;
                int i = parcel.readInt();
                if (i > 0) {
                    int[] iArr = new int[i];
                    this.f10783OooO0o = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final String toString() {
                return "FullSpanItem{mPosition=" + this.f10782OooO0Oo + ", mGapDir=" + this.f10784OooO0o0 + ", mHasUnwantedGapAfter=" + this.f10785OooO0oO + ", mGapPerSpan=" + Arrays.toString(this.f10783OooO0o) + '}';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.f10782OooO0Oo);
                parcel.writeInt(this.f10784OooO0o0);
                parcel.writeInt(this.f10785OooO0oO ? 1 : 0);
                int[] iArr = this.f10783OooO0o;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.f10783OooO0o);
                }
            }

            public FullSpanItem() {
            }
        }
    }
}
