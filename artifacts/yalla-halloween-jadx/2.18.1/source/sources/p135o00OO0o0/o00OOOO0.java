package p135o00OO0o0;

import android.app.Activity;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import com.app.base.adapter.showImageUrlMore.ShowImageUrlMoreHolderView;
import com.weieyu.yalla.R;
import com.yalla.support.cloudfilemanager.util.CloudImageUtilKt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import p105o000oo0o.o00Ooo;
import p616o0oo0Ooo.oO0O00;

/* JADX INFO: loaded from: classes.dex */
public final class o00OOOO0 extends o00Ooo {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public Activity f31636OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public List<String> f31637OooO0Oo;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public HashMap<Integer, ShowImageUrlMoreHolderView> f31640OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public ArrayList<Bitmap> f31641OooO0oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public List<ShowImageUrlMoreHolderView> f31639OooO0o0 = new ArrayList();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f31638OooO0o = 4;

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList, java.util.List<com.app.base.adapter.showImageUrlMore.ShowImageUrlMoreHolderView>] */
    public o00OOOO0(Activity activity, ArrayList<String> arrayList) {
        this.f31637OooO0Oo = new ArrayList();
        this.f31636OooO0OO = activity;
        for (int i = 0; i < this.f31638OooO0o; i++) {
            this.f31639OooO0o0.add(new ShowImageUrlMoreHolderView(this.f31636OooO0OO));
        }
        this.f31640OooO0oO = new HashMap<>();
        this.f31641OooO0oo = null;
        this.f31637OooO0Oo = arrayList;
        if (arrayList == null) {
            this.f31637OooO0Oo = new ArrayList();
        }
        OooO();
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.ArrayList, java.util.List<com.app.base.adapter.showImageUrlMore.ShowImageUrlMoreHolderView>] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.ArrayList, java.util.List<com.app.base.adapter.showImageUrlMore.ShowImageUrlMoreHolderView>] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.util.ArrayList, java.util.List<com.app.base.adapter.showImageUrlMore.ShowImageUrlMoreHolderView>] */
    @Override // p105o000oo0o.o00Ooo
    public final void OooO00o(ViewGroup viewGroup, int i, Object obj) {
        ?? r3;
        int i2 = i % this.f31638OooO0o;
        List<String> list = this.f31637OooO0Oo;
        if (list == null || list.isEmpty() || (r3 = this.f31639OooO0o0) == 0 || r3.isEmpty() || this.f31639OooO0o0.size() <= i2) {
            return;
        }
        ShowImageUrlMoreHolderView showImageUrlMoreHolderView = (ShowImageUrlMoreHolderView) this.f31639OooO0o0.get(i2);
        if (showImageUrlMoreHolderView != null) {
            showImageUrlMoreHolderView.OooO0o0();
        }
        viewGroup.removeView(showImageUrlMoreHolderView.getConvertView());
    }

    @Override // p105o000oo0o.o00Ooo
    public final int OooO0OO() {
        List<String> list = this.f31637OooO0Oo;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // p105o000oo0o.o00Ooo
    public final /* bridge */ /* synthetic */ int OooO0Oo(Object obj) {
        return -2;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList, java.util.List<com.app.base.adapter.showImageUrlMore.ShowImageUrlMoreHolderView>] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList, java.util.List<com.app.base.adapter.showImageUrlMore.ShowImageUrlMoreHolderView>] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.ArrayList, java.util.List<com.app.base.adapter.showImageUrlMore.ShowImageUrlMoreHolderView>] */
    @Override // p105o000oo0o.o00Ooo
    public final Object OooO0oO(ViewGroup viewGroup, int i) {
        ?? r1;
        int i2 = i % this.f31638OooO0o;
        List<String> list = this.f31637OooO0Oo;
        if (list == null || list.isEmpty() || (r1 = this.f31639OooO0o0) == 0 || r1.isEmpty() || this.f31637OooO0Oo.size() <= i || this.f31639OooO0o0.size() <= i2) {
            return null;
        }
        String str = this.f31637OooO0Oo.get(i);
        ShowImageUrlMoreHolderView showImageUrlMoreHolderView = (ShowImageUrlMoreHolderView) this.f31639OooO0o0.get(i2);
        Objects.requireNonNull(showImageUrlMoreHolderView);
        ArrayList<Bitmap> arrayList = this.f31641OooO0oo;
        if (arrayList != null && arrayList.size() > i && this.f31641OooO0oo.get(i) != null) {
            showImageUrlMoreHolderView.f11451OoooO0O.setVisibility(0);
            showImageUrlMoreHolderView.f11451OoooO0O.setImageBitmap(this.f31641OooO0oo.get(i));
        }
        if (str != null) {
            showImageUrlMoreHolderView.OooO0o0();
            showImageUrlMoreHolderView.getConvertView().setVisibility(0);
            showImageUrlMoreHolderView.f11455o000oOoO.setVisibility(0);
            String str2 = CloudImageUtilKt.imgFormat(str) + "?imageMogr2/interlace/1";
            showImageUrlMoreHolderView.f11452OoooOO0.setVisibility(0);
            oO0O00.OooO00o oooO00o = new oO0O00.OooO00o(showImageUrlMoreHolderView.getContext());
            oooO00o.f48434OooO0oo = null;
            oooO00o.f48430OooO0Oo = false;
            oooO00o.f48441OooOOOo = 0;
            oooO00o.f48444OooOOoo = 1;
            oooO00o.f48431OooO0o = R.drawable.icon_picture_default;
            oooO00o.f48435OooOO0 = null;
            oooO00o.f48438OooOOO = -1;
            oooO00o.f48440OooOOOO = -1;
            oooO00o.f48454OooOoo0 = 1;
            oooO00o.f48453OooOoo = 0;
            oooO00o.f48447OooOo00 = 0;
            oooO00o.f48446OooOo0 = false;
            oooO00o.f48448OooOo0O = false;
            oooO00o.f48449OooOo0o = 0;
            oooO00o.f48445OooOo = 0;
            oooO00o.f48451OooOoO0 = 0;
            oooO00o.f48450OooOoO = 0;
            oooO00o.f48452OooOoOO = 0;
            oooO00o.f48455OooOooO = 0;
            oooO00o.f48456OooOooo = 0;
            oooO00o.f48458Oooo00O = false;
            oooO00o.f48439OooOOO0 = false;
            oooO00o.f48429OooO0OO = str2;
            oooO00o.f48427OooO00o = 0;
            oooO00o.f48432OooO0o0 = true;
            oooO00o.f48436OooOO0O = new o0o0Oo(showImageUrlMoreHolderView);
            oooO00o.OooO0o(showImageUrlMoreHolderView.f11452OoooOO0);
        }
        this.f31640OooO0oO.put(Integer.valueOf(i), showImageUrlMoreHolderView);
        View convertView = showImageUrlMoreHolderView.getConvertView();
        viewGroup.addView(convertView);
        return convertView;
    }

    @Override // p105o000oo0o.o00Ooo
    public final boolean OooO0oo(View view, Object obj) {
        return view == obj;
    }

    public final ShowImageUrlMoreHolderView OooOOOo(Integer num) {
        HashMap<Integer, ShowImageUrlMoreHolderView> map = this.f31640OooO0oO;
        if (map == null || map.isEmpty()) {
            return null;
        }
        return this.f31640OooO0oO.get(num);
    }
}
