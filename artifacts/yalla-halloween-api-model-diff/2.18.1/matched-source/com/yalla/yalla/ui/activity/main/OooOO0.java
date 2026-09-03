package com.yalla.yalla.ui.activity.main;

import android.app.Activity;
import android.content.Intent;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.Button;
import com.app.base.model.TaskModel;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOOO;
import com.yalla.yalla.common.manager.PackManager;
import com.yalla.yalla.common.manager.RoomState;
import com.yalla.yalla.common.manager.RoomStateManager;
import com.yalla.yalla.common.manager.data.SharedUrlManager;
import com.yalla.yalla.common.manager.data.o00O0O;
import com.yalla.yalla.data.constant.ClientCodeType;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.activity.account.PhoneNumberActivity;
import com.yalla.yalla.ui.activity.main.TaskActivity;
import com.yalla.yalla.ui.activity.message.SearchFriendActivity;
import com.yalla.yalla.ui.activity.room.CreateRoomActivity;
import com.yalla.yalla.ui.activity.room.UpgradeRoomActivity;
import com.yalla.yalla.ui.activity.store.WalletActivity;
import com.yalla.yalla.ui.activity.user.UserInfoEditActivity;
import java.util.Objects;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import o00OO0O0.o0OOO0o;
import o0o0000.OooOo;
import p016OooOoO0.OooOo00;
import p028Oooo0o0.o00O0O0O;
import p028Oooo0o0.o0O0ooO;
import p034OoooO0O.o0Oo0oo;
import p168o00Ooo0.oo000o;
import p254o00ooO0O.o00000O;
import p254o00ooO0O.o000O0O0;
import p391o0OOooOo.o0O00000;
import p623o0oo0oO0.o0000O0;
import p623o0oo0oO0.o0000oo;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOO0 extends p188o00o00o0.OooO0OO<TaskModel.TaskInfo> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ TaskActivity f22045OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0(TaskActivity taskActivity) {
        super(taskActivity, R.layout.item_task);
        this.f22045OooO00o = taskActivity;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(com.chad.library.adapter.base.OooO00o oooO00o, Object obj) {
        String strOooO00o;
        p188o00o00o0.OooO0o helper = (p188o00o00o0.OooO0o) oooO00o;
        final TaskModel.TaskInfo taskInfo = (TaskModel.TaskInfo) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        if (taskInfo == null) {
            return;
        }
        if (taskInfo.typeName != 0) {
            helper.OooO0oO(R.id.ll_type, true);
            helper.OooO(R.id.tv_type_name_task, taskInfo.typeName);
            helper.OooO0oO(R.id.empty_view, helper.getLayoutPosition() > 1);
        } else {
            helper.OooO0oO(R.id.ll_type, false);
        }
        if (taskInfo.rewardMultiple > 1) {
            StringBuilder sbOooO00o = o00O0O0O.OooO00o('x');
            sbOooO00o.append(taskInfo.rewardMultiple);
            helper.OooOO0(R.id.ivDoubleReward, sbOooO00o.toString());
        }
        helper.OooO0oo(R.id.iv_icon_task, taskInfo.icon);
        String strOooO0OO = o000O0O0.OooO0OO(taskInfo.name);
        if (taskInfo.maxNum <= 0 || taskInfo.state != 0) {
            strOooO00o = "";
        } else {
            StringBuilder sbOooO00o2 = o00O0O0O.OooO00o('(');
            sbOooO00o2.append(taskInfo.num);
            sbOooO00o2.append('/');
            strOooO00o = o0O0ooO.OooO00o(sbOooO00o2, taskInfo.maxNum, ')');
            strOooO0OO = OooOo00.OooO0Oo(strOooO0OO, strOooO00o);
        }
        TaskActivity taskActivity = this.f22045OooO00o;
        TaskActivity.OooO00o oooO00o2 = TaskActivity.f22061o00Oo0;
        Objects.requireNonNull(taskActivity);
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) strOooO0OO, strOooO00o, 0, false, 6, (Object) null);
        int length = strOooO00o.length() + iIndexOf$default;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strOooO0OO);
        try {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(o000O000.OooO00o.OooO0O0(taskActivity, R.color.color_999999)), iIndexOf$default, length, 33);
        } catch (Exception e) {
            e.printStackTrace();
        }
        helper.OooOO0(R.id.tv_name_task, spannableStringBuilder);
        int i = taskInfo.takeid;
        helper.OooO0oO(R.id.tvLinkChat, i == 35 || i == 36);
        int i2 = taskInfo.takeid;
        if (i2 == 35) {
            helper.OooO(R.id.tvLinkChat, R.string.main_task_yalla_chat_reward_desc);
        } else if (i2 == 36) {
            helper.OooO(R.id.tvLinkChat, R.string.main_task_link_yalla_chat_desc);
        }
        if (taskInfo.rewardType == 0) {
            helper.OooOO0O(R.id.tv_bonus_task, OooOOO.OooO00o(R.color.color_crystal));
            helper.OooO0oo(R.id.ivReward, R.drawable.icon_crystal_task_item_min);
        } else {
            helper.OooOO0O(R.id.tv_bonus_task, OooOOO.OooO00o(R.color.color_glod));
            helper.OooO0oo(R.id.ivReward, R.drawable.icon_coin_main_slide);
        }
        if (oo000o.OooO0o0()) {
            StringBuilder sb = new StringBuilder();
            sb.append(taskInfo.rewardCoin);
            sb.append('+');
            helper.OooOO0(R.id.tv_bonus_task, sb.toString());
        } else {
            StringBuilder sbOooO00o3 = o00O0O0O.OooO00o('+');
            sbOooO00o3.append(taskInfo.rewardCoin);
            helper.OooOO0(R.id.tv_bonus_task, sbOooO00o3.toString());
        }
        helper.OooO0oO(R.id.tv_bonus_task, taskInfo.takeid != 37);
        helper.OooO0oO(R.id.ivDoubleReward, taskInfo.takeid != 37);
        Button button = (Button) helper.OooO0Oo(R.id.bt_go);
        int i3 = taskInfo.state;
        if (i3 == 0) {
            button.setEnabled(true);
            button.setText(R.string.Go);
            button.setTextColor(OooOOO.OooO00o(R.color.color_00d8c9));
            button.setBackgroundResource(R.drawable.selector_btn_bg_green_line_gray_r12);
        } else if (i3 != 1) {
            button.setEnabled(false);
            button.setText(R.string.task_Done);
            button.setTextColor(OooOOO.OooO00o(R.color.white));
        } else {
            button.setEnabled(true);
            button.setText(R.string.Get);
            button.setTextColor(OooOOO.OooO00o(R.color.white));
            button.setBackgroundResource(R.drawable.selector_btn_bg_green_gray_r12);
        }
        final TaskActivity taskActivity2 = this.f22045OooO00o;
        button.setOnClickListener(new View.OnClickListener() { // from class: o0o0OOoO.oOO0O0O
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TaskModel.TaskInfo taskInfo2 = taskInfo;
                TaskActivity context = taskActivity2;
                Intrinsics.checkNotNullParameter(context, "this$0");
                Intrinsics.checkNotNullParameter(view, "v");
                int i4 = taskInfo2.state;
                if (i4 == 0) {
                    o0O00000.OooO0OO("Me_tasks_sign_go");
                } else if (i4 == 1) {
                    o0O00000.OooO0OO("Me_tasks_sign_get");
                }
                Objects.requireNonNull(context);
                Intrinsics.checkNotNullParameter(taskInfo2, "taskInfo");
                Intrinsics.checkNotNullParameter(view, "view");
                int i5 = taskInfo2.state;
                int i6 = taskInfo2.takeid;
                StringBuilder sbOooO00o4 = o00O0O0O.OooO00o('+');
                sbOooO00o4.append(taskInfo2.rewardCoin * taskInfo2.rewardMultiple);
                String string = sbOooO00o4.toString();
                if (i5 == 2) {
                    return;
                }
                if (i5 == 1) {
                    if (i6 == 35) {
                        o0O00000.OooO0OO("Room_sign_in_yallachat_get");
                    } else if (i6 == 36) {
                        o0O00000.OooO0OO("Room_sign_in_improvement_yallachat_get");
                    }
                    int i7 = taskInfo2.rewardType;
                    BaseActivityK.OooOoo0(context, null, 0L, 3, null);
                    context.Oooo00O().taskGetCoin(i6 + "").observe(context, new OooOo(new oOO0O000(i6, context, (Button) view, i7, string), null, new oOO0O00O(context), false, 10));
                    return;
                }
                if (i6 != 2) {
                    if (i6 == 8) {
                        Intrinsics.checkNotNullParameter(context, "context");
                        context.startActivity(new Intent(context, (Class<?>) CreateRoomActivity.class));
                        return;
                    }
                    if (i6 == 15) {
                        context.finish();
                        LiveEventBus.get("EVENTMSG_TASK_TO_MOMENTS").post(1);
                        LiveEventBus.get("EVENTMSG_DESTORY_WALLET_ACTIVITY").post(Boolean.TRUE);
                        return;
                    }
                    if (i6 != 12) {
                        if (i6 == 13) {
                            Intrinsics.checkNotNullParameter(context, "context");
                            context.startActivity(new Intent(context, (Class<?>) UserInfoEditActivity.class));
                            return;
                        }
                        switch (i6) {
                            case 17:
                                context.finish();
                                context.startActivity(new Intent(context, (Class<?>) SearchFriendActivity.class));
                                context.finish();
                                LiveEventBus.get("EVENTMSG_TASK_TO_MAIN").post(0);
                                LiveEventBus.get("EVENTMSG_DESTORY_WALLET_ACTIVITY").post(Boolean.TRUE);
                                return;
                            case 18:
                                context.finish();
                                LiveEventBus.get("EVENTMSG_TASK_TO_MAIN").post(0);
                                LiveEventBus.get("EVENTMSG_DESTORY_WALLET_ACTIVITY").post(Boolean.TRUE);
                                return;
                            case 19:
                            case 20:
                                break;
                            default:
                                switch (i6) {
                                    case 22:
                                        ClientCodeType clientCodeType = ClientCodeType.BingingPhone;
                                        Intrinsics.checkNotNullParameter(context, "context");
                                        Intent intent = new Intent(context, (Class<?>) PhoneNumberActivity.class);
                                        intent.putExtra("PHONE_NUMBER", (String) null);
                                        intent.putExtra("TYPE_ACCOUNT", clientCodeType);
                                        context.startActivity(intent);
                                        break;
                                    case 23:
                                        oOO0OOO onLogin = new oOO0OOO(context);
                                        Intrinsics.checkNotNullParameter(onLogin, "onLogin");
                                        if (!Intrinsics.areEqual(p498o0o00Oo0.OooOOO.f41216OooO00o.OooOooO().getValue(), Boolean.TRUE)) {
                                            Activity activityOooO0O0 = o00000O.f34254OooO00o.OooO0O0();
                                            if (activityOooO0O0 != null) {
                                                o0OOO0o.OooO0O0(activityOooO0O0, d.R, activityOooO0O0, LoginActivity.class);
                                            }
                                        } else {
                                            onLogin.invoke();
                                        }
                                        break;
                                    case 24:
                                        Intrinsics.checkNotNullParameter(context, "context");
                                        Intent intent2 = new Intent(context, (Class<?>) WalletActivity.class);
                                        p606o0oo0O.OooOo.OooO0OO("205001", MapsKt.mapOf(new Pair("url", "TaskActivity")));
                                        intent2.putExtra("FromInfo", "TaskActivity");
                                        context.startActivity(intent2);
                                        break;
                                    case 25:
                                        UpgradeRoomActivity.OooOoOO(context);
                                        break;
                                    case 26:
                                    case 31:
                                    case 32:
                                        break;
                                    case 27:
                                        break;
                                    case 28:
                                        context.finish();
                                        o0Oo0oo.OooO0o0(159, null);
                                        LiveEventBus.get("EVENTMSG_DESTORY_WALLET_ACTIVITY").post(Boolean.TRUE);
                                        break;
                                    case 29:
                                    case 30:
                                        LiveEventBus.get("EVENTMSG_TASK_TO_MOMENTS").post(1);
                                        context.finish();
                                        break;
                                    default:
                                        switch (i6) {
                                            case 35:
                                                o0O00000.OooO0OO("Room_sign_in_yallachat_unlock");
                                                oOO0Oo00 action = new oOO0Oo00(context);
                                                o0000oo notInstall = o0000oo.f48642Oooo0o;
                                                Intrinsics.checkNotNullParameter(notInstall, "notInstall");
                                                Intrinsics.checkNotNullParameter(action, "action");
                                                if (!PackManager.INSTANCE.isInstalledYallaChat()) {
                                                    Objects.requireNonNull(notInstall);
                                                    Unit unit = Unit.INSTANCE;
                                                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getMain(), null, new o0000O0.OooO00o.C0419OooO00o(null), 2, null);
                                                } else {
                                                    action.invoke();
                                                }
                                                break;
                                            case 36:
                                                o0O00000.OooO0OO("Room_sign_in_improvement_yallachat_go");
                                                oOO0OoO0 action2 = new oOO0OoO0(context);
                                                o0000oo notInstall2 = o0000oo.f48642Oooo0o;
                                                Intrinsics.checkNotNullParameter(notInstall2, "notInstall");
                                                Intrinsics.checkNotNullParameter(action2, "action");
                                                if (!PackManager.INSTANCE.isInstalledYallaChat()) {
                                                    Objects.requireNonNull(notInstall2);
                                                    Unit unit2 = Unit.INSTANCE;
                                                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getMain(), null, new o0000O0.OooO00o.C0419OooO00o(null), 2, null);
                                                } else {
                                                    action2.invoke();
                                                }
                                                break;
                                            case 37:
                                                SharedUrlManager.INSTANCE.getYallachatTreeUrl().observe(context, o00O0O.f20630OooO0OO);
                                                break;
                                        }
                                        break;
                                }
                        }
                        context.finish();
                        LiveEventBus.get("EVENTMSG_TASK_TO_MAIN").post(0);
                        LiveEventBus.get("EVENTMSG_DESTORY_WALLET_ACTIVITY").post(Boolean.TRUE);
                        return;
                    }
                }
                Boolean value = p498o0o00Oo0.OooOOO.f41216OooO00o.OooOooo().getValue();
                if (value == null || !value.booleanValue() || RoomStateManager.INSTANCE.getRoomState() == RoomState.InRoom) {
                    LiveEventBus.get("EVENTMSG_DESTORY_WALLET_ACTIVITY").post(Boolean.TRUE);
                } else {
                    context.Oooo00O().getRoomInfoFromTaskEnter().observe(context, new OooOo(oOO0OO0O.f43702Oooo0o, null, new oOO0OO(context), false, 10));
                }
                LiveEventBus.get("EVENTMSG_TASK_TO_MAIN").post(0);
                context.finish();
            }
        });
    }
}
