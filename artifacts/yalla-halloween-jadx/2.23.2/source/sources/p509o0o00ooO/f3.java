package p509o0o00ooO;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o0000O0;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.model.chat.ChatModel;
import com.yalla.yalla.ui.activity.moment.ShowImageActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p184o00o00O0.OooO0OO;
import p368o0OOo0Oo.Oooo000;
import p473o0OoooOo.o0OOOO0o;
import p562o0oOo000.o0O0O00;
import p562o0oOo000.o0OO00O;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class f3 extends p1 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @NotNull
    public final View f50669OooOo;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final float f50670OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @NotNull
    public final NetImageView f50671OooOoO0;

    public static final class OooO00o extends o0OOOO0o {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ ChatModel f50672OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ f3 f50673OooO0oo;

        public OooO00o(ChatModel chatModel, f3 f3Var) {
            this.f50672OooO0oO = chatModel;
            this.f50673OooO0oo = f3Var;
        }

        @Override // p473o0OoooOo.o0OOOO0o
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            String strOooO0o0 = OooO0OO.OooO0o0(this.f50672OooO0oO.getMessage());
            int i = ShowImageActivity.f25802Oooo00o;
            f3 f3Var = this.f50673OooO0oo;
            ShowImageActivity.OooO00o.OooO00o(f3Var.f50780OooO00o, strOooO0o0, f3Var.f50671OooOoO0, null, false);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(@NotNull View view, @NotNull MixedRoomActivity activity) {
        super(view, activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(view, "view");
        this.f50669OooOo = view;
        View viewFindViewById = view.findViewById(o0OO00O.fd_img);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f50671OooOoO0 = (NetImageView) viewFindViewById;
        this.f50670OooOoO = 120.0f;
    }

    @Override // p509o0o00ooO.p1
    public final boolean OooO00o() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x005b A[PHI: r6
      0x005b: PHI (r6v12 float) = (r6v10 float), (r6v11 float) binds: [B:19:0x0059, B:22:0x0061] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p509o0o00ooO.p1
    public final void OooO0OO(int i, @NotNull ChatModel model) {
        float f;
        Intrinsics.checkNotNullParameter(model, "model");
        super.OooO0OO(i, model);
        ViewGroup viewGroup = this.f50758OooOO0;
        viewGroup.setBackground(null);
        viewGroup.setPadding(0, 0, 0, 0);
        NetImageView netImageView = this.f50671OooOoO0;
        ViewGroup.LayoutParams layoutParams = netImageView.getLayoutParams();
        Intrinsics.checkNotNullExpressionValue(layoutParams, "getLayoutParams(...)");
        if (model.getPicwidth() == 0 || model.getPicheight() == 0) {
            float f2 = 120;
            layoutParams.width = o0000O0.OooO00o(f2);
            layoutParams.height = o0000O0.OooO00o(f2);
        } else {
            int picwidth = model.getPicwidth();
            int picheight = model.getPicheight();
            if (picwidth == 0 || picheight == 0) {
                f = 1.0f;
            } else {
                f = (((((double) picwidth) * 1.0d) / ((double) picheight)) > 1.0d ? 1 : (((((double) picwidth) * 1.0d) / ((double) picheight)) == 1.0d ? 0 : -1)) == 0 ? 1.0f : (picwidth * 1.0f) / picheight;
                float f3 = 0.6666667f;
                if (f < 0.6666667f) {
                    f = f3;
                } else {
                    f3 = 1.5f;
                    if (f > 1.5f) {
                        f = f3;
                    }
                }
            }
            boolean z = f == 1.0f;
            float f4 = this.f50670OooOoO;
            if (z) {
                layoutParams.width = o0000O0.OooO00o(f4);
                layoutParams.height = o0000O0.OooO00o(f4);
            } else if (f > 1.0f) {
                layoutParams.width = o0000O0.OooO00o(f4);
                layoutParams.height = o0000O0.OooO00o(f4 / f);
            } else {
                layoutParams.width = o0000O0.OooO00o(f * f4);
                layoutParams.height = o0000O0.OooO00o(f4);
            }
        }
        netImageView.setLayoutParams(layoutParams);
        String strOooO0oo = OooO0OO.OooO0oo(layoutParams.width, layoutParams.height, model.getMessage());
        Oooo000.OooO00o oooO00o = new Oooo000.OooO00o(this.f50780OooO00o);
        Oooo000.OooO00o oooO00o2 = new Oooo000.OooO00o();
        int i2 = o0O0O00.icon_room_picture_default;
        oooO00o2.f43138OooOOOo = i2;
        oooO00o2.f43128OooO0o = i2;
        oooO00o2.f43151OooOoo0 = 2;
        oooO00o2.OooO0o0(8);
        String str = oooO00o2.f43131OooO0oo;
        boolean z2 = oooO00o2.f43127OooO0Oo;
        int i3 = oooO00o2.f43138OooOOOo;
        int i4 = oooO00o2.f43141OooOOoo;
        int i5 = oooO00o2.f43128OooO0o;
        ImageView imageView = oooO00o2.f43132OooOO0;
        boolean z3 = oooO00o2.f43136OooOOO0;
        boolean z4 = oooO00o2.f43129OooO0o0;
        int i6 = oooO00o2.f43135OooOOO;
        int i7 = oooO00o2.f43137OooOOOO;
        int i8 = oooO00o2.f43151OooOoo0;
        int i9 = oooO00o2.f43150OooOoo;
        int i10 = oooO00o2.f43144OooOo00;
        boolean z5 = oooO00o2.f43143OooOo0;
        int i11 = oooO00o2.f43146OooOo0o;
        int i12 = oooO00o2.f43142OooOo;
        int i13 = oooO00o2.f43148OooOoO0;
        int i14 = oooO00o2.f43147OooOoO;
        int i15 = oooO00o2.f43149OooOoOO;
        int i16 = oooO00o2.f43152OooOooO;
        int i17 = oooO00o2.f43153OooOooo;
        boolean z6 = oooO00o2.f43145OooOo0O;
        boolean z7 = oooO00o2.f43155Oooo00O;
        oooO00o.f43131OooO0oo = str;
        oooO00o.f43127OooO0Oo = z2;
        oooO00o.f43138OooOOOo = i3;
        oooO00o.f43141OooOOoo = i4;
        oooO00o.f43128OooO0o = i5;
        oooO00o.f43132OooOO0 = imageView;
        oooO00o.f43135OooOOO = i6;
        oooO00o.f43137OooOOOO = i7;
        oooO00o.f43151OooOoo0 = i8;
        oooO00o.f43150OooOoo = i9;
        oooO00o.f43144OooOo00 = i10;
        oooO00o.f43143OooOo0 = z5;
        oooO00o.f43145OooOo0O = z6;
        oooO00o.f43146OooOo0o = i11;
        oooO00o.f43142OooOo = i12;
        oooO00o.f43148OooOoO0 = i13;
        oooO00o.f43147OooOoO = i14;
        oooO00o.f43149OooOoOO = i15;
        oooO00o.f43152OooOooO = i16;
        oooO00o.f43153OooOooo = i17;
        oooO00o.f43155Oooo00O = z7;
        oooO00o.f43136OooOOO0 = z3;
        oooO00o.f43129OooO0o0 = z4;
        oooO00o.f43126OooO0OO = strOooO0oo;
        oooO00o.f43124OooO00o = 0;
        oooO00o.OooO0Oo(netImageView);
        netImageView.setOnClickListener(new OooO00o(model, this));
        netImageView.setOnLongClickListener(new View.OnLongClickListener() { // from class: o0o00ooO.e3
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                f3 this$0 = this.f50663OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.f50759OooOO0O.performLongClick();
                return false;
            }
        });
    }

    @Override // p509o0o00ooO.p1
    public final boolean OooO0Oo() {
        return false;
    }
}
