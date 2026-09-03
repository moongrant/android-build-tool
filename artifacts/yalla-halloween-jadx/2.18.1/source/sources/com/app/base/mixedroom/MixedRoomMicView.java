package com.app.base.mixedroom;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.app.base.mixedroom.model.RoomLoginInformation;
import com.app.base.view.SonicView;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.jeremyliao.liveeventbus.core.Observable;
import com.weieyu.yalla.R;
import com.yalla.support.cloudfilemanager.util.CloudImageUtilKt;
import com.yalla.support.common.util.OooOOO;
import com.yalla.support.common.util.OooOo00;
import com.yalla.yalla.common.ui.view.SVGAView;
import com.yalla.yalla.common.ui.view.UserIdentityView;
import com.yalla.yalla.common.ui.view.UserPremiumView;
import com.yalla.yalla.common.ui.view.UserRankView;
import com.yalla.yalla.common.ui.view.UserVipView;
import com.yalla.yalla.common.ui.view.VipState;
import com.yalla.yalla.model.RoomUserInfoModel;
import com.yalla.yalla.util.netimage.NetImageView;
import com.yalla.yalla.util.netimage.listener.GifPlayControl;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import p159o00OoOO.o000O00O;
import p238o00oOooO.oOOOOo0O;
import p254o00ooO0O.o000O0O0;
import p520o0o0O0O0.o00O0O;
import p530o0o0OOO.o00OO00O;
import p616o0oo0Ooo.oO0O00;

/* JADX INFO: loaded from: classes.dex */
public class MixedRoomMicView extends LinearLayout {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public SonicView f11808Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public Context f11809Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int f11810Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public int f11811Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public UserPremiumView f11812OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public SVGAView f11813OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public NetImageView f11814OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public ImageView f11815OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public UserVipView f11816OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public TextView f11817OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public UserIdentityView f11818OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public OooO0OO f11819OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public SVGAView f11820OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public ImageView f11821OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public boolean f11822Ooooo00;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public UserRankView f11823o000oOoO;

    public class OooO00o extends GifPlayControl {
        public OooO00o(LifecycleOwner lifecycleOwner) {
            super(2, lifecycleOwner);
        }

        @Override // com.yalla.yalla.util.netimage.listener.GifPlayControl
        public final void OooO0OO() {
            MixedRoomMicView.this.f11821OoooOoo.setVisibility(4);
        }

        @Override // com.yalla.yalla.util.netimage.listener.GifPlayControl
        public final void OooO0Oo() {
        }
    }

    public class OooO0O0 implements Observer<Object> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ GifPlayControl f11825OooO00o;

