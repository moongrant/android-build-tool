package com.yalla.yalla.ui.activity.main;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.media.OooO00o;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.Button;
import androidx.compose.runtime.MutableState;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.ViewModelLazy;
import com.chad.library.adapter.base.BaseViewHolder;
import com.code.android.util.OooO0O0;
import com.code.android.util.o0000;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.squareup.okhttp.OooOo;
import com.yalla.yalla.data.constant.ClientCodeType;
import com.yalla.yalla.manager.RoomState;
import com.yalla.yalla.model.TaskModel;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.activity.account.PhoneNumberActivity;
import com.yalla.yalla.ui.activity.main.MainActivity;
import com.yalla.yalla.ui.activity.main.Oooo000;
import com.yalla.yalla.ui.activity.main.TaskActivity;
import com.yalla.yalla.ui.activity.message.SearchFriendActivity;
import com.yalla.yalla.ui.activity.room.CreateRoomActivity;
import com.yalla.yalla.ui.activity.room.UpgradeRoomActivity;
import com.yalla.yalla.ui.activity.store.WalletActivity;
import com.yalla.yalla.ui.activity.user.UserInfoEditActivity;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import com.yalla.yalla.ui.vm.main.TaskViewModel;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import p377o0OOoOo.o0000OO0;
import p402o0Oo0OOO.o00O000o;
import p427o0OoOO00.o0OOO0o;
import p464o0Oooo.o000000O;
import p564o0oOo0OO.o000O;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p587o0oOooo.o0OO000;
import p602o0oo0O0O.o000OO;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOo extends o000O<TaskModel.TaskInfo> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ TaskActivity f25454OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOo(TaskActivity taskActivity, int i) {
        super(taskActivity, i);
        this.f25454OooOoo0 = taskActivity;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        String str;
        ViewHolder helper = (ViewHolder) baseViewHolder;
        final TaskModel.TaskInfo taskInfo = (TaskModel.TaskInfo) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        if (taskInfo == null) {
            return;
        }
        if (taskInfo.typeName != 0) {
            helper.setGone(oO00O0oO.ll_type, true);
            helper.setText(oO00O0oO.tv_type_name_task, taskInfo.typeName);
            helper.setGone(oO00O0oO.empty_view, helper.getLayoutPosition() > 1);
        } else {
            helper.setGone(oO00O0oO.ll_type, false);
        }
        int i = taskInfo.rewardMultiple;
        if (i > 1) {
            helper.setText(oO00O0oO.ivDoubleReward, "x" + i);
        }
        helper.setImageResource(oO00O0oO.iv_icon_task, taskInfo.icon);
        String strOooO0OO = o0000.OooO0OO(taskInfo.name);
        int i2 = taskInfo.maxNum;
        if (i2 <= 0 || taskInfo.state != 0) {
            str = "";
        } else {
            str = "(" + taskInfo.num + "/" + i2 + ")";
            strOooO0OO = androidx.camera.core.impl.OooOOOO.OooO00o(strOooO0OO, str);
        }
        int i3 = oO00O0oO.tv_name_task;
        int i4 = TaskActivity.f25537OooOooO;
        final TaskActivity taskActivity = this.f25454OooOoo0;
        taskActivity.getClass();
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) strOooO0OO, str, 0, false, 6, (Object) null);
        int length = str.length() + iIndexOf$default;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strOooO0OO);
        try {
            int i5 = oO00O0o.color_999999;
            Object obj2 = ContextCompat.f5271OooO00o;
            spannableStringBuilder.setSpan(new ForegroundColorSpan(ContextCompat.OooO0o.OooO00o(taskActivity, i5)), iIndexOf$default, length, 33);
        } catch (Exception e) {
            e.printStackTrace();
        }
        helper.setText(i3, spannableStringBuilder);
        int i6 = oO00O0oO.tvLinkChat;
        int i7 = taskInfo.takeid;
        helper.setGone(i6, i7 == 35 || i7 == 36);
        int i8 = taskInfo.takeid;
        if (i8 == 35) {
            helper.setText(i6, oO00OOo0.main_task_yalla_chat_reward_desc);
        } else if (i8 == 36) {
            helper.setText(i6, oO00OOo0.main_task_link_yalla_chat_desc);
        }
        if (taskInfo.rewardType == 0) {
            helper.setTextColor(oO00O0oO.tv_bonus_task, o0000.OooO00o(oO00O0o.color_crystal));
            helper.setImageResource(oO00O0oO.ivReward, oOo00OO0.icon_crystal_task_item_min);
        } else {
            helper.setTextColor(oO00O0oO.tv_bonus_task, o0000.OooO00o(oO00O0o.color_glod));
            helper.setImageResource(oO00O0oO.ivReward, oOo00OO0.icon_coin_main_slide);
        }
        if (p591o0oo000O.OooO.OooO0o0()) {
            helper.setText(oO00O0oO.tv_bonus_task, taskInfo.rewardCoin + "+");
        } else {
            helper.setText(oO00O0oO.tv_bonus_task, "+" + taskInfo.rewardCoin);
        }
        helper.setGone(oO00O0oO.tv_bonus_task, taskInfo.takeid != 37);
        helper.setGone(oO00O0oO.ivDoubleReward, taskInfo.takeid != 37);
        Button button = (Button) helper.getView(oO00O0oO.bt_go);
        int i9 = taskInfo.state;
        if (i9 == 0) {
            button.setEnabled(true);
            button.setText(oO00OOo0.Go);
            button.setTextColor(o0000.OooO00o(oO00O0o.color_00d8c9));
            button.setBackgroundResource(oOo00OO0.selector_btn_bg_green_line_gray_r12);
        } else if (i9 != 1) {
            button.setEnabled(false);
            button.setText(oO00OOo0.task_Done);
            button.setTextColor(o0000.OooO00o(oO00O0o.white));
        } else {
            button.setEnabled(true);
            button.setText(oO00OOo0.Get);
            button.setTextColor(o0000.OooO00o(oO00O0o.white));
            button.setBackgroundResource(oOo00OO0.selector_btn_bg_green_gray_r12);
        }
        button.setOnClickListener(new View.OnClickListener() { // from class: o0o00O00.o00OOOO0
            /* JADX WARN: Code duplicated, block: B:62:0x0275  */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TaskActivity context = taskActivity;
                Intrinsics.checkNotNullParameter(context, "this$0");
                Intrinsics.checkNotNullParameter(view, "v");
                TaskModel.TaskInfo taskInfo2 = taskInfo;
                int i10 = taskInfo2.state;
                if (i10 != 0) {
                    if (i10 == 1) {
                        if (taskInfo2.takeid == 35) {
                            o0OO000.OooO0O0("101078", MapsKt.mapOf(new Pair("type", 1)));
                        } else {
                            o0OO000.OooO0O0("101076", MapsKt.mapOf(new Pair("type", 1)));
                        }
                    }
                } else if (taskInfo2.takeid == 35) {
                    o0OO000.OooO0O0("101077", MapsKt.mapOf(new Pair("type", 1)));
                } else {
                    o0OO000.OooO0O0("101075", MapsKt.mapOf(new Pair("type", 1)));
                }
                context.getClass();
                Intrinsics.checkNotNullParameter(taskInfo2, "taskInfo");
                Intrinsics.checkNotNullParameter(view, "view");
                int i11 = taskInfo2.state;
                int i12 = taskInfo2.takeid;
                String strOooO00o = OooO00o.OooO00o("+", taskInfo2.rewardCoin * taskInfo2.rewardMultiple);
                if (i11 == 2) {
                    return;
                }
                ViewModelLazy viewModelLazy = context.f25545OooOoO0;
                if (i11 == 1) {
                    Button button2 = (Button) view;
                    int i13 = taskInfo2.rewardType;
                    BaseActivityK.OooOo0o(context, null, 0L, 3);
                    TaskViewModel taskViewModel = (TaskViewModel) viewModelLazy.getValue();
                    StringBuilder sb = new StringBuilder();
                    sb.append(i12);
                    taskViewModel.taskGetCoin(sb.toString()).observe(context, new o0000OO0(new o00OOO00(i12, context, button2, i13, strOooO00o), null, new o00OOO0(context), false, 10));
                    return;
                }
                int i14 = MainActivity.f25394OooOoo;
                if (i12 != 2) {
                    if (i12 == 8) {
                        Intrinsics.checkNotNullParameter(context, "context");
                        context.startActivity(new Intent(context, (Class<?>) CreateRoomActivity.class));
                        return;
                    }
                    if (i12 == 15) {
                        MainActivity.OooO00o.OooO00o(context, 0, 6);
                        LiveEventBus.get("EVENTMSG_TASK_TO_MOMENTS").post(2);
                        LiveEventBus.get("EVENTMSG_DESTORY_WALLET_ACTIVITY").post(Boolean.TRUE);
                        return;
                    }
                    if (i12 != 12) {
                        if (i12 == 13) {
                            Intrinsics.checkNotNullParameter(context, "context");
                            context.startActivity(new Intent(context, (Class<?>) UserInfoEditActivity.class));
                            return;
                        }
                        switch (i12) {
                            case 17:
                                context.startActivity(new Intent(context, (Class<?>) SearchFriendActivity.class));
                                LiveEventBus.get("EVENTMSG_TASK_TO_MAIN").post(0);
                                LiveEventBus.get("EVENTMSG_DESTORY_WALLET_ACTIVITY").post(Boolean.TRUE);
                                break;
                            case 18:
                                MainActivity.OooO00o.OooO00o(context, 0, 6);
                                LiveEventBus.get("EVENTMSG_TASK_TO_MAIN").post(0);
                                LiveEventBus.get("EVENTMSG_DESTORY_WALLET_ACTIVITY").post(Boolean.TRUE);
                                break;
                            default:
                                switch (i12) {
                                    case 22:
                                        ClientCodeType clientCodeType = ClientCodeType.BingingPhone;
                                        Intrinsics.checkNotNullParameter(context, "context");
                                        Intent intent = new Intent(context, (Class<?>) PhoneNumberActivity.class);
                                        intent.putExtra("PHONE_NUMBER", (String) null);
                                        intent.putExtra("TYPE_ACCOUNT", clientCodeType);
                                        context.startActivity(intent);
                                        break;
                                    case 23:
                                        break;
                                    case 24:
                                        Intrinsics.checkNotNullParameter(context, "context");
                                        Intent intent2 = new Intent(context, (Class<?>) WalletActivity.class);
                                        String strOooO0OO2 = OooO0O0.OooO0OO();
                                        LiveEventBus.get("RechargeFromUserInfo_OK").post(Boolean.TRUE);
                                        o0OO000.OooO0O0("205001", MapsKt.mapOf(new Pair("url", strOooO0OO2)));
                                        intent2.putExtra("FromInfo", strOooO0OO2);
                                        context.startActivity(intent2);
                                        break;
                                    case 25:
                                        UpgradeRoomActivity.OooOo0O(context);
                                        break;
                                    case 26:
                                    case 31:
                                    case 32:
                                        break;
                                    case 27:
                                        break;
                                    case 28:
                                        OooOo.OooO0OO(159, null);
                                        LiveEventBus.get("EVENTMSG_DESTORY_WALLET_ACTIVITY").post(Boolean.TRUE);
                                        break;
                                    case 29:
                                    case 30:
                                        MainActivity.OooO00o.OooO00o(context, 0, 6);
                                        LiveEventBus.get("EVENTMSG_TASK_TO_MOMENTS").post(2);
                                        break;
                                    default:
                                        o000OO.OooO00o oooO00o = o000OO.f56890OooO0O0;
                                        switch (i12) {
                                            case 35:
                                                o000OO.OooO00o.OooO00o(oooO00o, new o0oOO(context));
                                                break;
                                            case 36:
                                                o000OO.OooO00o.OooO00o(oooO00o, new o0O00o0(context));
                                                break;
                                            case 37:
                                                o00O000o.f44506OooOOo0.observe(context, new TaskActivity.OooOo00(oo00oO.f48410OooO0Oo));
                                                break;
                                        }
                                        break;
                                }
                                o00Oo00 onLogin = new o00Oo00(context);
                                Intrinsics.checkNotNullParameter(onLogin, "onLogin");
                                o000000O o000000o2 = o000000O.f46674OooO00o;
                                if (Intrinsics.areEqual(o000000O.OooOo0O().getValue(), Boolean.TRUE)) {
                                    onLogin.invoke();
                                    break;
                                } else {
                                    Activity activityOooO0O0 = OooO0O0.OooO0O0();
                                    if (activityOooO0O0 != null) {
                                        int i15 = LoginActivity.f25186OooOo0O;
                                        LoginActivity.OooO00o.OooO00o(activityOooO0O0);
                                    }
                                    break;
                                }
                            case 19:
                            case 20:
                                MainActivity.OooO00o.OooO00o(context, 0, 6);
                                LiveEventBus.get("EVENTMSG_TASK_TO_MAIN").post(0);
                                LiveEventBus.get("EVENTMSG_DESTORY_WALLET_ACTIVITY").post(Boolean.TRUE);
                                break;
                        }
                    }
                }
                o000000O o000000o3 = o000000O.f46674OooO00o;
                Boolean bool = (Boolean) o000000O.OooOo0o().getValue();
                if (bool == null || !bool.booleanValue()) {
                    LiveEventBus.get("EVENTMSG_DESTORY_WALLET_ACTIVITY").post(Boolean.TRUE);
                } else {
                    MutableState mutableState = o0OOO0o.f45698OooO00o;
                    if (o0OOO0o.OooO0oO() != RoomState.InRoom) {
                        ((TaskViewModel) viewModelLazy.getValue()).getRoomInfoFromTaskEnter().observe(context, new o0000OO0(o00OOOOo.f48327OooO0Oo, null, new Oooo000(context), false, 10));
                    } else {
                        LiveEventBus.get("EVENTMSG_DESTORY_WALLET_ACTIVITY").post(Boolean.TRUE);
                    }
                }
                LiveEventBus.get("EVENTMSG_TASK_TO_MAIN").post(0);
                MainActivity.OooO00o.OooO00o(context, 0, 6);
            }
        });
    }
}
