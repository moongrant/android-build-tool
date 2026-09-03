package p395o0Oo00oo;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.yalla.yalla.base.abs.AbsView.AbsView;
import com.yalla.yalla.model.bean.AbsJavaBean;
import java.lang.Enum;
import java.util.ArrayList;
import java.util.List;
import p629o0ooO0O0.o0000Ooo;

/* JADX INFO: loaded from: classes4.dex */
public abstract class o000000O<Model extends AbsJavaBean, View extends AbsView, TAG extends Enum> extends BaseAdapter {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public o0000Ooo<Model, TAG> f44409OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Activity f44410OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public ArrayList f44411OooO0o0;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final int f44413OooO0oo;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f44412OooO0oO = 1;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f44408OooO = 1;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f44414OooOO0 = 0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final boolean f44415OooOO0O = true;

    public o000000O(Activity activity, int i) {
        this.f44411OooO0o0 = new ArrayList();
        this.f44413OooO0oo = 10;
        this.f44413OooO0oo = i;
        this.f44410OooO0o = activity;
        activity.getBaseContext();
        this.f44411OooO0o0 = new ArrayList();
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
    public final Model getItem(int i) {
        ArrayList arrayList = this.f44411OooO0o0;
        if (arrayList == null || arrayList.size() < i) {
            return null;
        }
        return (Model) this.f44411OooO0o0.get(i);
    }

    public abstract View OooO0OO();

    public final void OooO0Oo(Model model, int i, TAG tag) {
        o0000Ooo<Model, TAG> o0000ooo = this.f44409OooO0Oo;
        if (o0000ooo != null) {
            o0000ooo.OooO00o(i, model, tag);
        }
    }

    public abstract void OooO0o(View view, Model model, int i);

    public void OooO0o0(List<Model> list) {
        if (this.f44411OooO0o0 == null) {
            this.f44411OooO0o0 = new ArrayList();
        }
        if (list == null) {
            list = new ArrayList<>();
        }
        this.f44411OooO0o0.clear();
        this.f44411OooO0o0.addAll(list);
        notifyDataSetChanged();
    }

    public abstract void OooO0oO(View view, Model model, int i);

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList arrayList = this.f44411OooO0o0;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2;
        AbsView absViewOooO0OO;
        if (view == null) {
            absViewOooO0OO = OooO0OO();
            view2 = absViewOooO0OO.f22730OooO;
            view2.setTag(absViewOooO0OO);
        } else {
            AbsView absView = (AbsView) view.getTag();
            absView.OooO0o0();
            view2 = view;
            absViewOooO0OO = absView;
        }
        OooO0oO(absViewOooO0OO, getItem(i), i);
        OooO0o(absViewOooO0OO, getItem(i), i);
        int size = this.f44411OooO0o0.size() - i;
        int size2 = this.f44411OooO0o0.size();
        int i2 = this.f44413OooO0oo;
        if (size2 >= i2 && size <= this.f44412OooO0oO && this.f44415OooOO0O) {
            int size3 = (((this.f44411OooO0o0.size() + i2) - 1) / i2) + 1;
            if (this.f44408OooO != size3) {
                this.f44408OooO = size3;
                if (this.f44414OooOO0 != size3) {
                    this.f44414OooOO0 = size3;
                }
            } else {
                this.f44408OooO = 1;
            }
        }
        return view2;
    }
}
