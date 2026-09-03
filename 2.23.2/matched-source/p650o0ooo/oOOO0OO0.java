package p650o0ooo;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.compose.foundation.layout.oo000o;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.media3.session.o00Ooo;
import androidx.recyclerview.widget.RecyclerView;
import com.app.base.protobuf.room.Room;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.code.android.util.o0000O0;
import com.code.android.util.o000O;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.internal.security.CertificateUtil;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.mixedroom.MixedRoomDataSource;
import com.yalla.yalla.model.MoraGiftListModel;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.service.room.OooO0O0;
import com.yalla.yalla.service.room.RoomLiveService;
import com.yalla.yalla.ui.activity.room.RoomMoraGameHistoryActivity;
import com.yalla.yalla.ui.activity.store.WalletActivity;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p269o00oooo0.o0O0oo0o;
import p368o0OOo0Oo.Oooo000;
import p405o0Oo0OOO.f1;
import p405o0Oo0OOO.m;
import p475o0Ooooo0.o0O00oO0;
import p477o0o00.OooO0o;
import p497o0o00OoO.o000Oo0;
import p497o0o00OoO.o00O0O0;
import p541o0o0OoOO.oo00;
import p562o0oOo000.o000000;
import p562o0oOo000.o000000O;
import p562o0oOo000.oo0o0Oo;
import p605o0oo0O0O.o0O0O0Oo;
import p642o0ooOOO0.d1;
import p650o0ooo.oOOO0OO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nMoraGameDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MoraGameDialog.kt\ncom/yalla/yalla/ui/dialog/MoraGameDialog\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,411:1\n766#2:412\n857#2,2:413\n1603#2,9:415\n1855#2:424\n1856#2:426\n1612#2:427\n1#3:425\n*S KotlinDebug\n*F\n+ 1 MoraGameDialog.kt\ncom/yalla/yalla/ui/dialog/MoraGameDialog\n*L\n346#1:412\n346#1:413,2\n347#1:415,9\n347#1:424\n347#1:426\n347#1:427\n347#1:425\n*E\n"})
public final class oOOO0OO0 extends o000OO00 {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public oOOOoo00 f58990OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public final Lazy f58991OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NotNull
    public List<MoraGiftListModel> f58992OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NotNull
    public final o000Oo0 f58993OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NotNull
    public final o00O0O0 f58994OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @Nullable
    public View f58995OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public int f58996OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @Nullable
    public View f58997OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @Nullable
    public View f58998OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f58999OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public long f59000OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @Nullable
    public View f59001OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public int f59002OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f59003OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public long f59004OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @NotNull
    public String f59005OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public long f59006OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    @Nullable
    public PopupWindow f59007OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public long f59008OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public oOOo0000 f59009OooOooO;

