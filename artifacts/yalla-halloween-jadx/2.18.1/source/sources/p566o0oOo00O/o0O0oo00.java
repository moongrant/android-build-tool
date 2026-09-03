package p566o0oOo00O;

import android.content.Intent;
import android.os.Parcelable;
import android.view.View;
import com.app.base.model.TagListModel;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.yalla.yalla.common.db.table.UserInfo;
import com.yalla.yalla.ui.activity.user.UserInfoEditActivity;
import com.yalla.yalla.ui.activity.user.UserInfoTagActivity;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p654o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O0oo00 extends o00Oo0 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ UserInfoEditActivity f45315Oooo;

    public o0O0oo00(UserInfoEditActivity userInfoEditActivity) {
        this.f45315Oooo = userInfoEditActivity;
    }

    @Override // p654o0ooo.o00Oo0
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f45315Oooo.Oooo00o();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        List<UserInfo.TagInfo> list = this.f45315Oooo.f23511o0OoOo0;
        if (list != null) {
            for (UserInfo.TagInfo tagInfo : list) {
                TagListModel.TagInfo tagInfo2 = new TagListModel.TagInfo();
                tagInfo2.tagId = tagInfo.getTagId();
                tagInfo2.tagName = tagInfo.getTagName();
                tagInfo2.typeId = tagInfo.getTypeId();
                arrayList.add(tagInfo2);
            }
        }
        UserInfoTagActivity.OooO00o oooO00o = UserInfoTagActivity.f23538o00ooo;
        UserInfoEditActivity context = this.f45315Oooo;
        Objects.requireNonNull(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intent intent = new Intent(context, (Class<?>) UserInfoTagActivity.class);
        intent.putParcelableArrayListExtra(ViewHierarchyConstants.TAG_KEY, arrayList);
        context.startActivity(intent);
    }
}
