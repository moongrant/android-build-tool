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
import com.code.android.util.o000O0;
import com.common.support.networkstate.NetworkStateUtil;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.data.cache.SharedMainMessageManager;
import com.yalla.yalla.model.TaskModel;
import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.open_auth.OpenAuthManager;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.main.TaskActivity;
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
import p269o00oooo0.o0O0oo0o;
import p405o0Oo0OOO.k1;
import p405o0Oo0OOO.o00O0OOO;
import p414o0Oo0oO.oO0O0OoO;
import p415o0Oo0oO0.o00Ooo;
import p473o0OoooOo.o0OOOO0o;
import p475o0Ooooo0.o0O00oO0;
import p487o0o00O.o00OOO00;
import p562o0oOo000.o000000;
import p562o0oOo000.o0Oo0oo;
import p562o0oOo000.oo0o0Oo;
import p590o0oOooo0.x0;
import p650o0ooo.f;
import p650o0ooo.o0OOO00;
import p650o0ooo.oO0O00oO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/yalla/yalla/ui/activity/main/TaskActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "OooO00o", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nTaskActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskActivity.kt\ncom/yalla/yalla/ui/activity/main/TaskActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,705:1\n22#2,2:706\n75#3,13:708\n766#4:721\n857#4,2:722\n1855#4,2:724\n766#4:726\n857#4,2:727\n766#4:729\n857#4,2:730\n*S KotlinDebug\n*F\n+ 1 TaskActivity.kt\ncom/yalla/yalla/ui/activity/main/TaskActivity\n*L\n83#1:706,2\n194#1:708,13\n410#1:721\n410#1:722,2\n413#1:724,2\n435#1:726\n435#1:727,2\n437#1:729\n437#1:730,2\n*E\n"})
public final class TaskActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public static final /* synthetic */ int f25083OooOooO = 0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @Nullable
    public OpenAuthManager f25085OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public int f25086OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public boolean f25087OooOo00;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public int f25093OooOoo;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final o000O0 f25084OooOOoo = new o000O0(Reflection.getOrCreateKotlinClass(o00O0OOO.class), this, null);

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @NotNull
    public final Lazy f25088OooOo0O = LazyKt.lazy(new OooOOOO());

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public boolean f25089OooOo0o = true;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f25091OooOoO0 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(TaskViewModel.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.main.TaskActivity$special$$inlined$viewModels$default$2
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
        public final /* synthetic */ Function0 f25107OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f25107OooO0Oo;
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
    public final Lazy f25090OooOoO = LazyKt.lazy(new OooOOO());

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    @NotNull
    public final Lazy f25092OooOoOO = LazyKt.lazy(new OooO0O0());

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    @NotNull
    public final Lazy f25094OooOoo0 = LazyKt.lazy(new OooOOO0());

    public static final class OooO extends Lambda implements Function1<ApiResult<List<? extends TaskModel.TaskInfo>>, Unit> {
        public OooO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiResult<List<? extends TaskModel.TaskInfo>> apiResult) {
            ApiResult<List<? extends TaskModel.TaskInfo>> it = apiResult;
            Intrinsics.checkNotNullParameter(it, "it");
            ((o0OOO00) TaskActivity.this.f25090OooOoO.getValue()).dismiss();
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

    public static final class OooO0O0 extends Lambda implements Function0<k1> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final k1 invoke() {
            return k1.inflate(TaskActivity.this.getLayoutInflater());
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
            if (taskActivity.f25087OooOo00) {
                boolean z = true;
                if (list2 == null || com.code.android.util.OooOo00.OooO00o(list2)) {
                    taskActivity.OooOoO0().Oooo00o();
                    taskActivity.OooOo().f44335OooO0o.setLoadComplete(true);
                } else {
                    ArrayList<TaskModel.TaskInfo> arrayList = new ArrayList();
                    for (Object obj : list2) {
                        if (x0.f57306OooO00o.containsKey(Integer.valueOf(((TaskModel.TaskInfo) obj).takeid))) {
                            arrayList.add(obj);
                        }
                    }
                    for (TaskModel.TaskInfo taskInfo : arrayList) {
                        LinkedHashMap<Integer, TaskModel.TaskInfo> linkedHashMap = x0.f57306OooO00o;
                        TaskModel.TaskInfo taskInfo2 = linkedHashMap.get(Integer.valueOf(taskInfo.takeid));
                        Intrinsics.checkNotNull(taskInfo2);
                        taskInfo.name = taskInfo2.name;
                        TaskModel.TaskInfo taskInfo3 = linkedHashMap.get(Integer.valueOf(taskInfo.takeid));
                        Intrinsics.checkNotNull(taskInfo3);
                        taskInfo.icon = taskInfo3.icon;
                        TaskModel.TaskInfo taskInfo4 = linkedHashMap.get(Integer.valueOf(taskInfo.takeid));
                        Intrinsics.checkNotNull(taskInfo4);
                        taskInfo.subtitle = taskInfo4.subtitle;
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
                        Intrinsics.checkNotNullExpressionValue(obj3, "get(...)");
                        TaskModel.TaskInfo taskInfo5 = (TaskModel.TaskInfo) obj3;
                        if (taskInfo5.num == -1 || (taskInfo5.state == 2 && taskInfo5.isonetime == 1)) {
                            arrayList2.remove(taskInfo5);
                            i2 = (i2 - 1) + 1;
                        } else {
                            if (i2 == 0) {
                                taskActivity.f25089OooOo0o = true;
                                taskInfo5.typeName = o000000.Daily_Tasks;
                            } else if (taskInfo5.isonetime == 1 && taskActivity.f25089OooOo0o) {
                                taskInfo5.typeName = o000000.tesk_class_one_tasks;
                                taskActivity.f25089OooOo0o = false;
                            } else {
                                taskInfo5.typeName = 0;
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
                        TaskModel.TaskInfo taskInfo6 = (TaskModel.TaskInfo) it2.next();
                        Intrinsics.checkNotNull(taskInfo6);
                        if (taskInfo6.isonetime == 1 && taskInfo6.state == 1) {
                            i = 1;
                            break;
                        }
                    }
                    taskActivity.f25093OooOoo = i;
                    ((oO0O0OoO) o00Ooo.f46414OooO0oo.getValue()).OooOO0O(i > 0);
                    SharedMainMessageManager.INSTANCE.getHaveAchievementRewardTask().postValue(Boolean.valueOf(i > 0));
                    taskActivity.OooOoO0().OooOoO0(arrayList2);
                    taskActivity.OooOoO0().Oooo00o();
                    if (taskActivity.f25086OooOo0 > 0) {
                        new f(taskActivity).show();
                    }
                    taskActivity.f25086OooOo0 = 0;
                    taskActivity.OooOo().f44335OooO0o.setLoadComplete(true);
                    p477o0o00.OooO0o oooO0oOooO00o = o0O0oo0o.OooO00o();
                    Iterator it3 = taskActivity.OooOoO0().f13189OooOOoo.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            z = false;
                            break;
                        }
                        TaskModel.TaskInfo taskInfo7 = (TaskModel.TaskInfo) it3.next();
                        Intrinsics.checkNotNull(taskInfo7);
                        int i3 = taskInfo7.takeid;
                        if (i3 == 2 || i3 == 12 || i3 == 26 || i3 == 35) {
                            if (taskInfo7.state == 1) {
                                break;
                            }
                        }
                    }
                    oooO0oOooO00o.OooOO0o(z);
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
            if (taskActivity.f25087OooOo00) {
                taskActivity.OooOo().f44335OooO0o.OooOoo(true);
                taskActivity.OooOoO0().OooOoo();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends o0OOOO0o {
        public OooOO0() {
        }

        @Override // p473o0OoooOo.o0OOOO0o
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            NetworkStateUtil networkStateUtil = NetworkStateUtil.INSTANCE;
            TaskActivity taskActivity = TaskActivity.this;
            Context applicationContext = taskActivity.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            if (!networkStateUtil.isConnected(applicationContext)) {
                taskActivity.OooOoO();
            } else {
                taskActivity.OooOoO();
                taskActivity.OooOoOO();
            }
        }
    }

    public static final class OooOO0O extends o0OOOO0o {
        public OooOO0O() {
        }

        @Override // p473o0OoooOo.o0OOOO0o
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            StoreActivity.OooOo0(TaskActivity.this, true);
        }
    }

    public static final class OooOOO extends Lambda implements Function0<o0OOO00> {
        public OooOOO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o0OOO00 invoke() {
            return new o0OOO00(TaskActivity.this);
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
            return new OooOo(TaskActivity.this, oo0o0Oo.item_task);
        }
    }

    public static final class OooOo00 implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f25104OooO0Oo;

        public OooOo00(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f25104OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f25104OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f25104OooO0Oo;
        }

        public final int hashCode() {
            return this.f25104OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f25104OooO0Oo.invoke(obj);
        }
    }

    public final o00O0OOO OooOo() {
        return (o00O0OOO) this.f25084OooOOoo.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooOoO() {
        ((TaskViewModel) this.f25091OooOoO0.getValue()).taskList(0).observe(this, new p384o0OOoo0O.o000oOoO(new OooO0OO(), new OooO0o(), new OooO(), false, 8));
    }

    public final OooOo OooOoO0() {
        return (OooOo) this.f25088OooOo0O.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooOoOO() {
        OooOOoo(o000000.title_tasks);
        OooOo().f44334OooO0Oo.setLayoutManager(new FixLinearLayoutManager(this));
        OooOoO0().Oooo0OO(new OooOO0());
        View viewInflate = View.inflate(this, oo0o0Oo.activity_task_foot, null);
        viewInflate.setOnClickListener(new OooOO0O());
        OooOoO0().OooOo0O(viewInflate);
        OooOo().f44334OooO0Oo.setAdapter(OooOoO0());
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        Boolean bool = (Boolean) o0O00oO0.OooOo0o().getValue();
        Lazy lazy = this.f25092OooOoOO;
        if (bool != null && bool.booleanValue() && o0O00oO0.f47939OooO0Oo) {
            ((k1) lazy.getValue()).f44076OooO0OO.setImageResource(o0Oo0oo.task_check_in_check);
        }
        ((k1) lazy.getValue()).f44075OooO0O0.setOnClickListener(new View.OnClickListener() { // from class: o0o00O.o00OO00O
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = TaskActivity.f25083OooOooO;
                TaskActivity this$0 = this.f48817OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                new oO0O00oO(this$0).OooO();
            }
        });
        OooOoO0().OooOo(((k1) lazy.getValue()).f44074OooO00o);
        OooOo().f44335OooO0o.OooOo00(false);
        OooOo().f44335OooO0o.f30717o00000OO = new androidx.compose.ui.graphics.colorspace.OooO(this, 1);
    }

    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity, android.app.Activity
    public final void finish() {
        super.finish();
        this.f25087OooOo00 = false;
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOo().f44331OooO00o);
        OooOoOO();
        SharedMainMessageManager.INSTANCE.isSignIn().observe(this, new OooOo00(new o00OOO00(this)));
        OpenAuthManager openAuthManager = new OpenAuthManager(this);
        this.f25085OooOo = openAuthManager;
        Intrinsics.checkNotNull(openAuthManager);
        openAuthManager.f24267OooO0O0 = new com.yalla.yalla.ui.activity.main.OooOo00(this);
        o0oo0000.OooO00o.OooO0O0("305001");
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        super.onStart();
        this.f25087OooOo00 = true;
        OooOoO();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        super.onStop();
        if (((Boolean) this.f25094OooOoo0.getValue()).booleanValue()) {
            LiveEventBus.get("ReceiveCrystalDialogFromGiftSendDialog").post(Boolean.TRUE);
        }
    }
}
