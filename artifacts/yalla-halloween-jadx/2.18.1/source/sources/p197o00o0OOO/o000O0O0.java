package p197o00o0OOO;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.app.selectPicture.adapter.showImageLoad.ShowImageLoadHolderView;
import java.util.ArrayList;
import java.util.List;
import p105o000oo0o.o00Ooo;
import p193o00o0O00.OooOo;
import p200o00o0Oo0.o0000;
import p200o00o0Oo0.o0000Ooo;
import p206o00o0o0o.o000Oo0;

/* JADX INFO: loaded from: classes.dex */
public final class o000O0O0 extends o00Ooo {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public Activity f33203OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public List<String> f33204OooO0Oo;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public o0000Ooo<String, Integer> f33207OooO0oO;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public List<ShowImageLoadHolderView> f33206OooO0o0 = new ArrayList();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f33205OooO0o = 4;

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList, java.util.List<com.app.selectPicture.adapter.showImageLoad.ShowImageLoadHolderView>] */
    public o000O0O0(Activity activity, ArrayList<String> arrayList) {
        this.f33204OooO0Oo = new ArrayList();
        this.f33203OooO0OO = activity;
        for (int i = 0; i < this.f33205OooO0o; i++) {
            this.f33206OooO0o0.add(new ShowImageLoadHolderView(this.f33203OooO0OO));
        }
        this.f33204OooO0Oo = arrayList;
        if (arrayList == null) {
            this.f33204OooO0Oo = new ArrayList();
        }
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.ArrayList, java.util.List<com.app.selectPicture.adapter.showImageLoad.ShowImageLoadHolderView>] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.ArrayList, java.util.List<com.app.selectPicture.adapter.showImageLoad.ShowImageLoadHolderView>] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.util.ArrayList, java.util.List<com.app.selectPicture.adapter.showImageLoad.ShowImageLoadHolderView>] */
    @Override // p105o000oo0o.o00Ooo
    public final void OooO00o(ViewGroup viewGroup, int i, Object obj) {
        ?? r3;
        int i2 = i % this.f33205OooO0o;
        List<String> list = this.f33204OooO0Oo;
        if (list == null || list.isEmpty() || (r3 = this.f33206OooO0o0) == 0 || r3.isEmpty() || this.f33206OooO0o0.size() <= i2) {
            return;
        }
        ShowImageLoadHolderView showImageLoadHolderView = (ShowImageLoadHolderView) this.f33206OooO0o0.get(i2);
        if (showImageLoadHolderView != null) {
            showImageLoadHolderView.OooO0Oo();
        }
        viewGroup.removeView(showImageLoadHolderView.getConvertView());
    }

    @Override // p105o000oo0o.o00Ooo
    public final int OooO0OO() {
        List<String> list = this.f33204OooO0Oo;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // p105o000oo0o.o00Ooo
    public final /* bridge */ /* synthetic */ int OooO0Oo(Object obj) {
        return -2;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList, java.util.List<com.app.selectPicture.adapter.showImageLoad.ShowImageLoadHolderView>] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList, java.util.List<com.app.selectPicture.adapter.showImageLoad.ShowImageLoadHolderView>] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.ArrayList, java.util.List<com.app.selectPicture.adapter.showImageLoad.ShowImageLoadHolderView>] */
    @Override // p105o000oo0o.o00Ooo
    public final Object OooO0oO(ViewGroup viewGroup, int i) {
        ?? r1;
        int i2 = i % this.f33205OooO0o;
        List<String> list = this.f33204OooO0Oo;
        if (list == null || list.isEmpty() || (r1 = this.f33206OooO0o0) == 0 || r1.isEmpty() || this.f33204OooO0Oo.size() <= i || this.f33206OooO0o0.size() <= i2) {
            return null;
        }
        String str = this.f33204OooO0Oo.get(i);
        ShowImageLoadHolderView showImageLoadHolderView = (ShowImageLoadHolderView) this.f33206OooO0o0.get(i2);
        showImageLoadHolderView.f12298OoooO = str;
        showImageLoadHolderView.f12303OoooOOO = i;
        if (str != null) {
            showImageLoadHolderView.OooO0Oo();
            boolean z = false;
            showImageLoadHolderView.getConvertView().setVisibility(0);
            showImageLoadHolderView.f12301OoooO0O.setVisibility(0);
            if (!TextUtils.isEmpty(str) && (str.startsWith("http") || str.startsWith("https") || str.startsWith("/http") || str.startsWith("/https"))) {
                z = true;
            }
            if (z) {
                OooOo.OooO00o().OooO00o(showImageLoadHolderView.f12300OoooO00, str, showImageLoadHolderView.f12301OoooO0O);
            } else {
                o0000 o0000VarOooO00o = OooOo.OooO00o();
                Context context = showImageLoadHolderView.f12300OoooO00;
                o0000VarOooO00o.OooO0O0(context, o000Oo0.OooO0OO(context, str), showImageLoadHolderView.f12301OoooO0O);
            }
        }
        showImageLoadHolderView.setListener(this.f33207OooO0oO);
        View convertView = showImageLoadHolderView.getConvertView();
        viewGroup.addView(convertView);
        return convertView;
    }

    @Override // p105o000oo0o.o00Ooo
    public final boolean OooO0oo(View view, Object obj) {
        return view == obj;
    }
}
