package p502o0o00oOO;

import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.model.chat.ChatModel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p362o0OOo0O.OooOO0;
import p584o0oOooO0.oO00O0oO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class oO0O0 extends o0OOO0 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @NotNull
    public final TextView f49561OooOo;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @NotNull
    public final NetImageView f49562OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0O0(@NotNull View view, @NotNull MixedRoomActivity activity) {
        super(view, activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(view, "view");
        View viewFindViewById = view.findViewById(oO00O0oO.tv_message);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "view.findViewById(R.id.tv_message)");
        this.f49561OooOo = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(oO00O0oO.niv_magic_voice);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "view.findViewById(R.id.niv_magic_voice)");
        this.f49562OooOoO0 = (NetImageView) viewFindViewById2;
    }

    @Override // p502o0o00oOO.o0OOO0
    public final boolean OooO00o() {
        return false;
    }

    @Override // p502o0o00oOO.o0OOO0
    public final void OooO0OO(int i, @NotNull ChatModel model) {
        Intrinsics.checkNotNullParameter(model, "model");
        super.OooO0OO(i, model);
        this.f49561OooOo.setText(model.getMessage());
        OooOO0.OooO00o oooO00o = new OooOO0.OooO00o(this.f49471OooO00o);
        ChatModel.MagicVoiceInfo magicVoiceInfo = model.getMagicVoiceInfo();
        oooO00o.f43911OooO0OO = magicVoiceInfo != null ? magicVoiceInfo.getCardUrl() : null;
        oooO00o.f43909OooO00o = 0;
        oooO00o.OooO0Oo(this.f49562OooOoO0);
    }

    @Override // p502o0o00oOO.o0OOO0
    public final boolean OooO0Oo() {
        return true;
    }
}
