package com.yalla.yalla.ui.activity.message;

import android.widget.ImageView;
import android.widget.LinearLayout;
import com.yalla.yalla.ui.fragment.moment.MainMomentsTopicFollowingFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class oOO00O implements p597o0oo00o0.OooOOOO, p562o0oOo0O.o000oOoO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f25985OooO0Oo;

    public /* synthetic */ oOO00O(Object obj) {
        this.f25985OooO0Oo = obj;
    }

    @Override // p562o0oOo0O.o000oOoO
    public final void OooO0O0() {
        MainMomentsTopicFollowingFragment.initView$lambda$0((MainMomentsTopicFollowingFragment) this.f25985OooO0Oo);
    }

    @Override // p597o0oo00o0.OooOOOO
    public final void OooO0OO(String data) {
        SearchFriendActivity this$0 = (SearchFriendActivity) this.f25985OooO0Oo;
        int i = SearchFriendActivity.f25719OooOo;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(data, "data");
        LinearLayout linearLayout = null;
        if (data.length() > 0) {
            p587o0oOooo.o0OO000.OooO00o("204020");
            this$0.OooOo0(true);
            ImageView imageView = this$0.f25724OooOo00;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ivClear");
                imageView = null;
            }
            imageView.setVisibility(0);
            LinearLayout linearLayout2 = this$0.f25722OooOOoo;
            if (linearLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("llSearchFriendHot");
            } else {
                linearLayout = linearLayout2;
            }
            linearLayout.setVisibility(4);
            return;
        }
        oo00o oo00oVar = this$0.f25725OooOo0O;
        if (oo00oVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("resultAdapter");
            oo00oVar = null;
        }
        oo00oVar.OooOoO0(null);
        ImageView imageView2 = this$0.f25724OooOo00;
        if (imageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivClear");
            imageView2 = null;
        }
        imageView2.setVisibility(8);
        oo00o oo00oVar2 = this$0.f25725OooOo0O;
        if (oo00oVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("resultAdapter");
            oo00oVar2 = null;
        }
        oo00oVar2.notifyDataSetChanged();
        LinearLayout linearLayout3 = this$0.f25722OooOOoo;
        if (linearLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("llSearchFriendHot");
        } else {
            linearLayout = linearLayout3;
        }
        linearLayout.setVisibility(0);
    }
}
