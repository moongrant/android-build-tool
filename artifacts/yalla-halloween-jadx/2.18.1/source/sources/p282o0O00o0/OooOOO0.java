package p282o0O00o0;

import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO0 extends RecyclerView.oo0o0Oo {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final /* synthetic */ int f35209OooO0OO = 0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final View f35210OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final SparseArray<View> f35211OooO0O0;

    public OooOOO0(View view) {
        super(view);
        this.f35210OooO00o = view;
        this.f35211OooO0O0 = new SparseArray<>();
    }

    public final <T extends View> T OooO00o(int i) {
        T t = (T) this.f35211OooO0O0.get(i);
        if (t != null) {
            return t;
        }
        T t2 = (T) this.f35210OooO00o.findViewById(i);
        this.f35211OooO0O0.put(i, t2);
        return t2;
    }
}
