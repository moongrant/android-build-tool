package p114o00O00o;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;

/* JADX INFO: loaded from: classes2.dex */
public abstract class OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final DataSetObservable f36128OooO00o = new DataSetObservable();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public DataSetObserver f36129OooO0O0;

    public final void OooO() {
        synchronized (this) {
            DataSetObserver dataSetObserver = this.f36129OooO0O0;
            if (dataSetObserver != null) {
                dataSetObserver.onChanged();
            }
        }
        this.f36128OooO00o.notifyChanged();
    }

    public void OooO00o(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    public void OooO0O0(@NonNull ViewGroup viewGroup) {
    }

    public abstract int OooO0OO();

    public int OooO0Oo(@NonNull Object obj) {
        return -1;
    }

    public float OooO0o(int i) {
        return 1.0f;
    }

    @Nullable
    public CharSequence OooO0o0(int i) {
        return null;
    }

    @NonNull
    public Object OooO0oO(@NonNull ViewGroup viewGroup, int i) {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    public abstract boolean OooO0oo(@NonNull View view, @NonNull Object obj);

    public void OooOO0(@NonNull DataSetObserver dataSetObserver) {
        this.f36128OooO00o.registerObserver(dataSetObserver);
    }

    public void OooOO0O(@Nullable Parcelable parcelable, @Nullable ClassLoader classLoader) {
    }

    @Nullable
    public Parcelable OooOO0o() {
        return null;
    }

    public final void OooOOO(ViewPager.OooOOO oooOOO) {
        synchronized (this) {
            this.f36129OooO0O0 = oooOOO;
        }
    }

    public void OooOOO0(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
    }

    public void OooOOOO(@NonNull ViewGroup viewGroup) {
    }

    public void OooOOOo(@NonNull DataSetObserver dataSetObserver) {
        this.f36128OooO00o.unregisterObserver(dataSetObserver);
    }
}
