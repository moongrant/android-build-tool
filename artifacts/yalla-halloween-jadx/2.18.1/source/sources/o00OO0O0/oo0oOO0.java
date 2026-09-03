package o00OO0O0;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import com.app.base.model.ChatModel;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.ui.view.SVGAView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class oo0oOO0 extends OooOO0O {

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NotNull
    public final TextView f31627OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NotNull
    public o00OOO0O f31628OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final SVGAView f31629OooOOoo;

    public static final class OooO00o implements o0Oo0OO0.OooOo00.OooO0O0 {
        public OooO00o() {
        }

        @Override // o0Oo0OO0.OooOo00.OooO0O0
        public final void onComplete(@NotNull p405o0Oo0OO0.OooOo svgaVideoEntity) {
            Intrinsics.checkNotNullParameter(svgaVideoEntity, "svgaVideoEntity");
            oo0oOO0.this.f31629OooOOoo.setImageDrawable(new p405o0Oo0OO0.OooO(svgaVideoEntity));
            oo0oOO0.this.f31629OooOOoo.setScaleType(ImageView.ScaleType.FIT_CENTER);
            oo0oOO0.this.f31629OooOOoo.OooO0OO();
        }

        @Override // o0Oo0OO0.OooOo00.OooO0O0
        public final void onError() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0oOO0(@NotNull FragmentActivity activity, @NotNull View view) {
        super(activity, view);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(view, "view");
        this.f31628OooOOo0 = new o00OOO0O(activity, view);
        View viewFindViewById = view.findViewById(R.id.tv_msg);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "view.findViewById(R.id.tv_msg)");
        this.f31627OooOOo = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.svga_skill);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "view.findViewById(R.id.svga_skill)");
        this.f31629OooOOoo = (SVGAView) viewFindViewById2;
    }

    @Override // o00OO0O0.OooOO0O
    public final boolean OooO00o() {
        return true;
    }

    @Override // o00OO0O0.OooOO0O
    public final void OooO0OO(int i, @NotNull ChatModel model) {
        Intrinsics.checkNotNullParameter(model, "model");
        super.OooO0OO(i, model);
        OooO0O0(model, this.f31627OooOOo);
        this.f31628OooOOo0.OooO0O0(model);
        p453o0Ooo.OooOO0 oooOO1 = p453o0Ooo.OooOO0.f40347OooO00o;
        String str = model.message;
        Intrinsics.checkNotNullExpressionValue(str, "model.message");
        this.f31627OooOOo.setText(p453o0Ooo.OooOO0.OooO0Oo(str, com.yalla.support.common.util.OooOo00.OooO00o(16.0f)));
        new p405o0Oo0OO0.OooOo00(this.f31399OooO00o).OooO0oO(model.type == 11 ? "svga/anim_room_chat_nonsense.svga" : "svga/anim_room_chat_sugraedwords.svga", new OooO00o());
    }

    @Override // o00OO0O0.OooOO0O
    public final boolean OooO0Oo() {
        return true;
    }
}
