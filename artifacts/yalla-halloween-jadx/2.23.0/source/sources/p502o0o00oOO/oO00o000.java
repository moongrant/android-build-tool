package p502o0o00oOO;

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
import p139o00OOooO.OooO0o;
import p584o0oOooO0.oO00O0oO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class oO00o000 extends o0OOO0 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @NotNull
    public final TextView f49558OooOo;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @NotNull
    public final SVGAView f49559OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO00o000(@NotNull View view, @NotNull MixedRoomActivity activity) {
        super(view, activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(view, "view");
        View viewFindViewById = view.findViewById(oO00O0oO.tvContentMessage);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "view.findViewById(R.id.tvContentMessage)");
        this.f49558OooOo = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(oO00O0oO.sdv_content_pic);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "view.findViewById(R.id.sdv_content_pic)");
        this.f49559OooOoO0 = (SVGAView) viewFindViewById2;
    }

    @Override // p502o0o00oOO.o0OOO0
    public final boolean OooO00o() {
        return false;
    }

    @Override // p502o0o00oOO.o0OOO0
    public final void OooO0OO(int i, @NotNull ChatModel model) {
        MutableStateFlow<String> headerCardUrl;
        Intrinsics.checkNotNullParameter(model, "model");
        super.OooO0OO(i, model);
        RoomUserInfoModel newTo = model.getNewTo();
        String strOooO0Oo = OooO0o.OooO0Oo((newTo == null || (headerCardUrl = newTo.getHeaderCardUrl()) == null) ? null : headerCardUrl.getValue());
        FragmentActivity fragmentActivity = this.f49471OooO00o;
        SVGAView sVGAView = this.f49559OooOoO0;
        sVGAView.OooOO0O(strOooO0Oo, fragmentActivity);
        sVGAView.OooOO0o();
        o0OOO0.OooO0O0(model, this.f49558OooOo);
    }

    @Override // p502o0o00oOO.o0OOO0
    public final boolean OooO0Oo() {
        return true;
    }
}
