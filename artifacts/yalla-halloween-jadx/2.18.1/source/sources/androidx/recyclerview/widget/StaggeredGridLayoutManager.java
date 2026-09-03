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
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class StaggeredGridLayoutManager extends RecyclerView.Oooo000 implements RecyclerView.o0ooOOo.OooO0O0 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @NonNull
    public o0O0O00 f9077Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f9078Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public OooO0OO[] f9079Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @NonNull
    public o0O0O00 f9080Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public boolean f9081OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public int f9082OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public int f9083OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    @NonNull
    public final o00Ooo f9084OoooO0O;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public boolean f9090OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public boolean f9091Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public SavedState f9092Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public int f9093OooooO0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public int[] f9098OoooooO;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public BitSet f9100o000oOoO;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public boolean f9085OoooOO0 = false;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public int f9086OoooOOO = -1;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public int f9087OoooOOo = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public LazySpanLookup f9088OoooOo0 = new LazySpanLookup();

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public int f9089OoooOoO = 2;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public final Rect f9094OooooOO = new Rect();

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public final OooO0O0 f9095OooooOo = new OooO0O0();

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public boolean f9097Oooooo0 = false;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public boolean f9096Oooooo = true;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public final OooO00o f9099Ooooooo = new OooO00o();

    public static class LayoutParams extends RecyclerView.LayoutParams {

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public boolean f9101OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public OooO0OO f9102OoooO00;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
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
        public int f9110OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f9111OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public boolean f9112OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public boolean f9113OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int[] f9114OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public boolean f9115OooO0o0;

        public OooO0O0() {
            OooO0O0();
        }

        public final void OooO00o() {
            this.f9111OooO0O0 = this.f9112OooO0OO ? StaggeredGridLayoutManager.this.f9080Oooo0oo.OooO0oO() : StaggeredGridLayoutManager.this.f9080Oooo0oo.OooOO0O();
        }

        public final void OooO0O0() {
            this.f9110OooO00o = -1;
            this.f9111OooO0O0 = Integer.MIN_VALUE;
            this.f9112OooO0OO = false;
            this.f9113OooO0Oo = false;
            this.f9115OooO0o0 = false;
            int[] iArr = this.f9114OooO0o;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }
    }

    public class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public ArrayList<View> f9117OooO00o = new ArrayList<>();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f9118OooO0O0 = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f9119OooO0OO = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f9120OooO0Oo = 0;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final int f9122OooO0o0;

        public OooO0OO(int i) {
            this.f9122OooO0o0 = i;
        }

        public final int OooO(int i) {
            int i2 = this.f9119OooO0OO;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f9117OooO00o.size() == 0) {
                return i;
            }
            OooO0O0();
            return this.f9119OooO0OO;
        }

        public final void OooO00o(View view) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            layoutParams.f9102OoooO00 = this;
            this.f9117OooO00o.add(view);
            this.f9119OooO0OO = Integer.MIN_VALUE;
            if (this.f9117OooO00o.size() == 1) {
                this.f9118OooO0O0 = Integer.MIN_VALUE;
            }
            if (layoutParams.OooO0OO() || layoutParams.OooO0O0()) {
                this.f9120OooO0Oo = StaggeredGridLayoutManager.this.f9080Oooo0oo.OooO0OO(view) + this.f9120OooO0Oo;
            }
        }

        public final void OooO0O0() {
            LazySpanLookup.FullSpanItem fullSpanItemOooO0o;
            ArrayList<View> arrayList = this.f9117OooO00o;
            View view = arrayList.get(arrayList.size() - 1);
            LayoutParams layoutParamsOooOO0O = OooOO0O(view);
            this.f9119OooO0OO = StaggeredGridLayoutManager.this.f9080Oooo0oo.OooO0O0(view);
            if (layoutParamsOooOO0O.f9101OoooO0 && (fullSpanItemOooO0o = StaggeredGridLayoutManager.this.f9088OoooOo0.OooO0o(layoutParamsOooOO0O.OooO00o())) != null && fullSpanItemOooO0o.f9107Oooo0oO == 1) {
                int i = this.f9119OooO0OO;
                int i2 = this.f9122OooO0o0;
                int[] iArr = fullSpanItemOooO0o.f9108Oooo0oo;
                this.f9119OooO0OO = i + (iArr == null ? 0 : iArr[i2]);
            }
        }

        public final void OooO0OO() {
            LazySpanLookup.FullSpanItem fullSpanItemOooO0o;
            View view = this.f9117OooO00o.get(0);
            LayoutParams layoutParamsOooOO0O = OooOO0O(view);
            this.f9118OooO0O0 = StaggeredGridLayoutManager.this.f9080Oooo0oo.OooO0o0(view);
            if (layoutParamsOooOO0O.f9101OoooO0 && (fullSpanItemOooO0o = StaggeredGridLayoutManager.this.f9088OoooOo0.OooO0o(layoutParamsOooOO0O.OooO00o())) != null && fullSpanItemOooO0o.f9107Oooo0oO == -1) {
                int i = this.f9118OooO0O0;
                int i2 = this.f9122OooO0o0;
                int[] iArr = fullSpanItemOooO0o.f9108Oooo0oo;
                this.f9118OooO0O0 = i - (iArr != null ? iArr[i2] : 0);
            }
        }

        public final void OooO0Oo() {
            this.f9117OooO00o.clear();
            this.f9118OooO0O0 = Integer.MIN_VALUE;
            this.f9119OooO0OO = Integer.MIN_VALUE;
            this.f9120OooO0Oo = 0;
        }

        public final int OooO0o() {
            return StaggeredGridLayoutManager.this.f9081OoooO ? OooO0oo(0, this.f9117OooO00o.size()) : OooO0oo(this.f9117OooO00o.size() - 1, -1);
        }

        public final int OooO0o0() {
            return StaggeredGridLayoutManager.this.f9081OoooO ? OooO0oo(this.f9117OooO00o.size() - 1, -1) : OooO0oo(0, this.f9117OooO00o.size());
        }

        public final int OooO0oO(int i, int i2, boolean z, boolean z2, boolean z3) {
            int iOooOO0O = StaggeredGridLayoutManager.this.f9080Oooo0oo.OooOO0O();
            int iOooO0oO = StaggeredGridLayoutManager.this.f9080Oooo0oo.OooO0oO();
            int i3 = i2 > i ? 1 : -1;
            while (i != i2) {
                View view = this.f9117OooO00o.get(i);
                int iOooO0o0 = StaggeredGridLayoutManager.this.f9080Oooo0oo.OooO0o0(view);
                int iOooO0O0 = StaggeredGridLayoutManager.this.f9080Oooo0oo.OooO0O0(view);
                boolean z4 = false;
                boolean z5 = !z3 ? iOooO0o0 >= iOooO0oO : iOooO0o0 > iOooO0oO;
                if (!z3 ? iOooO0O0 > iOooOO0O : iOooO0O0 >= iOooOO0O) {
                    z4 = true;
                }
                if (z5 && z4) {
                    if (z && z2) {
                        if (iOooO0o0 >= iOooOO0O && iOooO0O0 <= iOooO0oO) {
                            return StaggeredGridLayoutManager.this.getPosition(view);
                        }
                    } else {
                        if (z2) {
                            return StaggeredGridLayoutManager.this.getPosition(view);
                        }
                        if (iOooO0o0 < iOooOO0O || iOooO0O0 > iOooO0oO) {
                            return StaggeredGridLayoutManager.this.getPosition(view);
                        }
                    }
                }
                i += i3;
            }
            return -1;
        }

        public final int OooO0oo(int i, int i2) {
            return OooO0oO(i, i2, false, false, true);
        }

        public final View OooOO0(int i, int i2) {
            View view = null;
            if (i2 != -1) {
                int size = this.f9117OooO00o.size() - 1;
                while (size >= 0) {
                    View view2 = this.f9117OooO00o.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.f9081OoooO && staggeredGridLayoutManager.getPosition(view2) >= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.f9081OoooO && staggeredGridLayoutManager2.getPosition(view2) <= i) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.f9117OooO00o.size();
                int i3 = 0;
                while (i3 < size2) {
                    View view3 = this.f9117OooO00o.get(i3);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.f9081OoooO && staggeredGridLayoutManager3.getPosition(view3) <= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.f9081OoooO && staggeredGridLayoutManager4.getPosition(view3) >= i) || !view3.hasFocusable()) {
                        break;
                    }
                    i3++;
                    view = view3;
                }
            }
            return view;
        }

        public final LayoutParams OooOO0O(View view) {
            return (LayoutParams) view.getLayoutParams();
        }

        public final int OooOO0o(int i) {
            int i2 = this.f9118OooO0O0;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f9117OooO00o.size() == 0) {
                return i;
            }
            OooO0OO();
            return this.f9118OooO0O0;
        }

        public final void OooOOO() {
            View viewRemove = this.f9117OooO00o.remove(0);
            LayoutParams layoutParamsOooOO0O = OooOO0O(viewRemove);
            layoutParamsOooOO0O.f9102OoooO00 = null;
            if (this.f9117OooO00o.size() == 0) {
                this.f9119OooO0OO = Integer.MIN_VALUE;
            }
            if (layoutParamsOooOO0O.OooO0OO() || layoutParamsOooOO0O.OooO0O0()) {
                this.f9120OooO0Oo -= StaggeredGridLayoutManager.this.f9080Oooo0oo.OooO0OO(viewRemove);
            }
            this.f9118OooO0O0 = Integer.MIN_VALUE;
        }

        public final void OooOOO0() {
            int size = this.f9117OooO00o.size();
            View viewRemove = this.f9117OooO00o.remove(size - 1);
            LayoutParams layoutParamsOooOO0O = OooOO0O(viewRemove);
            layoutParamsOooOO0O.f9102OoooO00 = null;
            if (layoutParamsOooOO0O.OooO0OO() || layoutParamsOooOO0O.OooO0O0()) {
                this.f9120OooO0Oo -= StaggeredGridLayoutManager.this.f9080Oooo0oo.OooO0OO(viewRemove);
            }
            if (size == 1) {
                this.f9118OooO0O0 = Integer.MIN_VALUE;
            }
            this.f9119OooO0OO = Integer.MIN_VALUE;
        }

        public final void OooOOOO(View view) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            layoutParams.f9102OoooO00 = this;
            this.f9117OooO00o.add(0, view);
            this.f9118OooO0O0 = Integer.MIN_VALUE;
            if (this.f9117OooO00o.size() == 1) {
                this.f9119OooO0OO = Integer.MIN_VALUE;
            }
            if (layoutParams.OooO0OO() || layoutParams.OooO0O0()) {
                this.f9120OooO0Oo = StaggeredGridLayoutManager.this.f9080Oooo0oo.OooO0OO(view) + this.f9120OooO0Oo;
            }
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new OooO00o();

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public int[] f9123Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f9124Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public int f9125Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f9126Oooo0oo;

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public boolean f9127OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public int[] f9128OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public int f9129OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public List<LazySpanLookup.FullSpanItem> f9130OoooO0O;

        /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
        public boolean f9131OoooOO0;

        /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
        public boolean f9132o000oOoO;

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
            parcel.writeInt(this.f9124Oooo0o);
            parcel.writeInt(this.f9125Oooo0oO);
            parcel.writeInt(this.f9126Oooo0oo);
            if (this.f9126Oooo0oo > 0) {
                parcel.writeIntArray(this.f9123Oooo);
            }
            parcel.writeInt(this.f9129OoooO00);
            if (this.f9129OoooO00 > 0) {
                parcel.writeIntArray(this.f9128OoooO0);
            }
            parcel.writeInt(this.f9127OoooO ? 1 : 0);
            parcel.writeInt(this.f9131OoooOO0 ? 1 : 0);
            parcel.writeInt(this.f9132o000oOoO ? 1 : 0);
            parcel.writeList(this.f9130OoooO0O);
        }

        public SavedState(Parcel parcel) {
            this.f9124Oooo0o = parcel.readInt();
            this.f9125Oooo0oO = parcel.readInt();
            int i = parcel.readInt();
            this.f9126Oooo0oo = i;
            if (i > 0) {
                int[] iArr = new int[i];
                this.f9123Oooo = iArr;
                parcel.readIntArray(iArr);
            }
            int i2 = parcel.readInt();
            this.f9129OoooO00 = i2;
            if (i2 > 0) {
                int[] iArr2 = new int[i2];
                this.f9128OoooO0 = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.f9127OoooO = parcel.readInt() == 1;
            this.f9131OoooOO0 = parcel.readInt() == 1;
            this.f9132o000oOoO = parcel.readInt() == 1;
            this.f9130OoooO0O = parcel.readArrayList(LazySpanLookup.FullSpanItem.class.getClassLoader());
        }

        public SavedState(SavedState savedState) {
            this.f9126Oooo0oo = savedState.f9126Oooo0oo;
            this.f9124Oooo0o = savedState.f9124Oooo0o;
            this.f9125Oooo0oO = savedState.f9125Oooo0oO;
            this.f9123Oooo = savedState.f9123Oooo;
            this.f9129OoooO00 = savedState.f9129OoooO00;
            this.f9128OoooO0 = savedState.f9128OoooO0;
            this.f9127OoooO = savedState.f9127OoooO;
            this.f9131OoooOO0 = savedState.f9131OoooOO0;
            this.f9132o000oOoO = savedState.f9132o000oOoO;
            this.f9130OoooO0O = savedState.f9130OoooO0O;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f9078Oooo0o = -1;
        this.f9081OoooO = false;
        RecyclerView.Oooo000.OooO0o properties = RecyclerView.Oooo000.getProperties(context, attributeSet, i, i2);
        int i3 = properties.f9029OooO00o;
        if (i3 != 0 && i3 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        assertNotInLayoutOrScroll(null);
        if (i3 != this.f9083OoooO00) {
            this.f9083OoooO00 = i3;
            o0O0O00 o0o0o00 = this.f9080Oooo0oo;
            this.f9080Oooo0oo = this.f9077Oooo;
            this.f9077Oooo = o0o0o00;
            requestLayout();
        }
        int i4 = properties.f9030OooO0O0;
        assertNotInLayoutOrScroll(null);
        if (i4 != this.f9078Oooo0o) {
            this.f9088OoooOo0.OooO0O0();
            requestLayout();
            this.f9078Oooo0o = i4;
            this.f9100o000oOoO = new BitSet(this.f9078Oooo0o);
            this.f9079Oooo0oO = new OooO0OO[this.f9078Oooo0o];
            for (int i5 = 0; i5 < this.f9078Oooo0o; i5++) {
                this.f9079Oooo0oO[i5] = new OooO0OO(i5);
            }
            requestLayout();
        }
        boolean z = properties.f9031OooO0OO;
        assertNotInLayoutOrScroll(null);
        SavedState savedState = this.f9092Ooooo0o;
        if (savedState != null && savedState.f9127OoooO != z) {
            savedState.f9127OoooO = z;
        }
        this.f9081OoooO = z;
        requestLayout();
        this.f9084OoooO0O = new o00Ooo();
        this.f9080Oooo0oo = o0O0O00.OooO00o(this, this.f9083OoooO00);
        this.f9077Oooo = o0O0O00.OooO00o(this, 1 - this.f9083OoooO00);
    }

    public final int OooOO0O(int i) {
        if (getChildCount() == 0) {
            return this.f9085OoooOO0 ? 1 : -1;
        }
        return (i < OooOOo()) != this.f9085OoooOO0 ? -1 : 1;
    }

    public final boolean OooOO0o() {
        int iOooOOo;
        int iOooOOoo;
        if (getChildCount() == 0 || this.f9089OoooOoO == 0 || !isAttachedToWindow()) {
            return false;
        }
        if (this.f9085OoooOO0) {
            iOooOOo = OooOOoo();
            iOooOOoo = OooOOo();
        } else {
            iOooOOo = OooOOo();
            iOooOOoo = OooOOoo();
        }
        if (iOooOOo == 0 && OooOo0o() != null) {
            this.f9088OoooOo0.OooO0O0();
            requestSimpleAnimationsInNextLayout();
            requestLayout();
            return true;
        }
        if (!this.f9097Oooooo0) {
            return false;
        }
        int i = this.f9085OoooOO0 ? -1 : 1;
        int i2 = iOooOOoo + 1;
        LazySpanLookup.FullSpanItem fullSpanItemOooO0o0 = this.f9088OoooOo0.OooO0o0(iOooOOo, i2, i);
        if (fullSpanItemOooO0o0 == null) {
            this.f9097Oooooo0 = false;
            this.f9088OoooOo0.OooO0Oo(i2);
            return false;
        }
        LazySpanLookup.FullSpanItem fullSpanItemOooO0o1 = this.f9088OoooOo0.OooO0o0(iOooOOo, fullSpanItemOooO0o0.f9106Oooo0o, i * (-1));
        if (fullSpanItemOooO0o1 == null) {
            this.f9088OoooOo0.OooO0Oo(fullSpanItemOooO0o0.f9106Oooo0o);
        } else {
            this.f9088OoooOo0.OooO0Oo(fullSpanItemOooO0o1.f9106Oooo0o + 1);
        }
        requestSimpleAnimationsInNextLayout();
        requestLayout();
        return true;
    }

    public final View OooOOO(boolean z) {
        int iOooOO0O = this.f9080Oooo0oo.OooOO0O();
        int iOooO0oO = this.f9080Oooo0oo.OooO0oO();
        View view = null;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            int iOooO0o0 = this.f9080Oooo0oo.OooO0o0(childAt);
            int iOooO0O0 = this.f9080Oooo0oo.OooO0O0(childAt);
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

    public final int OooOOO0(RecyclerView.o00Ooo o00ooo2, o00Ooo o00ooo3, RecyclerView.o0OOO0o o0ooo0o2) {
        OooO0OO oooO0OO;
        int i;
        int i2;
        int iOooO0OO;
        int iOooO0OO2;
        LayoutParams layoutParams;
        boolean z;
        boolean z2;
        boolean z3;
        int i3;
        int i4;
        int i5;
        RecyclerView.o00Ooo o00ooo4 = o00ooo2;
        char c = 0;
        this.f9100o000oOoO.set(0, this.f9078Oooo0o, true);
        int i6 = this.f9084OoooO0O.f9185OooO ? o00ooo3.f9191OooO0o0 == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : o00ooo3.f9191OooO0o0 == 1 ? o00ooo3.f9192OooO0oO + o00ooo3.f9187OooO0O0 : o00ooo3.f9190OooO0o - o00ooo3.f9187OooO0O0;
        Oooo000(o00ooo3.f9191OooO0o0, i6);
        int iOooO0oO = this.f9085OoooOO0 ? this.f9080Oooo0oo.OooO0oO() : this.f9080Oooo0oo.OooOO0O();
        boolean z4 = false;
        while (true) {
            int i7 = o00ooo3.f9188OooO0OO;
            if (!(i7 >= 0 && i7 < o0ooo0o2.OooO0O0()) || (!this.f9084OoooO0O.f9185OooO && this.f9100o000oOoO.isEmpty())) {
                break;
            }
            View viewOooO0o0 = o00ooo4.OooO0o0(o00ooo3.f9188OooO0OO);
            o00ooo3.f9188OooO0OO += o00ooo3.f9189OooO0Oo;
            LayoutParams layoutParams2 = (LayoutParams) viewOooO0o0.getLayoutParams();
            int iOooO00o = layoutParams2.OooO00o();
            int[] iArr = this.f9088OoooOo0.f9103OooO00o;
            int i8 = (iArr == null || iOooO00o >= iArr.length) ? -1 : iArr[iOooO00o];
            boolean z5 = i8 == -1;
            if (z5) {
                if (layoutParams2.f9101OoooO0) {
                    oooO0OO = this.f9079Oooo0oO[c];
                } else {
                    if (OooOoO(o00ooo3.f9191OooO0o0)) {
                        i4 = this.f9078Oooo0o - 1;
                        i3 = -1;
                        i5 = -1;
                    } else {
                        i3 = this.f9078Oooo0o;
                        i4 = 0;
                        i5 = 1;
                    }
                    OooO0OO oooO0OO2 = null;
                    if (o00ooo3.f9191OooO0o0 == 1) {
                        int iOooOO0O = this.f9080Oooo0oo.OooOO0O();
                        int i9 = Integer.MAX_VALUE;
                        while (i4 != i3) {
                            OooO0OO oooO0OO3 = this.f9079Oooo0oO[i4];
                            int iOooO = oooO0OO3.OooO(iOooOO0O);
                            if (iOooO < i9) {
                                oooO0OO2 = oooO0OO3;
                                i9 = iOooO;
                            }
                            i4 += i5;
                        }
                    } else {
                        int iOooO0oO2 = this.f9080Oooo0oo.OooO0oO();
                        int i10 = Integer.MIN_VALUE;
                        while (i4 != i3) {
                            OooO0OO oooO0OO4 = this.f9079Oooo0oO[i4];
                            int iOooOO0o = oooO0OO4.OooOO0o(iOooO0oO2);
                            if (iOooOO0o > i10) {
                                oooO0OO2 = oooO0OO4;
                                i10 = iOooOO0o;
                            }
                            i4 += i5;
                        }
                    }
                    oooO0OO = oooO0OO2;
                }
                LazySpanLookup lazySpanLookup = this.f9088OoooOo0;
                lazySpanLookup.OooO0OO(iOooO00o);
                lazySpanLookup.f9103OooO00o[iOooO00o] = oooO0OO.f9122OooO0o0;
            } else {
                oooO0OO = this.f9079Oooo0oO[i8];
            }
            OooO0OO oooO0OO5 = oooO0OO;
            layoutParams2.f9102OoooO00 = oooO0OO5;
            if (o00ooo3.f9191OooO0o0 == 1) {
                addView(viewOooO0o0);
            } else {
                addView(viewOooO0o0, 0);
            }
            if (layoutParams2.f9101OoooO0) {
                if (this.f9083OoooO00 == 1) {
                    OooOo(viewOooO0o0, this.f9093OooooO0, RecyclerView.Oooo000.getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingBottom() + getPaddingTop(), ((ViewGroup.MarginLayoutParams) layoutParams2).height, true), false);
                } else {
                    OooOo(viewOooO0o0, RecyclerView.Oooo000.getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingRight() + getPaddingLeft(), ((ViewGroup.MarginLayoutParams) layoutParams2).width, true), this.f9093OooooO0, false);
                }
            } else if (this.f9083OoooO00 == 1) {
                OooOo(viewOooO0o0, RecyclerView.Oooo000.getChildMeasureSpec(this.f9082OoooO0, getWidthMode(), 0, ((ViewGroup.MarginLayoutParams) layoutParams2).width, false), RecyclerView.Oooo000.getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingBottom() + getPaddingTop(), ((ViewGroup.MarginLayoutParams) layoutParams2).height, true), false);
            } else {
                OooOo(viewOooO0o0, RecyclerView.Oooo000.getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingRight() + getPaddingLeft(), ((ViewGroup.MarginLayoutParams) layoutParams2).width, true), RecyclerView.Oooo000.getChildMeasureSpec(this.f9082OoooO0, getHeightMode(), 0, ((ViewGroup.MarginLayoutParams) layoutParams2).height, false), false);
            }
            if (o00ooo3.f9191OooO0o0 == 1) {
                int iOooOo00 = layoutParams2.f9101OoooO0 ? OooOo00(iOooO0oO) : oooO0OO5.OooO(iOooO0oO);
                int iOooO0OO3 = this.f9080Oooo0oo.OooO0OO(viewOooO0o0) + iOooOo00;
                if (z5 && layoutParams2.f9101OoooO0) {
                    LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
                    fullSpanItem.f9108Oooo0oo = new int[this.f9078Oooo0o];
                    for (int i11 = 0; i11 < this.f9078Oooo0o; i11++) {
                        fullSpanItem.f9108Oooo0oo[i11] = iOooOo00 - this.f9079Oooo0oO[i11].OooO(iOooOo00);
                    }
                    fullSpanItem.f9107Oooo0oO = -1;
                    fullSpanItem.f9106Oooo0o = iOooO00o;
                    this.f9088OoooOo0.OooO00o(fullSpanItem);
                }
                i2 = iOooOo00;
                i = iOooO0OO3;
            } else {
                int iOooOo0 = layoutParams2.f9101OoooO0 ? OooOo0(iOooO0oO) : oooO0OO5.OooOO0o(iOooO0oO);
                int iOooO0OO4 = iOooOo0 - this.f9080Oooo0oo.OooO0OO(viewOooO0o0);
                if (z5 && layoutParams2.f9101OoooO0) {
                    LazySpanLookup.FullSpanItem fullSpanItem2 = new LazySpanLookup.FullSpanItem();
                    fullSpanItem2.f9108Oooo0oo = new int[this.f9078Oooo0o];
                    for (int i12 = 0; i12 < this.f9078Oooo0o; i12++) {
                        fullSpanItem2.f9108Oooo0oo[i12] = this.f9079Oooo0oO[i12].OooOO0o(iOooOo0) - iOooOo0;
                    }
                    fullSpanItem2.f9107Oooo0oO = 1;
                    fullSpanItem2.f9106Oooo0o = iOooO00o;
                    this.f9088OoooOo0.OooO00o(fullSpanItem2);
                }
                i = iOooOo0;
                i2 = iOooO0OO4;
            }
            if (layoutParams2.f9101OoooO0 && o00ooo3.f9189OooO0Oo == -1) {
                if (z5) {
                    this.f9097Oooooo0 = true;
                } else {
                    if (o00ooo3.f9191OooO0o0 == 1) {
                        int i13 = Integer.MIN_VALUE;
                        int iOooO2 = this.f9079Oooo0oO[0].OooO(Integer.MIN_VALUE);
                        int i14 = 1;
                        while (true) {
                            if (i14 >= this.f9078Oooo0o) {
                                z3 = true;
                                break;
                            }
                            if (this.f9079Oooo0oO[i14].OooO(i13) != iOooO2) {
                                z3 = false;
                                break;
                            }
                            i14++;
                            i13 = Integer.MIN_VALUE;
                        }
                        z2 = !z3;
                    } else {
                        int iOooOO0o2 = this.f9079Oooo0oO[0].OooOO0o(Integer.MIN_VALUE);
                        int i15 = 1;
                        while (true) {
                            if (i15 >= this.f9078Oooo0o) {
                                z = true;
                                break;
                            }
                            if (this.f9079Oooo0oO[i15].OooOO0o(Integer.MIN_VALUE) != iOooOO0o2) {
                                z = false;
                                break;
                            }
                            i15++;
                        }
                        z2 = !z;
                    }
                    if (z2) {
                        LazySpanLookup.FullSpanItem fullSpanItemOooO0o = this.f9088OoooOo0.OooO0o(iOooO00o);
                        if (fullSpanItemOooO0o != null) {
                            fullSpanItemOooO0o.f9105Oooo = true;
                        }
                        this.f9097Oooooo0 = true;
                    }
                }
            }
            if (o00ooo3.f9191OooO0o0 == 1) {
                if (layoutParams2.f9101OoooO0) {
                    int i16 = this.f9078Oooo0o;
                    while (true) {
                        i16--;
                        if (i16 < 0) {
                            break;
                        }
                        this.f9079Oooo0oO[i16].OooO00o(viewOooO0o0);
                    }
                } else {
                    layoutParams2.f9102OoooO00.OooO00o(viewOooO0o0);
                }
            } else if (layoutParams2.f9101OoooO0) {
                int i17 = this.f9078Oooo0o;
                while (true) {
                    i17--;
                    if (i17 < 0) {
                        break;
                    }
                    this.f9079Oooo0oO[i17].OooOOOO(viewOooO0o0);
                }
            } else {
                layoutParams2.f9102OoooO00.OooOOOO(viewOooO0o0);
            }
            if (isLayoutRTL() && this.f9083OoooO00 == 1) {
                int iOooO0oO3 = layoutParams2.f9101OoooO0 ? this.f9077Oooo.OooO0oO() : this.f9077Oooo.OooO0oO() - (((this.f9078Oooo0o - 1) - oooO0OO5.f9122OooO0o0) * this.f9082OoooO0);
                iOooO0OO2 = iOooO0oO3;
                iOooO0OO = iOooO0oO3 - this.f9077Oooo.OooO0OO(viewOooO0o0);
            } else {
                int iOooOO0O2 = layoutParams2.f9101OoooO0 ? this.f9077Oooo.OooOO0O() : (oooO0OO5.f9122OooO0o0 * this.f9082OoooO0) + this.f9077Oooo.OooOO0O();
                iOooO0OO = iOooOO0O2;
                iOooO0OO2 = this.f9077Oooo.OooO0OO(viewOooO0o0) + iOooOO0O2;
            }
            if (this.f9083OoooO00 == 1) {
                layoutDecoratedWithMargins(viewOooO0o0, iOooO0OO, i2, iOooO0OO2, i);
                layoutParams = layoutParams2;
            } else {
                int i18 = i2;
                int i19 = i;
                layoutParams = layoutParams2;
                layoutDecoratedWithMargins(viewOooO0o0, i18, iOooO0OO, i19, iOooO0OO2);
            }
            if (layoutParams.f9101OoooO0) {
                Oooo000(this.f9084OoooO0O.f9191OooO0o0, i6);
            } else {
                Oooo00o(oooO0OO5, this.f9084OoooO0O.f9191OooO0o0, i6);
            }
            OooOoo0(o00ooo2, this.f9084OoooO0O);
            if (this.f9084OoooO0O.f9193OooO0oo && viewOooO0o0.hasFocusable()) {
                if (layoutParams.f9101OoooO0) {
                    this.f9100o000oOoO.clear();
                } else {
                    this.f9100o000oOoO.set(oooO0OO5.f9122OooO0o0, false);
                }
            }
            o00ooo4 = o00ooo2;
            z4 = true;
            c = 0;
        }
        RecyclerView.o00Ooo o00ooo5 = o00ooo4;
        if (!z4) {
            OooOoo0(o00ooo5, this.f9084OoooO0O);
        }
        int iOooOO0O3 = this.f9084OoooO0O.f9191OooO0o0 == -1 ? this.f9080Oooo0oo.OooOO0O() - OooOo0(this.f9080Oooo0oo.OooOO0O()) : OooOo00(this.f9080Oooo0oo.OooO0oO()) - this.f9080Oooo0oo.OooO0oO();
        if (iOooOO0O3 > 0) {
            return Math.min(o00ooo3.f9187OooO0O0, iOooOO0O3);
        }
        return 0;
    }

    public final View OooOOOO(boolean z) {
        int iOooOO0O = this.f9080Oooo0oo.OooOO0O();
        int iOooO0oO = this.f9080Oooo0oo.OooO0oO();
        int childCount = getChildCount();
        View view = null;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int iOooO0o0 = this.f9080Oooo0oo.OooO0o0(childAt);
            if (this.f9080Oooo0oo.OooO0O0(childAt) > iOooOO0O && iOooO0o0 < iOooO0oO) {
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
        if (iOooOo00 != Integer.MIN_VALUE && (iOooO0oO = this.f9080Oooo0oo.OooO0oO() - iOooOo00) > 0) {
            int i = iOooO0oO - (-scrollBy(-iOooO0oO, o00ooo2, o0ooo0o2));
            if (!z || i <= 0) {
                return;
            }
            this.f9080Oooo0oo.OooOOOo(i);
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
        if (iOooOo0 != Integer.MAX_VALUE && (iOooOO0O = iOooOo0 - this.f9080Oooo0oo.OooOO0O()) > 0) {
            int iScrollBy = iOooOO0O - scrollBy(iOooOO0O, o00ooo2, o0ooo0o2);
            if (!z || iScrollBy <= 0) {
                return;
            }
            this.f9080Oooo0oo.OooOOOo(-iScrollBy);
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
        calculateItemDecorationsForChild(view, this.f9094OooooOO);
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
        Rect rect = this.f9094OooooOO;
        int iOooo0 = Oooo0(i, i3 + rect.left, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + rect.right);
        int i4 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
        Rect rect2 = this.f9094OooooOO;
        int iOooo1 = Oooo0(i2, i4 + rect2.top, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + rect2.bottom);
        if (shouldMeasureChild(view, iOooo0, iOooo1, layoutParams)) {
            view.measure(iOooo0, iOooo1);
        }
    }

    public final int OooOo0(int i) {
        int iOooOO0o = this.f9079Oooo0oO[0].OooOO0o(i);
        for (int i2 = 1; i2 < this.f9078Oooo0o; i2++) {
            int iOooOO0o2 = this.f9079Oooo0oO[i2].OooOO0o(i);
            if (iOooOO0o2 < iOooOO0o) {
                iOooOO0o = iOooOO0o2;
            }
        }
        return iOooOO0o;
    }

    public final int OooOo00(int i) {
        int iOooO = this.f9079Oooo0oO[0].OooO(i);
        for (int i2 = 1; i2 < this.f9078Oooo0o; i2++) {
            int iOooO2 = this.f9079Oooo0oO[i2].OooO(i);
            if (iOooO2 > iOooO) {
                iOooO = iOooO2;
            }
        }
        return iOooO;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0025  */
    /* JADX WARN: Code duplicated, block: B:17:0x0028 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x002b  */
    /* JADX WARN: Code duplicated, block: B:20:0x0036  */
    /* JADX WARN: Code duplicated, block: B:21:0x003c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0043 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x0044  */
    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Code duplicated, block: B:27:0x004d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0053  */
    /* JADX WARN: Code duplicated, block: B:31:? A[RETURN, SYNTHETIC] */
    public final void OooOo0O(int i, int i2, int i3) {
        int i4;
        int i5;
        int iOooOOoo;
        int iOooOOoo2 = this.f9085OoooOO0 ? OooOOoo() : OooOOo();
        if (i3 == 8) {
            if (i < i2) {
                i4 = i2 + 1;
            } else {
                i4 = i + 1;
                i5 = i2;
            }
            this.f9088OoooOo0.OooO0oO(i5);
            if (i3 != 1) {
                this.f9088OoooOo0.OooO0oo(i, i2);
            } else if (i3 != 2) {
                this.f9088OoooOo0.OooO(i, i2);
            } else if (i3 == 8) {
                this.f9088OoooOo0.OooO(i, 1);
                this.f9088OoooOo0.OooO0oo(i2, 1);
            }
            if (i4 <= iOooOOoo2) {
                return;
            }
            if (this.f9085OoooOO0) {
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
        this.f9088OoooOo0.OooO0oO(i5);
        if (i3 != 1) {
            this.f9088OoooOo0.OooO0oo(i, i2);
        } else if (i3 != 2) {
            this.f9088OoooOo0.OooO(i, i2);
        } else if (i3 == 8) {
            this.f9088OoooOo0.OooO(i, 1);
            this.f9088OoooOo0.OooO0oo(i2, 1);
        }
        if (i4 <= iOooOOoo2) {
            return;
        }
        if (this.f9085OoooOO0) {
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
        BitSet bitSet = new BitSet(this.f9078Oooo0o);
        bitSet.set(0, this.f9078Oooo0o, true);
        byte b = (this.f9083OoooO00 == 1 && isLayoutRTL()) ? (byte) 1 : (byte) -1;
        if (this.f9085OoooOO0) {
            i = -1;
        } else {
            i = childCount + 1;
            childCount = 0;
        }
        int i3 = childCount < i ? 1 : -1;
        while (childCount != i) {
            View childAt = getChildAt(childCount);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (bitSet.get(layoutParams.f9102OoooO00.f9122OooO0o0)) {
                OooO0OO oooO0OO = layoutParams.f9102OoooO00;
                if (this.f9085OoooOO0) {
                    int i4 = oooO0OO.f9119OooO0OO;
                    if (i4 == Integer.MIN_VALUE) {
                        oooO0OO.OooO0O0();
                        i4 = oooO0OO.f9119OooO0OO;
                    }
                    if (i4 < this.f9080Oooo0oo.OooO0oO()) {
                        ArrayList<View> arrayList = oooO0OO.f9117OooO00o;
                        z2 = oooO0OO.OooOO0O(arrayList.get(arrayList.size() - 1)).f9101OoooO0;
                        z3 = !z2;
                    } else {
                        z3 = false;
                    }
                } else {
                    int i5 = oooO0OO.f9118OooO0O0;
                    if (i5 == Integer.MIN_VALUE) {
                        oooO0OO.OooO0OO();
                        i5 = oooO0OO.f9118OooO0O0;
                    }
                    if (i5 > this.f9080Oooo0oo.OooOO0O()) {
                        z2 = oooO0OO.OooOO0O(oooO0OO.f9117OooO00o.get(0)).f9101OoooO0;
                        z3 = !z2;
                    } else {
                        z3 = false;
                    }
                }
                if (z3) {
                    return childAt;
                }
                bitSet.clear(layoutParams.f9102OoooO00.f9122OooO0o0);
            }
            if (!layoutParams.f9101OoooO0 && (i2 = childCount + i3) != i) {
                View childAt2 = getChildAt(i2);
                if (this.f9085OoooOO0) {
                    int iOooO0O0 = this.f9080Oooo0oo.OooO0O0(childAt);
                    int iOooO0O1 = this.f9080Oooo0oo.OooO0O0(childAt2);
                    if (iOooO0O0 < iOooO0O1) {
                        return childAt;
                    }
                    if (iOooO0O0 == iOooO0O1) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    int iOooO0o0 = this.f9080Oooo0oo.OooO0o0(childAt);
                    int iOooO0o1 = this.f9080Oooo0oo.OooO0o0(childAt2);
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
                    if ((layoutParams.f9102OoooO00.f9122OooO0o0 - ((LayoutParams) childAt2.getLayoutParams()).f9102OoooO00.f9122OooO0o0 < 0) != (b < 0)) {
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
        if (this.f9083OoooO00 == 0) {
            return (i == -1) != this.f9085OoooOO0;
        }
        return ((i == -1) == this.f9085OoooOO0) == isLayoutRTL();
    }

    /* JADX WARN: Code duplicated, block: B:253:0x0427  */
    public final void OooOoO0(RecyclerView.o00Ooo o00ooo2, RecyclerView.o0OOO0o o0ooo0o2, boolean z) {
        boolean z2;
        SavedState savedState;
        boolean z3;
        int position;
        int i;
        OooO0O0 oooO0O0 = this.f9095OooooOo;
        if (!(this.f9092Ooooo0o == null && this.f9086OoooOOO == -1) && o0ooo0o2.OooO0O0() == 0) {
            removeAndRecycleAllViews(o00ooo2);
            oooO0O0.OooO0O0();
            return;
        }
        boolean z4 = (oooO0O0.f9115OooO0o0 && this.f9086OoooOOO == -1 && this.f9092Ooooo0o == null) ? false : true;
        if (z4) {
            oooO0O0.OooO0O0();
            SavedState savedState2 = this.f9092Ooooo0o;
            if (savedState2 != null) {
                int i2 = savedState2.f9126Oooo0oo;
                if (i2 > 0) {
                    if (i2 == this.f9078Oooo0o) {
                        for (int i3 = 0; i3 < this.f9078Oooo0o; i3++) {
                            this.f9079Oooo0oO[i3].OooO0Oo();
                            SavedState savedState3 = this.f9092Ooooo0o;
                            int iOooO0oO = savedState3.f9123Oooo[i3];
                            if (iOooO0oO != Integer.MIN_VALUE) {
                                iOooO0oO += savedState3.f9131OoooOO0 ? this.f9080Oooo0oo.OooO0oO() : this.f9080Oooo0oo.OooOO0O();
                            }
                            OooO0OO oooO0OO = this.f9079Oooo0oO[i3];
                            oooO0OO.f9118OooO0O0 = iOooO0oO;
                            oooO0OO.f9119OooO0OO = iOooO0oO;
                        }
                    } else {
                        savedState2.f9123Oooo = null;
                        savedState2.f9126Oooo0oo = 0;
                        savedState2.f9129OoooO00 = 0;
                        savedState2.f9128OoooO0 = null;
                        savedState2.f9130OoooO0O = null;
                        savedState2.f9124Oooo0o = savedState2.f9125Oooo0oO;
                    }
                }
                SavedState savedState4 = this.f9092Ooooo0o;
                this.f9091Ooooo00 = savedState4.f9132o000oOoO;
                boolean z5 = savedState4.f9127OoooO;
                assertNotInLayoutOrScroll(null);
                SavedState savedState5 = this.f9092Ooooo0o;
                if (savedState5 != null && savedState5.f9127OoooO != z5) {
                    savedState5.f9127OoooO = z5;
                }
                this.f9081OoooO = z5;
                requestLayout();
                resolveShouldLayoutReverse();
                SavedState savedState6 = this.f9092Ooooo0o;
                int i4 = savedState6.f9124Oooo0o;
                if (i4 != -1) {
                    this.f9086OoooOOO = i4;
                    oooO0O0.f9112OooO0OO = savedState6.f9131OoooOO0;
                } else {
                    oooO0O0.f9112OooO0OO = this.f9085OoooOO0;
                }
                if (savedState6.f9129OoooO00 > 1) {
                    LazySpanLookup lazySpanLookup = this.f9088OoooOo0;
                    lazySpanLookup.f9103OooO00o = savedState6.f9128OoooO0;
                    lazySpanLookup.f9104OooO0O0 = savedState6.f9130OoooO0O;
                }
            } else {
                resolveShouldLayoutReverse();
                oooO0O0.f9112OooO0OO = this.f9085OoooOO0;
            }
            if (o0ooo0o2.f9063OooO0oO || (i = this.f9086OoooOOO) == -1) {
                z3 = false;
            } else if (i < 0 || i >= o0ooo0o2.OooO0O0()) {
                this.f9086OoooOOO = -1;
                this.f9087OoooOOo = Integer.MIN_VALUE;
                z3 = false;
            } else {
                SavedState savedState7 = this.f9092Ooooo0o;
                if (savedState7 == null || savedState7.f9124Oooo0o == -1 || savedState7.f9126Oooo0oo < 1) {
                    View viewFindViewByPosition = findViewByPosition(this.f9086OoooOOO);
                    if (viewFindViewByPosition != null) {
                        oooO0O0.f9110OooO00o = this.f9085OoooOO0 ? OooOOoo() : OooOOo();
                        if (this.f9087OoooOOo != Integer.MIN_VALUE) {
                            if (oooO0O0.f9112OooO0OO) {
                                oooO0O0.f9111OooO0O0 = (this.f9080Oooo0oo.OooO0oO() - this.f9087OoooOOo) - this.f9080Oooo0oo.OooO0O0(viewFindViewByPosition);
                            } else {
                                oooO0O0.f9111OooO0O0 = (this.f9080Oooo0oo.OooOO0O() + this.f9087OoooOOo) - this.f9080Oooo0oo.OooO0o0(viewFindViewByPosition);
                            }
                        } else if (this.f9080Oooo0oo.OooO0OO(viewFindViewByPosition) > this.f9080Oooo0oo.OooOO0o()) {
                            oooO0O0.f9111OooO0O0 = oooO0O0.f9112OooO0OO ? this.f9080Oooo0oo.OooO0oO() : this.f9080Oooo0oo.OooOO0O();
                        } else {
                            int iOooO0o0 = this.f9080Oooo0oo.OooO0o0(viewFindViewByPosition) - this.f9080Oooo0oo.OooOO0O();
                            if (iOooO0o0 < 0) {
                                oooO0O0.f9111OooO0O0 = -iOooO0o0;
                            } else {
                                int iOooO0oO2 = this.f9080Oooo0oo.OooO0oO() - this.f9080Oooo0oo.OooO0O0(viewFindViewByPosition);
                                if (iOooO0oO2 < 0) {
                                    oooO0O0.f9111OooO0O0 = iOooO0oO2;
                                } else {
                                    oooO0O0.f9111OooO0O0 = Integer.MIN_VALUE;
                                }
                            }
                        }
                    } else {
                        int i5 = this.f9086OoooOOO;
                        oooO0O0.f9110OooO00o = i5;
                        int i6 = this.f9087OoooOOo;
                        if (i6 == Integer.MIN_VALUE) {
                            oooO0O0.f9112OooO0OO = OooOO0O(i5) == 1;
                            oooO0O0.OooO00o();
                        } else if (oooO0O0.f9112OooO0OO) {
                            oooO0O0.f9111OooO0O0 = StaggeredGridLayoutManager.this.f9080Oooo0oo.OooO0oO() - i6;
                        } else {
                            oooO0O0.f9111OooO0O0 = StaggeredGridLayoutManager.this.f9080Oooo0oo.OooOO0O() + i6;
                        }
                        oooO0O0.f9113OooO0Oo = true;
                    }
                } else {
                    oooO0O0.f9111OooO0O0 = Integer.MIN_VALUE;
                    oooO0O0.f9110OooO00o = this.f9086OoooOOO;
                }
                z3 = true;
            }
            if (!z3) {
                if (this.f9090OoooOoo) {
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
                oooO0O0.f9110OooO00o = position;
                oooO0O0.f9111OooO0O0 = Integer.MIN_VALUE;
            }
            oooO0O0.f9115OooO0o0 = true;
        }
        if (this.f9092Ooooo0o == null && this.f9086OoooOOO == -1 && (oooO0O0.f9112OooO0OO != this.f9090OoooOoo || isLayoutRTL() != this.f9091Ooooo00)) {
            this.f9088OoooOo0.OooO0O0();
            oooO0O0.f9113OooO0Oo = true;
        }
        if (getChildCount() > 0 && ((savedState = this.f9092Ooooo0o) == null || savedState.f9126Oooo0oo < 1)) {
            if (oooO0O0.f9113OooO0Oo) {
                for (int i8 = 0; i8 < this.f9078Oooo0o; i8++) {
                    this.f9079Oooo0oO[i8].OooO0Oo();
                    int i9 = oooO0O0.f9111OooO0O0;
                    if (i9 != Integer.MIN_VALUE) {
                        OooO0OO oooO0OO2 = this.f9079Oooo0oO[i8];
                        oooO0OO2.f9118OooO0O0 = i9;
                        oooO0OO2.f9119OooO0OO = i9;
                    }
                }
            } else if (z4 || this.f9095OooooOo.f9114OooO0o == null) {
                for (int i10 = 0; i10 < this.f9078Oooo0o; i10++) {
                    OooO0OO oooO0OO3 = this.f9079Oooo0oO[i10];
                    boolean z6 = this.f9085OoooOO0;
                    int i11 = oooO0O0.f9111OooO0O0;
                    int iOooO = z6 ? oooO0OO3.OooO(Integer.MIN_VALUE) : oooO0OO3.OooOO0o(Integer.MIN_VALUE);
                    oooO0OO3.OooO0Oo();
                    if (iOooO != Integer.MIN_VALUE && ((!z6 || iOooO >= StaggeredGridLayoutManager.this.f9080Oooo0oo.OooO0oO()) && (z6 || iOooO <= StaggeredGridLayoutManager.this.f9080Oooo0oo.OooOO0O()))) {
                        if (i11 != Integer.MIN_VALUE) {
                            iOooO += i11;
                        }
                        oooO0OO3.f9119OooO0OO = iOooO;
                        oooO0OO3.f9118OooO0O0 = iOooO;
                    }
                }
                OooO0O0 oooO0O1 = this.f9095OooooOo;
                OooO0OO[] oooO0OOArr = this.f9079Oooo0oO;
                Objects.requireNonNull(oooO0O1);
                int length = oooO0OOArr.length;
                int[] iArr = oooO0O1.f9114OooO0o;
                if (iArr == null || iArr.length < length) {
                    oooO0O1.f9114OooO0o = new int[StaggeredGridLayoutManager.this.f9079Oooo0oO.length];
                }
                for (int i12 = 0; i12 < length; i12++) {
                    oooO0O1.f9114OooO0o[i12] = oooO0OOArr[i12].OooOO0o(Integer.MIN_VALUE);
                }
            } else {
                for (int i13 = 0; i13 < this.f9078Oooo0o; i13++) {
                    OooO0OO oooO0OO4 = this.f9079Oooo0oO[i13];
                    oooO0OO4.OooO0Oo();
                    int i14 = this.f9095OooooOo.f9114OooO0o[i13];
                    oooO0OO4.f9118OooO0O0 = i14;
                    oooO0OO4.f9119OooO0OO = i14;
                }
            }
        }
        detachAndScrapAttachedViews(o00ooo2);
        this.f9084OoooO0O.f9186OooO00o = false;
        this.f9097Oooooo0 = false;
        int iOooOO0o = this.f9077Oooo.OooOO0o();
        this.f9082OoooO0 = iOooOO0o / this.f9078Oooo0o;
        this.f9093OooooO0 = View.MeasureSpec.makeMeasureSpec(iOooOO0o, this.f9077Oooo.OooO());
        Oooo00O(oooO0O0.f9110OooO00o, o0ooo0o2);
        if (oooO0O0.f9112OooO0OO) {
            OooOooo(-1);
            OooOOO0(o00ooo2, this.f9084OoooO0O, o0ooo0o2);
            OooOooo(1);
            o00Ooo o00ooo3 = this.f9084OoooO0O;
            o00ooo3.f9188OooO0OO = oooO0O0.f9110OooO00o + o00ooo3.f9189OooO0Oo;
            OooOOO0(o00ooo2, o00ooo3, o0ooo0o2);
        } else {
            OooOooo(1);
            OooOOO0(o00ooo2, this.f9084OoooO0O, o0ooo0o2);
            OooOooo(-1);
            o00Ooo o00ooo4 = this.f9084OoooO0O;
            o00ooo4.f9188OooO0OO = oooO0O0.f9110OooO00o + o00ooo4.f9189OooO0Oo;
            OooOOO0(o00ooo2, o00ooo4, o0ooo0o2);
        }
        if (this.f9077Oooo.OooO() != 1073741824) {
            float fMax = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            int childCount3 = getChildCount();
            for (int i15 = 0; i15 < childCount3; i15++) {
                View childAt = getChildAt(i15);
                float fOooO0OO = this.f9077Oooo.OooO0OO(childAt);
                if (fOooO0OO >= fMax) {
                    if (((LayoutParams) childAt.getLayoutParams()).f9101OoooO0) {
                        fOooO0OO = (fOooO0OO * 1.0f) / this.f9078Oooo0o;
                    }
                    fMax = Math.max(fMax, fOooO0OO);
                }
            }
            int i16 = this.f9082OoooO0;
            int iRound = Math.round(fMax * this.f9078Oooo0o);
            if (this.f9077Oooo.OooO() == Integer.MIN_VALUE) {
                iRound = Math.min(iRound, this.f9077Oooo.OooOO0o());
            }
            this.f9082OoooO0 = iRound / this.f9078Oooo0o;
            this.f9093OooooO0 = View.MeasureSpec.makeMeasureSpec(iRound, this.f9077Oooo.OooO());
            if (this.f9082OoooO0 != i16) {
                for (int i17 = 0; i17 < childCount3; i17++) {
                    View childAt2 = getChildAt(i17);
                    LayoutParams layoutParams = (LayoutParams) childAt2.getLayoutParams();
                    if (!layoutParams.f9101OoooO0) {
                        if (isLayoutRTL() && this.f9083OoooO00 == 1) {
                            int i18 = this.f9078Oooo0o;
                            int i19 = layoutParams.f9102OoooO00.f9122OooO0o0;
                            childAt2.offsetLeftAndRight(((-((i18 - 1) - i19)) * this.f9082OoooO0) - ((-((i18 - 1) - i19)) * i16));
                        } else {
                            int i20 = layoutParams.f9102OoooO00.f9122OooO0o0;
                            int i21 = this.f9082OoooO0 * i20;
                            int i22 = i20 * i16;
                            if (this.f9083OoooO00 == 1) {
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
            if (this.f9085OoooOO0) {
                OooOOOo(o00ooo2, o0ooo0o2, true);
                OooOOo0(o00ooo2, o0ooo0o2, false);
            } else {
                OooOOo0(o00ooo2, o0ooo0o2, true);
                OooOOOo(o00ooo2, o0ooo0o2, false);
            }
        }
        if (z && !o0ooo0o2.f9063OooO0oO) {
            if (this.f9089OoooOoO != 0 && getChildCount() > 0 && (this.f9097Oooooo0 || OooOo0o() != null)) {
                removeCallbacks(this.f9099Ooooooo);
                z2 = OooOO0o();
            }
        }
        if (o0ooo0o2.f9063OooO0oO) {
            this.f9095OooooOo.OooO0O0();
        }
        this.f9090OoooOoo = oooO0O0.f9112OooO0OO;
        this.f9091Ooooo00 = isLayoutRTL();
        if (z2) {
            this.f9095OooooOo.OooO0O0();
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
        this.f9084OoooO0O.f9186OooO00o = true;
        Oooo00O(iOooOOo, o0ooo0o2);
        OooOooo(i2);
        o00Ooo o00ooo2 = this.f9084OoooO0O;
        o00ooo2.f9188OooO0OO = iOooOOo + o00ooo2.f9189OooO0Oo;
        o00ooo2.f9187OooO0O0 = Math.abs(i);
    }

    public final void OooOoo(RecyclerView.o00Ooo o00ooo2, int i) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (this.f9080Oooo0oo.OooO0o0(childAt) < i || this.f9080Oooo0oo.OooOOOO(childAt) < i) {
                return;
            }
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (layoutParams.f9101OoooO0) {
                for (int i2 = 0; i2 < this.f9078Oooo0o; i2++) {
                    if (this.f9079Oooo0oO[i2].f9117OooO00o.size() == 1) {
                        return;
                    }
                }
                for (int i3 = 0; i3 < this.f9078Oooo0o; i3++) {
                    this.f9079Oooo0oO[i3].OooOOO0();
                }
            } else if (layoutParams.f9102OoooO00.f9117OooO00o.size() == 1) {
                return;
            } else {
                layoutParams.f9102OoooO00.OooOOO0();
            }
            removeAndRecycleView(childAt, o00ooo2);
        }
    }

    public final void OooOoo0(RecyclerView.o00Ooo o00ooo2, o00Ooo o00ooo3) {
        int iMin;
        if (!o00ooo3.f9186OooO00o || o00ooo3.f9185OooO) {
            return;
        }
        if (o00ooo3.f9187OooO0O0 == 0) {
            if (o00ooo3.f9191OooO0o0 == -1) {
                OooOoo(o00ooo2, o00ooo3.f9192OooO0oO);
                return;
            } else {
                OooOooO(o00ooo2, o00ooo3.f9190OooO0o);
                return;
            }
        }
        int i = 1;
        if (o00ooo3.f9191OooO0o0 == -1) {
            int i2 = o00ooo3.f9190OooO0o;
            int iOooOO0o = this.f9079Oooo0oO[0].OooOO0o(i2);
            while (i < this.f9078Oooo0o) {
                int iOooOO0o2 = this.f9079Oooo0oO[i].OooOO0o(i2);
                if (iOooOO0o2 > iOooOO0o) {
                    iOooOO0o = iOooOO0o2;
                }
                i++;
            }
            int i3 = i2 - iOooOO0o;
            OooOoo(o00ooo2, i3 < 0 ? o00ooo3.f9192OooO0oO : o00ooo3.f9192OooO0oO - Math.min(i3, o00ooo3.f9187OooO0O0));
            return;
        }
        int i4 = o00ooo3.f9192OooO0oO;
        int iOooO = this.f9079Oooo0oO[0].OooO(i4);
        while (i < this.f9078Oooo0o) {
            int iOooO2 = this.f9079Oooo0oO[i].OooO(i4);
            if (iOooO2 < iOooO) {
                iOooO = iOooO2;
            }
            i++;
        }
        int i5 = iOooO - o00ooo3.f9192OooO0oO;
        if (i5 < 0) {
            iMin = o00ooo3.f9190OooO0o;
        } else {
            iMin = Math.min(i5, o00ooo3.f9187OooO0O0) + o00ooo3.f9190OooO0o;
        }
        OooOooO(o00ooo2, iMin);
    }

    public final void OooOooO(RecyclerView.o00Ooo o00ooo2, int i) {
        while (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (this.f9080Oooo0oo.OooO0O0(childAt) > i || this.f9080Oooo0oo.OooOOO(childAt) > i) {
                return;
            }
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (layoutParams.f9101OoooO0) {
                for (int i2 = 0; i2 < this.f9078Oooo0o; i2++) {
                    if (this.f9079Oooo0oO[i2].f9117OooO00o.size() == 1) {
                        return;
                    }
                }
                for (int i3 = 0; i3 < this.f9078Oooo0o; i3++) {
                    this.f9079Oooo0oO[i3].OooOOO();
                }
            } else if (layoutParams.f9102OoooO00.f9117OooO00o.size() == 1) {
                return;
            } else {
                layoutParams.f9102OoooO00.OooOOO();
            }
            removeAndRecycleView(childAt, o00ooo2);
        }
    }

    public final void OooOooo(int i) {
        o00Ooo o00ooo2 = this.f9084OoooO0O;
        o00ooo2.f9191OooO0o0 = i;
        o00ooo2.f9189OooO0Oo = this.f9085OoooOO0 != (i == -1) ? -1 : 1;
    }

    public final int Oooo0(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    public final void Oooo000(int i, int i2) {
        for (int i3 = 0; i3 < this.f9078Oooo0o; i3++) {
            if (!this.f9079Oooo0oO[i3].f9117OooO00o.isEmpty()) {
                Oooo00o(this.f9079Oooo0oO[i3], i, i2);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0034  */
    /* JADX WARN: Code duplicated, block: B:18:0x004b  */
    public final void Oooo00O(int i, RecyclerView.o0OOO0o o0ooo0o2) {
        int iOooOO0o;
        int iOooOO0o2;
        int i2;
        o00Ooo o00ooo2 = this.f9084OoooO0O;
        boolean z = false;
        o00ooo2.f9187OooO0O0 = 0;
        o00ooo2.f9188OooO0OO = i;
        if (isSmoothScrolling() && (i2 = o0ooo0o2.f9057OooO00o) != -1) {
            if (this.f9085OoooOO0 == (i2 < i)) {
                iOooOO0o = this.f9080Oooo0oo.OooOO0o();
            } else {
                iOooOO0o2 = this.f9080Oooo0oo.OooOO0o();
                iOooOO0o = 0;
            }
            if (getClipToPadding()) {
                this.f9084OoooO0O.f9190OooO0o = this.f9080Oooo0oo.OooOO0O() - iOooOO0o2;
                this.f9084OoooO0O.f9192OooO0oO = this.f9080Oooo0oo.OooO0oO() + iOooOO0o;
            } else {
                this.f9084OoooO0O.f9192OooO0oO = this.f9080Oooo0oo.OooO0o() + iOooOO0o;
                this.f9084OoooO0O.f9190OooO0o = -iOooOO0o2;
            }
            o00Ooo o00ooo3 = this.f9084OoooO0O;
            o00ooo3.f9193OooO0oo = false;
            o00ooo3.f9186OooO00o = true;
            if (this.f9080Oooo0oo.OooO() == 0 && this.f9080Oooo0oo.OooO0o() == 0) {
                z = true;
            }
            o00ooo3.f9185OooO = z;
        }
        iOooOO0o = 0;
        iOooOO0o2 = 0;
        if (getClipToPadding()) {
            this.f9084OoooO0O.f9190OooO0o = this.f9080Oooo0oo.OooOO0O() - iOooOO0o2;
            this.f9084OoooO0O.f9192OooO0oO = this.f9080Oooo0oo.OooO0oO() + iOooOO0o;
        } else {
            this.f9084OoooO0O.f9192OooO0oO = this.f9080Oooo0oo.OooO0o() + iOooOO0o;
            this.f9084OoooO0O.f9190OooO0o = -iOooOO0o2;
        }
        o00Ooo o00ooo4 = this.f9084OoooO0O;
        o00ooo4.f9193OooO0oo = false;
        o00ooo4.f9186OooO00o = true;
        if (this.f9080Oooo0oo.OooO() == 0) {
            z = true;
        }
        o00ooo4.f9185OooO = z;
    }

    public final void Oooo00o(OooO0OO oooO0OO, int i, int i2) {
        int i3 = oooO0OO.f9120OooO0Oo;
        if (i == -1) {
            int i4 = oooO0OO.f9118OooO0O0;
            if (i4 == Integer.MIN_VALUE) {
                oooO0OO.OooO0OO();
                i4 = oooO0OO.f9118OooO0O0;
            }
            if (i4 + i3 <= i2) {
                this.f9100o000oOoO.set(oooO0OO.f9122OooO0o0, false);
                return;
            }
            return;
        }
        int i5 = oooO0OO.f9119OooO0OO;
        if (i5 == Integer.MIN_VALUE) {
            oooO0OO.OooO0O0();
            i5 = oooO0OO.f9119OooO0OO;
        }
        if (i5 - i3 >= i2) {
            this.f9100o000oOoO.set(oooO0OO.f9122OooO0o0, false);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final void assertNotInLayoutOrScroll(String str) {
        if (this.f9092Ooooo0o == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final boolean canScrollHorizontally() {
        return this.f9083OoooO00 == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final boolean canScrollVertically() {
        return this.f9083OoooO00 == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final boolean checkLayoutParams(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final void collectAdjacentPrefetchPositions(int i, int i2, RecyclerView.o0OOO0o o0ooo0o2, RecyclerView.Oooo000.OooO0OO oooO0OO) {
        int iOooO;
        int iOooOO0o;
        if (this.f9083OoooO00 != 0) {
            i = i2;
        }
        if (getChildCount() == 0 || i == 0) {
            return;
        }
        OooOoOO(i, o0ooo0o2);
        int[] iArr = this.f9098OoooooO;
        if (iArr == null || iArr.length < this.f9078Oooo0o) {
            this.f9098OoooooO = new int[this.f9078Oooo0o];
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f9078Oooo0o; i4++) {
            o00Ooo o00ooo2 = this.f9084OoooO0O;
            if (o00ooo2.f9189OooO0Oo == -1) {
                iOooO = o00ooo2.f9190OooO0o;
                iOooOO0o = this.f9079Oooo0oO[i4].OooOO0o(iOooO);
            } else {
                iOooO = this.f9079Oooo0oO[i4].OooO(o00ooo2.f9192OooO0oO);
                iOooOO0o = this.f9084OoooO0O.f9192OooO0oO;
            }
            int i5 = iOooO - iOooOO0o;
            if (i5 >= 0) {
                this.f9098OoooooO[i3] = i5;
                i3++;
            }
        }
        Arrays.sort(this.f9098OoooooO, 0, i3);
        for (int i6 = 0; i6 < i3; i6++) {
            int i7 = this.f9084OoooO0O.f9188OooO0OO;
            if (!(i7 >= 0 && i7 < o0ooo0o2.OooO0O0())) {
                return;
            }
            ((o000oOoO.OooO0O0) oooO0OO).OooO00o(this.f9084OoooO0O.f9188OooO0OO, this.f9098OoooooO[i6]);
            o00Ooo o00ooo3 = this.f9084OoooO0O;
            o00ooo3.f9188OooO0OO += o00ooo3.f9189OooO0Oo;
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
        return o000000O.OooO00o(o0ooo0o2, this.f9080Oooo0oo, OooOOOO(!this.f9096Oooooo), OooOOO(!this.f9096Oooooo), this, this.f9096Oooooo);
    }

    public final int computeScrollOffset(RecyclerView.o0OOO0o o0ooo0o2) {
        if (getChildCount() == 0) {
            return 0;
        }
        return o000000O.OooO0O0(o0ooo0o2, this.f9080Oooo0oo, OooOOOO(!this.f9096Oooooo), OooOOO(!this.f9096Oooooo), this, this.f9096Oooooo, this.f9085OoooOO0);
    }

    public final int computeScrollRange(RecyclerView.o0OOO0o o0ooo0o2) {
        if (getChildCount() == 0) {
            return 0;
        }
        return o000000O.OooO0OO(o0ooo0o2, this.f9080Oooo0oo, OooOOOO(!this.f9096Oooooo), OooOOO(!this.f9096Oooooo), this, this.f9096Oooooo);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o0ooOOo.OooO0O0
    public final PointF computeScrollVectorForPosition(int i) {
        int iOooOO0O = OooOO0O(i);
        PointF pointF = new PointF();
        if (iOooOO0O == 0) {
            return null;
        }
        if (this.f9083OoooO00 == 0) {
            pointF.x = iOooOO0O;
            pointF.y = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        } else {
            pointF.x = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
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
        return this.f9083OoooO00 == 0 ? new LayoutParams(-2, -1) : new LayoutParams(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final RecyclerView.LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final boolean isAutoMeasureEnabled() {
        return this.f9089OoooOoO != 0;
    }

    public final boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final void offsetChildrenHorizontal(int i) {
        super.offsetChildrenHorizontal(i);
        for (int i2 = 0; i2 < this.f9078Oooo0o; i2++) {
            OooO0OO oooO0OO = this.f9079Oooo0oO[i2];
            int i3 = oooO0OO.f9118OooO0O0;
            if (i3 != Integer.MIN_VALUE) {
                oooO0OO.f9118OooO0O0 = i3 + i;
            }
            int i4 = oooO0OO.f9119OooO0OO;
            if (i4 != Integer.MIN_VALUE) {
                oooO0OO.f9119OooO0OO = i4 + i;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final void offsetChildrenVertical(int i) {
        super.offsetChildrenVertical(i);
        for (int i2 = 0; i2 < this.f9078Oooo0o; i2++) {
            OooO0OO oooO0OO = this.f9079Oooo0oO[i2];
            int i3 = oooO0OO.f9118OooO0O0;
            if (i3 != Integer.MIN_VALUE) {
                oooO0OO.f9118OooO0O0 = i3 + i;
            }
            int i4 = oooO0OO.f9119OooO0OO;
            if (i4 != Integer.MIN_VALUE) {
                oooO0OO.f9119OooO0OO = i4 + i;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final void onAdapterChanged(@Nullable RecyclerView.Adapter adapter, @Nullable RecyclerView.Adapter adapter2) {
        this.f9088OoooOo0.OooO0O0();
        for (int i = 0; i < this.f9078Oooo0o; i++) {
            this.f9079Oooo0oO[i].OooO0Oo();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.o00Ooo o00ooo2) {
        super.onDetachedFromWindow(recyclerView, o00ooo2);
        removeCallbacks(this.f9099Ooooooo);
        for (int i = 0; i < this.f9078Oooo0o; i++) {
            this.f9079Oooo0oO[i].OooO0Oo();
        }
        recyclerView.requestLayout();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0030  */
    /* JADX WARN: Code duplicated, block: B:30:0x003e  */
    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    @Nullable
    public final View onFocusSearchFailed(View view, int i, RecyclerView.o00Ooo o00ooo2, RecyclerView.o0OOO0o o0ooo0o2) {
        View viewFindContainingItemView;
        int i2;
        View viewOooOO0;
        if (getChildCount() == 0 || (viewFindContainingItemView = findContainingItemView(view)) == null) {
            return null;
        }
        resolveShouldLayoutReverse();
        if (i != 1) {
            if (i != 2) {
                if (i != 17) {
                    if (i != 33) {
                        if (i == 66 ? this.f9083OoooO00 == 0 : !(i != 130 || this.f9083OoooO00 != 1)) {
                            i2 = 1;
                        }
                    } else if (this.f9083OoooO00 == 1) {
                        i2 = -1;
                    }
                    i2 = Integer.MIN_VALUE;
                } else if (this.f9083OoooO00 == 0) {
                    i2 = -1;
                } else {
                    i2 = Integer.MIN_VALUE;
                }
            } else if (this.f9083OoooO00 != 1 && isLayoutRTL()) {
                i2 = -1;
            } else {
                i2 = 1;
            }
        } else if (this.f9083OoooO00 != 1 && isLayoutRTL()) {
            i2 = 1;
        } else {
            i2 = -1;
        }
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        LayoutParams layoutParams = (LayoutParams) viewFindContainingItemView.getLayoutParams();
        boolean z = layoutParams.f9101OoooO0;
        OooO0OO oooO0OO = layoutParams.f9102OoooO00;
        int iOooOOoo = i2 == 1 ? OooOOoo() : OooOOo();
        Oooo00O(iOooOOoo, o0ooo0o2);
        OooOooo(i2);
        o00Ooo o00ooo3 = this.f9084OoooO0O;
        o00ooo3.f9188OooO0OO = o00ooo3.f9189OooO0Oo + iOooOOoo;
        o00ooo3.f9187OooO0O0 = (int) (this.f9080Oooo0oo.OooOO0o() * 0.33333334f);
        o00Ooo o00ooo4 = this.f9084OoooO0O;
        o00ooo4.f9193OooO0oo = true;
        o00ooo4.f9186OooO00o = false;
        OooOOO0(o00ooo2, o00ooo4, o0ooo0o2);
        this.f9090OoooOoo = this.f9085OoooOO0;
        if (!z && (viewOooOO0 = oooO0OO.OooOO0(iOooOOoo, i2)) != null && viewOooOO0 != viewFindContainingItemView) {
            return viewOooOO0;
        }
        if (OooOoO(i2)) {
            for (int i3 = this.f9078Oooo0o - 1; i3 >= 0; i3--) {
                View viewOooOO1 = this.f9079Oooo0oO[i3].OooOO0(iOooOOoo, i2);
                if (viewOooOO1 != null && viewOooOO1 != viewFindContainingItemView) {
                    return viewOooOO1;
                }
            }
        } else {
            for (int i4 = 0; i4 < this.f9078Oooo0o; i4++) {
                View viewOooOO2 = this.f9079Oooo0oO[i4].OooOO0(iOooOOoo, i2);
                if (viewOooOO2 != null && viewOooOO2 != viewFindContainingItemView) {
                    return viewOooOO2;
                }
            }
        }
        boolean z2 = (this.f9081OoooO ^ true) == (i2 == -1);
        if (!z) {
            View viewFindViewByPosition = findViewByPosition(z2 ? oooO0OO.OooO0o0() : oooO0OO.OooO0o());
            if (viewFindViewByPosition != null && viewFindViewByPosition != viewFindContainingItemView) {
                return viewFindViewByPosition;
            }
        }
        if (OooOoO(i2)) {
            for (int i5 = this.f9078Oooo0o - 1; i5 >= 0; i5--) {
                if (i5 != oooO0OO.f9122OooO0o0) {
                    View viewFindViewByPosition2 = findViewByPosition(z2 ? this.f9079Oooo0oO[i5].OooO0o0() : this.f9079Oooo0oO[i5].OooO0o());
                    if (viewFindViewByPosition2 != null && viewFindViewByPosition2 != viewFindContainingItemView) {
                        return viewFindViewByPosition2;
                    }
                }
            }
        } else {
            for (int i6 = 0; i6 < this.f9078Oooo0o; i6++) {
                View viewFindViewByPosition3 = findViewByPosition(z2 ? this.f9079Oooo0oO[i6].OooO0o0() : this.f9079Oooo0oO[i6].OooO0o());
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
        this.f9088OoooOo0.OooO0O0();
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
        this.f9086OoooOOO = -1;
        this.f9087OoooOOo = Integer.MIN_VALUE;
        this.f9092Ooooo0o = null;
        this.f9095OooooOo.OooO0O0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.f9092Ooooo0o = savedState;
            if (this.f9086OoooOOO != -1) {
                savedState.f9123Oooo = null;
                savedState.f9126Oooo0oo = 0;
                savedState.f9124Oooo0o = -1;
                savedState.f9125Oooo0oO = -1;
                savedState.f9123Oooo = null;
                savedState.f9126Oooo0oo = 0;
                savedState.f9129OoooO00 = 0;
                savedState.f9128OoooO0 = null;
                savedState.f9130OoooO0O = null;
            }
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final Parcelable onSaveInstanceState() {
        int iOooOO0o;
        int iOooOO0O;
        int[] iArr;
        SavedState savedState = this.f9092Ooooo0o;
        if (savedState != null) {
            return new SavedState(savedState);
        }
        SavedState savedState2 = new SavedState();
        savedState2.f9127OoooO = this.f9081OoooO;
        savedState2.f9131OoooOO0 = this.f9090OoooOoo;
        savedState2.f9132o000oOoO = this.f9091Ooooo00;
        LazySpanLookup lazySpanLookup = this.f9088OoooOo0;
        if (lazySpanLookup == null || (iArr = lazySpanLookup.f9103OooO00o) == null) {
            savedState2.f9129OoooO00 = 0;
        } else {
            savedState2.f9128OoooO0 = iArr;
            savedState2.f9129OoooO00 = iArr.length;
            savedState2.f9130OoooO0O = lazySpanLookup.f9104OooO0O0;
        }
        if (getChildCount() > 0) {
            savedState2.f9124Oooo0o = this.f9090OoooOoo ? OooOOoo() : OooOOo();
            View viewOooOOO = this.f9085OoooOO0 ? OooOOO(true) : OooOOOO(true);
            savedState2.f9125Oooo0oO = viewOooOOO != null ? getPosition(viewOooOOO) : -1;
            int i = this.f9078Oooo0o;
            savedState2.f9126Oooo0oo = i;
            savedState2.f9123Oooo = new int[i];
            for (int i2 = 0; i2 < this.f9078Oooo0o; i2++) {
                if (this.f9090OoooOoo) {
                    iOooOO0o = this.f9079Oooo0oO[i2].OooO(Integer.MIN_VALUE);
                    if (iOooOO0o != Integer.MIN_VALUE) {
                        iOooOO0O = this.f9080Oooo0oo.OooO0oO();
                        iOooOO0o -= iOooOO0O;
                    }
                } else {
                    iOooOO0o = this.f9079Oooo0oO[i2].OooOO0o(Integer.MIN_VALUE);
                    if (iOooOO0o != Integer.MIN_VALUE) {
                        iOooOO0O = this.f9080Oooo0oo.OooOO0O();
                        iOooOO0o -= iOooOO0O;
                    }
                }
                savedState2.f9123Oooo[i2] = iOooOO0o;
            }
        } else {
            savedState2.f9124Oooo0o = -1;
            savedState2.f9125Oooo0oO = -1;
            savedState2.f9126Oooo0oo = 0;
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
        if (this.f9083OoooO00 == 1 || !isLayoutRTL()) {
            this.f9085OoooOO0 = this.f9081OoooO;
        } else {
            this.f9085OoooOO0 = !this.f9081OoooO;
        }
    }

    public final int scrollBy(int i, RecyclerView.o00Ooo o00ooo2, RecyclerView.o0OOO0o o0ooo0o2) {
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        OooOoOO(i, o0ooo0o2);
        int iOooOOO0 = OooOOO0(o00ooo2, this.f9084OoooO0O, o0ooo0o2);
        if (this.f9084OoooO0O.f9187OooO0O0 >= iOooOOO0) {
            i = i < 0 ? -iOooOOO0 : iOooOOO0;
        }
        this.f9080Oooo0oo.OooOOOo(-i);
        this.f9090OoooOoo = this.f9085OoooOO0;
        o00Ooo o00ooo3 = this.f9084OoooO0O;
        o00ooo3.f9187OooO0O0 = 0;
        OooOoo0(o00ooo2, o00ooo3);
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final int scrollHorizontallyBy(int i, RecyclerView.o00Ooo o00ooo2, RecyclerView.o0OOO0o o0ooo0o2) {
        return scrollBy(i, o00ooo2, o0ooo0o2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final void scrollToPosition(int i) {
        SavedState savedState = this.f9092Ooooo0o;
        if (savedState != null && savedState.f9124Oooo0o != i) {
            savedState.f9123Oooo = null;
            savedState.f9126Oooo0oo = 0;
            savedState.f9124Oooo0o = -1;
            savedState.f9125Oooo0oO = -1;
        }
        this.f9086OoooOOO = i;
        this.f9087OoooOOo = Integer.MIN_VALUE;
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
        if (this.f9083OoooO00 == 1) {
            iChooseSize2 = RecyclerView.Oooo000.chooseSize(i2, rect.height() + paddingBottom, getMinimumHeight());
            iChooseSize = RecyclerView.Oooo000.chooseSize(i, (this.f9082OoooO0 * this.f9078Oooo0o) + paddingRight, getMinimumWidth());
        } else {
            iChooseSize = RecyclerView.Oooo000.chooseSize(i, rect.width() + paddingRight, getMinimumWidth());
            iChooseSize2 = RecyclerView.Oooo000.chooseSize(i2, (this.f9082OoooO0 * this.f9078Oooo0o) + paddingBottom, getMinimumHeight());
        }
        setMeasuredDimension(iChooseSize, iChooseSize2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.o0OOO0o o0ooo0o2, int i) {
        oo000o oo000oVar = new oo000o(recyclerView.getContext());
        oo000oVar.setTargetPosition(i);
        startSmoothScroll(oo000oVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final boolean supportsPredictiveItemAnimations() {
        return this.f9092Ooooo0o == null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final RecyclerView.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public static class LazySpanLookup {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int[] f9103OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public List<FullSpanItem> f9104OooO0O0;

        public final void OooO(int i, int i2) {
            int[] iArr = this.f9103OooO00o;
            if (iArr == null || i >= iArr.length) {
                return;
            }
            int i3 = i + i2;
            OooO0OO(i3);
            int[] iArr2 = this.f9103OooO00o;
            System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
            int[] iArr3 = this.f9103OooO00o;
            Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
            List<FullSpanItem> list = this.f9104OooO0O0;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.f9104OooO0O0.get(size);
                int i4 = fullSpanItem.f9106Oooo0o;
                if (i4 >= i) {
                    if (i4 < i3) {
                        this.f9104OooO0O0.remove(size);
                    } else {
                        fullSpanItem.f9106Oooo0o = i4 - i2;
                    }
                }
            }
        }

        public final void OooO00o(FullSpanItem fullSpanItem) {
            if (this.f9104OooO0O0 == null) {
                this.f9104OooO0O0 = new ArrayList();
            }
            int size = this.f9104OooO0O0.size();
            for (int i = 0; i < size; i++) {
                FullSpanItem fullSpanItem2 = this.f9104OooO0O0.get(i);
                if (fullSpanItem2.f9106Oooo0o == fullSpanItem.f9106Oooo0o) {
                    this.f9104OooO0O0.remove(i);
                }
                if (fullSpanItem2.f9106Oooo0o >= fullSpanItem.f9106Oooo0o) {
                    this.f9104OooO0O0.add(i, fullSpanItem);
                    return;
                }
            }
            this.f9104OooO0O0.add(fullSpanItem);
        }

        public final void OooO0O0() {
            int[] iArr = this.f9103OooO00o;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f9104OooO0O0 = null;
        }

        public final void OooO0OO(int i) {
            int[] iArr = this.f9103OooO00o;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i, 10) + 1];
                this.f9103OooO00o = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i >= iArr.length) {
                int length = iArr.length;
                while (length <= i) {
                    length *= 2;
                }
                int[] iArr3 = new int[length];
                this.f9103OooO00o = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f9103OooO00o;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        public final int OooO0Oo(int i) {
            List<FullSpanItem> list = this.f9104OooO0O0;
            if (list != null) {
                int size = list.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    if (this.f9104OooO0O0.get(size).f9106Oooo0o >= i) {
                        this.f9104OooO0O0.remove(size);
                    }
                }
            }
            return OooO0oO(i);
        }

        public final FullSpanItem OooO0o(int i) {
            List<FullSpanItem> list = this.f9104OooO0O0;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.f9104OooO0O0.get(size);
                if (fullSpanItem.f9106Oooo0o == i) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        public final FullSpanItem OooO0o0(int i, int i2, int i3) {
            List<FullSpanItem> list = this.f9104OooO0O0;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                FullSpanItem fullSpanItem = this.f9104OooO0O0.get(i4);
                int i5 = fullSpanItem.f9106Oooo0o;
                if (i5 >= i2) {
                    return null;
                }
                if (i5 >= i && (i3 == 0 || fullSpanItem.f9107Oooo0oO == i3 || fullSpanItem.f9105Oooo)) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x000e  */
        public final int OooO0oO(int i) {
            int i2;
            int[] iArr = this.f9103OooO00o;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            if (this.f9104OooO0O0 != null) {
                FullSpanItem fullSpanItemOooO0o = OooO0o(i);
                if (fullSpanItemOooO0o != null) {
                    this.f9104OooO0O0.remove(fullSpanItemOooO0o);
                }
                int size = this.f9104OooO0O0.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        i3 = -1;
                        break;
                    }
                    if (this.f9104OooO0O0.get(i3).f9106Oooo0o >= i) {
                        break;
                    }
                    i3++;
                }
                if (i3 != -1) {
                    FullSpanItem fullSpanItem = this.f9104OooO0O0.get(i3);
                    this.f9104OooO0O0.remove(i3);
                    i2 = fullSpanItem.f9106Oooo0o;
                } else {
                    i2 = -1;
                }
            } else {
                i2 = -1;
            }
            if (i2 == -1) {
                int[] iArr2 = this.f9103OooO00o;
                Arrays.fill(iArr2, i, iArr2.length, -1);
                return this.f9103OooO00o.length;
            }
            int iMin = Math.min(i2 + 1, this.f9103OooO00o.length);
            Arrays.fill(this.f9103OooO00o, i, iMin, -1);
            return iMin;
        }

        public final void OooO0oo(int i, int i2) {
            int[] iArr = this.f9103OooO00o;
            if (iArr == null || i >= iArr.length) {
                return;
            }
            int i3 = i + i2;
            OooO0OO(i3);
            int[] iArr2 = this.f9103OooO00o;
            System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
            Arrays.fill(this.f9103OooO00o, i, i3, -1);
            List<FullSpanItem> list = this.f9104OooO0O0;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.f9104OooO0O0.get(size);
                int i4 = fullSpanItem.f9106Oooo0o;
                if (i4 >= i) {
                    fullSpanItem.f9106Oooo0o = i4 + i2;
                }
            }
        }

        @SuppressLint({"BanParcelableUsage"})
        public static class FullSpanItem implements Parcelable {
            public static final Parcelable.Creator<FullSpanItem> CREATOR = new OooO00o();

            /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
            public boolean f9105Oooo;

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public int f9106Oooo0o;

            /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
            public int f9107Oooo0oO;

            /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
            public int[] f9108Oooo0oo;

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
                this.f9106Oooo0o = parcel.readInt();
                this.f9107Oooo0oO = parcel.readInt();
                this.f9105Oooo = parcel.readInt() == 1;
                int i = parcel.readInt();
                if (i > 0) {
                    int[] iArr = new int[i];
                    this.f9108Oooo0oo = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final String toString() {
                StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("FullSpanItem{mPosition=");
                sbOooO0o0.append(this.f9106Oooo0o);
                sbOooO0o0.append(", mGapDir=");
                sbOooO0o0.append(this.f9107Oooo0oO);
                sbOooO0o0.append(", mHasUnwantedGapAfter=");
                sbOooO0o0.append(this.f9105Oooo);
                sbOooO0o0.append(", mGapPerSpan=");
                sbOooO0o0.append(Arrays.toString(this.f9108Oooo0oo));
                sbOooO0o0.append('}');
                return sbOooO0o0.toString();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.f9106Oooo0o);
                parcel.writeInt(this.f9107Oooo0oO);
                parcel.writeInt(this.f9105Oooo ? 1 : 0);
                int[] iArr = this.f9108Oooo0oo;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.f9108Oooo0oo);
                }
            }

            public FullSpanItem() {
            }
        }
    }
}
