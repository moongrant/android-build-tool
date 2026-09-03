package p496o0o00o;

import android.content.Intent;
import android.os.Parcelable;
import android.view.View;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.yalla.yalla.data.db.table.UserInfo;
import com.yalla.yalla.model.TagListModel;
import com.yalla.yalla.ui.activity.user.UserInfoEditActivity;
import com.yalla.yalla.ui.activity.user.UserInfoTagActivity;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p466o0Oooo0o.oo00o;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nUserInfoEditActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserInfoEditActivity.kt\ncom/yalla/yalla/ui/activity/user/UserInfoEditActivity$initView$11\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,875:1\n1855#2,2:876\n*S KotlinDebug\n*F\n+ 1 UserInfoEditActivity.kt\ncom/yalla/yalla/ui/activity/user/UserInfoEditActivity$initView$11\n*L\n596#1:876,2\n*E\n"})
public final class ooOOOOoo extends oo00o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ UserInfoEditActivity f49208OooO0oO;

    public ooOOOOoo(UserInfoEditActivity userInfoEditActivity) {
        this.f49208OooO0oO = userInfoEditActivity;
    }

    @Override // p466o0Oooo0o.oo00o
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        UserInfoEditActivity context = this.f49208OooO0oO;
        context.OooOoo();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        List<UserInfo.TagInfo> list = context.f27293OooOoo;
        if (list != null) {
            for (UserInfo.TagInfo tagInfo : list) {
                TagListModel.TagInfo tagInfo2 = new TagListModel.TagInfo();
                tagInfo2.tagId = tagInfo.getTagId();
                tagInfo2.tagName = tagInfo.getTagName();
                tagInfo2.typeId = tagInfo.getTypeId();
                arrayList.add(tagInfo2);
            }
        }
        int i = UserInfoTagActivity.f27333Oooo0O0;
        context.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intent intent = new Intent(context, (Class<?>) UserInfoTagActivity.class);
        intent.putParcelableArrayListExtra(ViewHierarchyConstants.TAG_KEY, arrayList);
        context.startActivity(intent);
    }
}
