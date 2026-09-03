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
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/ui/activity/room/CountryTagActivity;", "Lcom/yalla/yalla/base/activity/BaseFragmentActivity;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
public final class CountryTagActivity extends BaseFragmentActivity {

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public static final /* synthetic */ int f26492OooOo0O = 0;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public RecyclerView f26494OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public boolean f26495OooOOoo;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public boolean f26497OooOo00;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NotNull
    public final RecAdapterCountries f26493OooOOo = new RecAdapterCountries();

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @NotNull
    public final p203o00o0o0o.o000OOo0 f26496OooOo0 = new p203o00o0o0o.o000OOo0(this);

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(oO00OO0O.activity_country);
        this.f26495OooOOoo = getIntent().getBooleanExtra("FromMainactivity", false);
        this.f26497OooOo00 = getIntent().getBooleanExtra("fromcreatbar", false);
        HeaderLayout headerLayout = this.f22755OooOO0;
        if (headerLayout != null) {
            headerLayout.setTitle(oO00OOo0.countries);
        }
        View viewFindViewById = findViewById(oO00O0oO.rec_country);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(R.id.rec_country)");
        this.f26494OooOOo0 = (RecyclerView) viewFindViewById;
        RecAdapterCountries recAdapterCountries = this.f26493OooOOo;
        recAdapterCountries.f27446OooO0O0 = this.f26496OooOo0;
        FixGridLayoutManager fixGridLayoutManager = new FixGridLayoutManager(this, 3);
        RecyclerView recyclerView = this.f26494OooOOo0;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recCountry");
            recyclerView = null;
        }
        recyclerView.setLayoutManager(fixGridLayoutManager);
        RecyclerView recyclerView2 = this.f26494OooOOo0;
        if (recyclerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recCountry");
            recyclerView2 = null;
        }
        recyclerView2.setAdapter(recAdapterCountries);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new CountryTagActivity$initData$1(this, null), 3, null);
    }
}
