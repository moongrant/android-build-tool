package p502o0o00oOO;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.data.db.model.ChatMessageOld;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.model.chat.ChatModel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p139o00OOooO.OooO0o;
import p362o0OOo0O.OooOO0;
import p584o0oOooO0.oO00O0oO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class oOo00OO0 extends o0OOO0 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @NotNull
    public final NetImageView f49683OooOo;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @NotNull
    public final View f49684OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOo00OO0(@NotNull View view, @NotNull MixedRoomActivity activity) {
        super(view, activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(view, "view");
        View viewFindViewById = view.findViewById(oO00O0oO.niv_gif);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "view.findViewById(R.id.niv_gif)");
        this.f49683OooOo = (NetImageView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(oO00O0oO.chatlineContent);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "view.findViewById(R.id.chatlineContent)");
        this.f49684OooOoO0 = viewFindViewById2;
    }

    @Override // p502o0o00oOO.o0OOO0
    public final boolean OooO00o() {
        return true;
    }

    @Override // p502o0o00oOO.o0OOO0
    public final void OooO0OO(int i, @NotNull ChatModel model) {
        Intrinsics.checkNotNullParameter(model, "model");
        super.OooO0OO(i, model);
        ViewGroup viewGroup = this.f49456OooOO0;
        viewGroup.setBackground(null);
        viewGroup.setPadding(0, 0, 0, 0);
        OooOO0.OooO00o oooO00o = new OooOO0.OooO00o(this.f49471OooO00o);
        OooOO0.OooO00o oooO00o2 = new OooOO0.OooO00o();
        int i2 = p584o0oOooO0.oOo00OO0.ic_gif_default;
        oooO00o2.f43923OooOOOo = i2;
        oooO00o2.f43913OooO0o = i2;
        oooO00o2.f43936OooOoo0 = 1;
        String str = oooO00o2.f43916OooO0oo;
        boolean z = oooO00o2.f43912OooO0Oo;
        int i3 = oooO00o2.f43926OooOOoo;
        ImageView imageView = oooO00o2.f43917OooOO0;
        boolean z2 = oooO00o2.f43921OooOOO0;
        boolean z3 = oooO00o2.f43914OooO0o0;
        int i4 = oooO00o2.f43920OooOOO;
        int i5 = oooO00o2.f43922OooOOOO;
        int i6 = oooO00o2.f43935OooOoo;
        int i7 = oooO00o2.f43929OooOo00;
        boolean z4 = oooO00o2.f43928OooOo0;
        int i8 = oooO00o2.f43931OooOo0o;
        int i9 = oooO00o2.f43927OooOo;
        int i10 = oooO00o2.f43933OooOoO0;
        int i11 = oooO00o2.f43932OooOoO;
        int i12 = oooO00o2.f43934OooOoOO;
        int i13 = oooO00o2.f43937OooOooO;
        int i14 = oooO00o2.f43938OooOooo;
        boolean z5 = oooO00o2.f43930OooOo0O;
        boolean z6 = oooO00o2.f43940Oooo00O;
        oooO00o.f43916OooO0oo = str;
        oooO00o.f43912OooO0Oo = z;
        oooO00o.f43923OooOOOo = i2;
        oooO00o.f43926OooOOoo = i3;
        oooO00o.f43913OooO0o = i2;
        oooO00o.f43917OooOO0 = imageView;
        oooO00o.f43920OooOOO = i4;
        oooO00o.f43922OooOOOO = i5;
        oooO00o.f43936OooOoo0 = 1;
        oooO00o.f43935OooOoo = i6;
        oooO00o.f43929OooOo00 = i7;
        oooO00o.f43928OooOo0 = z4;
        oooO00o.f43930OooOo0O = z5;
        oooO00o.f43931OooOo0o = i8;
        oooO00o.f43927OooOo = i9;
        oooO00o.f43933OooOoO0 = i10;
        oooO00o.f43932OooOoO = i11;
        oooO00o.f43934OooOoOO = i12;
        oooO00o.f43937OooOooO = i13;
        oooO00o.f43938OooOooo = i14;
        oooO00o.f43940Oooo00O = z6;
        oooO00o.f43921OooOOO0 = z2;
        oooO00o.f43914OooO0o0 = z3;
        ChatMessageOld.Gif gif = model.getGif();
        Intrinsics.checkNotNull(gif);
        oooO00o.f43911OooO0OO = OooO0o.OooO0Oo(gif.gifUrl);
        oooO00o.f43909OooO00o = 0;
        oooO00o.f43912OooO0Oo = true;
        oooO00o.OooO0Oo(this.f49683OooOo);
    }

    @Override // p502o0o00oOO.o0OOO0
    public final boolean OooO0Oo() {
        return false;
    }
}
