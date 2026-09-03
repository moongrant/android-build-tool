package p471o0OoooO0;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.code.android.util.o0000;
import com.code.android.util.o000O;
import com.yalla.yalla.data.db.model.MusicTable;
import com.yalla.yalla.data.manager.MusicState;
import com.yalla.yalla.ui.fragment.moment.MainMomentFragment;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p405o0Oo0OOO.o0O000o0;
import p535o0o0Oo0.oO0O00;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o0O000O implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f47875OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ View.OnClickListener f47876OooO0o0;

    public /* synthetic */ o0O000O(int i, View.OnClickListener onClickListener) {
        this.f47875OooO0Oo = i;
        this.f47876OooO0o0 = onClickListener;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        String strOooO0OO;
        int i = this.f47875OooO0Oo;
        View.OnClickListener onClickListener = this.f47876OooO0o0;
        switch (i) {
            case 0:
                o0O000Oo this$0 = (o0O000Oo) onClickListener;
                List list = (List) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ConstraintLayout constraintLayout = this$0.f47877OooOO0O.f44415OooO00o;
                Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
                o000O.OooOOOO(constraintLayout);
                boolean z = list == null || list.isEmpty();
                o0O000o0 o0o000o1 = this$0.f47877OooOO0O;
                if (!z) {
                    MutableLiveData<MusicTable> mutableLiveData = MusicState.f22362OooO00o;
                    if (mutableLiveData.getValue() == null) {
                        mutableLiveData.setValue((MusicTable) list.get(0));
                    }
                    this$0.f47879OooOOO0 = true;
                    Group groupControl = o0o000o1.f44416OooO0O0;
                    Intrinsics.checkNotNullExpressionValue(groupControl, "groupControl");
                    o000O.OooOOOO(groupControl);
                    Group groupEmpty = o0o000o1.f44417OooO0OO;
                    Intrinsics.checkNotNullExpressionValue(groupEmpty, "groupEmpty");
                    o000O.OooO0O0(groupEmpty);
                    boolean z2 = oO0O00.f53970OooO00o;
                    MusicTable musicTableOooO0O0 = oO0O00.OooO0O0();
                    if (musicTableOooO0O0 == null || (strOooO0OO = musicTableOooO0O0.mDisplayName) == null) {
                        strOooO0OO = o0000.OooO0OO(o000000.no_more_music);
                    }
                    o0o000o1.f44431OooOOo0.setText(strOooO0OO);
                } else {
                    Group groupEmpty2 = o0o000o1.f44417OooO0OO;
                    Intrinsics.checkNotNullExpressionValue(groupEmpty2, "groupEmpty");
                    o000O.OooOOOO(groupEmpty2);
                    Group groupControl2 = o0o000o1.f44416OooO0O0;
                    Intrinsics.checkNotNullExpressionValue(groupControl2, "groupControl");
                    o000O.OooO0O0(groupControl2);
                    this$0.f47879OooOOO0 = false;
                }
                break;
            default:
                MainMomentFragment.initObserver$lambda$7((MainMomentFragment) onClickListener, (Integer) obj);
                break;
        }
    }
}
