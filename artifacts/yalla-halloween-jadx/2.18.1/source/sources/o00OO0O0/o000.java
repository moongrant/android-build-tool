package o00OO0O0;

import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import com.app.base.model.ChatModel;
import com.weieyu.yalla.R;
import com.yalla.support.cloudfilemanager.util.CloudImageUtilKt;
import com.yalla.yalla.common.ui.view.SVGAView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class o000 extends OooOO0O {

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NotNull
    public final SVGAView f31416OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NotNull
    public final TextView f31417OooOOo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000(@NotNull FragmentActivity activity, @NotNull View view) {
        super(activity, view);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(view, "view");
        View viewFindViewById = view.findViewById(R.id.tvContentMessage);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "view.findViewById(R.id.tvContentMessage)");
        this.f31417OooOOo0 = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.sdv_content_pic);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "view.findViewById(R.id.sdv_content_pic)");
        this.f31416OooOOo = (SVGAView) viewFindViewById2;
    }

    @Override // o00OO0O0.OooOO0O
    public final boolean OooO00o() {
        return false;
    }

    @Override // o00OO0O0.OooOO0O
    public final void OooO0OO(int i, @NotNull ChatModel model) {
        Intrinsics.checkNotNullParameter(model, "model");
        super.OooO0OO(i, model);
        SVGAView sVGAView = this.f31416OooOOo;
        sVGAView.OooO0oo(CloudImageUtilKt.imgFormat(model.to.getHeaderCardUrl()), this.f31399OooO00o);
        sVGAView.OooO();
        OooO0O0(model, this.f31417OooOOo0);
    }

    @Override // o00OO0O0.OooOO0O
    public final boolean OooO0Oo() {
        return true;
    }
}
