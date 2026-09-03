package p536o0o0OOoo;

import android.widget.TextView;
import com.app.base.view.SearchView;
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
public final class b extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ AtFriendsActivity f43750Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(AtFriendsActivity atFriendsActivity) {
        super(0);
        this.f43750Oooo0o = atFriendsActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        vd vdVar = this.f43750Oooo0o.f22135Oooooo;
        vd vdVar2 = null;
        if (vdVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchHeader");
            vdVar = null;
        }
        if (!(!StringsKt.isBlank(vdVar.f50810OooO0O0.getSearchText()))) {
            OooOo oooOo = this.f43750Oooo0o.f22136Oooooo0;
            if (oooOo == null) {
                Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
                oooOo = null;
            }
            if (oooOo.getItemCount() > 0) {
                ud udVar = this.f43750Oooo0o.f22138Ooooooo;
                if (udVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("allFriendHeader");
                    udVar = null;
                }
                TextView textView = udVar.f50710OooO0O0;
                Intrinsics.checkNotNullExpressionValue(textView, "allFriendHeader.tvTitle");
                oOO00O.OooO(textView);
                vd vdVar3 = this.f43750Oooo0o.f22135Oooooo;
                if (vdVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("searchHeader");
                } else {
                    vdVar2 = vdVar3;
                }
                SearchView searchView = vdVar2.f50810OooO0O0;
                Intrinsics.checkNotNullExpressionValue(searchView, "searchHeader.search");
                oOO00O.OooO(searchView);
            } else {
                ud udVar2 = this.f43750Oooo0o.f22138Ooooooo;
                if (udVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("allFriendHeader");
                    udVar2 = null;
                }
                TextView textView2 = udVar2.f50710OooO0O0;
                Intrinsics.checkNotNullExpressionValue(textView2, "allFriendHeader.tvTitle");
                oOO00O.OooO00o(textView2);
                vd vdVar4 = this.f43750Oooo0o.f22135Oooooo;
                if (vdVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("searchHeader");
                } else {
                    vdVar2 = vdVar4;
                }
                SearchView searchView2 = vdVar2.f50810OooO0O0;
                Intrinsics.checkNotNullExpressionValue(searchView2, "searchHeader.search");
                oOO00O.OooO00o(searchView2);
                this.f43750Oooo0o.OooOooo().f50105OooO0OO.OooO0o0();
            }
        }
        return Unit.INSTANCE;
    }
}
