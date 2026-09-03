package p518o0o0O000;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import com.app.base.view.pop.roomSharePop.RoomShareModel;
import com.code.android.util.ToastUtil;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.widget.ShareDialog;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import com.yalla.support.cloudfilemanager.util.CloudImageUtilKt;
import com.yalla.support.common.util.OooOo;
import com.yalla.yalla.common.model.ShareChannel;
import com.yalla.yalla.common.model.ShareModel;
import com.yalla.yalla.common.model.ShareType;
import com.yalla.yalla.common.model.ShareWebModel;
import com.yalla.yalla.model.EventModel;
import com.yalla.yalla.ui.activity.BaseAppCompatActivity;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o00OO0O0.o0OOO0o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p032OoooO0.o0O000Oo;
import p131o00O0oo.o00oOoo;
import p180o00o0.o00O0O;
import p191o00o00oo.o000000O;
import p255o00ooO0O.o00000O;
import p255o00ooO0O.o000O0O0;
import p496o0o00OO0.OooO0o;
import p500o0o00Oo0.OooOOO;
import p508o0o00oO0.o00OO;
import p508o0o00oO0.o00OO000;
import p508o0o00oO0.o00OO00O;
import p508o0o00oO0.o00OO0O0;
import p508o0o00oO0.o00OO0OO;
import p508o0o00oO0.o00OOO00;
import p508o0o00oO0.o00OOOO0;
import p508o0o00oO0.o00Oo00;
import p508o0o00oO0.o0O000;
import p508o0o00oO0.o0O00000;
import p508o0o00oO0.o0O000O;
import p508o0o00oO0.o0O0o;
import p508o0o00oO0.o0OoOoOo;
import p508o0o00oO0.o0o0Oo;
import p508o0o00oO0.o0oOO;
import p508o0o00oO0.oo0O;
import p517o0o0O00.o00O00;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class o00000O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public ShareModel f42085OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public o00OO000 f42086OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public o0O0o f42087OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public o0O000 f42088OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public o0oOO f42089OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public o00OOO00 f42090OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public o00OO f42091OooO0oO;

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ShareChannel.values().length];
            iArr[ShareChannel.Friends.ordinal()] = 1;
            iArr[ShareChannel.Moments.ordinal()] = 2;
            iArr[ShareChannel.Facebook.ordinal()] = 3;
            iArr[ShareChannel.Twitter.ordinal()] = 4;
            iArr[ShareChannel.Instagram.ordinal()] = 5;
            iArr[ShareChannel.WhatsApp.ordinal()] = 6;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public o00000O0(@NotNull FragmentActivity activity, @NotNull ShareType shareType) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(shareType, "shareType");
        this.f42086OooO0O0 = new o00OO000(activity);
        this.f42087OooO0OO = new o0O0o(activity);
        this.f42088OooO0Oo = new o0O000(activity);
        this.f42090OooO0o0 = new o00OOO00(activity);
        this.f42089OooO0o = new o0oOO(activity);
        this.f42091OooO0oO = new o00OO(activity);
    }

    /* JADX WARN: Code duplicated, block: B:215:0x0410 A[PHI: r0 r2 r14
      0x0410: PHI (r0v19 java.lang.String) = (r0v18 java.lang.String), (r0v28 java.lang.String), (r0v35 java.lang.String) binds: [B:213:0x0409, B:194:0x03bc, B:175:0x036e] A[DONT_GENERATE, DONT_INLINE]
      0x0410: PHI (r2v39 java.lang.String) = (r2v35 java.lang.String), (r2v51 java.lang.String), (r2v58 java.lang.String) binds: [B:213:0x0409, B:194:0x03bc, B:175:0x036e] A[DONT_GENERATE, DONT_INLINE]
      0x0410: PHI (r14v26 java.lang.String) = (r14v24 java.lang.String), (r14v32 java.lang.String), (r14v35 java.lang.String) binds: [B:213:0x0409, B:194:0x03bc, B:175:0x036e] A[DONT_GENERATE, DONT_INLINE]] */
    public final void OooO00o(@Nullable ShareChannel shareChannel) {
        ShareModel shareModel;
        ShareModel shareModel2;
        ShareModel shareModel3;
        String string;
        String roomid;
        ShareModel shareModel4;
        String title;
        String string2;
        String roomid2;
        String imageUrl;
        String str;
        String str2;
        String str3;
        ShareModel shareModel5;
        boolean z;
        String strOooO00o;
        String imageUrl2;
        ShareModel shareModel6;
        String strOooO00o2;
        String string3;
        String title2;
        if (shareChannel != null) {
            String str4 = null;
            title = null;
            title = null;
            String title3 = null;
            roomid = null;
            roomid = null;
            String roomid3 = null;
            String str5 = null;
            str4 = null;
            str4 = null;
            switch (OooO00o.$EnumSwitchMapping$0[shareChannel.ordinal()]) {
                case 1:
                    o00OO o00oo2 = this.f42091OooO0oO;
                    if (o00oo2 != null && (shareModel = this.f42085OooO00o) != null) {
                        oo0O onLogin = new oo0O(shareModel, o00oo2);
                        Intrinsics.checkNotNullParameter(onLogin, "onLogin");
                        if (!Intrinsics.areEqual(OooOOO.f41235OooO00o.OooOooO().getValue(), Boolean.TRUE)) {
                            Activity activityOooO0O0 = o00000O.f34276OooO00o.OooO0O0();
                            if (activityOooO0O0 != null) {
                                LoginActivity.OooO00o oooO00o = LoginActivity.f21771Oooooo0;
                                o0OOO0o.OooO00o(activityOooO0O0, d.R, activityOooO0O0, LoginActivity.class);
                            }
                        } else {
                            onLogin.invoke();
                        }
                        break;
                    }
                    break;
                case 2:
                    o0oOO o0ooo2 = this.f42089OooO0o;
                    if (o0ooo2 != null && (shareModel2 = this.f42085OooO00o) != null) {
                        o00Oo00 onLogin2 = new o00Oo00(shareModel2, o0ooo2);
                        Intrinsics.checkNotNullParameter(onLogin2, "onLogin");
                        if (!Intrinsics.areEqual(OooOOO.f41235OooO00o.OooOooO().getValue(), Boolean.TRUE)) {
                            Activity activityOooO0O1 = o00000O.f34276OooO00o.OooO0O0();
                            if (activityOooO0O1 != null) {
                                LoginActivity.OooO00o oooO00o2 = LoginActivity.f21771Oooooo0;
                                o0OOO0o.OooO00o(activityOooO0O1, d.R, activityOooO0O1, LoginActivity.class);
                            }
                        } else {
                            onLogin2.invoke();
                        }
                        break;
                    }
                    break;
                case 3:
                    o00OO000 o00oo001 = this.f42086OooO0O0;
                    if (o00oo001 != null && (shareModel3 = this.f42085OooO00o) != null) {
                        int i = o00OO000.OooO00o.$EnumSwitchMapping$0[shareModel3.getType().ordinal()];
                        if (i == 1) {
                            StringBuilder sb = new StringBuilder();
                            RoomShareModel room = shareModel3.getRoom();
                            sb.append(room != null ? room.getUrl() : null);
                            sb.append("?RoomId=");
                            RoomShareModel room2 = shareModel3.getRoom();
                            sb.append(room2 != null ? room2.getRoomIdx() : null);
                            string = sb.toString();
                            RoomShareModel room3 = shareModel3.getRoom();
                            if (room3 != null) {
                                roomid = room3.getRoomid();
                                str4 = roomid;
                            }
                        } else if (i == 2) {
                            StringBuilder sb2 = new StringBuilder();
                            ShareWebModel web = shareModel3.getWeb();
                            sb2.append(web != null ? web.getUrl() : null);
                            sb2.append("?RoomId=");
                            ShareWebModel web2 = shareModel3.getWeb();
                            sb2.append(web2 != null ? web2.getIdx() : null);
                            string = sb2.toString();
                            ShareWebModel web3 = shareModel3.getWeb();
                            if (web3 != null) {
                                roomid = web3.getId();
                                str4 = roomid;
                            }
                        } else if (i != 3) {
                            string = null;
                        } else {
                            EventModel event = shareModel3.getEvent();
                            string = event != null ? event.getEventShareUrl() : null;
                            EventModel event2 = shareModel3.getEvent();
                            roomid = String.valueOf(event2 != null ? Long.valueOf(event2.getRoomIdx()) : null);
                            str4 = roomid;
                        }
                        o00OO00O o00oo00o = new o00OO00O(o00oo001, shareModel3, str4);
                        if (!(string == null || StringsKt.isBlank(string))) {
                            ShareLinkContent shareLinkContentBuild = new ShareLinkContent.Builder().setContentUrl(Uri.parse(string)).build();
                            if (ShareDialog.INSTANCE.canShow(ShareLinkContent.class)) {
                                FragmentActivity fragmentActivity = o00oo001.f41642OooO00o;
                                if (fragmentActivity instanceof BaseAppCompatActivity) {
                                    ((BaseAppCompatActivity) fragmentActivity).f21706OoooO00 = new o00OO0O0(o00oo001);
                                }
                                o00oo001.f41645OooO0Oo.registerCallback(o00oo001.f41644OooO0OO, new o00OO0OO());
                                o00oo001.f41645OooO0Oo.show(shareLinkContentBuild);
                                o00oo00o.invoke();
                            }
                            break;
                        }
                    }
                    break;
                case 4:
                    o0O0o o0o0o = this.f42087OooO0OO;
                    if (o0o0o != null && (shareModel4 = this.f42085OooO00o) != null) {
                        int i2 = o0O0o.OooO00o.$EnumSwitchMapping$0[shareModel4.getType().ordinal()];
                        if (i2 == 1) {
                            RoomShareModel room4 = shareModel4.getRoom();
                            title = room4 != null ? room4.getTitle() : null;
                            StringBuilder sb3 = new StringBuilder();
                            RoomShareModel room5 = shareModel4.getRoom();
                            sb3.append(room5 != null ? room5.getUrl() : null);
                            sb3.append("?RoomId=");
                            RoomShareModel room6 = shareModel4.getRoom();
                            sb3.append(room6 != null ? room6.getRoomIdx() : null);
                            string2 = sb3.toString();
                            RoomShareModel room7 = shareModel4.getRoom();
                            roomid2 = room7 != null ? room7.getRoomid() : null;
                            RoomShareModel room8 = shareModel4.getRoom();
                            if (room8 != null) {
                                imageUrl = room8.getImageUrl();
                            } else {
                                imageUrl = null;
                            }
                            str = roomid2;
                            str2 = title;
                            str5 = imageUrl;
                            str3 = string2;
                        } else if (i2 == 2) {
                            ShareWebModel web4 = shareModel4.getWeb();
                            title = web4 != null ? web4.getTitle() : null;
                            StringBuilder sb4 = new StringBuilder();
                            ShareWebModel web5 = shareModel4.getWeb();
                            sb4.append(web5 != null ? web5.getUrl() : null);
                            sb4.append("?RoomId=");
                            ShareWebModel web6 = shareModel4.getWeb();
                            sb4.append(web6 != null ? web6.getIdx() : null);
                            string2 = sb4.toString();
                            ShareWebModel web7 = shareModel4.getWeb();
                            roomid2 = web7 != null ? web7.getId() : null;
                            ShareWebModel web8 = shareModel4.getWeb();
                            if (web8 != null) {
                                imageUrl = web8.getImagesUrl();
                            } else {
                                imageUrl = null;
                            }
                            str = roomid2;
                            str2 = title;
                            str5 = imageUrl;
                            str3 = string2;
                        } else if (i2 != 3) {
                            str2 = null;
                            str3 = null;
                            str = null;
                        } else {
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append(o000O0O0.OooO0OO(R.string.event_share_twitter));
                            EventModel event3 = shareModel4.getEvent();
                            sb5.append(event3 != null ? event3.getEventName() : null);
                            title = sb5.toString();
                            EventModel event4 = shareModel4.getEvent();
                            string2 = event4 != null ? event4.getEventShareUrl() : null;
                            EventModel event5 = shareModel4.getEvent();
                            roomid2 = String.valueOf(event5 != null ? Long.valueOf(event5.getRoomIdx()) : null);
                            EventModel event6 = shareModel4.getEvent();
                            if (event6 != null) {
                                imageUrl = event6.getEventImage();
                            } else {
                                imageUrl = null;
                            }
                            str = roomid2;
                            str2 = title;
                            str5 = imageUrl;
                            str3 = string2;
                        }
                        final o0O00000 o0o00000 = new o0O00000(o0o0o, str2, str3, shareModel4, str);
                        if (!(str5 == null || str5.length() == 0)) {
                            OooO0o oooO0o = OooO0o.f41174OooO00o;
                            o000000O o000000oOooO00o = o0O000Oo.OooO00o(OooO0o.f41177OooO0Oo);
                            o000000oOooO00o.f33078OooO0Oo = new o00O0O() { // from class: o0o00oO0.o0oOOo
                                @Override // p180o00o0.o00O0O
                                public final void result(boolean z2, Object obj) {
                                    Function1 function1 = o0o00000;
                                    String path = (String) obj;
                                    if (function1 != null) {
                                        Intrinsics.checkNotNullExpressionValue(path, "path");
                                        function1.invoke(path);
                                    }
                                }
                            };
                            o000000oOooO00o.OooO0O0(CloudImageUtilKt.imgFormat(str5));
                        } else {
                            o0o00000.invoke("");
                        }
                        break;
                    }
                    break;
                case 5:
                    o00OOO00 o00ooo01 = this.f42090OooO0o0;
                    if (o00ooo01 != null && (shareModel5 = this.f42085OooO00o) != null) {
                        FragmentActivity fragmentActivity2 = o00ooo01.f41651OooO00o;
                        try {
                            Intent intent = new Intent();
                            intent.setPackage(o00ooo01.f41654OooO0Oo);
                            z = intent.resolveActivity(fragmentActivity2.getPackageManager()) != null;
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        if (!z) {
                            ToastUtil.f12582OooO00o.OooO0O0(OooOo.OooO00o(o000O0O0.OooO0OO(R.string.Please_install_XXX), o000O0O0.OooO0OO(R.string.single_third_instagram)));
                        }
                        if (z) {
                            int i3 = o00OOO00.OooO0O0.$EnumSwitchMapping$0[shareModel5.getType().ordinal()];
                            if (i3 == 1) {
                                String strOooO0OO = o000O0O0.OooO0OO(R.string.room_gift);
                                String[] strArr = new String[1];
                                RoomShareModel room9 = shareModel5.getRoom();
                                strArr[0] = room9 != null ? room9.getRoomIdx() : null;
                                strOooO00o = OooOo.OooO00o(strOooO0OO, strArr);
                                RoomShareModel room10 = shareModel5.getRoom();
                                imageUrl2 = room10 != null ? room10.getImageUrl() : null;
                                RoomShareModel room11 = shareModel5.getRoom();
                                if (room11 != null) {
                                    roomid3 = room11.getRoomid();
                                }
                            } else if (i3 == 2) {
                                String strOooO0OO2 = o000O0O0.OooO0OO(R.string.room_gift);
                                String[] strArr2 = new String[1];
                                ShareWebModel web9 = shareModel5.getWeb();
                                strArr2[0] = web9 != null ? web9.getIdx() : null;
                                strOooO00o = OooOo.OooO00o(strOooO0OO2, strArr2);
                                ShareWebModel web10 = shareModel5.getWeb();
                                imageUrl2 = web10 != null ? web10.getImagesUrl() : null;
                                ShareWebModel web11 = shareModel5.getWeb();
                                if (web11 != null) {
                                    roomid3 = web11.getId();
                                }
                            } else if (i3 != 3) {
                                strOooO00o = null;
                                imageUrl2 = null;
                            } else {
                                String strOooO0OO3 = o000O0O0.OooO0OO(R.string.event_share_instagram);
                                String[] strArr3 = new String[1];
                                EventModel event7 = shareModel5.getEvent();
                                strArr3[0] = String.valueOf(event7 != null ? Long.valueOf(event7.getRoomIdx()) : null);
                                strOooO00o = OooOo.OooO00o(strOooO0OO3, strArr3);
                                EventModel event8 = shareModel5.getEvent();
                                imageUrl2 = event8 != null ? event8.getEventImage() : null;
                                EventModel event9 = shareModel5.getEvent();
                                roomid3 = String.valueOf(event9 != null ? Long.valueOf(event9.getId()) : null);
                            }
                            ShareType type = shareModel5.getType();
                            o0o0Oo o0o0oo = new o0o0Oo(o00ooo01, shareModel5, roomid3);
                            if (strOooO00o == null || strOooO00o.length() == 0) {
                                if (imageUrl2 == null || imageUrl2.length() == 0) {
                                }
                            }
                            o00ooo01.OooO00o().f41659OoooOoO = strOooO00o;
                            o00ooo01.OooO00o().f41658OoooOo0 = imageUrl2;
                            o00ooo01.OooO00o().f41660OoooOoo = type;
                            o00ooo01.OooO00o().f41661Ooooo00 = new o00OOOO0(o00ooo01, o0o0oo);
                            o00ooo01.OooO00o().OooOO0();
                            break;
                        }
                    }
                    break;
                case 6:
                    o0O000 o0o001 = this.f42088OooO0Oo;
                    if (o0o001 != null && (shareModel6 = this.f42085OooO00o) != null) {
                        int i4 = o0O000.OooO00o.$EnumSwitchMapping$0[shareModel6.getType().ordinal()];
                        if (i4 == 1) {
                            String strOooO0OO4 = o000O0O0.OooO0OO(R.string.room_gift);
                            String[] strArr4 = new String[1];
                            RoomShareModel room12 = shareModel6.getRoom();
                            strArr4[0] = room12 != null ? room12.getRoomIdx() : null;
                            strOooO00o2 = OooOo.OooO00o(strOooO0OO4, strArr4);
                            StringBuilder sb6 = new StringBuilder();
                            RoomShareModel room13 = shareModel6.getRoom();
                            sb6.append(room13 != null ? room13.getUrl() : null);
                            sb6.append("?RoomId=");
                            RoomShareModel room14 = shareModel6.getRoom();
                            sb6.append(room14 != null ? room14.getRoomIdx() : null);
                            string3 = sb6.toString();
                            RoomShareModel room15 = shareModel6.getRoom();
                            if (room15 != null) {
                                room15.getImageUrl();
                            }
                            RoomShareModel room16 = shareModel6.getRoom();
                            title2 = room16 != null ? room16.getTitle() : null;
                            RoomShareModel room17 = shareModel6.getRoom();
                            if (room17 != null) {
                                title3 = room17.getTitle();
                            }
                        } else if (i4 == 2) {
                            String strOooO0OO5 = o000O0O0.OooO0OO(R.string.room_gift);
                            String[] strArr5 = new String[1];
                            ShareWebModel web12 = shareModel6.getWeb();
                            strArr5[0] = web12 != null ? web12.getIdx() : null;
                            strOooO00o2 = OooOo.OooO00o(strOooO0OO5, strArr5);
                            StringBuilder sb7 = new StringBuilder();
                            ShareWebModel web13 = shareModel6.getWeb();
                            sb7.append(web13 != null ? web13.getUrl() : null);
                            sb7.append("?RoomId=");
                            ShareWebModel web14 = shareModel6.getWeb();
                            sb7.append(web14 != null ? web14.getId() : null);
                            string3 = sb7.toString();
                            ShareWebModel web15 = shareModel6.getWeb();
                            if (web15 != null) {
                                web15.getImagesUrl();
                            }
                            ShareWebModel web16 = shareModel6.getWeb();
                            title2 = web16 != null ? web16.getTitle() : null;
                            ShareWebModel web17 = shareModel6.getWeb();
                            if (web17 != null) {
                                title3 = web17.getTitle();
                            }
                        } else if (i4 != 3) {
                            strOooO00o2 = null;
                            string3 = null;
                            title2 = null;
                        } else {
                            strOooO00o2 = o000O0O0.OooO0OO(R.string.event_share_twitter);
                            EventModel event10 = shareModel6.getEvent();
                            string3 = event10 != null ? event10.getEventShareUrl() : null;
                            EventModel event11 = shareModel6.getEvent();
                            if (event11 != null) {
                                event11.getEventImage();
                            }
                            EventModel event12 = shareModel6.getEvent();
                            title2 = event12 != null ? event12.getEventName() : null;
                            EventModel event13 = shareModel6.getEvent();
                            title3 = String.valueOf(event13 != null ? Long.valueOf(event13.getRoomIdx()) : null);
                        }
                        o0O000O o0o000o = new o0O000O(o0o001, shareModel6, title3);
                        StringBuilder sbOooO00o = o00oOoo.OooO00o("toShare title = ", title2, ", content = ", strOooO00o2, ", shareUrl = ");
                        sbOooO00o.append(string3);
                        o00O00.OooO0O0(sbOooO00o.toString());
                        try {
                            FragmentActivity fragmentActivity3 = o0o001.f41671OooO00o;
                            if (fragmentActivity3 instanceof BaseAppCompatActivity) {
                                ((BaseAppCompatActivity) fragmentActivity3).f21706OoooO00 = new o0OoOoOo(o0o001);
                            }
                            Intent intent2 = new Intent();
                            intent2.setAction("android.intent.action.SEND");
                            intent2.setPackage(o0o001.f41674OooO0Oo);
                            intent2.putExtra("android.intent.extra.TEXT", title2 + ' ' + strOooO00o2 + ' ' + string3);
                            intent2.setType("text/plain");
                            intent2.addFlags(1);
                            o0o001.f41671OooO00o.startActivityForResult(intent2, o0o001.f41673OooO0OO);
                            o0o000o.invoke();
                        } catch (Exception e2) {
                            e2.printStackTrace();
                            ToastUtil.f12582OooO00o.OooO0O0(OooOo.OooO00o(o000O0O0.OooO0OO(R.string.Please_install_XXX), o000O0O0.OooO0OO(R.string.single_third_whatsApp)));
                            return;
                        }
                        break;
                    }
                    break;
            }
        }
    }
}
