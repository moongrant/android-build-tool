package p471o0OoooO0;

import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.Observer;
import com.code.android.util.o0000;
import com.yalla.yalla.data.db.model.MusicTable;
import com.yalla.yalla.model.BadgeDataModel;
import com.yalla.yalla.ui.activity.user.BadgeWearActivity;
import com.yalla.yalla.ui.fragment.moment.MainMomentFragment;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import p535o0o0Oo0.oO0O00;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o0OoOoOo implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f47893OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ View.OnClickListener f47894OooO0o0;

    public /* synthetic */ o0OoOoOo(int i, View.OnClickListener onClickListener) {
        this.f47893OooO0Oo = i;
        this.f47894OooO0o0 = onClickListener;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        String strOooO0OO;
        int i = this.f47893OooO0Oo;
        View.OnClickListener onClickListener = this.f47894OooO0o0;
        switch (i) {
            case 0:
                o0O000Oo this$0 = (o0O000Oo) onClickListener;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                boolean z = oO0O00.f53970OooO00o;
                MusicTable musicTableOooO0O0 = oO0O00.OooO0O0();
                TextView textView = this$0.f47877OooOO0O.f44431OooOOo0;
                if (musicTableOooO0O0 == null || (strOooO0OO = musicTableOooO0O0.mDisplayName) == null) {
                    strOooO0OO = o0000.OooO0OO(o000000.no_more_music);
                }
                textView.setText(strOooO0OO);
                break;
            case 1:
                BadgeWearActivity this$1 = (BadgeWearActivity) onClickListener;
                int i2 = BadgeWearActivity.f26633OooOo0o;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.f26637OooOo0O.clear();
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.MutableList<com.yalla.yalla.model.BadgeDataModel>");
                for (BadgeDataModel badgeDataModel : TypeIntrinsics.asMutableList(obj)) {
                    this$1.f26637OooOo0O.put(Integer.valueOf(badgeDataModel.getMedalId()), badgeDataModel.getName());
                }
                this$1.OooOoO0();
                break;
            default:
                MainMomentFragment.initObserver$lambda$8((MainMomentFragment) onClickListener, obj);
                break;
        }
    }
}
