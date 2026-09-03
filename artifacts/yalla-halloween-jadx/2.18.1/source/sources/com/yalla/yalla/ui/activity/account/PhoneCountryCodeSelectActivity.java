package com.yalla.yalla.ui.activity.account;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.app.base.model.CountryCodeItemModel;
import com.app.base.model.CountryCodeModel;
import com.app.base.view.HeaderLayout;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.account.PhoneCountryCodeSelectActivity;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p254o00ooO0O.o00O000o;
import p534o0o0OOo0.o0OO000;
import p534o0o0OOo0.o0OO000o;
import p534o0o0OOo0.oo0oO0;
import p617o0oo0o.o00Ooo;
import p649o0ooOOoo.i6;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/ui/activity/account/PhoneCountryCodeSelectActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class PhoneCountryCodeSelectActivity extends BaseActivityK {

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public static final /* synthetic */ int f21808Oooooo = 0;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public TextView f21810Ooooo00;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public int f21814OooooOo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public p188o00o00o0.OooO0OO<CountryCodeItemModel> f21815Oooooo0;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @NotNull
    public final o00O000o f21809OoooOoo = new o00O000o(Reflection.getOrCreateKotlinClass(i6.class), this, null);

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    @NotNull
    public final Lazy f21811Ooooo0o = LazyKt.lazy(new OooO00o());

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    @NotNull
    public final Lazy f21812OooooO0 = LazyKt.lazy(new OooO0O0());

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    @NotNull
    public final Lazy f21813OooooOO = LazyKt.lazy(new OooO0OO());

    public static final class OooO00o extends Lambda implements Function0<o00Ooo> {
        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o00Ooo invoke() {
            return new o00Ooo(PhoneCountryCodeSelectActivity.this);
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<List<CountryCodeItemModel>> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<CountryCodeItemModel> invoke() {
            return ((o00Ooo) PhoneCountryCodeSelectActivity.this.f21811Ooooo0o.getValue()).OooO00o();
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<List<CountryCodeItemModel>> {
        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<CountryCodeItemModel> invoke() {
            List<CountryCodeItemModel> hotCountries;
            o00Ooo o00ooo2 = (o00Ooo) PhoneCountryCodeSelectActivity.this.f21811Ooooo0o.getValue();
            CountryCodeModel countryCodeModelOooO0OO = o00ooo2.OooO0OO(o00ooo2.f48560OooO00o);
            return (countryCodeModelOooO0OO == null || (hotCountries = countryCodeModelOooO0OO.getHotCountries()) == null) ? new ArrayList() : hotCountries;
        }
    }

    public final i6 OooOoo() {
        return (i6) this.f21809OoooOoo.getValue();
    }

    public final List<CountryCodeItemModel> OooOooO() {
        return (List) this.f21812OooooO0.getValue();
    }

    public final List<CountryCodeItemModel> OooOooo() {
        return (List) this.f21813OooooOO.getValue();
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOoo().f49638OooO00o);
        int i = 0;
        if (!OooOooo().isEmpty()) {
            this.f21814OooooOo = OooOooo().size();
            OooOooO().addAll(0, OooOooo());
        }
        OooOo0O(1);
        HeaderLayout headerLayout = this.f11463OoooO;
        if (headerLayout != null) {
            headerLayout.setTitle(R.string.title_select_country);
        }
        OooOoo().f49639OooO0O0.setLayoutManager(new LinearLayoutManager(this));
        OooOoo().f49640OooO0OO.f19541o00O0O = false;
        oo0oO0 oo0oo0 = new oo0oO0(this, OooOooO());
        this.f21815Oooooo0 = oo0oo0;
        oo0oo0.setOnItemChildClickListener(new o0OO000(this, i));
        p188o00o00o0.OooO0OO<CountryCodeItemModel> oooO0OO = this.f21815Oooooo0;
        p188o00o00o0.OooO0OO<CountryCodeItemModel> oooO0OO2 = null;
        if (oooO0OO == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oooO0OO = null;
        }
        oooO0OO.setFirstLoading(false);
        p188o00o00o0.OooO0OO<CountryCodeItemModel> oooO0OO3 = this.f21815Oooooo0;
        if (oooO0OO3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oooO0OO3 = null;
        }
        oooO0OO3.setEmptyText(R.string.No_search_results);
        View viewInflate = View.inflate(this, R.layout.account_activity_country_code_select_head, null);
        View viewFindViewById = viewInflate.findViewById(R.id.etSearch);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "searchHeader.findViewById(R.id.etSearch)");
        this.f21810Ooooo00 = (TextView) viewFindViewById;
        p188o00o00o0.OooO0OO<CountryCodeItemModel> oooO0OO4 = this.f21815Oooooo0;
        if (oooO0OO4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oooO0OO4 = null;
        }
        oooO0OO4.setHeaderView(viewInflate);
        TextView textView = this.f21810Ooooo00;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("etSearch");
            textView = null;
        }
        textView.addTextChangedListener(new o0OO000o(this));
        RecyclerView recyclerView = OooOoo().f49639OooO0O0;
        p188o00o00o0.OooO0OO<CountryCodeItemModel> oooO0OO5 = this.f21815Oooooo0;
        if (oooO0OO5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            oooO0OO2 = oooO0OO5;
        }
        recyclerView.setAdapter(oooO0OO2);
        OooOoo().f49639OooO0O0.setOnTouchListener(new View.OnTouchListener() { // from class: o0o0OOo0.o0O
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                PhoneCountryCodeSelectActivity this$0 = this.f43536Oooo0o;
                int i2 = PhoneCountryCodeSelectActivity.f21808Oooooo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                TextView textView2 = this$0.f21810Ooooo00;
                if (textView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("etSearch");
                    textView2 = null;
                }
                textView2.clearFocus();
                return false;
            }
        });
    }
}
