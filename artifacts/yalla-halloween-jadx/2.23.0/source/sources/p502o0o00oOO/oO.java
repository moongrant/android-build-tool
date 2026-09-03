package p502o0o00oOO;

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
import o0OO0O0.OooO;
import o0OO0O0.oo000o;
import org.jetbrains.annotations.NotNull;
import p365o0OOo0Oo.OooOo;
import p365o0OOo0Oo.Oooo000;
import p584o0oOooO0.oO00O0oO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class oO extends o0OOO0 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @NotNull
    public final oOO0O000 f49513OooOo;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    @NotNull
    public final SVGAView f49514OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @NotNull
    public final TextView f49515OooOoO0;

    public static final class OooO00o implements OooO0OO.OooO0O0 {
        public OooO00o() {
        }

        @Override // com.opensource.svgaplayer.OooO0OO.OooO0O0
        public final void OooO00o(@NotNull oo000o svgaVideoEntity) {
            Intrinsics.checkNotNullParameter(svgaVideoEntity, "svgaVideoEntity");
            OooO oooO = new OooO(svgaVideoEntity);
            oO oOVar = oO.this;
            oOVar.f49514OooOoO.setImageDrawable(oooO);
            ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_CENTER;
            SVGAView sVGAView = oOVar.f49514OooOoO;
            sVGAView.setScaleType(scaleType);
            sVGAView.OooO0Oo();
        }

        @Override // com.opensource.svgaplayer.OooO0OO.OooO0O0
        public final void onError() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO(@NotNull View view, @NotNull MixedRoomActivity activity) {
        super(view, activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(view, "view");
        this.f49513OooOo = new oOO0O000(view, activity);
        View viewFindViewById = view.findViewById(oO00O0oO.tv_msg);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "view.findViewById(R.id.tv_msg)");
        this.f49515OooOoO0 = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(oO00O0oO.svga_skill);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "view.findViewById(R.id.svga_skill)");
        this.f49514OooOoO = (SVGAView) viewFindViewById2;
    }

    @Override // p502o0o00oOO.o0OOO0
    public final boolean OooO00o() {
        return true;
    }

    @Override // p502o0o00oOO.o0OOO0
    public final void OooO0OO(int i, @NotNull ChatModel model) {
        Intrinsics.checkNotNullParameter(model, "model");
        super.OooO0OO(i, model);
        TextView textView = this.f49515OooOoO0;
        o0OOO0.OooO0O0(model, textView);
        this.f49513OooOo.OooO0O0(model);
        MutableLiveData<List<OooOo>> mutableLiveData = Oooo000.f43954OooO00o;
        String message = model.getMessage();
        Intrinsics.checkNotNull(message);
        textView.setText(Oooo000.OooO0Oo(o0000O0.OooO00o(16), message));
        new OooO0OO(this.f49471OooO00o).OooO00o(model.getType() == 11 ? "svga/anim_room_chat_nonsense.svga" : "svga/anim_room_chat_sugraedwords.svga", new OooO00o());
    }

    @Override // p502o0o00oOO.o0OOO0
    public final boolean OooO0Oo() {
        return true;
    }
}
