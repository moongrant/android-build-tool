package p202o00o0Ooo;

import android.util.SparseArray;
import com.app.selectPicture.model.ImageModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class o00oOoo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public Map<Long, ImageModel> f33232OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public ArrayList<ImageModel> f33233OooO0O0;

    public o00oOoo() {
        new SparseArray();
        this.f33232OooO00o = null;
        this.f33233OooO0O0 = null;
        OooO0OO();
    }

    public final boolean OooO00o(Long l) {
        OooO0OO();
        return this.f33232OooO00o.containsKey(l);
    }

    public final int OooO0O0(ImageModel imageModel) {
        OooO0OO();
        for (int i = 0; i < this.f33233OooO0O0.size(); i++) {
            ImageModel imageModel2 = this.f33233OooO0O0.get(i);
            if (imageModel2 != null && imageModel2.f12318Oooo0o == imageModel.f12318Oooo0o) {
                return i;
            }
        }
        return -1;
    }

    public final void OooO0OO() {
        if (this.f33232OooO00o == null) {
            this.f33232OooO00o = new HashMap();
        }
        if (this.f33233OooO0O0 == null) {
            this.f33233OooO0O0 = new ArrayList<>();
        }
    }

    public final void OooO0Oo(ImageModel imageModel) {
        OooO0OO();
        int iOooO0O0 = OooO0O0(imageModel);
        if (iOooO0O0 != -1) {
            this.f33233OooO0O0.remove(iOooO0O0);
            this.f33232OooO00o.remove(Long.valueOf(imageModel.f12318Oooo0o));
        }
    }

    public final int OooO0o() {
        OooO0OO();
        return this.f33233OooO0O0.size();
    }

    public final void OooO0o0(ArrayList<ImageModel> arrayList) {
        this.f33233OooO0O0 = arrayList;
        TreeMap treeMap = new TreeMap();
        if (arrayList != null) {
            for (ImageModel imageModel : arrayList) {
                treeMap.put(Long.valueOf(imageModel.f12318Oooo0o), imageModel);
            }
        }
        this.f33232OooO00o = treeMap;
        OooO0OO();
    }
}
