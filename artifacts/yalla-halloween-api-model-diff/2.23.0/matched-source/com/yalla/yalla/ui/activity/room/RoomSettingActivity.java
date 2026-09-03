package com.yalla.yalla.ui.activity.room;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.app.base.protobuf.room.Room;
import com.app.base.protobuf.room.RoomMike;
import com.app.selectPicture.view.FixLinearLayoutManager;
import com.chad.library.adapter.base.BaseViewHolder;
import com.facebook.appevents.AppEventsConstants;
import com.google.gson.reflect.TypeToken;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.app.golbalData.ApiTagUtils;
import com.yalla.yalla.data.constant.FeedbackType;
import com.yalla.yalla.mixedroom.MixedRoomDataSource;
import com.yalla.yalla.mixedroom.model.RoomConfiguration;
import com.yalla.yalla.model.CategoryModel;
import com.yalla.yalla.model.ProfileLimitModel;
import com.yalla.yalla.model.SelectDialogModel;
import com.yalla.yalla.model.WebFrom;
import com.yalla.yalla.model.bean.AbsJavaBeanApi;
import com.yalla.yalla.model.room.RoomIndexModel;
import com.yalla.yalla.model.room.RoomItemInfoModel;
import com.yalla.yalla.model.room.RoomItemInfoModelTag;
import com.yalla.yalla.service.room.RoomLiveService;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.main.WebActivity;
import com.yalla.yalla.ui.fragment.ContributionFragment;
import com.yalla.yalla.ui.screen.room.RoomUserActionRecordScreen;
import com.yalla.yalla.ui.view.HeaderLayout;
import com.yalla.yalla.ui.view.pop.memberFee.MemberFeeModel;
import com.yalla.yalla.ui.view.pop.selectPop.SelectItemModel;
import com.yalla.yalla.ui.view.pop.selectPop.SelectModel;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import com.yalla.yalla.ui.vm.RoomInfoEditVM;
import com.yalla.yalla.util.WebPageInfo;
import com.yalla.yalla.util.permission.PermissionGroupReveal;
import com.zego.zegoavkit2.ZegoConstants;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.io.ConstantsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p519o0o0O0oO.O0000000;
import p579o0oOoo.oOo00OO0;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oO00OOo0;
import p640o0ooOOO0.oO00o000;
import p641o0ooOOOO.n0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/yalla/yalla/ui/activity/room/RoomSettingActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "OooO00o", "OooO0O0", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRoomSettingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomSettingActivity.kt\ncom/yalla/yalla/ui/activity/room/RoomSettingActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n*L\n1#1,1013:1\n22#2,2:1014\n*S KotlinDebug\n*F\n+ 1 RoomSettingActivity.kt\ncom/yalla/yalla/ui/activity/room/RoomSettingActivity\n*L\n83#1:1014,2\n*E\n"})
public final class RoomSettingActivity extends BaseActivityK {

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public static final /* synthetic */ int f26645Oooo00O = 0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @Nullable
    public O0000000 f26647OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @Nullable
    public RoomConfiguration f26648OooOo0;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @Nullable
    public SelectModel f26650OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @Nullable
    public MemberFeeModel f26651OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f26653OooOoO0;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public RoomInfoEditVM f26655OooOoo;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public boolean f26658OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public boolean f26659Oooo000;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final com.code.android.util.o000O0Oo f26646OooOOoo = new com.code.android.util.o000O0Oo(Reflection.getOrCreateKotlinClass(n0.class), this, null);

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final ArrayList f26649OooOo00 = new ArrayList();

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<ProfileLimitModel> f26652OooOoO = new MutableLiveData<>();

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<ProfileLimitModel> f26654OooOoOO = new MutableLiveData<>();

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<ProfileLimitModel> f26656OooOoo0 = new MutableLiveData<>();

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    @NotNull
    public final Lazy f26657OooOooO = LazyKt.lazy(new OooO0o());

