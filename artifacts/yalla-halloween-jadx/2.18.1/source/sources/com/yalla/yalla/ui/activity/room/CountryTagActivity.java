package com.yalla.yalla.ui.activity.room;

import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import com.app.base.base.activity.BaseActivity;
import com.app.base.view.HeaderLayout;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.view.materialdesign.FixGridLayoutManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/ui/activity/room/CountryTagActivity;", "Lcom/app/base/base/activity/BaseActivity;", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class CountryTagActivity extends BaseActivity {

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public static final /* synthetic */ int f22764OooooO0 = 0;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public RecyclerView f22765OoooOo0;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public boolean f22767OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public boolean f22768Ooooo00;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    @NotNull
    public p133o00OO00o.OooOOO0 f22766OoooOoO = new p133o00OO00o.OooOOO0();

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    @NotNull
    public p142o00OOooO.OooOOO f22769Ooooo0o = new p142o00OOooO.OooOOO(this, 5);

    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_country);
        this.f22767OoooOoo = getIntent().getBooleanExtra("FromMainactivity", false);
        this.f22768Ooooo00 = getIntent().getBooleanExtra("fromcreatbar", false);
        HeaderLayout headerLayout = this.f11463OoooO;
        if (headerLayout != null) {
            headerLayout.setTitle(R.string.countries);
        }
        View viewFindViewById = findViewById(R.id.rec_country);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(R.id.rec_country)");
        this.f22765OoooOo0 = (RecyclerView) viewFindViewById;
        this.f22766OoooOoO.f31218OooO0O0 = this.f22769Ooooo0o;
        FixGridLayoutManager fixGridLayoutManager = new FixGridLayoutManager(this, 3);
        RecyclerView recyclerView = this.f22765OoooOo0;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recCountry");
            recyclerView = null;
        }
        recyclerView.setLayoutManager(fixGridLayoutManager);
        RecyclerView recyclerView2 = this.f22765OoooOo0;
        if (recyclerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recCountry");
            recyclerView2 = null;
        }
        recyclerView2.setAdapter(this.f22766OoooOoO);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new CountryTagActivity$initData$1(this, null), 3, null);
    }
}
