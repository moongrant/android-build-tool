package com.code.android.util;

import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yalla.yalla.model.TagListModel;
import com.yalla.yalla.ui.activity.user.UserInfoTagActivity;
import com.yalla.yalla.util.permission.PermissionGroupReveal;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o000OO0O implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f13434OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f13435OooO0o0;

    public /* synthetic */ o000OO0O(Object obj, int i) {
        this.f13434OooO0Oo = i;
        this.f13435OooO0o0 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f13434OooO0Oo;
        Object obj = this.f13435OooO0o0;
        switch (i) {
            case 0:
                Function1 listener = (Function1) obj;
                Intrinsics.checkNotNullParameter(listener, "$listener");
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (Math.abs(jCurrentTimeMillis - o000O0Oo.f13426OooO00o) > 500) {
                    o000O0Oo.f13426OooO00o = jCurrentTimeMillis;
                    Intrinsics.checkNotNull(view);
                    listener.invoke(view);
                }
                break;
            case 1:
                UserInfoTagActivity this$0 = (UserInfoTagActivity) obj;
                int i2 = UserInfoTagActivity.f26868Oooo0O0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                SparseArray<TagListModel.TagInfo> sparseArray = this$0.f26880OooOooO;
                Object tag = view.getTag();
                Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type kotlin.Int");
                TagListModel.TagInfo tagInfo = sparseArray.get(((Integer) tag).intValue());
                ArrayList<TagListModel.TagInfo> arrayList = this$0.f26879OooOoo0;
                Intrinsics.checkNotNull(arrayList);
                TypeIntrinsics.asMutableCollection(arrayList).remove(this$0.OooOoo(tagInfo.tagId));
                this$0.OooOoo0().f45727OooO0O0.removeView(view);
                TagListModel tagListModel = this$0.f26873OooOo0O;
                Intrinsics.checkNotNull(tagListModel);
                int size = tagListModel.data.size();
                for (int i3 = 0; i3 < size; i3++) {
                    TagListModel tagListModel2 = this$0.f26873OooOo0O;
                    Intrinsics.checkNotNull(tagListModel2);
                    if (tagListModel2.data.get(i3).tagId == tagInfo.typeId) {
                        this$0.OooOoOO().notifyItemChanged(i3);
                        if (this$0.f26870OooOo == i3) {
                            this$0.OooOoOO().notifyItemChanged(this$0.f26876OooOoO0);
                        }
                    }
                }
                ArrayList<TagListModel.TagInfo> arrayList2 = this$0.f26879OooOoo0;
                Intrinsics.checkNotNull(arrayList2);
                if (arrayList2.size() == 0) {
                    this$0.OooOoo0().f45731OooO0o0.setVisibility(0);
                    this$0.OooOoo0().f45727OooO0O0.setVisibility(8);
                }
                this$0.OooOooo();
                this$0.Oooo00O();
                break;
            default:
                o0o0OO0O.o0000O0.OooO00o this$1 = (o0o0OO0O.o0000O0.OooO00o) obj;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                ConstraintLayout layoutBg = this$1.OooOO0().f44674OooO0OO;
                Intrinsics.checkNotNullExpressionValue(layoutBg, "layoutBg");
                com.yalla.yalla.util.permission.OooO00o.OooO0OO(this$1.f53277OooOO0O, PermissionGroupReveal.f32340OooO0o0, null, new p526o0o0OO0O.o000OO(this$1, layoutBg));
                break;
        }
    }
}
