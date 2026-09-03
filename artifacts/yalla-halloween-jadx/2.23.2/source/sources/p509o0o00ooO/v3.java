package p509o0o00ooO;

import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.model.chat.ChatModel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p368o0OOo0Oo.Oooo000;
import p562o0oOo000.o0OO00O;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class v3 extends p1 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @NotNull
    public final TextView f50849OooOo;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @NotNull
    public final NetImageView f50850OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v3(@NotNull View view, @NotNull MixedRoomActivity activity) {
        super(view, activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(view, "view");
        View viewFindViewById = view.findViewById(o0OO00O.tv_message);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f50849OooOo = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(o0OO00O.niv_magic_voice);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f50850OooOoO0 = (NetImageView) viewFindViewById2;
    }

    @Override // p509o0o00ooO.p1
    public final boolean OooO00o() {
        return false;
    }

    @Override // p509o0o00ooO.p1
    public final void OooO0OO(int i, @NotNull ChatModel model) {
        Intrinsics.checkNotNullParameter(model, "model");
        super.OooO0OO(i, model);
        this.f50849OooOo.setText(model.getMessage());
        Oooo000.OooO00o oooO00o = new Oooo000.OooO00o(this.f50780OooO00o);
        ChatModel.MagicVoiceInfo magicVoiceInfo = model.getMagicVoiceInfo();
        oooO00o.f43126OooO0OO = magicVoiceInfo != null ? magicVoiceInfo.getCardUrl() : null;
        oooO00o.f43124OooO00o = 0;
        oooO00o.OooO0Oo(this.f50850OooOoO0);
    }

    @Override // p509o0o00ooO.p1
    public final boolean OooO0Oo() {
        return true;
    }
}