    public static final class OooO00o extends Lambda implements Function0<m> {
        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final m invoke() {
            oOOO0OO0 oooo0oo0 = oOOO0OO0.this;
            m mVarInflate = m.inflate(LayoutInflater.from(oooo0oo0.f58507OooO0Oo), oooo0oo0.f58508OooO0o, false);
            Intrinsics.checkNotNullExpressionValue(mVarInflate, "inflate(...)");
            return mVarInflate;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Unit> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            oOOO0OO0 oooo0oo0 = oOOO0OO0.this;
            LinearLayout llUserSelect = oooo0oo0.OooOO0().f44142OooOOo;
            Intrinsics.checkNotNullExpressionValue(llUserSelect, "llUserSelect");
            oooo0oo0.OooOOO0(llUserSelect);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOOO0OO0(@NotNull FragmentActivity mActivity, boolean z) {
        super(mActivity, 0);
        Intrinsics.checkNotNullParameter(mActivity, "mActivity");
        this.f58991OooOO0o = LazyKt.lazy(new OooO00o());
        int i = 1;
        o000Oo0 o000oo1 = new o000Oo0(this, i);
        this.f58993OooOOO0 = o000oo1;
        this.f58992OooOOO = new ArrayList();
        o00O0O0 o00o0o0 = new o00O0O0(this, i);
        this.f58994OooOOOO = o00o0o0;
        this.f59005OooOoO0 = "";
        LinearLayout linearLayout = OooOO0().f44127OooO00o;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "getRoot(...)");
        OooO0oO(linearLayout);
        Window window = this.f58510OooO0oO;
        if (window != null) {
            window.setWindowAnimations(o000000O.animation_bottom_in_bottom_out);
        }
        Window window2 = this.f58510OooO0oO;
        if (window2 != null) {
            window2.setGravity(80);
        }
        if (z) {
            ConstraintLayout clRoomMoraBodyOne = OooOO0().f44128OooO0O0;
            Intrinsics.checkNotNullExpressionValue(clRoomMoraBodyOne, "clRoomMoraBodyOne");
            o000O.OooOOOO(clRoomMoraBodyOne);
            LinearLayout llRoomMoraHeader = OooOO0().f44143OooOOo0;
            Intrinsics.checkNotNullExpressionValue(llRoomMoraHeader, "llRoomMoraHeader");
            o000O.OooOOOO(llRoomMoraHeader);
            ConstraintLayout clRoomMoraBodyTwo = OooOO0().f44129OooO0OO;
            Intrinsics.checkNotNullExpressionValue(clRoomMoraBodyTwo, "clRoomMoraBodyTwo");
            o000O.OooO0O0(clRoomMoraBodyTwo);
            Button moraGameCommit2 = OooOO0().f44147OooOo00;
            Intrinsics.checkNotNullExpressionValue(moraGameCommit2, "moraGameCommit2");
            o000O.OooO0O0(moraGameCommit2);
            LinearLayout llMoraGameCommit = OooOO0().f44141OooOOOo;
            Intrinsics.checkNotNullExpressionValue(llMoraGameCommit, "llMoraGameCommit");
            o000O.OooOOOO(llMoraGameCommit);
        } else {
            ConstraintLayout clRoomMoraBodyOne2 = OooOO0().f44128OooO0O0;
            Intrinsics.checkNotNullExpressionValue(clRoomMoraBodyOne2, "clRoomMoraBodyOne");
            o000O.OooO0O0(clRoomMoraBodyOne2);
            LinearLayout llRoomMoraHeader2 = OooOO0().f44143OooOOo0;
            Intrinsics.checkNotNullExpressionValue(llRoomMoraHeader2, "llRoomMoraHeader");
            o000O.OooO0O0(llRoomMoraHeader2);
            ConstraintLayout clRoomMoraBodyTwo2 = OooOO0().f44129OooO0OO;
            Intrinsics.checkNotNullExpressionValue(clRoomMoraBodyTwo2, "clRoomMoraBodyTwo");
            o000O.OooOOOO(clRoomMoraBodyTwo2);
            Button moraGameCommit3 = OooOO0().f44147OooOo00;
            Intrinsics.checkNotNullExpressionValue(moraGameCommit3, "moraGameCommit2");
            o000O.OooOOOO(moraGameCommit3);
            LinearLayout llMoraGameCommit2 = OooOO0().f44141OooOOOo;
            Intrinsics.checkNotNullExpressionValue(llMoraGameCommit2, "llMoraGameCommit");
            o000O.OooO0O0(llMoraGameCommit2);
        }
        TextView textView = OooOO0().f44130OooO0Oo;
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        textView.setText(o0O0O0Oo.OooO0Oo(String.valueOf(o0O00oO0.OooO0O0().getValue())));
        OooOO0().f44137OooOO0o.setText(o0O0O0Oo.OooO0oO(o0000.OooO0OO(o000000.winner_gifts), CertificateUtil.DELIMITER));
        OooOO0().f44144OooOOoo.setText(o0000O.OooO00o(o0000.OooO0OO(o000000.mora_game_commit), AppEventsConstants.EVENT_PARAM_VALUE_NO));
        OooO0o oooO0oOooO00o = o0O0oo0o.OooO00o();
        String str = o0O00oO0.OooOOo0().getValue() + "MORA_RED_POINT";
        SharedPreferences sharedPreferences = oooO0oOooO00o.f48377OooO00o;
        if ((sharedPreferences == null ? 0L : sharedPreferences.getLong(str, 0L)) != 0) {
            View vMoraPoint = OooOO0().f44153OooOoo0;
            Intrinsics.checkNotNullExpressionValue(vMoraPoint, "vMoraPoint");
            o000O.OooOOOO(vMoraPoint);
        } else {
            View vMoraPoint2 = OooOO0().f44153OooOoo0;
            Intrinsics.checkNotNullExpressionValue(vMoraPoint2, "vMoraPoint");
            o000O.OooO0OO(vMoraPoint2);
        }
        OooOO0().f44136OooOO0O.setOnClickListener(this);
        OooOO0().f44135OooOO0.setOnClickListener(this);
        OooOO0().f44126OooO.setOnClickListener(this);
        OooOO0().f44131OooO0o.setOnClickListener(this);
        OooOO0().f44132OooO0o0.setOnClickListener(this);
        OooOO0().f44133OooO0oO.setOnClickListener(this);
        OooOO0().f44134OooO0oo.setOnClickListener(this);
        OooOO0().f44144OooOOoo.setOnClickListener(this);
        OooOO0().f44139OooOOO0.setOnClickListener(this);
        OooOO0().f44142OooOOo.setOnClickListener(this);
        OooOO0().f44147OooOo00.setOnClickListener(this);
        int i2 = oo0o0Oo.room_dialog_mora_game_gift_item;
        Context context = this.f58507OooO0Oo;
        this.f58990OooOO0O = new oOOOoo00(this, context, i2);
        OooOO0().f44151OooOoO0.setLayoutManager(new FixLinearLayoutManager(context, 0));
        RecyclerView recyclerView = OooOO0().f44151OooOoO0;
        oOOOoo00 oooooo00 = this.f58990OooOO0O;
        if (oooooo00 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oooooo00 = null;
        }
        recyclerView.setAdapter(oooooo00);
        OooOO0o(this, null, OooOO0().f44136OooOO0O, 1);
        this.f58509OooO0o0.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: o0ooo.oOOO0O0o
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                oOOO0OO0 this$0 = this.f58989OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                OooO0O0.f24533OoooOOO.OooO00o().f24553OooOOoo.removeObserver(this$0.f58994OooOOOO);
                LiveEventBus.get("ROOM_GUESS_START_A_GUESSING_GAME_STATE", Boolean.TYPE).removeObserver(this$0.f58993OooOOO0);
            }
        });
        MixedRoomDataSource.OooO0o0().OooOOO();
        if (z) {
            com.yalla.yalla.service.room.OooO0O0.f24533OoooOOO.OooO00o().f24553OooOOoo.observeForever(o00o0o0);
            if (this.f59003OooOo0o != 0) {
                String str2 = this.f59005OooOoO0;
                NetImageView ivMoraGameGift = OooOO0().f44138OooOOO;
                Intrinsics.checkNotNullExpressionValue(ivMoraGameGift, "ivMoraGameGift");
                Oooo000.OooO00o oooO00o = new Oooo000.OooO00o(this.f58507OooO0Oo);
                oooO00o.OooO00o(d1.OooO0O0());
                oooO00o.f43126OooO0OO = str2;
                oooO00o.f43124OooO00o = 0;
                oooO00o.OooO0Oo(ivMoraGameGift);
            }
        }
        LiveEventBus.get("MORA_RED_POINT").observe(mActivity, new Observer() { // from class: o0ooo.oOOO00Oo
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                oOOO0OO0 this$0 = this.f58987OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                View vMoraPoint3 = this$0.OooOO0().f44153OooOoo0;
                Intrinsics.checkNotNullExpressionValue(vMoraPoint3, "vMoraPoint");
                if (obj != null) {
                    o000O.OooOOOO(vMoraPoint3);
                } else {
                    o000O.OooO0OO(vMoraPoint3);
                }
            }
        });
        LiveEventBus.get("ROOM_GUESS_START_A_GUESSING_GAME_STATE", Boolean.TYPE).observeForever(o000oo1);
    }

    public static void OooOO0o(oOOO0OO0 oooo0oo0, View view, FrameLayout frameLayout, int i) {
        if ((i & 1) != 0) {
            view = null;
        }
        if ((i & 2) != 0) {
            frameLayout = null;
        }
        if (view != null && !Intrinsics.areEqual(view, oooo0oo0.f58997OooOOo0)) {
            oooo0oo0.f58997OooOOo0 = view;
            view.setSelected(true);
            View view2 = oooo0oo0.f58995OooOOOo;
            if (view2 != null) {
                view2.setSelected(false);
            }
            oooo0oo0.f58995OooOOOo = oooo0oo0.f58997OooOOo0;
            oooo0oo0.f58999OooOo = oooo0oo0.f58992OooOOO.get(oooo0oo0.f58996OooOOo).getGiftNum();
            oooo0oo0.f59003OooOo0o = oooo0oo0.f58992OooOOO.get(oooo0oo0.f58996OooOOo).getPropId();
            String price = oooo0oo0.f58992OooOOO.get(oooo0oo0.f58996OooOOo).getPrice();
            Intrinsics.checkNotNullExpressionValue(price, "getPrice(...)");
            oooo0oo0.OooOO0().f44144OooOOoo.setText(o0000O.OooO00o(o0000.OooO0OO(o000000.mora_game_commit), oo000o.OooO00o(Integer.parseInt(price) * oooo0oo0.f58999OooOo)));
        }
        if (frameLayout == null) {
            oooo0oo0.getClass();
            return;
        }
        if (Intrinsics.areEqual(frameLayout, oooo0oo0.f59001OooOo00)) {
            return;
        }
        oooo0oo0.f59001OooOo00 = frameLayout;
        frameLayout.setSelected(true);
        View view3 = oooo0oo0.f58998OooOOoo;
        if (view3 != null) {
            view3.setSelected(false);
        }
        oooo0oo0.f58998OooOOoo = oooo0oo0.f59001OooOo00;
    }

    @Override // p650o0ooo.o000OO00
    public final void OooO() {
        super.OooO();
        p391o0OOooo0.oo0o0Oo.OooO0Oo(false);
    }

    @Override // p650o0ooo.o000OO00
    public final void OooO0o0(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        boolean zAreEqual = Intrinsics.areEqual(view, OooOO0().f44133OooO0oO) ? true : Intrinsics.areEqual(view, OooOO0().f44134OooO0oo);
        Context context = this.f58507OooO0Oo;
        if (zAreEqual) {
            new oOOo0O00(context).OooO();
            return;
        }
        if (Intrinsics.areEqual(view, OooOO0().f44132OooO0o0)) {
            o0oo0000.OooO00o.OooO0O0("102120");
            int i = RoomMoraGameHistoryActivity.f26161OooOoOO;
            Intrinsics.checkNotNullParameter(context, "context");
            context.startActivity(new Intent(context, (Class<?>) RoomMoraGameHistoryActivity.class));
            return;
        }
        if (Intrinsics.areEqual(view, OooOO0().f44131OooO0o)) {
            int i2 = WalletActivity.f26588OooOoOO;
            WalletActivity.OooO00o.OooO00o(context, false);
            return;
        }
        if (Intrinsics.areEqual(view, OooOO0().f44136OooOO0O)) {
            this.f59002OooOo0O = 0;
            OooOO0o(this, null, OooOO0().f44136OooOO0O, 1);
            return;
        }
        if (Intrinsics.areEqual(view, OooOO0().f44135OooOO0)) {
            this.f59002OooOo0O = 1;
            OooOO0o(this, null, OooOO0().f44135OooOO0, 1);
            return;
        }
        if (Intrinsics.areEqual(view, OooOO0().f44126OooO)) {
            this.f59002OooOo0O = 2;
            OooOO0o(this, null, OooOO0().f44126OooO, 1);
            return;
        }
        if (Intrinsics.areEqual(view, OooOO0().f44142OooOOo)) {
            o0oo0000.OooO00o.OooO0O0("102125");
            LinearLayout llUserSelect = OooOO0().f44142OooOOo;
            Intrinsics.checkNotNullExpressionValue(llUserSelect, "llUserSelect");
            OooOOO0(llUserSelect);
            return;
        }
        if (Intrinsics.areEqual(view, OooOO0().f44144OooOOoo)) {
            o0oo0000.OooO00o.OooO0O0("102122");
            int i3 = this.f59002OooOo0O;
            int i4 = this.f59003OooOo0o;
            int i5 = this.f58999OooOo;
            Long lValueOf = Long.valueOf(this.f59008OooOoo0);
            Room.MoraStartUpRequest.Builder builderNewBuilder = Room.MoraStartUpRequest.newBuilder();
            builderNewBuilder.setMoratype(i3);
            builderNewBuilder.setMoragiftid(i4);
            Intrinsics.checkNotNull(lValueOf);
            builderNewBuilder.setToUserId(lValueOf.longValue());
            builderNewBuilder.setMoranum(i5);
            RoomLiveService roomLiveService = RoomLiveService.f24596OooOo00;
            if (roomLiveService != null) {
                roomLiveService.OooO0oo(10062, builderNewBuilder.build().toByteArray());
                return;
            }
            return;
        }
        if (!Intrinsics.areEqual(view, OooOO0().f44147OooOo00)) {
            if (Intrinsics.areEqual(view, OooOO0().f44139OooOOO0)) {
                o0oo0000.OooO00o.OooO0O0("102121");
                new o0O0o00O(context).OooO();
                return;
            }
            return;
        }
        o0oo0000.OooO00o.OooO0O0("102126");
        long j = this.f59000OooOo0;
        long j2 = this.f59004OooOoO;
        int i6 = this.f59002OooOo0O;
        int i7 = this.f59003OooOo0o;
        int i8 = this.f58999OooOo;
        long j3 = this.f59006OooOoOO;
        Room.MoraStartPkRequest.Builder builderNewBuilder2 = Room.MoraStartPkRequest.newBuilder();
        builderNewBuilder2.setMuuid(j);
        builderNewBuilder2.setSuid(j2);
        builderNewBuilder2.setMoratype(i6);
        builderNewBuilder2.setMoragiftid(i7);
        builderNewBuilder2.setMoranum(i8);
        builderNewBuilder2.setToUserId(j3);
        RoomLiveService roomLiveService2 = RoomLiveService.f24596OooOo00;
        if (roomLiveService2 != null) {
            roomLiveService2.OooO0oo(10063, builderNewBuilder2.build().toByteArray());
        }
        OooO0O0();
    }

    public final m OooOO0() {
        return (m) this.f58991OooOO0o.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooOO0O(long j, int i, @NotNull String moraGiftIcon, @NotNull String moraGiftNum, final int i2, @NotNull RoomUserInfoModel formUserModel, long j2) {
        Intrinsics.checkNotNullParameter(moraGiftIcon, "moraGiftIcon");
        Intrinsics.checkNotNullParameter(moraGiftNum, "moraGiftNum");
        Intrinsics.checkNotNullParameter(formUserModel, "formUserModel");
        try {
            this.f59000OooOo0 = j;
            this.f59003OooOo0o = i;
            this.f58999OooOo = Integer.parseInt(moraGiftNum);
            this.f59005OooOoO0 = moraGiftIcon;
            this.f59004OooOoO = formUserModel.getUserId().getValue().longValue();
            this.f59006OooOoOO = j2;
        } catch (Exception e) {
            e.printStackTrace();
        }
        NetImageView ivMoraGameGift = OooOO0().f44138OooOOO;
        Intrinsics.checkNotNullExpressionValue(ivMoraGameGift, "ivMoraGameGift");
        Context context = this.f58507OooO0Oo;
        Oooo000.OooO00o oooO00o = new Oooo000.OooO00o(context);
        oooO00o.OooO00o(d1.OooO0O0());
        oooO00o.f43126OooO0OO = moraGiftIcon;
        oooO00o.f43124OooO00o = 0;
        oooO00o.OooO0Oo(ivMoraGameGift);
        OooOO0().f44150OooOoO.setText(o0O0O0Oo.OooO0oO("x", moraGiftNum));
        final int i3 = 1;
        OooOO0().f44147OooOo00.post(new Runnable() { // from class: androidx.media3.session.o0OOO0o
            @Override // java.lang.Runnable
            public final void run() {
                int i4 = i3;
                int i5 = i2;
                Object obj = this;
                switch (i4) {
                    case 0:
                        ((o0000OO0) obj).getClass();
                        throw null;
                    default:
                        oOOO0OO0 this$0 = (oOOO0OO0) obj;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.OooOO0().f44147OooOo00.setText(com.code.android.util.o0000O.OooO00o(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.mora_join_game_commit), String.valueOf(i5)));
                        return;
                }
            }
        });
        Oooo000.OooO00o oooO00o2 = new Oooo000.OooO00o(context);
        oooO00o2.OooO00o(d1.OooO0OO());
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        oooO00o2.f43126OooO0OO = (String) o0O00oO0.OooO().getValue();
        oooO00o2.f43124OooO00o = 0;
        oooO00o2.OooO0Oo(OooOO0().f44149OooOo0o);
        OooOO0().f44145OooOo.setText((CharSequence) o0O00oO0.OooOOoo().getValue());
        Oooo000.OooO00o oooO00o3 = new Oooo000.OooO00o(context);
        oooO00o3.OooO00o(d1.OooO0OO());
        oooO00o3.f43126OooO0OO = formUserModel.getUserHeader().getValue();
        oooO00o3.f43124OooO00o = 0;
        oooO00o3.OooO0Oo(OooOO0().f44146OooOo0);
        OooOO0().f44148OooOo0O.setText(formUserModel.getUserName().getValue());
    }

    public final void OooOOO0(LinearLayout linearLayout) {
        oOOo0000 oooo0000 = null;
        if (this.f59007OooOoo == null) {
            Context context = this.f58507OooO0Oo;
            f1 f1VarInflate = f1.inflate(LayoutInflater.from(context));
            Intrinsics.checkNotNullExpressionValue(f1VarInflate, "inflate(...)");
            PopupWindow popupWindow = new PopupWindow((View) f1VarInflate.f43844OooO00o, -2, -2, true);
            this.f59007OooOoo = popupWindow;
            popupWindow.setOutsideTouchable(true);
            f1VarInflate.f43844OooO00o.measure(0, 0);
            FixLinearLayoutManager fixLinearLayoutManager = new FixLinearLayoutManager(context);
            RecyclerView recyclerView = f1VarInflate.f43845OooO0O0;
            recyclerView.setLayoutManager(fixLinearLayoutManager);
            oOOo0000 oooo0001 = new oOOo0000(context, oo0o0Oo.room_item_guess_user_select);
            this.f59009OooOooO = oooo0001;
            recyclerView.setAdapter(oooo0001);
            oOOo0000 oooo0002 = this.f59009OooOooO;
            if (oooo0002 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("popupAdapter");
                oooo0002 = null;
            }
            oooo0002.f13176OooO0o = new o00Ooo(this);
        }
        List<oo00> list = com.yalla.yalla.service.room.OooO00o.f24517OooO0oO.f48585OooOO0O;
        ArrayList<oo00> arrayList = new ArrayList();
        for (Object obj : list) {
            if (((oo00) obj).f55307OooO0OO.getValue().longValue() > 0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (oo00 oo00Var : arrayList) {
            ArrayList arrayList3 = com.yalla.yalla.service.room.OooO00o.f24511OooO00o;
            RoomUserInfoModel roomUserInfoModelOooO0o0 = com.yalla.yalla.service.room.OooO00o.OooO0o0(oo00Var.f55307OooO0OO.getValue());
            if (roomUserInfoModelOooO0o0 != null) {
                arrayList2.add(roomUserInfoModelOooO0o0);
            }
        }
        List mutableList = CollectionsKt.toMutableList((Collection) arrayList2);
        RoomUserInfoModel roomUserInfoModel = new RoomUserInfoModel();
        roomUserInfoModel.getUserName().setValue(o0000.OooO0OO(o000000.room_dialog_guess_any_one));
        mutableList.add(0, roomUserInfoModel);
        oOOo0000 oooo0003 = this.f59009OooOooO;
        if (oooo0003 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("popupAdapter");
        } else {
            oooo0000 = oooo0003;
        }
        oooo0000.OooOoO0(mutableList);
        int size = mutableList.size();
        int size2 = 1 <= size && size < 6 ? mutableList.size() : 5;
        PopupWindow popupWindow2 = this.f59007OooOoo;
        if (popupWindow2 != null) {
            popupWindow2.showAsDropDown(linearLayout, 0, ((-linearLayout.getHeight()) - (o0000O0.OooO00o(45) * size2)) - o0000O0.OooO00o(7), 48);
        }
    }
}
