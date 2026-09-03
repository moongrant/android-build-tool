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
import p405o0Oo0OOO.oOo00ooO;
import p590o0oOooo0.l0;
import p643o0ooOOOO.i3;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/ui/activity/message/YallaTeamMessageActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nYallaTeamMessageActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 YallaTeamMessageActivity.kt\ncom/yalla/yalla/ui/activity/message/YallaTeamMessageActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,442:1\n22#2,2:443\n75#3,13:445\n*S KotlinDebug\n*F\n+ 1 YallaTeamMessageActivity.kt\ncom/yalla/yalla/ui/activity/message/YallaTeamMessageActivity\n*L\n72#1:443,2\n73#1:445,13\n*E\n"})
public final class YallaTeamMessageActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public static final /* synthetic */ int f25319OooOoo0 = 0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @Nullable
    public com.yalla.yalla.ui.adapter.oo0oOO0 f25321OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public boolean f25322OooOo0;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @Nullable
    public TextView f25324OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @Nullable
    public com.yalla.yalla.ui.adapter.o00O0O00 f25325OooOo0o;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public boolean f25328OooOoOO;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final com.code.android.util.o000O0 f25320OooOOoo = new com.code.android.util.o000O0(Reflection.getOrCreateKotlinClass(oOo00ooO.class), this, null);

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f25323OooOo00 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(YallaTeamVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.message.YallaTeamMessageActivity$special$$inlined$viewModels$default$2
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
        public final /* synthetic */ Function0 f25332OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f25332OooO0Oo;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public boolean f25327OooOoO0 = true;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    @NotNull
    public final MutableState<String> f25326OooOoO = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);

    public static final class OooO00o implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f25329OooO0Oo;

        public OooO00o(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f25329OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f25329OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f25329OooO0Oo;
        }

        public final int hashCode() {
            return this.f25329OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f25329OooO0Oo.invoke(obj);
        }
    }

    public final oOo00ooO OooOo() {
        return (oOo00ooO) this.f25320OooOOoo.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final YallaTeamVM OooOoO0() {
        return (YallaTeamVM) this.f25323OooOo00.getValue();
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOo().f45223OooO00o);
        o0oo0000.OooO00o.OooO0O0("204004");
        OooOOoo(p562o0oOo000.o000000.YallaTeamActivity_item_YallaTeam);
        HeaderLayout headerLayout = this.f22282OooOO0;
        this.f25324OooOo0O = headerLayout != null ? headerLayout.OooOoO0(p562o0oOo000.o000000.Clear, new o0O00oO0(this)) : null;
        OooOoO0().getMessageCount().observe(this, new OooO00o(new o0O0O0O(this)));
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setReverseLayout(true);
        OooOo().f45225OooO0OO.setLayoutManager(linearLayoutManager);
        com.yalla.yalla.ui.adapter.o00O0O00 o00o0o01 = new com.yalla.yalla.ui.adapter.o00O0O00();
        this.f25325OooOo0o = o00o0o01;
        p188o00o00oO.o000O0o<Integer, YallaTeamMessage> pagerSource = OooOoO0().getYallaTeamMessage();
        Intrinsics.checkNotNullParameter(pagerSource, "pagerSource");
        BuildersKt__Builders_commonKt.launch$default(pagerSource.f38510OooO00o, Dispatchers.getIO(), null, new i3(pagerSource, o00o0o01, null), 2, null);
        com.yalla.yalla.ui.adapter.o00O0O00 o00o0o02 = this.f25325OooOo0o;
        if (o00o0o02 != null) {
            o00o0o02.f27140OooOOo0 = new o0oO0O0o(this);
        }
        com.yalla.yalla.ui.adapter.o00O0O00 o00o0o03 = this.f25325OooOo0o;
        if (o00o0o03 != null) {
            o00o0o03.f27139OooOOo = new o0O0oo0o(this);
        }
        com.yalla.yalla.ui.adapter.o00O0O00 o00o0o04 = this.f25325OooOo0o;
        if (o00o0o04 != null) {
            o00o0o04.f27141OooOOoo = new o0O0O0Oo(this);
        }
        com.yalla.yalla.ui.adapter.o00O0O00 o00o0o05 = this.f25325OooOo0o;
        if (o00o0o05 != null) {
            o00o0o05.OooO0o0(new o0O0O0o0(this));
        }
        com.yalla.yalla.ui.adapter.o00O0O00 o00o0o06 = this.f25325OooOo0o;
        if (o00o0o06 != null) {
            o00o0o06.f27142OooOo00 = new o0O0OOO0(this);
        }
        com.yalla.yalla.ui.adapter.o00O0O00 o00o0o07 = this.f25325OooOo0o;
        if (o00o0o07 != null) {
            o0O0OOOo listener = new o0O0OOOo(this);
            Intrinsics.checkNotNullParameter(listener, "listener");
            o00o0o07.f58006OooOO0o = listener;
        }
        com.yalla.yalla.ui.adapter.o00O0O00 o00o0o08 = this.f25325OooOo0o;
        if (o00o0o08 != null) {
            o00o0o08.OooO0Oo(p562o0oOo000.o0OO00O.ivHeader);
        }
        com.yalla.yalla.ui.adapter.o00O0O00 o00o0o09 = this.f25325OooOo0o;
        if (o00o0o09 != null) {
            o0O0o000 listener2 = new o0O0o000(this);
            Intrinsics.checkNotNullParameter(listener2, "listener");
            o00o0o09.f58007OooOOO = listener2;
        }
        com.yalla.yalla.ui.adapter.o00O0O00 o00o0o010 = this.f25325OooOo0o;
        if (o00o0o010 != null) {
            int[] viewIds = {p562o0oOo000.o0OO00O.tvContent};
            Intrinsics.checkNotNullParameter(viewIds, "viewIds");
            o00o0o010.f58010OooOOOo.add(Integer.valueOf(viewIds[0]));
        }
        OooOo().f45225OooO0OO.addOnScrollListener(new o0oO0Ooo(this));
        OooOo().f45225OooO0OO.setAdapter(this.f25325OooOo0o);
        RecyclerView rvMessage = OooOo().f45225OooO0OO;
        Intrinsics.checkNotNullExpressionValue(rvMessage, "rvMessage");
        l0.OooO0O0(rvMessage, (15 & 1) != 0 ? 100L : 0L, 0L, (15 & 4) != 0 ? 100L : 0L, (15 & 8) != 0 ? 100L : 0L);
        ArrayList arrayList = new ArrayList();
        String strOooO0OO = com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.app_problems);
        YallaTeamFeedbackType.Companion companion = YallaTeamFeedbackType.INSTANCE;
        arrayList.add(new YallaTeamFeedbackType(strOooO0OO, companion.getAppProblems()));
        arrayList.add(new YallaTeamFeedbackType(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.suggest_new_features), companion.getSuggestions()));
        arrayList.add(new YallaTeamFeedbackType(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.contribute_crazy_words), companion.getRecharge()));
        arrayList.add(new YallaTeamFeedbackType(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.Others), companion.getOthers()));
        OooOo().f45226OooO0Oo.setLayoutManager(new LinearLayoutManager(this, 0, false));
        com.yalla.yalla.ui.adapter.oo0oOO0 oo0ooo0 = new com.yalla.yalla.ui.adapter.oo0oOO0(this, arrayList);
        this.f25321OooOo = oo0ooo0;
        oo0ooo0.f13176OooO0o = new androidx.media3.session.o00O0O(this);
        OooOo().f45226OooO0Oo.setAdapter(this.f25321OooOo);
        OooOo().f45225OooO0OO.setOnTouchListener(new View.OnTouchListener() { // from class: com.yalla.yalla.ui.activity.message.o0O00OO
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                int i = YallaTeamMessageActivity.f25319OooOoo0;
                YallaTeamMessageActivity activity = this.f25493OooO0Oo;
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
        ComposeView bottomComposeView = OooOo().f45224OooO0O0;
        Intrinsics.checkNotNullExpressionValue(bottomComposeView, "bottomComposeView");
        p193o00o0O0O.o0000oo.OooO0Oo(bottomComposeView, ComposableLambdaKt.composableLambdaInstance(-942062684, true, new o0O00o00(this)));
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        Intrinsics.checkNotNullParameter("Yalla_Notice_YallaTeam", ViewHierarchyConstants.TAG_KEY);
        Object systemService = com.code.android.util.o000O00O.OooO00o().getSystemService("notification");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        ((NotificationManager) systemService).cancel("Yalla_Notice_YallaTeam", 0);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        super.onStop();
        OooOoO0().updateAllMessageStateRead();
    }
}
