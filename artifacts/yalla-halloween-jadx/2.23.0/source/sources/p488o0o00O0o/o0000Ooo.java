package p488o0o00O0o;

import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.model.MomentSelectMedia;
import com.yalla.yalla.ui.activity.moment.momentSend.MomentSendImageAdapter;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p140o00OOooo.OooOO0;
import p417o0OoO0.o000O00O;
import p543o0oO0O00.OooO;
import p592o0oo00O.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000Ooo extends Lambda implements Function1<o000O00O.OooO00o, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentSelectMedia f48433OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ NetImageView f48434OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ ConstraintLayout f48435OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ MomentSendImageAdapter f48436OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000Ooo(MomentSelectMedia momentSelectMedia, ConstraintLayout constraintLayout, NetImageView netImageView, MomentSendImageAdapter momentSendImageAdapter) {
        super(1);
        this.f48433OooO0Oo = momentSelectMedia;
        this.f48435OooO0o0 = constraintLayout;
        this.f48434OooO0o = netImageView;
        this.f48436OooO0oO = momentSendImageAdapter;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(o000O00O.OooO00o oooO00o) {
        o000O00O.OooO00o prop = oooO00o;
        Intrinsics.checkNotNullParameter(prop, "prop");
        MomentSelectMedia momentSelectMedia = this.f48433OooO0Oo;
        OooOOO0.OooO0O0("WRM getVideoProportion \n MomentSelectMedia = " + OooOO0.OooO00o(momentSelectMedia) + " \n widthProp = " + OooOO0.OooO00o(prop));
        ConstraintLayout constraintLayout = this.f48435OooO0o0;
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        GridLayoutManager.LayoutParams layoutParams2 = layoutParams instanceof GridLayoutManager.LayoutParams ? (GridLayoutManager.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            ((ViewGroup.MarginLayoutParams) layoutParams2).width = prop.f45512OooO00o;
        }
        if (layoutParams2 != null) {
            ((ViewGroup.MarginLayoutParams) layoutParams2).height = prop.f45513OooO0O0;
        }
        constraintLayout.setLayoutParams(layoutParams2);
        NetImageView netImageView = this.f48434OooO0o;
        ViewGroup.LayoutParams layoutParams3 = netImageView.getLayoutParams();
        ConstraintLayout.LayoutParams layoutParams4 = layoutParams3 instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams3 : null;
        if (layoutParams4 != null) {
            ((ViewGroup.MarginLayoutParams) layoutParams4).width = prop.f45512OooO00o;
        }
        if (layoutParams4 != null) {
            ((ViewGroup.MarginLayoutParams) layoutParams4).height = prop.f45513OooO0O0;
        }
        netImageView.setLayoutParams(layoutParams4);
        o0OOo0O.OooOO0.OooO00o oooO00o2 = new o0OOo0O.OooOO0.OooO00o(this.f48436OooO0oO.f56196OooOo);
        oooO00o2.OooO00o(OooO.OooO0Oo());
        oooO00o2.f43936OooOoo0 = 2;
        oooO00o2.f43926OooOOoo = 1;
        oooO00o2.f43914OooO0o0 = true;
        oooO00o2.f43911OooO0OO = momentSelectMedia.getPath();
        oooO00o2.f43909OooO00o = 0;
        oooO00o2.OooO0o0(6);
        oooO00o2.OooO0Oo(netImageView);
        return Unit.INSTANCE;
    }
}
