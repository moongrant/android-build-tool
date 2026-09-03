package o0000OOO;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
public abstract class OooO00o extends BaseAdapter implements Filterable, o0000OOO.OooO0O0.OooO00o {

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public o0000OOO.OooO0O0 f33617OooOO0;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean f33614OooO0o0 = true;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Cursor f33613OooO0o = null;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean f33612OooO0Oo = false;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int f33615OooO0oO = -1;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public C0393OooO00o f33616OooO0oo = new C0393OooO00o();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public OooO0O0 f33611OooO = new OooO0O0();

    /* JADX INFO: renamed from: o0000OOO.OooO00o$OooO00o, reason: collision with other inner class name */
    public class C0393OooO00o extends ContentObserver {
        public C0393OooO00o() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public final boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public final void onChange(boolean z) {
            Cursor cursor;
            OooO00o oooO00o = OooO00o.this;
            if (!oooO00o.f33614OooO0o0 || (cursor = oooO00o.f33613OooO0o) == null || cursor.isClosed()) {
                return;
            }
            oooO00o.f33612OooO0Oo = oooO00o.f33613OooO0o.requery();
        }
    }

    public class OooO0O0 extends DataSetObserver {
        public OooO0O0() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            OooO00o oooO00o = OooO00o.this;
            oooO00o.f33612OooO0Oo = true;
            oooO00o.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            OooO00o oooO00o = OooO00o.this;
            oooO00o.f33612OooO0Oo = false;
            oooO00o.notifyDataSetInvalidated();
        }
    }

    public OooO00o(Context context) {
    }

    public abstract void OooO0O0(View view, Cursor cursor);

    public void OooO0OO(Cursor cursor) {
        Cursor cursor2 = this.f33613OooO0o;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                C0393OooO00o c0393OooO00o = this.f33616OooO0oo;
                if (c0393OooO00o != null) {
                    cursor2.unregisterContentObserver(c0393OooO00o);
                }
                OooO0O0 oooO0O0 = this.f33611OooO;
                if (oooO0O0 != null) {
                    cursor2.unregisterDataSetObserver(oooO0O0);
                }
            }
            this.f33613OooO0o = cursor;
            if (cursor != null) {
                C0393OooO00o c0393OooO00o2 = this.f33616OooO0oo;
                if (c0393OooO00o2 != null) {
                    cursor.registerContentObserver(c0393OooO00o2);
                }
                OooO0O0 oooO0O1 = this.f33611OooO;
                if (oooO0O1 != null) {
                    cursor.registerDataSetObserver(oooO0O1);
                }
                this.f33615OooO0oO = cursor.getColumnIndexOrThrow("_id");
                this.f33612OooO0Oo = true;
                notifyDataSetChanged();
            } else {
                this.f33615OooO0oO = -1;
                this.f33612OooO0Oo = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract String OooO0Oo(Cursor cursor);

    public abstract View OooO0o0(ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public final int getCount() {
        Cursor cursor;
        if (!this.f33612OooO0Oo || (cursor = this.f33613OooO0o) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.f33612OooO0Oo) {
            return null;
        }
        this.f33613OooO0o.moveToPosition(i);
        if (view == null) {
            OooO0OO oooO0OO = (OooO0OO) this;
            view = oooO0OO.f33623OooOOO0.inflate(oooO0OO.f33622OooOO0o, viewGroup, false);
        }
        OooO0O0(view, this.f33613OooO0o);
        return view;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.f33617OooOO0 == null) {
            this.f33617OooOO0 = new o0000OOO.OooO0O0(this);
        }
        return this.f33617OooOO0;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        Cursor cursor;
        if (!this.f33612OooO0Oo || (cursor = this.f33613OooO0o) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.f33613OooO0o;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        Cursor cursor;
        if (this.f33612OooO0Oo && (cursor = this.f33613OooO0o) != null && cursor.moveToPosition(i)) {
            return this.f33613OooO0o.getLong(this.f33615OooO0oO);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.f33612OooO0Oo) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (!this.f33613OooO0o.moveToPosition(i)) {
            throw new IllegalStateException(android.support.v4.media.OooO00o.OooO00o("couldn't move cursor to position ", i));
        }
        if (view == null) {
            view = OooO0o0(viewGroup);
        }
        OooO0O0(view, this.f33613OooO0o);
        return view;
    }
}
