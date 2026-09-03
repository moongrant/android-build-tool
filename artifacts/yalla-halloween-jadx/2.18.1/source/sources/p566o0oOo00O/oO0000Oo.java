package p566o0oOo00O;

import androidx.fragment.app.FragmentActivity;
import com.app.base.model.TagListModel;
import com.code.android.util.ToastUtil;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.db.table.UserInfo;
import com.yalla.yalla.ui.activity.user.UserInfoTagActivity;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p160o00OoOO0.o00OO0O0;
import p254o00ooO0O.o000O0O0;
import p498o0o00Oo0.OooOOO;

/* JADX INFO: loaded from: classes3.dex */
public final class oO0000Oo extends o00OO0O0.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ UserInfoTagActivity f45356OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0000Oo(UserInfoTagActivity userInfoTagActivity, FragmentActivity fragmentActivity) {
        super(fragmentActivity);
        this.f45356OooO00o = userInfoTagActivity;
    }

    @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
    public final void onFinish(@NotNull String response) {
        Intrinsics.checkNotNullParameter(response, "response");
        ArrayList arrayList = new ArrayList();
        ArrayList<TagListModel.TagInfo> arrayList2 = this.f45356OooO00o.f23547OoooooO;
        Intrinsics.checkNotNull(arrayList2);
        for (TagListModel.TagInfo tagInfo : arrayList2) {
            UserInfo.TagInfo tagInfo2 = new UserInfo.TagInfo();
            Intrinsics.checkNotNull(tagInfo);
            tagInfo2.setTagId(tagInfo.tagId);
            String str = tagInfo.tagName;
            Intrinsics.checkNotNullExpressionValue(str, "selectedTag.tagName");
            tagInfo2.setTagName(str);
            tagInfo2.setTypeId(tagInfo.typeId);
            arrayList.add(tagInfo2);
        }
        OooOOO.f41216OooO00o.OooOOoo().postValue(arrayList);
        ToastUtil.f12567OooO00o.OooO0O0(o000O0O0.OooO0OO(R.string.Userinfo_edit_success));
        this.f45356OooO00o.finish();
    }
}
