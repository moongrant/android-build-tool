package p546o0o0OoOO;

import android.view.View;
import android.widget.LinearLayout;
import com.yalla.yalla.ui.activity.room.ExploreCountryRoomListActivity;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import p255o00ooO0O.oOO00O;
import p581o0oOoOOo.oO0O0O00;
import p581o0oOoOOo.oOo0oooO;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class u3 implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f44335Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f44336OoooO00;

    public /* synthetic */ u3(Object obj, int i) {
        this.f44335Oooo = i;
        this.f44336OoooO00 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f44335Oooo) {
            case 0:
                ExploreCountryRoomListActivity this$0 = (ExploreCountryRoomListActivity) this.f44336OoooO00;
                ExploreCountryRoomListActivity.OooO00o oooO00o = ExploreCountryRoomListActivity.f22816o00O0O;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                LinearLayout linearLayout = this$0.OooOoo().f49290OooO0OO.f50632OooO0OO;
                Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.llCountries.llCountryRoot");
                oOO00O.OooO00o(linearLayout);
                break;
            default:
                oOo0oooO this$1 = (oOo0oooO) this.f44336OoooO00;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                if (StringsKt.trim((CharSequence) this$1.f46231OoooOOo.f50362OooO0OO.getText().toString()).toString().length() >= 10) {
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getIO(), null, new oO0O0O00(this$1, null), 2, null);
                    break;
                }
                break;
        }
    }
}
