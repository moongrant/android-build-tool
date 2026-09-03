package p515o0o0O00O;

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
import p114o00O00o.OooO0OO;
import p368o0OOo0Oo.Oooo000;
import p562o0oOo000.o0Oo0oo;

/* JADX INFO: loaded from: classes4.dex */
public final class o0ooOOo extends OooO0OO {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Activity f51087OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public List<String> f51088OooO0Oo;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final HashMap<Integer, ShowImageUrlMoreHolderView> f51091OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public ArrayList<Bitmap> f51092OooO0oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final ArrayList f51090OooO0o0 = new ArrayList();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f51089OooO0o = 4;

    public o0ooOOo(ShowImageActivity showImageActivity, ArrayList arrayList) {
        this.f51088OooO0Oo = new ArrayList();
        this.f51087OooO0OO = showImageActivity;
        for (int i = 0; i < this.f51089OooO0o; i++) {
            this.f51090OooO0o0.add(new ShowImageUrlMoreHolderView(this.f51087OooO0OO));
        }
        this.f51091OooO0oO = new HashMap<>();
        this.f51092OooO0oo = null;
        this.f51088OooO0Oo = arrayList;
        if (arrayList == null) {
            this.f51088OooO0Oo = new ArrayList();
        }
        OooO();
    }

    @Override // p114o00O00o.OooO0OO
    public final void OooO00o(ViewGroup viewGroup, int i, Object obj) {
        ArrayList arrayList;
        int i2 = i % this.f51089OooO0o;
        List<String> list = this.f51088OooO0Oo;
        if (list == null || list.isEmpty() || (arrayList = this.f51090OooO0o0) == null || arrayList.isEmpty() || arrayList.size() <= i2) {
            return;
        }
        ShowImageUrlMoreHolderView showImageUrlMoreHolderView = (ShowImageUrlMoreHolderView) arrayList.get(i2);
        if (showImageUrlMoreHolderView != null) {
            showImageUrlMoreHolderView.OooO0o0();
        }
        viewGroup.removeView(showImageUrlMoreHolderView.getConvertView());
    }

