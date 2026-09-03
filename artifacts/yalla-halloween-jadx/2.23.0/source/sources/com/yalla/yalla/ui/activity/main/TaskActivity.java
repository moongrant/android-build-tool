package com.yalla.yalla.ui.activity.main;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.android.billingclient.api.o0000OO0;
import com.code.android.util.o000O0Oo;
import com.common.support.networkstate.NetworkStateUtil;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.data.cache.SharedMainMessageManager;
import com.yalla.yalla.model.TaskModel;
import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.open_auth.OpenAuthManager;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.store.StoreActivity;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import com.yalla.yalla.ui.vm.main.TaskViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p331o0OO0o0.oo0o0Oo;
import p409o0Oo0o0o.o00000;
import p464o0Oooo.o000000O;
import p466o0Oooo0o.oo00o;
import p480o0o000Oo.o0OOO0o;
import p486o0o00O00.o0o0Oo;
import p486o0o00O00.oo0O;
import p519o0o0O0oO.b;
import p519o0o0O0oO.oO00O0oO;
import p579o0oOoo.oOOO0OOO;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p587o0oOooo.o0OO000;
import p641o0ooOOOO.q0;
import p641o0ooOOOO.v9;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/yalla/yalla/ui/activity/main/TaskActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "OooO00o", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTaskActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskActivity.kt\ncom/yalla/yalla/ui/activity/main/TaskActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,695:1\n22#2,2:696\n75#3,13:698\n766#4:711\n857#4,2:712\n1855#4,2:714\n766#4:716\n857#4,2:717\n766#4:719\n857#4,2:720\n*S KotlinDebug\n*F\n+ 1 TaskActivity.kt\ncom/yalla/yalla/ui/activity/main/TaskActivity\n*L\n82#1:696,2\n187#1:698,13\n403#1:711\n403#1:712,2\n406#1:714,2\n427#1:716\n427#1:717,2\n429#1:719\n429#1:720,2\n*E\n"})
public final class TaskActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public static final /* synthetic */ int f25537OooOooO = 0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @Nullable
    public OpenAuthManager f25539OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public int f25540OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public boolean f25541OooOo00;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public int f25547OooOoo;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final o000O0Oo f25538OooOOoo = new o000O0Oo(Reflection.getOrCreateKotlinClass(q0.class), this, null);

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @NotNull
    public final Lazy f25542OooOo0O = LazyKt.lazy(new OooOOOO());

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public boolean f25543OooOo0o = true;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f25545OooOoO0 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(TaskViewModel.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.main.TaskActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.activity.main.TaskActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.activity.main.TaskActivity$special$$inlined$viewModels$default$3

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0 f25561OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f25561OooO0Oo;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    @NotNull
    public final Lazy f25544OooOoO = LazyKt.lazy(new OooOOO());

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    @NotNull
    public final Lazy f25546OooOoOO = LazyKt.lazy(new OooO0O0());

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    @NotNull
    public final Lazy f25548OooOoo0 = LazyKt.lazy(new OooOOO0());

    public static final class OooO extends Lambda implements Function1<ApiResult<List<? extends TaskModel.TaskInfo>>, Unit> {
        public OooO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiResult<List<? extends TaskModel.TaskInfo>> apiResult) {
            ApiResult<List<? extends TaskModel.TaskInfo>> it = apiResult;
            Intrinsics.checkNotNullParameter(it, "it");
            ((oO00O0oO) TaskActivity.this.f25544OooOoO.getValue()).dismiss();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o {
        @JvmOverloads
        public static void OooO00o(@NotNull Activity activity, boolean z) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intent intent = new Intent(activity, (Class<?>) TaskActivity.class);
            intent.putExtra("IsFromGiftSendDialog_Tag", z);
            activity.startActivity(intent);
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<v9> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v9 invoke() {
            return v9.inflate(TaskActivity.this.getLayoutInflater());
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<List<? extends TaskModel.TaskInfo>, Unit> {
        public OooO0OO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(List<? extends TaskModel.TaskInfo> list) {
            int i;
            List<? extends TaskModel.TaskInfo> list2 = list;
            TaskActivity taskActivity = TaskActivity.this;
            if (taskActivity.f25541OooOo00) {
                boolean z = true;
                if (list2 == null || com.code.android.util.OooOo00.OooO00o(list2)) {
                    taskActivity.OooOoO0().Oooo00o();
                    taskActivity.OooOo().f58641OooO0o.setLoadComplete(true);
                } else {
                    ArrayList<TaskModel.TaskInfo> arrayList = new ArrayList();
                    for (Object obj : list2) {
                        if (oOOO0OOO.f56682OooO00o.containsKey(Integer.valueOf(((TaskModel.TaskInfo) obj).takeid))) {
                            arrayList.add(obj);
                        }
                    }
                    for (TaskModel.TaskInfo taskInfo : arrayList) {
                        LinkedHashMap<Integer, TaskModel.TaskInfo> linkedHashMap = oOOO0OOO.f56682OooO00o;
                        TaskModel.TaskInfo taskInfo2 = linkedHashMap.get(Integer.valueOf(taskInfo.takeid));
                        Intrinsics.checkNotNull(taskInfo2);
                        taskInfo.name = taskInfo2.name;
                        TaskModel.TaskInfo taskInfo3 = linkedHashMap.get(Integer.valueOf(taskInfo.takeid));
                        Intrinsics.checkNotNull(taskInfo3);
                        taskInfo.icon = taskInfo3.icon;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (((TaskModel.TaskInfo) next).isonetime == 0) {
                            arrayList3.add(next);
                        }
                    }
                    arrayList2.addAll(arrayList3);
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj2 : arrayList) {
                        if (((TaskModel.TaskInfo) obj2).isonetime == 1) {
                            arrayList4.add(obj2);
                        }
                    }
                    arrayList2.addAll(arrayList4);
                    int i2 = 0;
                    while (i2 < arrayList2.size()) {
                        Object obj3 = arrayList2.get(i2);
                        Intrinsics.checkNotNullExpressionValue(obj3, "list[i]");
                        TaskModel.TaskInfo taskInfo4 = (TaskModel.TaskInfo) obj3;
                        if (taskInfo4.num == -1 || (taskInfo4.state == 2 && taskInfo4.isonetime == 1)) {
                            arrayList2.remove(taskInfo4);
                            i2 = (i2 - 1) + 1;
                        } else {
                            if (i2 == 0) {
                                taskActivity.f25543OooOo0o = true;
                                taskInfo4.typeName = oO00OOo0.Daily_Tasks;
                            } else if (taskInfo4.isonetime == 1 && taskActivity.f25543OooOo0o) {
                                taskInfo4.typeName = oO00OOo0.tesk_class_one_tasks;
                                taskActivity.f25543OooOo0o = false;
                            } else {
                                taskInfo4.typeName = 0;
                            }
                            i2++;
                        }
                    }
                    Iterator it2 = arrayList2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            i = 0;
                            break;
                        }
                        TaskModel.TaskInfo taskInfo5 = (TaskModel.TaskInfo) it2.next();
                        Intrinsics.checkNotNull(taskInfo5);
                        if (taskInfo5.isonetime == 1 && taskInfo5.state == 1) {
                            i = 1;
                            break;
                        }
                    }
                    taskActivity.f25547OooOoo = i;
                    ((o00000) p408o0Oo0o0O.o00Oo0.f45183OooO0oo.getValue()).OooOO0O(i > 0);
                    SharedMainMessageManager.INSTANCE.getHaveAchievementRewardTask().postValue(Boolean.valueOf(i > 0));
                    taskActivity.OooOoO0().OooOoO0(arrayList2);
                    taskActivity.OooOoO0().Oooo00o();
                    if (taskActivity.f25540OooOo0 > 0) {
                        new b(taskActivity).show();
                    }
                    taskActivity.f25540OooOo0 = 0;
                    taskActivity.OooOo().f58641OooO0o.setLoadComplete(true);
                    o0OOO0o o0ooo0oOooO0O0 = o0000OO0.OooO0O0();
                    Iterator it3 = taskActivity.OooOoO0().f10111OooOOoo.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            z = false;
                            break;
                        }
                        TaskModel.TaskInfo taskInfo6 = (TaskModel.TaskInfo) it3.next();
                        Intrinsics.checkNotNull(taskInfo6);
                        int i3 = taskInfo6.takeid;
                        if (i3 == 2 || i3 == 12 || i3 == 26 || i3 == 35) {
                            if (taskInfo6.state == 1) {
                                break;
                            }
                        }
                    }
                    o0ooo0oOooO0O0.OooOO0o(z);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<ApiError, Unit> {
        public OooO0o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiError apiError) {
            ApiError it = apiError;
            Intrinsics.checkNotNullParameter(it, "it");
            TaskActivity taskActivity = TaskActivity.this;
            if (taskActivity.f25541OooOo00) {
                taskActivity.OooOo().f58641OooO0o.OooOoo(true);
                taskActivity.OooOoO0().OooOoo();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends oo00o {
        public OooOO0() {
        }

        @Override // p466o0Oooo0o.oo00o
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            NetworkStateUtil networkStateUtil = NetworkStateUtil.INSTANCE;
            TaskActivity taskActivity = TaskActivity.this;
            Context applicationContext = taskActivity.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
            if (!networkStateUtil.isConnected(applicationContext)) {
                taskActivity.OooOoO();
            } else {
                taskActivity.OooOoO();
                taskActivity.OooOoOO();
            }
        }
    }

    public static final class OooOO0O extends oo00o {
        public OooOO0O() {
        }

        @Override // p466o0Oooo0o.oo00o
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            StoreActivity.OooOo0(TaskActivity.this, true);
        }
    }

    public static final class OooOOO extends Lambda implements Function0<oO00O0oO> {
        public OooOOO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final oO00O0oO invoke() {
            return new oO00O0oO(TaskActivity.this);
        }
    }

    public static final class OooOOO0 extends Lambda implements Function0<Boolean> {
        public OooOOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(TaskActivity.this.getIntent().getBooleanExtra("IsFromGiftSendDialog_Tag", false));
        }
    }

    public static final class OooOOOO extends Lambda implements Function0<OooOo> {
        public OooOOOO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final OooOo invoke() {
            return new OooOo(TaskActivity.this, oO00OO0O.item_task);
        }
    }

    public static final class OooOo00 implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f25558OooO0Oo;

        public OooOo00(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f25558OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f25558OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f25558OooO0Oo;
        }

        public final int hashCode() {
            return this.f25558OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f25558OooO0Oo.invoke(obj);
        }
    }

    public final q0 OooOo() {
        return (q0) this.f25538OooOOoo.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooOoO() {
        ((TaskViewModel) this.f25545OooOoO0.getValue()).taskList(0).observe(this, new p377o0OOoOo.o0000OO0(new OooO0OO(), new OooO0o(), new OooO(), false, 8));
    }

    public final OooOo OooOoO0() {
        return (OooOo) this.f25542OooOo0O.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooOoOO() {
        OooOOoo(oO00OOo0.title_tasks);
        OooOo().f58640OooO0Oo.setLayoutManager(new FixLinearLayoutManager(this));
        OooOoO0().Oooo0OO(new OooOO0());
        View viewInflate = View.inflate(this, oO00OO0O.activity_task_foot, null);
        viewInflate.setOnClickListener(new OooOO0O());
        OooOoO0().OooOo0O(viewInflate);
        OooOo().f58640OooO0Oo.setAdapter(OooOoO0());
        o000000O o000000o2 = o000000O.f46674OooO00o;
        Boolean bool = (Boolean) o000000O.OooOo0o().getValue();
        Lazy lazy = this.f25546OooOoOO;
        if (bool != null && bool.booleanValue() && o000000O.f46677OooO0Oo) {
            ((v9) lazy.getValue()).f59079OooO0OO.setImageResource(oOo00OO0.task_check_in_check);
        }
        ((v9) lazy.getValue()).f59078OooO0O0.setOnClickListener(new oo0O(this, 0));
        OooOoO0().OooOo(((v9) lazy.getValue()).f59077OooO00o);
        OooOo().f58641OooO0o.OooOo00(false);
        OooOo().f58641OooO0o.f31258o00000OO = new oo0o0Oo(this, 1);
    }

    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity, android.app.Activity
    public final void finish() {
        super.finish();
        this.f25541OooOo00 = false;
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOo().f58637OooO00o);
        OooOoOO();
        SharedMainMessageManager.INSTANCE.isSignIn().observe(this, new OooOo00(new o0o0Oo(this)));
        OpenAuthManager openAuthManager = new OpenAuthManager(this);
        this.f25539OooOo = openAuthManager;
        Intrinsics.checkNotNull(openAuthManager);
        openAuthManager.f24730OooO0O0 = new com.yalla.yalla.ui.activity.main.OooOo00(this);
        o0OO000.OooO00o("305001");
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        super.onStart();
        this.f25541OooOo00 = true;
        OooOoO();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        super.onStop();
        if (((Boolean) this.f25548OooOoo0.getValue()).booleanValue()) {
            LiveEventBus.get("ReceiveCrystalDialogFromGiftSendDialog").post(Boolean.TRUE);
        }
    }
}
