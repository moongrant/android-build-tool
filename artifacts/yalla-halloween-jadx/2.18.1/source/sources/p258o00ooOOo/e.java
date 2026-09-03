package p258o00ooOOo;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.code.android.yldialog.timechoose.DateScrollView;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class e extends RecyclerView.o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ DateScrollView f34633OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ int f34634OooO0O0;

    public e(DateScrollView dateScrollView, int i) {
        this.f34633OooO00o = dateScrollView;
        this.f34634OooO0O0 = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o00O0O
    public final void onScrollStateChanged(@NotNull RecyclerView recyclerView, int i) {
        View viewFindChildViewUnder;
        int iIntValue;
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        DateScrollView dateScrollView = this.f34633OooO00o;
        if (dateScrollView.f12603Oooo0oO == 0 || dateScrollView.f12604Oooo0oo == null || i != 0 || (viewFindChildViewUnder = recyclerView.findChildViewUnder(recyclerView.getWidth() * 0.5f, recyclerView.getHeight() * 0.5f)) == null) {
            return;
        }
        int childAdapterPosition = recyclerView.getChildAdapterPosition(viewFindChildViewUnder);
        DateScrollView dateScrollView2 = this.f34633OooO00o;
        int i2 = childAdapterPosition - dateScrollView2.f12603Oooo0oO;
        DateScrollView.OooO00o oooO00o = dateScrollView2.f12601Oooo;
        if (oooO00o == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            oooO00o = null;
        }
        Objects.requireNonNull(oooO00o);
        try {
            List<Integer> list = oooO00o.f12608OooO00o;
            Intrinsics.checkNotNull(list);
            iIntValue = list.get(i2).intValue();
        } catch (Exception e) {
            e.printStackTrace();
            iIntValue = -1;
        }
        if (i2 >= 0) {
            DateScrollView.OooO0OO oooO0OO = this.f34633OooO00o.f12604Oooo0oo;
            Intrinsics.checkNotNull(oooO0OO);
            oooO0OO.OooO0O0(iIntValue, i2, this.f34634OooO0O0);
        }
    }
}
