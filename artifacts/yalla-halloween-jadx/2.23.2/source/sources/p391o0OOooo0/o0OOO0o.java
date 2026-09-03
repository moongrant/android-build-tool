package p391o0OOooo0;

import com.code.android.util.OooOo00;
import com.yalla.yalla.http.iteratehttp.OooO0OO;
import com.yalla.yalla.model.TagListModel;
import p289o0O0Oo0.o000O0Oo;
import p590o0oOooo0.oOOO00;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OOO0o extends OooO0OO.OooO0O0 {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ o0Oo0oo f43567OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o0Oo0oo.OooO00o f43568OooO0o0;

    public o0OOO0o(o0Oo0oo o0oo0oo2, o000O0Oo o000o0oo2) {
        this.f43567OooO0o = o0oo0oo2;
        this.f43568OooO0o0 = o000o0oo2;
    }

    @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
    public final void OooO0o0(String str) {
        o0Oo0oo o0oo0oo2;
        TagListModel tagListModel = (TagListModel) oOOO00.OooO00o(str, TagListModel.class);
        if (OooOo00.OooO0O0(tagListModel.data) && OooOo00.OooO0O0(tagListModel.data1)) {
            int i = 0;
            while (true) {
                int size = tagListModel.data.size();
                o0oo0oo2 = this.f43567OooO0o;
                if (i >= size) {
                    break;
                }
                if (i < o0oo0oo2.f43571OooO0O0.length) {
                    tagListModel.data.get(i).icon = o0oo0oo2.f43571OooO0O0[i];
                }
                i++;
            }
            o0oo0oo2.f43570OooO00o = tagListModel;
            o0Oo0oo.OooO00o oooO00o = this.f43568OooO0o0;
            if (oooO00o != null) {
                ((o000O0Oo) oooO00o).OooO0O0(tagListModel);
            }
        }
    }
}
