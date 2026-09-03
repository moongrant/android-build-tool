package com.yalla.yalla.ui.view.moment;

import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import com.code.android.util.OooOo00;
import com.code.android.util.o0000;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
import com.code.android.util.o000OO00;
import com.code.android.util.o000Oo0;
import com.code.android.util.o0OoOo0;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.yalla.yalla.model.moment.MomentPowerSelectModel;
import com.yalla.yalla.model.moment.MomentSendModel;
import com.yalla.yalla.model.moment.MomentTypePower;
import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.ui.activity.moment.MomentPowerSelectActivity;
import com.yalla.yalla.ui.view.moment.SendMomentLocationPowerView;
import com.yalla.yalla.util.location.LocationModel;
import com.yalla.yalla.util.permission.OooO00o;
import com.yalla.yalla.util.permission.PermissionGroupReveal;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p584o0oOooO0.oO00OOo0;
import p587o0oOooo.o0OO000;
import p592o0oo00O.OooOOO0;
import p599o0oo00oo.o0000O;
import p599o0oo00oo.o000OO;
import p641o0ooOOOO.c3;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010&\u001a\u00020%\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'\u0012\b\b\u0002\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002R\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR*\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R.\u0010 \u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR*\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0012\u001a\u0004\b\"\u0010\u0014\"\u0004\b#\u0010\u0016¨\u0006-"}, d2 = {"Lcom/yalla/yalla/ui/view/moment/SendMomentLocationPowerView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/yalla/yalla/model/moment/MomentPowerSelectModel;", "selectPostPowerModel", "", "setMomentPowerSelectModel", "getLocation", "", "showLocation", "setLocationData", "Lo0ooOOOO/c3;", "OooO0Oo", "Lo0ooOOOO/c3;", "getBinding", "()Lo0ooOOOO/c3;", "binding", "Lkotlin/Function0;", "OooO0o0", "Lkotlin/jvm/functions/Function0;", "getPowerListener", "()Lkotlin/jvm/functions/Function0;", "setPowerListener", "(Lkotlin/jvm/functions/Function0;)V", "powerListener", "Lcom/yalla/yalla/model/topic/TopicInfoModel;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "OooOO0", "Lcom/yalla/yalla/model/topic/TopicInfoModel;", "getTopicInfoModel", "()Lcom/yalla/yalla/model/topic/TopicInfoModel;", "setTopicInfoModel", "(Lcom/yalla/yalla/model/topic/TopicInfoModel;)V", "topicInfoModel", "OooOO0o", "getChangeLocationListener", "setChangeLocationListener", "changeLocationListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
public final class SendMomentLocationPowerView extends ConstraintLayout {

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public static final /* synthetic */ int f31200OooOOOo = 0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public MomentPowerSelectModel f31201OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final c3 binding;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public FragmentActivity f31203OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function0<Unit> powerListener;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public MomentSendModel f31205OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public LocationModel f31206OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public TopicInfoModel topicInfoModel;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public boolean f31208OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function0<Unit> changeLocationListener;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public boolean f31210OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @Nullable
    public final OooOOO f31211OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public boolean f31212OooOOOO;

