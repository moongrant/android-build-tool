package com.yalla.yalla.ui.activity.message;

import android.R;
import android.app.NotificationManager;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.yalla.yalla.data.db.table.YallaTeamMessage;
import com.yalla.yalla.model.YallaTeamFeedbackType;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.view.HeaderLayout;
import com.yalla.yalla.ui.vm.message.YallaTeamVM;
import java.util.ArrayList;
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
import p579o0oOoo.oOO0OOO;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OOo0;
import p641o0ooOOOO.y4;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/ui/activity/message/YallaTeamMessageActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nYallaTeamMessageActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 YallaTeamMessageActivity.kt\ncom/yalla/yalla/ui/activity/message/YallaTeamMessageActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,437:1\n22#2,2:438\n75#3,13:440\n*S KotlinDebug\n*F\n+ 1 YallaTeamMessageActivity.kt\ncom/yalla/yalla/ui/activity/message/YallaTeamMessageActivity\n*L\n71#1:438,2\n72#1:440,13\n*E\n"})
public final class YallaTeamMessageActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public static final /* synthetic */ int f25774OooOoo0 = 0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @Nullable
    public com.yalla.yalla.ui.adapter.oo0o0O0 f25776OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public boolean f25777OooOo0;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @Nullable
    public TextView f25779OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @Nullable
    public com.yalla.yalla.ui.adapter.o00O00o0 f25780OooOo0o;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public boolean f25783OooOoOO;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final com.code.android.util.o000O0Oo f25775OooOOoo = new com.code.android.util.o000O0Oo(Reflection.getOrCreateKotlinClass(y4.class), this, null);

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f25778OooOo00 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(YallaTeamVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.message.YallaTeamMessageActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.activity.message.YallaTeamMessageActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.activity.message.YallaTeamMessageActivity$special$$inlined$viewModels$default$3

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0 f25787OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f25787OooO0Oo;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public boolean f25782OooOoO0 = true;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    @NotNull
    public final MutableState<String> f25781OooOoO = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);

    public static final class OooO00o implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f25784OooO0Oo;

        public OooO00o(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f25784OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f25784OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f25784OooO0Oo;
        }

        public final int hashCode() {
            return this.f25784OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f25784OooO0Oo.invoke(obj);
        }
    }

    public final y4 OooOo() {
        return (y4) this.f25775OooOOoo.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final YallaTeamVM OooOoO0() {
        return (YallaTeamVM) this.f25778OooOo00.getValue();
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOo().f59384OooO00o);
        p587o0oOooo.o0OO000.OooO00o("204004");
        OooOOoo(oO00OOo0.YallaTeamActivity_item_YallaTeam);
        HeaderLayout headerLayout = this.f22755OooOO0;
        this.f25779OooOo0O = headerLayout != null ? headerLayout.OooOoO0(oO00OOo0.Clear, new o0O00oO0(this)) : null;
        OooOoO0().getMessageCount().observe(this, new OooO00o(new o0O0O0O(this)));
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setReverseLayout(true);
        OooOo().f59386OooO0OO.setLayoutManager(linearLayoutManager);
        com.yalla.yalla.ui.adapter.o00O00o0 o00o00o1 = new com.yalla.yalla.ui.adapter.o00O00o0();
        this.f25780OooOo0o = o00o00o1;
        p143o00Oo000.OooO0o<Integer, YallaTeamMessage> pagerSource = OooOoO0().getYallaTeamMessage();
        Intrinsics.checkNotNullParameter(pagerSource, "pagerSource");
        BuildersKt__Builders_commonKt.launch$default(pagerSource.f37676OooO00o, Dispatchers.getIO(), null, new p400o0Oo0OO.OooOOO0(pagerSource, o00o00o1, null), 2, null);
        com.yalla.yalla.ui.adapter.o00O00o0 o00o00o2 = this.f25780OooOo0o;
        if (o00o00o2 != null) {
            o00o00o2.f27618OooOOo0 = new o0oO0O0o(this);
        }
        com.yalla.yalla.ui.adapter.o00O00o0 o00o00o3 = this.f25780OooOo0o;
        if (o00o00o3 != null) {
            o00o00o3.f27617OooOOo = new o0O0oo0o(this);
        }
        com.yalla.yalla.ui.adapter.o00O00o0 o00o00o4 = this.f25780OooOo0o;
        if (o00o00o4 != null) {
            o00o00o4.f27619OooOOoo = new o0O0O0Oo(this);
        }
        com.yalla.yalla.ui.adapter.o00O00o0 o00o00o5 = this.f25780OooOo0o;
        if (o00o00o5 != null) {
            o00o00o5.OooO0o0(new o0O0O0o0(this));
        }
        com.yalla.yalla.ui.adapter.o00O00o0 o00o00o6 = this.f25780OooOo0o;
        if (o00o00o6 != null) {
            o00o00o6.f27620OooOo00 = new o0O0OOO0(this);
        }
        com.yalla.yalla.ui.adapter.o00O00o0 o00o00o7 = this.f25780OooOo0o;
        if (o00o00o7 != null) {
            o0O0OOOo listener = new o0O0OOOo(this);
            Intrinsics.checkNotNullParameter(listener, "listener");
            o00o00o7.f44447OooOO0o = listener;
        }
        com.yalla.yalla.ui.adapter.o00O00o0 o00o00o8 = this.f25780OooOo0o;
        if (o00o00o8 != null) {
            o00o00o8.OooO0Oo(oO00O0oO.ivHeader);
        }
        com.yalla.yalla.ui.adapter.o00O00o0 o00o00o9 = this.f25780OooOo0o;
        if (o00o00o9 != null) {
            o0O0o000 listener2 = new o0O0o000(this);
            Intrinsics.checkNotNullParameter(listener2, "listener");
            o00o00o9.f44448OooOOO = listener2;
        }
        com.yalla.yalla.ui.adapter.o00O00o0 o00o00o10 = this.f25780OooOo0o;
        if (o00o00o10 != null) {
            int[] viewIds = {oO00O0oO.tvContent};
            Intrinsics.checkNotNullParameter(viewIds, "viewIds");
            o00o00o10.f44451OooOOOo.add(Integer.valueOf(viewIds[0]));
        }
        OooOo().f59386OooO0OO.addOnScrollListener(new o0oO0Ooo(this));
        OooOo().f59386OooO0OO.setAdapter(this.f25780OooOo0o);
        RecyclerView recyclerView = OooOo().f59386OooO0OO;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "binding.rvMessage");
        oOO0OOO.OooO0O0(recyclerView, (15 & 1) != 0 ? 100L : 0L, 0L, (15 & 4) != 0 ? 100L : 0L, (15 & 8) != 0 ? 100L : 0L);
        ArrayList arrayList = new ArrayList();
        String strOooO0OO = com.code.android.util.o0000.OooO0OO(oO00OOo0.app_problems);
        YallaTeamFeedbackType.Companion companion = YallaTeamFeedbackType.INSTANCE;
        arrayList.add(new YallaTeamFeedbackType(strOooO0OO, companion.getAppProblems()));
        arrayList.add(new YallaTeamFeedbackType(com.code.android.util.o0000.OooO0OO(oO00OOo0.suggest_new_features), companion.getSuggestions()));
        arrayList.add(new YallaTeamFeedbackType(com.code.android.util.o0000.OooO0OO(oO00OOo0.contribute_crazy_words), companion.getRecharge()));
        arrayList.add(new YallaTeamFeedbackType(com.code.android.util.o0000.OooO0OO(oO00OOo0.Others), companion.getOthers()));
        OooOo().f59387OooO0Oo.setLayoutManager(new LinearLayoutManager(this, 0, false));
        com.yalla.yalla.ui.adapter.oo0o0O0 oo0o0o0 = new com.yalla.yalla.ui.adapter.oo0o0O0(this, arrayList);
        this.f25776OooOo = oo0o0o0;
        oo0o0o0.f10098OooO0o = new p198o00o0OoO.o00O0O0(this);
        OooOo().f59387OooO0Oo.setAdapter(this.f25776OooOo);
        OooOo().f59386OooO0OO.setOnTouchListener(new View.OnTouchListener() { // from class: com.yalla.yalla.ui.activity.message.o0O00OO
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                int i = YallaTeamMessageActivity.f25774OooOoo0;
                YallaTeamMessageActivity activity = this.f25935OooO0Oo;
                Intrinsics.checkNotNullParameter(activity, "this$0");
                if (motionEvent.getAction() == 0) {
                    Intrinsics.checkNotNullParameter(activity, "activity");
                    Object systemService = activity.getSystemService("input_method");
                    Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                    ((InputMethodManager) systemService).hideSoftInputFromWindow(activity.findViewById(R.id.content).getWindowToken(), 0);
                }
                return false;
            }
        });
        ComposeView composeView = OooOo().f59385OooO0O0;
        Intrinsics.checkNotNullExpressionValue(composeView, "binding.bottomComposeView");
        p147o00Oo0Oo.o000OOo.OooO0Oo(composeView, ComposableLambdaKt.composableLambdaInstance(-942062684, true, new o0O00o00(this)));
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        Intrinsics.checkNotNullParameter("Yalla_Notice_YallaTeam", ViewHierarchyConstants.TAG_KEY);
        Object systemService = com.code.android.util.o000O0.OooO00o().getSystemService("notification");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        ((NotificationManager) systemService).cancel("Yalla_Notice_YallaTeam", 0);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        super.onStop();
        OooOoO0().updateAllMessageStateRead();
    }
}
