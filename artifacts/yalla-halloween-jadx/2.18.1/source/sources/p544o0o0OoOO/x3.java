package p544o0o0OoOO;

import android.view.View;
import android.widget.LinearLayout;
import com.app.base.model.CountryModel;
import com.yalla.support.common.util.OooOOO0;
import com.yalla.support.common.util.OooOo00;
import com.yalla.yalla.ui.activity.room.ExploreCountryRoomListActivity;
import com.yalla.yalla.ui.view.materialdesign.MaxHeightFixGridLayoutManager;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p188o00o00o0.OooO0OO;
import p189o00o00oO.o0OO00O;
import p254o00ooO0O.oOO00O;

/* JADX INFO: loaded from: classes2.dex */
public final class x3 extends OooOOO0 {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ ExploreCountryRoomListActivity f44340Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3(ExploreCountryRoomListActivity exploreCountryRoomListActivity) {
        super(0L, 1, null);
        this.f44340Oooo0o = exploreCountryRoomListActivity;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<com.app.base.model.CountryModel>] */
    @Override // com.yalla.support.common.util.OooOOO0
    public final void onNoDoubleClick(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ExploreCountryRoomListActivity exploreCountryRoomListActivity = this.f44340Oooo0o;
        if (exploreCountryRoomListActivity.f22800Ooooo0o.size() == 0) {
            return;
        }
        if (exploreCountryRoomListActivity.f22803OooooOo == null) {
            z3 z3Var = new z3(exploreCountryRoomListActivity);
            exploreCountryRoomListActivity.f22803OooooOo = z3Var;
            z3Var.setOnItemClickListener(new o0OO00O(exploreCountryRoomListActivity, 3));
            int i = 0;
            exploreCountryRoomListActivity.OooOoo().f49353OooO0OO.f50695OooO0OO.setOnClickListener(new v3(exploreCountryRoomListActivity, i));
            exploreCountryRoomListActivity.OooOoo().f49353OooO0OO.f50696OooO0Oo.setLayoutManager(new MaxHeightFixGridLayoutManager(exploreCountryRoomListActivity));
            exploreCountryRoomListActivity.OooOoo().f49353OooO0OO.f50696OooO0Oo.addItemDecoration(new ExploreCountryRoomListActivity.OooO0O0(OooOo00.OooO00o(4), OooOo00.OooO00o(8)));
            exploreCountryRoomListActivity.OooOoo().f49353OooO0OO.f50696OooO0Oo.setAdapter(exploreCountryRoomListActivity.f22803OooooOo);
            exploreCountryRoomListActivity.OooOoo().f49353OooO0OO.f50694OooO0O0.setOnClickListener(new u3(exploreCountryRoomListActivity, i));
        }
        OooO0OO<CountryModel> oooO0OO = exploreCountryRoomListActivity.f22803OooooOo;
        if (oooO0OO != null) {
            oooO0OO.setNewData(exploreCountryRoomListActivity.f22800Ooooo0o);
        }
        LinearLayout linearLayout = exploreCountryRoomListActivity.OooOoo().f49353OooO0OO.f50695OooO0OO;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.llCountries.llCountryRoot");
        oOO00O.OooO(linearLayout);
    }
}
