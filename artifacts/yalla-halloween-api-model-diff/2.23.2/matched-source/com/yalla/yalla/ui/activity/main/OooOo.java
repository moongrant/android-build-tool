package com.yalla.yalla.ui.activity.main;

import android.app.Activity;
import android.content.Intent;
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
import o0oo0000.OooO00o;
import p384o0OOoo0O.o000oOoO;
import p475o0Ooooo0.o0O00oO0;
import p545o0oO0O00.OooOo00;
import p562o0oOo000.o000000;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.o0OOO0o;
import p562o0oOo000.o0Oo0oo;
import p569o0oOo0o0.o0ooOOo;
import p571o0oOoO0.o0000oo;
import p583o0oOoo00.o00000OO;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOo extends o0000oo<TaskModel.TaskInfo> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ TaskActivity f25000OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOo(TaskActivity taskActivity, int i) {
        super(taskActivity, i);
        this.f25000OooOoo0 = taskActivity;
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
            helper.setGone(o0OO00O.ll_type, true);
            helper.setText(o0OO00O.tv_type_name_task, taskInfo.typeName);
            helper.setGone(o0OO00O.empty_view, helper.getLayoutPosition() > 1);
        } else {
            helper.setGone(o0OO00O.ll_type, false);
        }
        int i = taskInfo.rewardMultiple;
        if (i > 1) {
            helper.setText(o0OO00O.ivDoubleReward, "x" + i);
        }
        helper.setImageResource(o0OO00O.iv_icon_task, taskInfo.icon);
        String strOooO0OO = o0000.OooO0OO(taskInfo.name);
        int i2 = taskInfo.maxNum;
        if (i2 <= 0 || taskInfo.state != 0) {
            str = "";
        } else {
            str = "(" + taskInfo.num + "/" + i2 + ")";
            strOooO0OO = androidx.camera.core.impl.OooOOOO.OooO00o(strOooO0OO, str);
        }
        int i3 = o0OO00O.tv_name_task;
        int i4 = TaskActivity.f25083OooOooO;
        final TaskActivity taskActivity = this.f25000OooOoo0;
        taskActivity.getClass();
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) strOooO0OO, str, 0, false, 6, (Object) null);
        int length = str.length() + iIndexOf$default;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strOooO0OO);
        try {
            int i5 = o0OOO0o.color_999999;
            Object obj2 = ContextCompat.f5281OooO00o;
            spannableStringBuilder.setSpan(new ForegroundColorSpan(ContextCompat.OooO0o.OooO00o(taskActivity, i5)), iIndexOf$default, length, 33);
        } catch (Exception e) {
            e.printStackTrace();
        }
        helper.setText(i3, spannableStringBuilder);
        if (taskInfo.subtitle > 0) {
            int i6 = o0OO00O.tvLinkChat;
            helper.setGone(i6, true);
            helper.setText(i6, taskInfo.subtitle);
        } else {
            helper.setGone(o0OO00O.tvLinkChat, false);
        }
        if (taskInfo.rewardType == 0) {
            helper.setTextColor(o0OO00O.tv_bonus_task, o0000.OooO00o(o0OOO0o.color_crystal));
            helper.setImageResource(o0OO00O.ivReward, o0Oo0oo.icon_crystal_task_item_min);
        } else {
            helper.setTextColor(o0OO00O.tv_bonus_task, o0000.OooO00o(o0OOO0o.color_glod));
            helper.setImageResource(o0OO00O.ivReward, o0Oo0oo.icon_coin_main_slide);
        }
        if (p595o0oo00O.OooOo00.OooO0o0()) {
            helper.setText(o0OO00O.tv_bonus_task, taskInfo.rewardCoin + "+");
        } else {
            helper.setText(o0OO00O.tv_bonus_task, "+" + taskInfo.rewardCoin);
        }
        helper.setGone(o0OO00O.tv_bonus_task, taskInfo.takeid != 37);
        helper.setGone(o0OO00O.ivDoubleReward, taskInfo.takeid != 37);
        Button button = (Button) helper.getView(o0OO00O.bt_go);
        int i7 = taskInfo.state;
        if (i7 == 0) {
            button.setEnabled(true);
            button.setText(o000000.Go);
            button.setTextColor(o0000.OooO00o(o0OOO0o.color_00d8c9));
            button.setBackgroundResource(o0Oo0oo.selector_btn_bg_green_line_gray_r12);
        } else if (i7 != 1) {
            button.setEnabled(false);
            button.setText(o000000.task_Done);
            button.setTextColor(o0000.OooO00o(o0OOO0o.white));
        } else {
            button.setEnabled(true);
            button.setText(o000000.Get);
            button.setTextColor(o0000.OooO00o(o0OOO0o.white));
            button.setBackgroundResource(o0Oo0oo.selector_btn_bg_green_gray_r12);
        }
        button.setOnClickListener(new View.OnClickListener() { // from class: o0o00O.o00OOO0
            /* JADX WARN: Code duplicated, block: B:67:0x0284  */
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
                            OooO00o.OooO0OO("101078", MapsKt.mapOf(new Pair("type", 1)));
                        } else {
                            OooO00o.OooO0OO("101076", MapsKt.mapOf(new Pair("type", 1)));
                        }
                    }
                } else if (taskInfo2.takeid == 35) {
                    OooO00o.OooO0OO("101077", MapsKt.mapOf(new Pair("type", 1)));
                } else {
                    OooO00o.OooO0OO("101075", MapsKt.mapOf(new Pair("type", 1)));
                }
                context.getClass();
                Intrinsics.checkNotNullParameter(taskInfo2, "taskInfo");
                Intrinsics.checkNotNullParameter(view, "view");
                int i9 = taskInfo2.state;
                int i10 = taskInfo2.takeid;
                String strOooO00o = android.support.v4.media.OooO00o.OooO00o("+", taskInfo2.rewardCoin * taskInfo2.rewardMultiple);
                if (i9 == 2) {
                    return;
                }
                o0ooOOo o0ooooo = null;
                ViewModelLazy viewModelLazy = context.f25091OooOoO0;
                if (i9 == 1) {
                    Button button2 = (Button) view;
                    int i11 = taskInfo2.rewardType;
                    BaseActivityK.OooOo0o(context, null, 0L, 3);
                    TaskViewModel taskViewModel = (TaskViewModel) viewModelLazy.getValue();
                    StringBuilder sb = new StringBuilder();
                    sb.append(i10);
                    taskViewModel.taskGetCoin(sb.toString()).observe(context, new o000oOoO(new o00OO0OO(i10, context, button2, i11, strOooO00o), null, new oo0O(context), false, 10));
                    return;
                }
                int i12 = MainActivity.f24940OooOoo;
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
                                        OooO00o.OooO0OO("205001", MapsKt.mapOf(new Pair("url", strOooO0OO2)));
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
                                        OooOo00.OooO0O0(159, null);
                                        LiveEventBus.get("EVENTMSG_DESTORY_WALLET_ACTIVITY").post(Boolean.TRUE);
                                        break;
                                    case 29:
                                    case 30:
                                        MainActivity.OooO00o.OooO00o(context, 0, 6);
                                        LiveEventBus.get("EVENTMSG_TASK_TO_MOMENTS").post(2);
                                        break;
                                    default:
                                        o0oo0o.o000oOoO.OooO00o oooO00o = p614o0oo0o.o000oOoO.f57513OooO0O0;
                                        switch (i10) {
                                            case 35:
                                                o0oo0o.o000oOoO.OooO00o.OooO00o(oooO00o, new o00OOOO0(context));
                                                break;
                                            case 36:
                                                o0oo0o.o000oOoO.OooO00o.OooO00o(oooO00o, new o00OOOOo(context));
                                                break;
                                            case 37:
                                                o00000OO.f56675OooOOo0.observe(context, new TaskActivity.OooOo00(o00Oo00.f48832OooO0Oo));
                                                break;
                                            case 39:
                                                o0ooOOo o0ooooo2 = p569o0oOo0o0.o00000OO.f56398OooO00o;
                                                if (o0ooooo2 != null) {
                                                    o0ooooo = o0ooooo2;
                                                } else {
                                                    Intrinsics.throwUninitializedPropertyAccessException("account");
                                                }
                                                o0ooooo.OooO0O0();
                                                break;
                                        }
                                        break;
                                }
                                o0o0Oo onLogin = new o0o0Oo(context);
                                Intrinsics.checkNotNullParameter(onLogin, "onLogin");
                                o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                                if (Intrinsics.areEqual(o0O00oO0.OooOo0O().getValue(), Boolean.TRUE)) {
                                    onLogin.invoke();
                                    break;
                                } else {
                                    Activity activityOooO0O0 = OooO0O0.OooO0O0();
                                    if (activityOooO0O0 != null) {
                                        int i13 = LoginActivity.f24727OooOo0O;
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
                o0O00oO0 o0o00oo2 = o0O00oO0.f47936OooO00o;
                Boolean bool = (Boolean) o0O00oO0.OooOo0o().getValue();
                if (bool == null || !bool.booleanValue()) {
                    LiveEventBus.get("EVENTMSG_DESTORY_WALLET_ACTIVITY").post(Boolean.TRUE);
                } else {
                    MutableState mutableState = p429o0OoOO.o0Oo0oo.f46817OooO00o;
                    if (p429o0OoOO.o0Oo0oo.OooO0oO() != RoomState.InRoom) {
                        ((TaskViewModel) viewModelLazy.getValue()).getRoomInfoFromTaskEnter().observe(context, new o000oOoO(o00OOO0O.f48827OooO0Oo, null, new Oooo000(context), false, 10));
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
