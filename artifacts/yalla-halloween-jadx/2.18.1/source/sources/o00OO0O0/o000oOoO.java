package o00OO0O0;

import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import com.app.base.model.ChatModel;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.view.NumberSize;
import com.yalla.yalla.ui.view.NumberViews;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class o000oOoO extends OooOO0O {

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NotNull
    public final TextView f31486OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NotNull
    public final NumberViews f31487OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final View f31488OooOOoo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000oOoO(@NotNull FragmentActivity activity, @NotNull View view) {
        super(activity, view);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(view, "view");
        View viewFindViewById = view.findViewById(R.id.luckyNumber);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "view.findViewById(R.id.luckyNumber)");
        this.f31487OooOOo0 = (NumberViews) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.tv_yeah);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "view.findViewById(R.id.tv_yeah)");
        this.f31486OooOOo = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.viewLine);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "view.findViewById(R.id.viewLine)");
        this.f31488OooOOoo = viewFindViewById3;
    }

    @Override // o00OO0O0.OooOO0O
    public final boolean OooO00o() {
        return false;
    }

    @Override // o00OO0O0.OooOO0O
    public final void OooO0OO(int i, @NotNull ChatModel model) {
        Intrinsics.checkNotNullParameter(model, "model");
        super.OooO0OO(i, model);
        long j = model.number;
        if (j < 0) {
            j = 0;
        } else if (j >= 1000) {
            j = 999;
        }
        this.f31487OooOOo0.setNumCount(model.lucknummode);
        this.f31487OooOOo0.setSize(NumberSize.Size.M);
        this.f31487OooOOo0.setData(String.valueOf(j));
        p254o00ooO0O.oOO00O.OooO00o(this.f31488OooOOoo);
        p254o00ooO0O.oOO00O.OooO00o(this.f31486OooOOo);
        if (j == model.lucknum) {
            p254o00ooO0O.oOO00O.OooO(this.f31488OooOOoo);
            p254o00ooO0O.oOO00O.OooO(this.f31486OooOOo);
            this.f31486OooOOo.setText(p254o00ooO0O.o000O0O0.OooO0OO(R.string.room_lucky_number_get_lucky));
        }
    }

    @Override // o00OO0O0.OooOO0O
    public final boolean OooO0Oo() {
        return true;
    }
}
