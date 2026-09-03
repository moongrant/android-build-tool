package p536o0o0OOoo;

import android.widget.TextView;
import com.yalla.support.common.util.o00O0O;
import com.yalla.yalla.ui.activity.message.ShareToFriendsActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p563o0oOo0.o00O0000;
import p649o0ooOOoo.fc;
import p649o0ooOOoo.gc;

/* JADX INFO: loaded from: classes2.dex */
public final class e1 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ ShareToFriendsActivity f43776Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(ShareToFriendsActivity shareToFriendsActivity) {
        super(0);
        this.f43776Oooo0o = shareToFriendsActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        fc fcVar = this.f43776Oooo0o.f22211Ooooo00;
        gc gcVar = null;
        if (fcVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchBinding");
            fcVar = null;
        }
        if (!(!StringsKt.isBlank(fcVar.f49362OooO0O0.getSearchText()))) {
            o00O0000 o00o0001 = this.f43776Oooo0o.f22216Oooooo;
            if (o00o0001 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("recentFriendAdapter");
                o00o0001 = null;
            }
            if (o00o0001.getItemCount() > 0) {
                gc gcVar2 = this.f43776Oooo0o.f22212Ooooo0o;
                if (gcVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("recentFriendBinding");
                } else {
                    gcVar = gcVar2;
                }
                TextView textView = gcVar.f49451OooO0O0;
                Intrinsics.checkNotNullExpressionValue(textView, "recentFriendBinding.tvTitle");
                o00O0O.OooO(textView);
            } else {
                gc gcVar3 = this.f43776Oooo0o.f22212Ooooo0o;
                if (gcVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("recentFriendBinding");
                } else {
                    gcVar = gcVar3;
                }
                TextView textView2 = gcVar.f49451OooO0O0;
                Intrinsics.checkNotNullExpressionValue(textView2, "recentFriendBinding.tvTitle");
                o00O0O.OooO00o(textView2);
            }
        }
        return Unit.INSTANCE;
    }
}
