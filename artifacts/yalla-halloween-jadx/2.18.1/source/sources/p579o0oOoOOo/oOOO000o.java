package p579o0oOoOOo;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.FragmentActivity;
import com.app.base.protobuf.room.Room;
import com.facebook.internal.o00O0O;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.weieyu.yalla.R;
import com.yalla.support.cloudfilemanager.util.CloudImageUtilKt;
import com.yalla.support.common.util.OooOOO;
import com.yalla.yalla.ui.activity.room.LuckyPacketDetailActivity;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p142o00OOooO.o0000;
import p142o00OOooO.o0000oo;
import p159o00OoOO.o00O000;
import p391o0OOooOo.o0O00000;
import p405o0Oo0OO0.OooO;
import p405o0Oo0OO0.OooOo;
import p405o0Oo0OO0.OooOo00;
import p497o0o00Oo.OooOOO0;
import p502o0o00o0.o00000O;
import p522o0o0O0o.oo0o0O0;
import p544o0o0OoOO.p4;
import p616o0oo0Ooo.oO0O00;
import p649o0ooOOoo.ff;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class oOOO000o extends o00000O {

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    @NotNull
    public final Drawable f46104OoooO;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    @NotNull
    public final Drawable f46105OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public int f46106OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public int f46107OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    @NotNull
    public String f46108OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    @NotNull
    public String f46109OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @NotNull
    public String f46110OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    @Nullable
    public Function1<? super DialogInterface, Unit> f46111Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public boolean f46112Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public final int f46113OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public final int f46114OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public final int f46115OooooOo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    @NotNull
    public final Lazy f46116Oooooo0;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public boolean f46117o000oOoO;

    public static final class OooO00o extends Lambda implements Function1<View, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f46119Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(FragmentActivity fragmentActivity) {
            super(1);
            this.f46119Oooo0oO = fragmentActivity;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View setNoDoubleClickListener = view;
            Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
            oOOO000o oooo000o = oOOO000o.this;
            int i = oooo000o.f46106OoooOOO;
            if (i > 0) {
                LuckyPacketDetailActivity.f22854OooooOo.OooO00o(this.f46119Oooo0oO, i, oooo000o.f46107OoooOOo);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 implements OooOo00.OooO0O0 {
        public OooO0O0() {
        }

        @Override // o0Oo0OO0.OooOo00.OooO0O0
        public final void onComplete(@NotNull OooOo videoItem) {
            Intrinsics.checkNotNullParameter(videoItem, "videoItem");
            oOOO000o.this.OooOO0O().f49393OooOO0.setImageDrawable(new OooO(videoItem));
            oOOO000o.this.OooOO0O().f49393OooOO0.OooO0OO();
        }

        @Override // o0Oo0OO0.OooOo00.OooO0O0
        public final void onError() {
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<View, Unit> {
        public OooO0OO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View setNoDoubleClickListener = view;
            Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
            oOOO000o oooo000o = oOOO000o.this;
            if (oooo000o.f46106OoooOOO > 0) {
                if (oooo000o.f46112Ooooo0o) {
                    o0O00000.OooO0OO("InRoom_Messagearea_LuckyBag_open");
                }
                o00O000 o00o000OooO = o00O000.OooO();
                oOOO000o oooo000o2 = oOOO000o.this;
                int i = oooo000o2.f46106OoooOOO;
                int i2 = oooo000o2.f46107OoooOOo;
                Objects.requireNonNull(o00o000OooO);
                if (o00O000.f32468OooO00o != null) {
                    Room.GetBonusRequest.Builder builderNewBuilder = Room.GetBonusRequest.newBuilder();
                    builderNewBuilder.setBonustype(i2);
                    builderNewBuilder.setBonusid(i);
                    o00O000.f32468OooO00o.OooO0oO(10072, builderNewBuilder.build().toByteArray());
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function0<ff> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f46122Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ oOOO000o f46123Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(FragmentActivity fragmentActivity, oOOO000o oooo000o) {
            super(0);
            this.f46122Oooo0o = fragmentActivity;
            this.f46123Oooo0oO = oooo000o;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ff invoke() {
            ff ffVarInflate = ff.inflate(LayoutInflater.from(this.f46122Oooo0o), this.f46123Oooo0oO.f41545Oooo0oo, false);
            Intrinsics.checkNotNullExpressionValue(ffVarInflate, "inflate(LayoutInflater.f…t), getRootView(), false)");
            return ffVarInflate;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOOO000o(@NotNull FragmentActivity context) {
        super(context, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f46104OoooO = OooOOO.OooO0O0(R.drawable.room_dialog_lucky_packet_register_selected);
        this.f46105OoooOO0 = OooOOO.OooO0O0(R.drawable.room_dialog_lucky_packet_register_unselected);
        this.f46108OoooOo0 = "";
        this.f46109OoooOoO = "";
        this.f46110OoooOoo = "";
        this.f46113OooooO0 = 1;
        this.f46114OooooOO = 2;
        this.f46115OooooOo = 3;
        this.f46116Oooooo0 = LazyKt.lazy(new OooO0o(context, this));
        ConstraintLayout constraintLayout = OooOO0O().f49385OooO00o;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.root");
        OooO0oO(constraintLayout);
        OooOO0O().f49386OooO0O0.setOnClickListener(new p4(this, 1));
        OooOO0O().f49397OooOOO0.setOnClickListener(new o00O0O(this, 1));
        AppCompatTextView appCompatTextView = OooOO0O().f49394OooOO0O;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "binding.resultDetails");
        com.yalla.support.common.util.o00O0O.OooO0Oo(appCompatTextView, new OooO00o(context));
        new OooOo00(context).OooO0oO("svga/room_lucky_packet_open.svga", new OooO0O0());
        AppCompatTextView appCompatTextView2 = OooOO0O().f49384OooO;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "binding.open");
        com.yalla.support.common.util.o00O0O.OooO0Oo(appCompatTextView2, new OooO0OO());
        OooOO0O().f49398OooOOOO.setOnClickListener(new View.OnClickListener() { // from class: o0oOoOOo.oOO
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OooOOO0 oooOOO0 = OooOOO0.f41180OooO00o;
                if (OooOOO0.OooO0oO().OooOO0O() == 0) {
                    o00O000.OooO().OooOoO(1);
                } else {
                    o00O000.OooO().OooOoO(0);
                }
            }
        });
        LiveEventBus.get("LuckyPacket_AutoShowDialog").observe(context, new o0000(this, 4));
        LiveEventBus.get("LuckyPacket_OpenResult_Ok").observe(context, new o0000oo(this, 4));
    }

    public final ff OooOO0O() {
        return (ff) this.f46116Oooooo0.getValue();
    }

    @NotNull
    public final oOOO000o OooOO0o(int i, int i2, @NotNull String userHeadPhoto, @NotNull String giftImg, @NotNull String userName, @NotNull String bonusInfo, @Nullable Function1 function1) {
        Intrinsics.checkNotNullParameter(userHeadPhoto, "userHeadPhoto");
        Intrinsics.checkNotNullParameter(giftImg, "giftImg");
        Intrinsics.checkNotNullParameter(userName, "userName");
        Intrinsics.checkNotNullParameter(bonusInfo, "bonusInfo");
        this.f46106OoooOOO = i;
        this.f46107OoooOOo = i2;
        this.f46108OoooOo0 = userHeadPhoto;
        this.f46109OoooOoO = userName;
        this.f46110OoooOoo = bonusInfo;
        this.f46111Ooooo00 = function1;
        OooOO0O().f49388OooO0Oo.setVisibility(4);
        OooOO0O().f49390OooO0o0.setVisibility(4);
        OooOO0O().f49389OooO0o.setVisibility(4);
        OooOO0O().f49387OooO0OO.setVisibility(0);
        OooOO0O().f49397OooOOO0.setText(OooOOO.OooO0OO(R.string.OK));
        OooOOO0 oooOOO0 = OooOOO0.f41180OooO00o;
        if (OooOOO0.OooO0oO().OooOO0O() == 0) {
            AppCompatTextView appCompatTextView = OooOO0O().f49398OooOOOO;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView, "binding.selected");
            oo0o0O0.OooO0oo(appCompatTextView, this.f46105OoooOO0);
        } else {
            AppCompatTextView appCompatTextView2 = OooOO0O().f49398OooOOOO;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "binding.selected");
            oo0o0O0.OooO0oo(appCompatTextView2, this.f46104OoooO);
        }
        if (this.f46106OoooOOO > 0) {
            oO0O00.OooO00o oooO00o = new oO0O00.OooO00o(this.f41543Oooo0o);
            oooO00o.OooO00o(o00OOO.OooO00o.OooO00o());
            oooO00o.OooO0OO(com.yalla.support.common.util.OooOo00.OooO0O0(2.0f), OooOOO.OooO00o(R.color.color_white));
            oooO00o.f48429OooO0OO = CloudImageUtilKt.imgSize(this.f46108OoooOo0, com.yalla.support.common.util.OooOo00.OooO00o(50), true);
            oooO00o.f48427OooO00o = 0;
            oooO00o.OooO0o(OooOO0O().f49391OooO0oO);
            OooOO0O().f49399OooOOOo.setText(this.f46109OoooOoO);
            AppCompatTextView appCompatTextView3 = OooOO0O().f49392OooO0oo;
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("");
            sbOooO0o0.append(this.f46110OoooOoo);
            appCompatTextView3.setText(sbOooO0o0.toString());
        }
        Function1<? super DialogInterface, Unit> function2 = this.f46111Ooooo00;
        if (function2 != null) {
            OooO00o(function2);
        }
        return this;
    }

    @NotNull
    public final oOOO000o OooOOO0(int i, int i2) {
        this.f46106OoooOOO = i;
        this.f46107OoooOOo = i2;
        OooOO0O().f49387OooO0OO.setVisibility(4);
        OooOO0O().f49388OooO0Oo.setVisibility(4);
        OooOO0O().f49390OooO0o0.setVisibility(0);
        OooOO0O().f49389OooO0o.setVisibility(0);
        Group group = OooOO0O().f49389OooO0o;
        ConstraintLayout constraintLayout = OooOO0O().f49385OooO00o;
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) group.getLayoutParams();
        layoutParams.f7563o00ooo.Ooooo00(0);
        layoutParams.f7563o00ooo.OoooOO0(0);
        OooOO0O().f49397OooOOO0.setText(OooOOO.OooO0OO(R.string.OK));
        return this;
    }
}
