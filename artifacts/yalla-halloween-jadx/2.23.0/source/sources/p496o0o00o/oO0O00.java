package p496o0o00o;

import com.code.android.util.OooOo00;
import com.yalla.yalla.model.TagListModel;
import com.yalla.yalla.ui.activity.user.UserInfoTagActivity;
import kotlin.jvm.internal.Intrinsics;
import p385o0OOooOO.o00O00;
import p564o0oOo0OO.o000O;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class oO0O00 implements o00O00.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ UserInfoTagActivity f49153OooO00o;

    public final void OooO00o(TagListModel tagListModel) {
        int i = UserInfoTagActivity.f27333Oooo0O0;
        UserInfoTagActivity this$0 = this.f49153OooO00o;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f27338OooOo0O = tagListModel;
        for (TagListModel.TagInfo tagInfo : tagListModel.data1) {
            this$0.f27345OooOooO.put(tagInfo.tagId, tagInfo);
        }
        int size = tagListModel.data.size();
        int i2 = 0;
        while (i2 < size) {
            int[] iArr = this$0.f27342OooOoOO;
            if (i2 < iArr.length) {
                this$0.f27346OooOooo.put(tagListModel.data.get(i2).tagId, Integer.valueOf(iArr[i2 >= iArr.length ? iArr.length - 1 : i2]));
            }
            if (i2 >= iArr.length) {
                tagListModel.data.remove(i2);
            }
            i2++;
        }
        this$0.Oooo000();
        o000O<TagListModel.TagType> o000oOooOoOO = this$0.OooOoOO();
        TagListModel tagListModel2 = this$0.f27338OooOo0O;
        Intrinsics.checkNotNull(tagListModel2);
        o000oOooOoOO.OooOoO0(tagListModel2.data);
        this$0.OooOoo0().f58308OooO0Oo.setVisibility(0);
        if (OooOo00.OooO00o(this$0.f27344OooOoo0)) {
            this$0.OooOooO(0);
        }
    }
}
