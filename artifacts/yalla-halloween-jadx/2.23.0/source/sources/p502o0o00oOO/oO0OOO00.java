package p502o0o00oOO;

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
import p139o00OOooO.OooO0o;
import p362o0OOo0O.OooOO0;
import p466o0Oooo0o.oo00o;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OOO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class oO0OOO00 extends o0OOO0 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @NotNull
    public final View f49594OooOo;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final float f49595OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @NotNull
    public final NetImageView f49596OooOoO0;

    public static final class OooO00o extends oo00o {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ ChatModel f49597OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ oO0OOO00 f49598OooO0oo;

        public OooO00o(ChatModel chatModel, oO0OOO00 oo0ooo00) {
            this.f49597OooO0oO = chatModel;
            this.f49598OooO0oo = oo0ooo00;
        }

        @Override // p466o0Oooo0o.oo00o
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            String strOooO0o0 = OooO0o.OooO0o0(this.f49597OooO0oO.getMessage());
            int i = ShowImageActivity.f26251Oooo00o;
            oO0OOO00 oo0ooo00 = this.f49598OooO0oo;
            ShowImageActivity.OooO00o.OooO00o(oo0ooo00.f49471OooO00o, strOooO0o0, oo0ooo00.f49596OooOoO0, null, false);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0OOO00(@NotNull View view, @NotNull MixedRoomActivity activity) {
        super(view, activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(view, "view");
        this.f49594OooOo = view;
        View viewFindViewById = view.findViewById(oO00O0oO.fd_img);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "view.findViewById(R.id.fd_img)");
        this.f49596OooOoO0 = (NetImageView) viewFindViewById;
        this.f49595OooOoO = 120.0f;
    }

    @Override // p502o0o00oOO.o0OOO0
    public final boolean OooO00o() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x005b A[PHI: r6
      0x005b: PHI (r6v12 float) = (r6v10 float), (r6v11 float) binds: [B:19:0x0059, B:22:0x0061] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p502o0o00oOO.o0OOO0
    public final void OooO0OO(int i, @NotNull ChatModel model) {
        float f;
        Intrinsics.checkNotNullParameter(model, "model");
        super.OooO0OO(i, model);
        ViewGroup viewGroup = this.f49456OooOO0;
        viewGroup.setBackground(null);
        viewGroup.setPadding(0, 0, 0, 0);
        NetImageView netImageView = this.f49596OooOoO0;
        ViewGroup.LayoutParams layoutParams = netImageView.getLayoutParams();
        Intrinsics.checkNotNullExpressionValue(layoutParams, "fd_img.layoutParams");
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
            float f4 = this.f49595OooOoO;
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
        String strOooO0oo = OooO0o.OooO0oo(layoutParams.width, layoutParams.height, model.getMessage());
        OooOO0.OooO00o oooO00o = new OooOO0.OooO00o(this.f49471OooO00o);
        OooOO0.OooO00o oooO00o2 = new OooOO0.OooO00o();
        int i2 = oO00OOO.icon_room_picture_default;
        oooO00o2.f43923OooOOOo = i2;
        oooO00o2.f43913OooO0o = i2;
        oooO00o2.f43936OooOoo0 = 2;
        oooO00o2.OooO0o0(8);
        String str = oooO00o2.f43916OooO0oo;
        boolean z2 = oooO00o2.f43912OooO0Oo;
        int i3 = oooO00o2.f43923OooOOOo;
        int i4 = oooO00o2.f43926OooOOoo;
        int i5 = oooO00o2.f43913OooO0o;
        ImageView imageView = oooO00o2.f43917OooOO0;
        boolean z3 = oooO00o2.f43921OooOOO0;
        boolean z4 = oooO00o2.f43914OooO0o0;
        int i6 = oooO00o2.f43920OooOOO;
        int i7 = oooO00o2.f43922OooOOOO;
        int i8 = oooO00o2.f43936OooOoo0;
        int i9 = oooO00o2.f43935OooOoo;
        int i10 = oooO00o2.f43929OooOo00;
        boolean z5 = oooO00o2.f43928OooOo0;
        int i11 = oooO00o2.f43931OooOo0o;
        int i12 = oooO00o2.f43927OooOo;
        int i13 = oooO00o2.f43933OooOoO0;
        int i14 = oooO00o2.f43932OooOoO;
        int i15 = oooO00o2.f43934OooOoOO;
        int i16 = oooO00o2.f43937OooOooO;
        int i17 = oooO00o2.f43938OooOooo;
        boolean z6 = oooO00o2.f43930OooOo0O;
        boolean z7 = oooO00o2.f43940Oooo00O;
        oooO00o.f43916OooO0oo = str;
        oooO00o.f43912OooO0Oo = z2;
        oooO00o.f43923OooOOOo = i3;
        oooO00o.f43926OooOOoo = i4;
        oooO00o.f43913OooO0o = i5;
        oooO00o.f43917OooOO0 = imageView;
        oooO00o.f43920OooOOO = i6;
        oooO00o.f43922OooOOOO = i7;
        oooO00o.f43936OooOoo0 = i8;
        oooO00o.f43935OooOoo = i9;
        oooO00o.f43929OooOo00 = i10;
        oooO00o.f43928OooOo0 = z5;
        oooO00o.f43930OooOo0O = z6;
        oooO00o.f43931OooOo0o = i11;
        oooO00o.f43927OooOo = i12;
        oooO00o.f43933OooOoO0 = i13;
        oooO00o.f43932OooOoO = i14;
        oooO00o.f43934OooOoOO = i15;
        oooO00o.f43937OooOooO = i16;
        oooO00o.f43938OooOooo = i17;
        oooO00o.f43940Oooo00O = z7;
        oooO00o.f43921OooOOO0 = z3;
        oooO00o.f43914OooO0o0 = z4;
        oooO00o.f43911OooO0OO = strOooO0oo;
        oooO00o.f43909OooO00o = 0;
        oooO00o.OooO0Oo(netImageView);
        netImageView.setOnClickListener(new OooO00o(model, this));
        netImageView.setOnLongClickListener(new View.OnLongClickListener() { // from class: o0o00oOO.oO00o00
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                oO0OOO00 this$0 = this.f49557OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.f49457OooOO0O.performLongClick();
                return false;
            }
        });
    }

    @Override // p502o0o00oOO.o0OOO0
    public final boolean OooO0Oo() {
        return false;
    }
}
