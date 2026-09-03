package com.app.base.adapter.room;

import android.content.Context;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.airbnb.lottie.LottieAnimationView;
import com.app.base.model.RoomIndexModel;
import com.app.base.model.RoomModel;
import com.facebook.appevents.AppEventsConstants;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.weieyu.yalla.R;
import com.yalla.support.cloudfilemanager.util.CloudImageUtilKt;
import com.yalla.support.common.util.OooO;
import com.yalla.yalla.common.event.webEvent.EnterRoomParentPage;
import com.yalla.yalla.common.manager.RoomStateManager;
import com.yalla.yalla.common.model.WebFrom;
import com.yalla.yalla.common.ui.view.SVGAView;
import com.yalla.yalla.common.ui.view.UserMedalView;
import com.yalla.yalla.common.util.WebPageInfo;
import com.yalla.yalla.common.vm.AdVM;
import com.yalla.yalla.ui.activity.main.WebActivity;
import java.util.List;
import java.util.Objects;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import p169o00Ooo0.o0O0O00;
import p169o00Ooo0.oo000o;
import p393o0OOooOo.o0O00000;
import p524o0o0O0o.o00O00O;
import p524o0o0O0o.o00O00o0;
import p618o0oo0Ooo.oO0O000o;
import p656o0ooo.o00Oo0;
import p656o0ooo.o0OoOo0;

