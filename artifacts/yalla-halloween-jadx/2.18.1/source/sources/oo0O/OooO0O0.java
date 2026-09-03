package oo0O;

import com.android.billingclient.api.o0Oo0oo;
import com.app.base.model.TagListModel;
import com.weieyu.yalla.R;
import java.util.Map;
import p153o00Oo0oO.o00000OO;
import p153o00Oo0oO.o000OOo;
import p153o00Oo0oO.o00oO0o;
import p153o00Oo0oO.o0ooOOo;
import p160o00OoOO0.o00OO0O0;
import p566o0oOo00O.oO00000o;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static OooO0O0 f53322OooO0OO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public TagListModel f53323OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int[] f53324OooO0O0 = {R.drawable.icon_tag_career, R.drawable.icon_tag_status, R.drawable.icon_tag_hobby, R.drawable.icon_tag_community, R.drawable.icon_tag_sport, R.drawable.icon_tag_game};

    public class OooO00o extends o00OO0O0.OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0439OooO0O0 f53325OooO00o;

        public OooO00o(InterfaceC0439OooO0O0 interfaceC0439OooO0O0) {
            this.f53325OooO00o = interfaceC0439OooO0O0;
        }

        @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
        public final void onFinish(String str) {
            super.onFinish(str);
            TagListModel tagListModel = (TagListModel) o0Oo0oo.OooO0O0(str, TagListModel.class);
            if (com.yalla.support.common.util.OooO0OO.OooO0O0(tagListModel.data) && com.yalla.support.common.util.OooO0OO.OooO0O0(tagListModel.data1)) {
                for (int i = 0; i < tagListModel.data.size(); i++) {
                    if (i < OooO0O0.this.f53324OooO0O0.length) {
                        tagListModel.data.get(i).icon = OooO0O0.this.f53324OooO0O0[i];
                    }
                }
                OooO0O0.this.f53323OooO00o = tagListModel;
                InterfaceC0439OooO0O0 interfaceC0439OooO0O0 = this.f53325OooO00o;
                if (interfaceC0439OooO0O0 != null) {
                    ((oO00000o) interfaceC0439OooO0O0).OooO0OO(tagListModel);
                }
            }
        }
    }

    /* JADX INFO: renamed from: oo0O.OooO0O0$OooO0O0, reason: collision with other inner class name */
    public interface InterfaceC0439OooO0O0 {
    }

    public static OooO0O0 OooO00o() {
        if (f53322OooO0OO == null) {
            synchronized (OooO0O0.class) {
                if (f53322OooO0OO == null) {
                    f53322OooO0OO = new OooO0O0();
                }
            }
        }
        return f53322OooO0OO;
    }

    public final void OooO0O0(InterfaceC0439OooO0O0 interfaceC0439OooO0O0) {
        o00oO0o o00oo0o2 = o00000OO.f32207OooO00o;
        o000OOo o000ooo2 = o00000OO.f32209OooO0OO;
        OooO00o oooO00o = new OooO00o(interfaceC0439OooO0O0);
        Map<String, String> mapOooO0O0 = o00OO0O0.OooO0O0();
        o0ooOOo o0ooooo2 = o0ooOOo.f32218OooO00o;
        o00OO0O0.OooO0OO(null, o0ooOOo.f32244OooOoo, o0ooOOo.f32287o00000Oo, mapOooO0O0, oooO00o);
    }
}
