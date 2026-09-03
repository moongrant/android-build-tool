package p194o00o0O0O;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.app.selectPicture.activity.ShowImagesSelectActivity;
import com.app.selectPicture.model.ImageModel;
import java.util.List;
import java.util.Objects;
import p192o00o0O0.o0000O0;
import p192o00o0O0.o0000O0O;
import p192o00o0O0.o0000oo;
import p193o00o0O00.OooOo;
import p198o00o0OOo.o000O;
import p200o00o0Oo0.o0000;

/* JADX INFO: loaded from: classes.dex */
public abstract class o0000OO0<T> extends RecyclerView.Adapter<RecyclerView.oo0o0Oo> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public Context f33170OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public List<T> f33171OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f33172OooO0OO;

    public o0000OO0(Context context, int i) {
        this.f33170OooO00o = context;
        this.f33172OooO0OO = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        List<T> list = this.f33171OooO0O0;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(@NonNull RecyclerView.oo0o0Oo oo0o0oo, int i) {
        List<T> list = this.f33171OooO0O0;
        if (list == null || list.size() <= i) {
            return;
        }
        o0000O0O o0000o0o2 = (o0000O0O) this;
        ImageModel imageModel = (ImageModel) this.f33171OooO0O0.get(i);
        if (imageModel == null || oo0o0oo == null) {
            return;
        }
        o000O o000o = (o000O) oo0o0oo;
        o000o.f33208OooO00o.setVisibility(0);
        o000o.f33210OooO0OO.setVisibility(8);
        o000o.f33211OooO0Oo.setVisibility(8);
        o0000o0o2.OooO00o(o000o.f33210OooO0OO, imageModel);
        o0000 o0000VarOooO00o = OooOo.OooO00o();
        ShowImagesSelectActivity showImagesSelectActivity = o0000o0o2.f33090OooO0Oo;
        Objects.requireNonNull(showImagesSelectActivity);
        o0000VarOooO00o.OooO0O0(showImagesSelectActivity, imageModel.f12326o000oOoO, o000o.f33209OooO0O0);
        o000o.f33210OooO0OO.setOnClickListener(new o0000oo(o0000o0o2, oo0o0oo, imageModel));
        o000o.f33209OooO0O0.setOnClickListener(new o0000O0(o0000o0o2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.oo0o0Oo onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new o000O(LayoutInflater.from(this.f33170OooO00o).inflate(this.f33172OooO0OO, viewGroup, false));
    }
}
