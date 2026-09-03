package p496o0o00o;

import android.os.Looper;
import androidx.lifecycle.MutableLiveData;
import com.code.android.util.o0000;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
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
import p464o0Oooo.o000000O;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0O0 extends Lambda implements Function1<UserEditResult, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UserInfoTagActivity f49152OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0O0(UserInfoTagActivity userInfoTagActivity) {
        super(1);
        this.f49152OooO0Oo = userInfoTagActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(UserEditResult userEditResult) {
        if (userEditResult != null) {
            ArrayList arrayList = new ArrayList();
            UserInfoTagActivity userInfoTagActivity = this.f49152OooO0Oo;
            ArrayList<TagListModel.TagInfo> arrayList2 = userInfoTagActivity.f27344OooOoo0;
            if (arrayList2 != null) {
                for (TagListModel.TagInfo tagInfo : arrayList2) {
                    UserInfo.TagInfo tagInfo2 = new UserInfo.TagInfo();
                    tagInfo2.setTagId(tagInfo.tagId);
                    String str = tagInfo.tagName;
                    Intrinsics.checkNotNullExpressionValue(str, "selectedTag.tagName");
                    tagInfo2.setTagName(str);
                    tagInfo2.setTypeId(tagInfo.typeId);
                    arrayList.add(tagInfo2);
                }
            }
            o000000O o000000o2 = o000000O.f46674OooO00o;
            ((MutableLiveData) o000000O.f46698OooOoO0.getValue()).postValue(arrayList);
            String strOooO0OO = o0000.OooO0OO(oO00OOo0.Userinfo_edit_success);
            if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                o000Oo0 o000oo0OooO00o = o000O00.OooO00o(strOooO0OO, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o.run();
                } else {
                    o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                }
            }
            userInfoTagActivity.finish();
        }
        return Unit.INSTANCE;
    }
}
