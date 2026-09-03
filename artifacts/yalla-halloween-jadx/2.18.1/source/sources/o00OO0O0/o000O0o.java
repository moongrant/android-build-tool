package o00OO0O0;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import com.app.base.model.ChatModel;
import com.weieyu.yalla.R;
import com.yalla.support.cloudfilemanager.util.CloudImageUtilKt;
import com.yalla.yalla.ui.activity.moment.ShowImageActivity;
import com.yalla.yalla.util.netimage.NetImageView;
import io.agora.rtc.Constants;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p616o0oo0Ooo.oO0O00;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class o000O0o extends OooOO0O {

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NotNull
    public final NetImageView f31470OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NotNull
    public final View f31471OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final int f31472OooOOoo;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final int f31473OooOo00;

    public static final class OooO00o extends p654o0ooo.o00Oo0 {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ ChatModel f31474Oooo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ o000O0o f31475OoooO00;

        public OooO00o(ChatModel chatModel, o000O0o o000o0o2) {
            this.f31474Oooo = chatModel;
            this.f31475OoooO00 = o000o0o2;
        }

        @Override // p654o0ooo.o00Oo0
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            String strImgPng = CloudImageUtilKt.imgPng(this.f31474Oooo.message);
            ShowImageActivity.OooO00o oooO00o = ShowImageActivity.f22515o00o0O;
            o000O0o o000o0o2 = this.f31475OoooO00;
            oooO00o.OooO0O0(o000o0o2.f31399OooO00o, strImgPng, o000o0o2.f31470OooOOo, null, false);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O0o(@NotNull FragmentActivity activity, @NotNull View view) {
        super(activity, view);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(view, "view");
        this.f31471OooOOo0 = view;
        View viewFindViewById = view.findViewById(R.id.fd_img);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "view.findViewById(R.id.fd_img)");
        this.f31470OooOOo = (NetImageView) viewFindViewById;
        this.f31472OooOOoo = 110;
        this.f31473OooOo00 = Constants.ERR_ALREADY_IN_RECORDING;
    }

    @Override // o00OO0O0.OooOO0O
    public final boolean OooO00o() {
        return true;
    }

    @Override // o00OO0O0.OooOO0O
    public final void OooO0OO(int i, @NotNull ChatModel model) {
        int i2;
        Intrinsics.checkNotNullParameter(model, "model");
        super.OooO0OO(i, model);
        ViewGroup.LayoutParams layoutParams = this.f31470OooOOo.getLayoutParams();
        Intrinsics.checkNotNullExpressionValue(layoutParams, "fd_img.layoutParams");
        int i3 = model.picwidth;
        if (i3 == 0 || (i2 = model.picheight) == 0) {
            layoutParams.width = com.yalla.support.common.util.OooOo00.OooO00o(70.0f);
            layoutParams.height = com.yalla.support.common.util.OooOo00.OooO00o(70.0f);
        } else {
            float f = i3 / i2;
            int i4 = this.f31472OooOOoo;
            int i5 = this.f31473OooOo00;
            if (f > i4 / i5) {
                if (i3 > com.yalla.support.common.util.OooOo00.OooO00o(i4)) {
                    int iOooO00o = com.yalla.support.common.util.OooOo00.OooO00o(this.f31472OooOOoo);
                    layoutParams.width = iOooO00o;
                    layoutParams.height = (int) (iOooO00o / f);
                } else {
                    layoutParams.width = model.picwidth;
                    layoutParams.height = model.picheight;
                }
            } else if (i2 > com.yalla.support.common.util.OooOo00.OooO00o(i5)) {
                int iOooO00o2 = com.yalla.support.common.util.OooOo00.OooO00o(this.f31473OooOo00);
                layoutParams.height = iOooO00o2;
                layoutParams.width = (int) (iOooO00o2 * f);
            } else {
                layoutParams.width = model.picwidth;
                layoutParams.height = model.picheight;
            }
        }
        this.f31470OooOOo.setLayoutParams(layoutParams);
        String strImgSize = CloudImageUtilKt.imgSize(model.message, layoutParams.width, layoutParams.height);
        oO0O00.OooO00o oooO00o = new oO0O00.OooO00o(this.f31399OooO00o);
        oooO00o.OooO00o(o00OOO.OooO00o.OooO0o());
        oooO00o.f48429OooO0OO = strImgSize;
        oooO00o.f48427OooO00o = 0;
        oooO00o.OooO0o(this.f31470OooOOo);
        this.f31470OooOOo.setOnClickListener(new OooO00o(model, this));
        this.f31470OooOOo.setOnLongClickListener(new View.OnLongClickListener() { // from class: o00OO0O0.o000O000
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                o000O0o this$0 = this.f31466Oooo0o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.f31393OooOO0o.performLongClick();
                return false;
            }
        });
    }

    @Override // o00OO0O0.OooOO0O
    public final boolean OooO0Oo() {
        return true;
    }
}
