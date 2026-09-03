package p675oO0Oo;

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
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.session.o00O0O;
import androidx.recyclerview.widget.RecyclerView;
import com.app.base.protobuf.room.Room;
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
import p270o00oooo0.o0O0OO0;
import p370o0OOo0Oo.Oooo000;
import p407o0Oo0OOO.g1;
import p407o0Oo0OOO.n;
import p435o0OoOOO0.o000;
import p474o0OoooOO.oo0oO0;
import p498o0o00Oo0.o0000;
import p498o0o00Oo0.o0000Ooo;
import p498o0o00Oo0.o00oOoo;
import p541o0o0Oo0o.o0OO0;
import p565o0oOo000.o000000;
import p565o0oOo000.o000OOo;
import p565o0oOo000.o0OO00O;
import p593o0oOoooO.h0;
import p595o0oo0.OooOo00;
import p645o0ooOOO0.o0O0O0Oo;
import p675oO0Oo.l0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nMoraGameDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MoraGameDialog.kt\ncom/yalla/yalla/ui/dialog/MoraGameDialog\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,411:1\n766#2:412\n857#2,2:413\n1603#2,9:415\n1855#2:424\n1856#2:426\n1612#2:427\n1#3:425\n*S KotlinDebug\n*F\n+ 1 MoraGameDialog.kt\ncom/yalla/yalla/ui/dialog/MoraGameDialog\n*L\n346#1:412\n346#1:413,2\n347#1:415,9\n347#1:424\n347#1:426\n347#1:427\n347#1:425\n*E\n"})
public final class l0 extends o0oO0Ooo {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public n0 f59309OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public final Lazy f59310OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NotNull
    public List<MoraGiftListModel> f59311OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NotNull
    public final o0000Ooo f59312OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NotNull
    public final o0000 f59313OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @Nullable
    public View f59314OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public int f59315OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @Nullable
    public View f59316OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @Nullable
    public View f59317OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f59318OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public long f59319OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @Nullable
    public View f59320OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public int f59321OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f59322OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public long f59323OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @NotNull
    public String f59324OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public long f59325OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    @Nullable
    public PopupWindow f59326OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public long f59327OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public q0 f59328OooOooO;

