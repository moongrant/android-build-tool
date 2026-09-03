package com.yalla.yalla.ui.adapter.room;

import android.content.Context;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import androidx.compose.runtime.MutableState;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.airbnb.lottie.LottieAnimationView;
import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.o0OoOo0;
import com.facebook.appevents.AppEventsConstants;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.data.constant.EnterRoomParentPage;
import com.yalla.yalla.model.WebFrom;
import com.yalla.yalla.model.room.RoomIndexModel;
import com.yalla.yalla.model.room.RoomModel;
import com.yalla.yalla.ui.activity.main.WebActivity;
import com.yalla.yalla.ui.view.UserMedalView;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import com.yalla.yalla.ui.vm.AdVM;
import com.yalla.yalla.util.WebPageInfo;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import p022Oooo00O.o00O00OO;
import p370o0OOo0Oo.Oooo000;
import p425o0OoO0OO.o00O000o;
import p431o0OoOO.o0Oo0oo;
import p472o0OoooO.o0O0OOO0;
import p472o0OoooO.oo0OOoo;
import p565o0oOo000.o0OO00O;
import p565o0oOo000.o0OOO0o;
import p570o0oOo0o.o000O0;
import p593o0oOoooO.h0;
import p595o0oo0.OooOo00;
import p645o0ooOOO0.o0O0O0Oo;

/* JADX INFO: loaded from: classes4.dex */
public class RoomBaseAdapter<T extends RoomIndexModel> extends o000O0<T> {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public PageSource f27240OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final LongSparseArray<String> f27241OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public o0O0OOO0<RoomIndexModel> f27242OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public EnterRoomParentPage f27243OooOooo;

    public static /* synthetic */ class OooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f27244OooO00o;