        public OooO0O0(GifPlayControl gifPlayControl) {
            this.f11825OooO00o = gifPlayControl;
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(Object obj) {
            if (obj == null) {
                return;
            }
            try {
                Pair pair = (Pair) obj;
                if (MixedRoomMicView.this.f11810Oooo0oO == ((Integer) pair.getFirst()).intValue()) {
                    MixedRoomMicView.this.f11821OoooOoo.setImageDrawable(null);
                    oOOOOo0O oooooo0o = this.f11825OooO00o.f26296OooO00o;
                    if (oooooo0o != null && oooooo0o.f34072Oooo0oO) {
                        oooooo0o.stop();
                    }
                    MixedRoomMicView.this.f11821OoooOoo.setVisibility(0);
                    oO0O00.OooO00o oooO00o = new oO0O00.OooO00o(MixedRoomMicView.this.getContext());
                    GifPlayControl gifPlayControl = this.f11825OooO00o;
                    oooO00o.f48430OooO0Oo = true;
                    oooO00o.f48459Oooo00o = gifPlayControl;
                    oooO00o.f48429OooO0OO = CloudImageUtilKt.imgFormat((String) pair.getSecond());
                    oooO00o.f48427OooO00o = 0;
                    oooO00o.OooO0o(MixedRoomMicView.this.f11821OoooOoo);
                    oOOOOo0O oooooo0o2 = this.f11825OooO00o.f26296OooO00o;
                    if (oooooo0o2 != null) {
                        oooooo0o2.start();
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public interface OooO0OO {
    }

    public MixedRoomMicView(Context context) {
        super(context);
        this.f11810Oooo0oO = -1;
        this.f11811Oooo0oo = 0;
        this.f11809Oooo0o = context;
        View.inflate(context, R.layout.layout_mic_template, this);
        this.f11808Oooo = (SonicView) findViewById(R.id.mic_view);
        this.f11814OoooO00 = (NetImageView) findViewById(R.id.sdv_mic_avatar);
        this.f11820OoooOoO = (SVGAView) findViewById(R.id.siv_mic_magic_voice);
        this.f11813OoooO0 = (SVGAView) findViewById(R.id.iv_mic_hat);
        this.f11815OoooO0O = (ImageView) findViewById(R.id.iv_mic_status);
        this.f11823o000oOoO = (UserRankView) findViewById(R.id.tv_mic_rank);
        this.f11812OoooO = (UserPremiumView) findViewById(R.id.iv_mic_vip);
        this.f11816OoooOO0 = (UserVipView) findViewById(R.id.kaVipView);
        this.f11817OoooOOO = (TextView) findViewById(R.id.tv_mic_name);
        this.f11818OoooOOo = (UserIdentityView) findViewById(R.id.uiv);
        this.f11821OoooOoo = (ImageView) findViewById(R.id.ivMicEmoji);
        this.f11815OoooO0O.setImageResource(R.drawable.icon_room_mic_default);
        setOnClickListener(new com.app.base.mixedroom.OooO00o(this));
    }

    public final void OooO00o(boolean z) {
        if (z) {
            this.f11815OoooO0O.setImageResource(R.drawable.icon_room_mic_lock);
            this.f11817OoooOOO.setText(o000O0O0.OooO0OO(R.string.tip_locked));
            this.f11817OoooOOO.setTextColor(OooOOO.OooO00o(R.color.color_white_80));
            this.f11811Oooo0oo = 1;
            return;
        }
        this.f11815OoooO0O.setImageResource(R.drawable.icon_room_mic_default);
        TextView textView = this.f11817OoooOOO;
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("");
        sbOooO0o0.append(this.f11810Oooo0oO + 1);
        textView.setText(sbOooO0o0.toString());
        this.f11817OoooOOO.setTextColor(OooOOO.OooO00o(R.color.color_white_80));
        this.f11811Oooo0oo = 3;
    }

    public final void OooO0O0() {
        SVGAView sVGAView;
        if (this.f11808Oooo != null) {
            RoomLoginInformation.MIC mic = o000O00O.OooO().f32431OoooO.get(this.f11810Oooo0oO);
            int iOooOO0 = o000O00O.OooO().OooOO0(mic.getVoicecard());
            boolean z = (iOooOO0 == 0 || iOooOO0 == 7) ? false : true;
            this.f11822Ooooo00 = z;
            if (z) {
                this.f11808Oooo.setSonicType(SonicView.SonicType.MagicSound);
                this.f11808Oooo.OooO0OO();
            } else if (mic.user.isPremium()) {
                this.f11808Oooo.setSonicType(SonicView.SonicType.VIP);
                this.f11808Oooo.OooO0OO();
            } else {
                this.f11808Oooo.setSonicType(SonicView.SonicType.Default);
                this.f11808Oooo.OooO0OO();
            }
        }
        if (!this.f11822Ooooo00 || (sVGAView = this.f11820OoooOoO) == null) {
            return;
        }
        sVGAView.OooO0oo("svga/anim_mic_magic_voice.svga", (MixedRoomActivity) this.f11809Oooo0o);
        sVGAView.OooO();
    }

    public void setMicInformation(RoomLoginInformation.MIC mic) {
        RoomUserInfoModel roomUserInfoModel;
        Context context = this.f11809Oooo0o;
        if (context == null || ((Activity) context).isDestroyed() || ((Activity) this.f11809Oooo0o).isFinishing()) {
            return;
        }
        if (mic == null || (roomUserInfoModel = mic.user) == null) {
            if (mic == null || mic.getState() != 1) {
                this.f11815OoooO0O.setImageResource(R.drawable.icon_room_mic_default);
                TextView textView = this.f11817OoooOOO;
                StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("");
                sbOooO0o0.append(this.f11810Oooo0oO + 1);
                textView.setText(sbOooO0o0.toString());
                this.f11817OoooOOO.setTextColor(OooOOO.OooO00o(R.color.color_white_80));
                this.f11811Oooo0oo = 3;
                SonicView sonicView = this.f11808Oooo;
                if (sonicView != null) {
                    sonicView.OooO00o();
                }
            } else {
                this.f11815OoooO0O.setImageResource(R.drawable.icon_room_mic_lock);
                this.f11817OoooOOO.setText(o000O0O0.OooO0OO(R.string.tip_locked));
                this.f11811Oooo0oo = 1;
            }
            this.f11814OoooO00.setVisibility(4);
            this.f11818OoooOOo.setVisibility(8);
            this.f11814OoooO00.setImageDrawable(null);
            this.f11817OoooOOO.setBackground(null);
            this.f11812OoooO.setVisibility(8);
            this.f11816OoooOO0.setVisibility(8);
            this.f11823o000oOoO.setVisibility(8);
            this.f11813OoooO0.setVisibility(8);
            this.f11813OoooO0.OooOO0(false);
            this.f11820OoooOoO.OooOO0(false);
            this.f11821OoooOoo.setVisibility(8);
            return;
        }
        this.f11812OoooO.setVisibility(8);
        this.f11816OoooOO0.setVisibility(8);
        if (roomUserInfoModel.needShowPremium()) {
            this.f11812OoooO.OooO0Oo(mic.user.isPremium(), mic.user.getPremiumLevel());
        } else {
            this.f11816OoooOO0.OooO0OO(roomUserInfoModel.getVipLevel(), roomUserInfoModel.getVipState() == VipState.Vip.getValue() && roomUserInfoModel.getShowVIP());
        }
        this.f11818OoooOOo.OooO0OO(mic.user.getRoomMemberType(), false, false);
        boolean z = p498o0o00Oo0.OooOOO.f41216OooO00o.OooOo().getValue().longValue() == mic.user.getUserId();
        if (mic.user.getHeaderCardId() > 0) {
            this.f11813OoooO0.setVisibility(0);
            SVGAView sVGAView = this.f11813OoooO0;
            sVGAView.OooO0oo(CloudImageUtilKt.imgFormat(mic.user.getHeaderCardUrl()), (FragmentActivity) this.f11809Oooo0o);
            sVGAView.OooO();
        } else {
            this.f11813OoooO0.setVisibility(8);
            this.f11813OoooO0.OooOO0(false);
        }
        this.f11823o000oOoO.OooO00o(mic.user.getRankWeek(), mic.user.getRankDay());
        oO0O00.OooO00o oooO00o = new oO0O00.OooO00o(this.f11814OoooO00.getContext());
        oooO00o.OooO00o(o00OOO.OooO00o.OooO00o());
        oooO00o.f48429OooO0OO = CloudImageUtilKt.imgSize(mic.user.getUserHeader(), OooOo00.OooO00o(55), true);
        oooO00o.f48427OooO00o = 0;
        oooO00o.OooO0o(this.f11814OoooO00);
        this.f11814OoooO00.setVisibility(0);
        if (z && o00OO00O.f43313OooooOo.OooO00o().f43336OooOo00.getValue().booleanValue()) {
            this.f11815OoooO0O.setImageResource(R.drawable.icon_room_bottom_mic_top_off);
            SonicView sonicView2 = this.f11808Oooo;
            if (sonicView2 != null) {
                sonicView2.OooO00o();
            }
        } else if (z || !mic.isMuteSound()) {
            this.f11815OoooO0O.setImageResource(0);
        } else {
            this.f11815OoooO0O.setImageResource(R.drawable.icon_room_mic_mute);
        }
        this.f11817OoooOOO.setText(o00O0O.f42677OooO00o.OooO0O0(mic.user.getUserId(), mic.user.getUserName()));
        if (z) {
            this.f11817OoooOOO.setTextColor(OooOOO.OooO00o(R.color.color_00d8c9));
            this.f11817OoooOOO.setBackgroundResource(R.drawable.bg_shape_room_activity);
        } else {
            this.f11817OoooOOO.setTextColor(OooOOO.OooO00o(R.color.color_white));
            this.f11817OoooOOO.setBackground(null);
        }
        this.f11811Oooo0oo = 2;
        Context context2 = this.f11809Oooo0o;
        if (context2 instanceof MixedRoomActivity) {
            OooO00o oooO00o2 = new OooO00o((MixedRoomActivity) context2);
            Intrinsics.checkNotNullParameter("mic_emoji_panel", "key");
            Observable observable = LiveEventBus.get("roommic_emoji_panel", Object.class);
            Intrinsics.checkNotNullExpressionValue(observable, "get(\"room$key\", Any::class.java)");
            observable.observe((MixedRoomActivity) this.f11809Oooo0o, new OooO0O0(oooO00o2));
        }
    }
}
