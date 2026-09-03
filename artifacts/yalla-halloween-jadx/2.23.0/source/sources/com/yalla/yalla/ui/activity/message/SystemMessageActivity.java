package com.yalla.yalla.ui.activity.message;

import android.app.NotificationManager;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.user.BadgeActivity;
import com.yalla.yalla.ui.view.HeaderLayout;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p574o0oOoOOo.oO;
import p574o0oOoOOo.oOO00000;
import p579o0oOoo.oOO0OOO;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p641o0ooOOOO.x4;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/ui/activity/message/SystemMessageActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSystemMessageActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SystemMessageActivity.kt\ncom/yalla/yalla/ui/activity/message/SystemMessageActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,356:1\n22#2,2:357\n75#3,13:359\n1#4:372\n*S KotlinDebug\n*F\n+ 1 SystemMessageActivity.kt\ncom/yalla/yalla/ui/activity/message/SystemMessageActivity\n*L\n66#1:357,2\n68#1:359,13\n*E\n"})
public final class SystemMessageActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final /* synthetic */ int f25764OooOo0o = 0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final com.code.android.util.o000O0Oo f25765OooOOoo = new com.code.android.util.o000O0Oo(Reflection.getOrCreateKotlinClass(x4.class), this, null);

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f25766OooOo0 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(oO.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.message.SystemMessageActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.activity.message.SystemMessageActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.activity.message.SystemMessageActivity$special$$inlined$viewModels$default$3

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0 f25772OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f25772OooO0Oo;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public com.yalla.yalla.ui.adapter.o00 f25767OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @Nullable
    public TextView f25768OooOo0O;

    public static final class OooO00o implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f25769OooO0Oo;

        public OooO00o(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f25769OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f25769OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f25769OooO0Oo;
        }

        public final int hashCode() {
            return this.f25769OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f25769OooO0Oo.invoke(obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void OooOo(SystemMessageActivity context, boolean z) {
        context.getClass();
        p464o0Oooo.o000000O o000000o2 = p464o0Oooo.o000000O.f46674OooO00o;
        Long l = (Long) p464o0Oooo.o000000O.OooOOo0().getValue();
        if (l == null) {
            l = 0L;
        }
        long jLongValue = l.longValue();
        String userName = (String) p464o0Oooo.o000000O.OooOOoo().getValue();
        if (userName == null) {
            userName = "";
        }
        String userImageUrl = (String) p464o0Oooo.o000000O.OooO().getValue();
        if (userImageUrl == null) {
            userImageUrl = "";
        }
        String str = (String) p464o0Oooo.o000000O.OooOO0O().getValue();
        String medal = str != null ? str : "";
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(userName, "userName");
        Intrinsics.checkNotNullParameter(userImageUrl, "userImageUrl");
        Intrinsics.checkNotNullParameter(medal, "medal");
        Intent intent = new Intent(context, (Class<?>) BadgeActivity.class);
        intent.putExtra("USER_ID", jLongValue);
        intent.putExtra("USER_NAME", userName);
        intent.putExtra("USER_IMAGE_URL", userImageUrl);
        intent.putExtra("USER_MEDAL", medal);
        intent.putExtra("IS_HONOR", z);
        context.startActivity(intent);
    }

    public final x4 OooOoO0() {
        return (x4) this.f25765OooOOoo.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        TextView textViewOooOoO0;
        super.onCreate(bundle);
        setContentView(OooOoO0().f59269OooO00o);
        p587o0oOooo.o0OO000.OooO00o("204002");
        OooOOoo(oO00OOo0.subscription_service);
        HeaderLayout headerLayout = this.f22755OooOO0;
        com.yalla.yalla.ui.adapter.o00 o00Var = null;
        if (headerLayout == null || (textViewOooOoO0 = headerLayout.OooOoO0(oO00OOo0.Clear, new o0O00(this))) == null) {
            textViewOooOoO0 = null;
        } else {
            com.code.android.util.o000OO00.OooO0O0(textViewOooOoO0);
        }
        this.f25768OooOo0O = textViewOooOoO0;
        OooOoO0().f59271OooO0OO.setEmptyText(com.code.android.util.o0000.OooO0OO(oO00OOo0.blank_no_system_msg));
        OooOoO0().f59271OooO0OO.setEmptyImage(oOo00OO0.ic_empty_message_system);
        this.f25767OooOo00 = new com.yalla.yalla.ui.adapter.o00(this);
        FixLinearLayoutManager fixLinearLayoutManager = new FixLinearLayoutManager(this);
        fixLinearLayoutManager.setReverseLayout(true);
        OooOoO0().f59270OooO0O0.setLayoutManager(fixLinearLayoutManager);
        RecyclerView recyclerView = OooOoO0().f59270OooO0O0;
        com.yalla.yalla.ui.adapter.o00 o00Var2 = this.f25767OooOo00;
        if (o00Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            o00Var2 = null;
        }
        recyclerView.setAdapter(o00Var2);
        RecyclerView recyclerView2 = OooOoO0().f59270OooO0O0;
        Intrinsics.checkNotNullExpressionValue(recyclerView2, "binding.rvSystemMessage");
        oOO0OOO.OooO00o(recyclerView2);
        com.yalla.yalla.ui.adapter.o00 o00Var3 = this.f25767OooOo00;
        if (o00Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            o00Var = o00Var3;
        }
        o0O00O listener = new o0O00O(this);
        o00Var.getClass();
        Intrinsics.checkNotNullParameter(listener, "listener");
        o00Var.f44446OooOO0O = listener;
        ViewModelLazy viewModelLazy = this.f25766OooOo0;
        ((oO) viewModelLazy.getValue()).f56316OooO00o.observe(this, new OooO00o(new o0OoOoOo(this)));
        ((oO) viewModelLazy.getValue()).f56317OooO0O0.observe(this, new OooO00o(new o0O000o0(this)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
        oO oOVar = (oO) this.f25766OooOo0.getValue();
        oOVar.getClass();
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(oOVar), Dispatchers.getIO(), null, new oOO00000(null), 2, null);
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        Intrinsics.checkNotNullParameter("Yalla_Notice_Syatem", ViewHierarchyConstants.TAG_KEY);
        Object systemService = com.code.android.util.o000O0.OooO00o().getSystemService("notification");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        ((NotificationManager) systemService).cancel("Yalla_Notice_Syatem", 0);
    }
}
