package p519o0o0O0oO;

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
import androidx.lifecycle.Observer;
import androidx.lifecycle.OooOOO;
import androidx.recyclerview.widget.RecyclerView;
import com.android.billingclient.api.o0000OO0;
import com.app.base.protobuf.room.Room;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.code.android.util.o0000O0;
import com.code.android.util.o000OO00;
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
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p157o00OoOO0.o0OO00O;
import p362o0OOo0O.OooOO0;
import p385o0OOooOO.oOO00O;
import p464o0Oooo.o000000O;
import p480o0o000Oo.o0OOO0o;
import p533o0o0Oo0.oo0O;
import p543o0oO0O00.OooO;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oO00Oo00;
import p587o0oOooo.o0OO000;
import p590o0oo0.OooOOOO;
import p641o0ooOOOO.q9;
import p641o0ooOOOO.z7;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nMoraGameDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MoraGameDialog.kt\ncom/yalla/yalla/ui/dialog/MoraGameDialog\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,411:1\n766#2:412\n857#2,2:413\n1603#2,9:415\n1855#2:424\n1856#2:426\n1612#2:427\n1#3:425\n*S KotlinDebug\n*F\n+ 1 MoraGameDialog.kt\ncom/yalla/yalla/ui/dialog/MoraGameDialog\n*L\n346#1:412\n346#1:413,2\n347#1:415,9\n347#1:424\n347#1:426\n347#1:427\n347#1:425\n*E\n"})
public final class ooooO0O0 extends o00O00OO {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public oOOO00Oo f53042OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public final Lazy f53043OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NotNull
    public List<MoraGiftListModel> f53044OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NotNull
    public final OooO0O0 f53045OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NotNull
    public final OooO0OO f53046OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @Nullable
    public View f53047OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public int f53048OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @Nullable
    public View f53049OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @Nullable
    public View f53050OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f53051OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public long f53052OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @Nullable
    public View f53053OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public int f53054OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f53055OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public long f53056OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @NotNull
    public String f53057OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public long f53058OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    @Nullable
    public PopupWindow f53059OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public long f53060OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public oOOO0O0o f53061OooOooO;

    public static final class OooO00o extends Lambda implements Function0<z7> {
        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final z7 invoke() {
            ooooO0O0 ooooo0o0 = ooooO0O0.this;
            z7 z7VarInflate = z7.inflate(LayoutInflater.from(ooooo0o0.f52532OooO0Oo), ooooo0o0.f52533OooO0o, false);
            Intrinsics.checkNotNullExpressionValue(z7VarInflate, "inflate(LayoutInflater.f…t), getRootView(), false)");
            return z7VarInflate;
        }
    }

    public static final class OooO0O0 implements Observer<Boolean> {
        public OooO0O0() {
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(Boolean bool) {
            boolean zBooleanValue = bool.booleanValue();
            ooooO0O0 ooooo0o0 = ooooO0O0.this;
            if (zBooleanValue) {
                ooooo0o0.f53060OooOoo0 = 0L;
                ooooo0o0.OooO0O0();
            } else {
                o0OO00O o0oo00o2 = new o0OO00O(ooooo0o0.f52532OooO0Oo);
                o0oo00o2.OooOo00(o0000.OooO0OO(oO00OOo0.room_dialog_guess_start_failed_content));
                o0oo00o2.OooOo0(new oOO(ooooo0o0));
                o0oo00o2.OooOO0o();
            }
        }
    }

