package p459o0Ooo0O;

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
import p407o0Oo0OOO.o0O00;
import p535o0o0OOoO.g;
import p565o0oOo000.o000OOo;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o0000O0 implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f47755OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ View.OnClickListener f47756OooO0o0;

    public /* synthetic */ o0000O0(int i, View.OnClickListener onClickListener) {
        this.f47755OooO0Oo = i;
        this.f47756OooO0o0 = onClickListener;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        String strOooO0OO;
        int i = this.f47755OooO0Oo;
        View.OnClickListener onClickListener = this.f47756OooO0o0;
        switch (i) {
            case 0:
                o0000O0O this$0 = (o0000O0O) onClickListener;
                List list = (List) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ConstraintLayout constraintLayout = this$0.f47759OooOO0O.f44386OooO00o;
                Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
                o000O.OooOOOO(constraintLayout);
                boolean z = list == null || list.isEmpty();
                o0O00 o0o01 = this$0.f47759OooOO0O;
                if (!z) {
                    MutableLiveData<MusicTable> mutableLiveData = MusicState.f22369OooO00o;
                    if (mutableLiveData.getValue() == null) {
                        mutableLiveData.setValue((MusicTable) list.get(0));
                    }
                    this$0.f47761OooOOO0 = true;
                    Group groupControl = o0o01.f44387OooO0O0;
                    Intrinsics.checkNotNullExpressionValue(groupControl, "groupControl");
                    o000O.OooOOOO(groupControl);
                    Group groupEmpty = o0o01.f44388OooO0OO;
                    Intrinsics.checkNotNullExpressionValue(groupEmpty, "groupEmpty");
                    o000O.OooO0O0(groupEmpty);
                    boolean z2 = g.f53585OooO00o;
                    MusicTable musicTableOooO0O0 = g.OooO0O0();
                    if (musicTableOooO0O0 == null || (strOooO0OO = musicTableOooO0O0.mDisplayName) == null) {
                        strOooO0OO = o0000.OooO0OO(o000OOo.no_more_music);
                    }
                    o0o01.f44402OooOOo0.setText(strOooO0OO);
                } else {
                    Group groupEmpty2 = o0o01.f44388OooO0OO;
                    Intrinsics.checkNotNullExpressionValue(groupEmpty2, "groupEmpty");
                    o000O.OooOOOO(groupEmpty2);
                    Group groupControl2 = o0o01.f44387OooO0O0;
                    Intrinsics.checkNotNullExpressionValue(groupControl2, "groupControl");
                    o000O.OooO0O0(groupControl2);
                    this$0.f47761OooOOO0 = false;
                }
                break;
            default:
                MainMomentFragment.initObserver$lambda$8((MainMomentFragment) onClickListener, obj);
                break;
        }
    }
}
