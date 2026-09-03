package p165o00OoOoO;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.app.base.bean.AbsJavaBean;
import com.app.base.framework.abs.AbsView.AbsView;
import java.lang.Enum;
import java.util.ArrayList;
import java.util.List;
import o00Oo00.OooO0O0;

/* JADX INFO: loaded from: classes.dex */
public abstract class o0O000o0<Model extends AbsJavaBean, View extends AbsView, TAG extends Enum> extends BaseAdapter {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public OooO0O0<Model, TAG> f32546Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public List<Model> f32547Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public Activity f32548Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public int f32551OoooO00;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public int f32545Oooo = 1;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public int f32550OoooO0 = 1;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public int f32552OoooO0O = 0;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public boolean f32549OoooO = true;

    public o0O000o0(Activity activity, int i) {
        this.f32547Oooo0oO = new ArrayList();
        this.f32551OoooO00 = i;
        this.f32548Oooo0oo = activity;
        activity.getBaseContext();
        this.f32547Oooo0oO = new ArrayList();
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
    public final Model getItem(int i) {
        List<Model> list = this.f32547Oooo0oO;
        if (list == null || list.size() < i) {
            return null;
        }
        return (Model) this.f32547Oooo0oO.get(i);
    }

    public abstract View OooO0OO();

    public final void OooO0Oo(Model model, int i, TAG tag) {
        OooO0O0<Model, TAG> oooO0O0 = this.f32546Oooo0o;
        if (oooO0O0 != null) {
            oooO0O0.OooO0O0(model, i, tag);
        }
    }

    public abstract void OooO0o(View view, Model model, int i);

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public void OooO0o0(List<Model> list) {
        if (this.f32547Oooo0oO == null) {
            this.f32547Oooo0oO = new ArrayList();
        }
        if (list == null) {
            list = new ArrayList<>();
        }
        this.f32547Oooo0oO.clear();
        this.f32547Oooo0oO.addAll(list);
        notifyDataSetChanged();
    }

    public abstract void OooO0oO(View view, Model model, int i);

    @Override // android.widget.Adapter
    public final int getCount() {
        List<Model> list = this.f32547Oooo0oO;
        if (list != null) {
            return list.size();
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
            view2 = absViewOooO0OO.f11713OoooO0;
            view2.setTag(absViewOooO0OO);
        } else {
            AbsView absView = (AbsView) view.getTag();
            absView.OooO0o0();
            view2 = view;
            absViewOooO0OO = absView;
        }
        OooO0oO(absViewOooO0OO, getItem(i), i);
        OooO0o(absViewOooO0OO, getItem(i), i);
        int size = this.f32547Oooo0oO.size() - i;
        if (this.f32547Oooo0oO.size() >= this.f32551OoooO00 && size <= this.f32545Oooo && this.f32549OoooO) {
            int size2 = this.f32547Oooo0oO.size();
            int i2 = this.f32551OoooO00;
            int i3 = (((size2 + i2) - 1) / i2) + 1;
            if (this.f32550OoooO0 != i3) {
                this.f32550OoooO0 = i3;
                if (this.f32552OoooO0O != i3) {
                    this.f32552OoooO0O = i3;
                }
            } else {
                this.f32550OoooO0 = 1;
            }
        }
        return view2;
    }
}
