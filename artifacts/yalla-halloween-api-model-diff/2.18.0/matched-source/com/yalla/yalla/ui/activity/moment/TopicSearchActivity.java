package com.yalla.yalla.ui.activity.moment;

import android.os.Bundle;
import android.text.InputFilter;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.weieyu.yalla.R;
import com.yalla.yalla.model.TopicInfoModel;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.moment.TopicSearchActivity;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import com.yalla.yalla.ui.vm.moment.TopicSearchVM;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p143o00OOooO.o0000O00;
import p143o00OOooO.o0000OO0;
import p143o00OOooO.o000O0;
import p143o00OOooO.o000O00O;
import p160o00OoOO.o00000OO;
import p169o00Ooo0.o000OOo;
import p255o00ooO0O.o00O000o;
import p540o0o0Oo0.oO00000o;
import p540o0o0Oo0.oO0000O;
import p540o0o0Oo0.oO0000o0;
import p651o0ooOOoo.p9;
import p651o0ooOOoo.qc;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/yalla/yalla/ui/activity/moment/TopicSearchActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "onClickNotDouble", "<init>", "()V", "OooO00o", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class TopicSearchActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    @NotNull
    public static final OooO00o f22673OoooooO = new OooO00o();

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    @NotNull
    public final o00O000o f22674OooooO0 = new o00O000o(Reflection.getOrCreateKotlinClass(qc.class), this, null);

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    @NotNull
    public final Lazy f22675OooooOO = LazyKt.lazy(new OooO0OO());

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    @NotNull
    public final Lazy f22676OooooOo = LazyKt.lazy(new OooO0O0());

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f22678Oooooo0 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(TopicSearchVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.moment.TopicSearchActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.activity.moment.TopicSearchActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.activity.moment.TopicSearchActivity$special$$inlined$viewModels$default$3

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ Function0 f22683Oooo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f22683Oooo;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public boolean f22677Oooooo = true;

    public static final class OooO00o {
    }

    public static final class OooO0O0 extends Lambda implements Function0<o00O0O> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o00O0O invoke() {
            return new o00O0O(TopicSearchActivity.this);
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<p9> {
        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final p9 invoke() {
            p9 p9VarInflate = p9.inflate(TopicSearchActivity.this.getLayoutInflater());
            Intrinsics.checkNotNullExpressionValue(p9VarInflate, "inflate(layoutInflater)");
            return p9VarInflate;
        }
    }

    public final p189o00o00o0.OooO0OO<TopicInfoModel> OooOoo() {
        return (p189o00o00o0.OooO0OO) this.f22676OooooOo.getValue();
    }

    public final qc OooOooO() {
        return (qc) this.f22674OooooO0.getValue();
    }

    public final p9 OooOooo() {
        return (p9) this.f22675OooooOO.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final TopicSearchVM Oooo000() {
        return (TopicSearchVM) this.f22678Oooooo0.getValue();
    }

    public final void Oooo00O(String str) {
        if (str == null || StringsKt.isBlank(str)) {
            return;
        }
        this.f22677Oooooo = false;
        Oooo000().saveSearchHistory(str);
        oo0O.OooO oooO = oo0O.OooO.f53334OooO00o;
        ArrayList<String> arrayList = oo0O.OooO.f53335OooO0O0;
        if (arrayList.size() > 5) {
            arrayList.remove(0);
        }
        if (OooOooo().f50297OooO00o.getParent() != null) {
            OooOoo().removeAllHeaderView();
        }
        OooOoo().setNewData(new ArrayList());
        OooOoo().setFirstLoading(true);
        Oooo000().searchTopic(str).observe(this, new o0000OO0(this, 3));
    }

    public final void Oooo00o() {
        this.f22677Oooooo = true;
        Oooo000().getRecommendList().observe(this, new o00000OO(this, 2));
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, o00Oo00.OooO00o
    public void onClickNotDouble(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onClickNotDouble(view);
        switch (view.getId()) {
            case R.id.ivClearHistory /* 2131297603 */:
                Oooo000().clearSearchHistory();
                break;
            case R.id.ivClearTopic /* 2131297604 */:
                OooOooO().f50381OooO0O0.setText("");
                break;
        }
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOooO().f50380OooO00o);
        OooOooO().f50382OooO0OO.setOnClickListener(this);
        EditText editText = OooOooO().f50381OooO0O0;
        Intrinsics.checkNotNullExpressionValue(editText, "binding.etSearch");
        editText.addTextChangedListener(new oO0000O(this));
        OooOooO().f50381OooO0O0.setFilters(new InputFilter[]{new o000OOo(), new InputFilter.LengthFilter(24)});
        OooOooO().f50381OooO0O0.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: o0o0Oo0.o
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                TopicSearchActivity this$0 = this.f43916OooO00o;
                TopicSearchActivity.OooO00o oooO00o = TopicSearchActivity.f22673OoooooO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (i != 3) {
                    return false;
                }
                this$0.Oooo00O(this$0.OooOooO().f50381OooO0O0.getText().toString());
                return true;
            }
        });
        OooOooO().f50383OooO0Oo.setLayoutManager(new FixLinearLayoutManager(this));
        OooOoo().setOnItemClickListener(new oO00000o(this, 0));
        OooOoo().setOnItemChildClickListener(new o000O0(this));
        OooOoo().setLoadErrorClickListener(new oO0000o0(this));
        OooOoo().setEmptyImageRes(R.drawable.ic_empty_search);
        OooOoo().setEmptyText(R.string.No_search_results);
        OooOooO().f50383OooO0Oo.setAdapter(OooOoo());
        OooOooo().f50300OooO0Oo.setOnClickListener(this);
        OooOooO().f50384OooO0o0.setOnTouchDownListener(new o000O00O(this));
        Oooo00o();
        Oooo000().loadSearchRecommendTopic();
        Oooo000().getSearchHistory().observe(this, new o0000O00(this, 4));
        Oooo000().statisticalTime();
    }

    @Override // com.yalla.yalla.ui.activity.BaseActivityK, com.app.base.base.activity.BaseFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        Oooo000().statisticalTime();
    }
}
