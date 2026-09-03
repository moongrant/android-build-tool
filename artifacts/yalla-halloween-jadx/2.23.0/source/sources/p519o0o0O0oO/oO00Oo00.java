package p519o0o0O0oO;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import com.app.base.protobuf.room.Room;
import com.code.android.util.o0000;
import com.code.android.util.o0000O0;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
import com.code.android.util.o000OO00;
import com.code.android.util.o000Oo0;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.service.room.RoomLiveService;
import com.yalla.yalla.ui.activity.room.LuckyPacketDetailActivity;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import o0OO0O0.oo000o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p396o0Oo0O.OooOOO;
import p408o0Oo0o0O.o00Oo0;
import p417o0OoO0.o000O0o;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p587o0oOooo.o0OO000;
import p641o0ooOOOO.v7;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class oO00Oo00 extends o00O00OO {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final Drawable f52832OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public final Drawable f52833OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public long f52834OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public boolean f52835OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int f52836OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NotNull
    public String f52837OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NotNull
    public String f52838OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NotNull
    public String f52839OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @Nullable
    public Function1<? super DialogInterface, Unit> f52840OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final int f52841OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final int f52842OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public boolean f52843OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public final int f52844OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final int f52845OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @NotNull
    public final Lazy f52846OooOoO0;

    public static final class OooO implements Observer<Object> {
        public OooO() {
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(Object obj) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.app.base.protobuf.room.Room.GetBonusReply");
            Room.GetBonusReply getBonusReply = (Room.GetBonusReply) obj;
            oO00Oo00 oo00oo00 = oO00Oo00.this;
            long j = oo00oo00.f52834OooOOO;
            if (j <= 0 || j != getBonusReply.getBonusid() || oo00oo00.f52835OooOOO0) {
                return;
            }
            int state = getBonusReply.getState();
            if (state != oo00oo00.f52842OooOo0) {
                if (state == oo00oo00.f52844OooOo0O) {
                    oo00oo00.OooOO0o(getBonusReply.getBonustype(), getBonusReply.getBonusid());
                    return;
                }
                if (state == oo00oo00.f52845OooOo0o || state == oo00oo00.f52841OooOo) {
                    String strOooO0OO = o0000.OooO0OO(oO00OOo0.lucky_golds_max_today);
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
                return;
            }
            oo00oo00.f52835OooOOO0 = true;
            oo00oo00.OooOO0().f59062OooO0OO.setVisibility(4);
            oo00oo00.OooOO0().f59065OooO0o0.setVisibility(4);
            oo00oo00.OooOO0().f59063OooO0Oo.setVisibility(0);
            oo00oo00.OooOO0().f59064OooO0o.setVisibility(0);
            oo00oo00.OooOO0().f59070OooOO0o.setText(String.valueOf(getBonusReply.getBonuscount()));
            if (getBonusReply.getBonustype() != 2) {
                oo00oo00.OooOO0().f59071OooOOO.setImageResource(oOo00OO0.coin3);
                return;
            }
            o0OOo0O.OooOO0.OooO00o oooO00o = new o0OOo0O.OooOO0.OooO00o(oo00oo00.f52532OooO0Oo);
            oooO00o.f43911OooO0OO = p139o00OOooO.OooO0o.OooO0Oo(getBonusReply.getGiftimg());
            oooO00o.f43909OooO00o = 0;
            oooO00o.f43923OooOOOo = oOo00OO0.room_dialog_lucky_golds_send_gift_item_default;
            oooO00o.OooO0Oo(oo00oo00.OooOO0().f59071OooOOO);
        }
    }

    public static final class OooO00o extends Lambda implements Function1<View, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ oO00Oo00 f52848OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f52849OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(FragmentActivity fragmentActivity, oO00Oo00 oo00oo00) {
            super(1);
            this.f52848OooO0Oo = oo00oo00;
            this.f52849OooO0o0 = fragmentActivity;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View setNoDoubleClickListener = view;
            Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
            oO00Oo00 oo00oo00 = this.f52848OooO0Oo;
            long j = oo00oo00.f52834OooOOO;
            if (j > 0) {
                int i = LuckyPacketDetailActivity.f26556OooOo;
                LuckyPacketDetailActivity.OooO00o.OooO00o(this.f52849OooO0o0, j, oo00oo00.f52836OooOOOO);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 implements com.opensource.svgaplayer.OooO0OO.OooO0O0 {
        public OooO0O0() {
        }

        @Override // com.opensource.svgaplayer.OooO0OO.OooO0O0
        public final void OooO00o(@NotNull oo000o videoItem) {
            Intrinsics.checkNotNullParameter(videoItem, "videoItem");
            o0OO0O0.OooO oooO = new o0OO0O0.OooO(videoItem);
            oO00Oo00 oo00oo00 = oO00Oo00.this;
            oo00oo00.OooOO0().f59068OooOO0.setImageDrawable(oooO);
            oo00oo00.OooOO0().f59068OooOO0.OooO0Oo();
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
            oO00Oo00 oo00oo00 = oO00Oo00.this;
            if (oo00oo00.f52834OooOOO > 0) {
                if (oo00oo00.f52843OooOo00) {
                    o0OO000.OooO00o("102139");
                }
                long j = oo00oo00.f52834OooOOO;
                int i = oo00oo00.f52836OooOOOO;
                Room.GetBonusRequest.Builder builderNewBuilder = Room.GetBonusRequest.newBuilder();
                builderNewBuilder.setBonustype(i);
                builderNewBuilder.setBonusid(j);
                RoomLiveService roomLiveService = RoomLiveService.f25058OooOo00;
                if (roomLiveService != null) {
                    roomLiveService.OooO0oo(10072, builderNewBuilder.build().toByteArray());
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o implements Observer<Object> {
        public OooO0o() {
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(Object obj) {
            boolean zAreEqual = Intrinsics.areEqual(obj, (Object) 0);
            oO00Oo00 oo00oo00 = oO00Oo00.this;
            if (zAreEqual) {
                AppCompatTextView appCompatTextView = oo00oo00.OooOO0().f59073OooOOOO;
                Intrinsics.checkNotNullExpressionValue(appCompatTextView, "binding.selected");
                o000O0o.OooO0oO(appCompatTextView, oo00oo00.f52833OooOO0o);
            } else {
                AppCompatTextView appCompatTextView2 = oo00oo00.OooOO0().f59073OooOOOO;
                Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "binding.selected");
                o000O0o.OooO0oO(appCompatTextView2, oo00oo00.f52832OooOO0O);
            }
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<v7> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f52853OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ oO00Oo00 f52854OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(FragmentActivity fragmentActivity, oO00Oo00 oo00oo00) {
            super(0);
            this.f52853OooO0Oo = fragmentActivity;
            this.f52854OooO0o0 = oo00oo00;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v7 invoke() {
            v7 v7VarInflate = v7.inflate(LayoutInflater.from(this.f52853OooO0Oo), this.f52854OooO0o0.f52533OooO0o, false);
            Intrinsics.checkNotNullExpressionValue(v7VarInflate, "inflate(LayoutInflater.f…t), getRootView(), false)");
            return v7VarInflate;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO00Oo00(@NotNull FragmentActivity context) {
        super(context, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f52832OooOO0O = o0000.OooO0O0(oOo00OO0.room_dialog_lucky_packet_register_selected);
        this.f52833OooOO0o = o0000.OooO0O0(oOo00OO0.room_dialog_lucky_packet_register_unselected);
        this.f52837OooOOOo = "";
        this.f52839OooOOo0 = "";
        this.f52838OooOOo = "";
        this.f52842OooOo0 = 1;
        this.f52844OooOo0O = 2;
        this.f52845OooOo0o = 3;
        this.f52841OooOo = 4;
        this.f52846OooOoO0 = LazyKt.lazy(new OooOO0(context, this));
        ConstraintLayout constraintLayout = OooOO0().f59060OooO00o;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.root");
        OooO0oO(constraintLayout);
        OooOO0().f59061OooO0O0.setOnClickListener(new View.OnClickListener() { // from class: o0o0O0oO.oO00OOO
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                oO00Oo00 this$0 = this.f52826OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooO0O0();
            }
        });
        OooOO0().f59072OooOOO0.setOnClickListener(new View.OnClickListener() { // from class: o0o0O0oO.oO00OOOo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                oO00Oo00 this$0 = this.f52827OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooO0O0();
            }
        });
        AppCompatTextView appCompatTextView = OooOO0().f59069OooOO0O;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "binding.resultDetails");
        o000OO00.OooO0oo(appCompatTextView, new OooO00o(context, this));
        new com.opensource.svgaplayer.OooO0OO(context).OooO00o("svga/room_lucky_packet_open.svga", new OooO0O0());
        AppCompatTextView appCompatTextView2 = OooOO0().f59059OooO;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "binding.open");
        o000OO00.OooO0oo(appCompatTextView2, new OooO0OO());
        OooOO0().f59073OooOOOO.setOnClickListener(new oO00OOo0());
        LiveEventBus.get("LuckyPacket_AutoShowDialog").observe(context, new OooO0o());
        LiveEventBus.get("LuckyPacket_OpenResult_Ok").observe(context, new OooO());
    }

    public final v7 OooOO0() {
        return (v7) this.f52846OooOoO0.getValue();
    }

    @NotNull
    public final void OooOO0O(long j, int i, @NotNull String userHeadPhoto, @NotNull String giftImg, @NotNull String userName, @NotNull String bonusInfo, @Nullable Function1 function1) {
        Intrinsics.checkNotNullParameter(userHeadPhoto, "userHeadPhoto");
        Intrinsics.checkNotNullParameter(giftImg, "giftImg");
        Intrinsics.checkNotNullParameter(userName, "userName");
        Intrinsics.checkNotNullParameter(bonusInfo, "bonusInfo");
        this.f52834OooOOO = j;
        this.f52836OooOOOO = i;
        this.f52837OooOOOo = userHeadPhoto;
        this.f52839OooOOo0 = userName;
        this.f52838OooOOo = bonusInfo;
        this.f52840OooOOoo = function1;
        OooOO0().f59063OooO0Oo.setVisibility(4);
        OooOO0().f59065OooO0o0.setVisibility(4);
        OooOO0().f59064OooO0o.setVisibility(4);
        OooOO0().f59062OooO0OO.setVisibility(0);
        OooOO0().f59072OooOOO0.setText(o0000.OooO0OO(oO00OOo0.OK));
        if (o00Oo0.OooO0oo().OooOO0O() == 0) {
            AppCompatTextView appCompatTextView = OooOO0().f59073OooOOOO;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView, "binding.selected");
            o000O0o.OooO0oO(appCompatTextView, this.f52833OooOO0o);
        } else {
            AppCompatTextView appCompatTextView2 = OooOO0().f59073OooOOOO;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "binding.selected");
            o000O0o.OooO0oO(appCompatTextView2, this.f52832OooOO0O);
        }
        if (this.f52834OooOOO > 0) {
            o0OOo0O.OooOO0.OooO00o oooO00o = new o0OOo0O.OooOO0.OooO00o(this.f52532OooO0Oo);
            oooO00o.OooO00o(p543o0oO0O00.OooO.OooO00o());
            oooO00o.OooO0O0(o0000O0.OooO0O0(2), o0000.OooO00o(oO00O0o.color_white));
            oooO00o.f43911OooO0OO = OooOOO.OooO00o(this.f52837OooOOOo);
            oooO00o.f43909OooO00o = 0;
            oooO00o.OooO0Oo(OooOO0().f59066OooO0oO);
            OooOO0().f59074OooOOOo.setText(this.f52839OooOOo0);
            OooOO0().f59067OooO0oo.setText(this.f52838OooOOo);
        }
        Function1<? super DialogInterface, Unit> function2 = this.f52840OooOOoo;
        if (function2 != null) {
            OooO00o(function2);
        }
    }

    @NotNull
    public final void OooOO0o(int i, long j) {
        this.f52834OooOOO = j;
        this.f52836OooOOOO = i;
        OooOO0().f59062OooO0OO.setVisibility(4);
        OooOO0().f59063OooO0Oo.setVisibility(4);
        OooOO0().f59065OooO0o0.setVisibility(0);
        OooOO0().f59064OooO0o.setVisibility(0);
        Group group = OooOO0().f59064OooO0o;
        ConstraintLayout constraintLayout = OooOO0().f59060OooO00o;
        group.OooOOo0();
        OooOO0().f59072OooOOO0.setText(o0000.OooO0OO(oO00OOo0.OK));
    }
}
