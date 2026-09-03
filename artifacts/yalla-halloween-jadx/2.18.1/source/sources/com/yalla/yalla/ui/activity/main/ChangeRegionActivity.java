package com.yalla.yalla.ui.activity.main;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.app.base.base.activity.BaseActivity;
import com.app.base.view.HeaderLayout;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.manager.RoomState;
import com.yalla.yalla.common.manager.RoomStateManager;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p254o00ooO0O.o000O0O0;
import p498o0o00Oo0.OooOOO;
import p535o0o0OOoO.oO0OO00o;
import p535o0o0OOoO.oOo0000O;
import p535o0o0OOoO.oOo000Oo;
import p707oOooo0o.o000O;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/yalla/yalla/ui/activity/main/ChangeRegionActivity;", "Lcom/app/base/base/activity/BaseActivity;", "<init>", "()V", "OooO00o", "OooO0O0", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class ChangeRegionActivity extends BaseActivity {

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    @NotNull
    public static final OooO00o f21932OooooOo = new OooO00o();

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public RecyclerView f21934OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public int f21935OoooOoo;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public p188o00o00o0.OooO0OO<OooO0O0> f21937Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    @Nullable
    public o000O f21938OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    @Nullable
    public TextView f21939OooooOO;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    @NotNull
    public final Lazy f21933OoooOo0 = LazyKt.lazy(new OooO0OO());

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public int f21936Ooooo00 = -1;

    public static final class OooO00o {
    }

    @StabilityInferred(parameters = 0)
    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public String f21940OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f21941OooO0O0;

        public OooO0O0(@NotNull String name, int i) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.f21940OooO00o = name;
            this.f21941OooO0O0 = i;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<ArrayList<OooO0O0>> {
        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ArrayList<OooO0O0> invoke() {
            ArrayList<OooO0O0> arrayList = new ArrayList<>();
            ChangeRegionActivity changeRegionActivity = ChangeRegionActivity.this;
            String string = changeRegionActivity.getString(R.string.single_language_English);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.single_language_English)");
            arrayList.add(new OooO0O0(string, 0));
            String string2 = changeRegionActivity.getString(R.string.single_language_Arabic);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.single_language_Arabic)");
            arrayList.add(new OooO0O0(string2, 1));
            String string3 = changeRegionActivity.getString(R.string.single_language_Turkish);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(R.string.single_language_Turkish)");
            arrayList.add(new OooO0O0(string3, 2));
            String string4 = changeRegionActivity.getString(R.string.single_language_Indonesia);
            Intrinsics.checkNotNullExpressionValue(string4, "getString(R.string.single_language_Indonesia)");
            arrayList.add(new OooO0O0(string4, 3));
            String string5 = changeRegionActivity.getString(R.string.single_language_Portugal);
            Intrinsics.checkNotNullExpressionValue(string5, "getString(R.string.single_language_Portugal)");
            arrayList.add(new OooO0O0(string5, 5));
            String string6 = changeRegionActivity.getString(R.string.single_language_Espana);
            Intrinsics.checkNotNullExpressionValue(string6, "getString(R.string.single_language_Espana)");
            arrayList.add(new OooO0O0(string6, 6));
            String string7 = changeRegionActivity.getString(R.string.single_language_Hindi);
            Intrinsics.checkNotNullExpressionValue(string7, "getString(R.string.single_language_Hindi)");
            arrayList.add(new OooO0O0(string7, 7));
            String string8 = changeRegionActivity.getString(R.string.single_language_Urdu);
            Intrinsics.checkNotNullExpressionValue(string8, "getString(R.string.single_language_Urdu)");
            arrayList.add(new OooO0O0(string8, 8));
            return arrayList;
        }
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity
    public final void OooOOo0() {
    }

    public final void OooOoO() {
        int i = this.f21936Ooooo00;
        if (i == -1 || this.f21935OoooOoo == i) {
            TextView textView = this.f21939OooooOO;
            Intrinsics.checkNotNull(textView);
            textView.setEnabled(false);
            TextView textView2 = this.f21939OooooOO;
            Intrinsics.checkNotNull(textView2);
            textView2.setTextColor(o000O0O0.OooO00o(R.color.color_alpha_38));
            return;
        }
        TextView textView3 = this.f21939OooooOO;
        Intrinsics.checkNotNull(textView3);
        textView3.setEnabled(true);
        TextView textView4 = this.f21939OooooOO;
        Intrinsics.checkNotNull(textView4);
        textView4.setTextColor(o000O0O0.OooO00o(R.color.color_00d8c9));
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_change_regoin);
        Integer value = OooOOO.f41216OooO00o.OooOOO().getValue();
        int i = 0;
        this.f21935OoooOoo = value == null ? 0 : value.intValue();
        OooOo(R.string.Change_Language);
        OooOo0O(1);
        HeaderLayout headerLayout = this.f11463OoooO;
        p188o00o00o0.OooO0OO<OooO0O0> oooO0OO = null;
        this.f21939OooooOO = headerLayout != null ? headerLayout.OooOoo0(R.string.Save, new oOo000Oo(this)) : null;
        OooOoO();
        View viewFindViewById = findViewById(R.id.rvChangeRegion);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(R.id.rvChangeRegion)");
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        this.f21934OoooOoO = recyclerView;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRvChangeRegion");
            recyclerView = null;
        }
        recyclerView.setLayoutManager(new FixLinearLayoutManager(this));
        this.f21937Ooooo0o = new oOo0000O(this, (ArrayList) this.f21933OoooOo0.getValue());
        if (RoomStateManager.INSTANCE.getRoomState() == RoomState.Hook) {
            View viewInflate = View.inflate(this, R.layout.change_region_hookroon_tips, null);
            p188o00o00o0.OooO0OO<OooO0O0> oooO0OO2 = this.f21937Ooooo0o;
            if (oooO0OO2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("baseAdapter");
                oooO0OO2 = null;
            }
            oooO0OO2.setHeaderView(viewInflate);
        }
        p188o00o00o0.OooO0OO<OooO0O0> oooO0OO3 = this.f21937Ooooo0o;
        if (oooO0OO3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("baseAdapter");
            oooO0OO3 = null;
        }
        oooO0OO3.setOnItemClickListener(new oO0OO00o(this, i));
        RecyclerView recyclerView2 = this.f21934OoooOoO;
        if (recyclerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRvChangeRegion");
            recyclerView2 = null;
        }
        p188o00o00o0.OooO0OO<OooO0O0> oooO0OO4 = this.f21937Ooooo0o;
        if (oooO0OO4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("baseAdapter");
        } else {
            oooO0OO = oooO0OO4;
        }
        recyclerView2.setAdapter(oooO0OO);
    }

    @Override // android.app.Activity
    public final void recreate() {
    }
}