    public static final class OooO extends Lambda implements Function2<RoomItemInfoModel, Integer, Unit> {
        public OooO() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(RoomItemInfoModel roomItemInfoModel, Integer num) {
            RoomItemInfoModel roomInfoDetailModel = roomItemInfoModel;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(roomInfoDetailModel, "roomInfoDetailModel");
            int i = RoomSettingActivity.f26645Oooo00O;
            RoomSettingActivity.this.OooOoO(roomInfoDetailModel, iIntValue);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o {
        @JvmStatic
        public static void OooO00o(@Nullable final Activity activity, @Nullable String str) {
            if ((str == null || str.length() == 0) || str == null) {
                return;
            }
            p377o0OOoOo.o000O00O o000o00o2 = p377o0OOoOo.o000O0O0.f44226OooO00o;
            com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0 oooO0O0 = new com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0() { // from class: com.yalla.yalla.ui.activity.room.RoomSettingActivity$Companion$getRoomInfoApi$1$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
                public final void OooO0o0(@NotNull String response) {
                    Intrinsics.checkNotNullParameter(response, "response");
                    Object objOooO0O0 = oOo00OO0.OooO0O0(response, new TypeToken<AbsJavaBeanApi<RoomConfiguration>>() { // from class: com.yalla.yalla.ui.activity.room.RoomSettingActivity$Companion$getRoomInfoApi$1$1$onFinish$result$1
                    }.getType());
                    Intrinsics.checkNotNullExpressionValue(objOooO0O0, "fromJson(response, objec…omConfiguration?>?>() {})");
                    RoomConfiguration roomConfiguration = (RoomConfiguration) ((AbsJavaBeanApi) objOooO0O0).data;
                    if (roomConfiguration != null) {
                        com.yalla.yalla.service.room.OooO0O0.f24995OoooOOO.OooO00o().f24997OooO.setValue(roomConfiguration);
                        Activity activity2 = activity;
                        Intent intent = new Intent(activity2, (Class<?>) RoomSettingActivity.class);
                        intent.putExtra("Module", roomConfiguration);
                        if (activity2 != null) {
                            activity2.startActivityForResult(intent, 104);
                        }
                    }
                }
            };
            LinkedHashMap linkedHashMapOooO00o = oO00o000.OooO00o();
            linkedHashMapOooO00o.put("barid", str);
            com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0(null, p377o0OOoOo.o0000O.f44100OooOoo, "/Webservers/Bar/RoomInfo", linkedHashMapOooO00o, oooO0O0);
        }
    }

    @SuppressLint({"UseSwitchCompatOrMaterialCode"})
    public static final class OooO0O0 extends p564o0oOo0OO.o000O<RoomItemInfoModel> {

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        @NotNull
        public final Drawable f26662OooOoo;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        @Nullable
        public Function2<? super RoomItemInfoModel, ? super Integer, Unit> f26663OooOoo0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(@NotNull RoomSettingActivity context) {
            super(context, oO00OO0O.item_room_info_detail);
            Intrinsics.checkNotNullParameter(context, "context");
            this.f26662OooOoo = com.code.android.util.o0000.OooO0O0(p584o0oOooO0.oOo00OO0.common_warning_tip);
        }

        /* JADX WARN: Code duplicated, block: B:15:0x0125  */
        /* JADX WARN: Code duplicated, block: B:18:0x013a  */
        /* JADX WARN: Code duplicated, block: B:19:0x013c  */
        /* JADX WARN: Code duplicated, block: B:21:0x013f  */
        /* JADX WARN: Code duplicated, block: B:24:0x0164  */
        /* JADX WARN: Code duplicated, block: B:28:0x017f  */
        /* JADX WARN: Code duplicated, block: B:30:0x0187  */
        /* JADX WARN: Code duplicated, block: B:33:0x01ae  */
        /* JADX WARN: Code duplicated, block: B:34:0x01c2  */
        /* JADX WARN: Code duplicated, block: B:37:0x01c9  */
        /* JADX WARN: Code duplicated, block: B:40:0x01dd  */
        /* JADX WARN: Code duplicated, block: B:41:0x01e9  */
        /* JADX WARN: Code duplicated, block: B:44:0x01f1  */
        /* JADX WARN: Code duplicated, block: B:47:0x0208  */
        /* JADX WARN: Code duplicated, block: B:49:0x0210  */
        /* JADX WARN: Code duplicated, block: B:50:0x0223  */
        /* JADX WARN: Code duplicated, block: B:51:0x022c  */
        /* JADX WARN: Code duplicated, block: B:55:0x0239  */
        /* JADX WARN: Code duplicated, block: B:57:0x0243  */
        /* JADX WARN: Code duplicated, block: B:58:0x0247  */
        /* JADX WARN: Code duplicated, block: B:60:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Instruction removed from duplicated block: B:30:0x0187, please report this as an issue */
        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
            TextView textView;
            NetImageView netImageView;
            boolean z;
            ProfileLimitModel profileLimitModel;
            int i;
            int i2;
            Boolean isTurnOnSwitch;
            TextView textView2;
            int i3;
            int i4;
            final ViewHolder helper = (ViewHolder) baseViewHolder;
            final RoomItemInfoModel model = (RoomItemInfoModel) obj;
            Intrinsics.checkNotNullParameter(helper, "helper");
            Intrinsics.checkNotNullParameter(model, "model");
            TextView tvTitle = (TextView) helper.getView(oO00O0oO.tvTitle);
            TextView textView3 = (TextView) helper.getView(oO00O0oO.tvBottom);
            TextView textView4 = (TextView) helper.getView(oO00O0oO.tvRedPoint);
            NetImageView netImageView2 = (NetImageView) helper.getView(oO00O0oO.ivHead);
            Switch r7 = (Switch) helper.getView(oO00O0oO.switchEnterRoomAllow);
            TextView textView5 = (TextView) helper.getView(oO00O0oO.tvGet);
            TextView textView6 = (TextView) helper.getView(oO00O0oO.tvContent);
            TextView textView7 = (TextView) helper.getView(oO00O0oO.tvContentYellow);
            ImageView imageView = (ImageView) helper.getView(oO00O0oO.ivArrow);
            View view = helper.getView(oO00O0oO.viewLine0);
            View view2 = helper.getView(oO00O0oO.viewLine1);
            View view3 = helper.getView(oO00O0oO.viewLine10);
            r7.setClickable(false);
            r7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.yalla.yalla.ui.activity.room.o00O0OOO
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                    Function2<? super RoomItemInfoModel, ? super Integer, Unit> function2;
                    RoomSettingActivity.OooO0O0 this$0 = this.f26875OooO00o;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    RoomItemInfoModel model2 = model;
                    Intrinsics.checkNotNullParameter(model2, "$model");
                    ViewHolder helper2 = helper;
                    Intrinsics.checkNotNullParameter(helper2, "$helper");
                    if (compoundButton.isPressed() && (function2 = this$0.f26663OooOoo0) != null) {
                        function2.invoke(model2, Integer.valueOf(helper2.getLayoutPosition()));
                    }
                }
            });
            netImageView2.setImageDrawable(null);
            netImageView2.setVisibility(8);
            tvTitle.setText("");
            Intrinsics.checkNotNullExpressionValue(tvTitle, "tvTitle");
            p417o0OoO0.o000O0o.OooO0o(tvTitle, null);
            textView4.setVisibility(8);
            textView6.setText("");
            textView6.setVisibility(8);
            textView7.setText("");
            textView7.setVisibility(8);
            textView5.setVisibility(8);
            view.setVisibility(8);
            view2.setVisibility(0);
            view3.setVisibility(0);
            r7.setVisibility(8);
            textView3.setVisibility(8);
            imageView.setVisibility(0);
            if (model.getShowRedPoint()) {
                textView4.setVisibility(0);
            } else {
                textView4.setVisibility(8);
            }
            RoomItemInfoModelTag roomItemInfoModelTag = RoomItemInfoModelTag.Head;
            RoomItemInfoModelTag tag = model.getTag();
            Context context = this.f56196OooOo;
            if (roomItemInfoModelTag == tag) {
                com.yalla.yalla.service.room.OooO0O0.OooO00o oooO00o = com.yalla.yalla.service.room.OooO0O0.f24995OoooOOO;
                textView = textView5;
                if (!TextUtils.isEmpty(oooO00o.OooO00o().f24998OooO00o.getValue())) {
                    netImageView = netImageView2;
                    netImageView.setVisibility(0);
                    o0OOo0O.OooOO0.OooO00o oooO00o2 = new o0OOo0O.OooOO0.OooO00o(context);
                    oooO00o2.f43911OooO0OO = oooO00o.OooO00o().f24998OooO00o.getValue();
                    oooO00o2.f43909OooO00o = 0;
                    int i5 = p584o0oOooO0.oOo00OO0.icon_head_default;
                    oooO00o2.f43923OooOOOo = i5;
                    oooO00o2.f43913OooO0o = i5;
                    oooO00o2.OooO0Oo(netImageView);
                    imageView.setVisibility(8);
                }
                if (!TextUtils.isEmpty(model.getContent())) {
                    textView6.setVisibility(0);
                    textView6.setText(model.getContent());
                }
                if (model.getTitleBottom().length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    textView3.setVisibility(0);
                    textView3.setText(model.getTitleBottom());
                }
                tvTitle.setTextColor(com.code.android.util.o0000.OooO00o(oO00O0o.color_alpha_87));
                tvTitle.setText(model.getTitle());
                p417o0OoO0.o000O0o.OooO0o(tvTitle, null);
                profileLimitModel = model.getProfileLimitModel();
                if (profileLimitModel != null) {
                    p417o0OoO0.o000O0o.OooO0o(tvTitle, this.f26662OooOoo);
                    if (profileLimitModel.getExpireTime() > 0 || profileLimitModel.getExpireTime() >= System.currentTimeMillis()) {
                        if (model.getTag() == RoomItemInfoModelTag.RoomName) {
                            textView6.setHint(com.code.android.util.o0000.OooO0OO(oO00OOo0.single_Yalla) + ZegoConstants.ZegoVideoDataAuxPublishingStream + model.getBarIdx());
                        }
                        if (model.getTag() == roomItemInfoModelTag) {
                            o0OOo0O.OooOO0.OooO00o oooO00o3 = new o0OOo0O.OooOO0.OooO00o(context);
                            oooO00o3.f43911OooO0OO = "";
                            i = 0;
                            oooO00o3.f43909OooO00o = 0;
                            int i6 = p584o0oOooO0.oOo00OO0.icon_head_default;
                            oooO00o3.f43923OooOOOo = i6;
                            oooO00o3.f43913OooO0o = i6;
                            oooO00o3.OooO0Oo(netImageView);
                        } else {
                            i = 0;
                        }
                    } else {
                        i = 0;
                    }
                } else {
                    i = 0;
                }
                if (model.getMembershipFee() > 0) {
                    textView7.setVisibility(i);
                    textView7.setText(String.valueOf(model.getMembershipFee()));
                }
                if (model.getIsBelow()) {
                    view.setVisibility(i);
                    i2 = 8;
                    view2.setVisibility(8);
                    view3.setVisibility(8);
                } else {
                    i2 = 8;
                }
                isTurnOnSwitch = model.getIsTurnOnSwitch();
                if (isTurnOnSwitch != null) {
                    boolean zBooleanValue = isTurnOnSwitch.booleanValue();
                    imageView.setVisibility(i2);
                    r7.setVisibility(i);
                    r7.setChecked(zBooleanValue);
                }
                if (RoomItemInfoModelTag.Bonus == model.getTag()) {
                    if (com.yalla.yalla.service.room.OooO00o.f24978OooO0o0.OooO0o() > 0) {
                        TextView textView8 = textView;
                        textView8.setText(model.getWageText());
                        i3 = 0;
                        textView8.setVisibility(0);
                        textView2 = textView4;
                        textView2.setVisibility(0);
                    } else {
                        textView2 = textView4;
                        i3 = 0;
                        i4 = 8;
                        textView2.setVisibility(8);
                    }
                    if (RoomItemInfoModelTag.ActionRecords == model.getTag()) {
                        if (p408o0Oo0o0O.o00Oo0.OooO0o0().OooOO0o()) {
                            textView2.setVisibility(i3);
                        } else {
                            textView2.setVisibility(i4);
                        }
                    }
                }
                textView2 = textView4;
                i3 = 0;
                i4 = 8;
                if (RoomItemInfoModelTag.ActionRecords == model.getTag()) {
                    if (p408o0Oo0o0O.o00Oo0.OooO0o0().OooOO0o()) {
                        textView2.setVisibility(i3);
                    } else {
                        textView2.setVisibility(i4);
                    }
                }
            }
            textView = textView5;
            netImageView = netImageView2;
            if (!TextUtils.isEmpty(model.getContent())) {
                textView6.setVisibility(0);
                textView6.setText(model.getContent());
            }
            if (model.getTitleBottom().length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                textView3.setVisibility(0);
                textView3.setText(model.getTitleBottom());
            }
            tvTitle.setTextColor(com.code.android.util.o0000.OooO00o(oO00O0o.color_alpha_87));
            tvTitle.setText(model.getTitle());
            p417o0OoO0.o000O0o.OooO0o(tvTitle, null);
            profileLimitModel = model.getProfileLimitModel();
            if (profileLimitModel != null) {
                p417o0OoO0.o000O0o.OooO0o(tvTitle, this.f26662OooOoo);
                if (profileLimitModel.getExpireTime() > 0) {
                    if (model.getTag() == RoomItemInfoModelTag.RoomName) {
                        textView6.setHint(com.code.android.util.o0000.OooO0OO(oO00OOo0.single_Yalla) + ZegoConstants.ZegoVideoDataAuxPublishingStream + model.getBarIdx());
                    }
                    if (model.getTag() == roomItemInfoModelTag) {
                        o0OOo0O.OooOO0.OooO00o oooO00o4 = new o0OOo0O.OooOO0.OooO00o(context);
                        oooO00o4.f43911OooO0OO = "";
                        i = 0;
                        oooO00o4.f43909OooO00o = 0;
                        int i7 = p584o0oOooO0.oOo00OO0.icon_head_default;
                        oooO00o4.f43923OooOOOo = i7;
                        oooO00o4.f43913OooO0o = i7;
                        oooO00o4.OooO0Oo(netImageView);
                    } else {
                        i = 0;
                    }
                } else {
                    if (model.getTag() == RoomItemInfoModelTag.RoomName) {
                        textView6.setHint(com.code.android.util.o0000.OooO0OO(oO00OOo0.single_Yalla) + ZegoConstants.ZegoVideoDataAuxPublishingStream + model.getBarIdx());
                    }
                    if (model.getTag() == roomItemInfoModelTag) {
                        o0OOo0O.OooOO0.OooO00o oooO00o5 = new o0OOo0O.OooOO0.OooO00o(context);
                        oooO00o5.f43911OooO0OO = "";
                        i = 0;
                        oooO00o5.f43909OooO00o = 0;
                        int i8 = p584o0oOooO0.oOo00OO0.icon_head_default;
                        oooO00o5.f43923OooOOOo = i8;
                        oooO00o5.f43913OooO0o = i8;
                        oooO00o5.OooO0Oo(netImageView);
                    } else {
                        i = 0;
                    }
                }
            } else {
                i = 0;
            }
            if (model.getMembershipFee() > 0) {
                textView7.setVisibility(i);
                textView7.setText(String.valueOf(model.getMembershipFee()));
            }
            if (model.getIsBelow()) {
                view.setVisibility(i);
                i2 = 8;
                view2.setVisibility(8);
                view3.setVisibility(8);
            } else {
                i2 = 8;
            }
            isTurnOnSwitch = model.getIsTurnOnSwitch();
            if (isTurnOnSwitch != null) {
                boolean zBooleanValue2 = isTurnOnSwitch.booleanValue();
                imageView.setVisibility(i2);
                r7.setVisibility(i);
                r7.setChecked(zBooleanValue2);
            }
            if (RoomItemInfoModelTag.Bonus == model.getTag()) {
                if (com.yalla.yalla.service.room.OooO00o.f24978OooO0o0.OooO0o() > 0) {
                    TextView textView9 = textView;
                    textView9.setText(model.getWageText());
                    i3 = 0;
                    textView9.setVisibility(0);
                    textView2 = textView4;
                    textView2.setVisibility(0);
                } else {
                    textView2 = textView4;
                    i3 = 0;
                    i4 = 8;
                    textView2.setVisibility(8);
                }
                if (RoomItemInfoModelTag.ActionRecords == model.getTag()) {
                    if (p408o0Oo0o0O.o00Oo0.OooO0o0().OooOO0o()) {
                        textView2.setVisibility(i3);
                    } else {
                        textView2.setVisibility(i4);
                    }
                }
            }
            textView2 = textView4;
            i3 = 0;
            i4 = 8;
            if (RoomItemInfoModelTag.ActionRecords == model.getTag()) {
                if (p408o0Oo0o0O.o00Oo0.OooO0o0().OooOO0o()) {
                    textView2.setVisibility(i3);
                } else {
                    textView2.setVisibility(i4);
                }
            }
        }
    }

    public /* synthetic */ class OooO0OO {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RoomItemInfoModelTag.values().length];
            try {
                iArr[RoomItemInfoModelTag.Head.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RoomItemInfoModelTag.RoomName.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RoomItemInfoModelTag.Announcement.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[RoomItemInfoModelTag.Tag.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[RoomItemInfoModelTag.Permissions.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[RoomItemInfoModelTag.NumberOfMic.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[RoomItemInfoModelTag.MemberFee.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[RoomItemInfoModelTag.Bonus.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[RoomItemInfoModelTag.ForbiddenList.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[RoomItemInfoModelTag.AllowOpenApplyMic.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[RoomItemInfoModelTag.EnterRoomAllow.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[RoomItemInfoModelTag.ActionRecords.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[RoomItemInfoModelTag.AllowLockMic.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[RoomItemInfoModelTag.CreateEvent.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class OooO0o extends Lambda implements Function0<OooO0O0> {
        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final OooO0O0 invoke() {
            return new OooO0O0(RoomSettingActivity.this);
        }
    }

    public static final class OooOO0 extends Lambda implements Function1<String, Unit> {
        public OooOO0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            String url = str;
            RoomSettingActivity roomSettingActivity = RoomSettingActivity.this;
            if (roomSettingActivity.f26648OooOo0 != null) {
                WebPageInfo webPageInfo = new WebPageInfo(WebFrom.RoomBonus);
                Intrinsics.checkNotNullExpressionValue(url, "url");
                Intrinsics.checkNotNullParameter(url, "url");
                webPageInfo.f32819OooO0o0 = url;
                webPageInfo.OooO0Oo(com.code.android.util.o0000.OooO0OO(oO00OOo0.room_info_bonus));
                RoomConfiguration roomConfiguration = roomSettingActivity.f26648OooOo0;
                String barid = roomConfiguration != null ? roomConfiguration.getBarid() : null;
                if (barid == null) {
                    barid = "";
                }
                webPageInfo.OooO00o("barId", barid);
                int i = WebActivity.f25584OooOoO0;
                WebActivity.OooO00o.OooO00o(roomSettingActivity, webPageInfo);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f26666OooO0Oo;

        public OooOO0O(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f26666OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f26666OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f26666OooO0Oo;
        }

        public final int hashCode() {
            return this.f26666OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f26666OooO0Oo.invoke(obj);
        }
    }

    public static final class OooOOO0 extends Lambda implements Function3<MutableState<Boolean>, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ ArrayList<SelectDialogModel<String>> f26667OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f26668OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ RoomSettingActivity f26669OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(ArrayList<SelectDialogModel<String>> arrayList, RoomSettingActivity roomSettingActivity, int i) {
            super(3);
            this.f26667OooO0Oo = arrayList;
            this.f26669OooO0o0 = roomSettingActivity;
            this.f26668OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(MutableState<Boolean> mutableState, Composer composer, Integer num) {
            MutableState<Boolean> it = mutableState;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(it, "it");
            if ((iIntValue & 14) == 0) {
                iIntValue |= composer2.changed(it) ? 4 : 2;
            }
            int i = iIntValue;
            if ((i & 91) == 18 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-851438377, i, -1, "com.yalla.yalla.ui.activity.room.RoomSettingActivity.showPermissions.<anonymous> (RoomSettingActivity.kt:825)");
                }
                p158o00OoOOO.o00Oo0.OooO0O0(it, null, this.f26667OooO0Oo, null, false, new o0oOOo(this.f26669OooO0o0, this.f26668OooO0o), null, null, 0L, null, null, null, composer2, (i & 14) | ConstantsKt.MINIMUM_BLOCK_SIZE, 0, 4058);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public final OooO0O0 OooOo() {
        return (OooO0O0) this.f26657OooOooO.getValue();
    }

    public final void OooOoO(RoomItemInfoModel roomItemInfoModel, final int i) {
        List<SelectItemModel> list;
        List<SelectItemModel> list2;
        List<SelectItemModel> list3;
        List<SelectItemModel> list4;
        List<SelectItemModel> list5;
        List<SelectItemModel> list6;
        List<SelectItemModel> list7;
        List<SelectItemModel> list8;
        RoomItemInfoModelTag tag = roomItemInfoModel.getTag();
        int i2 = tag == null ? -1 : OooO0OO.$EnumSwitchMapping$0[tag.ordinal()];
        com.yalla.yalla.service.room.OooO0O0.OooO00o oooO00o = com.yalla.yalla.service.room.OooO0O0.f24995OoooOOO;
        boolean z = false;
        switch (i2) {
            case 1:
                ProfileLimitModel value = this.f26652OooOoO.getValue();
                if (value != null) {
                    String strOooO00o = com.code.android.util.o0000O.OooO00o(com.code.android.util.o0000.OooO0OO(oO00OOo0.RoomInfoEdit_ChangeLimit_HintContent_Header), String.valueOf(value.getBlockReason()));
                    if (value.getExpireTime() > 0 && (System.currentTimeMillis() / ((long) 1000)) - value.getExpireTime() <= 0) {
                        strOooO00o = com.code.android.util.o0000O.OooO00o(com.code.android.util.o0000O.OooO00o(com.code.android.util.o0000.OooO0OO(oO00OOo0.RoomInfoEdit_ChangeLimit_HintContent_Header_Time), String.valueOf(value.getBlockReason())), p601o0oo0O0.o0000oo.OooO0Oo(value.getExpireTime(), System.currentTimeMillis()));
                        z = true;
                    }
                    p157o00OoOO0.o0OO00O o0oo00o2 = new p157o00OoOO0.o0OO00O(this);
                    o0oo00o2.OooOo00(strOooO00o);
                    if (z) {
                        o0oo00o2.OooOOo0(true);
                    } else {
                        o0oo00o2.OooOo(true);
                        o0oo00o2.OooOOOo(com.code.android.util.o0000.OooO0OO(oO00OOo0.Continue_));
                        o0oo00o2.OooOo0(new o00Oo00(this));
                    }
                    o0oo00o2.OooOO0o();
                    break;
                } else if (!this.f26658OooOooo) {
                    this.f26658OooOooo = true;
                    com.yalla.yalla.util.permission.OooO00o.OooO0OO(this, PermissionGroupReveal.f32883OooO0o, new o0O0o(this), new o0O00000(this));
                    break;
                }
                break;
            case 2:
                ProfileLimitModel value2 = this.f26654OooOoOO.getValue();
                if (value2 != null) {
                    String strOooO00o2 = com.code.android.util.o0000O.OooO00o(com.code.android.util.o0000.OooO0OO(oO00OOo0.RoomInfoEdit_ChangeLimit_HintContent_Name), String.valueOf(value2.getBlockReason()));
                    if (value2.getExpireTime() > 0 && (System.currentTimeMillis() / ((long) 1000)) - value2.getExpireTime() <= 0) {
                        strOooO00o2 = com.code.android.util.o0000O.OooO00o(com.code.android.util.o0000O.OooO00o(com.code.android.util.o0000.OooO0OO(oO00OOo0.RoomInfoEdit_ChangeLimit_HintContent_Name_Time), String.valueOf(value2.getBlockReason())), p601o0oo0O0.o0000oo.OooO0Oo(value2.getExpireTime(), System.currentTimeMillis()));
                        z = true;
                    }
                    p157o00OoOO0.o0OO00O o0oo00o3 = new p157o00OoOO0.o0OO00O(this);
                    o0oo00o3.OooOo00(strOooO00o2);
                    if (!z) {
                        o0oo00o3.OooOo0o(com.code.android.util.o0000.OooO0OO(oO00OOo0.Cancel));
                        o0oo00o3.OooOOOo(com.code.android.util.o0000.OooO0OO(oO00OOo0.Continue_));
                        o0oo00o3.OooOo0(new o0oOO(this));
                    }
                    o0oo00o3.OooOO0o();
                    break;
                } else {
                    RoomConfiguration roomConfiguration = this.f26648OooOo0;
                    if (roomConfiguration != null) {
                        Intent intent = new Intent(this, (Class<?>) RoomReNameActivity.class);
                        intent.putExtra("Module", roomConfiguration);
                        startActivityForResult(intent, 105);
                        break;
                    }
                }
                break;
            case 3:
                com.yalla.yalla.mixedroom.o000Oo0.OooO00o(this, this.f26656OooOoo0.getValue(), new o0O00o0(this));
                break;
            case 4:
                RoomConfiguration roomConfiguration2 = this.f26648OooOo0;
                if (roomConfiguration2 != null) {
                    Intent intent2 = new Intent(this, (Class<?>) RoomReTagActivity.class);
                    intent2.putExtra("Module", roomConfiguration2);
                    startActivityForResult(intent2, 107);
                    break;
                }
                break;
            case 5:
                RoomConfiguration roomConfiguration3 = MixedRoomDataSource.OooO0o0().f23460OooO0o;
                if (roomConfiguration3 == null || roomConfiguration3.getBarlevel() >= 4) {
                    this.f26650OooOo0O = null;
                    SelectModel selectModel = new SelectModel(com.code.android.util.o0000.OooO0OO(oO00OOo0.title_RoomEdit_micMode), com.code.android.util.o0000.OooO0OO(oO00OOo0.OK), "");
                    this.f26650OooOo0O = selectModel;
                    List<SelectItemModel> list9 = selectModel.getList();
                    if (list9 != null) {
                        list9.clear();
                    }
                    if (roomConfiguration3 == null || !roomConfiguration3.isGuestlive()) {
                        SelectModel selectModel2 = this.f26650OooOo0O;
                        if (selectModel2 != null && (list2 = selectModel2.getList()) != null) {
                            list2.add(new SelectItemModel(com.code.android.util.o0000.OooO0OO(oO00OOo0.title_RoomEdit_memberOnly), true, 0L));
                        }
                        SelectModel selectModel3 = this.f26650OooOo0O;
                        if (selectModel3 != null && (list = selectModel3.getList()) != null) {
                            list.add(new SelectItemModel(com.code.android.util.o0000.OooO0OO(oO00OOo0.everyone), false, 1L));
                        }
                    } else {
                        SelectModel selectModel4 = this.f26650OooOo0O;
                        if (selectModel4 != null && (list4 = selectModel4.getList()) != null) {
                            list4.add(new SelectItemModel(com.code.android.util.o0000.OooO0OO(oO00OOo0.title_RoomEdit_memberOnly), false, 0L));
                        }
                        SelectModel selectModel5 = this.f26650OooOo0O;
                        if (selectModel5 != null && (list3 = selectModel5.getList()) != null) {
                            list3.add(new SelectItemModel(com.code.android.util.o0000.OooO0OO(oO00OOo0.everyone), true, 1L));
                        }
                    }
                    OooOoOO(1);
                    break;
                } else {
                    String strOooO0OO = com.code.android.util.o0000.OooO0OO(oO00OOo0.room_level__change_settings_tips);
                    if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                        com.code.android.util.o000Oo0 o000oo0OooO00o = com.code.android.util.o000O00.OooO00o(strOooO0OO, "runnable");
                        if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            com.code.android.util.o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                        } else {
                            o000oo0OooO00o.run();
                        }
                        break;
                    }
                }
                break;
            case 6:
                p587o0oOooo.o0OO000.OooO00o("102157");
                this.f26650OooOo0O = null;
                SelectModel selectModel6 = new SelectModel(com.code.android.util.o0000.OooO0OO(oO00OOo0.number_of_mic), com.code.android.util.o0000.OooO0OO(oO00OOo0.button_CONFIRM), com.code.android.util.o0000.OooO0OO(oO00OOo0.CANCEL));
                this.f26650OooOo0O = selectModel6;
                List<SelectItemModel> list10 = selectModel6.getList();
                if (list10 != null) {
                    list10.clear();
                }
                Integer value3 = oooO00o.OooO00o().f25027OooOooo.getValue();
                Integer value4 = oooO00o.OooO00o().f25002OooO0o.getValue();
                Intrinsics.checkNotNull(value4);
                int iIntValue = value4.intValue();
                Intrinsics.checkNotNull(value3);
                if (iIntValue >= value3.intValue()) {
                    if (this.f26653OooOoO0 == 0) {
                        SelectModel selectModel7 = this.f26650OooOo0O;
                        if (selectModel7 != null && (list8 = selectModel7.getList()) != null) {
                            list8.add(new SelectItemModel(FeedbackType.Others, true));
                        }
                        SelectModel selectModel8 = this.f26650OooOo0O;
                        if (selectModel8 != null && (list7 = selectModel8.getList()) != null) {
                            list7.add(new SelectItemModel("10", false));
                        }
                    } else {
                        SelectModel selectModel9 = this.f26650OooOo0O;
                        if (selectModel9 != null && (list6 = selectModel9.getList()) != null) {
                            list6.add(new SelectItemModel(FeedbackType.Others, false));
                        }
                        SelectModel selectModel10 = this.f26650OooOo0O;
                        if (selectModel10 != null && (list5 = selectModel10.getList()) != null) {
                            list5.add(new SelectItemModel("10", true));
                        }
                    }
                    OooOoOO(2);
                    break;
                } else {
                    String strOooO00o3 = com.code.android.util.o0000O.OooO00o(com.code.android.util.o0000.OooO0OO(oO00OOo0.you_can_set_number_of_mic), value3.toString());
                    if (!StringsKt.isBlank(strOooO00o3)) {
                        com.code.android.util.o000Oo0 o000oo0OooO00o2 = com.code.android.util.o000O00.OooO00o(strOooO00o3, "runnable");
                        if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            com.code.android.util.o000O0.f10355OooO0O0.post(o000oo0OooO00o2);
                        } else {
                            o000oo0OooO00o2.run();
                        }
                        break;
                    }
                }
                break;
            case 7:
                if (this.f26651OooOo0o == null) {
                    String strOooO0OO2 = com.code.android.util.o0000.OooO0OO(oO00OOo0.title_RoomEdit_memberDesc);
                    Integer value5 = oooO00o.OooO00o().f25014OooOOo0.getValue();
                    Intrinsics.checkNotNull(value5);
                    this.f26651OooOo0o = new MemberFeeModel(strOooO0OO2, value5.intValue(), 0, 500);
                }
                MemberFeeModel memberFeeModel = this.f26651OooOo0o;
                if (memberFeeModel != null) {
                    Intrinsics.checkNotNull(this, "null cannot be cast to non-null type com.yalla.yalla.base.activity.BaseFragmentActivity");
                    String infoTop = memberFeeModel.getContent();
                    Intrinsics.checkNotNullExpressionValue(infoTop, "memberFeeModel.content");
                    int fee = memberFeeModel.getFee();
                    int min = memberFeeModel.getMin();
                    int max = memberFeeModel.getMax();
                    oo00oO onConfirmClick = new oo00oO(this);
                    Intrinsics.checkNotNullParameter(this, "activity");
                    Intrinsics.checkNotNullParameter(infoTop, "infoTop");
                    Intrinsics.checkNotNullParameter(onConfirmClick, "onConfirmClick");
                    showDialog((String) null, ComposableLambdaKt.composableLambdaInstance(-1016109759, true, new p519o0o0O0oO.o0O0O0o0(infoTop, onConfirmClick, fee, min, max)));
                }
                break;
            case 8:
                p587o0oOooo.o0OO000.OooO00o("102158");
                p402o0Oo0OOO.o00O000o.f44499OooOO0O.observe(this, new OooOO0O(new OooOO0()));
                break;
            case 9:
                p587o0oOooo.o0OO000.OooO00o("102159");
                Intrinsics.checkNotNullParameter(this, "activity");
                startActivity(new Intent(this, (Class<?>) BanEnterRoomListActivity.class));
                break;
            case 10:
                p475o0o000.o000000 o000000Var = com.yalla.yalla.service.room.OooO00o.f24979OooO0oO;
                p587o0oOooo.o0OO000.OooO0O0("102232", MapsKt.mapOf(new Pair("type", Integer.valueOf(!o000000Var.OooO() ? 1 : 0))));
                boolean z2 = !o000000Var.OooO();
                RoomMike.AllowAdminOpenMicApplyRequest.Builder builderNewBuilder = RoomMike.AllowAdminOpenMicApplyRequest.newBuilder();
                builderNewBuilder.setRoomId(com.yalla.yalla.service.room.OooO00o.f24978OooO0o0.OooO0o0());
                p464o0Oooo.o000000O o000000o2 = p464o0Oooo.o000000O.f46674OooO00o;
                builderNewBuilder.setUserId(((Number) androidx.compose.ui.graphics.colorspace.OooO0OO.OooO0O0()).longValue());
                builderNewBuilder.setOp(z2 ? 1 : 2);
                RoomLiveService roomLiveService = RoomLiveService.f25058OooOo00;
                if (roomLiveService != null) {
                    roomLiveService.OooO0oo(1001108, builderNewBuilder.build().toByteArray());
                }
                break;
            case 11:
                if (!this.f26659Oooo000) {
                    this.f26659Oooo000 = true;
                    Boolean value6 = oooO00o.OooO00o().f25021OooOoO.getValue();
                    Intrinsics.checkNotNull(value6);
                    p587o0oOooo.o0OO000.OooO0O0("102161", MapsKt.mapOf(new Pair("type", Integer.valueOf(!value6.booleanValue() ? 1 : 0))));
                    int i3 = value6.booleanValue() ? 2 : 1;
                    Room.kickTouristRequest.Builder builderNewBuilder2 = Room.kickTouristRequest.newBuilder();
                    builderNewBuilder2.setKickOp(i3);
                    RoomLiveService roomLiveService2 = RoomLiveService.f25058OooOo00;
                    if (roomLiveService2 != null) {
                        roomLiveService2.OooO0oo(10070, builderNewBuilder2.build().toByteArray());
                    }
                    break;
                }
                break;
            case 12:
                p587o0oOooo.o0OO000.OooO00o("102320");
                p409o0Oo0o0o.o0O0O00 o0o0o00OooO0o0 = p408o0Oo0o0O.o00Oo0.OooO0o0();
                o0o0o00OooO0o0.getClass();
                com.google.firebase.messaging.o0OO00O.OooO00o("roomSettingActionRecord", p464o0Oooo.o000000O.OooOOo0().getValue(), o0o0o00OooO0o0, false);
                com.yalla.yalla.service.room.OooO00o.f24978OooO0o0.f47489OooO0Oo.setValue(Boolean.FALSE);
                OooOo().notifyItemChanged(i);
                RoomUserActionRecordScreen.INSTANCE.navigate();
                break;
            case 13:
                int iOooO0O0 = com.code.android.util.o000000.OooO0O0(oooO00o.OooO00o().f25023OooOoOO.getValue());
                o0Oooo.o000000O.o0000 o0000Var = p464o0Oooo.o000000O.f46724OoooOoo;
                if (o0000Var.getValue() != null) {
                    Room.AllowMicRightIn.Builder builderNewBuilder3 = Room.AllowMicRightIn.newBuilder();
                    RoomIndexModel value7 = o0000Var.getValue();
                    Intrinsics.checkNotNull(value7);
                    builderNewBuilder3.setRoomId(com.code.android.util.o0OoOo0.OooO(0L, value7.barid));
                    builderNewBuilder3.setAllowMicStatus(iOooO0O0);
                    RoomLiveService roomLiveService3 = RoomLiveService.f25058OooOo00;
                    if (roomLiveService3 != null) {
                        roomLiveService3.OooO0oo(1000002, builderNewBuilder3.build().toByteArray());
                    }
                }
                break;
            case 14:
                Boolean value8 = oooO00o.OooO00o().f25026OooOooO.getValue();
                final boolean zBooleanValue = value8 == null ? false : value8.booleanValue();
                RoomConfiguration roomConfiguration4 = this.f26648OooOo0;
                String barid = roomConfiguration4 != null ? roomConfiguration4.getBarid() : null;
                if (!(barid == null || StringsKt.isBlank(barid))) {
                    p587o0oOooo.o0OO000.OooO00o(!zBooleanValue ? "102011" : "102012");
                    p377o0OOoOo.o000O00O o000o00o2 = p377o0OOoOo.o000O0O0.f44226OooO00o;
                    RoomConfiguration roomConfiguration5 = this.f26648OooOo0;
                    String barid2 = roomConfiguration5 != null ? roomConfiguration5.getBarid() : null;
                    boolean z3 = !zBooleanValue;
                    com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0 oooO0O0 = new com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0() { // from class: com.yalla.yalla.ui.activity.room.RoomSettingActivity$setEventManage$1
                        /* JADX WARN: Type inference fix 'apply assigned field type' failed
                        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                         */
                        @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
                        public final void OooO0o0(@NotNull String response) {
                            Intrinsics.checkNotNullParameter(response, "response");
                            Object objOooO0O0 = oOo00OO0.OooO0O0(response, new TypeToken<AbsJavaBeanApi<Boolean>>() { // from class: com.yalla.yalla.ui.activity.room.RoomSettingActivity$setEventManage$1$onFinish$result$1
                            }.getType());
                            Intrinsics.checkNotNullExpressionValue(objOooO0O0, "fromJson(response, objec…vaBeanApi<Boolean>>() {})");
                            AbsJavaBeanApi absJavaBeanApi = (AbsJavaBeanApi) objOooO0O0;
                            if (!p408o0Oo0o0O.o00Oo0.OooO0o0().OooOO0O()) {
                                p408o0Oo0o0O.o00Oo0.OooO0o0().OooOOO0();
                                com.yalla.yalla.service.room.OooO00o.f24978OooO0o0.f47494OooOO0.setValue(Boolean.FALSE);
                            }
                            com.yalla.yalla.service.room.OooO0O0.f24995OoooOOO.OooO00o().f25026OooOooO.postValue(absJavaBeanApi.data);
                            int i4 = RoomSettingActivity.f26645Oooo00O;
                            RoomSettingActivity roomSettingActivity = this.f26671OooO0o0;
                            RoomSettingActivity.OooO0O0 oooO0O0OooOo = roomSettingActivity.OooOo();
                            int i5 = i;
                            RoomItemInfoModel roomItemInfoModelOooOOO = oooO0O0OooOo.OooOOO(i5);
                            if (roomItemInfoModelOooOOO != null) {
                                roomItemInfoModelOooOOO.setTurnOnSwitch(Boolean.valueOf(!zBooleanValue));
                            }
                            roomSettingActivity.OooOo().notifyItemChanged(i5);
                        }
                    };
                    LinkedHashMap linkedHashMapOooO00o = oO00o000.OooO00o();
                    linkedHashMapOooO00o.put(ContributionFragment.ARG_1, barid2);
                    if (z3) {
                        linkedHashMapOooO00o.put("isManageEvent", "1");
                    } else {
                        linkedHashMapOooO00o.put("isManageEvent", AppEventsConstants.EVENT_PARAM_VALUE_NO);
                    }
                    com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0OO(p377o0OOoOo.o0000O.f44100OooOoo, "/Webservers/Bar/SetEventManage", linkedHashMapOooO00o, oooO0O0);
                    break;
                }
                break;
        }
    }

    public final void OooOoO0() {
        com.yalla.yalla.service.room.OooO0O0.OooO00o oooO00o = com.yalla.yalla.service.room.OooO0O0.f24995OoooOOO;
        Integer value = oooO00o.OooO00o().f25014OooOOo0.getValue();
        CategoryModel value2 = oooO00o.OooO00o().f25013OooOOo.getValue();
        Boolean value3 = oooO00o.OooO00o().f25021OooOoO.getValue();
        if (value3 == null) {
            value3 = Boolean.FALSE;
        }
        boolean zBooleanValue = value3.booleanValue();
        if (this.f26648OooOo0 == null) {
            return;
        }
        ArrayList arrayList = this.f26649OooOo00;
        arrayList.clear();
        RoomItemInfoModel roomItemInfoModel = new RoomItemInfoModel(com.code.android.util.o0000.OooO0OO(oO00OOo0.profile), true, RoomItemInfoModelTag.Head);
        RoomConfiguration roomConfiguration = this.f26648OooOo0;
        roomItemInfoModel.setHeadUrl(roomConfiguration != null ? roomConfiguration.getBarimage() : null);
        roomItemInfoModel.setProfileLimitModel(this.f26652OooOoO.getValue());
        arrayList.add(roomItemInfoModel);
        RoomItemInfoModel roomItemInfoModel2 = new RoomItemInfoModel(com.code.android.util.o0000.OooO0OO(oO00OOo0.Room_name), true, RoomItemInfoModelTag.RoomName);
        RoomConfiguration roomConfiguration2 = this.f26648OooOo0;
        roomItemInfoModel2.setContent(roomConfiguration2 != null ? roomConfiguration2.getBarname() : null);
        roomItemInfoModel2.setProfileLimitModel(this.f26654OooOoOO.getValue());
        RoomConfiguration roomConfiguration3 = this.f26648OooOo0;
        roomItemInfoModel2.setBarIdx(roomConfiguration3 != null ? roomConfiguration3.getBaridx() : null);
        arrayList.add(roomItemInfoModel2);
        RoomItemInfoModel roomItemInfoModel3 = new RoomItemInfoModel(com.code.android.util.o0000.OooO0OO(oO00OOo0.Announcement), true, RoomItemInfoModelTag.Announcement);
        p475o0o000.oo000o oo000oVar = com.yalla.yalla.service.room.OooO00o.f24978OooO0o0;
        roomItemInfoModel3.setContent(oo000oVar.f47490OooO0o.getValue());
        roomItemInfoModel3.setProfileLimitModel(this.f26656OooOoo0.getValue());
        arrayList.add(roomItemInfoModel3);
        RoomItemInfoModel roomItemInfoModel4 = new RoomItemInfoModel(com.code.android.util.o0000.OooO0OO(oO00OOo0.createBar_txt_Category), false, RoomItemInfoModelTag.Tag);
        String labelname = "";
        roomItemInfoModel4.setContent("");
        if (value2 != null) {
            HashMap<String, CategoryModel> map = ApiTagUtils.f22721OooO00o;
            String id = value2.getId();
            Intrinsics.checkNotNullExpressionValue(id, "categoryModel.getId()");
            Intrinsics.checkNotNullParameter(id, "id");
            if (ApiTagUtils.OooO00o(id) != null) {
                CategoryModel categoryModelOooO00o = ApiTagUtils.OooO00o(id);
                Intrinsics.checkNotNull(categoryModelOooO00o);
                labelname = categoryModelOooO00o.getLabelname();
                Intrinsics.checkNotNullExpressionValue(labelname, "getModelForId(id)!!.getLabelname()");
            }
            roomItemInfoModel4.setContent(labelname);
        }
        arrayList.add(roomItemInfoModel4);
        RoomItemInfoModel roomItemInfoModel5 = new RoomItemInfoModel(com.code.android.util.o0000.OooO0OO(oO00OOo0.Membership_fee), true, RoomItemInfoModelTag.MemberFee);
        roomItemInfoModel5.setMembershipFee(value != null ? value.intValue() : 0);
        arrayList.add(roomItemInfoModel5);
        RoomItemInfoModel roomItemInfoModel6 = new RoomItemInfoModel(com.code.android.util.o0000.OooO0OO(oO00OOo0.room_info_bonus), false, RoomItemInfoModelTag.Bonus);
        roomItemInfoModel6.setWageText(com.code.android.util.o0000.OooO0OO(oO00OOo0.get_bonus));
        if (oo000oVar.OooO0o() > 0) {
            roomItemInfoModel6.setShowRedPoint(true);
        }
        arrayList.add(roomItemInfoModel6);
        RoomItemInfoModel roomItemInfoModel7 = new RoomItemInfoModel(com.code.android.util.o0000.OooO0OO(oO00OOo0.number_of_mic), true, RoomItemInfoModelTag.NumberOfMic);
        roomItemInfoModel7.setContent("10");
        if (this.f26653OooOoO0 == 0) {
            roomItemInfoModel7.setContent(FeedbackType.Others);
        }
        arrayList.add(roomItemInfoModel7);
        RoomItemInfoModel roomItemInfoModel8 = new RoomItemInfoModel(com.code.android.util.o0000.OooO0OO(oO00OOo0.title_RoomEdit_micMode), true, RoomItemInfoModelTag.Permissions);
        roomItemInfoModel8.setContent(com.code.android.util.o0000.OooO0OO(oO00OOo0.title_RoomEdit_memberOnly));
        if (MixedRoomDataSource.OooO0o0().f23460OooO0o != null && MixedRoomDataSource.OooO0o0().f23460OooO0o.isGuestlive()) {
            roomItemInfoModel8.setContent(com.code.android.util.o0000.OooO0OO(oO00OOo0.everyone));
        }
        arrayList.add(roomItemInfoModel8);
        RoomItemInfoModel roomItemInfoModel9 = new RoomItemInfoModel(com.code.android.util.o0000.OooO0OO(oO00OOo0.room_set_mic_lock_state), true, RoomItemInfoModelTag.AllowLockMic);
        roomItemInfoModel9.setTurnOnSwitch(oooO00o.OooO00o().f25023OooOoOO.getValue());
        arrayList.add(roomItemInfoModel9);
        RoomItemInfoModel roomItemInfoModel10 = new RoomItemInfoModel(com.code.android.util.o0000.OooO0OO(oO00OOo0.room_set_admin_open_app_mic), false, RoomItemInfoModelTag.AllowOpenApplyMic);
        p475o0o000.o000000 o000000Var = com.yalla.yalla.service.room.OooO00o.f24979OooO0oO;
        roomItemInfoModel10.setShowRedPoint(o000000Var.OooO0oo());
        roomItemInfoModel10.setTurnOnSwitch(Boolean.valueOf(o000000Var.OooO()));
        arrayList.add(roomItemInfoModel10);
        RoomItemInfoModel roomItemInfoModel11 = new RoomItemInfoModel(com.code.android.util.o0000.OooO0OO(oO00OOo0.room_setting_create_event_title), false, RoomItemInfoModelTag.CreateEvent);
        roomItemInfoModel11.setTitleBottom(com.code.android.util.o0000.OooO0OO(oO00OOo0.room_setting_create_event_title_bottom));
        roomItemInfoModel11.setTurnOnSwitch(oooO00o.OooO00o().f25026OooOooO.getValue());
        roomItemInfoModel11.setShowRedPoint(true);
        if (p408o0Oo0o0O.o00Oo0.OooO0o0().OooOO0O()) {
            roomItemInfoModel11.setShowRedPoint(false);
        }
        arrayList.add(roomItemInfoModel11);
        arrayList.add(new RoomItemInfoModel(com.code.android.util.o0000.OooO0OO(oO00OOo0.room_info_ban), true, RoomItemInfoModelTag.ForbiddenList));
        arrayList.add(new RoomItemInfoModel(com.code.android.util.o0000.OooO0OO(oO00OOo0.Action_Records), true, RoomItemInfoModelTag.ActionRecords));
        RoomItemInfoModel roomItemInfoModel12 = new RoomItemInfoModel(com.code.android.util.o0000.OooO0OO(oO00OOo0.room_enter_allow), false, RoomItemInfoModelTag.EnterRoomAllow);
        roomItemInfoModel12.setTitleBottom(com.code.android.util.o0000.OooO0OO(oO00OOo0.room_enter_allow_tip));
        roomItemInfoModel12.setTurnOnSwitch(Boolean.valueOf(!zBooleanValue));
        arrayList.add(roomItemInfoModel12);
        OooOo().f26663OooOoo0 = new OooO();
        OooOo().f10098OooO0o = new p203o00o0o0o.o00OO0OO(this);
        OooOo().OooOoO0(arrayList);
    }

    public final void OooOoOO(int i) {
        List<SelectItemModel> list;
        if (this.f26650OooOo0O == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        SelectModel selectModel = this.f26650OooOo0O;
        if (selectModel != null && (list = selectModel.getList()) != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                SelectDialogModel content = new SelectDialogModel().setContent(list.get(i2).getName());
                Intrinsics.checkNotNull(content, "null cannot be cast to non-null type com.yalla.yalla.model.SelectDialogModel<kotlin.String>");
                arrayList.add(content);
            }
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type com.yalla.yalla.base.activity.IComposeDialog");
        showDialog((String) null, ComposableLambdaKt.composableLambdaInstance(-851438377, true, new OooOOO0(arrayList, this, i)));
    }

    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, @Nullable Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 105) {
            setResult(-1);
        }
    }

    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        finish();
        super.onBackPressed();
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        ArrayList<ProfileLimitModel> profileLimit;
        super.onCreate(bundle);
        com.code.android.util.o000O0Oo o000o0oo2 = this.f26646OooOOoo;
        setContentView(((n0) o000o0oo2.getValue()).f58434OooO00o);
        this.f26655OooOoo = (RoomInfoEditVM) new ViewModelProvider(this).get(RoomInfoEditVM.class);
        if (getIntent() == null || MixedRoomDataSource.OooO0o0().f23461OooO0o0 == null) {
            finish();
        } else {
            Serializable serializableExtra = getIntent().getSerializableExtra("Module");
            Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.yalla.yalla.mixedroom.model.RoomConfiguration");
            this.f26648OooOo0 = (RoomConfiguration) serializableExtra;
        }
        HeaderLayout headerLayout = this.f22755OooOO0;
        if (headerLayout != null) {
            headerLayout.setTitle(oO00OOo0.Settings);
        }
        HeaderLayout headerLayout2 = this.f22755OooOO0;
        if (headerLayout2 != null) {
            headerLayout2.OooOo00(new o00OOOOo(this));
        }
        OooOOo0(0);
        ((n0) o000o0oo2.getValue()).f58435OooO0O0.setLayoutManager(new FixLinearLayoutManager(this));
        ((n0) o000o0oo2.getValue()).f58435OooO0O0.setAdapter(OooOo());
        if (MixedRoomDataSource.OooO0o0().f23461OooO0o0 != null) {
            this.f26653OooOoO0 = com.code.android.util.o000000.OooO0O0(Boolean.valueOf(com.yalla.yalla.service.room.OooO00o.f24979OooO0oO.OooOO0o()));
        }
        OooOoO0();
        com.yalla.yalla.service.room.OooO0O0.OooO00o oooO00o = com.yalla.yalla.service.room.OooO0O0.f24995OoooOOO;
        oooO00o.OooO00o().f25014OooOOo0.observe(this, new OooOO0O(new o00OO0O0(this)));
        oooO00o.OooO00o().f25013OooOOo.observe(this, new OooOO0O(new o00OO0OO(this)));
        LiveEventBus.get("FORBID_GUESTS_ENTER_ROOM", Boolean.TYPE).observe(this, new oo0O(this));
        MutableLiveData<Boolean> mutableLiveData = oooO00o.OooO00o().f25021OooOoO;
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        mutableLiveData.observe(this, new o00OO(this));
        oooO00o.OooO00o().f25023OooOoOO.observe(this, new o00OOO00(this));
        LiveEventBus.get("RoomHeaderUrl").observe(this, new o00OOO0(this));
        LiveEventBus.get("RoomName").observe(this, new o00OOO0O(this));
        LiveEventBus.get("ALLOW_ROOM_MANAGER_OPEN_APPLY_MIC").observe(this, new o0o0Oo(this));
        LiveEventBus.get("RoomAnnouncement").observe(this, new o00OOOO0(this));
        MutableLiveData<ProfileLimitModel> mutableLiveData2 = this.f26652OooOoO;
        mutableLiveData2.observe(this, new OooOO0O(new o00O(this)));
        MutableLiveData<ProfileLimitModel> mutableLiveData3 = this.f26654OooOoOO;
        mutableLiveData3.observe(this, new OooOO0O(new o00OO000(this)));
        MutableLiveData<ProfileLimitModel> mutableLiveData4 = this.f26656OooOoo0;
        mutableLiveData4.observe(this, new OooOO0O(new o00OO00O(this)));
        mutableLiveData2.setValue(null);
        mutableLiveData3.setValue(null);
        mutableLiveData4.setValue(null);
        RoomConfiguration roomConfiguration = this.f26648OooOo0;
        if (roomConfiguration == null || (profileLimit = roomConfiguration.getProfileLimit()) == null) {
            return;
        }
        for (ProfileLimitModel profileLimitModel : profileLimit) {
            int operationType = profileLimitModel.getOperationType();
            if (operationType == 1) {
                mutableLiveData2.setValue(profileLimitModel);
            } else if (operationType == 2) {
                mutableLiveData3.setValue(profileLimitModel);
            } else if (operationType == 3) {
                mutableLiveData4.setValue(profileLimitModel);
            }
        }
    }

    @Override // com.yalla.yalla.ui.activity.BaseActivityK, com.yalla.yalla.base.activity.BaseFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        p475o0o000.o000000 o000000Var = com.yalla.yalla.service.room.OooO00o.f24979OooO0oO;
        if (o000000Var.OooO0oo()) {
            p409o0Oo0o0o.o0O0O00 o0o0o00OooO0o0 = p408o0Oo0o0O.o00Oo0.OooO0o0();
            o0o0o00OooO0o0.getClass();
            com.google.firebase.messaging.o0OO00O.OooO00o("showRoomApplyMicSettingDot", p464o0Oooo.o000000O.OooOOo0().getValue(), o0o0o00OooO0o0, false);
            o000000Var.f47392OooOo0o.setValue(Boolean.FALSE);
        }
        if (p408o0Oo0o0O.o00Oo0.OooO0o0().OooOO0O()) {
            return;
        }
        p408o0Oo0o0O.o00Oo0.OooO0o0().OooOOO0();
        com.yalla.yalla.service.room.OooO00o.f24978OooO0o0.f47494OooOO0.setValue(Boolean.FALSE);
        com.yalla.yalla.service.room.OooO0O0.f24995OoooOOO.OooO00o().f25008OooOO0o.postValue(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, p418o0OoO000.Oooo000
    public final void onEventMainThread(@Nullable p418o0OoO000.OooOo<?> oooOo) {
        super.onEventMainThread(oooOo);
        Integer numValueOf = oooOo != null ? Integer.valueOf(oooOo.f45532OooO00o) : null;
        if (numValueOf != null && numValueOf.intValue() == 33) {
            T t = oooOo.f45534OooO0OO;
            Intrinsics.checkNotNull(t, "null cannot be cast to non-null type com.yalla.yalla.mixedroom.model.RoomConfiguration");
            this.f26648OooOo0 = (RoomConfiguration) t;
            com.yalla.yalla.service.room.OooO0O0.f24995OoooOOO.OooO00o().f24997OooO.setValue(this.f26648OooOo0);
            OooOoO0();
            return;
        }
        if (numValueOf != null && numValueOf.intValue() == 177) {
            T t2 = oooOo.f45534OooO0OO;
            Intrinsics.checkNotNull(t2, "null cannot be cast to non-null type kotlin.Int");
            this.f26653OooOoO0 = ((Integer) t2).intValue();
            OooOoO0();
            OooOo().notifyDataSetChanged();
            return;
        }
        if (numValueOf != null && numValueOf.intValue() == 57) {
            com.yalla.yalla.service.room.OooO00o.f24978OooO0o0.f47488OooO0OO.setValue(0);
            OooOo().notifyDataSetChanged();
        }
    }
}
