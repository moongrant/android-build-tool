package p474o0o00;

import android.graphics.Typeface;
import android.util.SparseArray;
import android.view.View;
import com.android.billingclient.api.o000O000;
import com.yalla.yalla.model.TagListModel;
import com.yalla.yalla.ui.activity.account.PasswordActivity;
import com.yalla.yalla.ui.activity.user.UserInfoTagActivity;
import com.yalla.yalla.ui.fragment.WalletCoinFragment;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o00oOoo implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f47289OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f47290OooO0o0;

    public /* synthetic */ o00oOoo(Object obj, int i) {
        this.f47289OooO0Oo = i;
        this.f47290OooO0o0 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f47289OooO0Oo;
        Object obj = this.f47290OooO0o0;
        switch (i) {
            case 0:
                PasswordActivity this$0 = (PasswordActivity) obj;
                int i2 = PasswordActivity.f25224OooOoOO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooOoO0().f59108OooO0OO.setText("");
                this$0.OooOoO0().f59108OooO0OO.setTypeface(Typeface.MONOSPACE);
                o000O000.OooO0OO(this$0.OooOoO0().f59108OooO0OO);
                break;
            case 1:
                UserInfoTagActivity this$1 = (UserInfoTagActivity) obj;
                int i3 = UserInfoTagActivity.f27333Oooo0O0;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                SparseArray<TagListModel.TagInfo> sparseArray = this$1.f27345OooOooO;
                Object tag = view.getTag();
                Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type kotlin.Int");
                TagListModel.TagInfo tagInfo = sparseArray.get(((Integer) tag).intValue());
                ArrayList<TagListModel.TagInfo> arrayList = this$1.f27344OooOoo0;
                Intrinsics.checkNotNull(arrayList);
                TypeIntrinsics.asMutableCollection(arrayList).remove(this$1.OooOoo(tagInfo.tagId));
                this$1.OooOoo0().f58306OooO0O0.removeView(view);
                TagListModel tagListModel = this$1.f27338OooOo0O;
                Intrinsics.checkNotNull(tagListModel);
                int size = tagListModel.data.size();
                for (int i4 = 0; i4 < size; i4++) {
                    TagListModel tagListModel2 = this$1.f27338OooOo0O;
                    Intrinsics.checkNotNull(tagListModel2);
                    if (tagListModel2.data.get(i4).tagId == tagInfo.typeId) {
                        this$1.OooOoOO().notifyItemChanged(i4);
                        if (this$1.f27335OooOo == i4) {
                            this$1.OooOoOO().notifyItemChanged(this$1.f27341OooOoO0);
                        }
                    }
                }
                ArrayList<TagListModel.TagInfo> arrayList2 = this$1.f27344OooOoo0;
                Intrinsics.checkNotNull(arrayList2);
                if (arrayList2.size() == 0) {
                    this$1.OooOoo0().f58310OooO0o0.setVisibility(0);
                    this$1.OooOoo0().f58306OooO0O0.setVisibility(8);
                }
                this$1.OooOooo();
                this$1.Oooo00O();
                break;
            default:
                WalletCoinFragment.iniView$lambda$16((WalletCoinFragment) obj, view);
                break;
        }
    }
}
