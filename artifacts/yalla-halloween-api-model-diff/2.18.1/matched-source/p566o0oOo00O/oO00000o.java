package p566o0oOo00O;

import android.util.SparseArray;
import com.app.base.model.TagListModel;
import com.yalla.yalla.ui.activity.user.UserInfoTagActivity;
import com.yalla.yalla.ui.fragment.FriendListFragment;
import com.yalla.yalla.ui.fragment.PostDetailGiftFragment;
import kotlin.jvm.internal.Intrinsics;
import o00Oo00.OooO0OO;
import oo0O.OooO0O0;
import p391o0OOooOo.o0O00000;
import p407o0Oo0OOo.oO000Oo;
import p417o0Oo0oOo.oO00OOO;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class oO00000o implements OooO0O0.InterfaceC0439OooO0O0, oO00OOO, OooO0OO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f45353OooO0Oo;

    public /* synthetic */ oO00000o(Object obj) {
        this.f45353OooO0Oo = obj;
    }

    @Override // o00Oo00.OooO0OO
    public final void OooO00o(Object obj) {
        PostDetailGiftFragment this$0 = (PostDetailGiftFragment) this.f45353OooO0Oo;
        int iIntValue = ((Integer) obj).intValue();
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        o0O00000.OooO0OO("Monents_comment_gifts_switch");
        this$0.giftListType = iIntValue;
        this$0.loadData(true, false);
    }

    @Override // p417o0Oo0oOo.oO00OOO
    public final void OooO0O0(oO000Oo oo000oo) {
        FriendListFragment.m332initView$lambda3((FriendListFragment) this.f45353OooO0Oo, oo000oo);
    }

    public final void OooO0OO(TagListModel tagListModel) {
        UserInfoTagActivity this$0 = (UserInfoTagActivity) this.f45353OooO0Oo;
        UserInfoTagActivity.OooO00o oooO00o = UserInfoTagActivity.f23538o00ooo;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f23541Ooooo0o = tagListModel;
        for (TagListModel.TagInfo tagInfo : tagListModel.data1) {
            this$0.f23553o0OoOo0.put(tagInfo.tagId, tagInfo);
        }
        int size = tagListModel.data.size();
        int i = 0;
        while (i < size) {
            if (i < this$0.f23545Oooooo.length) {
                SparseArray<Integer> sparseArray = this$0.f23554ooOO;
                int i2 = tagListModel.data.get(i).tagId;
                int[] iArr = this$0.f23545Oooooo;
                sparseArray.put(i2, Integer.valueOf(iArr[i >= iArr.length ? iArr.length - 1 : i]));
            }
            if (i >= this$0.f23545Oooooo.length) {
                tagListModel.data.remove(i);
            }
            i++;
        }
        this$0.Oooo0o0();
        p188o00o00o0.OooO0OO<TagListModel.TagType> oooO0OOOooo000 = this$0.Oooo000();
        TagListModel tagListModel2 = this$0.f23541Ooooo0o;
        Intrinsics.checkNotNull(tagListModel2);
        oooO0OOOooo000.setNewData(tagListModel2.data);
        this$0.Oooo00O().f50749OooO0Oo.setVisibility(0);
        if (com.yalla.support.common.util.OooO0OO.OooO00o(this$0.f23547OoooooO)) {
            this$0.Oooo0O0(0);
        }
    }
}
