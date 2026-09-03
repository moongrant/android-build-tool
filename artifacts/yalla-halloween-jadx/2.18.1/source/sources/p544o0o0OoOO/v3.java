package p544o0o0OoOO;

import android.view.View;
import android.widget.LinearLayout;
import com.yalla.yalla.ui.activity.room.ExploreCountryRoomListActivity;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import p254o00ooO0O.oOO00O;
import p579o0oOoOOo.oO0O0O0o;
import p579o0oOoOOo.oO0O0Oo0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class v3 implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f44326Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Object f44327Oooo0oO;

    public /* synthetic */ v3(Object obj, int i) {
        this.f44326Oooo0o = i;
        this.f44327Oooo0oO = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f44326Oooo0o) {
            case 0:
                ExploreCountryRoomListActivity this$0 = (ExploreCountryRoomListActivity) this.f44327Oooo0oO;
                ExploreCountryRoomListActivity.OooO00o oooO00o = ExploreCountryRoomListActivity.f22797Ooooooo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                LinearLayout linearLayout = this$0.OooOoo().f49353OooO0OO.f50695OooO0OO;
                Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.llCountries.llCountryRoot");
                oOO00O.OooO00o(linearLayout);
                break;
            default:
                oO0O0Oo0 this$1 = (oO0O0Oo0) this.f44327Oooo0oO;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                if (StringsKt.trim((CharSequence) this$1.f46059OoooOO0.f50425OooO0OO.getText().toString()).toString().length() >= 10) {
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getIO(), null, new oO0O0O0o(this$1, null), 2, null);
                    break;
                }
                break;
        }
    }
}