    public static final class OooO extends Lambda implements Function1<View, Unit> {
        public OooO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            SendMomentLocationPowerView.OooO0Oo(SendMomentLocationPowerView.this);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function1<View, Unit> {
        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            SendMomentLocationPowerView.OooO0OO(SendMomentLocationPowerView.this);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<View, Unit> {
        public OooO0O0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            SendMomentLocationPowerView.OooO0OO(SendMomentLocationPowerView.this);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<View, Unit> {
        public OooO0OO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            SendMomentLocationPowerView.OooO0OO(SendMomentLocationPowerView.this);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<View, Unit> {
        public OooO0o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            SendMomentLocationPowerView sendMomentLocationPowerView = SendMomentLocationPowerView.this;
            p592o0oo00O.OooOOO0.OooO0O0("onCancelLocation : isOpenLocation = " + sendMomentLocationPowerView.f31210OooOOO);
            o0OO000.OooO00o("103068");
            MomentSendModel momentSendModel = sendMomentLocationPowerView.f31205OooO0oO;
            if (momentSendModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sendPostModel");
                momentSendModel = null;
            }
            momentSendModel.setAddress("", false);
            OooOOO oooOOO = sendMomentLocationPowerView.f31211OooOOO0;
            if (oooOOO != null) {
                oooOOO.invoke("");
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function1<View, Unit> {
        public OooOO0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            SendMomentLocationPowerView.OooO0Oo(SendMomentLocationPowerView.this);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function1<View, Unit> {
        public OooOO0O() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            SendMomentLocationPowerView.OooO0Oo(SendMomentLocationPowerView.this);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function1<String, Unit> {
        public OooOOO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            String str2 = str;
            boolean zOooO00o = OooOo00.OooO00o(str2);
            SendMomentLocationPowerView sendMomentLocationPowerView = SendMomentLocationPowerView.this;
            if (zOooO00o) {
                sendMomentLocationPowerView.getBinding().f57648OooO0oO.setText(str2);
                sendMomentLocationPowerView.getBinding().f57648OooO0oO.setHint(o0000.OooO0OO(oO00OOo0.Location));
                sendMomentLocationPowerView.getBinding().f57644OooO0OO.setVisibility(8);
            } else {
                sendMomentLocationPowerView.getBinding().f57648OooO0oO.setText(str2);
                sendMomentLocationPowerView.getBinding().f57644OooO0OO.setVisibility(0);
            }
            Function0<Unit> changeLocationListener = sendMomentLocationPowerView.getChangeLocationListener();
            if (changeLocationListener != null) {
                changeLocationListener.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function1<LocationModel, Unit> {
        public OooOOO0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(LocationModel locationModel) {
            final LocationModel locationModel2 = locationModel;
            final SendMomentLocationPowerView sendMomentLocationPowerView = SendMomentLocationPowerView.this;
            FragmentActivity fragmentActivity = sendMomentLocationPowerView.f31203OooO0o;
            if (fragmentActivity == null) {
                Intrinsics.throwUninitializedPropertyAccessException("activity");
                fragmentActivity = null;
            }
            fragmentActivity.runOnUiThread(new Runnable() { // from class: o0oOOooo.oO0O00O
                @Override // java.lang.Runnable
                public final void run() {
                    SendMomentLocationPowerView this$0 = sendMomentLocationPowerView;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    LocationModel locationModel3 = locationModel2;
                    if (locationModel3 == null) {
                        locationModel3 = new LocationModel();
                        locationModel3.f32862OooO0o = false;
                        locationModel3.f32863OooO0o0 = o0000.OooO0OO(oO00OOo0.Null_Location_Info);
                    }
                    this$0.f31206OooO0oo = locationModel3;
                    this$0.setLocationData(true);
                }
            });
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SendMomentLocationPowerView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static final void OooO0OO(final SendMomentLocationPowerView sendMomentLocationPowerView) {
        sendMomentLocationPowerView.getClass();
        o0OO000.OooO00o("103067");
        c3 c3Var = sendMomentLocationPowerView.binding;
        c3Var.f57648OooO0oO.setText(oO00OOo0.loading);
        c3Var.f57648OooO0oO.postDelayed(new Runnable() { // from class: o0oOOooo.oO0O000o
            @Override // java.lang.Runnable
            public final void run() {
                int i = SendMomentLocationPowerView.f31200OooOOOo;
                SendMomentLocationPowerView this$0 = this.f56124OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                OooOOO0.OooO0O0("onReLocation : isOpenLocation = " + this$0.f31210OooOOO);
                this$0.f31212OooOOOO = true;
                FragmentActivity fragmentActivity = this$0.f31203OooO0o;
                if (fragmentActivity == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("activity");
                    fragmentActivity = null;
                }
                OooO00o.OooO0OO(fragmentActivity, PermissionGroupReveal.f32881OooO0OO, null, new oO0O00o0(this$0));
            }
        }, 200L);
    }

    public static final void OooO0Oo(final SendMomentLocationPowerView sendMomentLocationPowerView) {
        if (sendMomentLocationPowerView.f31208OooOO0O) {
            return;
        }
        sendMomentLocationPowerView.binding.f57645OooO0Oo.postDelayed(new Runnable() { // from class: o0oOOooo.oO0O000
            @Override // java.lang.Runnable
            public final void run() {
                int i = SendMomentLocationPowerView.f31200OooOOOo;
                final SendMomentLocationPowerView this$0 = this.f56123OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                TopicInfoModel topicInfoModel = this$0.topicInfoModel;
                if (topicInfoModel != null && o0OoOo0.OooOO0(Long.valueOf(topicInfoModel.getId())) > 0) {
                    String strOooO0OO = o0000.OooO0OO(oO00OOo0.Posts_including_topics_must_be_public);
                    if (strOooO0OO == null || StringsKt.isBlank(strOooO0OO)) {
                        return;
                    }
                    o000Oo0 o000oo0OooO00o = o000O00.OooO00o(strOooO0OO, "runnable");
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        o000oo0OooO00o.run();
                        return;
                    } else {
                        o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                        return;
                    }
                }
                int i2 = MomentPowerSelectActivity.f26142OooOo;
                FragmentActivity activity = this$0.f31203OooO0o;
                MomentSendModel momentSendModel = null;
                if (activity == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("activity");
                    activity = null;
                }
                MomentSendModel momentSendModel2 = this$0.f31205OooO0oO;
                if (momentSendModel2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("sendPostModel");
                } else {
                    momentSendModel = momentSendModel2;
                }
                int power = momentSendModel.getPower();
                o0000O o0000o2 = new o0000O() { // from class: o0oOOooo.oO0O00
                    @Override // p599o0oo00oo.o0000O
                    public final void onActivityResult(int i3, Intent data) {
                        int i4 = SendMomentLocationPowerView.f31200OooOOOo;
                        SendMomentLocationPowerView this$1 = this$0;
                        Intrinsics.checkNotNullParameter(this$1, "this$0");
                        Intrinsics.checkNotNullParameter(data, "data");
                        if (i3 == -1) {
                            MomentPowerSelectModel momentPowerSelectModel = (MomentPowerSelectModel) data.getSerializableExtra("Data");
                            this$1.f31201OooO = momentPowerSelectModel;
                            if (momentPowerSelectModel != null) {
                                MomentSendModel momentSendModel3 = this$1.f31205OooO0oO;
                                if (momentSendModel3 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("sendPostModel");
                                    momentSendModel3 = null;
                                }
                                momentSendModel3.setPower(momentPowerSelectModel.getPower());
                                this$1.OooO0oO();
                            }
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(activity, "activity");
                Bundle bundle = new Bundle();
                bundle.putInt("Id", power);
                o000OO o000oo2 = new o000OO(activity);
                o000oo2.f56864OooO0O0 = MomentPowerSelectActivity.class;
                o000oo2.OooO00o(bundle);
                o000oo2.OooO0O0(o0000o2);
            }
        }, 200L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:21:0x0031  */
    public final void getLocation() {
        boolean z;
        LocationModel locationModel = this.f31206OooO0oo;
        if (locationModel != null) {
            Location location = locationModel.f32861OooO0Oo;
            if (location != null) {
                if ((location != null ? location.getLongitude() : 0.0d) < 1.0d) {
                    Location location2 = locationModel.f32861OooO0Oo;
                    if ((location2 != null ? location2.getLatitude() : 0.0d) < 1.0d && TextUtils.isEmpty(locationModel.f32863OooO0o0)) {
                        z = true;
                    }
                }
                z = false;
            } else {
                z = true;
            }
            if ((z ? false : true) && !this.f31212OooOOOO) {
                setLocationData(false);
                return;
            }
        }
        FragmentActivity fragmentActivity = this.f31203OooO0o;
        if (fragmentActivity == null) {
            Intrinsics.throwUninitializedPropertyAccessException("activity");
            fragmentActivity = null;
        }
        p593o0oo00O0.OooO0o oooO0o = new p593o0oo00O0.OooO0o(fragmentActivity);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(oooO0o.f56824OooO00o), Dispatchers.getIO(), null, new p593o0oo00O0.OooO0OO(oooO0o, new OooOOO0(), null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setLocationData(boolean showLocation) {
        p592o0oo00O.OooOOO0.OooO0O0("getLocation mLocationInfo = " + this.f31206OooO0oo + " showLocation = " + showLocation);
        this.f31210OooOOO = showLocation;
        LocationModel locationModel = this.f31206OooO0oo;
        if (locationModel != null) {
            MomentSendModel momentSendModel = this.f31205OooO0oO;
            MomentSendModel momentSendModel2 = null;
            if (momentSendModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sendPostModel");
                momentSendModel = null;
            }
            Location location = locationModel.f32861OooO0Oo;
            double longitude = location != null ? location.getLongitude() : 0.0d;
            StringBuilder sb = new StringBuilder();
            sb.append(longitude);
            momentSendModel.setLongitude(sb.toString());
            MomentSendModel momentSendModel3 = this.f31205OooO0oO;
            if (momentSendModel3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sendPostModel");
                momentSendModel3 = null;
            }
            Location location2 = locationModel.f32861OooO0Oo;
            double latitude = location2 != null ? location2.getLatitude() : 0.0d;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(latitude);
            momentSendModel3.setLatitude(sb2.toString());
            MomentSendModel momentSendModel4 = this.f31205OooO0oO;
            if (momentSendModel4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sendPostModel");
            } else {
                momentSendModel2 = momentSendModel4;
            }
            momentSendModel2.setAddress(locationModel.f32863OooO0o0, locationModel.f32862OooO0o);
            OooOOO oooOOO = this.f31211OooOOO0;
            if (oooOOO != null) {
                if (this.f31210OooOOO) {
                    oooOOO.invoke(locationModel.f32863OooO0o0);
                } else {
                    oooOOO.invoke("");
                }
            }
        }
    }

    public final void OooO0o(boolean z, boolean z2, @Nullable TopicInfoModel topicInfoModel, @NotNull MomentSendModel sendPostModel) {
        Intrinsics.checkNotNullParameter(sendPostModel, "sendPostModel");
        this.f31205OooO0oO = sendPostModel;
        this.f31208OooOO0O = z2;
        setTopicInfoModel(topicInfoModel);
        MomentPowerSelectModel momentPowerSelectModel = new MomentPowerSelectModel(sendPostModel.getPower());
        this.f31201OooO = momentPowerSelectModel;
        momentPowerSelectModel.setSelect(true);
        if (topicInfoModel != null) {
            MomentPowerSelectModel momentPowerSelectModel2 = new MomentPowerSelectModel(MomentTypePower.Open.getValue());
            this.f31201OooO = momentPowerSelectModel2;
            sendPostModel.setPower(momentPowerSelectModel2.getPower());
        }
        OooO0oO();
        c3 c3Var = this.binding;
        if (!z) {
            c3Var.f57648OooO0oO.setHint(o0000.OooO0OO(oO00OOo0.Location));
            c3Var.f57644OooO0OO.setVisibility(8);
            return;
        }
        c3Var.f57648OooO0oO.setHint(o0000.OooO0OO(oO00OOo0.Location));
        boolean zOooO00o = OooOo00.OooO00o(sendPostModel.getAddress());
        ImageView imageView = c3Var.f57644OooO0OO;
        if (!zOooO00o) {
            c3Var.f57648OooO0oO.setText(sendPostModel.getAddress());
            imageView.setVisibility(0);
        } else if (z2) {
            imageView.setVisibility(8);
        }
    }

    public final void OooO0oO() {
        MomentPowerSelectModel momentPowerSelectModel = this.f31201OooO;
        if (momentPowerSelectModel != null) {
            c3 c3Var = this.binding;
            c3Var.f57645OooO0Oo.setImageResource(momentPowerSelectModel.getResId());
            c3Var.f57649OooO0oo.setText(momentPowerSelectModel.getTitle());
        }
    }

    @NotNull
    public final c3 getBinding() {
        return this.binding;
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
        this.f31201OooO = selectPostPowerModel;
        MomentSendModel momentSendModel = this.f31205OooO0oO;
        if (momentSendModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sendPostModel");
            momentSendModel = null;
        }
        momentSendModel.setPower(selectPostPowerModel.getPower());
        OooO0oO();
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
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ SendMomentLocationPowerView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SendMomentLocationPowerView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        c3 c3VarInflate = c3.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(c3VarInflate, "inflate(LayoutInflater.from(context), this, true)");
        this.binding = c3VarInflate;
        this.f31211OooOOO0 = new OooOOO();
        LinearLayout linearLayout = c3VarInflate.f57647OooO0o0;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.layoutAddress");
        o000OO00.OooO(linearLayout, new OooO00o());
        ImageView imageView = c3VarInflate.f57643OooO0O0;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivAddress");
        o000OO00.OooO(imageView, new OooO0O0());
        TextView textView = c3VarInflate.f57648OooO0oO;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.tvAddress");
        o000OO00.OooO(textView, new OooO0OO());
        ImageView imageView2 = c3VarInflate.f57644OooO0OO;
        Intrinsics.checkNotNullExpressionValue(imageView2, "binding.ivAddressCancel");
        o000OO00.OooO(imageView2, new OooO0o());
        LinearLayout linearLayout2 = c3VarInflate.f57646OooO0o;
        Intrinsics.checkNotNullExpressionValue(linearLayout2, "binding.layoutPower");
        o000OO00.OooO(linearLayout2, new OooO());
        ImageView imageView3 = c3VarInflate.f57645OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(imageView3, "binding.ivPower");
        o000OO00.OooO(imageView3, new OooOO0());
        TextView textView2 = c3VarInflate.f57649OooO0oo;
        Intrinsics.checkNotNullExpressionValue(textView2, "binding.tvPower");
        o000OO00.OooO(textView2, new OooOO0O());
    }
}