    public static final class OooO0OO implements Observer<List<MoraGiftListModel>> {
        public OooO0OO() {
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(List<MoraGiftListModel> list) {
            List<MoraGiftListModel> it = list;
            Intrinsics.checkNotNullParameter(it, "it");
            ooooO0O0 ooooo0o0 = ooooO0O0.this;
            oOOO00Oo oooo00oo = ooooo0o0.f53042OooOO0O;
            if (oooo00oo == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                oooo00oo = null;
            }
            oooo00oo.OooOoO0(it);
            ooooo0o0.OooOO0().f59491OooOoO0.postDelayed(new OooOOO(ooooo0o0, 1), 200L);
            ooooo0o0.f53044OooOOO = it;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ooooO0O0(@NotNull FragmentActivity mActivity, boolean z) {
        super(mActivity, 0);
        Intrinsics.checkNotNullParameter(mActivity, "mActivity");
        this.f53043OooOO0o = LazyKt.lazy(new OooO00o());
        OooO0O0 oooO0O0 = new OooO0O0();
        this.f53045OooOOO0 = oooO0O0;
        this.f53044OooOOO = new ArrayList();
        OooO0OO oooO0OO = new OooO0OO();
        this.f53046OooOOOO = oooO0OO;
        this.f53057OooOoO0 = "";
        LinearLayout linearLayout = OooOO0().f59467OooO00o;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.root");
        OooO0oO(linearLayout);
        Window window = this.f52535OooO0oO;
        if (window != null) {
            window.setWindowAnimations(oO00Oo00.animation_bottom_in_bottom_out);
        }
        Window window2 = this.f52535OooO0oO;
        if (window2 != null) {
            window2.setGravity(80);
        }
        if (z) {
            ConstraintLayout constraintLayout = OooOO0().f59468OooO0O0;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.clRoomMoraBodyOne");
            o000OO00.OooOOOO(constraintLayout);
            LinearLayout linearLayout2 = OooOO0().f59483OooOOo0;
            Intrinsics.checkNotNullExpressionValue(linearLayout2, "binding.llRoomMoraHeader");
            o000OO00.OooOOOO(linearLayout2);
            ConstraintLayout constraintLayout2 = OooOO0().f59469OooO0OO;
            Intrinsics.checkNotNullExpressionValue(constraintLayout2, "binding.clRoomMoraBodyTwo");
            o000OO00.OooO0O0(constraintLayout2);
            Button button = OooOO0().f59487OooOo00;
            Intrinsics.checkNotNullExpressionValue(button, "binding.moraGameCommit2");
            o000OO00.OooO0O0(button);
            LinearLayout linearLayout3 = OooOO0().f59481OooOOOo;
            Intrinsics.checkNotNullExpressionValue(linearLayout3, "binding.llMoraGameCommit");
            o000OO00.OooOOOO(linearLayout3);
        } else {
            ConstraintLayout constraintLayout3 = OooOO0().f59468OooO0O0;
            Intrinsics.checkNotNullExpressionValue(constraintLayout3, "binding.clRoomMoraBodyOne");
            o000OO00.OooO0O0(constraintLayout3);
            LinearLayout linearLayout4 = OooOO0().f59483OooOOo0;
            Intrinsics.checkNotNullExpressionValue(linearLayout4, "binding.llRoomMoraHeader");
            o000OO00.OooO0O0(linearLayout4);
            ConstraintLayout constraintLayout4 = OooOO0().f59469OooO0OO;
            Intrinsics.checkNotNullExpressionValue(constraintLayout4, "binding.clRoomMoraBodyTwo");
            o000OO00.OooOOOO(constraintLayout4);
            Button button2 = OooOO0().f59487OooOo00;
            Intrinsics.checkNotNullExpressionValue(button2, "binding.moraGameCommit2");
            o000OO00.OooOOOO(button2);
            LinearLayout linearLayout5 = OooOO0().f59481OooOOOo;
            Intrinsics.checkNotNullExpressionValue(linearLayout5, "binding.llMoraGameCommit");
            o000OO00.OooO0O0(linearLayout5);
        }
        TextView textView = OooOO0().f59470OooO0Oo;
        o000000O o000000o2 = o000000O.f46674OooO00o;
        textView.setText(OooOOOO.OooO0Oo(String.valueOf(o000000O.OooO0O0().getValue())));
        OooOO0().f59477OooOO0o.setText(OooOOOO.OooO0oO(o0000.OooO0OO(oO00OOo0.winner_gifts), CertificateUtil.DELIMITER));
        OooOO0().f59484OooOOoo.setText(o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.mora_game_commit), AppEventsConstants.EVENT_PARAM_VALUE_NO));
        o0OOO0o o0ooo0oOooO0O0 = o0000OO0.OooO0O0();
        String str = o000000O.OooOOo0().getValue() + "MORA_RED_POINT";
        SharedPreferences sharedPreferences = o0ooo0oOooO0O0.f47688OooO00o;
        if ((sharedPreferences == null ? 0L : sharedPreferences.getLong(str, 0L)) != 0) {
            View view = OooOO0().f59493OooOoo0;
            Intrinsics.checkNotNullExpressionValue(view, "binding.vMoraPoint");
            o000OO00.OooOOOO(view);
        } else {
            View view2 = OooOO0().f59493OooOoo0;
            Intrinsics.checkNotNullExpressionValue(view2, "binding.vMoraPoint");
            o000OO00.OooO0OO(view2);
        }
        OooOO0().f59476OooOO0O.setOnClickListener(this);
        OooOO0().f59475OooOO0.setOnClickListener(this);
        OooOO0().f59466OooO.setOnClickListener(this);
        OooOO0().f59471OooO0o.setOnClickListener(this);
        OooOO0().f59472OooO0o0.setOnClickListener(this);
        OooOO0().f59473OooO0oO.setOnClickListener(this);
        OooOO0().f59474OooO0oo.setOnClickListener(this);
        OooOO0().f59484OooOOoo.setOnClickListener(this);
        OooOO0().f59479OooOOO0.setOnClickListener(this);
        OooOO0().f59482OooOOo.setOnClickListener(this);
        OooOO0().f59487OooOo00.setOnClickListener(this);
        int i = oO00OO0O.room_dialog_mora_game_gift_item;
        Context context = this.f52532OooO0Oo;
        this.f53042OooOO0O = new oOOO00Oo(this, context, i);
        OooOO0().f59491OooOoO0.setLayoutManager(new FixLinearLayoutManager(context, 0));
        RecyclerView recyclerView = OooOO0().f59491OooOoO0;
        oOOO00Oo oooo00oo = this.f53042OooOO0O;
        if (oooo00oo == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oooo00oo = null;
        }
        recyclerView.setAdapter(oooo00oo);
        OooOO0o(this, null, OooOO0().f59476OooOO0O, 1);
        this.f52534OooO0o0.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: o0o0O0oO.oOO0Oo00
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                ooooO0O0 this$0 = this.f52982OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                OooO0O0.f24995OoooOOO.OooO00o().f25015OooOOoo.removeObserver(this$0.f53046OooOOOO);
                LiveEventBus.get("ROOM_GUESS_START_A_GUESSING_GAME_STATE", Boolean.TYPE).removeObserver(this$0.f53045OooOOO0);
            }
        });
        MixedRoomDataSource.OooO0o0().OooOOO();
        if (z) {
            com.yalla.yalla.service.room.OooO0O0.f24995OoooOOO.OooO00o().f25015OooOOoo.observeForever(oooO0OO);
            if (this.f53055OooOo0o != 0) {
                String str2 = this.f53057OooOoO0;
                NetImageView netImageView = OooOO0().f59478OooOOO;
                Intrinsics.checkNotNullExpressionValue(netImageView, "binding.ivMoraGameGift");
                OooOO0.OooO00o oooO00o = new OooOO0.OooO00o(this.f52532OooO0Oo);
                oooO00o.OooO00o(OooO.OooO0O0());
                oooO00o.f43911OooO0OO = str2;
                oooO00o.f43909OooO00o = 0;
                oooO00o.OooO0Oo(netImageView);
            }
        }
        LiveEventBus.get("MORA_RED_POINT").observe(mActivity, new oOOO000o(this));
        LiveEventBus.get("ROOM_GUESS_START_A_GUESSING_GAME_STATE", Boolean.TYPE).observeForever(oooO0O0);
    }

    public static void OooOO0o(ooooO0O0 ooooo0o0, View view, FrameLayout frameLayout, int i) {
        if ((i & 1) != 0) {
            view = null;
        }
        if ((i & 2) != 0) {
            frameLayout = null;
        }
        if (view != null && !Intrinsics.areEqual(view, ooooo0o0.f53049OooOOo0)) {
            ooooo0o0.f53049OooOOo0 = view;
            view.setSelected(true);
            View view2 = ooooo0o0.f53047OooOOOo;
            if (view2 != null) {
                view2.setSelected(false);
            }
            ooooo0o0.f53047OooOOOo = ooooo0o0.f53049OooOOo0;
            ooooo0o0.f53051OooOo = ooooo0o0.f53044OooOOO.get(ooooo0o0.f53048OooOOo).getGiftNum();
            ooooo0o0.f53055OooOo0o = ooooo0o0.f53044OooOOO.get(ooooo0o0.f53048OooOOo).getPropId();
            String price = ooooo0o0.f53044OooOOO.get(ooooo0o0.f53048OooOOo).getPrice();
            Intrinsics.checkNotNullExpressionValue(price, "moraGiftList[giftPosition].price");
            ooooo0o0.OooOO0().f59484OooOOoo.setText(o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.mora_game_commit), p426o0OoOO.o0OOO0o.OooO00o(Integer.parseInt(price) * ooooo0o0.f53051OooOo)));
        }
        if (frameLayout == null) {
            ooooo0o0.getClass();
            return;
        }
        if (Intrinsics.areEqual(frameLayout, ooooo0o0.f53053OooOo00)) {
            return;
        }
        ooooo0o0.f53053OooOo00 = frameLayout;
        frameLayout.setSelected(true);
        View view3 = ooooo0o0.f53050OooOOoo;
        if (view3 != null) {
            view3.setSelected(false);
        }
        ooooo0o0.f53050OooOOoo = ooooo0o0.f53053OooOo00;
    }

    @Override // p519o0o0O0oO.o00O00OO
    public final void OooO() {
        super.OooO();
        oOO00O.OooO0Oo(false);
    }

    @Override // p519o0o0O0oO.o00O00OO
    public final void OooO0o0(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        boolean zAreEqual = Intrinsics.areEqual(view, OooOO0().f59473OooO0oO) ? true : Intrinsics.areEqual(view, OooOO0().f59474OooO0oo);
        Context context = this.f52532OooO0Oo;
        if (zAreEqual) {
            new oOOO0OO0(context).OooO();
            return;
        }
        if (Intrinsics.areEqual(view, OooOO0().f59472OooO0o0)) {
            o0OO000.OooO00o("102120");
            int i = RoomMoraGameHistoryActivity.f26615OooOoOO;
            Intrinsics.checkNotNullParameter(context, "context");
            context.startActivity(new Intent(context, (Class<?>) RoomMoraGameHistoryActivity.class));
            return;
        }
        if (Intrinsics.areEqual(view, OooOO0().f59471OooO0o)) {
            int i2 = WalletActivity.f27054OooOoOO;
            WalletActivity.OooO00o.OooO00o(context, false);
            return;
        }
        if (Intrinsics.areEqual(view, OooOO0().f59476OooOO0O)) {
            this.f53054OooOo0O = 0;
            OooOO0o(this, null, OooOO0().f59476OooOO0O, 1);
            return;
        }
        if (Intrinsics.areEqual(view, OooOO0().f59475OooOO0)) {
            this.f53054OooOo0O = 1;
            OooOO0o(this, null, OooOO0().f59475OooOO0, 1);
            return;
        }
        if (Intrinsics.areEqual(view, OooOO0().f59466OooO)) {
            this.f53054OooOo0O = 2;
            OooOO0o(this, null, OooOO0().f59466OooO, 1);
            return;
        }
        if (Intrinsics.areEqual(view, OooOO0().f59482OooOOo)) {
            o0OO000.OooO00o("102125");
            LinearLayout linearLayout = OooOO0().f59482OooOOo;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.llUserSelect");
            OooOOO0(linearLayout);
            return;
        }
        if (Intrinsics.areEqual(view, OooOO0().f59484OooOOoo)) {
            o0OO000.OooO00o("102122");
            int i3 = this.f53054OooOo0O;
            int i4 = this.f53055OooOo0o;
            int i5 = this.f53051OooOo;
            Long lValueOf = Long.valueOf(this.f53060OooOoo0);
            Room.MoraStartUpRequest.Builder builderNewBuilder = Room.MoraStartUpRequest.newBuilder();
            builderNewBuilder.setMoratype(i3);
            builderNewBuilder.setMoragiftid(i4);
            Intrinsics.checkNotNull(lValueOf);
            builderNewBuilder.setToUserId(lValueOf.longValue());
            builderNewBuilder.setMoranum(i5);
            RoomLiveService roomLiveService = RoomLiveService.f25058OooOo00;
            if (roomLiveService != null) {
                roomLiveService.OooO0oo(10062, builderNewBuilder.build().toByteArray());
                return;
            }
            return;
        }
        if (!Intrinsics.areEqual(view, OooOO0().f59487OooOo00)) {
            if (Intrinsics.areEqual(view, OooOO0().f59479OooOOO0)) {
                o0OO000.OooO00o("102121");
                new oO0000o0(context).OooO();
                return;
            }
            return;
        }
        o0OO000.OooO00o("102126");
        long j = this.f53052OooOo0;
        long j2 = this.f53056OooOoO;
        int i6 = this.f53054OooOo0O;
        int i7 = this.f53055OooOo0o;
        int i8 = this.f53051OooOo;
        long j3 = this.f53058OooOoOO;
        Room.MoraStartPkRequest.Builder builderNewBuilder2 = Room.MoraStartPkRequest.newBuilder();
        builderNewBuilder2.setMuuid(j);
        builderNewBuilder2.setSuid(j2);
        builderNewBuilder2.setMoratype(i6);
        builderNewBuilder2.setMoragiftid(i7);
        builderNewBuilder2.setMoranum(i8);
        builderNewBuilder2.setToUserId(j3);
        RoomLiveService roomLiveService2 = RoomLiveService.f25058OooOo00;
        if (roomLiveService2 != null) {
            roomLiveService2.OooO0oo(10063, builderNewBuilder2.build().toByteArray());
        }
        OooO0O0();
    }

    public final z7 OooOO0() {
        return (z7) this.f53043OooOO0o.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooOO0O(long j, int i, @NotNull String moraGiftIcon, @NotNull String moraGiftNum, final int i2, @NotNull RoomUserInfoModel formUserModel, long j2) {
        Intrinsics.checkNotNullParameter(moraGiftIcon, "moraGiftIcon");
        Intrinsics.checkNotNullParameter(moraGiftNum, "moraGiftNum");
        Intrinsics.checkNotNullParameter(formUserModel, "formUserModel");
        try {
            this.f53052OooOo0 = j;
            this.f53055OooOo0o = i;
            this.f53051OooOo = Integer.parseInt(moraGiftNum);
            this.f53057OooOoO0 = moraGiftIcon;
            this.f53056OooOoO = formUserModel.getUserId().getValue().longValue();
            this.f53058OooOoOO = j2;
        } catch (Exception e) {
            e.printStackTrace();
        }
        NetImageView netImageView = OooOO0().f59478OooOOO;
        Intrinsics.checkNotNullExpressionValue(netImageView, "binding.ivMoraGameGift");
        Context context = this.f52532OooO0Oo;
        OooOO0.OooO00o oooO00o = new OooOO0.OooO00o(context);
        oooO00o.OooO00o(OooO.OooO0O0());
        oooO00o.f43911OooO0OO = moraGiftIcon;
        oooO00o.f43909OooO00o = 0;
        oooO00o.OooO0Oo(netImageView);
        OooOO0().f59490OooOoO.setText(OooOOOO.OooO0oO("x", moraGiftNum));
        OooOO0().f59487OooOo00.post(new Runnable() { // from class: o0o0O0oO.oOO0OoO0
            @Override // java.lang.Runnable
            public final void run() {
                ooooO0O0 this$0 = this.f52983OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooOO0().f59487OooOo00.setText(o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.mora_join_game_commit), String.valueOf(i2)));
            }
        });
        OooOO0.OooO00o oooO00o2 = new OooOO0.OooO00o(context);
        oooO00o2.OooO00o(OooO.OooO0OO());
        o000000O o000000o2 = o000000O.f46674OooO00o;
        oooO00o2.f43911OooO0OO = (String) o000000O.OooO().getValue();
        oooO00o2.f43909OooO00o = 0;
        oooO00o2.OooO0Oo(OooOO0().f59489OooOo0o);
        OooOO0().f59485OooOo.setText((CharSequence) o000000O.OooOOoo().getValue());
        OooOO0.OooO00o oooO00o3 = new OooOO0.OooO00o(context);
        oooO00o3.OooO00o(OooO.OooO0OO());
        oooO00o3.f43911OooO0OO = formUserModel.getUserHeader().getValue();
        oooO00o3.f43909OooO00o = 0;
        oooO00o3.OooO0Oo(OooOO0().f59486OooOo0);
        OooOO0().f59488OooOo0O.setText(formUserModel.getUserName().getValue());
    }

    public final void OooOOO0(LinearLayout linearLayout) {
        oOOO0O0o oooo0o0o = null;
        if (this.f53059OooOoo == null) {
            Context context = this.f52532OooO0Oo;
            q9 q9VarInflate = q9.inflate(LayoutInflater.from(context));
            Intrinsics.checkNotNullExpressionValue(q9VarInflate, "inflate(LayoutInflater.from(context))");
            PopupWindow popupWindow = new PopupWindow((View) q9VarInflate.f58678OooO00o, -2, -2, true);
            this.f53059OooOoo = popupWindow;
            popupWindow.setOutsideTouchable(true);
            q9VarInflate.f58678OooO00o.measure(0, 0);
            FixLinearLayoutManager fixLinearLayoutManager = new FixLinearLayoutManager(context);
            RecyclerView recyclerView = q9VarInflate.f58679OooO0O0;
            recyclerView.setLayoutManager(fixLinearLayoutManager);
            oOOO0O0o oooo0o0o2 = new oOOO0O0o(context, oO00OO0O.room_item_guess_user_select);
            this.f53061OooOooO = oooo0o0o2;
            recyclerView.setAdapter(oooo0o0o2);
            oOOO0O0o oooo0o0o3 = this.f53061OooOooO;
            if (oooo0o0o3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("popupAdapter");
                oooo0o0o3 = null;
            }
            oooo0o0o3.f10098OooO0o = new oOO0OOO(this);
        }
        List<oo0O> list = com.yalla.yalla.service.room.OooO00o.f24979OooO0oO.f47380OooOO0O;
        ArrayList<oo0O> arrayList = new ArrayList();
        for (Object obj : list) {
            if (((oo0O) obj).f54838OooO0OO.getValue().longValue() > 0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (oo0O oo0o : arrayList) {
            ArrayList arrayList3 = com.yalla.yalla.service.room.OooO00o.f24973OooO00o;
            RoomUserInfoModel roomUserInfoModelOooO0o0 = com.yalla.yalla.service.room.OooO00o.OooO0o0(oo0o.f54838OooO0OO.getValue());
            if (roomUserInfoModelOooO0o0 != null) {
                arrayList2.add(roomUserInfoModelOooO0o0);
            }
        }
        List mutableList = CollectionsKt.toMutableList((Collection) arrayList2);
        RoomUserInfoModel roomUserInfoModel = new RoomUserInfoModel();
        roomUserInfoModel.getUserName().setValue(o0000.OooO0OO(oO00OOo0.room_dialog_guess_any_one));
        mutableList.add(0, roomUserInfoModel);
        oOOO0O0o oooo0o0o4 = this.f53061OooOooO;
        if (oooo0o0o4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("popupAdapter");
        } else {
            oooo0o0o = oooo0o0o4;
        }
        oooo0o0o.OooOoO0(mutableList);
        int size = mutableList.size();
        int size2 = 1 <= size && size < 6 ? mutableList.size() : 5;
        PopupWindow popupWindow2 = this.f53059OooOoo;
        if (popupWindow2 != null) {
            popupWindow2.showAsDropDown(linearLayout, 0, ((-linearLayout.getHeight()) - (o0000O0.OooO00o(45) * size2)) - o0000O0.OooO00o(7), 48);
        }
    }
}
