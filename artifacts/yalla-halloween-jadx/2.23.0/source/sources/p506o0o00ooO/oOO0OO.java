package p506o0o00ooO;

import android.app.Activity;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.yalla.yalla.ui.activity.moment.ShowImageActivity;
import com.yalla.yalla.ui.adapter.showImageUrlMore.ShowImageUrlMoreHolderView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p082o000OoOo.OooOO0O;
import p139o00OOooO.OooO0o;
import p362o0OOo0O.OooOO0;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO0OO extends OooOO0O {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Activity f49722OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public List<String> f49723OooO0Oo;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final HashMap<Integer, ShowImageUrlMoreHolderView> f49726OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public ArrayList<Bitmap> f49727OooO0oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final ArrayList f49725OooO0o0 = new ArrayList();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f49724OooO0o = 4;

    public oOO0OO(ShowImageActivity showImageActivity, ArrayList arrayList) {
        this.f49723OooO0Oo = new ArrayList();
        this.f49722OooO0OO = showImageActivity;
        for (int i = 0; i < this.f49724OooO0o; i++) {
            this.f49725OooO0o0.add(new ShowImageUrlMoreHolderView(this.f49722OooO0OO));
        }
        this.f49726OooO0oO = new HashMap<>();
        this.f49727OooO0oo = null;
        this.f49723OooO0Oo = arrayList;
        if (arrayList == null) {
            this.f49723OooO0Oo = new ArrayList();
        }
        OooO();
    }

    @Override // p082o000OoOo.OooOO0O
    public final void OooO00o(ViewGroup viewGroup, int i, Object obj) {
        ArrayList arrayList;
        int i2 = i % this.f49724OooO0o;
        List<String> list = this.f49723OooO0Oo;
        if (list == null || list.isEmpty() || (arrayList = this.f49725OooO0o0) == null || arrayList.isEmpty() || arrayList.size() <= i2) {
            return;
        }
        ShowImageUrlMoreHolderView showImageUrlMoreHolderView = (ShowImageUrlMoreHolderView) arrayList.get(i2);
        if (showImageUrlMoreHolderView != null) {
            showImageUrlMoreHolderView.OooO0o0();
        }
        viewGroup.removeView(showImageUrlMoreHolderView.getConvertView());
    }

    @Override // p082o000OoOo.OooOO0O
    public final int OooO0OO() {
        List<String> list = this.f49723OooO0Oo;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // p082o000OoOo.OooOO0O
    public final /* bridge */ /* synthetic */ int OooO0Oo(Object obj) {
        return -2;
    }

    @Override // p082o000OoOo.OooOO0O
    public final Object OooO0oO(ViewGroup viewGroup, int i) {
        ArrayList arrayList;
        oOO0OO ooo0oo = this;
        int i2 = i % ooo0oo.f49724OooO0o;
        List<String> list = ooo0oo.f49723OooO0Oo;
        if (list == null || list.isEmpty() || (arrayList = ooo0oo.f49725OooO0o0) == null || arrayList.isEmpty() || ooo0oo.f49723OooO0Oo.size() <= i || arrayList.size() <= i2) {
            return null;
        }
        String str = ooo0oo.f49723OooO0Oo.get(i);
        ShowImageUrlMoreHolderView showImageUrlMoreHolderView = (ShowImageUrlMoreHolderView) arrayList.get(i2);
        showImageUrlMoreHolderView.getClass();
        ArrayList<Bitmap> arrayList2 = ooo0oo.f49727OooO0oo;
        if (arrayList2 != null && arrayList2.size() > i && ooo0oo.f49727OooO0oo.get(i) != null) {
            showImageUrlMoreHolderView.f27776OooOO0.setVisibility(0);
            showImageUrlMoreHolderView.f27776OooOO0.setImageBitmap(ooo0oo.f49727OooO0oo.get(i));
        }
        if (str != null) {
            showImageUrlMoreHolderView.OooO0o0();
            showImageUrlMoreHolderView.getConvertView().setVisibility(0);
            showImageUrlMoreHolderView.f27780OooOOO0.setVisibility(0);
            String str2 = OooO0o.OooO0Oo(str) + "?imageMogr2/interlace/1";
            showImageUrlMoreHolderView.f27778OooOO0o.setVisibility(0);
            OooOO0.OooO00o oooO00o = new OooOO0.OooO00o(showImageUrlMoreHolderView.getContext());
            OooOO0.OooO00o oooO00o2 = new OooOO0.OooO00o();
            int i3 = oOo00OO0.icon_picture_default;
            oooO00o2.f43913OooO0o = i3;
            oooO00o2.f43926OooOOoo = 1;
            oooO00o2.f43936OooOoo0 = 1;
            String str3 = oooO00o2.f43916OooO0oo;
            boolean z = oooO00o2.f43912OooO0Oo;
            int i4 = oooO00o2.f43923OooOOOo;
            ImageView imageView = oooO00o2.f43917OooOO0;
            boolean z2 = oooO00o2.f43921OooOOO0;
            int i5 = oooO00o2.f43920OooOOO;
            int i6 = oooO00o2.f43922OooOOOO;
            int i7 = oooO00o2.f43935OooOoo;
            int i8 = oooO00o2.f43929OooOo00;
            boolean z3 = oooO00o2.f43928OooOo0;
            int i9 = oooO00o2.f43931OooOo0o;
            int i10 = oooO00o2.f43927OooOo;
            int i11 = oooO00o2.f43933OooOoO0;
            int i12 = oooO00o2.f43932OooOoO;
            int i13 = oooO00o2.f43934OooOoOO;
            int i14 = oooO00o2.f43937OooOooO;
            int i15 = oooO00o2.f43938OooOooo;
            boolean z4 = oooO00o2.f43930OooOo0O;
            boolean z5 = oooO00o2.f43940Oooo00O;
            oooO00o.f43916OooO0oo = str3;
            oooO00o.f43912OooO0Oo = z;
            oooO00o.f43923OooOOOo = i4;
            oooO00o.f43926OooOOoo = 1;
            oooO00o.f43913OooO0o = i3;
            oooO00o.f43917OooOO0 = imageView;
            oooO00o.f43920OooOOO = i5;
            oooO00o.f43922OooOOOO = i6;
            oooO00o.f43936OooOoo0 = 1;
            oooO00o.f43935OooOoo = i7;
            oooO00o.f43929OooOo00 = i8;
            oooO00o.f43928OooOo0 = z3;
            oooO00o.f43930OooOo0O = z4;
            oooO00o.f43931OooOo0o = i9;
            oooO00o.f43927OooOo = i10;
            oooO00o.f43933OooOoO0 = i11;
            oooO00o.f43932OooOoO = i12;
            oooO00o.f43934OooOoOO = i13;
            oooO00o.f43937OooOooO = i14;
            oooO00o.f43938OooOooo = i15;
            oooO00o.f43940Oooo00O = z5;
            oooO00o.f43921OooOOO0 = z2;
            oooO00o.f43911OooO0OO = str2;
            oooO00o.f43909OooO00o = 0;
            oooO00o.f43914OooO0o0 = true;
            showImageUrlMoreHolderView = showImageUrlMoreHolderView;
            oooO00o.f43918OooOO0O = new oOO0OO0O(showImageUrlMoreHolderView);
            oooO00o.OooO0Oo(showImageUrlMoreHolderView.f27778OooOO0o);
            ooo0oo = this;
        }
        ooo0oo.f49726OooO0oO.put(Integer.valueOf(i), showImageUrlMoreHolderView);
        View convertView = showImageUrlMoreHolderView.getConvertView();
        viewGroup.addView(convertView);
        return convertView;
    }

    @Override // p082o000OoOo.OooOO0O
    public final boolean OooO0oo(View view, Object obj) {
        return view == obj;
    }

    public final ShowImageUrlMoreHolderView OooOOo0(Integer num) {
        HashMap<Integer, ShowImageUrlMoreHolderView> map = this.f49726OooO0oO;
        if (map == null || map.isEmpty()) {
            return null;
        }
        return map.get(num);
    }
}
