package p496o0o00o;

import android.view.View;
import android.widget.TextView;
import com.code.android.util.o0000;
import com.yalla.yalla.model.TagListModel;
import com.yalla.yalla.ui.activity.user.UserInfoTagActivity;
import com.yalla.yalla.ui.fragment.WalletCrystalFragment;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import p584o0oOooO0.oO00O0o;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class oO0O00oO implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f49158OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f49159OooO0o0;

    public /* synthetic */ oO0O00oO(Object obj, int i) {
        this.f49158OooO0Oo = i;
        this.f49159OooO0o0 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f49158OooO0Oo;
        Object obj = this.f49159OooO0o0;
        switch (i) {
            case 0:
                UserInfoTagActivity this$0 = (UserInfoTagActivity) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNull(view, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView = (TextView) view;
                Object tag = view.getTag();
                Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type kotlin.Int");
                int iIntValue = ((Integer) tag).intValue();
                if (!UserInfoTagActivity.OooOo(this$0, iIntValue)) {
                    ArrayList<TagListModel.TagInfo> arrayList = this$0.f27344OooOoo0;
                    Intrinsics.checkNotNull(arrayList);
                    if (arrayList.size() < this$0.f27348Oooo000) {
                        ArrayList<TagListModel.TagInfo> arrayList2 = this$0.f27344OooOoo0;
                        Intrinsics.checkNotNull(arrayList2);
                        arrayList2.add(this$0.f27345OooOooO.get(iIntValue));
                        view.setSelected(true);
                        textView.setTextColor(o0000.OooO00o(oO00O0o.color_white));
                        this$0.Oooo000();
                    }
                } else {
                    ArrayList<TagListModel.TagInfo> arrayList3 = this$0.f27344OooOoo0;
                    Intrinsics.checkNotNull(arrayList3);
                    TypeIntrinsics.asMutableCollection(arrayList3).remove(this$0.OooOoo(iIntValue));
                    view.setSelected(false);
                    textView.setTextColor(o0000.OooO00o(oO00O0o.color_6D6D6D));
                    this$0.Oooo000();
                }
                break;
            default:
                WalletCrystalFragment.initView$lambda$1((WalletCrystalFragment) obj, view);
                break;
        }
    }
}
