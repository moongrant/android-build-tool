package p509o0o00ooO;

import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import com.code.android.uikit.svga.SVGAView;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.model.chat.ChatModel;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import p184o00o00O0.OooO0OO;
import p562o0oOo000.o0OO00O;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class d3 extends p1 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @NotNull
    public final TextView f50647OooOo;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @NotNull
    public final SVGAView f50648OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(@NotNull View view, @NotNull MixedRoomActivity activity) {
        super(view, activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(view, "view");
        View viewFindViewById = view.findViewById(o0OO00O.tvContentMessage);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f50647OooOo = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(o0OO00O.sdv_content_pic);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f50648OooOoO0 = (SVGAView) viewFindViewById2;
    }

    @Override // p509o0o00ooO.p1
    public final boolean OooO00o() {
        return false;
    }

    @Override // p509o0o00ooO.p1
    public final void OooO0OO(int i, @NotNull ChatModel model) {
        MutableStateFlow<String> headerCardUrl;
        Intrinsics.checkNotNullParameter(model, "model");
        super.OooO0OO(i, model);
        RoomUserInfoModel newTo = model.getNewTo();
        String strOooO0Oo = OooO0OO.OooO0Oo((newTo == null || (headerCardUrl = newTo.getHeaderCardUrl()) == null) ? null : headerCardUrl.getValue());
        FragmentActivity fragmentActivity = this.f50780OooO00o;
        SVGAView sVGAView = this.f50648OooOoO0;
        sVGAView.OooOO0O(strOooO0Oo, fragmentActivity);
        sVGAView.OooOO0o();
        p1.OooO0O0(model, this.f50647OooOo);
    }

    @Override // p509o0o00ooO.p1
    public final boolean OooO0Oo() {
        return true;
    }
}