    @Override // p114o00O00o.OooO0OO
    public final int OooO0OO() {
        List<String> list = this.f51088OooO0Oo;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // p114o00O00o.OooO0OO
    public final /* bridge */ /* synthetic */ int OooO0Oo(Object obj) {
        return -2;
    }

    @Override // p114o00O00o.OooO0OO
    public final Object OooO0oO(ViewGroup viewGroup, int i) {
        ArrayList arrayList;
        o0ooOOo o0ooooo = this;
        int i2 = i % o0ooooo.f51089OooO0o;
        List<String> list = o0ooooo.f51088OooO0Oo;
        if (list == null || list.isEmpty() || (arrayList = o0ooooo.f51090OooO0o0) == null || arrayList.isEmpty() || o0ooooo.f51088OooO0Oo.size() <= i || arrayList.size() <= i2) {
            return null;
        }
        String str = o0ooooo.f51088OooO0Oo.get(i);
        ShowImageUrlMoreHolderView showImageUrlMoreHolderView = (ShowImageUrlMoreHolderView) arrayList.get(i2);
        showImageUrlMoreHolderView.getClass();
        ArrayList<Bitmap> arrayList2 = o0ooooo.f51092OooO0oo;
        if (arrayList2 != null && arrayList2.size() > i && o0ooooo.f51092OooO0oo.get(i) != null) {
            showImageUrlMoreHolderView.f27314OooOO0.setVisibility(0);
            showImageUrlMoreHolderView.f27314OooOO0.setImageBitmap(o0ooooo.f51092OooO0oo.get(i));
        }
        if (str != null) {
            showImageUrlMoreHolderView.OooO0o0();
            showImageUrlMoreHolderView.getConvertView().setVisibility(0);
            showImageUrlMoreHolderView.f27318OooOOO0.setVisibility(0);
            String str2 = p184o00o00O0.OooO0OO.OooO0Oo(str) + "?imageMogr2/interlace/1";
            showImageUrlMoreHolderView.f27316OooOO0o.setVisibility(0);
            Oooo000.OooO00o oooO00o = new Oooo000.OooO00o(showImageUrlMoreHolderView.getContext());
            Oooo000.OooO00o oooO00o2 = new Oooo000.OooO00o();
            int i3 = o0Oo0oo.icon_picture_default;
            oooO00o2.f43128OooO0o = i3;
            oooO00o2.f43141OooOOoo = 1;
            oooO00o2.f43151OooOoo0 = 1;
            String str3 = oooO00o2.f43131OooO0oo;
            boolean z = oooO00o2.f43127OooO0Oo;
            int i4 = oooO00o2.f43138OooOOOo;
            ImageView imageView = oooO00o2.f43132OooOO0;
            boolean z2 = oooO00o2.f43136OooOOO0;
            int i5 = oooO00o2.f43135OooOOO;
            int i6 = oooO00o2.f43137OooOOOO;
            int i7 = oooO00o2.f43150OooOoo;
            int i8 = oooO00o2.f43144OooOo00;
            boolean z3 = oooO00o2.f43143OooOo0;
            int i9 = oooO00o2.f43146OooOo0o;
            int i10 = oooO00o2.f43142OooOo;
            int i11 = oooO00o2.f43148OooOoO0;
            int i12 = oooO00o2.f43147OooOoO;
            int i13 = oooO00o2.f43149OooOoOO;
            int i14 = oooO00o2.f43152OooOooO;
            int i15 = oooO00o2.f43153OooOooo;
            boolean z4 = oooO00o2.f43145OooOo0O;
            boolean z5 = oooO00o2.f43155Oooo00O;
            oooO00o.f43131OooO0oo = str3;
            oooO00o.f43127OooO0Oo = z;
            oooO00o.f43138OooOOOo = i4;
            oooO00o.f43141OooOOoo = 1;
            oooO00o.f43128OooO0o = i3;
            oooO00o.f43132OooOO0 = imageView;
            oooO00o.f43135OooOOO = i5;
            oooO00o.f43137OooOOOO = i6;
            oooO00o.f43151OooOoo0 = 1;
            oooO00o.f43150OooOoo = i7;
            oooO00o.f43144OooOo00 = i8;
            oooO00o.f43143OooOo0 = z3;
            oooO00o.f43145OooOo0O = z4;
            oooO00o.f43146OooOo0o = i9;
            oooO00o.f43142OooOo = i10;
            oooO00o.f43148OooOoO0 = i11;
            oooO00o.f43147OooOoO = i12;
            oooO00o.f43149OooOoOO = i13;
            oooO00o.f43152OooOooO = i14;
            oooO00o.f43153OooOooo = i15;
            oooO00o.f43155Oooo00O = z5;
            oooO00o.f43136OooOOO0 = z2;
            oooO00o.f43126OooO0OO = str2;
            oooO00o.f43124OooO00o = 0;
            oooO00o.f43129OooO0o0 = true;
            showImageUrlMoreHolderView = showImageUrlMoreHolderView;
            oooO00o.f43133OooOO0O = new o00oO0o(showImageUrlMoreHolderView);
            oooO00o.OooO0Oo(showImageUrlMoreHolderView.f27316OooOO0o);
            o0ooooo = this;
        }
        o0ooooo.f51091OooO0oO.put(Integer.valueOf(i), showImageUrlMoreHolderView);
        View convertView = showImageUrlMoreHolderView.getConvertView();
        viewGroup.addView(convertView);
        return convertView;
    }

    @Override // p114o00O00o.OooO0OO
    public final boolean OooO0oo(View view, Object obj) {
        return view == obj;
    }

    public final ShowImageUrlMoreHolderView OooOOo0(Integer num) {
        HashMap<Integer, ShowImageUrlMoreHolderView> map = this.f51091OooO0oO;
        if (map == null || map.isEmpty()) {
            return null;
        }
        return map.get(num);
    }
}
