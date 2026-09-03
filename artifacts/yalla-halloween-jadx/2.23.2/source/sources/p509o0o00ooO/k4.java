package p509o0o00ooO;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.o0000O0;
import com.opensource.svgaplayer.OooO0OO;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.model.chat.ChatModel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o0OO0O0O.OooO;
import o0OO0O0O.o00Ooo;
import org.jetbrains.annotations.NotNull;
import p369o0OOo0o.OooOOO;
import p369o0OOo0o.OooOOO0;
import p562o0oOo000.o0OO00O;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class k4 extends p1 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @NotNull
    public final t4 f50722OooOo;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    @NotNull
    public final SVGAView f50723OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @NotNull
    public final TextView f50724OooOoO0;

    public static final class OooO00o implements OooO0OO.OooO0O0 {
        public OooO00o() {
        }

        @Override // com.opensource.svgaplayer.OooO0OO.OooO0O0
        public final void OooO00o(@NotNull o00Ooo svgaVideoEntity) {
            Intrinsics.checkNotNullParameter(svgaVideoEntity, "svgaVideoEntity");
            OooO oooO = new OooO(svgaVideoEntity);
            k4 k4Var = k4.this;
            k4Var.f50723OooOoO.setImageDrawable(oooO);
            ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_CENTER;
            SVGAView sVGAView = k4Var.f50723OooOoO;
            sVGAView.setScaleType(scaleType);
            sVGAView.OooO0Oo();
        }

        @Override // com.opensource.svgaplayer.OooO0OO.OooO0O0
        public final void onError() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k4(@NotNull View view, @NotNull MixedRoomActivity activity) {
        super(view, activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(view, "view");
        this.f50722OooOo = new t4(view, activity);
        View viewFindViewById = view.findViewById(o0OO00O.tv_msg);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f50724OooOoO0 = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(o0OO00O.svga_skill);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f50723OooOoO = (SVGAView) viewFindViewById2;
    }

    @Override // p509o0o00ooO.p1
    public final boolean OooO00o() {
        return true;
    }

    @Override // p509o0o00ooO.p1
    public final void OooO0OO(int i, @NotNull ChatModel model) {
        Intrinsics.checkNotNullParameter(model, "model");
        super.OooO0OO(i, model);
        TextView textView = this.f50724OooOoO0;
        p1.OooO0O0(model, textView);
        this.f50722OooOo.OooO0O0(model);
        MutableLiveData<List<OooOOO0>> mutableLiveData = OooOOO.f43158OooO00o;
        String message = model.getMessage();
        Intrinsics.checkNotNull(message);
        textView.setText(OooOOO.OooO0Oo(o0000O0.OooO00o(16), message));
        new OooO0OO(this.f50780OooO00o).OooO00o(model.getType() == 11 ? "svga/anim_room_chat_nonsense.svga" : "svga/anim_room_chat_sugraedwords.svga", new OooO00o());
    }

    @Override // p509o0o00ooO.p1
    public final boolean OooO0Oo() {
        return true;
    }
}
