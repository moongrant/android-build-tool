package p506o0o00oOo;

import android.os.Looper;
import androidx.activity.OooOo00;
import androidx.lifecycle.MutableLiveData;
import com.code.android.util.o0000;
import com.code.android.util.o000O00O;
import com.code.android.util.o000Oo0;
import com.yalla.yalla.data.db.table.UserInfo;
import com.yalla.yalla.model.TagListModel;
import com.yalla.yalla.model.user.UserEditResult;
import com.yalla.yalla.ui.activity.user.UserInfoTagActivity;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p475o0Ooooo0.o0O00oO0;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class u0 extends Lambda implements Function1<UserEditResult, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UserInfoTagActivity f50593OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(UserInfoTagActivity userInfoTagActivity) {
        super(1);
        this.f50593OooO0Oo = userInfoTagActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(UserEditResult userEditResult) {
        if (userEditResult != null) {
            ArrayList arrayList = new ArrayList();
            UserInfoTagActivity userInfoTagActivity = this.f50593OooO0Oo;
            ArrayList<TagListModel.TagInfo> arrayList2 = userInfoTagActivity.f26879OooOoo0;
            if (arrayList2 != null) {
                for (TagListModel.TagInfo tagInfo : arrayList2) {
                    UserInfo.TagInfo tagInfo2 = new UserInfo.TagInfo();
                    tagInfo2.setTagId(tagInfo.tagId);
                    String tagName = tagInfo.tagName;
                    Intrinsics.checkNotNullExpressionValue(tagName, "tagName");
                    tagInfo2.setTagName(tagName);
                    tagInfo2.setTypeId(tagInfo.typeId);
                    arrayList.add(tagInfo2);
                }
            }
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            ((MutableLiveData) o0O00oO0.f47960OooOoO0.getValue()).postValue(arrayList);
            String strOooO0OO = o0000.OooO0OO(o000000.Userinfo_edit_success);
            if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                o000Oo0 o000oo0OooO00o = OooOo00.OooO00o(strOooO0OO, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o.run();
                } else {
                    o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
                }
            }
            userInfoTagActivity.finish();
        }
        return Unit.INSTANCE;
    }
}