    public static final class OooO00o extends Lambda implements Function0<n> {
        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final n invoke() {
            l0 l0Var = l0.this;
            n nVarInflate = n.inflate(LayoutInflater.from(l0Var.f59572OooO0Oo), l0Var.f59573OooO0o, false);
            Intrinsics.checkNotNullExpressionValue(nVarInflate, "inflate(...)");
            return nVarInflate;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Unit> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            l0 l0Var = l0.this;
            LinearLayout llUserSelect = l0Var.OooOO0().f44160OooOOo;
            Intrinsics.checkNotNullExpressionValue(llUserSelect, "llUserSelect");
            l0Var.OooOOO0(llUserSelect);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(@NotNull FragmentActivity mActivity, boolean z) {
        super(mActivity, 0);
        Intrinsics.checkNotNullParameter(mActivity, "mActivity");
        this.f59310OooOO0o = LazyKt.lazy(new OooO00o());
        int i = 1;
        o0000Ooo o0000ooo = new o0000Ooo(this, 1);
        this.f59312OooOOO0 = o0000ooo;
        this.f59311OooOOO = new ArrayList();
        o0000 o0000Var = new o0000(this, i);
        this.f59313OooOOOO = o0000Var;
        this.f59324OooOoO0 = "";
        LinearLayout linearLayout = OooOO0().f44145OooO00o;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "getRoot(...)");
        OooO0oO(linearLayout);
        Window window = this.f59575OooO0oO;
        if (window != null) {
            window.setWindowAnimations(o000000.animation_bottom_in_bottom_out);
        }
        Window window2 = this.f59575OooO0oO;
        if (window2 != null) {
            window2.setGravity(80);
        }
        if (z) {
            ConstraintLayout clRoomMoraBodyOne = OooOO0().f44146OooO0O0;
            Intrinsics.checkNotNullExpressionValue(clRoomMoraBodyOne, "clRoomMoraBodyOne");
            o000O.OooOOOO(clRoomMoraBodyOne);
            LinearLayout llRoomMoraHeader = OooOO0().f44161OooOOo0;
            Intrinsics.checkNotNullExpressionValue(llRoomMoraHeader, "llRoomMoraHeader");
            o000O.OooOOOO(llRoomMoraHeader);
            ConstraintLayout clRoomMoraBodyTwo = OooOO0().f44147OooO0OO;
            Intrinsics.checkNotNullExpressionValue(clRoomMoraBodyTwo, "clRoomMoraBodyTwo");
            o000O.OooO0O0(clRoomMoraBodyTwo);
            Button moraGameCommit2 = OooOO0().f44165OooOo00;
            Intrinsics.checkNotNullExpressionValue(moraGameCommit2, "moraGameCommit2");
            o000O.OooO0O0(moraGameCommit2);
            LinearLayout llMoraGameCommit = OooOO0().f44159OooOOOo;
            Intrinsics.checkNotNullExpressionValue(llMoraGameCommit, "llMoraGameCommit");
            o000O.OooOOOO(llMoraGameCommit);
        } else {
            ConstraintLayout clRoomMoraBodyOne2 = OooOO0().f44146OooO0O0;
            Intrinsics.checkNotNullExpressionValue(clRoomMoraBodyOne2, "clRoomMoraBodyOne");
            o000O.OooO0O0(clRoomMoraBodyOne2);
            LinearLayout llRoomMoraHeader2 = OooOO0().f44161OooOOo0;
            Intrinsics.checkNotNullExpressionValue(llRoomMoraHeader2, "llRoomMoraHeader");
            o000O.OooO0O0(llRoomMoraHeader2);
            ConstraintLayout clRoomMoraBodyTwo2 = OooOO0().f44147OooO0OO;
            Intrinsics.checkNotNullExpressionValue(clRoomMoraBodyTwo2, "clRoomMoraBodyTwo");
            o000O.OooOOOO(clRoomMoraBodyTwo2);
            Button moraGameCommit3 = OooOO0().f44165OooOo00;
            Intrinsics.checkNotNullExpressionValue(moraGameCommit3, "moraGameCommit2");
            o000O.OooOOOO(moraGameCommit3);
            LinearLayout llMoraGameCommit2 = OooOO0().f44159OooOOOo;
            Intrinsics.checkNotNullExpressionValue(llMoraGameCommit2, "llMoraGameCommit");
            o000O.OooO0O0(llMoraGameCommit2);
        }
        TextView textView = OooOO0().f44148OooO0Oo;
        oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
        textView.setText(OooOo00.OooO0Oo(String.valueOf(oo0oO0.OooO0O0().getValue())));
        OooOO0().f44155OooOO0o.setText(OooOo00.OooO0oO(com.code.android.util.o0000.OooO0OO(o000OOo.winner_gifts), CertificateUtil.DELIMITER));
        OooOO0().f44162OooOOoo.setText(o0000O.OooO00o(com.code.android.util.o0000.OooO0OO(o000OOo.mora_game_commit), AppEventsConstants.EVENT_PARAM_VALUE_NO));
        p487o0o000oO.o0000 o0000VarOooO0O0 = o0O0OO0.OooO0O0();
        String str = oo0oO0.OooOOo0().getValue() + "MORA_RED_POINT";
        SharedPreferences sharedPreferences = o0000VarOooO0O0.f48716OooO00o;
        if ((sharedPreferences == null ? 0L : sharedPreferences.getLong(str, 0L)) != 0) {
            View vMoraPoint = OooOO0().f44171OooOoo0;
            Intrinsics.checkNotNullExpressionValue(vMoraPoint, "vMoraPoint");
            o000O.OooOOOO(vMoraPoint);
        } else {
            View vMoraPoint2 = OooOO0().f44171OooOoo0;
            Intrinsics.checkNotNullExpressionValue(vMoraPoint2, "vMoraPoint");
            o000O.OooO0OO(vMoraPoint2);
        }
        OooOO0().f44154OooOO0O.setOnClickListener(this);
        OooOO0().f44153OooOO0.setOnClickListener(this);
        OooOO0().f44144OooO.setOnClickListener(this);
        OooOO0().f44149OooO0o.setOnClickListener(this);
        OooOO0().f44150OooO0o0.setOnClickListener(this);
        OooOO0().f44151OooO0oO.setOnClickListener(this);
        OooOO0().f44152OooO0oo.setOnClickListener(this);
        OooOO0().f44162OooOOoo.setOnClickListener(this);
        OooOO0().f44157OooOOO0.setOnClickListener(this);
        OooOO0().f44160OooOOo.setOnClickListener(this);
        OooOO0().f44165OooOo00.setOnClickListener(this);
        int i2 = o0OO00O.room_dialog_mora_game_gift_item;
        Context context = this.f59572OooO0Oo;
        this.f59309OooOO0O = new n0(this, context, i2);
        OooOO0().f44169OooOoO0.setLayoutManager(new FixLinearLayoutManager(context, 0));
        RecyclerView recyclerView = OooOO0().f44169OooOoO0;
        n0 n0Var = this.f59309OooOO0O;
        if (n0Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            n0Var = null;
        }
        recyclerView.setAdapter(n0Var);
        OooOO0o(this, null, OooOO0().f44154OooOO0O, 1);
        this.f59574OooO0o0.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: oO0Oo.k0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                l0 this$0 = this.f59268OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                OooO0O0.f24541OoooOOO.OooO00o().f24561OooOOoo.removeObserver(this$0.f59313OooOOOO);
                LiveEventBus.get("ROOM_GUESS_START_A_GUESSING_GAME_STATE", Boolean.TYPE).removeObserver(this$0.f59312OooOOO0);
            }
        });
        MixedRoomDataSource.OooO0o0().OooOOO();
        if (z) {
            com.yalla.yalla.service.room.OooO0O0.f24541OoooOOO.OooO00o().f24561OooOOoo.observeForever(o0000Var);
            if (this.f59322OooOo0o != 0) {
                String str2 = this.f59324OooOoO0;
                NetImageView ivMoraGameGift = OooOO0().f44156OooOOO;
                Intrinsics.checkNotNullExpressionValue(ivMoraGameGift, "ivMoraGameGift");
                Oooo000.OooO00o oooO00o = new Oooo000.OooO00o(this.f59572OooO0Oo);
                oooO00o.OooO00o(o0O0O0Oo.OooO0O0());
                oooO00o.f43127OooO0OO = str2;
                oooO00o.f43125OooO00o = 0;
                oooO00o.OooO0Oo(ivMoraGameGift);
            }
        }
        LiveEventBus.get("MORA_RED_POINT").observe(mActivity, new o00oOoo(this, i));
        LiveEventBus.get("ROOM_GUESS_START_A_GUESSING_GAME_STATE", Boolean.TYPE).observeForever(o0000ooo);
    }

    public static void OooOO0o(l0 l0Var, View view, FrameLayout frameLayout, int i) {
        if ((i & 1) != 0) {
            view = null;
        }
        if ((i & 2) != 0) {
            frameLayout = null;
        }
        if (view != null && !Intrinsics.areEqual(view, l0Var.f59316OooOOo0)) {
            l0Var.f59316OooOOo0 = view;
            view.setSelected(true);
            View view2 = l0Var.f59314OooOOOo;
            if (view2 != null) {
                view2.setSelected(false);
            }
            l0Var.f59314OooOOOo = l0Var.f59316OooOOo0;
            l0Var.f59318OooOo = l0Var.f59311OooOOO.get(l0Var.f59315OooOOo).getGiftNum();
            l0Var.f59322OooOo0o = l0Var.f59311OooOOO.get(l0Var.f59315OooOOo).getPropId();
            String price = l0Var.f59311OooOOO.get(l0Var.f59315OooOOo).getPrice();
            Intrinsics.checkNotNullExpressionValue(price, "getPrice(...)");
            l0Var.OooOO0().f44162OooOOoo.setText(o0000O.OooO00o(com.code.android.util.o0000.OooO0OO(o000OOo.mora_game_commit), o000.OooO00o(Integer.parseInt(price) * l0Var.f59318OooOo)));
        }
        if (frameLayout == null) {
            l0Var.getClass();
            return;
        }
        if (Intrinsics.areEqual(frameLayout, l0Var.f59320OooOo00)) {
            return;
        }
        l0Var.f59320OooOo00 = frameLayout;
        frameLayout.setSelected(true);
        View view3 = l0Var.f59317OooOOoo;
        if (view3 != null) {
            view3.setSelected(false);
        }
        l0Var.f59317OooOOoo = l0Var.f59320OooOo00;
    }

    @Override // p675oO0Oo.o0oO0Ooo
    public final void OooO() {
        super.OooO();
        p393o0OOooo0.o0OO00O.OooO0Oo(false);
    }

    @Override // p675oO0Oo.o0oO0Ooo
    public final void OooO0o0(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        boolean zAreEqual = Intrinsics.areEqual(view, OooOO0().f44151OooO0oO) ? true : Intrinsics.areEqual(view, OooOO0().f44152OooO0oo);
        Context context = this.f59572OooO0Oo;
        if (zAreEqual) {
            new r0(context).OooO();
            return;
        }
        if (Intrinsics.areEqual(view, OooOO0().f44150OooO0o0)) {
            h0.OooO0O0("102120");
            int i = RoomMoraGameHistoryActivity.f26163OooOoOO;
            Intrinsics.checkNotNullParameter(context, "context");
            context.startActivity(new Intent(context, (Class<?>) RoomMoraGameHistoryActivity.class));
            return;
        }
        if (Intrinsics.areEqual(view, OooOO0().f44149OooO0o)) {
            int i2 = WalletActivity.f26589OooOoOO;
            WalletActivity.OooO00o.OooO00o(context, false);
            return;
        }
        if (Intrinsics.areEqual(view, OooOO0().f44154OooOO0O)) {
            this.f59321OooOo0O = 0;
            OooOO0o(this, null, OooOO0().f44154OooOO0O, 1);
            return;
        }
        if (Intrinsics.areEqual(view, OooOO0().f44153OooOO0)) {
            this.f59321OooOo0O = 1;
            OooOO0o(this, null, OooOO0().f44153OooOO0, 1);
            return;
        }
        if (Intrinsics.areEqual(view, OooOO0().f44144OooO)) {
            this.f59321OooOo0O = 2;
            OooOO0o(this, null, OooOO0().f44144OooO, 1);
            return;
        }
        if (Intrinsics.areEqual(view, OooOO0().f44160OooOOo)) {
            h0.OooO0O0("102125");
            LinearLayout llUserSelect = OooOO0().f44160OooOOo;
            Intrinsics.checkNotNullExpressionValue(llUserSelect, "llUserSelect");
            OooOOO0(llUserSelect);
            return;
        }
        if (Intrinsics.areEqual(view, OooOO0().f44162OooOOoo)) {
            h0.OooO0O0("102122");
            int i3 = this.f59321OooOo0O;
            int i4 = this.f59322OooOo0o;
            int i5 = this.f59318OooOo;
            Long lValueOf = Long.valueOf(this.f59327OooOoo0);
            Room.MoraStartUpRequest.Builder builderNewBuilder = Room.MoraStartUpRequest.newBuilder();
            builderNewBuilder.setMoratype(i3);
            builderNewBuilder.setMoragiftid(i4);
            Intrinsics.checkNotNull(lValueOf);
            builderNewBuilder.setToUserId(lValueOf.longValue());
            builderNewBuilder.setMoranum(i5);
            RoomLiveService roomLiveService = RoomLiveService.f24604OooOo00;
            if (roomLiveService != null) {
                roomLiveService.OooO0oo(10062, builderNewBuilder.build().toByteArray());
                return;
            }
            return;
        }
        if (!Intrinsics.areEqual(view, OooOO0().f44165OooOo00)) {
            if (Intrinsics.areEqual(view, OooOO0().f44157OooOOO0)) {
                h0.OooO0O0("102121");
                new oO00OOo0(context).OooO();
                return;
            }
            return;
        }
        h0.OooO0O0("102126");
        long j = this.f59319OooOo0;
        long j2 = this.f59323OooOoO;
        int i6 = this.f59321OooOo0O;
        int i7 = this.f59322OooOo0o;
        int i8 = this.f59318OooOo;
        long j3 = this.f59325OooOoOO;
        Room.MoraStartPkRequest.Builder builderNewBuilder2 = Room.MoraStartPkRequest.newBuilder();
        builderNewBuilder2.setMuuid(j);
        builderNewBuilder2.setSuid(j2);
        builderNewBuilder2.setMoratype(i6);
        builderNewBuilder2.setMoragiftid(i7);
        builderNewBuilder2.setMoranum(i8);
        builderNewBuilder2.setToUserId(j3);
        RoomLiveService roomLiveService2 = RoomLiveService.f24604OooOo00;
        if (roomLiveService2 != null) {
            roomLiveService2.OooO0oo(10063, builderNewBuilder2.build().toByteArray());
        }
        OooO0O0();
    }

    public final n OooOO0() {
        return (n) this.f59310OooOO0o.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooOO0O(long j, int i, @NotNull String moraGiftIcon, @NotNull String moraGiftNum, final int i2, @NotNull RoomUserInfoModel formUserModel, long j2) {
        Intrinsics.checkNotNullParameter(moraGiftIcon, "moraGiftIcon");
        Intrinsics.checkNotNullParameter(moraGiftNum, "moraGiftNum");
        Intrinsics.checkNotNullParameter(formUserModel, "formUserModel");
        try {
            this.f59319OooOo0 = j;
            this.f59322OooOo0o = i;
            this.f59318OooOo = Integer.parseInt(moraGiftNum);
            this.f59324OooOoO0 = moraGiftIcon;
            this.f59323OooOoO = formUserModel.getUserId().getValue().longValue();
            this.f59325OooOoOO = j2;
        } catch (Exception e) {
            e.printStackTrace();
        }
        NetImageView ivMoraGameGift = OooOO0().f44156OooOOO;
        Intrinsics.checkNotNullExpressionValue(ivMoraGameGift, "ivMoraGameGift");
        Context context = this.f59572OooO0Oo;
        Oooo000.OooO00o oooO00o = new Oooo000.OooO00o(context);
        oooO00o.OooO00o(o0O0O0Oo.OooO0O0());
        oooO00o.f43127OooO0OO = moraGiftIcon;
        oooO00o.f43125OooO00o = 0;
        oooO00o.OooO0Oo(ivMoraGameGift);
        OooOO0().f44168OooOoO.setText(OooOo00.OooO0oO("x", moraGiftNum));
        final int i3 = 1;
        OooOO0().f44165OooOo00.post(new Runnable() { // from class: androidx.media3.session.o00oO0o
            @Override // java.lang.Runnable
            public final void run() {
                int i4 = i3;
                int i5 = i2;
                Object obj = this;
                switch (i4) {
                    case 0:
                        ((o000OO) obj).getClass();
                        throw null;
                    default:
                        l0 this$0 = (l0) obj;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.OooOO0().f44165OooOo00.setText(com.code.android.util.o0000O.OooO00o(com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.mora_join_game_commit), String.valueOf(i5)));
                        return;
                }
            }
        });
        Oooo000.OooO00o oooO00o2 = new Oooo000.OooO00o(context);
        oooO00o2.OooO00o(o0O0O0Oo.OooO0OO());
        oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
        oooO00o2.f43127OooO0OO = (String) oo0oO0.OooO().getValue();
        oooO00o2.f43125OooO00o = 0;
        oooO00o2.OooO0Oo(OooOO0().f44167OooOo0o);
        OooOO0().f44163OooOo.setText((CharSequence) oo0oO0.OooOOoo().getValue());
        Oooo000.OooO00o oooO00o3 = new Oooo000.OooO00o(context);
        oooO00o3.OooO00o(o0O0O0Oo.OooO0OO());
        oooO00o3.f43127OooO0OO = formUserModel.getUserHeader().getValue();
        oooO00o3.f43125OooO00o = 0;
        oooO00o3.OooO0Oo(OooOO0().f44164OooOo0);
        OooOO0().f44166OooOo0O.setText(formUserModel.getUserName().getValue());
    }

    public final void OooOOO0(LinearLayout linearLayout) {
        q0 q0Var = null;
        if (this.f59326OooOoo == null) {
            Context context = this.f59572OooO0Oo;
            g1 g1VarInflate = g1.inflate(LayoutInflater.from(context));
            Intrinsics.checkNotNullExpressionValue(g1VarInflate, "inflate(...)");
            PopupWindow popupWindow = new PopupWindow((View) g1VarInflate.f43862OooO00o, -2, -2, true);
            this.f59326OooOoo = popupWindow;
            popupWindow.setOutsideTouchable(true);
            g1VarInflate.f43862OooO00o.measure(0, 0);
            FixLinearLayoutManager fixLinearLayoutManager = new FixLinearLayoutManager(context);
            RecyclerView recyclerView = g1VarInflate.f43863OooO0O0;
            recyclerView.setLayoutManager(fixLinearLayoutManager);
            q0 q0Var2 = new q0(context, o0OO00O.room_item_guess_user_select);
            this.f59328OooOooO = q0Var2;
            recyclerView.setAdapter(q0Var2);
            q0 q0Var3 = this.f59328OooOooO;
            if (q0Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("popupAdapter");
                q0Var3 = null;
            }
            q0Var3.f13187OooO0o = new o00O0O(this);
        }
        List<o0OO0> list = com.yalla.yalla.service.room.OooO00o.f24525OooO0oO.f48536OooOO0O;
        ArrayList<o0OO0> arrayList = new ArrayList();
        for (Object obj : list) {
            if (((o0OO0) obj).f54750OooO0OO.getValue().longValue() > 0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (o0OO0 o0oo1 : arrayList) {
            ArrayList arrayList3 = com.yalla.yalla.service.room.OooO00o.f24519OooO00o;
            RoomUserInfoModel roomUserInfoModelOooO0o0 = com.yalla.yalla.service.room.OooO00o.OooO0o0(o0oo1.f54750OooO0OO.getValue());
            if (roomUserInfoModelOooO0o0 != null) {
                arrayList2.add(roomUserInfoModelOooO0o0);
            }
        }
        List mutableList = CollectionsKt.toMutableList((Collection) arrayList2);
        RoomUserInfoModel roomUserInfoModel = new RoomUserInfoModel();
        roomUserInfoModel.getUserName().setValue(com.code.android.util.o0000.OooO0OO(o000OOo.room_dialog_guess_any_one));
        mutableList.add(0, roomUserInfoModel);
        q0 q0Var4 = this.f59328OooOooO;
        if (q0Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("popupAdapter");
        } else {
            q0Var = q0Var4;
        }
        q0Var.OooOoO0(mutableList);
        int size = mutableList.size();
        int size2 = 1 <= size && size < 6 ? mutableList.size() : 5;
        PopupWindow popupWindow2 = this.f59326OooOoo;
        if (popupWindow2 != null) {
            popupWindow2.showAsDropDown(linearLayout, 0, ((-linearLayout.getHeight()) - (o0000O0.OooO00o(45) * size2)) - o0000O0.OooO00o(7), 48);
        }
    }
}
