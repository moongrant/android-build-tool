package p536o0o0OOoo;

import android.widget.TextView;
import com.yalla.yalla.ui.activity.message.AtFriendsActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p254o00ooO0O.oOO00O;
import p563o0oOo0.OooOo;
import p649o0ooOOoo.ud;
import p649o0ooOOoo.vd;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ AtFriendsActivity f43746Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(AtFriendsActivity atFriendsActivity) {
        super(0);
        this.f43746Oooo0o = atFriendsActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        vd vdVar = this.f43746Oooo0o.f22135Oooooo;
        ud udVar = null;
        if (vdVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchHeader");
            vdVar = null;
        }
        if (!(!StringsKt.isBlank(vdVar.f50810OooO0O0.getSearchText()))) {
            OooOo oooOo = this.f43746Oooo0o.f22133OooooOO;
            if (oooOo == null) {
                Intrinsics.throwUninitializedPropertyAccessException("recentFriendAdapter");
                oooOo = null;
            }
            if (oooOo.getItemCount() > 0) {
                ud udVar2 = this.f43746Oooo0o.f22137OoooooO;
                if (udVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("recentFriendHeader");
                } else {
                    udVar = udVar2;
                }
                TextView textView = udVar.f50710OooO0O0;
                Intrinsics.checkNotNullExpressionValue(textView, "recentFriendHeader.tvTitle");
                oOO00O.OooO(textView);
            } else {
                ud udVar3 = this.f43746Oooo0o.f22137OoooooO;
                if (udVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("recentFriendHeader");
                } else {
                    udVar = udVar3;
                }
                TextView textView2 = udVar.f50710OooO0O0;
                Intrinsics.checkNotNullExpressionValue(textView2, "recentFriendHeader.tvTitle");
                oOO00O.OooO00o(textView2);
            }
        }
        return Unit.INSTANCE;
    }
}
