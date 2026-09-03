package o00OO0O0;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import com.app.base.model.ChatModel;
import com.weieyu.yalla.R;
import com.yalla.support.cloudfilemanager.util.CloudImageUtilKt;
import com.yalla.yalla.util.netimage.NetImageView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p616o0oo0Ooo.oO0O00;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class o0000oo extends OooOO0O {

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NotNull
    public final View f31461OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NotNull
    public final NetImageView f31462OooOOo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000oo(@NotNull FragmentActivity activity, @NotNull View view) {
        super(activity, view);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(view, "view");
        View viewFindViewById = view.findViewById(R.id.niv_gif);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "view.findViewById(R.id.niv_gif)");
        this.f31462OooOOo0 = (NetImageView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.chatlineContent);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "view.findViewById(R.id.chatlineContent)");
        this.f31461OooOOo = viewFindViewById2;
    }

    @Override // o00OO0O0.OooOO0O
    public final boolean OooO00o() {
        return true;
    }

    @Override // o00OO0O0.OooOO0O
    public final void OooO0OO(int i, @NotNull ChatModel model) {
        Intrinsics.checkNotNullParameter(model, "model");
        super.OooO0OO(i, model);
        this.f31392OooOO0O.setBackground(null);
        this.f31392OooOO0O.setPadding(0, 0, 0, 0);
        oO0O00.OooO00o oooO00o = new oO0O00.OooO00o(this.f31399OooO00o);
        oooO00o.f48434OooO0oo = null;
        oooO00o.f48430OooO0Oo = false;
        oooO00o.f48441OooOOOo = R.drawable.ic_gif_default;
        oooO00o.f48444OooOOoo = 0;
        oooO00o.f48431OooO0o = R.drawable.ic_gif_default;
        oooO00o.f48435OooOO0 = null;
        oooO00o.f48438OooOOO = -1;
        oooO00o.f48440OooOOOO = -1;
        oooO00o.f48454OooOoo0 = 1;
        oooO00o.f48453OooOoo = 0;
        oooO00o.f48447OooOo00 = 0;
        oooO00o.f48446OooOo0 = false;
        oooO00o.f48448OooOo0O = false;
        oooO00o.f48449OooOo0o = 0;
        oooO00o.f48445OooOo = 0;
        oooO00o.f48451OooOoO0 = 0;
        oooO00o.f48450OooOoO = 0;
        oooO00o.f48452OooOoOO = 0;
        oooO00o.f48455OooOooO = 0;
        oooO00o.f48456OooOooo = 0;
        oooO00o.f48458Oooo00O = false;
        oooO00o.f48439OooOOO0 = false;
        oooO00o.f48429OooO0OO = CloudImageUtilKt.imgFormat(model.gif.gifUrl);
        oooO00o.f48427OooO00o = 0;
        oooO00o.f48430OooO0Oo = true;
        oooO00o.OooO0o(this.f31462OooOOo0);
    }

    @Override // o00OO0O0.OooOO0O
    public final boolean OooO0Oo() {
        return false;
    }
}
