package com.yalla.yalla.ui.activity.room;

import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import com.yalla.yalla.base.activity.BaseFragmentActivity;
import com.yalla.yalla.ui.adapter.RecAdapterCountries;
import com.yalla.yalla.ui.view.HeaderLayout;
import com.yalla.yalla.ui.view.materialdesign.FixGridLayoutManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/ui/activity/room/CountryTagActivity;", "Lcom/yalla/yalla/base/activity/BaseFragmentActivity;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
public final class CountryTagActivity extends BaseFragmentActivity {

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public static final /* synthetic */ int f26040OooOo0O = 0;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public RecyclerView f26042OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public boolean f26043OooOOoo;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public boolean f26045OooOo00;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NotNull
    public final RecAdapterCountries f26041OooOOo = new RecAdapterCountries();

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @NotNull
    public final p350o0OOOOoo.o0OOO0o f26044OooOo0 = new p350o0OOOOoo.o0OOO0o(this);

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(p562o0oOo000.oo0o0Oo.activity_country);
        this.f26043OooOOoo = getIntent().getBooleanExtra("FromMainactivity", false);
        this.f26045OooOo00 = getIntent().getBooleanExtra("fromcreatbar", false);
        HeaderLayout headerLayout = this.f22282OooOO0;
        if (headerLayout != null) {
            headerLayout.setTitle(p562o0oOo000.o000000.countries);
        }
        View viewFindViewById = findViewById(p562o0oOo000.o0OO00O.rec_country);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f26042OooOOo0 = (RecyclerView) viewFindViewById;
        RecAdapterCountries recAdapterCountries = this.f26041OooOOo;
        recAdapterCountries.f26981OooO0O0 = this.f26044OooOo0;
        FixGridLayoutManager fixGridLayoutManager = new FixGridLayoutManager(this, 3);
        RecyclerView recyclerView = this.f26042OooOOo0;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recCountry");
            recyclerView = null;
        }
        recyclerView.setLayoutManager(fixGridLayoutManager);
        RecyclerView recyclerView2 = this.f26042OooOOo0;
        if (recyclerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recCountry");
            recyclerView2 = null;
        }
        recyclerView2.setAdapter(recAdapterCountries);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new CountryTagActivity$initData$1(this, null), 3, null);
    }
}
