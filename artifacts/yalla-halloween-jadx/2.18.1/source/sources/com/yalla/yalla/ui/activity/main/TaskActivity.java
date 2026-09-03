package com.yalla.yalla.ui.activity.main;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.android.billingclient.api.o00000O;
import com.app.base.model.TaskModel;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.NetworkUtil;
import com.yalla.yalla.common.manager.data.SharedMainMessageManager;
import com.yalla.yalla.common.model.ApiError;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.open_auth.OpenAuthManager;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.store.StoreActivity;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import com.yalla.yalla.ui.vm.main.TaskViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import o0o0000.OooOo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p143o00OOooo.o0o0Oo;
import p166o00OoOoo.o0O00O0o;
import p176o00OoooO.oO0Oo0oo;
import p189o00o00oO.o0OO00O;
import p254o00ooO0O.o00O000o;
import p502o0o00o0.o0000O;
import p535o0o0OOoO.oOO0O0;
import p535o0o0OOoO.oOO0O0O0;
import p649o0ooOOoo.c7;
import p649o0ooOOoo.fh;
import p654o0ooo.o00Oo0;
import p700oO0Oo.oo000o;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/yalla/yalla/ui/activity/main/TaskActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "OooO00o", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class TaskActivity extends BaseActivityK {

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    @NotNull
    public static final OooO00o f22061o00Oo0 = new OooO00o();

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public boolean f22063Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public int f22064Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public int f22065OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    @Nullable
    public SparseArray<TaskModel.TaskInfo> f22066OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    @Nullable
    public ArrayList<TaskModel.TaskInfo> f22067OooooOo;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    @Nullable
    public OpenAuthManager f22070OoooooO;

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    public int f22072o00O0O;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @NotNull
    public final o00O000o f22062OoooOoo = new o00O000o(Reflection.getOrCreateKotlinClass(c7.class), this, null);

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    @NotNull
    public final Lazy f22069Oooooo0 = LazyKt.lazy(new OooOOO());

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public boolean f22068Oooooo = true;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f22071Ooooooo = new ViewModelLazy(Reflection.getOrCreateKotlinClass(TaskViewModel.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.main.TaskActivity$special$$inlined$viewModels$default$2
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

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function0 f22085Oooo0o = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f22085Oooo0o;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    @NotNull
    public final Lazy f22073o0OoOo0 = LazyKt.lazy(new OooOOO0());

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    @NotNull
    public final Lazy f22074ooOO = LazyKt.lazy(new OooO0O0());

    public static final class OooO extends Lambda implements Function1<ApiResult<List<? extends TaskModel.TaskInfo>>, Unit> {
        public OooO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiResult<List<? extends TaskModel.TaskInfo>> apiResult) {
            ApiResult<List<? extends TaskModel.TaskInfo>> it = apiResult;
            Intrinsics.checkNotNullParameter(it, "it");
            TaskActivity.OooOoo(TaskActivity.this).dismiss();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o {
        public final void OooO00o(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            activity.startActivity(new Intent(activity, (Class<?>) TaskActivity.class));
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<fh> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final fh invoke() {
            return fh.inflate(TaskActivity.this.getLayoutInflater());
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
            if (TaskActivity.this.f22063Ooooo00) {
                boolean z = true;
                if (list2 == null || com.yalla.support.common.util.OooO0OO.OooO00o(list2)) {
                    TaskActivity.this.Oooo000().setLoadComplete();
                    TaskActivity.this.OooOooO().f49076OooO0o.setLoadComplete(true);
                } else {
                    TaskActivity taskActivity = TaskActivity.this;
                    Objects.requireNonNull(taskActivity);
                    SparseArray<TaskModel.TaskInfo> sparseArray = new SparseArray<>();
                    taskActivity.f22066OooooOO = sparseArray;
                    Intrinsics.checkNotNull(sparseArray);
                    sparseArray.append(2, new TaskModel.TaskInfo(2, R.drawable.mic2_copy, R.string.task_leave_your_footsteps_in_bar));
                    SparseArray<TaskModel.TaskInfo> sparseArray2 = taskActivity.f22066OooooOO;
                    Intrinsics.checkNotNull(sparseArray2);
                    sparseArray2.append(3, new TaskModel.TaskInfo(3, R.drawable.fb2_copy, R.string.share_balala_to_facebook));
                    SparseArray<TaskModel.TaskInfo> sparseArray3 = taskActivity.f22066OooooOO;
                    Intrinsics.checkNotNull(sparseArray3);
                    sparseArray3.append(7, new TaskModel.TaskInfo(7, R.drawable.star2_copy, R.string.leave_star_in_gp_comment));
                    SparseArray<TaskModel.TaskInfo> sparseArray4 = taskActivity.f22066OooooOO;
                    Intrinsics.checkNotNull(sparseArray4);
                    sparseArray4.append(8, new TaskModel.TaskInfo(8, R.drawable.icon_creat_room, R.string.create_a_bar));
                    SparseArray<TaskModel.TaskInfo> sparseArray5 = taskActivity.f22066OooooOO;
                    Intrinsics.checkNotNull(sparseArray5);
                    sparseArray5.append(12, new TaskModel.TaskInfo(12, R.drawable.gift1_2_copy, R.string.task_present_in_room));
                    SparseArray<TaskModel.TaskInfo> sparseArray6 = taskActivity.f22066OooooOO;
                    Intrinsics.checkNotNull(sparseArray6);
                    sparseArray6.append(13, new TaskModel.TaskInfo(13, R.drawable.profile2_copy, R.string.task_perfect_personal_information));
                    SparseArray<TaskModel.TaskInfo> sparseArray7 = taskActivity.f22066OooooOO;
                    Intrinsics.checkNotNull(sparseArray7);
                    sparseArray7.append(14, new TaskModel.TaskInfo(14, R.drawable.post2_copy, R.string.task_send_three_post, 3));
                    SparseArray<TaskModel.TaskInfo> sparseArray8 = taskActivity.f22066OooooOO;
                    Intrinsics.checkNotNull(sparseArray8);
                    sparseArray8.append(15, new TaskModel.TaskInfo(15, R.drawable.post2_2_copy, R.string.task_five_post_thumbup, 5));
                    SparseArray<TaskModel.TaskInfo> sparseArray9 = taskActivity.f22066OooooOO;
                    Intrinsics.checkNotNull(sparseArray9);
                    sparseArray9.append(16, new TaskModel.TaskInfo(16, R.drawable.friend1_2_copy, R.string.task_get_good_friend, 1));
                    SparseArray<TaskModel.TaskInfo> sparseArray10 = taskActivity.f22066OooooOO;
                    Intrinsics.checkNotNull(sparseArray10);
                    sparseArray10.append(17, new TaskModel.TaskInfo(17, R.drawable.friend1_2_copy2, R.string.task_get_ten_friends, 10));
                    SparseArray<TaskModel.TaskInfo> sparseArray11 = taskActivity.f22066OooooOO;
                    Intrinsics.checkNotNull(sparseArray11);
                    sparseArray11.append(18, new TaskModel.TaskInfo(18, R.drawable.inroom2_copy, R.string.task_stayin_room_15_minutes));
                    SparseArray<TaskModel.TaskInfo> sparseArray12 = taskActivity.f22066OooooOO;
                    Intrinsics.checkNotNull(sparseArray12);
                    sparseArray12.append(19, new TaskModel.TaskInfo(19, R.drawable.gift1_2_copy2, R.string.task_ten_gift, 10));
                    SparseArray<TaskModel.TaskInfo> sparseArray13 = taskActivity.f22066OooooOO;
                    Intrinsics.checkNotNull(sparseArray13);
                    sparseArray13.append(20, new TaskModel.TaskInfo(20, R.drawable.lucky2_copy, R.string.bill_send_red_envelope));
                    SparseArray<TaskModel.TaskInfo> sparseArray14 = taskActivity.f22066OooooOO;
                    Intrinsics.checkNotNull(sparseArray14);
                    sparseArray14.append(21, new TaskModel.TaskInfo(21, R.drawable.icon_task_online_20, R.string.Online_time_over_20mins));
                    SparseArray<TaskModel.TaskInfo> sparseArray15 = taskActivity.f22066OooooOO;
                    Intrinsics.checkNotNull(sparseArray15);
                    sparseArray15.append(22, new TaskModel.TaskInfo(22, R.drawable.icon_task_22, R.string.task_22));
                    SparseArray<TaskModel.TaskInfo> sparseArray16 = taskActivity.f22066OooooOO;
                    Intrinsics.checkNotNull(sparseArray16);
                    sparseArray16.append(23, new TaskModel.TaskInfo(23, R.drawable.post2_2_copy, R.string.task_23, 10));
                    SparseArray<TaskModel.TaskInfo> sparseArray17 = taskActivity.f22066OooooOO;
                    Intrinsics.checkNotNull(sparseArray17);
                    sparseArray17.append(24, new TaskModel.TaskInfo(24, R.drawable.icon_task_24, R.string.task_24));
                    SparseArray<TaskModel.TaskInfo> sparseArray18 = taskActivity.f22066OooooOO;
                    Intrinsics.checkNotNull(sparseArray18);
                    sparseArray18.append(25, new TaskModel.TaskInfo(25, R.drawable.icon_task_25, R.string.task_25));
                    SparseArray<TaskModel.TaskInfo> sparseArray19 = taskActivity.f22066OooooOO;
                    Intrinsics.checkNotNull(sparseArray19);
                    sparseArray19.append(26, new TaskModel.TaskInfo(26, R.drawable.icon_task_share_room, R.string.task_26));
                    SparseArray<TaskModel.TaskInfo> sparseArray20 = taskActivity.f22066OooooOO;
                    Intrinsics.checkNotNull(sparseArray20);
                    sparseArray20.append(27, new TaskModel.TaskInfo(27, R.drawable.icon_task_27, R.string.task_27, 3));
                    SparseArray<TaskModel.TaskInfo> sparseArray21 = taskActivity.f22066OooooOO;
                    Intrinsics.checkNotNull(sparseArray21);
                    sparseArray21.append(28, new TaskModel.TaskInfo(28, R.drawable.icon_task_28, R.string.task_28, 10));
                    SparseArray<TaskModel.TaskInfo> sparseArray22 = taskActivity.f22066OooooOO;
                    Intrinsics.checkNotNull(sparseArray22);
                    sparseArray22.append(29, new TaskModel.TaskInfo(29, R.drawable.icon_task_29, R.string.task_29, 3));
                    SparseArray<TaskModel.TaskInfo> sparseArray23 = taskActivity.f22066OooooOO;
                    Intrinsics.checkNotNull(sparseArray23);
                    sparseArray23.append(30, new TaskModel.TaskInfo(30, R.drawable.icon_task_30, R.string.task_30, 10));
                    SparseArray<TaskModel.TaskInfo> sparseArray24 = taskActivity.f22066OooooOO;
                    Intrinsics.checkNotNull(sparseArray24);
                    sparseArray24.append(31, new TaskModel.TaskInfo(31, R.drawable.icon_task_31, R.string.main_task_join_guessing_games, 3));
                    SparseArray<TaskModel.TaskInfo> sparseArray25 = taskActivity.f22066OooooOO;
                    Intrinsics.checkNotNull(sparseArray25);
                    sparseArray25.append(32, new TaskModel.TaskInfo(32, R.drawable.icon_task_32, R.string.main_task_join_turntable_games, 3));
                    SparseArray<TaskModel.TaskInfo> sparseArray26 = taskActivity.f22066OooooOO;
                    Intrinsics.checkNotNull(sparseArray26);
                    sparseArray26.append(35, new TaskModel.TaskInfo(35, R.drawable.icon_task_35, R.string.main_task_yalla_chat_reward));
                    SparseArray<TaskModel.TaskInfo> sparseArray27 = taskActivity.f22066OooooOO;
                    Intrinsics.checkNotNull(sparseArray27);
                    sparseArray27.append(36, new TaskModel.TaskInfo(36, R.drawable.icon_task_36, R.string.main_task_link_yalla_chat));
                    SparseArray<TaskModel.TaskInfo> sparseArray28 = taskActivity.f22066OooooOO;
                    Intrinsics.checkNotNull(sparseArray28);
                    sparseArray28.append(37, new TaskModel.TaskInfo(37, R.drawable.ic_task_plant_trees, R.string.main_task_planting_trees));
                    TaskActivity taskActivity2 = TaskActivity.this;
                    taskActivity2.f22065OooooO0 = 0;
                    for (TaskModel.TaskInfo taskInfo : list2) {
                        if (taskInfo.state < 2 || taskInfo.isonetime != 1) {
                            SparseArray<TaskModel.TaskInfo> sparseArray29 = taskActivity2.f22066OooooOO;
                            Intrinsics.checkNotNull(sparseArray29);
                            TaskModel.TaskInfo taskInfo2 = sparseArray29.get(taskInfo.takeid);
                            if (taskInfo2 != null) {
                                taskInfo2.getcrystal = taskInfo.getcrystal;
                                taskInfo2.isonetime = taskInfo.isonetime;
                                taskInfo2.state = taskInfo.state;
                                taskInfo2.num = taskInfo.num;
                                taskInfo2.rewardType = taskInfo.rewardType;
                                taskInfo2.rewardCoin = taskInfo.rewardCoin;
                                taskInfo2.rewardMultiple = taskInfo.rewardMultiple;
                                int i2 = taskInfo2.takeid;
                                if (i2 != 2 && i2 != 12 && i2 != 26) {
                                    taskActivity2.f22065OooooO0++;
                                }
                            }
                        }
                    }
                    TaskActivity taskActivity3 = TaskActivity.this;
                    Objects.requireNonNull(taskActivity3);
                    ArrayList<TaskModel.TaskInfo> arrayList = new ArrayList<>();
                    taskActivity3.f22067OooooOo = arrayList;
                    Intrinsics.checkNotNull(arrayList);
                    oOO0O0.OooO00o(taskActivity3.f22066OooooOO, 37, arrayList);
                    ArrayList<TaskModel.TaskInfo> arrayList2 = taskActivity3.f22067OooooOo;
                    Intrinsics.checkNotNull(arrayList2);
                    oOO0O0.OooO00o(taskActivity3.f22066OooooOO, 2, arrayList2);
                    ArrayList<TaskModel.TaskInfo> arrayList3 = taskActivity3.f22067OooooOo;
                    Intrinsics.checkNotNull(arrayList3);
                    oOO0O0.OooO00o(taskActivity3.f22066OooooOO, 12, arrayList3);
                    ArrayList<TaskModel.TaskInfo> arrayList4 = taskActivity3.f22067OooooOo;
                    Intrinsics.checkNotNull(arrayList4);
                    oOO0O0.OooO00o(taskActivity3.f22066OooooOO, 26, arrayList4);
                    ArrayList<TaskModel.TaskInfo> arrayList5 = taskActivity3.f22067OooooOo;
                    Intrinsics.checkNotNull(arrayList5);
                    oOO0O0.OooO00o(taskActivity3.f22066OooooOO, 35, arrayList5);
                    ArrayList<TaskModel.TaskInfo> arrayList6 = taskActivity3.f22067OooooOo;
                    Intrinsics.checkNotNull(arrayList6);
                    oOO0O0.OooO00o(taskActivity3.f22066OooooOO, 36, arrayList6);
                    ArrayList<TaskModel.TaskInfo> arrayList7 = taskActivity3.f22067OooooOo;
                    Intrinsics.checkNotNull(arrayList7);
                    oOO0O0.OooO00o(taskActivity3.f22066OooooOO, 8, arrayList7);
                    ArrayList<TaskModel.TaskInfo> arrayList8 = taskActivity3.f22067OooooOo;
                    Intrinsics.checkNotNull(arrayList8);
                    oOO0O0.OooO00o(taskActivity3.f22066OooooOO, 25, arrayList8);
                    ArrayList<TaskModel.TaskInfo> arrayList9 = taskActivity3.f22067OooooOo;
                    Intrinsics.checkNotNull(arrayList9);
                    oOO0O0.OooO00o(taskActivity3.f22066OooooOO, 13, arrayList9);
                    ArrayList<TaskModel.TaskInfo> arrayList10 = taskActivity3.f22067OooooOo;
                    Intrinsics.checkNotNull(arrayList10);
                    oOO0O0.OooO00o(taskActivity3.f22066OooooOO, 22, arrayList10);
                    ArrayList<TaskModel.TaskInfo> arrayList11 = taskActivity3.f22067OooooOo;
                    Intrinsics.checkNotNull(arrayList11);
                    oOO0O0.OooO00o(taskActivity3.f22066OooooOO, 15, arrayList11);
                    ArrayList<TaskModel.TaskInfo> arrayList12 = taskActivity3.f22067OooooOo;
                    Intrinsics.checkNotNull(arrayList12);
                    oOO0O0.OooO00o(taskActivity3.f22066OooooOO, 23, arrayList12);
                    ArrayList<TaskModel.TaskInfo> arrayList13 = taskActivity3.f22067OooooOo;
                    Intrinsics.checkNotNull(arrayList13);
                    oOO0O0.OooO00o(taskActivity3.f22066OooooOO, 29, arrayList13);
                    ArrayList<TaskModel.TaskInfo> arrayList14 = taskActivity3.f22067OooooOo;
                    Intrinsics.checkNotNull(arrayList14);
                    oOO0O0.OooO00o(taskActivity3.f22066OooooOO, 30, arrayList14);
                    ArrayList<TaskModel.TaskInfo> arrayList15 = taskActivity3.f22067OooooOo;
                    Intrinsics.checkNotNull(arrayList15);
                    oOO0O0.OooO00o(taskActivity3.f22066OooooOO, 17, arrayList15);
                    ArrayList<TaskModel.TaskInfo> arrayList16 = taskActivity3.f22067OooooOo;
                    Intrinsics.checkNotNull(arrayList16);
                    oOO0O0.OooO00o(taskActivity3.f22066OooooOO, 18, arrayList16);
                    ArrayList<TaskModel.TaskInfo> arrayList17 = taskActivity3.f22067OooooOo;
                    Intrinsics.checkNotNull(arrayList17);
                    oOO0O0.OooO00o(taskActivity3.f22066OooooOO, 27, arrayList17);
                    ArrayList<TaskModel.TaskInfo> arrayList18 = taskActivity3.f22067OooooOo;
                    Intrinsics.checkNotNull(arrayList18);
                    oOO0O0.OooO00o(taskActivity3.f22066OooooOO, 28, arrayList18);
                    ArrayList<TaskModel.TaskInfo> arrayList19 = taskActivity3.f22067OooooOo;
                    Intrinsics.checkNotNull(arrayList19);
                    oOO0O0.OooO00o(taskActivity3.f22066OooooOO, 19, arrayList19);
                    ArrayList<TaskModel.TaskInfo> arrayList20 = taskActivity3.f22067OooooOo;
                    Intrinsics.checkNotNull(arrayList20);
                    oOO0O0.OooO00o(taskActivity3.f22066OooooOO, 20, arrayList20);
                    ArrayList<TaskModel.TaskInfo> arrayList21 = taskActivity3.f22067OooooOo;
                    Intrinsics.checkNotNull(arrayList21);
                    oOO0O0.OooO00o(taskActivity3.f22066OooooOO, 31, arrayList21);
                    ArrayList<TaskModel.TaskInfo> arrayList22 = taskActivity3.f22067OooooOo;
                    Intrinsics.checkNotNull(arrayList22);
                    oOO0O0.OooO00o(taskActivity3.f22066OooooOO, 32, arrayList22);
                    ArrayList<TaskModel.TaskInfo> arrayList23 = taskActivity3.f22067OooooOo;
                    Intrinsics.checkNotNull(arrayList23);
                    oOO0O0.OooO00o(taskActivity3.f22066OooooOO, 24, arrayList23);
                    int i3 = 0;
                    while (true) {
                        ArrayList<TaskModel.TaskInfo> arrayList24 = taskActivity3.f22067OooooOo;
                        Intrinsics.checkNotNull(arrayList24);
                        if (i3 >= arrayList24.size()) {
                            break;
                        }
                        ArrayList<TaskModel.TaskInfo> arrayList25 = taskActivity3.f22067OooooOo;
                        Intrinsics.checkNotNull(arrayList25);
                        TaskModel.TaskInfo taskInfo3 = arrayList25.get(i3);
                        Intrinsics.checkNotNull(taskInfo3);
                        if (taskInfo3.num == -1 || (taskInfo3.state == 2 && taskInfo3.isonetime == 1)) {
                            ArrayList<TaskModel.TaskInfo> arrayList26 = taskActivity3.f22067OooooOo;
                            Intrinsics.checkNotNull(arrayList26);
                            arrayList26.remove(taskInfo3);
                            i3 = (i3 - 1) + 1;
                        } else {
                            if (i3 == 0) {
                                taskActivity3.f22068Oooooo = true;
                                taskInfo3.typeName = R.string.tesk_class_daily_tasks;
                            } else if (taskInfo3.isonetime == 1 && taskActivity3.f22068Oooooo) {
                                taskInfo3.typeName = R.string.tesk_class_one_tasks;
                                taskActivity3.f22068Oooooo = false;
                            } else {
                                taskInfo3.typeName = 0;
                            }
                            i3++;
                        }
                    }
                    TaskActivity taskActivity4 = TaskActivity.this;
                    ArrayList<TaskModel.TaskInfo> arrayList27 = taskActivity4.f22067OooooOo;
                    Intrinsics.checkNotNull(arrayList27);
                    Iterator<TaskModel.TaskInfo> it = arrayList27.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            i = 0;
                            break;
                        }
                        TaskModel.TaskInfo next = it.next();
                        Intrinsics.checkNotNull(next);
                        if (next.isonetime == 1 && next.state == 1) {
                            i = 1;
                            break;
                        }
                    }
                    taskActivity4.f22072o00O0O = i;
                    p497o0o00Oo.OooOOO0 oooOOO0 = p497o0o00Oo.OooOOO0.f41180OooO00o;
                    p497o0o00Oo.OooOOO0.OooO0oo().OooOO0O(i > 0);
                    SharedMainMessageManager.INSTANCE.getHaveAchievementRewardTask().postValue(Boolean.valueOf(i > 0));
                    TaskActivity.this.Oooo000().setNewData(TaskActivity.this.f22067OooooOo);
                    TaskActivity.this.Oooo000().setLoadComplete();
                    TaskActivity taskActivity5 = TaskActivity.this;
                    int i4 = taskActivity5.f22065OooooO0;
                    if (i4 == 0 && i4 < taskActivity5.f22064Ooooo0o) {
                        new oO0Oo0oo(TaskActivity.this).show();
                    }
                    TaskActivity taskActivity6 = TaskActivity.this;
                    taskActivity6.f22064Ooooo0o = taskActivity6.f22065OooooO0;
                    taskActivity6.OooOooO().f49076OooO0o.setLoadComplete(true);
                    o0O00O0o o0o00o0oOooO0O0 = o00000O.OooO0O0();
                    ArrayList<TaskModel.TaskInfo> arrayList28 = TaskActivity.this.f22067OooooOo;
                    Intrinsics.checkNotNull(arrayList28);
                    Iterator<TaskModel.TaskInfo> it2 = arrayList28.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            z = false;
                            break;
                        }
                        TaskModel.TaskInfo next2 = it2.next();
                        Intrinsics.checkNotNull(next2);
                        int i5 = next2.takeid;
                        if (i5 == 2 || i5 == 12 || i5 == 26 || i5 == 35) {
                            if (next2.state == 1) {
                                break;
                            }
                        }
                    }
                    o0o00o0oOooO0O0.OooOOo(z);
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
            if (taskActivity.f22063Ooooo00) {
                taskActivity.OooOooO().f49076OooO0o.Oooo0O0(true);
                TaskActivity.this.Oooo000().loadError();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends o00Oo0 {
        public OooOO0() {
        }

        @Override // p654o0ooo.o00Oo0
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            if (!NetworkUtil.f20498OooO00o.OooO0O0()) {
                TaskActivity taskActivity = TaskActivity.this;
                OooO00o oooO00o = TaskActivity.f22061o00Oo0;
                taskActivity.Oooo00o();
            } else {
                TaskActivity taskActivity2 = TaskActivity.this;
                OooO00o oooO00o2 = TaskActivity.f22061o00Oo0;
                taskActivity2.Oooo00o();
                TaskActivity.this.Oooo0();
            }
        }
    }

    public static final class OooOO0O extends o00Oo0 {
        public OooOO0O() {
        }

        @Override // p654o0ooo.o00Oo0
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            StoreActivity.OooOoO(TaskActivity.this, true);
        }
    }

    public static final class OooOOO extends Lambda implements Function0<com.yalla.yalla.ui.activity.main.OooOO0> {
        public OooOOO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final com.yalla.yalla.ui.activity.main.OooOO0 invoke() {
            return new com.yalla.yalla.ui.activity.main.OooOO0(TaskActivity.this);
        }
    }

    public static final class OooOOO0 extends Lambda implements Function0<o0000O> {
        public OooOOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o0000O invoke() {
            return new o0000O(TaskActivity.this);
        }
    }

    public static final o0000O OooOoo(TaskActivity taskActivity) {
        return (o0000O) taskActivity.f22073o0OoOo0.getValue();
    }

    public final c7 OooOooO() {
        return (c7) this.f22062OoooOoo.getValue();
    }

    public final fh OooOooo() {
        return (fh) this.f22074ooOO.getValue();
    }

    public final void Oooo0() {
        OooOo(R.string.title_tasks);
        OooOooO().f49075OooO0Oo.setLayoutManager(new FixLinearLayoutManager(this));
        Oooo000().setLoadErrorClickListener(new OooOO0());
        View viewInflate = View.inflate(this, R.layout.activity_task_foot, null);
        viewInflate.setOnClickListener(new OooOO0O());
        Oooo000().setFooterView(viewInflate);
        OooOooO().f49075OooO0Oo.setAdapter(Oooo000());
        Boolean value = p498o0o00Oo0.OooOOO.f41216OooO00o.OooOooo().getValue();
        if (value != null && value.booleanValue() && p498o0o00Oo0.OooOOO.f41218OooO0OO) {
            OooOooo().f49404OooO0OO.setImageResource(R.drawable.task_check_in_check);
        }
        OooOooo().f49403OooO0O0.setOnClickListener(new oo000o(this, 1));
        Oooo000().setHeaderView(OooOooo().f49402OooO00o);
        OooOooO().f49076OooO0o.OooOoOO(false);
        OooOooO().f49076OooO0o.f12222o000O0Oo = new o0OO00O(this, 2);
    }

    public final com.yalla.yalla.ui.activity.main.OooOO0 Oooo000() {
        return (com.yalla.yalla.ui.activity.main.OooOO0) this.f22069Oooooo0.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final TaskViewModel Oooo00O() {
        return (TaskViewModel) this.f22071Ooooooo.getValue();
    }

    public final void Oooo00o() {
        Oooo00O().taskList(0).observe(this, new OooOo(new OooO0OO(), new OooO0o(), new OooO(), false, 8));
    }

    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity, android.app.Activity
    public final void finish() {
        super.finish();
        this.f22063Ooooo00 = false;
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOooO().f49072OooO00o);
        Oooo0();
        SharedMainMessageManager.INSTANCE.isSignIn().observe(this, new o0o0Oo(this, 1));
        OpenAuthManager openAuthManager = new OpenAuthManager(this);
        this.f22070OoooooO = openAuthManager;
        Intrinsics.checkNotNull(openAuthManager);
        openAuthManager.f21648OooO0O0 = new oOO0O0O0(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        super.onStart();
        this.f22063Ooooo00 = true;
        Oooo00o();
    }
}
