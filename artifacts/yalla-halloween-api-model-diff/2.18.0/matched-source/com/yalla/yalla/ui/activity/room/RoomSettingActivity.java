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
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import com.app.base.app.appConfig.apiDataModela.ApiTagUtils;
import com.app.base.dialog.baseDialog.SelectDialogModel;
import com.app.base.fragment.ContributionFragment;
import com.app.base.interfaceType.FeedbackType;
import com.app.base.mixedroom.model.RoomConfiguration;
import com.app.base.model.CategoryModel;
import com.app.base.model.ProfileLimitModel;
import com.app.base.model.RoomItemInfoModel;
import com.app.base.model.RoomItemInfoModelTag;
import com.app.base.protobuf.room.Room;
import com.app.base.view.HeaderLayout;
import com.app.base.view.pop.memberFee.MemberFeeModel;
import com.app.base.view.pop.selectPop.SelectItemModel;
import com.app.base.view.pop.selectPop.SelectModel;
import com.app.selectPicture.view.FixLinearLayoutManager;
import com.code.android.util.ToastUtil;
import com.facebook.appevents.AppEventsConstants;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.manager.data.SharedUrlManager;
import com.yalla.yalla.common.vm.RoomInfoEditVM;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.room.RoomSettingActivity;
import com.yalla.yalla.util.netimage.NetImageView;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p043OooooO0.o00O0000;
import p100o000oOoO.o00O000;
import p100o000oOoO.o0O00O;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.oOO00O;
import p140o00OOOo0.o0O0O00;
import p143o00OOooO.o00;
import p143o00OOooO.o000;
import p143o00OOooO.o0000OO0;
import p143o00OOooO.o000O000;
import p143o00OOooO.o000O0o;
import p143o00OOooO.o000OO0O;
import p154o00Oo0oO.o00000OO;
import p154o00Oo0oO.o00oO0o;
import p154o00Oo0oO.o0ooOOo;
import p154o00Oo0oO.oo0o0Oo;
import p160o00OoOO.o0000;
import p160o00OoOO.o0000Ooo;
import p160o00OoOO.o000O00O;
import p161o00OoOO0.o00OO0OO;
import p189o00o00o0.OooO0o;
import p194o00o0O00.Oooo000;
import p255o00ooO0O.o000O0O0;
import p255o00ooO0O.o000Oo0;
import p255o00ooO0O.o00O000o;
import p255o00ooO0O.o0O0ooO;
import p256o00ooO0o.oo0oOO0;
import p258o00ooOO0.o0O0oo0o;
import p393o0OOooOo.o0O00000;
import p503o0o00o.o000OO;
import p503o0o00o.o0OOO0o;
import p524o0o0O0o.oo0o0O0;
import p532o0o0OOO.o00OO000;
import p532o0o0OOO.o00OO0O0;
import p540o0o0Oo0.o0o0Oo;
import p546o0o0OoOO.d6;
import p546o0o0OoOO.e6;
import p546o0o0OoOO.f6;
import p546o0o0OoOO.g6;
import p546o0o0OoOO.h6;
import p546o0o0OoOO.i6;
import p618o0oo0Ooo.oO0O000o;
import p623o0oo0o0o.oo00o;
import p651o0ooOOoo.z6;
import p709oOooo0o.o000O;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/yalla/yalla/ui/activity/room/RoomSettingActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "OooO00o", "OooO0O0", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class RoomSettingActivity extends BaseActivityK {

    /* JADX INFO: renamed from: oo000o, reason: collision with root package name */
    @NotNull
    public static final OooO00o f22988oo000o = new OooO00o();

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    @Nullable
    public RoomConfiguration f22991OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    @Nullable
    public MemberFeeModel f22992Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    @Nullable
    public SelectModel f22993Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    @Nullable
    public o000O f22994OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public int f22995Ooooooo;

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    public RoomInfoEditVM f22997o00Oo0;

    /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
    public boolean f22999o00o0O;

    /* JADX INFO: renamed from: o00ooo, reason: collision with root package name */
    public boolean f23000o00ooo;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    @NotNull
    public final o00O000o f22989OooooO0 = new o00O000o(Reflection.getOrCreateKotlinClass(z6.class), this, null);

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    @NotNull
    public List<RoomItemInfoModel> f22990OooooOO = new ArrayList();

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<ProfileLimitModel> f23001o0OoOo0 = new MutableLiveData<>();

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<ProfileLimitModel> f23002ooOO = new MutableLiveData<>();

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<ProfileLimitModel> f22996o00O0O = new MutableLiveData<>();

    /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
    @NotNull
    public final Lazy f22998o00Ooo = LazyKt.lazy(new OooO0o());

    public static final class OooO extends Lambda implements Function2<RoomItemInfoModel, Integer, Unit> {
        public OooO() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(RoomItemInfoModel roomItemInfoModel, Integer num) {
            RoomItemInfoModel roomInfoDetailModel = roomItemInfoModel;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(roomInfoDetailModel, "roomInfoDetailModel");
            RoomSettingActivity roomSettingActivity = RoomSettingActivity.this;
            OooO00o oooO00o = RoomSettingActivity.f22988oo000o;
            roomSettingActivity.Oooo000(roomInfoDetailModel, iIntValue);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o {
        @JvmStatic
        public final void OooO00o(@Nullable Activity activity, @Nullable String str) {
            if ((str == null || str.length() == 0) || str == null) {
                return;
            }
            o00oO0o o00oo0o2 = o00000OO.f32228OooO00o;
            oo0o0Oo oo0o0oo = o00000OO.f32231OooO0Oo;
            OooOOO oooOOO = new OooOOO(activity);
            Map<String, String> mapOooO0O0 = o00OO0OO.OooO0O0();
            mapOooO0O0.put("barid", str);
            o0ooOOo o0ooooo2 = o0ooOOo.f32239OooO00o;
            o00OO0OO.OooO0OO(null, o0ooOOo.f32265OooOoo, "/Webservers/Bar/RoomInfo", mapOooO0O0, oooOOO);
        }
    }

    @SuppressLint({"UseSwitchCompatOrMaterialCode"})
    public static final class OooO0O0 extends p189o00o00o0.OooO0OO<RoomItemInfoModel> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Nullable
        public Function2<? super RoomItemInfoModel, ? super Integer, Unit> f23004OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public final Drawable f23005OooO0O0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(@NotNull Context context) {
            super(context, R.layout.item_room_info_detail);
            Intrinsics.checkNotNullParameter(context, "context");
            this.f23005OooO0O0 = o000O0O0.OooO0O0(R.drawable.common_warning_tip);
        }

        /* JADX WARN: Code duplicated, block: B:30:0x01b0  */
        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        public final void convert(com.chad.library.adapter.base.OooO00o oooO00o, Object obj) {
            int i;
            int i2;
            final p189o00o00o0.OooO0o helper = (p189o00o00o0.OooO0o) oooO00o;
            final RoomItemInfoModel model = (RoomItemInfoModel) obj;
            Intrinsics.checkNotNullParameter(helper, "helper");
            Intrinsics.checkNotNullParameter(model, "model");
            TextView tvTitle = (TextView) helper.OooO0Oo(R.id.tvTitle);
            TextView textView = (TextView) helper.OooO0Oo(R.id.tvBottom);
            TextView textView2 = (TextView) helper.OooO0Oo(R.id.tvRedPoint);
            NetImageView netImageView = (NetImageView) helper.OooO0Oo(R.id.ivHead);
            Switch r7 = (Switch) helper.OooO0Oo(R.id.switchEnterRoomAllow);
            TextView textView3 = (TextView) helper.OooO0Oo(R.id.tvGet);
            TextView textView4 = (TextView) helper.OooO0Oo(R.id.tvContent);
            TextView textView5 = (TextView) helper.OooO0Oo(R.id.tvContentYellow);
            ImageView imageView = (ImageView) helper.OooO0Oo(R.id.ivArrow);
            View viewOooO0Oo = helper.OooO0Oo(R.id.viewLine0);
            View viewOooO0Oo2 = helper.OooO0Oo(R.id.viewLine1);
            View viewOooO0Oo3 = helper.OooO0Oo(R.id.viewLine10);
            r7.setClickable(false);
            r7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o0o0OoOO.c6
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    Function2<? super RoomItemInfoModel, ? super Integer, Unit> function2;
                    RoomSettingActivity.OooO0O0 this$0 = this.f44232OooO00o;
                    RoomItemInfoModel model2 = model;
                    OooO0o helper2 = helper;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    Intrinsics.checkNotNullParameter(model2, "$model");
                    Intrinsics.checkNotNullParameter(helper2, "$helper");
                    if (compoundButton.isPressed() && (function2 = this$0.f23004OooO00o) != null) {
                        function2.invoke(model2, Integer.valueOf(helper2.getLayoutPosition()));
                    }
                }
            });
            netImageView.setImageDrawable(null);
            netImageView.setVisibility(8);
            tvTitle.setText("");
            Intrinsics.checkNotNullExpressionValue(tvTitle, "tvTitle");
            oo0o0O0.OooO0oO(tvTitle, null);
            textView2.setVisibility(8);
            textView4.setText("");
            textView4.setVisibility(8);
            textView5.setText("");
            textView5.setVisibility(8);
            textView3.setVisibility(8);
            viewOooO0Oo.setVisibility(8);
            viewOooO0Oo2.setVisibility(0);
            viewOooO0Oo3.setVisibility(0);
            r7.setVisibility(8);
            textView.setVisibility(8);
            imageView.setVisibility(0);
            if (model.getShowRedPoint()) {
                textView2.setVisibility(0);
            } else {
                textView2.setVisibility(8);
            }
            if (!TextUtils.isEmpty(model.getHeadUrl())) {
                netImageView.setVisibility(0);
                oO0O000o.OooO00o oooO00o2 = new oO0O000o.OooO00o(getContext());
                oooO00o2.f48447OooO0OO = model.getHeadUrl();
                oooO00o2.f48445OooO00o = 0;
                oooO00o2.f48459OooOOOo = R.drawable.icon_head_default;
                oooO00o2.f48449OooO0o = R.drawable.icon_head_default;
                oooO00o2.OooO0o(netImageView);
                imageView.setVisibility(8);
            }
            if (!TextUtils.isEmpty(model.getContent())) {
                textView4.setVisibility(0);
                textView4.setText(model.getContent());
            }
            if (model.getTitleBottom().length() > 0) {
                textView.setVisibility(0);
                textView.setText(model.getTitleBottom());
            }
            tvTitle.setTextColor(o000O0O0.OooO00o(R.color.color_alpha_87));
            tvTitle.setText(model.getTitle());
            oo0o0O0.OooO0oO(tvTitle, null);
            ProfileLimitModel profileLimitModel = model.getProfileLimitModel();
            if (profileLimitModel != null) {
                oo0o0O0.OooO0oO(tvTitle, this.f23005OooO0O0);
                if (profileLimitModel.getExpireTime() <= 0 || profileLimitModel.getExpireTime() >= System.currentTimeMillis()) {
                    if (model.getTag() == RoomItemInfoModelTag.RoomName) {
                        textView4.setHint(o000O0O0.OooO0OO(R.string.single_Yalla) + ' ' + model.getBarIdx());
                    }
                    if (model.getTag() == RoomItemInfoModelTag.Head) {
                        oO0O000o.OooO00o oooO00o3 = new oO0O000o.OooO00o(getContext());
                        oooO00o3.f48447OooO0OO = "";
                        i = 0;
                        oooO00o3.f48445OooO00o = 0;
                        oooO00o3.f48459OooOOOo = R.drawable.icon_head_default;
                        oooO00o3.f48449OooO0o = R.drawable.icon_head_default;
                        oooO00o3.OooO0o(netImageView);
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
                textView5.setVisibility(i);
                textView5.setText(String.valueOf(model.getMembershipFee()));
            }
            if (model.getIsBelow()) {
                viewOooO0Oo.setVisibility(i);
                i2 = 8;
                viewOooO0Oo2.setVisibility(8);
                viewOooO0Oo3.setVisibility(8);
            } else {
                i2 = 8;
            }
            Boolean isTurnOnSwitch = model.getIsTurnOnSwitch();
            if (isTurnOnSwitch != null) {
                boolean zBooleanValue = isTurnOnSwitch.booleanValue();
                imageView.setVisibility(i2);
                r7.setVisibility(i);
                r7.setChecked(zBooleanValue);
            }
            if (RoomItemInfoModelTag.Bonus == model.getTag()) {
                if (o00OO000.OooO0O0.f43232OooO00o.OooO0O0() <= 0) {
                    textView2.setVisibility(8);
                    return;
                }
                textView3.setText(model.getWageText());
                textView3.setVisibility(0);
                textView2.setVisibility(0);
            }
        }
    }

    public /* synthetic */ class OooO0OO {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RoomItemInfoModelTag.values().length];
            iArr[RoomItemInfoModelTag.Head.ordinal()] = 1;
            iArr[RoomItemInfoModelTag.RoomName.ordinal()] = 2;
            iArr[RoomItemInfoModelTag.Announcement.ordinal()] = 3;
            iArr[RoomItemInfoModelTag.Tag.ordinal()] = 4;
            iArr[RoomItemInfoModelTag.Permissions.ordinal()] = 5;
            iArr[RoomItemInfoModelTag.NumberOfMic.ordinal()] = 6;
            iArr[RoomItemInfoModelTag.MemberFee.ordinal()] = 7;
            iArr[RoomItemInfoModelTag.Bonus.ordinal()] = 8;
            iArr[RoomItemInfoModelTag.ForbiddenList.ordinal()] = 9;
            iArr[RoomItemInfoModelTag.AllowOpenApplyMic.ordinal()] = 10;
            iArr[RoomItemInfoModelTag.EnterRoomAllow.ordinal()] = 11;
            iArr[RoomItemInfoModelTag.KickRecord.ordinal()] = 12;
            iArr[RoomItemInfoModelTag.AllowLockMic.ordinal()] = 13;
            iArr[RoomItemInfoModelTag.CreateEvent.ordinal()] = 14;
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

    public static final class OooOO0 extends Lambda implements Function3<o0O00O<Boolean>, oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ ArrayList<SelectDialogModel<String>> f23007Oooo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ int f23008OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ RoomSettingActivity f23009OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(ArrayList<SelectDialogModel<String>> arrayList, RoomSettingActivity roomSettingActivity, int i) {
            super(3);
            this.f23007Oooo = arrayList;
            this.f23009OoooO00 = roomSettingActivity;
            this.f23008OoooO0 = i;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(o0O00O<Boolean> o0o00o2, oOO00O ooo00o, Integer num) {
            o0O00O<Boolean> it = o0o00o2;
            oOO00O ooo00o2 = ooo00o;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(it, "it");
            if ((iIntValue & 14) == 0) {
                iIntValue |= ooo00o2.Oooo0oo(it) ? 4 : 2;
            }
            int i = iIntValue;
            if ((i & 91) == 18 && ooo00o2.OooOo0()) {
                ooo00o2.OooOoo0();
            } else {
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = p100o000oOoO.oo0o0O0.f29723OooO00o;
                o0O0oo0o.OooO0O0(it, null, this.f23007Oooo, null, false, new OooOOOO(this.f23009OoooO00, this.f23008OoooO0), null, null, 0L, null, null, null, ooo00o2, (i & 14) | 512, 0, 4058);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function0<Unit> {
        public OooOO0O() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            RoomSettingActivity.this.f22999o00o0O = false;
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function1<Boolean, Unit> {
        public OooOOO0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Boolean bool) {
            if (bool.booleanValue()) {
                RoomSettingActivity roomSettingActivity = RoomSettingActivity.this;
                Oooo000.f33163OooO00o.OooO0O0(roomSettingActivity, 1.0f, 1.0f, false, false, new OooOo00(roomSettingActivity));
                RoomSettingActivity.this.f22999o00o0O = false;
            } else {
                RoomSettingActivity.this.f22999o00o0O = false;
            }
            return Unit.INSTANCE;
        }
    }

    public final OooO0O0 OooOoo() {
        return (OooO0O0) this.f22998o00Ooo.getValue();
    }

    public final z6 OooOooO() {
        return (z6) this.f22989OooooO0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.ArrayList, java.util.List<com.app.base.model.RoomItemInfoModel>] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.ArrayList, java.util.List<com.app.base.model.RoomItemInfoModel>] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.ArrayList, java.util.List<com.app.base.model.RoomItemInfoModel>] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.ArrayList, java.util.List<com.app.base.model.RoomItemInfoModel>] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.ArrayList, java.util.List<com.app.base.model.RoomItemInfoModel>] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList, java.util.List<com.app.base.model.RoomItemInfoModel>] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.ArrayList, java.util.List<com.app.base.model.RoomItemInfoModel>] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.ArrayList, java.util.List<com.app.base.model.RoomItemInfoModel>] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.ArrayList, java.util.List<com.app.base.model.RoomItemInfoModel>] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.ArrayList, java.util.List<com.app.base.model.RoomItemInfoModel>] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.ArrayList, java.util.List<com.app.base.model.RoomItemInfoModel>] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList, java.util.List<com.app.base.model.RoomItemInfoModel>] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.ArrayList, java.util.List<com.app.base.model.RoomItemInfoModel>] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.ArrayList, java.util.List<com.app.base.model.RoomItemInfoModel>] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.ArrayList, java.util.List<com.app.base.model.RoomItemInfoModel>] */
    public final void OooOooo() {
        o00OO0O0.OooO00o oooO00o = o00OO0O0.f43338OooooOo;
        Integer value = oooO00o.OooO00o().f43363OooOo0o.getValue();
        CategoryModel value2 = oooO00o.OooO00o().f43359OooOo.getValue();
        Boolean value3 = oooO00o.OooO00o().f43373Oooo000.getValue();
        if (value3 == null) {
            value3 = Boolean.FALSE;
        }
        boolean zBooleanValue = value3.booleanValue();
        if (this.f22991OooooOo == null) {
            return;
        }
        this.f22990OooooOO.clear();
        ?? r4 = this.f22990OooooOO;
        int i = 1;
        RoomItemInfoModel roomItemInfoModel = new RoomItemInfoModel(o000O0O0.OooO0OO(R.string.profile), true, RoomItemInfoModelTag.Head);
        RoomConfiguration roomConfiguration = this.f22991OooooOo;
        roomItemInfoModel.setHeadUrl(roomConfiguration != null ? roomConfiguration.getBarimage() : null);
        roomItemInfoModel.setProfileLimitModel(this.f23001o0OoOo0.getValue());
        r4.add(roomItemInfoModel);
        ?? r5 = this.f22990OooooOO;
        RoomItemInfoModel roomItemInfoModel2 = new RoomItemInfoModel(o000O0O0.OooO0OO(R.string.Room_name), true, RoomItemInfoModelTag.RoomName);
        RoomConfiguration roomConfiguration2 = this.f22991OooooOo;
        roomItemInfoModel2.setContent(roomConfiguration2 != null ? roomConfiguration2.getBarname() : null);
        roomItemInfoModel2.setProfileLimitModel(this.f23002ooOO.getValue());
        RoomConfiguration roomConfiguration3 = this.f22991OooooOo;
        roomItemInfoModel2.setBarIdx(roomConfiguration3 != null ? roomConfiguration3.getBaridx() : null);
        r5.add(roomItemInfoModel2);
        ?? r6 = this.f22990OooooOO;
        RoomItemInfoModel roomItemInfoModel3 = new RoomItemInfoModel(o000O0O0.OooO0OO(R.string.Announcement), true, RoomItemInfoModelTag.Announcement);
        RoomConfiguration roomConfiguration4 = this.f22991OooooOo;
        roomItemInfoModel3.setContent(roomConfiguration4 != null ? roomConfiguration4.getNotice() : null);
        roomItemInfoModel3.setProfileLimitModel(this.f22996o00O0O.getValue());
        r6.add(roomItemInfoModel3);
        ?? r7 = this.f22990OooooOO;
        RoomItemInfoModel roomItemInfoModel4 = new RoomItemInfoModel(o000O0O0.OooO0OO(R.string.createBar_txt_Category), false, RoomItemInfoModelTag.Tag);
        roomItemInfoModel4.setContent("");
        if (value2 != null) {
            ApiTagUtils apiTagUtils = ApiTagUtils.INSTANCE;
            String id = value2.getId();
            Intrinsics.checkNotNullExpressionValue(id, "categoryModel.getId()");
            roomItemInfoModel4.setContent(apiTagUtils.getModelNameForId(id));
        }
        r7.add(roomItemInfoModel4);
        ?? r2 = this.f22990OooooOO;
        RoomItemInfoModel roomItemInfoModel5 = new RoomItemInfoModel(o000O0O0.OooO0OO(R.string.Membership_fee), true, RoomItemInfoModelTag.MemberFee);
        roomItemInfoModel5.setMembershipFee(value != null ? value.intValue() : 0);
        r2.add(roomItemInfoModel5);
        ?? r1 = this.f22990OooooOO;
        RoomItemInfoModel roomItemInfoModel6 = new RoomItemInfoModel(o000O0O0.OooO0OO(R.string.room_info_bonus), false, RoomItemInfoModelTag.Bonus);
        roomItemInfoModel6.setWageText(o000O0O0.OooO0OO(R.string.get_bonus));
        if (o00OO000.OooO0O0.f43232OooO00o.OooO0O0() > 0) {
            roomItemInfoModel6.setShowRedPoint(true);
        }
        r1.add(roomItemInfoModel6);
        ?? r3 = this.f22990OooooOO;
        RoomItemInfoModel roomItemInfoModel7 = new RoomItemInfoModel(o000O0O0.OooO0OO(R.string.number_of_mic), true, RoomItemInfoModelTag.NumberOfMic);
        roomItemInfoModel7.setContent("10");
        if (this.f22995Ooooooo == 0) {
            roomItemInfoModel7.setContent(FeedbackType.Others);
        }
        r3.add(roomItemInfoModel7);
        ?? r8 = this.f22990OooooOO;
        RoomItemInfoModel roomItemInfoModel8 = new RoomItemInfoModel(o000O0O0.OooO0OO(R.string.title_RoomEdit_micMode), true, RoomItemInfoModelTag.Permissions);
        roomItemInfoModel8.setContent(o000O0O0.OooO0OO(R.string.title_RoomEdit_memberOnly));
        if (o000O00O.OooO().f32453OoooO0O != null && o000O00O.OooO().f32453OoooO0O.isGuestlive()) {
            roomItemInfoModel8.setContent(o000O0O0.OooO0OO(R.string.everyone));
        }
        r8.add(roomItemInfoModel8);
        ?? r9 = this.f22990OooooOO;
        RoomItemInfoModel roomItemInfoModel9 = new RoomItemInfoModel(o000O0O0.OooO0OO(R.string.room_set_mic_lock_state), true, RoomItemInfoModelTag.AllowLockMic);
        roomItemInfoModel9.setTurnOnSwitch(oooO00o.OooO00o().f43374Oooo00O.getValue());
        r9.add(roomItemInfoModel9);
        ?? r10 = this.f22990OooooOO;
        RoomItemInfoModel roomItemInfoModel10 = new RoomItemInfoModel(o000O0O0.OooO0OO(R.string.room_set_admin_open_app_mic), false, RoomItemInfoModelTag.AllowOpenApplyMic);
        o00OO000.OooO0o oooO0o = o00OO000.OooO0o.f43245OooO00o;
        roomItemInfoModel10.setShowRedPoint(oooO0o.OooO0O0());
        roomItemInfoModel10.setTurnOnSwitch(Boolean.valueOf(oooO0o.OooO0OO()));
        r10.add(roomItemInfoModel10);
        ?? r11 = this.f22990OooooOO;
        RoomItemInfoModel roomItemInfoModel11 = new RoomItemInfoModel(o000O0O0.OooO0OO(R.string.room_setting_create_event_title), false, RoomItemInfoModelTag.CreateEvent);
        roomItemInfoModel11.setTitleBottom(o000O0O0.OooO0OO(R.string.room_setting_create_event_title_bottom));
        roomItemInfoModel11.setTurnOnSwitch(oooO00o.OooO00o().f43377Oooo0OO.getValue());
        roomItemInfoModel11.setShowRedPoint(true);
        p499o0o00Oo.OooOOO0 oooOOO0 = p499o0o00Oo.OooOOO0.f41199OooO00o;
        if (p499o0o00Oo.OooOOO0.OooO0o0().OooOO0O()) {
            roomItemInfoModel11.setShowRedPoint(false);
        }
        r11.add(roomItemInfoModel11);
        this.f22990OooooOO.add(new RoomItemInfoModel(o000O0O0.OooO0OO(R.string.room_info_ban), true, RoomItemInfoModelTag.ForbiddenList));
        this.f22990OooooOO.add(new RoomItemInfoModel(o000O0O0.OooO0OO(R.string.room_setting_kick_record), true, RoomItemInfoModelTag.KickRecord));
        ?? r0 = this.f22990OooooOO;
        RoomItemInfoModel roomItemInfoModel12 = new RoomItemInfoModel(o000O0O0.OooO0OO(R.string.room_enter_allow), false, RoomItemInfoModelTag.EnterRoomAllow);
        roomItemInfoModel12.setTitleBottom(o000O0O0.OooO0OO(R.string.room_enter_allow_tip));
        roomItemInfoModel12.setTurnOnSwitch(Boolean.valueOf(!zBooleanValue));
        r0.add(roomItemInfoModel12);
        OooOoo().f23004OooO00o = new OooO();
        OooOoo().setOnItemClickListener(new o0o0Oo(this, i));
        OooOoo().setNewData(this.f22990OooooOO);
    }

    public final void Oooo000(RoomItemInfoModel roomItemInfoModel, int i) {
        List<SelectItemModel> list;
        List<SelectItemModel> list2;
        List<SelectItemModel> list3;
        List<SelectItemModel> list4;
        List<SelectItemModel> list5;
        List<SelectItemModel> list6;
        List<SelectItemModel> list7;
        List<SelectItemModel> list8;
        RoomItemInfoModelTag tag = roomItemInfoModel.getTag();
        int i2 = 2;
        boolean z = false;
        switch (tag == null ? -1 : OooO0OO.$EnumSwitchMapping$0[tag.ordinal()]) {
            case 1:
                ProfileLimitModel value = this.f23001o0OoOo0.getValue();
                if (value == null) {
                    Oooo00o();
                } else {
                    String strOooO00o = com.yalla.support.common.util.OooOo.OooO00o(o000O0O0.OooO0OO(R.string.RoomInfoEdit_ChangeLimit_HintContent_Header), String.valueOf(value.getBlockReason()));
                    if (value.getExpireTime() > 0 && (System.currentTimeMillis() / ((long) 1000)) - value.getExpireTime() <= 0) {
                        strOooO00o = com.yalla.support.common.util.OooOo.OooO00o(com.yalla.support.common.util.OooOo.OooO00o(o000O0O0.OooO0OO(R.string.RoomInfoEdit_ChangeLimit_HintContent_Header_Time), String.valueOf(value.getBlockReason())), oo00o.f48643OooO00o.OooO0Oo(value.getExpireTime(), System.currentTimeMillis()));
                        z = true;
                    }
                    oo0oOO0 oo0ooo0 = new oo0oOO0(this);
                    oo0ooo0.OooOo0O(strOooO00o);
                    if (z) {
                        oo0ooo0.OooOOo(true);
                    } else {
                        oo0ooo0.OooOoOO(true);
                        oo0ooo0.OooOOo0(o000O0O0.OooO0OO(R.string.Continue_));
                        oo0ooo0.OooOo0o(new e6(this));
                    }
                    oo0ooo0.OooOOO0();
                }
                break;
            case 2:
                ProfileLimitModel value2 = this.f23002ooOO.getValue();
                if (value2 == null) {
                    RoomReNameActivity.OooOoO(this, this.f22991OooooOo);
                } else {
                    String strOooO00o2 = com.yalla.support.common.util.OooOo.OooO00o(o000O0O0.OooO0OO(R.string.RoomInfoEdit_ChangeLimit_HintContent_Name), String.valueOf(value2.getBlockReason()));
                    if (value2.getExpireTime() > 0 && (System.currentTimeMillis() / ((long) 1000)) - value2.getExpireTime() <= 0) {
                        strOooO00o2 = com.yalla.support.common.util.OooOo.OooO00o(com.yalla.support.common.util.OooOo.OooO00o(o000O0O0.OooO0OO(R.string.RoomInfoEdit_ChangeLimit_HintContent_Name_Time), String.valueOf(value2.getBlockReason())), oo00o.f48643OooO00o.OooO0Oo(value2.getExpireTime(), System.currentTimeMillis()));
                        z = true;
                    }
                    oo0oOO0 oo0ooo1 = new oo0oOO0(this);
                    oo0ooo1.OooOo0O(strOooO00o2);
                    if (!z) {
                        oo0ooo1.OooOoO0(o000O0O0.OooO0OO(R.string.Cancel));
                        oo0ooo1.OooOOo0(o000O0O0.OooO0OO(R.string.Continue_));
                        oo0ooo1.OooOo0o(new f6(this));
                    }
                    oo0ooo1.OooOOO0();
                }
                break;
            case 3:
                p160o00OoOO.o00O000o.OooO00o(this, this.f22996o00O0O.getValue(), new g6(this));
                break;
            case 4:
                RoomConfiguration roomConfiguration = this.f22991OooooOo;
                if (roomConfiguration != null) {
                    Intent intent = new Intent(this, (Class<?>) RoomReTagActivity.class);
                    intent.putExtra("Module", roomConfiguration);
                    startActivityForResult(intent, 107);
                    break;
                }
                break;
            case 5:
                RoomConfiguration roomConfiguration2 = o000O00O.OooO().f32453OoooO0O;
                if (roomConfiguration2 == null || roomConfiguration2.getBarlevel() >= 4) {
                    this.f22993Oooooo0 = null;
                    SelectModel selectModel = new SelectModel(o000O0O0.OooO0OO(R.string.title_RoomEdit_micMode), o000O0O0.OooO0OO(R.string.OK), "");
                    this.f22993Oooooo0 = selectModel;
                    List<SelectItemModel> list9 = selectModel.getList();
                    if (list9 != null) {
                        list9.clear();
                    }
                    if (roomConfiguration2 == null || !roomConfiguration2.isGuestlive()) {
                        SelectModel selectModel2 = this.f22993Oooooo0;
                        if (selectModel2 != null && (list2 = selectModel2.getList()) != null) {
                            list2.add(new SelectItemModel(o000O0O0.OooO0OO(R.string.title_RoomEdit_memberOnly), true, 0L));
                        }
                        SelectModel selectModel3 = this.f22993Oooooo0;
                        if (selectModel3 != null && (list = selectModel3.getList()) != null) {
                            list.add(new SelectItemModel(o000O0O0.OooO0OO(R.string.everyone), false, 1L));
                        }
                    } else {
                        SelectModel selectModel4 = this.f22993Oooooo0;
                        if (selectModel4 != null && (list4 = selectModel4.getList()) != null) {
                            list4.add(new SelectItemModel(o000O0O0.OooO0OO(R.string.title_RoomEdit_memberOnly), false, 0L));
                        }
                        SelectModel selectModel5 = this.f22993Oooooo0;
                        if (selectModel5 != null && (list3 = selectModel5.getList()) != null) {
                            list3.add(new SelectItemModel(o000O0O0.OooO0OO(R.string.everyone), true, 1L));
                        }
                    }
                    Oooo00O(1);
                    break;
                } else {
                    String strOooO0OO = o000O0O0.OooO0OO(R.string.room_level__change_settings_tips);
                    ToastUtil toastUtil = ToastUtil.f12583OooO0O0;
                    if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                        o0O0ooO o0o0oooOooO0O0 = p074o000O0oo.OooOOO.OooO0O0(toastUtil, strOooO0OO, "runnable");
                        if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            p255o00ooO0O.o00O000 o00o001 = p255o00ooO0O.o00O000.f34368OooO00o;
                            p255o00ooO0O.o00O000.f34370OooO0OO.post(o0o0oooOooO0O0);
                        } else {
                            o0o0oooOooO0O0.run();
                        }
                        break;
                    }
                }
                break;
            case 6:
                o0O00000.OooO0OO("InRoom_setting_mic");
                this.f22993Oooooo0 = null;
                SelectModel selectModel6 = new SelectModel(o000O0O0.OooO0OO(R.string.number_of_mic), o000O0O0.OooO0OO(R.string.button_CONFIRM), o000O0O0.OooO0OO(R.string.CANCEL));
                this.f22993Oooooo0 = selectModel6;
                List<SelectItemModel> list10 = selectModel6.getList();
                if (list10 != null) {
                    list10.clear();
                }
                o00OO0O0.OooO00o oooO00o = o00OO0O0.f43338OooooOo;
                Integer value3 = oooO00o.OooO00o().f43379Oooo0o0.getValue();
                Integer value4 = oooO00o.OooO00o().f43345OooO0o.getValue();
                Intrinsics.checkNotNull(value4);
                int iIntValue = value4.intValue();
                Intrinsics.checkNotNull(value3);
                if (iIntValue >= value3.intValue()) {
                    if (this.f22995Ooooooo == 0) {
                        SelectModel selectModel7 = this.f22993Oooooo0;
                        if (selectModel7 != null && (list8 = selectModel7.getList()) != null) {
                            list8.add(new SelectItemModel(FeedbackType.Others, true));
                        }
                        SelectModel selectModel8 = this.f22993Oooooo0;
                        if (selectModel8 != null && (list7 = selectModel8.getList()) != null) {
                            list7.add(new SelectItemModel("10", false));
                        }
                    } else {
                        SelectModel selectModel9 = this.f22993Oooooo0;
                        if (selectModel9 != null && (list6 = selectModel9.getList()) != null) {
                            list6.add(new SelectItemModel(FeedbackType.Others, false));
                        }
                        SelectModel selectModel10 = this.f22993Oooooo0;
                        if (selectModel10 != null && (list5 = selectModel10.getList()) != null) {
                            list5.add(new SelectItemModel("10", true));
                        }
                    }
                    Oooo00O(2);
                    break;
                } else {
                    String strOooO00o3 = com.yalla.support.common.util.OooOo.OooO00o(o000O0O0.OooO0OO(R.string.you_can_set_number_of_mic), value3.toString());
                    ToastUtil toastUtil2 = ToastUtil.f12583OooO0O0;
                    if (!StringsKt.isBlank(strOooO00o3)) {
                        o0O0ooO o0o0oooOooO0O1 = p074o000O0oo.OooOOO.OooO0O0(toastUtil2, strOooO00o3, "runnable");
                        if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            p255o00ooO0O.o00O000 o00o002 = p255o00ooO0O.o00O000.f34368OooO00o;
                            p255o00ooO0O.o00O000.f34370OooO0OO.post(o0o0oooOooO0O1);
                        } else {
                            o0o0oooOooO0O1.run();
                        }
                        break;
                    }
                }
                break;
            case 7:
                if (this.f22992Oooooo == null) {
                    String strOooO0OO2 = o000O0O0.OooO0OO(R.string.title_RoomEdit_memberDesc);
                    Integer value5 = o00OO0O0.f43338OooooOo.OooO00o().f43363OooOo0o.getValue();
                    Intrinsics.checkNotNull(value5);
                    this.f22992Oooooo = new MemberFeeModel(strOooO0OO2, value5.intValue(), 0, 500);
                }
                MemberFeeModel memberFeeModel = this.f22992Oooooo;
                if (memberFeeModel != null) {
                    Intrinsics.checkNotNull(this, "null cannot be cast to non-null type com.app.base.base.activity.BaseFragmentActivity");
                    String infoTop = memberFeeModel.getContent();
                    Intrinsics.checkNotNullExpressionValue(infoTop, "memberFeeModel.content");
                    int fee = memberFeeModel.getFee();
                    int min = memberFeeModel.getMin();
                    int max = memberFeeModel.getMax();
                    i6 onConfirmClick = new i6(this);
                    Intrinsics.checkNotNullParameter(this, "activity");
                    Intrinsics.checkNotNullParameter(infoTop, "infoTop");
                    Intrinsics.checkNotNullParameter(onConfirmClick, "onConfirmClick");
                    showDialog((String) null, o00O0000.OooO0O0(2059378828, true, new o0O0O00(infoTop, onConfirmClick, fee, min, max)));
                }
                break;
            case 8:
                o0O00000.OooO0OO("InRoom_setting_bonus");
                SharedUrlManager.INSTANCE.getRoomBonusUrl().observe(this, new o000OO(this, i2));
                break;
            case 9:
                o0O00000.OooO0OO("InRoom_setting_BlockedList");
                Intrinsics.checkNotNullParameter(this, "activity");
                startActivity(new Intent(this, (Class<?>) BanEnterRoomListActivity.class));
                break;
            case 10:
                o00OO000.OooO0o oooO0o = o00OO000.OooO0o.f43245OooO00o;
                p608o0oo0O.OooOo.OooO0OO("102232", MapsKt.mapOf(new Pair("type", Integer.valueOf(!oooO0o.OooO0OO() ? 1 : 0))));
                p160o00OoOO.o00O000 o00o000OooO = p160o00OoOO.o00O000.OooO();
                boolean z2 = !oooO0o.OooO0OO();
                Objects.requireNonNull(o00o000OooO);
                if (p160o00OoOO.o00O000.f32490OooO00o != null) {
                    Room.AllowAdminOpenMicApplyRequest.Builder builderNewBuilder = Room.AllowAdminOpenMicApplyRequest.newBuilder();
                    builderNewBuilder.setRoomId(o00OO0O0.f43338OooooOo.OooO00o().f43344OooO0Oo.getValue().longValue());
                    builderNewBuilder.setUserId(p500o0o00Oo0.OooOOO.f41235OooO00o.OooOo().getValue().longValue());
                    builderNewBuilder.setOp(z2 ? 1L : 2L);
                    p160o00OoOO.o00O000.f32490OooO00o.OooO0oO(1001108, builderNewBuilder.build().toByteArray());
                }
                break;
            case 11:
                if (!this.f23000o00ooo) {
                    this.f23000o00ooo = true;
                    Boolean value6 = o00OO0O0.f43338OooooOo.OooO00o().f43373Oooo000.getValue();
                    p160o00OoOO.o00O000 o00o000OooO2 = p160o00OoOO.o00O000.OooO();
                    Intrinsics.checkNotNull(value6);
                    o00o000OooO2.OooO0oO(value6.booleanValue() ? 2 : 1);
                    break;
                }
                break;
            case 12:
                Intrinsics.checkNotNullParameter(this, "context");
                startActivity(new Intent(this, (Class<?>) KickRecordActivity.class));
                break;
            case 13:
                Boolean value7 = o00OO0O0.f43338OooooOo.OooO00o().f43374Oooo00O.getValue();
                p160o00OoOO.o00O000 o00o000OooO3 = p160o00OoOO.o00O000.OooO();
                int iOooO0O0 = o000Oo0.OooO0O0(value7);
                Objects.requireNonNull(o00o000OooO3);
                if (p160o00OoOO.o00O000.f32490OooO00o != null) {
                    p500o0o00Oo0.OooOOO oooOOO = p500o0o00Oo0.OooOOO.f41235OooO00o;
                    if (p500o0o00Oo0.OooOOO.f41270Oooo0OO.getValue() != null) {
                        Room.AllowMicRightIn.Builder builderNewBuilder2 = Room.AllowMicRightIn.newBuilder();
                        builderNewBuilder2.setRoomId(com.yalla.support.common.util.OooO.OooO0o(p500o0o00Oo0.OooOOO.f41270Oooo0OO.getValue().barid));
                        builderNewBuilder2.setAllowMicStatus(iOooO0O0);
                        p160o00OoOO.o00O000.f32490OooO00o.OooO0oO(1000002, builderNewBuilder2.build().toByteArray());
                    }
                }
                break;
            case 14:
                Boolean value8 = o00OO0O0.f43338OooooOo.OooO00o().f43377Oooo0OO.getValue();
                boolean zBooleanValue = value8 == null ? false : value8.booleanValue();
                RoomConfiguration roomConfiguration3 = this.f22991OooooOo;
                String barid = roomConfiguration3 != null ? roomConfiguration3.getBarid() : null;
                if (!(barid == null || StringsKt.isBlank(barid))) {
                    p608o0oo0O.OooOo.OooO0O0(!zBooleanValue ? "102011" : "102012");
                    o00oO0o o00oo0o2 = o00000OO.f32228OooO00o;
                    oo0o0Oo oo0o0oo = o00000OO.f32231OooO0Oo;
                    RoomConfiguration roomConfiguration4 = this.f22991OooooOo;
                    String barid2 = roomConfiguration4 != null ? roomConfiguration4.getBarid() : null;
                    boolean z3 = !zBooleanValue;
                    h6 h6Var = new h6(this, i, zBooleanValue);
                    Map<String, String> mapOooO0O0 = o00OO0OO.OooO0O0();
                    mapOooO0O0.put(ContributionFragment.ARG_1, barid2);
                    if (z3) {
                        mapOooO0O0.put("isManageEvent", "1");
                    } else {
                        mapOooO0O0.put("isManageEvent", AppEventsConstants.EVENT_PARAM_VALUE_NO);
                    }
                    o0ooOOo o0ooooo2 = o0ooOOo.f32239OooO00o;
                    o00OO0OO.OooO0Oo(null, o0ooOOo.f32265OooOoo, "/Webservers/Bar/SetEventManage", mapOooO0O0, h6Var);
                    break;
                }
                break;
        }
    }

    public final void Oooo00O(int i) {
        List<SelectItemModel> list;
        if (this.f22993Oooooo0 == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        SelectModel selectModel = this.f22993Oooooo0;
        if (selectModel != null && (list = selectModel.getList()) != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                SelectDialogModel content = new SelectDialogModel().setContent(list.get(i2).getName());
                Intrinsics.checkNotNull(content, "null cannot be cast to non-null type com.app.base.dialog.baseDialog.SelectDialogModel<kotlin.String>");
                arrayList.add(content);
            }
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type com.app.base.base.activity.IComposeDialog");
        showDialog((String) null, o00O0000.OooO0O0(-851438377, true, new OooOO0(arrayList, this, i)));
    }

    public final void Oooo00o() {
        if (this.f22999o00o0O) {
            return;
        }
        this.f22999o00o0O = true;
        p620o0oo0o0.o0O0O00.OooO0OO(this, p620o0oo0o0.oo0o0Oo.f48624OooO0O0, new OooOO0O(), new OooOOO0());
    }

    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, @Nullable Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 105) {
            setResult(-1);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        finish();
        super.onBackPressed();
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        ArrayList<ProfileLimitModel> profileLimit;
        super.onCreate(bundle);
        setContentView(OooOooO().f51064OooO00o);
        this.f22997o00Oo0 = (RoomInfoEditVM) new ViewModelProvider(this).get(RoomInfoEditVM.class);
        if (getIntent() == null || o000O00O.OooO().f32451OoooO0 == null) {
            finish();
        } else {
            Serializable serializableExtra = getIntent().getSerializableExtra("Module");
            Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.app.base.mixedroom.model.RoomConfiguration");
            this.f22991OooooOo = (RoomConfiguration) serializableExtra;
        }
        HeaderLayout headerLayout = this.f11480OoooOOO;
        if (headerLayout != null) {
            headerLayout.setTitle(R.string.Settings);
        }
        HeaderLayout headerLayout2 = this.f11480OoooOOO;
        if (headerLayout2 != null) {
            headerLayout2.OooOoO0(new d6(this));
        }
        OooOo0O(0);
        OooOooO().f51065OooO0O0.setLayoutManager(new FixLinearLayoutManager(this));
        OooOooO().f51065OooO0O0.setAdapter(OooOoo());
        if (o000O00O.OooO().f32451OoooO0 != null) {
            this.f22995Ooooooo = o000O00O.OooO().f32451OoooO0.getRoom().getMictype();
        }
        OooOooo();
        o00OO0O0.OooO00o oooO00o = o00OO0O0.f43338OooooOo;
        int i = 2;
        oooO00o.OooO00o().f43363OooOo0o.observe(this, new o0000(this, i));
        int i2 = 4;
        oooO00o.OooO00o().f43359OooOo.observe(this, new o0000OO0(this, i2));
        LiveEventBus.get("FORBID_GUESTS_ENTER_ROOM", Boolean.TYPE).observe(this, new o000O0o(this, i));
        MutableLiveData<Boolean> mutableLiveData = oooO00o.OooO00o().f43373Oooo000;
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        mutableLiveData.observe(this, new p143o00OOooO.o000Oo0(this, 7));
        oooO00o.OooO00o().f43374Oooo00O.observe(this, new o000O000(this, i2));
        LiveEventBus.get("RoomHeaderUrl").observe(this, new o0OOO0o(this, i));
        int i3 = 3;
        LiveEventBus.get("RoomName").observe(this, new p143o00OOooO.o000O(this, i3));
        LiveEventBus.get("ALLOW_ROOM_MANAGER_OPEN_APPLY_MIC").observe(this, new o000OO0O(this, i3));
        LiveEventBus.get("RoomAnnouncement").observe(this, new p143o00OOooO.o000O0O0(this, i2));
        this.f23001o0OoOo0.observe(this, new o00(this, i2));
        this.f23002ooOO.observe(this, new o0000Ooo(this, i3));
        this.f22996o00O0O.observe(this, new o000(this, i3));
        this.f23001o0OoOo0.setValue(null);
        this.f23002ooOO.setValue(null);
        this.f22996o00O0O.setValue(null);
        RoomConfiguration roomConfiguration = this.f22991OooooOo;
        if (roomConfiguration == null || (profileLimit = roomConfiguration.getProfileLimit()) == null) {
            return;
        }
        for (ProfileLimitModel profileLimitModel : profileLimit) {
            int operationType = profileLimitModel.getOperationType();
            if (operationType == 1) {
                this.f23001o0OoOo0.setValue(profileLimitModel);
            } else if (operationType == 2) {
                this.f23002ooOO.setValue(profileLimitModel);
            } else if (operationType == 3) {
                this.f22996o00O0O.setValue(profileLimitModel);
            }
        }
    }

    @Override // com.yalla.yalla.ui.activity.BaseActivityK, com.app.base.base.activity.BaseFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        if (o00OO000.OooO0o.f43245OooO00o.OooO0O0()) {
            p499o0o00Oo.OooOOO0 oooOOO0 = p499o0o00Oo.OooOOO0.f41199OooO00o;
            p499o0o00Oo.OooOOO0.OooO0o0().OooOo();
            o00OO000.OooO0o.f43260OooOOo0.setValue(Boolean.FALSE);
        }
        p499o0o00Oo.OooOOO0 oooOOO1 = p499o0o00Oo.OooOOO0.f41199OooO00o;
        if (p499o0o00Oo.OooOOO0.OooO0o0().OooOO0O()) {
            return;
        }
        p499o0o00Oo.OooOOO0.OooO0o0().OooOOO();
        o00OO000 o00oo001 = o00OO000.f43171OooO00o;
        o00OO000.f43221o000oOoO.setValue(Boolean.FALSE);
        o00OO0O0.f43338OooooOo.OooO00o().f43354OooOOOO.postValue(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.app.base.base.activity.BaseFragmentActivity, p141o00OOOoO.OooO0o
    public final void onEventMainThread(@Nullable p141o00OOOoO.OooO0OO<?> oooO0OO) {
        super.onEventMainThread(oooO0OO);
        Integer numValueOf = oooO0OO != null ? Integer.valueOf(oooO0OO.f31906OooO00o) : null;
        if (numValueOf != null && numValueOf.intValue() == 33) {
            T t = oooO0OO.f31908OooO0OO;
            Intrinsics.checkNotNull(t, "null cannot be cast to non-null type com.app.base.mixedroom.model.RoomConfiguration");
            this.f22991OooooOo = (RoomConfiguration) t;
            o00OO0O0.f43338OooooOo.OooO00o().f43351OooOO0o.setValue(this.f22991OooooOo);
            OooOooo();
            return;
        }
        if (numValueOf != null && numValueOf.intValue() == 177) {
            T t2 = oooO0OO.f31908OooO0OO;
            Intrinsics.checkNotNull(t2, "null cannot be cast to non-null type kotlin.Int");
            this.f22995Ooooooo = ((Integer) t2).intValue();
            OooOooo();
            OooOoo().notifyDataSetChanged();
            return;
        }
        if (numValueOf != null && numValueOf.intValue() == 57) {
            o00OO000.OooO0O0 oooO0O0 = o00OO000.OooO0O0.f43232OooO00o;
            o00OO000.OooO0O0.f43234OooO0OO.setValue(0);
            OooOoo().notifyDataSetChanged();
        }
    }
}
