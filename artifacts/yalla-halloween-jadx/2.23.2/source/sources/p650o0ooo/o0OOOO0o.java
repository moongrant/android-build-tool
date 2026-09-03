package p650o0ooo;

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
import com.code.android.util.o0000;
import com.code.android.util.o0000O0;
import com.code.android.util.o000O;
import com.google.android.material.textfield.o0OOO0o;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.service.room.RoomLiveService;
import com.yalla.yalla.ui.activity.message.o000000;
import com.yalla.yalla.ui.activity.message.o000000O;
import com.yalla.yalla.ui.activity.room.LuckyPacketDetailActivity;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o0OO0O0O.OooO;
import o0OO0O0O.o00Ooo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p368o0OOo0Oo.Oooo000;
import p405o0Oo0OOO.i;
import p423o0OoO0OO.o00O0O0O;
import p562o0oOo000.o0Oo0oo;
import p642o0ooOOO0.d1;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o0OOOO0o extends o000OO00 {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final Drawable f58703OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public final Drawable f58704OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public long f58705OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public boolean f58706OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int f58707OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NotNull
    public String f58708OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NotNull
    public String f58709OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NotNull
    public String f58710OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @Nullable
    public Function1<? super DialogInterface, Unit> f58711OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final int f58712OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final int f58713OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public boolean f58714OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public final int f58715OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final int f58716OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @NotNull
    public final Lazy f58717OooOoO0;

    public static final class OooO00o extends Lambda implements Function1<View, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o0OOOO0o f58718OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f58719OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(FragmentActivity fragmentActivity, o0OOOO0o o0oooo0o2) {
            super(1);
            this.f58718OooO0Oo = o0oooo0o2;
            this.f58719OooO0o0 = fragmentActivity;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View setNoDoubleClickListener = view;
            Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
            o0OOOO0o o0oooo0o2 = this.f58718OooO0Oo;
            long j = o0oooo0o2.f58705OooOOO;
            if (j > 0) {
                int i = LuckyPacketDetailActivity.f26104OooOo;
                LuckyPacketDetailActivity.OooO00o.OooO00o(this.f58719OooO0o0, j, o0oooo0o2.f58707OooOOOO);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 implements com.opensource.svgaplayer.OooO0OO.OooO0O0 {
        public OooO0O0() {
        }

        @Override // com.opensource.svgaplayer.OooO0OO.OooO0O0
        public final void OooO00o(@NotNull o00Ooo videoItem) {
            Intrinsics.checkNotNullParameter(videoItem, "videoItem");
            OooO oooO = new OooO(videoItem);
            o0OOOO0o o0oooo0o2 = o0OOOO0o.this;
            o0oooo0o2.OooOO0().f43930OooOO0.setImageDrawable(oooO);
            o0oooo0o2.OooOO0().f43930OooOO0.OooO0Oo();
        }

        @Override // com.opensource.svgaplayer.OooO0OO.OooO0O0
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
            o0OOOO0o o0oooo0o2 = o0OOOO0o.this;
            if (o0oooo0o2.f58705OooOOO > 0) {
                if (o0oooo0o2.f58714OooOo00) {
                    o0oo0000.OooO00o.OooO0O0("102139");
                }
                long j = o0oooo0o2.f58705OooOOO;
                int i = o0oooo0o2.f58707OooOOOO;
                Room.GetBonusRequest.Builder builderNewBuilder = Room.GetBonusRequest.newBuilder();
                builderNewBuilder.setBonustype(i);
                builderNewBuilder.setBonusid(j);
                RoomLiveService roomLiveService = RoomLiveService.f24596OooOo00;
                if (roomLiveService != null) {
                    roomLiveService.OooO0oo(10072, builderNewBuilder.build().toByteArray());
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function0<i> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f58722OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o0OOOO0o f58723OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(FragmentActivity fragmentActivity, o0OOOO0o o0oooo0o2) {
            super(0);
            this.f58722OooO0Oo = fragmentActivity;
            this.f58723OooO0o0 = o0oooo0o2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final i invoke() {
            i iVarInflate = i.inflate(LayoutInflater.from(this.f58722OooO0Oo), this.f58723OooO0o0.f58508OooO0o, false);
            Intrinsics.checkNotNullExpressionValue(iVarInflate, "inflate(...)");
            return iVarInflate;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OOOO0o(@NotNull FragmentActivity context) {
        super(context, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f58703OooOO0O = o0000.OooO0O0(o0Oo0oo.room_dialog_lucky_packet_register_selected);
        this.f58704OooOO0o = o0000.OooO0O0(o0Oo0oo.room_dialog_lucky_packet_register_unselected);
        this.f58708OooOOOo = "";
        this.f58710OooOOo0 = "";
        this.f58709OooOOo = "";
        this.f58713OooOo0 = 1;
        int i = 2;
        this.f58715OooOo0O = 2;
        this.f58716OooOo0o = 3;
        this.f58712OooOo = 4;
        this.f58717OooOoO0 = LazyKt.lazy(new OooO0o(context, this));
        ConstraintLayout constraintLayout = OooOO0().f43922OooO00o;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        OooO0oO(constraintLayout);
        OooOO0().f43923OooO0O0.setOnClickListener(new o0OOO0o(this, 1));
        OooOO0().f43934OooOOO0.setOnClickListener(new View.OnClickListener() { // from class: o0ooo.o0OOO0OO
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                o0OOOO0o this$0 = this.f58702OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooO0O0();
            }
        });
        AppCompatTextView resultDetails = OooOO0().f43931OooOO0O;
        Intrinsics.checkNotNullExpressionValue(resultDetails, "resultDetails");
        o000O.OooO0oo(resultDetails, new OooO00o(context, this));
        new com.opensource.svgaplayer.OooO0OO(context).OooO00o("svga/room_lucky_packet_open.svga", new OooO0O0());
        AppCompatTextView open = OooOO0().f43921OooO;
        Intrinsics.checkNotNullExpressionValue(open, "open");
        o000O.OooO0oo(open, new OooO0OO());
        OooOO0().f43935OooOOOO.setOnClickListener(new o0OOOO00());
        LiveEventBus.get("LuckyPacket_AutoShowDialog").observe(context, new o000000(i, this));
        LiveEventBus.get("LuckyPacket_OpenResult_Ok").observe(context, new o000000O(i, this));
    }

    public final i OooOO0() {
        return (i) this.f58717OooOoO0.getValue();
    }

    @NotNull
    public final void OooOO0O(long j, int i, @NotNull String userHeadPhoto, @NotNull String giftImg, @NotNull String userName, @NotNull String bonusInfo, @Nullable Function1 function1) {
        Intrinsics.checkNotNullParameter(userHeadPhoto, "userHeadPhoto");
        Intrinsics.checkNotNullParameter(giftImg, "giftImg");
        Intrinsics.checkNotNullParameter(userName, "userName");
        Intrinsics.checkNotNullParameter(bonusInfo, "bonusInfo");
        this.f58705OooOOO = j;
        this.f58707OooOOOO = i;
        this.f58708OooOOOo = userHeadPhoto;
        this.f58710OooOOo0 = userName;
        this.f58709OooOOo = bonusInfo;
        this.f58711OooOOoo = function1;
        OooOO0().f43925OooO0Oo.setVisibility(4);
        OooOO0().f43927OooO0o0.setVisibility(4);
        OooOO0().f43926OooO0o.setVisibility(4);
        OooOO0().f43924OooO0OO.setVisibility(0);
        OooOO0().f43934OooOOO0.setText(o0000.OooO0OO(p562o0oOo000.o000000.OK));
        if (p415o0Oo0oO0.o00Ooo.OooO0oo().OooOO0O() == 0) {
            AppCompatTextView selected = OooOO0().f43935OooOOOO;
            Intrinsics.checkNotNullExpressionValue(selected, "selected");
            o00O0O0O.OooO0oO(selected, this.f58704OooOO0o);
        } else {
            AppCompatTextView selected2 = OooOO0().f43935OooOOOO;
            Intrinsics.checkNotNullExpressionValue(selected2, "selected");
            o00O0O0O.OooO0oO(selected2, this.f58703OooOO0O);
        }
        if (this.f58705OooOOO > 0) {
            Oooo000.OooO00o oooO00o = new Oooo000.OooO00o(this.f58507OooO0Oo);
            oooO00o.OooO00o(d1.OooO00o());
            oooO00o.OooO0O0(o0000O0.OooO0O0(2), o0000.OooO00o(p562o0oOo000.o0OOO0o.color_white));
            oooO00o.f43126OooO0OO = p403o0Oo0OO.OooO0OO.OooO00o(this.f58708OooOOOo);
            oooO00o.f43124OooO00o = 0;
            oooO00o.OooO0Oo(OooOO0().f43928OooO0oO);
            OooOO0().f43936OooOOOo.setText(this.f58710OooOOo0);
            OooOO0().f43929OooO0oo.setText(this.f58709OooOOo);
        }
        Function1<? super DialogInterface, Unit> function2 = this.f58711OooOOoo;
        if (function2 != null) {
            OooO00o(function2);
        }
    }

    @NotNull
    public final void OooOO0o(int i, long j) {
        this.f58705OooOOO = j;
        this.f58707OooOOOO = i;
        OooOO0().f43924OooO0OO.setVisibility(4);
        OooOO0().f43925OooO0Oo.setVisibility(4);
        OooOO0().f43927OooO0o0.setVisibility(0);
        OooOO0().f43926OooO0o.setVisibility(0);
        Group group = OooOO0().f43926OooO0o;
        ConstraintLayout constraintLayout = OooOO0().f43922OooO00o;
        group.OooOOo0();
        OooOO0().f43934OooOOO0.setText(o0000.OooO0OO(p562o0oOo000.o000000.OK));
    }
}
