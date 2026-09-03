package o00OO0O0;

import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import com.app.base.model.ChatModel;
import com.weieyu.yalla.R;
import com.yalla.yalla.util.netimage.NetImageView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p616o0oo0Ooo.oO0O00;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class o00O000o extends OooOO0O {

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NotNull
    public final NetImageView f31495OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NotNull
    public final TextView f31496OooOOo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O000o(@NotNull FragmentActivity activity, @NotNull View view) {
        super(activity, view);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(view, "view");
        View viewFindViewById = view.findViewById(R.id.tv_message);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "view.findViewById(R.id.tv_message)");
        this.f31496OooOOo0 = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.niv_magic_voice);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "view.findViewById(R.id.niv_magic_voice)");
        this.f31495OooOOo = (NetImageView) viewFindViewById2;
    }

    @Override // o00OO0O0.OooOO0O
    public final boolean OooO00o() {
        return false;
    }

    @Override // o00OO0O0.OooOO0O
    public final void OooO0OO(int i, @NotNull ChatModel model) {
        Intrinsics.checkNotNullParameter(model, "model");
        super.OooO0OO(i, model);
        this.f31496OooOOo0.setText(model.message);
        oO0O00.OooO00o oooO00o = new oO0O00.OooO00o(this.f31399OooO00o);
        oooO00o.f48429OooO0OO = model.magicVoiceInfo.cardUrl;
        oooO00o.f48427OooO00o = 0;
        oooO00o.OooO0o(this.f31495OooOOo);
    }

    @Override // o00OO0O0.OooOO0O
    public final boolean OooO0Oo() {
        return true;
    }
}
