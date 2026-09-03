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
import p270o00oooo0.o0O0OO0;
import p386o0OOoo0O.o0OoOo0;
import p474o0OoooOO.oo0oO0;
import p565o0oOo000.o000OOo;
import p565o0oOo000.o0OOO0o;
import p565o0oOo000.o0Oo0oo;
import p565o0oOo000.o0ooOOo;
import p570o0oOo0o.o000O0;
import p571o0oOo0o0.o000oOoO;
import p571o0oOo0o0.o0O0O00;
import p585o0oOoo00.o00000OO;
import p593o0oOoooO.h0;
import p607o0oo0O0O.o0O0OOO0;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOo extends o000O0<TaskModel.TaskInfo> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ TaskActivity f25001OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOo(TaskActivity taskActivity, int i) {
        super(taskActivity, i);
        this.f25001OooOoo0 = taskActivity;
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
            helper.setGone(o0Oo0oo.ll_type, true);
            helper.setText(o0Oo0oo.tv_type_name_task, taskInfo.typeName);
            helper.setGone(o0Oo0oo.empty_view, helper.getLayoutPosition() > 1);
        } else {
            helper.setGone(o0Oo0oo.ll_type, false);
        }
        int i = taskInfo.rewardMultiple;
        if (i > 1) {
            helper.setText(o0Oo0oo.ivDoubleReward, "x" + i);
        }
        helper.setImageResource(o0Oo0oo.iv_icon_task, taskInfo.icon);
        String strOooO0OO = o0000.OooO0OO(taskInfo.name);
        int i2 = taskInfo.maxNum;
        if (i2 <= 0 || taskInfo.state != 0) {
            str = "";
        } else {
            str = "(" + taskInfo.num + "/" + i2 + ")";
            strOooO0OO = androidx.camera.core.impl.OooOOOO.OooO00o(strOooO0OO, str);
        }
        int i3 = o0Oo0oo.tv_name_task;
        int i4 = TaskActivity.f25084OooOooO;
        final TaskActivity taskActivity = this.f25001OooOoo0;
        taskActivity.getClass();
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) strOooO0OO, str, 0, false, 6, (Object) null);
        int length = str.length() + iIndexOf$default;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strOooO0OO);
        try {
            int i5 = o0ooOOo.color_999999;
            Object obj2 = ContextCompat.f5284OooO00o;
            spannableStringBuilder.setSpan(new ForegroundColorSpan(ContextCompat.OooO0o.OooO00o(taskActivity, i5)), iIndexOf$default, length, 33);
        } catch (Exception e) {
            e.printStackTrace();
        }
        helper.setText(i3, spannableStringBuilder);
        if (taskInfo.subtitle > 0) {
            int i6 = o0Oo0oo.tvLinkChat;
            helper.setGone(i6, true);
            helper.setText(i6, taskInfo.subtitle);
        } else {
            helper.setGone(o0Oo0oo.tvLinkChat, false);
        }
        if (taskInfo.rewardType == 0) {
            helper.setTextColor(o0Oo0oo.tv_bonus_task, o0000.OooO00o(o0ooOOo.color_crystal));
            helper.setImageResource(o0Oo0oo.ivReward, o0OOO0o.icon_crystal_task_item_min);
        } else {
            helper.setTextColor(o0Oo0oo.tv_bonus_task, o0000.OooO00o(o0ooOOo.color_glod));
            helper.setImageResource(o0Oo0oo.ivReward, o0OOO0o.icon_coin_main_slide);
        }
        if (p596o0oo000O.OooO0o.OooO0o0()) {
            helper.setText(o0Oo0oo.tv_bonus_task, taskInfo.rewardCoin + "+");
        } else {
            helper.setText(o0Oo0oo.tv_bonus_task, "+" + taskInfo.rewardCoin);
        }
        helper.setGone(o0Oo0oo.tv_bonus_task, taskInfo.takeid != 37);
        helper.setGone(o0Oo0oo.ivDoubleReward, taskInfo.takeid != 37);
        Button button = (Button) helper.getView(o0Oo0oo.bt_go);
        int i7 = taskInfo.state;
        if (i7 == 0) {
            button.setEnabled(true);
            button.setText(o000OOo.Go);
            button.setTextColor(o0000.OooO00o(o0ooOOo.color_00d8c9));
            button.setBackgroundResource(o0OOO0o.selector_btn_bg_green_line_gray_r12);
        } else if (i7 != 1) {
            button.setEnabled(false);
            button.setText(o000OOo.task_Done);
            button.setTextColor(o0000.OooO00o(o0ooOOo.white));
        } else {
            button.setEnabled(true);
            button.setText(o000OOo.Get);
            button.setTextColor(o0000.OooO00o(o0ooOOo.white));
            button.setBackgroundResource(o0OOO0o.selector_btn_bg_green_gray_r12);
        }
        button.setOnClickListener(new View.OnClickListener() { // from class: o0o00O0O.o0o0Oo
            /* JADX WARN: Code duplicated, block: B:67:0x0288  */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TaskActivity context = taskActivity;
                Intrinsics.checkNotNullParameter(context, "this$0");
                Intrinsics.checkNotNullParameter(view, "v");
                TaskModel.TaskInfo taskInfo2 = taskInfo;
                int i8 = taskInfo2.state;
                if (i8 != 0) {
                    if (i8 == 1) {
                        if (taskInfo2.takeid == 35) {
                            h0.OooO0OO("101078", MapsKt.mapOf(new Pair("type", 1)));
                        } else {
                            h0.OooO0OO("101076", MapsKt.mapOf(new Pair("type", 1)));
                        }
                    }
                } else if (taskInfo2.takeid == 35) {
                    h0.OooO0OO("101077", MapsKt.mapOf(new Pair("type", 1)));
                } else {
                    h0.OooO0OO("101075", MapsKt.mapOf(new Pair("type", 1)));
                }
                context.getClass();
                Intrinsics.checkNotNullParameter(taskInfo2, "taskInfo");
                Intrinsics.checkNotNullParameter(view, "view");
                int i9 = taskInfo2.state;
                int i10 = taskInfo2.takeid;
                String strOooO00o = OooO00o.OooO00o("+", taskInfo2.rewardCoin * taskInfo2.rewardMultiple);
                if (i9 == 2) {
                    return;
                }
                o000oOoO o000oooo2 = null;
                ViewModelLazy viewModelLazy = context.f25092OooOoO0;
                if (i9 == 1) {
                    Button button2 = (Button) view;
                    int i11 = taskInfo2.rewardType;
                    BaseActivityK.OooOo0o(context, null, 0L, 3);
                    TaskViewModel taskViewModel = (TaskViewModel) viewModelLazy.getValue();
                    StringBuilder sb = new StringBuilder();
                    sb.append(i10);
                    taskViewModel.taskGetCoin(sb.toString()).observe(context, new o0OoOo0(new o00OO(i10, context, button2, i11, strOooO00o), null, new o00OOO00(context), false, 10));
                    return;
                }
                int i12 = MainActivity.f24941OooOoo;
                if (i10 != 2) {
                    if (i10 == 8) {
                        Intrinsics.checkNotNullParameter(context, "context");
                        context.startActivity(new Intent(context, (Class<?>) CreateRoomActivity.class));
                        return;
                    }
                    if (i10 == 15) {
                        MainActivity.OooO00o.OooO00o(context, 0, 6);
                        LiveEventBus.get("EVENTMSG_TASK_TO_MOMENTS").post(2);
                        LiveEventBus.get("EVENTMSG_DESTORY_WALLET_ACTIVITY").post(Boolean.TRUE);
                        return;
                    }
                    if (i10 != 12) {
                        if (i10 == 13) {
                            Intrinsics.checkNotNullParameter(context, "context");
                            context.startActivity(new Intent(context, (Class<?>) UserInfoEditActivity.class));
                            return;
                        }
                        switch (i10) {
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
                                switch (i10) {
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
                                        h0.OooO0OO("205001", MapsKt.mapOf(new Pair("url", strOooO0OO2)));
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
                                        o0O0OO0.OooO0OO(159, null);
                                        LiveEventBus.get("EVENTMSG_DESTORY_WALLET_ACTIVITY").post(Boolean.TRUE);
                                        break;
                                    case 29:
                                    case 30:
                                        MainActivity.OooO00o.OooO00o(context, 0, 6);
                                        LiveEventBus.get("EVENTMSG_TASK_TO_MOMENTS").post(2);
                                        break;
                                    default:
                                        o0O0OOO0.OooO00o oooO00o = o0O0OOO0.f56969OooO0O0;
                                        switch (i10) {
                                            case 35:
                                                o0O0OOO0.OooO00o.OooO00o(oooO00o, new o00Oo00(context));
                                                break;
                                            case 36:
                                                o0O0OOO0.OooO00o.OooO00o(oooO00o, new o0oOO(context));
                                                break;
                                            case 37:
                                                o00000OO.f56632OooOOo0.observe(context, new TaskActivity.OooOo00(o0O00o0.f48994OooO0Oo));
                                                break;
                                            case 39:
                                                o000oOoO o000oooo3 = o0O0O00.f56323OooO00o;
                                                if (o000oooo3 != null) {
                                                    o000oooo2 = o000oooo3;
                                                } else {
                                                    Intrinsics.throwUninitializedPropertyAccessException("account");
                                                }
                                                o000oooo2.OooO0O0();
                                                break;
                                        }
                                        break;
                                }
                                o00OOOOo onLogin = new o00OOOOo(context);
                                Intrinsics.checkNotNullParameter(onLogin, "onLogin");
                                oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
                                if (Intrinsics.areEqual(oo0oO0.OooOo0O().getValue(), Boolean.TRUE)) {
                                    onLogin.invoke();
                                    break;
                                } else {
                                    Activity activityOooO0O0 = OooO0O0.OooO0O0();
                                    if (activityOooO0O0 != null) {
                                        int i13 = LoginActivity.f24734OooOo0O;
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
                oo0oO0 oo0oo1 = oo0oO0.f47967OooO00o;
                Boolean bool = (Boolean) oo0oO0.OooOo0o().getValue();
                if (bool == null || !bool.booleanValue()) {
                    LiveEventBus.get("EVENTMSG_DESTORY_WALLET_ACTIVITY").post(Boolean.TRUE);
                } else {
                    MutableState mutableState = p431o0OoOO.o0Oo0oo.f46817OooO00o;
                    if (p431o0OoOO.o0Oo0oo.OooO0oO() != RoomState.InRoom) {
                        ((TaskViewModel) viewModelLazy.getValue()).getRoomInfoFromTaskEnter().observe(context, new o0OoOo0(o00OOOO0.f48973OooO0Oo, null, new Oooo000(context), false, 10));
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