        static {
            int[] iArr = new int[PageSource.values().length];
            f27244OooO00o = iArr;
            try {
                iArr[PageSource.RoomAllNewFragment.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27244OooO00o[PageSource.RoomAllPopularFragment.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27244OooO00o[PageSource.GeneralRoomCountry.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f27244OooO00o[PageSource.RoomRelatedJoinedFragment.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f27244OooO00o[PageSource.RoomRelatedFollowingFragment.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public class OooO00o extends oo0OOoo {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ RoomIndexModel f27246OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ ViewHolder f27247OooO0oo;

        public OooO00o(RoomIndexModel roomIndexModel, ViewHolder viewHolder) {
            this.f27246OooO0oO = roomIndexModel;
            this.f27247OooO0oo = viewHolder;
        }

        @Override // p472o0OoooO.oo0OOoo
        public final void OooO00o(View view) {
            ViewHolder viewHolder = this.f27247OooO0oo;
            int layoutPosition = viewHolder.getLayoutPosition();
            RoomBaseAdapter roomBaseAdapter = RoomBaseAdapter.this;
            if (roomBaseAdapter.f13197OooOOOo != null) {
                PageSource pageSource = roomBaseAdapter.f27240OooOoo;
                if (pageSource != null) {
                    int i = OooO.f27244OooO00o[pageSource.ordinal()];
                    String strOooO00o = "11";
                    if (i == 1) {
                        HashMap map = new HashMap();
                        if (layoutPosition < 0) {
                            strOooO00o = "00";
                        } else if (layoutPosition < 10) {
                            int i2 = layoutPosition + 1;
                            strOooO00o = i2 < 10 ? o00O00OO.OooO00o(AppEventsConstants.EVENT_PARAM_VALUE_NO, o0OoOo0.OooOO0o(Integer.valueOf(i2), AppEventsConstants.EVENT_PARAM_VALUE_NO)) : o0OoOo0.OooOO0o(Integer.valueOf(i2), "00");
                        }
                        map.put("roompoint", strOooO00o);
                        h0.OooO0OO("201012", map);
                    } else if (i == 2) {
                        HashMap map2 = new HashMap();
                        if (layoutPosition < 0) {
                            strOooO00o = "00";
                        } else if (layoutPosition < 10) {
                            int i3 = layoutPosition + 1;
                            strOooO00o = i3 < 10 ? o00O00OO.OooO00o(AppEventsConstants.EVENT_PARAM_VALUE_NO, o0OoOo0.OooOO0o(Integer.valueOf(i3), AppEventsConstants.EVENT_PARAM_VALUE_NO)) : o0OoOo0.OooOO0o(Integer.valueOf(i3), "00");
                        }
                        map2.put("roompoint", strOooO00o);
                        h0.OooO0OO("201011", map2);
                    } else if (i == 3) {
                        HashMap map3 = new HashMap();
                        if (layoutPosition < 0) {
                            strOooO00o = "00";
                        } else if (layoutPosition < 10) {
                            int i4 = layoutPosition + 1;
                            strOooO00o = i4 < 10 ? o00O00OO.OooO00o(AppEventsConstants.EVENT_PARAM_VALUE_NO, o0OoOo0.OooOO0o(Integer.valueOf(i4), AppEventsConstants.EVENT_PARAM_VALUE_NO)) : o0OoOo0.OooOO0o(Integer.valueOf(i4), "00");
                        }
                        map3.put("roompoint", strOooO00o);
                        h0.OooO0OO("201008", map3);
                    } else if (i == 4) {
                        HashMap map4 = new HashMap();
                        if (layoutPosition < 0) {
                            strOooO00o = "00";
                        } else if (layoutPosition < 10) {
                            int i5 = layoutPosition + 1;
                            strOooO00o = i5 < 10 ? o00O00OO.OooO00o(AppEventsConstants.EVENT_PARAM_VALUE_NO, o0OoOo0.OooOO0o(Integer.valueOf(i5), AppEventsConstants.EVENT_PARAM_VALUE_NO)) : o0OoOo0.OooOO0o(Integer.valueOf(i5), "00");
                        }
                        map4.put("roompoint", strOooO00o);
                        h0.OooO0OO("201004", map4);
                    } else if (i == 5) {
                        HashMap map5 = new HashMap();
                        if (layoutPosition < 0) {
                            strOooO00o = "00";
                        } else if (layoutPosition < 10) {
                            int i6 = layoutPosition + 1;
                            strOooO00o = i6 < 10 ? o00O00OO.OooO00o(AppEventsConstants.EVENT_PARAM_VALUE_NO, o0OoOo0.OooOO0o(Integer.valueOf(i6), AppEventsConstants.EVENT_PARAM_VALUE_NO)) : o0OoOo0.OooOO0o(Integer.valueOf(i6), "00");
                        }
                        map5.put("roompoint", strOooO00o);
                        h0.OooO0OO("201005", map5);
                    }
                }
                o0O0OOO0<RoomIndexModel> o0o0ooo0 = roomBaseAdapter.f27242OooOooO;
                RoomIndexModel roomIndexModel = this.f27246OooO0oO;
                if (o0o0ooo0 != null) {
                    o0o0ooo0.OooO00o(roomIndexModel);
                }
                String str = roomIndexModel.roomserverip;
                RoomModel roomModel = new RoomModel();
                roomModel.setName(roomIndexModel.barname);
                roomModel.setImage(roomIndexModel.barimage);
                roomModel.setBaridx(roomIndexModel.baridx);
                roomModel.setId(OooOo00.OooOO0o(roomIndexModel.barid));
                roomModel.setRoomIp(str);
                roomModel.websocketaddr = roomIndexModel.websocketaddr;
                roomModel.setSessionId(roomIndexModel.sessionId);
                MutableState mutableState = o0Oo0oo.f46817OooO00o;
                o0Oo0oo.OooO0o(roomModel, roomBaseAdapter.f27243OooOooo);
            }
            viewHolder.getAdapterPosition();
            roomBaseAdapter.Oooo0o();
        }
    }

    public class OooO0O0 implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ ViewHolder f27248OooO0Oo;

        public OooO0O0(ViewHolder viewHolder) {
            this.f27248OooO0Oo = viewHolder;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((SVGAView) this.f27248OooO0Oo.getView(p565o0oOo000.o0Oo0oo.lav_live)).OooO0Oo();
            return null;
        }
    }

    public class OooO0OO extends oo0OOoo {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ RoomIndexModel f27250OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ ViewHolder f27251OooO0oo;

        public class OooO00o implements Observer<Object> {
            public OooO00o() {
            }

            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                String strValueOf = String.valueOf(obj);
                OooO0OO oooO0OO = OooO0OO.this;
                if (strValueOf.equals(oooO0OO.f27250OooO0oO.adData.adid)) {
                    RoomBaseAdapter.this.f13200OooOOoo.remove(oooO0OO.f27251OooO0oo.getLayoutPosition());
                    RoomBaseAdapter.this.notifyDataSetChanged();
                }
            }
        }

        public OooO0OO(RoomIndexModel roomIndexModel, ViewHolder viewHolder) {
            this.f27250OooO0oO = roomIndexModel;
            this.f27251OooO0oo = viewHolder;
        }

        @Override // p472o0OoooO.oo0OOoo
        public final void OooO00o(@NotNull View view) {
            RoomBaseAdapter roomBaseAdapter = RoomBaseAdapter.this;
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o00O000o(o0OoOo0.OooO0o(0, this.f27250OooO0oO.adData.adid), roomBaseAdapter.f27240OooOoo == PageSource.RoomAllPopularFragment ? 1 : 0, null), 3, null);
            if (roomBaseAdapter.f13197OooOOOo instanceof FragmentActivity) {
                LiveEventBus.get("BLOCK_ADVERTISING").observe((FragmentActivity) roomBaseAdapter.f13197OooOOOo, new OooO00o());
            }
        }
    }

    public class OooO0o extends oo0OOoo {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ RoomIndexModel f27253OooO0oO;

        public OooO0o(RoomIndexModel roomIndexModel) {
            this.f27253OooO0oO = roomIndexModel;
        }

        @Override // p472o0OoooO.oo0OOoo
        public final void OooO00o(@NotNull View view) {
            RoomBaseAdapter roomBaseAdapter = RoomBaseAdapter.this;
            PageSource pageSource = roomBaseAdapter.f27240OooOoo;
            if (pageSource != null) {
                int i = OooO.f27244OooO00o[pageSource.ordinal()];
                if (i == 1) {
                    h0.OooO0O0("102264");
                } else if (i == 2) {
                    h0.OooO0O0("102263");
                }
            }
            AdVM adVM = new AdVM();
            RoomIndexModel roomIndexModel = this.f27253OooO0oO;
            adVM.advertUserLogInsClick(o0OoOo0.OooO(0L, roomIndexModel.adData.adid));
            WebPageInfo webPageInfo = new WebPageInfo(WebFrom.Ad);
            webPageInfo.OooO0o0(roomIndexModel.adData.adUrl);
            webPageInfo.f32286OooO = true;
            int i2 = WebActivity.f25131OooOoO0;
            WebActivity.OooO00o.OooO00o(roomBaseAdapter.f13197OooOOOo, webPageInfo);
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
        this.f27241OooOoo0 = new LongSparseArray<>();
        this.f27242OooOooO = null;
        this.f13204OooOo0o = 5;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void OooOoO0(@Nullable List<T> list) {
        super.OooOoO0(list);
        LongSparseArray<String> longSparseArray = this.f27241OooOoo0;
        longSparseArray.clear();
        if (list != null) {
            for (T t : list) {
                if (com.code.android.util.OooOo00.OooO0O0(t.barid)) {
                    longSparseArray.put(Long.parseLong(t.barid), t.barid);
                }
            }
        }
    }

    public void Oooo0o() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: Oooo0o0, reason: merged with bridge method [inline-methods] */
    public void OooO0oO(ViewHolder viewHolder, T t) {
        int i = p565o0oOo000.o0Oo0oo.item_bg;
        String str = t.barid;
        viewHolder.setGone(i, (str == null || str.isEmpty()) ? false : true);
        Context context = this.f56318OooOo;
        Oooo000.OooO00o oooO00o = new Oooo000.OooO00o(context);
        oooO00o.OooO00o(o0O0O0Oo.OooO0o());
        oooO00o.f43127OooO0OO = p405o0Oo0OO.OooO0OO.OooO00o(t.barimage);
        oooO00o.f43125OooO00o = 0;
        oooO00o.OooO0Oo((ImageView) viewHolder.getView(p565o0oOo000.o0Oo0oo.sdv_header));
        int i2 = p565o0oOo000.o0Oo0oo.iv_lock;
        String str2 = t.isencrypt;
        String str3 = AppEventsConstants.EVENT_PARAM_VALUE_NO;
        viewHolder.setGone(i2, !AppEventsConstants.EVENT_PARAM_VALUE_NO.equals(str2));
        viewHolder.setBackgroundRes(i, t.istop > 0 ? o0OOO0o.shape_bg_item_room_top : o0OOO0o.shape_bg_item_room);
        int i3 = p565o0oOo000.o0Oo0oo.iv_honor;
        viewHolder.setGone(i3, true);
        LottieAnimationView lottieAnimationView = (LottieAnimationView) viewHolder.getView(i3);
        String str4 = t.bartype;
        if (str4 != null) {
            switch (str4) {
                case "2":
                    viewHolder.setImageResource(i3, o0OOO0o.room_princess_garden1);
                    lottieAnimationView.OooO0OO();
                    break;
                case "3":
                    viewHolder.setImageResource(i3, o0OOO0o.room_dreamland1);
                    lottieAnimationView.OooO0OO();
                    break;
                case "4":
                    viewHolder.setImageResource(i3, o0OOO0o.upgraderoom_crown_somall);
                    lottieAnimationView.OooO0OO();
                    break;
                case "5":
                    lottieAnimationView.setAnimation("lottie/lottie_anim_upgraderoom_sky.json");
                    lottieAnimationView.setRepeatCount(-1);
                    lottieAnimationView.OooO0oO();
                    break;
                default:
                    viewHolder.setGone(i3, false);
                    lottieAnimationView.OooO0OO();
                    break;
            }
        }
        viewHolder.setText(p565o0oOo000.o0Oo0oo.tv_room_name, t.barname);
        String str5 = t.countryid;
        if (str5 == null || AppEventsConstants.EVENT_PARAM_VALUE_NO.equals(str5)) {
            viewHolder.setGone(p565o0oOo000.o0Oo0oo.sdv_country, false);
        } else {
            int i4 = p565o0oOo000.o0Oo0oo.sdv_country;
            viewHolder.setGone(i4, true);
            Oooo000.OooO00o oooO00o2 = new Oooo000.OooO00o(this.f13197OooOOOo);
            oooO00o2.f43127OooO0OO = p596o0oo000O.OooO0o.OooO00o(t.countryid);
            oooO00o2.f43125OooO00o = 0;
            oooO00o2.OooO0Oo((ImageView) viewHolder.getView(i4));
        }
        if (com.code.android.util.OooOo00.OooO00o(t.labelname)) {
            viewHolder.setGone(p565o0oOo000.o0Oo0oo.tv_tag, false);
        } else {
            int i5 = p565o0oOo000.o0Oo0oo.tv_tag;
            viewHolder.setGone(i5, true);
            viewHolder.setText(i5, OooOo00.OooO(t.labelname.trim()));
        }
        viewHolder.setText(p565o0oOo000.o0Oo0oo.tv_desc, com.code.android.util.OooOo00.OooO00o(t.notice) ? "" : t.notice);
        int i6 = p565o0oOo000.o0Oo0oo.tv_online_num;
        String str6 = t.onlinenum;
        if (str6 != null) {
            str3 = str6;
        }
        viewHolder.setText(i6, str3);
        viewHolder.setGone(p565o0oOo000.o0Oo0oo.iv_official, t.isofficial == 1);
        viewHolder.getView(i).setOnClickListener(new OooO00o(t, viewHolder));
        UserMedalView userMedalView = (UserMedalView) viewHolder.getView(p565o0oOo000.o0Oo0oo.mv_medal);
        userMedalView.setVisibility(4);
        userMedalView.OooO00o(t.medal, (LifecycleOwner) context);
        userMedalView.setVisibility(0);
        int i7 = p565o0oOo000.o0Oo0oo.lav_live;
        ((SVGAView) viewHolder.getView(i7)).OooO0Oo();
        ((SVGAView) viewHolder.getView(i7)).setOnAttachedToWindowListener(new OooO0O0(viewHolder));
        Oooo0oo(viewHolder);
        int i8 = p565o0oOo000.o0Oo0oo.llAdvertising;
        RoomIndexModel.AdData adData = t.adData;
        viewHolder.setGone(i8, (adData == null || adData.adid == null) ? false : true);
        RoomIndexModel.AdData adData2 = t.adData;
        if (adData2 == null || adData2.adid == null) {
            return;
        }
        Oooo000.OooO00o oooO00o3 = new Oooo000.OooO00o(this.f13197OooOOOo);
        oooO00o3.OooO0o(8, 8, 8, 8);
        oooO00o3.f43127OooO0OO = p184o00o00O0.OooO0OO.OooO0Oo(t.adData.adImage);
        oooO00o3.f43125OooO00o = 0;
        oooO00o3.OooO0Oo((ImageView) viewHolder.getView(p565o0oOo000.o0Oo0oo.ivAdvertising));
        viewHolder.setText(p565o0oOo000.o0Oo0oo.tvAdvertising, t.adData.adTitle);
        viewHolder.setText(p565o0oOo000.o0Oo0oo.tvAdvertisingContent, t.adData.adDescription);
        viewHolder.getView(p565o0oOo000.o0Oo0oo.ivClose).setOnClickListener(new OooO0OO(t, viewHolder));
        viewHolder.getView(i8).setOnClickListener(new OooO0o(t));
    }

    public final void Oooo0oO(List<T> list) {
        if (com.code.android.util.OooOo00.OooO0O0(list)) {
            int i = 0;
            while (i < list.size()) {
                String str = list.get(i).barid;
                if (!com.code.android.util.OooOo00.OooO00o(str)) {
                    long j = Long.parseLong(str);
                    LongSparseArray<String> longSparseArray = this.f27241OooOoo0;
                    if (com.code.android.util.OooOo00.OooO0O0(longSparseArray.get(j, ""))) {
                        list.remove(i);
                        i--;
                    } else {
                        longSparseArray.put(j, str);
                    }
                }
                i++;
            }
        }
    }

    public void Oooo0oo(ViewHolder viewHolder) {
    }

    public RoomBaseAdapter(Context context) {
        this(context, o0OO00O.item_room_base);
    }
}
