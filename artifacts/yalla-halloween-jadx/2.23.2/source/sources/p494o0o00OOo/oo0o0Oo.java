package p494o0o00OOo;

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
import p187o00o00o0.OooO;
import p368o0OOo0Oo.Oooo000;
import p423o0OoO0OO.o00O0OO;
import p598o0oo00Oo.o0000O00;
import p642o0ooOOO0.d1;

/* JADX INFO: loaded from: classes4.dex */
public final class oo0o0Oo extends Lambda implements Function1<o00O0OO.OooO00o, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentSelectMedia f49610OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ NetImageView f49611OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ ConstraintLayout f49612OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ MomentSendImageAdapter f49613OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0o0Oo(MomentSelectMedia momentSelectMedia, ConstraintLayout constraintLayout, NetImageView netImageView, MomentSendImageAdapter momentSendImageAdapter) {
        super(1);
        this.f49610OooO0Oo = momentSelectMedia;
        this.f49612OooO0o0 = constraintLayout;
        this.f49611OooO0o = netImageView;
        this.f49613OooO0oO = momentSendImageAdapter;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(o00O0OO.OooO00o oooO00o) {
        o00O0OO.OooO00o prop = oooO00o;
        Intrinsics.checkNotNullParameter(prop, "prop");
        MomentSelectMedia momentSelectMedia = this.f49610OooO0Oo;
        o0000O00.OooO0O0("WRM getVideoProportion \n MomentSelectMedia = " + OooO.OooO00o(momentSelectMedia) + " \n widthProp = " + OooO.OooO00o(prop));
        ConstraintLayout constraintLayout = this.f49612OooO0o0;
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        GridLayoutManager.LayoutParams layoutParams2 = layoutParams instanceof GridLayoutManager.LayoutParams ? (GridLayoutManager.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            ((ViewGroup.MarginLayoutParams) layoutParams2).width = prop.f46711OooO00o;
        }
        if (layoutParams2 != null) {
            ((ViewGroup.MarginLayoutParams) layoutParams2).height = prop.f46712OooO0O0;
        }
        constraintLayout.setLayoutParams(layoutParams2);
        NetImageView netImageView = this.f49611OooO0o;
        ViewGroup.LayoutParams layoutParams3 = netImageView.getLayoutParams();
        ConstraintLayout.LayoutParams layoutParams4 = layoutParams3 instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams3 : null;
        if (layoutParams4 != null) {
            ((ViewGroup.MarginLayoutParams) layoutParams4).width = prop.f46711OooO00o;
        }
        if (layoutParams4 != null) {
            ((ViewGroup.MarginLayoutParams) layoutParams4).height = prop.f46712OooO0O0;
        }
        netImageView.setLayoutParams(layoutParams4);
        Oooo000.OooO00o oooO00o2 = new Oooo000.OooO00o(this.f49613OooO0oO.f56423OooOo);
        oooO00o2.OooO00o(d1.OooO0Oo());
        oooO00o2.f43151OooOoo0 = 2;
        oooO00o2.f43141OooOOoo = 1;
        oooO00o2.f43129OooO0o0 = true;
        oooO00o2.f43126OooO0OO = momentSelectMedia.getPath();
        oooO00o2.f43124OooO00o = 0;
        oooO00o2.OooO0o0(6);
        oooO00o2.OooO0Oo(netImageView);
        return Unit.INSTANCE;
    }
}
