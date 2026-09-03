package p385o0OOooOO;

import com.code.android.util.OooOo00;
import com.yalla.yalla.http.iteratehttp.OooO0OO;
import com.yalla.yalla.model.TagListModel;
import p496o0o00o.oO0O00;
import p579o0oOoo.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O000o extends OooO0OO.OooO0O0 {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ o00O00 f44342OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o00O00.OooO00o f44343OooO0o0;

    public o00O000o(o00O00 o00o01, oO0O00 oo0o00) {
        this.f44342OooO0o = o00o01;
        this.f44343OooO0o0 = oo0o00;
    }

    @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
    public final void OooO0o0(String str) {
        o00O00 o00o01;
        TagListModel tagListModel = (TagListModel) oOo00OO0.OooO00o(str, TagListModel.class);
        if (OooOo00.OooO0O0(tagListModel.data) && OooOo00.OooO0O0(tagListModel.data1)) {
            int i = 0;
            while (true) {
                int size = tagListModel.data.size();
                o00o01 = this.f44342OooO0o;
                if (i >= size) {
                    break;
                }
                if (i < o00o01.f44340OooO0O0.length) {
                    tagListModel.data.get(i).icon = o00o01.f44340OooO0O0[i];
                }
                i++;
            }
            o00o01.f44339OooO00o = tagListModel;
            o00O00.OooO00o oooO00o = this.f44343OooO0o0;
            if (oooO00o != null) {
                ((oO0O00) oooO00o).OooO00o(tagListModel);
            }
        }
    }
}
