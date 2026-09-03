package p631o0ooO0O0;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.yalla.yalla.base.abs.AbsView.AbsView;
import com.yalla.yalla.model.bean.AbsJavaBean;
import java.lang.Enum;
import java.util.ArrayList;
import java.util.List;
import p400o0Oo0O0.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class o0000Ooo<Model extends AbsJavaBean, View extends AbsView, TAG extends Enum> extends BaseAdapter {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public OooOOO0<Model, TAG> f57682OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Activity f57683OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public ArrayList f57684OooO0o0;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final int f57686OooO0oo;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f57685OooO0oO = 1;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f57681OooO = 1;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f57687OooOO0 = 0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final boolean f57688OooOO0O = true;

    public o0000Ooo(Activity activity, int i) {
        this.f57684OooO0o0 = new ArrayList();
        this.f57686OooO0oo = 10;
        this.f57686OooO0oo = i;
        this.f57683OooO0o = activity;
        activity.getBaseContext();
        this.f57684OooO0o0 = new ArrayList();
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
    public final Model getItem(int i) {
        ArrayList arrayList = this.f57684OooO0o0;
        if (arrayList == null || arrayList.size() < i) {
            return null;
        }
        return (Model) this.f57684OooO0o0.get(i);
    }

    public abstract View OooO0OO();

    public final void OooO0Oo(Model model, int i, TAG tag) {
        OooOOO0<Model, TAG> oooOOO0 = this.f57682OooO0Oo;
        if (oooOOO0 != null) {
            oooOOO0.OooO00o(i, model, tag);
        }
    }

    public abstract void OooO0o(View view, Model model, int i);

    public void OooO0o0(List<Model> list) {
        if (this.f57684OooO0o0 == null) {
            this.f57684OooO0o0 = new ArrayList();
        }
        if (list == null) {
            list = new ArrayList<>();
        }
        this.f57684OooO0o0.clear();
        this.f57684OooO0o0.addAll(list);
        notifyDataSetChanged();
    }

    public abstract void OooO0oO(View view, Model model, int i);

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList arrayList = this.f57684OooO0o0;
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
            view2 = absViewOooO0OO.f22257OooO;
            view2.setTag(absViewOooO0OO);
        } else {
            AbsView absView = (AbsView) view.getTag();
            absView.OooO0o0();
            view2 = view;
            absViewOooO0OO = absView;
        }
        OooO0oO(absViewOooO0OO, getItem(i), i);
        OooO0o(absViewOooO0OO, getItem(i), i);
        int size = this.f57684OooO0o0.size() - i;
        int size2 = this.f57684OooO0o0.size();
        int i2 = this.f57686OooO0oo;
        if (size2 >= i2 && size <= this.f57685OooO0oO && this.f57688OooOO0O) {
            int size3 = (((this.f57684OooO0o0.size() + i2) - 1) / i2) + 1;
            if (this.f57681OooO != size3) {
                this.f57681OooO = size3;
                if (this.f57687OooOO0 != size3) {
                    this.f57687OooOO0 = size3;
                }
            } else {
                this.f57681OooO = 1;
            }
        }
        return view2;
    }
}
