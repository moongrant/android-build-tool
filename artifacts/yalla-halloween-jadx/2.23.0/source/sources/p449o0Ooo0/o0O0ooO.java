package p449o0Ooo0;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.code.android.util.o0000;
import com.code.android.util.o000OO00;
import com.yalla.yalla.data.db.model.MusicTable;
import com.yalla.yalla.data.manager.MusicState;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p528o0o0OOOo.oOO0;
import p584o0oOooO0.oO00OOo0;
import p641o0ooOOOO.o1;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0ooO implements Observer<List<MusicTable>> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o000OO00 f46426OooO0Oo;

    public o0O0ooO(o000OO00 o000oo01) {
        this.f46426OooO0Oo = o000oo01;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(List<MusicTable> list) {
        String strOooO0OO;
        List<MusicTable> list2 = list;
        o000OO00 o000oo01 = this.f46426OooO0Oo;
        ConstraintLayout constraintLayout = o000oo01.f46408OooOO0O.f58480OooO00o;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.root");
        o000OO00.OooOOOO(constraintLayout);
        boolean z = list2 == null || list2.isEmpty();
        o1 o1Var = o000oo01.f46408OooOO0O;
        if (z) {
            Group group = o1Var.f58482OooO0OO;
            Intrinsics.checkNotNullExpressionValue(group, "binding.groupEmpty");
            o000OO00.OooOOOO(group);
            Group group2 = o1Var.f58481OooO0O0;
            Intrinsics.checkNotNullExpressionValue(group2, "binding.groupControl");
            o000OO00.OooO0O0(group2);
            o000oo01.f46410OooOOO0 = false;
            return;
        }
        MutableLiveData<MusicTable> mutableLiveData = MusicState.f22835OooO00o;
        if (mutableLiveData.getValue() == null) {
            mutableLiveData.setValue(list2.get(0));
        }
        o000oo01.f46410OooOOO0 = true;
        Group group3 = o1Var.f58481OooO0O0;
        Intrinsics.checkNotNullExpressionValue(group3, "binding.groupControl");
        o000OO00.OooOOOO(group3);
        Group group4 = o1Var.f58482OooO0OO;
        Intrinsics.checkNotNullExpressionValue(group4, "binding.groupEmpty");
        o000OO00.OooO0O0(group4);
        boolean z2 = oOO0.f54098OooO00o;
        MusicTable musicTableOooO0O0 = oOO0.OooO0O0();
        if (musicTableOooO0O0 == null || (strOooO0OO = musicTableOooO0O0.mDisplayName) == null) {
            strOooO0OO = o0000.OooO0OO(oO00OOo0.no_more_music);
        }
        o1Var.f58496OooOOo0.setText(strOooO0OO);
    }
}
