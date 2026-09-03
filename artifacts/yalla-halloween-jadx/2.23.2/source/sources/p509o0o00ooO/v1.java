package p509o0o00ooO;

import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o0000;
import com.code.android.util.o000O;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.model.chat.ChatModel;
import com.yalla.yalla.ui.view.NumberSize;
import com.yalla.yalla.ui.view.NumberViews;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p562o0oOo000.o000000;
import p562o0oOo000.o0OO00O;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class v1 extends p1 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @NotNull
    public final NumberViews f50844OooOo;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    @NotNull
    public final View f50845OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @NotNull
    public final TextView f50846OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(@NotNull View view, @NotNull MixedRoomActivity activity) {
        super(view, activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(view, "view");
        View viewFindViewById = view.findViewById(o0OO00O.luckyNumber);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f50844OooOo = (NumberViews) viewFindViewById;
        View viewFindViewById2 = view.findViewById(o0OO00O.tv_yeah);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f50846OooOoO0 = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(o0OO00O.viewLine);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f50845OooOoO = viewFindViewById3;
    }

    @Override // p509o0o00ooO.p1
    public final boolean OooO00o() {
        return false;
    }

    @Override // p509o0o00ooO.p1
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
        NumberViews numberViews = this.f50844OooOo;
        numberViews.setNumCount(lucknummode);
        numberViews.setSize(NumberSize.Size.M);
        numberViews.setData(String.valueOf(number));
        View view = this.f50845OooOoO;
        o000O.OooO0O0(view);
        TextView textView = this.f50846OooOoO0;
        o000O.OooO0O0(textView);
        if (number == model.getLucknum()) {
            o000O.OooOOOO(view);
            o000O.OooOOOO(textView);
            textView.setText(o0000.OooO0OO(o000000.room_lucky_number_get_lucky));
        }
    }

    @Override // p509o0o00ooO.p1
    public final boolean OooO0Oo() {
        return true;
    }
}
