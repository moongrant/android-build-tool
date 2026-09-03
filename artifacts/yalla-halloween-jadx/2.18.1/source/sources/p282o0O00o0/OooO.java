package p282o0O00o0;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class OooO<T> extends RecyclerView.Adapter<OooOOO0> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public Context f35202OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f35203OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public List<T> f35204OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f35205OooO0Oo;

    public OooO(Context context, int i) {
        this.f35202OooO00o = context;
        LayoutInflater.from(context);
        this.f35203OooO0O0 = i;
        this.f35204OooO0OO = null;
    }

    public abstract void OooO00o(OooOOO0 oooOOO0, T t);

    public final void OooO0O0(List<T> list) {
        this.f35204OooO0OO = list;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        List<T> list = this.f35204OooO0OO;
        int size = list == null ? 0 : list.size();
        if (size == 0) {
            return 0;
        }
        if (this.f35205OooO0Oo) {
            return 2147483646;
        }
        return size;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(@NonNull RecyclerView.oo0o0Oo oo0o0oo, int i) {
        T t;
        OooOOO0 oooOOO0 = (OooOOO0) oo0o0oo;
        if (this.f35205OooO0Oo) {
            t = this.f35204OooO0OO.get(i % this.f35204OooO0OO.size());
            Objects.requireNonNull(oooOOO0);
        } else {
            Objects.requireNonNull(oooOOO0);
            t = this.f35204OooO0OO.get(i);
        }
        OooO00o(oooOOO0, t);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public final RecyclerView.oo0o0Oo onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Context context = this.f35202OooO00o;
        int i2 = this.f35203OooO0O0;
        int i3 = OooOOO0.f35209OooO0OO;
        return new OooOOO0(LayoutInflater.from(context).inflate(i2, viewGroup, false));
    }
}
