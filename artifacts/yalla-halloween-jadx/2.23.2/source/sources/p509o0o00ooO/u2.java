package p509o0o00ooO;

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
import p184o00o00O0.OooO0OO;
import p368o0OOo0Oo.Oooo000;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.o0Oo0oo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class u2 extends p1 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @NotNull
    public final NetImageView f50841OooOo;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @NotNull
    public final View f50842OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(@NotNull View view, @NotNull MixedRoomActivity activity) {
        super(view, activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(view, "view");
        View viewFindViewById = view.findViewById(o0OO00O.niv_gif);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f50841OooOo = (NetImageView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(o0OO00O.chatlineContent);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f50842OooOoO0 = viewFindViewById2;
    }

    @Override // p509o0o00ooO.p1
    public final boolean OooO00o() {
        return true;
    }

    @Override // p509o0o00ooO.p1
    public final void OooO0OO(int i, @NotNull ChatModel model) {
        Intrinsics.checkNotNullParameter(model, "model");
        super.OooO0OO(i, model);
        ViewGroup viewGroup = this.f50758OooOO0;
        viewGroup.setBackground(null);
        viewGroup.setPadding(0, 0, 0, 0);
        Oooo000.OooO00o oooO00o = new Oooo000.OooO00o(this.f50780OooO00o);
        Oooo000.OooO00o oooO00o2 = new Oooo000.OooO00o();
        int i2 = o0Oo0oo.ic_gif_default;
        oooO00o2.f43138OooOOOo = i2;
        oooO00o2.f43128OooO0o = i2;
        oooO00o2.f43151OooOoo0 = 1;
        String str = oooO00o2.f43131OooO0oo;
        boolean z = oooO00o2.f43127OooO0Oo;
        int i3 = oooO00o2.f43141OooOOoo;
        ImageView imageView = oooO00o2.f43132OooOO0;
        boolean z2 = oooO00o2.f43136OooOOO0;
        boolean z3 = oooO00o2.f43129OooO0o0;
        int i4 = oooO00o2.f43135OooOOO;
        int i5 = oooO00o2.f43137OooOOOO;
        int i6 = oooO00o2.f43150OooOoo;
        int i7 = oooO00o2.f43144OooOo00;
        boolean z4 = oooO00o2.f43143OooOo0;
        int i8 = oooO00o2.f43146OooOo0o;
        int i9 = oooO00o2.f43142OooOo;
        int i10 = oooO00o2.f43148OooOoO0;
        int i11 = oooO00o2.f43147OooOoO;
        int i12 = oooO00o2.f43149OooOoOO;
        int i13 = oooO00o2.f43152OooOooO;
        int i14 = oooO00o2.f43153OooOooo;
        boolean z5 = oooO00o2.f43145OooOo0O;
        boolean z6 = oooO00o2.f43155Oooo00O;
        oooO00o.f43131OooO0oo = str;
        oooO00o.f43127OooO0Oo = z;
        oooO00o.f43138OooOOOo = i2;
        oooO00o.f43141OooOOoo = i3;
        oooO00o.f43128OooO0o = i2;
        oooO00o.f43132OooOO0 = imageView;
        oooO00o.f43135OooOOO = i4;
        oooO00o.f43137OooOOOO = i5;
        oooO00o.f43151OooOoo0 = 1;
        oooO00o.f43150OooOoo = i6;
        oooO00o.f43144OooOo00 = i7;
        oooO00o.f43143OooOo0 = z4;
        oooO00o.f43145OooOo0O = z5;
        oooO00o.f43146OooOo0o = i8;
        oooO00o.f43142OooOo = i9;
        oooO00o.f43148OooOoO0 = i10;
        oooO00o.f43147OooOoO = i11;
        oooO00o.f43149OooOoOO = i12;
        oooO00o.f43152OooOooO = i13;
        oooO00o.f43153OooOooo = i14;
        oooO00o.f43155Oooo00O = z6;
        oooO00o.f43136OooOOO0 = z2;
        oooO00o.f43129OooO0o0 = z3;
        ChatMessageOld.Gif gif = model.getGif();
        Intrinsics.checkNotNull(gif);
        oooO00o.f43126OooO0OO = OooO0OO.OooO0Oo(gif.gifUrl);
        oooO00o.f43124OooO00o = 0;
        oooO00o.f43127OooO0Oo = true;
        oooO00o.OooO0Oo(this.f50841OooOo);
    }

    @Override // p509o0o00ooO.p1
    public final boolean OooO0Oo() {
        return false;
    }
}
