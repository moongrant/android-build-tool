package p568o0oOo00O;

import android.util.SparseArray;
import com.app.base.model.TagListModel;
import com.yalla.yalla.ui.activity.user.UserInfoTagActivity;
import com.yalla.yalla.ui.fragment.FriendListFragment;
import com.yalla.yalla.ui.fragment.PostDetailGiftFragment;
import kotlin.jvm.internal.Intrinsics;
import o00Oo00.OooO0OO;
import oo0O.OooO0O0;
import p393o0OOooOo.o0O00000;
import p410o0Oo0OOo.oO000Oo0;
import p420o0Oo0oOo.oO00OO0O;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class oO00000 implements OooO0O0.InterfaceC0438OooO0O0, oO00OO0O, OooO0OO {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ Object f45363Oooo;

    public /* synthetic */ oO00000(Object obj) {
        this.f45363Oooo = obj;
    }

    @Override // o00Oo00.OooO0OO
    public final void OooO00o(Object obj) {
        PostDetailGiftFragment this$0 = (PostDetailGiftFragment) this.f45363Oooo;
        int iIntValue = ((Integer) obj).intValue();
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        o0O00000.OooO0OO("Monents_comment_gifts_switch");
        this$0.giftListType = iIntValue;
        this$0.loadData(true, false);
    }

    @Override // p420o0Oo0oOo.oO00OO0O
    public final void OooO0O0(oO000Oo0 oo000oo0) {
        FriendListFragment.m332initView$lambda3((FriendListFragment) this.f45363Oooo, oo000oo0);
    }

    public final void OooO0OO(TagListModel tagListModel) {
        UserInfoTagActivity this$0 = (UserInfoTagActivity) this.f45363Oooo;
        UserInfoTagActivity.OooO00o oooO00o = UserInfoTagActivity.f23557o00oO0O;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f23560OooooOo = tagListModel;
        for (TagListModel.TagInfo tagInfo : tagListModel.data1) {
            this$0.f23566o00Oo0.put(tagInfo.tagId, tagInfo);
        }
        int size = tagListModel.data.size();
        int i = 0;
        while (i < size) {
            if (i < this$0.f23571o0OoOo0.length) {
                SparseArray<Integer> sparseArray = this$0.f23567o00Ooo;
                int i2 = tagListModel.data.get(i).tagId;
                int[] iArr = this$0.f23571o0OoOo0;
                sparseArray.put(i2, Integer.valueOf(iArr[i >= iArr.length ? iArr.length - 1 : i]));
            }
            if (i >= this$0.f23571o0OoOo0.length) {
                tagListModel.data.remove(i);
            }
            i++;
        }
        this$0.Oooo0o0();
        p189o00o00o0.OooO0OO<TagListModel.TagType> oooO0OOOooo000 = this$0.Oooo000();
        TagListModel tagListModel2 = this$0.f23560OooooOo;
        Intrinsics.checkNotNull(tagListModel2);
        oooO0OOOooo000.setNewData(tagListModel2.data);
        this$0.Oooo00O().f50686OooO0Oo.setVisibility(0);
        if (com.yalla.support.common.util.OooO0OO.OooO00o(this$0.f23573ooOO)) {
            this$0.Oooo0O0(0);
        }
    }
}
