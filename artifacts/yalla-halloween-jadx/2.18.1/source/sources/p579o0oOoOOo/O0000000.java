package p579o0oOoOOo;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import com.app.base.mixedroom.model.RoomLoginInformation;
import com.app.base.model.MoraGiftListModel;
import com.app.base.protobuf.room.Room;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.internal.security.CertificateUtil;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOo;
import com.yalla.support.common.util.OooOo00;
import com.yalla.yalla.model.RoomUserInfoModel;
import com.yalla.yalla.ui.activity.room.RoomMoraGameHistoryActivity;
import com.yalla.yalla.ui.activity.store.WalletActivity;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import com.yalla.yalla.util.netimage.NetImageView;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p142o00OOooO.o000O0o;
import p142o00OOooO.o000Oo0;
import p159o00OoOO.o000O00O;
import p159o00OoOO.o00O000;
import p168o00Ooo0.o0O0O00;
import p188o00o00o0.OooO0OO;
import p188o00o00o0.OooO0o;
import p391o0OOooOo.o0O00000;
import p498o0o00Oo0.OooOOO;
import p501o0o00o.o0ooOOo;
import p502o0o00o0.o00000O;
import p520o0o0O0O0.o00O0O;
import p530o0o0OOO.o00OO00O;
import p534o0o0OOo0.o0OO000;
import p616o0oo0Ooo.oO0O00;
import p649o0ooOOoo.bh;
import p649o0ooOOoo.jf;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class O0000000 extends o00000O {

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    @NotNull
    public FragmentActivity f45872OoooO;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public OooO0OO<MoraGiftListModel> f45873OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    @NotNull
    public final Observer<Boolean> f45874OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    @NotNull
    public List<MoraGiftListModel> f45875OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    @NotNull
    public final Observer<List<MoraGiftListModel>> f45876OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    @Nullable
    public View f45877OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @Nullable
    public View f45878OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public int f45879Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    @Nullable
    public View f45880Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    @Nullable
    public View f45881OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public long f45882OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public int f45883OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public int f45884Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public int f45885Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    @NotNull
    public String f45886OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public long f45887Ooooooo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    @NotNull
    public final Lazy f45888o000oOoO;

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    @Nullable
    public PopupWindow f45889o00O0O;

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    public OooO0OO<RoomLoginInformation.MIC> f45890o00Oo0;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public long f45891o0OoOo0;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public long f45892ooOO;

    public static final class OooO00o extends Lambda implements Function0<jf> {
        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final jf invoke() {
            jf jfVarInflate = jf.inflate(LayoutInflater.from(O0000000.this.f41543Oooo0o), O0000000.this.f41545Oooo0oo, false);
            Intrinsics.checkNotNullExpressionValue(jfVarInflate, "inflate(LayoutInflater.f…t), getRootView(), false)");
            return jfVarInflate;
        }
    }

    public static final class OooO0O0 extends OooO0OO<RoomLoginInformation.MIC> {
        public OooO0O0(Context context) {
            super(context, R.layout.room_item_guess_user_select);
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        public final void convert(com.chad.library.adapter.base.OooO00o oooO00o, Object obj) {
            OooO0o oooO0o = (OooO0o) oooO00o;
            RoomLoginInformation.MIC mic = (RoomLoginInformation.MIC) obj;
            if (oooO0o == null || mic == null) {
                return;
            }
            if (oooO0o.getLayoutPosition() == 0) {
                ((ImageView) oooO0o.OooO0Oo(R.id.ivUserHeader)).setImageResource(R.drawable.icon_default_head_circle);
            } else {
                oO0O00.OooO00o oooO00o2 = new oO0O00.OooO00o(getContext());
                oooO00o2.OooO00o(o00OOO.OooO00o.OooO0o0());
                oooO00o2.f48429OooO0OO = mic.user.getUserHeader();
                oooO00o2.f48427OooO00o = 0;
                oooO00o2.OooO0o((ImageView) oooO0o.OooO0Oo(R.id.ivUserHeader));
            }
            long userId = mic.user.getUserId();
            View tagView = oooO0o.OooO0Oo(R.id.tvUserName);
            Intrinsics.checkNotNullExpressionValue(tagView, "helper.getView(R.id.tvUserName)");
            String defaultValue = mic.user.getUserName();
            Oo0000 block = new Oo0000(oooO0o);
            Intrinsics.checkNotNullParameter(tagView, "tagView");
            Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
            Intrinsics.checkNotNullParameter(block, "block");
            tagView.setTag(R.id.tag_friend_memo_name_tag, Long.valueOf(userId));
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getIO(), null, new o00O0O.OooO0O0(userId, defaultValue, tagView, block, null), 2, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O0000000(@NotNull FragmentActivity mActivity, boolean z) {
        super(mActivity, 0);
        Intrinsics.checkNotNullParameter(mActivity, "mActivity");
        this.f45872OoooO = mActivity;
        this.f45888o000oOoO = LazyKt.lazy(new OooO00o());
        int i = 4;
        o000O0o o000o0o2 = new o000O0o(this, i);
        this.f45874OoooOOO = o000o0o2;
        this.f45875OoooOOo = new ArrayList();
        o000Oo0 o000oo1 = new o000Oo0(this, 9);
        this.f45876OoooOo0 = o000oo1;
        this.f45886OoooooO = "";
        LinearLayout linearLayout = OooOO0O().f49769OooO00o;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.root");
        OooO0oO(linearLayout);
        Window window = this.f41542Oooo;
        if (window != null) {
            window.setWindowAnimations(R.style.animation_bottom_in_bottom_out);
        }
        Window window2 = this.f41542Oooo;
        if (window2 != null) {
            window2.setGravity(80);
        }
        if (z) {
            ConstraintLayout constraintLayout = OooOO0O().f49770OooO0O0;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.clRoomMoraBodyOne");
            com.yalla.support.common.util.o00O0O.OooO(constraintLayout);
            LinearLayout linearLayout2 = OooOO0O().f49785OooOOo0;
            Intrinsics.checkNotNullExpressionValue(linearLayout2, "binding.llRoomMoraHeader");
            com.yalla.support.common.util.o00O0O.OooO(linearLayout2);
            ConstraintLayout constraintLayout2 = OooOO0O().f49771OooO0OO;
            Intrinsics.checkNotNullExpressionValue(constraintLayout2, "binding.clRoomMoraBodyTwo");
            com.yalla.support.common.util.o00O0O.OooO00o(constraintLayout2);
            Button button = OooOO0O().f49789OooOo00;
            Intrinsics.checkNotNullExpressionValue(button, "binding.moraGameCommit2");
            com.yalla.support.common.util.o00O0O.OooO00o(button);
            LinearLayout linearLayout3 = OooOO0O().f49783OooOOOo;
            Intrinsics.checkNotNullExpressionValue(linearLayout3, "binding.llMoraGameCommit");
            com.yalla.support.common.util.o00O0O.OooO(linearLayout3);
        } else {
            ConstraintLayout constraintLayout3 = OooOO0O().f49770OooO0O0;
            Intrinsics.checkNotNullExpressionValue(constraintLayout3, "binding.clRoomMoraBodyOne");
            com.yalla.support.common.util.o00O0O.OooO00o(constraintLayout3);
            LinearLayout linearLayout4 = OooOO0O().f49785OooOOo0;
            Intrinsics.checkNotNullExpressionValue(linearLayout4, "binding.llRoomMoraHeader");
            com.yalla.support.common.util.o00O0O.OooO00o(linearLayout4);
            ConstraintLayout constraintLayout4 = OooOO0O().f49771OooO0OO;
            Intrinsics.checkNotNullExpressionValue(constraintLayout4, "binding.clRoomMoraBodyTwo");
            com.yalla.support.common.util.o00O0O.OooO(constraintLayout4);
            Button button2 = OooOO0O().f49789OooOo00;
            Intrinsics.checkNotNullExpressionValue(button2, "binding.moraGameCommit2");
            com.yalla.support.common.util.o00O0O.OooO(button2);
            LinearLayout linearLayout5 = OooOO0O().f49783OooOOOo;
            Intrinsics.checkNotNullExpressionValue(linearLayout5, "binding.llMoraGameCommit");
            com.yalla.support.common.util.o00O0O.OooO00o(linearLayout5);
        }
        TextView textView = OooOO0O().f49772OooO0Oo;
        OooOOO oooOOO = OooOOO.f41216OooO00o;
        textView.setText(o0O0O00.OooO0Oo(String.valueOf(oooOOO.OooO0OO().getValue())));
        OooOO0O().f49779OooOO0o.setText(o0O0O00.OooO0oo(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.winner_gifts), CertificateUtil.DELIMITER));
        OooOO0O().f49786OooOOoo.setText(OooOo.OooO00o(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.mora_game_commit), AppEventsConstants.EVENT_PARAM_VALUE_NO));
        long jOooO0O0 = com.android.billingclient.api.o00000O.OooO0O0().OooO0O0(oooOOO.OooOo().getValue() + "MORA_RED_POINT", 0L);
        View view = OooOO0O().f49795OooOoo0;
        Intrinsics.checkNotNullExpressionValue(view, "binding.vMoraPoint");
        if (jOooO0O0 != 0) {
            com.yalla.support.common.util.o00O0O.OooO(view);
        } else {
            com.yalla.support.common.util.o00O0O.OooO0O0(view);
        }
        OooOO0O().f49778OooOO0O.setOnClickListener(this);
        OooOO0O().f49777OooOO0.setOnClickListener(this);
        OooOO0O().f49768OooO.setOnClickListener(this);
        OooOO0O().f49773OooO0o.setOnClickListener(this);
        OooOO0O().f49774OooO0o0.setOnClickListener(this);
        OooOO0O().f49775OooO0oO.setOnClickListener(this);
        OooOO0O().f49776OooO0oo.setOnClickListener(this);
        OooOO0O().f49786OooOOoo.setOnClickListener(this);
        OooOO0O().f49781OooOOO0.setOnClickListener(this);
        OooOO0O().f49784OooOOo.setOnClickListener(this);
        OooOO0O().f49789OooOo00.setOnClickListener(this);
        this.f45873OoooOO0 = new O0OO00(this, this.f41543Oooo0o);
        OooOO0O().f49793OooOoO0.setLayoutManager(new FixLinearLayoutManager(this.f41543Oooo0o, 0));
        RecyclerView recyclerView = OooOO0O().f49793OooOoO0;
        OooO0OO<MoraGiftListModel> oooO0OO = this.f45873OoooOO0;
        if (oooO0OO == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oooO0OO = null;
        }
        recyclerView.setAdapter(oooO0OO);
        OooOOO(this, null, OooOO0O().f49778OooOO0O, 1);
        this.f41544Oooo0oO.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: o0oOoOOo.oo000000
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                O0000000 this$0 = this.f46203Oooo0o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                o00OO00O.f43313OooooOo.OooO00o().f43340OooOoO0.removeObserver(this$0.f45876OoooOo0);
                LiveEventBus.get("ROOM_GUESS_START_A_GUESSING_GAME_STATE", Boolean.TYPE).removeObserver(this$0.f45874OoooOOO);
            }
        });
        o000O00O.OooO().OooOoo0(this.f41543Oooo0o);
        if (z) {
            o00OO00O.f43313OooooOo.OooO00o().f43340OooOoO0.observeForever(o000oo1);
            if (this.f45885Oooooo0 != 0) {
                String str = this.f45886OoooooO;
                NetImageView netImageView = OooOO0O().f49780OooOOO;
                Intrinsics.checkNotNullExpressionValue(netImageView, "binding.ivMoraGameGift");
                OooOO0o(str, netImageView);
            }
        }
        LiveEventBus.get("MORA_RED_POINT").observe(this.f45872OoooO, new o0ooOOo(this, i));
        LiveEventBus.get("ROOM_GUESS_START_A_GUESSING_GAME_STATE", Boolean.TYPE).observeForever(o000o0o2);
    }

    public static void OooOOO(O0000000 o0000000, View view, View view2, int i) {
        if ((i & 1) != 0) {
            view = null;
        }
        if ((i & 2) != 0) {
            view2 = null;
        }
        Objects.requireNonNull(o0000000);
        if (view != null && !Intrinsics.areEqual(view, o0000000.f45878OoooOoo)) {
            o0000000.f45878OoooOoo = view;
            view.setSelected(true);
            View view3 = o0000000.f45877OoooOoO;
            if (view3 != null) {
                view3.setSelected(false);
            }
            o0000000.f45877OoooOoO = o0000000.f45878OoooOoo;
            o0000000.f45884Oooooo = o0000000.f45875OoooOOo.get(o0000000.f45879Ooooo00).getGiftNum();
            o0000000.f45885Oooooo0 = o0000000.f45875OoooOOo.get(o0000000.f45879Ooooo00).getPropId();
            String price = o0000000.f45875OoooOOo.get(o0000000.f45879Ooooo00).getPrice();
            Intrinsics.checkNotNullExpressionValue(price, "moraGiftList[giftPosition].price");
            o0000000.OooOO0O().f49786OooOOoo.setText(OooOo.OooO00o(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.mora_game_commit), android.support.v4.media.OooO00o.OooO00o("", Integer.parseInt(price) * o0000000.f45884Oooooo)));
        }
        if (view2 == null || Intrinsics.areEqual(view2, o0000000.f45881OooooO0)) {
            return;
        }
        o0000000.f45881OooooO0 = view2;
        view2.setSelected(true);
        View view4 = o0000000.f45880Ooooo0o;
        if (view4 != null) {
            view4.setSelected(false);
        }
        o0000000.f45880Ooooo0o = o0000000.f45881OooooO0;
    }

    @Override // p502o0o00o0.o00000O
    public final void OooO0o0(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        if (Intrinsics.areEqual(view, OooOO0O().f49775OooO0oO) ? true : Intrinsics.areEqual(view, OooOO0O().f49776OooO0oo)) {
            new a(this.f41543Oooo0o).OooOO0();
            return;
        }
        if (Intrinsics.areEqual(view, OooOO0O().f49774OooO0o0)) {
            o0O00000.OooO0OO("InRoom_game_roshambo_history");
            RoomMoraGameHistoryActivity.OooO00o oooO00o = RoomMoraGameHistoryActivity.f22938OoooooO;
            Context context = this.f41543Oooo0o;
            Intrinsics.checkNotNullParameter(context, "context");
            context.startActivity(new Intent(context, (Class<?>) RoomMoraGameHistoryActivity.class));
            return;
        }
        if (Intrinsics.areEqual(view, OooOO0O().f49773OooO0o)) {
            WalletActivity.f23268OoooooO.OooO00o(this.f41543Oooo0o, false);
            return;
        }
        if (Intrinsics.areEqual(view, OooOO0O().f49778OooOO0O)) {
            this.f45883OooooOo = 0;
            OooOOO(this, null, OooOO0O().f49778OooOO0O, 1);
            return;
        }
        if (Intrinsics.areEqual(view, OooOO0O().f49777OooOO0)) {
            this.f45883OooooOo = 1;
            OooOOO(this, null, OooOO0O().f49777OooOO0, 1);
            return;
        }
        if (Intrinsics.areEqual(view, OooOO0O().f49768OooO)) {
            this.f45883OooooOo = 2;
            OooOOO(this, null, OooOO0O().f49768OooO, 1);
            return;
        }
        if (Intrinsics.areEqual(view, OooOO0O().f49784OooOOo)) {
            o0O00000.OooO0OO("InRoom_game_roshambo_select");
            LinearLayout linearLayout = OooOO0O().f49784OooOOo;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.llUserSelect");
            OooOOOO(linearLayout);
            return;
        }
        if (Intrinsics.areEqual(view, OooOO0O().f49786OooOOoo)) {
            o0O00000.OooO0OO("InRoom_game_roshambo_start");
            o00O000 o00o000OooO = o00O000.OooO();
            int i = this.f45883OooooOo;
            int i2 = this.f45885Oooooo0;
            int i3 = this.f45884Oooooo;
            Long lValueOf = Long.valueOf(this.f45892ooOO);
            Objects.requireNonNull(o00o000OooO);
            if (o00O000.f32468OooO00o != null) {
                Room.MoraStartUpRequest.Builder builderNewBuilder = Room.MoraStartUpRequest.newBuilder();
                builderNewBuilder.setMoratype(i);
                builderNewBuilder.setMoragiftid(i2);
                builderNewBuilder.setToUserId(lValueOf.longValue());
                builderNewBuilder.setMoranum(i3);
                o00O000.f32468OooO00o.OooO0oO(10062, builderNewBuilder.build().toByteArray());
                return;
            }
            return;
        }
        if (!Intrinsics.areEqual(view, OooOO0O().f49789OooOo00)) {
            if (Intrinsics.areEqual(view, OooOO0O().f49781OooOOO0)) {
                o0O00000.OooO0OO("InRoom_game_roshambo_stars");
                new oOO0OO0O(this.f41543Oooo0o).OooOO0();
                return;
            }
            return;
        }
        o0O00000.OooO0OO("InRoom_game_roshambo_participate");
        o00O000 o00o000OooO2 = o00O000.OooO();
        long j = this.f45882OooooOO;
        long j2 = this.f45887Ooooooo;
        int i4 = this.f45883OooooOo;
        int i5 = this.f45885Oooooo0;
        int i6 = this.f45884Oooooo;
        long j3 = this.f45891o0OoOo0;
        Objects.requireNonNull(o00o000OooO2);
        if (o00O000.f32468OooO00o != null) {
            Room.MoraStartPkRequest.Builder builderNewBuilder2 = Room.MoraStartPkRequest.newBuilder();
            builderNewBuilder2.setMuuid(j);
            builderNewBuilder2.setSuid(j2);
            builderNewBuilder2.setMoratype(i4);
            builderNewBuilder2.setMoragiftid(i5);
            builderNewBuilder2.setMoranum(i6);
            builderNewBuilder2.setToUserId(j3);
            o00O000.f32468OooO00o.OooO0oO(10063, builderNewBuilder2.build().toByteArray());
        }
        OooO0O0();
    }

    @Override // p502o0o00o0.o00000O
    public final void OooOO0() {
        super.OooOO0();
        oo0O.OooO0OO.f53327OooO00o.OooO0Oo(false);
    }

    public final jf OooOO0O() {
        return (jf) this.f45888o000oOoO.getValue();
    }

    public final void OooOO0o(String str, NetImageView netImageView) {
        oO0O00.OooO00o oooO00o = new oO0O00.OooO00o(this.f41543Oooo0o);
        oooO00o.OooO00o(o00OOO.OooO00o.OooO0Oo());
        oooO00o.f48429OooO0OO = str;
        oooO00o.f48427OooO00o = 0;
        oooO00o.OooO0o(netImageView);
    }

    public final void OooOOO0(long j, int i, @NotNull String moraGiftIcon, @NotNull String moraGiftNum, final int i2, @NotNull RoomUserInfoModel formUserModel, long j2) {
        Intrinsics.checkNotNullParameter(moraGiftIcon, "moraGiftIcon");
        Intrinsics.checkNotNullParameter(moraGiftNum, "moraGiftNum");
        Intrinsics.checkNotNullParameter(formUserModel, "formUserModel");
        try {
            this.f45882OooooOO = j;
            this.f45885Oooooo0 = i;
            this.f45884Oooooo = Integer.parseInt(moraGiftNum);
            this.f45886OoooooO = moraGiftIcon;
            this.f45887Ooooooo = formUserModel.getUserId();
            this.f45891o0OoOo0 = j2;
        } catch (Exception e) {
            e.printStackTrace();
        }
        NetImageView netImageView = OooOO0O().f49780OooOOO;
        Intrinsics.checkNotNullExpressionValue(netImageView, "binding.ivMoraGameGift");
        OooOO0o(moraGiftIcon, netImageView);
        OooOO0O().f49792OooOoO.setText(o0O0O00.OooO0oo("x", moraGiftNum));
        OooOO0O().f49789OooOo00.post(new Runnable() { // from class: o0oOoOOo.oo00
            @Override // java.lang.Runnable
            public final void run() {
                O0000000 this$0 = this.f46201Oooo0o;
                int i3 = i2;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooOO0O().f49789OooOo00.setText(OooOo.OooO00o(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.mora_join_game_commit), String.valueOf(i3)));
            }
        });
        oO0O00.OooO00o oooO00o = new oO0O00.OooO00o(this.f41543Oooo0o);
        oooO00o.OooO00o(o00OOO.OooO00o.OooO0o0());
        OooOOO oooOOO = OooOOO.f41216OooO00o;
        oooO00o.f48429OooO0OO = oooOOO.OooO0oo().getValue();
        oooO00o.f48427OooO00o = 0;
        oooO00o.OooO0o(OooOO0O().f49791OooOo0o);
        OooOO0O().f49787OooOo.setText(oooOOO.OooOoO().getValue());
        oO0O00.OooO00o oooO00o2 = new oO0O00.OooO00o(this.f41543Oooo0o);
        oooO00o2.OooO00o(o00OOO.OooO00o.OooO0o0());
        oooO00o2.f48429OooO0OO = formUserModel.getUserHeader();
        oooO00o2.f48427OooO00o = 0;
        oooO00o2.OooO0o(OooOO0O().f49788OooOo0);
        OooOO0O().f49790OooOo0O.setText(formUserModel.getUserName());
    }

    public final void OooOOOO(View view) {
        OooO0OO<RoomLoginInformation.MIC> oooO0OO = null;
        if (this.f45889o00O0O == null) {
            bh bhVarInflate = bh.inflate(LayoutInflater.from(this.f41543Oooo0o));
            Intrinsics.checkNotNullExpressionValue(bhVarInflate, "inflate(LayoutInflater.from(context))");
            PopupWindow popupWindow = new PopupWindow((View) bhVarInflate.f49061OooO00o, -2, -2, true);
            this.f45889o00O0O = popupWindow;
            popupWindow.setOutsideTouchable(true);
            bhVarInflate.f49061OooO00o.measure(0, 0);
            bhVarInflate.f49062OooO0O0.setLayoutManager(new FixLinearLayoutManager(this.f41543Oooo0o));
            OooO0O0 oooO0O0 = new OooO0O0(this.f41543Oooo0o);
            this.f45890o00Oo0 = oooO0O0;
            bhVarInflate.f49062OooO0O0.setAdapter(oooO0O0);
            OooO0OO<RoomLoginInformation.MIC> oooO0OO2 = this.f45890o00Oo0;
            if (oooO0OO2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("popupAdapter");
                oooO0OO2 = null;
            }
            oooO0OO2.setOnItemClickListener(new o0OO000(this, 3));
        }
        ArrayList arrayList = new ArrayList();
        SparseArray<RoomLoginInformation.MIC> sparseArray = o000O00O.OooO().f32431OoooO;
        Intrinsics.checkNotNullExpressionValue(sparseArray, "getInstance().micListInfo");
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            sparseArray.keyAt(i);
            RoomLoginInformation.MIC value = sparseArray.valueAt(i);
            RoomUserInfoModel roomUserInfoModel = value.user;
            if (roomUserInfoModel != null) {
                long userId = roomUserInfoModel.getUserId();
                Long value2 = OooOOO.f41216OooO00o.OooOo().getValue();
                if (value2 == null || userId != value2.longValue()) {
                    Intrinsics.checkNotNullExpressionValue(value, "value");
                    arrayList.add(value);
                }
            }
        }
        RoomLoginInformation.MIC mic = new RoomLoginInformation.MIC();
        RoomUserInfoModel roomUserInfoModel2 = new RoomUserInfoModel();
        roomUserInfoModel2.setUserName(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.room_dialog_guess_any_one));
        roomUserInfoModel2.setUserId(0L);
        roomUserInfoModel2.setUserHeader("");
        mic.user = roomUserInfoModel2;
        Unit unit = Unit.INSTANCE;
        arrayList.add(0, mic);
        OooO0OO<RoomLoginInformation.MIC> oooO0OO3 = this.f45890o00Oo0;
        if (oooO0OO3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("popupAdapter");
        } else {
            oooO0OO = oooO0OO3;
        }
        oooO0OO.setNewData(arrayList);
        int size2 = arrayList.size();
        int size3 = 1 <= size2 && size2 < 6 ? arrayList.size() : 5;
        PopupWindow popupWindow2 = this.f45889o00O0O;
        if (popupWindow2 != null) {
            popupWindow2.showAsDropDown(view, 0, ((-view.getHeight()) - (OooOo00.OooO00o(45) * size3)) - OooOo00.OooO00o(7), 48);
        }
    }
}
