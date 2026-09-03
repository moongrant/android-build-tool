package p536o0o0OOoo;

import android.widget.TextView;
import com.app.base.view.SearchView;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.o00O0O;
import com.yalla.yalla.ui.activity.message.ShareToFriendsActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p254o00ooO0O.o000O0O0;
import p563o0oOo0.o00O0000;
import p649o0ooOOoo.fc;
import p649o0ooOOoo.gc;

/* JADX INFO: loaded from: classes2.dex */
public final class f1 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ ShareToFriendsActivity f43782Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(ShareToFriendsActivity shareToFriendsActivity) {
        super(0);
        this.f43782Oooo0o = shareToFriendsActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        fc fcVar = this.f43782Oooo0o.f22211Ooooo00;
        fc fcVar2 = null;
        if (fcVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchBinding");
            fcVar = null;
        }
        if (!(!StringsKt.isBlank(fcVar.f49362OooO0O0.getSearchText()))) {
            o00O0000 o00o0001 = this.f43782Oooo0o.f22218OoooooO;
            if (o00o0001 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
                o00o0001 = null;
            }
            if (o00o0001.getItemCount() > 0) {
                gc gcVar = this.f43782Oooo0o.f22213OooooO0;
                if (gcVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("allFriendBinding");
                    gcVar = null;
                }
                TextView textView = gcVar.f49451OooO0O0;
                Intrinsics.checkNotNullExpressionValue(textView, "allFriendBinding.tvTitle");
                o00O0O.OooO(textView);
                fc fcVar3 = this.f43782Oooo0o.f22211Ooooo00;
                if (fcVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("searchBinding");
                } else {
                    fcVar2 = fcVar3;
                }
                SearchView searchView = fcVar2.f49362OooO0O0;
                Intrinsics.checkNotNullExpressionValue(searchView, "searchBinding.search");
                o00O0O.OooO(searchView);
                TextView textView2 = this.f43782Oooo0o.f22214OooooOO;
                if (textView2 != null) {
                    textView2.setEnabled(true);
                }
                TextView textView3 = this.f43782Oooo0o.f22214OooooOO;
                if (textView3 != null) {
                    textView3.setTextColor(o000O0O0.OooO00o(R.color.white));
                }
            } else {
                gc gcVar2 = this.f43782Oooo0o.f22213OooooO0;
                if (gcVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("allFriendBinding");
                    gcVar2 = null;
                }
                TextView textView4 = gcVar2.f49451OooO0O0;
                Intrinsics.checkNotNullExpressionValue(textView4, "allFriendBinding.tvTitle");
                o00O0O.OooO00o(textView4);
                fc fcVar4 = this.f43782Oooo0o.f22211Ooooo00;
                if (fcVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("searchBinding");
                } else {
                    fcVar2 = fcVar4;
                }
                SearchView searchView2 = fcVar2.f49362OooO0O0;
                Intrinsics.checkNotNullExpressionValue(searchView2, "searchBinding.search");
                o00O0O.OooO00o(searchView2);
                this.f43782Oooo0o.Oooo000().f50282OooO0OO.OooO0o0();
                TextView textView5 = this.f43782Oooo0o.f22214OooooOO;
                if (textView5 != null) {
                    textView5.setEnabled(false);
                }
                TextView textView6 = this.f43782Oooo0o.f22214OooooOO;
                if (textView6 != null) {
                    textView6.setTextColor(o000O0O0.OooO00o(R.color.color_FFFFFFF_70));
                }
            }
        }
        return Unit.INSTANCE;
    }
}
