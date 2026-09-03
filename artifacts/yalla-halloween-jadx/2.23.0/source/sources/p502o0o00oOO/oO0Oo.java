package p502o0o00oOO;

import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o0000;
import com.code.android.util.o000OO00;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.model.chat.ChatModel;
import com.yalla.yalla.ui.view.NumberSize;
import com.yalla.yalla.ui.view.NumberViews;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class oO0Oo extends o0OOO0 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @NotNull
    public final NumberViews f49600OooOo;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    @NotNull
    public final View f49601OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @NotNull
    public final TextView f49602OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0Oo(@NotNull View view, @NotNull MixedRoomActivity activity) {
        super(view, activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(view, "view");
        View viewFindViewById = view.findViewById(oO00O0oO.luckyNumber);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "view.findViewById(R.id.luckyNumber)");
        this.f49600OooOo = (NumberViews) viewFindViewById;
        View viewFindViewById2 = view.findViewById(oO00O0oO.tv_yeah);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "view.findViewById(R.id.tv_yeah)");
        this.f49602OooOoO0 = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(oO00O0oO.viewLine);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "view.findViewById(R.id.viewLine)");
        this.f49601OooOoO = viewFindViewById3;
    }

    @Override // p502o0o00oOO.o0OOO0
    public final boolean OooO00o() {
        return false;
    }

    @Override // p502o0o00oOO.o0OOO0
    public final void OooO0OO(int i, @NotNull ChatModel model) {
        Intrinsics.checkNotNullParameter(model, "model");
        super.OooO0OO(i, model);
        long number = model.getNumber();
        if (number < 0) {
            number = 0;
        } else if (number >= 1000) {
            number = 999;
        }
        int lucknummode = model.getLucknummode();
        NumberViews numberViews = this.f49600OooOo;
        numberViews.setNumCount(lucknummode);
        numberViews.setSize(NumberSize.Size.M);
        numberViews.setData(String.valueOf(number));
        View view = this.f49601OooOoO;
        o000OO00.OooO0O0(view);
        TextView textView = this.f49602OooOoO0;
        o000OO00.OooO0O0(textView);
        if (number == model.getLucknum()) {
            o000OO00.OooOOOO(view);
            o000OO00.OooOOOO(textView);
            textView.setText(o0000.OooO0OO(oO00OOo0.room_lucky_number_get_lucky));
        }
    }

    @Override // p502o0o00oOO.o0OOO0
    public final boolean OooO0Oo() {
        return true;
    }
}
