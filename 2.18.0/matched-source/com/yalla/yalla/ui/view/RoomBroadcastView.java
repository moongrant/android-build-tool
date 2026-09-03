package com.yalla.yalla.ui.view;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.app.base.model.roomBroadcastModel.RoomBroadcastModel;
import com.app.base.view.pop.roomBroadcastPop.RoomBroadcastRoomModel;
import com.code.android.util.ToastUtil;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p074o000O0oo.OooOOO;
import p160o00OoOO.o000O00O;
import p255o00ooO0O.o000O0O0;
import p255o00ooO0O.o00O000;
import p255o00ooO0O.o0O0ooO;
import p256o00ooO0o.oo0oOO0;
import p517o0o0O00.o00O00;
import p532o0o0OOO.o00OO0O0;
import p558o0oOOoOO.ooOOOOoo;
import p603o0oo00Oo.o0OOooO0;
import p651o0ooOOoo.og;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¨\u0006\u000e"}, d2 = {"Lcom/yalla/yalla/ui/view/RoomBroadcastView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lo0oOOoOO/ooOOOOoo;", "mRoomBroadcastNewAnimation", "", "setRoomBroadcastNewAnimation", "Landroid/content/Context;", d.R, "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class RoomBroadcastView extends ConstraintLayout {

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public static final /* synthetic */ int f25120OoooO = 0;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @NotNull
    public final og f25121Oooo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final int f25122OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @Nullable
    public RoomBroadcastModel f25123OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    @Nullable
    public ooOOOOoo f25124OoooO0O;

    public static final class OooO00o extends Lambda implements Function0<Unit> {
        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            RoomBroadcastView roomBroadcastView = RoomBroadcastView.this;
            int i = RoomBroadcastView.f25120OoooO;
            Objects.requireNonNull(roomBroadcastView);
            o00O00.OooO0O0("toClick data = " + roomBroadcastView.f25123OoooO00);
            RoomBroadcastModel roomBroadcastModel = roomBroadcastView.f25123OoooO00;
            if (roomBroadcastModel != null) {
                StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("toClick data.getType = ");
                sbOooO0O0.append(roomBroadcastModel.getType());
                o00O00.OooO0O0(sbOooO0O0.toString());
                switch (roomBroadcastModel.getType()) {
                    case 10:
                    case 12:
                    case 14:
                    case 15:
                    case 17:
                    case 18:
                    case 21:
                    case 22:
                        o00O00.OooO0O0("showGiftRoomSelectPop \ndata = " + roomBroadcastModel + "\nloginInformation = " + o000O00O.OooO().f32451OoooO0 + "\nroomConfiguration = " + o000O00O.OooO().f32453OoooO0O);
                        if (roomBroadcastModel.getType() == 12 || roomBroadcastModel.getType() == 10 || roomBroadcastModel.getType() == 14 || roomBroadcastModel.getType() == 17 || roomBroadcastModel.getType() == 18 || roomBroadcastModel.getType() == 15 || roomBroadcastModel.getType() == 21 || roomBroadcastModel.getType() == 22) {
                            Long value = o00OO0O0.f43338OooooOo.OooO00o().f43344OooO0Oo.getValue();
                            if (value != null) {
                                if (roomBroadcastModel.getRoominfo().getId() != value.longValue()) {
                                    try {
                                        RoomBroadcastRoomModel roomBroadcastRoomModel = new RoomBroadcastRoomModel();
                                        roomBroadcastRoomModel.setData(roomBroadcastModel.getRoominfo().getId(), roomBroadcastModel.getRoominfo().getIp());
                                        o00O00.OooO0O0("showGiftRoomSelectPop try ");
                                        Context context = roomBroadcastView.getContext();
                                        Intrinsics.checkNotNullExpressionValue(context, "context");
                                        oo0oOO0 oo0ooo0 = new oo0oOO0(context);
                                        oo0ooo0.OooOooO(o000O0O0.OooO0OO(R.string.hint));
                                        oo0ooo0.OooOo0O(o000O0O0.OooO0OO(R.string.giftLayout_to_room));
                                        oo0ooo0.OooOoOO(true);
                                        oo0ooo0.OooOo0o(new o0OOooO0(roomBroadcastRoomModel));
                                        oo0ooo0.OooOOO0();
                                    } catch (Exception e) {
                                        o00O00.OooO0O0("showGiftRoomSelectPop Exception ");
                                        e.printStackTrace();
                                    }
                                } else {
                                    o00O00.OooO0O0("showGiftRoomSelectPop ToastUtils ");
                                    String strOooO0OO = o000O0O0.OooO0OO(R.string.you_are_already_in_the_room);
                                    ToastUtil toastUtil = ToastUtil.f12583OooO0O0;
                                    if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                                        o0O0ooO o0o0oooOooO0O0 = OooOOO.OooO0O0(toastUtil, strOooO0OO, "runnable");
                                        if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                                            o00O000 o00o001 = o00O000.f34368OooO00o;
                                            o00O000.f34370OooO0OO.post(o0o0oooOooO0O0);
                                        } else {
                                            o0o0oooOooO0O0.run();
                                        }
                                    }
                                }
                            }
                        } else {
                            o00O00.OooO0O0("showGiftRoomSelectPop No Gift  ");
                        }
                        break;
                    case 13:
                        o00O00.OooO0O0("toNobleUserInfo data = " + roomBroadcastModel);
                        if (roomBroadcastModel.getRoomBroadcastOpenNobleDataModel() != null && !TextUtils.isEmpty(roomBroadcastModel.getRoomBroadcastOpenNobleDataModel().getUserid())) {
                            UserInfoActivity.OooO00o oooO00o = UserInfoActivity.f23471o0OOO0o;
                            Context context2 = roomBroadcastView.getContext();
                            Intrinsics.checkNotNull(context2, "null cannot be cast to non-null type android.app.Activity");
                            UserInfoActivity.OooO00o.OooO0Oo(oooO00o, (Activity) context2, roomBroadcastModel.getRoomBroadcastOpenNobleDataModel().getUserid(), false, 12);
                        }
                        break;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RoomBroadcastView(@NotNull Context context) {
        this(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.view.View
    public final void clearAnimation() {
        this.f25121Oooo.f50263OooO00o.clearAnimation();
    }

    public final void setRoomBroadcastNewAnimation(@Nullable ooOOOOoo mRoomBroadcastNewAnimation) {
        this.f25124OoooO0O = mRoomBroadcastNewAnimation;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RoomBroadcastView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RoomBroadcastView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        og ogVarInflate = og.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(ogVarInflate, "inflate(LayoutInflater.from(context), this, true)");
        this.f25121Oooo = ogVarInflate;
        this.f25122OoooO0 = 5000;
        ogVarInflate.f50264OooO0O0.setGoListener(new OooO00o());
    }
}
