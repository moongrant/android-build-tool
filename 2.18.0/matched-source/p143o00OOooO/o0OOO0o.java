package p143o00OOooO;

import OooO00o.OooO0OO;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.util.SparseArray;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.viewpager2.widget.ViewPager2;
import com.app.base.fragment.MainMomentFollowingFragment;
import com.app.base.fragment.room.RoomInfoProfileFragment;
import com.app.base.mixedroom.MixedRoomActivity;
import com.app.base.model.CategoryModel;
import com.app.base.view.HeaderLayout;
import com.app.base.view.indicator.YlTableLayout;
import com.code.android.util.ToastUtil;
import com.facebook.internal.OooOO0;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooO;
import com.yalla.support.common.util.OooOo00;
import com.yalla.support.common.util.o00O0O;
import com.yalla.yalla.common.model.ApiError;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.common.model.Error;
import com.yalla.yalla.common.model.Response;
import com.yalla.yalla.common.model.SupportInfo;
import com.yalla.yalla.model.DeleteAccountParamsModel;
import com.yalla.yalla.model.EventModel;
import com.yalla.yalla.model.MomentDetailModel;
import com.yalla.yalla.model.TaskModel;
import com.yalla.yalla.model.TopicInfoModel;
import com.yalla.yalla.ui.activity.account.DeleteAccountCheckActivity;
import com.yalla.yalla.ui.activity.account.DeleteAccountSubmitActivity;
import com.yalla.yalla.ui.activity.main.TaskActivity;
import com.yalla.yalla.ui.activity.moment.PostDetailActivity;
import com.yalla.yalla.ui.activity.moment.TopicDetailActivity;
import com.yalla.yalla.ui.activity.room.ExploreTagRoomListActivity;
import com.yalla.yalla.ui.activity.user.SupportTopActivity;
import com.yalla.yalla.ui.dialog.TreasureBoxDialog;
import com.yalla.yalla.ui.fragment.ExploreTagRoomListFragment;
import com.yalla.yalla.ui.fragment.TopicPostPopularFragment;
import com.yalla.yalla.ui.vm.event.EventMineViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import o0o0000.OooOOOO;
import p074o000O0oo.OooOOO;
import p169o00Ooo0.oo000o;
import p184o00o000O.OooO0O0;
import p255o00ooO0O.o000O0O0;
import p255o00ooO0O.o00O000;
import p255o00ooO0O.o0O0ooO;
import p255o00ooO0O.oOO00O;
import p504o0o00o0.o0000O;
import p540o0o0Oo0.o0O0OO0;
import p560o0oOOoo.oo0O;
import p581o0oOoOOo.oOo0o0oO;
import p619o0oo0o.o00O00;
import p619o0oo0o.o00O00O;
import p632o0ooO00.o000O0Oo;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0OOO0o implements Observer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f31995OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f31996OooO0O0;

    public /* synthetic */ o0OOO0o(Object obj, int i) {
        this.f31995OooO00o = i;
        this.f31996OooO0O0 = obj;
    }

    /* JADX WARN: Code duplicated, block: B:213:0x06f9  */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i;
        int i2;
        StringBuilder sbOooO0O0;
        List<SupportInfo.UserData> data;
        EventModel eventModel;
        List<T> list;
        switch (this.f31995OooO00o) {
            case 0:
                MainMomentFollowingFragment.m11initObserver$lambda1((MainMomentFollowingFragment) this.f31996OooO0O0, (MomentDetailModel) obj);
                break;
            case 1:
                boolean z = true;
                RoomInfoProfileFragment this$0 = (RoomInfoProfileFragment) this.f31996OooO0O0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.getLoadingVM().f48299OooO00o.f45575OooO00o.setValue(Boolean.FALSE);
                String strOooO0OO = o000O0O0.OooO0OO(R.string.Following_room_profile_toast);
                ToastUtil toastUtil = ToastUtil.f12583OooO0O0;
                if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                    z = false;
                }
                if (!z) {
                    o0O0ooO o0o0oooOooO0O0 = OooOOO.OooO0O0(toastUtil, strOooO0OO, "runnable");
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        o0o0oooOooO0O0.run();
                    } else {
                        o00O000 o00o001 = o00O000.f34368OooO00o;
                        o00O000.f34370OooO0OO.post(o0o0oooOooO0O0);
                    }
                    break;
                }
                break;
            case 2:
                boolean z2 = true;
                DeleteAccountCheckActivity activity = (DeleteAccountCheckActivity) this.f31996OooO0O0;
                Response response = (Response) obj;
                DeleteAccountCheckActivity.OooO00o oooO00o = DeleteAccountCheckActivity.f21753Ooooooo;
                Intrinsics.checkNotNullParameter(activity, "this$0");
                activity.OooOoO();
                if (response.getIsSuccess() && Intrinsics.areEqual(response.getData(), "1")) {
                    String string = activity.getResources().getString(R.string.account_verification_success);
                    ToastUtil toastUtil2 = ToastUtil.f12583OooO0O0;
                    if (string != null && !StringsKt.isBlank(string)) {
                        z2 = false;
                    }
                    if (!z2) {
                        o0O0ooO o0o0oooOooO0O1 = OooOOO.OooO0O0(toastUtil2, string, "runnable");
                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o0o0oooOooO0O1.run();
                        } else {
                            o00O000 o00o002 = o00O000.f34368OooO00o;
                            o00O000.f34370OooO0OO.post(o0o0oooOooO0O1);
                        }
                    }
                    DeleteAccountParamsModel deleteAccountParamsModel = (DeleteAccountParamsModel) activity.getIntent().getParcelableExtra("DELETE_REASON_TYPE");
                    Intrinsics.checkNotNullParameter(activity, "activity");
                    Intent intent = new Intent(activity, (Class<?>) DeleteAccountSubmitActivity.class);
                    intent.putExtra("DELETE_REASON_TYPE", deleteAccountParamsModel);
                    activity.startActivity(intent);
                    activity.finish();
                    break;
                } else {
                    String string2 = activity.getResources().getString(R.string.account_averification_failed);
                    ToastUtil toastUtil3 = ToastUtil.f12583OooO0O0;
                    if (string2 != null && !StringsKt.isBlank(string2)) {
                        z2 = false;
                    }
                    if (!z2) {
                        o0O0ooO o0o0oooOooO0O2 = OooOOO.OooO0O0(toastUtil3, string2, "runnable");
                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o0o0oooOooO0O2.run();
                        } else {
                            o00O000 o00o003 = o00O000.f34368OooO00o;
                            o00O000.f34370OooO0OO.post(o0o0oooOooO0O2);
                        }
                        break;
                    }
                }
                break;
            case 3:
                TaskActivity this$1 = (TaskActivity) this.f31996OooO0O0;
                ApiResult apiResult = (ApiResult) obj;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                if (apiResult.isSuccess()) {
                    TaskActivity.OooO00o oooO00o2 = TaskActivity.f22080o00ooo;
                    this$1.OooOooO().f49012OooO0Oo.postDelayed(new OooOO0(this$1, 1), 1000L);
                } else {
                    ((o0000O) this$1.f22089o00Oo0.getValue()).dismiss();
                    ApiError error = apiResult.getError();
                    Intrinsics.checkNotNullParameter(error, "error");
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooOOOO(error, null), 3, null);
                }
                break;
            case 4:
                PostDetailActivity this$2 = (PostDetailActivity) this.f31996OooO0O0;
                Boolean it = (Boolean) obj;
                PostDetailActivity.OooO00o oooO00o3 = PostDetailActivity.f22436o000000O;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                Intrinsics.checkNotNullExpressionValue(it, "it");
                this$2.Oooo0oO(it.booleanValue());
                break;
            case 5:
                TopicDetailActivity this$3 = (TopicDetailActivity) this.f31996OooO0O0;
                Response response2 = (Response) obj;
                TopicDetailActivity.OooO00o oooO00o4 = TopicDetailActivity.f22586o00Oo0;
                Intrinsics.checkNotNullParameter(this$3, "this$0");
                if (response2.getIsSuccess()) {
                    if (response2.getData() != null) {
                        Object data2 = response2.getData();
                        Intrinsics.checkNotNull(data2);
                        this$3.Oooo00o((TopicInfoModel) data2);
                    }
                }
                if (!response2.getIsSuccess()) {
                    Error error2 = response2.getError();
                    Integer code2 = error2 != null ? error2.getCode() : null;
                    if (code2 != null && code2.intValue() == 4006) {
                        HeaderLayout headerLayout = this$3.f11480OoooOOO;
                        if (headerLayout != null) {
                            headerLayout.OooOoOO(0, o0O0OO0.f44027Oooo);
                        }
                        CoordinatorLayout coordinatorLayout = this$3.OooOooo().f51014OooO0OO;
                        Intrinsics.checkNotNullExpressionValue(coordinatorLayout, "binding.clTopics");
                        oOO00O.OooO00o(coordinatorLayout);
                        ImageView imageView = this$3.OooOooo().f51016OooO0o;
                        Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivCreate");
                        oOO00O.OooO00o(imageView);
                        LinearLayout linearLayout = this$3.OooOooo().f51015OooO0Oo.f50929OooO00o;
                        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.emptyLayout.root");
                        oOO00O.OooO(linearLayout);
                    }
                }
                break;
            case 6:
                ExploreTagRoomListActivity this$4 = (ExploreTagRoomListActivity) this.f31996OooO0O0;
                ExploreTagRoomListActivity.OooO00o oooO00o5 = ExploreTagRoomListActivity.f22837o00O0O;
                Intrinsics.checkNotNullParameter(this$4, "this$0");
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.MutableList<com.app.base.model.CategoryModel>");
                List listAsMutableList = TypeIntrinsics.asMutableList(obj);
                this$4.f22839OooooOO.clear();
                this$4.f22840OooooOo.clear();
                this$4.f22842Oooooo0.clear();
                if (listAsMutableList.size() > 0) {
                    int size = listAsMutableList.size();
                    i = 0;
                    int i3 = 0;
                    while (i3 < size) {
                        int i4 = this$4.f22843OoooooO;
                        String str = ((CategoryModel) listAsMutableList.get(i3)).id;
                        Intrinsics.checkNotNullExpressionValue(str, "data[index].id");
                        if (i4 == OooO.OooO0o0(str)) {
                            this$4.OooOoO0(((CategoryModel) listAsMutableList.get(i3)).labelname);
                            i2 = i3;
                        } else {
                            i2 = i;
                        }
                        List<String> list2 = this$4.f22840OooooOo;
                        if (oo000o.OooO0o0()) {
                            sbOooO0O0 = new StringBuilder();
                            sbOooO0O0.append(((CategoryModel) listAsMutableList.get(i3)).labelname);
                            sbOooO0O0.append('#');
                        } else {
                            sbOooO0O0 = OooO0OO.OooO0O0('#');
                            sbOooO0O0.append(((CategoryModel) listAsMutableList.get(i3)).labelname);
                        }
                        list2.add(sbOooO0O0.toString());
                        try {
                            Result.Companion companion = Result.INSTANCE;
                            List<Fragment> list3 = this$4.f22842Oooooo0;
                            String str2 = ((CategoryModel) listAsMutableList.get(i3)).id;
                            Intrinsics.checkNotNullExpressionValue(str2, "data[index].id");
                            Result.m502constructorimpl(Boolean.valueOf(list3.add(new ExploreTagRoomListFragment(OooO.OooO0o0(str2)))));
                        } catch (Throwable th) {
                            Result.Companion companion2 = Result.INSTANCE;
                            Result.m502constructorimpl(ResultKt.createFailure(th));
                        }
                        i3++;
                        i = i2;
                    }
                    ConstraintLayout constraintLayout = this$4.OooOoo().f49381OooO0Oo;
                    Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.topLayout");
                    o00O0O.OooO(constraintLayout);
                    this$4.f22839OooooOO.addAll(listAsMutableList);
                } else {
                    ConstraintLayout constraintLayout2 = this$4.OooOoo().f49381OooO0Oo;
                    Intrinsics.checkNotNullExpressionValue(constraintLayout2, "binding.topLayout");
                    o00O0O.OooO00o(constraintLayout2);
                    i = 0;
                }
                Context context = this$4.OooOoo().f49383OooO0o0.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "binding.vpMoreRoom.context");
                Intrinsics.checkNotNullParameter(context, "context");
                OooO0O0.OooO00o oooO00o6 = new OooO0O0.OooO00o(context);
                oooO00o6.OooO0O0(this$4.f22840OooooOo);
                oooO00o6.f33004OooO0o = o000O0O0.OooO00o(R.color.color_333333);
                oooO00o6.f33006OooO0oO = o000O0O0.OooO00o(R.color.color_999999);
                float f = 8;
                oooO00o6.f33018OooOo0 = OooOo00.OooO00o(f);
                oooO00o6.f33005OooO0o0 = 15.0f;
                oooO00o6.f33003OooO0Oo = 15.0f;
                oooO00o6.f33019OooOo00 = OooOo00.OooO00o(f);
                oooO00o6.f33006OooO0oO = o000O0O0.OooO00o(R.color.color_alpha_38_A3);
                ViewPager2 viewPager2 = this$4.OooOoo().f49383OooO0o0;
                Intrinsics.checkNotNullExpressionValue(viewPager2, "binding.vpMoreRoom");
                oooO00o6.OooO0Oo(viewPager2);
                oooO00o6.f33007OooO0oo = OooOo00.OooO00o(2);
                oooO00o6.f32999OooO = o000O0O0.OooO00o(R.color.color_00d8c9);
                oooO00o6.f33008OooOO0 = OooOo00.OooO00o(11);
                oooO00o6.f33009OooOO0O = OooOo00.OooO00o(3);
                oooO00o6.f33001OooO0O0.setAdjustMode(false);
                YlTableLayout ylTableLayout = this$4.OooOoo().f49382OooO0o;
                Intrinsics.checkNotNullExpressionValue(ylTableLayout, "binding.ylMoreRoom");
                oooO00o6.OooO00o(ylTableLayout);
                this$4.OooOoo().f49383OooO0o0.setOffscreenPageLimit(this$4.f22842Oooooo0.size());
                this$4.OooOoo().f49383OooO0o0.setAdapter(this$4.f22844Ooooooo);
                this$4.OooOoo().f49383OooO0o0.setCurrentItem(i);
                break;
            case 7:
                oo0O.f44845OooO00o.OooO0O0(true, (MixedRoomActivity) this.f31996OooO0O0);
                break;
            case 8:
                SupportTopActivity this$5 = (SupportTopActivity) this.f31996OooO0O0;
                Response response3 = (Response) obj;
                SupportTopActivity.OooO00o oooO00o7 = SupportTopActivity.f23430Oooooo0;
                Intrinsics.checkNotNullParameter(this$5, "this$0");
                if (response3.getIsSuccess() && response3.getData() != null) {
                    SupportInfo supportInfo = (SupportInfo) response3.getData();
                    String updateAt = supportInfo != null ? supportInfo.getUpdateAt() : null;
                    SupportInfo supportInfo2 = (SupportInfo) response3.getData();
                    if (supportInfo2 != null && (data = supportInfo2.getData()) != null) {
                        this$5.OooOoo().f50268OooO0Oo.setText("" + updateAt + " (GMT+2)");
                        p189o00o00o0.OooO0OO<SupportInfo.UserData> oooO0OO = this$5.f23433OooooOo;
                        if (oooO0OO == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("adapter");
                            oooO0OO = null;
                        }
                        oooO0OO.setNewData(data);
                        p189o00o00o0.OooO0OO<SupportInfo.UserData> oooO0OO2 = this$5.f23433OooooOo;
                        if (oooO0OO2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("adapter");
                            oooO0OO2 = null;
                        }
                        oooO0OO2.setLoadComplete();
                        this$5.OooOoo().f50266OooO0O0.Oooo0o0(true, true, true);
                        break;
                    }
                }
                break;
            case 9:
                oOo0o0oO this$6 = (oOo0o0oO) this.f31996OooO0O0;
                Response response4 = (Response) obj;
                Intrinsics.checkNotNullParameter(this$6, "this$0");
                if (response4.getIsSuccess() && response4.getData() != null) {
                    Object data3 = response4.getData();
                    Intrinsics.checkNotNull(data3);
                    if (((List) data3).size() > 0) {
                        p189o00o00o0.OooO0OO<TaskModel> oooO0OO3 = this$6.f46213OooooOO;
                        if (oooO0OO3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("adapter");
                            oooO0OO3 = null;
                        }
                        Object data4 = response4.getData();
                        Intrinsics.checkNotNull(data4);
                        List<TaskModel> data5 = (List) data4;
                        Intrinsics.checkNotNullParameter(data5, "data");
                        SparseArray<TaskModel> sparseArray = new SparseArray<>();
                        o00O00O.f48573OooO00o = sparseArray;
                        sparseArray.append(37, new TaskModel(37, R.drawable.ic_task_plant_trees, R.string.main_task_planting_trees, null, 0, 0, 0, 0, 0, 0, 0, 0, 4088, null));
                        sparseArray.append(2, new TaskModel(2, R.drawable.mic2_copy, R.string.task_leave_your_footsteps_in_bar, null, 0, 0, 0, 0, 0, 0, 0, 0, 4088, null));
                        sparseArray.append(3, new TaskModel(3, R.drawable.fb2_copy, R.string.share_balala_to_facebook, null, 0, 0, 0, 0, 0, 0, 0, 0, 4088, null));
                        sparseArray.append(12, new TaskModel(12, R.drawable.gift1_2_copy, R.string.task_present_in_room, null, 0, 0, 0, 0, 0, 0, 0, 0, 4088, null));
                        sparseArray.append(21, new TaskModel(21, R.drawable.icon_task_online_20, R.string.Online_time_over_20mins, null, 0, 0, 0, 0, 0, 0, 0, 0, 4088, null));
                        sparseArray.append(26, new TaskModel(26, R.drawable.icon_task_share_room, R.string.task_26, null, 0, 0, 0, 0, 0, 0, 0, 0, 4088, null));
                        sparseArray.append(35, new TaskModel(35, R.drawable.icon_task_35, R.string.main_task_yalla_chat_reward, null, 0, 0, 0, 0, 0, 0, 0, 0, 4088, null));
                        for (TaskModel taskModel : data5) {
                            if (taskModel.getState() < 2 || taskModel.isOneTime() != 1) {
                                SparseArray<TaskModel> sparseArray2 = o00O00O.f48573OooO00o;
                                if (sparseArray2 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("taskInfoSparseArray");
                                    sparseArray2 = null;
                                }
                                TaskModel taskModel2 = sparseArray2.get(taskModel.getTakeId());
                                if (taskModel2 != null) {
                                    taskModel2.setGetcrystal(taskModel.getGetcrystal());
                                    taskModel2.setRewardCoin(taskModel.getRewardCoin());
                                    taskModel2.setRewardType(taskModel.getRewardType());
                                    taskModel2.setOneTime(taskModel.isOneTime());
                                    taskModel2.setState(taskModel.getState());
                                    taskModel2.setNum(taskModel.getNum());
                                    taskModel2.setRewardMultiple(taskModel.getRewardMultiple());
                                }
                            }
                        }
                        ArrayList<TaskModel> arrayList = new ArrayList<>();
                        o00O00O.f48574OooO0O0 = arrayList;
                        SparseArray<TaskModel> sparseArray3 = o00O00O.f48573OooO00o;
                        if (sparseArray3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("taskInfoSparseArray");
                            sparseArray3 = null;
                        }
                        arrayList.add(sparseArray3.get(37));
                        ArrayList<TaskModel> arrayList2 = o00O00O.f48574OooO0O0;
                        if (arrayList2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("taskInfo");
                            arrayList2 = null;
                        }
                        SparseArray<TaskModel> sparseArray4 = o00O00O.f48573OooO00o;
                        if (sparseArray4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("taskInfoSparseArray");
                            sparseArray4 = null;
                        }
                        arrayList2.add(sparseArray4.get(2));
                        ArrayList<TaskModel> arrayList3 = o00O00O.f48574OooO0O0;
                        if (arrayList3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("taskInfo");
                            arrayList3 = null;
                        }
                        SparseArray<TaskModel> sparseArray5 = o00O00O.f48573OooO00o;
                        if (sparseArray5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("taskInfoSparseArray");
                            sparseArray5 = null;
                        }
                        arrayList3.add(sparseArray5.get(12));
                        ArrayList<TaskModel> arrayList4 = o00O00O.f48574OooO0O0;
                        if (arrayList4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("taskInfo");
                            arrayList4 = null;
                        }
                        SparseArray<TaskModel> sparseArray6 = o00O00O.f48573OooO00o;
                        if (sparseArray6 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("taskInfoSparseArray");
                            sparseArray6 = null;
                        }
                        arrayList4.add(sparseArray6.get(21));
                        ArrayList<TaskModel> arrayList5 = o00O00O.f48574OooO0O0;
                        if (arrayList5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("taskInfo");
                            arrayList5 = null;
                        }
                        SparseArray<TaskModel> sparseArray7 = o00O00O.f48573OooO00o;
                        if (sparseArray7 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("taskInfoSparseArray");
                            sparseArray7 = null;
                        }
                        arrayList5.add(sparseArray7.get(26));
                        ArrayList<TaskModel> arrayList6 = o00O00O.f48574OooO0O0;
                        if (arrayList6 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("taskInfo");
                            arrayList6 = null;
                        }
                        SparseArray<TaskModel> sparseArray8 = o00O00O.f48573OooO00o;
                        if (sparseArray8 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("taskInfoSparseArray");
                            sparseArray8 = null;
                        }
                        arrayList6.add(sparseArray8.get(35));
                        ArrayList<TaskModel> arrayList7 = o00O00O.f48574OooO0O0;
                        if (arrayList7 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("taskInfo");
                            arrayList7 = null;
                        }
                        CollectionsKt.removeAll((List) arrayList7, (Function1) o00O00.f48565Oooo);
                        ArrayList<TaskModel> arrayList8 = o00O00O.f48574OooO0O0;
                        if (arrayList8 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("taskInfo");
                            arrayList8 = null;
                        }
                        oooO0OO3.setNewData(arrayList8);
                        p189o00o00o0.OooO0OO<TaskModel> oooO0OO4 = this$6.f46213OooooOO;
                        if (oooO0OO4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("adapter");
                            oooO0OO4 = null;
                        }
                        oooO0OO4.setLoadComplete();
                    }
                }
                this$6.OooOOo();
                break;
            case 10:
                TreasureBoxDialog this$7 = (TreasureBoxDialog) this.f31996OooO0O0;
                Intrinsics.checkNotNullParameter(this$7, "this$0");
                this$7.OooOO0o();
                break;
            case 11:
                TopicPostPopularFragment.m417initObserve$lambda9((TopicPostPopularFragment) this.f31996OooO0O0, (Long) obj);
                break;
            default:
                Object obj2 = null;
                EventMineViewModel mineVM = (EventMineViewModel) this.f31996OooO0O0;
                Long l = (Long) obj;
                Intrinsics.checkNotNullParameter(mineVM, "$mineVM");
                o000O0Oo<EventModel> mineEventPager = mineVM.getMineEventPager();
                for (Object obj3 : mineEventPager.f48702OooO0Oo) {
                    if (l != null && ((EventModel) obj3).getId() == l.longValue()) {
                        obj2 = obj3;
                        eventModel = (EventModel) obj2;
                        list = mineEventPager.f48702OooO0Oo;
                        if (eventModel == null) {
                            list.remove(eventModel);
                            mineEventPager.OooO0O0();
                            break;
                        }
                    }
                }
                eventModel = (EventModel) obj2;
                list = mineEventPager.f48702OooO0Oo;
                if (eventModel == null) {
                    list.remove(eventModel);
                    mineEventPager.OooO0O0();
                    break;
                }
                break;
        }
    }
}
