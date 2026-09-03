package com.yalla.yalla.ui.view;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.code.android.util.ToastUtil;
import com.facebook.appevents.OooOOO0;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import com.yalla.yalla.model.MomentPowerSelectModel;
import com.yalla.yalla.model.MomentSendModel;
import com.yalla.yalla.model.MomentTypePower;
import com.yalla.yalla.model.TopicInfoModel;
import com.yalla.yalla.ui.activity.moment.MomentPowerSelectActivity;
import com.yalla.yalla.ui.view.SendMomentLocationPowerView;
import com.yalla.yalla.util.location.LocationInfo;
import com.youth.banner.config.BannerConfig;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p074o000O0oo.OooOOO;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o00O000;
import p254o00ooO0O.o0O0ooO;
import p466o0OooO0.o000O;
import p515o0o0O00.o00O00;
import p522o0o0O0o.oOO00O;
import p544o0o0OoOO.q4;
import p615o0oo0OoO.oO0;
import p620o0oo0o0O.o00O00OO;
import p620o0oo0o0O.o00O00o0;
import p649o0ooOOoo.v9;
import p654o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010%\u001a\u00020$\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&\u0012\b\b\u0002\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007R*\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R.\u0010\u001a\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R*\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\f\u001a\u0004\b\u001c\u0010\u000e\"\u0004\b\u001d\u0010\u0010R\u0017\u0010 \u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006,"}, d2 = {"Lcom/yalla/yalla/ui/view/SendMomentLocationPowerView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "getLocation", "", "showLocation", "setLocationData", "Lcom/yalla/yalla/model/MomentPowerSelectModel;", "selectPostPowerModel", "setMomentPowerSelectModel", "Lkotlin/Function0;", "Oooo0oO", "Lkotlin/jvm/functions/Function0;", "getPowerListener", "()Lkotlin/jvm/functions/Function0;", "setPowerListener", "(Lkotlin/jvm/functions/Function0;)V", "powerListener", "Lcom/yalla/yalla/model/TopicInfoModel;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "OoooO", "Lcom/yalla/yalla/model/TopicInfoModel;", "getTopicInfoModel", "()Lcom/yalla/yalla/model/TopicInfoModel;", "setTopicInfoModel", "(Lcom/yalla/yalla/model/TopicInfoModel;)V", "topicInfoModel", "o000oOoO", "getChangeLocationListener", "setChangeLocationListener", "changeLocationListener", "Lo0ooOOoo/v9;", "binding", "Lo0ooOOoo/v9;", "getBinding", "()Lo0ooOOoo/v9;", "Landroid/content/Context;", d.R, "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class SendMomentLocationPowerView extends ConstraintLayout {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final int f25167Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final v9 f25168Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function0<Unit> powerListener;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public Activity f25170Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public TopicInfoModel topicInfoModel;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @Nullable
    public LocationInfo f25172OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public MomentSendModel f25173OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    @Nullable
    public MomentPowerSelectModel f25174OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public boolean f25175OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    @Nullable
    public Function1<? super String, Unit> f25176OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public boolean f25177OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public boolean f25178OoooOo0;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function0<Unit> changeLocationListener;

    public static final class OooO00o extends Thread {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public static final /* synthetic */ int f25180Oooo = 0;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ oO0 f25181Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ SendMomentLocationPowerView f25182Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ o00Oo00.OooO0OO<LocationInfo> f25183Oooo0oo;

        public OooO00o(oO0 oo0, SendMomentLocationPowerView sendMomentLocationPowerView, o00Oo00.OooO0OO<LocationInfo> oooO0OO) {
            this.f25181Oooo0o = oo0;
            this.f25182Oooo0oO = sendMomentLocationPowerView;
            this.f25183Oooo0oo = oooO0OO;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            try {
                this.f25181Oooo0o.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]).get(this.f25182Oooo0oO.f25167Oooo, TimeUnit.MILLISECONDS);
            } catch (Exception e) {
                this.f25181Oooo0o.cancel(true);
                Activity activity = this.f25182Oooo0oO.f25170Oooo0oo;
                if (activity == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("activity");
                    activity = null;
                }
                activity.runOnUiThread(new OooOOO0(this.f25183Oooo0oo, this.f25182Oooo0oO, 2));
                e.printStackTrace();
            }
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<String, Unit> {
        public OooO0O0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            String str2 = str;
            if (com.yalla.support.common.util.OooO0OO.OooO00o(str2)) {
                SendMomentLocationPowerView.this.getF25168Oooo0o().f50796OooO0oO.setText(str2);
                SendMomentLocationPowerView.this.getF25168Oooo0o().f50796OooO0oO.setHint(o000O0O0.OooO0OO(R.string.Location));
                SendMomentLocationPowerView.this.getF25168Oooo0o().f50789OooO.setVisibility(8);
                SendMomentLocationPowerView.this.getF25168Oooo0o().f50792OooO0OO.setVisibility(8);
            } else {
                SendMomentLocationPowerView.this.getF25168Oooo0o().f50796OooO0oO.setText(str2);
                SendMomentLocationPowerView.this.getF25168Oooo0o().f50789OooO.setVisibility(0);
                SendMomentLocationPowerView.this.getF25168Oooo0o().f50792OooO0OO.setVisibility(0);
            }
            Function0<Unit> changeLocationListener = SendMomentLocationPowerView.this.getChangeLocationListener();
            if (changeLocationListener != null) {
                changeLocationListener.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends o00Oo0 {
        public OooO0OO() {
        }

        @Override // p654o0ooo.o00Oo0
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            char c = 1;
            if (Intrinsics.areEqual(view, SendMomentLocationPowerView.this.getF25168Oooo0o().f50795OooO0o0) ? true : Intrinsics.areEqual(view, SendMomentLocationPowerView.this.getF25168Oooo0o().f50791OooO0O0) ? true : Intrinsics.areEqual(view, SendMomentLocationPowerView.this.getF25168Oooo0o().f50796OooO0oO)) {
                SendMomentLocationPowerView.this.getF25168Oooo0o().f50796OooO0oO.setText(R.string.loading);
                SendMomentLocationPowerView.this.getF25168Oooo0o().f50796OooO0oO.postDelayed(new o000O(SendMomentLocationPowerView.this, c == true ? 1 : 0), 200L);
                return;
            }
            if (!Intrinsics.areEqual(view, SendMomentLocationPowerView.this.getF25168Oooo0o().f50792OooO0OO)) {
                if (Intrinsics.areEqual(view, SendMomentLocationPowerView.this.getF25168Oooo0o().f50794OooO0o) ? true : Intrinsics.areEqual(view, SendMomentLocationPowerView.this.getF25168Oooo0o().f50793OooO0Oo) ? true : Intrinsics.areEqual(view, SendMomentLocationPowerView.this.getF25168Oooo0o().f50797OooO0oo)) {
                    SendMomentLocationPowerView sendMomentLocationPowerView = SendMomentLocationPowerView.this;
                    if (sendMomentLocationPowerView.f25175OoooOO0) {
                        return;
                    }
                    ImageView imageView = sendMomentLocationPowerView.getF25168Oooo0o().f50793OooO0Oo;
                    final SendMomentLocationPowerView sendMomentLocationPowerView2 = SendMomentLocationPowerView.this;
                    imageView.postDelayed(new Runnable() { // from class: o0oo00Oo.o0oo0000
                        @Override // java.lang.Runnable
                        public final void run() {
                            final SendMomentLocationPowerView this$0 = sendMomentLocationPowerView2;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            MomentSendModel momentSendModel = null;
                            if (this$0.getTopicInfoModel() != null) {
                                TopicInfoModel topicInfoModel = this$0.getTopicInfoModel();
                                if (oOO00O.OooO0o(topicInfoModel != null ? Long.valueOf(topicInfoModel.getId()) : null) > 0) {
                                    String strOooO0OO = o000O0O0.OooO0OO(R.string.Posts_including_topics_must_be_public);
                                    ToastUtil toastUtil = ToastUtil.f12568OooO0O0;
                                    if (strOooO0OO == null || StringsKt.isBlank(strOooO0OO)) {
                                        return;
                                    }
                                    o0O0ooO o0o0oooOooO0O0 = OooOOO.OooO0O0(toastUtil, strOooO0OO, "runnable");
                                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                                        o0o0oooOooO0O0.run();
                                        return;
                                    } else {
                                        o00O000 o00o001 = o00O000.f34346OooO00o;
                                        o00O000.f34348OooO0OO.post(o0o0oooOooO0O0);
                                        return;
                                    }
                                }
                            }
                            MomentPowerSelectActivity.OooO00o oooO00o = MomentPowerSelectActivity.f22360OooooOo;
                            Activity activity = this$0.f25170Oooo0oo;
                            if (activity == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("activity");
                                activity = null;
                            }
                            MomentSendModel momentSendModel2 = this$0.f25173OoooO00;
                            if (momentSendModel2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("sendPostModel");
                            } else {
                                momentSendModel = momentSendModel2;
                            }
                            int power = momentSendModel.getPower();
                            o00O00o0 o00o00o1 = new o00O00o0() { // from class: o0oo00Oo.ooo0Oo0
                                @Override // p620o0oo0o0O.o00O00o0
                                public final void onActivityResult(int i, Intent data) {
                                    SendMomentLocationPowerView this$1 = this$0;
                                    Intrinsics.checkNotNullParameter(this$1, "this$0");
                                    Intrinsics.checkNotNullParameter(data, "data");
                                    if (i == -1) {
                                        MomentPowerSelectModel momentPowerSelectModel = (MomentPowerSelectModel) data.getSerializableExtra("Data");
                                        this$1.f25174OoooO0O = momentPowerSelectModel;
                                        if (momentPowerSelectModel != null) {
                                            MomentSendModel momentSendModel3 = this$1.f25173OoooO00;
                                            if (momentSendModel3 == null) {
                                                Intrinsics.throwUninitializedPropertyAccessException("sendPostModel");
                                                momentSendModel3 = null;
                                            }
                                            momentSendModel3.setPower(momentPowerSelectModel.getPower());
                                            this$1.OooO0o0();
                                        }
                                    }
                                }
                            };
                            Intrinsics.checkNotNullParameter(activity, "activity");
                            Bundle bundle = new Bundle();
                            bundle.putInt("Id", power);
                            o00O00OO o00o00oo2 = new o00O00OO((FragmentActivity) activity);
                            o00o00oo2.f48618OooO0O0 = MomentPowerSelectActivity.class;
                            o00o00oo2.OooO00o(bundle);
                            o00o00oo2.OooO0O0(o00o00o1);
                        }
                    }, 200L);
                    return;
                }
                return;
            }
            SendMomentLocationPowerView sendMomentLocationPowerView3 = SendMomentLocationPowerView.this;
            Objects.requireNonNull(sendMomentLocationPowerView3);
            o00O00.OooO0O0("onCancelLocation : isOpenLocation = " + sendMomentLocationPowerView3.f25177OoooOOo);
            MomentSendModel momentSendModel = sendMomentLocationPowerView3.f25173OoooO00;
            if (momentSendModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sendPostModel");
                momentSendModel = null;
            }
            momentSendModel.setAddress("", false);
            Function1<? super String, Unit> function1 = sendMomentLocationPowerView3.f25176OoooOOO;
            if (function1 != null) {
                function1.invoke("");
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SendMomentLocationPowerView(@NotNull Context context) {
        this(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static void OooO0O0(SendMomentLocationPowerView this$0, LocationInfo locationInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f25172OoooO0 = locationInfo;
        this$0.setLocationData(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getLocation() {
        LocationInfo locationInfo = this.f25172OoooO0;
        if (locationInfo != null) {
            if (((locationInfo == null || locationInfo.isNotLocation()) ? false : true) && !this.f25178OoooOo0) {
                setLocationData(false);
                return;
            }
        }
        q4 q4Var = new q4(this);
        Activity activity = this.f25170Oooo0oo;
        if (activity == null) {
            Intrinsics.throwUninitializedPropertyAccessException("activity");
            activity = null;
        }
        new OooO00o(new oO0(activity, q4Var), this, q4Var).start();
    }

    private final void setLocationData(boolean showLocation) {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("getLocation mLocationInfo = ");
        sbOooO0o0.append(this.f25172OoooO0);
        sbOooO0o0.append(" showLocation = ");
        sbOooO0o0.append(showLocation);
        o00O00.OooO0O0(sbOooO0o0.toString());
        this.f25177OoooOOo = showLocation;
        LocationInfo locationInfo = this.f25172OoooO0;
        if (locationInfo != null) {
            MomentSendModel momentSendModel = this.f25173OoooO00;
            MomentSendModel momentSendModel2 = null;
            if (momentSendModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sendPostModel");
                momentSendModel = null;
            }
            momentSendModel.setLongitude(locationInfo.getLongitude() + "");
            MomentSendModel momentSendModel3 = this.f25173OoooO00;
            if (momentSendModel3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sendPostModel");
                momentSendModel3 = null;
            }
            momentSendModel3.setLatitude(locationInfo.getLatitude() + "");
            MomentSendModel momentSendModel4 = this.f25173OoooO00;
            if (momentSendModel4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sendPostModel");
            } else {
                momentSendModel2 = momentSendModel4;
            }
            momentSendModel2.setAddress(locationInfo.getCity(), locationInfo.isToLocationInfo());
            Function1<? super String, Unit> function1 = this.f25176OoooOOO;
            if (function1 != null) {
                if (this.f25177OoooOOo) {
                    function1.invoke(locationInfo.getCity());
                } else {
                    function1.invoke("");
                }
            }
        }
    }

    public final void OooO0Oo(boolean z, boolean z2, @Nullable TopicInfoModel topicInfoModel, @NotNull MomentSendModel sendPostModel) {
        Intrinsics.checkNotNullParameter(sendPostModel, "sendPostModel");
        this.f25173OoooO00 = sendPostModel;
        this.f25175OoooOO0 = z2;
        setTopicInfoModel(topicInfoModel);
        MomentPowerSelectModel momentPowerSelectModel = new MomentPowerSelectModel(sendPostModel.getPower());
        this.f25174OoooO0O = momentPowerSelectModel;
        momentPowerSelectModel.setSelect(true);
        if (topicInfoModel != null) {
            MomentPowerSelectModel momentPowerSelectModel2 = new MomentPowerSelectModel(MomentTypePower.Open.getValue());
            this.f25174OoooO0O = momentPowerSelectModel2;
            sendPostModel.setPower(momentPowerSelectModel2.getPower());
        }
        OooO0o0();
        if (!z) {
            this.f25168Oooo0o.f50796OooO0oO.setHint(o000O0O0.OooO0OO(R.string.Location));
            this.f25168Oooo0o.f50789OooO.setVisibility(8);
            this.f25168Oooo0o.f50792OooO0OO.setVisibility(8);
            return;
        }
        this.f25168Oooo0o.f50796OooO0oO.setHint(o000O0O0.OooO0OO(R.string.Location));
        this.f25168Oooo0o.f50789OooO.setVisibility(0);
        this.f25168Oooo0o.f50792OooO0OO.setVisibility(0);
        if (!com.yalla.support.common.util.OooO0OO.OooO00o(sendPostModel.getAddress())) {
            this.f25168Oooo0o.f50796OooO0oO.setText(sendPostModel.getAddress());
        } else if (z2) {
            this.f25168Oooo0o.f50789OooO.setVisibility(8);
            this.f25168Oooo0o.f50792OooO0OO.setVisibility(8);
        }
    }

    public final void OooO0o0() {
        MomentPowerSelectModel momentPowerSelectModel = this.f25174OoooO0O;
        if (momentPowerSelectModel != null) {
            this.f25168Oooo0o.f50793OooO0Oo.setImageResource(momentPowerSelectModel.getResId());
            this.f25168Oooo0o.f50797OooO0oo.setText(momentPowerSelectModel.getTitle());
        }
    }

    @NotNull
    /* JADX INFO: renamed from: getBinding, reason: from getter */
    public final v9 getF25168Oooo0o() {
        return this.f25168Oooo0o;
    }

    @Nullable
    public final Function0<Unit> getChangeLocationListener() {
        return this.changeLocationListener;
    }

    @Nullable
    public final Function0<Unit> getPowerListener() {
        return this.powerListener;
    }

    @Nullable
    public final TopicInfoModel getTopicInfoModel() {
        return this.topicInfoModel;
    }

    public final void setChangeLocationListener(@Nullable Function0<Unit> function0) {
        this.changeLocationListener = function0;
    }

    public final void setMomentPowerSelectModel(@NotNull MomentPowerSelectModel selectPostPowerModel) {
        Intrinsics.checkNotNullParameter(selectPostPowerModel, "selectPostPowerModel");
        this.f25174OoooO0O = selectPostPowerModel;
        MomentSendModel momentSendModel = this.f25173OoooO00;
        if (momentSendModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sendPostModel");
            momentSendModel = null;
        }
        momentSendModel.setPower(selectPostPowerModel.getPower());
        OooO0o0();
    }

    public final void setPowerListener(@Nullable Function0<Unit> function0) {
        this.powerListener = function0;
    }

    public final void setTopicInfoModel(@Nullable TopicInfoModel topicInfoModel) {
        this.topicInfoModel = topicInfoModel;
        if (topicInfoModel == null || topicInfoModel.getId() <= 0) {
            return;
        }
        setMomentPowerSelectModel(new MomentPowerSelectModel(MomentTypePower.Open.getValue()));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SendMomentLocationPowerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SendMomentLocationPowerView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        v9 v9VarInflate = v9.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(v9VarInflate, "inflate(LayoutInflater.from(context), this, true)");
        this.f25168Oooo0o = v9VarInflate;
        this.f25167Oooo = BannerConfig.LOOP_TIME;
        this.f25176OoooOOO = new OooO0O0();
        OooO0OO oooO0OO = new OooO0OO();
        v9VarInflate.f50795OooO0o0.setOnClickListener(oooO0OO);
        v9VarInflate.f50791OooO0O0.setOnClickListener(oooO0OO);
        v9VarInflate.f50796OooO0oO.setOnClickListener(oooO0OO);
        v9VarInflate.f50792OooO0OO.setOnClickListener(oooO0OO);
        v9VarInflate.f50794OooO0o.setOnClickListener(oooO0OO);
        v9VarInflate.f50793OooO0Oo.setOnClickListener(oooO0OO);
        v9VarInflate.f50797OooO0oo.setOnClickListener(oooO0OO);
    }
}