/* JADX INFO: loaded from: classes.dex */
public class RoomBaseAdapter<T extends RoomIndexModel> extends p189o00o00o0.OooO0OO<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public LongSparseArray<String> f11375OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public PageSource f11376OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public o0OoOo0<RoomIndexModel> f11377OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public EnterRoomParentPage f11378OooO0Oo;

    public class OooO00o extends o00Oo0 {

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public final /* synthetic */ p189o00o00o0.OooO0o f11379OoooO;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ RoomIndexModel f11380OoooO0O;

        public OooO00o(RoomIndexModel roomIndexModel, p189o00o00o0.OooO0o oooO0o) {
            this.f11380OoooO0O = roomIndexModel;
            this.f11379OoooO = oooO0o;
        }

        @Override // p656o0ooo.o00Oo0
        public final void OooO00o(View view) {
            RoomBaseAdapter roomBaseAdapter = RoomBaseAdapter.this;
            RoomIndexModel roomIndexModel = this.f11380OoooO0O;
            int layoutPosition = this.f11379OoooO.getLayoutPosition();
            if (roomBaseAdapter.mContext != null) {
                PageSource pageSource = roomBaseAdapter.f11376OooO0O0;
                if (pageSource != null) {
                    switch (OooO0o.f11388OooO00o[pageSource.ordinal()]) {
                        case 1:
                            o0O00000.OooO0o0("Room_new_room", o0O00000.OooO0O0(layoutPosition));
                            break;
                        case 2:
                            o0O00000.OooO0o0("Room_popular_room", o0O00000.OooO0O0(layoutPosition));
                            break;
                        case 3:
                            o0O00000.OooO0o0("Room_country_room", o0O00000.OooO0O0(layoutPosition));
                            break;
                        case 4:
                            o0O00000.OooO0o0("Room_tag_room", o0O00000.OooO0O0(layoutPosition));
                            break;
                        case 5:
                            o0O00000.OooO0o0("Room_joined_room", o0O00000.OooO0O0(layoutPosition));
                            break;
                        case 6:
                            o0O00000.OooO0o0("Room_following_room", o0O00000.OooO0O0(layoutPosition));
                            break;
                    }
                }
                o0OoOo0<RoomIndexModel> o0oooo1 = roomBaseAdapter.f11377OooO0OO;
                if (o0oooo1 != null) {
                    o0oooo1.OooO00o(roomIndexModel);
                }
                String str = roomIndexModel.roomserverip;
                RoomModel roomModel = new RoomModel();
                roomModel.setName(roomIndexModel.barname);
                roomModel.setImage(roomIndexModel.barimage);
                roomModel.setBaridx(roomIndexModel.baridx);
                roomModel.setId(o0O0O00.OooOOO0(roomIndexModel.barid));
                roomModel.setRoomIp(str);
                roomModel.setSessionId(roomIndexModel.sessionId);
                RoomStateManager.INSTANCE.enterRoom(roomModel, roomBaseAdapter.f11378OooO0Oo);
            }
            RoomBaseAdapter roomBaseAdapter2 = RoomBaseAdapter.this;
            this.f11379OoooO.getAdapterPosition();
            roomBaseAdapter2.OooO0O0();
        }
    }

    public class OooO0O0 extends o00Oo0 {

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public final /* synthetic */ p189o00o00o0.OooO0o f11382OoooO;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ RoomIndexModel f11383OoooO0O;

        public class OooO00o implements Observer<Object> {
            public OooO00o() {
            }

            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                if (String.valueOf(obj).equals(OooO0O0.this.f11383OoooO0O.adData.adid)) {
                    RoomBaseAdapter.this.getData().remove(OooO0O0.this.f11382OoooO.getLayoutPosition());
                    RoomBaseAdapter.this.notifyDataSetChanged();
                }
            }
        }

        public OooO0O0(RoomIndexModel roomIndexModel, p189o00o00o0.OooO0o oooO0o) {
            this.f11383OoooO0O = roomIndexModel;
            this.f11382OoooO = oooO0o;
        }

        @Override // p656o0ooo.o00Oo0
        public final void OooO00o(@NotNull View view) {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o00O00o0(OooO.OooO0Oo(this.f11383OoooO0O.adData.adid, 0), RoomBaseAdapter.this.f11376OooO0O0 == PageSource.RoomAllPopularFragment ? 1 : 0, null), 3, null);
            if (RoomBaseAdapter.this.mContext instanceof FragmentActivity) {
                LiveEventBus.get("BLOCK_ADVERTISING").observe((FragmentActivity) RoomBaseAdapter.this.mContext, new OooO00o());
            }
        }
    }

    public class OooO0OO extends o00Oo0 {

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ RoomIndexModel f11387OoooO0O;

        public OooO0OO(RoomIndexModel roomIndexModel) {
            this.f11387OoooO0O = roomIndexModel;
        }

        @Override // p656o0ooo.o00Oo0
        public final void OooO00o(@NotNull View view) {
            PageSource pageSource = RoomBaseAdapter.this.f11376OooO0O0;
            if (pageSource != null) {
                int i = OooO0o.f11388OooO00o[pageSource.ordinal()];
                if (i == 1) {
                    o0O00000.OooO0OO("New_ad");
                } else if (i == 2) {
                    o0O00000.OooO0OO("Popular_ad");
                }
            }
            new AdVM().advertUserLogInsClick(OooO.OooO0o(this.f11387OoooO0O.adData.adid));
            WebPageInfo webPageInfo = new WebPageInfo(WebFrom.Ad);
            webPageInfo.OooO0Oo(this.f11387OoooO0O.adData.adUrl);
            webPageInfo.f21239OoooOO0 = true;
            WebActivity.f22127ooOO.OooO00o(RoomBaseAdapter.this.mContext, webPageInfo);
        }
    }

    public static /* synthetic */ class OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f11388OooO00o;

        static {
            int[] iArr = new int[PageSource.values().length];
            f11388OooO00o = iArr;
            try {
                iArr[PageSource.RoomAllNewFragment.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11388OooO00o[PageSource.RoomAllPopularFragment.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11388OooO00o[PageSource.GeneralRoomCountry.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11388OooO00o[PageSource.GeneralRoomTag.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11388OooO00o[PageSource.RoomRelatedJoinedFragment.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f11388OooO00o[PageSource.RoomRelatedFollowingFragment.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public enum PageSource {
        RoomAllPopularFragment,
        RoomAllNewFragment,
        RoomRelatedFollowingFragment,
        RoomRelatedJoinedFragment,
        GeneralRoomTag,
        GeneralRoomCountry
    }

    public RoomBaseAdapter(Context context, int i) {
        super(context, i);
        this.f11375OooO00o = new LongSparseArray<>();
        this.f11377OooO0OO = null;
        setPreLoadNumber(5);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:16:0x0073  */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
    public void convert(p189o00o00o0.OooO0o oooO0o, T t) {
        String str = t.barid;
        oooO0o.OooO0oO(R.id.item_bg, (str == null || str.isEmpty()) ? false : true);
        oO0O000o.OooO00o oooO00o = new oO0O000o.OooO00o(getContext());
        oooO00o.OooO00o(o00OOO.OooO00o.OooO0oo());
        oooO00o.f48447OooO0OO = o00O00O.OooO00o(t.barimage);
        oooO00o.f48445OooO00o = 0;
        oooO00o.OooO0o((ImageView) oooO0o.OooO0Oo(R.id.sdv_header));
        String str2 = t.isencrypt;
        String str3 = AppEventsConstants.EVENT_PARAM_VALUE_NO;
        oooO0o.OooO0oO(R.id.iv_lock, !AppEventsConstants.EVENT_PARAM_VALUE_NO.equals(str2));
        oooO0o.OooO0o(R.id.item_bg, t.istop > 0 ? R.drawable.shape_bg_item_room_top : R.drawable.shape_bg_item_room);
        oooO0o.OooO0oO(R.id.iv_honor, true);
        LottieAnimationView lottieAnimationView = (LottieAnimationView) oooO0o.OooO0Oo(R.id.iv_honor);
        String str4 = t.bartype;
        if (str4 != null) {
            Objects.requireNonNull(str4);
            switch (str4) {
                case "2":
                    oooO0o.OooO0oo(R.id.iv_honor, R.drawable.room_princess_garden1);
                    lottieAnimationView.OooO0Oo();
                    break;
                case "3":
                    oooO0o.OooO0oo(R.id.iv_honor, R.drawable.room_dreamland1);
                    lottieAnimationView.OooO0Oo();
                    break;
                case "4":
                    oooO0o.OooO0oo(R.id.iv_honor, R.drawable.upgraderoom_crown_somall);
                    lottieAnimationView.OooO0Oo();
                    break;
                case "5":
                    lottieAnimationView.setAnimation("lottie/lottie_anim_upgraderoom_sky.json");
                    lottieAnimationView.setRepeatCount(-1);
                    lottieAnimationView.OooOO0();
                    break;
                default:
                    oooO0o.OooO0oO(R.id.iv_honor, false);
                    lottieAnimationView.OooO0Oo();
                    break;
            }
        }
        oooO0o.OooOO0(R.id.tv_room_name, t.barname);
        String str5 = t.countryid;
        if (str5 == null || AppEventsConstants.EVENT_PARAM_VALUE_NO.equals(str5)) {
            oooO0o.OooO0oO(R.id.sdv_country, false);
        } else {
            oooO0o.OooO0oO(R.id.sdv_country, true);
            oO0O000o.OooO00o oooO00o2 = new oO0O000o.OooO00o(this.mContext);
            oooO00o2.f48447OooO0OO = oo000o.OooO0OO(t.countryid);
            oooO00o2.f48445OooO00o = 0;
            oooO00o2.OooO0o((ImageView) oooO0o.OooO0Oo(R.id.sdv_country));
        }
        if (com.yalla.support.common.util.OooO0OO.OooO00o(t.labelname)) {
            oooO0o.OooO0oO(R.id.tv_tag, false);
        } else {
            oooO0o.OooO0oO(R.id.tv_tag, true);
            oooO0o.OooOO0(R.id.tv_tag, o0O0O00.OooOO0(t.labelname.trim()));
        }
        oooO0o.OooOO0(R.id.tv_desc, com.yalla.support.common.util.OooO0OO.OooO00o(t.notice) ? "" : t.notice);
        String str6 = t.onlinenum;
        if (str6 != null) {
            str3 = str6;
        }
        oooO0o.OooOO0(R.id.tv_online_num, str3);
        oooO0o.OooO0oO(R.id.iv_official, t.isofficial == 1);
        oooO0o.OooO0Oo(R.id.item_bg).setOnClickListener(new OooO00o(t, oooO0o));
        UserMedalView userMedalView = (UserMedalView) oooO0o.OooO0Oo(R.id.mv_medal);
        userMedalView.setVisibility(4);
        userMedalView.OooO0O0(t.medal, (LifecycleOwner) getContext());
        userMedalView.setVisibility(0);
        ((SVGAView) oooO0o.OooO0Oo(R.id.lav_live)).OooO0OO();
        OooO0Oo(oooO0o);
        RoomIndexModel.AdData adData = t.adData;
        oooO0o.OooO0oO(R.id.llAdvertising, (adData == null || adData.adid == null) ? false : true);
        RoomIndexModel.AdData adData2 = t.adData;
        if (adData2 == null || adData2.adid == null) {
            return;
        }
        oO0O000o.OooO00o oooO00o3 = new oO0O000o.OooO00o(this.mContext);
        oooO00o3.OooO0oo(8, 8, 8, 8);
        oooO00o3.f48447OooO0OO = CloudImageUtilKt.imgFormat(t.adData.adImage);
        oooO00o3.f48445OooO00o = 0;
        oooO00o3.OooO0o((ImageView) oooO0o.OooO0Oo(R.id.ivAdvertising));
        oooO0o.OooOO0(R.id.tvAdvertising, t.adData.adTitle);
        oooO0o.OooOO0(R.id.tvAdvertisingContent, t.adData.adDescription);
        oooO0o.OooO0Oo(R.id.ivClose).setOnClickListener(new OooO0O0(t, oooO0o));
        oooO0o.OooO0Oo(R.id.llAdvertising).setOnClickListener(new OooO0OO(t));
    }

    public void OooO0O0() {
    }

    public final void OooO0OO(List<T> list) {
        if (com.yalla.support.common.util.OooO0OO.OooO0O0(list)) {
            int i = 0;
            while (i < list.size()) {
                String str = list.get(i).barid;
                if (!com.yalla.support.common.util.OooO0OO.OooO00o(str)) {
                    long j = Long.parseLong(str);
                    if (com.yalla.support.common.util.OooO0OO.OooO0O0(this.f11375OooO00o.get(j, ""))) {
                        list.remove(i);
                        i--;
                    } else {
                        this.f11375OooO00o.put(j, str);
                    }
                }
                i++;
            }
        }
    }

    public void OooO0Oo(p189o00o00o0.OooO0o oooO0o) {
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void setNewData(@Nullable List<T> list) {
        super.setNewData(list);
        this.f11375OooO00o.clear();
        if (list != null) {
            for (T t : list) {
                if (com.yalla.support.common.util.OooO0OO.OooO0O0(t.barid)) {
                    this.f11375OooO00o.put(Long.parseLong(t.barid), t.barid);
                }
            }
        }
    }

    public RoomBaseAdapter(Context context) {
        this(context, R.layout.item_room_base);
    }
}
